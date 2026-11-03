package pan.alexander.tordnscrypt.modules;

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
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.ap.InternetSharingChecker;
import pan.alexander.tordnscrypt.utils.apps.InstalledAppNamesStorage;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

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
public final class ModulesReceiver_Factory implements Factory<ModulesReceiver> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  private final Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider;

  private final Provider<InternetSharingChecker> internetSharingCheckerProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<TorRestarterReconnector> torRestarterReconnectorProvider;

  private final Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider;

  private final Provider<PathVars> pathVarsProvider;

  public ModulesReceiver_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      Provider<InternetSharingChecker> internetSharingCheckerProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerProvider,
      Provider<TorRestarterReconnector> torRestarterReconnectorProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<PathVars> pathVarsProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
    this.connectionCheckerInteractorProvider = connectionCheckerInteractorProvider;
    this.internetSharingCheckerProvider = internetSharingCheckerProvider;
    this.executorProvider = executorProvider;
    this.handlerProvider = handlerProvider;
    this.torRestarterReconnectorProvider = torRestarterReconnectorProvider;
    this.installedAppNamesStorageProvider = installedAppNamesStorageProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public ModulesReceiver get() {
    return newInstance(DoubleCheck.lazy(preferenceRepositoryProvider), DoubleCheck.lazy(defaultSharedPreferencesProvider), DoubleCheck.lazy(connectionCheckerInteractorProvider), internetSharingCheckerProvider, executorProvider.get(), DoubleCheck.lazy(handlerProvider), DoubleCheck.lazy(torRestarterReconnectorProvider), DoubleCheck.lazy(installedAppNamesStorageProvider), DoubleCheck.lazy(pathVarsProvider));
  }

  public static ModulesReceiver_Factory create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      javax.inject.Provider<InternetSharingChecker> internetSharingCheckerProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<TorRestarterReconnector> torRestarterReconnectorProvider,
      javax.inject.Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new ModulesReceiver_Factory(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultSharedPreferencesProvider), Providers.asDaggerProvider(connectionCheckerInteractorProvider), Providers.asDaggerProvider(internetSharingCheckerProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(torRestarterReconnectorProvider), Providers.asDaggerProvider(installedAppNamesStorageProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static ModulesReceiver_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      Provider<InternetSharingChecker> internetSharingCheckerProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerProvider,
      Provider<TorRestarterReconnector> torRestarterReconnectorProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<PathVars> pathVarsProvider) {
    return new ModulesReceiver_Factory(preferenceRepositoryProvider, defaultSharedPreferencesProvider, connectionCheckerInteractorProvider, internetSharingCheckerProvider, executorProvider, handlerProvider, torRestarterReconnectorProvider, installedAppNamesStorageProvider, pathVarsProvider);
  }

  public static ModulesReceiver newInstance(Lazy<PreferenceRepository> preferenceRepository,
      Lazy<SharedPreferences> defaultSharedPreferences,
      Lazy<ConnectionCheckerInteractor> connectionCheckerInteractor,
      javax.inject.Provider<InternetSharingChecker> internetSharingChecker,
      CoroutineExecutor executor, Lazy<Handler> handler,
      Lazy<TorRestarterReconnector> torRestarterReconnector,
      Lazy<InstalledAppNamesStorage> installedAppNamesStorage, Lazy<PathVars> pathVars) {
    return new ModulesReceiver(preferenceRepository, defaultSharedPreferences, connectionCheckerInteractor, internetSharingChecker, executor, handler, torRestarterReconnector, installedAppNamesStorage, pathVars);
  }
}
