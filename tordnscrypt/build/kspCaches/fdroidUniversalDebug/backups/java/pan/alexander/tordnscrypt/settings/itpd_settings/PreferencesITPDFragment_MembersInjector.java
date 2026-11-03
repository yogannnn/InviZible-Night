package pan.alexander.tordnscrypt.settings.itpd_settings;

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
import pan.alexander.tordnscrypt.settings.PathVars;
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
public final class PreferencesITPDFragment_MembersInjector implements MembersInjector<PreferencesITPDFragment> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public PreferencesITPDFragment_MembersInjector(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.executorProvider = executorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  public static MembersInjector<PreferencesITPDFragment> create(Provider<PathVars> pathVarsProvider,
      Provider<CoroutineExecutor> executorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new PreferencesITPDFragment_MembersInjector(pathVarsProvider, executorProvider, defaultPreferencesProvider);
  }

  public static MembersInjector<PreferencesITPDFragment> create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new PreferencesITPDFragment_MembersInjector(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(executorProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  @Override
  public void injectMembers(PreferencesITPDFragment instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectExecutor(instance, executorProvider.get());
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.itpd_settings.PreferencesITPDFragment.pathVars")
  public static void injectPathVars(PreferencesITPDFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.itpd_settings.PreferencesITPDFragment.executor")
  public static void injectExecutor(PreferencesITPDFragment instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.itpd_settings.PreferencesITPDFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(PreferencesITPDFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }
}
