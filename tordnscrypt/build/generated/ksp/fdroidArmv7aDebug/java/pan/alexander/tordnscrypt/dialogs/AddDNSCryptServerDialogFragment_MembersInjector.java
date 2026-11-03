package pan.alexander.tordnscrypt.dialogs;

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
public final class AddDNSCryptServerDialogFragment_MembersInjector implements MembersInjector<AddDNSCryptServerDialogFragment> {
  private final Provider<SharedPreferences> defaultPreferencesProvider;

  public AddDNSCryptServerDialogFragment_MembersInjector(
      Provider<SharedPreferences> defaultPreferencesProvider) {
    this.defaultPreferencesProvider = defaultPreferencesProvider;
  }

  public static MembersInjector<AddDNSCryptServerDialogFragment> create(
      Provider<SharedPreferences> defaultPreferencesProvider) {
    return new AddDNSCryptServerDialogFragment_MembersInjector(defaultPreferencesProvider);
  }

  public static MembersInjector<AddDNSCryptServerDialogFragment> create(
      javax.inject.Provider<SharedPreferences> defaultPreferencesProvider) {
    return new AddDNSCryptServerDialogFragment_MembersInjector(Providers.asDaggerProvider(defaultPreferencesProvider));
  }

  @Override
  public void injectMembers(AddDNSCryptServerDialogFragment instance) {
    injectDefaultPreferences(instance, DoubleCheck.lazy(defaultPreferencesProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.AddDNSCryptServerDialogFragment.defaultPreferences")
  @Named("DefaultSharedPreferences")
  public static void injectDefaultPreferences(AddDNSCryptServerDialogFragment instance,
      Lazy<SharedPreferences> defaultPreferences) {
    instance.defaultPreferences = defaultPreferences;
  }
}
