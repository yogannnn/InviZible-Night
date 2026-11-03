package pan.alexander.tordnscrypt.settings.itpd_settings;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
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
public final class ItpdSubscriptionsViewModel_Factory implements Factory<ItpdSubscriptionsViewModel> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider;

  public ItpdSubscriptionsViewModel_Factory(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.coroutineExceptionHandlerProvider = coroutineExceptionHandlerProvider;
  }

  @Override
  public ItpdSubscriptionsViewModel get() {
    return newInstance(pathVarsProvider.get(), dispatcherIoProvider.get(), baseCoroutineScopeProvider.get(), coroutineExceptionHandlerProvider.get());
  }

  public static ItpdSubscriptionsViewModel_Factory create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    return new ItpdSubscriptionsViewModel_Factory(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(coroutineExceptionHandlerProvider));
  }

  public static ItpdSubscriptionsViewModel_Factory create(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    return new ItpdSubscriptionsViewModel_Factory(pathVarsProvider, dispatcherIoProvider, baseCoroutineScopeProvider, coroutineExceptionHandlerProvider);
  }

  public static ItpdSubscriptionsViewModel newInstance(PathVars pathVars,
      CoroutineDispatcher dispatcherIo, CoroutineScope baseCoroutineScope,
      CoroutineExceptionHandler coroutineExceptionHandler) {
    return new ItpdSubscriptionsViewModel(pathVars, dispatcherIo, baseCoroutineScope, coroutineExceptionHandler);
  }
}
