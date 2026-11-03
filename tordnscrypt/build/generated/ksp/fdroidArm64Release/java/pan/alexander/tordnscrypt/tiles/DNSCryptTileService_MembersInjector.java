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
public final class DNSCryptTileService_MembersInjector implements MembersInjector<DNSCryptTileService> {
  private final Provider<TilesLimiter> tilesLimiterProvider;

  private final Provider<ModulesControlTileManager> tileManagerProvider;

  public DNSCryptTileService_MembersInjector(Provider<TilesLimiter> tilesLimiterProvider,
      Provider<ModulesControlTileManager> tileManagerProvider) {
    this.tilesLimiterProvider = tilesLimiterProvider;
    this.tileManagerProvider = tileManagerProvider;
  }

  public static MembersInjector<DNSCryptTileService> create(
      Provider<TilesLimiter> tilesLimiterProvider,
      Provider<ModulesControlTileManager> tileManagerProvider) {
    return new DNSCryptTileService_MembersInjector(tilesLimiterProvider, tileManagerProvider);
  }

  public static MembersInjector<DNSCryptTileService> create(
      javax.inject.Provider<TilesLimiter> tilesLimiterProvider,
      javax.inject.Provider<ModulesControlTileManager> tileManagerProvider) {
    return new DNSCryptTileService_MembersInjector(Providers.asDaggerProvider(tilesLimiterProvider), Providers.asDaggerProvider(tileManagerProvider));
  }

  @Override
  public void injectMembers(DNSCryptTileService instance) {
    BaseTileService_MembersInjector.injectTilesLimiter(instance, tilesLimiterProvider.get());
    injectTileManager(instance, DoubleCheck.lazy(tileManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tiles.DNSCryptTileService.tileManager")
  public static void injectTileManager(DNSCryptTileService instance,
      Lazy<ModulesControlTileManager> tileManager) {
    instance.tileManager = tileManager;
  }
}
