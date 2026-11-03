package pan.alexander.tordnscrypt.utils.parsers;

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
public final class DnsCryptSDNSParser_Factory implements Factory<DnsCryptSDNSParser> {
  @Override
  public DnsCryptSDNSParser get() {
    return newInstance();
  }

  public static DnsCryptSDNSParser_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DnsCryptSDNSParser newInstance() {
    return new DnsCryptSDNSParser();
  }

  private static final class InstanceHolder {
    static final DnsCryptSDNSParser_Factory INSTANCE = new DnsCryptSDNSParser_Factory();
  }
}
