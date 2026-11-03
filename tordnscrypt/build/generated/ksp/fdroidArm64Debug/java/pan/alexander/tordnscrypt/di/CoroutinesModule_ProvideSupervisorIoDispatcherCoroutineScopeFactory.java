package pan.alexander.tordnscrypt.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
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
public final class CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory implements Factory<CoroutineScope> {
  private final CoroutinesModule module;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory(
      CoroutinesModule module, Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.module = module;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public CoroutineScope get() {
    return provideSupervisorIoDispatcherCoroutineScope(module, dispatcherIoProvider.get());
  }

  public static CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory create(
      CoroutinesModule module, javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory(module, Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory create(
      CoroutinesModule module, Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new CoroutinesModule_ProvideSupervisorIoDispatcherCoroutineScopeFactory(module, dispatcherIoProvider);
  }

  public static CoroutineScope provideSupervisorIoDispatcherCoroutineScope(
      CoroutinesModule instance, CoroutineDispatcher dispatcherIo) {
    return Preconditions.checkNotNullFromProvides(instance.provideSupervisorIoDispatcherCoroutineScope(dispatcherIo));
  }
}
