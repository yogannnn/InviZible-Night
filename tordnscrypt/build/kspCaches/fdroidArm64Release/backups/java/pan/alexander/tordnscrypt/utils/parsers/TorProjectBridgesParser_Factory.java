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
public final class TorProjectBridgesParser_Factory implements Factory<TorProjectBridgesParser> {
  @Override
  public TorProjectBridgesParser get() {
    return newInstance();
  }

  public static TorProjectBridgesParser_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TorProjectBridgesParser newInstance() {
    return new TorProjectBridgesParser();
  }

  private static final class InstanceHolder {
    static final TorProjectBridgesParser_Factory INSTANCE = new TorProjectBridgesParser_Factory();
  }
}
