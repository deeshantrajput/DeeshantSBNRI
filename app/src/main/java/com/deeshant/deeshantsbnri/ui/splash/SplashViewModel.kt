package com.deeshant.deeshantsbnri.ui.splash

import androidx.lifecycle.MutableLiveData
import com.deeshant.deeshantsbnri.data.local.db.DatabaseService
import com.deeshant.deeshantsbnri.ui.base.BaseViewModel
import com.deeshant.deeshantsbnri.utils.common.Event
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable


class SplashViewModel(
    schedulerProvider: SchedulerProvider,
    compositeDisposable: CompositeDisposable,
    networkHelper: NetworkHelper,
    databaseService: DatabaseService
) : BaseViewModel(schedulerProvider, compositeDisposable, networkHelper,databaseService) {

    // Event is used by the view model to tell the activity to launch another Activity
    // view model also provided the Bundle in the event that is needed for the Activity
    val launchDummy: MutableLiveData<Event<Map<String, String>>> = MutableLiveData()

    override fun onCreate() {
        // Empty Bundle passed to Activity in Event that is needed by the other Activity
        // Here in actual application we will decide which screen to open based on
        // either the user is logged in or not
        launchDummy.postValue(Event(emptyMap()))
    }
}