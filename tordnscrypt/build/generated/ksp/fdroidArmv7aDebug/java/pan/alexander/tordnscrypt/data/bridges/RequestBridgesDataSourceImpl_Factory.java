package pan.alexander.tordnscrypt.data.bridges;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.parsers.TorProjectBridgesParser;

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
public final class RequestBridgesDataSourceImpl_Factory implements Factory<RequestBridgesDataSourceImpl> {
  private final Provider<TorProjectBridgesParser> torBridgesParserProvider;

  public RequestBridgesDataSourceImpl_Factory(
      Provider<TorProjectBridgesParser> torBridgesParserProvider) {
    this.torBridgesParserProvider = torBridgesParserProvider;
  }

  @Override
  public RequestBridgesDataSourceImpl get() {
    return newInstance(torBridgesParserProvider.get());
  }

  public static RequestBridgesDataSourceImpl_Factory create(
      javax.inject.Provider<TorProjectBridgesParser> torBridgesParserProvider) {
    return new RequestBridgesDataSourceImpl_Factory(Providers.asDaggerProvider(torBridgesParserProvider));
  }

  public static RequestBridgesDataSourceImpl_Factory create(
      Provider<TorProjectBridgesParser> torBridgesParserProvider) {
    return new RequestBridgesDataSourceImpl_Factory(torBridgesParserProvider);
  }

  public static RequestBridgesDataSourceImpl newInstance(TorProjectBridgesParser torBridgesParser) {
    return new RequestBridgesDataSourceImpl(torBridgesParser);
  }
}
