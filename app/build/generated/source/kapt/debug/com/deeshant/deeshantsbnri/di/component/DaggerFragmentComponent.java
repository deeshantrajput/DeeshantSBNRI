// Generated by Dagger (https://google.github.io/dagger).
package com.deeshant.deeshantsbnri.di.component;

import com.deeshant.deeshantsbnri.data.repository.DummyRepository;
import com.deeshant.deeshantsbnri.di.module.FragmentModule;
import com.deeshant.deeshantsbnri.di.module.FragmentModule_ProvideDummiesAdapterFactory;
import com.deeshant.deeshantsbnri.di.module.FragmentModule_ProvideDummiesViewModelFactory;
import com.deeshant.deeshantsbnri.di.module.FragmentModule_ProvideLinearLayoutManagerFactory;
import com.deeshant.deeshantsbnri.ui.base.BaseFragment_MembersInjector;
import com.deeshant.deeshantsbnri.ui.dummies.DummiesFragment;
import com.deeshant.deeshantsbnri.ui.dummies.DummiesFragment_MembersInjector;
import com.deeshant.deeshantsbnri.ui.dummies.DummiesViewModel;
import dagger.internal.Preconditions;

public final class DaggerFragmentComponent implements FragmentComponent {
  private final ApplicationComponent applicationComponent;

  private final FragmentModule fragmentModule;

  private DaggerFragmentComponent(
      FragmentModule fragmentModuleParam, ApplicationComponent applicationComponentParam) {
    this.applicationComponent = applicationComponentParam;
    this.fragmentModule = fragmentModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private DummyRepository getDummyRepository() {
    return new DummyRepository(
        Preconditions.checkNotNull(
            applicationComponent.getNetworkService(),
            "Cannot return null from a non-@Nullable component method"),
        Preconditions.checkNotNull(
            applicationComponent.getDatabaseService(),
            "Cannot return null from a non-@Nullable component method"));
  }

  private DummiesViewModel getDummiesViewModel() {
    return FragmentModule_ProvideDummiesViewModelFactory.proxyProvideDummiesViewModel(
        fragmentModule,
        Preconditions.checkNotNull(
            applicationComponent.getSchedulerProvider(),
            "Cannot return null from a non-@Nullable component method"),
        Preconditions.checkNotNull(
            applicationComponent.getCompositeDisposable(),
            "Cannot return null from a non-@Nullable component method"),
        Preconditions.checkNotNull(
            applicationComponent.getNetworkHelper(),
            "Cannot return null from a non-@Nullable component method"),
        Preconditions.checkNotNull(
            applicationComponent.getDatabaseService(),
            "Cannot return null from a non-@Nullable component method"),
        getDummyRepository());
  }

  @Override
  public void inject(DummiesFragment fragment) {
    injectDummiesFragment(fragment);
  }

  private DummiesFragment injectDummiesFragment(DummiesFragment instance) {
    BaseFragment_MembersInjector.injectViewModel(instance, getDummiesViewModel());
    DummiesFragment_MembersInjector.injectLinearLayoutManager(
        instance,
        FragmentModule_ProvideLinearLayoutManagerFactory.proxyProvideLinearLayoutManager(
            fragmentModule));
    DummiesFragment_MembersInjector.injectDummiesAdapter(
        instance,
        FragmentModule_ProvideDummiesAdapterFactory.proxyProvideDummiesAdapter(fragmentModule));
    return instance;
  }

  public static final class Builder {
    private FragmentModule fragmentModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public Builder fragmentModule(FragmentModule fragmentModule) {
      this.fragmentModule = Preconditions.checkNotNull(fragmentModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }

    public FragmentComponent build() {
      Preconditions.checkBuilderRequirement(fragmentModule, FragmentModule.class);
      Preconditions.checkBuilderRequirement(applicationComponent, ApplicationComponent.class);
      return new DaggerFragmentComponent(fragmentModule, applicationComponent);
    }
  }
}
