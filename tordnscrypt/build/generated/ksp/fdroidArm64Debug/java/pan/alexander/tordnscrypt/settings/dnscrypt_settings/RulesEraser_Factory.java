package pan.alexander.tordnscrypt.settings.dnscrypt_settings;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalRulesWorkManager;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteRulesWorkManager;

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
public final class RulesEraser_Factory implements Factory<RulesEraser> {
  private final Provider<PreferenceRepository> preferencesProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider;

  private final Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider;

  private final Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider;

  public RulesEraser_Factory(Provider<PreferenceRepository> preferencesProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider,
      Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider,
      Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider) {
    this.preferencesProvider = preferencesProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.remixExistingRulesWorkManagerProvider = remixExistingRulesWorkManagerProvider;
    this.updateRemoteDnsRulesManagerProvider = updateRemoteDnsRulesManagerProvider;
    this.updateLocalRulesWorkManagerProvider = updateLocalRulesWorkManagerProvider;
  }

  @Override
  public RulesEraser get() {
    return newInstance(preferencesProvider.get(), pathVarsProvider.get(), remixExistingRulesWorkManagerProvider.get(), updateRemoteDnsRulesManagerProvider.get(), updateLocalRulesWorkManagerProvider.get());
  }

  public static RulesEraser_Factory create(
      javax.inject.Provider<PreferenceRepository> preferencesProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider,
      javax.inject.Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider,
      javax.inject.Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider) {
    return new RulesEraser_Factory(Providers.asDaggerProvider(preferencesProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(remixExistingRulesWorkManagerProvider), Providers.asDaggerProvider(updateRemoteDnsRulesManagerProvider), Providers.asDaggerProvider(updateLocalRulesWorkManagerProvider));
  }

  public static RulesEraser_Factory create(Provider<PreferenceRepository> preferencesProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<RemixExistingRulesWorkManager> remixExistingRulesWorkManagerProvider,
      Provider<UpdateRemoteRulesWorkManager> updateRemoteDnsRulesManagerProvider,
      Provider<UpdateLocalRulesWorkManager> updateLocalRulesWorkManagerProvider) {
    return new RulesEraser_Factory(preferencesProvider, pathVarsProvider, remixExistingRulesWorkManagerProvider, updateRemoteDnsRulesManagerProvider, updateLocalRulesWorkManagerProvider);
  }

  public static RulesEraser newInstance(PreferenceRepository preferences, PathVars pathVars,
      RemixExistingRulesWorkManager remixExistingRulesWorkManager,
      UpdateRemoteRulesWorkManager updateRemoteDnsRulesManager,
      UpdateLocalRulesWorkManager updateLocalRulesWorkManager) {
    return new RulesEraser(preferences, pathVars, remixExistingRulesWorkManager, updateRemoteDnsRulesManager, updateLocalRulesWorkManager);
  }
}
