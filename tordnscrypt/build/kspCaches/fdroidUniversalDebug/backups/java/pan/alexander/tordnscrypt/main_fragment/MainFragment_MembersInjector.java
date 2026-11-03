package pan.alexander.tordnscrypt.main_fragment;

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
public final class MainFragment_MembersInjector implements MembersInjector<MainFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public MainFragment_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<MainFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new MainFragment_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<MainFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new MainFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(MainFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.main_fragment.MainFragment.preferenceRepository")
  public static void injectPreferenceRepository(MainFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
