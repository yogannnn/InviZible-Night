package pan.alexander.tordnscrypt.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory implements Factory<CoroutineScope> {
  private final CoroutinesModule module;

  private final Provider<MainCoroutineDispatcher> dispatcherMainProvider;

  public CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory(
      CoroutinesModule module, Provider<MainCoroutineDispatcher> dispatcherMainProvider) {
    this.module = module;
    this.dispatcherMainProvider = dispatcherMainProvider;
  }

  @Override
  public CoroutineScope get() {
    return provideSupervisorMainDispatcherCoroutineScope(module, dispatcherMainProvider.get());
  }

  public static CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory create(
      CoroutinesModule module,
      javax.inject.Provider<MainCoroutineDispatcher> dispatcherMainProvider) {
    return new CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory(module, Providers.asDaggerProvider(dispatcherMainProvider));
  }

  public static CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory create(
      CoroutinesModule module, Provider<MainCoroutineDispatcher> dispatcherMainProvider) {
    return new CoroutinesModule_ProvideSupervisorMainDispatcherCoroutineScopeFactory(module, dispatcherMainProvider);
  }

  public static CoroutineScope provideSupervisorMainDispatcherCoroutineScope(
      CoroutinesModule instance, MainCoroutineDispatcher dispatcherMain) {
    return Preconditions.checkNotNullFromProvides(instance.provideSupervisorMainDispatcherCoroutineScope(dispatcherMain));
  }
}
