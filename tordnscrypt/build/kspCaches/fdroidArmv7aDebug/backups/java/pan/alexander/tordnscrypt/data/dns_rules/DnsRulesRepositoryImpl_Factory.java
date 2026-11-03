package pan.alexander.tordnscrypt.data.dns_rules;

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
public final class DnsRulesRepositoryImpl_Factory implements Factory<DnsRulesRepositoryImpl> {
  private final Provider<DnsRulesDataSource> dataSourceProvider;

  private final Provider<PathVars> pathVarsProvider;

  public DnsRulesRepositoryImpl_Factory(Provider<DnsRulesDataSource> dataSourceProvider,
      Provider<PathVars> pathVarsProvider) {
    this.dataSourceProvider = dataSourceProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public DnsRulesRepositoryImpl get() {
    return newInstance(dataSourceProvider.get(), pathVarsProvider.get());
  }

  public static DnsRulesRepositoryImpl_Factory create(
      javax.inject.Provider<DnsRulesDataSource> dataSourceProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new DnsRulesRepositoryImpl_Factory(Providers.asDaggerProvider(dataSourceProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static DnsRulesRepositoryImpl_Factory create(
      Provider<DnsRulesDataSource> dataSourceProvider, Provider<PathVars> pathVarsProvider) {
    return new DnsRulesRepositoryImpl_Factory(dataSourceProvider, pathVarsProvider);
  }

  public static DnsRulesRepositoryImpl newInstance(DnsRulesDataSource dataSource,
      PathVars pathVars) {
    return new DnsRulesRepositoryImpl(dataSource, pathVars);
  }
}
