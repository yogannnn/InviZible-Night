package pan.alexander.tordnscrypt.settings.tor_bridges;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;
import pan.alexander.tordnscrypt.domain.bridges.DefaultVanillaBridgeInteractor;

@ScopeMetadata
@QualifierMetadata("javax.inject.Named")
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
public final class BridgePingHelper_Factory implements Factory<BridgePingHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  private final Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public BridgePingHelper_Factory(Provider<Context> contextProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.contextProvider = contextProvider;
    this.dispatcherIoProvider = dispatcherIoProvider;
    this.defaultVanillaBridgeInteractorProvider = defaultVanillaBridgeInteractorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  @Override
  public BridgePingHelper get() {
    return newInstance(contextProvider.get(), dispatcherIoProvider.get(), defaultVanillaBridgeInteractorProvider.get(), defaultPreferencesProvider.get());
  }

  public static BridgePingHelper_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider,
      javax.inject.Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new BridgePingHelper_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(dispatcherIoProvider), Providers.asDaggerProvider(defaultVanillaBridgeInteractorProvider), Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  public static BridgePingHelper_Factory create(Provider<Context> contextProvider,
      Provider<CoroutineDispatcher> dispatcherIoProvider,
      Provider<DefaultVanillaBridgeInteractor> defaultVanillaBridgeInteractorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new BridgePingHelper_Factory(contextProvider, dispatcherIoProvider, defaultVanillaBridgeInteractorProvider, defaultPreferencesProvider);
  }

  public static BridgePingHelper newInstance(Context context, CoroutineDispatcher dispatcherIo,
      DefaultVanillaBridgeInteractor defaultVanillaBridgeInteractor,
      SharedPreferences defaultPreferences) {
    return new BridgePingHelper(context, dispatcherIo, defaultVanillaBridgeInteractor, defaultPreferences);
  }
}
