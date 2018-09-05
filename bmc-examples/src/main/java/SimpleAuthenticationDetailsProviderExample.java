/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.SimpleAuthenticationDetailsProvider;
import com.oracle.bmc.auth.StringPrivateKeySupplier;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;

/**
 * A sample to demonstrate how to use the SimpleAuthenticationDetailsProvider to create a client
 */
public class SimpleAuthenticationDetailsProviderExample {
    public static void main(String[] args) {
        if (args.length != 5) {
            throw new IllegalArgumentException(
                    "This example expects five arguments: tenantId, userId, fingerprint, privateKey and passPhrase");
        }

        final String tenantId = args[0];
        final String userId = args[1];
        final String fingerprint = args[2];
        final String privateKey = args[3];
        final String passPhrase = args[4];

        final AuthenticationDetailsProvider authenticationDetailsProvider =
                SimpleAuthenticationDetailsProvider.builder()
                        .tenantId(tenantId)
                        .userId(userId)
                        .fingerprint(fingerprint)
                        .privateKeySupplier(new StringPrivateKeySupplier(privateKey))
                        .passPhrase(passPhrase)
                        .build();

        final IdentityClient identityClient = new IdentityClient(authenticationDetailsProvider);
        identityClient.setRegion(Region.US_PHOENIX_1);

        System.out.println("Querying for list of regions via the Identity Client");
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());
    }
}
