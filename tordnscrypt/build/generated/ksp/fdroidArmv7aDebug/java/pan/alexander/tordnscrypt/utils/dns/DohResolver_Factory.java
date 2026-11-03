package pan.alexander.tordnscrypt.utils.dns;

import dagger.internal.DaggerGenerated;
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
public final class DohResolver_Factory {
  public DohResolver get(String server, int type, int timeout) {
    return newInstance(server, type, timeout);
  }

  public static DohResolver_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DohResolver newInstance(String server, int type, int timeout) {
    return new DohResolver(server, type, timeout);
  }

  private static final class InstanceHolder {
    static final DohResolver_Factory INSTANCE = new DohResolver_Factory();
  }
}
