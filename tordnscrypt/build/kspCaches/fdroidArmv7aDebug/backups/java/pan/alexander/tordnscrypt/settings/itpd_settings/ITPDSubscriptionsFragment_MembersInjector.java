package pan.alexander.tordnscrypt.settings.itpd_settings;

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
public final class ITPDSubscriptionsFragment_MembersInjector implements MembersInjector<ITPDSubscriptionsFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public ITPDSubscriptionsFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<ITPDSubscriptionsFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ITPDSubscriptionsFragment_MembersInjector(viewModelFactoryProvider);
  }

  public static MembersInjector<ITPDSubscriptionsFragment> create(
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new ITPDSubscriptionsFragment_MembersInjector(Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(ITPDSubscriptionsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.itpd_settings.ITPDSubscriptionsFragment.viewModelFactory")
  public static void injectViewModelFactory(ITPDSubscriptionsFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
