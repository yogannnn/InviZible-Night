package pan.alexander.tordnscrypt;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.backup.ResetModuleHelper;

@ScopeMetadata
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
public final class TopFragmentViewModel_Factory implements Factory<TopFragmentViewModel> {
  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<ResetModuleHelper> resetModuleHelperProvider;

  public TopFragmentViewModel_Factory(Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<ResetModuleHelper> resetModuleHelperProvider) {
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.resetModuleHelperProvider = resetModuleHelperProvider;
  }

  @Override
  public TopFragmentViewModel get() {
    return newInstance(dispatcherIoProvider.get(), DoubleCheck.lazy(resetModuleHelperProvider));
  }

  public static TopFragmentViewModel_Factory create(
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<ResetModuleHelper> resetModuleHelperProvider) {
    return new TopFragmentViewModel_Factory(Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(resetModuleHelperProvider));
  }

  public static TopFragmentViewModel_Factory create(
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<ResetModuleHelper> resetModuleHelperProvider) {
    return new TopFragmentViewModel_Factory(dispatcherIoProvider, resetModuleHelperProvider);
  }

  public static TopFragmentViewModel newInstance(CoroutineDispatcher dispatcherIo,
      Lazy<ResetModuleHelper> resetModuleHelper) {
    return new TopFragmentViewModel(dispatcherIo, resetModuleHelper);
  }
}
