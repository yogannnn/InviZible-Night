package pan.alexander.tordnscrypt.settings.dnscrypt_rules.receiver;

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
public final class DnsRulesReceiver_Factory implements Factory<DnsRulesReceiver> {
  private final Provider<Context> contextProvider;

  public DnsRulesReceiver_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public DnsRulesReceiver get() {
    return newInstance(contextProvider.get());
  }

  public static DnsRulesReceiver_Factory create(javax.inject.Provider<Context> contextProvider) {
    return new DnsRulesReceiver_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static DnsRulesReceiver_Factory create(Provider<Context> contextProvider) {
    return new DnsRulesReceiver_Factory(contextProvider);
  }

  public static DnsRulesReceiver newInstance(Context context) {
    return new DnsRulesReceiver(context);
  }
}
