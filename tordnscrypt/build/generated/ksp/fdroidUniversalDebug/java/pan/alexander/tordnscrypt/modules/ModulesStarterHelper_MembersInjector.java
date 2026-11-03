package pan.alexander.tordnscrypt.modules;

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
import pan.alexander.tordnscrypt.settings.PathVars;
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
public final class ModulesStarterHelper_MembersInjector implements MembersInjector<ModulesStarterHelper> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<PortChecker> portCheckerProvider;

  public ModulesStarterHelper_MembersInjector(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<PortChecker> portCheckerProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.portCheckerProvider = portCheckerProvider;
  }

  public static MembersInjector<ModulesStarterHelper> create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<PortChecker> portCheckerProvider) {
    return new ModulesStarterHelper_MembersInjector(defaultPreferencesProvider, preferenceRepositoryProvider, pathVarsProvider, portCheckerProvider);
  }

  public static MembersInjector<ModulesStarterHelper> create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<PortChecker> portCheckerProvider) {
    return new ModulesStarterHelper_MembersInjector(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(portCheckerProvider));
  }

  @Override
  public void injectMembers(ModulesStarterHelper instance) {
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, pathVarsProvider.get());
    injectPortChecker(instance, DoubleCheck.lazy(portCheckerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStarterHelper.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(ModulesStarterHelper instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStarterHelper.preferenceRepository")
  public static void injectPreferenceRepository(ModulesStarterHelper instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStarterHelper.pathVars")
  public static void injectPathVars(ModulesStarterHelper instance, PathVars pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStarterHelper.portChecker")
  public static void injectPortChecker(ModulesStarterHelper instance,
      Lazy<PortChecker> portChecker) {
    instance.portChecker = portChecker;
  }
}
