package com.deeshant.deeshantsbnri.ui.dummies

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.data.local.db.entity.DummyResponse
import com.deeshant.deeshantsbnri.ui.base.BaseItemViewModel
import com.deeshant.deeshantsbnri.utils.common.Resource
import com.deeshant.deeshantsbnri.utils.log.Logger
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class DummyItemViewModel @Inject constructor(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    databaseService: DatabaseService
) : BaseItemViewModel<DummyResponse>(schedulerProvider, compositeDisposable, networkHelper,databaseService) {

    companion object {
        const val TAG = "DummyItemViewModel"
    }

    val lice_key: LiveData<String> = Transformations.map(data) {
        it.license?.node_id?:"NA"
    }
    val name: LiveData<String> = Transformations.map(data) {
        it.name
    }
    val desc: LiveData<String> = Transformations.map(data) {
        it.description
    }

    val open_issues: LiveData<Int> = Transformations.map(data) {
        it.open_issues_count
    }
    val lice_name: LiveData<String> = Transformations.map(data) {
        it.license?.name?:"NA"
    }
    val lice_spdx: LiveData<String> = Transformations.map(data) {
        it.license?.spdx_id?:"NA"
    }

    val lice_url: LiveData<String> = Transformations.map(data) {
        it.license?.url?:"NA"
    }

    val lice_node: LiveData<String> = Transformations.map(data) {
        it.license?.node_id?:"NA"
    }

    val perm_push: LiveData<Boolean> = Transformations.map(data) {
        it.permissions?.push?:false
    }

    val perm_pull: LiveData<Boolean> = Transformations.map(data) {
        it.permissions?.pull?:false
    }

    val perm_admin: LiveData<Boolean> = Transformations.map(data) {
        it.permissions?.admin?:false
    }

    fun onItemClick(position: Int) {
        messageString.postValue(Resource.success("onItemClick at $position of ${data.value?.name}"))
        Logger.d(TAG, "onItemClick at $position")
    }

    override fun onCreate() {
        Logger.d(TAG, "onCreate called")
    }
}