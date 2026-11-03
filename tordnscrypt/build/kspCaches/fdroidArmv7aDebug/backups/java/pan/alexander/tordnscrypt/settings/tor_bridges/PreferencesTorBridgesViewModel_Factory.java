package pan.alexander.tordnscrypt.settings.tor_bridges;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.bridges.BridgesCountriesInteractor;
import pan.alexander.tordnscrypt.domain.bridges.DefaultVanillaBridgeInteractor;
import pan.alexander.tordnscrypt.domain.bridges.RequestBridgesInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.utils.session.AppSessionStore;

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
public final class PreferencesTorBridgesViewModel_Factory implements Factory<PreferencesTorBridgesViewModel> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider;

  private final Provider<RequestBridgesInteractor> requestBridgesInteractorProvider;

  private final Provider<BridgesCountriesInteractor> bridgesCountriesInteractorProvider;

  private final Provider<BridgePingHelper> bridgePingHelperProvider;

  private final Provider<AppSessionStore> sessionStoreProvider;

  public PreferencesTorBridgesViewModel_Factory(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider,
      Provider<RequestBridgesInteractor> requestBridgesInteractorProvider,
      Provider<BridgesCountriesInteractor> bridgesCountriesInteractorProvider,
      Provider<BridgePingHelper> bridgePingHelperProvider,
      Provider<AppSessionStore> sessionStoreProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultVanillaBridgeInteractorProvider = defaultVanillaBridgeInteractorProvider;
    this.requestBridgesInteractorProvider = requestBridgesInteractorProvider;
    this.bridgesCountriesInteractorProvider = bridgesCountriesInteractorProvider;
    this.bridgePingHelperProvider = bridgePingHelperProvider;
    this.sessionStoreProvider = sessionStoreProvider;
  }

  @Override
  public PreferencesTorBridgesViewModel get() {
    return newInstance(defaultPreferencesProvider.get(), preferenceRepositoryProvider.get(), defaultVanillaBridgeInteractorProvider.get(), requestBridgesInteractorProvider.get(), bridgesCountriesInteractorProvider.get(), bridgePingHelperProvider.get(), sessionStoreProvider.get());
  }

  public static PreferencesTorBridgesViewModel_Factory create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider,
      javax.inject.Provider<RequestBridgesInteractor> requestBridgesInteractorProvider,
      javax.inject.Provider<BridgesCountriesInteractor> bridgesCountriesInteractorProvider,
      javax.inject.Provider<BridgePingHelper> bridgePingHelperProvider,
      javax.inject.Provider<AppSessionStore> sessionStoreProvider) {
    return new PreferencesTorBridgesViewModel_Factory(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultVanillaBridgeInteractorProvider), Providers.asDaggerProvider(requestBridgesInteractorProvider), Providers.asDaggerProvider(bridgesCountriesInteractorProvider), Providers.asDaggerProvider(bridgePingHelperProvider), Providers.asDaggerProvider(sessionStoreProvider));
  }

  public static PreferencesTorBridgesViewModel_Factory create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider,
      Provider<RequestBridgesInteractor> requestBridgesInteractorProvider,
      Provider<BridgesCountriesInteractor> bridgesCountriesInteractorProvider,
      Provider<BridgePingHelper> bridgePingHelperProvider,
      Provider<AppSessionStore> sessionStoreProvider) {
    return new PreferencesTorBridgesViewModel_Factory(defaultPreferencesProvider, preferenceRepositoryProvider, defaultVanillaBridgeInteractorProvider, requestBridgesInteractorProvider, bridgesCountriesInteractorProvider, bridgePingHelperProvider, sessionStoreProvider);
  }

  public static PreferencesTorBridgesViewModel newInstance(SharedPreferences defaultPreferences,
      PreferenceRepository preferenceRepository,
      DefaultVanillaBridgeInteractor defaultVanillaBridgeInteractor,
      RequestBridgesInteractor requestBridgesInteractor,
      BridgesCountriesInteractor bridgesCountriesInteractor, BridgePingHelper bridgePingHelper,
      AppSessionStore sessionStore) {
    return new PreferencesTorBridgesViewModel(defaultPreferences, preferenceRepository, defaultVanillaBridgeInteractor, requestBridgesInteractor, bridgesCountriesInteractor, bridgePingHelper, sessionStore);
  }
}
