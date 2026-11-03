package pan.alexander.tordnscrypt.settings.dnscrypt_rules.existing;

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
public final class RemixExistingRulesWorkManager_Factory implements Factory<RemixExistingRulesWorkManager> {
  private final Provider<Context> contextProvider;

  public RemixExistingRulesWorkManager_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public RemixExistingRulesWorkManager get() {
    return newInstance(contextProvider.get());
  }

  public static RemixExistingRulesWorkManager_Factory create(
      javax.inject.Provider<Context> contextProvider) {
    return new RemixExistingRulesWorkManager_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static RemixExistingRulesWorkManager_Factory create(Provider<Context> contextProvider) {
    return new RemixExistingRulesWorkManager_Factory(contextProvider);
  }

  public static RemixExistingRulesWorkManager newInstance(Context context) {
    return new RemixExistingRulesWorkManager(context);
  }
}
