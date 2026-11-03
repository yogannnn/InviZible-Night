package pan.alexander.tordnscrypt.dialogs.progressDialogs;

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
public final class PleaseWaitDialogBridgesRequest_MembersInjector implements MembersInjector<PleaseWaitDialogBridgesRequest> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public PleaseWaitDialogBridgesRequest_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<PleaseWaitDialogBridgesRequest> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PleaseWaitDialogBridgesRequest_MembersInjector(viewModelFactoryProvider);
  }

  public static MembersInjector<PleaseWaitDialogBridgesRequest> create(
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new PleaseWaitDialogBridgesRequest_MembersInjector(Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(PleaseWaitDialogBridgesRequest instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.progressDialogs.PleaseWaitDialogBridgesRequest.viewModelFactory")
  public static void injectViewModelFactory(PleaseWaitDialogBridgesRequest instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
