package pan.alexander.tordnscrypt.arp;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("pan.alexander.tordnscrypt.di.arp.ArpScope")
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
public final class ConnectionManager_Factory implements Factory<ConnectionManager> {
  private final Provider<Context> contextProvider;

  public ConnectionManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ConnectionManager get() {
    return newInstance(contextProvider.get());
  }

  public static ConnectionManager_Factory create(javax.inject.Provider<Context> contextProvider) {
    return new ConnectionManager_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static ConnectionManager_Factory create(Provider<Context> contextProvider) {
    return new ConnectionManager_Factory(contextProvider);
  }

  public static ConnectionManager newInstance(Context context) {
    return new ConnectionManager(context);
  }
}
