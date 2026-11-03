package pan.alexander.tordnscrypt.data.bridges;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.connectionchecker.SocketInternetChecker;

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
public final class DefaultVanillaBridgeRepositoryImpl_Factory implements Factory<DefaultVanillaBridgeRepositoryImpl> {
  private final Provider<SocketInternetChecker> socketInternetCheckerProvider;

  private final Provider<DefaultVanillaBridgeDataSource> bridgeDataSourceProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public DefaultVanillaBridgeRepositoryImpl_Factory(
      Provider<SocketInternetChecker> socketInternetCheckerProvider,
      Provider<DefaultVanillaBridgeDataSource> bridgeDataSourceProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.socketInternetCheckerProvider = socketInternetCheckerProvider;
    this.bridgeDataSourceProvider = bridgeDataSourceProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public DefaultVanillaBridgeRepositoryImpl get() {
    return newInstance(socketInternetCheckerProvider, bridgeDataSourceProvider.get(), defaultPreferencesProvider.get());
  }

  public static DefaultVanillaBridgeRepositoryImpl_Factory create(
      javax.inject.Provider<SocketInternetChecker> socketInternetCheckerProvider,
      javax.inject.Provider<DefaultVanillaBridgeDataSource> bridgeDataSourceProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new DefaultVanillaBridgeRepositoryImpl_Factory(Providers.asDaggerProvider(socketInternetCheckerProvider), Providers.asDaggerProvider(bridgeDataSourceProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static DefaultVanillaBridgeRepositoryImpl_Factory create(
      Provider<SocketInternetChecker> socketInternetCheckerProvider,
      Provider<DefaultVanillaBridgeDataSource> bridgeDataSourceProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new DefaultVanillaBridgeRepositoryImpl_Factory(socketInternetCheckerProvider, bridgeDataSourceProvider, defaultPreferencesProvider);
  }

  public static DefaultVanillaBridgeRepositoryImpl newInstance(
      javax.inject.Provider<SocketInternetChecker> socketInternetChecker,
      DefaultVanillaBridgeDataSource bridgeDataSource, SharedPreferences defaultPreferences) {
    return new DefaultVanillaBridgeRepositoryImpl(socketInternetChecker, bridgeDataSource, defaultPreferences);
  }
}
