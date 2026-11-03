package pan.alexander.tordnscrypt.iptables;

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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.connectivitycheck.ConnectivityCheckManager;

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
public final class IptablesFirewall_Factory implements Factory<IptablesFirewall> {
  private final Provider<Context> contextProvider;

  private final Provider<PreferenceRepository> preferencesProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ConnectivityCheckManager> connectivityCheckManagerProvider;

  public IptablesFirewall_Factory(Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferencesProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider) {
    this.contextProvider = contextProvider;
    this.preferencesProvider = preferencesProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.connectivityCheckManagerProvider = connectivityCheckManagerProvider;
  }

  @Override
  public IptablesFirewall get() {
    return newInstance(contextProvider.get(), preferencesProvider.get(), defaultPreferencesProvider.get(), pathVarsProvider.get(), DoubleCheck.lazy(connectivityCheckManagerProvider));
  }

  public static IptablesFirewall_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PreferenceRepository> preferencesProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ConnectivityCheckManager> connectivityCheckManagerProvider) {
    return new IptablesFirewall_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(preferencesProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(connectivityCheckManagerProvider));
  }

  public static IptablesFirewall_Factory create(Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferencesProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider) {
    return new IptablesFirewall_Factory(contextProvider, preferencesProvider, defaultPreferencesProvider, pathVarsProvider, connectivityCheckManagerProvider);
  }

  public static IptablesFirewall newInstance(Context context, PreferenceRepository preferences,
      SharedPreferences defaultPreferences, PathVars pathVars,
      Lazy<ConnectivityCheckManager> connectivityCheckManager) {
    return new IptablesFirewall(context, preferences, defaultPreferences, pathVars, connectivityCheckManager);
  }
}
