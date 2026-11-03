package pan.alexander.tordnscrypt.settings.dnscrypt_rules.local;

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
public final class UpdateLocalRulesWorkManager_Factory implements Factory<UpdateLocalRulesWorkManager> {
  private final Provider<Context> contextProvider;

  public UpdateLocalRulesWorkManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public UpdateLocalRulesWorkManager get() {
    return newInstance(contextProvider.get());
  }

  public static UpdateLocalRulesWorkManager_Factory create(
      javax.inject.Provider<Context> contextProvider) {
    return new UpdateLocalRulesWorkManager_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static UpdateLocalRulesWorkManager_Factory create(Provider<Context> contextProvider) {
    return new UpdateLocalRulesWorkManager_Factory(contextProvider);
  }

  public static UpdateLocalRulesWorkManager newInstance(Context context) {
    return new UpdateLocalRulesWorkManager(context);
  }
}
