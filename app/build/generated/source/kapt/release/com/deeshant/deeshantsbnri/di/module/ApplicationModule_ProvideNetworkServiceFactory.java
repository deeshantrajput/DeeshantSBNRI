// Generated by Dagger (https://google.github.io/dagger).
package com.deeshant.deeshantsbnri.di.module;

import com.deeshant.deeshantsbnri.data.remote.NetworkService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApplicationModule_ProvideNetworkServiceFactory
    implements Factory<NetworkService> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideNetworkServiceFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public NetworkService get() {
    return proxyProvideNetworkService(module);
  }

  public static ApplicationModule_ProvideNetworkServiceFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideNetworkServiceFactory(module);
  }

  public static NetworkService proxyProvideNetworkService(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideNetworkService(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
