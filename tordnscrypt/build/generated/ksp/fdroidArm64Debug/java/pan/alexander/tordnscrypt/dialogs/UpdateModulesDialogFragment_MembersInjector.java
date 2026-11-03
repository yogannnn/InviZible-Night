package pan.alexander.tordnscrypt.dialogs;

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
public final class UpdateModulesDialogFragment_MembersInjector implements MembersInjector<UpdateModulesDialogFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public UpdateModulesDialogFragment_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<UpdateModulesDialogFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new UpdateModulesDialogFragment_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<UpdateModulesDialogFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new UpdateModulesDialogFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(UpdateModulesDialogFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.UpdateModulesDialogFragment.preferenceRepository")
  public static void injectPreferenceRepository(UpdateModulesDialogFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
