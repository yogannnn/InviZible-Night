package pan.alexander.tordnscrypt.nflog;

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
public final class NflogParser_Factory implements Factory<NflogParser> {
  private final Provider<NflogSessionsHolder> nflogSessionsHolderProvider;

  private final Provider<PathVars> pathVarsProvider;

  public NflogParser_Factory(Provider<NflogSessionsHolder> nflogSessionsHolderProvider,
      Provider<PathVars> pathVarsProvider) {
    this.nflogSessionsHolderProvider = nflogSessionsHolderProvider;
    this.pathVarsProvider = pathVarsProvider;
  }

  @Override
  public NflogParser get() {
    return newInstance(nflogSessionsHolderProvider.get(), DoubleCheck.lazy(pathVarsProvider));
  }

  public static NflogParser_Factory create(
      javax.inject.Provider<NflogSessionsHolder> nflogSessionsHolderProvider,
      javax.inject.Provider<PathVars> pathVarsProvider) {
    return new NflogParser_Factory(Providers.asDaggerProvider(nflogSessionsHolderProvider), Providers.asDaggerProvider(pathVarsProvider));
  }

  public static NflogParser_Factory create(
      Provider<NflogSessionsHolder> nflogSessionsHolderProvider,
      Provider<PathVars> pathVarsProvider) {
    return new NflogParser_Factory(nflogSessionsHolderProvider, pathVarsProvider);
  }

  public static NflogParser newInstance(NflogSessionsHolder nflogSessionsHolder,
      Lazy<PathVars> pathVars) {
    return new NflogParser(nflogSessionsHolder, pathVars);
  }
}
