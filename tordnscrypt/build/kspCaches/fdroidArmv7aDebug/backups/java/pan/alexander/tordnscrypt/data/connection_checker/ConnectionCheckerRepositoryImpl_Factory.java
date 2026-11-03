package pan.alexander.tordnscrypt.data.connection_checker;

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
public final class ConnectionCheckerRepositoryImpl_Factory implements Factory<ConnectionCheckerRepositoryImpl> {
  private final Provider<ConnectionCheckerDataSource> connectionCheckerDataSourceProvider;

  public ConnectionCheckerRepositoryImpl_Factory(
      Provider<ConnectionCheckerDataSource> connectionCheckerDataSourceProvider) {
    this.connectionCheckerDataSourceProvider = connectionCheckerDataSourceProvider;
  }

  @Override
  public ConnectionCheckerRepositoryImpl get() {
    return newInstance(connectionCheckerDataSourceProvider.get());
  }

  public static ConnectionCheckerRepositoryImpl_Factory create(
      javax.inject.Provider<ConnectionCheckerDataSource> connectionCheckerDataSourceProvider) {
    return new ConnectionCheckerRepositoryImpl_Factory(Providers.asDaggerProvider(connectionCheckerDataSourceProvider));
  }

  public static ConnectionCheckerRepositoryImpl_Factory create(
      Provider<ConnectionCheckerDataSource> connectionCheckerDataSourceProvider) {
    return new ConnectionCheckerRepositoryImpl_Factory(connectionCheckerDataSourceProvider);
  }

  public static ConnectionCheckerRepositoryImpl newInstance(
      ConnectionCheckerDataSource connectionCheckerDataSource) {
    return new ConnectionCheckerRepositoryImpl(connectionCheckerDataSource);
  }
}
