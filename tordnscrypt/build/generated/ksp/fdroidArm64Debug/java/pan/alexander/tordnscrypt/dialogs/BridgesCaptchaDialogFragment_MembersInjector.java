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
public final class BridgesCaptchaDialogFragment_MembersInjector implements MembersInjector<BridgesCaptchaDialogFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BridgesCaptchaDialogFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<BridgesCaptchaDialogFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BridgesCaptchaDialogFragment_MembersInjector(viewModelFactoryProvider);
  }

  public static MembersInjector<BridgesCaptchaDialogFragment> create(
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BridgesCaptchaDialogFragment_MembersInjector(Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(BridgesCaptchaDialogFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.BridgesCaptchaDialogFragment.viewModelFactory")
  public static void injectViewModelFactory(BridgesCaptchaDialogFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
