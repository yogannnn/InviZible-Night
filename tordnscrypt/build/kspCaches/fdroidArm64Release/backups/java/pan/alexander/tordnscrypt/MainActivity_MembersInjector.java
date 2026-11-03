package pan.alexander.tordnscrypt;

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
import pan.alexander.tordnscrypt.assistance.AccelerateDevelop;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.ap.ApManager;
import pan.alexander.tordnscrypt.utils.ap.InternetSharingChecker;
import pan.alexander.tordnscrypt.utils.executors.CachedExecutor;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<InternetSharingChecker> internetSharingCheckerProvider;

  private final Provider<ApManager> apManagerProvider;

  private final Provider<CachedExecutor> executorProvider;

  private final Provider<AccelerateDevelop> accelerateDevelopProvider;

  public MainActivity_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<InternetSharingChecker> internetSharingCheckerProvider,
      Provider<ApManager> apManagerProvider, Provider<CachedExecutor> executorProvider,
      Provider<AccelerateDevelop> accelerateDevelopProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.handlerProvider = handlerProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.internetSharingCheckerProvider = internetSharingCheckerProvider;
    this.apManagerProvider = apManagerProvider;
    this.executorProvider = executorProvider;
    this.accelerateDevelopProvider = accelerateDevelopProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<InternetSharingChecker> internetSharingCheckerProvider,
      Provider<ApManager> apManagerProvider, Provider<CachedExecutor> executorProvider,
      Provider<AccelerateDevelop> accelerateDevelopProvider) {
    return new MainActivity_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, handlerProvider, pathVarsProvider, internetSharingCheckerProvider, apManagerProvider, executorProvider, accelerateDevelopProvider);
  }

  public static MembersInjector<MainActivity> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<InternetSharingChecker> internetSharingCheckerProvider,
      javax.inject.Provider<ApManager> apManagerProvider,
      javax.inject.Provider<CachedExecutor> executorProvider,
      javax.inject.Provider<AccelerateDevelop> accelerateDevelopProvider) {
    return new MainActivity_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(internetSharingCheckerProvider), Providers.asDaggerProvider(apManagerProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(accelerateDevelopProvider));
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectHandler(instance, handlerProvider.get());
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectInternetSharingChecker(instance, internetSharingCheckerProvider);
    injectApManager(instance, DoubleCheck.lazy(apManagerProvider));
    injectExecutor(instance, DoubleCheck.lazy(executorProvider));
    injectAccelerateDevelop(instance, DoubleCheck.lazy(accelerateDevelopProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.preferenceRepository")
  public static void injectPreferenceRepository(MainActivity instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(MainActivity instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.handler")
  public static void injectHandler(MainActivity instance, Handler handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.pathVars")
  public static void injectPathVars(MainActivity instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.internetSharingChecker")
  public static void injectInternetSharingChecker(MainActivity instance,
      javax.inject.Provider<InternetSharingChecker> internetSharingChecker) {
    instance.internetSharingChecker = internetSharingChecker;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.apManager")
  public static void injectApManager(MainActivity instance, Lazy<ApManager> apManager) {
    instance.apManager = apManager;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.executor")
  public static void injectExecutor(MainActivity instance, Lazy<CachedExecutor> executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.MainActivity.accelerateDevelop")
  public static void injectAccelerateDevelop(MainActivity instance,
      Lazy<AccelerateDevelop> accelerateDevelop) {
    instance.accelerateDevelop = accelerateDevelop;
  }
}
