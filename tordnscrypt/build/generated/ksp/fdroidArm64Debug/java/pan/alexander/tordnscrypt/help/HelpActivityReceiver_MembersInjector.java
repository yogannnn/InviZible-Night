package pan.alexander.tordnscrypt.help;

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
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

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
public final class HelpActivityReceiver_MembersInjector implements MembersInjector<HelpActivityReceiver> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  public HelpActivityReceiver_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.executorProvider = executorProvider;
  }

  public static MembersInjector<HelpActivityReceiver> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<CoroutineExecutor> executorProvider) {
    return new HelpActivityReceiver_MembersInjector(preferenceRepositoryProvider, executorProvider);
  }

  public static MembersInjector<HelpActivityReceiver> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider) {
    return new HelpActivityReceiver_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(executorProvider));
  }

  @Override
  public void injectMembers(HelpActivityReceiver instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectExecutor(instance, executorProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.help.HelpActivityReceiver.preferenceRepository")
  public static void injectPreferenceRepository(HelpActivityReceiver instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.help.HelpActivityReceiver.executor")
  public static void injectExecutor(HelpActivityReceiver instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }
}
