package pan.alexander.tordnscrypt.itpd_fragment;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.log_reader.ITPDInteractorInterface;
import pan.alexander.tordnscrypt.domain.preferences.PreferenceRepository;
import pan.alexander.tordnscrypt.settings.PathVars;
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
public final class ITPDFragmentPresenter_MembersInjector implements MembersInjector<ITPDFragmentPresenter> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<ITPDInteractorInterface> itpdInteractorProvider;

  private final Provider<CoroutineExecutor> executorProvider;

  public ITPDFragmentPresenter_MembersInjector(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<ITPDInteractorInterface> itpdInteractorProvider,
      Provider<CoroutineExecutor> executorProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.itpdInteractorProvider = itpdInteractorProvider;
    this.executorProvider = executorProvider;
  }

  public static MembersInjector<ITPDFragmentPresenter> create(
      Provider<PreferenceRepository> preferenceRepositoryProvider,
      Provider<PathVars> pathVarsProvider, Provider<ITPDInteractorInterface> itpdInteractorProvider,
      Provider<CoroutineExecutor> executorProvider) {
    return new ITPDFragmentPresenter_MembersInjector(preferenceRepositoryProvider, pathVarsProvider, itpdInteractorProvider, executorProvider);
  }

  public static MembersInjector<ITPDFragmentPresenter> create(
      javax.inject.Provider<PreferenceRepository> preferenceRepositoryProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<ITPDInteractorInterface> itpdInteractorProvider,
      javax.inject.Provider<CoroutineExecutor> executorProvider) {
    return new ITPDFragmentPresenter_MembersInjector(Providers.asDaggerProvider(preferenceRepositoryProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(itpdInteractorProvider), Providers.asDaggerProvider(executorProvider));
  }

  @Override
  public void injectMembers(ITPDFragmentPresenter instance) {
    injectPreferenceRepository(instance, DoubleCheck.lazy(preferenceRepositoryProvider));
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
    injectItpdInteractor(instance, DoubleCheck.lazy(itpdInteractorProvider));
    injectExecutor(instance, executorProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentPresenter.preferenceRepository")
  public static void injectPreferenceRepository(ITPDFragmentPresenter instance,
      Lazy<PreferenceRepository> preferenceRepository) {
    instance.preferenceRepository = preferenceRepository;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentPresenter.pathVars")
  public static void injectPathVars(ITPDFragmentPresenter instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentPresenter.itpdInteractor")
  public static void injectItpdInteractor(ITPDFragmentPresenter instance,
      Lazy<ITPDInteractorInterface> itpdInteractor) {
    instance.itpdInteractor = itpdInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.itpd_fragment.ITPDFragmentPresenter.executor")
  public static void injectExecutor(ITPDFragmentPresenter instance, CoroutineExecutor executor) {
    instance.executor = executor;
  }
}
