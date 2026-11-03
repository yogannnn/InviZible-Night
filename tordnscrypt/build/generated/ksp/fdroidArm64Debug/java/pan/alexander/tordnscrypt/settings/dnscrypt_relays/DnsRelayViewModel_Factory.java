package pan.alexander.tordnscrypt.settings.dnscrypt_relays;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.domain.dnscrypt_relays.RelaysPingInteractor;
import pan.alexander.tordnscrypt.utils.parsers.DnsCryptConfigurationParser;

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
public final class DnsRelayViewModel_Factory implements Factory<DnsRelayViewModel> {
  private final Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<RelaysPingInteractor> relaysPingInteractorProvider;

  public DnsRelayViewModel_Factory(
      Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<RelaysPingInteractor> relaysPingInteractorProvider) {
    this.dnsCryptConfigurationParserProvider = dnsCryptConfigurationParserProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.relaysPingInteractorProvider = relaysPingInteractorProvider;
  }

  @Override
  public DnsRelayViewModel get() {
    return newInstance(dnsCryptConfigurationParserProvider.get(), dispatcherIoProvider.get(), relaysPingInteractorProvider.get());
  }

  public static DnsRelayViewModel_Factory create(
      javax.inject.Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<RelaysPingInteractor> relaysPingInteractorProvider) {
    return new DnsRelayViewModel_Factory(Providers.asDaggerProvider(dnsCryptConfigurationParserProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(relaysPingInteractorProvider));
  }

  public static DnsRelayViewModel_Factory create(
      Provider<DnsCryptConfigurationParser> dnsCryptConfigurationParserProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<RelaysPingInteractor> relaysPingInteractorProvider) {
    return new DnsRelayViewModel_Factory(dnsCryptConfigurationParserProvider, dispatcherIoProvider, relaysPingInteractorProvider);
  }

  public static DnsRelayViewModel newInstance(
      DnsCryptConfigurationParser dnsCryptConfigurationParser, CoroutineDispatcher dispatcherIo,
      RelaysPingInteractor relaysPingInteractor) {
    return new DnsRelayViewModel(dnsCryptConfigurationParser, dispatcherIo, relaysPingInteractor);
  }
}
