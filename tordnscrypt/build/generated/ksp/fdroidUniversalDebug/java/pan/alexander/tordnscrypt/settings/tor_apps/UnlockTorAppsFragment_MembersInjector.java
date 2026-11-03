package pan.alexander.tordnscrypt.settings.tor_apps;

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
public final class UnlockTorAppsFragment_MembersInjector implements MembersInjector<UnlockTorAppsFragment> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<Verifier> verifierLazyProvider;

  public UnlockTorAppsFragment_MembersInjector(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerProvider,
      Provider<Verifier> verifierLazyProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
    this.handlerProvider = handlerProvider;
    this.verifierLazyProvider = verifierLazyProvider;
  }

  public static MembersInjector<UnlockTorAppsFragment> create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerProvider,
      Provider<Verifier> verifierLazyProvider) {
    return new UnlockTorAppsFragment_MembersInjector(defaultPreferencesProvider, preferenceRepositoryProvider, executorProvider, handlerProvider, verifierLazyProvider);
  }

  public static MembersInjector<UnlockTorAppsFragment> create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider) {
    return new UnlockTorAppsFragment_MembersInjector(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(verifierLazyProvider));
  }

  @Override
  public void injectMembers(UnlockTorAppsFragment instance) {
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(UnlockTorAppsFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment.preferenceRepository")
  public static void injectPreferenceRepository(UnlockTorAppsFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment.executor")
  public static void injectExecutor(UnlockTorAppsFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment.handler")
  public static void injectHandler(UnlockTorAppsFragment instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_apps.UnlockTorAppsFragment.verifierLazy")
  public static void injectVerifierLazy(UnlockTorAppsFragment instance,
      Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }
}
