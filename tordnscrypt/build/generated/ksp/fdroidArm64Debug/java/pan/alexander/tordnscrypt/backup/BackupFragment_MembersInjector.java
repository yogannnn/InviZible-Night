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
import pan.alexander.tordnscrypt.settings.PathVars;
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
public final class BackupFragment_MembersInjector implements MembersInjector<BackupFragment> {
  private final Provider<PathVars> pathVarsLazyProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  public BackupFragment_MembersInjector(Provider<PathVars> pathVarsLazyProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider) {
    this.pathVarsLazyProvider = pathVarsLazyProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
  }

  public static MembersInjector<BackupFragment> create(Provider<PathVars> pathVarsLazyProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider) {
    return new BackupFragment_MembersInjector(pathVarsLazyProvider, preferenceRepositoryProvider, executorProvider);
  }

  public static MembersInjector<BackupFragment> create(
      javax.inject.Provider<PathVars> pathVarsLazyProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider) {
    return new BackupFragment_MembersInjector(Providers.asDaggerProvider(pathVarsLazyProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider));
  }

  @Override
  public void injectMembers(BackupFragment instance) {
    injectPathVarsLazy(instance, DoubleCheck.lazy(pathVarsLazyProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.backup.BackupFragment.pathVarsLazy")
  public static void injectPathVarsLazy(BackupFragment instance, Lazy<PathVars> pathVarsLazy) {
    instance.pathVarsLazy = pathVarsLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.backup.BackupFragment.preferenceRepository")
  public static void injectPreferenceRepository(BackupFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.backup.BackupFragment.executor")
  public static void injectExecutor(BackupFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }
}
