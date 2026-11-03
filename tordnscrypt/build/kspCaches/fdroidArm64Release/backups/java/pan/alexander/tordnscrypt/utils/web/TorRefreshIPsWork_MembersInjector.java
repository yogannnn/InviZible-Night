package pan.alexander.tordnscrypt.utils.web;

import android.content.Context;
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
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

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
public final class TorRefreshIPsWork_MembersInjector implements MembersInjector<TorRefreshIPsWork> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<DnsInteractor> dnsInteractorProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Context> contextProvider;

  public TorRefreshIPsWork_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<DnsInteractor> dnsInteractorProvider, Provider<Handler> handlerProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Context> contextProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.dnsInteractorProvider = dnsInteractorProvider;
    this.handlerProvider = handlerProvider;
    this.executorProvider = executorProvider;
    this.contextProvider = contextProvider;
  }

  public static MembersInjector<TorRefreshIPsWork> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<DnsInteractor> dnsInteractorProvider, Provider<Handler> handlerProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Context> contextProvider) {
    return new TorRefreshIPsWork_MembersInjector(preferenceRepositoryProvider, defaultPreferencesProvider, dnsInteractorProvider, handlerProvider, executorProvider, contextProvider);
  }

  public static MembersInjector<TorRefreshIPsWork> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<DnsInteractor> dnsInteractorProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Context> contextProvider) {
    return new TorRefreshIPsWork_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(dnsInteractorProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(contextProvider));
  }

  @Override
  public void injectMembers(TorRefreshIPsWork instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectDnsInteractor(instance, DoubleCheck.lazy(dnsInteractorProvider));
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectExecutor(instance, executorProvider.get());
    injectContext(instance, contextProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork.preferenceRepository")
  public static void injectPreferenceRepository(TorRefreshIPsWork instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(TorRefreshIPsWork instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork.dnsInteractor")
  public static void injectDnsInteractor(TorRefreshIPsWork instance,
      Lazy<DnsInteractor> dnsInteractor) {
    instance.dnsInteractor = dnsInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork.handler")
  public static void injectHandler(TorRefreshIPsWork instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork.executor")
  public static void injectExecutor(TorRefreshIPsWork instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.web.TorRefreshIPsWork.context")
  public static void injectContext(TorRefreshIPsWork instance, Context context) {
    instance.context = context;
  }
}
