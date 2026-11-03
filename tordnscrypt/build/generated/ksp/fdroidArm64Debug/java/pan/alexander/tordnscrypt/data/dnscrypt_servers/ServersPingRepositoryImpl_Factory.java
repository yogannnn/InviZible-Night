package pan.alexander.tordnscrypt.data.dnscrypt_servers;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.data.modules_configuration.DnsCryptConfigurationDataSource;

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
public final class ServersPingRepositoryImpl_Factory implements Factory<ServersPingRepositoryImpl> {
  private final Provider<ServersPingDataSource> serversPingDataSourceProvider;

  private final Provider<DnsCryptConfigurationDataSource> dnsCryptConfigurationDataSourceProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public ServersPingRepositoryImpl_Factory(
      Provider<ServersPingDataSource> serversPingDataSourceProvider,
      Provider<DnsCryptConfigurationDataSource> dnsCryptConfigurationDataSourceProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.serversPingDataSourceProvider = serversPingDataSourceProvider;
    this.dnsCryptConfigurationDataSourceProvider = dnsCryptConfigurationDataSourceProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public ServersPingRepositoryImpl get() {
    return newInstance(serversPingDataSourceProvider.get(), dnsCryptConfigurationDataSourceProvider.get(), defaultPreferencesProvider.get());
  }

  public static ServersPingRepositoryImpl_Factory create(
      javax.inject.Provider<ServersPingDataSource> serversPingDataSourceProvider,
      javax.inject.Provider<DnsCryptConfigurationDataSource> dnsCryptConfigurationDataSourceProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ServersPingRepositoryImpl_Factory(Providers.asDaggerProvider(serversPingDataSourceProvider), Providers.asDaggerProvider(dnsCryptConfigurationDataSourceProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static ServersPingRepositoryImpl_Factory create(
      Provider<ServersPingDataSource> serversPingDataSourceProvider,
      Provider<DnsCryptConfigurationDataSource> dnsCryptConfigurationDataSourceProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ServersPingRepositoryImpl_Factory(serversPingDataSourceProvider, dnsCryptConfigurationDataSourceProvider, defaultPreferencesProvider);
  }

  public static ServersPingRepositoryImpl newInstance(ServersPingDataSource serversPingDataSource,
      DnsCryptConfigurationDataSource dnsCryptConfigurationDataSource,
      SharedPreferences defaultPreferences) {
    return new ServersPingRepositoryImpl(serversPingDataSource, dnsCryptConfigurationDataSource, defaultPreferences);
  }
}
