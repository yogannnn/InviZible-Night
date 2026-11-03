package pan.alexander.tordnscrypt.dnscrypt_fragment;

import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsInteractorInterface;
import pan.alexander.tordnscrypt.domain.log_reader.DNSCryptInteractorInterface;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

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
public final class DNSCryptFragmentPresenter_MembersInjector implements MembersInjector<DNSCryptFragmentPresenter> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider;

  private final Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public DNSCryptFragmentPresenter_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider,
      Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.dnsCryptInteractorProvider = dnsCryptInteractorProvider;
    this.connectionRecordsInteractorProvider = connectionRecordsInteractorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  public static MembersInjector<DNSCryptFragmentPresenter> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider,
      Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new DNSCryptFragmentPresenter_MembersInjector(preferenceRepositoryProvider, dnsCryptInteractorProvider, connectionRecordsInteractorProvider, defaultPreferencesProvider);
  }

  public static MembersInjector<DNSCryptFragmentPresenter> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<DNSCryptInteractorInterface> dnsCryptInteractorProvider,
      javax.inject.Provider<ConnectionRecordsInteractorInterface> connectionRecordsInteractorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new DNSCryptFragmentPresenter_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(dnsCryptInteractorProvider), Providers.asDaggerProvider(connectionRecordsInteractorProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  @Override
  public void injectMembers(DNSCryptFragmentPresenter instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectDnsCryptInteractor(instance, DoubleCheck.lazy(dnsCryptInteractorProvider));
    injectConnectionRecordsInteractor(instance, DoubleCheck.lazy(connectionRecordsInteractorProvider));
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentPresenter.preferenceRepository")
  public static void injectPreferenceRepository(DNSCryptFragmentPresenter instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentPresenter.dnsCryptInteractor")
  public static void injectDnsCryptInteractor(DNSCryptFragmentPresenter instance,
      Lazy<DNSCryptInteractorInterface> dnsCryptInteractor) {
    instance.dnsCryptInteractor = dnsCryptInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentPresenter.connectionRecordsInteractor")
  public static void injectConnectionRecordsInteractor(DNSCryptFragmentPresenter instance,
      Lazy<ConnectionRecordsInteractorInterface> connectionRecordsInteractor) {
    instance.connectionRecordsInteractor = connectionRecordsInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dnscrypt_fragment.DNSCryptFragmentPresenter.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(DNSCryptFragmentPresenter instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }
}
