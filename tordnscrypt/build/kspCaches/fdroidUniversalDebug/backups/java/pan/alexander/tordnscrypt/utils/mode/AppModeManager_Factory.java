package pan.alexander.tordnscrypt.utils.mode;

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
import pan.alexander.tordnscrypt.nflog.NflogManager;

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
public final class AppModeManager_Factory implements Factory<AppModeManager> {
  private final Provider<Context> contextProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<NflogManager> nflogManagerProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public AppModeManager_Factory(Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<NflogManager> nflogManagerProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.contextProvider = contextProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.nflogManagerProvider = nflogManagerProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public AppModeManager get() {
    return newInstance(contextProvider.get(), DoubleCheck.lazy(preferenceRepositoryProvider), DoubleCheck.lazy(nflogManagerProvider), DoubleCheck.lazy(defaultPreferencesProvider));
  }

  public static AppModeManager_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<NflogManager> nflogManagerProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new AppModeManager_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(nflogManagerProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static AppModeManager_Factory create(Provider<Context> contextProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<NflogManager> nflogManagerProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new AppModeManager_Factory(contextProvider, preferenceRepositoryProvider, nflogManagerProvider, defaultPreferencesProvider);
  }

  public static AppModeManager newInstance(Context context,
      Lazy<PreferenceRepository> preferenceRepository, Lazy<NflogManager> nflogManager,
      Lazy<SharedPreferences> defaultPreferences) {
    return new AppModeManager(context, preferenceRepository, nflogManager, defaultPreferences);
  }
}
