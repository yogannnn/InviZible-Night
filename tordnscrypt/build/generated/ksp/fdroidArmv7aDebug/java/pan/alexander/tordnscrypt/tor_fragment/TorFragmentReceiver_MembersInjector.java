package pan.alexander.tordnscrypt.tor_fragment;

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
public final class TorFragmentReceiver_MembersInjector implements MembersInjector<TorFragmentReceiver> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  public TorFragmentReceiver_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<TorFragmentReceiver> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider) {
    return new TorFragmentReceiver_MembersInjector(preferenceRepositoryProvider, pathVarsProvider);
  }

  public static MembersInjector<TorFragmentReceiver> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new TorFragmentReceiver_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(TorFragmentReceiver instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentReceiver.preferenceRepository")
  public static void injectPreferenceRepository(TorFragmentReceiver instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentReceiver.pathVars")
  public static void injectPathVars(TorFragmentReceiver instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }
}
