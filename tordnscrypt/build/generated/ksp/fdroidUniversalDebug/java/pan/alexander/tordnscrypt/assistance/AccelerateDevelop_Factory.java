package pan.alexander.tordnscrypt.assistance;

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
public final class AccelerateDevelop_Factory implements Factory<AccelerateDevelop> {
  @Override
  public AccelerateDevelop get() {
    return newInstance();
  }

  public static AccelerateDevelop_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AccelerateDevelop newInstance() {
    return new AccelerateDevelop();
  }

  private static final class InstanceHolder {
    static final AccelerateDevelop_Factory INSTANCE = new AccelerateDevelop_Factory();
  }
}
