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
public final class HttpInternetChecker_Factory implements Factory<HttpInternetChecker> {
  @Override
  public HttpInternetChecker get() {
    return newInstance();
  }

  public static HttpInternetChecker_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpInternetChecker newInstance() {
    return new HttpInternetChecker();
  }

  private static final class InstanceHolder {
    static final HttpInternetChecker_Factory INSTANCE = new HttpInternetChecker_Factory();
  }
}
