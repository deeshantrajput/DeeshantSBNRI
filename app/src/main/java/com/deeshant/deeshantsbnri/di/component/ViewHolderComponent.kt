package com.deeshant.deeshantsbnri.di.component

import com.deeshant.deeshantsbnri.di.ViewModelScope
import com.deeshant.deeshantsbnri.di.module.ViewHolderModule
import com.deeshant.deeshantsbnri.ui.dummies.DummyItemViewHolder
import dagger.Component

@ViewModelScope
@Component(
    dependencies = [ApplicationComponent::class],
    modules = [ViewHolderModule::class]
)
interface ViewHolderComponent {

    fun inject(viewHolder: DummyItemViewHolder)
}