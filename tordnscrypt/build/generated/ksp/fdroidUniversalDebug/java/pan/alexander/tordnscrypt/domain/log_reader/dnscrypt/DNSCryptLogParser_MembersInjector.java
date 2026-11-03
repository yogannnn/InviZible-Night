package pan.alexander.tordnscrypt.domain.log_reader.dnscrypt;

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
public final class DNSCryptLogParser_MembersInjector implements MembersInjector<DNSCryptLogParser> {
  private final Provider<AppSessionStore> sessionStoreProvider;

  public DNSCryptLogParser_MembersInjector(Provider<AppSessionStore> sessionStoreProvider) {
    this.sessionStoreProvider = sessionStoreProvider;
  }

  public static MembersInjector<DNSCryptLogParser> create(
      Provider<AppSessionStore> sessionStoreProvider) {
    return new DNSCryptLogParser_MembersInjector(sessionStoreProvider);
  }

  public static MembersInjector<DNSCryptLogParser> create(
      javax.inject.Provider<AppSessionStore> sessionStoreProvider) {
    return new DNSCryptLogParser_MembersInjector(Providers.asDaggerProvider(sessionStoreProvider));
  }

  @Override
  public void injectMembers(DNSCryptLogParser instance) {
    injectSessionStore(instance, sessionStoreProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.domain.log_reader.dnscrypt.DNSCryptLogParser.sessionStore")
  public static void injectSessionStore(DNSCryptLogParser instance, AppSessionStore sessionStore) {
    instance.sessionStore = sessionStore;
  }
}
