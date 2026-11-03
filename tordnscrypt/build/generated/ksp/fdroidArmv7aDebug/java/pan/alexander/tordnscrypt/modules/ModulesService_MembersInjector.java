package pan.alexander.tordnscrypt.modules;

import android.content.SharedPreferences;
import android.os.Handler;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.apps.InstalledAppNamesStorage;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.portchecker.PortChecker;

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
public final class ModulesService_MembersInjector implements MembersInjector<ModulesService> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  private final Provider<ConnectionCheckerInteractor> internetCheckerInteractorProvider;

  private final Provider<ModulesReceiver> modulesReceiverProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider;

  private final Provider<PortChecker> portCheckerProvider;

  public ModulesService_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<ConnectionCheckerInteractor> internetCheckerInteractorProvider,
      Provider<ModulesReceiver> modulesReceiverProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<PortChecker> portCheckerProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
    this.internetCheckerInteractorProvider = internetCheckerInteractorProvider;
    this.modulesReceiverProvider = modulesReceiverProvider;
    this.handlerProvider = handlerProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.installedAppNamesStorageProvider = installedAppNamesStorageProvider;
    this.portCheckerProvider = portCheckerProvider;
  }

  public static MembersInjector<ModulesService> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<ConnectionCheckerInteractor> internetCheckerInteractorProvider,
      Provider<ModulesReceiver> modulesReceiverProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<PortChecker> portCheckerProvider) {
    return new ModulesService_MembersInjector(preferenceRepositoryProvider, defaultSharedPreferencesProvider, internetCheckerInteractorProvider, modulesReceiverProvider, handlerProvider, pathVarsProvider, executorProvider, installedAppNamesStorageProvider, portCheckerProvider);
  }

  public static MembersInjector<ModulesService> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> internetCheckerInteractorProvider,
      javax.inject.Provider<ModulesReceiver> modulesReceiverProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      javax.inject.Provider<PortChecker> portCheckerProvider) {
    return new ModulesService_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultSharedPreferencesProvider), Providers.asDaggerProvider(internetCheckerInteractorProvider), Providers.asDaggerProvider(modulesReceiverProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(installedAppNamesStorageProvider), Providers.asDaggerProvider(portCheckerProvider));
  }

  @Override
  public void injectMembers(ModulesService instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultSharedPreferences(instance, DoubleCheck.lazy(defaultSharedPreferencesProvider));
    injectInternetCheckerInteractor(instance, DoubleCheck.lazy(internetCheckerInteractorProvider));
    injectModulesReceiver(instance, DoubleCheck.lazy(modulesReceiverProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectInstalledAppNamesStorage(instance, DoubleCheck.lazy(installedAppNamesStorageProvider));
    injectPortChecker(instance, DoubleCheck.lazy(portCheckerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.preferenceRepository")
  public static void injectPreferenceRepository(ModulesService instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.defaultSharedPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultSharedPreferences(ModulesService instance,
      Lazy<SharedPreferences> defaultSharedPreferences) {
    instance.defaultSharedPreferences = defaultSharedPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.internetCheckerInteractor")
  public static void injectInternetCheckerInteractor(ModulesService instance,
      Lazy<ConnectionCheckerInteractor> internetCheckerInteractor) {
    instance.internetCheckerInteractor = internetCheckerInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.modulesReceiver")
  public static void injectModulesReceiver(ModulesService instance,
      Lazy<ModulesReceiver> modulesReceiver) {
    instance.modulesReceiver = modulesReceiver;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.handler")
  public static void injectHandler(ModulesService instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.pathVars")
  public static void injectPathVars(ModulesService instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.executor")
  public static void injectExecutor(ModulesService instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.installedAppNamesStorage")
  public static void injectInstalledAppNamesStorage(ModulesService instance,
      Lazy<InstalledAppNamesStorage> installedAppNamesStorage) {
    instance.installedAppNamesStorage = installedAppNamesStorage;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesService.portChecker")
  public static void injectPortChecker(ModulesService instance, Lazy<PortChecker> portChecker) {
    instance.portChecker = portChecker;
  }
}
