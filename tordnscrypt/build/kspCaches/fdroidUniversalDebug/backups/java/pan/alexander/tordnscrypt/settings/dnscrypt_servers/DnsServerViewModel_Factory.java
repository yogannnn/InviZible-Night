package pan.alexander.tordnscrypt.settings.dnscrypt_servers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import pan.alexander.tordnscrypt.domain.dnscrypt_servers.ServersPingInteractor;
import pan.alexander.tordnscrypt.utils.parsers.DnsCryptConfigurationParser;
import pan.alexander.tordnscrypt.utils.session.AppSessionStore;

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
public final class DnsServerViewModel_Factory implements Factory<DnsServerViewModel> {
  private final Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider;

  private final Provider<AppSessionStore> sessionStoreProvider;

  private final Provider<ServersPingInteractor> serversPingInteractorProvider;

  public DnsServerViewModel_Factory(
      Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      Provider<AppSessionStore> sessionStoreProvider,
      Provider<ServersPingInteractor> serversPingInteractorProvider) {
    this.dnsCryptConfigurationParserProvider = dnsCryptConfigurationParserProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.coroutineExceptionHandlerProvider = coroutineExceptionHandlerProvider;
    this.sessionStoreProvider = sessionStoreProvider;
    this.serversPingInteractorProvider = serversPingInteractorProvider;
  }

  @Override
  public DnsServerViewModel get() {
    return newInstance(dnsCryptConfigurationParserProvider.get(), dispatcherIoProvider.get(), baseCoroutineScopeProvider.get(), coroutineExceptionHandlerProvider.get(), sessionStoreProvider.get(), serversPingInteractorProvider.get());
  }

  public static DnsServerViewModel_Factory create(
      javax.inject.Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      javax.inject.Provider<AppSessionStore> sessionStoreProvider,
      javax.inject.Provider<ServersPingInteractor> serversPingInteractorProvider) {
    return new DnsServerViewModel_Factory(Providers.asDaggerProvider(dnsCryptConfigurationParserProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(coroutineExceptionHandlerProvider), Providers.asDaggerProvider(sessionStoreProvider), Providers.asDaggerProvider(serversPingInteractorProvider));
  }

  public static DnsServerViewModel_Factory create(
      Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<CoroutineExceptionHandler> coroutineExceptionHandlerProvider,
      Provider<AppSessionStore> sessionStoreProvider,
      Provider<ServersPingInteractor> serversPingInteractorProvider) {
    return new DnsServerViewModel_Factory(dnsCryptConfigurationParserProvider, dispatcherIoProvider, baseCoroutineScopeProvider, coroutineExceptionHandlerProvider, sessionStoreProvider, serversPingInteractorProvider);
  }

  public static DnsServerViewModel newInstance(
      DnsCryptConfigurationParser dnsCryptConfigurationParser, CoroutineDispatcher dispatcherIo,
      CoroutineScope baseCoroutineScope, CoroutineExceptionHandler coroutineExceptionHandler,
      AppSessionStore sessionStore, ServersPingInteractor serversPingInteractor) {
    return new DnsServerViewModel(dnsCryptConfigurationParser, dispatcherIo, baseCoroutineScope, coroutineExceptionHandler, sessionStore, serversPingInteractor);
  }
}
