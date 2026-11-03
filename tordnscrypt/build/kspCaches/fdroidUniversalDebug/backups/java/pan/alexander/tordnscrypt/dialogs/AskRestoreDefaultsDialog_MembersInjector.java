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
public final class AskRestoreDefaultsDialog_MembersInjector implements MembersInjector<AskRestoreDefaultsDialog> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public AskRestoreDefaultsDialog_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<AskRestoreDefaultsDialog> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new AskRestoreDefaultsDialog_MembersInjector(viewModelFactoryProvider);
  }

  public static MembersInjector<AskRestoreDefaultsDialog> create(
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new AskRestoreDefaultsDialog_MembersInjector(Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(AskRestoreDefaultsDialog instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.AskRestoreDefaultsDialog.viewModelFactory")
  public static void injectViewModelFactory(AskRestoreDefaultsDialog instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
