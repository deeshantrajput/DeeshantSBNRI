// Generated by Dagger (https://google.github.io/dagger).
package com.deeshant.deeshantsbnri.ui.base;

import androidx.lifecycle.LifecycleRegistry;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseItemViewHolder_MembersInjector<T, VM extends BaseItemViewModel<T>>
    implements MembersInjector<BaseItemViewHolder<T, VM>> {
  private final Provider<VM> viewModelProvider;

  private final Provider<LifecycleRegistry> lifecycleRegistryProvider;

  public BaseItemViewHolder_MembersInjector(
      Provider<VM> viewModelProvider, Provider<LifecycleRegistry> lifecycleRegistryProvider) {
    this.viewModelProvider = viewModelProvider;
    this.lifecycleRegistryProvider = lifecycleRegistryProvider;
  }

  public static <T, VM extends BaseItemViewModel<T>>
      MembersInjector<BaseItemViewHolder<T, VM>> create(
          Provider<VM> viewModelProvider, Provider<LifecycleRegistry> lifecycleRegistryProvider) {
    return new BaseItemViewHolder_MembersInjector<T, VM>(
        viewModelProvider, lifecycleRegistryProvider);
  }

  @Override
  public void injectMembers(BaseItemViewHolder<T, VM> instance) {
    injectViewModel(instance, viewModelProvider.get());
    injectLifecycleRegistry(instance, lifecycleRegistryProvider.get());
  }

  public static <T, VM extends BaseItemViewModel<T>> void injectViewModel(
      BaseItemViewHolder<T, VM> instance, VM viewModel) {
    instance.viewModel = viewModel;
  }

  public static <T, VM extends BaseItemViewModel<T>> void injectLifecycleRegistry(
      BaseItemViewHolder<T, VM> instance, LifecycleRegistry lifecycleRegistry) {
    instance.lifecycleRegistry = lifecycleRegistry;
  }
}
