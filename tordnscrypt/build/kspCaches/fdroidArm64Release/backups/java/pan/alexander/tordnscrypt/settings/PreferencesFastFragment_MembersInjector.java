package pan.alexander.tordnscrypt.settings;

import android.content.SharedPreferences;
import android.os.Handler;
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
import pan.alexander.tordnscrypt.dialogs.FakeSniInputDialogFragment;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsInteractorInterface;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.nflog.NflogManager;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
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
public final class PreferencesFastFragment_MembersInjector implements MembersInjector<PreferencesFastFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<NflogManager> nflogManagerProvider;

  private final Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<FakeSniInputDialogFragment> fakeSniInputDialogFragmentProvider;

  private final Provider<UpdateIPsManager> updateIPsManagerProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  public PreferencesFastFragment_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<NflogManager> nflogManagerProvider,
      Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<FakeSniInputDialogFragment> fakeSniInputDialogFragmentProvider,
      Provider<UpdateIPsManager> updateIPsManagerProvider,
      Provider<CoroutineExecutor> executorProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.handlerProvider = handlerProvider;
    this.nflogManagerProvider = nflogManagerProvider;
    this.connectionRecordsInteractorProvider = connectionRecordsInteractorProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.fakeSniInputDialogFragmentProvider = fakeSniInputDialogFragmentProvider;
    this.updateIPsManagerProvider = updateIPsManagerProvider;
    this.executorProvider = executorProvider;
  }

  public static MembersInjector<PreferencesFastFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<NflogManager> nflogManagerProvider,
      Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<FakeSniInputDialogFragment> fakeSniInputDialogFragmentProvider,
      Provider<UpdateIPsManager> updateIPsManagerProvider,
      Provider<CoroutineExecutor> executorProvider) {
    return new PreferencesFastFragment_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, handlerProvider, nflogManagerProvider, connectionRecordsInteractorProvider, pathVarsProvider, fakeSniInputDialogFragmentProvider, updateIPsManagerProvider, executorProvider);
  }

  public static MembersInjector<PreferencesFastFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<NflogManager> nflogManagerProvider,
      javax.inject.Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<FakeSniInputDialogFragment> fakeSniInputDialogFragmentProvider,
      javax.inject.Provider<UpdateIPsManager> updateIPsManagerProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider) {
    return new PreferencesFastFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(nflogManagerProvider), Providers.asDaggerProvider(connectionRecordsInteractorProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(fakeSniInputDialogFragmentProvider), Providers.asDaggerProvider(updateIPsManagerProvider), Providers.asDaggerProvider(executorProvider));
  }

  @Override
  public void injectMembers(PreferencesFastFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectNflogManager(instance, DoubleCheck.lazy(nflogManagerProvider));
    injectConnectionRecordsInteractor(instance, DoubleCheck.lazy(connectionRecordsInteractorProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectFakeSniInputDialogFragment(instance, DoubleCheck.lazy(fakeSniInputDialogFragmentProvider));
    injectUpdateIPsManager(instance, DoubleCheck.lazy(updateIPsManagerProvider));
    injectExecutor(instance, executorProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.preferenceRepository")
  public static void injectPreferenceRepository(PreferencesFastFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesFastFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.handler")
  public static void injectHandler(PreferencesFastFragment instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.nflogManager")
  public static void injectNflogManager(PreferencesFastFragment instance,
      Lazy<NflogManager> nflogManager) {
    instance.nflogManager = nflogManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.connectionRecordsInteractor")
  public static void injectConnectionRecordsInteractor(PreferencesFastFragment instance,
      Lazy<ConnectionRecordsInteractorInterface> connectionRecordsInteractor) {
    instance.connectionRecordsInteractor = connectionRecordsInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.pathVars")
  public static void injectPathVars(PreferencesFastFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.fakeSniInputDialogFragment")
  public static void injectFakeSniInputDialogFragment(PreferencesFastFragment instance,
      Lazy<FakeSniInputDialogFragment> fakeSniInputDialogFragment) {
    instance.fakeSniInputDialogFragment = fakeSniInputDialogFragment;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.updateIPsManager")
  public static void injectUpdateIPsManager(PreferencesFastFragment instance,
      Lazy<UpdateIPsManager> updateIPsManager) {
    instance.updateIPsManager = updateIPsManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesFastFragment.executor")
  public static void injectExecutor(PreferencesFastFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }
}
