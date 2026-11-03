package pan.alexander.tordnscrypt.dialogs;

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
public final class RequestIgnoreDataRestrictionDialog_MembersInjector implements MembersInjector<RequestIgnoreDataRestrictionDialog> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public RequestIgnoreDataRestrictionDialog_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  public static MembersInjector<RequestIgnoreDataRestrictionDialog> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new RequestIgnoreDataRestrictionDialog_MembersInjector(preferenceRepositoryProvider);
  }

  public static MembersInjector<RequestIgnoreDataRestrictionDialog> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new RequestIgnoreDataRestrictionDialog_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider));
  }

  @Override
  public void injectMembers(RequestIgnoreDataRestrictionDialog instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.RequestIgnoreDataRestrictionDialog.preferenceRepository")
  public static void injectPreferenceRepository(RequestIgnoreDataRestrictionDialog instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }
}
