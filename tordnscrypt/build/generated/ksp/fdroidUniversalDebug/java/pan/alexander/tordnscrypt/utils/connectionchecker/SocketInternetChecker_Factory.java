package pan.alexander.tordnscrypt.utils.connectionchecker;

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
public final class SocketInternetChecker_Factory implements Factory<SocketInternetChecker> {
  @Override
  public SocketInternetChecker get() {
    return newInstance();
  }

  public static SocketInternetChecker_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SocketInternetChecker newInstance() {
    return new SocketInternetChecker();
  }

  private static final class InstanceHolder {
    static final SocketInternetChecker_Factory INSTANCE = new SocketInternetChecker_Factory();
  }
}
