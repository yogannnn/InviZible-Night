package pan.alexander.tordnscrypt.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.executors.CoroutineExecutor;

@ScopeMetadata("javax.inject.Singleton")
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
public final class ModulesVersions_Factory implements Factory<ModulesVersions> {
  private final Provider<CoroutineExecutor> executorProvider;

  public ModulesVersions_Factory(Provider<CoroutineExecutor> executorProvider) {
    this.executorProvider = executorProvider;
  }

  @Override
  public ModulesVersions get() {
    return newInstance(executorProvider.get());
  }

  public static ModulesVersions_Factory create(
      javax.inject.Provider<CoroutineExecutor> executorProvider) {
    return new ModulesVersions_Factory(Providers.asDaggerProvider(executorProvider));
  }

  public static ModulesVersions_Factory create(Provider<CoroutineExecutor> executorProvider) {
    return new ModulesVersions_Factory(executorProvider);
  }

  public static ModulesVersions newInstance(CoroutineExecutor executor) {
    return new ModulesVersions(executor);
  }
}
