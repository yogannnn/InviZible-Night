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
public final class ChangeTorIpTileService_MembersInjector implements MembersInjector<ChangeTorIpTileService> {
  private final Provider<TilesLimiter> tilesLimiterProvider;

  private final Provider<ChangeTorIpTileManager> tileManagerProvider;

  public ChangeTorIpTileService_MembersInjector(Provider<TilesLimiter> tilesLimiterProvider,
      Provider<ChangeTorIpTileManager> tileManagerProvider) {
    this.tilesLimiterProvider = tilesLimiterProvider;
    this.tileManagerProvider = tileManagerProvider;
  }

  public static MembersInjector<ChangeTorIpTileService> create(
      Provider<TilesLimiter> tilesLimiterProvider,
      Provider<ChangeTorIpTileManager> tileManagerProvider) {
    return new ChangeTorIpTileService_MembersInjector(tilesLimiterProvider, tileManagerProvider);
  }

  public static MembersInjector<ChangeTorIpTileService> create(
      javax.inject.Provider<TilesLimiter> tilesLimiterProvider,
      javax.inject.Provider<ChangeTorIpTileManager> tileManagerProvider) {
    return new ChangeTorIpTileService_MembersInjector(Providers.asDaggerProvider(tilesLimiterProvider), Providers.asDaggerProvider(tileManagerProvider));
  }

  @Override
  public void injectMembers(ChangeTorIpTileService instance) {
    BaseTileService_MembersInjector.injectTilesLimiter(instance, tilesLimiterProvider.get());
    injectTileManager(instance, DoubleCheck.lazy(tileManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tiles.ChangeTorIpTileService.tileManager")
  public static void injectTileManager(ChangeTorIpTileService instance,
      Lazy<ChangeTorIpTileManager> tileManager) {
    instance.tileManager = tileManager;
  }
}
