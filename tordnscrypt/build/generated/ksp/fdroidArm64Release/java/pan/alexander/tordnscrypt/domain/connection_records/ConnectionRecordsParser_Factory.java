package pan.alexander.tordnscrypt.domain.connection_records;

import android.content.Context;
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
import pan.alexander.tordnscrypt.utils.apps.InstalledAppNamesStorage;

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
public final class ConnectionRecordsParser_Factory implements Factory<ConnectionRecordsParser> {
  private final Provider<Context> applicationContextProvider;

  private final Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public ConnectionRecordsParser_Factory(Provider<Context> applicationContextProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.applicationContextProvider = applicationContextProvider;
    this.installedAppNamesStorageProvider = installedAppNamesStorageProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public ConnectionRecordsParser get() {
    return newInstance(applicationContextProvider.get(), DoubleCheck.lazy(installedAppNamesStorageProvider), defaultPreferencesProvider.get());
  }

  public static ConnectionRecordsParser_Factory create(
      javax.inject.Provider<Context> applicationContextProvider,
      javax.inject.Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ConnectionRecordsParser_Factory(Providers.asDaggerProvider(applicationContextProvider), Providers.asDaggerProvider(installedAppNamesStorageProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static ConnectionRecordsParser_Factory create(Provider<Context> applicationContextProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new ConnectionRecordsParser_Factory(applicationContextProvider, installedAppNamesStorageProvider, defaultPreferencesProvider);
  }

  public static ConnectionRecordsParser newInstance(Context applicationContext,
      Lazy<InstalledAppNamesStorage> installedAppNamesStorage,
      SharedPreferences defaultPreferences) {
    return new ConnectionRecordsParser(applicationContext, installedAppNamesStorage, defaultPreferences);
  }
}
