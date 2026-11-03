package pan.alexander.tordnscrypt.data.log_reader;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.settings.PathVars;

@ScopeMetadata
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
public final class ModulesLogRepositoryImpl_Factory implements Factory<ModulesLogRepositoryImpl> {
  private final Provider<Context> applicationContextProvider;

  private final Provider<PathVars> pathVarsProvider;

  public ModulesLogRepositoryImpl_Factory(Provider<Context> applicationContextProvider,
      Provider<PathVars> pathVarsProvider) {
    this.applicationContextProvider = applicationContextProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public ModulesLogRepositoryImpl get() {
    return newInstance(applicationContextProvider.get(), pathVarsProvider.get());
  }

  public static ModulesLogRepositoryImpl_Factory create(
      javax.inject.Provider<Context> applicationContextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new ModulesLogRepositoryImpl_Factory(Providers.asDaggerProvider(applicationContextProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static ModulesLogRepositoryImpl_Factory create(
      Provider<Context> applicationContextProvider, Provider<PathVars> pathVarsProvider) {
    return new ModulesLogRepositoryImpl_Factory(applicationContextProvider, pathVarsProvider);
  }

  public static ModulesLogRepositoryImpl newInstance(Context applicationContext,
      PathVars pathVars) {
    return new ModulesLogRepositoryImpl(applicationContext, pathVars);
  }
}
