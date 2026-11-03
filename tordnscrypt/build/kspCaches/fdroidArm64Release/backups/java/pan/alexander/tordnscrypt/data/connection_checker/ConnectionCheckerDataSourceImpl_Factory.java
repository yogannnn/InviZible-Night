package pan.alexander.tordnscrypt.data.connection_checker;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.connectionchecker.HttpInternetChecker;
import pan.alexander.tordnscrypt.utils.connectionchecker.SocketInternetChecker;

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
public final class ConnectionCheckerDataSourceImpl_Factory implements Factory<ConnectionCheckerDataSourceImpl> {
  private final Provider<HttpInternetChecker> httpInternetCheckerProvider;

  private final Provider<SocketInternetChecker> socketInternetCheckerProvider;

  private final Provider<Context> contextProvider;

  public ConnectionCheckerDataSourceImpl_Factory(
      Provider<HttpInternetChecker> httpInternetCheckerProvider,
      Provider<SocketInternetChecker> socketInternetCheckerProvider,
      Provider<Context> contextProvider) {
    this.httpInternetCheckerProvider = httpInternetCheckerProvider;
    this.socketInternetCheckerProvider = socketInternetCheckerProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectionCheckerDataSourceImpl get() {
    return newInstance(httpInternetCheckerProvider, socketInternetCheckerProvider, contextProvider.get());
  }

  public static ConnectionCheckerDataSourceImpl_Factory create(
      javax.inject.Provider<HttpInternetChecker> httpInternetCheckerProvider,
      javax.inject.Provider<SocketInternetChecker> socketInternetCheckerProvider,
      javax.inject.Provider<Context> contextProvider) {
    return new ConnectionCheckerDataSourceImpl_Factory(Providers.asDaggerProvider(httpInternetCheckerProvider), Providers.asDaggerProvider(socketInternetCheckerProvider), Providers.asDaggerProvider(contextProvider));
  }

  public static ConnectionCheckerDataSourceImpl_Factory create(
      Provider<HttpInternetChecker> httpInternetCheckerProvider,
      Provider<SocketInternetChecker> socketInternetCheckerProvider,
      Provider<Context> contextProvider) {
    return new ConnectionCheckerDataSourceImpl_Factory(httpInternetCheckerProvider, socketInternetCheckerProvider, contextProvider);
  }

  public static ConnectionCheckerDataSourceImpl newInstance(
      javax.inject.Provider<HttpInternetChecker> httpInternetChecker,
      javax.inject.Provider<SocketInternetChecker> socketInternetChecker, Context context) {
    return new ConnectionCheckerDataSourceImpl(httpInternetChecker, socketInternetChecker, context);
  }
}
