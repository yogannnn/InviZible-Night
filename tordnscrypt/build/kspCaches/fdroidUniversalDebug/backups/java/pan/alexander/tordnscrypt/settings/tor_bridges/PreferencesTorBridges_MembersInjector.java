package pan.alexander.tordnscrypt.settings.tor_bridges;

import android.content.SharedPreferences;
import android.os.Handler;
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
import javax.inject.Named;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
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
public final class PreferencesTorBridges_MembersInjector implements MembersInjector<PreferencesTorBridges> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Handler> handlerLazyProvider;

  private final Provider<BridgeChecker> bridgeCheckerProvider;

  private final Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PreferencesTorBridges_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerLazyProvider,
      Provider<BridgeChecker> bridgeCheckerProvider,
      Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.handlerLazyProvider = handlerLazyProvider;
    this.bridgeCheckerProvider = bridgeCheckerProvider;
    this.snowflakeConfiguratorProvider = snowflakeConfiguratorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PreferencesTorBridges> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerLazyProvider,
      Provider<BridgeChecker> bridgeCheckerProvider,
      Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PreferencesTorBridges_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, pathVarsProvider, executorProvider, handlerLazyProvider, bridgeCheckerProvider, snowflakeConfiguratorProvider, viewModelFactoryProvider);
  }

  public static MembersInjector<PreferencesTorBridges> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Handler> handlerLazyProvider,
      javax.inject.Provider<BridgeChecker> bridgeCheckerProvider,
      javax.inject.Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PreferencesTorBridges_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(handlerLazyProvider), Providers.asDaggerProvider(bridgeCheckerProvider), Providers.asDaggerProvider(snowflakeConfiguratorProvider), Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(PreferencesTorBridges instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectHandlerLazy(instance, DoubleCheck.lazy(handlerLazyProvider));
    injectBridgeChecker(instance, DoubleCheck.lazy(bridgeCheckerProvider));
    injectSnowflakeConfigurator(instance, DoubleCheck.lazy(snowflakeConfiguratorProvider));
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.preferenceRepository")
  public static void injectPreferenceRepository(PreferencesTorBridges instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesTorBridges instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.pathVars")
  public static void injectPathVars(PreferencesTorBridges instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.executor")
  public static void injectExecutor(PreferencesTorBridges instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.handlerLazy")
  public static void injectHandlerLazy(PreferencesTorBridges instance, Lazy<Handler> handlerLazy) {
    instance.handlerLazy = handlerLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.bridgeChecker")
  public static void injectBridgeChecker(PreferencesTorBridges instance,
      Lazy<BridgeChecker> bridgeChecker) {
    instance.bridgeChecker = bridgeChecker;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.snowflakeConfigurator")
  public static void injectSnowflakeConfigurator(PreferencesTorBridges instance,
      Lazy<SnowflakeConfigurator> snowflakeConfigurator) {
    instance.snowflakeConfigurator = snowflakeConfigurator;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges.viewModelFactory")
  public static void injectViewModelFactory(PreferencesTorBridges instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
