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
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;
import pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager;

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
public final class UpdateCheck_MembersInjector implements MembersInjector<UpdateCheck> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<HttpsConnectionManager> httpsConnectionManagerProvider;

  private final Provider<Verifier> verifierProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<PathVars> pathVarsProvider;

  public UpdateCheck_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider,
      Provider<Verifier> verifierProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<PathVars> pathVarsProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.httpsConnectionManagerProvider = httpsConnectionManagerProvider;
    this.verifierProvider = verifierProvider;
    this.executorProvider = executorProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<UpdateCheck> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider,
      Provider<Verifier> verifierProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<PathVars> pathVarsProvider) {
    return new UpdateCheck_MembersInjector(preferenceRepositoryProvider, httpsConnectionManagerProvider, verifierProvider, executorProvider, pathVarsProvider);
  }

  public static MembersInjector<UpdateCheck> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<HttpsConnectionManager> httpsConnectionManagerProvider,
      javax.inject.Provider<Verifier> verifierProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new UpdateCheck_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(httpsConnectionManagerProvider), Providers.asDaggerProvider(verifierProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(UpdateCheck instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectHttpsConnectionManager(instance, DoubleCheck.lazy(httpsConnectionManagerProvider));
    injectVerifier(instance, DoubleCheck.lazy(verifierProvider));
    injectExecutor(instance, DoubleCheck.lazy(executorProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.UpdateCheck.preferenceRepository")
  public static void injectPreferenceRepository(UpdateCheck instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.UpdateCheck.httpsConnectionManager")
  public static void injectHttpsConnectionManager(UpdateCheck instance,
      Lazy<HttpsConnectionManager> httpsConnectionManager) {
    instance.httpsConnectionManager = httpsConnectionManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.UpdateCheck.verifier")
  public static void injectVerifier(UpdateCheck instance, Lazy<Verifier> verifier) {
    instance.verifier = verifier;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.UpdateCheck.executor")
  public static void injectExecutor(UpdateCheck instance, Lazy<CoroutineExecutor> executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.UpdateCheck.pathVars")
  public static void injectPathVars(UpdateCheck instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }
}
