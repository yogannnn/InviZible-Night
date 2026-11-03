package pan.alexander.tordnscrypt.utils.executors;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;

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
public final class CoroutineExecutor_Factory implements Factory<CoroutineExecutor> {
  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider;

  public CoroutineExecutor_Factory(Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.coroutineExceptionHandlerProvider = coroutineExceptionHandlerProvider;
  }

  @Override
  public CoroutineExecutor get() {
    return newInstance(baseCoroutineScopeProvider.get(), coroutineExceptionHandlerProvider.get());
  }

  public static CoroutineExecutor_Factory create(
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    return new CoroutineExecutor_Factory(Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(coroutineExceptionHandlerProvider));
  }

  public static CoroutineExecutor_Factory create(
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider) {
    return new CoroutineExecutor_Factory(baseCoroutineScopeProvider, coroutineExceptionHandlerProvider);
  }

  public static CoroutineExecutor newInstance(CoroutineScope baseCoroutineScope,
      CoroutineExceptionHandler coroutineExceptionHandler) {
    return new CoroutineExecutor(baseCoroutineScope, coroutineExceptionHandler);
  }
}
