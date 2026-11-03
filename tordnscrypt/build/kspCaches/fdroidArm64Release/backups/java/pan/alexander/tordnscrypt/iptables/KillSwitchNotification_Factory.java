package pan.alexander.tordnscrypt.iptables;

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
public final class KillSwitchNotification_Factory implements Factory<KillSwitchNotification> {
  private final Provider<Context> contextProvider;

  public KillSwitchNotification_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public KillSwitchNotification get() {
    return newInstance(contextProvider.get());
  }

  public static KillSwitchNotification_Factory create(
      javax.inject.Provider<Context> contextProvider) {
    return new KillSwitchNotification_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static KillSwitchNotification_Factory create(Provider<Context> contextProvider) {
    return new KillSwitchNotification_Factory(contextProvider);
  }

  public static KillSwitchNotification newInstance(Context context) {
    return new KillSwitchNotification(context);
  }
}
