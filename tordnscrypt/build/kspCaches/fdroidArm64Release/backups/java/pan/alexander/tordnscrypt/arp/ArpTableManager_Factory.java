package pan.alexander.tordnscrypt.arp;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
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
public final class ArpTableManager_Factory implements Factory<ArpTableManager> {
  private final Provider<CommandExecutor> commandExecutorProvider;

  private final Provider<ArpScannerHelper> arpScannerHelperProvider;

  public ArpTableManager_Factory(Provider<CommandExecutor> commandExecutorProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider) {
    this.commandExecutorProvider = commandExecutorProvider;
    this.arpScannerHelperProvider = arpScannerHelperProvider;
  }

  @Override
  public ArpTableManager get() {
    return newInstance(DoubleCheck.lazy(commandExecutorProvider), DoubleCheck.lazy(arpScannerHelperProvider));
  }

  public static ArpTableManager_Factory create(
      javax.inject.Provider<CommandExecutor> commandExecutorProvider,
      javax.inject.Provider<ArpScannerHelper> arpScannerHelperProvider) {
    return new ArpTableManager_Factory(Providers.asDaggerProvider(commandExecutorProvider), Providers.asDaggerProvider(arpScannerHelperProvider));
  }

  public static ArpTableManager_Factory create(Provider<CommandExecutor> commandExecutorProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider) {
    return new ArpTableManager_Factory(commandExecutorProvider, arpScannerHelperProvider);
  }

  public static ArpTableManager newInstance(Lazy<CommandExecutor> commandExecutor,
      Lazy<ArpScannerHelper> arpScannerHelper) {
    return new ArpTableManager(commandExecutor, arpScannerHelper);
  }
}
