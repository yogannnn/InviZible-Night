package pan.alexander.tordnscrypt.data.dns_resolver;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class DnsDataSourceImpl_Factory implements Factory<DnsDataSourceImpl> {
  private final Provider<DnsDataSourceImpl.UdpResolverFactory> udpResolverFactoryProvider;

  private final Provider<DnsDataSourceImpl.DohResolverFactory> dohResolverFactoryProvider;

  public DnsDataSourceImpl_Factory(
      Provider<DnsDataSourceImpl.UdpResolverFactory> udpResolverFactoryProvider,
      Provider<DnsDataSourceImpl.DohResolverFactory> dohResolverFactoryProvider) {
    this.udpResolverFactoryProvider = udpResolverFactoryProvider;
    this.dohResolverFactoryProvider = dohResolverFactoryProvider;
  }

  @Override
  public DnsDataSourceImpl get() {
    return newInstance(udpResolverFactoryProvider.get(), dohResolverFactoryProvider.get());
  }

  public static DnsDataSourceImpl_Factory create(
      javax.inject.Provider<DnsDataSourceImpl.UdpResolverFactory> udpResolverFactoryProvider,
      javax.inject.Provider<DnsDataSourceImpl.DohResolverFactory> dohResolverFactoryProvider) {
    return new DnsDataSourceImpl_Factory(Providers.asDaggerProvider(udpResolverFactoryProvider), Providers.asDaggerProvider(dohResolverFactoryProvider));
  }

  public static DnsDataSourceImpl_Factory create(
      Provider<DnsDataSourceImpl.UdpResolverFactory> udpResolverFactoryProvider,
      Provider<DnsDataSourceImpl.DohResolverFactory> dohResolverFactoryProvider) {
    return new DnsDataSourceImpl_Factory(udpResolverFactoryProvider, dohResolverFactoryProvider);
  }

  public static DnsDataSourceImpl newInstance(
      DnsDataSourceImpl.UdpResolverFactory udpResolverFactory,
      DnsDataSourceImpl.DohResolverFactory dohResolverFactory) {
    return new DnsDataSourceImpl(udpResolverFactory, dohResolverFactory);
  }
}
