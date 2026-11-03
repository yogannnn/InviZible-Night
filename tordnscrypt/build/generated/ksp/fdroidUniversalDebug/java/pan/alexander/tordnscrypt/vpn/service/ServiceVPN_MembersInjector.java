package pan.alexander.tordnscrypt.vpn.service;

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
public final class ServiceVPN_MembersInjector implements MembersInjector<ServiceVPN> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<VpnPreferenceHolder> vpnPreferenceHolderProvider;

  private final Provider<VpnRulesHolder> vpnRulesHolderProvider;

  public ServiceVPN_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      Provider<Handler> handlerProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<VpnPreferenceHolder> vpnPreferenceHolderProvider,
      Provider<VpnRulesHolder> vpnRulesHolderProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.connectionCheckerInteractorProvider = connectionCheckerInteractorProvider;
    this.handlerProvider = handlerProvider;
    this.executorProvider = executorProvider;
    this.vpnPreferenceHolderProvider = vpnPreferenceHolderProvider;
    this.vpnRulesHolderProvider = vpnRulesHolderProvider;
  }

  public static MembersInjector<ServiceVPN> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      Provider<Handler> handlerProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<VpnPreferenceHolder> vpnPreferenceHolderProvider,
      Provider<VpnRulesHolder> vpnRulesHolderProvider) {
    return new ServiceVPN_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, pathVarsProvider, connectionCheckerInteractorProvider, handlerProvider, executorProvider, vpnPreferenceHolderProvider, vpnRulesHolderProvider);
  }

  public static MembersInjector<ServiceVPN> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<VpnPreferenceHolder> vpnPreferenceHolderProvider,
      javax.inject.Provider<VpnRulesHolder> vpnRulesHolderProvider) {
    return new ServiceVPN_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(connectionCheckerInteractorProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(vpnPreferenceHolderProvider), Providers.asDaggerProvider(vpnRulesHolderProvider));
  }

  @Override
  public void injectMembers(ServiceVPN instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectConnectionCheckerInteractor(instance, DoubleCheck.lazy(connectionCheckerInteractorProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectExecutor(instance, DoubleCheck.lazy(executorProvider));
    injectVpnPreferenceHolder(instance, vpnPreferenceHolderProvider);
    injectVpnRulesHolder(instance, DoubleCheck.lazy(vpnRulesHolderProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.preferenceRepository")
  public static void injectPreferenceRepository(ServiceVPN instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(ServiceVPN instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.pathVars")
  public static void injectPathVars(ServiceVPN instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.connectionCheckerInteractor")
  public static void injectConnectionCheckerInteractor(ServiceVPN instance,
      Lazy<ConnectionCheckerInteractor> connectionCheckerInteractor) {
    instance.connectionCheckerInteractor = connectionCheckerInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.handler")
  public static void injectHandler(ServiceVPN instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.executor")
  public static void injectExecutor(ServiceVPN instance, Lazy<CoroutineExecutor> executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.vpnPreferenceHolder")
  public static void injectVpnPreferenceHolder(ServiceVPN instance,
      javax.inject.Provider<VpnPreferenceHolder> vpnPreferenceHolder) {
    instance.vpnPreferenceHolder = vpnPreferenceHolder;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPN.vpnRulesHolder")
  public static void injectVpnRulesHolder(ServiceVPN instance,
      Lazy<VpnRulesHolder> vpnRulesHolder) {
    instance.vpnRulesHolder = vpnRulesHolder;
  }
}
