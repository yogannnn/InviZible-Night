package pan.alexander.tordnscrypt.di;

import android.os.Handler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class HandlerModule_ProvideMainHandlerFactory implements Factory<Handler> {
  private final HandlerModule module;

  public HandlerModule_ProvideMainHandlerFactory(HandlerModule module) {
    this.module = module;
  }

  @Override
  public Handler get() {
    return provideMainHandler(module);
  }

  public static HandlerModule_ProvideMainHandlerFactory create(HandlerModule module) {
    return new HandlerModule_ProvideMainHandlerFactory(module);
  }

  public static Handler provideMainHandler(HandlerModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMainHandler());
  }
}
