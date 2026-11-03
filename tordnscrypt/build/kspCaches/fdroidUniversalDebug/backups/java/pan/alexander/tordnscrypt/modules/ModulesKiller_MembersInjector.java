package pan.alexander.tordnscrypt.modules;

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
public final class ModulesKiller_MembersInjector implements MembersInjector<ModulesKiller> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public ModulesKiller_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<ModulesKiller> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new ModulesKiller_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<ModulesKiller> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new ModulesKiller_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(ModulesKiller instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ModulesKiller.preferenceRepository")
  public static void injectPreferenceRepository(ModulesKiller instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
