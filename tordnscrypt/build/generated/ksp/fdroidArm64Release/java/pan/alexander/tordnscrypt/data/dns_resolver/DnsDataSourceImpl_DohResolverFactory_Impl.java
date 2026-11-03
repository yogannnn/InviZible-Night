package pan.alexander.tordnscrypt.data.dns_resolver;

import dagger.internal.DaggerGenerated;
import dagger.internal.InstanceFactory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import pan.alexander.tordnscrypt.utils.dns.DohResolver;
import pan.alexander.tordnscrypt.utils.dns.DohResolver_Factory;

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
public final class DnsDataSourceImpl_DohResolverFactory_Impl implements DnsDataSourceImpl.DohResolverFactory {
  private final DohResolver_Factory delegateFactory;

  DnsDataSourceImpl_DohResolverFactory_Impl(DohResolver_Factory delegateFactory) {
    this.delegateFactory = delegateFactory;
  }

  @Override
  public DohResolver createDohResolver(String domain, int type, int timeout) {
    return delegateFactory.get(domain, type, timeout);
  }

  public static Provider<DnsDataSourceImpl.DohResolverFactory> create(
      DohResolver_Factory delegateFactory) {
    return InstanceFactory.create(new DnsDataSourceImpl_DohResolverFactory_Impl(delegateFactory));
  }

  public static dagger.internal.Provider<DnsDataSourceImpl.DohResolverFactory> createFactoryProvider(
      DohResolver_Factory delegateFactory) {
    return InstanceFactory.create(new DnsDataSourceImpl_DohResolverFactory_Impl(delegateFactory));
  }
}
