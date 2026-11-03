package pan.alexander.tordnscrypt.settings.firewall;

import android.content.SharedPreferences;
import android.os.Handler;
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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

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
public final class FirewallFragment_MembersInjector implements MembersInjector<FirewallFragment> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<Handler> handlerProvider;

  public FirewallFragment_MembersInjector(Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<Handler> handlerProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.handlerProvider = handlerProvider;
  }

  public static MembersInjector<FirewallFragment> create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<Handler> handlerProvider) {
    return new FirewallFragment_MembersInjector(defaultPreferencesProvider, preferenceRepositoryProvider, viewModelFactoryProvider, handlerProvider);
  }

  public static MembersInjector<FirewallFragment> create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      javax.inject.Provider<Handler> handlerProvider) {
    return new FirewallFragment_MembersInjector(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(viewModelFactoryProvider), Providers.asDaggerProvider(handlerProvider));
  }

  @Override
  public void injectMembers(FirewallFragment instance) {
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.firewall.FirewallFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(FirewallFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.firewall.FirewallFragment.preferenceRepository")
  public static void injectPreferenceRepository(FirewallFragment instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.firewall.FirewallFragment.viewModelFactory")
  public static void injectViewModelFactory(FirewallFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.firewall.FirewallFragment.handler")
  public static void injectHandler(FirewallFragment instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }
}
