package pan.alexander.tordnscrypt.utils.dns;

import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class UdpResolver_Factory {
  public UdpResolver get(String serverIP, int dnsUdpPort, int type, int timeout) {
    return newInstance(serverIP, dnsUdpPort, type, timeout);
  }

  public static UdpResolver_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static UdpResolver newInstance(String serverIP, int dnsUdpPort, int type, int timeout) {
    return new UdpResolver(serverIP, dnsUdpPort, type, timeout);
  }

  private static final class InstanceHolder {
    static final UdpResolver_Factory INSTANCE = new UdpResolver_Factory();
  }
}
