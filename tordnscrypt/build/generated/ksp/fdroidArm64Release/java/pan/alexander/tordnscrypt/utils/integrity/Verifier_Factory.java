package pan.alexander.tordnscrypt.utils.integrity;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.settings.PathVars;

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
public final class Verifier_Factory implements Factory<Verifier> {
  private final Provider<Context> contextProvider;

  private final Provider<PathVars> pathVarsProvider;

  public Verifier_Factory(Provider<Context> contextProvider, Provider<PathVars> pathVarsProvider) {
    this.contextProvider = contextProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public Verifier get() {
    return newInstance(contextProvider.get(), DoubleCheck.lazy(pathVarsProvider));
  }

  public static Verifier_Factory create(javax.inject.Provider<Context> contextProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new Verifier_Factory(Providers.asDaggerProvider(contextProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static Verifier_Factory create(Provider<Context> contextProvider,
      Provider<PathVars> pathVarsProvider) {
    return new Verifier_Factory(contextProvider, pathVarsProvider);
  }

  public static Verifier newInstance(Context context, Lazy<PathVars> pathVars) {
    return new Verifier(context, pathVars);
  }
}
