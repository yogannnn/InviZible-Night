package pan.alexander.tordnscrypt.settings;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

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
public final class SettingsActivity_MembersInjector implements MembersInjector<SettingsActivity> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  public SettingsActivity_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<SettingsActivity> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    return new SettingsActivity_MembersInjector(preferenceRepositoryProvider, pathVarsProvider);
  }

  public static MembersInjector<SettingsActivity> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new SettingsActivity_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(SettingsActivity instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.SettingsActivity.preferenceRepository")
  public static void injectPreferenceRepository(SettingsActivity instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.SettingsActivity.pathVars")
  public static void injectPathVars(SettingsActivity instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }
}
