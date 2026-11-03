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
public final class DnsRepositoryImpl_Factory implements Factory<DnsRepositoryImpl> {
  private final Provider<DnsDataSource> dnsDataSourceProvider;

  public DnsRepositoryImpl_Factory(Provider<DnsDataSource> dnsDataSourceProvider) {
    this.dnsDataSourceProvider = dnsDataSourceProvider;
  }

  @Override
  public DnsRepositoryImpl get() {
    return newInstance(dnsDataSourceProvider.get());
  }

  public static DnsRepositoryImpl_Factory create(
      javax.inject.Provider<DnsDataSource> dnsDataSourceProvider) {
    return new DnsRepositoryImpl_Factory(Providers.asDaggerProvider(dnsDataSourceProvider));
  }

  public static DnsRepositoryImpl_Factory create(Provider<DnsDataSource> dnsDataSourceProvider) {
    return new DnsRepositoryImpl_Factory(dnsDataSourceProvider);
  }

  public static DnsRepositoryImpl newInstance(DnsDataSource dnsDataSource) {
    return new DnsRepositoryImpl(dnsDataSource);
  }
}
