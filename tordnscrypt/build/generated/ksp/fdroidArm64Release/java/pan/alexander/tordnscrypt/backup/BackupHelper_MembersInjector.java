package pan.alexander.tordnscrypt.backup;

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
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

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
public final class BackupHelper_MembersInjector implements MembersInjector<BackupHelper> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  public BackupHelper_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
  }

  public static MembersInjector<BackupHelper> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider) {
    return new BackupHelper_MembersInjector(preferenceRepositoryProvider, executorProvider);
  }

  public static MembersInjector<BackupHelper> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider) {
    return new BackupHelper_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider));
  }

  @Override
  public void injectMembers(BackupHelper instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.backup.BackupHelper.preferenceRepository")
  public static void injectPreferenceRepository(BackupHelper instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.backup.BackupHelper.executor")
  public static void injectExecutor(BackupHelper instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }
}
