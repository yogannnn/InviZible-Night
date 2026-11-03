package pan.alexander.tordnscrypt.settings.tor_ips;

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
public final class UnlockTorIpsFragment_MembersInjector implements MembersInjector<UnlockTorIpsFragment> {
  private final Provider<CoroutineExecutor> coroutineExecutorProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Verifier> verifierLazyProvider;

  public UnlockTorIpsFragment_MembersInjector(Provider<CoroutineExecutor> coroutineExecutorProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<Verifier> verifierLazyProvider) {
    this.coroutineExecutorProvider = coroutineExecutorProvider;
    this.executorProvider = executorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.verifierLazyProvider = verifierLazyProvider;
  }

  public static MembersInjector<UnlockTorIpsFragment> create(
      Provider<CoroutineExecutor> coroutineExecutorProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<Verifier> verifierLazyProvider) {
    return new UnlockTorIpsFragment_MembersInjector(coroutineExecutorProvider, executorProvider, viewModelFactoryProvider, defaultPreferencesProvider, verifierLazyProvider);
  }

  public static MembersInjector<UnlockTorIpsFragment> create(
      javax.inject.Provider<CoroutineExecutor> coroutineExecutorProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Verifier> verifierLazyProvider) {
    return new UnlockTorIpsFragment_MembersInjector(Providers.asDaggerProvider(coroutineExecutorProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(viewModelFactoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(verifierLazyProvider));
  }

  @Override
  public void injectMembers(UnlockTorIpsFragment instance) {
    injectCoroutineExecutor(instance, DoubleCheck.lazy(coroutineExecutorProvider));
    injectExecutor(instance, executorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectVerifierLazy(instance, DoubleCheck.lazy(verifierLazyProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment.coroutineExecutor")
  public static void injectCoroutineExecutor(UnlockTorIpsFragment instance,
      Lazy<CoroutineExecutor> coroutineExecutor) {
    instance.coroutineExecutor = coroutineExecutor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment.executor")
  public static void injectExecutor(UnlockTorIpsFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment.viewModelFactory")
  public static void injectViewModelFactory(UnlockTorIpsFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(UnlockTorIpsFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.tor_ips.UnlockTorIpsFragment.verifierLazy")
  public static void injectVerifierLazy(UnlockTorIpsFragment instance,
      Lazy<Verifier> verifierLazy) {
    instance.verifierLazy = verifierLazy;
  }
}
