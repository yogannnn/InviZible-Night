package pan.alexander.tordnscrypt.iptables;

import android.os.Handler;
import dagger.Lazy;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.Providers;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;

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
public final class IptablesReceiver_MembersInjector implements MembersInjector<IptablesReceiver> {
  private final Provider<Handler> handlerProvider;

  public IptablesReceiver_MembersInjector(Provider<Handler> handlerProvider) {
    this.handlerProvider = handlerProvider;
  }

  public static MembersInjector<IptablesReceiver> create(Provider<Handler> handlerProvider) {
    return new IptablesReceiver_MembersInjector(handlerProvider);
  }

  public static MembersInjector<IptablesReceiver> create(
      javax.inject.Provider<Handler> handlerProvider) {
    return new IptablesReceiver_MembersInjector(Providers.asDaggerProvider(handlerProvider));
  }

  @Override
  public void injectMembers(IptablesReceiver instance) {
    injectHandler(instance, DoubleCheck.lazy(handlerProvider));
  }

  @InjectedFieldSignature("pan.alexander.tordnscrypt.iptables.IptablesReceiver.handler")
  public static void injectHandler(IptablesReceiver instance, Lazy<Handler> handler) {
    instance.handler = handler;
  }
}
