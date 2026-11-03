package pan.alexander.tordnscrypt.modules;

import android.content.Context;
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
public final class TorRestarterReconnector_Factory implements Factory<TorRestarterReconnector> {
  private final Provider<Context> contextProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider;

  public TorRestarterReconnector_Factory(Provider<Context> contextProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider, Provider<PathVars> pathVarsProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider) {
    this.contextProvider = contextProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.connectionCheckerInteractorProvider = connectionCheckerInteractorProvider;
  }

  @Override
  public TorRestarterReconnector get() {
    return newInstance(contextProvider.get(), dispatcherIoProvider.get(), pathVarsProvider.get(), DoubleCheck.lazy(connectionCheckerInteractorProvider));
  }

  public static TorRestarterReconnector_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider) {
    return new TorRestarterReconnector_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(connectionCheckerInteractorProvider));
  }

  public static TorRestarterReconnector_Factory create(Provider<Context> contextProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider, Provider<PathVars> pathVarsProvider,
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider) {
    return new TorRestarterReconnector_Factory(contextProvider, dispatcherIoProvider, pathVarsProvider, connectionCheckerInteractorProvider);
  }

  public static TorRestarterReconnector newInstance(Context context,
      CoroutineDispatcher dispatcherIo, PathVars pathVars,
      Lazy<ConnectionCheckerInteractor> connectionCheckerInteractor) {
    return new TorRestarterReconnector(context, dispatcherIo, pathVars, connectionCheckerInteractor);
  }
}
