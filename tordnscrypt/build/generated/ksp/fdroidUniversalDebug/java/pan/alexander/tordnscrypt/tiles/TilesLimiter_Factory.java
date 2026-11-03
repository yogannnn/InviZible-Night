package pan.alexander.tordnscrypt.tiles;

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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;

@ScopeMetadata("pan.alexander.tordnscrypt.di.tiles.TilesScope")
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
public final class TilesLimiter_Factory implements Factory<TilesLimiter> {
  private final Provider<PreferenceRepository> appPreferencesProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  public TilesLimiter_Factory(Provider<PreferenceRepository> appPreferencesProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider) {
    this.appPreferencesProvider = appPreferencesProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public TilesLimiter get() {
    return newInstance(DoubleCheck.lazy(appPreferencesProvider), DoubleCheck.lazy(defaultPreferencesProvider), DoubleCheck.lazy(pathVarsProvider));
  }

  public static TilesLimiter_Factory create(
      javax.inject.Provider<PreferenceRepository> appPreferencesProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new TilesLimiter_Factory(Providers.asDaggerProvider(appPreferencesProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static TilesLimiter_Factory create(Provider<PreferenceRepository> appPreferencesProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider) {
    return new TilesLimiter_Factory(appPreferencesProvider, defaultPreferencesProvider, pathVarsProvider);
  }

  public static TilesLimiter newInstance(Lazy<PreferenceRepository> appPreferences,
      Lazy<SharedPreferences> defaultPreferences, Lazy<PathVars> pathVars) {
    return new TilesLimiter(appPreferences, defaultPreferences, pathVars);
  }
}
