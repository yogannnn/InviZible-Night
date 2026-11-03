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
public final class BridgesCountriesInteractor_Factory implements Factory<BridgesCountriesInteractor> {
  private final Provider<BridgesCountriesRepository> bridgesCountriesRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public BridgesCountriesInteractor_Factory(
      Provider<BridgesCountriesRepository> bridgesCountriesRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.bridgesCountriesRepositoryProvider = bridgesCountriesRepositoryProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public BridgesCountriesInteractor get() {
    return newInstance(bridgesCountriesRepositoryProvider.get(), dispatcherIoProvider.get());
  }

  public static BridgesCountriesInteractor_Factory create(
      javax.inject.Provider<BridgesCountriesRepository> bridgesCountriesRepositoryProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new BridgesCountriesInteractor_Factory(Providers.asDaggerProvider(bridgesCountriesRepositoryProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static BridgesCountriesInteractor_Factory create(
      Provider<BridgesCountriesRepository> bridgesCountriesRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new BridgesCountriesInteractor_Factory(bridgesCountriesRepositoryProvider, dispatcherIoProvider);
  }

  public static BridgesCountriesInteractor newInstance(
      BridgesCountriesRepository bridgesCountriesRepository, CoroutineDispatcher dispatcherIo) {
    return new BridgesCountriesInteractor(bridgesCountriesRepository, dispatcherIo);
  }
}
