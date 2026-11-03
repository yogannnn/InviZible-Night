package pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote;

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
public final class UpdateRemoteDnsRulesWorker_MembersInjector implements MembersInjector<UpdateRemoteDnsRulesWorker> {
  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<DownloadRemoteRulesManager> downloadRulesManagerProvider;

  public UpdateRemoteDnsRulesWorker_MembersInjector(
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<DownloadRemoteRulesManager> downloadRulesManagerProvider) {
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.downloadRulesManagerProvider = downloadRulesManagerProvider;
  }

  public static MembersInjector<UpdateRemoteDnsRulesWorker> create(
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<DownloadRemoteRulesManager> downloadRulesManagerProvider) {
    return new UpdateRemoteDnsRulesWorker_MembersInjector(dispatcherIoProvider, downloadRulesManagerProvider);
  }

  public static MembersInjector<UpdateRemoteDnsRulesWorker> create(
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<DownloadRemoteRulesManager> downloadRulesManagerProvider) {
    return new UpdateRemoteDnsRulesWorker_MembersInjector(Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(downloadRulesManagerProvider));
  }

  @Override
  public void injectMembers(UpdateRemoteDnsRulesWorker instance) {
    injectDispatcherIo(instance, dispatcherIoProvider.get());
    injectDownloadRulesManager(instance, downloadRulesManagerProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteDnsRulesWorker.dispatcherIo")
  @Named("DISPATCHER_IO")
  public static void injectDispatcherIo(UpdateRemoteDnsRulesWorker instance,
      CoroutineDispatcher dispatcherIo) {
    instance.dispatcherIo = dispatcherIo;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.dnscrypt_rules.remote.UpdateRemoteDnsRulesWorker.downloadRulesManager")
  public static void injectDownloadRulesManager(UpdateRemoteDnsRulesWorker instance,
      DownloadRemoteRulesManager downloadRulesManager) {
    instance.downloadRulesManager = downloadRulesManager;
  }
}
