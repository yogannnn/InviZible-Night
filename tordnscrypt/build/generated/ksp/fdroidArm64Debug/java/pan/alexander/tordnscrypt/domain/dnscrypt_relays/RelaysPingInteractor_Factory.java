package pan.alexander.tordnscrypt.domain.dnscrypt_relays;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.domain.dnscrypt_servers.ServersPingRepository;

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
public final class RelaysPingInteractor_Factory implements Factory<RelaysPingInteractor> {
  private final Provider<ServersPingRepository> serversPingRepositoryProvider;

  private final Provider<RelaysPingRepository> relaysPingRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public RelaysPingInteractor_Factory(Provider<ServersPingRepository> serversPingRepositoryProvider,
      Provider<RelaysPingRepository> relaysPingRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.serversPingRepositoryProvider = serversPingRepositoryProvider;
    this.relaysPingRepositoryProvider = relaysPingRepositoryProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public RelaysPingInteractor get() {
    return newInstance(serversPingRepositoryProvider.get(), relaysPingRepositoryProvider.get(), dispatcherIoProvider.get());
  }

  public static RelaysPingInteractor_Factory create(
      javax.inject.Provider<ServersPingRepository> serversPingRepositoryProvider,
      javax.inject.Provider<RelaysPingRepository> relaysPingRepositoryProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new RelaysPingInteractor_Factory(Providers.asDaggerProvider(serversPingRepositoryProvider), Providers.asDaggerProvider(relaysPingRepositoryProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static RelaysPingInteractor_Factory create(
      Provider<ServersPingRepository> serversPingRepositoryProvider,
      Provider<RelaysPingRepository> relaysPingRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new RelaysPingInteractor_Factory(serversPingRepositoryProvider, relaysPingRepositoryProvider, dispatcherIoProvider);
  }

  public static RelaysPingInteractor newInstance(ServersPingRepository serversPingRepository,
      RelaysPingRepository relaysPingRepository, CoroutineDispatcher dispatcherIo) {
    return new RelaysPingInteractor(serversPingRepository, relaysPingRepository, dispatcherIo);
  }
}
