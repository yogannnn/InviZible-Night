package pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

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
public final class UpdateRemoteRulesWorkManager_Factory implements Factory<UpdateRemoteRulesWorkManager> {
  private final Provider<Context> contextProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferencesProvider;

  public UpdateRemoteRulesWorkManager_Factory(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferencesProvider) {
    this.contextProvider = contextProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferencesProvider = preferencesProvider;
  }

  @Override
  public UpdateRemoteRulesWorkManager get() {
    return newInstance(contextProvider.get(), defaultPreferencesProvider.get(), preferencesProvider.get());
  }

  public static UpdateRemoteRulesWorkManager_Factory create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferencesProvider) {
    return new UpdateRemoteRulesWorkManager_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferencesProvider));
  }

  public static UpdateRemoteRulesWorkManager_Factory create(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferencesProvider) {
    return new UpdateRemoteRulesWorkManager_Factory(contextProvider, defaultPreferencesProvider, preferencesProvider);
  }

  public static UpdateRemoteRulesWorkManager newInstance(Context context,
      SharedPreferences defaultPreferences, PreferenceRepository preferences) {
    return new UpdateRemoteRulesWorkManager(context, defaultPreferences, preferences);
  }
}
