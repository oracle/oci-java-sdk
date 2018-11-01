/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface VirtualNetworkAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

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
     * Enables the specified service on the specified gateway. In other words, enables the service
     * gateway to send traffic to the specified service. You must also set up a route rule with the
     * service's `cidrBlock` as the rule's destination CIDR and the gateway as the rule's target.
     * See {@link RouteTable}.
     * <p>
     **Note:** The `AttachServiceId` operation is an easy way to enable an individual service on
     * the service gateway. Compare it with
     * {@link #updateServiceGateway(UpdateServiceGatewayRequest, Consumer, Consumer) updateServiceGateway}, which also
     * lets you enable an individual service. However, with `UpdateServiceGateway`, you must specify
     * the *entire* list of services you want enabled on the service gateway.
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
     * Connects this local peering gateway (LPG) to another one in the same region.
     * <p>
     * This operation must be called by the VCN administrator who is designated as
     * the *requestor* in the peering relationship. The *acceptor* must implement
     * an Identity and Access Management (IAM) policy that gives the requestor permission
     * to connect to LPGs in the acceptor's compartment. Without that permission, this
     * operation will fail. For more information, see
     * [VCN Peering](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/VCNpeering.htm).
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
     * [VCN Peering](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/VCNpeering.htm).
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
     * Creates a new virtual customer-premises equipment (CPE) object in the specified compartment. For
     * more information, see [IPSec VPNs](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPsec.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the CPE to reside. Notice that the CPE doesn't have to be in the same compartment as the IPSec
     * connection or other Networking Service components. If you're not sure which compartment to
     * use, put the CPE in the same compartment as the DRG. For more information about
     * compartments and access control, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must provide the public IP address of your on-premises router. See
     * [Configuring Your On-Premises Router for an IPSec VPN](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/configuringCPE.htm).
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
     * [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the
     * compartment where you want the cross-connect to reside. If you're
     * not sure which compartment to use, put the cross-connect in the
     * same compartment with your VCN. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the
     * compartment where you want the cross-connect group to reside. If you're
     * not sure which compartment to use, put the cross-connect group in the
     * same compartment with your VCN. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * see [Dynamic Routing Gateways (DRGs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDRGs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the DRG to reside. Notice that the DRG doesn't have to be in the same compartment as the VCN,
     * the DRG attachment, or other Networking Service components. If you're not sure which compartment
     * to use, put the DRG in the same compartment as the VCN. For more information about compartments
     * and access control, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * [Dynamic Routing Gateways (DRGs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDRGs.htm).
     * <p>
     * You may optionally specify a *display name* for the attachment, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * For the purposes of access control, the DRG attachment is automatically placed into the same compartment
     * as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
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
     * [IPSec VPNs](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPsec.htm).
     * <p>
     * In the request, you must include at least one static route to the CPE object (you're allowed a maximum
     * of 10). For example: 10.0.8.0/16.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the
     * IPSec connection to reside. Notice that the IPSec connection doesn't have to be in the same compartment
     * as the DRG, CPE, or other Networking Service components. If you're not sure which compartment to
     * use, put the IPSec connection in the same compartment as the DRG. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the IPSec connection, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * After creating the IPSec connection, you need to configure your on-premises router
     * with tunnel-specific information returned by
     * {@link #getIPSecConnectionDeviceConfig(GetIPSecConnectionDeviceConfigRequest, Consumer, Consumer) getIPSecConnectionDeviceConfig}.
     * For each tunnel, that operation gives you the IP address of Oracle's VPN headend and the shared secret
     * (that is, the pre-shared key). For more information, see
     * [Configuring Your On-Premises Router for an IPSec VPN](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/configuringCPE.htm).
     * <p>
     * To get the status of the tunnels (whether they're up or down), use
     * {@link #getIPSecConnectionDeviceStatus(GetIPSecConnectionDeviceStatusRequest, Consumer, Consumer) getIPSecConnectionDeviceStatus}.
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
     * [Access to the Internet](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIGs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the Internet
     * Gateway to reside. Notice that the internet gateway doesn't have to be in the same compartment as the VCN or
     * other Networking Service components. If you're not sure which compartment to use, put the Internet
     * Gateway in the same compartment with the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * Creates a secondary private IP for the specified VNIC.
     * For more information about secondary private IPs, see
     * [IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPaddresses.htm).
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
     * [Public IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingpublicIPs.htm).
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
     * [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm). For general information about route
     * tables in your VCN and the types of targets you can use in route rules,
     * see [Route Tables](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the route
     * table to reside. Notice that the route table doesn't have to be in the same compartment as the VCN, subnets,
     * or other Networking Service components. If you're not sure which compartment to use, put the route
     * table in the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * about security lists, see [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/securitylists.htm).
     * For information on the number of rules you can have in a security list, see
     * [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the security
     * list to reside. Notice that the security list doesn't have to be in the same compartment as the VCN, subnets,
     * or other Networking Service components. If you're not sure which compartment to use, put the security
     * list in the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
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
     * For more information, see [VCNs and Subnets](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVCNs.htm).
     * For information on the number of subnets you can have in a VCN, see
     * [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the subnet
     * to reside. Notice that the subnet doesn't have to be in the same compartment as the VCN, route tables, or
     * other Networking Service components. If you're not sure which compartment to use, put the subnet in
     * the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs,
     * see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally associate a route table with the subnet. If you don't, the subnet will use the
     * VCN's default route table. For more information about route tables, see
     * [Route Tables](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm).
     * <p>
     * You may optionally associate a security list with the subnet. If you don't, the subnet will use the
     * VCN's default security list. For more information about security lists, see
     * [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/securitylists.htm).
     * <p>
     * You may optionally associate a set of DHCP options with the subnet. If you don't, the subnet will use the
     * VCN's default set. For more information about DHCP options, see
     * [DHCP Options](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDHCP.htm).
     * <p>
     * You may optionally specify a *display name* for the subnet, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * You can also add a DNS label for the subnet, which is required if you want the Internet and
     * VCN Resolver to resolve hostnames for instances in the subnet. For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
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
     * [VCNs and Subnets](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVCNs.htm).
     * <p>
     * For the VCN you must specify a single, contiguous IPv4 CIDR block. Oracle recommends using one of the
     * private IP address ranges specified in [RFC 1918](https://tools.ietf.org/html/rfc1918) (10.0.0.0/8,
     * 172.16/12, and 192.168/16). Example: 172.16.0.0/16. The CIDR block can range from /16 to /30, and it
     * must not overlap with your on-premises network. You can't change the size of the VCN after creation.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the VCN to
     * reside. Consult an Oracle Cloud Infrastructure administrator in your organization if you're not sure which
     * compartment to use. Notice that the VCN doesn't have to be in the same compartment as the subnets or other
     * Networking Service components. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the VCN, otherwise a default is provided. It does not have to
     * be unique, and you can change it. Avoid entering confidential information.
     * <p>
     * You can also add a DNS label for the VCN, which is required if you want the instances to use the
     * Interent and VCN Resolver option for DNS in the VCN. For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * The VCN automatically comes with a default route table, default security list, and default set of DHCP options.
     * The OCID for each is returned in the response. You can't delete these default objects, but you can change their
     * contents (that is, change the route rules, security list rules, and so on).
     * <p>
     * The VCN and subnets you create are not accessible until you attach an internet gateway or set up an IPSec VPN
     * or FastConnect. For more information, see
     * [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm).
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
     * [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the
     * compartment where you want the virtual circuit to reside. If you're
     * not sure which compartment to use, put the virtual circuit in the
     * same compartment with the DRG it's using. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the virtual circuit.
     * It does not have to be unique, and you can change it. Avoid entering confidential information.
     * <p>
     **Important:** When creating a virtual circuit, you specify a DRG for
     * the traffic to flow through. Make sure you attach the DRG to your
     * VCN and confirm the VCN's routing sends traffic to the DRG. Otherwise
     * traffic will not flow. For more information, see
     * [Route Tables](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm).
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
     * Unassigns and deletes the specified private IP. You must
     * specify the object's OCID. The private IP address is returned to
     * the subnet's pool of available addresses.
     * <p>
     * This operation cannot be used with primary private IPs, which are
     * automatically unassigned and deleted when the VNIC is terminated.
     * <p>
     **Important:** If a secondary private IP is the
     * [target of a route rule](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm#privateip),
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
     * Disables the specified service on the specified gateway. In other words, stops the service
     * gateway from sending traffic to the specified service. You do not need to remove any route
     * rules that specify this service's `cidrBlock` as the destination CIDR. However, consider
     * removing the rules if your intent is to permanently disable use of the service through this
     * service gateway.
     * <p>
     **Note:** The `DetachServiceId` operation is an easy way to disable an individual service on
     * the service gateway. Compare it with
     * {@link #updateServiceGateway(UpdateServiceGatewayRequest, Consumer, Consumer) updateServiceGateway}, which also
     * lets you disable an individual service. However, with `UpdateServiceGateway`, you must specify
     * the *entire* list of services you want enabled on the service gateway. `UpdateServiceGateway`
     * also lets you block all traffic through the service gateway without having to disable each of
     * the individual services.
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
     * Gets the specified provider service.
     * For more information, see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
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
     * Gets the specified IPSec connection's basic information, including the static routes for the
     * on-premises router. If you want the status of the connection (whether it's up or down), use
     * {@link #getIPSecConnectionDeviceStatus(GetIPSecConnectionDeviceStatusRequest, Consumer, Consumer) getIPSecConnectionDeviceStatus}.
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
     * Gets the configuration information for the specified IPSec connection. For each tunnel, the
     * response includes the IP address of Oracle's VPN headend and the shared secret.
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
     * Gets the status of the specified IPSec connection (whether it's up or down).
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
     * with the public IP address (for example, 129.146.2.1).
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
     * Gets the public IP based on the public IP address (for example, 129.146.2.1).
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
     * Gets the specified service's information.
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
     * For more information, see [VCN Peering](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/VCNpeering.htm).
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
     * For more information, see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
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
     * For more information about virtual circuits, see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
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
     * Lists the local peering gateways (LPGs) for the specified VCN and compartment
     * (the LPG's compartment).
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
     * Lists the route tables in the specified VCN and specified compartment. The response
     * includes the default route table that automatically comes with each VCN, plus any route tables
     * you've created.
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
     * Lists the available services that you can access through a service gateway in this region.
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
     * Updates the display name or tags for the specified IPSec connection.
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
    java.util.concurrent.Future<UpdateIPSecConnectionResponse> updateIPSecConnection(
            UpdateIPSecConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse>
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
     **Note:** If a public IP (either ephemeral or reserved) is assigned to a secondary private
     * IP (see {@link PrivateIp}), and you move that secondary
     * private IP to another VNIC, the public IP moves with it.
     * <p>
     **Note:** There's a limit to the number of {@link PublicIp}
     * a VNIC or instance can have. If you try to move a reserved public IP
     * to a VNIC or instance that has already reached its public IP limit, an error is
     * returned. For information about the public IP limits, see
     * [Public IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingpublicIPs.htm).
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
     * [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
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
}
