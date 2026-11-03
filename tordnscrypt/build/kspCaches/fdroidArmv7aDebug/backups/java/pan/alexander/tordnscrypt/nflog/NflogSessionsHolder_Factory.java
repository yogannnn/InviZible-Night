package pan.alexander.tordnscrypt.nflog;

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
public final class NflogSessionsHolder_Factory implements Factory<NflogSessionsHolder> {
  @Override
  public NflogSessionsHolder get() {
    return newInstance();
  }

  public static NflogSessionsHolder_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NflogSessionsHolder newInstance() {
    return new NflogSessionsHolder();
  }

  private static final class InstanceHolder {
    static final NflogSessionsHolder_Factory INSTANCE = new NflogSessionsHolder_Factory();
  }
}
