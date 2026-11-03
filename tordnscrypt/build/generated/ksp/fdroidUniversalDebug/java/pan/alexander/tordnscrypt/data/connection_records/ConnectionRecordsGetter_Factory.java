package pan.alexander.tordnscrypt.data.connection_records;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ConnectionRecordsGetter_Factory implements Factory<ConnectionRecordsGetter> {
  private final Provider<Context> contextProvider;

  public ConnectionRecordsGetter_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectionRecordsGetter get() {
    return newInstance(contextProvider.get());
  }

  public static ConnectionRecordsGetter_Factory create(
      javax.inject.Provider<Context> contextProvider) {
    return new ConnectionRecordsGetter_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static ConnectionRecordsGetter_Factory create(Provider<Context> contextProvider) {
    return new ConnectionRecordsGetter_Factory(contextProvider);
  }

  public static ConnectionRecordsGetter newInstance(Context context) {
    return new ConnectionRecordsGetter(context);
  }
}
