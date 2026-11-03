package pan.alexander.tordnscrypt.utils.apps;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
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
public final class InstalledAppNamesStorage_Factory implements Factory<InstalledAppNamesStorage> {
  private final Provider<CoroutineDispatcher> dispatcherIoProvider;

  public InstalledAppNamesStorage_Factory(Provider<CoroutineDispatcher> dispatcherIoProvider) {
    this.dispatcherIoProvider = dispatcherIoProvider;
  }

  @Override
  public InstalledAppNamesStorage get() {
    return newInstance(dispatcherIoProvider.get());
  }

  public static InstalledAppNamesStorage_Factory create(
      javax.inject.Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new InstalledAppNamesStorage_Factory(Providers.asDaggerProvider(dispatcherIoProvider));
  }

  public static InstalledAppNamesStorage_Factory create(
      Provider<CoroutineDispatcher> dispatcherIoProvider) {
    return new InstalledAppNamesStorage_Factory(dispatcherIoProvider);
  }

  public static InstalledAppNamesStorage newInstance(CoroutineDispatcher dispatcherIo) {
    return new InstalledAppNamesStorage(dispatcherIo);
  }
}
