package pan.alexander.tordnscrypt.modules;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.settings.PathVars;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ModulesStatusBroadcaster_Factory implements Factory<ModulesStatusBroadcaster> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  public ModulesStatusBroadcaster_Factory(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
  }

  @Override
  public ModulesStatusBroadcaster get() {
    return newInstance(contextProvider.get(), pathVarsProvider.get(), defaultSharedPreferencesProvider.get());
  }

  public static ModulesStatusBroadcaster_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider) {
    return new ModulesStatusBroadcaster_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(defaultSharedPreferencesProvider));
  }

  public static ModulesStatusBroadcaster_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider) {
    return new ModulesStatusBroadcaster_Factory(contextProvider, pathVarsProvider, defaultSharedPreferencesProvider);
  }

  public static ModulesStatusBroadcaster newInstance(Context context, PathVars pathVars,
      SharedPreferences defaultSharedPreferences) {
    return new ModulesStatusBroadcaster(context, pathVars, defaultSharedPreferences);
  }
}
