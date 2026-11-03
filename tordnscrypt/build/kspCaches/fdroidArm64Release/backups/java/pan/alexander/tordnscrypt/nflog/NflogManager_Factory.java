package pan.alexander.tordnscrypt.nflog;

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
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractor;
import pan.alexander.tordnscrypt.settings.PathVars;

@ScopeMetadata("pan.alexander.tordnscrypt.di.modulesservice.ModulesServiceScope")
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
public final class NflogManager_Factory implements Factory<NflogManager> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<NflogParser> nflogParserProvider;

  private final Provider<ConnectionCheckerInteractor> checkConnectionInteractorProvider;

  public NflogManager_Factory(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider, Provider<NflogParser> nflogParserProvider,
      Provider<ConnectionCheckerInteractor> checkConnectionInteractorProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.nflogParserProvider = nflogParserProvider;
    this.checkConnectionInteractorProvider = checkConnectionInteractorProvider;
  }

  @Override
  public NflogManager get() {
    return newInstance(DoubleCheck.lazy(pathVarsProvider), dispatcherIoProvider.get(), nflogParserProvider.get(), DoubleCheck.lazy(checkConnectionInteractorProvider));
  }

  public static NflogManager_Factory create(javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<NflogParser> nflogParserProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> checkConnectionInteractorProvider) {
    return new NflogManager_Factory(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(nflogParserProvider), Providers.asDaggerProvider(checkConnectionInteractorProvider));
  }

  public static NflogManager_Factory create(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider, Provider<NflogParser> nflogParserProvider,
      Provider<ConnectionCheckerInteractor> checkConnectionInteractorProvider) {
    return new NflogManager_Factory(pathVarsProvider, dispatcherIoProvider, nflogParserProvider, checkConnectionInteractorProvider);
  }

  public static NflogManager newInstance(Lazy<PathVars> pathVars, CoroutineDispatcher dispatcherIo,
      NflogParser nflogParser, Lazy<ConnectionCheckerInteractor> checkConnectionInteractor) {
    return new NflogManager(pathVars, dispatcherIo, nflogParser, checkConnectionInteractor);
  }
}
