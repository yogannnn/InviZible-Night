package pan.alexander.tordnscrypt.utils.notification;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class NotificationPermissionManager_Factory implements Factory<NotificationPermissionManager> {
  @Override
  public NotificationPermissionManager get() {
    return newInstance();
  }

  public static NotificationPermissionManager_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NotificationPermissionManager newInstance() {
    return new NotificationPermissionManager();
  }

  private static final class InstanceHolder {
    static final NotificationPermissionManager_Factory INSTANCE = new NotificationPermissionManager_Factory();
  }
}
