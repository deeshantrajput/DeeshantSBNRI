package com.deeshant.deeshantsbnri.di.module

import androidx.lifecycle.LifecycleRegistry
import com.deeshant.deeshantsbnri.di.ViewModelScope
import com.deeshant.deeshantsbnri.ui.base.BaseItemViewHolder
import dagger.Module
import dagger.Provides

@Module
class ViewHolderModule(private val viewHolder: BaseItemViewHolder<*, *>) {

    @Provides
    @ViewModelScope
    fun provideLifecycleRegistry(): LifecycleRegistry = LifecycleRegistry(viewHolder)
}