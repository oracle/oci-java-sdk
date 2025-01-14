/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.net.InetSocketAddress;
import java.net.Proxy;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.ProxyConfiguration;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

/**
 * A sample to demonstrate how to configure a client to connect through an authenticated HTTP or
 * HTTPS proxy.
 */
public class HttpProxyExample {
    private static final String CONFIG_FILE_PATH = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    // Proxy Server configuration
    private static final String PROXY_URI = "localhost";
    private static final int PROXY_PORT = 8889;
    private static final String PROXY_USERNAME = "username";
    private static final String PROXY_PASSWORD = "password";

    private static final ListRegionsRequest LIST_REGIONS_REQUEST =
            ListRegionsRequest.builder().build();

    public static void main(final String... args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file "~/.oci/config", and a profile in that config with the name "DEFAULT".
        // Make changes to the following line if needed and use
        // ConfigFileReader.parse(CONFIG_LOCATION, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        try {
            // Create a ProxyConfiguration with proxy scheme, address, port, username and password
            final ProxyConfiguration proxyConfig =
                    ProxyConfiguration.builder()
                            .proxy(
                                    new Proxy(
                                            Proxy.Type.HTTP,
                                            new InetSocketAddress(PROXY_URI, PROXY_PORT)))
                            .username(PROXY_USERNAME)
                            .password(PROXY_PASSWORD.toCharArray())
                            .build();

            final IdentityClient identityClient =
                    IdentityClient.builder()
                            .region(Region.US_PHOENIX_1)
                            .clientConfigurator(
                                    builder -> {
                                        builder.property(
                                                StandardClientProperties.PROXY, proxyConfig);
                                    })
                            .build(authenticationDetailsProvider);

            System.out.println("  Querying for list of regions through a proxy...");
            ListRegionsResponse response = identityClient.listRegions(LIST_REGIONS_REQUEST);
            System.out.println("    List of regions: " + response.getItems());
        } finally {
            System.out.println("Stopped proxy server");
        }
    }
}
