package pan.alexander.tordnscrypt.tiles;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;

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
public final class ChangeTorIpTileManager_Factory implements Factory<ChangeTorIpTileManager> {
  private final Provider<MainCoroutineDispatcher> dispatcherMainProvider;

  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider;

  private final Provider<Context> contextProvider;

  public ChangeTorIpTileManager_Factory(Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      Provider<Context> contextProvider) {
    this.dispatcherMainProvider = dispatcherMainProvider;
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.coroutineExceptionHandlerProvider = coroutineExceptionHandlerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public ChangeTorIpTileManager get() {
    return newInstance(dispatcherMainProvider.get(), baseCoroutineScopeProvider.get(), coroutineExceptionHandlerProvider.get(), contextProvider.get());
  }

  public static ChangeTorIpTileManager_Factory create(
      javax.inject.Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      javax.inject.Provider<Context> contextProvider) {
    return new ChangeTorIpTileManager_Factory(Providers.asDaggerProvider(dispatcherMainProvider), Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(coroutineExceptionHandlerProvider), Providers.asDaggerProvider(contextProvider));
  }

  public static ChangeTorIpTileManager_Factory create(
      Provider<MainCoroutineDispatcher> dispatcherMainProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      Provider<Context> contextProvider) {
    return new ChangeTorIpTileManager_Factory(dispatcherMainProvider, baseCoroutineScopeProvider, coroutineExceptionHandlerProvider, contextProvider);
  }

  public static ChangeTorIpTileManager newInstance(MainCoroutineDispatcher dispatcherMain,
      CoroutineScope baseCoroutineScope, CoroutineExceptionHandler coroutineExceptionHandler,
      Context context) {
    return new ChangeTorIpTileManager(dispatcherMain, baseCoroutineScope, coroutineExceptionHandler, context);
  }
}
