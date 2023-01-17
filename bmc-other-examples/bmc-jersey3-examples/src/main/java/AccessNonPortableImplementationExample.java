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

import jakarta.ws.rs.client.ClientRequestContext;
import jakarta.ws.rs.client.ClientRequestFilter;
import java.io.IOException;

/**
 * A sample to demonstrate how to access the underlying Jersey 3 implementation.
 *
 * Note: Doing this is not portable to other HTTP clients!
 */
public class AccessNonPortableImplementationExample {
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
                                        // working directly with the Jersey 3 ClientBuilder
                                        // WARNING: this is not portable to other HTTP clients
                                        jerseyClientBuilder.register(new ClientRequestFilter() {
                                            @Override
                                            public void filter(ClientRequestContext requestContext) throws IOException {
                                                requestContext.getHeaders().putSingle("my-header", "my-value");
                                            }
                                        });

                                        // at the end, call ClientBuilder.build() and return the client
                                        return jerseyClientBuilder.build();
                                    });
                                })
                        .build(authenticationDetailsProvider);

        ListRegionsResponse response = identityClient.listRegions(LIST_REGIONS_REQUEST);
        System.out.println("List of regions: " + response.getItems());
    }
}