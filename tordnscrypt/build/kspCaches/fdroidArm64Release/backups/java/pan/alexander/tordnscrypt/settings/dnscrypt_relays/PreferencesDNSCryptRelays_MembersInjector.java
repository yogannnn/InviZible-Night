package pan.alexander.tordnscrypt.settings.dnscrypt_relays;

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
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class PreferencesDNSCryptRelays_MembersInjector implements MembersInjector<PreferencesDNSCryptRelays> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PreferencesDNSCryptRelays_MembersInjector(Provider<PathVars> pathVarsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PreferencesDNSCryptRelays> create(
      Provider<PathVars> pathVarsProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PreferencesDNSCryptRelays_MembersInjector(pathVarsProvider, viewModelFactoryProvider);
  }

  public static MembersInjector<PreferencesDNSCryptRelays> create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PreferencesDNSCryptRelays_MembersInjector(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(PreferencesDNSCryptRelays instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_relays.PreferencesDNSCryptRelays.pathVars")
  public static void injectPathVars(PreferencesDNSCryptRelays instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_relays.PreferencesDNSCryptRelays.viewModelFactory")
  public static void injectViewModelFactory(PreferencesDNSCryptRelays instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
