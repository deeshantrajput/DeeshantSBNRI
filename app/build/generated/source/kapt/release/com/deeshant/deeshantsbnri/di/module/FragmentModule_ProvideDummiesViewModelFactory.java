// Generated by Dagger (https://google.github.io/dagger).
package com.deeshant.deeshantsbnri.di.module;

import com.deeshant.deeshantsbnri.data.local.db.DatabaseService;
import com.deeshant.deeshantsbnri.data.repository.DummyRepository;
import com.deeshant.deeshantsbnri.ui.dummies.DummiesViewModel;
import com.deeshant.deeshantsbnri.utils.network.NetworkHelper;
import com.deeshant.deeshantsbnri.utils.rx.SchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Provider;

public final class FragmentModule_ProvideDummiesViewModelFactory
    implements Factory<DummiesViewModel> {
  private final FragmentModule module;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  private final Provider<DatabaseService> databaseServiceProvider;

  private final Provider<DummyRepository> dummyRepositoryProvider;

  public FragmentModule_ProvideDummiesViewModelFactory(
      FragmentModule module,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<NetworkHelper> networkHelperProvider,
      Provider<DatabaseService> databaseServiceProvider,
      Provider<DummyRepository> dummyRepositoryProvider) {
    this.module = module;
    this.schedulerProvider = schedulerProvider;
    this.compositeDisposableProvider = compositeDisposableProvider;
    this.networkHelperProvider = networkHelperProvider;
    this.databaseServiceProvider = databaseServiceProvider;
    this.dummyRepositoryProvider = dummyRepositoryProvider;
  }

  @Override
  public DummiesViewModel get() {
    return proxyProvideDummiesViewModel(
        module,
        schedulerProvider.get(),
        compositeDisposableProvider.get(),
        networkHelperProvider.get(),
        databaseServiceProvider.get(),
        dummyRepositoryProvider.get());
  }

  public static FragmentModule_ProvideDummiesViewModelFactory create(
      FragmentModule module,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider,
      Provider<NetworkHelper> networkHelperProvider,
      Provider<DatabaseService> databaseServiceProvider,
      Provider<DummyRepository> dummyRepositoryProvider) {
    return new FragmentModule_ProvideDummiesViewModelFactory(
        module,
        schedulerProvider,
        compositeDisposableProvider,
        networkHelperProvider,
        databaseServiceProvider,
        dummyRepositoryProvider);
  }

  public static DummiesViewModel proxyProvideDummiesViewModel(
      FragmentModule instance,
      SchedulerProvider schedulerProvider,
      CompositeDisposable compositeDisposable,
      NetworkHelper networkHelper,
      DatabaseService databaseService,
      DummyRepository dummyRepository) {
    return Preconditions.checkNotNull(
        instance.provideDummiesViewModel(
            schedulerProvider,
            compositeDisposable,
            networkHelper,
            databaseService,
            dummyRepository),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
