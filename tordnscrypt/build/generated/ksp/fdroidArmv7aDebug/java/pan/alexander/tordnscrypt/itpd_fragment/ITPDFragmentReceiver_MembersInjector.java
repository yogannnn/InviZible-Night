package pan.alexander.tordnscrypt.itpd_fragment;

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
public final class ITPDFragmentReceiver_MembersInjector implements MembersInjector<ITPDFragmentReceiver> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  public ITPDFragmentReceiver_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<ITPDFragmentReceiver> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    return new ITPDFragmentReceiver_MembersInjector(preferenceRepositoryProvider, pathVarsProvider);
  }

  public static MembersInjector<ITPDFragmentReceiver> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new ITPDFragmentReceiver_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(ITPDFragmentReceiver instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentReceiver.preferenceRepository")
  public static void injectPreferenceRepository(ITPDFragmentReceiver instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentReceiver.pathVars")
  public static void injectPathVars(ITPDFragmentReceiver instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }
}
