package pan.alexander.tordnscrypt.data.dnscrypt_relays;

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
public final class RelaysPingRepositoryImpl_Factory implements Factory<RelaysPingRepositoryImpl> {
  private final Provider<RelaysPingDataSource> relaysPingDataSourceProvider;

  public RelaysPingRepositoryImpl_Factory(
      Provider<RelaysPingDataSource> relaysPingDataSourceProvider) {
    this.relaysPingDataSourceProvider = relaysPingDataSourceProvider;
  }

  @Override
  public RelaysPingRepositoryImpl get() {
    return newInstance(relaysPingDataSourceProvider.get());
  }

  public static RelaysPingRepositoryImpl_Factory create(
      javax.inject.Provider<RelaysPingDataSource> relaysPingDataSourceProvider) {
    return new RelaysPingRepositoryImpl_Factory(Providers.asDaggerProvider(relaysPingDataSourceProvider));
  }

  public static RelaysPingRepositoryImpl_Factory create(
      Provider<RelaysPingDataSource> relaysPingDataSourceProvider) {
    return new RelaysPingRepositoryImpl_Factory(relaysPingDataSourceProvider);
  }

  public static RelaysPingRepositoryImpl newInstance(RelaysPingDataSource relaysPingDataSource) {
    return new RelaysPingRepositoryImpl(relaysPingDataSource);
  }
}
