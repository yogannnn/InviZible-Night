package pan.alexander.tordnscrypt.utils.root;

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
import kotlinx.coroutines.MainCoroutineDispatcher;
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
public final class RootExecutor_Factory implements Factory<RootExecutor> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<MainCoroutineDispatcher> dispatcherMainProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public RootExecutor_Factory(Provider<PathVars> pathVarsProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.dispatcherMainProvider = dispatcherMainProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public RootExecutor get() {
    return newInstance(DoubleCheck.lazy(pathVarsProvider), DoubleCheck.lazy(preferenceRepositoryProvider), DoubleCheck.lazy(defaultPreferencesProvider), dispatcherMainProvider.get(), dispatcherIoProvider.get());
  }

  public static RootExecutor_Factory create(javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new RootExecutor_Factory(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(dispatcherMainProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static RootExecutor_Factory create(Provider<PathVars> pathVarsProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new RootExecutor_Factory(pathVarsProvider, preferenceRepositoryProvider, defaultPreferencesProvider, dispatcherMainProvider, dispatcherIoProvider);
  }

  public static RootExecutor newInstance(Lazy<PathVars> pathVars,
      Lazy<PreferenceRepository> preferenceRepository, Lazy<SharedPreferences> defaultPreferences,
      MainCoroutineDispatcher dispatcherMain, CoroutineDispatcher dispatcherIo) {
    return new RootExecutor(pathVars, preferenceRepository, defaultPreferences, dispatcherMain, dispatcherIo);
  }
}
