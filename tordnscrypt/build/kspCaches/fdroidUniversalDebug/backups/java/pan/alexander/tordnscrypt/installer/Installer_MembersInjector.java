package pan.alexander.tordnscrypt.installer;

import android.content.SharedPreferences;
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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.modules.ModulesVersions;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

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
public final class Installer_MembersInjector implements MembersInjector<Installer> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<ModulesVersions> modulesVersionsProvider;

  private final Provider<InstallerHelper> installerHelperProvider;

  public Installer_MembersInjector(Provider<PathVars> pathVarsProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<ModulesVersions> modulesVersionsProvider,
      Provider<InstallerHelper> installerHelperProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
    this.modulesVersionsProvider = modulesVersionsProvider;
    this.installerHelperProvider = installerHelperProvider;
  }

  public static MembersInjector<Installer> create(Provider<PathVars> pathVarsProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<ModulesVersions> modulesVersionsProvider,
      Provider<InstallerHelper> installerHelperProvider) {
    return new Installer_MembersInjector(pathVarsProvider, defaultPreferencesProvider, preferenceRepositoryProvider, executorProvider, modulesVersionsProvider, installerHelperProvider);
  }

  public static MembersInjector<Installer> create(javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<ModulesVersions> modulesVersionsProvider,
      javax.inject.Provider<InstallerHelper> installerHelperProvider) {
    return new Installer_MembersInjector(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(modulesVersionsProvider), Providers.asDaggerProvider(installerHelperProvider));
  }

  @Override
  public void injectMembers(Installer instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
    injectModulesVersions(instance, DoubleCheck.lazy(modulesVersionsProvider));
    injectInstallerHelper(instance, DoubleCheck.lazy(installerHelperProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.installer.Installer.pathVars")
  public static void injectPathVars(Installer instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.installer.Installer.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(Installer instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.installer.Installer.preferenceRepository")
  public static void injectPreferenceRepository(Installer instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.installer.Installer.executor")
  public static void injectExecutor(Installer instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.installer.Installer.modulesVersions")
  public static void injectModulesVersions(Installer instance,
      Lazy<ModulesVersions> modulesVersions) {
    instance.modulesVersions = modulesVersions;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.installer.Installer.installerHelper")
  public static void injectInstallerHelper(Installer instance,
      Lazy<InstallerHelper> installerHelper) {
    instance.installerHelper = installerHelper;
  }
}
