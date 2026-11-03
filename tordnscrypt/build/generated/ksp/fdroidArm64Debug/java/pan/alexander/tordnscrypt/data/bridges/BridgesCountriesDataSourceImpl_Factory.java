package pan.alexander.tordnscrypt.data.bridges;

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
public final class BridgesCountriesDataSourceImpl_Factory implements Factory<BridgesCountriesDataSourceImpl> {
  private final Provider<PathVars> pathVarsProvider;

  public BridgesCountriesDataSourceImpl_Factory(Provider<PathVars> pathVarsProvider) {
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public BridgesCountriesDataSourceImpl get() {
    return newInstance(pathVarsProvider.get());
  }

  public static BridgesCountriesDataSourceImpl_Factory create(
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new BridgesCountriesDataSourceImpl_Factory(Providers.asDaggerProvider(pathVarsProvider));
  }

  public static BridgesCountriesDataSourceImpl_Factory create(Provider<PathVars> pathVarsProvider) {
    return new BridgesCountriesDataSourceImpl_Factory(pathVarsProvider);
  }

  public static BridgesCountriesDataSourceImpl newInstance(PathVars pathVars) {
    return new BridgesCountriesDataSourceImpl(pathVars);
  }
}
