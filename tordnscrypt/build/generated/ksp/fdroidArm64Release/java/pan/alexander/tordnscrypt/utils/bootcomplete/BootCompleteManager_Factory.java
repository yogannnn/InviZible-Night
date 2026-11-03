package pan.alexander.tordnscrypt.utils.bootcomplete;

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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.modules.ModulesStatusBroadcaster;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.ap.ApManager;
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
public final class BootCompleteManager_Factory implements Factory<BootCompleteManager> {
  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ApManager> apManagerProvider;

  private final Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider;

  private final Provider<UpdateIPsManager> updateIPsManagerProvider;

  public BootCompleteManager_Factory(Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<Handler> handlerProvider, Provider<PathVars> pathVarsProvider,
      Provider<ApManager> apManagerProvider,
      Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      Provider<UpdateIPsManager> updateIPsManagerProvider) {
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.handlerProvider = handlerProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.apManagerProvider = apManagerProvider;
    this.modulesStatusBroadcasterProvider = modulesStatusBroadcasterProvider;
    this.updateIPsManagerProvider = updateIPsManagerProvider;
  }

  @Override
  public BootCompleteManager get() {
    return newInstance(DoubleCheck.lazy(defaultSharedPreferencesProvider), DoubleCheck.lazy(preferenceRepositoryProvider), DoubleCheck.lazy(handlerProvider), DoubleCheck.lazy(pathVarsProvider), DoubleCheck.lazy(apManagerProvider), DoubleCheck.lazy(modulesStatusBroadcasterProvider), DoubleCheck.lazy(updateIPsManagerProvider));
  }

  public static BootCompleteManager_Factory create(
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ApManager> apManagerProvider,
      javax.inject.Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      javax.inject.Provider<UpdateIPsManager> updateIPsManagerProvider) {
    return new BootCompleteManager_Factory(Providers.asDaggerProvider(defaultSharedPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(apManagerProvider), Providers.asDaggerProvider(modulesStatusBroadcasterProvider), Providers.asDaggerProvider(updateIPsManagerProvider));
  }

  public static BootCompleteManager_Factory create(
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<Handler> handlerProvider, Provider<PathVars> pathVarsProvider,
      Provider<ApManager> apManagerProvider,
      Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      Provider<UpdateIPsManager> updateIPsManagerProvider) {
    return new BootCompleteManager_Factory(defaultSharedPreferencesProvider, preferenceRepositoryProvider, handlerProvider, pathVarsProvider, apManagerProvider, modulesStatusBroadcasterProvider, updateIPsManagerProvider);
  }

  public static BootCompleteManager newInstance(Lazy<SharedPreferences> defaultSharedPreferences,
      Lazy<PreferenceRepository> preferenceRepository, Lazy<Handler> handler,
      Lazy<PathVars> pathVars, Lazy<ApManager> apManager,
      Lazy<ModulesStatusBroadcaster> modulesStatusBroadcaster,
      Lazy<UpdateIPsManager> updateIPsManager) {
    return new BootCompleteManager(defaultSharedPreferences, preferenceRepository, handler, pathVars, apManager, modulesStatusBroadcaster, updateIPsManager);
  }
}
