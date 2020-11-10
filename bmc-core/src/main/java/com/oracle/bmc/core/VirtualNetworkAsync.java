/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * API covering the [Networking](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/overview.htm),
 * [Compute](https://docs.cloud.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm), and
 * [Block Volume](https://docs.cloud.oracle.com/iaas/Content/Block/Concepts/overview.htm) services. Use this API
 * to manage resources such as virtual cloud networks (VCNs), compute instances, and
 * block storage volumes.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface VirtualNetworkAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Adds one or more security rules to the specified network security group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddNetworkSecurityGroupSecurityRulesResponse>
            addNetworkSecurityGroupSecurityRules(
                    AddNetworkSecurityGroupSecurityRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AddNetworkSecurityGroupSecurityRulesRequest,
                                    AddNetworkSecurityGroupSecurityRulesResponse>
                            handler);

    /**
     * Adds a Cidr from the named Byoip Range prefix to the referenced Public IP Pool.
     * The cidr must be a subset of the Byoip Range in question.
     * The cidr must not overlap with any other cidr already added to this
     * or any other Public Ip Pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddPublicIpPoolCapacityResponse> addPublicIpPoolCapacity(
            AddPublicIpPoolCapacityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddPublicIpPoolCapacityRequest, AddPublicIpPoolCapacityResponse>
                    handler);

    /**
     * Add a CIDR to a VCN. The new CIDR must maintain the following rules -
     * <p>
     * a. The CIDR provided is valid
     * b. The new CIDR range should not overlap with any existing CIDRs
     * c. The new CIDR should not exceed the max limit of CIDRs per VCNs
     * d. The new CIDR range does not overlap with any peered VCNs
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddVcnCidrResponse> addVcnCidr(
            AddVcnCidrRequest request,
            com.oracle.bmc.responses.AsyncHandler<AddVcnCidrRequest, AddVcnCidrResponse> handler);

    /**
     * initiate route advertisements for the Byoip Range prefix.
     * the prefix must be in PROVISIONED state
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AdvertiseByoipRangeResponse> advertiseByoipRange(
            AdvertiseByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AdvertiseByoipRangeRequest, AdvertiseByoipRangeResponse>
                    handler);

    /**
     * Adds the specified {@link Service} to the list of enabled
     * `Service` objects for the specified gateway. You must also set up a route rule with the
     * `cidrBlock` of the `Service` as the rule's destination and the service gateway as the rule's
     * target. See {@link RouteTable}.
     * <p>
     **Note:** The `AttachServiceId` operation is an easy way to add an individual `Service` to
     * the service gateway. Compare it with
     * {@link #updateServiceGateway(UpdateServiceGatewayRequest, Consumer, Consumer) updateServiceGateway}, which replaces
     * the entire existing list of enabled `Service` objects with the list that you provide in the
     * `Update` call.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachServiceIdResponse> attachServiceId(
            AttachServiceIdRequest request,
            com.oracle.bmc.responses.AsyncHandler<AttachServiceIdRequest, AttachServiceIdResponse>
                    handler);

    /**
     * Adds one or more customer public IP prefixes to the specified public virtual circuit.
     * Use this operation (and not {@link #updateVirtualCircuit(UpdateVirtualCircuitRequest, Consumer, Consumer) updateVirtualCircuit})
     * to add prefixes to the virtual circuit. Oracle must verify the customer's ownership
     * of each prefix before traffic for that prefix will flow across the virtual circuit.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BulkAddVirtualCircuitPublicPrefixesResponse>
            bulkAddVirtualCircuitPublicPrefixes(
                    BulkAddVirtualCircuitPublicPrefixesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BulkAddVirtualCircuitPublicPrefixesRequest,
                                    BulkAddVirtualCircuitPublicPrefixesResponse>
                            handler);

    /**
     * Removes one or more customer public IP prefixes from the specified public virtual circuit.
     * Use this operation (and not {@link #updateVirtualCircuit(UpdateVirtualCircuitRequest, Consumer, Consumer) updateVirtualCircuit})
     * to remove prefixes from the virtual circuit. When the virtual circuit's state switches
     * back to PROVISIONED, Oracle stops advertising the specified prefixes across the connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BulkDeleteVirtualCircuitPublicPrefixesResponse>
            bulkDeleteVirtualCircuitPublicPrefixes(
                    BulkDeleteVirtualCircuitPublicPrefixesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BulkDeleteVirtualCircuitPublicPrefixesRequest,
                                    BulkDeleteVirtualCircuitPublicPrefixesResponse>
                            handler);

    /**
     * Moves a byoip range into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeByoipRangeCompartmentResponse> changeByoipRangeCompartment(
            ChangeByoipRangeCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeByoipRangeCompartmentRequest, ChangeByoipRangeCompartmentResponse>
                    handler);

    /**
     * Moves a CPE object into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCpeCompartmentResponse> changeCpeCompartment(
            ChangeCpeCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeCpeCompartmentRequest, ChangeCpeCompartmentResponse>
                    handler);

    /**
     * Moves a cross-connect into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCrossConnectCompartmentResponse>
            changeCrossConnectCompartment(
                    ChangeCrossConnectCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCrossConnectCompartmentRequest,
                                    ChangeCrossConnectCompartmentResponse>
                            handler);

    /**
     * Moves a cross-connect group into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCrossConnectGroupCompartmentResponse>
            changeCrossConnectGroupCompartment(
                    ChangeCrossConnectGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCrossConnectGroupCompartmentRequest,
                                    ChangeCrossConnectGroupCompartmentResponse>
                            handler);

    /**
     * Moves a set of DHCP options into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDhcpOptionsCompartmentResponse> changeDhcpOptionsCompartment(
            ChangeDhcpOptionsCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDhcpOptionsCompartmentRequest,
                            ChangeDhcpOptionsCompartmentResponse>
                    handler);

    /**
     * Moves a DRG into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDrgCompartmentResponse> changeDrgCompartment(
            ChangeDrgCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeDrgCompartmentRequest, ChangeDrgCompartmentResponse>
                    handler);

    /**
     * Moves an IPSec connection into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeIPSecConnectionCompartmentResponse>
            changeIPSecConnectionCompartment(
                    ChangeIPSecConnectionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeIPSecConnectionCompartmentRequest,
                                    ChangeIPSecConnectionCompartmentResponse>
                            handler);

    /**
     * Moves an internet gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeInternetGatewayCompartmentResponse>
            changeInternetGatewayCompartment(
                    ChangeInternetGatewayCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeInternetGatewayCompartmentRequest,
                                    ChangeInternetGatewayCompartmentResponse>
                            handler);

    /**
     * Moves a local peering gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLocalPeeringGatewayCompartmentResponse>
            changeLocalPeeringGatewayCompartment(
                    ChangeLocalPeeringGatewayCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLocalPeeringGatewayCompartmentRequest,
                                    ChangeLocalPeeringGatewayCompartmentResponse>
                            handler);

    /**
     * Moves a NAT gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNatGatewayCompartmentResponse> changeNatGatewayCompartment(
            ChangeNatGatewayCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeNatGatewayCompartmentRequest, ChangeNatGatewayCompartmentResponse>
                    handler);

    /**
     * Moves a network security group into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNetworkSecurityGroupCompartmentResponse>
            changeNetworkSecurityGroupCompartment(
                    ChangeNetworkSecurityGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeNetworkSecurityGroupCompartmentRequest,
                                    ChangeNetworkSecurityGroupCompartmentResponse>
                            handler);

    /**
     * Moves a public IP into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     * <p>
     * This operation applies only to reserved public IPs. Ephemeral public IPs always belong to the
     * same compartment as their VNIC and move accordingly.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangePublicIpCompartmentResponse> changePublicIpCompartment(
            ChangePublicIpCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePublicIpCompartmentRequest, ChangePublicIpCompartmentResponse>
                    handler);

    /**
     * Moves a public IP pool into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangePublicIpPoolCompartmentResponse>
            changePublicIpPoolCompartment(
                    ChangePublicIpPoolCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePublicIpPoolCompartmentRequest,
                                    ChangePublicIpPoolCompartmentResponse>
                            handler);

    /**
     * Moves a remote peering connection (RPC) into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRemotePeeringConnectionCompartmentResponse>
            changeRemotePeeringConnectionCompartment(
                    ChangeRemotePeeringConnectionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRemotePeeringConnectionCompartmentRequest,
                                    ChangeRemotePeeringConnectionCompartmentResponse>
                            handler);

    /**
     * Moves a route table into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRouteTableCompartmentResponse> changeRouteTableCompartment(
            ChangeRouteTableCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeRouteTableCompartmentRequest, ChangeRouteTableCompartmentResponse>
                    handler);

    /**
     * Moves a security list into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSecurityListCompartmentResponse>
            changeSecurityListCompartment(
                    ChangeSecurityListCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSecurityListCompartmentRequest,
                                    ChangeSecurityListCompartmentResponse>
                            handler);

    /**
     * Moves a service gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeServiceGatewayCompartmentResponse>
            changeServiceGatewayCompartment(
                    ChangeServiceGatewayCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeServiceGatewayCompartmentRequest,
                                    ChangeServiceGatewayCompartmentResponse>
                            handler);

    /**
     * Moves a subnet into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSubnetCompartmentResponse> changeSubnetCompartment(
            ChangeSubnetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeSubnetCompartmentRequest, ChangeSubnetCompartmentResponse>
                    handler);

    /**
     * Moves a VCN into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVcnCompartmentResponse> changeVcnCompartment(
            ChangeVcnCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeVcnCompartmentRequest, ChangeVcnCompartmentResponse>
                    handler);

    /**
     * Moves a virtual circuit into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVirtualCircuitCompartmentResponse>
            changeVirtualCircuitCompartment(
                    ChangeVirtualCircuitCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeVirtualCircuitCompartmentRequest,
                                    ChangeVirtualCircuitCompartmentResponse>
                            handler);

    /**
     * Moves a VLAN into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeVlanCompartmentResponse> changeVlanCompartment(
            ChangeVlanCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeVlanCompartmentRequest, ChangeVlanCompartmentResponse>
                    handler);

    /**
     * Connects this local peering gateway (LPG) to another one in the same region.
     * <p>
     * This operation must be called by the VCN administrator who is designated as
     * the *requestor* in the peering relationship. The *acceptor* must implement
     * an Identity and Access Management (IAM) policy that gives the requestor permission
     * to connect to LPGs in the acceptor's compartment. Without that permission, this
     * operation will fail. For more information, see
     * [VCN Peering](https://docs.cloud.oracle.com/Content/Network/Tasks/VCNpeering.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConnectLocalPeeringGatewaysResponse> connectLocalPeeringGateways(
            ConnectLocalPeeringGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ConnectLocalPeeringGatewaysRequest, ConnectLocalPeeringGatewaysResponse>
                    handler);

    /**
     * Connects this RPC to another one in a different region.
     * <p>
     * This operation must be called by the VCN administrator who is designated as
     * the *requestor* in the peering relationship. The *acceptor* must implement
     * an Identity and Access Management (IAM) policy that gives the requestor permission
     * to connect to RPCs in the acceptor's compartment. Without that permission, this
     * operation will fail. For more information, see
     * [VCN Peering](https://docs.cloud.oracle.com/Content/Network/Tasks/VCNpeering.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ConnectRemotePeeringConnectionsResponse>
            connectRemotePeeringConnections(
                    ConnectRemotePeeringConnectionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ConnectRemotePeeringConnectionsRequest,
                                    ConnectRemotePeeringConnectionsResponse>
                            handler);

    /**
     * Creates a Byoip Range prefix.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateByoipRangeResponse> createByoipRange(
            CreateByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateByoipRangeRequest, CreateByoipRangeResponse>
                    handler);

    /**
     * Creates a new virtual customer-premises equipment (CPE) object in the specified compartment. For
     * more information, see [IPSec VPNs](https://docs.cloud.oracle.com/Content/Network/Tasks/managingIPsec.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the CPE to reside. Notice that the CPE doesn't have to be in the same compartment as the IPSec
     * connection or other Networking Service components. If you're not sure which compartment to
     * use, put the CPE in the same compartment as the DRG. For more information about
     * compartments and access control, see [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must provide the public IP address of your on-premises router. See
     * [Configuring Your On-Premises Router for an IPSec VPN](https://docs.cloud.oracle.com/Content/Network/Tasks/configuringCPE.htm).
     * <p>
     * You may optionally specify a *display name* for the CPE, otherwise a default is provided. It does not have to
     * be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCpeResponse> createCpe(
            CreateCpeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateCpeRequest, CreateCpeResponse> handler);

    /**
     * Creates a new cross-connect. Oracle recommends you create each cross-connect in a
     * {@link CrossConnectGroup} so you can use link aggregation
     * with the connection.
     * <p>
     * After creating the `CrossConnect` object, you need to go the FastConnect location
     * and request to have the physical cable installed. For more information, see
     * [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the
     * compartment where you want the cross-connect to reside. If you're
     * not sure which compartment to use, put the cross-connect in the
     * same compartment with your VCN. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the cross-connect.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCrossConnectResponse> createCrossConnect(
            CreateCrossConnectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCrossConnectRequest, CreateCrossConnectResponse>
                    handler);

    /**
     * Creates a new cross-connect group to use with Oracle Cloud Infrastructure
     * FastConnect. For more information, see
     * [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the
     * compartment where you want the cross-connect group to reside. If you're
     * not sure which compartment to use, put the cross-connect group in the
     * same compartment with your VCN. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the cross-connect group.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCrossConnectGroupResponse> createCrossConnectGroup(
            CreateCrossConnectGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCrossConnectGroupRequest, CreateCrossConnectGroupResponse>
                    handler);

    /**
     * Creates a new set of DHCP options for the specified VCN. For more information, see
     * {@link DhcpOptions}.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the set of
     * DHCP options to reside. Notice that the set of options doesn't have to be in the same compartment as the VCN,
     * subnets, or other Networking Service components. If you're not sure which compartment to use, put the set
     * of DHCP options in the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the set of DHCP options, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDhcpOptionsResponse> createDhcpOptions(
            CreateDhcpOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDhcpOptionsRequest, CreateDhcpOptionsResponse>
                    handler);

    /**
     * Creates a new dynamic routing gateway (DRG) in the specified compartment. For more information,
     * see [Dynamic Routing Gateways (DRGs)](https://docs.cloud.oracle.com/Content/Network/Tasks/managingDRGs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the DRG to reside. Notice that the DRG doesn't have to be in the same compartment as the VCN,
     * the DRG attachment, or other Networking Service components. If you're not sure which compartment
     * to use, put the DRG in the same compartment as the VCN. For more information about compartments
     * and access control, see [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the DRG, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDrgResponse> createDrg(
            CreateDrgRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDrgRequest, CreateDrgResponse> handler);

    /**
     * Attaches the specified DRG to the specified VCN. A VCN can be attached to only one DRG at a time,
     * and vice versa. The response includes a `DrgAttachment` object with its own OCID. For more
     * information about DRGs, see
     * [Dynamic Routing Gateways (DRGs)](https://docs.cloud.oracle.com/Content/Network/Tasks/managingDRGs.htm).
     * <p>
     * You may optionally specify a *display name* for the attachment, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * For the purposes of access control, the DRG attachment is automatically placed into the same compartment
     * as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDrgAttachmentResponse> createDrgAttachment(
            CreateDrgAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDrgAttachmentRequest, CreateDrgAttachmentResponse>
                    handler);

    /**
     * Creates a new IPSec connection between the specified DRG and CPE. For more information, see
     * [IPSec VPNs](https://docs.cloud.oracle.com/Content/Network/Tasks/managingIPsec.htm).
     * <p>
     * If you configure at least one tunnel to use static routing, then in the request you must provide
     * at least one valid static route (you're allowed a maximum of 10). For example: 10.0.0.0/16.
     * If you configure both tunnels to use BGP dynamic routing, you can provide an empty list for
     * the static routes. For more information, see the important note in
     * {@link IPSecConnection}.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the
     * IPSec connection to reside. Notice that the IPSec connection doesn't have to be in the same compartment
     * as the DRG, CPE, or other Networking Service components. If you're not sure which compartment to
     * use, put the IPSec connection in the same compartment as the DRG. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the IPSec connection, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * After creating the IPSec connection, you need to configure your on-premises router
     * with tunnel-specific information. For tunnel status and the required configuration information, see:
     * <p>
     * {@link IPSecConnectionTunnel}
     *   * {@link IPSecConnectionTunnelSharedSecret}
     * <p>
     * For each tunnel, you need the IP address of Oracle's VPN headend and the shared secret
     * (that is, the pre-shared key). For more information, see
     * [Configuring Your On-Premises Router for an IPSec VPN](https://docs.cloud.oracle.com/Content/Network/Tasks/configuringCPE.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateIPSecConnectionResponse> createIPSecConnection(
            CreateIPSecConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateIPSecConnectionRequest, CreateIPSecConnectionResponse>
                    handler);

    /**
     * Creates a new internet gateway for the specified VCN. For more information, see
     * [Access to the Internet](https://docs.cloud.oracle.com/Content/Network/Tasks/managingIGs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the Internet
     * Gateway to reside. Notice that the internet gateway doesn't have to be in the same compartment as the VCN or
     * other Networking Service components. If you're not sure which compartment to use, put the Internet
     * Gateway in the same compartment with the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the internet gateway, otherwise a default is provided. It
     * does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * For traffic to flow between a subnet and an internet gateway, you must create a route rule accordingly in
     * the subnet's route table (for example, 0.0.0.0/0 > internet gateway). See
     * {@link #updateRouteTable(UpdateRouteTableRequest, Consumer, Consumer) updateRouteTable}.
     * <p>
     * You must specify whether the internet gateway is enabled when you create it. If it's disabled, that means no
     * traffic will flow to/from the internet even if there's a route rule that enables that traffic. You can later
     * use {@link #updateInternetGateway(UpdateInternetGatewayRequest, Consumer, Consumer) updateInternetGateway} to easily disable/enable
     * the gateway without changing the route rule.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateInternetGatewayResponse> createInternetGateway(
            CreateInternetGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateInternetGatewayRequest, CreateInternetGatewayResponse>
                    handler);

    /**
     * Creates an IPv6 for the specified VNIC.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateIpv6Response> createIpv6(
            CreateIpv6Request request,
            com.oracle.bmc.responses.AsyncHandler<CreateIpv6Request, CreateIpv6Response> handler);

    /**
     * Creates a new local peering gateway (LPG) for the specified VCN.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateLocalPeeringGatewayResponse> createLocalPeeringGateway(
            CreateLocalPeeringGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLocalPeeringGatewayRequest, CreateLocalPeeringGatewayResponse>
                    handler);

    /**
     * Creates a new NAT gateway for the specified VCN. You must also set up a route rule with the
     * NAT gateway as the rule's target. See {@link RouteTable}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateNatGatewayResponse> createNatGateway(
            CreateNatGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateNatGatewayRequest, CreateNatGatewayResponse>
                    handler);

    /**
     * Creates a new network security group for the specified VCN.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateNetworkSecurityGroupResponse> createNetworkSecurityGroup(
            CreateNetworkSecurityGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateNetworkSecurityGroupRequest, CreateNetworkSecurityGroupResponse>
                    handler);

    /**
     * Creates a secondary private IP for the specified VNIC.
     * For more information about secondary private IPs, see
     * [IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingIPaddresses.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateIpResponse> createPrivateIp(
            CreatePrivateIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePrivateIpRequest, CreatePrivateIpResponse>
                    handler);

    /**
     * Creates a public IP. Use the `lifetime` property to specify whether it's an ephemeral or
     * reserved public IP. For information about limits on how many you can create, see
     * [Public IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingpublicIPs.htm).
     * <p>
     * **For an ephemeral public IP assigned to a private IP:** You must also specify a `privateIpId`
     * with the OCID of the primary private IP you want to assign the public IP to. The public IP is
     * created in the same availability domain as the private IP. An ephemeral public IP must always be
     * assigned to a private IP, and only to the *primary* private IP on a VNIC, not a secondary
     * private IP. Exception: If you create a {@link NatGateway}, Oracle
     * automatically assigns the NAT gateway a regional ephemeral public IP that you cannot remove.
     * <p>
     * **For a reserved public IP:** You may also optionally assign the public IP to a private
     * IP by specifying `privateIpId`. Or you can later assign the public IP with
     * {@link #updatePublicIp(UpdatePublicIpRequest, Consumer, Consumer) updatePublicIp}.
     * <p>
     **Note:** When assigning a public IP to a private IP, the private IP must not already have
     * a public IP with `lifecycleState` = ASSIGNING or ASSIGNED. If it does, an error is returned.
     * <p>
     * Also, for reserved public IPs, the optional assignment part of this operation is
     * asynchronous. Poll the public IP's `lifecycleState` to determine if the assignment
     * succeeded.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePublicIpResponse> createPublicIp(
            CreatePublicIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePublicIpRequest, CreatePublicIpResponse>
                    handler);

    /**
     * Creates a Public Ip Pool
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePublicIpPoolResponse> createPublicIpPool(
            CreatePublicIpPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePublicIpPoolRequest, CreatePublicIpPoolResponse>
                    handler);

    /**
     * Creates a new remote peering connection (RPC) for the specified DRG.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateRemotePeeringConnectionResponse>
            createRemotePeeringConnection(
                    CreateRemotePeeringConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateRemotePeeringConnectionRequest,
                                    CreateRemotePeeringConnectionResponse>
                            handler);

    /**
     * Creates a new route table for the specified VCN. In the request you must also include at least one route
     * rule for the new route table. For information on the number of rules you can have in a route table, see
     * [Service Limits](https://docs.cloud.oracle.com/Content/General/Concepts/servicelimits.htm). For general information about route
     * tables in your VCN and the types of targets you can use in route rules,
     * see [Route Tables](https://docs.cloud.oracle.com/Content/Network/Tasks/managingroutetables.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the route
     * table to reside. Notice that the route table doesn't have to be in the same compartment as the VCN, subnets,
     * or other Networking Service components. If you're not sure which compartment to use, put the route
     * table in the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the route table, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateRouteTableResponse> createRouteTable(
            CreateRouteTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRouteTableRequest, CreateRouteTableResponse>
                    handler);

    /**
     * Creates a new security list for the specified VCN. For more information
     * about security lists, see [Security Lists](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm).
     * For information on the number of rules you can have in a security list, see
     * [Service Limits](https://docs.cloud.oracle.com/Content/General/Concepts/servicelimits.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the security
     * list to reside. Notice that the security list doesn't have to be in the same compartment as the VCN, subnets,
     * or other Networking Service components. If you're not sure which compartment to use, put the security
     * list in the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the security list, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSecurityListResponse> createSecurityList(
            CreateSecurityListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSecurityListRequest, CreateSecurityListResponse>
                    handler);

    /**
     * Creates a new service gateway in the specified compartment.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the service gateway to reside. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the service gateway, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateServiceGatewayResponse> createServiceGateway(
            CreateServiceGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceGatewayRequest, CreateServiceGatewayResponse>
                    handler);

    /**
     * Creates a new subnet in the specified VCN. You can't change the size of the subnet after creation,
     * so it's important to think about the size of subnets you need before creating them.
     * For more information, see [VCNs and Subnets](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVCNs.htm).
     * For information on the number of subnets you can have in a VCN, see
     * [Service Limits](https://docs.cloud.oracle.com/Content/General/Concepts/servicelimits.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the subnet
     * to reside. Notice that the subnet doesn't have to be in the same compartment as the VCN, route tables, or
     * other Networking Service components. If you're not sure which compartment to use, put the subnet in
     * the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about OCIDs,
     * see [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally associate a route table with the subnet. If you don't, the subnet will use the
     * VCN's default route table. For more information about route tables, see
     * [Route Tables](https://docs.cloud.oracle.com/Content/Network/Tasks/managingroutetables.htm).
     * <p>
     * You may optionally associate a security list with the subnet. If you don't, the subnet will use the
     * VCN's default security list. For more information about security lists, see
     * [Security Lists](https://docs.cloud.oracle.com/Content/Network/Concepts/securitylists.htm).
     * <p>
     * You may optionally associate a set of DHCP options with the subnet. If you don't, the subnet will use the
     * VCN's default set. For more information about DHCP options, see
     * [DHCP Options](https://docs.cloud.oracle.com/Content/Network/Tasks/managingDHCP.htm).
     * <p>
     * You may optionally specify a *display name* for the subnet, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * You can also add a DNS label for the subnet, which is required if you want the Internet and
     * VCN Resolver to resolve hostnames for instances in the subnet. For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSubnetResponse> createSubnet(
            CreateSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateSubnetRequest, CreateSubnetResponse>
                    handler);

    /**
     * Creates a new virtual cloud network (VCN). For more information, see
     * [VCNs and Subnets](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVCNs.htm).
     * <p>
     * To create the VCN, you may specify a list of IPv4 CIDR blocks. The CIDRs must maintain
     * the following rules -
     * <p>
     * a. The list of CIDRs provided are valid
     * b. There is no overlap between different CIDRs
     * c. The list of CIDRs does not exceed the max limit of CIDRs per VCN
     * <p>
     * Oracle recommends using one of the private IP address ranges specified in [RFC 1918]
     * (https://tools.ietf.org/html/rfc1918) (10.0.0.0/8, 172.16/12, and 192.168/16). Example:
     * 172.16.0.0/16. The CIDR blocks can range from /16 to /30, and they must not overlap with
     * your on-premises network.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the VCN to
     * reside. Consult an Oracle Cloud Infrastructure administrator in your organization if you're not sure which
     * compartment to use. Notice that the VCN doesn't have to be in the same compartment as the subnets or other
     * Networking Service components. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the VCN, otherwise a default is provided. It does not have to
     * be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * You can also add a DNS label for the VCN, which is required if you want the instances to use the
     * Interent and VCN Resolver option for DNS in the VCN. For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     * <p>
     * The VCN automatically comes with a default route table, default security list, and default set of DHCP options.
     * The OCID for each is returned in the response. You can't delete these default objects, but you can change their
     * contents (that is, change the route rules, security list rules, and so on).
     * <p>
     * The VCN and subnets you create are not accessible until you attach an internet gateway or set up an IPSec VPN
     * or FastConnect. For more information, see
     * [Overview of the Networking Service](https://docs.cloud.oracle.com/Content/Network/Concepts/overview.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVcnResponse> createVcn(
            CreateVcnRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVcnRequest, CreateVcnResponse> handler);

    /**
     * Creates a new virtual circuit to use with Oracle Cloud
     * Infrastructure FastConnect. For more information, see
     * [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the
     * compartment where you want the virtual circuit to reside. If you're
     * not sure which compartment to use, put the virtual circuit in the
     * same compartment with the DRG it's using. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see
     * [Resource Identifiers](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the virtual circuit.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     **Important:** When creating a virtual circuit, you specify a DRG for
     * the traffic to flow through. Make sure you attach the DRG to your
     * VCN and confirm the VCN's routing sends traffic to the DRG. Otherwise
     * traffic will not flow. For more information, see
     * [Route Tables](https://docs.cloud.oracle.com/Content/Network/Tasks/managingroutetables.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVirtualCircuitResponse> createVirtualCircuit(
            CreateVirtualCircuitRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateVirtualCircuitRequest, CreateVirtualCircuitResponse>
                    handler);

    /**
     * Creates a VLAN in the specified VCN and the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateVlanResponse> createVlan(
            CreateVlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateVlanRequest, CreateVlanResponse> handler);

    /**
     * Deletes the specified Byoip Range prefix.
     * The prefix must be in CREATING, PROVISIONED or FAILED state.
     * It must not have any subranges allocated to a Public Ip Pool object.
     * You must specify the object's OCID.
     * <p>
     * In case the range is currently PROVISIONED, the operation will be asynchronous as it needs to be de-ptovisioned first.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteByoipRangeResponse> deleteByoipRange(
            DeleteByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteByoipRangeRequest, DeleteByoipRangeResponse>
                    handler);

    /**
     * Deletes the specified CPE object. The CPE must not be connected to a DRG. This is an asynchronous
     * operation. The CPE's `lifecycleState` will change to TERMINATING temporarily until the CPE is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCpeResponse> deleteCpe(
            DeleteCpeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteCpeRequest, DeleteCpeResponse> handler);

    /**
     * Deletes the specified cross-connect. It must not be mapped to a
     * {@link VirtualCircuit}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCrossConnectResponse> deleteCrossConnect(
            DeleteCrossConnectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCrossConnectRequest, DeleteCrossConnectResponse>
                    handler);

    /**
     * Deletes the specified cross-connect group. It must not contain any
     * cross-connects, and it cannot be mapped to a
     * {@link VirtualCircuit}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCrossConnectGroupResponse> deleteCrossConnectGroup(
            DeleteCrossConnectGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCrossConnectGroupRequest, DeleteCrossConnectGroupResponse>
                    handler);

    /**
     * Deletes the specified set of DHCP options, but only if it's not associated with a subnet. You can't delete a
     * VCN's default set of DHCP options.
     * <p>
     * This is an asynchronous operation. The state of the set of options will switch to TERMINATING temporarily
     * until the set is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDhcpOptionsResponse> deleteDhcpOptions(
            DeleteDhcpOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse>
                    handler);

    /**
     * Deletes the specified DRG. The DRG must not be attached to a VCN or be connected to your on-premise
     * network. Also, there must not be a route table that lists the DRG as a target. This is an asynchronous
     * operation. The DRG's `lifecycleState` will change to TERMINATING temporarily until the DRG is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDrgResponse> deleteDrg(
            DeleteDrgRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDrgRequest, DeleteDrgResponse> handler);

    /**
     * Detaches a DRG from a VCN by deleting the corresponding `DrgAttachment`. This is an asynchronous
     * operation. The attachment's `lifecycleState` will change to DETACHING temporarily until the attachment
     * is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDrgAttachmentResponse> deleteDrgAttachment(
            DeleteDrgAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse>
                    handler);

    /**
     * Deletes the specified IPSec connection. If your goal is to disable the IPSec VPN between your VCN and
     * on-premises network, it's easiest to simply detach the DRG but keep all the IPSec VPN components intact.
     * If you were to delete all the components and then later need to create an IPSec VPN again, you would
     * need to configure your on-premises router again with the new information returned from
     * {@link #createIPSecConnection(CreateIPSecConnectionRequest, Consumer, Consumer) createIPSecConnection}.
     * <p>
     * This is an asynchronous operation. The connection's `lifecycleState` will change to TERMINATING temporarily
     * until the connection is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIPSecConnectionResponse> deleteIPSecConnection(
            DeleteIPSecConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse>
                    handler);

    /**
     * Deletes the specified internet gateway. The internet gateway does not have to be disabled, but
     * there must not be a route table that lists it as a target.
     * <p>
     * This is an asynchronous operation. The gateway's `lifecycleState` will change to TERMINATING temporarily
     * until the gateway is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteInternetGatewayResponse> deleteInternetGateway(
            DeleteInternetGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteInternetGatewayRequest, DeleteInternetGatewayResponse>
                    handler);

    /**
     * Unassigns and deletes the specified IPv6. You must specify the object's OCID.
     * The IPv6 address is returned to the subnet's pool of available addresses.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteIpv6Response> deleteIpv6(
            DeleteIpv6Request request,
            com.oracle.bmc.responses.AsyncHandler<DeleteIpv6Request, DeleteIpv6Response> handler);

    /**
     * Deletes the specified local peering gateway (LPG).
     * <p>
     * This is an asynchronous operation; the local peering gateway's `lifecycleState` changes to TERMINATING temporarily
     * until the local peering gateway is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLocalPeeringGatewayResponse> deleteLocalPeeringGateway(
            DeleteLocalPeeringGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLocalPeeringGatewayRequest, DeleteLocalPeeringGatewayResponse>
                    handler);

    /**
     * Deletes the specified NAT gateway. The NAT gateway does not have to be disabled, but there
     * must not be a route rule that lists the NAT gateway as a target.
     * <p>
     * This is an asynchronous operation. The NAT gateway's `lifecycleState` will change to
     * TERMINATING temporarily until the NAT gateway is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNatGatewayResponse> deleteNatGateway(
            DeleteNatGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNatGatewayRequest, DeleteNatGatewayResponse>
                    handler);

    /**
     * Deletes the specified network security group. The group must not contain any VNICs.
     * <p>
     * To get a list of the VNICs in a network security group, use
     * {@link #listNetworkSecurityGroupVnics(ListNetworkSecurityGroupVnicsRequest, Consumer, Consumer) listNetworkSecurityGroupVnics}.
     * Each returned {@link NetworkSecurityGroupVnic} object
     * contains both the OCID of the VNIC and the OCID of the VNIC's parent resource (for example,
     * the Compute instance that the VNIC is attached to).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNetworkSecurityGroupResponse> deleteNetworkSecurityGroup(
            DeleteNetworkSecurityGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteNetworkSecurityGroupRequest, DeleteNetworkSecurityGroupResponse>
                    handler);

    /**
     * Unassigns and deletes the specified private IP. You must
     * specify the object's OCID. The private IP address is returned to
     * the subnet's pool of available addresses.
     * <p>
     * This operation cannot be used with primary private IPs, which are
     * automatically unassigned and deleted when the VNIC is terminated.
     * <p>
     **Important:** If a secondary private IP is the
     * [target of a route rule](https://docs.cloud.oracle.com/Content/Network/Tasks/managingroutetables.htm#privateip),
     * unassigning it from the VNIC causes that route rule to blackhole and the traffic
     * will be dropped.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateIpResponse> deletePrivateIp(
            DeletePrivateIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePrivateIpRequest, DeletePrivateIpResponse>
                    handler);

    /**
     * Unassigns and deletes the specified public IP (either ephemeral or reserved).
     * You must specify the object's OCID. The public IP address is returned to the
     * Oracle Cloud Infrastructure public IP pool.
     * <p>
     **Note:** You cannot update, unassign, or delete the public IP that Oracle automatically
     * assigned to an entity for you (such as a load balancer or NAT gateway). The public IP is
     * automatically deleted if the assigned entity is terminated.
     * <p>
     * For an assigned reserved public IP, the initial unassignment portion of this operation
     * is asynchronous. Poll the public IP's `lifecycleState` to determine
     * if the operation succeeded.
     * <p>
     * If you want to simply unassign a reserved public IP and return it to your pool
     * of reserved public IPs, instead use
     * {@link #updatePublicIp(UpdatePublicIpRequest, Consumer, Consumer) updatePublicIp}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePublicIpResponse> deletePublicIp(
            DeletePublicIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePublicIpRequest, DeletePublicIpResponse>
                    handler);

    /**
     * Deletes the specified Public Ip Pool
     * It must not have any active address allocations
     * You must specify the object's OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePublicIpPoolResponse> deletePublicIpPool(
            DeletePublicIpPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePublicIpPoolRequest, DeletePublicIpPoolResponse>
                    handler);

    /**
     * Deletes the remote peering connection (RPC).
     * <p>
     * This is an asynchronous operation; the RPC's `lifecycleState` changes to TERMINATING temporarily
     * until the RPC is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRemotePeeringConnectionResponse>
            deleteRemotePeeringConnection(
                    DeleteRemotePeeringConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteRemotePeeringConnectionRequest,
                                    DeleteRemotePeeringConnectionResponse>
                            handler);

    /**
     * Deletes the specified route table, but only if it's not associated with a subnet. You can't delete a
     * VCN's default route table.
     * <p>
     * This is an asynchronous operation. The route table's `lifecycleState` will change to TERMINATING temporarily
     * until the route table is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRouteTableResponse> deleteRouteTable(
            DeleteRouteTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResponse>
                    handler);

    /**
     * Deletes the specified security list, but only if it's not associated with a subnet. You can't delete
     * a VCN's default security list.
     * <p>
     * This is an asynchronous operation. The security list's `lifecycleState` will change to TERMINATING temporarily
     * until the security list is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSecurityListResponse> deleteSecurityList(
            DeleteSecurityListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSecurityListRequest, DeleteSecurityListResponse>
                    handler);

    /**
     * Deletes the specified service gateway. There must not be a route table that lists the service
     * gateway as a target.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteServiceGatewayResponse> deleteServiceGateway(
            DeleteServiceGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceGatewayRequest, DeleteServiceGatewayResponse>
                    handler);

    /**
     * Deletes the specified subnet, but only if there are no instances in the subnet. This is an asynchronous
     * operation. The subnet's `lifecycleState` will change to TERMINATING temporarily. If there are any
     * instances in the subnet, the state will instead change back to AVAILABLE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSubnetResponse> deleteSubnet(
            DeleteSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteSubnetRequest, DeleteSubnetResponse>
                    handler);

    /**
     * Deletes the specified VCN. The VCN must be empty and have no attached gateways. This is an asynchronous
     * operation. The VCN's `lifecycleState` will change to TERMINATING temporarily until the VCN is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVcnResponse> deleteVcn(
            DeleteVcnRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteVcnRequest, DeleteVcnResponse> handler);

    /**
     * Deletes the specified virtual circuit.
     * <p>
     **Important:** If you're using FastConnect via a provider,
     * make sure to also terminate the connection with
     * the provider, or else the provider may continue to bill you.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVirtualCircuitResponse> deleteVirtualCircuit(
            DeleteVirtualCircuitRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteVirtualCircuitRequest, DeleteVirtualCircuitResponse>
                    handler);

    /**
     * Deletes the specified VLAN, but only if there are no VNICs in the VLAN.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteVlanResponse> deleteVlan(
            DeleteVlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteVlanRequest, DeleteVlanResponse> handler);

    /**
     * Removes the specified {@link Service} from the list of enabled
     * `Service` objects for the specified gateway. You do not need to remove any route
     * rules that specify this `Service` object's `cidrBlock` as the destination CIDR. However, consider
     * removing the rules if your intent is to permanently disable use of the `Service` through this
     * service gateway.
     * <p>
     **Note:** The `DetachServiceId` operation is an easy way to remove an individual `Service` from
     * the service gateway. Compare it with
     * {@link #updateServiceGateway(UpdateServiceGatewayRequest, Consumer, Consumer) updateServiceGateway}, which replaces
     * the entire existing list of enabled `Service` objects with the list that you provide in the
     * `Update` call. `UpdateServiceGateway` also lets you block all traffic through the service
     * gateway without having to remove each of the individual `Service` objects.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachServiceIdResponse> detachServiceId(
            DetachServiceIdRequest request,
            com.oracle.bmc.responses.AsyncHandler<DetachServiceIdRequest, DetachServiceIdResponse>
                    handler);

    /**
     * Gets the specified Byoip Range object. You must specify the object's OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetByoipRangeResponse> getByoipRange(
            GetByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetByoipRangeRequest, GetByoipRangeResponse>
                    handler);

    /**
     * Gets the specified CPE's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCpeResponse> getCpe(
            GetCpeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCpeRequest, GetCpeResponse> handler);

    /**
     * Renders a set of CPE configuration content that can help a network engineer configure the actual
     * CPE device (for example, a hardware router) represented by the specified {@link Cpe}
     * object.
     * <p>
     * The rendered content is specific to the type of CPE device (for example, Cisco ASA). Therefore the
     * {@link Cpe} must have the CPE's device type specified by the `cpeDeviceShapeId`
     * attribute. The content optionally includes answers that the customer provides (see
     * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest, Consumer, Consumer) updateTunnelCpeDeviceConfig}),
     * merged with a template of other information specific to the CPE device type.
     * <p>
     * The operation returns configuration information for *all* of the
     * {@link IPSecConnection} objects that use the specified CPE.
     * Here are similar operations:
     * <p>
     * {@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest, Consumer, Consumer) getIpsecCpeDeviceConfigContent}
     *   returns CPE configuration content for all tunnels in a single IPSec connection.
     *   * {@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest, Consumer, Consumer) getTunnelCpeDeviceConfigContent}
     *   returns CPE configuration content for a specific tunnel within an IPSec connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCpeDeviceConfigContentResponse> getCpeDeviceConfigContent(
            GetCpeDeviceConfigContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCpeDeviceConfigContentRequest, GetCpeDeviceConfigContentResponse>
                    handler);

    /**
     * Gets the detailed information about the specified CPE device type. This might include a set of questions
     * that are specific to the particular CPE device type. The customer must supply answers to those questions
     * (see {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest, Consumer, Consumer) updateTunnelCpeDeviceConfig}).
     * The service merges the answers with a template of other information for the CPE device type. The following
     * operations return the merged content:
     * <p>
     * {@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest, Consumer, Consumer) getCpeDeviceConfigContent}
     *   * {@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest, Consumer, Consumer) getIpsecCpeDeviceConfigContent}
     *   * {@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest, Consumer, Consumer) getTunnelCpeDeviceConfigContent}
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCpeDeviceShapeResponse> getCpeDeviceShape(
            GetCpeDeviceShapeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCpeDeviceShapeRequest, GetCpeDeviceShapeResponse>
                    handler);

    /**
     * Gets the specified cross-connect's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCrossConnectResponse> getCrossConnect(
            GetCrossConnectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCrossConnectRequest, GetCrossConnectResponse>
                    handler);

    /**
     * Gets the specified cross-connect group's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCrossConnectGroupResponse> getCrossConnectGroup(
            GetCrossConnectGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCrossConnectGroupRequest, GetCrossConnectGroupResponse>
                    handler);

    /**
     * Gets the Letter of Authority for the specified cross-connect.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCrossConnectLetterOfAuthorityResponse>
            getCrossConnectLetterOfAuthority(
                    GetCrossConnectLetterOfAuthorityRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCrossConnectLetterOfAuthorityRequest,
                                    GetCrossConnectLetterOfAuthorityResponse>
                            handler);

    /**
     * Gets the status of the specified cross-connect.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCrossConnectStatusResponse> getCrossConnectStatus(
            GetCrossConnectStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCrossConnectStatusRequest, GetCrossConnectStatusResponse>
                    handler);

    /**
     * Gets the specified set of DHCP options.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDhcpOptionsResponse> getDhcpOptions(
            GetDhcpOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDhcpOptionsRequest, GetDhcpOptionsResponse>
                    handler);

    /**
     * Gets the specified DRG's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDrgResponse> getDrg(
            GetDrgRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDrgRequest, GetDrgResponse> handler);

    /**
     * Gets the information for the specified `DrgAttachment`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDrgAttachmentResponse> getDrgAttachment(
            GetDrgAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDrgAttachmentRequest, GetDrgAttachmentResponse>
                    handler);

    /**
     * Gets the redundancy status for the specified DRG. For more information, see
     * [Redundancy Remedies](https://docs.cloud.oracle.com/Content/Network/Troubleshoot/drgredundancy.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDrgRedundancyStatusResponse> getDrgRedundancyStatus(
            GetDrgRedundancyStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDrgRedundancyStatusRequest, GetDrgRedundancyStatusResponse>
                    handler);

    /**
     * Gets the specified provider service.
     * For more information, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFastConnectProviderServiceResponse>
            getFastConnectProviderService(
                    GetFastConnectProviderServiceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFastConnectProviderServiceRequest,
                                    GetFastConnectProviderServiceResponse>
                            handler);

    /**
     * Gets the specified provider service key's information. Use this operation to validate a
     * provider service key. An invalid key returns a 404 error.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFastConnectProviderServiceKeyResponse>
            getFastConnectProviderServiceKey(
                    GetFastConnectProviderServiceKeyRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFastConnectProviderServiceKeyRequest,
                                    GetFastConnectProviderServiceKeyResponse>
                            handler);

    /**
     * Gets the specified IPSec connection's basic information, including the static routes for the
     * on-premises router. If you want the status of the connection (whether it's up or down), use
     * {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest, Consumer, Consumer) getIPSecConnectionTunnel}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIPSecConnectionResponse> getIPSecConnection(
            GetIPSecConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIPSecConnectionRequest, GetIPSecConnectionResponse>
                    handler);

    /**
     * Deprecated. To get tunnel information, instead use:
     * <p>
     * {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest, Consumer, Consumer) getIPSecConnectionTunnel}
     * * {@link #getIPSecConnectionTunnelSharedSecret(GetIPSecConnectionTunnelSharedSecretRequest, Consumer, Consumer) getIPSecConnectionTunnelSharedSecret}
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIPSecConnectionDeviceConfigResponse>
            getIPSecConnectionDeviceConfig(
                    GetIPSecConnectionDeviceConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionDeviceConfigRequest,
                                    GetIPSecConnectionDeviceConfigResponse>
                            handler);

    /**
     * Deprecated. To get the tunnel status, instead use
     * {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest, Consumer, Consumer) getIPSecConnectionTunnel}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIPSecConnectionDeviceStatusResponse>
            getIPSecConnectionDeviceStatus(
                    GetIPSecConnectionDeviceStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionDeviceStatusRequest,
                                    GetIPSecConnectionDeviceStatusResponse>
                            handler);

    /**
     * Gets the specified tunnel's information. The resulting object does not include the tunnel's
     * shared secret (pre-shared key). To retrieve that, use
     * {@link #getIPSecConnectionTunnelSharedSecret(GetIPSecConnectionTunnelSharedSecretRequest, Consumer, Consumer) getIPSecConnectionTunnelSharedSecret}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIPSecConnectionTunnelResponse> getIPSecConnectionTunnel(
            GetIPSecConnectionTunnelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetIPSecConnectionTunnelRequest, GetIPSecConnectionTunnelResponse>
                    handler);

    /**
     * Gets the specified tunnel's shared secret (pre-shared key). To get other information
     * about the tunnel, use {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest, Consumer, Consumer) getIPSecConnectionTunnel}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIPSecConnectionTunnelSharedSecretResponse>
            getIPSecConnectionTunnelSharedSecret(
                    GetIPSecConnectionTunnelSharedSecretRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetIPSecConnectionTunnelSharedSecretRequest,
                                    GetIPSecConnectionTunnelSharedSecretResponse>
                            handler);

    /**
     * Gets the specified internet gateway's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetInternetGatewayResponse> getInternetGateway(
            GetInternetGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetInternetGatewayRequest, GetInternetGatewayResponse>
                    handler);

    /**
     * Renders a set of CPE configuration content for the specified IPSec connection (for all the
     * tunnels in the connection). The content helps a network engineer configure the actual CPE
     * device (for example, a hardware router) that the specified IPSec connection terminates on.
     * <p>
     * The rendered content is specific to the type of CPE device (for example, Cisco ASA). Therefore the
     * {@link Cpe} used by the specified {@link IPSecConnection}
     * must have the CPE's device type specified by the `cpeDeviceShapeId` attribute. The content
     * optionally includes answers that the customer provides (see
     * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest, Consumer, Consumer) updateTunnelCpeDeviceConfig}),
     * merged with a template of other information specific to the CPE device type.
     * <p>
     * The operation returns configuration information for all tunnels in the single specified
     * {@link IPSecConnection} object. Here are other similar
     * operations:
     * <p>
     * {@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest, Consumer, Consumer) getTunnelCpeDeviceConfigContent}
     *   returns CPE configuration content for a specific tunnel within an IPSec connection.
     *   * {@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest, Consumer, Consumer) getCpeDeviceConfigContent}
     *   returns CPE configuration content for *all* IPSec connections that use a specific CPE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIpsecCpeDeviceConfigContentResponse>
            getIpsecCpeDeviceConfigContent(
                    GetIpsecCpeDeviceConfigContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetIpsecCpeDeviceConfigContentRequest,
                                    GetIpsecCpeDeviceConfigContentResponse>
                            handler);

    /**
     * Gets the specified IPv6. You must specify the object's OCID.
     * Alternatively, you can get the object by using
     * {@link #listIpv6s(ListIpv6sRequest, Consumer, Consumer) listIpv6s}
     * with the IPv6 address (for example, 2001:0db8:0123:1111:98fe:dcba:9876:4321) and subnet OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetIpv6Response> getIpv6(
            GetIpv6Request request,
            com.oracle.bmc.responses.AsyncHandler<GetIpv6Request, GetIpv6Response> handler);

    /**
     * Gets the specified local peering gateway's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetLocalPeeringGatewayResponse> getLocalPeeringGateway(
            GetLocalPeeringGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLocalPeeringGatewayRequest, GetLocalPeeringGatewayResponse>
                    handler);

    /**
     * Gets the specified NAT gateway's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNatGatewayResponse> getNatGateway(
            GetNatGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNatGatewayRequest, GetNatGatewayResponse>
                    handler);

    /**
     * Gets the specified network security group's information.
     * <p>
     * To list the VNICs in an NSG, see
     * {@link #listNetworkSecurityGroupVnics(ListNetworkSecurityGroupVnicsRequest, Consumer, Consumer) listNetworkSecurityGroupVnics}.
     * <p>
     * To list the security rules in an NSG, see
     * {@link #listNetworkSecurityGroupSecurityRules(ListNetworkSecurityGroupSecurityRulesRequest, Consumer, Consumer) listNetworkSecurityGroupSecurityRules}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNetworkSecurityGroupResponse> getNetworkSecurityGroup(
            GetNetworkSecurityGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkSecurityGroupRequest, GetNetworkSecurityGroupResponse>
                    handler);

    /**
     * Gets the specified private IP. You must specify the object's OCID.
     * Alternatively, you can get the object by using
     * {@link #listPrivateIps(ListPrivateIpsRequest, Consumer, Consumer) listPrivateIps}
     * with the private IP address (for example, 10.0.3.3) and subnet OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateIpResponse> getPrivateIp(
            GetPrivateIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPrivateIpRequest, GetPrivateIpResponse>
                    handler);

    /**
     * Gets the specified public IP. You must specify the object's OCID.
     * <p>
     * Alternatively, you can get the object by using {@link #getPublicIpByIpAddress(GetPublicIpByIpAddressRequest, Consumer, Consumer) getPublicIpByIpAddress}
     * with the public IP address (for example, 203.0.113.2).
     * <p>
     * Or you can use {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest, Consumer, Consumer) getPublicIpByPrivateIpId}
     * with the OCID of the private IP that the public IP is assigned to.
     * <p>
     **Note:** If you're fetching a reserved public IP that is in the process of being
     * moved to a different private IP, the service returns the public IP object with
     * `lifecycleState` = ASSIGNING and `assignedEntityId` = OCID of the target private IP.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublicIpResponse> getPublicIp(
            GetPublicIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPublicIpRequest, GetPublicIpResponse> handler);

    /**
     * Gets the public IP based on the public IP address (for example, 203.0.113.2).
     * <p>
     **Note:** If you're fetching a reserved public IP that is in the process of being
     * moved to a different private IP, the service returns the public IP object with
     * `lifecycleState` = ASSIGNING and `assignedEntityId` = OCID of the target private IP.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublicIpByIpAddressResponse> getPublicIpByIpAddress(
            GetPublicIpByIpAddressRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPublicIpByIpAddressRequest, GetPublicIpByIpAddressResponse>
                    handler);

    /**
     * Gets the public IP assigned to the specified private IP. You must specify the OCID
     * of the private IP. If no public IP is assigned, a 404 is returned.
     * <p>
     **Note:** If you're fetching a reserved public IP that is in the process of being
     * moved to a different private IP, and you provide the OCID of the original private
     * IP, this operation returns a 404. If you instead provide the OCID of the target
     * private IP, or if you instead call
     * {@link #getPublicIp(GetPublicIpRequest, Consumer, Consumer) getPublicIp} or
     * {@link #getPublicIpByIpAddress(GetPublicIpByIpAddressRequest, Consumer, Consumer) getPublicIpByIpAddress}, the
     * service returns the public IP object with `lifecycleState` = ASSIGNING and
     * `assignedEntityId` = OCID of the target private IP.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublicIpByPrivateIpIdResponse> getPublicIpByPrivateIpId(
            GetPublicIpByPrivateIpIdRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPublicIpByPrivateIpIdRequest, GetPublicIpByPrivateIpIdResponse>
                    handler);

    /**
     * Gets the specified Public Ip Pool object. You must specify the object's OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublicIpPoolResponse> getPublicIpPool(
            GetPublicIpPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPublicIpPoolRequest, GetPublicIpPoolResponse>
                    handler);

    /**
     * Get the specified remote peering connection's information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRemotePeeringConnectionResponse> getRemotePeeringConnection(
            GetRemotePeeringConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRemotePeeringConnectionRequest, GetRemotePeeringConnectionResponse>
                    handler);

    /**
     * Gets the specified route table's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRouteTableResponse> getRouteTable(
            GetRouteTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRouteTableRequest, GetRouteTableResponse>
                    handler);

    /**
     * Gets the specified security list's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSecurityListResponse> getSecurityList(
            GetSecurityListRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSecurityListRequest, GetSecurityListResponse>
                    handler);

    /**
     * Gets the specified {@link Service} object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceResponse> getService(
            GetServiceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetServiceRequest, GetServiceResponse> handler);

    /**
     * Gets the specified service gateway's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceGatewayResponse> getServiceGateway(
            GetServiceGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceGatewayRequest, GetServiceGatewayResponse>
                    handler);

    /**
     * Gets the specified subnet's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSubnetResponse> getSubnet(
            GetSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSubnetRequest, GetSubnetResponse> handler);

    /**
     * Gets the set of CPE configuration answers for the tunnel, which the customer provided in
     * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest, Consumer, Consumer) updateTunnelCpeDeviceConfig}.
     * To get the full set of content for the tunnel (any answers merged with the template of other
     * information specific to the CPE device type), use
     * {@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest, Consumer, Consumer) getTunnelCpeDeviceConfigContent}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTunnelCpeDeviceConfigResponse> getTunnelCpeDeviceConfig(
            GetTunnelCpeDeviceConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTunnelCpeDeviceConfigRequest, GetTunnelCpeDeviceConfigResponse>
                    handler);

    /**
     * Renders a set of CPE configuration content for the specified IPSec tunnel. The content helps a
     * network engineer configure the actual CPE device (for example, a hardware router) that the specified
     * IPSec tunnel terminates on.
     * <p>
     * The rendered content is specific to the type of CPE device (for example, Cisco ASA). Therefore the
     * {@link Cpe} used by the specified {@link IPSecConnection}
     * must have the CPE's device type specified by the `cpeDeviceShapeId` attribute. The content
     * optionally includes answers that the customer provides (see
     * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest, Consumer, Consumer) updateTunnelCpeDeviceConfig}),
     * merged with a template of other information specific to the CPE device type.
     * <p>
     * The operation returns configuration information for only the specified IPSec tunnel.
     * Here are other similar operations:
     * <p>
     * {@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest, Consumer, Consumer) getIpsecCpeDeviceConfigContent}
     *   returns CPE configuration content for all tunnels in a single IPSec connection.
     *   * {@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest, Consumer, Consumer) getCpeDeviceConfigContent}
     *   returns CPE configuration content for *all* IPSec connections that use a specific CPE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTunnelCpeDeviceConfigContentResponse>
            getTunnelCpeDeviceConfigContent(
                    GetTunnelCpeDeviceConfigContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetTunnelCpeDeviceConfigContentRequest,
                                    GetTunnelCpeDeviceConfigContentResponse>
                            handler);

    /**
     * Gets the specified VCN's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVcnResponse> getVcn(
            GetVcnRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVcnRequest, GetVcnResponse> handler);

    /**
     * Get the associated DNS resolver information with a vcn
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVcnDnsResolverAssociationResponse> getVcnDnsResolverAssociation(
            GetVcnDnsResolverAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVcnDnsResolverAssociationRequest,
                            GetVcnDnsResolverAssociationResponse>
                    handler);

    /**
     * Gets the specified virtual circuit's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVirtualCircuitResponse> getVirtualCircuit(
            GetVirtualCircuitRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetVirtualCircuitRequest, GetVirtualCircuitResponse>
                    handler);

    /**
     * Gets the specified VLAN's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVlanResponse> getVlan(
            GetVlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVlanRequest, GetVlanResponse> handler);

    /**
     * Gets the information for the specified virtual network interface card (VNIC).
     * You can get the VNIC OCID from the
     * {@link #listVnicAttachments(ListVnicAttachmentsRequest, Consumer, Consumer) listVnicAttachments}
     * operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetVnicResponse> getVnic(
            GetVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetVnicRequest, GetVnicResponse> handler);

    /**
     * Lists the regions that support remote VCN peering (which is peering across regions).
     * For more information, see [VCN Peering](https://docs.cloud.oracle.com/Content/Network/Tasks/VCNpeering.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAllowedPeerRegionsForRemotePeeringResponse>
            listAllowedPeerRegionsForRemotePeering(
                    ListAllowedPeerRegionsForRemotePeeringRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAllowedPeerRegionsForRemotePeeringRequest,
                                    ListAllowedPeerRegionsForRemotePeeringResponse>
                            handler);

    /**
     * Lists the ByoipAllocatedRange objects for the ByoipRange.
     * Each ByoipAllocatedRange object has a CIDR block part of the ByoipRange and the PublicIpPool it is assigned to.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListByoipAllocatedRangesResponse> listByoipAllocatedRanges(
            ListByoipAllocatedRangesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListByoipAllocatedRangesRequest, ListByoipAllocatedRangesResponse>
                    handler);

    /**
     * Lists the ByoipRange objects in the specified compartment.
     * You can filter the list by using query parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListByoipRangesResponse> listByoipRanges(
            ListByoipRangesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListByoipRangesRequest, ListByoipRangesResponse>
                    handler);

    /**
     * Lists the CPE device types that the Networking service provides CPE configuration
     * content for (example: Cisco ASA). The content helps a network engineer configure
     * the actual CPE device represented by a {@link Cpe} object.
     * <p>
     * If you want to generate CPE configuration content for one of the returned CPE device types,
     * ensure that the {@link Cpe} object's `cpeDeviceShapeId` attribute is set
     * to the CPE device type's OCID (returned by this operation).
     * <p>
     * For information about generating CPE configuration content, see these operations:
     * <p>
     * {@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest, Consumer, Consumer) getCpeDeviceConfigContent}
     *   * {@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest, Consumer, Consumer) getIpsecCpeDeviceConfigContent}
     *   * {@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest, Consumer, Consumer) getTunnelCpeDeviceConfigContent}
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCpeDeviceShapesResponse> listCpeDeviceShapes(
            ListCpeDeviceShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCpeDeviceShapesRequest, ListCpeDeviceShapesResponse>
                    handler);

    /**
     * Lists the customer-premises equipment objects (CPEs) in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCpesResponse> listCpes(
            ListCpesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCpesRequest, ListCpesResponse> handler);

    /**
     * Lists the cross-connect groups in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCrossConnectGroupsResponse> listCrossConnectGroups(
            ListCrossConnectGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectGroupsRequest, ListCrossConnectGroupsResponse>
                    handler);

    /**
     * Lists the available FastConnect locations for cross-connect installation. You need
     * this information so you can specify your desired location when you create a cross-connect.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCrossConnectLocationsResponse> listCrossConnectLocations(
            ListCrossConnectLocationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectLocationsRequest, ListCrossConnectLocationsResponse>
                    handler);

    /**
     * Lists the cross-connects in the specified compartment. You can filter the list
     * by specifying the OCID of a cross-connect group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCrossConnectsResponse> listCrossConnects(
            ListCrossConnectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCrossConnectsRequest, ListCrossConnectsResponse>
                    handler);

    /**
     * Lists the available port speeds for cross-connects. You need this information
     * so you can specify your desired port speed (that is, shape) when you create a
     * cross-connect.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCrossconnectPortSpeedShapesResponse>
            listCrossconnectPortSpeedShapes(
                    ListCrossconnectPortSpeedShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCrossconnectPortSpeedShapesRequest,
                                    ListCrossconnectPortSpeedShapesResponse>
                            handler);

    /**
     * Lists the sets of DHCP options in the specified VCN and specified compartment.
     * If the VCN ID is not provided, then the list includes the sets of DHCP options from all VCNs in the specified compartment.
     * The response includes the default set of options that automatically comes with each VCN,
     * plus any other sets you've created.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDhcpOptionsResponse> listDhcpOptions(
            ListDhcpOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDhcpOptionsRequest, ListDhcpOptionsResponse>
                    handler);

    /**
     * Lists the `DrgAttachment` objects for the specified compartment. You can filter the
     * results by VCN or DRG.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDrgAttachmentsResponse> listDrgAttachments(
            ListDrgAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDrgAttachmentsRequest, ListDrgAttachmentsResponse>
                    handler);

    /**
     * Lists the DRGs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDrgsResponse> listDrgs(
            ListDrgsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDrgsRequest, ListDrgsResponse> handler);

    /**
     * Lists the service offerings from supported providers. You need this
     * information so you can specify your desired provider and service
     * offering when you create a virtual circuit.
     * <p>
     * For the compartment ID, provide the OCID of your tenancy (the root compartment).
     * <p>
     * For more information, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFastConnectProviderServicesResponse>
            listFastConnectProviderServices(
                    ListFastConnectProviderServicesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListFastConnectProviderServicesRequest,
                                    ListFastConnectProviderServicesResponse>
                            handler);

    /**
     * Gets the list of available virtual circuit bandwidth levels for a provider.
     * You need this information so you can specify your desired bandwidth level (shape) when you create a virtual circuit.
     * <p>
     * For more information about virtual circuits, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
            listFastConnectProviderVirtualCircuitBandwidthShapes(
                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest,
                                    ListFastConnectProviderVirtualCircuitBandwidthShapesResponse>
                            handler);

    /**
     * Lists the tunnel information for the specified IPSec connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListIPSecConnectionTunnelsResponse> listIPSecConnectionTunnels(
            ListIPSecConnectionTunnelsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIPSecConnectionTunnelsRequest, ListIPSecConnectionTunnelsResponse>
                    handler);

    /**
     * Lists the IPSec connections for the specified compartment. You can filter the
     * results by DRG or CPE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListIPSecConnectionsResponse> listIPSecConnections(
            ListIPSecConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListIPSecConnectionsRequest, ListIPSecConnectionsResponse>
                    handler);

    /**
     * Lists the internet gateways in the specified VCN and the specified compartment.
     * If the VCN ID is not provided, then the list includes the internet gateways from all VCNs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListInternetGatewaysResponse> listInternetGateways(
            ListInternetGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInternetGatewaysRequest, ListInternetGatewaysResponse>
                    handler);

    /**
     * Lists the {@link Ipv6} objects based
     * on one of these filters:
     * <p>
     * Subnet OCID.
     *   * VNIC OCID.
     *   * Both IPv6 address and subnet OCID: This lets you get an `Ipv6` object based on its private
     *   IPv6 address (for example, 2001:0db8:0123:1111:abcd:ef01:2345:6789) and not its OCID. For comparison,
     *   {@link #getIpv6(GetIpv6Request, Consumer, Consumer) getIpv6} requires the OCID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListIpv6sResponse> listIpv6s(
            ListIpv6sRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListIpv6sRequest, ListIpv6sResponse> handler);

    /**
     * Lists the local peering gateways (LPGs) for the specified VCN and specified compartment.
     * If the VCN ID is not provided, then the list includes the LPGs from all VCNs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListLocalPeeringGatewaysResponse> listLocalPeeringGateways(
            ListLocalPeeringGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLocalPeeringGatewaysRequest, ListLocalPeeringGatewaysResponse>
                    handler);

    /**
     * Lists the NAT gateways in the specified compartment. You may optionally specify a VCN OCID
     * to filter the results by VCN.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNatGatewaysResponse> listNatGateways(
            ListNatGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNatGatewaysRequest, ListNatGatewaysResponse>
                    handler);

    /**
     * Lists the security rules in the specified network security group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkSecurityGroupSecurityRulesResponse>
            listNetworkSecurityGroupSecurityRules(
                    ListNetworkSecurityGroupSecurityRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkSecurityGroupSecurityRulesRequest,
                                    ListNetworkSecurityGroupSecurityRulesResponse>
                            handler);

    /**
     * Lists the VNICs in the specified network security group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkSecurityGroupVnicsResponse>
            listNetworkSecurityGroupVnics(
                    ListNetworkSecurityGroupVnicsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListNetworkSecurityGroupVnicsRequest,
                                    ListNetworkSecurityGroupVnicsResponse>
                            handler);

    /**
     * Lists the network security groups in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNetworkSecurityGroupsResponse> listNetworkSecurityGroups(
            ListNetworkSecurityGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListNetworkSecurityGroupsRequest, ListNetworkSecurityGroupsResponse>
                    handler);

    /**
     * Lists the {@link PrivateIp} objects based
     * on one of these filters:
     * <p>
     * - Subnet OCID.
     *   - VNIC OCID.
     *   - Both private IP address and subnet OCID: This lets
     *   you get a `privateIP` object based on its private IP
     *   address (for example, 10.0.3.3) and not its OCID. For comparison,
     *   {@link #getPrivateIp(GetPrivateIpRequest, Consumer, Consumer) getPrivateIp}
     *   requires the OCID.
     * <p>
     * If you're listing all the private IPs associated with a given subnet
     * or VNIC, the response includes both primary and secondary private IPs.
     * <p>
     * If you are an Oracle Cloud VMware Solution customer and have VLANs
     * in your VCN, you can filter the list by VLAN OCID. See {@link Vlan}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateIpsResponse> listPrivateIps(
            ListPrivateIpsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPrivateIpsRequest, ListPrivateIpsResponse>
                    handler);

    /**
     * Lists the PublicIpPool objects in the specified compartment.
     * You can filter the list by using query parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPublicIpPoolsResponse> listPublicIpPools(
            ListPublicIpPoolsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPublicIpPoolsRequest, ListPublicIpPoolsResponse>
                    handler);

    /**
     * Lists the {@link PublicIp} objects
     * in the specified compartment. You can filter the list by using query parameters.
     * <p>
     * To list your reserved public IPs:
     *   * Set `scope` = `REGION`  (required)
     *   * Leave the `availabilityDomain` parameter empty
     *   * Set `lifetime` = `RESERVED`
     * <p>
     * To list the ephemeral public IPs assigned to a regional entity such as a NAT gateway:
     *   * Set `scope` = `REGION`  (required)
     *   * Leave the `availabilityDomain` parameter empty
     *   * Set `lifetime` = `EPHEMERAL`
     * <p>
     * To list the ephemeral public IPs assigned to private IPs:
     *   * Set `scope` = `AVAILABILITY_DOMAIN` (required)
     *   * Set the `availabilityDomain` parameter to the desired availability domain (required)
     *   * Set `lifetime` = `EPHEMERAL`
     * <p>
     **Note:** An ephemeral public IP assigned to a private IP
     * is always in the same availability domain and compartment as the private IP.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPublicIpsResponse> listPublicIps(
            ListPublicIpsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPublicIpsRequest, ListPublicIpsResponse>
                    handler);

    /**
     * Lists the remote peering connections (RPCs) for the specified DRG and compartment
     * (the RPC's compartment).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRemotePeeringConnectionsResponse> listRemotePeeringConnections(
            ListRemotePeeringConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRemotePeeringConnectionsRequest,
                            ListRemotePeeringConnectionsResponse>
                    handler);

    /**
     * Lists the route tables in the specified VCN and specified compartment.
     * If the VCN ID is not provided, then the list includes the route tables from all VCNs in the specified compartment.
     * The response includes the default route table that automatically comes with
     * each VCN in the specified compartment, plus any route tables you've created.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRouteTablesResponse> listRouteTables(
            ListRouteTablesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRouteTablesRequest, ListRouteTablesResponse>
                    handler);

    /**
     * Lists the security lists in the specified VCN and compartment.
     * If the VCN ID is not provided, then the list includes the security lists from all VCNs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSecurityListsResponse> listSecurityLists(
            ListSecurityListsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSecurityListsRequest, ListSecurityListsResponse>
                    handler);

    /**
     * Lists the service gateways in the specified compartment. You may optionally specify a VCN OCID
     * to filter the results by VCN.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceGatewaysResponse> listServiceGateways(
            ListServiceGatewaysRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListServiceGatewaysRequest, ListServiceGatewaysResponse>
                    handler);

    /**
     * Lists the available {@link Service} objects that you can enable for a
     * service gateway in this region.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServicesResponse> listServices(
            ListServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListServicesRequest, ListServicesResponse>
                    handler);

    /**
     * Lists the subnets in the specified VCN and the specified compartment.
     * If the VCN ID is not provided, then the list includes the subnets from all VCNs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSubnetsResponse> listSubnets(
            ListSubnetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSubnetsRequest, ListSubnetsResponse> handler);

    /**
     * Lists the virtual cloud networks (VCNs) in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVcnsResponse> listVcns(
            ListVcnsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVcnsRequest, ListVcnsResponse> handler);

    /**
     * The deprecated operation lists available bandwidth levels for virtual circuits. For the compartment ID, provide the OCID of your tenancy (the root compartment).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualCircuitBandwidthShapesResponse>
            listVirtualCircuitBandwidthShapes(
                    ListVirtualCircuitBandwidthShapesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualCircuitBandwidthShapesRequest,
                                    ListVirtualCircuitBandwidthShapesResponse>
                            handler);

    /**
     * Lists the public IP prefixes and their details for the specified
     * public virtual circuit.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualCircuitPublicPrefixesResponse>
            listVirtualCircuitPublicPrefixes(
                    ListVirtualCircuitPublicPrefixesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListVirtualCircuitPublicPrefixesRequest,
                                    ListVirtualCircuitPublicPrefixesResponse>
                            handler);

    /**
     * Lists the virtual circuits in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVirtualCircuitsResponse> listVirtualCircuits(
            ListVirtualCircuitsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListVirtualCircuitsRequest, ListVirtualCircuitsResponse>
                    handler);

    /**
     * Lists the VLANs in the specified VCN and the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListVlansResponse> listVlans(
            ListVlansRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListVlansRequest, ListVlansResponse> handler);

    /**
     * Update a CIDR from a VCN. The new CIDR must maintain the following rules -
     * <p>
     * a. The CIDR provided is valid
     * b. The new CIDR range should not overlap with any existing CIDRs
     * c. The new CIDR should not exceed the max limit of CIDRs per VCNs
     * d. The new CIDR range does not overlap with any peered VCNs
     * e. The new CIDR should overlap with any existing route rule within a VCN
     * f. All existing subnet CIDRs are subsets of the updated CIDR ranges
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ModifyVcnCidrResponse> modifyVcnCidr(
            ModifyVcnCidrRequest request,
            com.oracle.bmc.responses.AsyncHandler<ModifyVcnCidrRequest, ModifyVcnCidrResponse>
                    handler);

    /**
     * Removes one or more security rules from the specified network security group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveNetworkSecurityGroupSecurityRulesResponse>
            removeNetworkSecurityGroupSecurityRules(
                    RemoveNetworkSecurityGroupSecurityRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveNetworkSecurityGroupSecurityRulesRequest,
                                    RemoveNetworkSecurityGroupSecurityRulesResponse>
                            handler);

    /**
     * Removes a Cidr from the referenced Public IP Pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemovePublicIpPoolCapacityResponse> removePublicIpPoolCapacity(
            RemovePublicIpPoolCapacityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemovePublicIpPoolCapacityRequest, RemovePublicIpPoolCapacityResponse>
                    handler);

    /**
     * Remove a CIDR from a VCN. The CIDR being removed should not have
     * any resources allocated from it.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveVcnCidrResponse> removeVcnCidr(
            RemoveVcnCidrRequest request,
            com.oracle.bmc.responses.AsyncHandler<RemoveVcnCidrRequest, RemoveVcnCidrResponse>
                    handler);

    /**
     * Updates the specified Byoip Range.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateByoipRangeResponse> updateByoipRange(
            UpdateByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateByoipRangeRequest, UpdateByoipRangeResponse>
                    handler);

    /**
     * Updates the specified CPE's display name or tags.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCpeResponse> updateCpe(
            UpdateCpeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateCpeRequest, UpdateCpeResponse> handler);

    /**
     * Updates the specified cross-connect.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCrossConnectResponse> updateCrossConnect(
            UpdateCrossConnectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCrossConnectRequest, UpdateCrossConnectResponse>
                    handler);

    /**
     * Updates the specified cross-connect group's display name.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCrossConnectGroupResponse> updateCrossConnectGroup(
            UpdateCrossConnectGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCrossConnectGroupRequest, UpdateCrossConnectGroupResponse>
                    handler);

    /**
     * Updates the specified set of DHCP options. You can update the display name or the options
     * themselves. Avoid entering confidential information.
     * <p>
     * Note that the `options` object you provide replaces the entire existing set of options.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDhcpOptionsResponse> updateDhcpOptions(
            UpdateDhcpOptionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse>
                    handler);

    /**
     * Updates the specified DRG's display name or tags. Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrgResponse> updateDrg(
            UpdateDrgRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDrgRequest, UpdateDrgResponse> handler);

    /**
     * Updates the display name for the specified `DrgAttachment`.
     * Avoid entering confidential information.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrgAttachmentResponse> updateDrgAttachment(
            UpdateDrgAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse>
                    handler);

    /**
     * Updates the specified IPSec connection.
     * <p>
     * To update an individual IPSec tunnel's attributes, use
     * {@link #updateIPSecConnectionTunnel(UpdateIPSecConnectionTunnelRequest, Consumer, Consumer) updateIPSecConnectionTunnel}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIPSecConnectionResponse> updateIPSecConnection(
            UpdateIPSecConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse>
                    handler);

    /**
     * Updates the specified tunnel. This operation lets you change tunnel attributes such as the
     * routing type (BGP dynamic routing or static routing). Here are some important notes:
     * <p>
     * If you change the tunnel's routing type or BGP session configuration, the tunnel will go
     *     down while it's reprovisioned.
     * <p>
     * If you want to switch the tunnel's `routing` from `STATIC` to `BGP`, make sure the tunnel's
     *     BGP session configuration attributes have been set ({@link #bgpSessionInfo(BgpSessionInfoRequest, Consumer, Consumer) bgpSessionInfo}).
     * <p>
     * If you want to switch the tunnel's `routing` from `BGP` to `STATIC`, make sure the
     *     {@link IPSecConnection} already has at least one valid CIDR
     *     static route.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIPSecConnectionTunnelResponse> updateIPSecConnectionTunnel(
            UpdateIPSecConnectionTunnelRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIPSecConnectionTunnelRequest, UpdateIPSecConnectionTunnelResponse>
                    handler);

    /**
     * Updates the shared secret (pre-shared key) for the specified tunnel.
     * <p>
     **Important:** If you change the shared secret, the tunnel will go down while it's reprovisioned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIPSecConnectionTunnelSharedSecretResponse>
            updateIPSecConnectionTunnelSharedSecret(
                    UpdateIPSecConnectionTunnelSharedSecretRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateIPSecConnectionTunnelSharedSecretRequest,
                                    UpdateIPSecConnectionTunnelSharedSecretResponse>
                            handler);

    /**
     * Updates the specified internet gateway. You can disable/enable it, or change its display name
     * or tags. Avoid entering confidential information.
     * <p>
     * If the gateway is disabled, that means no traffic will flow to/from the internet even if there's
     * a route rule that enables that traffic.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateInternetGatewayResponse> updateInternetGateway(
            UpdateInternetGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateInternetGatewayRequest, UpdateInternetGatewayResponse>
                    handler);

    /**
     * Updates the specified IPv6. You must specify the object's OCID.
     * Use this operation if you want to:
     * <p>
     * Move an IPv6 to a different VNIC in the same subnet.
     *   * Enable/disable internet access for an IPv6.
     *   * Change the display name for an IPv6.
     *   * Update resource tags for an IPv6.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateIpv6Response> updateIpv6(
            UpdateIpv6Request request,
            com.oracle.bmc.responses.AsyncHandler<UpdateIpv6Request, UpdateIpv6Response> handler);

    /**
     * Updates the specified local peering gateway (LPG).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLocalPeeringGatewayResponse> updateLocalPeeringGateway(
            UpdateLocalPeeringGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLocalPeeringGatewayRequest, UpdateLocalPeeringGatewayResponse>
                    handler);

    /**
     * Updates the specified NAT gateway.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNatGatewayResponse> updateNatGateway(
            UpdateNatGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateNatGatewayRequest, UpdateNatGatewayResponse>
                    handler);

    /**
     * Updates the specified network security group.
     * <p>
     * To add or remove an existing VNIC from the group, use
     * {@link #updateVnic(UpdateVnicRequest, Consumer, Consumer) updateVnic}.
     * <p>
     * To add a VNIC to the group *when you create the VNIC*, specify the NSG's OCID during creation.
     * For example, see the `nsgIds` attribute in {@link #createVnicDetails(CreateVnicDetailsRequest, Consumer, Consumer) createVnicDetails}.
     * <p>
     * To add or remove security rules from the group, use
     * {@link #addNetworkSecurityGroupSecurityRules(AddNetworkSecurityGroupSecurityRulesRequest, Consumer, Consumer) addNetworkSecurityGroupSecurityRules}
     * or
     * {@link #removeNetworkSecurityGroupSecurityRules(RemoveNetworkSecurityGroupSecurityRulesRequest, Consumer, Consumer) removeNetworkSecurityGroupSecurityRules}.
     * <p>
     * To edit the contents of existing security rules in the group, use
     * {@link #updateNetworkSecurityGroupSecurityRules(UpdateNetworkSecurityGroupSecurityRulesRequest, Consumer, Consumer) updateNetworkSecurityGroupSecurityRules}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkSecurityGroupResponse> updateNetworkSecurityGroup(
            UpdateNetworkSecurityGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateNetworkSecurityGroupRequest, UpdateNetworkSecurityGroupResponse>
                    handler);

    /**
     * Updates one or more security rules in the specified network security group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNetworkSecurityGroupSecurityRulesResponse>
            updateNetworkSecurityGroupSecurityRules(
                    UpdateNetworkSecurityGroupSecurityRulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateNetworkSecurityGroupSecurityRulesRequest,
                                    UpdateNetworkSecurityGroupSecurityRulesResponse>
                            handler);

    /**
     * Updates the specified private IP. You must specify the object's OCID.
     * Use this operation if you want to:
     * <p>
     * - Move a secondary private IP to a different VNIC in the same subnet.
     *   - Change the display name for a secondary private IP.
     *   - Change the hostname for a secondary private IP.
     * <p>
     * This operation cannot be used with primary private IPs.
     * To update the hostname for the primary IP on a VNIC, use
     * {@link #updateVnic(UpdateVnicRequest, Consumer, Consumer) updateVnic}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateIpResponse> updatePrivateIp(
            UpdatePrivateIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePrivateIpRequest, UpdatePrivateIpResponse>
                    handler);

    /**
     * Updates the specified public IP. You must specify the object's OCID. Use this operation if you want to:
     * <p>
     * Assign a reserved public IP in your pool to a private IP.
     * * Move a reserved public IP to a different private IP.
     * * Unassign a reserved public IP from a private IP (which returns it to your pool
     * of reserved public IPs).
     * * Change the display name or tags for a public IP.
     * <p>
     * Assigning, moving, and unassigning a reserved public IP are asynchronous
     * operations. Poll the public IP's `lifecycleState` to determine if the operation
     * succeeded.
     * <p>
     **Note:** When moving a reserved public IP, the target private IP
     * must not already have a public IP with `lifecycleState` = ASSIGNING or ASSIGNED. If it
     * does, an error is returned. Also, the initial unassignment from the original
     * private IP always succeeds, but the assignment to the target private IP is asynchronous and
     * could fail silently (for example, if the target private IP is deleted or has a different public IP
     * assigned to it in the interim). If that occurs, the public IP remains unassigned and its
     * `lifecycleState` switches to AVAILABLE (it is not reassigned to its original private IP).
     * You must poll the public IP's `lifecycleState` to determine if the move succeeded.
     * <p>
     * Regarding ephemeral public IPs:
     * <p>
     * If you want to assign an ephemeral public IP to a primary private IP, use
     * {@link #createPublicIp(CreatePublicIpRequest, Consumer, Consumer) createPublicIp}.
     * * You can't move an ephemeral public IP to a different private IP.
     * * If you want to unassign an ephemeral public IP from its private IP, use
     * {@link #deletePublicIp(DeletePublicIpRequest, Consumer, Consumer) deletePublicIp}, which
     * unassigns and deletes the ephemeral public IP.
     * <p>
     **Note:** If a public IP is assigned to a secondary private
     * IP (see {@link PrivateIp}), and you move that secondary
     * private IP to another VNIC, the public IP moves with it.
     * <p>
     **Note:** There's a limit to the number of {@link PublicIp}
     * a VNIC or instance can have. If you try to move a reserved public IP
     * to a VNIC or instance that has already reached its public IP limit, an error is
     * returned. For information about the public IP limits, see
     * [Public IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingpublicIPs.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePublicIpResponse> updatePublicIp(
            UpdatePublicIpRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePublicIpRequest, UpdatePublicIpResponse>
                    handler);

    /**
     * Updates the specified Public Ip Pool.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePublicIpPoolResponse> updatePublicIpPool(
            UpdatePublicIpPoolRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePublicIpPoolRequest, UpdatePublicIpPoolResponse>
                    handler);

    /**
     * Updates the specified remote peering connection (RPC).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRemotePeeringConnectionResponse>
            updateRemotePeeringConnection(
                    UpdateRemotePeeringConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateRemotePeeringConnectionRequest,
                                    UpdateRemotePeeringConnectionResponse>
                            handler);

    /**
     * Updates the specified route table's display name or route rules.
     * Avoid entering confidential information.
     * <p>
     * Note that the `routeRules` object you provide replaces the entire existing set of rules.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRouteTableResponse> updateRouteTable(
            UpdateRouteTableRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRouteTableRequest, UpdateRouteTableResponse>
                    handler);

    /**
     * Updates the specified security list's display name or rules.
     * Avoid entering confidential information.
     * <p>
     * Note that the `egressSecurityRules` or `ingressSecurityRules` objects you provide replace the entire
     * existing objects.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSecurityListResponse> updateSecurityList(
            UpdateSecurityListRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSecurityListRequest, UpdateSecurityListResponse>
                    handler);

    /**
     * Updates the specified service gateway. The information you provide overwrites the existing
     * attributes of the gateway.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateServiceGatewayResponse> updateServiceGateway(
            UpdateServiceGatewayRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceGatewayRequest, UpdateServiceGatewayResponse>
                    handler);

    /**
     * Updates the specified subnet.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSubnetResponse> updateSubnet(
            UpdateSubnetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateSubnetRequest, UpdateSubnetResponse>
                    handler);

    /**
     * Creates or updates the set of CPE configuration answers for the specified tunnel.
     * The answers correlate to the questions that are specific to the CPE device type (see the
     * `parameters` attribute of {@link CpeDeviceShapeDetail}).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTunnelCpeDeviceConfigResponse> updateTunnelCpeDeviceConfig(
            UpdateTunnelCpeDeviceConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTunnelCpeDeviceConfigRequest, UpdateTunnelCpeDeviceConfigResponse>
                    handler);

    /**
     * Updates the specified VCN.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVcnResponse> updateVcn(
            UpdateVcnRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVcnRequest, UpdateVcnResponse> handler);

    /**
     * Updates the specified virtual circuit. This can be called by
     * either the customer who owns the virtual circuit, or the
     * provider (when provisioning or de-provisioning the virtual
     * circuit from their end). The documentation for
     * {@link #updateVirtualCircuitDetails(UpdateVirtualCircuitDetailsRequest, Consumer, Consumer) updateVirtualCircuitDetails}
     * indicates who can update each property of the virtual circuit.
     * <p>
     **Important:** If the virtual circuit is working and in the
     * PROVISIONED state, updating any of the network-related properties
     * (such as the DRG being used, the BGP ASN, and so on) will cause the virtual
     * circuit's state to switch to PROVISIONING and the related BGP
     * session to go down. After Oracle re-provisions the virtual circuit,
     * its state will return to PROVISIONED. Make sure you confirm that
     * the associated BGP session is back up. For more information
     * about the various states and how to test connectivity, see
     * [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * To change the list of public IP prefixes for a public virtual circuit,
     * use {@link #bulkAddVirtualCircuitPublicPrefixes(BulkAddVirtualCircuitPublicPrefixesRequest, Consumer, Consumer) bulkAddVirtualCircuitPublicPrefixes}
     * and
     * {@link #bulkDeleteVirtualCircuitPublicPrefixes(BulkDeleteVirtualCircuitPublicPrefixesRequest, Consumer, Consumer) bulkDeleteVirtualCircuitPublicPrefixes}.
     * Updating the list of prefixes does NOT cause the BGP session to go down. However,
     * Oracle must verify the customer's ownership of each added prefix before
     * traffic for that prefix will flow across the virtual circuit.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVirtualCircuitResponse> updateVirtualCircuit(
            UpdateVirtualCircuitRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateVirtualCircuitRequest, UpdateVirtualCircuitResponse>
                    handler);

    /**
     * Updates the specified VLAN. This could result in changes to all
     * the VNICs in the VLAN, which can take time. During that transition
     * period, the VLAN will be in the UPDATING state.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVlanResponse> updateVlan(
            UpdateVlanRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVlanRequest, UpdateVlanResponse> handler);

    /**
     * Updates the specified VNIC.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateVnicResponse> updateVnic(
            UpdateVnicRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateVnicRequest, UpdateVnicResponse> handler);

    /**
     * submit the Byoip Range for validation. This presumes the user has
     * updated their IP registry record in accordance to validation requirements
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateByoipRangeResponse> validateByoipRange(
            ValidateByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateByoipRangeRequest, ValidateByoipRangeResponse>
                    handler);

    /**
     * stop route advertisements for the Byoip Range prefix.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<WithdrawByoipRangeResponse> withdrawByoipRange(
            WithdrawByoipRangeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            WithdrawByoipRangeRequest, WithdrawByoipRangeResponse>
                    handler);
}
