package pan.alexander.tordnscrypt.dialogs;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import pan.alexander.tordnscrypt.utils.mode.AppModeManager;

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
public final class ChangeModeDialog_MembersInjector implements MembersInjector<ChangeModeDialog> {
  private final Provider<AppModeManager> appModeManagerProvider;

  public ChangeModeDialog_MembersInjector(Provider<AppModeManager> appModeManagerProvider) {
    this.appModeManagerProvider = appModeManagerProvider;
  }

  public static MembersInjector<ChangeModeDialog> create(
      Provider<AppModeManager> appModeManagerProvider) {
    return new ChangeModeDialog_MembersInjector(appModeManagerProvider);
  }

  public static MembersInjector<ChangeModeDialog> create(
      javax.inject.Provider<AppModeManager> appModeManagerProvider) {
    return new ChangeModeDialog_MembersInjector(Providers.asDaggerProvider(appModeManagerProvider));
  }

  @Override
  public void injectMembers(ChangeModeDialog instance) {
    injectAppModeManager(instance, appModeManagerProvider.get());
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.dialogs.ChangeModeDialog.appModeManager")
  public static void injectAppModeManager(ChangeModeDialog instance,
      AppModeManager appModeManager) {
    instance.appModeManager = appModeManager;
  }
}
