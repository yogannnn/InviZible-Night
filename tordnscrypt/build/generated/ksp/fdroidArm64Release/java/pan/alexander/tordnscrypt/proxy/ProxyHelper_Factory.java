package pan.alexander.tordnscrypt.proxy;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

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
public final class ProxyHelper_Factory implements Factory<ProxyHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public ProxyHelper_Factory(Provider<Context> contextProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public ProxyHelper get() {
    return newInstance(contextProvider.get(), pathVarsProvider.get(), executorProvider.get(), defaultPreferencesProvider.get());
  }

  public static ProxyHelper_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ProxyHelper_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static ProxyHelper_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ProxyHelper_Factory(contextProvider, pathVarsProvider, executorProvider, defaultPreferencesProvider);
  }

  public static ProxyHelper newInstance(Context context, PathVars pathVars,
      CoroutineExecutor executor, SharedPreferences defaultPreferences) {
    return new ProxyHelper(context, pathVars, executor, defaultPreferences);
  }
}
