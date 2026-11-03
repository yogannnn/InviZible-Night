package pan.alexander.tordnscrypt.domain.dnscrypt_servers;

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
public final class ServersPingInteractor_Factory implements Factory<ServersPingInteractor> {
  private final Provider<ServersPingRepository> serversPingRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public ServersPingInteractor_Factory(
      Provider<ServersPingRepository> serversPingRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.serversPingRepositoryProvider = serversPingRepositoryProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public ServersPingInteractor get() {
    return newInstance(serversPingRepositoryProvider.get(), dispatcherIoProvider.get());
  }

  public static ServersPingInteractor_Factory create(
      javax.inject.Provider<ServersPingRepository> serversPingRepositoryProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new ServersPingInteractor_Factory(Providers.asDaggerProvider(serversPingRepositoryProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static ServersPingInteractor_Factory create(
      Provider<ServersPingRepository> serversPingRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new ServersPingInteractor_Factory(serversPingRepositoryProvider, dispatcherIoProvider);
  }

  public static ServersPingInteractor newInstance(ServersPingRepository serversPingRepository,
      CoroutineDispatcher dispatcherIo) {
    return new ServersPingInteractor(serversPingRepository, dispatcherIo);
  }
}
