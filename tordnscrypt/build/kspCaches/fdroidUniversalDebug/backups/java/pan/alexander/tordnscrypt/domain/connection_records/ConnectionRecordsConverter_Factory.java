package pan.alexander.tordnscrypt.domain.connection_records;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.iptables.IptablesFirewall;
import pan.alexander.tordnscrypt.utils.connectivitycheck.ConnectivityCheckManager;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

@ScopeMetadata
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
public final class ConnectionRecordsConverter_Factory implements Factory<ConnectionRecordsConverter> {
  private final Provider<Context> contextProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<DnsInteractor> dnsInteractorProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<ConnectivityCheckManager> connectivityCheckManagerProvider;

  private final Provider<IptablesFirewall> iptablesFirewallProvider;

  public ConnectionRecordsConverter_Factory(Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<DnsInteractor> dnsInteractorProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      Provider<IptablesFirewall> iptablesFirewallProvider) {
    this.contextProvider = contextProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.dnsInteractorProvider = dnsInteractorProvider;
    this.executorProvider = executorProvider;
    this.connectivityCheckManagerProvider = connectivityCheckManagerProvider;
    this.iptablesFirewallProvider = iptablesFirewallProvider;
  }

  @Override
  public ConnectionRecordsConverter get() {
    return newInstance(contextProvider.get(), preferenceRepositoryProvider.get(), DoubleCheck.lazy(dnsInteractorProvider), executorProvider.get(), connectivityCheckManagerProvider.get(), DoubleCheck.lazy(iptablesFirewallProvider));
  }

  public static ConnectionRecordsConverter_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<DnsInteractor> dnsInteractorProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      javax.inject.Provider<IptablesFirewall> iptablesFirewallProvider) {
    return new ConnectionRecordsConverter_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(dnsInteractorProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(connectivityCheckManagerProvider), Providers.asDaggerProvider(iptablesFirewallProvider));
  }

  public static ConnectionRecordsConverter_Factory create(Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<DnsInteractor> dnsInteractorProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      Provider<IptablesFirewall> iptablesFirewallProvider) {
    return new ConnectionRecordsConverter_Factory(contextProvider, preferenceRepositoryProvider, dnsInteractorProvider, executorProvider, connectivityCheckManagerProvider, iptablesFirewallProvider);
  }

  public static ConnectionRecordsConverter newInstance(Context context,
      PreferenceRepository preferenceRepository, Lazy<DnsInteractor> dnsInteractor,
      CoroutineExecutor executor, ConnectivityCheckManager connectivityCheckManager,
      Lazy<IptablesFirewall> iptablesFirewall) {
    return new ConnectionRecordsConverter(context, preferenceRepository, dnsInteractor, executor, connectivityCheckManager, iptablesFirewall);
  }
}
