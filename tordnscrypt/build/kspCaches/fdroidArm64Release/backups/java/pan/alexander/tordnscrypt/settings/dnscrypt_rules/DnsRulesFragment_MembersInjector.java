package pan.alexander.tordnscrypt.settings.dnscrypt_rules;

import androidx.lifecycle.ViewModelProvider;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.settings.dnscrypt_rules.receiver.DnsRulesReceiver;

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
public final class DnsRulesFragment_MembersInjector implements MembersInjector<DnsRulesFragment> {
  private final Provider<PathVars> pathVarsProvider;

  private final Provider<DnsRulesReceiver> dnsRulesReceiverProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public DnsRulesFragment_MembersInjector(Provider<PathVars> pathVarsProvider,
      Provider<DnsRulesReceiver> dnsRulesReceiverProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.pathVarsProvider = pathVarsProvider;
    this.dnsRulesReceiverProvider = dnsRulesReceiverProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<DnsRulesFragment> create(Provider<PathVars> pathVarsProvider,
      Provider<DnsRulesReceiver> dnsRulesReceiverProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new DnsRulesFragment_MembersInjector(pathVarsProvider, dnsRulesReceiverProvider, viewModelFactoryProvider);
  }

  public static MembersInjector<DnsRulesFragment> create(
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<DnsRulesReceiver> dnsRulesReceiverProvider,
      javax.inject.Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new DnsRulesFragment_MembersInjector(Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(dnsRulesReceiverProvider), Providers.asDaggerProvider(viewModelFactoryProvider));
  }

  @Override
  public void injectMembers(DnsRulesFragment instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectDnsRulesReceiver(instance, DoubleCheck.lazy(dnsRulesReceiverProvider));
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesFragment.pathVars")
  public static void injectPathVars(DnsRulesFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesFragment.dnsRulesReceiver")
  public static void injectDnsRulesReceiver(DnsRulesFragment instance,
      Lazy<DnsRulesReceiver> dnsRulesReceiver) {
    instance.dnsRulesReceiver = dnsRulesReceiver;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.DnsRulesFragment.viewModelFactory")
  public static void injectViewModelFactory(DnsRulesFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
