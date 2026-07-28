/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.ProxyConfiguration;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;

/**
 * Demonstrates how to configure the metadata-service HTTP client used by instance principals.
 *
 * <p>{@code federationClientMetadataConfigurator(...)} is used for IMDS calls made while building
 * the instance-principals provider, including region discovery and certificate/key retrieval. It
 * does not configure the OCI Auth service token request or later service-client calls, so this
 * example wires the same proxy configurator into those clients as well.
 *
 * <p>Set {@code OCI_METADATA_PROXY_URI} to enable the example proxy, and optionally {@code
 * OCI_METADATA_PROXY_USERNAME} and {@code OCI_METADATA_PROXY_PASSWORD}, before running this example
 * if the metadata, auth, and service calls must go through a proxy.
 */
public class InstancePrincipalsMetadataConfiguratorExample {
    private static final String PROXY_URI_ENV_VAR = "OCI_METADATA_PROXY_URI";
    private static final String PROXY_USERNAME_ENV_VAR = "OCI_METADATA_PROXY_USERNAME";
    private static final String PROXY_PASSWORD_ENV_VAR = "OCI_METADATA_PROXY_PASSWORD";
    private static final String PROXY_HOST = "localhost";
    private static final int PROXY_PORT = 8889;

    public static void main(final String[] args) {
        final ClientConfigurator proxyConfigurator = createProxyConfiguratorFromEnvironment();

        final InstancePrincipalsAuthenticationDetailsProvider provider;
        try {
            provider =
                    InstancePrincipalsAuthenticationDetailsProvider.builder()
                            .federationClientMetadataConfigurator(proxyConfigurator)
                            .federationClientConfigurator(proxyConfigurator)
                            .build();
        } catch (Exception e) {
            if (e.getCause() instanceof SocketTimeoutException
                    || e.getCause() instanceof ConnectException) {
                System.out.println(
                        "This sample only works when running on an OCI instance. For more info see: https://docs.oracle.com/iaas/Content/Identity/Tasks/callingservicesfrominstances.htm");
                return;
            }
            throw e;
        }

        final IdentityClient identityClient =
                IdentityClient.builder().clientConfigurator(proxyConfigurator).build(provider);
        try {
            System.out.println("Querying for list of regions via the Identity service");
            final ListRegionsResponse response =
                    identityClient.listRegions(ListRegionsRequest.builder().build());
            System.out.println("List of regions: " + response.getItems());
        } finally {
            identityClient.close();
        }
    }

    private static ClientConfigurator createProxyConfiguratorFromEnvironment() {
        final String proxyUri = System.getenv(PROXY_URI_ENV_VAR);
        if (isBlank(proxyUri)) {
            return builder -> {};
        }

        final ProxyConfiguration proxyConfiguration =
                ProxyConfiguration.builder()
                        .proxy(createHttpProxy())
                        .username(emptyToNull(System.getenv(PROXY_USERNAME_ENV_VAR)))
                        .password(emptyToNullCharArray(System.getenv(PROXY_PASSWORD_ENV_VAR)))
                        .build();

        return builder -> builder.property(StandardClientProperties.PROXY, proxyConfiguration);
    }

    private static Proxy createHttpProxy() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_HOST, PROXY_PORT));
    }

    private static String emptyToNull(final String value) {
        return isBlank(value) ? null : value;
    }

    private static char[] emptyToNullCharArray(final String value) {
        return isBlank(value) ? null : value.toCharArray();
    }

    private static boolean isBlank(final String value) {
        return value == null || value.trim().isEmpty();
    }
}
