package pan.alexander.tordnscrypt.settings.dnscrypt_rules.local;

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
public final class UpdateLocalDnsRulesWorker_MembersInjector implements MembersInjector<UpdateLocalDnsRulesWorker> {
  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public UpdateLocalDnsRulesWorker_MembersInjector(
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  public static MembersInjector<UpdateLocalDnsRulesWorker> create(
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new UpdateLocalDnsRulesWorker_MembersInjector(dispatcherIoProvider);
  }

  public static MembersInjector<UpdateLocalDnsRulesWorker> create(
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new UpdateLocalDnsRulesWorker_MembersInjector(Providers.asDaggerProvider(dispatcherIoProvider));
  }

  @Override
  public void injectMembers(UpdateLocalDnsRulesWorker instance) {
    injectDispatcherIo(instance, dispatcherIoProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.local.UpdateLocalDnsRulesWorker.dispatcherIo")
  @Named("DISPATCHER_IO")
  public static void injectDispatcherIo(UpdateLocalDnsRulesWorker instance,
      CoroutineDispatcher dispatcherIo) {
    instance.dispatcherIo = dispatcherIo;
  }
}
