package pan.alexander.tordnscrypt.utils.connectivitycheck;

import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractor;
import pan.alexander.tordnscrypt.settings.PathVars;

@ScopeMetadata("pan.alexander.tordnscrypt.di.modulesservice.ModulesServiceScope")
@QualifierMetadata("javax.inject.Named")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class ConnectivityCheckManager_Factory implements Factory<ConnectivityCheckManager> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<DnsInteractor> dnsInteractorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public ConnectivityCheckManager_Factory(Provider<PathVars> pathVarsProvider,
      Provider<DnsInteractor> dnsInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.dnsInteractorProvider = dnsInteractorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public ConnectivityCheckManager get() {
    return newInstance(pathVarsProvider.get(), dnsInteractorProvider.get(), DoubleCheck.lazy(defaultPreferencesProvider), dispatcherIoProvider.get());
  }

  public static ConnectivityCheckManager_Factory create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<DnsInteractor> dnsInteractorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new ConnectivityCheckManager_Factory(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(dnsInteractorProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static ConnectivityCheckManager_Factory create(Provider<PathVars> pathVarsProvider,
      Provider<DnsInteractor> dnsInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new ConnectivityCheckManager_Factory(pathVarsProvider, dnsInteractorProvider, defaultPreferencesProvider, dispatcherIoProvider);
  }

  public static ConnectivityCheckManager newInstance(PathVars pathVars, DnsInteractor dnsInteractor,
      Lazy<SharedPreferences> defaultPreferences, CoroutineDispatcher dispatcherIo) {
    return new ConnectivityCheckManager(pathVars, dnsInteractor, defaultPreferences, dispatcherIo);
  }
}
