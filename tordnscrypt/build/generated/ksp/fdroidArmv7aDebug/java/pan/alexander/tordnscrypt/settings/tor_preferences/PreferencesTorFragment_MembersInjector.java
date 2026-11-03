package pan.alexander.tordnscrypt.settings.tor_preferences;

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
import pan.alexander.tordnscrypt.settings.tor_bridges.SnowflakeConfigurator;
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
public final class PreferencesTorFragment_MembersInjector implements MembersInjector<PreferencesTorFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider;

  public PreferencesTorFragment_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.snowflakeConfiguratorProvider = snowflakeConfiguratorProvider;
  }

  public static MembersInjector<PreferencesTorFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider) {
    return new PreferencesTorFragment_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, pathVarsProvider, executorProvider, snowflakeConfiguratorProvider);
  }

  public static MembersInjector<PreferencesTorFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider) {
    return new PreferencesTorFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(snowflakeConfiguratorProvider));
  }

  @Override
  public void injectMembers(PreferencesTorFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectSnowflakeConfigurator(instance, DoubleCheck.lazy(snowflakeConfiguratorProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment.preferenceRepository")
  public static void injectPreferenceRepository(PreferencesTorFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesTorFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment.pathVars")
  public static void injectPathVars(PreferencesTorFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment.executor")
  public static void injectExecutor(PreferencesTorFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment.snowflakeConfigurator")
  public static void injectSnowflakeConfigurator(PreferencesTorFragment instance,
      Lazy<SnowflakeConfigurator> snowflakeConfigurator) {
    instance.snowflakeConfigurator = snowflakeConfigurator;
  }
}
