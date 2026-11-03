package pan.alexander.tordnscrypt.utils.workers;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class UpdateIPsManager_Factory implements Factory<UpdateIPsManager> {
  private final Provider<Context> contextProvider;

  public UpdateIPsManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UpdateIPsManager get() {
    return newInstance(contextProvider.get());
  }

  public static UpdateIPsManager_Factory create(javax.inject.Provider<Context> contextProvider) {
    return new UpdateIPsManager_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static UpdateIPsManager_Factory create(Provider<Context> contextProvider) {
    return new UpdateIPsManager_Factory(contextProvider);
  }

  public static UpdateIPsManager newInstance(Context context) {
    return new UpdateIPsManager(context);
  }
}
