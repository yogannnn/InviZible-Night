package pan.alexander.tordnscrypt.data.preferences;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class PreferenceRepositoryImpl_Factory implements Factory<PreferenceRepositoryImpl> {
  private final Provider<PreferenceDataSource> preferenceDataSourceProvider;

  public PreferenceRepositoryImpl_Factory(
      Provider<PreferenceDataSource> preferenceDataSourceProvider) {
    this.preferenceDataSourceProvider = preferenceDataSourceProvider;
  }

  @Override
  public PreferenceRepositoryImpl get() {
    return newInstance(preferenceDataSourceProvider.get());
  }

  public static PreferenceRepositoryImpl_Factory create(
      javax.inject.Provider<PreferenceDataSource> preferenceDataSourceProvider) {
    return new PreferenceRepositoryImpl_Factory(Providers.asDaggerProvider(preferenceDataSourceProvider));
  }

  public static PreferenceRepositoryImpl_Factory create(
      Provider<PreferenceDataSource> preferenceDataSourceProvider) {
    return new PreferenceRepositoryImpl_Factory(preferenceDataSourceProvider);
  }

  public static PreferenceRepositoryImpl newInstance(PreferenceDataSource preferenceDataSource) {
    return new PreferenceRepositoryImpl(preferenceDataSource);
  }
}
