package com.deeshant.deeshantsbnri.di.component

import com.deeshant.deeshantsbnri.di.FragmentScope
import com.deeshant.deeshantsbnri.di.module.FragmentModule
import com.deeshant.deeshantsbnri.ui.dummies.DummiesFragment
import dagger.Component

@FragmentScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {

    fun inject(fragment: DummiesFragment)
}