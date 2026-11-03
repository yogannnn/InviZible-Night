package pan.alexander.tordnscrypt.utils.web;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class HttpsConnectionManager_Factory implements Factory<HttpsConnectionManager> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public HttpsConnectionManager_Factory(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public HttpsConnectionManager get() {
    return newInstance(contextProvider.get(), pathVarsProvider.get(), defaultPreferencesProvider.get(), dispatcherIoProvider.get());
  }

  public static HttpsConnectionManager_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new HttpsConnectionManager_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static HttpsConnectionManager_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new HttpsConnectionManager_Factory(contextProvider, pathVarsProvider, defaultPreferencesProvider, dispatcherIoProvider);
  }

  public static HttpsConnectionManager newInstance(Context context, PathVars pathVars,
      SharedPreferences defaultPreferences, CoroutineDispatcher dispatcherIo) {
    return new HttpsConnectionManager(context, pathVars, defaultPreferences, dispatcherIo);
  }
}
