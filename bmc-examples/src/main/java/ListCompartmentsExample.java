/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.requests.ListCompartmentsRequest;
import com.oracle.bmc.identity.responses.ListCompartmentsResponse;

import shared.ExampleCompartmentHelper;

public class ListCompartmentsExample {
    public static void main(String[] args) throws Exception {

        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        String compartmentId = provider.getTenantId();
        final String tenantId = provider.getTenantId();
        Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_ASHBURN_1);

        /*
        *****************************************************************
         Setup the compartments like the following tree
         Here is the compartment Tree in this Test
             Tenancy
             |
             --- CP-1
             |
             |
             --- CP-2
             |    |
             |    --- CP-21
             |         |
             |         --- CP-211
             |
             --- CP-3
                 |
                 --- CP-31
         *****************************************************************
         */

        // Setup the first level compartments (CP-1, CP-2, CP-3)
        ExampleCompartmentHelper.createCompartment(identityClient, tenantId, "CP-1");
        final Compartment cp2 =
                ExampleCompartmentHelper.createCompartment(identityClient, tenantId, "CP-2");
        final Compartment cp3 =
                ExampleCompartmentHelper.createCompartment(identityClient, tenantId, "CP-3");

        // If we create/update and then try to use compartments straight away, sometimes we can get a 404. To try and avoid this, the script
        // adds a short delay between the compartment management operations
        Thread.sleep(5000);

        // Setup the second level compartments (CP-21, CP-31)
        final Compartment cp21 =
                ExampleCompartmentHelper.createCompartment(identityClient, cp2.getId(), "CP-21");
        final Compartment cp31 =
                ExampleCompartmentHelper.createCompartment(identityClient, cp3.getId(), "CP-31");

        Thread.sleep(5000);

        // Setup the third level compartments (CP-211)
        ExampleCompartmentHelper.createCompartment(identityClient, cp2.getId(), "CP-211");

        // List all compartments within tenancy with Accessible compartment filter
        String nextPageToken = null;
        System.out.println(
                "ListCompartments: with compartmentIdInSubtree == true and AccessLevel==Accessible");
        do {
            ListCompartmentsResponse response =
                    identityClient.listCompartments(
                            ListCompartmentsRequest.builder()
                                    .limit(3)
                                    .compartmentId(compartmentId)
                                    .accessLevel(ListCompartmentsRequest.AccessLevel.Accessible)
                                    .compartmentIdInSubtree(Boolean.TRUE)
                                    .page(nextPageToken)
                                    .build());

            for (Compartment compartment : response.getItems()) {
                System.out.println(compartment);
            }
            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);

        // List all compartments within tenancy without Accessible compartment filter
        System.out.println("ListCompartments: with compartmentIdInSubtree == true");
        nextPageToken = null;
        do {
            ListCompartmentsResponse response =
                    identityClient.listCompartments(
                            ListCompartmentsRequest.builder()
                                    .limit(3)
                                    .compartmentId(compartmentId)
                                    .compartmentIdInSubtree(Boolean.TRUE)
                                    .page(nextPageToken)
                                    .build());

            for (Compartment compartment : response.getItems()) {
                System.out.println(compartment);
            }
            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);

        // List single level compartments within tenancy with Accessible compartment filter
        System.out.println("ListCompartments: with AccessLevel == Accessible");
        do {
            ListCompartmentsResponse response =
                    identityClient.listCompartments(
                            ListCompartmentsRequest.builder()
                                    .limit(3)
                                    .compartmentId(compartmentId)
                                    .accessLevel(ListCompartmentsRequest.AccessLevel.Accessible)
                                    .page(nextPageToken)
                                    .build());

            for (Compartment compartment : response.getItems()) {
                System.out.println(compartment);
            }
            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);

        // List single level compartments within tenancy without Accessible compartment filter
        System.out.println("ListCompartments");
        do {
            ListCompartmentsResponse response =
                    identityClient.listCompartments(
                            ListCompartmentsRequest.builder()
                                    .limit(3)
                                    .compartmentId(compartmentId)
                                    .page(nextPageToken)
                                    .build());

            for (Compartment compartment : response.getItems()) {
                System.out.println(compartment);
            }
            nextPageToken = response.getOpcNextPage();
        } while (nextPageToken != null);
    }
}
