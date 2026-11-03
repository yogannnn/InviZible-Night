package pan.alexander.tordnscrypt.data.dns_rules;

import android.content.Context;
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
public final class DnsRulesDataSourceImpl_Factory implements Factory<DnsRulesDataSourceImpl> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  public DnsRulesDataSourceImpl_Factory(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public DnsRulesDataSourceImpl get() {
    return newInstance(contextProvider.get(), pathVarsProvider.get());
  }

  public static DnsRulesDataSourceImpl_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new DnsRulesDataSourceImpl_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static DnsRulesDataSourceImpl_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider) {
    return new DnsRulesDataSourceImpl_Factory(contextProvider, pathVarsProvider);
  }

  public static DnsRulesDataSourceImpl newInstance(Context context, PathVars pathVars) {
    return new DnsRulesDataSourceImpl(context, pathVars);
  }
}
