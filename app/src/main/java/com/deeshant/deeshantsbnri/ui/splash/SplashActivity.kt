package com.deeshant.deeshantsbnri.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import com.deeshant.deeshantsbnri.R
import com.deeshant.deeshantsbnri.di.component.ActivityComponent
import com.deeshant.deeshantsbnri.ui.base.BaseActivity
import com.deeshant.deeshantsbnri.ui.dummy.DummyActivity
import com.deeshant.deeshantsbnri.utils.common.Event

class SplashActivity : BaseActivity<SplashViewModel>() {

    companion object {
        const val TAG = "SplashActivity"
    }

    override fun provideLayoutId(): Int = R.layout.activity_splash

    override fun injectDependencies(activityComponent: ActivityComponent) {
        activityComponent.inject(this)
    }

    override fun setupView(savedInstanceState: Bundle?) {
    }

    override fun setupObservers() {
       viewModel.launchDummy.observe(this, Observer<Event<Map<String, String>>> {
            it.getIfNotHandled()?.run {
                startActivity(Intent(applicationContext, DummyActivity::class.java))
            }
        })
    }
}