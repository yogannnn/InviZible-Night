package pan.alexander.tordnscrypt.dialogs;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class BridgesReadyDialogFragment_MembersInjector implements MembersInjector<BridgesReadyDialogFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BridgesReadyDialogFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BridgesReadyDialogFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BridgesReadyDialogFragment_MembersInjector(viewModelFactoryProvider);
  }

  public static MembersInjector<BridgesReadyDialogFragment> create(
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BridgesReadyDialogFragment_MembersInjector(Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(BridgesReadyDialogFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.BridgesReadyDialogFragment.viewModelFactory")
  public static void injectViewModelFactory(BridgesReadyDialogFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
