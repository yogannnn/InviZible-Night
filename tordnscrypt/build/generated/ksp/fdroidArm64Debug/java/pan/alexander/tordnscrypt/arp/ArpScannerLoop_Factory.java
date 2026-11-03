package pan.alexander.tordnscrypt.arp;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("pan.alexander.tordnscrypt.di.arp.ArpScope")
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
public final class ArpScannerLoop_Factory implements Factory<ArpScannerLoop> {
  private final Provider<ArpWarningNotification> arpWarningNotificationProvider;

  private final Provider<ArpRelatedUiUpdater> uiUpdaterProvider;

  private final Provider<ArpTableManager> arpTableManagerProvider;

  private final Provider<ConnectionManager> connectionManagerProvider;

  private final Provider<ArpScannerHelper> arpScannerHelperProvider;

  private final Provider<DefaultGatewayManager> defaultGatewayManagerProvider;

  private final Provider<CommandExecutor> commandExecutorProvider;

  public ArpScannerLoop_Factory(Provider<ArpWarningNotification> arpWarningNotificationProvider,
      Provider<ArpRelatedUiUpdater> uiUpdaterProvider,
      Provider<ArpTableManager> arpTableManagerProvider,
      Provider<ConnectionManager> connectionManagerProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider,
      Provider<DefaultGatewayManager> defaultGatewayManagerProvider,
      Provider<CommandExecutor> commandExecutorProvider) {
    this.arpWarningNotificationProvider = arpWarningNotificationProvider;
    this.uiUpdaterProvider = uiUpdaterProvider;
    this.arpTableManagerProvider = arpTableManagerProvider;
    this.connectionManagerProvider = connectionManagerProvider;
    this.arpScannerHelperProvider = arpScannerHelperProvider;
    this.defaultGatewayManagerProvider = defaultGatewayManagerProvider;
    this.commandExecutorProvider = commandExecutorProvider;
  }

  @Override
  public ArpScannerLoop get() {
    return newInstance(arpWarningNotificationProvider.get(), uiUpdaterProvider.get(), arpTableManagerProvider.get(), connectionManagerProvider.get(), arpScannerHelperProvider.get(), defaultGatewayManagerProvider.get(), commandExecutorProvider.get());
  }

  public static ArpScannerLoop_Factory create(
      javax.inject.Provider<ArpWarningNotification> arpWarningNotificationProvider,
      javax.inject.Provider<ArpRelatedUiUpdater> uiUpdaterProvider,
      javax.inject.Provider<ArpTableManager> arpTableManagerProvider,
      javax.inject.Provider<ConnectionManager> connectionManagerProvider,
      javax.inject.Provider<ArpScannerHelper> arpScannerHelperProvider,
      javax.inject.Provider<DefaultGatewayManager> defaultGatewayManagerProvider,
      javax.inject.Provider<CommandExecutor> commandExecutorProvider) {
    return new ArpScannerLoop_Factory(Providers.asDaggerProvider(arpWarningNotificationProvider), Providers.asDaggerProvider(uiUpdaterProvider), Providers.asDaggerProvider(arpTableManagerProvider), Providers.asDaggerProvider(connectionManagerProvider), Providers.asDaggerProvider(arpScannerHelperProvider), Providers.asDaggerProvider(defaultGatewayManagerProvider), Providers.asDaggerProvider(commandExecutorProvider));
  }

  public static ArpScannerLoop_Factory create(
      Provider<ArpWarningNotification> arpWarningNotificationProvider,
      Provider<ArpRelatedUiUpdater> uiUpdaterProvider,
      Provider<ArpTableManager> arpTableManagerProvider,
      Provider<ConnectionManager> connectionManagerProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider,
      Provider<DefaultGatewayManager> defaultGatewayManagerProvider,
      Provider<CommandExecutor> commandExecutorProvider) {
    return new ArpScannerLoop_Factory(arpWarningNotificationProvider, uiUpdaterProvider, arpTableManagerProvider, connectionManagerProvider, arpScannerHelperProvider, defaultGatewayManagerProvider, commandExecutorProvider);
  }

  public static ArpScannerLoop newInstance(ArpWarningNotification arpWarningNotification,
      ArpRelatedUiUpdater uiUpdater, ArpTableManager arpTableManager,
      ConnectionManager connectionManager, ArpScannerHelper arpScannerHelper,
      DefaultGatewayManager defaultGatewayManager, CommandExecutor commandExecutor) {
    return new ArpScannerLoop(arpWarningNotification, uiUpdater, arpTableManager, connectionManager, arpScannerHelper, defaultGatewayManager, commandExecutor);
  }
}
