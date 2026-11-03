package pan.alexander.tordnscrypt.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineExceptionHandler;

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
public final class CoroutinesModule_ProvideCoroutineExceptionHandlerFactory implements Factory<CoroutineExceptionHandler> {
  private final CoroutinesModule module;

  public CoroutinesModule_ProvideCoroutineExceptionHandlerFactory(CoroutinesModule module) {
    this.module = module;
  }

  @Override
  public CoroutineExceptionHandler get() {
    return provideCoroutineExceptionHandler(module);
  }

  public static CoroutinesModule_ProvideCoroutineExceptionHandlerFactory create(
      CoroutinesModule module) {
    return new CoroutinesModule_ProvideCoroutineExceptionHandlerFactory(module);
  }

  public static CoroutineExceptionHandler provideCoroutineExceptionHandler(
      CoroutinesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCoroutineExceptionHandler());
  }
}
