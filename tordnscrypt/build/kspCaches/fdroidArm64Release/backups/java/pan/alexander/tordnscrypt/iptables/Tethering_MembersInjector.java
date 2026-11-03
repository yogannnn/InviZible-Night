package pan.alexander.tordnscrypt.iptables;

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
import pan.alexander.tordnscrypt.utils.ap.InternetSharingChecker;

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
public final class Tethering_MembersInjector implements MembersInjector<Tethering> {
  private final Provider<PathVars> pathVarsLazyProvider;

  private final Provider<SharedPreferences> defaultSharedPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<InternetSharingChecker> internetSharingCheckerProvider;

  public Tethering_MembersInjector(Provider<PathVars> pathVarsLazyProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<InternetSharingChecker> internetSharingCheckerProvider) {
    this.pathVarsLazyProvider = pathVarsLazyProvider;
    this.defaultSharedPreferencesProvider = defaultSharedPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.internetSharingCheckerProvider = internetSharingCheckerProvider;
  }

  public static MembersInjector<Tethering> create(Provider<PathVars> pathVarsLazyProvider,
      Provider<SharedPreferences> defaultSharedPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<InternetSharingChecker> internetSharingCheckerProvider) {
    return new Tethering_MembersInjector(pathVarsLazyProvider, defaultSharedPreferencesProvider, preferenceRepositoryProvider, internetSharingCheckerProvider);
  }

  public static MembersInjector<Tethering> create(
      javax.inject.Provider<PathVars> pathVarsLazyProvider,
      javax.inject.Provider<SharedPreferences> defaultSharedPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<InternetSharingChecker> internetSharingCheckerProvider) {
    return new Tethering_MembersInjector(Providers.asDaggerProvider(pathVarsLazyProvider), Providers.asDaggerProvider(defaultSharedPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(internetSharingCheckerProvider));
  }

  @Override
  public void injectMembers(Tethering instance) {
    injectPathVarsLazy(instance, DoubleCheck.lazy(pathVarsLazyProvider));
    injectDefaultSharedPreferences(instance, DoubleCheck.lazy(defaultSharedPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectInternetSharingChecker(instance, internetSharingCheckerProvider);
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.Tethering.pathVarsLazy")
  public static void injectPathVarsLazy(Tethering instance, Lazy<PathVars> pathVarsLazy) {
    instance.pathVarsLazy = pathVarsLazy;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.Tethering.defaultSharedPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultSharedPreferences(Tethering instance,
      Lazy<SharedPreferences> defaultSharedPreferences) {
    instance.defaultSharedPreferences = defaultSharedPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.Tethering.preferenceRepository")
  public static void injectPreferenceRepository(Tethering instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.Tethering.internetSharingChecker")
  public static void injectInternetSharingChecker(Tethering instance,
      javax.inject.Provider<InternetSharingChecker> internetSharingChecker) {
    instance.internetSharingChecker = internetSharingChecker;
  }
}
