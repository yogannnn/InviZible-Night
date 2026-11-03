package pan.alexander.tordnscrypt.settings;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class ConfigEditorFragment_MembersInjector implements MembersInjector<ConfigEditorFragment> {
  private final Provider<PathVars> pathVarsProvider;

  public ConfigEditorFragment_MembersInjector(Provider<PathVars> pathVarsProvider) {
    this.pathVarsProvider = pathVarsProvider;
  }

  public static MembersInjector<ConfigEditorFragment> create(Provider<PathVars> pathVarsProvider) {
    return new ConfigEditorFragment_MembersInjector(pathVarsProvider);
  }

  public static MembersInjector<ConfigEditorFragment> create(
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new ConfigEditorFragment_MembersInjector(Providers.asDaggerProvider(pathVarsProvider));
  }

  @Override
  public void injectMembers(ConfigEditorFragment instance) {
    injectPathVars(instance, DoubleCheck.lazy(pathVarsProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.settings.ConfigEditorFragment.pathVars")
  public static void injectPathVars(ConfigEditorFragment instance, Lazy<PathVars> pathVars) {
    instance.pathVars = pathVars;
  }
}
