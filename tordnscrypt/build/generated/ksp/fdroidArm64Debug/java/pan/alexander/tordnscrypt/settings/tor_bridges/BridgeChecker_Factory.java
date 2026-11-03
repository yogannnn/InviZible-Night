package pan.alexander.tordnscrypt.settings.tor_bridges;

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
public final class BridgeChecker_Factory implements Factory<BridgeChecker> {
  @Override
  public BridgeChecker get() {
    return newInstance();
  }

  public static BridgeChecker_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static BridgeChecker newInstance() {
    return new BridgeChecker();
  }

  private static final class InstanceHolder {
    static final BridgeChecker_Factory INSTANCE = new BridgeChecker_Factory();
  }
}
