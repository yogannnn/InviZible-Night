package pan.alexander.tordnscrypt.update;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
import pan.alexander.tordnscrypt.utils.web.HttpsConnectionManager;

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
public final class DownloadTask_MembersInjector implements MembersInjector<DownloadTask> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<HttpsConnectionManager> httpsConnectionManagerProvider;

  public DownloadTask_MembersInjector(Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.httpsConnectionManagerProvider = httpsConnectionManagerProvider;
  }

  public static MembersInjector<DownloadTask> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider,
      Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new DownloadTask_MembersInjector(preferenceRepositoryProvider, pathVarsProvider, httpsConnectionManagerProvider);
  }

  public static MembersInjector<DownloadTask> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<HttpsConnectionManager> httpsConnectionManagerProvider) {
    return new DownloadTask_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(httpsConnectionManagerProvider));
  }

  @Override
  public void injectMembers(DownloadTask instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, pathVarsProvider.get());
    injectHttpsConnectionManager(instance, DoubleCheck.lazy(httpsConnectionManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.DownloadTask.preferenceRepository")
  public static void injectPreferenceRepository(DownloadTask instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.DownloadTask.pathVars")
  public static void injectPathVars(DownloadTask instance, PathVars pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.update.DownloadTask.httpsConnectionManager")
  public static void injectHttpsConnectionManager(DownloadTask instance,
      Lazy<HttpsConnectionManager> httpsConnectionManager) {
    instance.httpsConnectionManager = httpsConnectionManager;
  }
}
