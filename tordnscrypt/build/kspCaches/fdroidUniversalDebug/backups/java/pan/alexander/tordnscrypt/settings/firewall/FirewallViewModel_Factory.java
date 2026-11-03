package pan.alexander.tordnscrypt.settings.firewall;

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
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class FirewallViewModel_Factory implements Factory<FirewallViewModel> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherComputationProvider;

  private final Provider<PathVars> pathVarsProvider;

  public FirewallViewModel_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherComputationProvider,
      Provider<PathVars> pathVarsProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.dispatcherComputationProvider = dispatcherComputationProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public FirewallViewModel get() {
    return newInstance(DoubleCheck.lazy(preferenceRepositoryProvider), dispatcherComputationProvider.get(), DoubleCheck.lazy(pathVarsProvider));
  }

  public static FirewallViewModel_Factory create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherComputationProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new FirewallViewModel_Factory(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(dispatcherComputationProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static FirewallViewModel_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineDispatcher> dispatcherComputationProvider,
      Provider<PathVars> pathVarsProvider) {
    return new FirewallViewModel_Factory(preferenceRepositoryProvider, dispatcherComputationProvider, pathVarsProvider);
  }

  public static FirewallViewModel newInstance(Lazy<PreferenceRepository> preferenceRepository,
      CoroutineDispatcher dispatcherComputation, Lazy<PathVars> pathVars) {
    return new FirewallViewModel(preferenceRepository, dispatcherComputation, pathVars);
  }
}
