/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.ApacheConfigurator;
import com.oracle.bmc.http.ApacheConnectorProperties;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLInitializationException;

/**
 * Demonstrates explicit plaintext transport configuration for the Apache configurator.
 *
 * <p>Use only when a trusted endpoint intentionally accepts plaintext HTTP for an {@code https}
 * route, or in a controlled test environment. OCI service endpoints require TLS and must not use
 * this configuration.
 */
public class PlainConnectionSocketFactoryExample {
    public static void main(String[] args) throws Exception {
        // Configure OCI authentication in the same way as the other client examples.
        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // WARNING: This maps https routes to plaintext. Use only with a trusted plaintext endpoint
        // or in a controlled test environment. Supplying this connection manager bypasses the
        // ApacheConfigurator default TLS registry.
        // The normal configuration fails closed. The second client preserves the previous
        // automatic fallback only when the application explicitly chooses plaintext after SSL
        // initialization fails.
        try (Identity directPlaintextClient = createPlaintextClient(provider);
                Identity fallbackPlaintextClient = createClientWithPlaintextFallback(provider)) {
            // Use the clients with their corresponding trusted endpoints.
        }
    }

    /**
     * Builds a client that deliberately sends plaintext for both {@code http} and {@code https}
     * routes.
     *
     * <p>Use when the application explicitly owns the transport decision and its endpoint is known
     * to accept plaintext. This bypasses ApacheConfigurator's default TLS socket registry.
     *
     * @param provider the authentication provider for the client
     * @return a client configured with a plaintext connection manager
     */
    private static Identity createPlaintextClient(final AuthenticationDetailsProvider provider) {
        // ApacheConnectorProperties gives callers ownership of the Apache connection manager.
        final ApacheConnectorProperties properties =
                ApacheConnectorProperties.builder()
                        .connectionManager(createPlaintextConnectionManager())
                        .build();
        return IdentityClient.builder()
                .clientConfigurator(new ApacheConfigurator(properties))
                .build(provider);
    }

    /**
     * Builds a normal TLS client and catches {@link SSLInitializationException} to explicitly fall
     * back to plaintext only if TLS initialization fails.
     *
     * <p>Use only for applications that intentionally need the legacy fallback behavior. This
     * performs the fallback that the SDK used to do itself. The Apache configurator now fails
     * closed and never uses this exception to select the fallback automatically.
     *
     * @param provider the authentication provider for the client
     * @return the TLS client when SSL initialization succeeds, otherwise a plaintext client
     */
    private static Identity createClientWithPlaintextFallback(
            final AuthenticationDetailsProvider provider) {
        try {
            // This uses ApacheConfigurator's default TLS setup and throws if it cannot initialize.
            return IdentityClient.builder()
                    .clientConfigurator(new ApacheConfigurator())
                    .build(provider);
        } catch (SSLInitializationException e) {
            // Perform the fallback that the SDK used to do ourselves.
            return createPlaintextClient(provider);
        }
    }

    /**
     * Creates the Apache connection manager that maps both URI schemes to a plaintext socket
     * factory.
     *
     * <p>Use this only when intentionally disabling TLS. A manager supplied through
     * ApacheConnectorProperties takes precedence over the configurator's default manager.
     *
     * @return a connection manager that uses plaintext sockets for {@code http} and {@code https}
     */
    private static PoolingHttpClientConnectionManager createPlaintextConnectionManager() {
        // Apache HttpClient selects a socket factory by URI scheme. Mapping https to the plain
        // factory deliberately disables TLS for those routes.
        final Registry<ConnectionSocketFactory> registry =
                RegistryBuilder.<ConnectionSocketFactory>create()
                        .register("http", PlainConnectionSocketFactory.getSocketFactory())
                        .register("https", PlainConnectionSocketFactory.getSocketFactory())
                        .build();
        return new PoolingHttpClientConnectionManager(registry);
    }
}
