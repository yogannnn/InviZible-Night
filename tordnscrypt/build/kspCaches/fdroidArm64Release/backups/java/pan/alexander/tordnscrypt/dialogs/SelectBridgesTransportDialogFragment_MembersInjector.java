package pan.alexander.tordnscrypt.dialogs;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;

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
public final class SelectBridgesTransportDialogFragment_MembersInjector implements MembersInjector<SelectBridgesTransportDialogFragment> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public SelectBridgesTransportDialogFragment_MembersInjector(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<SelectBridgesTransportDialogFragment> create(
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new SelectBridgesTransportDialogFragment_MembersInjector(defaultPreferencesProvider, viewModelFactoryProvider);
  }

  public static MembersInjector<SelectBridgesTransportDialogFragment> create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new SelectBridgesTransportDialogFragment_MembersInjector(Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(SelectBridgesTransportDialogFragment instance) {
    injectDefaultPreferences(instance, defaultPreferencesProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.SelectBridgesTransportDialogFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(SelectBridgesTransportDialogFragment instance,
      SharedPreferences defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.SelectBridgesTransportDialogFragment.viewModelFactory")
  public static void injectViewModelFactory(SelectBridgesTransportDialogFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
