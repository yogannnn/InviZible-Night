package pan.alexander.tordnscrypt.domain.connection_records;

import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("pan.alexander.tordnscrypt.di.logreader.LogReaderScope")
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
public final class ConnectionRecordsInteractor_Factory implements Factory<ConnectionRecordsInteractor> {
  private final Provider<ConnectionRecordsRepository> connectionRecordsRepositoryProvider;

  private final Provider<ConnectionRecordsConverter> converterProvider;

  private final Provider<ConnectionRecordsParser> parserProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public ConnectionRecordsInteractor_Factory(
      Provider<ConnectionRecordsRepository> connectionRecordsRepositoryProvider,
      Provider<ConnectionRecordsConverter> converterProvider,
      Provider<ConnectionRecordsParser> parserProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.connectionRecordsRepositoryProvider = connectionRecordsRepositoryProvider;
    this.converterProvider = converterProvider;
    this.parserProvider = parserProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public ConnectionRecordsInteractor get() {
    return newInstance(connectionRecordsRepositoryProvider.get(), DoubleCheck.lazy(converterProvider), parserProvider.get(), DoubleCheck.lazy(defaultPreferencesProvider));
  }

  public static ConnectionRecordsInteractor_Factory create(
      javax.inject.Provider<ConnectionRecordsRepository> connectionRecordsRepositoryProvider,
      javax.inject.Provider<ConnectionRecordsConverter> converterProvider,
      javax.inject.Provider<ConnectionRecordsParser> parserProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ConnectionRecordsInteractor_Factory(Providers.asDaggerProvider(connectionRecordsRepositoryProvider), Providers.asDaggerProvider(converterProvider), Providers.asDaggerProvider(parserProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static ConnectionRecordsInteractor_Factory create(
      Provider<ConnectionRecordsRepository> connectionRecordsRepositoryProvider,
      Provider<ConnectionRecordsConverter> converterProvider,
      Provider<ConnectionRecordsParser> parserProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ConnectionRecordsInteractor_Factory(connectionRecordsRepositoryProvider, converterProvider, parserProvider, defaultPreferencesProvider);
  }

  public static ConnectionRecordsInteractor newInstance(
      ConnectionRecordsRepository connectionRecordsRepository,
      Lazy<ConnectionRecordsConverter> converter, ConnectionRecordsParser parser,
      Lazy<SharedPreferences> defaultPreferences) {
    return new ConnectionRecordsInteractor(connectionRecordsRepository, converter, parser, defaultPreferences);
  }
}
