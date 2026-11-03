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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class ServiceVPNHandler_MembersInjector implements MembersInjector<ServiceVPNHandler> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<VpnBuilder> vpnBuilderProvider;

  private final Provider<Handler> handlerProvider;

  public ServiceVPNHandler_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PathVars> pathVarsProvider, Provider<VpnBuilder> vpnBuilderProvider,
      Provider<Handler> handlerProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.vpnBuilderProvider = vpnBuilderProvider;
    this.handlerProvider = handlerProvider;
  }

  public static MembersInjector<ServiceVPNHandler> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PathVars> pathVarsProvider, Provider<VpnBuilder> vpnBuilderProvider,
      Provider<Handler> handlerProvider) {
    return new ServiceVPNHandler_MembersInjector(preferenceRepositoryProvider, defaultSharedPreferencesProvider, pathVarsProvider, vpnBuilderProvider, handlerProvider);
  }

  public static MembersInjector<ServiceVPNHandler> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<VpnBuilder> vpnBuilderProvider,
      javax.inject.Provider<Handler> handlerProvider) {
    return new ServiceVPNHandler_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultSharedPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(vpnBuilderProvider), Providers.asDaggerProvider(handlerProvider));
  }

  @Override
  public void injectMembers(ServiceVPNHandler instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultSharedPreferences(instance, DoubleCheck.lazy(defaultSharedPreferencesProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectVpnBuilder(instance, DoubleCheck.lazy(vpnBuilderProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler.preferenceRepository")
  public static void injectPreferenceRepository(ServiceVPNHandler instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler.defaultSharedPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultSharedPreferences(ServiceVPNHandler instance,
      Lazy<SharedPreferences> defaultSharedPreferences) {
    instance.defaultSharedPreferences = defaultSharedPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler.pathVars")
  public static void injectPathVars(ServiceVPNHandler instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler.vpnBuilder")
  public static void injectVpnBuilder(ServiceVPNHandler instance, Lazy<VpnBuilder> vpnBuilder) {
    instance.vpnBuilder = vpnBuilder;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler.handler")
  public static void injectHandler(ServiceVPNHandler instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }
}
