package pan.alexander.tordnscrypt.settings;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class PathVars_Factory implements Factory<PathVars> {
  private final Provider<Context> contextProvider;

  public PathVars_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PathVars get() {
    return newInstance(contextProvider.get());
  }

  public static PathVars_Factory create(javax.inject.Provider<Context> contextProvider) {
    return new PathVars_Factory(Providers.asDaggerProvider(contextProvider));
  }

  public static PathVars_Factory create(Provider<Context> contextProvider) {
    return new PathVars_Factory(contextProvider);
  }

  public static PathVars newInstance(Context context) {
    return new PathVars(context);
  }
}
