package pan.alexander.tordnscrypt.vpn.service;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.dns_resolver.DnsInteractor;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

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
public final class VpnBuilder_Factory implements Factory<VpnBuilder> {
  private final Provider<Context> contextProvider;

  private final Provider<DnsInteractor> dnsInteractorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public VpnBuilder_Factory(Provider<Context> contextProvider,
      Provider<DnsInteractor> dnsInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.contextProvider = contextProvider;
    this.dnsInteractorProvider = dnsInteractorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public VpnBuilder get() {
    return newInstance(contextProvider.get(), DoubleCheck.lazy(dnsInteractorProvider), DoubleCheck.lazy(defaultPreferencesProvider), DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  public static VpnBuilder_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<DnsInteractor> dnsInteractorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new VpnBuilder_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(dnsInteractorProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  public static VpnBuilder_Factory create(Provider<Context> contextProvider,
      Provider<DnsInteractor> dnsInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new VpnBuilder_Factory(contextProvider, dnsInteractorProvider, defaultPreferencesProvider, preferenceRepositoryProvider);
  }

  public static VpnBuilder newInstance(Context context, Lazy<DnsInteractor> dnsInteractor,
      Lazy<SharedPreferences> defaultPreferences, Lazy<PreferenceRepository> preferenceRepository) {
    return new VpnBuilder(context, dnsInteractor, defaultPreferences, preferenceRepository);
  }
}
