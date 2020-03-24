/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package shared;

import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.model.CreateCompartmentDetails;
import com.oracle.bmc.identity.requests.CreateCompartmentRequest;
import com.oracle.bmc.identity.requests.DeleteCompartmentRequest;
import com.oracle.bmc.identity.requests.GetCompartmentRequest;
import com.oracle.bmc.identity.requests.ListCompartmentsRequest;
import com.oracle.bmc.identity.IdentityPaginators;

/**
 * This class provides several utility functions for basic interactions with the compartments service. These functions
 * may be referenced by multiple examples in order to keep example files focused on the behavior being showcased.
 */
public class ExampleCompartmentHelper {

    /**
     *
     * @param client
     * @param compartmentId
     * @param name
     * @return newly created compartment object
     */
    public static Compartment createCompartment(
            Identity client, String compartmentId, String name) {
        CreateCompartmentDetails createCompartmentDetails =
                CreateCompartmentDetails.builder()
                        .compartmentId(compartmentId)
                        .name(name)
                        .description(name)
                        .build();

        Compartment compartment =
                client.createCompartment(
                                CreateCompartmentRequest.builder()
                                        .createCompartmentDetails(createCompartmentDetails)
                                        .build())
                        .getCompartment();

        if (compartment == null) {
            throw new RuntimeException(
                    "Compartment creation fails with " + createCompartmentDetails.toString());
        }
        System.out.println("Compartment " + compartment.getName() + " created successfully");
        return compartment;
    }

    /**
     *
     * @param client
     * @param tenantId
     * @param compartmentName
     * @return compartment object with provided name
     */
    public static Compartment getCompartment(
            Identity client, String tenantId, String compartmentName) {

        IdentityPaginators paginators = client.getPaginators();

        // Get the compartment from tenancy of given name
        ListCompartmentsRequest listCompartmentsRequest =
                ListCompartmentsRequest.builder().compartmentId(tenantId).limit(1000).build();

        for (Compartment compartment :
                paginators.listCompartmentsRecordIterator(listCompartmentsRequest)) {
            if (compartment.getName().equalsIgnoreCase(compartmentName)) {
                return compartment;
            }
        }

        System.out.println(
                "Compartment " + compartmentName + " does not exist. Please check the name.");
        throw new RuntimeException("Compartment does not exist");
    }

    public static void deleteCompartment(Identity client, Compartment compartment)
            throws Exception {
        DeleteCompartmentRequest deleteCompartmentRequest =
                DeleteCompartmentRequest.builder().compartmentId(compartment.getId()).build();
        client.deleteCompartment(deleteCompartmentRequest);
        client.getWaiters()
                .forCompartment(
                        GetCompartmentRequest.builder().compartmentId(compartment.getId()).build(),
                        Compartment.LifecycleState.Deleted)
                .execute();
    }
}
