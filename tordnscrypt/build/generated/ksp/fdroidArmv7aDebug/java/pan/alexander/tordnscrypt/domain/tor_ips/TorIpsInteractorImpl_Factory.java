package pan.alexander.tordnscrypt.domain.tor_ips;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

@ScopeMetadata
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
public final class TorIpsInteractorImpl_Factory implements Factory<TorIpsInteractorImpl> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public TorIpsInteractorImpl_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public TorIpsInteractorImpl get() {
    return newInstance(DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  public static TorIpsInteractorImpl_Factory create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new TorIpsInteractorImpl_Factory(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  public static TorIpsInteractorImpl_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new TorIpsInteractorImpl_Factory(preferenceRepositoryProvider);
  }

  public static TorIpsInteractorImpl newInstance(Lazy<PreferenceRepository> preferenceRepository) {
    return new TorIpsInteractorImpl(preferenceRepository);
  }
}
