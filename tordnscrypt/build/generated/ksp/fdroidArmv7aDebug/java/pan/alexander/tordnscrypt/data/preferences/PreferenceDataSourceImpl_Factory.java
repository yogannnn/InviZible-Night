package pan.alexander.tordnscrypt.data.preferences;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.preferences.AppPreferenceHelper;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class PreferenceDataSourceImpl_Factory implements Factory<PreferenceDataSourceImpl> {
  private final Provider<AppPreferenceHelper> appPreferenceHelperProvider;

  public PreferenceDataSourceImpl_Factory(
      Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    this.appPreferenceHelperProvider = appPreferenceHelperProvider;
  }

  @Override
  public PreferenceDataSourceImpl get() {
    return newInstance(appPreferenceHelperProvider.get());
  }

  public static PreferenceDataSourceImpl_Factory create(
      javax.inject.Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    return new PreferenceDataSourceImpl_Factory(Providers.asDaggerProvider(appPreferenceHelperProvider));
  }

  public static PreferenceDataSourceImpl_Factory create(
      Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    return new PreferenceDataSourceImpl_Factory(appPreferenceHelperProvider);
  }

  public static PreferenceDataSourceImpl newInstance(AppPreferenceHelper appPreferenceHelper) {
    return new PreferenceDataSourceImpl(appPreferenceHelper);
  }
}
