package pan.alexander.tordnscrypt.backup;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.installer.InstallerHelper;
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
public final class ResetModuleHelper_Factory implements Factory<ResetModuleHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  private final Provider<InstallerHelper> installerHelperProvider;

  public ResetModuleHelper_Factory(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<InstallerHelper> installerHelperProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
    this.installerHelperProvider = installerHelperProvider;
  }

  @Override
  public ResetModuleHelper get() {
    return newInstance(contextProvider.get(), pathVarsProvider.get(), installerHelperProvider.get());
  }

  public static ResetModuleHelper_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider,
      javax.inject.Provider<InstallerHelper> installerHelperProvider) {
    return new ResetModuleHelper_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider), Providers.asDaggerProvider(installerHelperProvider));
  }

  public static ResetModuleHelper_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider, Provider<InstallerHelper> installerHelperProvider) {
    return new ResetModuleHelper_Factory(contextProvider, pathVarsProvider, installerHelperProvider);
  }

  public static ResetModuleHelper newInstance(Context context, PathVars pathVars,
      InstallerHelper installerHelper) {
    return new ResetModuleHelper(context, pathVars, installerHelper);
  }
}
