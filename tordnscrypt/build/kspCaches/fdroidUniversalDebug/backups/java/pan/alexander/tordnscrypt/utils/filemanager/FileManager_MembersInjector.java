package pan.alexander.tordnscrypt.utils.filemanager;

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
public final class FileManager_MembersInjector implements MembersInjector<FileManager> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public FileManager_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<FileManager> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new FileManager_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<FileManager> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new FileManager_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(FileManager instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.filemanager.FileManager.preferenceRepository")
  public static void injectPreferenceRepository(FileManager instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
