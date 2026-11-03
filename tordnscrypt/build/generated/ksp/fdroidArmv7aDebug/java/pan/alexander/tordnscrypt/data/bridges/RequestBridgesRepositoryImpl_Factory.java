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
public final class RequestBridgesRepositoryImpl_Factory implements Factory<RequestBridgesRepositoryImpl> {
  private final Provider<RequestBridgesDataSource> requestBridgesDataSourceProvider;

  public RequestBridgesRepositoryImpl_Factory(
      Provider<RequestBridgesDataSource> requestBridgesDataSourceProvider) {
    this.requestBridgesDataSourceProvider = requestBridgesDataSourceProvider;
  }

  @Override
  public RequestBridgesRepositoryImpl get() {
    return newInstance(requestBridgesDataSourceProvider.get());
  }

  public static RequestBridgesRepositoryImpl_Factory create(
      javax.inject.Provider<RequestBridgesDataSource> requestBridgesDataSourceProvider) {
    return new RequestBridgesRepositoryImpl_Factory(Providers.asDaggerProvider(requestBridgesDataSourceProvider));
  }

  public static RequestBridgesRepositoryImpl_Factory create(
      Provider<RequestBridgesDataSource> requestBridgesDataSourceProvider) {
    return new RequestBridgesRepositoryImpl_Factory(requestBridgesDataSourceProvider);
  }

  public static RequestBridgesRepositoryImpl newInstance(
      RequestBridgesDataSource requestBridgesDataSource) {
    return new RequestBridgesRepositoryImpl(requestBridgesDataSource);
  }
}
