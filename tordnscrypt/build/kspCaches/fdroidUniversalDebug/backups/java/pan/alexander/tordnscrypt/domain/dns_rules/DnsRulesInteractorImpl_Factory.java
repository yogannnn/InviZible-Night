package pan.alexander.tordnscrypt.domain.dns_rules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

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
public final class DnsRulesInteractorImpl_Factory implements Factory<DnsRulesInteractorImpl> {
  private final Provider<DnsRulesRepository> repositoryProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public DnsRulesInteractorImpl_Factory(Provider<DnsRulesRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.repositoryProvider = repositoryProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public DnsRulesInteractorImpl get() {
    return newInstance(repositoryProvider.get(), dispatcherIoProvider.get());
  }

  public static DnsRulesInteractorImpl_Factory create(
      javax.inject.Provider<DnsRulesRepository> repositoryProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new DnsRulesInteractorImpl_Factory(Providers.asDaggerProvider(repositoryProvider), Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static DnsRulesInteractorImpl_Factory create(
      Provider<DnsRulesRepository> repositoryProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new DnsRulesInteractorImpl_Factory(repositoryProvider, dispatcherIoProvider);
  }

  public static DnsRulesInteractorImpl newInstance(DnsRulesRepository repository,
      CoroutineDispatcher dispatcherIo) {
    return new DnsRulesInteractorImpl(repository, dispatcherIo);
  }
}
