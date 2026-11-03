package pan.alexander.tordnscrypt.arp;

import android.content.Context;
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
public final class DefaultGatewayManager_Factory implements Factory<DefaultGatewayManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ConnectionManager> connectionManagerProvider;

  private final Provider<CommandExecutor> commandExecutorProvider;

  private final Provider<ArpScannerHelper> arpScannerHelperProvider;

  public DefaultGatewayManager_Factory(Provider<Context> contextProvider,
      Provider<ConnectionManager> connectionManagerProvider,
      Provider<CommandExecutor> commandExecutorProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider) {
    this.contextProvider = contextProvider;
    this.connectionManagerProvider = connectionManagerProvider;
    this.commandExecutorProvider = commandExecutorProvider;
    this.arpScannerHelperProvider = arpScannerHelperProvider;
  }

  @Override
  public DefaultGatewayManager get() {
    return newInstance(contextProvider.get(), connectionManagerProvider.get(), commandExecutorProvider.get(), arpScannerHelperProvider.get());
  }

  public static DefaultGatewayManager_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<ConnectionManager> connectionManagerProvider,
      javax.inject.Provider<CommandExecutor> commandExecutorProvider,
      javax.inject.Provider<ArpScannerHelper> arpScannerHelperProvider) {
    return new DefaultGatewayManager_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(connectionManagerProvider), Providers.asDaggerProvider(commandExecutorProvider), Providers.asDaggerProvider(arpScannerHelperProvider));
  }

  public static DefaultGatewayManager_Factory create(Provider<Context> contextProvider,
      Provider<ConnectionManager> connectionManagerProvider,
      Provider<CommandExecutor> commandExecutorProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider) {
    return new DefaultGatewayManager_Factory(contextProvider, connectionManagerProvider, commandExecutorProvider, arpScannerHelperProvider);
  }

  public static DefaultGatewayManager newInstance(Context context,
      ConnectionManager connectionManager, CommandExecutor commandExecutor,
      ArpScannerHelper arpScannerHelper) {
    return new DefaultGatewayManager(context, connectionManager, commandExecutor, arpScannerHelper);
  }
}
