package pan.alexander.tordnscrypt;

import androidx.lifecycle.ViewModelProvider;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.modules.ModulesVersions;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;
import pan.alexander.tordnscrypt.utils.notification.NotificationPermissionManager;

@QualifierMetadata
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
public final class TopFragment_MembersInjector implements MembersInjector<TopFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<ModulesVersions> modulesVersionsProvider;

  private final Provider<ConnectionCheckerInteractor> connectionCheckerProvider;

  private final Provider<NotificationPermissionManager> notificationPermissionManagerProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<Verifier> verifierLazyProvider;

  public TopFragment_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<ModulesVersions> modulesVersionsProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerProvider,
      Provider<NotificationPermissionManager> notificationPermissionManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<Verifier> verifierLazyProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.modulesVersionsProvider = modulesVersionsProvider;
    this.connectionCheckerProvider = connectionCheckerProvider;
    this.notificationPermissionManagerProvider = notificationPermissionManagerProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.verifierLazyProvider = verifierLazyProvider;
  }

  public static MembersInjector<TopFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<ModulesVersions> modulesVersionsProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerProvider,
      Provider<NotificationPermissionManager> notificationPermissionManagerProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<Verifier> verifierLazyProvider) {
    return new TopFragment_MembersInjector(preferenceRepositoryProvider, pathVarsProvider, executorProvider, modulesVersionsProvider, connectionCheckerProvider, notificationPermissionManagerProvider, viewModelFactoryProvider, verifierLazyProvider);
  }

  public static MembersInjector<TopFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<ModulesVersions> modulesVersionsProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> connectionCheckerProvider,
      javax.inject.Provider<NotificationPermissionManager> notificationPermissionManagerProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider) {
    return new TopFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(modulesVersionsProvider), Providers.asDaggerProvider(connectionCheckerProvider), Providers.asDaggerProvider(notificationPermissionManagerProvider), Providers.asDaggerProvider(viewModelFactoryProvider), Providers.asDaggerProvider(verifierLazyProvider));
  }

  @Override
  public void injectMembers(TopFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectModulesVersions(instance, DoubleCheck.lazy(modulesVersionsProvider));
    injectConnectionChecker(instance, DoubleCheck.lazy(connectionCheckerProvider));
    injectNotificationPermissionManager(instance, DoubleCheck.lazy(notificationPermissionManagerProvider));
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.preferenceRepository")
  public static void injectPreferenceRepository(TopFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.pathVars")
  public static void injectPathVars(TopFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.executor")
  public static void injectExecutor(TopFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.modulesVersions")
  public static void injectModulesVersions(TopFragment instance,
      Lazy<ModulesVersions> modulesVersions) {
    instance.modulesVersions = modulesVersions;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.connectionChecker")
  public static void injectConnectionChecker(TopFragment instance,
      Lazy<ConnectionCheckerInteractor> connectionChecker) {
    instance.connectionChecker = connectionChecker;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.notificationPermissionManager")
  public static void injectNotificationPermissionManager(TopFragment instance,
      Lazy<NotificationPermissionManager> notificationPermissionManager) {
    instance.notificationPermissionManager = notificationPermissionManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.viewModelFactory")
  public static void injectViewModelFactory(TopFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.TopFragment.verifierLazy")
  public static void injectVerifierLazy(TopFragment instance, Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }
}
