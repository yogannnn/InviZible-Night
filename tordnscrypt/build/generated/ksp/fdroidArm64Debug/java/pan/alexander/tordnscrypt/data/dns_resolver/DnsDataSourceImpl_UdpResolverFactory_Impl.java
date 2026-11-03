package pan.alexander.tordnscrypt.data.dns_resolver;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import pan.alexander.tordnscrypt.utils.dns.UdpResolver;
import pan.alexander.tordnscrypt.utils.dns.UdpResolver_Factory;

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
public final class DnsDataSourceImpl_UdpResolverFactory_Impl implements DnsDataSourceImpl.UdpResolverFactory {
  private final UdpResolver_Factory delegateFactory;

  DnsDataSourceImpl_UdpResolverFactory_Impl(UdpResolver_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public UdpResolver createUdpResolver(String domain, int port, int type, int timeout) {
    return delegateFactory.get(domain, port, type, timeout);
  }

  public static Provider<DnsDataSourceImpl.UdpResolverFactory> create(
      UdpResolver_Factory delegateFactory) {
    return InstanceFactory.create(new DnsDataSourceImpl_UdpResolverFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<DnsDataSourceImpl.UdpResolverFactory> createFactoryProvider(
      UdpResolver_Factory delegateFactory) {
    return InstanceFactory.create(new DnsDataSourceImpl_UdpResolverFactory_Impl(delegateFactory));
  }
}
