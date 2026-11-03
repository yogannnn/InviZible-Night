package pan.alexander.tordnscrypt.domain.log_reader;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.domain.connection_records.ConnectionRecordsInteractor;

@ScopeMetadata("pan.alexander.tordnscrypt.di.logreader.LogReaderScope")
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
public final class LogReaderInteractors_Factory implements Factory<LogReaderInteractors> {
  private final Provider<ModulesLogRepository> modulesLogRepositoryProvider;

  private final Provider<ConnectionRecordsInteractor> connectionRecordsInteractorProvider;

  public LogReaderInteractors_Factory(Provider<ModulesLogRepository> modulesLogRepositoryProvider,
      Provider<ConnectionRecordsInteractor> connectionRecordsInteractorProvider) {
    this.modulesLogRepositoryProvider = modulesLogRepositoryProvider;
    this.connectionRecordsInteractorProvider = connectionRecordsInteractorProvider;
  }

  @Override
  public LogReaderInteractors get() {
    return newInstance(modulesLogRepositoryProvider.get(), connectionRecordsInteractorProvider.get());
  }

  public static LogReaderInteractors_Factory create(
      javax.inject.Provider<ModulesLogRepository> modulesLogRepositoryProvider,
      javax.inject.Provider<ConnectionRecordsInteractor> connectionRecordsInteractorProvider) {
    return new LogReaderInteractors_Factory(Providers.asDaggerProvider(modulesLogRepositoryProvider), Providers.asDaggerProvider(connectionRecordsInteractorProvider));
  }

  public static LogReaderInteractors_Factory create(
      Provider<ModulesLogRepository> modulesLogRepositoryProvider,
      Provider<ConnectionRecordsInteractor> connectionRecordsInteractorProvider) {
    return new LogReaderInteractors_Factory(modulesLogRepositoryProvider, connectionRecordsInteractorProvider);
  }

  public static LogReaderInteractors newInstance(ModulesLogRepository modulesLogRepository,
      ConnectionRecordsInteractor connectionRecordsInteractor) {
    return new LogReaderInteractors(modulesLogRepository, connectionRecordsInteractor);
  }
}
