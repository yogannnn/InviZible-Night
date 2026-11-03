package pan.alexander.tordnscrypt.dnscrypt_fragment;

import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;

@QualifierMetadata("javax.inject.Named")
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
public final class DNSCryptFragmentReceiver_MembersInjector implements MembersInjector<DNSCryptFragmentReceiver> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Verifier> verifierLazyProvider;

  public DNSCryptFragmentReceiver_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierLazyProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.verifierLazyProvider = verifierLazyProvider;
  }

  public static MembersInjector<DNSCryptFragmentReceiver> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierLazyProvider) {
    return new DNSCryptFragmentReceiver_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, pathVarsProvider, executorProvider, verifierLazyProvider);
  }

  public static MembersInjector<DNSCryptFragmentReceiver> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider) {
    return new DNSCryptFragmentReceiver_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(verifierLazyProvider));
  }

  @Override
  public void injectMembers(DNSCryptFragmentReceiver instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver.preferenceRepository")
  public static void injectPreferenceRepository(DNSCryptFragmentReceiver instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(DNSCryptFragmentReceiver instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver.pathVars")
  public static void injectPathVars(DNSCryptFragmentReceiver instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver.executor")
  public static void injectExecutor(DNSCryptFragmentReceiver instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentReceiver.verifierLazy")
  public static void injectVerifierLazy(DNSCryptFragmentReceiver instance,
      Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }
}
