package pan.alexander.tordnscrypt.domain.connection_checker;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineScope;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsRepository;
import pan.alexander.tordnscrypt.settings.PathVars;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ConnectionCheckerInteractorImpl_Factory implements Factory<ConnectionCheckerInteractorImpl> {
  private final Provider<ConnectionCheckerRepository> checkerRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<DnsRepository> dnsRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Context> contextProvider;

  public ConnectionCheckerInteractorImpl_Factory(
      Provider<ConnectionCheckerRepository> checkerRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<DnsRepository> dnsRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Context> contextProvider) {
    this.checkerRepositoryProvider = checkerRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.dnsRepositoryProvider = dnsRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectionCheckerInteractorImpl get() {
    return newInstance(checkerRepositoryProvider.get(), pathVarsProvider.get(), baseCoroutineScopeProvider.get(), dnsRepositoryProvider.get(), defaultPreferencesProvider.get(), contextProvider.get());
  }

  public static ConnectionCheckerInteractorImpl_Factory create(
      javax.inject.Provider<ConnectionCheckerRepository> checkerRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<DnsRepository> dnsRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Context> contextProvider) {
    return new ConnectionCheckerInteractorImpl_Factory(Providers.asDaggerProvider(checkerRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(dnsRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(contextProvider));
  }

  public static ConnectionCheckerInteractorImpl_Factory create(
      Provider<ConnectionCheckerRepository> checkerRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<DnsRepository> dnsRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Context> contextProvider) {
    return new ConnectionCheckerInteractorImpl_Factory(checkerRepositoryProvider, pathVarsProvider, baseCoroutineScopeProvider, dnsRepositoryProvider, defaultPreferencesProvider, contextProvider);
  }

  public static ConnectionCheckerInteractorImpl newInstance(
      ConnectionCheckerRepository checkerRepository, PathVars pathVars,
      CoroutineScope baseCoroutineScope, DnsRepository dnsRepository,
      SharedPreferences defaultPreferences, Context context) {
    return new ConnectionCheckerInteractorImpl(checkerRepository, pathVars, baseCoroutineScope, dnsRepository, defaultPreferences, context);
  }
}
