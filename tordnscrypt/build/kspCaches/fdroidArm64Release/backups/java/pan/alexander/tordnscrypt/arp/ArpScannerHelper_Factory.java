package pan.alexander.tordnscrypt.arp;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

@ScopeMetadata("pan.alexander.tordnscrypt.di.arp.ArpScope")
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
public final class ArpScannerHelper_Factory implements Factory<ArpScannerHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  private final Provider<PreferenceRepository> appPreferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<DefaultGatewayManager> defaultGatewayManagerProvider;

  private final Provider<ArpTableManager> arpTableManagerProvider;

  private final Provider<ArpScannerLoop> arpScannerLoopProvider;

  private final Provider<ArpRelatedUiUpdater> uiUpdaterProvider;

  public ArpScannerHelper_Factory(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PreferenceRepository> appPreferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<DefaultGatewayManager> defaultGatewayManagerProvider,
      Provider<ArpTableManager> arpTableManagerProvider,
      Provider<ArpScannerLoop> arpScannerLoopProvider,
      Provider<ArpRelatedUiUpdater> uiUpdaterProvider) {
    this.contextProvider = contextProvider;
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
    this.appPreferenceRepositoryProvider = appPreferenceRepositoryProvider;
    this.executorProvider = executorProvider;
    this.defaultGatewayManagerProvider = defaultGatewayManagerProvider;
    this.arpTableManagerProvider = arpTableManagerProvider;
    this.arpScannerLoopProvider = arpScannerLoopProvider;
    this.uiUpdaterProvider = uiUpdaterProvider;
  }

  @Override
  public ArpScannerHelper get() {
    return newInstance(contextProvider.get(), defaultSharedPreferencesProvider.get(), appPreferenceRepositoryProvider.get(), executorProvider.get(), DoubleCheck.lazy(defaultGatewayManagerProvider), DoubleCheck.lazy(arpTableManagerProvider), DoubleCheck.lazy(arpScannerLoopProvider), DoubleCheck.lazy(uiUpdaterProvider));
  }

  public static ArpScannerHelper_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> appPreferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<DefaultGatewayManager> defaultGatewayManagerProvider,
      javax.inject.Provider<ArpTableManager> arpTableManagerProvider,
      javax.inject.Provider<ArpScannerLoop> arpScannerLoopProvider,
      javax.inject.Provider<ArpRelatedUiUpdater> uiUpdaterProvider) {
    return new ArpScannerHelper_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(defaultSharedPreferencesProvider), Providers.asDaggerProvider(appPreferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(defaultGatewayManagerProvider), Providers.asDaggerProvider(arpTableManagerProvider), Providers.asDaggerProvider(arpScannerLoopProvider), Providers.asDaggerProvider(uiUpdaterProvider));
  }

  public static ArpScannerHelper_Factory create(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PreferenceRepository> appPreferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<DefaultGatewayManager> defaultGatewayManagerProvider,
      Provider<ArpTableManager> arpTableManagerProvider,
      Provider<ArpScannerLoop> arpScannerLoopProvider,
      Provider<ArpRelatedUiUpdater> uiUpdaterProvider) {
    return new ArpScannerHelper_Factory(contextProvider, defaultSharedPreferencesProvider, appPreferenceRepositoryProvider, executorProvider, defaultGatewayManagerProvider, arpTableManagerProvider, arpScannerLoopProvider, uiUpdaterProvider);
  }

  public static ArpScannerHelper newInstance(Context context,
      SharedPreferences defaultSharedPreferences, PreferenceRepository appPreferenceRepository,
      CoroutineExecutor executor, Lazy<DefaultGatewayManager> defaultGatewayManager,
      Lazy<ArpTableManager> arpTableManager, Lazy<ArpScannerLoop> arpScannerLoop,
      Lazy<ArpRelatedUiUpdater> uiUpdater) {
    return new ArpScannerHelper(context, defaultSharedPreferences, appPreferenceRepository, executor, defaultGatewayManager, arpTableManager, arpScannerLoop, uiUpdater);
  }
}
