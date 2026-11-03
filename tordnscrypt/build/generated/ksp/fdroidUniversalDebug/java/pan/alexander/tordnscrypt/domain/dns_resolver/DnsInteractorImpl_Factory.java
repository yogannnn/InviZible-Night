package pan.alexander.tordnscrypt.domain.dns_resolver;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class DnsInteractorImpl_Factory implements Factory<DnsInteractorImpl> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<DnsRepository> dnsRepositoryProvider;

  public DnsInteractorImpl_Factory(Provider<PathVars> pathVarsProvider,
      Provider<DnsRepository> dnsRepositoryProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.dnsRepositoryProvider = dnsRepositoryProvider;
  }

  @Override
  public DnsInteractorImpl get() {
    return newInstance(pathVarsProvider.get(), dnsRepositoryProvider.get());
  }

  public static DnsInteractorImpl_Factory create(javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<DnsRepository> dnsRepositoryProvider) {
    return new DnsInteractorImpl_Factory(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(dnsRepositoryProvider));
  }

  public static DnsInteractorImpl_Factory create(Provider<PathVars> pathVarsProvider,
      Provider<DnsRepository> dnsRepositoryProvider) {
    return new DnsInteractorImpl_Factory(pathVarsProvider, dnsRepositoryProvider);
  }

  public static DnsInteractorImpl newInstance(PathVars pathVars, DnsRepository dnsRepository) {
    return new DnsInteractorImpl(pathVars, dnsRepository);
  }
}
