package pan.alexander.tordnscrypt.utils.ap;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
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
public final class InternetSharingChecker_Factory implements Factory<InternetSharingChecker> {
  private final Provider<Context> contextProvider;

  public InternetSharingChecker_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public InternetSharingChecker get() {
    return newInstance(contextProvider.get());
  }

  public static InternetSharingChecker_Factory create(
      javax.inject.Provider<Context> contextProvider) {
    return new InternetSharingChecker_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static InternetSharingChecker_Factory create(Provider<Context> contextProvider) {
    return new InternetSharingChecker_Factory(contextProvider);
  }

  public static InternetSharingChecker newInstance(Context context) {
    return new InternetSharingChecker(context);
  }
}
