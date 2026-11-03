package pan.alexander.tordnscrypt.domain.log_reader.tor;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.session.AppSessionStore;

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
public final class TorLogParser_MembersInjector implements MembersInjector<TorLogParser> {
  private final Provider<AppSessionStore> sessionStoreProvider;

  public TorLogParser_MembersInjector(Provider<AppSessionStore> sessionStoreProvider) {
    this.sessionStoreProvider = sessionStoreProvider;
  }

  public static MembersInjector<TorLogParser> create(
      Provider<AppSessionStore> sessionStoreProvider) {
    return new TorLogParser_MembersInjector(sessionStoreProvider);
  }

  public static MembersInjector<TorLogParser> create(
      javax.inject.Provider<AppSessionStore> sessionStoreProvider) {
    return new TorLogParser_MembersInjector(Providers.asDaggerProvider(sessionStoreProvider));
  }

  @Override
  public void injectMembers(TorLogParser instance) {
    injectSessionStore(instance, sessionStoreProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.domain.log_reader.tor.TorLogParser.sessionStore")
  public static void injectSessionStore(TorLogParser instance, AppSessionStore sessionStore) {
    instance.sessionStore = sessionStore;
  }
}
