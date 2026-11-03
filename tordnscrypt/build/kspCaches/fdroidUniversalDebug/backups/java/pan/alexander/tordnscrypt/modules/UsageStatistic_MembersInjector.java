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
import pan.alexander.tordnscrypt.domain.connection_checker.ConnectionCheckerInteractor;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class UsageStatistic_MembersInjector implements MembersInjector<UsageStatistic> {
  private final Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider;

  private final Provider<PathVars> pathVarsProvider;

  public UsageStatistic_MembersInjector(
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      Provider<PathVars> pathVarsProvider) {
    this.connectionCheckerInteractorProvider = connectionCheckerInteractorProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<UsageStatistic> create(
      Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      Provider<PathVars> pathVarsProvider) {
    return new UsageStatistic_MembersInjector(connectionCheckerInteractorProvider, pathVarsProvider);
  }

  public static MembersInjector<UsageStatistic> create(
      javax.inject.Provider<ConnectionCheckerInteractor> connectionCheckerInteractorProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new UsageStatistic_MembersInjector(Providers.asDaggerProvider(connectionCheckerInteractorProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(UsageStatistic instance) {
    injectConnectionCheckerInteractor(instance, DoubleCheck.lazy(connectionCheckerInteractorProvider));
    injectPathVars(instance, pathVarsProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.UsageStatistic.connectionCheckerInteractor")
  public static void injectConnectionCheckerInteractor(UsageStatistic instance,
      Lazy<ConnectionCheckerInteractor> connectionCheckerInteractor) {
    instance.connectionCheckerInteractor = connectionCheckerInteractor;
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.UsageStatistic.pathVars")
  public static void injectPathVars(UsageStatistic instance, PathVars pathVars) {
    instance.pathVars = pathVars;
  }
}
