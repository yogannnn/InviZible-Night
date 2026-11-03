package pan.alexander.tordnscrypt.modules;

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
import pan.alexander.tordnscrypt.domain.log_reader.DNSCryptInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.ITPDInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.TorInteractorInterface;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.nflog.NflogManager;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.connectivitycheck.ConnectivityCheckManager;
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
public final class ModulesStateLoop_MembersInjector implements MembersInjector<ModulesStateLoop> {
  private final Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider;

  private final Provider<TorInteractorInterface> torInteractorProvider;

  private final Provider<ITPDInteractorInterface> itpdInteractorProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<NflogManager> nflogManagerProvider;

  private final Provider<ConnectivityCheckManager> connectivityCheckManagerProvider;

  private final Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider;

  private final Provider<UpdateIPsManager> updateIPsManagerProvider;

  private final Provider<ModulesVersions> modulesVersionsProvider;

  public ModulesStateLoop_MembersInjector(
      Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider,
      Provider<TorInteractorInterface> torInteractorProvider,
      Provider<ITPDInteractorInterface> itpdInteractorProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider, Provider<NflogManager> nflogManagerProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      Provider<UpdateIPsManager> updateIPsManagerProvider,
      Provider<ModulesVersions> modulesVersionsProvider) {
    this.dnsCryptInteractorProvider = dnsCryptInteractorProvider;
    this.torInteractorProvider = torInteractorProvider;
    this.itpdInteractorProvider = itpdInteractorProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.handlerProvider = handlerProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.nflogManagerProvider = nflogManagerProvider;
    this.connectivityCheckManagerProvider = connectivityCheckManagerProvider;
    this.modulesStatusBroadcasterProvider = modulesStatusBroadcasterProvider;
    this.updateIPsManagerProvider = updateIPsManagerProvider;
    this.modulesVersionsProvider = modulesVersionsProvider;
  }

  public static MembersInjector<ModulesStateLoop> create(
      Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider,
      Provider<TorInteractorInterface> torInteractorProvider,
      Provider<ITPDInteractorInterface> itpdInteractorProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider, Provider<NflogManager> nflogManagerProvider,
      Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      Provider<UpdateIPsManager> updateIPsManagerProvider,
      Provider<ModulesVersions> modulesVersionsProvider) {
    return new ModulesStateLoop_MembersInjector(dnsCryptInteractorProvider, torInteractorProvider, itpdInteractorProvider, preferenceRepositoryProvider, defaultPreferencesProvider, handlerProvider, pathVarsProvider, nflogManagerProvider, connectivityCheckManagerProvider, modulesStatusBroadcasterProvider, updateIPsManagerProvider, modulesVersionsProvider);
  }

  public static MembersInjector<ModulesStateLoop> create(
      javax.inject.Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider,
      javax.inject.Provider<TorInteractorInterface> torInteractorProvider,
      javax.inject.Provider<ITPDInteractorInterface> itpdInteractorProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<NflogManager> nflogManagerProvider,
      javax.inject.Provider<ConnectivityCheckManager> connectivityCheckManagerProvider,
      javax.inject.Provider<ModulesStatusBroadcaster> modulesStatusBroadcasterProvider,
      javax.inject.Provider<UpdateIPsManager> updateIPsManagerProvider,
      javax.inject.Provider<ModulesVersions> modulesVersionsProvider) {
    return new ModulesStateLoop_MembersInjector(Providers.asDaggerProvider(dnsCryptInteractorProvider), Providers.asDaggerProvider(torInteractorProvider), Providers.asDaggerProvider(itpdInteractorProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(nflogManagerProvider), Providers.asDaggerProvider(connectivityCheckManagerProvider), Providers.asDaggerProvider(modulesStatusBroadcasterProvider), Providers.asDaggerProvider(updateIPsManagerProvider), Providers.asDaggerProvider(modulesVersionsProvider));
  }

  @Override
  public void injectMembers(ModulesStateLoop instance) {
    injectDnsCryptInteractor(instance, dnsCryptInteractorProvider.get());
    injectTorInteractor(instance, torInteractorProvider.get());
    injectItpdInteractor(instance, itpdInteractorProvider.get());
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectNflogManager(instance, DoubleCheck.lazy(nflogManagerProvider));
    injectConnectivityCheckManager(instance, DoubleCheck.lazy(connectivityCheckManagerProvider));
    injectModulesStatusBroadcaster(instance, DoubleCheck.lazy(modulesStatusBroadcasterProvider));
    injectUpdateIPsManager(instance, DoubleCheck.lazy(updateIPsManagerProvider));
    injectModulesVersions(instance, DoubleCheck.lazy(modulesVersionsProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.dnsCryptInteractor")
  public static void injectDnsCryptInteractor(ModulesStateLoop instance,
      DNSCryptInteractorInterface dnsCryptInteractor) {
    instance.dnsCryptInteractor = dnsCryptInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.torInteractor")
  public static void injectTorInteractor(ModulesStateLoop instance,
      TorInteractorInterface torInteractor) {
    instance.torInteractor = torInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.itpdInteractor")
  public static void injectItpdInteractor(ModulesStateLoop instance,
      ITPDInteractorInterface itpdInteractor) {
    instance.itpdInteractor = itpdInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.preferenceRepository")
  public static void injectPreferenceRepository(ModulesStateLoop instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(ModulesStateLoop instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.handler")
  public static void injectHandler(ModulesStateLoop instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.pathVars")
  public static void injectPathVars(ModulesStateLoop instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.nflogManager")
  public static void injectNflogManager(ModulesStateLoop instance,
      Lazy<NflogManager> nflogManager) {
    instance.nflogManager = nflogManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.connectivityCheckManager")
  public static void injectConnectivityCheckManager(ModulesStateLoop instance,
      Lazy<ConnectivityCheckManager> connectivityCheckManager) {
    instance.connectivityCheckManager = connectivityCheckManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.modulesStatusBroadcaster")
  public static void injectModulesStatusBroadcaster(ModulesStateLoop instance,
      Lazy<ModulesStatusBroadcaster> modulesStatusBroadcaster) {
    instance.modulesStatusBroadcaster = modulesStatusBroadcaster;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.updateIPsManager")
  public static void injectUpdateIPsManager(ModulesStateLoop instance,
      Lazy<UpdateIPsManager> updateIPsManager) {
    instance.updateIPsManager = updateIPsManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesStateLoop.modulesVersions")
  public static void injectModulesVersions(ModulesStateLoop instance,
      Lazy<ModulesVersions> modulesVersions) {
    instance.modulesVersions = modulesVersions;
  }
}
