package pan.alexander.tordnscrypt.tiles;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class TorTileService_MembersInjector implements MembersInjector<TorTileService> {
  private final Provider<TilesLimiter> tilesLimiterProvider;

  private final Provider<ModulesControlTileManager> tileManagerProvider;

  public TorTileService_MembersInjector(Provider<TilesLimiter> tilesLimiterProvider,
      Provider<ModulesControlTileManager> tileManagerProvider) {
    this.tilesLimiterProvider = tilesLimiterProvider;
    this.tileManagerProvider = tileManagerProvider;
  }

  public static MembersInjector<TorTileService> create(Provider<TilesLimiter> tilesLimiterProvider,
      Provider<ModulesControlTileManager> tileManagerProvider) {
    return new TorTileService_MembersInjector(tilesLimiterProvider, tileManagerProvider);
  }

  public static MembersInjector<TorTileService> create(
      javax.inject.Provider<TilesLimiter> tilesLimiterProvider,
      javax.inject.Provider<ModulesControlTileManager> tileManagerProvider) {
    return new TorTileService_MembersInjector(Providers.asDaggerProvider(tilesLimiterProvider), Providers.asDaggerProvider(tileManagerProvider));
  }

  @Override
  public void injectMembers(TorTileService instance) {
    BaseTileService_MembersInjector.injectTilesLimiter(instance, tilesLimiterProvider.get());
    injectTileManager(instance, DoubleCheck.lazy(tileManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tiles.TorTileService.tileManager")
  public static void injectTileManager(TorTileService instance,
      Lazy<ModulesControlTileManager> tileManager) {
    instance.tileManager = tileManager;
  }
}
