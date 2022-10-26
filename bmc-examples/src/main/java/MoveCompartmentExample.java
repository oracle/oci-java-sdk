/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.Compartment;
import com.oracle.bmc.identity.model.MoveCompartmentDetails;
import com.oracle.bmc.identity.requests.MoveCompartmentRequest;

import shared.ExampleCompartmentHelper;

public class MoveCompartmentExample {
    private static String CP_SOURCE = "cp_source_JAVASDK";
    private static String CP_TARGET = "cp_target_JAVASDK";

    public static void main(String[] args) throws Exception {
        /*
         * Set up compartment tree
         *
         * Tenancy --- CP_source
         *         |
         *         |
         *         --- CP_target
         *
         * Move CP_source under CP_target, result compartment tree:
         *
         * Tenancy --- CP_target --- CP_source
         *
         */
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final String tenantId = provider.getTenantId();
        System.out.println("Tenant Id: " + tenantId);
        final Identity identityClient = new IdentityClient(provider);

        final Compartment cpSource =
                ExampleCompartmentHelper.createCompartment(identityClient, tenantId, CP_SOURCE);
        final Compartment cpTarget =
                ExampleCompartmentHelper.createCompartment(identityClient, tenantId, CP_TARGET);

        Compartment cpSourceBeforeMove =
                ExampleCompartmentHelper.getCompartment(identityClient, tenantId, CP_SOURCE);
        Compartment cpTargetBeforeMove =
                ExampleCompartmentHelper.getCompartment(identityClient, tenantId, CP_TARGET);

        System.out.println(
                "Created compartment "
                        + cpSourceBeforeMove.getName()
                        + " "
                        + cpSourceBeforeMove.getId()
                        + " under parent "
                        + cpSourceBeforeMove.getCompartmentId());
        System.out.println(
                "Created compartment "
                        + cpTargetBeforeMove.getName()
                        + " "
                        + cpTargetBeforeMove.getId()
                        + " under parent "
                        + cpTargetBeforeMove.getCompartmentId());

        // move cp_source under cp_target
        MoveCompartmentDetails moveCompartmentDetails =
                MoveCompartmentDetails.builder()
                        .targetCompartmentId(cpTargetBeforeMove.getId())
                        .build();
        MoveCompartmentRequest moveCompartmentRequest =
                MoveCompartmentRequest.builder()
                        .compartmentId(cpSourceBeforeMove.getId())
                        .moveCompartmentDetails(moveCompartmentDetails)
                        .build();

        System.out.println(
                "Moving compartment "
                        + cpSourceBeforeMove.getName()
                        + " "
                        + cpSourceBeforeMove.getId()
                        + " under compartment "
                        + cpTargetBeforeMove.getId());
        identityClient.moveCompartment(moveCompartmentRequest);

        Compartment cpTargetAfterMove =
                ExampleCompartmentHelper.getCompartment(identityClient, tenantId, CP_TARGET);
        Compartment cpSourceAfterMove =
                ExampleCompartmentHelper.getCompartment(
                        identityClient, cpTargetAfterMove.getId(), CP_SOURCE);

        System.out.println(
                "After move, compartment "
                        + cpSourceAfterMove.getName()
                        + " "
                        + cpSourceAfterMove.getId()
                        + " is under parent "
                        + cpSourceAfterMove.getCompartmentId());
        System.out.println(
                "After move, compartment "
                        + cpTargetAfterMove.getName()
                        + " "
                        + cpTargetAfterMove.getId()
                        + " is under parent "
                        + cpTargetAfterMove.getCompartmentId());
    }
}
