package pan.alexander.tordnscrypt.tiles;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
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
public final class BaseTileService_MembersInjector implements MembersInjector<BaseTileService> {
  private final Provider<TilesLimiter> tilesLimiterProvider;

  public BaseTileService_MembersInjector(Provider<TilesLimiter> tilesLimiterProvider) {
    this.tilesLimiterProvider = tilesLimiterProvider;
  }

  public static MembersInjector<BaseTileService> create(
      Provider<TilesLimiter> tilesLimiterProvider) {
    return new BaseTileService_MembersInjector(tilesLimiterProvider);
  }

  public static MembersInjector<BaseTileService> create(
      javax.inject.Provider<TilesLimiter> tilesLimiterProvider) {
    return new BaseTileService_MembersInjector(Providers.asDaggerProvider(tilesLimiterProvider));
  }

  @Override
  public void injectMembers(BaseTileService instance) {
    injectTilesLimiter(instance, tilesLimiterProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.tiles.BaseTileService.tilesLimiter")
  public static void injectTilesLimiter(BaseTileService instance, TilesLimiter tilesLimiter) {
    instance.tilesLimiter = tilesLimiter;
  }
}
