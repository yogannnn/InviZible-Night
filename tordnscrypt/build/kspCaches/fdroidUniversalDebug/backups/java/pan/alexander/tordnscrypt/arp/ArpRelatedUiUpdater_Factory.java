package pan.alexander.tordnscrypt.arp;

import android.content.Context;
import android.os.Handler;
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
public final class ArpRelatedUiUpdater_Factory implements Factory<ArpRelatedUiUpdater> {
  private final Provider<Context> contextProvider;

  private final Provider<Handler> handlerProvider;

  public ArpRelatedUiUpdater_Factory(Provider<Context> contextProvider,
      Provider<Handler> handlerProvider) {
    this.contextProvider = contextProvider;
    this.handlerProvider = handlerProvider;
  }

  @Override
  public ArpRelatedUiUpdater get() {
    return newInstance(contextProvider.get(), handlerProvider.get());
  }

  public static ArpRelatedUiUpdater_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<Handler> handlerProvider) {
    return new ArpRelatedUiUpdater_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(handlerProvider));
  }

  public static ArpRelatedUiUpdater_Factory create(Provider<Context> contextProvider,
      Provider<Handler> handlerProvider) {
    return new ArpRelatedUiUpdater_Factory(contextProvider, handlerProvider);
  }

  public static ArpRelatedUiUpdater newInstance(Context context, Handler handler) {
    return new ArpRelatedUiUpdater(context, handler);
  }
}
