package pan.alexander.tordnscrypt.di;

import androidx.lifecycle.ViewModel;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Map;
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
public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>>> viewModelsProvider;

  public ViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>>> viewModelsProvider) {
    this.viewModelsProvider = viewModelsProvider;
  }

  @Override
  public ViewModelFactory get() {
    return newInstance(viewModelsProvider.get());
  }

  public static ViewModelFactory_Factory create(
      javax.inject.Provider<Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>>> viewModelsProvider) {
    return new ViewModelFactory_Factory(Providers.asDaggerProvider(viewModelsProvider));
  }

  public static ViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>>> viewModelsProvider) {
    return new ViewModelFactory_Factory(viewModelsProvider);
  }

  public static ViewModelFactory newInstance(
      Map<Class<? extends ViewModel>, javax.inject.Provider<ViewModel>> viewModels) {
    return new ViewModelFactory(viewModels);
  }
}
