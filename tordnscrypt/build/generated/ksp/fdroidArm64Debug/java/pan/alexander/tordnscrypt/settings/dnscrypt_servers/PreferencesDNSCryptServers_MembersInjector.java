package pan.alexander.tordnscrypt.settings.dnscrypt_servers;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
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
public final class PreferencesDNSCryptServers_MembersInjector implements MembersInjector<PreferencesDNSCryptServers> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Verifier> verifierLazyProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PreferencesDNSCryptServers_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierLazyProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.verifierLazyProvider = verifierLazyProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PreferencesDNSCryptServers> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierLazyProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PreferencesDNSCryptServers_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, pathVarsProvider, executorProvider, verifierLazyProvider, viewModelFactoryProvider);
  }

  public static MembersInjector<PreferencesDNSCryptServers> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PreferencesDNSCryptServers_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(verifierLazyProvider), Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(PreferencesDNSCryptServers instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers.preferenceRepository")
  public static void injectPreferenceRepository(PreferencesDNSCryptServers instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesDNSCryptServers instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers.pathVars")
  public static void injectPathVars(PreferencesDNSCryptServers instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers.executor")
  public static void injectExecutor(PreferencesDNSCryptServers instance,
      CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers.verifierLazy")
  public static void injectVerifierLazy(PreferencesDNSCryptServers instance,
      Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_servers.PreferencesDNSCryptServers.viewModelFactory")
  public static void injectViewModelFactory(PreferencesDNSCryptServers instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
