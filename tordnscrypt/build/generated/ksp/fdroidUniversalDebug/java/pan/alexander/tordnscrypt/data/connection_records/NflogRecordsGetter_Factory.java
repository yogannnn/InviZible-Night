package pan.alexander.tordnscrypt.data.connection_records;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.nflog.NflogManager;

@ScopeMetadata
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
public final class NflogRecordsGetter_Factory implements Factory<NflogRecordsGetter> {
  private final Provider<NflogManager> nflogManagerProvider;

  public NflogRecordsGetter_Factory(Provider<NflogManager> nflogManagerProvider) {
    this.nflogManagerProvider = nflogManagerProvider;
  }

  @Override
  public NflogRecordsGetter get() {
    return newInstance(nflogManagerProvider.get());
  }

  public static NflogRecordsGetter_Factory create(
      javax.inject.Provider<NflogManager> nflogManagerProvider) {
    return new NflogRecordsGetter_Factory(Providers.asDaggerProvider(nflogManagerProvider));
  }

  public static NflogRecordsGetter_Factory create(Provider<NflogManager> nflogManagerProvider) {
    return new NflogRecordsGetter_Factory(nflogManagerProvider);
  }

  public static NflogRecordsGetter newInstance(NflogManager nflogManager) {
    return new NflogRecordsGetter(nflogManager);
  }
}
