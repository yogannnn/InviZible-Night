package pan.alexander.tordnscrypt.utils.parsers;

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
public final class DnsCryptConfigurationParser_Factory implements Factory<DnsCryptConfigurationParser> {
  private final Provider<Context> contextProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  public DnsCryptConfigurationParser_Factory(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider) {
    this.contextProvider = contextProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public DnsCryptConfigurationParser get() {
    return newInstance(contextProvider.get(), DoubleCheck.lazy(defaultPreferencesProvider), DoubleCheck.lazy(pathVarsProvider));
  }

  public static DnsCryptConfigurationParser_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new DnsCryptConfigurationParser_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static DnsCryptConfigurationParser_Factory create(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider) {
    return new DnsCryptConfigurationParser_Factory(contextProvider, defaultPreferencesProvider, pathVarsProvider);
  }

  public static DnsCryptConfigurationParser newInstance(Context context,
      Lazy<SharedPreferences> defaultPreferences, Lazy<PathVars> pathVars) {
    return new DnsCryptConfigurationParser(context, defaultPreferences, pathVars);
  }
}
