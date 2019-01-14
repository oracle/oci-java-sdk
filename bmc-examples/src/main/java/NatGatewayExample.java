/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.ArrayList;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.CreateNatGatewayDetails;
import com.oracle.bmc.core.model.UpdateNatGatewayDetails;
import com.oracle.bmc.core.model.CreateRouteTableDetails;
import com.oracle.bmc.core.model.NatGateway;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.CreateRouteTableRequest;
import com.oracle.bmc.core.requests.DeleteRouteTableRequest;
import com.oracle.bmc.core.requests.GetRouteTableRequest;
import com.oracle.bmc.core.requests.CreateNatGatewayRequest;
import com.oracle.bmc.core.requests.DeleteNatGatewayRequest;
import com.oracle.bmc.core.requests.GetNatGatewayRequest;
import com.oracle.bmc.core.requests.UpdateNatGatewayRequest;
import com.oracle.bmc.core.requests.ListNatGatewaysRequest;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.CreateRouteTableResponse;
import com.oracle.bmc.core.responses.GetRouteTableResponse;
import com.oracle.bmc.core.responses.DeleteRouteTableResponse;
import com.oracle.bmc.core.responses.CreateNatGatewayResponse;
import com.oracle.bmc.core.responses.DeleteNatGatewayResponse;
import com.oracle.bmc.core.responses.GetNatGatewayResponse;
import com.oracle.bmc.core.responses.UpdateNatGatewayResponse;
import com.oracle.bmc.core.responses.ListNatGatewaysResponse;

import com.oracle.bmc.core.VirtualNetworkWaiters;
import com.oracle.bmc.model.BmcException;

import java.util.List;
import java.security.SecureRandom;

/**
 * This class provides an example of how to use the Nat Gateway service in the Java SDK.
 *
 * Network Address Translation (NAT) Gateway allows instances in a private subnet to initiate connections to the internet
 * and receive response, but not receive inbound connections initiated from the internet. It allows an entire private
 * network to have access to the internet without assigning each host a public IPv4 address.
 *
 * In order to demonstrate functionality for nat gateway, this script will also create a VCN
 * and subnet. These will be deleted at the end of the script. This script also makes some assumptions about
 * the resources it will create:
 *
 * <ul>
 *   <li>The VCN created by this example will have a display name of java_sdk_natgw_example_vcn</li>
 *   <li>The VCN and subnet will have a private IP CIDR block of 10.0.0.0/16</li>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Resources will be created in us-phoenix-1</li>
 * <ul>
 */
public class NatGatewayExample {

    private static final String VCN_DISPLAY_NAME = "java_sdk_natgw_example_vcn";
    private static final String CIDR_BLOCK = "10.0.0.0/16";

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static final int RETRY_TOKEN_LENGTH = 32;
    private static final char[] RETRY_TOKEN_CHARS =
            "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment where the nat gateway and related resources will be created</li>
     *   <li>The display name of the nat gateway</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: the first argument is a compartment OCID and the second the display name of the nat gateway to create");
        }

        final String compartmentId = args[0];
        final String natGatewayDisplayName = args[1];

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        final VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);
        vcnClient.setRegion(Region.US_PHOENIX_1);
        Vcn vcn = null;
        NatGateway natGateway = null;
        RouteTable routeTable = null;
        try {
            //A VCN is required to create a nat gateway
            vcn = createVcn(vcnClient, compartmentId);
            System.out.println("Created VCN");
            System.out.println();
            /*
             * Here we demonstrate:
             *
             *     - Creating a new nat gateway
             *     - Adding the route rule to nat gateway to the route table
             *     - Getting the nat gateway
             *     - list the nat gateway
             *     - Updating the nat gateway
             *
             * And we'll delete this resources when we're done
             */
            natGateway =
                    createNatGateway(vcnClient, compartmentId, natGatewayDisplayName, vcn.getId());
            //A route rule in a route table that directs internet-bound traffic to the Nat Gateway
            //A route table is required
            routeTable = createRouteTable(vcnClient, compartmentId, vcn.getId(), natGateway);
            //instances using the VCN can now access the internet
            getNatGateway(vcnClient, natGateway.getId());
            listNatGateways(vcnClient, compartmentId);
            updateNatGateway(vcnClient, natGateway.getId(), natGatewayDisplayName);

        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (routeTable != null) {
                deleteRouteTable(vcnClient, routeTable);
                System.out.println(
                        "Deleted Route Table (must delete route table before deleting Nat Gateway)");
            }

            if (natGateway != null) {
                deleteNatGateway(vcnClient, natGateway);
                System.out.println("Deleted Nat Gateway");
            }

            if (vcn != null) {
                deleteVcn(vcnClient, vcn);
                System.out.println("Deleted VCN");
            }
            vcnClient.close();
        }
    }

    /**
     * Creates a nat gateway and waits for it to become available. We recommend using a retry token on these requests
     * so that if you receive a timeout or server error and need to retry the request you won't run the risk of
     * creating multiple resources.
     *
     * @param vcnClient the service client to use to create the Nat Gateway
     * @param compartmentId the OCID of the compartment where the Nat Gateway will be created
     * @param vcnId the OCID of the VCN where the Nat Gateway will be created
     *
     * @return the created nat gateway
     *
     * @throws Exception if there is an error waiting on the nat gateway to become available to use
     */
    private static NatGateway createNatGateway(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String displayName,
            final String vcnId)
            throws Exception {

        System.out.println("Creating nat gateway");
        System.out.println("=======================================");

        final String retryToken = getRetryToken(RETRY_TOKEN_LENGTH);

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
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println("Created nat gateway: " + createResponse.getNatGateway().toString());
        System.out.println();

        final GetNatGatewayResponse getNatGatewayResponse =
                vcnClient
                        .getWaiters()
                        .forNatGateway(
                                GetNatGatewayRequest.builder()
                                        .natGatewayId(
                                                createResponse
                                                        .getNatGateway()
                                                        .getId()) //not sure if ".Id(create..)"
                                        .build(),
                                NatGateway.LifecycleState.Available)
                        .execute();
        System.out.println(
                "Waited for nat gateway to become available: "
                        + getNatGatewayResponse.getNatGateway().toString());
        System.out.println();

        /*
         * If we try to send through the same request with the same retry token then this will not create a
         * new resource. Instead, the create response will contain the same resource which has already been
         * created
         */
        final CreateNatGatewayResponse createWithRetryToken =
                vcnClient.createNatGateway(
                        CreateNatGatewayRequest.builder()
                                .createNatGatewayDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println(
                "Try to create the nat gateway again with the same retry token: "
                        + createWithRetryToken.getNatGateway().toString());
        System.out.println(
                "Same resource? "
                        + (createWithRetryToken
                                .getNatGateway()
                                .getId()
                                .equals(createResponse.getNatGateway().getId())));
        System.out.println();
        System.out.println();

        return getNatGatewayResponse.getNatGateway();
    }

    /**
     * Demonstrates how to list nat gateways and using various criteria. Note that listing nat gateways is a paginated call, so we should
     * get all pages until there is no more opcNextPage token
     *
     * @param vcnClient the service client used to communicate with the Nat Gateway service
     * @param compartmentId the OCID of the compartment which owns the resources
     *
     */
    private static void listNatGateways(
            final VirtualNetworkClient vcnClient, final String compartmentId) {

        final ListNatGatewaysRequest.Builder requestBuilder =
                ListNatGatewaysRequest.builder().compartmentId(compartmentId);

        // The most basic call is to list nat gateways by comparment ID
        System.out.println();
        System.out.println("Listing Nat Gateways by compartment ID");
        System.out.println("=======================================");
        ListNatGatewaysResponse listResponse;
        do {
            listResponse = vcnClient.listNatGateways(requestBuilder.build());
            for (NatGateway ngw : listResponse.getItems()) {
                System.out.println("Nat Gateway: " + ngw.toString());
            }

            requestBuilder.page(listResponse.getOpcNextPage());
        } while (listResponse.getOpcNextPage() != null);

        System.out.println();
        System.out.println();
    }

    /**
     * Gets a specified nat gateway.
     *
     * @param vcnClient the service client used to communicate with the Nat Gateway service
     * @param natGateway the nat gateway to get
     *
     * @throws Exception if there is an error waiting on the nat gateway to be retrieved
     */
    private static void getNatGateway(
            final VirtualNetworkClient vcnClient, final String natGatewayId) throws Exception {

        System.out.println();
        System.out.println("Getting Nat Gateway by nat gateway ID");
        System.out.println("=======================================");

        final GetNatGatewayResponse getNatGatewayResponse =
                vcnClient.getNatGateway(
                        GetNatGatewayRequest.builder().natGatewayId(natGatewayId).build());

        System.out.println("Get Nat Gateway: " + getNatGatewayResponse.getNatGateway().toString());

        System.out.println();
        System.out.println();
    }

    /**
     * Updates a Nat Gateway to block traffic.
     *
     * @param vcnClient the service client to use to update the VCN
     * @param natGatewayId the OCID of the Nat Gateway to be updated
     *
     *
     * @throws Exception if there is an error updating the Nat Gateway
     */
    private static void updateNatGateway(
            final VirtualNetworkClient vcnClient,
            final String natGatewayId,
            final String natGatewayDisplayName)
            throws Exception {
        final UpdateNatGatewayResponse updateNatGatewayResponse =
                vcnClient.updateNatGateway(
                        UpdateNatGatewayRequest.builder()
                                .updateNatGatewayDetails(
                                        UpdateNatGatewayDetails.builder()
                                                .blockTraffic(true)
                                                .displayName(natGatewayDisplayName)
                                                .build())
                                .natGatewayId(natGatewayId)
                                .build());

        System.out.println(
                "Nat Gateway is updated: " + updateNatGatewayResponse.getNatGateway().toString());
        System.out.println();
        System.out.println();
    }

    /**
     * Deletes a nat gateway and waits for it to be deleted.
     *
     * @param vcnClient the service client used to communicate with the Nat Gateway service
     * @param natGateway the nat gateway to delete
     *
     * @throws Exception if there is an error waiting on the nat gateway to be deleted
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
    }

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     *
     * @return the created VCN
     *
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

        return getVcnResponse.getVcn();
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param vcn the VCN to delete
     *
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
    }

    /**
     * Generates a retry token that we can use as the opc-retry-token in a request.
     *
     * @param tokenLength the length of the token
     *
     * @return A retry token
     */
    private static String getRetryToken(final int tokenLength) {
        final char[] c = new char[tokenLength];
        final SecureRandom random = new SecureRandom();
        for (int i = 0; i < tokenLength; i++) {
            c[i] = RETRY_TOKEN_CHARS[random.nextInt(RETRY_TOKEN_CHARS.length)];
        }

        return new String(c);
    }

    /**
     * Creates a Route Table and waits for it to become available.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     * @param vcnId the OCID of the VCN where the Route Table will be created
     * @return the created Route Table
     *
     * @throws Exception if there is an error waiting on the VCN to become available to use
     */
    private static RouteTable createRouteTable(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final NatGateway natGateway)
            throws Exception {

        List<RouteRule> routeRuleList = new ArrayList<>();

        routeRuleList.add(
                RouteRule.builder()
                        .cidrBlock("0.0.0.0/0")
                        .networkEntityId(natGateway.getId())
                        .build());

        final CreateRouteTableResponse createRouteTableResponse =
                vcnClient.createRouteTable(
                        CreateRouteTableRequest.builder()
                                .createRouteTableDetails(
                                        CreateRouteTableDetails.builder()
                                                .compartmentId(compartmentId)
                                                .routeRules(routeRuleList)
                                                .vcnId(vcnId)
                                                .build())
                                .build());

        final GetRouteTableResponse getRouteTableResponse =
                vcnClient
                        .getWaiters()
                        .forRouteTable(
                                GetRouteTableRequest.builder()
                                        .rtId(createRouteTableResponse.getRouteTable().getId())
                                        .build(),
                                RouteTable.LifecycleState.Available)
                        .execute();

        System.out.println("Created Route Table and waited for it to become available");
        System.out.println();
        System.out.println();
        System.out.println(
                "Route table with Nat Gateway as target: "
                        + getRouteTableResponse.getRouteTable().toString());
        System.out.println();

        return getRouteTableResponse.getRouteTable();
    }

    /**
     * Deletes a Route Table and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param routeTable the VCN to delete
     *
     * @throws Exception if there is an error waiting on the VCN to be deleted
     */
    private static void deleteRouteTable(
            final VirtualNetworkClient vcnClient, final RouteTable routeTable) throws Exception {

        vcnClient.deleteRouteTable(
                DeleteRouteTableRequest.builder().rtId(routeTable.getId()).build());

        vcnClient
                .getWaiters()
                .forRouteTable(
                        GetRouteTableRequest.builder().rtId(routeTable.getId()).build(),
                        RouteTable.LifecycleState.Terminated)
                .execute();
    }
}
