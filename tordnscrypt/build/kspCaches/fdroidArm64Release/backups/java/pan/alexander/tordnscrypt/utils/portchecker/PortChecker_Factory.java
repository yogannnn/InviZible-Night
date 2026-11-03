package pan.alexander.tordnscrypt.utils.portchecker;

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
public final class PortChecker_Factory implements Factory<PortChecker> {
  @Override
  public PortChecker get() {
    return newInstance();
  }

  public static PortChecker_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PortChecker newInstance() {
    return new PortChecker();
  }

  private static final class InstanceHolder {
    static final PortChecker_Factory INSTANCE = new PortChecker_Factory();
  }
}
