package pan.alexander.tordnscrypt.domain.bridges;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.executors.CachedExecutor;
import pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager;

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
public final class RequestBridgesInteractor_Factory implements Factory<RequestBridgesInteractor> {
  private final Provider<Context> contextProvider;

  private final Provider<RequestBridgesRepository> requestBridgesRepositoryProvider;

  private final Provider<CachedExecutor> cachedExecutorProvider;

  private final Provider<HttpsConnectionManager> httpsConnectionManagerProvider;

  public RequestBridgesInteractor_Factory(Provider<Context> contextProvider,
      Provider<RequestBridgesRepository> requestBridgesRepositoryProvider,
      Provider<CachedExecutor> cachedExecutorProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    this.contextProvider = contextProvider;
    this.requestBridgesRepositoryProvider = requestBridgesRepositoryProvider;
    this.cachedExecutorProvider = cachedExecutorProvider;
    this.httpsConnectionManagerProvider = httpsConnectionManagerProvider;
  }

  @Override
  public RequestBridgesInteractor get() {
    return newInstance(contextProvider.get(), requestBridgesRepositoryProvider.get(), cachedExecutorProvider.get(), httpsConnectionManagerProvider.get());
  }

  public static RequestBridgesInteractor_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<RequestBridgesRepository> requestBridgesRepositoryProvider,
      javax.inject.Provider<CachedExecutor> cachedExecutorProvider,
      javax.inject.Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new RequestBridgesInteractor_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(requestBridgesRepositoryProvider), Providers.asDaggerProvider(cachedExecutorProvider), Providers.asDaggerProvider(httpsConnectionManagerProvider));
  }

  public static RequestBridgesInteractor_Factory create(Provider<Context> contextProvider,
      Provider<RequestBridgesRepository> requestBridgesRepositoryProvider,
      Provider<CachedExecutor> cachedExecutorProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new RequestBridgesInteractor_Factory(contextProvider, requestBridgesRepositoryProvider, cachedExecutorProvider, httpsConnectionManagerProvider);
  }

  public static RequestBridgesInteractor newInstance(Context context,
      RequestBridgesRepository requestBridgesRepository, CachedExecutor cachedExecutor,
      HttpsConnectionManager httpsConnectionManager) {
    return new RequestBridgesInteractor(context, requestBridgesRepository, cachedExecutor, httpsConnectionManager);
  }
}
