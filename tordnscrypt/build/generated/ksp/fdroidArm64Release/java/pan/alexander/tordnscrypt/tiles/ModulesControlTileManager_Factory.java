package pan.alexander.tordnscrypt.tiles;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.workers.UpdateIPsManager;

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
public final class ModulesControlTileManager_Factory implements Factory<ModulesControlTileManager> {
  private final Provider<MainCoroutineDispatcher> dispatcherMainProvider;

  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider;

  private final Provider<Context> contextProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<UpdateIPsManager> updateIPsManagerProvider;

  public ModulesControlTileManager_Factory(Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider, Provider<UpdateIPsManager> updateIPsManagerProvider) {
    this.dispatcherMainProvider = dispatcherMainProvider;
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.coroutineExceptionHandlerProvider = coroutineExceptionHandlerProvider;
    this.contextProvider = contextProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.handlerProvider = handlerProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.updateIPsManagerProvider = updateIPsManagerProvider;
  }

  @Override
  public ModulesControlTileManager get() {
    return newInstance(dispatcherMainProvider.get(), baseCoroutineScopeProvider.get(), coroutineExceptionHandlerProvider.get(), contextProvider.get(), preferenceRepositoryProvider.get(), defaultPreferencesProvider.get(), handlerProvider.get(), pathVarsProvider.get(), DoubleCheck.lazy(updateIPsManagerProvider));
  }

  public static ModulesControlTileManager_Factory create(
      javax.inject.Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<UpdateIPsManager> updateIPsManagerProvider) {
    return new ModulesControlTileManager_Factory(Providers.asDaggerProvider(dispatcherMainProvider), Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(coroutineExceptionHandlerProvider), Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(updateIPsManagerProvider));
  }

  public static ModulesControlTileManager_Factory create(
      Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider, Provider<UpdateIPsManager> updateIPsManagerProvider) {
    return new ModulesControlTileManager_Factory(dispatcherMainProvider, baseCoroutineScopeProvider, coroutineExceptionHandlerProvider, contextProvider, preferenceRepositoryProvider, defaultPreferencesProvider, handlerProvider, pathVarsProvider, updateIPsManagerProvider);
  }

  public static ModulesControlTileManager newInstance(MainCoroutineDispatcher dispatcherMain,
      CoroutineScope baseCoroutineScope, CoroutineExceptionHandler coroutineExceptionHandler,
      Context context, PreferenceRepository preferenceRepository,
      SharedPreferences defaultPreferences, Handler handler, PathVars pathVars,
      Lazy<UpdateIPsManager> updateIPsManager) {
    return new ModulesControlTileManager(dispatcherMain, baseCoroutineScope, coroutineExceptionHandler, context, preferenceRepository, defaultPreferences, handler, pathVars, updateIPsManager);
  }
}
