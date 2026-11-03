package pan.alexander.tordnscrypt.domain.bridges;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
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
public final class DefaultVanillaBridgeInteractor_Factory implements Factory<DefaultVanillaBridgeInteractor> {
  private final Provider<DefaultVanillaBridgeRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public DefaultVanillaBridgeInteractor_Factory(
      Provider<DefaultVanillaBridgeRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public DefaultVanillaBridgeInteractor get() {
    return newInstance(repositoryProvider.get(), dispatcherIoProvider.get());
  }

  public static DefaultVanillaBridgeInteractor_Factory create(
      javax.inject.Provider<DefaultVanillaBridgeRepository> repositoryProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new DefaultVanillaBridgeInteractor_Factory(Providers.asDaggerProvider(repositoryProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static DefaultVanillaBridgeInteractor_Factory create(
      Provider<DefaultVanillaBridgeRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new DefaultVanillaBridgeInteractor_Factory(repositoryProvider, dispatcherIoProvider);
  }

  public static DefaultVanillaBridgeInteractor newInstance(
      DefaultVanillaBridgeRepository repository, CoroutineDispatcher dispatcherIo) {
    return new DefaultVanillaBridgeInteractor(repository, dispatcherIo);
  }
}
