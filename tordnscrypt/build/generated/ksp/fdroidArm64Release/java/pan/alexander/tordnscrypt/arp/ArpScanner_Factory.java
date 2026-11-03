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
public final class ArpScanner_Factory implements Factory<ArpScanner> {
  private final Provider<ArpScannerLoop> arpScannerLoopProvider;

  private final Provider<ArpScannerHelper> arpScannerHelperProvider;

  private final Provider<ArpRelatedUiUpdater> uiUpdaterProvider;

  private final Provider<ConnectionManager> connectionManagerProvider;

  public ArpScanner_Factory(Provider<ArpScannerLoop> arpScannerLoopProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider,
      Provider<ArpRelatedUiUpdater> uiUpdaterProvider,
      Provider<ConnectionManager> connectionManagerProvider) {
    this.arpScannerLoopProvider = arpScannerLoopProvider;
    this.arpScannerHelperProvider = arpScannerHelperProvider;
    this.uiUpdaterProvider = uiUpdaterProvider;
    this.connectionManagerProvider = connectionManagerProvider;
  }

  @Override
  public ArpScanner get() {
    return newInstance(DoubleCheck.lazy(arpScannerLoopProvider), DoubleCheck.lazy(arpScannerHelperProvider), DoubleCheck.lazy(uiUpdaterProvider), DoubleCheck.lazy(connectionManagerProvider));
  }

  public static ArpScanner_Factory create(
      javax.inject.Provider<ArpScannerLoop> arpScannerLoopProvider,
      javax.inject.Provider<ArpScannerHelper> arpScannerHelperProvider,
      javax.inject.Provider<ArpRelatedUiUpdater> uiUpdaterProvider,
      javax.inject.Provider<ConnectionManager> connectionManagerProvider) {
    return new ArpScanner_Factory(Providers.asDaggerProvider(arpScannerLoopProvider), Providers.asDaggerProvider(arpScannerHelperProvider), Providers.asDaggerProvider(uiUpdaterProvider), Providers.asDaggerProvider(connectionManagerProvider));
  }

  public static ArpScanner_Factory create(Provider<ArpScannerLoop> arpScannerLoopProvider,
      Provider<ArpScannerHelper> arpScannerHelperProvider,
      Provider<ArpRelatedUiUpdater> uiUpdaterProvider,
      Provider<ConnectionManager> connectionManagerProvider) {
    return new ArpScanner_Factory(arpScannerLoopProvider, arpScannerHelperProvider, uiUpdaterProvider, connectionManagerProvider);
  }

  public static ArpScanner newInstance(Lazy<ArpScannerLoop> arpScannerLoop,
      Lazy<ArpScannerHelper> arpScannerHelper, Lazy<ArpRelatedUiUpdater> uiUpdater,
      Lazy<ConnectionManager> connectionManager) {
    return new ArpScanner(arpScannerLoop, arpScannerHelper, uiUpdater, connectionManager);
  }
}
