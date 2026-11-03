package pan.alexander.tordnscrypt.data.dnscrypt_relays;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.parsers.DnsCryptSDNSParser;

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
public final class RelaysPingDataSourceImpl_Factory implements Factory<RelaysPingDataSourceImpl> {
  private final Provider<DnsCryptSDNSParser> dnsCryptSDNSParserProvider;

  public RelaysPingDataSourceImpl_Factory(Provider<DnsCryptSDNSParser> dnsCryptSDNSParserProvider) {
    this.dnsCryptSDNSParserProvider = dnsCryptSDNSParserProvider;
  }

  @Override
  public RelaysPingDataSourceImpl get() {
    return newInstance(dnsCryptSDNSParserProvider.get());
  }

  public static RelaysPingDataSourceImpl_Factory create(
      javax.inject.Provider<DnsCryptSDNSParser> dnsCryptSDNSParserProvider) {
    return new RelaysPingDataSourceImpl_Factory(Providers.asDaggerProvider(dnsCryptSDNSParserProvider));
  }

  public static RelaysPingDataSourceImpl_Factory create(
      Provider<DnsCryptSDNSParser> dnsCryptSDNSParserProvider) {
    return new RelaysPingDataSourceImpl_Factory(dnsCryptSDNSParserProvider);
  }

  public static RelaysPingDataSourceImpl newInstance(DnsCryptSDNSParser dnsCryptSDNSParser) {
    return new RelaysPingDataSourceImpl(dnsCryptSDNSParser);
  }
}
