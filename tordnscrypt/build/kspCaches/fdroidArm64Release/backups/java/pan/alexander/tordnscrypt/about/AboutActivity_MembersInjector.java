package pan.alexander.tordnscrypt.about;

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
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class AboutActivity_MembersInjector implements MembersInjector<AboutActivity> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public AboutActivity_MembersInjector(Provider<PathVars> pathVarsProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<AboutActivity> create(Provider<PathVars> pathVarsProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new AboutActivity_MembersInjector(pathVarsProvider, preferenceRepositoryProvider);
  }

  public static MembersInjector<AboutActivity> create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new AboutActivity_MembersInjector(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(AboutActivity instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.about.AboutActivity.pathVars")
  public static void injectPathVars(AboutActivity instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.about.AboutActivity.preferenceRepository")
  public static void injectPreferenceRepository(AboutActivity instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
