package com.deeshant.deeshantsbnri.di.component

import com.deeshant.deeshantsbnri.di.ActivityScope
import com.deeshant.deeshantsbnri.di.module.ActivityModule
import com.deeshant.deeshantsbnri.ui.dummy.DummyActivity
import com.deeshant.deeshantsbnri.ui.splash.SplashActivity
import dagger.Component

@ActivityScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: DummyActivity)
}