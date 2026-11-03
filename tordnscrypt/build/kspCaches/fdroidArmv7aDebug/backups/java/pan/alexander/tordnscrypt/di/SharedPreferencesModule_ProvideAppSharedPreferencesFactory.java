package pan.alexander.tordnscrypt.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class SharedPreferencesModule_ProvideAppSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final SharedPreferencesModule module;

  private final Provider<Context> contextProvider;

  public SharedPreferencesModule_ProvideAppSharedPreferencesFactory(SharedPreferencesModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideAppSharedPreferences(module, contextProvider.get());
  }

  public static SharedPreferencesModule_ProvideAppSharedPreferencesFactory create(
      SharedPreferencesModule module, javax.inject.Provider<Context> contextProvider) {
    return new SharedPreferencesModule_ProvideAppSharedPreferencesFactory(module, Providers.asDaggerProvider(contextProvider));
  }

  public static SharedPreferencesModule_ProvideAppSharedPreferencesFactory create(
      SharedPreferencesModule module, Provider<Context> contextProvider) {
    return new SharedPreferencesModule_ProvideAppSharedPreferencesFactory(module, contextProvider);
  }

  public static SharedPreferences provideAppSharedPreferences(SharedPreferencesModule instance,
      Context context) {
    return Preconditions.checkNotNullFromProvides(instance.provideAppSharedPreferences(context));
  }
}
