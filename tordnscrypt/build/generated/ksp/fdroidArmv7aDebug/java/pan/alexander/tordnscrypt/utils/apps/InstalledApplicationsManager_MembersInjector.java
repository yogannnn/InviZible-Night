package pan.alexander.tordnscrypt.utils.apps;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import pan.alexander.tordnscrypt.settings.PathVars;
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
public final class InstalledApplicationsManager_MembersInjector implements MembersInjector<InstalledApplicationsManager> {
  private final Provider<Context> contextProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider;

  private final Provider<AppSessionStore> sessionStoreProvider;

  public InstalledApplicationsManager_MembersInjector(Provider<Context> contextProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<PathVars> pathVarsProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<AppSessionStore> sessionStoreProvider) {
    this.contextProvider = contextProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.installedAppNamesStorageProvider = installedAppNamesStorageProvider;
    this.sessionStoreProvider = sessionStoreProvider;
  }

  public static MembersInjector<InstalledApplicationsManager> create(
      Provider<Context> contextProvider, Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      Provider<AppSessionStore> sessionStoreProvider) {
    return new InstalledApplicationsManager_MembersInjector(contextProvider, defaultPreferencesProvider, pathVarsProvider, installedAppNamesStorageProvider, sessionStoreProvider);
  }

  public static MembersInjector<InstalledApplicationsManager> create(
      javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<InstalledAppNamesStorage> installedAppNamesStorageProvider,
      javax.inject.Provider<AppSessionStore> sessionStoreProvider) {
    return new InstalledApplicationsManager_MembersInjector(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(installedAppNamesStorageProvider), Providers.asDaggerProvider(sessionStoreProvider));
  }

  @Override
  public void injectMembers(InstalledApplicationsManager instance) {
    injectContext(instance, contextProvider.get());
    injectDefaultPreferences(instance, defaultPreferencesProvider.get());
    injectPathVars(instance, pathVarsProvider.get());
    injectInstalledAppNamesStorage(instance, installedAppNamesStorageProvider.get());
    injectSessionStore(instance, sessionStoreProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager.context")
  public static void injectContext(InstalledApplicationsManager instance, Context context) {
    instance.context = context;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(InstalledApplicationsManager instance,
      SharedPreferences defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager.pathVars")
  public static void injectPathVars(InstalledApplicationsManager instance, PathVars pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager.installedAppNamesStorage")
  public static void injectInstalledAppNamesStorage(InstalledApplicationsManager instance,
      InstalledAppNamesStorage installedAppNamesStorage) {
    instance.installedAppNamesStorage = installedAppNamesStorage;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.apps.InstalledApplicationsManager.sessionStore")
  public static void injectSessionStore(InstalledApplicationsManager instance,
      AppSessionStore sessionStore) {
    instance.sessionStore = sessionStore;
  }
}
