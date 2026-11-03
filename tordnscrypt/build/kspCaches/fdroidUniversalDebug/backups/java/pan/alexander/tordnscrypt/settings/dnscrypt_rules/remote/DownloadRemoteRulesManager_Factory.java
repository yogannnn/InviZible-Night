package pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
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
public final class DownloadRemoteRulesManager_Factory implements Factory<DownloadRemoteRulesManager> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<HttpsConnectionManager> httpsConnectionManagerProvider;

  public DownloadRemoteRulesManager_Factory(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.httpsConnectionManagerProvider = httpsConnectionManagerProvider;
  }

  @Override
  public DownloadRemoteRulesManager get() {
    return newInstance(contextProvider.get(), pathVarsProvider.get(), dispatcherIoProvider.get(), httpsConnectionManagerProvider.get());
  }

  public static DownloadRemoteRulesManager_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new DownloadRemoteRulesManager_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(httpsConnectionManagerProvider));
  }

  public static DownloadRemoteRulesManager_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new DownloadRemoteRulesManager_Factory(contextProvider, pathVarsProvider, dispatcherIoProvider, httpsConnectionManagerProvider);
  }

  public static DownloadRemoteRulesManager newInstance(Context context, PathVars pathVars,
      CoroutineDispatcher dispatcherIo, HttpsConnectionManager httpsConnectionManager) {
    return new DownloadRemoteRulesManager(context, pathVars, dispatcherIo, httpsConnectionManager);
  }
}
