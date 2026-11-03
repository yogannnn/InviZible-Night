package pan.alexander.tordnscrypt.installer;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
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
public final class InstallerHelper_Factory implements Factory<InstallerHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public InstallerHelper_Factory(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.contextProvider = contextProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public InstallerHelper get() {
    return newInstance(contextProvider.get(), defaultPreferencesProvider.get());
  }

  public static InstallerHelper_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new InstallerHelper_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static InstallerHelper_Factory create(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new InstallerHelper_Factory(contextProvider, defaultPreferencesProvider);
  }

  public static InstallerHelper newInstance(Context context, SharedPreferences defaultPreferences) {
    return new InstallerHelper(context, defaultPreferences);
  }
}
