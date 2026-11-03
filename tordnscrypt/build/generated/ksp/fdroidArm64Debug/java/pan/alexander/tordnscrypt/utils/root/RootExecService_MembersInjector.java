package pan.alexander.tordnscrypt.utils.root;

import android.content.SharedPreferences;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;

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
public final class RootExecService_MembersInjector implements MembersInjector<RootExecService> {
  private final Provider<RootExecutor> rootExecutorProvider;

  private final Provider<SharedPreferences> defaultPreferencesProvider;

  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public RootExecService_MembersInjector(Provider<RootExecutor> rootExecutorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.rootExecutorProvider = rootExecutorProvider;
    this.defaultPreferencesProvider = defaultPreferencesProvider;
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<RootExecService> create(Provider<RootExecutor> rootExecutorProvider,
      Provider<SharedPreferences> defaultPreferencesProvider,
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new RootExecService_MembersInjector(rootExecutorProvider, defaultPreferencesProvider, preferenceRepositoryProvider);
  }

  public static MembersInjector<RootExecService> create(
      javax.inject.Provider<RootExecutor> rootExecutorProvider,
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider,
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new RootExecService_MembersInjector(Providers.asDaggerProvider(rootExecutorProvider), Providers.asDaggerProvider(defaultPreferencesProvider), Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(RootExecService instance) {
    injectRootExecutor(instance, rootExecutorProvider.get());
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.root.RootExecService.rootExecutor")
  public static void injectRootExecutor(RootExecService instance, RootExecutor rootExecutor) {
    instance.rootExecutor = rootExecutor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.root.RootExecService.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(RootExecService instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.utils.root.RootExecService.preferenceRepository")
  public static void injectPreferenceRepository(RootExecService instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
