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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.modules.ModulesStatusBroadcaster;
import pan.alexander.tordnscrypt.proxy.ProxyHelper;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;
import pan.alexander.tordnscrypt.utils.integrity.Verifier;
import pan.alexander.tordnscrypt.utils.session.AppSessionStore;

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
public final class PreferencesCommonFragment_MembersInjector implements MembersInjector<PreferencesCommonFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<ProxyHelper> proxyHelperProvider;

  private final Provider<Verifier> verifierLazyProvider;

  private final Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider;

  private final Provider<AppSessionStore> sessionStoreProvider;

  public PreferencesCommonFragment_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<Handler> handlerProvider, Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<ProxyHelper> proxyHelperProvider, Provider<Verifier> verifierLazyProvider,
      Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      Provider<AppSessionStore> sessionStoreProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.handlerProvider = handlerProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.proxyHelperProvider = proxyHelperProvider;
    this.verifierLazyProvider = verifierLazyProvider;
    this.modulesStatusBroadcasterProvider = modulesStatusBroadcasterProvider;
    this.sessionStoreProvider = sessionStoreProvider;
  }

  public static MembersInjector<PreferencesCommonFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<CoroutineExecutor> executorProvider,
      Provider<Handler> handlerProvider, Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<ProxyHelper> proxyHelperProvider, Provider<Verifier> verifierLazyProvider,
      Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      Provider<AppSessionStore> sessionStoreProvider) {
    return new PreferencesCommonFragment_MembersInjector(preferenceRepositoryProvider, pathVarsProvider, executorProvider, handlerProvider, defaultPreferencesProvider, proxyHelperProvider, verifierLazyProvider, modulesStatusBroadcasterProvider, sessionStoreProvider);
  }

  public static MembersInjector<PreferencesCommonFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<ProxyHelper> proxyHelperProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider,
      javax.inject.Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      javax.inject.Provider<AppSessionStore> sessionStoreProvider) {
    return new PreferencesCommonFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(proxyHelperProvider), Providers.asDaggerProvider(verifierLazyProvider), Providers.asDaggerProvider(modulesStatusBroadcasterProvider), Providers.asDaggerProvider(sessionStoreProvider));
  }

  @Override
  public void injectMembers(PreferencesCommonFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectProxyHelper(instance, DoubleCheck.lazy(proxyHelperProvider));
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
    injectModulesStatusBroadcaster(instance, DoubleCheck.lazy(modulesStatusBroadcasterProvider));
    injectSessionStore(instance, sessionStoreProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.preferenceRepository")
  public static void injectPreferenceRepository(PreferencesCommonFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.pathVars")
  public static void injectPathVars(PreferencesCommonFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.executor")
  public static void injectExecutor(PreferencesCommonFragment instance,
      CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.handler")
  public static void injectHandler(PreferencesCommonFragment instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesCommonFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.proxyHelper")
  public static void injectProxyHelper(PreferencesCommonFragment instance,
      Lazy<ProxyHelper> proxyHelper) {
    instance.proxyHelper = proxyHelper;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.verifierLazy")
  public static void injectVerifierLazy(PreferencesCommonFragment instance,
      Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.modulesStatusBroadcaster")
  public static void injectModulesStatusBroadcaster(PreferencesCommonFragment instance,
      Lazy<ModulesStatusBroadcaster> modulesStatusBroadcaster) {
    instance.modulesStatusBroadcaster = modulesStatusBroadcaster;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.PreferencesCommonFragment.sessionStore")
  public static void injectSessionStore(PreferencesCommonFragment instance,
      AppSessionStore sessionStore) {
    instance.sessionStore = sessionStore;
  }
}
