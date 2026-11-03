package pan.alexander.tordnscrypt.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.lifecycle.ViewModel;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.SingleCheck;
import java.util.Map;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineScope;
import pan.alexander.tordnscrypt.BootCompleteReceiver;
import pan.alexander.tordnscrypt.BootCompleteReceiver_MembersInjector;
import pan.alexander.tordnscrypt.MainActivity;
import pan.alexander.tordnscrypt.MainActivity_MembersInjector;
import pan.alexander.tordnscrypt.TopFragment;
import pan.alexander.tordnscrypt.TopFragmentViewModel;
import pan.alexander.tordnscrypt.TopFragment_MembersInjector;
import pan.alexander.tordnscrypt.about.AboutActivity;
import pan.alexander.tordnscrypt.about.AboutActivity_MembersInjector;
import pan.alexander.tordnscrypt.arp.ArpRelatedUiUpdater;
import pan.alexander.tordnscrypt.arp.ArpScanner;
import pan.alexander.tordnscrypt.arp.ArpScannerHelper;
import pan.alexander.tordnscrypt.arp.ArpScannerLoop;
import pan.alexander.tordnscrypt.arp.ArpTableManager;
import pan.alexander.tordnscrypt.arp.ArpWarningNotification;
import pan.alexander.tordnscrypt.arp.CommandExecutor;
import pan.alexander.tordnscrypt.arp.ConnectionManager;
import pan.alexander.tordnscrypt.arp.DefaultGatewayManager;
import pan.alexander.tordnscrypt.assistance.AccelerateDevelop;
import pan.alexander.tordnscrypt.backup.BackupFragment;
import pan.alexander.tordnscrypt.backup.BackupFragment_MembersInjector;
import pan.alexander.tordnscrypt.backup.BackupHelper;
import pan.alexander.tordnscrypt.backup.BackupHelper_MembersInjector;
import pan.alexander.tordnscrypt.backup.ResetModuleHelper;
import pan.alexander.tordnscrypt.data.bridges.BridgesCountriesDataSourceImpl;
import pan.alexander.tordnscrypt.data.bridges.BridgesCountriesRepositoryImpl;
import pan.alexander.tordnscrypt.data.bridges.DefaultVanillaBridgeDataSourceImpl;
import pan.alexander.tordnscrypt.data.bridges.DefaultVanillaBridgeRepositoryImpl;
import pan.alexander.tordnscrypt.data.bridges.RequestBridgesDataSourceImpl;
import pan.alexander.tordnscrypt.data.bridges.RequestBridgesRepositoryImpl;
import pan.alexander.tordnscrypt.data.connection_checker.ConnectionCheckerDataSourceImpl;
import pan.alexander.tordnscrypt.data.connection_checker.ConnectionCheckerRepositoryImpl;
import pan.alexander.tordnscrypt.data.connection_records.ConnectionRecordsGetter;
import pan.alexander.tordnscrypt.data.connection_records.ConnectionRecordsRepositoryImpl;
import pan.alexander.tordnscrypt.data.connection_records.NflogRecordsGetter;
import pan.alexander.tordnscrypt.data.dns_resolver.DnsDataSourceImpl;
import pan.alexander.tordnscrypt.data.dns_resolver.DnsRepositoryImpl;
import pan.alexander.tordnscrypt.data.dns_rules.DnsRulesDataSourceImpl;
import pan.alexander.tordnscrypt.data.dns_rules.DnsRulesRepositoryImpl;
import pan.alexander.tordnscrypt.data.dnscrypt_relays.RelaysPingDataSourceImpl;
import pan.alexander.tordnscrypt.data.dnscrypt_relays.RelaysPingRepositoryImpl;
import pan.alexander.tordnscrypt.data.dnscrypt_servers.ServersPingDataSourceImpl;
import pan.alexander.tordnscrypt.data.dnscrypt_servers.ServersPingRepositoryImpl;
import pan.alexander.tordnscrypt.data.log_reader.ModulesLogRepositoryImpl;
import pan.alexander.tordnscrypt.data.modules_configuration.DnsCryptConfigurationDataSource;
import pan.alexander.tordnscrypt.data.preferences.PreferenceDataSourceImpl;
import pan.alexander.tordnscrypt.data.preferences.PreferenceRepositoryImpl;
import pan.alexander.tordnscrypt.data.resources.ResourceRepositoryImpl;
import pan.alexander.tordnscrypt.di.arp.ArpSubcomponent;
import pan.alexander.tordnscrypt.di.logreader.LogReaderSubcomponent;
import pan.alexander.tordnscrypt.di.modulesservice.ModulesServiceSubcomponent;
import pan.alexander.tordnscrypt.di.tiles.TilesSubcomponent;
import pan.alexander.tordnscrypt.dialogs.AddDNSCryptServerDialogFragment;
import pan.alexander.tordnscrypt.dialogs.AddDNSCryptServerDialogFragment_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.AgreementDialog;
import pan.alexander.tordnscrypt.dialogs.AskRestoreDefaultsDialog;
import pan.alexander.tordnscrypt.dialogs.AskRestoreDefaultsDialog_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.BridgesCaptchaDialogFragment;
import pan.alexander.tordnscrypt.dialogs.BridgesCaptchaDialogFragment_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.BridgesReadyDialogFragment;
import pan.alexander.tordnscrypt.dialogs.BridgesReadyDialogFragment_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.ChangeModeDialog;
import pan.alexander.tordnscrypt.dialogs.ChangeModeDialog_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.FakeSniInputDialogFragment;
import pan.alexander.tordnscrypt.dialogs.NotificationHelper;
import pan.alexander.tordnscrypt.dialogs.NotificationHelper_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.RequestIgnoreBatteryOptimizationDialog;
import pan.alexander.tordnscrypt.dialogs.RequestIgnoreBatteryOptimizationDialog_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.RequestIgnoreDataRestrictionDialog;
import pan.alexander.tordnscrypt.dialogs.RequestIgnoreDataRestrictionDialog_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.SelectBridgesTransportDialogFragment;
import pan.alexander.tordnscrypt.dialogs.SelectBridgesTransportDialogFragment_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.SendCrashReport;
import pan.alexander.tordnscrypt.dialogs.SendCrashReport_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.UpdateModulesDialogFragment;
import pan.alexander.tordnscrypt.dialogs.UpdateModulesDialogFragment_MembersInjector;
import pan.alexander.tordnscrypt.dialogs.progressDialogs.PleaseWaitDialogBridgesRequest;
import pan.alexander.tordnscrypt.dialogs.progressDialogs.PleaseWaitDialogBridgesRequest_MembersInjector;
import pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentPresenter;
import pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentPresenter_MembersInjector;
import pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver;
import pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver_MembersInjector;
import pan.alexander.tordnscrypt.domain.bridges.BridgesCountriesInteractor;
import pan.alexander.tordnscrypt.domain.bridges.DefaultVanillaBridgeInteractor;
import pan.alexander.tordnscrypt.domain.bridges.RequestBridgesInteractor;
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractorImpl;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsConverter;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsInteractor;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsParser;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractor;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractorImpl;
import pan.alexander.tordnscrypt.domain.dns_rules.DnsRulesInteractorImpl;
import pan.alexander.tordnscrypt.domain.dnscrypt_relays.RelaysPingInteractor;
import pan.alexander.tordnscrypt.domain.dnscrypt_servers.ServersPingInteractor;
import pan.alexander.tordnscrypt.domain.log_reader.DNSCryptInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.ITPDInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.LogReaderInteractors;
import pan.alexander.tordnscrypt.domain.log_reader.TorInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.dnscrypt.DNSCryptLogParser;
import pan.alexander.tordnscrypt.domain.log_reader.dnscrypt.DNSCryptLogParser_MembersInjector;
import pan.alexander.tordnscrypt.domain.log_reader.tor.TorLogParser;
import pan.alexander.tordnscrypt.domain.log_reader.tor.TorLogParser_MembersInjector;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.domain.tor_ips.TorIpsInteractorImpl;
import pan.alexander.tordnscrypt.help.HelpActivity;
import pan.alexander.tordnscrypt.help.HelpActivityReceiver;
import pan.alexander.tordnscrypt.help.HelpActivityReceiver_MembersInjector;
import pan.alexander.tordnscrypt.help.HelpActivity_MembersInjector;
import pan.alexander.tordnscrypt.installer.Installer;
import pan.alexander.tordnscrypt.installer.InstallerHelper;
import pan.alexander.tordnscrypt.installer.Installer_MembersInjector;
import pan.alexander.tordnscrypt.iptables.IptablesFirewall;
import pan.alexander.tordnscrypt.iptables.IptablesReceiver;
import pan.alexander.tordnscrypt.iptables.IptablesReceiver_MembersInjector;
import pan.alexander.tordnscrypt.iptables.KillSwitchNotification;
import pan.alexander.tordnscrypt.iptables.ModulesIptablesRules;
import pan.alexander.tordnscrypt.iptables.ModulesIptablesRules_MembersInjector;
import pan.alexander.tordnscrypt.iptables.Tethering;
import pan.alexander.tordnscrypt.iptables.Tethering_MembersInjector;
import pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentPresenter;
import pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentPresenter_MembersInjector;
import pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentReceiver;
import pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentReceiver_MembersInjector;
import pan.alexander.tordnscrypt.main_fragment.MainFragment;
import pan.alexander.tordnscrypt.main_fragment.MainFragment_MembersInjector;
import pan.alexander.tordnscrypt.modules.ContextUIDUpdater;
import pan.alexander.tordnscrypt.modules.ContextUIDUpdater_MembersInjector;
import pan.alexander.tordnscrypt.modules.ModulesKiller;
import pan.alexander.tordnscrypt.modules.ModulesKiller_MembersInjector;
import pan.alexander.tordnscrypt.modules.ModulesReceiver;
import pan.alexander.tordnscrypt.modules.ModulesService;
import pan.alexander.tordnscrypt.modules.ModulesService_MembersInjector;
import pan.alexander.tordnscrypt.modules.ModulesStarterHelper;
import pan.alexander.tordnscrypt.modules.ModulesStarterHelper_MembersInjector;
import pan.alexander.tordnscrypt.modules.ModulesStateLoop;
import pan.alexander.tordnscrypt.modules.ModulesStateLoop_MembersInjector;
import pan.alexander.tordnscrypt.modules.ModulesStatusBroadcaster;
import pan.alexander.tordnscrypt.modules.ModulesVersions;
import pan.alexander.tordnscrypt.modules.ModulesVersions_Factory;
import pan.alexander.tordnscrypt.modules.TorRestarterReconnector;
import pan.alexander.tordnscrypt.modules.UsageStatistic;
import pan.alexander.tordnscrypt.modules.UsageStatistic_MembersInjector;
import pan.alexander.tordnscrypt.nflog.NflogManager;
import pan.alexander.tordnscrypt.nflog.NflogParser;
import pan.alexander.tordnscrypt.nflog.NflogSessionsHolder;
import pan.alexander.tordnscrypt.proxy.ProxyFragment;
import pan.alexander.tordnscrypt.proxy.ProxyFragment_MembersInjector;
import pan.alexander.tordnscrypt.proxy.ProxyHelper;
import pan.alexander.tordnscrypt.settings.ConfigEditorFragment;
import pan.alexander.tordnscrypt.settings.ConfigEditorFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.settings.PathVars_Factory;
import pan.alexander.tordnscrypt.settings.PreferencesCommonFragment;
import pan.alexander.tordnscrypt.settings.PreferencesCommonFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.PreferencesFastFragment;
import pan.alexander.tordnscrypt.settings.PreferencesFastFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.SettingsActivity;
import pan.alexander.tordnscrypt.settings.SettingsActivity_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_relays.DnsRelayViewModel;
import pan.alexander.tordnscrypt.settings.dnscrypt_relays.PreferencesDNSCryptRelays;
import pan.alexander.tordnscrypt.settings.dnscrypt_relays.PreferencesDNSCryptRelays_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesFragment;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesViewModel;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingDnsRulesWorker;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingDnsRulesWorker_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalDnsRulesWorker;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalDnsRulesWorker_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.receiver.DnsRulesReceiver;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.DownloadRemoteRulesManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteDnsRulesWorker;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteDnsRulesWorker_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_servers.DnsServerViewModel;
import pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers;
import pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment;
import pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.dnscrypt_settings.RulesEraser;
import pan.alexander.tordnscrypt.settings.firewall.FirewallFragment;
import pan.alexander.tordnscrypt.settings.firewall.FirewallFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.firewall.FirewallViewModel;
import pan.alexander.tordnscrypt.settings.itpd_settings.ITPDSubscriptionsFragment;
import pan.alexander.tordnscrypt.settings.itpd_settings.ITPDSubscriptionsFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.itpd_settings.ItpdSubscriptionsViewModel;
import pan.alexander.tordnscrypt.settings.itpd_settings.PreferencesITPDFragment;
import pan.alexander.tordnscrypt.settings.itpd_settings.PreferencesITPDFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment;
import pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.tor_bridges.BridgeAdapter;
import pan.alexander.tordnscrypt.settings.tor_bridges.BridgeChecker;
import pan.alexander.tordnscrypt.settings.tor_bridges.BridgePingHelper;
import pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges;
import pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridgesViewModel;
import pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridges_MembersInjector;
import pan.alexander.tordnscrypt.settings.tor_bridges.SnowflakeConfigurator;
import pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment;
import pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment_MembersInjector;
import pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsViewModel;
import pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment;
import pan.alexander.tordnscrypt.settings.tor_preferences.PreferencesTorFragment_MembersInjector;
import pan.alexander.tordnscrypt.tiles.BaseTileService;
import pan.alexander.tordnscrypt.tiles.BaseTileService_MembersInjector;
import pan.alexander.tordnscrypt.tiles.ChangeTorIpTileManager;
import pan.alexander.tordnscrypt.tiles.ChangeTorIpTileService;
import pan.alexander.tordnscrypt.tiles.ChangeTorIpTileService_MembersInjector;
import pan.alexander.tordnscrypt.tiles.DNSCryptTileService;
import pan.alexander.tordnscrypt.tiles.DNSCryptTileService_MembersInjector;
import pan.alexander.tordnscrypt.tiles.ITPDTileService;
import pan.alexander.tordnscrypt.tiles.ITPDTileService_MembersInjector;
import pan.alexander.tordnscrypt.tiles.ModulesControlTileManager;
import pan.alexander.tordnscrypt.tiles.TilesLimiter;
import pan.alexander.tordnscrypt.tiles.TorTileService;
import pan.alexander.tordnscrypt.tiles.TorTileService_MembersInjector;
import pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter;
import pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter_MembersInjector;
import pan.alexander.tordnscrypt.tor_fragment.TorFragmentReceiver;
import pan.alexander.tordnscrypt.tor_fragment.TorFragmentReceiver_MembersInjector;
import pan.alexander.tordnscrypt.update.DownloadTask;
import pan.alexander.tordnscrypt.update.DownloadTask_MembersInjector;
import pan.alexander.tordnscrypt.update.UpdateCheck;
import pan.alexander.tordnscrypt.update.UpdateCheck_MembersInjector;
import pan.alexander.tordnscrypt.update.UpdateService;
import pan.alexander.tordnscrypt.update.UpdateService_MembersInjector;
import pan.alexander.tordnscrypt.utils.ap.ApManager;
import pan.alexander.tordnscrypt.utils.ap.InternetSharingChecker;
import pan.alexander.tordnscrypt.utils.apps.InstalledAppNamesStorage;
import pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager;
import pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager_MembersInjector;
import pan.alexander.tordnscrypt.utils.bootcomplete.BootCompleteManager;
import pan.alexander.tordnscrypt.utils.connectionchecker.HttpInternetChecker;
import pan.alexander.tordnscrypt.utils.connectionchecker.SocketInternetChecker;
import pan.alexander.tordnscrypt.utils.connectivitycheck.ConnectivityCheckManager;
import pan.alexander.tordnscrypt.utils.dns.DohResolver;
import pan.alexander.tordnscrypt.utils.dns.UdpResolver;
import pan.alexander.tordnscrypt.utils.executors.CachedExecutor;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.filemanager.FileManager;
import pan.alexander.tordnscrypt.utils.filemanager.FileManager_MembersInjector;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;
import pan.alexander.tordnscrypt.utils.mode.AppModeManager;
import pan.alexander.tordnscrypt.utils.notification.NotificationPermissionManager;
import pan.alexander.tordnscrypt.utils.parsers.DnsCryptConfigurationParser;
import pan.alexander.tordnscrypt.utils.parsers.DnsCryptSDNSParser;
import pan.alexander.tordnscrypt.utils.parsers.TorProjectBridgesParser;
import pan.alexander.tordnscrypt.utils.portchecker.PortChecker;
import pan.alexander.tordnscrypt.utils.preferences.AppPreferenceHelperImpl;
import pan.alexander.tordnscrypt.utils.resources.ResourceManagerImpl;
import pan.alexander.tordnscrypt.utils.root.RootExecService;
import pan.alexander.tordnscrypt.utils.root.RootExecService_MembersInjector;
import pan.alexander.tordnscrypt.utils.root.RootExecutor;
import pan.alexander.tordnscrypt.utils.session.AppSessionStore;
import pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager;
import pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork;
import pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork_MembersInjector;
import pan.alexander.tordnscrypt.utils.workers.UpdateIPsManager;
import pan.alexander.tordnscrypt.vpn.service.ServiceVPN;
import pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler;
import pan.alexander.tordnscrypt.vpn.service.ServiceVPNHandler_MembersInjector;
import pan.alexander.tordnscrypt.vpn.service.ServiceVPN_MembersInjector;
import pan.alexander.tordnscrypt.vpn.service.VpnBuilder;
import pan.alexander.tordnscrypt.vpn.service.VpnPreferenceHolder;
import pan.alexander.tordnscrypt.vpn.service.VpnRulesHolder;

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
public final class DaggerAppComponent {
  private DaggerAppComponent() {
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements AppComponent.Builder {
    private Context appContext;

    @Override
    public Builder appContext(Context context) {
      this.appContext = Preconditions.checkNotNull(context);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(appContext, Context.class);
      return new AppComponentImpl(new SharedPreferencesModule(), new CoroutinesModule(), new HandlerModule(), appContext);
    }
  }

  private static final class TilesSubcomponentFactory implements TilesSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private TilesSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public TilesSubcomponent create() {
      return new TilesSubcomponentImpl(appComponentImpl);
    }
  }

  private static final class ArpSubcomponentFactory implements ArpSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ArpSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ArpSubcomponent create() {
      return new ArpSubcomponentImpl(appComponentImpl);
    }
  }

  private static final class ModulesServiceSubcomponentFactory implements ModulesServiceSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private ModulesServiceSubcomponentFactory(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;
    }

    @Override
    public ModulesServiceSubcomponent create() {
      return new ModulesServiceSubcomponentImpl(appComponentImpl);
    }
  }

  private static final class LogReaderSubcomponentFactory implements LogReaderSubcomponent.Factory {
    private final AppComponentImpl appComponentImpl;

    private final ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl;

    private LogReaderSubcomponentFactory(AppComponentImpl appComponentImpl,
        ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl) {
      this.appComponentImpl = appComponentImpl;
      this.modulesServiceSubcomponentImpl = modulesServiceSubcomponentImpl;
    }

    @Override
    public LogReaderSubcomponent create(Context context) {
      Preconditions.checkNotNull(context);
      return new LogReaderSubcomponentImpl(appComponentImpl, modulesServiceSubcomponentImpl, context);
    }
  }

  private static final class TilesSubcomponentImpl implements TilesSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final TilesSubcomponentImpl tilesSubcomponentImpl = this;

    private Provider<TilesLimiter> tilesLimiterProvider;

    private Provider<ModulesControlTileManager> modulesControlTileManagerProvider;

    private Provider<ChangeTorIpTileManager> changeTorIpTileManagerProvider;

    private TilesSubcomponentImpl(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;

      initialize();

    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.tilesLimiterProvider = DoubleCheck.provider(new SwitchingProvider<TilesLimiter>(appComponentImpl, tilesSubcomponentImpl, 0));
      this.modulesControlTileManagerProvider = new SwitchingProvider<>(appComponentImpl, tilesSubcomponentImpl, 1);
      this.changeTorIpTileManagerProvider = new SwitchingProvider<>(appComponentImpl, tilesSubcomponentImpl, 2);
    }

    @Override
    public void inject(BaseTileService service) {
      injectBaseTileService(service);
    }

    @Override
    public void inject(TorTileService service) {
      injectTorTileService(service);
    }

    @Override
    public void inject(ChangeTorIpTileService service) {
      injectChangeTorIpTileService(service);
    }

    @Override
    public void inject(DNSCryptTileService service) {
      injectDNSCryptTileService(service);
    }

    @Override
    public void inject(ITPDTileService service) {
      injectITPDTileService(service);
    }

    private BaseTileService injectBaseTileService(BaseTileService instance) {
      BaseTileService_MembersInjector.injectTilesLimiter(instance, tilesLimiterProvider.get());
      return instance;
    }

    private TorTileService injectTorTileService(TorTileService instance2) {
      BaseTileService_MembersInjector.injectTilesLimiter(instance2, tilesLimiterProvider.get());
      TorTileService_MembersInjector.injectTileManager(instance2, DoubleCheck.lazy(modulesControlTileManagerProvider));
      return instance2;
    }

    private ChangeTorIpTileService injectChangeTorIpTileService(ChangeTorIpTileService instance3) {
      BaseTileService_MembersInjector.injectTilesLimiter(instance3, tilesLimiterProvider.get());
      ChangeTorIpTileService_MembersInjector.injectTileManager(instance3, DoubleCheck.lazy(changeTorIpTileManagerProvider));
      return instance3;
    }

    private DNSCryptTileService injectDNSCryptTileService(DNSCryptTileService instance4) {
      BaseTileService_MembersInjector.injectTilesLimiter(instance4, tilesLimiterProvider.get());
      DNSCryptTileService_MembersInjector.injectTileManager(instance4, DoubleCheck.lazy(modulesControlTileManagerProvider));
      return instance4;
    }

    private ITPDTileService injectITPDTileService(ITPDTileService instance5) {
      BaseTileService_MembersInjector.injectTilesLimiter(instance5, tilesLimiterProvider.get());
      ITPDTileService_MembersInjector.injectTileManager(instance5, DoubleCheck.lazy(modulesControlTileManagerProvider));
      return instance5;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final AppComponentImpl appComponentImpl;

      private final TilesSubcomponentImpl tilesSubcomponentImpl;

      private final int id;

      SwitchingProvider(AppComponentImpl appComponentImpl,
          TilesSubcomponentImpl tilesSubcomponentImpl, int id) {
        this.appComponentImpl = appComponentImpl;
        this.tilesSubcomponentImpl = tilesSubcomponentImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // pan.alexander.tordnscrypt.tiles.TilesLimiter 
          return (T) new TilesLimiter(DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)), DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider), DoubleCheck.lazy(appComponentImpl.pathVarsProvider));

          case 1: // pan.alexander.tordnscrypt.tiles.ModulesControlTileManager 
          return (T) new ModulesControlTileManager(CoroutinesModule_ProvideDispatcherMainFactory.provideDispatcherMain(appComponentImpl.coroutinesModule), appComponentImpl.namedCoroutineScope2(), CoroutinesModule_ProvideCoroutineExceptionHandlerFactory.provideCoroutineExceptionHandler(appComponentImpl.coroutinesModule), appComponentImpl.appContext, (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.provideDefaultSharedPreferencesProvider.get(), appComponentImpl.provideMainHandlerProvider.get(), appComponentImpl.pathVarsProvider.get(), DoubleCheck.lazy(appComponentImpl.updateIPsManagerProvider));

          case 2: // pan.alexander.tordnscrypt.tiles.ChangeTorIpTileManager 
          return (T) new ChangeTorIpTileManager(CoroutinesModule_ProvideDispatcherMainFactory.provideDispatcherMain(appComponentImpl.coroutinesModule), appComponentImpl.namedCoroutineScope2(), CoroutinesModule_ProvideCoroutineExceptionHandlerFactory.provideCoroutineExceptionHandler(appComponentImpl.coroutinesModule), appComponentImpl.appContext);

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ArpSubcomponentImpl implements ArpSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final ArpSubcomponentImpl arpSubcomponentImpl = this;

    private Provider<ArpRelatedUiUpdater> arpRelatedUiUpdaterProvider;

    private Provider<CommandExecutor> commandExecutorProvider;

    private Provider<ConnectionManager> connectionManagerProvider;

    private Provider<ArpScannerHelper> arpScannerHelperProvider;

    private Provider<DefaultGatewayManager> defaultGatewayManagerProvider;

    private Provider<ArpTableManager> arpTableManagerProvider;

    private Provider<ArpScannerLoop> arpScannerLoopProvider;

    private Provider<ArpScanner> arpScannerProvider;

    private ArpSubcomponentImpl(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;

      initialize();

    }

    private ArpWarningNotification arpWarningNotification() {
      return new ArpWarningNotification(appComponentImpl.appContext);
    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.arpRelatedUiUpdaterProvider = DoubleCheck.provider(new SwitchingProvider<ArpRelatedUiUpdater>(appComponentImpl, arpSubcomponentImpl, 2));
      this.commandExecutorProvider = DoubleCheck.provider(new SwitchingProvider<CommandExecutor>(appComponentImpl, arpSubcomponentImpl, 4));
      this.connectionManagerProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionManager>(appComponentImpl, arpSubcomponentImpl, 7));
      this.arpScannerHelperProvider = new DelegateFactory<>();
      this.defaultGatewayManagerProvider = DoubleCheck.provider(new SwitchingProvider<DefaultGatewayManager>(appComponentImpl, arpSubcomponentImpl, 6));
      this.arpTableManagerProvider = new DelegateFactory<>();
      this.arpScannerLoopProvider = new DelegateFactory<>();
      DelegateFactory.setDelegate(arpScannerHelperProvider, DoubleCheck.provider(new SwitchingProvider<ArpScannerHelper>(appComponentImpl, arpSubcomponentImpl, 5)));
      DelegateFactory.setDelegate(arpTableManagerProvider, DoubleCheck.provider(new SwitchingProvider<ArpTableManager>(appComponentImpl, arpSubcomponentImpl, 3)));
      DelegateFactory.setDelegate(arpScannerLoopProvider, DoubleCheck.provider(new SwitchingProvider<ArpScannerLoop>(appComponentImpl, arpSubcomponentImpl, 1)));
      this.arpScannerProvider = DoubleCheck.provider(new SwitchingProvider<ArpScanner>(appComponentImpl, arpSubcomponentImpl, 0));
    }

    @Override
    public ArpScanner get() {
      return arpScannerProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final AppComponentImpl appComponentImpl;

      private final ArpSubcomponentImpl arpSubcomponentImpl;

      private final int id;

      SwitchingProvider(AppComponentImpl appComponentImpl, ArpSubcomponentImpl arpSubcomponentImpl,
          int id) {
        this.appComponentImpl = appComponentImpl;
        this.arpSubcomponentImpl = arpSubcomponentImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // pan.alexander.tordnscrypt.arp.ArpScanner 
          return (T) new ArpScanner(DoubleCheck.lazy(arpSubcomponentImpl.arpScannerLoopProvider), DoubleCheck.lazy(arpSubcomponentImpl.arpScannerHelperProvider), DoubleCheck.lazy(arpSubcomponentImpl.arpRelatedUiUpdaterProvider), DoubleCheck.lazy(arpSubcomponentImpl.connectionManagerProvider));

          case 1: // pan.alexander.tordnscrypt.arp.ArpScannerLoop 
          return (T) new ArpScannerLoop(arpSubcomponentImpl.arpWarningNotification(), arpSubcomponentImpl.arpRelatedUiUpdaterProvider.get(), arpSubcomponentImpl.arpTableManagerProvider.get(), arpSubcomponentImpl.connectionManagerProvider.get(), arpSubcomponentImpl.arpScannerHelperProvider.get(), arpSubcomponentImpl.defaultGatewayManagerProvider.get(), arpSubcomponentImpl.commandExecutorProvider.get());

          case 2: // pan.alexander.tordnscrypt.arp.ArpRelatedUiUpdater 
          return (T) new ArpRelatedUiUpdater(appComponentImpl.appContext, appComponentImpl.provideMainHandlerProvider.get());

          case 3: // pan.alexander.tordnscrypt.arp.ArpTableManager 
          return (T) new ArpTableManager(DoubleCheck.lazy(arpSubcomponentImpl.commandExecutorProvider), DoubleCheck.lazy(arpSubcomponentImpl.arpScannerHelperProvider));

          case 4: // pan.alexander.tordnscrypt.arp.CommandExecutor 
          return (T) new CommandExecutor();

          case 5: // pan.alexander.tordnscrypt.arp.ArpScannerHelper 
          return (T) new ArpScannerHelper(appComponentImpl.appContext, appComponentImpl.provideDefaultSharedPreferencesProvider.get(), (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.coroutineExecutorProvider.get(), DoubleCheck.lazy(arpSubcomponentImpl.defaultGatewayManagerProvider), DoubleCheck.lazy(arpSubcomponentImpl.arpTableManagerProvider), DoubleCheck.lazy(arpSubcomponentImpl.arpScannerLoopProvider), DoubleCheck.lazy(arpSubcomponentImpl.arpRelatedUiUpdaterProvider));

          case 6: // pan.alexander.tordnscrypt.arp.DefaultGatewayManager 
          return (T) new DefaultGatewayManager(appComponentImpl.appContext, arpSubcomponentImpl.connectionManagerProvider.get(), arpSubcomponentImpl.commandExecutorProvider.get(), arpSubcomponentImpl.arpScannerHelperProvider.get());

          case 7: // pan.alexander.tordnscrypt.arp.ConnectionManager 
          return (T) new ConnectionManager(appComponentImpl.appContext);

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class LogReaderSubcomponentImpl implements LogReaderSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl;

    private final LogReaderSubcomponentImpl logReaderSubcomponentImpl = this;

    private Provider<ConnectionRecordsConverter> connectionRecordsConverterProvider;

    private Provider<ConnectionRecordsInteractor> connectionRecordsInteractorProvider;

    private Provider<LogReaderInteractors> logReaderInteractorsProvider;

    private Provider<FakeSniInputDialogFragment> fakeSniInputDialogFragmentProvider;

    private LogReaderSubcomponentImpl(AppComponentImpl appComponentImpl,
        ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl, Context contextParam) {
      this.appComponentImpl = appComponentImpl;
      this.modulesServiceSubcomponentImpl = modulesServiceSubcomponentImpl;

      initialize(contextParam);

    }

    private ModulesLogRepositoryImpl modulesLogRepositoryImpl() {
      return new ModulesLogRepositoryImpl(appComponentImpl.appContext, appComponentImpl.pathVarsProvider.get());
    }

    private ConnectionRecordsGetter connectionRecordsGetter() {
      return new ConnectionRecordsGetter(appComponentImpl.appContext);
    }

    private NflogRecordsGetter nflogRecordsGetter() {
      return new NflogRecordsGetter(modulesServiceSubcomponentImpl.nflogManagerProvider.get());
    }

    private ConnectionRecordsRepositoryImpl connectionRecordsRepositoryImpl() {
      return new ConnectionRecordsRepositoryImpl(connectionRecordsGetter(), nflogRecordsGetter());
    }

    private ConnectionRecordsParser connectionRecordsParser() {
      return new ConnectionRecordsParser(appComponentImpl.appContext, DoubleCheck.lazy(appComponentImpl.installedAppNamesStorageProvider), appComponentImpl.provideDefaultSharedPreferencesProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final Context contextParam) {
      this.connectionRecordsConverterProvider = new SwitchingProvider<>(appComponentImpl, modulesServiceSubcomponentImpl, logReaderSubcomponentImpl, 2);
      this.connectionRecordsInteractorProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionRecordsInteractor>(appComponentImpl, modulesServiceSubcomponentImpl, logReaderSubcomponentImpl, 1));
      this.logReaderInteractorsProvider = DoubleCheck.provider(new SwitchingProvider<LogReaderInteractors>(appComponentImpl, modulesServiceSubcomponentImpl, logReaderSubcomponentImpl, 0));
      this.fakeSniInputDialogFragmentProvider = new SwitchingProvider<>(appComponentImpl, modulesServiceSubcomponentImpl, logReaderSubcomponentImpl, 3);
    }

    @Override
    public void inject(DNSCryptFragmentPresenter presenter) {
      injectDNSCryptFragmentPresenter(presenter);
    }

    @Override
    public void inject(TorFragmentPresenter presenter) {
      injectTorFragmentPresenter(presenter);
    }

    @Override
    public void inject(ITPDFragmentPresenter presenter) {
      injectITPDFragmentPresenter(presenter);
    }

    @Override
    public void inject(ModulesStateLoop modulesStateLoop) {
      injectModulesStateLoop(modulesStateLoop);
    }

    @Override
    public void inject(PreferencesFastFragment fragment) {
      injectPreferencesFastFragment(fragment);
    }

    private DNSCryptFragmentPresenter injectDNSCryptFragmentPresenter(
        DNSCryptFragmentPresenter instance) {
      DNSCryptFragmentPresenter_MembersInjector.injectPreferenceRepository(instance, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      DNSCryptFragmentPresenter_MembersInjector.injectDnsCryptInteractor(instance, DoubleCheck.lazy(((Provider) logReaderInteractorsProvider)));
      DNSCryptFragmentPresenter_MembersInjector.injectConnectionRecordsInteractor(instance, DoubleCheck.lazy(((Provider) logReaderInteractorsProvider)));
      DNSCryptFragmentPresenter_MembersInjector.injectDefaultPreferences(instance, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
      return instance;
    }

    private TorFragmentPresenter injectTorFragmentPresenter(TorFragmentPresenter instance2) {
      TorFragmentPresenter_MembersInjector.injectCheckConnectionInteractor(instance2, DoubleCheck.lazy(appComponentImpl.connectionCheckerInteractorImplProvider));
      TorFragmentPresenter_MembersInjector.injectDefaultPreferences(instance2, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
      TorFragmentPresenter_MembersInjector.injectPreferenceRepository(instance2, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      TorFragmentPresenter_MembersInjector.injectTorInteractor(instance2, DoubleCheck.lazy(((Provider) logReaderInteractorsProvider)));
      TorFragmentPresenter_MembersInjector.injectConnectionRecordsInteractor(instance2, DoubleCheck.lazy(((Provider) logReaderInteractorsProvider)));
      TorFragmentPresenter_MembersInjector.injectExecutor(instance2, appComponentImpl.coroutineExecutorProvider.get());
      TorFragmentPresenter_MembersInjector.injectVerifierLazy(instance2, DoubleCheck.lazy(appComponentImpl.verifierProvider));
      TorFragmentPresenter_MembersInjector.injectPathVars(instance2, DoubleCheck.lazy(appComponentImpl.pathVarsProvider));
      TorFragmentPresenter_MembersInjector.injectUpdateIPsManager(instance2, DoubleCheck.lazy(appComponentImpl.updateIPsManagerProvider));
      return instance2;
    }

    private ITPDFragmentPresenter injectITPDFragmentPresenter(ITPDFragmentPresenter instance3) {
      ITPDFragmentPresenter_MembersInjector.injectPreferenceRepository(instance3, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      ITPDFragmentPresenter_MembersInjector.injectPathVars(instance3, DoubleCheck.lazy(appComponentImpl.pathVarsProvider));
      ITPDFragmentPresenter_MembersInjector.injectItpdInteractor(instance3, DoubleCheck.lazy(((Provider) logReaderInteractorsProvider)));
      ITPDFragmentPresenter_MembersInjector.injectExecutor(instance3, appComponentImpl.coroutineExecutorProvider.get());
      return instance3;
    }

    private ModulesStateLoop injectModulesStateLoop(ModulesStateLoop instance4) {
      ModulesStateLoop_MembersInjector.injectDnsCryptInteractor(instance4, (DNSCryptInteractorInterface) ((Provider) logReaderInteractorsProvider).get());
      ModulesStateLoop_MembersInjector.injectTorInteractor(instance4, (TorInteractorInterface) ((Provider) logReaderInteractorsProvider).get());
      ModulesStateLoop_MembersInjector.injectItpdInteractor(instance4, (ITPDInteractorInterface) ((Provider) logReaderInteractorsProvider).get());
      ModulesStateLoop_MembersInjector.injectPreferenceRepository(instance4, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      ModulesStateLoop_MembersInjector.injectDefaultPreferences(instance4, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
      ModulesStateLoop_MembersInjector.injectHandler(instance4, DoubleCheck.lazy(appComponentImpl.provideMainHandlerProvider));
      ModulesStateLoop_MembersInjector.injectPathVars(instance4, DoubleCheck.lazy(appComponentImpl.pathVarsProvider));
      ModulesStateLoop_MembersInjector.injectNflogManager(instance4, DoubleCheck.lazy(modulesServiceSubcomponentImpl.nflogManagerProvider));
      ModulesStateLoop_MembersInjector.injectConnectivityCheckManager(instance4, DoubleCheck.lazy(modulesServiceSubcomponentImpl.connectivityCheckManagerProvider));
      ModulesStateLoop_MembersInjector.injectModulesStatusBroadcaster(instance4, DoubleCheck.lazy(appComponentImpl.modulesStatusBroadcasterProvider));
      ModulesStateLoop_MembersInjector.injectUpdateIPsManager(instance4, DoubleCheck.lazy(appComponentImpl.updateIPsManagerProvider));
      ModulesStateLoop_MembersInjector.injectModulesVersions(instance4, DoubleCheck.lazy(appComponentImpl.modulesVersionsProvider));
      return instance4;
    }

    private PreferencesFastFragment injectPreferencesFastFragment(
        PreferencesFastFragment instance5) {
      PreferencesFastFragment_MembersInjector.injectPreferenceRepository(instance5, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      PreferencesFastFragment_MembersInjector.injectDefaultPreferences(instance5, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
      PreferencesFastFragment_MembersInjector.injectHandler(instance5, DoubleCheck.lazy(appComponentImpl.provideMainHandlerProvider));
      PreferencesFastFragment_MembersInjector.injectNflogManager(instance5, DoubleCheck.lazy(modulesServiceSubcomponentImpl.nflogManagerProvider));
      PreferencesFastFragment_MembersInjector.injectConnectionRecordsInteractor(instance5, DoubleCheck.lazy(((Provider) logReaderInteractorsProvider)));
      PreferencesFastFragment_MembersInjector.injectPathVars(instance5, DoubleCheck.lazy(appComponentImpl.pathVarsProvider));
      PreferencesFastFragment_MembersInjector.injectFakeSniInputDialogFragment(instance5, DoubleCheck.lazy(fakeSniInputDialogFragmentProvider));
      PreferencesFastFragment_MembersInjector.injectUpdateIPsManager(instance5, DoubleCheck.lazy(appComponentImpl.updateIPsManagerProvider));
      PreferencesFastFragment_MembersInjector.injectExecutor(instance5, appComponentImpl.coroutineExecutorProvider.get());
      return instance5;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final AppComponentImpl appComponentImpl;

      private final ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl;

      private final LogReaderSubcomponentImpl logReaderSubcomponentImpl;

      private final int id;

      SwitchingProvider(AppComponentImpl appComponentImpl,
          ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl,
          LogReaderSubcomponentImpl logReaderSubcomponentImpl, int id) {
        this.appComponentImpl = appComponentImpl;
        this.modulesServiceSubcomponentImpl = modulesServiceSubcomponentImpl;
        this.logReaderSubcomponentImpl = logReaderSubcomponentImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // pan.alexander.tordnscrypt.domain.log_reader.LogReaderInteractors 
          return (T) new LogReaderInteractors(logReaderSubcomponentImpl.modulesLogRepositoryImpl(), logReaderSubcomponentImpl.connectionRecordsInteractorProvider.get());

          case 1: // pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsInteractor 
          return (T) new ConnectionRecordsInteractor(logReaderSubcomponentImpl.connectionRecordsRepositoryImpl(), DoubleCheck.lazy(logReaderSubcomponentImpl.connectionRecordsConverterProvider), logReaderSubcomponentImpl.connectionRecordsParser(), DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));

          case 2: // pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsConverter 
          return (T) new ConnectionRecordsConverter(appComponentImpl.appContext, (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), DoubleCheck.lazy(((Provider) appComponentImpl.dnsInteractorImplProvider)), appComponentImpl.coroutineExecutorProvider.get(), modulesServiceSubcomponentImpl.connectivityCheckManagerProvider.get(), DoubleCheck.lazy(modulesServiceSubcomponentImpl.iptablesFirewallProvider));

          case 3: // pan.alexander.tordnscrypt.dialogs.FakeSniInputDialogFragment 
          return (T) new FakeSniInputDialogFragment();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ModulesServiceSubcomponentImpl implements ModulesServiceSubcomponent {
    private final AppComponentImpl appComponentImpl;

    private final ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl = this;

    private Provider<VpnPreferenceHolder> vpnPreferenceHolderProvider;

    private Provider<ConnectivityCheckManager> connectivityCheckManagerProvider;

    private Provider<VpnRulesHolder> vpnRulesHolderProvider;

    private Provider<IptablesFirewall> iptablesFirewallProvider;

    private Provider<KillSwitchNotification> killSwitchNotificationProvider;

    private Provider<NflogManager> nflogManagerProvider;

    private ModulesServiceSubcomponentImpl(AppComponentImpl appComponentImpl) {
      this.appComponentImpl = appComponentImpl;

      initialize();

    }

    private NflogParser nflogParser() {
      return new NflogParser(new NflogSessionsHolder(), DoubleCheck.lazy(appComponentImpl.pathVarsProvider));
    }

    private AppModeManager appModeManager() {
      return new AppModeManager(appComponentImpl.appContext, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)), DoubleCheck.lazy(nflogManagerProvider), DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
    }

    @SuppressWarnings("unchecked")
    private void initialize() {
      this.vpnPreferenceHolderProvider = new SwitchingProvider<>(appComponentImpl, modulesServiceSubcomponentImpl, 0);
      this.connectivityCheckManagerProvider = DoubleCheck.provider(new SwitchingProvider<ConnectivityCheckManager>(appComponentImpl, modulesServiceSubcomponentImpl, 2));
      this.vpnRulesHolderProvider = new SwitchingProvider<>(appComponentImpl, modulesServiceSubcomponentImpl, 1);
      this.iptablesFirewallProvider = new SwitchingProvider<>(appComponentImpl, modulesServiceSubcomponentImpl, 3);
      this.killSwitchNotificationProvider = new SwitchingProvider<>(appComponentImpl, modulesServiceSubcomponentImpl, 4);
      this.nflogManagerProvider = DoubleCheck.provider(new SwitchingProvider<NflogManager>(appComponentImpl, modulesServiceSubcomponentImpl, 5));
    }

    @Override
    public LogReaderSubcomponent.Factory logReaderSubcomponent() {
      return new LogReaderSubcomponentFactory(appComponentImpl, modulesServiceSubcomponentImpl);
    }

    @Override
    public void inject(ServiceVPN service) {
      injectServiceVPN(service);
    }

    @Override
    public void inject(ModulesIptablesRules modulesIptablesRules) {
      injectModulesIptablesRules(modulesIptablesRules);
    }

    @Override
    public void inject(ChangeModeDialog changeModeDialog) {
      injectChangeModeDialog(changeModeDialog);
    }

    private ServiceVPN injectServiceVPN(ServiceVPN instance) {
      ServiceVPN_MembersInjector.injectPreferenceRepository(instance, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      ServiceVPN_MembersInjector.injectDefaultPreferences(instance, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
      ServiceVPN_MembersInjector.injectPathVars(instance, DoubleCheck.lazy(appComponentImpl.pathVarsProvider));
      ServiceVPN_MembersInjector.injectConnectionCheckerInteractor(instance, DoubleCheck.lazy(((Provider) appComponentImpl.connectionCheckerInteractorImplProvider)));
      ServiceVPN_MembersInjector.injectHandler(instance, DoubleCheck.lazy(appComponentImpl.provideMainHandlerProvider));
      ServiceVPN_MembersInjector.injectExecutor(instance, DoubleCheck.lazy(appComponentImpl.coroutineExecutorProvider));
      ServiceVPN_MembersInjector.injectVpnPreferenceHolder(instance, vpnPreferenceHolderProvider);
      ServiceVPN_MembersInjector.injectVpnRulesHolder(instance, DoubleCheck.lazy(vpnRulesHolderProvider));
      return instance;
    }

    private ModulesIptablesRules injectModulesIptablesRules(ModulesIptablesRules instance2) {
      ModulesIptablesRules_MembersInjector.injectPreferenceRepository(instance2, DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));
      ModulesIptablesRules_MembersInjector.injectDefaultPreferences(instance2, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));
      ModulesIptablesRules_MembersInjector.injectHandler(instance2, DoubleCheck.lazy(appComponentImpl.provideMainHandlerProvider));
      ModulesIptablesRules_MembersInjector.injectIptablesFirewall(instance2, DoubleCheck.lazy(iptablesFirewallProvider));
      ModulesIptablesRules_MembersInjector.injectKillSwitchNotification(instance2, DoubleCheck.lazy(killSwitchNotificationProvider));
      return instance2;
    }

    private ChangeModeDialog injectChangeModeDialog(ChangeModeDialog instance3) {
      ChangeModeDialog_MembersInjector.injectAppModeManager(instance3, appModeManager());
      return instance3;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final AppComponentImpl appComponentImpl;

      private final ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl;

      private final int id;

      SwitchingProvider(AppComponentImpl appComponentImpl,
          ModulesServiceSubcomponentImpl modulesServiceSubcomponentImpl, int id) {
        this.appComponentImpl = appComponentImpl;
        this.modulesServiceSubcomponentImpl = modulesServiceSubcomponentImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // pan.alexander.tordnscrypt.vpn.service.VpnPreferenceHolder 
          return (T) new VpnPreferenceHolder(appComponentImpl.provideDefaultSharedPreferencesProvider.get(), (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.pathVarsProvider.get());

          case 1: // pan.alexander.tordnscrypt.vpn.service.VpnRulesHolder 
          return (T) new VpnRulesHolder(appComponentImpl.provideDefaultSharedPreferencesProvider.get(), (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.pathVarsProvider.get(), DoubleCheck.lazy(modulesServiceSubcomponentImpl.connectivityCheckManagerProvider), DoubleCheck.lazy(((Provider) appComponentImpl.connectionCheckerInteractorImplProvider)));

          case 2: // pan.alexander.tordnscrypt.utils.connectivitycheck.ConnectivityCheckManager 
          return (T) new ConnectivityCheckManager(appComponentImpl.pathVarsProvider.get(), (DnsInteractor) ((Provider) appComponentImpl.dnsInteractorImplProvider).get(), DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule));

          case 3: // pan.alexander.tordnscrypt.iptables.IptablesFirewall 
          return (T) new IptablesFirewall(appComponentImpl.appContext, (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.provideDefaultSharedPreferencesProvider.get(), appComponentImpl.pathVarsProvider.get(), DoubleCheck.lazy(modulesServiceSubcomponentImpl.connectivityCheckManagerProvider));

          case 4: // pan.alexander.tordnscrypt.iptables.KillSwitchNotification 
          return (T) new KillSwitchNotification(appComponentImpl.appContext);

          case 5: // pan.alexander.tordnscrypt.nflog.NflogManager 
          return (T) new NflogManager(DoubleCheck.lazy(appComponentImpl.pathVarsProvider), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule), modulesServiceSubcomponentImpl.nflogParser(), DoubleCheck.lazy(((Provider) appComponentImpl.connectionCheckerInteractorImplProvider)));

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class AppComponentImpl implements AppComponent {
    private final Context appContext;

    private final SharedPreferencesModule sharedPreferencesModule;

    private final CoroutinesModule coroutinesModule;

    private final HandlerModule handlerModule;

    private final AppComponentImpl appComponentImpl = this;

    private Provider<PathVars> pathVarsProvider;

    private Provider<SharedPreferences> provideAppSharedPreferencesProvider;

    private Provider<AppPreferenceHelperImpl> appPreferenceHelperImplProvider;

    private Provider<PreferenceDataSourceImpl> preferenceDataSourceImplProvider;

    private Provider<PreferenceRepositoryImpl> preferenceRepositoryImplProvider;

    private Provider<CachedExecutor> cachedExecutorProvider;

    private Provider<CoroutineScope> provideSupervisorIoDispatcherCoroutineScopeSingletonProvider;

    private Provider<CoroutineExecutor> coroutineExecutorProvider;

    private Provider<SharedPreferences> provideDefaultSharedPreferencesProvider;

    private Provider<Handler> provideMainHandlerProvider;

    private Provider<InternetSharingChecker> internetSharingCheckerProvider;

    private Provider<ApManager> apManagerProvider;

    private Provider<AccelerateDevelop> accelerateDevelopProvider;

    private Provider<Verifier> verifierProvider;

    private Provider<ModulesVersions> modulesVersionsProvider;

    private Provider<HttpInternetChecker> httpInternetCheckerProvider;

    private Provider<SocketInternetChecker> socketInternetCheckerProvider;

    private Provider<DnsDataSourceImpl.UdpResolverFactory> udpResolverFactoryProvider;

    private Provider<DnsDataSourceImpl.DohResolverFactory> dohResolverFactoryProvider;

    private Provider<ConnectionCheckerInteractorImpl> connectionCheckerInteractorImplProvider;

    private Provider<NotificationPermissionManager> notificationPermissionManagerProvider;

    private Provider<DnsInteractorImpl> dnsInteractorImplProvider;

    private Provider<ResourceRepositoryImpl> resourceRepositoryImplProvider;

    private Provider<UnlockTorIpsViewModel> unlockTorIpsViewModelProvider;

    private Provider<FirewallViewModel> firewallViewModelProvider;

    private Provider<HttpsConnectionManager> httpsConnectionManagerProvider;

    private Provider<AppSessionStore> appSessionStoreProvider;

    private Provider<PreferencesTorBridgesViewModel> preferencesTorBridgesViewModelProvider;

    private Provider<InstallerHelper> installerHelperProvider;

    private Provider<ResetModuleHelper> resetModuleHelperProvider;

    private Provider<TopFragmentViewModel> topFragmentViewModelProvider;

    private Provider<DnsServerViewModel> dnsServerViewModelProvider;

    private Provider<DnsRelayViewModel> dnsRelayViewModelProvider;

    private Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider;

    private Provider<UpdateRemoteRulesWorkManager> updateRemoteRulesWorkManagerProvider;

    private Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider;

    private Provider<DnsRulesViewModel> dnsRulesViewModelProvider;

    private Provider<ItpdSubscriptionsViewModel> itpdSubscriptionsViewModelProvider;

    private Provider<ViewModelFactory> viewModelFactoryProvider;

    private Provider<BridgeChecker> bridgeCheckerProvider;

    private Provider<SnowflakeConfigurator> snowflakeConfiguratorProvider;

    private Provider<ProxyHelper> proxyHelperProvider;

    private Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider;

    private Provider<RulesEraser> rulesEraserProvider;

    private Provider<DnsRulesReceiver> dnsRulesReceiverProvider;

    private Provider<TorRestarterReconnector> torRestarterReconnectorProvider;

    private Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider;

    private Provider<ModulesReceiver> modulesReceiverProvider;

    private Provider<PortChecker> portCheckerProvider;

    private Provider<UpdateIPsManager> updateIPsManagerProvider;

    private Provider<BootCompleteManager> bootCompleteManagerProvider;

    private Provider<VpnBuilder> vpnBuilderProvider;

    private AppComponentImpl(SharedPreferencesModule sharedPreferencesModuleParam,
        CoroutinesModule coroutinesModuleParam, HandlerModule handlerModuleParam,
        Context appContextParam) {
      this.appContext = appContextParam;
      this.sharedPreferencesModule = sharedPreferencesModuleParam;
      this.coroutinesModule = coroutinesModuleParam;
      this.handlerModule = handlerModuleParam;
      initialize(sharedPreferencesModuleParam, coroutinesModuleParam, handlerModuleParam, appContextParam);
      initialize2(sharedPreferencesModuleParam, coroutinesModuleParam, handlerModuleParam, appContextParam);
      initialize3(sharedPreferencesModuleParam, coroutinesModuleParam, handlerModuleParam, appContextParam);

    }

    private CoroutineScope namedCoroutineScope() {
      return CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory.provideSupervisorMainDispatcherCoroutineScope(coroutinesModule, CoroutinesModule_ProvideDispatcherMainFactory.provideDispatcherMain(coroutinesModule));
    }

    private ConnectionCheckerDataSourceImpl connectionCheckerDataSourceImpl() {
      return new ConnectionCheckerDataSourceImpl(httpInternetCheckerProvider, socketInternetCheckerProvider, appContext);
    }

    private ConnectionCheckerRepositoryImpl connectionCheckerRepositoryImpl() {
      return new ConnectionCheckerRepositoryImpl(connectionCheckerDataSourceImpl());
    }

    private CoroutineScope namedCoroutineScope2() {
      return CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory.provideSupervisorIoDispatcherCoroutineScope(coroutinesModule, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private DnsDataSourceImpl dnsDataSourceImpl() {
      return new DnsDataSourceImpl(udpResolverFactoryProvider.get(), dohResolverFactoryProvider.get());
    }

    private DnsRepositoryImpl dnsRepositoryImpl() {
      return new DnsRepositoryImpl(dnsDataSourceImpl());
    }

    private TorIpsInteractorImpl torIpsInteractorImpl() {
      return new TorIpsInteractorImpl(DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
    }

    private ResourceManagerImpl resourceManagerImpl() {
      return new ResourceManagerImpl(appContext);
    }

    private DefaultVanillaBridgeDataSourceImpl defaultVanillaBridgeDataSourceImpl() {
      return new DefaultVanillaBridgeDataSourceImpl(httpsConnectionManagerProvider.get());
    }

    private DefaultVanillaBridgeRepositoryImpl defaultVanillaBridgeRepositoryImpl() {
      return new DefaultVanillaBridgeRepositoryImpl(socketInternetCheckerProvider, defaultVanillaBridgeDataSourceImpl(), provideDefaultSharedPreferencesProvider.get());
    }

    private DefaultVanillaBridgeInteractor defaultVanillaBridgeInteractor() {
      return new DefaultVanillaBridgeInteractor(defaultVanillaBridgeRepositoryImpl(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private RequestBridgesDataSourceImpl requestBridgesDataSourceImpl() {
      return new RequestBridgesDataSourceImpl(new TorProjectBridgesParser());
    }

    private RequestBridgesRepositoryImpl requestBridgesRepositoryImpl() {
      return new RequestBridgesRepositoryImpl(requestBridgesDataSourceImpl());
    }

    private RequestBridgesInteractor requestBridgesInteractor() {
      return new RequestBridgesInteractor(appContext, requestBridgesRepositoryImpl(), cachedExecutorProvider.get(), httpsConnectionManagerProvider.get());
    }

    private BridgesCountriesDataSourceImpl bridgesCountriesDataSourceImpl() {
      return new BridgesCountriesDataSourceImpl(pathVarsProvider.get());
    }

    private BridgesCountriesRepositoryImpl bridgesCountriesRepositoryImpl() {
      return new BridgesCountriesRepositoryImpl(bridgesCountriesDataSourceImpl());
    }

    private BridgesCountriesInteractor bridgesCountriesInteractor() {
      return new BridgesCountriesInteractor(bridgesCountriesRepositoryImpl(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private BridgePingHelper bridgePingHelper() {
      return new BridgePingHelper(appContext, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule), defaultVanillaBridgeInteractor(), provideDefaultSharedPreferencesProvider.get());
    }

    private DnsCryptConfigurationParser dnsCryptConfigurationParser() {
      return new DnsCryptConfigurationParser(appContext, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider), DoubleCheck.lazy(pathVarsProvider));
    }

    private ServersPingDataSourceImpl serversPingDataSourceImpl() {
      return new ServersPingDataSourceImpl(socketInternetCheckerProvider);
    }

    private DnsCryptConfigurationDataSource dnsCryptConfigurationDataSource() {
      return new DnsCryptConfigurationDataSource(dnsCryptConfigurationParser(), provideDefaultSharedPreferencesProvider.get());
    }

    private ServersPingRepositoryImpl serversPingRepositoryImpl() {
      return new ServersPingRepositoryImpl(serversPingDataSourceImpl(), dnsCryptConfigurationDataSource(), provideDefaultSharedPreferencesProvider.get());
    }

    private ServersPingInteractor serversPingInteractor() {
      return new ServersPingInteractor(serversPingRepositoryImpl(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private RelaysPingDataSourceImpl relaysPingDataSourceImpl() {
      return new RelaysPingDataSourceImpl(new DnsCryptSDNSParser());
    }

    private RelaysPingRepositoryImpl relaysPingRepositoryImpl() {
      return new RelaysPingRepositoryImpl(relaysPingDataSourceImpl());
    }

    private RelaysPingInteractor relaysPingInteractor() {
      return new RelaysPingInteractor(serversPingRepositoryImpl(), relaysPingRepositoryImpl(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private DnsRulesDataSourceImpl dnsRulesDataSourceImpl() {
      return new DnsRulesDataSourceImpl(appContext, pathVarsProvider.get());
    }

    private DnsRulesRepositoryImpl dnsRulesRepositoryImpl() {
      return new DnsRulesRepositoryImpl(dnsRulesDataSourceImpl(), pathVarsProvider.get());
    }

    private DnsRulesInteractorImpl dnsRulesInteractorImpl() {
      return new DnsRulesInteractorImpl(dnsRulesRepositoryImpl(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>> mapOfClassOfAndProviderOfViewModel(
        ) {
      return MapBuilder.<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>>newMapBuilder(8).put(UnlockTorIpsViewModel.class, ((Provider) unlockTorIpsViewModelProvider)).put(FirewallViewModel.class, ((Provider) firewallViewModelProvider)).put(PreferencesTorBridgesViewModel.class, ((Provider) preferencesTorBridgesViewModelProvider)).put(TopFragmentViewModel.class, ((Provider) topFragmentViewModelProvider)).put(DnsServerViewModel.class, ((Provider) dnsServerViewModelProvider)).put(DnsRelayViewModel.class, ((Provider) dnsRelayViewModelProvider)).put(DnsRulesViewModel.class, ((Provider) dnsRulesViewModelProvider)).put(ItpdSubscriptionsViewModel.class, ((Provider) itpdSubscriptionsViewModelProvider)).build();
    }

    private RootExecutor rootExecutor() {
      return new RootExecutor(DoubleCheck.lazy(pathVarsProvider), DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)), DoubleCheck.lazy(provideDefaultSharedPreferencesProvider), CoroutinesModule_ProvideDispatcherMainFactory.provideDispatcherMain(coroutinesModule), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
    }

    private DownloadRemoteRulesManager downloadRemoteRulesManager() {
      return new DownloadRemoteRulesManager(appContext, pathVarsProvider.get(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule), httpsConnectionManagerProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SharedPreferencesModule sharedPreferencesModuleParam,
        final CoroutinesModule coroutinesModuleParam, final HandlerModule handlerModuleParam,
        final Context appContextParam) {
      this.pathVarsProvider = DoubleCheck.provider(new SwitchingProvider<PathVars>(appComponentImpl, 0));
      this.provideAppSharedPreferencesProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(appComponentImpl, 4));
      this.appPreferenceHelperImplProvider = DoubleCheck.provider(new SwitchingProvider<AppPreferenceHelperImpl>(appComponentImpl, 3));
      this.preferenceDataSourceImplProvider = DoubleCheck.provider(new SwitchingProvider<PreferenceDataSourceImpl>(appComponentImpl, 2));
      this.preferenceRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<PreferenceRepositoryImpl>(appComponentImpl, 1));
      this.cachedExecutorProvider = DoubleCheck.provider(new SwitchingProvider<CachedExecutor>(appComponentImpl, 5));
      this.provideSupervisorIoDispatcherCoroutineScopeSingletonProvider = DoubleCheck.provider(new SwitchingProvider<CoroutineScope>(appComponentImpl, 7));
      this.coroutineExecutorProvider = new SwitchingProvider<>(appComponentImpl, 6);
      this.provideDefaultSharedPreferencesProvider = DoubleCheck.provider(new SwitchingProvider<SharedPreferences>(appComponentImpl, 8));
      this.provideMainHandlerProvider = new SwitchingProvider<>(appComponentImpl, 9);
      this.internetSharingCheckerProvider = new SwitchingProvider<>(appComponentImpl, 10);
      this.apManagerProvider = new SwitchingProvider<>(appComponentImpl, 11);
      this.accelerateDevelopProvider = new SwitchingProvider<>(appComponentImpl, 12);
      this.verifierProvider = DoubleCheck.provider(new SwitchingProvider<Verifier>(appComponentImpl, 13));
      this.modulesVersionsProvider = DoubleCheck.provider(new SwitchingProvider<ModulesVersions>(appComponentImpl, 14));
      this.httpInternetCheckerProvider = new SwitchingProvider<>(appComponentImpl, 16);
      this.socketInternetCheckerProvider = new SwitchingProvider<>(appComponentImpl, 17);
      this.udpResolverFactoryProvider = SingleCheck.provider(new SwitchingProvider<DnsDataSourceImpl.UdpResolverFactory>(appComponentImpl, 18));
      this.dohResolverFactoryProvider = SingleCheck.provider(new SwitchingProvider<DnsDataSourceImpl.DohResolverFactory>(appComponentImpl, 19));
      this.connectionCheckerInteractorImplProvider = DoubleCheck.provider(new SwitchingProvider<ConnectionCheckerInteractorImpl>(appComponentImpl, 15));
      this.notificationPermissionManagerProvider = new SwitchingProvider<>(appComponentImpl, 20);
      this.dnsInteractorImplProvider = new SwitchingProvider<>(appComponentImpl, 23);
      this.resourceRepositoryImplProvider = new SwitchingProvider<>(appComponentImpl, 24);
      this.unlockTorIpsViewModelProvider = new SwitchingProvider<>(appComponentImpl, 22);
      this.firewallViewModelProvider = new SwitchingProvider<>(appComponentImpl, 25);
    }

    @SuppressWarnings("unchecked")
    private void initialize2(final SharedPreferencesModule sharedPreferencesModuleParam,
        final CoroutinesModule coroutinesModuleParam, final HandlerModule handlerModuleParam,
        final Context appContextParam) {
      this.httpsConnectionManagerProvider = new SwitchingProvider<>(appComponentImpl, 27);
      this.appSessionStoreProvider = DoubleCheck.provider(new SwitchingProvider<AppSessionStore>(appComponentImpl, 28));
      this.preferencesTorBridgesViewModelProvider = new SwitchingProvider<>(appComponentImpl, 26);
      this.installerHelperProvider = new SwitchingProvider<>(appComponentImpl, 31);
      this.resetModuleHelperProvider = new SwitchingProvider<>(appComponentImpl, 30);
      this.topFragmentViewModelProvider = new SwitchingProvider<>(appComponentImpl, 29);
      this.dnsServerViewModelProvider = new SwitchingProvider<>(appComponentImpl, 32);
      this.dnsRelayViewModelProvider = new SwitchingProvider<>(appComponentImpl, 33);
      this.remixExistingRulesWorkManagerProvider = new SwitchingProvider<>(appComponentImpl, 35);
      this.updateRemoteRulesWorkManagerProvider = new SwitchingProvider<>(appComponentImpl, 36);
      this.updateLocalRulesWorkManagerProvider = new SwitchingProvider<>(appComponentImpl, 37);
      this.dnsRulesViewModelProvider = new SwitchingProvider<>(appComponentImpl, 34);
      this.itpdSubscriptionsViewModelProvider = new SwitchingProvider<>(appComponentImpl, 38);
      this.viewModelFactoryProvider = DoubleCheck.provider(new SwitchingProvider<ViewModelFactory>(appComponentImpl, 21));
      this.bridgeCheckerProvider = new SwitchingProvider<>(appComponentImpl, 39);
      this.snowflakeConfiguratorProvider = new SwitchingProvider<>(appComponentImpl, 40);
      this.proxyHelperProvider = new SwitchingProvider<>(appComponentImpl, 41);
      this.modulesStatusBroadcasterProvider = DoubleCheck.provider(new SwitchingProvider<ModulesStatusBroadcaster>(appComponentImpl, 42));
      this.rulesEraserProvider = new SwitchingProvider<>(appComponentImpl, 43);
      this.dnsRulesReceiverProvider = new SwitchingProvider<>(appComponentImpl, 44);
      this.torRestarterReconnectorProvider = new SwitchingProvider<>(appComponentImpl, 46);
      this.installedAppNamesStorageProvider = DoubleCheck.provider(new SwitchingProvider<InstalledAppNamesStorage>(appComponentImpl, 47));
      this.modulesReceiverProvider = new SwitchingProvider<>(appComponentImpl, 45);
      this.portCheckerProvider = new SwitchingProvider<>(appComponentImpl, 48);
      this.updateIPsManagerProvider = DoubleCheck.provider(new SwitchingProvider<UpdateIPsManager>(appComponentImpl, 50));
    }

    @SuppressWarnings("unchecked")
    private void initialize3(final SharedPreferencesModule sharedPreferencesModuleParam,
        final CoroutinesModule coroutinesModuleParam, final HandlerModule handlerModuleParam,
        final Context appContextParam) {
      this.bootCompleteManagerProvider = new SwitchingProvider<>(appComponentImpl, 49);
      this.vpnBuilderProvider = new SwitchingProvider<>(appComponentImpl, 51);
    }

    @Override
    public TilesSubcomponent.Factory tilesSubcomponent() {
      return new TilesSubcomponentFactory(appComponentImpl);
    }

    @Override
    public ArpSubcomponent.Factory arpSubcomponent() {
      return new ArpSubcomponentFactory(appComponentImpl);
    }

    @Override
    public ModulesServiceSubcomponent.Factory modulesServiceSubcomponent() {
      return new ModulesServiceSubcomponentFactory(appComponentImpl);
    }

    @Override
    public Lazy<PathVars> getPathVars() {
      return DoubleCheck.lazy(pathVarsProvider);
    }

    @Override
    public Lazy<PreferenceRepository> getPreferenceRepository() {
      return DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider));
    }

    @Override
    public CachedExecutor getCachedExecutor() {
      return cachedExecutorProvider.get();
    }

    @Override
    public CoroutineExecutor getCoroutineExecutor() {
      return coroutineExecutorProvider.get();
    }

    @Override
    public void inject(MainActivity activity) {
      injectMainActivity(activity);
    }

    @Override
    public void inject(SettingsActivity activity) {
      injectSettingsActivity(activity);
    }

    @Override
    public void inject(HelpActivity activity) {
      injectHelpActivity(activity);
    }

    @Override
    public void inject(AboutActivity activity) {
      injectAboutActivity(activity);
    }

    @Override
    public void inject(TopFragment fragment) {
      injectTopFragment(fragment);
    }

    @Override
    public void inject(MainFragment fragment) {
      injectMainFragment(fragment);
    }

    @Override
    public void inject(UnlockTorAppsFragment fragment) {
      injectUnlockTorAppsFragment(fragment);
    }

    @Override
    public void inject(PreferencesTorBridges fragment) {
      injectPreferencesTorBridges(fragment);
    }

    @Override
    public void inject(UnlockTorIpsFragment fragment) {
      injectUnlockTorIpsFragment(fragment);
    }

    @Override
    public void inject(PreferencesTorFragment fragment) {
      injectPreferencesTorFragment(fragment);
    }

    @Override
    public void inject(ProxyFragment fragment) {
      injectProxyFragment(fragment);
    }

    @Override
    public void inject(PreferencesDNSCryptServers fragment) {
      injectPreferencesDNSCryptServers(fragment);
    }

    @Override
    public void inject(FirewallFragment fragment) {
      injectFirewallFragment(fragment);
    }

    @Override
    public void inject(BackupFragment fragment) {
      injectBackupFragment(fragment);
    }

    @Override
    public void inject(ConfigEditorFragment fragment) {
      injectConfigEditorFragment(fragment);
    }

    @Override
    public void inject(PreferencesCommonFragment fragment) {
      injectPreferencesCommonFragment(fragment);
    }

    @Override
    public void inject(PreferencesITPDFragment fragment) {
      injectPreferencesITPDFragment(fragment);
    }

    @Override
    public void inject(PreferencesDNSCryptRelays fragment) {
      injectPreferencesDNSCryptRelays(fragment);
    }

    @Override
    public void inject(PreferencesDNSFragment fragment) {
      injectPreferencesDNSFragment(fragment);
    }

    @Override
    public void inject(ITPDSubscriptionsFragment fragment) {
      injectITPDSubscriptionsFragment(fragment);
    }

    @Override
    public void inject(UpdateModulesDialogFragment fragment) {
      injectUpdateModulesDialogFragment(fragment);
    }

    @Override
    public void inject(NotificationHelper fragment) {
      injectNotificationHelper(fragment);
    }

    @Override
    public void inject(DnsRulesFragment fragment) {
      injectDnsRulesFragment(fragment);
    }

    @Override
    public void inject(ModulesService service) {
      injectModulesService(service);
    }

    @Override
    public void inject(RootExecService service) {
      injectRootExecService(service);
    }

    @Override
    public void inject(UpdateService service) {
      injectUpdateService(service);
    }

    @Override
    public void inject(BootCompleteReceiver receiver) {
      injectBootCompleteReceiver(receiver);
    }

    @Override
    public void inject(DNSCryptFragmentReceiver receiver) {
      injectDNSCryptFragmentReceiver(receiver);
    }

    @Override
    public void inject(TorFragmentReceiver receiver) {
      injectTorFragmentReceiver(receiver);
    }

    @Override
    public void inject(ITPDFragmentReceiver receiver) {
      injectITPDFragmentReceiver(receiver);
    }

    @Override
    public void inject(HelpActivityReceiver receiver) {
      injectHelpActivityReceiver(receiver);
    }

    @Override
    public void inject(IptablesReceiver receiver) {
      injectIptablesReceiver(receiver);
    }

    @Override
    public void inject(RequestIgnoreBatteryOptimizationDialog dialogFragment) {
      injectRequestIgnoreBatteryOptimizationDialog(dialogFragment);
    }

    @Override
    public void inject(RequestIgnoreDataRestrictionDialog dialogFragment) {
      injectRequestIgnoreDataRestrictionDialog(dialogFragment);
    }

    @Override
    public void inject(SendCrashReport dialogFragment) {
      injectSendCrashReport(dialogFragment);
    }

    @Override
    public void inject(AddDNSCryptServerDialogFragment dialogFragment) {
      injectAddDNSCryptServerDialogFragment(dialogFragment);
    }

    @Override
    public void inject(AskRestoreDefaultsDialog dialogFragment) {
      injectAskRestoreDefaultsDialog(dialogFragment);
    }

    @Override
    public void inject(PleaseWaitDialogBridgesRequest dialogFragment) {
      injectPleaseWaitDialogBridgesRequest(dialogFragment);
    }

    @Override
    public void inject(BridgesCaptchaDialogFragment dialogFragment) {
      injectBridgesCaptchaDialogFragment(dialogFragment);
    }

    @Override
    public void inject(BridgesReadyDialogFragment dialogFragment) {
      injectBridgesReadyDialogFragment(dialogFragment);
    }

    @Override
    public void inject(SelectBridgesTransportDialogFragment dialogFragment) {
      injectSelectBridgesTransportDialogFragment(dialogFragment);
    }

    @Override
    public void inject(UsageStatistic usageStatistic) {
      injectUsageStatistic(usageStatistic);
    }

    @Override
    public void inject(ModulesKiller modulesKiller) {
      injectModulesKiller(modulesKiller);
    }

    @Override
    public void inject(ContextUIDUpdater contextUIDUpdater) {
      injectContextUIDUpdater(contextUIDUpdater);
    }

    @Override
    public void inject(UpdateCheck updateCheck) {
      injectUpdateCheck(updateCheck);
    }

    @Override
    public void inject(DownloadTask downloadTask) {
      injectDownloadTask(downloadTask);
    }

    @Override
    public void inject(TorRefreshIPsWork torRefreshIPsWork) {
      injectTorRefreshIPsWork(torRefreshIPsWork);
    }

    @Override
    public void inject(FileManager fileManager) {
      injectFileManager(fileManager);
    }

    @Override
    public void inject(Verifier verifier) {
    }

    @Override
    public void inject(BridgeAdapter bridgeAdapter) {
    }

    @Override
    public void inject(ModulesStarterHelper modulesStarterHelper) {
      injectModulesStarterHelper(modulesStarterHelper);
    }

    @Override
    public void inject(BackupHelper backupHelper) {
      injectBackupHelper(backupHelper);
    }

    @Override
    public void inject(Tethering tethering) {
      injectTethering(tethering);
    }

    @Override
    public void inject(ServiceVPNHandler serviceVPNHandler) {
      injectServiceVPNHandler(serviceVPNHandler);
    }

    @Override
    public void inject(Installer installer) {
      injectInstaller(installer);
    }

    @Override
    public void inject(InstalledApplicationsManager installedApplicationsManager) {
      injectInstalledApplicationsManager(installedApplicationsManager);
    }

    @Override
    public void inject(AgreementDialog agreementDialog) {
    }

    @Override
    public void inject(RulesEraser rulesEraser) {
    }

    @Override
    public void inject(UpdateRemoteDnsRulesWorker worker) {
      injectUpdateRemoteDnsRulesWorker(worker);
    }

    @Override
    public void inject(UpdateLocalDnsRulesWorker worker) {
      injectUpdateLocalDnsRulesWorker(worker);
    }

    @Override
    public void inject(RemixExistingDnsRulesWorker worker) {
      injectRemixExistingDnsRulesWorker(worker);
    }

    @Override
    public void inject(DNSCryptLogParser parser) {
      injectDNSCryptLogParser(parser);
    }

    @Override
    public void inject(TorLogParser parser) {
      injectTorLogParser(parser);
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectPreferenceRepository(instance, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      MainActivity_MembersInjector.injectDefaultPreferences(instance, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      MainActivity_MembersInjector.injectHandler(instance, provideMainHandlerProvider.get());
      MainActivity_MembersInjector.injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
      MainActivity_MembersInjector.injectInternetSharingChecker(instance, internetSharingCheckerProvider);
      MainActivity_MembersInjector.injectApManager(instance, DoubleCheck.lazy(apManagerProvider));
      MainActivity_MembersInjector.injectExecutor(instance, DoubleCheck.lazy(cachedExecutorProvider));
      MainActivity_MembersInjector.injectAccelerateDevelop(instance, DoubleCheck.lazy(accelerateDevelopProvider));
      return instance;
    }

    private SettingsActivity injectSettingsActivity(SettingsActivity instance2) {
      SettingsActivity_MembersInjector.injectPreferenceRepository(instance2, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      SettingsActivity_MembersInjector.injectPathVars(instance2, DoubleCheck.lazy(pathVarsProvider));
      return instance2;
    }

    private HelpActivity injectHelpActivity(HelpActivity instance3) {
      HelpActivity_MembersInjector.injectPathVarsLazy(instance3, DoubleCheck.lazy(pathVarsProvider));
      HelpActivity_MembersInjector.injectPreferenceRepository(instance3, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      HelpActivity_MembersInjector.injectExecutor(instance3, coroutineExecutorProvider.get());
      HelpActivity_MembersInjector.injectVerifier(instance3, DoubleCheck.lazy(verifierProvider));
      return instance3;
    }

    private AboutActivity injectAboutActivity(AboutActivity instance4) {
      AboutActivity_MembersInjector.injectPathVars(instance4, DoubleCheck.lazy(pathVarsProvider));
      AboutActivity_MembersInjector.injectPreferenceRepository(instance4, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance4;
    }

    private TopFragment injectTopFragment(TopFragment instance5) {
      TopFragment_MembersInjector.injectPreferenceRepository(instance5, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      TopFragment_MembersInjector.injectPathVars(instance5, DoubleCheck.lazy(pathVarsProvider));
      TopFragment_MembersInjector.injectExecutor(instance5, coroutineExecutorProvider.get());
      TopFragment_MembersInjector.injectModulesVersions(instance5, DoubleCheck.lazy(modulesVersionsProvider));
      TopFragment_MembersInjector.injectConnectionChecker(instance5, DoubleCheck.lazy(((Provider) connectionCheckerInteractorImplProvider)));
      TopFragment_MembersInjector.injectNotificationPermissionManager(instance5, DoubleCheck.lazy(notificationPermissionManagerProvider));
      TopFragment_MembersInjector.injectViewModelFactory(instance5, viewModelFactoryProvider.get());
      TopFragment_MembersInjector.injectVerifierLazy(instance5, DoubleCheck.lazy(verifierProvider));
      return instance5;
    }

    private MainFragment injectMainFragment(MainFragment instance6) {
      MainFragment_MembersInjector.injectPreferenceRepository(instance6, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance6;
    }

    private UnlockTorAppsFragment injectUnlockTorAppsFragment(UnlockTorAppsFragment instance7) {
      UnlockTorAppsFragment_MembersInjector.injectDefaultPreferences(instance7, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      UnlockTorAppsFragment_MembersInjector.injectPreferenceRepository(instance7, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      UnlockTorAppsFragment_MembersInjector.injectExecutor(instance7, coroutineExecutorProvider.get());
      UnlockTorAppsFragment_MembersInjector.injectHandler(instance7, DoubleCheck.lazy(provideMainHandlerProvider));
      UnlockTorAppsFragment_MembersInjector.injectVerifierLazy(instance7, DoubleCheck.lazy(verifierProvider));
      return instance7;
    }

    private PreferencesTorBridges injectPreferencesTorBridges(PreferencesTorBridges instance8) {
      PreferencesTorBridges_MembersInjector.injectPreferenceRepository(instance8, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      PreferencesTorBridges_MembersInjector.injectDefaultPreferences(instance8, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      PreferencesTorBridges_MembersInjector.injectPathVars(instance8, DoubleCheck.lazy(pathVarsProvider));
      PreferencesTorBridges_MembersInjector.injectExecutor(instance8, coroutineExecutorProvider.get());
      PreferencesTorBridges_MembersInjector.injectHandlerLazy(instance8, DoubleCheck.lazy(provideMainHandlerProvider));
      PreferencesTorBridges_MembersInjector.injectBridgeChecker(instance8, DoubleCheck.lazy(bridgeCheckerProvider));
      PreferencesTorBridges_MembersInjector.injectSnowflakeConfigurator(instance8, DoubleCheck.lazy(snowflakeConfiguratorProvider));
      PreferencesTorBridges_MembersInjector.injectViewModelFactory(instance8, viewModelFactoryProvider.get());
      return instance8;
    }

    private UnlockTorIpsFragment injectUnlockTorIpsFragment(UnlockTorIpsFragment instance9) {
      UnlockTorIpsFragment_MembersInjector.injectCoroutineExecutor(instance9, DoubleCheck.lazy(coroutineExecutorProvider));
      UnlockTorIpsFragment_MembersInjector.injectExecutor(instance9, coroutineExecutorProvider.get());
      UnlockTorIpsFragment_MembersInjector.injectViewModelFactory(instance9, viewModelFactoryProvider.get());
      UnlockTorIpsFragment_MembersInjector.injectDefaultPreferences(instance9, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      UnlockTorIpsFragment_MembersInjector.injectVerifierLazy(instance9, DoubleCheck.lazy(verifierProvider));
      return instance9;
    }

    private PreferencesTorFragment injectPreferencesTorFragment(PreferencesTorFragment instance10) {
      PreferencesTorFragment_MembersInjector.injectPreferenceRepository(instance10, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      PreferencesTorFragment_MembersInjector.injectDefaultPreferences(instance10, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      PreferencesTorFragment_MembersInjector.injectPathVars(instance10, DoubleCheck.lazy(pathVarsProvider));
      PreferencesTorFragment_MembersInjector.injectExecutor(instance10, coroutineExecutorProvider.get());
      PreferencesTorFragment_MembersInjector.injectSnowflakeConfigurator(instance10, DoubleCheck.lazy(snowflakeConfiguratorProvider));
      return instance10;
    }

    private ProxyFragment injectProxyFragment(ProxyFragment instance11) {
      ProxyFragment_MembersInjector.injectPreferenceRepository(instance11, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      ProxyFragment_MembersInjector.injectExecutor(instance11, coroutineExecutorProvider.get());
      ProxyFragment_MembersInjector.injectHandler(instance11, DoubleCheck.lazy(provideMainHandlerProvider));
      ProxyFragment_MembersInjector.injectProxyHelper(instance11, proxyHelperProvider.get());
      return instance11;
    }

    private PreferencesDNSCryptServers injectPreferencesDNSCryptServers(
        PreferencesDNSCryptServers instance12) {
      PreferencesDNSCryptServers_MembersInjector.injectPreferenceRepository(instance12, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      PreferencesDNSCryptServers_MembersInjector.injectDefaultPreferences(instance12, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      PreferencesDNSCryptServers_MembersInjector.injectPathVars(instance12, DoubleCheck.lazy(pathVarsProvider));
      PreferencesDNSCryptServers_MembersInjector.injectExecutor(instance12, coroutineExecutorProvider.get());
      PreferencesDNSCryptServers_MembersInjector.injectVerifierLazy(instance12, DoubleCheck.lazy(verifierProvider));
      PreferencesDNSCryptServers_MembersInjector.injectViewModelFactory(instance12, viewModelFactoryProvider.get());
      return instance12;
    }

    private FirewallFragment injectFirewallFragment(FirewallFragment instance13) {
      FirewallFragment_MembersInjector.injectDefaultPreferences(instance13, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      FirewallFragment_MembersInjector.injectPreferenceRepository(instance13, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      FirewallFragment_MembersInjector.injectViewModelFactory(instance13, viewModelFactoryProvider.get());
      FirewallFragment_MembersInjector.injectHandler(instance13, DoubleCheck.lazy(provideMainHandlerProvider));
      return instance13;
    }

    private BackupFragment injectBackupFragment(BackupFragment instance14) {
      BackupFragment_MembersInjector.injectPathVarsLazy(instance14, DoubleCheck.lazy(pathVarsProvider));
      BackupFragment_MembersInjector.injectPreferenceRepository(instance14, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      BackupFragment_MembersInjector.injectExecutor(instance14, coroutineExecutorProvider.get());
      return instance14;
    }

    private ConfigEditorFragment injectConfigEditorFragment(ConfigEditorFragment instance15) {
      ConfigEditorFragment_MembersInjector.injectPathVars(instance15, DoubleCheck.lazy(pathVarsProvider));
      return instance15;
    }

    private PreferencesCommonFragment injectPreferencesCommonFragment(
        PreferencesCommonFragment instance16) {
      PreferencesCommonFragment_MembersInjector.injectPreferenceRepository(instance16, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      PreferencesCommonFragment_MembersInjector.injectPathVars(instance16, DoubleCheck.lazy(pathVarsProvider));
      PreferencesCommonFragment_MembersInjector.injectExecutor(instance16, coroutineExecutorProvider.get());
      PreferencesCommonFragment_MembersInjector.injectHandler(instance16, DoubleCheck.lazy(provideMainHandlerProvider));
      PreferencesCommonFragment_MembersInjector.injectDefaultPreferences(instance16, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      PreferencesCommonFragment_MembersInjector.injectProxyHelper(instance16, DoubleCheck.lazy(proxyHelperProvider));
      PreferencesCommonFragment_MembersInjector.injectVerifierLazy(instance16, DoubleCheck.lazy(verifierProvider));
      PreferencesCommonFragment_MembersInjector.injectModulesStatusBroadcaster(instance16, DoubleCheck.lazy(modulesStatusBroadcasterProvider));
      PreferencesCommonFragment_MembersInjector.injectSessionStore(instance16, appSessionStoreProvider.get());
      return instance16;
    }

    private PreferencesITPDFragment injectPreferencesITPDFragment(
        PreferencesITPDFragment instance17) {
      PreferencesITPDFragment_MembersInjector.injectPathVars(instance17, DoubleCheck.lazy(pathVarsProvider));
      PreferencesITPDFragment_MembersInjector.injectExecutor(instance17, coroutineExecutorProvider.get());
      PreferencesITPDFragment_MembersInjector.injectDefaultPreferences(instance17, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      return instance17;
    }

    private PreferencesDNSCryptRelays injectPreferencesDNSCryptRelays(
        PreferencesDNSCryptRelays instance18) {
      PreferencesDNSCryptRelays_MembersInjector.injectPathVars(instance18, DoubleCheck.lazy(pathVarsProvider));
      PreferencesDNSCryptRelays_MembersInjector.injectViewModelFactory(instance18, viewModelFactoryProvider.get());
      return instance18;
    }

    private PreferencesDNSFragment injectPreferencesDNSFragment(PreferencesDNSFragment instance19) {
      PreferencesDNSFragment_MembersInjector.injectPathVars(instance19, DoubleCheck.lazy(pathVarsProvider));
      PreferencesDNSFragment_MembersInjector.injectExecutor(instance19, coroutineExecutorProvider.get());
      PreferencesDNSFragment_MembersInjector.injectDefaultPreferences(instance19, provideDefaultSharedPreferencesProvider.get());
      PreferencesDNSFragment_MembersInjector.injectHandler(instance19, DoubleCheck.lazy(provideMainHandlerProvider));
      PreferencesDNSFragment_MembersInjector.injectRulesEraser(instance19, DoubleCheck.lazy(rulesEraserProvider));
      PreferencesDNSFragment_MembersInjector.injectUpdateRemoteRulesWorkManager(instance19, DoubleCheck.lazy(updateRemoteRulesWorkManagerProvider));
      return instance19;
    }

    private ITPDSubscriptionsFragment injectITPDSubscriptionsFragment(
        ITPDSubscriptionsFragment instance20) {
      ITPDSubscriptionsFragment_MembersInjector.injectViewModelFactory(instance20, viewModelFactoryProvider.get());
      return instance20;
    }

    private UpdateModulesDialogFragment injectUpdateModulesDialogFragment(
        UpdateModulesDialogFragment instance21) {
      UpdateModulesDialogFragment_MembersInjector.injectPreferenceRepository(instance21, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance21;
    }

    private NotificationHelper injectNotificationHelper(NotificationHelper instance22) {
      NotificationHelper_MembersInjector.injectPreferenceRepository(instance22, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance22;
    }

    private DnsRulesFragment injectDnsRulesFragment(DnsRulesFragment instance23) {
      DnsRulesFragment_MembersInjector.injectPathVars(instance23, DoubleCheck.lazy(pathVarsProvider));
      DnsRulesFragment_MembersInjector.injectDnsRulesReceiver(instance23, DoubleCheck.lazy(dnsRulesReceiverProvider));
      DnsRulesFragment_MembersInjector.injectViewModelFactory(instance23, viewModelFactoryProvider.get());
      return instance23;
    }

    private ModulesService injectModulesService(ModulesService instance24) {
      ModulesService_MembersInjector.injectPreferenceRepository(instance24, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      ModulesService_MembersInjector.injectDefaultSharedPreferences(instance24, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      ModulesService_MembersInjector.injectInternetCheckerInteractor(instance24, DoubleCheck.lazy(((Provider) connectionCheckerInteractorImplProvider)));
      ModulesService_MembersInjector.injectModulesReceiver(instance24, DoubleCheck.lazy(modulesReceiverProvider));
      ModulesService_MembersInjector.injectHandler(instance24, DoubleCheck.lazy(provideMainHandlerProvider));
      ModulesService_MembersInjector.injectPathVars(instance24, DoubleCheck.lazy(pathVarsProvider));
      ModulesService_MembersInjector.injectExecutor(instance24, coroutineExecutorProvider.get());
      ModulesService_MembersInjector.injectInstalledAppNamesStorage(instance24, DoubleCheck.lazy(installedAppNamesStorageProvider));
      ModulesService_MembersInjector.injectPortChecker(instance24, DoubleCheck.lazy(portCheckerProvider));
      return instance24;
    }

    private RootExecService injectRootExecService(RootExecService instance25) {
      RootExecService_MembersInjector.injectRootExecutor(instance25, rootExecutor());
      RootExecService_MembersInjector.injectDefaultPreferences(instance25, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      RootExecService_MembersInjector.injectPreferenceRepository(instance25, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance25;
    }

    private UpdateService injectUpdateService(UpdateService instance26) {
      UpdateService_MembersInjector.injectPreferenceRepository(instance26, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance26;
    }

    private BootCompleteReceiver injectBootCompleteReceiver(BootCompleteReceiver instance27) {
      BootCompleteReceiver_MembersInjector.injectBootCompleteManager(instance27, DoubleCheck.lazy(bootCompleteManagerProvider));
      return instance27;
    }

    private DNSCryptFragmentReceiver injectDNSCryptFragmentReceiver(
        DNSCryptFragmentReceiver instance28) {
      DNSCryptFragmentReceiver_MembersInjector.injectPreferenceRepository(instance28, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      DNSCryptFragmentReceiver_MembersInjector.injectDefaultPreferences(instance28, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      DNSCryptFragmentReceiver_MembersInjector.injectPathVars(instance28, DoubleCheck.lazy(pathVarsProvider));
      DNSCryptFragmentReceiver_MembersInjector.injectExecutor(instance28, coroutineExecutorProvider.get());
      DNSCryptFragmentReceiver_MembersInjector.injectVerifierLazy(instance28, DoubleCheck.lazy(verifierProvider));
      return instance28;
    }

    private TorFragmentReceiver injectTorFragmentReceiver(TorFragmentReceiver instance29) {
      TorFragmentReceiver_MembersInjector.injectPreferenceRepository(instance29, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      TorFragmentReceiver_MembersInjector.injectPathVars(instance29, DoubleCheck.lazy(pathVarsProvider));
      return instance29;
    }

    private ITPDFragmentReceiver injectITPDFragmentReceiver(ITPDFragmentReceiver instance30) {
      ITPDFragmentReceiver_MembersInjector.injectPreferenceRepository(instance30, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      ITPDFragmentReceiver_MembersInjector.injectPathVars(instance30, DoubleCheck.lazy(pathVarsProvider));
      return instance30;
    }

    private HelpActivityReceiver injectHelpActivityReceiver(HelpActivityReceiver instance31) {
      HelpActivityReceiver_MembersInjector.injectPreferenceRepository(instance31, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      HelpActivityReceiver_MembersInjector.injectExecutor(instance31, coroutineExecutorProvider.get());
      return instance31;
    }

    private IptablesReceiver injectIptablesReceiver(IptablesReceiver instance32) {
      IptablesReceiver_MembersInjector.injectHandler(instance32, DoubleCheck.lazy(provideMainHandlerProvider));
      return instance32;
    }

    private RequestIgnoreBatteryOptimizationDialog injectRequestIgnoreBatteryOptimizationDialog(
        RequestIgnoreBatteryOptimizationDialog instance33) {
      RequestIgnoreBatteryOptimizationDialog_MembersInjector.injectPreferenceRepository(instance33, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance33;
    }

    private RequestIgnoreDataRestrictionDialog injectRequestIgnoreDataRestrictionDialog(
        RequestIgnoreDataRestrictionDialog instance34) {
      RequestIgnoreDataRestrictionDialog_MembersInjector.injectPreferenceRepository(instance34, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance34;
    }

    private SendCrashReport injectSendCrashReport(SendCrashReport instance35) {
      SendCrashReport_MembersInjector.injectPreferenceRepository(instance35, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      SendCrashReport_MembersInjector.injectPathVars(instance35, DoubleCheck.lazy(pathVarsProvider));
      SendCrashReport_MembersInjector.injectExecutor(instance35, coroutineExecutorProvider.get());
      SendCrashReport_MembersInjector.injectVerifier(instance35, DoubleCheck.lazy(verifierProvider));
      return instance35;
    }

    private AddDNSCryptServerDialogFragment injectAddDNSCryptServerDialogFragment(
        AddDNSCryptServerDialogFragment instance36) {
      AddDNSCryptServerDialogFragment_MembersInjector.injectDefaultPreferences(instance36, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      return instance36;
    }

    private AskRestoreDefaultsDialog injectAskRestoreDefaultsDialog(
        AskRestoreDefaultsDialog instance37) {
      AskRestoreDefaultsDialog_MembersInjector.injectViewModelFactory(instance37, viewModelFactoryProvider.get());
      return instance37;
    }

    private PleaseWaitDialogBridgesRequest injectPleaseWaitDialogBridgesRequest(
        PleaseWaitDialogBridgesRequest instance38) {
      PleaseWaitDialogBridgesRequest_MembersInjector.injectViewModelFactory(instance38, viewModelFactoryProvider.get());
      return instance38;
    }

    private BridgesCaptchaDialogFragment injectBridgesCaptchaDialogFragment(
        BridgesCaptchaDialogFragment instance39) {
      BridgesCaptchaDialogFragment_MembersInjector.injectViewModelFactory(instance39, viewModelFactoryProvider.get());
      return instance39;
    }

    private BridgesReadyDialogFragment injectBridgesReadyDialogFragment(
        BridgesReadyDialogFragment instance40) {
      BridgesReadyDialogFragment_MembersInjector.injectViewModelFactory(instance40, viewModelFactoryProvider.get());
      return instance40;
    }

    private SelectBridgesTransportDialogFragment injectSelectBridgesTransportDialogFragment(
        SelectBridgesTransportDialogFragment instance41) {
      SelectBridgesTransportDialogFragment_MembersInjector.injectDefaultPreferences(instance41, provideDefaultSharedPreferencesProvider.get());
      SelectBridgesTransportDialogFragment_MembersInjector.injectViewModelFactory(instance41, viewModelFactoryProvider.get());
      return instance41;
    }

    private UsageStatistic injectUsageStatistic(UsageStatistic instance42) {
      UsageStatistic_MembersInjector.injectConnectionCheckerInteractor(instance42, DoubleCheck.lazy(((Provider) connectionCheckerInteractorImplProvider)));
      UsageStatistic_MembersInjector.injectPathVars(instance42, pathVarsProvider.get());
      return instance42;
    }

    private ModulesKiller injectModulesKiller(ModulesKiller instance43) {
      ModulesKiller_MembersInjector.injectPreferenceRepository(instance43, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance43;
    }

    private ContextUIDUpdater injectContextUIDUpdater(ContextUIDUpdater instance44) {
      ContextUIDUpdater_MembersInjector.injectPathVars(instance44, pathVarsProvider.get());
      return instance44;
    }

    private UpdateCheck injectUpdateCheck(UpdateCheck instance45) {
      UpdateCheck_MembersInjector.injectPreferenceRepository(instance45, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      UpdateCheck_MembersInjector.injectHttpsConnectionManager(instance45, DoubleCheck.lazy(httpsConnectionManagerProvider));
      UpdateCheck_MembersInjector.injectVerifier(instance45, DoubleCheck.lazy(verifierProvider));
      UpdateCheck_MembersInjector.injectExecutor(instance45, DoubleCheck.lazy(coroutineExecutorProvider));
      UpdateCheck_MembersInjector.injectPathVars(instance45, DoubleCheck.lazy(pathVarsProvider));
      return instance45;
    }

    private DownloadTask injectDownloadTask(DownloadTask instance46) {
      DownloadTask_MembersInjector.injectPreferenceRepository(instance46, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      DownloadTask_MembersInjector.injectPathVars(instance46, pathVarsProvider.get());
      DownloadTask_MembersInjector.injectHttpsConnectionManager(instance46, DoubleCheck.lazy(httpsConnectionManagerProvider));
      return instance46;
    }

    private TorRefreshIPsWork injectTorRefreshIPsWork(TorRefreshIPsWork instance47) {
      TorRefreshIPsWork_MembersInjector.injectPreferenceRepository(instance47, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      TorRefreshIPsWork_MembersInjector.injectDefaultPreferences(instance47, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      TorRefreshIPsWork_MembersInjector.injectDnsInteractor(instance47, DoubleCheck.lazy(((Provider) dnsInteractorImplProvider)));
      TorRefreshIPsWork_MembersInjector.injectHandler(instance47, DoubleCheck.lazy(provideMainHandlerProvider));
      TorRefreshIPsWork_MembersInjector.injectExecutor(instance47, coroutineExecutorProvider.get());
      TorRefreshIPsWork_MembersInjector.injectContext(instance47, appContext);
      return instance47;
    }

    private FileManager injectFileManager(FileManager instance48) {
      FileManager_MembersInjector.injectPreferenceRepository(instance48, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      return instance48;
    }

    private ModulesStarterHelper injectModulesStarterHelper(ModulesStarterHelper instance49) {
      ModulesStarterHelper_MembersInjector.injectDefaultPreferences(instance49, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      ModulesStarterHelper_MembersInjector.injectPreferenceRepository(instance49, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      ModulesStarterHelper_MembersInjector.injectPathVars(instance49, pathVarsProvider.get());
      ModulesStarterHelper_MembersInjector.injectPortChecker(instance49, DoubleCheck.lazy(portCheckerProvider));
      return instance49;
    }

    private BackupHelper injectBackupHelper(BackupHelper instance50) {
      BackupHelper_MembersInjector.injectPreferenceRepository(instance50, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      BackupHelper_MembersInjector.injectExecutor(instance50, coroutineExecutorProvider.get());
      return instance50;
    }

    private Tethering injectTethering(Tethering instance51) {
      Tethering_MembersInjector.injectPathVarsLazy(instance51, DoubleCheck.lazy(pathVarsProvider));
      Tethering_MembersInjector.injectDefaultSharedPreferences(instance51, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      Tethering_MembersInjector.injectPreferenceRepository(instance51, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      Tethering_MembersInjector.injectInternetSharingChecker(instance51, internetSharingCheckerProvider);
      return instance51;
    }

    private ServiceVPNHandler injectServiceVPNHandler(ServiceVPNHandler instance52) {
      ServiceVPNHandler_MembersInjector.injectPreferenceRepository(instance52, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      ServiceVPNHandler_MembersInjector.injectDefaultSharedPreferences(instance52, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      ServiceVPNHandler_MembersInjector.injectPathVars(instance52, DoubleCheck.lazy(pathVarsProvider));
      ServiceVPNHandler_MembersInjector.injectVpnBuilder(instance52, DoubleCheck.lazy(vpnBuilderProvider));
      ServiceVPNHandler_MembersInjector.injectHandler(instance52, DoubleCheck.lazy(provideMainHandlerProvider));
      return instance52;
    }

    private Installer injectInstaller(Installer instance53) {
      Installer_MembersInjector.injectPathVars(instance53, DoubleCheck.lazy(pathVarsProvider));
      Installer_MembersInjector.injectDefaultPreferences(instance53, DoubleCheck.lazy(provideDefaultSharedPreferencesProvider));
      Installer_MembersInjector.injectPreferenceRepository(instance53, DoubleCheck.lazy(((Provider) preferenceRepositoryImplProvider)));
      Installer_MembersInjector.injectExecutor(instance53, coroutineExecutorProvider.get());
      Installer_MembersInjector.injectModulesVersions(instance53, DoubleCheck.lazy(modulesVersionsProvider));
      Installer_MembersInjector.injectInstallerHelper(instance53, DoubleCheck.lazy(installerHelperProvider));
      return instance53;
    }

    private InstalledApplicationsManager injectInstalledApplicationsManager(
        InstalledApplicationsManager instance54) {
      InstalledApplicationsManager_MembersInjector.injectContext(instance54, appContext);
      InstalledApplicationsManager_MembersInjector.injectDefaultPreferences(instance54, provideDefaultSharedPreferencesProvider.get());
      InstalledApplicationsManager_MembersInjector.injectPathVars(instance54, pathVarsProvider.get());
      InstalledApplicationsManager_MembersInjector.injectInstalledAppNamesStorage(instance54, installedAppNamesStorageProvider.get());
      InstalledApplicationsManager_MembersInjector.injectSessionStore(instance54, appSessionStoreProvider.get());
      return instance54;
    }

    private UpdateRemoteDnsRulesWorker injectUpdateRemoteDnsRulesWorker(
        UpdateRemoteDnsRulesWorker instance55) {
      UpdateRemoteDnsRulesWorker_MembersInjector.injectDispatcherIo(instance55, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
      UpdateRemoteDnsRulesWorker_MembersInjector.injectDownloadRulesManager(instance55, downloadRemoteRulesManager());
      return instance55;
    }

    private UpdateLocalDnsRulesWorker injectUpdateLocalDnsRulesWorker(
        UpdateLocalDnsRulesWorker instance56) {
      UpdateLocalDnsRulesWorker_MembersInjector.injectDispatcherIo(instance56, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
      return instance56;
    }

    private RemixExistingDnsRulesWorker injectRemixExistingDnsRulesWorker(
        RemixExistingDnsRulesWorker instance57) {
      RemixExistingDnsRulesWorker_MembersInjector.injectDispatcherIo(instance57, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(coroutinesModule));
      return instance57;
    }

    private DNSCryptLogParser injectDNSCryptLogParser(DNSCryptLogParser instance58) {
      DNSCryptLogParser_MembersInjector.injectSessionStore(instance58, appSessionStoreProvider.get());
      return instance58;
    }

    private TorLogParser injectTorLogParser(TorLogParser instance59) {
      TorLogParser_MembersInjector.injectSessionStore(instance59, appSessionStoreProvider.get());
      return instance59;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final AppComponentImpl appComponentImpl;

      private final int id;

      SwitchingProvider(AppComponentImpl appComponentImpl, int id) {
        this.appComponentImpl = appComponentImpl;
        this.id = id;
      }

      @SuppressWarnings("unchecked")
      @Override
      public T get() {
        switch (id) {
          case 0: // pan.alexander.tordnscrypt.settings.PathVars 
          return (T) PathVars_Factory.newInstance(appComponentImpl.appContext);

          case 1: // pan.alexander.tordnscrypt.data.preferences.PreferenceRepositoryImpl 
          return (T) new PreferenceRepositoryImpl(appComponentImpl.preferenceDataSourceImplProvider.get());

          case 2: // pan.alexander.tordnscrypt.data.preferences.PreferenceDataSourceImpl 
          return (T) new PreferenceDataSourceImpl(appComponentImpl.appPreferenceHelperImplProvider.get());

          case 3: // pan.alexander.tordnscrypt.utils.preferences.AppPreferenceHelperImpl 
          return (T) new AppPreferenceHelperImpl(appComponentImpl.provideAppSharedPreferencesProvider.get(), appComponentImpl.namedCoroutineScope());

          case 4: // @javax.inject.Named("TorPlusDNSCryptPref") android.content.SharedPreferences 
          return (T) SharedPreferencesModule_ProvideAppSharedPreferencesFactory.provideAppSharedPreferences(appComponentImpl.sharedPreferencesModule, appComponentImpl.appContext);

          case 5: // pan.alexander.tordnscrypt.utils.executors.CachedExecutor 
          return (T) new CachedExecutor();

          case 6: // pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor 
          return (T) new CoroutineExecutor(appComponentImpl.provideSupervisorIoDispatcherCoroutineScopeSingletonProvider.get(), CoroutinesModule_ProvideCoroutineExceptionHandlerFactory.provideCoroutineExceptionHandler(appComponentImpl.coroutinesModule));

          case 7: // @javax.inject.Named("SUPERVISOR_JOB_IO_DISPATCHER_SCOPE_SINGLETON") kotlinx.coroutines.CoroutineScope 
          return (T) CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeSingletonFactory.provideSupervisorIoDispatcherCoroutineScopeSingleton(appComponentImpl.coroutinesModule, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule));

          case 8: // @javax.inject.Named("DefaultSharedPreferences") android.content.SharedPreferences 
          return (T) SharedPreferencesModule_ProvideDefaultSharedPreferencesFactory.provideDefaultSharedPreferences(appComponentImpl.sharedPreferencesModule, appComponentImpl.appContext);

          case 9: // android.os.Handler 
          return (T) HandlerModule_ProvideMainHandlerFactory.provideMainHandler(appComponentImpl.handlerModule);

          case 10: // pan.alexander.tordnscrypt.utils.ap.InternetSharingChecker 
          return (T) new InternetSharingChecker(appComponentImpl.appContext);

          case 11: // pan.alexander.tordnscrypt.utils.ap.ApManager 
          return (T) new ApManager(appComponentImpl.appContext, appComponentImpl.internetSharingCheckerProvider.get());

          case 12: // pan.alexander.tordnscrypt.assistance.AccelerateDevelop 
          return (T) new AccelerateDevelop();

          case 13: // pan.alexander.tordnscrypt.utils.integrity.Verifier 
          return (T) new Verifier(appComponentImpl.appContext, DoubleCheck.lazy(appComponentImpl.pathVarsProvider));

          case 14: // pan.alexander.tordnscrypt.modules.ModulesVersions 
          return (T) ModulesVersions_Factory.newInstance(appComponentImpl.coroutineExecutorProvider.get());

          case 15: // pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractorImpl 
          return (T) new ConnectionCheckerInteractorImpl(appComponentImpl.connectionCheckerRepositoryImpl(), appComponentImpl.pathVarsProvider.get(), appComponentImpl.namedCoroutineScope2(), appComponentImpl.dnsRepositoryImpl(), appComponentImpl.provideDefaultSharedPreferencesProvider.get(), appComponentImpl.appContext);

          case 16: // pan.alexander.tordnscrypt.utils.connectionchecker.HttpInternetChecker 
          return (T) new HttpInternetChecker();

          case 17: // pan.alexander.tordnscrypt.utils.connectionchecker.SocketInternetChecker 
          return (T) new SocketInternetChecker();

          case 18: // pan.alexander.tordnscrypt.data.dns_resolver.DnsDataSourceImpl.UdpResolverFactory 
          return (T) new DnsDataSourceImpl.UdpResolverFactory() {
            @Override
            public UdpResolver createUdpResolver(String serverIP, int dnsUdpPort, int type,
                int timeout) {
              return new UdpResolver(serverIP, dnsUdpPort, type, timeout);
            }
          };

          case 19: // pan.alexander.tordnscrypt.data.dns_resolver.DnsDataSourceImpl.DohResolverFactory 
          return (T) new DnsDataSourceImpl.DohResolverFactory() {
            @Override
            public DohResolver createDohResolver(String server, int type2, int timeout2) {
              return new DohResolver(server, type2, timeout2);
            }
          };

          case 20: // pan.alexander.tordnscrypt.utils.notification.NotificationPermissionManager 
          return (T) new NotificationPermissionManager();

          case 21: // pan.alexander.tordnscrypt.di.ViewModelFactory 
          return (T) new ViewModelFactory(appComponentImpl.mapOfClassOfAndProviderOfViewModel());

          case 22: // pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsViewModel 
          return (T) new UnlockTorIpsViewModel(appComponentImpl.torIpsInteractorImpl(), DoubleCheck.lazy(((Provider) appComponentImpl.dnsInteractorImplProvider)), CoroutinesModule_ProvideDispatcherComputationFactory.provideDispatcherComputation(appComponentImpl.coroutinesModule), CoroutinesModule_ProvideCoroutineExceptionHandlerFactory.provideCoroutineExceptionHandler(appComponentImpl.coroutinesModule), DoubleCheck.lazy(((Provider) appComponentImpl.resourceRepositoryImplProvider)));

          case 23: // pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractorImpl 
          return (T) new DnsInteractorImpl(appComponentImpl.pathVarsProvider.get(), appComponentImpl.dnsRepositoryImpl());

          case 24: // pan.alexander.tordnscrypt.data.resources.ResourceRepositoryImpl 
          return (T) new ResourceRepositoryImpl(appComponentImpl.resourceManagerImpl());

          case 25: // pan.alexander.tordnscrypt.settings.firewall.FirewallViewModel 
          return (T) new FirewallViewModel(DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)), CoroutinesModule_ProvideDispatcherComputationFactory.provideDispatcherComputation(appComponentImpl.coroutinesModule), DoubleCheck.lazy(appComponentImpl.pathVarsProvider));

          case 26: // pan.alexander.tordnscrypt.settings.tor_bridges.PreferencesTorBridgesViewModel 
          return (T) new PreferencesTorBridgesViewModel(appComponentImpl.provideDefaultSharedPreferencesProvider.get(), (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.defaultVanillaBridgeInteractor(), appComponentImpl.requestBridgesInteractor(), appComponentImpl.bridgesCountriesInteractor(), appComponentImpl.bridgePingHelper(), appComponentImpl.appSessionStoreProvider.get());

          case 27: // pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager 
          return (T) new HttpsConnectionManager(appComponentImpl.appContext, appComponentImpl.pathVarsProvider.get(), appComponentImpl.provideDefaultSharedPreferencesProvider.get(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule));

          case 28: // pan.alexander.tordnscrypt.utils.session.AppSessionStore 
          return (T) new AppSessionStore();

          case 29: // pan.alexander.tordnscrypt.TopFragmentViewModel 
          return (T) new TopFragmentViewModel(CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule), DoubleCheck.lazy(appComponentImpl.resetModuleHelperProvider));

          case 30: // pan.alexander.tordnscrypt.backup.ResetModuleHelper 
          return (T) new ResetModuleHelper(appComponentImpl.appContext, appComponentImpl.pathVarsProvider.get(), appComponentImpl.installerHelperProvider.get());

          case 31: // pan.alexander.tordnscrypt.installer.InstallerHelper 
          return (T) new InstallerHelper(appComponentImpl.appContext, appComponentImpl.provideDefaultSharedPreferencesProvider.get());

          case 32: // pan.alexander.tordnscrypt.settings.dnscrypt_servers.DnsServerViewModel 
          return (T) new DnsServerViewModel(appComponentImpl.dnsCryptConfigurationParser(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule), appComponentImpl.namedCoroutineScope2(), CoroutinesModule_ProvideCoroutineExceptionHandlerFactory.provideCoroutineExceptionHandler(appComponentImpl.coroutinesModule), appComponentImpl.appSessionStoreProvider.get(), appComponentImpl.serversPingInteractor());

          case 33: // pan.alexander.tordnscrypt.settings.dnscrypt_relays.DnsRelayViewModel 
          return (T) new DnsRelayViewModel(appComponentImpl.dnsCryptConfigurationParser(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule), appComponentImpl.relaysPingInteractor());

          case 34: // pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesViewModel 
          return (T) new DnsRulesViewModel(appComponentImpl.dnsRulesInteractorImpl(), appComponentImpl.namedCoroutineScope2(), DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)), DoubleCheck.lazy(appComponentImpl.remixExistingRulesWorkManagerProvider), DoubleCheck.lazy(appComponentImpl.updateRemoteRulesWorkManagerProvider), DoubleCheck.lazy(appComponentImpl.updateLocalRulesWorkManagerProvider));

          case 35: // pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingRulesWorkManager 
          return (T) new RemixExistingRulesWorkManager(appComponentImpl.appContext);

          case 36: // pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteRulesWorkManager 
          return (T) new UpdateRemoteRulesWorkManager(appComponentImpl.appContext, appComponentImpl.provideDefaultSharedPreferencesProvider.get(), (PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get());

          case 37: // pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalRulesWorkManager 
          return (T) new UpdateLocalRulesWorkManager(appComponentImpl.appContext);

          case 38: // pan.alexander.tordnscrypt.settings.itpd_settings.ItpdSubscriptionsViewModel 
          return (T) new ItpdSubscriptionsViewModel(appComponentImpl.pathVarsProvider.get(), CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule), appComponentImpl.namedCoroutineScope2(), CoroutinesModule_ProvideCoroutineExceptionHandlerFactory.provideCoroutineExceptionHandler(appComponentImpl.coroutinesModule));

          case 39: // pan.alexander.tordnscrypt.settings.tor_bridges.BridgeChecker 
          return (T) new BridgeChecker();

          case 40: // pan.alexander.tordnscrypt.settings.tor_bridges.SnowflakeConfigurator 
          return (T) new SnowflakeConfigurator(appComponentImpl.appContext, DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider));

          case 41: // pan.alexander.tordnscrypt.proxy.ProxyHelper 
          return (T) new ProxyHelper(appComponentImpl.appContext, appComponentImpl.pathVarsProvider.get(), appComponentImpl.coroutineExecutorProvider.get(), appComponentImpl.provideDefaultSharedPreferencesProvider.get());

          case 42: // pan.alexander.tordnscrypt.modules.ModulesStatusBroadcaster 
          return (T) new ModulesStatusBroadcaster(appComponentImpl.appContext, appComponentImpl.pathVarsProvider.get(), appComponentImpl.provideDefaultSharedPreferencesProvider.get());

          case 43: // pan.alexander.tordnscrypt.settings.dnscrypt_settings.RulesEraser 
          return (T) new RulesEraser((PreferenceRepository) ((Provider) appComponentImpl.preferenceRepositoryImplProvider).get(), appComponentImpl.pathVarsProvider.get(), appComponentImpl.remixExistingRulesWorkManagerProvider.get(), appComponentImpl.updateRemoteRulesWorkManagerProvider.get(), appComponentImpl.updateLocalRulesWorkManagerProvider.get());

          case 44: // pan.alexander.tordnscrypt.settings.dnscrypt_rules.receiver.DnsRulesReceiver 
          return (T) new DnsRulesReceiver(appComponentImpl.appContext);

          case 45: // pan.alexander.tordnscrypt.modules.ModulesReceiver 
          return (T) new ModulesReceiver(DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)), DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider), DoubleCheck.lazy(((Provider) appComponentImpl.connectionCheckerInteractorImplProvider)), appComponentImpl.internetSharingCheckerProvider, appComponentImpl.coroutineExecutorProvider.get(), DoubleCheck.lazy(appComponentImpl.provideMainHandlerProvider), DoubleCheck.lazy(appComponentImpl.torRestarterReconnectorProvider), DoubleCheck.lazy(appComponentImpl.installedAppNamesStorageProvider), DoubleCheck.lazy(appComponentImpl.pathVarsProvider));

          case 46: // pan.alexander.tordnscrypt.modules.TorRestarterReconnector 
          return (T) new TorRestarterReconnector(appComponentImpl.appContext, CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule), appComponentImpl.pathVarsProvider.get(), DoubleCheck.lazy(((Provider) appComponentImpl.connectionCheckerInteractorImplProvider)));

          case 47: // pan.alexander.tordnscrypt.utils.apps.InstalledAppNamesStorage 
          return (T) new InstalledAppNamesStorage(CoroutinesModule_ProvideDispatcherIoFactory.provideDispatcherIo(appComponentImpl.coroutinesModule));

          case 48: // pan.alexander.tordnscrypt.utils.portchecker.PortChecker 
          return (T) new PortChecker();

          case 49: // pan.alexander.tordnscrypt.utils.bootcomplete.BootCompleteManager 
          return (T) new BootCompleteManager(DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider), DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)), DoubleCheck.lazy(appComponentImpl.provideMainHandlerProvider), DoubleCheck.lazy(appComponentImpl.pathVarsProvider), DoubleCheck.lazy(appComponentImpl.apManagerProvider), DoubleCheck.lazy(appComponentImpl.modulesStatusBroadcasterProvider), DoubleCheck.lazy(appComponentImpl.updateIPsManagerProvider));

          case 50: // pan.alexander.tordnscrypt.utils.workers.UpdateIPsManager 
          return (T) new UpdateIPsManager(appComponentImpl.appContext);

          case 51: // pan.alexander.tordnscrypt.vpn.service.VpnBuilder 
          return (T) new VpnBuilder(appComponentImpl.appContext, DoubleCheck.lazy(((Provider) appComponentImpl.dnsInteractorImplProvider)), DoubleCheck.lazy(appComponentImpl.provideDefaultSharedPreferencesProvider), DoubleCheck.lazy(((Provider) appComponentImpl.preferenceRepositoryImplProvider)));

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
