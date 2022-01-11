/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.*;
import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import java.util.Collections;

/**
 * Sample to demonstrate Service Gateway Change Compartment
 *
 * This example provides steps to change service gateway compartment. In order to change compartment,
 * service gateway and VCN need to be created. These resources are also created as a part of this
 * example. Cleanup of service gateway and VCN is performed after completion of change compartment operation
 *
 *
 * This example requires the user to pass 2 arguments
 *      1st : <SRC_COMPARTMENT_ID> source compartment OCID where VCN and Service Gateway need to be created
 *      2nd : <DEST_COMPARTMENT_ID> destination compartment OCID where the Service Gateway needs to be moved to
 */
public class ChangeServiceGatewayCompartmentExample {
    // source compartment ID where the service gateway will be created and moved from
    private static String SRC_COMPARTMENT_ID = null;

    // destination compartment ID where the service gateway should be moved to
    private static String DEST_COMPARTMENT_ID = null;

    // Default display name
    private static final String DISPLAY_NAME = "changeCompartment";

    // VCN CIDR block
    private static final String CIDR_BLOCK = "10.0.0.0/16";

    // OCI config file
    private static final String OCI_CONFIG_FILEPATH = "~/.oci/config";

    private static final String OCI_CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: the first argument is a source compartment OCID and second argument is destination compartment ID where the service gateway is to be moved to");
        }

        SRC_COMPARTMENT_ID = args[0];
        DEST_COMPARTMENT_ID = args[1];
        System.out.println("Performing operations for change service gateway compartment");

        if (SRC_COMPARTMENT_ID == null
                || SRC_COMPARTMENT_ID.trim().isEmpty()
                || DEST_COMPARTMENT_ID == null
                || DEST_COMPARTMENT_ID.trim().isEmpty()) {
            throw new IllegalStateException(
                    "Please provide valid src and destination compartment id");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(OCI_CONFIG_FILEPATH, OCI_CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient virtualNetworkClient = new VirtualNetworkClient(authProvider);

        Vcn vcn = null;
        ServiceGateway serviceGateway = null;
        try {
            System.out.println("Create Vcn");
            vcn = createVcn(virtualNetworkClient);
            System.out.println("Created Vcn : " + vcn.getId());

            System.out.println("Create Service Gateway");
            serviceGateway = createServiceGateway(virtualNetworkClient, vcn);
            System.out.println("Created Service Gateway : " + serviceGateway.getId());

            System.out.println("Change Service Gateway Compartment");
            changeServiceGatewayCompartment(virtualNetworkClient, serviceGateway);

            System.out.println("Get Service Gateway");
            serviceGateway = getServiceGateway(virtualNetworkClient, serviceGateway);
            System.out.println(
                    "Updated Service Gateway's Compartment : " + serviceGateway.getCompartmentId());

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (serviceGateway != null) {
                System.out.println("Delete Service Gateway");
                deleteServiceGateway(virtualNetworkClient, serviceGateway);
                System.out.println("Deleted Service Gateway");
            }

            if (vcn != null) {
                System.out.println("Delete Vcn");
                deleteVcn(virtualNetworkClient, vcn);
                System.out.println("Deleted Vcn");
            }
        }
    }

    /**
     * Create VCN
     * @return
     * @throws Exception
     */
    private static Vcn createVcn(VirtualNetworkClient virtualNetworkClient) throws Exception {

        CreateVcnRequest request =
                CreateVcnRequest.builder()
                        .createVcnDetails(
                                CreateVcnDetails.builder()
                                        .cidrBlock(CIDR_BLOCK)
                                        .compartmentId(SRC_COMPARTMENT_ID)
                                        .displayName(DISPLAY_NAME)
                                        .build())
                        .build();

        CreateVcnResponse response = virtualNetworkClient.createVcn(request);
        virtualNetworkClient
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(response.getVcn().getId()).build(),
                        Vcn.LifecycleState.Available)
                .execute();

        return response.getVcn();
    }

    /**
     * Delete VCN
     * @param vcn : VCN which needs to be deleted
     * @throws Exception
     */
    private static void deleteVcn(VirtualNetworkClient virtualNetworkClient, Vcn vcn)
            throws Exception {
        DeleteVcnRequest request = DeleteVcnRequest.builder().vcnId(vcn.getId()).build();
        virtualNetworkClient.deleteVcn(request);

        virtualNetworkClient
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Create Service Gateway
     * @param vcn : VCN in which service gateway needs to be created
     * @return
     * @throws Exception
     */
    private static ServiceGateway createServiceGateway(
            VirtualNetworkClient virtualNetworkClient, Vcn vcn) throws Exception {
        // Please update the services field to the required value. Here its placed empty for the purpose of the automation test
        CreateServiceGatewayRequest request =
                CreateServiceGatewayRequest.builder()
                        .createServiceGatewayDetails(
                                CreateServiceGatewayDetails.builder()
                                        .compartmentId(SRC_COMPARTMENT_ID)
                                        .vcnId(vcn.getId())
                                        .displayName(DISPLAY_NAME)
                                        .services(Collections.emptyList())
                                        .build())
                        .build();

        CreateServiceGatewayResponse response = virtualNetworkClient.createServiceGateway(request);
        virtualNetworkClient
                .getWaiters()
                .forServiceGateway(
                        GetServiceGatewayRequest.builder()
                                .serviceGatewayId(response.getServiceGateway().getId())
                                .build(),
                        ServiceGateway.LifecycleState.Available)
                .execute();
        return response.getServiceGateway();
    }

    /**
     * Delete Service Gateway
     * @param serviceGateway : service gateway which needs to be deleted
     * @throws Exception
     */
    private static void deleteServiceGateway(
            VirtualNetworkClient virtualNetworkClient, ServiceGateway serviceGateway)
            throws Exception {
        DeleteServiceGatewayRequest request =
                DeleteServiceGatewayRequest.builder()
                        .serviceGatewayId(serviceGateway.getId())
                        .build();

        virtualNetworkClient.deleteServiceGateway(request);
        virtualNetworkClient
                .getWaiters()
                .forServiceGateway(
                        GetServiceGatewayRequest.builder()
                                .serviceGatewayId(serviceGateway.getId())
                                .build(),
                        ServiceGateway.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Get Service Gateway
     * @param serviceGateway
     * @return ServiceGateway
     * @throws Exception
     */
    private static ServiceGateway getServiceGateway(
            VirtualNetworkClient virtualNetworkClient, ServiceGateway serviceGateway)
            throws Exception {
        GetServiceGatewayRequest request =
                GetServiceGatewayRequest.builder().serviceGatewayId(serviceGateway.getId()).build();
        GetServiceGatewayResponse response = virtualNetworkClient.getServiceGateway(request);
        return response.getServiceGateway();
    }

    /**
     * Change Service Gateway compartment
     * @param serviceGateway
     * @throws Exception
     */
    private static void changeServiceGatewayCompartment(
            VirtualNetworkClient virtualNetworkClient, ServiceGateway serviceGateway)
            throws Exception {
        ChangeServiceGatewayCompartmentDetails changeCompartmentDetails =
                ChangeServiceGatewayCompartmentDetails.builder()
                        .compartmentId(DEST_COMPARTMENT_ID)
                        .build();
        ChangeServiceGatewayCompartmentRequest request =
                ChangeServiceGatewayCompartmentRequest.builder()
                        .serviceGatewayId(serviceGateway.getId())
                        .changeServiceGatewayCompartmentDetails(changeCompartmentDetails)
                        .build();

        virtualNetworkClient.changeServiceGatewayCompartment(request);
    }
}
