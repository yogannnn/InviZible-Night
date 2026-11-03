package pan.alexander.tordnscrypt.proxy;

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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

@QualifierMetadata
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
public final class ProxyFragment_MembersInjector implements MembersInjector<ProxyFragment> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<ProxyHelper> proxyHelperProvider;

  public ProxyFragment_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerProvider,
      Provider<ProxyHelper> proxyHelperProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
    this.handlerProvider = handlerProvider;
    this.proxyHelperProvider = proxyHelperProvider;
  }

  public static MembersInjector<ProxyFragment> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider, Provider<Handler> handlerProvider,
      Provider<ProxyHelper> proxyHelperProvider) {
    return new ProxyFragment_MembersInjector(preferenceRepositoryProvider, executorProvider, handlerProvider, proxyHelperProvider);
  }

  public static MembersInjector<ProxyFragment> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<ProxyHelper> proxyHelperProvider) {
    return new ProxyFragment_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(proxyHelperProvider));
  }

  @Override
  public void injectMembers(ProxyFragment instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectProxyHelper(instance, proxyHelperProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.proxy.ProxyFragment.preferenceRepository")
  public static void injectPreferenceRepository(ProxyFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.proxy.ProxyFragment.executor")
  public static void injectExecutor(ProxyFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.proxy.ProxyFragment.handler")
  public static void injectHandler(ProxyFragment instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.proxy.ProxyFragment.proxyHelper")
  public static void injectProxyHelper(ProxyFragment instance, ProxyHelper proxyHelper) {
    instance.proxyHelper = proxyHelper;
  }
}
