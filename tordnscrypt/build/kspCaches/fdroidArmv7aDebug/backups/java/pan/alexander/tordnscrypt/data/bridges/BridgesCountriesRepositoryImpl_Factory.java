package pan.alexander.tordnscrypt.data.bridges;

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
public final class BridgesCountriesRepositoryImpl_Factory implements Factory<BridgesCountriesRepositoryImpl> {
  private final Provider<BridgesCountriesDataSource> bridgesCountriesDataSourceProvider;

  public BridgesCountriesRepositoryImpl_Factory(
      Provider<BridgesCountriesDataSource> bridgesCountriesDataSourceProvider) {
    this.bridgesCountriesDataSourceProvider = bridgesCountriesDataSourceProvider;
  }

  @Override
  public BridgesCountriesRepositoryImpl get() {
    return newInstance(bridgesCountriesDataSourceProvider.get());
  }

  public static BridgesCountriesRepositoryImpl_Factory create(
      javax.inject.Provider<BridgesCountriesDataSource> bridgesCountriesDataSourceProvider) {
    return new BridgesCountriesRepositoryImpl_Factory(Providers.asDaggerProvider(bridgesCountriesDataSourceProvider));
  }

  public static BridgesCountriesRepositoryImpl_Factory create(
      Provider<BridgesCountriesDataSource> bridgesCountriesDataSourceProvider) {
    return new BridgesCountriesRepositoryImpl_Factory(bridgesCountriesDataSourceProvider);
  }

  public static BridgesCountriesRepositoryImpl newInstance(
      BridgesCountriesDataSource bridgesCountriesDataSource) {
    return new BridgesCountriesRepositoryImpl(bridgesCountriesDataSource);
  }
}
