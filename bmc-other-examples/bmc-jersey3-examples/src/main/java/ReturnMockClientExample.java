/**
 }
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.jersey3.ClientBuilderDecorator;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Configuration;
import jakarta.ws.rs.core.Link;
import jakarta.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Map;

/**
 * A sample to demonstrate how to return a mock client (or any JAX-RS {@link jakarta.ws.rs.client.Client} you want).
 *
 * Note: Doing this is not portable to other HTTP clients!
 */
public class ReturnMockClientExample {
    private static final String CONFIG_FILE_PATH = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

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

        final IdentityClient identityClient =
                IdentityClient.builder()
                        .region(Region.US_PHOENIX_1)
                        .clientConfigurator(
                                builder -> {
                                    builder.property(ClientBuilderDecorator.PROPERTY, jerseyClientBuilder -> {
                                        // Ignore the Jersey ClientBuilder and instead return a our mock client.
                                        // Or you could use a mocking library like Mockito instead, e.g.
                                        // return mock(javax.ws.rs.client.Client.class);
                                        return new MockClient();
                                    });
                                })
                        .build(authenticationDetailsProvider);

        ListRegionsResponse response = identityClient.listRegions(LIST_REGIONS_REQUEST);
        System.out.println("List of regions: " + response.getItems());
    }

    /**
     * This is not a functional mock client. You have to add implementation to return mock {@link WebTarget}
     * and mock {@link Invocation.Builder}, etc. instances as well.
     *
     * Or you could use a mocking library like Mockito instead.
     */
    private static class MockClient implements Client {

        @Override
        public Configuration getConfiguration() {
            // put implementation here
            return null;
        }

        @Override
        public Client property(String s, Object o) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Class<?> aClass) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Class<?> aClass, int i) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Class<?> aClass, Class<?>... classes) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Class<?> aClass, Map<Class<?>, Integer> map) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Object o) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Object o, int i) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Object o, Class<?>... classes) {
            // put implementation here
            return null;
        }

        @Override
        public Client register(Object o, Map<Class<?>, Integer> map) {
            // put implementation here
            return null;
        }

        @Override
        public void close() {
            // put implementation here
        }

        @Override
        public WebTarget target(String s) {
            // put implementation here
            return null;
        }

        @Override
        public WebTarget target(URI uri) {
            // put implementation here
            return null;
        }

        @Override
        public WebTarget target(UriBuilder uriBuilder) {
            // put implementation here
            return null;
        }

        @Override
        public WebTarget target(Link link) {
            // put implementation here
            return null;
        }

        @Override
        public Invocation.Builder invocation(Link link) {
            // put implementation here
            return null;
        }

        @Override
        public SSLContext getSslContext() {
            // put implementation here
            return null;
        }

        @Override
        public HostnameVerifier getHostnameVerifier() {
            // put implementation here
            return null;
        }
    }
}