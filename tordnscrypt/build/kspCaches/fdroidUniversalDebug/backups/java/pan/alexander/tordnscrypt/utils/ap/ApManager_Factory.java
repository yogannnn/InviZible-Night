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
public final class ApManager_Factory implements Factory<ApManager> {
  private final Provider<Context> contextProvider;

  private final Provider<InternetSharingChecker> checkerProvider;

  public ApManager_Factory(Provider<Context> contextProvider,
      Provider<InternetSharingChecker> checkerProvider) {
    this.contextProvider = contextProvider;
    this.checkerProvider = checkerProvider;
  }

  @Override
  public ApManager get() {
    return newInstance(contextProvider.get(), checkerProvider.get());
  }

  public static ApManager_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<InternetSharingChecker> checkerProvider) {
    return new ApManager_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(checkerProvider));
  }

  public static ApManager_Factory create(Provider<Context> contextProvider,
      Provider<InternetSharingChecker> checkerProvider) {
    return new ApManager_Factory(contextProvider, checkerProvider);
  }

  public static ApManager newInstance(Context context, InternetSharingChecker checker) {
    return new ApManager(context, checker);
  }
}
