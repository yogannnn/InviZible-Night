package pan.alexander.tordnscrypt.settings.tor_bridges;

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
public final class SnowflakeConfigurator_Factory implements Factory<SnowflakeConfigurator> {
  private final Provider<Context> contextProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public SnowflakeConfigurator_Factory(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.contextProvider = contextProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public SnowflakeConfigurator get() {
    return newInstance(contextProvider.get(), DoubleCheck.lazy(defaultPreferencesProvider));
  }

  public static SnowflakeConfigurator_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new SnowflakeConfigurator_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static SnowflakeConfigurator_Factory create(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new SnowflakeConfigurator_Factory(contextProvider, defaultPreferencesProvider);
  }

  public static SnowflakeConfigurator newInstance(Context context,
      Lazy<SharedPreferences> defaultPreferences) {
    return new SnowflakeConfigurator(context, defaultPreferences);
  }
}
