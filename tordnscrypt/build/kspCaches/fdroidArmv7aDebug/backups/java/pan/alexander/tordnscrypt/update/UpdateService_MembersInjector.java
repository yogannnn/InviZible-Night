package pan.alexander.tordnscrypt.update;

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
public final class UpdateService_MembersInjector implements MembersInjector<UpdateService> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public UpdateService_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<UpdateService> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new UpdateService_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<UpdateService> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new UpdateService_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(UpdateService instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.UpdateService.preferenceRepository")
  public static void injectPreferenceRepository(UpdateService instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
