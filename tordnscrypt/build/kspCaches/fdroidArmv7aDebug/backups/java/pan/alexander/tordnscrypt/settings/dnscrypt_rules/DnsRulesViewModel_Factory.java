package pan.alexander.tordnscrypt.settings.dnscrypt_rules;

import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineScope;
import pan.alexander.tordnscrypt.domain.dns_rules.DnsRulesInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteRulesWorkManager;

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
public final class DnsRulesViewModel_Factory implements Factory<DnsRulesViewModel> {
  private final Provider<DnsRulesInteractor> interactorProvider;

  private final Provider<CoroutineScope> baseCoroutineScopeProvider;

  private final Provider<PreferenceRepository> preferencesProvider;

  private final Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider;

  private final Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider;

  private final Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider;

  public DnsRulesViewModel_Factory(Provider<DnsRulesInteractor> interactorProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<PreferenceRepository> preferencesProvider,
      Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider,
      Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider,
      Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider) {
    this.interactorProvider = interactorProvider;
    this.baseCoroutineScopeProvider = baseCoroutineScopeProvider;
    this.preferencesProvider = preferencesProvider;
    this.remixExistingRulesWorkManagerProvider = remixExistingRulesWorkManagerProvider;
    this.updateRemoteDnsRulesManagerProvider = updateRemoteDnsRulesManagerProvider;
    this.updateLocalRulesWorkManagerProvider = updateLocalRulesWorkManagerProvider;
  }

  @Override
  public DnsRulesViewModel get() {
    return newInstance(interactorProvider.get(), baseCoroutineScopeProvider.get(), DoubleCheck.lazy(preferencesProvider), DoubleCheck.lazy(remixExistingRulesWorkManagerProvider), DoubleCheck.lazy(updateRemoteDnsRulesManagerProvider), DoubleCheck.lazy(updateLocalRulesWorkManagerProvider));
  }

  public static DnsRulesViewModel_Factory create(
      javax.inject.Provider<DnsRulesInteractor> interactorProvider,
      javax.inject.Provider<CoroutineScope> baseCoroutineScopeProvider,
      javax.inject.Provider<PreferenceRepository> preferencesProvider,
      javax.inject.Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider,
      javax.inject.Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider,
      javax.inject.Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider) {
    return new DnsRulesViewModel_Factory(Providers.asDaggerProvider(interactorProvider), Providers.asDaggerProvider(baseCoroutineScopeProvider), Providers.asDaggerProvider(preferencesProvider), Providers.asDaggerProvider(remixExistingRulesWorkManagerProvider), Providers.asDaggerProvider(updateRemoteDnsRulesManagerProvider), Providers.asDaggerProvider(updateLocalRulesWorkManagerProvider));
  }

  public static DnsRulesViewModel_Factory create(Provider<DnsRulesInteractor> interactorProvider,
      Provider<CoroutineScope> baseCoroutineScopeProvider,
      Provider<PreferenceRepository> preferencesProvider,
      Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider,
      Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider,
      Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider) {
    return new DnsRulesViewModel_Factory(interactorProvider, baseCoroutineScopeProvider, preferencesProvider, remixExistingRulesWorkManagerProvider, updateRemoteDnsRulesManagerProvider, updateLocalRulesWorkManagerProvider);
  }

  public static DnsRulesViewModel newInstance(DnsRulesInteractor interactor,
      CoroutineScope baseCoroutineScope, Lazy<PreferenceRepository> preferences,
      Lazy<RemixExistingRulesWorkManager> remixExistingRulesWorkManager,
      Lazy<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManager,
      Lazy<UpdateLocalRulesWorkManager> updateLocalRulesWorkManager) {
    return new DnsRulesViewModel(interactor, baseCoroutineScope, preferences, remixExistingRulesWorkManager, updateRemoteDnsRulesManager, updateLocalRulesWorkManager);
  }
}
