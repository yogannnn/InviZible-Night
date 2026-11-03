package pan.alexander.tordnscrypt.data.dnscrypt_servers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class ServersPingDataSourceImpl_Factory implements Factory<ServersPingDataSourceImpl> {
  private final Provider<SocketInternetChecker> socketInternetCheckerProvider;

  public ServersPingDataSourceImpl_Factory(
      Provider<SocketInternetChecker> socketInternetCheckerProvider) {
    this.socketInternetCheckerProvider = socketInternetCheckerProvider;
  }

  @Override
  public ServersPingDataSourceImpl get() {
    return newInstance(socketInternetCheckerProvider);
  }

  public static ServersPingDataSourceImpl_Factory create(
      javax.inject.Provider<SocketInternetChecker> socketInternetCheckerProvider) {
    return new ServersPingDataSourceImpl_Factory(Providers.asDaggerProvider(socketInternetCheckerProvider));
  }

  public static ServersPingDataSourceImpl_Factory create(
      Provider<SocketInternetChecker> socketInternetCheckerProvider) {
    return new ServersPingDataSourceImpl_Factory(socketInternetCheckerProvider);
  }

  public static ServersPingDataSourceImpl newInstance(
      javax.inject.Provider<SocketInternetChecker> socketInternetChecker) {
    return new ServersPingDataSourceImpl(socketInternetChecker);
  }
}
