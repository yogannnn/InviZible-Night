package pan.alexander.tordnscrypt.data.resources;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.resources.ResourceManager;

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
public final class ResourceRepositoryImpl_Factory implements Factory<ResourceRepositoryImpl> {
  private final Provider<ResourceManager> resourceManagerProvider;

  public ResourceRepositoryImpl_Factory(Provider<ResourceManager> resourceManagerProvider) {
    this.resourceManagerProvider = resourceManagerProvider;
  }

  @Override
  public ResourceRepositoryImpl get() {
    return newInstance(resourceManagerProvider.get());
  }

  public static ResourceRepositoryImpl_Factory create(
      javax.inject.Provider<ResourceManager> resourceManagerProvider) {
    return new ResourceRepositoryImpl_Factory(Providers.asDaggerProvider(resourceManagerProvider));
  }

  public static ResourceRepositoryImpl_Factory create(
      Provider<ResourceManager> resourceManagerProvider) {
    return new ResourceRepositoryImpl_Factory(resourceManagerProvider);
  }

  public static ResourceRepositoryImpl newInstance(ResourceManager resourceManager) {
    return new ResourceRepositoryImpl(resourceManager);
  }
}
