package pan.alexander.tordnscrypt.utils.session;

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
public final class AppSessionStore_Factory implements Factory<AppSessionStore> {
  @Override
  public AppSessionStore get() {
    return newInstance();
  }

  public static AppSessionStore_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppSessionStore newInstance() {
    return new AppSessionStore();
  }

  private static final class InstanceHolder {
    static final AppSessionStore_Factory INSTANCE = new AppSessionStore_Factory();
  }
}
