package pan.alexander.tordnscrypt.data.bridges;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager;

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
public final class DefaultVanillaBridgeDataSourceImpl_Factory implements Factory<DefaultVanillaBridgeDataSourceImpl> {
  private final Provider<HttpsConnectionManager> httpsConnectionManagerProvider;

  public DefaultVanillaBridgeDataSourceImpl_Factory(
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    this.httpsConnectionManagerProvider = httpsConnectionManagerProvider;
  }

  @Override
  public DefaultVanillaBridgeDataSourceImpl get() {
    return newInstance(httpsConnectionManagerProvider.get());
  }

  public static DefaultVanillaBridgeDataSourceImpl_Factory create(
      javax.inject.Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new DefaultVanillaBridgeDataSourceImpl_Factory(Providers.asDaggerProvider(httpsConnectionManagerProvider));
  }

  public static DefaultVanillaBridgeDataSourceImpl_Factory create(
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new DefaultVanillaBridgeDataSourceImpl_Factory(httpsConnectionManagerProvider);
  }

  public static DefaultVanillaBridgeDataSourceImpl newInstance(
      HttpsConnectionManager httpsConnectionManager) {
    return new DefaultVanillaBridgeDataSourceImpl(httpsConnectionManager);
  }
}
