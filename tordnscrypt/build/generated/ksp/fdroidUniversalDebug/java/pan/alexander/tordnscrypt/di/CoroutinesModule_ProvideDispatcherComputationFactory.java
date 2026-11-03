package pan.alexander.tordnscrypt.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

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
public final class CoroutinesModule_ProvideDispatcherComputationFactory implements Factory<CoroutineDispatcher> {
  private final CoroutinesModule module;

  public CoroutinesModule_ProvideDispatcherComputationFactory(CoroutinesModule module) {
    this.module = module;
  }

  @Override
  public CoroutineDispatcher get() {
    return provideDispatcherComputation(module);
  }

  public static CoroutinesModule_ProvideDispatcherComputationFactory create(
      CoroutinesModule module) {
    return new CoroutinesModule_ProvideDispatcherComputationFactory(module);
  }

  public static CoroutineDispatcher provideDispatcherComputation(CoroutinesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDispatcherComputation());
  }
}
