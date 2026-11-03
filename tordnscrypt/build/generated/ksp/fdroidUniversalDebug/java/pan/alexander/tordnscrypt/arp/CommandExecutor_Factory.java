package pan.alexander.tordnscrypt.arp;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("pan.alexander.tordnscrypt.di.arp.ArpScope")
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
public final class CommandExecutor_Factory implements Factory<CommandExecutor> {
  @Override
  public CommandExecutor get() {
    return newInstance();
  }

  public static CommandExecutor_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CommandExecutor newInstance() {
    return new CommandExecutor();
  }

  private static final class InstanceHolder {
    static final CommandExecutor_Factory INSTANCE = new CommandExecutor_Factory();
  }
}
