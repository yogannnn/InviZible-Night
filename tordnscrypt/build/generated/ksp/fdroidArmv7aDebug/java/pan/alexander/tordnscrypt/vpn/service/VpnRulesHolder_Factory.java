package pan.alexander.tordnscrypt.vpn.service;

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
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.connectivitycheck.ConnectivityCheckManager;

@ScopeMetadata
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
public final class VpnRulesHolder_Factory implements Factory<VpnRulesHolder> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ConnectivityCheckManager> connectivityCheckManagerProvider;

  private final Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider;

  public VpnRulesHolder_Factory(Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.connectivityCheckManagerProvider = connectivityCheckManagerProvider;
    this.connectionCheckerInteractorProvider = connectionCheckerInteractorProvider;
  }

  @Override
  public VpnRulesHolder get() {
    return newInstance(defaultPreferencesProvider.get(), preferenceRepositoryProvider.get(), pathVarsProvider.get(), DoubleCheck.lazy(connectivityCheckManagerProvider), DoubleCheck.lazy(connectionCheckerInteractorProvider));
  }

  public static VpnRulesHolder_Factory create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider) {
    return new VpnRulesHolder_Factory(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(connectivityCheckManagerProvider), Providers.asDaggerProvider(connectionCheckerInteractorProvider));
  }

  public static VpnRulesHolder_Factory create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider) {
    return new VpnRulesHolder_Factory(defaultPreferencesProvider, preferenceRepositoryProvider, pathVarsProvider, connectivityCheckManagerProvider, connectionCheckerInteractorProvider);
  }

  public static VpnRulesHolder newInstance(SharedPreferences defaultPreferences,
      PreferenceRepository preferenceRepository, PathVars pathVars,
      Lazy<ConnectivityCheckManager> connectivityCheckManager,
      Lazy<ConnectionCheckerInteractor> connectionCheckerInteractor) {
    return new VpnRulesHolder(defaultPreferences, preferenceRepository, pathVars, connectivityCheckManager, connectionCheckerInteractor);
  }
}
