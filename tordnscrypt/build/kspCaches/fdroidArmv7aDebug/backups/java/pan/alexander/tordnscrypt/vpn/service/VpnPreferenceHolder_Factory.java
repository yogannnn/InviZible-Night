package pan.alexander.tordnscrypt.vpn.service;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class VpnPreferenceHolder_Factory implements Factory<VpnPreferenceHolder> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  public VpnPreferenceHolder_Factory(Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public VpnPreferenceHolder get() {
    return newInstance(defaultPreferencesProvider.get(), preferenceRepositoryProvider.get(), pathVarsProvider.get());
  }

  public static VpnPreferenceHolder_Factory create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new VpnPreferenceHolder_Factory(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static VpnPreferenceHolder_Factory create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    return new VpnPreferenceHolder_Factory(defaultPreferencesProvider, preferenceRepositoryProvider, pathVarsProvider);
  }

  public static VpnPreferenceHolder newInstance(SharedPreferences defaultPreferences,
      PreferenceRepository preferenceRepository, PathVars pathVars) {
    return new VpnPreferenceHolder(defaultPreferences, preferenceRepository, pathVars);
  }
}
