package com.deeshant.deeshantsbnri.ui.dummies

import android.net.Uri
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import com.deeshant.deeshantsbnri.data.repository.DummyRepository
import com.deeshant.deeshantsbnri.ui.base.BaseViewModel
import com.deeshant.deeshantsbnri.utils.common.Resource
import com.deeshant.deeshantsbnri.utils.common.Status
import com.deeshant.deeshantsbnri.utils.log.Logger
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class DummiesViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    databaseService: DatabaseService,
    private val dummyRepository: DummyRepository
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper,databaseService) {

    private val dummyLiveData: MutableLiveData<Resource<List<DummyResponse>>> = MutableLiveData()

    private var page = 1

    private var per_page = 10

    var last_page = 0

    fun getDummies(): LiveData<List<DummyResponse>> =
        Transformations.map(dummyLiveData) { it.data }

    fun isDummiesFetching(): LiveData<Boolean> =
        Transformations.map(dummyLiveData) { it.status == Status.LOADING }

    override fun onCreate() {
       getData()
    }

    fun getData(){
        if (checkInternetConnectionWithMessage()) {
            dummyLiveData.postValue(Resource.loading())
            compositeDisposable.add(
                dummyRepository.fetchDummy(page++, per_page)
                    .subscribeOn(schedulerProvider.io())
                    .subscribe(
                        {
                            dummyLiveData.postValue(Resource.success(it.body()))
                            if(it.body()!=null) {
                                databaseService.dummyDao().createAll(it.body()!!)
                            }
                            if(it.headers().get("link")!=null){
                                val strs = it.headers().get("link").toString().split(",").toTypedArray()
                                strs.forEach { it ->
                                   if(it.contains("last")){
                                       val uri: Uri = Uri.parse(it)
                                       val server: String = uri.getAuthority()
                                       val path: String = uri.getPath()
                                       val protocol: String = uri.getScheme()
                                       val args: Set<String> = uri.getQueryParameterNames()
                                       last_page = uri.getQueryParameter("page").toInt()
                                   }
                                }

                            }
                        },
                        {
                            handleNetworkError(it)
                            dummyLiveData.postValue(Resource.error())
                        })
            )
        }else{
            getAll()
        }
    }

    fun getAll() {
        compositeDisposable.add(
            databaseService.dummyDao()
                .getAll()
                .subscribeOn(Schedulers.io())
                .subscribe(
                    {
                        if(it!=null) {
                            dummyLiveData.postValue(Resource.success(it))
                        }
                    },
                    {
                        handleNetworkError(it)
                        dummyLiveData.postValue(Resource.error())
                    }
                )
        )
    }
}