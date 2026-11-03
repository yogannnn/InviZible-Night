package pan.alexander.tordnscrypt.utils.preferences;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineScope;

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
public final class AppPreferenceHelperImpl_Factory implements Factory<AppPreferenceHelperImpl> {
  private final Provider<SharedPreferences> appPreferencesProvider;

  private final Provider<CoroutineScope> mainCoroutineScopeProvider;

  public AppPreferenceHelperImpl_Factory(Provider<SharedPreferences> appPreferencesProvider,
      Provider<CoroutineScope> mainCoroutineScopeProvider) {
    this.appPreferencesProvider = appPreferencesProvider;
    this.mainCoroutineScopeProvider = mainCoroutineScopeProvider;
  }

  @Override
  public AppPreferenceHelperImpl get() {
    return newInstance(appPreferencesProvider.get(), mainCoroutineScopeProvider.get());
  }

  public static AppPreferenceHelperImpl_Factory create(
      javax.inject.Provider<SharedPreferences> appPreferencesProvider,
      javax.inject.Provider<CoroutineScope> mainCoroutineScopeProvider) {
    return new AppPreferenceHelperImpl_Factory(Providers.asDaggerProvider(appPreferencesProvider), Providers.asDaggerProvider(mainCoroutineScopeProvider));
  }

  public static AppPreferenceHelperImpl_Factory create(
      Provider<SharedPreferences> appPreferencesProvider,
      Provider<CoroutineScope> mainCoroutineScopeProvider) {
    return new AppPreferenceHelperImpl_Factory(appPreferencesProvider, mainCoroutineScopeProvider);
  }

  public static AppPreferenceHelperImpl newInstance(SharedPreferences appPreferences,
      CoroutineScope mainCoroutineScope) {
    return new AppPreferenceHelperImpl(appPreferences, mainCoroutineScope);
  }
}
