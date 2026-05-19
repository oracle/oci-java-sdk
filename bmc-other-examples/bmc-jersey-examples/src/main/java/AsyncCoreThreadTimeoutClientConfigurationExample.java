/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown
 * at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at
 * http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityAsyncClient;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

import java.util.concurrent.Future;

/** This shows how to enable async core thread timeout with ClientConfiguration. */
public class AsyncCoreThreadTimeoutClientConfigurationExample {

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ClientConfiguration clientConfiguration =
                ClientConfiguration.builder()
                        .syncRequestsAsyncCoreThreadTimeoutEnabled(true)
                        .asyncRequestsAsyncCoreThreadTimeoutEnabled(true)
                        .build();

        listRegionsWithSyncClient(provider, clientConfiguration);
        listRegionsWithAsyncClient(provider, clientConfiguration);
    }

    private static void listRegionsWithSyncClient(
            AuthenticationDetailsProvider provider, ClientConfiguration clientConfiguration) {
        try (IdentityClient identityClient =
                IdentityClient.builder().configuration(clientConfiguration).build(provider)) {
            ListRegionsResponse response =
                    identityClient.listRegions(ListRegionsRequest.builder().build());
            System.out.println("Sync region count: " + response.getItems().size());
        }
    }

    private static void listRegionsWithAsyncClient(
            AuthenticationDetailsProvider provider, ClientConfiguration clientConfiguration)
            throws Exception {
        try (IdentityAsyncClient identityAsyncClient =
                IdentityAsyncClient.builder().configuration(clientConfiguration).build(provider)) {
            Future<ListRegionsResponse> responseFuture =
                    identityAsyncClient.listRegions(ListRegionsRequest.builder().build(), null);
            System.out.println("Async region count: " + responseFuture.get().getItems().size());
        }
    }
}
