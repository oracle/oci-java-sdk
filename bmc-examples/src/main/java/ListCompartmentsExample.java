/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
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

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

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
        Compartment cp1 = null;
        Compartment cp2 = null;
        Compartment cp3 = null;
        Compartment cp21 = null;
        Compartment cp31 = null;
        Compartment cp211 = null;
        try {
            // Setup the first level compartments (CP-1, CP-2, CP-3)
            cp1 = ExampleCompartmentHelper.createCompartment(identityClient, tenantId, "CP-1");
            cp2 = ExampleCompartmentHelper.createCompartment(identityClient, tenantId, "CP-2");
            cp3 = ExampleCompartmentHelper.createCompartment(identityClient, tenantId, "CP-3");

            // If we create/update and then try to use compartments straight away, sometimes we can get a 404. To try and avoid this, the script
            // adds a short delay between the compartment management operations
            Thread.sleep(10000);

            // Setup the second level compartments (CP-21, CP-31)
            cp21 = ExampleCompartmentHelper.createCompartment(identityClient, cp2.getId(), "CP-21");
            cp31 = ExampleCompartmentHelper.createCompartment(identityClient, cp3.getId(), "CP-31");

            Thread.sleep(10000);

            // Setup the third level compartments (CP-211)
            cp211 =
                    ExampleCompartmentHelper.createCompartment(
                            identityClient, cp2.getId(), "CP-211");

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
        } finally {
            if (cp211 != null) {
                System.out.println("Cleaning up Compartment: " + cp211.getName());
                ExampleCompartmentHelper.deleteCompartment(identityClient, cp211);
            }
            if (cp31 != null) {
                System.out.println("Cleaning up Compartment: " + cp31.getName());
                ExampleCompartmentHelper.deleteCompartment(identityClient, cp31);
            }
            if (cp21 != null) {
                System.out.println("Cleaning up Compartment: " + cp21.getName());
                ExampleCompartmentHelper.deleteCompartment(identityClient, cp21);
            }
            if (cp3 != null) {
                System.out.println("Cleaning up Compartment: " + cp3.getName());
                ExampleCompartmentHelper.deleteCompartment(identityClient, cp3);
            }
            if (cp2 != null) {
                System.out.println("Cleaning up Compartment: " + cp2.getName());
                ExampleCompartmentHelper.deleteCompartment(identityClient, cp2);
            }
            if (cp1 != null) {
                System.out.println("Cleaning up Compartment: " + cp1.getName());
                ExampleCompartmentHelper.deleteCompartment(identityClient, cp1);
            }
        }
    }
}
