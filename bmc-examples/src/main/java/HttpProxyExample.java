/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.ApacheConfigurator;
import com.oracle.bmc.http.ApacheProxyConfig;
import com.oracle.bmc.http.ApacheProxyConfigDecorator;
import com.oracle.bmc.http.ClientConfigDecorator;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;
import org.littleshoot.proxy.HttpProxyServer;
import org.littleshoot.proxy.ProxyAuthenticator;
import org.littleshoot.proxy.impl.DefaultHttpProxyServer;

import java.util.Collections;

/**
 * A sample to demonstrate how to configure a client to connect through an authenticated HTTP or HTTPS proxy.
 *
 * Note:  This sample utilizes the <a href="https://github.com/adamfisk/LittleProxy">LittleProxy</a> library to
 * host a proxy server on localhost. This dependency can be added to an existing maven configuration with the following
 * dependency:
 * <pre>
 * <dependency>
 *     <groupId>org.littleshoot</groupId>
 *     <artifactId>littleproxy</artifactId>
 *     <version>1.1.2</version>
 * </dependency>
 * </pre>
 */
public class HttpProxyExample {
    private static final String CONFIG_FILE_PATH = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    // Proxy Server configuration
    private static final int PROXY_PORT = 8889;
    private static final String PROXY_URI = "http://localhost:" + PROXY_PORT;
    private static final String PROXY_USERNAME = "username";
    private static final String PROXY_PASSWORD = "password";

    private static final ListRegionsRequest LIST_REGIONS_REQUEST =
            ListRegionsRequest.builder().build();

    public static void main(final String... args) throws Exception {
        final AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_FILE_PATH, CONFIG_PROFILE);

        // Start a HTTP proxy server for clients to connect to locally
        final HttpProxyServer proxyServer =
                newProxyServer(PROXY_PORT, PROXY_USERNAME, PROXY_PASSWORD);
        try {
            // Specify an ApacheProxyConfig when building a new client with the ApacheConfigurator
            final ApacheProxyConfig proxyConfig =
                    ApacheProxyConfig.builder()
                            .uri(PROXY_URI)
                            .username(PROXY_USERNAME)
                            .password(PROXY_PASSWORD)
                            .build();
            final ClientConfigDecorator proxyConfigDecorator =
                    new ApacheProxyConfigDecorator(proxyConfig);
            final ClientConfigurator configurator =
                    new ApacheConfigurator(Collections.singletonList(proxyConfigDecorator));
            final IdentityClient identityClient =
                    IdentityClient.builder()
                            .region(Region.US_PHOENIX_1)
                            .clientConfigurator(configurator)
                            .build(authenticationDetailsProvider);

            System.out.println("  Querying for list of regions through a proxy...");
            ListRegionsResponse response = identityClient.listRegions(LIST_REGIONS_REQUEST);
            System.out.println("    List of regions: " + response.getItems());
        } finally {
            proxyServer.stop();
            System.out.println("Stopped proxy server");
        }
    }

    /**
     * Starts and returns a new HTTP proxy server that is used as an example proxy server for clients to connect to.
     * It is hosted on 'localhost' for the given {@code port}, {@code username}, and {@code password}.
     *
     * @param port the port for the proxy to listen on
     * @param username the username to validate the client connection with
     * @param password the password to validate the client connection with
     * @return a HTTP proxy server instance
     */
    private static HttpProxyServer newProxyServer(
            final int port, final String username, final String password) {
        final ProxyAuthenticator authenticator =
                new ProxyAuthenticator() {
                    @Override
                    public boolean authenticate(final String username, final String password) {
                        return username.equals(username) && password.equals(password);
                    }

                    @Override
                    public String getRealm() {
                        return null;
                    }
                };
        final HttpProxyServer proxyServer =
                DefaultHttpProxyServer.bootstrap()
                        .withPort(port)
                        .withProxyAuthenticator(authenticator)
                        .start();

        System.out.println(String.format("Started authenticated proxy server on port [%s]", port));
        return proxyServer;
    }
}
