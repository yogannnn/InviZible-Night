package pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import kotlinx.coroutines.CoroutineDispatcher;

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
public final class RemixExistingDnsRulesWorker_MembersInjector implements MembersInjector<RemixExistingDnsRulesWorker> {
  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public RemixExistingDnsRulesWorker_MembersInjector(
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  public static MembersInjector<RemixExistingDnsRulesWorker> create(
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new RemixExistingDnsRulesWorker_MembersInjector(dispatcherIoProvider);
  }

  public static MembersInjector<RemixExistingDnsRulesWorker> create(
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new RemixExistingDnsRulesWorker_MembersInjector(Providers.asDaggerProvider(dispatcherIoProvider));
  }

  @Override
  public void injectMembers(RemixExistingDnsRulesWorker instance) {
    injectDispatcherIo(instance, dispatcherIoProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing.RemixExistingDnsRulesWorker.dispatcherIo")
  @Named("DISPATCHER_IO")
  public static void injectDispatcherIo(RemixExistingDnsRulesWorker instance,
      CoroutineDispatcher dispatcherIo) {
    instance.dispatcherIo = dispatcherIo;
  }
}
