package pan.alexander.tordnscrypt.data.connection_records;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ConnectionRecordsRepositoryImpl_Factory implements Factory<ConnectionRecordsRepositoryImpl> {
  private final Provider<ConnectionRecordsGetter> connectionRecordsGetterProvider;

  private final Provider<NflogRecordsGetter> nflogRecordsGetterProvider;

  public ConnectionRecordsRepositoryImpl_Factory(
      Provider<ConnectionRecordsGetter> connectionRecordsGetterProvider,
      Provider<NflogRecordsGetter> nflogRecordsGetterProvider) {
    this.connectionRecordsGetterProvider = connectionRecordsGetterProvider;
    this.nflogRecordsGetterProvider = nflogRecordsGetterProvider;
  }

  @Override
  public ConnectionRecordsRepositoryImpl get() {
    return newInstance(connectionRecordsGetterProvider.get(), nflogRecordsGetterProvider.get());
  }

  public static ConnectionRecordsRepositoryImpl_Factory create(
      javax.inject.Provider<ConnectionRecordsGetter> connectionRecordsGetterProvider,
      javax.inject.Provider<NflogRecordsGetter> nflogRecordsGetterProvider) {
    return new ConnectionRecordsRepositoryImpl_Factory(Providers.asDaggerProvider(connectionRecordsGetterProvider), Providers.asDaggerProvider(nflogRecordsGetterProvider));
  }

  public static ConnectionRecordsRepositoryImpl_Factory create(
      Provider<ConnectionRecordsGetter> connectionRecordsGetterProvider,
      Provider<NflogRecordsGetter> nflogRecordsGetterProvider) {
    return new ConnectionRecordsRepositoryImpl_Factory(connectionRecordsGetterProvider, nflogRecordsGetterProvider);
  }

  public static ConnectionRecordsRepositoryImpl newInstance(
      ConnectionRecordsGetter connectionRecordsGetter, NflogRecordsGetter nflogRecordsGetter) {
    return new ConnectionRecordsRepositoryImpl(connectionRecordsGetter, nflogRecordsGetter);
  }
}
