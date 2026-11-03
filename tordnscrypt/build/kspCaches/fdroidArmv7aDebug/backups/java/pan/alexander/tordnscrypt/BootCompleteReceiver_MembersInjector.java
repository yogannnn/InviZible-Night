package pan.alexander.tordnscrypt;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.bootcomplete.BootCompleteManager;

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
public final class BootCompleteReceiver_MembersInjector implements MembersInjector<BootCompleteReceiver> {
  private final Provider<BootCompleteManager> bootCompleteManagerProvider;

  public BootCompleteReceiver_MembersInjector(
      Provider<BootCompleteManager> bootCompleteManagerProvider) {
    this.bootCompleteManagerProvider = bootCompleteManagerProvider;
  }

  public static MembersInjector<BootCompleteReceiver> create(
      Provider<BootCompleteManager> bootCompleteManagerProvider) {
    return new BootCompleteReceiver_MembersInjector(bootCompleteManagerProvider);
  }

  public static MembersInjector<BootCompleteReceiver> create(
      javax.inject.Provider<BootCompleteManager> bootCompleteManagerProvider) {
    return new BootCompleteReceiver_MembersInjector(Providers.asDaggerProvider(bootCompleteManagerProvider));
  }

  @Override
  public void injectMembers(BootCompleteReceiver instance) {
    injectBootCompleteManager(instance, DoubleCheck.lazy(bootCompleteManagerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.BootCompleteReceiver.bootCompleteManager")
  public static void injectBootCompleteManager(BootCompleteReceiver instance,
      Lazy<BootCompleteManager> bootCompleteManager) {
    instance.bootCompleteManager = bootCompleteManager;
  }
}
