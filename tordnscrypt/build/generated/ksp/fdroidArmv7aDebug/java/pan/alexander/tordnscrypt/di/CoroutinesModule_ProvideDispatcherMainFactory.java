package pan.alexander.tordnscrypt.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.MainCoroutineDispatcher;

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
public final class CoroutinesModule_ProvideDispatcherMainFactory implements Factory<MainCoroutineDispatcher> {
  private final CoroutinesModule module;

  public CoroutinesModule_ProvideDispatcherMainFactory(CoroutinesModule module) {
    this.module = module;
  }

  @Override
  public MainCoroutineDispatcher get() {
    return provideDispatcherMain(module);
  }

  public static CoroutinesModule_ProvideDispatcherMainFactory create(CoroutinesModule module) {
    return new CoroutinesModule_ProvideDispatcherMainFactory(module);
  }

  public static MainCoroutineDispatcher provideDispatcherMain(CoroutinesModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDispatcherMain());
  }
}
