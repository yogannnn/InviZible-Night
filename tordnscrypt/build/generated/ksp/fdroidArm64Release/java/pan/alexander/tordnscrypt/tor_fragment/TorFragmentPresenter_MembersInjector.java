package pan.alexander.tordnscrypt.tor_fragment;

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
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractorImpl;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.TorInteractorInterface;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;
import pan.alexander.tordnscrypt.utils.workers.UpdateIPsManager;

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
public final class TorFragmentPresenter_MembersInjector implements MembersInjector<TorFragmentPresenter> {
  private final Provider<ConnectionCheckerInteractorImpl> checkConnectionInteractorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<TorInteractorInterface> torInteractorProvider;

  private final Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Verifier> verifierLazyProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<UpdateIPsManager> updateIPsManagerProvider;

  public TorFragmentPresenter_MembersInjector(
      Provider<ConnectionCheckerInteractorImpl> checkConnectionInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<TorInteractorInterface> torInteractorProvider,
      Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierLazyProvider,
      Provider<PathVars> pathVarsProvider, Provider<UpdateIPsManager> updateIPsManagerProvider) {
    this.checkConnectionInteractorProvider = checkConnectionInteractorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.torInteractorProvider = torInteractorProvider;
    this.connectionRecordsInteractorProvider = connectionRecordsInteractorProvider;
    this.executorProvider = executorProvider;
    this.verifierLazyProvider = verifierLazyProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.updateIPsManagerProvider = updateIPsManagerProvider;
  }

  public static MembersInjector<TorFragmentPresenter> create(
      Provider<ConnectionCheckerInteractorImpl> checkConnectionInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<TorInteractorInterface> torInteractorProvider,
      Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Verifier> verifierLazyProvider,
      Provider<PathVars> pathVarsProvider, Provider<UpdateIPsManager> updateIPsManagerProvider) {
    return new TorFragmentPresenter_MembersInjector(checkConnectionInteractorProvider, defaultPreferencesProvider, preferenceRepositoryProvider, torInteractorProvider, connectionRecordsInteractorProvider, executorProvider, verifierLazyProvider, pathVarsProvider, updateIPsManagerProvider);
  }

  public static MembersInjector<TorFragmentPresenter> create(
      javax.inject.Provider<ConnectionCheckerInteractorImpl> checkConnectionInteractorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<TorInteractorInterface> torInteractorProvider,
      javax.inject.Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<UpdateIPsManager> updateIPsManagerProvider) {
    return new TorFragmentPresenter_MembersInjector(Providers.asDaggerProvider(checkConnectionInteractorProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(torInteractorProvider), Providers.asDaggerProvider(connectionRecordsInteractorProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(verifierLazyProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(updateIPsManagerProvider));
  }

  @Override
  public void injectMembers(TorFragmentPresenter instance) {
    injectCheckConnectionInteractor(instance, DoubleCheck.lazy(checkConnectionInteractorProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectTorInteractor(instance, DoubleCheck.lazy(torInteractorProvider));
    injectConnectionRecordsInteractor(instance, DoubleCheck.lazy(connectionRecordsInteractorProvider));
    injectExecutor(instance, executorProvider.get());
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectUpdateIPsManager(instance, DoubleCheck.lazy(updateIPsManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.checkConnectionInteractor")
  public static void injectCheckConnectionInteractor(TorFragmentPresenter instance,
      Lazy<ConnectionCheckerInteractorImpl> checkConnectionInteractor) {
    instance.checkConnectionInteractor = checkConnectionInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(TorFragmentPresenter instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.preferenceRepository")
  public static void injectPreferenceRepository(TorFragmentPresenter instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.torInteractor")
  public static void injectTorInteractor(TorFragmentPresenter instance,
      Lazy<TorInteractorInterface> torInteractor) {
    instance.torInteractor = torInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.connectionRecordsInteractor")
  public static void injectConnectionRecordsInteractor(TorFragmentPresenter instance,
      Lazy<ConnectionRecordsInteractorInterface> connectionRecordsInteractor) {
    instance.connectionRecordsInteractor = connectionRecordsInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.executor")
  public static void injectExecutor(TorFragmentPresenter instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.verifierLazy")
  public static void injectVerifierLazy(TorFragmentPresenter instance,
      Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.pathVars")
  public static void injectPathVars(TorFragmentPresenter instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tor_fragment.TorFragmentPresenter.updateIPsManager")
  public static void injectUpdateIPsManager(TorFragmentPresenter instance,
      Lazy<UpdateIPsManager> updateIPsManager) {
    instance.updateIPsManager = updateIPsManager;
  }
}
