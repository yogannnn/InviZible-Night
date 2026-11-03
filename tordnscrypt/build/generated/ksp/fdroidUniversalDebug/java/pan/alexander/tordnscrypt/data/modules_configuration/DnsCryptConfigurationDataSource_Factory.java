package pan.alexander.tordnscrypt.data.modules_configuration;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.parsers.DnsCryptConfigurationParser;

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
public final class DnsCryptConfigurationDataSource_Factory implements Factory<DnsCryptConfigurationDataSource> {
  private final Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public DnsCryptConfigurationDataSource_Factory(
      Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.dnsCryptConfigurationParserProvider = dnsCryptConfigurationParserProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public DnsCryptConfigurationDataSource get() {
    return newInstance(dnsCryptConfigurationParserProvider.get(), defaultPreferencesProvider.get());
  }

  public static DnsCryptConfigurationDataSource_Factory create(
      javax.inject.Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new DnsCryptConfigurationDataSource_Factory(Providers.asDaggerProvider(dnsCryptConfigurationParserProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static DnsCryptConfigurationDataSource_Factory create(
      Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new DnsCryptConfigurationDataSource_Factory(dnsCryptConfigurationParserProvider, defaultPreferencesProvider);
  }

  public static DnsCryptConfigurationDataSource newInstance(
      DnsCryptConfigurationParser dnsCryptConfigurationParser,
      SharedPreferences defaultPreferences) {
    return new DnsCryptConfigurationDataSource(dnsCryptConfigurationParser, defaultPreferences);
  }
}
