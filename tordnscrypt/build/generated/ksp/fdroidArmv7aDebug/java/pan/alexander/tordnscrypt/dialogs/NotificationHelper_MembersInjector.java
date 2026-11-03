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
public final class NotificationHelper_MembersInjector implements MembersInjector<NotificationHelper> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public NotificationHelper_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<NotificationHelper> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new NotificationHelper_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<NotificationHelper> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new NotificationHelper_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(NotificationHelper instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.NotificationHelper.preferenceRepository")
  public static void injectPreferenceRepository(NotificationHelper instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
