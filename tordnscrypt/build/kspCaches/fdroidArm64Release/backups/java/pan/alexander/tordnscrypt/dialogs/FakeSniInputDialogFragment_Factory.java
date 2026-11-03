package pan.alexander.tordnscrypt.dialogs;

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
public final class FakeSniInputDialogFragment_Factory implements Factory<FakeSniInputDialogFragment> {
  @Override
  public FakeSniInputDialogFragment get() {
    return newInstance();
  }

  public static FakeSniInputDialogFragment_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FakeSniInputDialogFragment newInstance() {
    return new FakeSniInputDialogFragment();
  }

  private static final class InstanceHolder {
    static final FakeSniInputDialogFragment_Factory INSTANCE = new FakeSniInputDialogFragment_Factory();
  }
}
