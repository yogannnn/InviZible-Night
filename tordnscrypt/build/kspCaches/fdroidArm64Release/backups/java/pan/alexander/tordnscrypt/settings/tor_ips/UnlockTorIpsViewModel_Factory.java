package pan.alexander.tordnscrypt.settings.tor_ips;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractor;
import pan.alexander.tordnscrypt.domain.resources.ResourceRepository;
import pan.alexander.tordnscrypt.domain.tor_ips.TorIpsInteractor;

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
public final class UnlockTorIpsViewModel_Factory implements Factory<UnlockTorIpsViewModel> {
  private final Provider<TorIpsInteractor> torIpsInteractorProvider;

  private final Provider<DnsInteractor> dnsInteractorProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<CoroutineExceptionHandler> exceptionHandlerProvider;

  private final Provider<ResourceRepository> resourceRepositoryProvider;

  public UnlockTorIpsViewModel_Factory(Provider<TorIpsInteractor> torIpsInteractorProvider,
      Provider<DnsInteractor> dnsInteractorProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<CoroutineExceptionHandler> exceptionHandlerProvider,
      Provider<ResourceRepository> resourceRepositoryProvider) {
    this.torIpsInteractorProvider = torIpsInteractorProvider;
    this.dnsInteractorProvider = dnsInteractorProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.exceptionHandlerProvider = exceptionHandlerProvider;
    this.resourceRepositoryProvider = resourceRepositoryProvider;
  }

  @Override
  public UnlockTorIpsViewModel get() {
    return newInstance(torIpsInteractorProvider.get(), DoubleCheck.lazy(dnsInteractorProvider), dispatcherIoProvider.get(), exceptionHandlerProvider.get(), DoubleCheck.lazy(resourceRepositoryProvider));
  }

  public static UnlockTorIpsViewModel_Factory create(
      javax.inject.Provider<TorIpsInteractor> torIpsInteractorProvider,
      javax.inject.Provider<DnsInteractor> dnsInteractorProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<CoroutineExceptionHandler> exceptionHandlerProvider,
      javax.inject.Provider<ResourceRepository> resourceRepositoryProvider) {
    return new UnlockTorIpsViewModel_Factory(Providers.asDaggerProvider(torIpsInteractorProvider), Providers.asDaggerProvider(dnsInteractorProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(exceptionHandlerProvider), Providers.asDaggerProvider(resourceRepositoryProvider));
  }

  public static UnlockTorIpsViewModel_Factory create(
      Provider<TorIpsInteractor> torIpsInteractorProvider,
      Provider<DnsInteractor> dnsInteractorProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<CoroutineExceptionHandler> exceptionHandlerProvider,
      Provider<ResourceRepository> resourceRepositoryProvider) {
    return new UnlockTorIpsViewModel_Factory(torIpsInteractorProvider, dnsInteractorProvider, dispatcherIoProvider, exceptionHandlerProvider, resourceRepositoryProvider);
  }

  public static UnlockTorIpsViewModel newInstance(TorIpsInteractor torIpsInteractor,
      Lazy<DnsInteractor> dnsInteractor, CoroutineDispatcher dispatcherIo,
      CoroutineExceptionHandler exceptionHandler, Lazy<ResourceRepository> resourceRepository) {
    return new UnlockTorIpsViewModel(torIpsInteractor, dnsInteractor, dispatcherIo, exceptionHandler, resourceRepository);
  }
}
