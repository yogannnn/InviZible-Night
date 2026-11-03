package pan.alexander.tordnscrypt.iptables;

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
public final class ModulesIptablesRules_MembersInjector implements MembersInjector<ModulesIptablesRules> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<IptablesFirewall> iptablesFirewallProvider;

  private final Provider<KillSwitchNotification> killSwitchNotificationProvider;

  public ModulesIptablesRules_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<IptablesFirewall> iptablesFirewallProvider,
      Provider<KillSwitchNotification> killSwitchNotificationProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.handlerProvider = handlerProvider;
    this.iptablesFirewallProvider = iptablesFirewallProvider;
    this.killSwitchNotificationProvider = killSwitchNotificationProvider;
  }

  public static MembersInjector<ModulesIptablesRules> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<IptablesFirewall> iptablesFirewallProvider,
      Provider<KillSwitchNotification> killSwitchNotificationProvider) {
    return new ModulesIptablesRules_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, handlerProvider, iptablesFirewallProvider, killSwitchNotificationProvider);
  }

  public static MembersInjector<ModulesIptablesRules> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<IptablesFirewall> iptablesFirewallProvider,
      javax.inject.Provider<KillSwitchNotification> killSwitchNotificationProvider) {
    return new ModulesIptablesRules_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(iptablesFirewallProvider), Providers.asDaggerProvider(killSwitchNotificationProvider));
  }

  @Override
  public void injectMembers(ModulesIptablesRules instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectIptablesFirewall(instance, DoubleCheck.lazy(iptablesFirewallProvider));
    injectKillSwitchNotification(instance, DoubleCheck.lazy(killSwitchNotificationProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.ModulesIptablesRules.preferenceRepository")
  public static void injectPreferenceRepository(ModulesIptablesRules instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.ModulesIptablesRules.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(ModulesIptablesRules instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.ModulesIptablesRules.handler")
  public static void injectHandler(ModulesIptablesRules instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.ModulesIptablesRules.iptablesFirewall")
  public static void injectIptablesFirewall(ModulesIptablesRules instance,
      Lazy<IptablesFirewall> iptablesFirewall) {
    instance.iptablesFirewall = iptablesFirewall;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.ModulesIptablesRules.killSwitchNotification")
  public static void injectKillSwitchNotification(ModulesIptablesRules instance,
      Lazy<KillSwitchNotification> killSwitchNotification) {
    instance.killSwitchNotification = killSwitchNotification;
  }
}
