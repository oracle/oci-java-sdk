/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.ChangeNatGatewayCompartmentDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.CreateNatGatewayDetails;
import com.oracle.bmc.core.model.NatGateway;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.ChangeNatGatewayCompartmentRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.CreateNatGatewayRequest;
import com.oracle.bmc.core.requests.DeleteNatGatewayRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetNatGatewayRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.responses.CreateNatGatewayResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetNatGatewayResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;

/**
 * This class provides an example of how to change the compartment of a NAT Gateway in the Java SDK.
 *
 * <p>This sample will create the VCN where the NAT Gateway will be created, and create the NAT
 * Gateway that will be moved to a new compartment. Cleanup of NAT gateway and VCN is performed
 * after completion of the change compartment operation.
 *
 * <p>This example also makes some assumptions about the resources it will create:
 *
 * <ul>
 *   <li>The VCN created by this example will have a display name of java_sdk_natgw_example_vcn
 *   <li>The VCN will have a private IP CIDR block of 10.0.0.0/16
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *       <ul>
 */
public class ChangeNatGatewayCompartmentExample {

    private static final String VCN_DISPLAY_NAME = "java_sdk_natgw_example_vcn";
    private static final String CIDR_BLOCK = "10.0.0.0/16";

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li><SRC_COMPARTMENT_ID>The OCID of the compartment where the NAT gateway and related
     *           resources will be created
     *       <li><DEST_COMPARTMENT_ID>The OCID of the compartment where the NAT gateway will be
     *           moved to
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: the first argument is a source compartment OCID and second argument is the destination compartment ID where the NAT Gateway will be moved to");
        }

        final String SRC_COMPARTMENT_ID = args[0];
        final String DEST_COMPARTMENT_ID = args[1];
        final String natGatewayDisplayName = "changeCompartmentNGW";
        System.out.println(
                String.format(
                        "Performing operations to change NAT Gateway compartment from %s to %s",
                        SRC_COMPARTMENT_ID, DEST_COMPARTMENT_ID));
        System.out.println();
        if (SRC_COMPARTMENT_ID == null
                || SRC_COMPARTMENT_ID.trim().isEmpty()
                || DEST_COMPARTMENT_ID == null
                || DEST_COMPARTMENT_ID.trim().isEmpty()) {
            throw new IllegalStateException(
                    "Please provide valid src and destination compartment id");
        }

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider authProvider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient virtualNetworkClient =
                VirtualNetworkClient.builder().build(authProvider);
        Vcn vcn = null;
        NatGateway natGateway = null;
        try {
            // A VCN is required to create a NAT gateway
            vcn = createVcn(virtualNetworkClient, SRC_COMPARTMENT_ID);

            /*
             * Here we demonstrate:
             *
             *     - Creating a NAT gateway
             *     - Changing the NAT gateway's compartment
             *
             * And we'll delete these resources when we're done
             */
            natGateway =
                    createNatGateway(
                            virtualNetworkClient,
                            SRC_COMPARTMENT_ID,
                            natGatewayDisplayName,
                            vcn.getId());
            changeNatGatewayCompartment(virtualNetworkClient, natGateway, DEST_COMPARTMENT_ID);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (natGateway != null) {
                deleteNatGateway(virtualNetworkClient, natGateway);
            }

            if (vcn != null) {
                deleteVcn(virtualNetworkClient, vcn);
            }
        }
    }

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     * @return the created VCN
     * @throws Exception if there is an error waiting on the VCN to become available to use
     */
    private static Vcn createVcn(final VirtualNetworkClient vcnClient, final String compartmentId)
            throws Exception {
        final CreateVcnResponse createVcnResponse =
                vcnClient.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .cidrBlock(CIDR_BLOCK)
                                                .compartmentId(compartmentId)
                                                .displayName(VCN_DISPLAY_NAME)
                                                .build())
                                .build());

        final GetVcnResponse getVcnResponse =
                vcnClient
                        .getWaiters()
                        .forVcn(
                                GetVcnRequest.builder()
                                        .vcnId(createVcnResponse.getVcn().getId())
                                        .build(),
                                Vcn.LifecycleState.Available)
                        .execute();
        Vcn vcn = getVcnResponse.getVcn();
        System.out.println("Created Vcn : " + vcn.getId());
        System.out.println();
        return vcn;
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param vcn the VCN to delete
     * @throws Exception if there is an error waiting on the VCN to be deleted
     */
    private static void deleteVcn(final VirtualNetworkClient vcnClient, final Vcn vcn)
            throws Exception {

        vcnClient.deleteVcn(DeleteVcnRequest.builder().vcnId(vcn.getId()).build());

        vcnClient
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted Vcn");
    }

    /**
     * Creates a NAT gateway and waits for it to become available.
     *
     * @param vcnClient the service client to use to create the NAT Gateway
     * @param compartmentId the OCID of the compartment where the NAT Gateway will be created
     * @param vcnId the OCID of the VCN where the NAT Gateway will be created
     * @return the created NAT gateway
     * @throws Exception if there is an error waiting on the NAT gateway to become available to use
     */
    private static NatGateway createNatGateway(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String displayName,
            final String vcnId)
            throws Exception {

        System.out.println("Creating NAT gateway");
        System.out.println("=======================================");

        final CreateNatGatewayDetails createDetails =
                CreateNatGatewayDetails.builder()
                        .displayName(displayName)
                        .compartmentId(compartmentId)
                        .vcnId(vcnId)
                        .build();

        final CreateNatGatewayResponse createResponse =
                vcnClient.createNatGateway(
                        CreateNatGatewayRequest.builder()
                                .createNatGatewayDetails(createDetails)
                                .build());

        final GetNatGatewayResponse getNatGatewayResponse =
                vcnClient
                        .getWaiters()
                        .forNatGateway(
                                GetNatGatewayRequest.builder()
                                        .natGatewayId(createResponse.getNatGateway().getId())
                                        .build(),
                                NatGateway.LifecycleState.Available)
                        .execute();
        System.out.println(
                "Created NAT Gateway and waited for it to become available: "
                        + getNatGatewayResponse.getNatGateway().toString());
        System.out.println();
        System.out.println();

        return getNatGatewayResponse.getNatGateway();
    }

    /**
     * Deletes a NAT gateway and waits for it to be deleted.
     *
     * @param vcnClient the service client used to communicate with the NAT Gateway service
     * @param natGateway the NAT gateway to delete
     * @throws Exception if there is an error waiting on the NAT gateway to be deleted
     */
    private static void deleteNatGateway(
            final VirtualNetworkClient vcnClient, final NatGateway natGateway) throws Exception {

        vcnClient.deleteNatGateway(
                DeleteNatGatewayRequest.builder().natGatewayId(natGateway.getId()).build());

        vcnClient
                .getWaiters()
                .forNatGateway(
                        GetNatGatewayRequest.builder().natGatewayId(natGateway.getId()).build(),
                        NatGateway.LifecycleState.Terminated)
                .execute();
        System.out.println("Deleted NAT Gateway");
    }

    /**
     * Gets a specified NAT gateway.
     *
     * @param vcnClient the service client used to communicate with the NAT Gateway service
     * @param natGateway the NAT gateway to get
     * @throws Exception if there is an error waiting on the NAT gateway to be retrieved
     */
    private static NatGateway getNatGateway(
            final VirtualNetworkClient vcnClient, final NatGateway natGateway) throws Exception {
        final GetNatGatewayResponse getNatGatewayResponse =
                vcnClient.getNatGateway(
                        GetNatGatewayRequest.builder().natGatewayId(natGateway.getId()).build());
        return getNatGatewayResponse.getNatGateway();
    }

    /**
     * Changes the NAT gateway's compartment
     *
     * @param vcnClient the service client used to communicate with the NAT Gateway service
     * @param natGateway the NAT gateway to delete
     * @param destinationCompartmentId the destination compartment OCID
     * @throws Exception if there is an error changing the NAT gateway's compartment
     */
    private static void changeNatGatewayCompartment(
            final VirtualNetworkClient vcnClient,
            final NatGateway natGateway,
            final String destinationCompartmentId)
            throws Exception {

        System.out.println("Changing NAT gateway's compartment");
        System.out.println("=======================================");

        ChangeNatGatewayCompartmentDetails changeCompartmentDetails =
                ChangeNatGatewayCompartmentDetails.builder()
                        .compartmentId(destinationCompartmentId)
                        .build();
        ChangeNatGatewayCompartmentRequest request =
                ChangeNatGatewayCompartmentRequest.builder()
                        .natGatewayId(natGateway.getId())
                        .changeNatGatewayCompartmentDetails(changeCompartmentDetails)
                        .build();

        vcnClient.changeNatGatewayCompartment(request);
        NatGateway changedNatGateway = getNatGateway(vcnClient, natGateway);
        System.out.println(
                "NAT Gateway's compartment has changed : " + changedNatGateway.toString());
        System.out.println();
        System.out.println();
    }
}
