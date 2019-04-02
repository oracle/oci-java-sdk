/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

import java.io.IOException;

/**
 * This sample demonstrates how to use the SDK with new regions (and realms) without upgrading the SDK.
 *
 * When using either the {@link ConfigFileAuthenticationDetailsProvider} or the {@link
 * com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider}, register the new region (and realm)
 * before instantiating the provider.
 * If you call the {@code setRegion} method to target the new region, pass in the region object returned from prior
 * {@link Region#register(String, Realm)} method invocation.
 */
public class NewRegionAndRealmSupportWithoutSDKUpdate {
    public static void main(String args[]) throws IOException {
        // Assume a new region us-foo-1 is launched in OC2 realm
        // Register the new region
        final Region fooRegion = Region.register("us-foo-1", Realm.OC2);

        // Create the client
        Identity identityClient = createIdentityClient();

        // If the config file contains a value for region, then it will be picked up automatically by the SDK,
        // else set it up manually by calling setRegion
        System.out.println("Setting region to " + fooRegion.getRegionId());
        identityClient.setRegion(fooRegion);

        // Use the client to make calls to the endpoint for the new region
        listRegions(identityClient);

        // Now, assume a new region us-bar-1 is launched in OCX realm
        // (having secondLevelDomain oracle-baz-cloud.com)
        // Register the new region and realm
        final Region barRegion =
                Region.register("us-bar-1", Realm.register("ocx", "oracle-baz-cloud.com"));

        // Call setRegion to use the endpoint in the new region
        System.out.println("Setting region to " + barRegion.getRegionId());
        identityClient.setRegion(barRegion);

        // The client now makes calls to the endpoint for the new region
        listRegions(identityClient);

        // If you use InstancePrincipals, register the new region (and realm) before initializing the
        // InstancePrincipalsAuthenticationDetailsProvider.
    }

    private static Identity createIdentityClient() throws IOException {
        final String configurationFilePath = "~/.oci/config";
        final String configurationProfile = "DEFAULT";

        final AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(
                        configurationFilePath, configurationProfile);

        return IdentityClient.builder().build(authenticationDetailsProvider);
    }

    private static void listRegions(final Identity identityClient) {
        System.out.println("Querying for list of regions");
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());
    }
}
