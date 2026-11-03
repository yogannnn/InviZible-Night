package pan.alexander.tordnscrypt.help;

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
public final class HelpActivity_MembersInjector implements MembersInjector<HelpActivity> {
  private final Provider<PathVars> pathVarsLazyProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Verifier> verifierProvider;

  public HelpActivity_MembersInjector(Provider<PathVars> pathVarsLazyProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierProvider) {
    this.pathVarsLazyProvider = pathVarsLazyProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
    this.verifierProvider = verifierProvider;
  }

  public static MembersInjector<HelpActivity> create(Provider<PathVars> pathVarsLazyProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierProvider) {
    return new HelpActivity_MembersInjector(pathVarsLazyProvider, preferenceRepositoryProvider, executorProvider, verifierProvider);
  }

  public static MembersInjector<HelpActivity> create(
      javax.inject.Provider<PathVars> pathVarsLazyProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Verifier> verifierProvider) {
    return new HelpActivity_MembersInjector(Providers.asDaggerProvider(pathVarsLazyProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(verifierProvider));
  }

  @Override
  public void injectMembers(HelpActivity instance) {
    injectPathVarsLazy(instance, DoubleCheck.lazy(pathVarsLazyProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
    injectVerifier(instance, DoubleCheck.lazy(verifierProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.help.HelpActivity.pathVarsLazy")
  public static void injectPathVarsLazy(HelpActivity instance, Lazy<PathVars> pathVarsLazy) {
    instance.pathVarsLazy = pathVarsLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.help.HelpActivity.preferenceRepository")
  public static void injectPreferenceRepository(HelpActivity instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.help.HelpActivity.executor")
  public static void injectExecutor(HelpActivity instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.help.HelpActivity.verifier")
  public static void injectVerifier(HelpActivity instance, Lazy<Verifier> verifier) {
    instance.verifier = verifier;
  }
}
