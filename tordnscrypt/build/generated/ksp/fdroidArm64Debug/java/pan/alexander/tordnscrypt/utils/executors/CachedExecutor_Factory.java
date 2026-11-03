package pan.alexander.tordnscrypt.utils.executors;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class CachedExecutor_Factory implements Factory<CachedExecutor> {
  @Override
  public CachedExecutor get() {
    return newInstance();
  }

  public static CachedExecutor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CachedExecutor newInstance() {
    return new CachedExecutor();
  }

  private static final class InstanceHolder {
    static final CachedExecutor_Factory INSTANCE = new CachedExecutor_Factory();
  }
}
