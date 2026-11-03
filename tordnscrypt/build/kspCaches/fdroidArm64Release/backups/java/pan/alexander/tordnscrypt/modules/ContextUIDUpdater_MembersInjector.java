package pan.alexander.tordnscrypt.modules;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
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
public final class ContextUIDUpdater_MembersInjector implements MembersInjector<ContextUIDUpdater> {
  private final Provider<PathVars> pathVarsProvider;

  public ContextUIDUpdater_MembersInjector(Provider<PathVars> pathVarsProvider) {
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<ContextUIDUpdater> create(Provider<PathVars> pathVarsProvider) {
    return new ContextUIDUpdater_MembersInjector(pathVarsProvider);
  }

  public static MembersInjector<ContextUIDUpdater> create(
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new ContextUIDUpdater_MembersInjector(Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(ContextUIDUpdater instance) {
    injectPathVars(instance, pathVarsProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.modules.ContextUIDUpdater.pathVars")
  public static void injectPathVars(ContextUIDUpdater instance, PathVars pathVars) {
    instance.pathVars = pathVars;
  }
}
