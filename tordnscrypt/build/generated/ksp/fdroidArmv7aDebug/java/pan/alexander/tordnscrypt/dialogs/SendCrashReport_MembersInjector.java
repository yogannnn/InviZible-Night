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
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;

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
public final class SendCrashReport_MembersInjector implements MembersInjector<SendCrashReport> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Verifier> verifierProvider;

  public SendCrashReport_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<Verifier> verifierProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.verifierProvider = verifierProvider;
  }

  public static MembersInjector<SendCrashReport> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<Verifier> verifierProvider) {
    return new SendCrashReport_MembersInjector(preferenceRepositoryProvider, pathVarsProvider, executorProvider, verifierProvider);
  }

  public static MembersInjector<SendCrashReport> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Verifier> verifierProvider) {
    return new SendCrashReport_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(verifierProvider));
  }

  @Override
  public void injectMembers(SendCrashReport instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectVerifier(instance, DoubleCheck.lazy(verifierProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.SendCrashReport.preferenceRepository")
  public static void injectPreferenceRepository(SendCrashReport instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.SendCrashReport.pathVars")
  public static void injectPathVars(SendCrashReport instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.SendCrashReport.executor")
  public static void injectExecutor(SendCrashReport instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.SendCrashReport.verifier")
  public static void injectVerifier(SendCrashReport instance, Lazy<Verifier> verifier) {
    instance.verifier = verifier;
  }
}
