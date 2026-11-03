package pan.alexander.tordnscrypt.settings.dnscrypt_settings;

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
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteRulesWorkManager;
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
public final class PreferencesDNSFragment_MembersInjector implements MembersInjector<PreferencesDNSFragment> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<Handler> handlerProvider;

  private final Provider<RulesEraser> rulesEraserProvider;

  private final Provider<UpdateRemoteRulesWorkManager> updateRemoteRulesWorkManagerProvider;

  public PreferencesDNSFragment_MembersInjector(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<RulesEraser> rulesEraserProvider,
      Provider<UpdateRemoteRulesWorkManager> updateRemoteRulesWorkManagerProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.handlerProvider = handlerProvider;
    this.rulesEraserProvider = rulesEraserProvider;
    this.updateRemoteRulesWorkManagerProvider = updateRemoteRulesWorkManagerProvider;
  }

  public static MembersInjector<PreferencesDNSFragment> create(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider, Provider<Handler> handlerProvider,
      Provider<RulesEraser> rulesEraserProvider,
      Provider<UpdateRemoteRulesWorkManager> updateRemoteRulesWorkManagerProvider) {
    return new PreferencesDNSFragment_MembersInjector(pathVarsProvider, executorProvider, defaultPreferencesProvider, handlerProvider, rulesEraserProvider, updateRemoteRulesWorkManagerProvider);
  }

  public static MembersInjector<PreferencesDNSFragment> create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<Handler> handlerProvider,
      javax.inject.Provider<RulesEraser> rulesEraserProvider,
      javax.inject.Provider<UpdateRemoteRulesWorkManager> updateRemoteRulesWorkManagerProvider) {
    return new PreferencesDNSFragment_MembersInjector(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(handlerProvider), Providers.asDaggerProvider(rulesEraserProvider), Providers.asDaggerProvider(updateRemoteRulesWorkManagerProvider));
  }

  @Override
  public void injectMembers(PreferencesDNSFragment instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectDefaultPreferences(instance, defaultPreferencesProvider.get());
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
    injectRulesEraser(instance, DoubleCheck.lazy(rulesEraserProvider));
    injectUpdateRemoteRulesWorkManager(instance, DoubleCheck.lazy(updateRemoteRulesWorkManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment.pathVars")
  public static void injectPathVars(PreferencesDNSFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment.executor")
  public static void injectExecutor(PreferencesDNSFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesDNSFragment instance,
      SharedPreferences defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment.handler")
  public static void injectHandler(PreferencesDNSFragment instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment.rulesEraser")
  public static void injectRulesEraser(PreferencesDNSFragment instance,
      Lazy<RulesEraser> rulesEraser) {
    instance.rulesEraser = rulesEraser;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_settings.PreferencesDNSFragment.updateRemoteRulesWorkManager")
  public static void injectUpdateRemoteRulesWorkManager(PreferencesDNSFragment instance,
      Lazy<UpdateRemoteRulesWorkManager> updateRemoteRulesWorkManager) {
    instance.updateRemoteRulesWorkManager = updateRemoteRulesWorkManager;
  }
}
