/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;
import com.oracle.bmc.workrequests.WorkRequest;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface VirtualNetwork extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * Adds the specified {@link Service} to the list of enabled
     * `Service` objects for the specified gateway. You must also set up a route rule with the
     * `cidrBlock` of the `Service` as the rule's destination and the service gateway as the rule's
     * target. See {@link RouteTable}.
     * <p>
     **Note:** The `AttachServiceId` operation is an easy way to add an individual `Service` to
     * the service gateway. Compare it with
     * {@link #updateServiceGateway(UpdateServiceGatewayRequest) updateServiceGateway}, which replaces
     * the entire existing list of enabled `Service` objects with the list that you provide in the
     * `Update` call.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AttachServiceIdResponse attachServiceId(AttachServiceIdRequest request);

    /**
     * Adds one or more customer public IP prefixes to the specified public virtual circuit.
     * Use this operation (and not {@link #updateVirtualCircuit(UpdateVirtualCircuitRequest) updateVirtualCircuit})
     * to add prefixes to the virtual circuit. Oracle must verify the customer's ownership
     * of each prefix before traffic for that prefix will flow across the virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    BulkAddVirtualCircuitPublicPrefixesResponse bulkAddVirtualCircuitPublicPrefixes(
            BulkAddVirtualCircuitPublicPrefixesRequest request);

    /**
     * Removes one or more customer public IP prefixes from the specified public virtual circuit.
     * Use this operation (and not {@link #updateVirtualCircuit(UpdateVirtualCircuitRequest) updateVirtualCircuit})
     * to remove prefixes from the virtual circuit. When the virtual circuit's state switches
     * back to PROVISIONED, Oracle stops advertising the specified prefixes across the connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    BulkDeleteVirtualCircuitPublicPrefixesResponse bulkDeleteVirtualCircuitPublicPrefixes(
            BulkDeleteVirtualCircuitPublicPrefixesRequest request);

    /**
     * Moves a service gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeServiceGatewayCompartmentResponse changeServiceGatewayCompartment(
            ChangeServiceGatewayCompartmentRequest request);

    /**
     * Moves a NAT gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeNatGatewayCompartmentResponse changeNatGatewayCompartment(
            ChangeNatGatewayCompartmentRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ConnectLocalPeeringGatewaysResponse connectLocalPeeringGateways(
            ConnectLocalPeeringGatewaysRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ConnectRemotePeeringConnectionsResponse connectRemotePeeringConnections(
            ConnectRemotePeeringConnectionsRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCpeResponse createCpe(CreateCpeRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCrossConnectResponse createCrossConnect(CreateCrossConnectRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCrossConnectGroupResponse createCrossConnectGroup(CreateCrossConnectGroupRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDhcpOptionsResponse createDhcpOptions(CreateDhcpOptionsRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDrgResponse createDrg(CreateDrgRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDrgAttachmentResponse createDrgAttachment(CreateDrgAttachmentRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateIPSecConnectionResponse createIPSecConnection(CreateIPSecConnectionRequest request);

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
     * {@link #updateRouteTable(UpdateRouteTableRequest) updateRouteTable}.
     * <p>
     * You must specify whether the internet gateway is enabled when you create it. If it's disabled, that means no
     * traffic will flow to/from the internet even if there's a route rule that enables that traffic. You can later
     * use {@link #updateInternetGateway(UpdateInternetGatewayRequest) updateInternetGateway} to easily disable/enable
     * the gateway without changing the route rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateInternetGatewayResponse createInternetGateway(CreateInternetGatewayRequest request);

    /**
     * Creates a new local peering gateway (LPG) for the specified VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateLocalPeeringGatewayResponse createLocalPeeringGateway(
            CreateLocalPeeringGatewayRequest request);

    /**
     * Creates a new NAT gateway for the specified VCN. You must also set up a route rule with the
     * NAT gateway as the rule's target. See {@link RouteTable}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request);

    /**
     * Creates a secondary private IP for the specified VNIC.
     * For more information about secondary private IPs, see
     * [IP Addresses](https://docs.cloud.oracle.com/Content/Network/Tasks/managingIPaddresses.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePrivateIpResponse createPrivateIp(CreatePrivateIpRequest request);

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
     * {@link #updatePublicIp(UpdatePublicIpRequest) updatePublicIp}.
     * <p>
     **Note:** When assigning a public IP to a private IP, the private IP must not already have
     * a public IP with `lifecycleState` = ASSIGNING or ASSIGNED. If it does, an error is returned.
     * <p>
     * Also, for reserved public IPs, the optional assignment part of this operation is
     * asynchronous. Poll the public IP's `lifecycleState` to determine if the assignment
     * succeeded.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePublicIpResponse createPublicIp(CreatePublicIpRequest request);

    /**
     * Creates a new remote peering connection (RPC) for the specified DRG.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRemotePeeringConnectionResponse createRemotePeeringConnection(
            CreateRemotePeeringConnectionRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSecurityListResponse createSecurityList(CreateSecurityListRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateServiceGatewayResponse createServiceGateway(CreateServiceGatewayRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSubnetResponse createSubnet(CreateSubnetRequest request);

    /**
     * Creates a new virtual cloud network (VCN). For more information, see
     * [VCNs and Subnets](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVCNs.htm).
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVcnResponse createVcn(CreateVcnRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVirtualCircuitResponse createVirtualCircuit(CreateVirtualCircuitRequest request);

    /**
     * Deletes the specified CPE object. The CPE must not be connected to a DRG. This is an asynchronous
     * operation. The CPE's `lifecycleState` will change to TERMINATING temporarily until the CPE is completely
     * removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCpeResponse deleteCpe(DeleteCpeRequest request);

    /**
     * Deletes the specified cross-connect. It must not be mapped to a
     * {@link VirtualCircuit}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCrossConnectResponse deleteCrossConnect(DeleteCrossConnectRequest request);

    /**
     * Deletes the specified cross-connect group. It must not contain any
     * cross-connects, and it cannot be mapped to a
     * {@link VirtualCircuit}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCrossConnectGroupResponse deleteCrossConnectGroup(DeleteCrossConnectGroupRequest request);

    /**
     * Deletes the specified set of DHCP options, but only if it's not associated with a subnet. You can't delete a
     * VCN's default set of DHCP options.
     * <p>
     * This is an asynchronous operation. The state of the set of options will switch to TERMINATING temporarily
     * until the set is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDhcpOptionsResponse deleteDhcpOptions(DeleteDhcpOptionsRequest request);

    /**
     * Deletes the specified DRG. The DRG must not be attached to a VCN or be connected to your on-premise
     * network. Also, there must not be a route table that lists the DRG as a target. This is an asynchronous
     * operation. The DRG's `lifecycleState` will change to TERMINATING temporarily until the DRG is completely
     * removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDrgResponse deleteDrg(DeleteDrgRequest request);

    /**
     * Detaches a DRG from a VCN by deleting the corresponding `DrgAttachment`. This is an asynchronous
     * operation. The attachment's `lifecycleState` will change to DETACHING temporarily until the attachment
     * is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDrgAttachmentResponse deleteDrgAttachment(DeleteDrgAttachmentRequest request);

    /**
     * Deletes the specified IPSec connection. If your goal is to disable the IPSec VPN between your VCN and
     * on-premises network, it's easiest to simply detach the DRG but keep all the IPSec VPN components intact.
     * If you were to delete all the components and then later need to create an IPSec VPN again, you would
     * need to configure your on-premises router again with the new information returned from
     * {@link #createIPSecConnection(CreateIPSecConnectionRequest) createIPSecConnection}.
     * <p>
     * This is an asynchronous operation. The connection's `lifecycleState` will change to TERMINATING temporarily
     * until the connection is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteIPSecConnectionResponse deleteIPSecConnection(DeleteIPSecConnectionRequest request);

    /**
     * Deletes the specified internet gateway. The internet gateway does not have to be disabled, but
     * there must not be a route table that lists it as a target.
     * <p>
     * This is an asynchronous operation. The gateway's `lifecycleState` will change to TERMINATING temporarily
     * until the gateway is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteInternetGatewayResponse deleteInternetGateway(DeleteInternetGatewayRequest request);

    /**
     * Deletes the specified local peering gateway (LPG).
     * <p>
     * This is an asynchronous operation; the local peering gateway's `lifecycleState` changes to TERMINATING temporarily
     * until the local peering gateway is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteLocalPeeringGatewayResponse deleteLocalPeeringGateway(
            DeleteLocalPeeringGatewayRequest request);

    /**
     * Deletes the specified NAT gateway. The NAT gateway does not have to be disabled, but there
     * must not be a route rule that lists the NAT gateway as a target.
     * <p>
     * This is an asynchronous operation. The NAT gateway's `lifecycleState` will change to
     * TERMINATING temporarily until the NAT gateway is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePrivateIpResponse deletePrivateIp(DeletePrivateIpRequest request);

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
     * {@link #updatePublicIp(UpdatePublicIpRequest) updatePublicIp}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePublicIpResponse deletePublicIp(DeletePublicIpRequest request);

    /**
     * Deletes the remote peering connection (RPC).
     * <p>
     * This is an asynchronous operation; the RPC's `lifecycleState` changes to TERMINATING temporarily
     * until the RPC is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteRemotePeeringConnectionResponse deleteRemotePeeringConnection(
            DeleteRemotePeeringConnectionRequest request);

    /**
     * Deletes the specified route table, but only if it's not associated with a subnet. You can't delete a
     * VCN's default route table.
     * <p>
     * This is an asynchronous operation. The route table's `lifecycleState` will change to TERMINATING temporarily
     * until the route table is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request);

    /**
     * Deletes the specified security list, but only if it's not associated with a subnet. You can't delete
     * a VCN's default security list.
     * <p>
     * This is an asynchronous operation. The security list's `lifecycleState` will change to TERMINATING temporarily
     * until the security list is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSecurityListResponse deleteSecurityList(DeleteSecurityListRequest request);

    /**
     * Deletes the specified service gateway. There must not be a route table that lists the service
     * gateway as a target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteServiceGatewayResponse deleteServiceGateway(DeleteServiceGatewayRequest request);

    /**
     * Deletes the specified subnet, but only if there are no instances in the subnet. This is an asynchronous
     * operation. The subnet's `lifecycleState` will change to TERMINATING temporarily. If there are any
     * instances in the subnet, the state will instead change back to AVAILABLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request);

    /**
     * Deletes the specified VCN. The VCN must be empty and have no attached gateways. This is an asynchronous
     * operation. The VCN's `lifecycleState` will change to TERMINATING temporarily until the VCN is completely
     * removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVcnResponse deleteVcn(DeleteVcnRequest request);

    /**
     * Deletes the specified virtual circuit.
     * <p>
     **Important:** If you're using FastConnect via a provider,
     * make sure to also terminate the connection with
     * the provider, or else the provider may continue to bill you.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVirtualCircuitResponse deleteVirtualCircuit(DeleteVirtualCircuitRequest request);

    /**
     * Removes the specified {@link Service} from the list of enabled
     * `Service` objects for the specified gateway. You do not need to remove any route
     * rules that specify this `Service` object's `cidrBlock` as the destination CIDR. However, consider
     * removing the rules if your intent is to permanently disable use of the `Service` through this
     * service gateway.
     * <p>
     **Note:** The `DetachServiceId` operation is an easy way to remove an individual `Service` from
     * the service gateway. Compare it with
     * {@link #updateServiceGateway(UpdateServiceGatewayRequest) updateServiceGateway}, which replaces
     * the entire existing list of enabled `Service` objects with the list that you provide in the
     * `Update` call. `UpdateServiceGateway` also lets you block all traffic through the service
     * gateway without having to remove each of the individual `Service` objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachServiceIdResponse detachServiceId(DetachServiceIdRequest request);

    /**
     * Gets the specified CPE's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCpeResponse getCpe(GetCpeRequest request);

    /**
     * Gets the specified cross-connect's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCrossConnectResponse getCrossConnect(GetCrossConnectRequest request);

    /**
     * Gets the specified cross-connect group's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCrossConnectGroupResponse getCrossConnectGroup(GetCrossConnectGroupRequest request);

    /**
     * Gets the Letter of Authority for the specified cross-connect.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCrossConnectLetterOfAuthorityResponse getCrossConnectLetterOfAuthority(
            GetCrossConnectLetterOfAuthorityRequest request);

    /**
     * Gets the status of the specified cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCrossConnectStatusResponse getCrossConnectStatus(GetCrossConnectStatusRequest request);

    /**
     * Gets the specified set of DHCP options.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDhcpOptionsResponse getDhcpOptions(GetDhcpOptionsRequest request);

    /**
     * Gets the specified DRG's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDrgResponse getDrg(GetDrgRequest request);

    /**
     * Gets the information for the specified `DrgAttachment`.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDrgAttachmentResponse getDrgAttachment(GetDrgAttachmentRequest request);

    /**
     * Gets the specified provider service.
     * For more information, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFastConnectProviderServiceResponse getFastConnectProviderService(
            GetFastConnectProviderServiceRequest request);

    /**
     * Gets the specified provider service key's information. Use this operation to validate a
     * provider service key. An invalid key returns a 404 error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFastConnectProviderServiceKeyResponse getFastConnectProviderServiceKey(
            GetFastConnectProviderServiceKeyRequest request);

    /**
     * Gets the specified IPSec connection's basic information, including the static routes for the
     * on-premises router. If you want the status of the connection (whether it's up or down), use
     * {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest) getIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionResponse getIPSecConnection(GetIPSecConnectionRequest request);

    /**
     * Deprecated. To get tunnel information, instead use:
     * <p>
     * {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest) getIPSecConnectionTunnel}
     * * {@link #getIPSecConnectionTunnelSharedSecret(GetIPSecConnectionTunnelSharedSecretRequest) getIPSecConnectionTunnelSharedSecret}
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionDeviceConfigResponse getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request);

    /**
     * Deprecated. To get the tunnel status, instead use
     * {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest) getIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionDeviceStatusResponse getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request);

    /**
     * Gets the specified tunnel's information. The resulting object does not include the tunnel's
     * shared secret (pre-shared key). To retrieve that, use
     * {@link #getIPSecConnectionTunnelSharedSecret(GetIPSecConnectionTunnelSharedSecretRequest) getIPSecConnectionTunnelSharedSecret}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionTunnelResponse getIPSecConnectionTunnel(
            GetIPSecConnectionTunnelRequest request);

    /**
     * Gets the specified tunnel's shared secret (pre-shared key). To get other information
     * about the tunnel, use {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest) getIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionTunnelSharedSecretResponse getIPSecConnectionTunnelSharedSecret(
            GetIPSecConnectionTunnelSharedSecretRequest request);

    /**
     * Gets the specified internet gateway's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInternetGatewayResponse getInternetGateway(GetInternetGatewayRequest request);

    /**
     * Gets the specified local peering gateway's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetLocalPeeringGatewayResponse getLocalPeeringGateway(GetLocalPeeringGatewayRequest request);

    /**
     * Gets the specified NAT gateway's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetNatGatewayResponse getNatGateway(GetNatGatewayRequest request);

    /**
     * Gets the specified private IP. You must specify the object's OCID.
     * Alternatively, you can get the object by using
     * {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps}
     * with the private IP address (for example, 10.0.3.3) and subnet OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPrivateIpResponse getPrivateIp(GetPrivateIpRequest request);

    /**
     * Gets the specified public IP. You must specify the object's OCID.
     * <p>
     * Alternatively, you can get the object by using {@link #getPublicIpByIpAddress(GetPublicIpByIpAddressRequest) getPublicIpByIpAddress}
     * with the public IP address (for example, 129.146.2.1).
     * <p>
     * Or you can use {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId}
     * with the OCID of the private IP that the public IP is assigned to.
     * <p>
     **Note:** If you're fetching a reserved public IP that is in the process of being
     * moved to a different private IP, the service returns the public IP object with
     * `lifecycleState` = ASSIGNING and `assignedEntityId` = OCID of the target private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPublicIpResponse getPublicIp(GetPublicIpRequest request);

    /**
     * Gets the public IP based on the public IP address (for example, 129.146.2.1).
     * <p>
     **Note:** If you're fetching a reserved public IP that is in the process of being
     * moved to a different private IP, the service returns the public IP object with
     * `lifecycleState` = ASSIGNING and `assignedEntityId` = OCID of the target private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPublicIpByIpAddressResponse getPublicIpByIpAddress(GetPublicIpByIpAddressRequest request);

    /**
     * Gets the public IP assigned to the specified private IP. You must specify the OCID
     * of the private IP. If no public IP is assigned, a 404 is returned.
     * <p>
     **Note:** If you're fetching a reserved public IP that is in the process of being
     * moved to a different private IP, and you provide the OCID of the original private
     * IP, this operation returns a 404. If you instead provide the OCID of the target
     * private IP, or if you instead call
     * {@link #getPublicIp(GetPublicIpRequest) getPublicIp} or
     * {@link #getPublicIpByIpAddress(GetPublicIpByIpAddressRequest) getPublicIpByIpAddress}, the
     * service returns the public IP object with `lifecycleState` = ASSIGNING and
     * `assignedEntityId` = OCID of the target private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPublicIpByPrivateIpIdResponse getPublicIpByPrivateIpId(
            GetPublicIpByPrivateIpIdRequest request);

    /**
     * Get the specified remote peering connection's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRemotePeeringConnectionResponse getRemotePeeringConnection(
            GetRemotePeeringConnectionRequest request);

    /**
     * Gets the specified route table's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRouteTableResponse getRouteTable(GetRouteTableRequest request);

    /**
     * Gets the specified security list's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSecurityListResponse getSecurityList(GetSecurityListRequest request);

    /**
     * Gets the specified {@link Service} object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetServiceResponse getService(GetServiceRequest request);

    /**
     * Gets the specified service gateway's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetServiceGatewayResponse getServiceGateway(GetServiceGatewayRequest request);

    /**
     * Gets the specified subnet's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSubnetResponse getSubnet(GetSubnetRequest request);

    /**
     * Gets the specified VCN's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVcnResponse getVcn(GetVcnRequest request);

    /**
     * Gets the specified virtual circuit's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVirtualCircuitResponse getVirtualCircuit(GetVirtualCircuitRequest request);

    /**
     * Gets the information for the specified virtual network interface card (VNIC).
     * You can get the VNIC OCID from the
     * {@link #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments}
     * operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVnicResponse getVnic(GetVnicRequest request);

    /**
     * Lists the regions that support remote VCN peering (which is peering across regions).
     * For more information, see [VCN Peering](https://docs.cloud.oracle.com/Content/Network/Tasks/VCNpeering.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAllowedPeerRegionsForRemotePeeringResponse listAllowedPeerRegionsForRemotePeering(
            ListAllowedPeerRegionsForRemotePeeringRequest request);

    /**
     * Lists the customer-premises equipment objects (CPEs) in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCpesResponse listCpes(ListCpesRequest request);

    /**
     * Lists the cross-connect groups in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCrossConnectGroupsResponse listCrossConnectGroups(ListCrossConnectGroupsRequest request);

    /**
     * Lists the available FastConnect locations for cross-connect installation. You need
     * this information so you can specify your desired location when you create a cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCrossConnectLocationsResponse listCrossConnectLocations(
            ListCrossConnectLocationsRequest request);

    /**
     * Lists the cross-connects in the specified compartment. You can filter the list
     * by specifying the OCID of a cross-connect group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCrossConnectsResponse listCrossConnects(ListCrossConnectsRequest request);

    /**
     * Lists the available port speeds for cross-connects. You need this information
     * so you can specify your desired port speed (that is, shape) when you create a
     * cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCrossconnectPortSpeedShapesResponse listCrossconnectPortSpeedShapes(
            ListCrossconnectPortSpeedShapesRequest request);

    /**
     * Lists the sets of DHCP options in the specified VCN and specified compartment.
     * The response includes the default set of options that automatically comes with each VCN,
     * plus any other sets you've created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDhcpOptionsResponse listDhcpOptions(ListDhcpOptionsRequest request);

    /**
     * Lists the `DrgAttachment` objects for the specified compartment. You can filter the
     * results by VCN or DRG.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDrgAttachmentsResponse listDrgAttachments(ListDrgAttachmentsRequest request);

    /**
     * Lists the DRGs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDrgsResponse listDrgs(ListDrgsRequest request);

    /**
     * Lists the service offerings from supported providers. You need this
     * information so you can specify your desired provider and service
     * offering when you create a virtual circuit.
     * <p>
     * For the compartment ID, provide the OCID of your tenancy (the root compartment).
     * <p>
     * For more information, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFastConnectProviderServicesResponse listFastConnectProviderServices(
            ListFastConnectProviderServicesRequest request);

    /**
     * Gets the list of available virtual circuit bandwidth levels for a provider.
     * You need this information so you can specify your desired bandwidth level (shape) when you create a virtual circuit.
     * <p>
     * For more information about virtual circuits, see [FastConnect Overview](https://docs.cloud.oracle.com/Content/Network/Concepts/fastconnect.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFastConnectProviderVirtualCircuitBandwidthShapesResponse
            listFastConnectProviderVirtualCircuitBandwidthShapes(
                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request);

    /**
     * Lists the tunnel information for the specified IPSec connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListIPSecConnectionTunnelsResponse listIPSecConnectionTunnels(
            ListIPSecConnectionTunnelsRequest request);

    /**
     * Lists the IPSec connections for the specified compartment. You can filter the
     * results by DRG or CPE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListIPSecConnectionsResponse listIPSecConnections(ListIPSecConnectionsRequest request);

    /**
     * Lists the internet gateways in the specified VCN and the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInternetGatewaysResponse listInternetGateways(ListInternetGatewaysRequest request);

    /**
     * Lists the local peering gateways (LPGs) for the specified VCN and compartment
     * (the LPG's compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListLocalPeeringGatewaysResponse listLocalPeeringGateways(
            ListLocalPeeringGatewaysRequest request);

    /**
     * Lists the NAT gateways in the specified compartment. You may optionally specify a VCN OCID
     * to filter the results by VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListNatGatewaysResponse listNatGateways(ListNatGatewaysRequest request);

    /**
     * Lists the {@link PrivateIp} objects based
     * on one of these filters:
     * <p>
     * - Subnet OCID.
     *   - VNIC OCID.
     *   - Both private IP address and subnet OCID: This lets
     *   you get a `privateIP` object based on its private IP
     *   address (for example, 10.0.3.3) and not its OCID. For comparison,
     *   {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp}
     *   requires the OCID.
     * <p>
     * If you're listing all the private IPs associated with a given subnet
     * or VNIC, the response includes both primary and secondary private IPs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPrivateIpsResponse listPrivateIps(ListPrivateIpsRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPublicIpsResponse listPublicIps(ListPublicIpsRequest request);

    /**
     * Lists the remote peering connections (RPCs) for the specified DRG and compartment
     * (the RPC's compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRemotePeeringConnectionsResponse listRemotePeeringConnections(
            ListRemotePeeringConnectionsRequest request);

    /**
     * Lists the route tables in the specified VCN and specified compartment. The response
     * includes the default route table that automatically comes with each VCN, plus any route tables
     * you've created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request);

    /**
     * Lists the security lists in the specified VCN and compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSecurityListsResponse listSecurityLists(ListSecurityListsRequest request);

    /**
     * Lists the service gateways in the specified compartment. You may optionally specify a VCN OCID
     * to filter the results by VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListServiceGatewaysResponse listServiceGateways(ListServiceGatewaysRequest request);

    /**
     * Lists the available {@link Service} objects that you can enable for a
     * service gateway in this region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListServicesResponse listServices(ListServicesRequest request);

    /**
     * Lists the subnets in the specified VCN and the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSubnetsResponse listSubnets(ListSubnetsRequest request);

    /**
     * Lists the virtual cloud networks (VCNs) in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVcnsResponse listVcns(ListVcnsRequest request);

    /**
     * The deprecated operation lists available bandwidth levels for virtual circuits. For the compartment ID, provide the OCID of your tenancy (the root compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVirtualCircuitBandwidthShapesResponse listVirtualCircuitBandwidthShapes(
            ListVirtualCircuitBandwidthShapesRequest request);

    /**
     * Lists the public IP prefixes and their details for the specified
     * public virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVirtualCircuitPublicPrefixesResponse listVirtualCircuitPublicPrefixes(
            ListVirtualCircuitPublicPrefixesRequest request);

    /**
     * Lists the virtual circuits in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVirtualCircuitsResponse listVirtualCircuits(ListVirtualCircuitsRequest request);

    /**
     * Updates the specified CPE's display name or tags.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCpeResponse updateCpe(UpdateCpeRequest request);

    /**
     * Updates the specified cross-connect.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCrossConnectResponse updateCrossConnect(UpdateCrossConnectRequest request);

    /**
     * Updates the specified cross-connect group's display name.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCrossConnectGroupResponse updateCrossConnectGroup(UpdateCrossConnectGroupRequest request);

    /**
     * Updates the specified set of DHCP options. You can update the display name or the options
     * themselves. Avoid entering confidential information.
     * <p>
     * Note that the `options` object you provide replaces the entire existing set of options.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDhcpOptionsResponse updateDhcpOptions(UpdateDhcpOptionsRequest request);

    /**
     * Updates the specified DRG's display name or tags. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDrgResponse updateDrg(UpdateDrgRequest request);

    /**
     * Updates the display name for the specified `DrgAttachment`.
     * Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDrgAttachmentResponse updateDrgAttachment(UpdateDrgAttachmentRequest request);

    /**
     * Updates the specified IPSec connection.
     * <p>
     * To update an individual IPSec tunnel's attributes, use
     * {@link #updateIPSecConnectionTunnel(UpdateIPSecConnectionTunnelRequest) updateIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateIPSecConnectionResponse updateIPSecConnection(UpdateIPSecConnectionRequest request);

    /**
     * Updates the specified tunnel. This operation lets you change tunnel attributes such as the
     * routing type (BGP dynamic routing or static routing). Here are some important notes:
     * <p>
     * If you change the tunnel's routing type or BGP session configuration, the tunnel will go
     *     down while it's reprovisioned.
     * <p>
     * If you want to switch the tunnel's `routing` from `STATIC` to `BGP`, make sure the tunnel's
     *     BGP session configuration attributes have been set ({@link #bgpSessionInfo(BgpSessionInfoRequest) bgpSessionInfo}).
     * <p>
     * If you want to switch the tunnel's `routing` from `BGP` to `STATIC`, make sure the
     *     {@link IPSecConnection} already has at least one valid CIDR
     *     static route.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateIPSecConnectionTunnelResponse updateIPSecConnectionTunnel(
            UpdateIPSecConnectionTunnelRequest request);

    /**
     * Updates the shared secret (pre-shared key) for the specified tunnel.
     * <p>
     **Important:** If you change the shared secret, the tunnel will go down while it's reprovisioned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateIPSecConnectionTunnelSharedSecretResponse updateIPSecConnectionTunnelSharedSecret(
            UpdateIPSecConnectionTunnelSharedSecretRequest request);

    /**
     * Updates the specified internet gateway. You can disable/enable it, or change its display name
     * or tags. Avoid entering confidential information.
     * <p>
     * If the gateway is disabled, that means no traffic will flow to/from the internet even if there's
     * a route rule that enables that traffic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateInternetGatewayResponse updateInternetGateway(UpdateInternetGatewayRequest request);

    /**
     * Updates the specified local peering gateway (LPG).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateLocalPeeringGatewayResponse updateLocalPeeringGateway(
            UpdateLocalPeeringGatewayRequest request);

    /**
     * Updates the specified NAT gateway.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateNatGatewayResponse updateNatGateway(UpdateNatGatewayRequest request);

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
     * {@link #updateVnic(UpdateVnicRequest) updateVnic}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdatePrivateIpResponse updatePrivateIp(UpdatePrivateIpRequest request);

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
     * {@link #createPublicIp(CreatePublicIpRequest) createPublicIp}.
     * * You can't move an ephemeral public IP to a different private IP.
     * * If you want to unassign an ephemeral public IP from its private IP, use
     * {@link #deletePublicIp(DeletePublicIpRequest) deletePublicIp}, which
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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdatePublicIpResponse updatePublicIp(UpdatePublicIpRequest request);

    /**
     * Updates the specified remote peering connection (RPC).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRemotePeeringConnectionResponse updateRemotePeeringConnection(
            UpdateRemotePeeringConnectionRequest request);

    /**
     * Updates the specified route table's display name or route rules.
     * Avoid entering confidential information.
     * <p>
     * Note that the `routeRules` object you provide replaces the entire existing set of rules.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request);

    /**
     * Updates the specified security list's display name or rules.
     * Avoid entering confidential information.
     * <p>
     * Note that the `egressSecurityRules` or `ingressSecurityRules` objects you provide replace the entire
     * existing objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSecurityListResponse updateSecurityList(UpdateSecurityListRequest request);

    /**
     * Updates the specified service gateway. The information you provide overwrites the existing
     * attributes of the gateway.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateServiceGatewayResponse updateServiceGateway(UpdateServiceGatewayRequest request);

    /**
     * Updates the specified subnet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request);

    /**
     * Updates the specified VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVcnResponse updateVcn(UpdateVcnRequest request);

    /**
     * Updates the specified virtual circuit. This can be called by
     * either the customer who owns the virtual circuit, or the
     * provider (when provisioning or de-provisioning the virtual
     * circuit from their end). The documentation for
     * {@link #updateVirtualCircuitDetails(UpdateVirtualCircuitDetailsRequest) updateVirtualCircuitDetails}
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
     * use {@link #bulkAddVirtualCircuitPublicPrefixes(BulkAddVirtualCircuitPublicPrefixesRequest) bulkAddVirtualCircuitPublicPrefixes}
     * and
     * {@link #bulkDeleteVirtualCircuitPublicPrefixes(BulkDeleteVirtualCircuitPublicPrefixesRequest) bulkDeleteVirtualCircuitPublicPrefixes}.
     * Updating the list of prefixes does NOT cause the BGP session to go down. However,
     * Oracle must verify the customer's ownership of each added prefix before
     * traffic for that prefix will flow across the virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVirtualCircuitResponse updateVirtualCircuit(UpdateVirtualCircuitRequest request);

    /**
     * Updates the specified VNIC.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVnicResponse updateVnic(UpdateVnicRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead.  Otherwise, a default one will be provided
     *   that does not support operations that rely on the {@code WorkRequestClient} for polling.  An
     *   {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    VirtualNetworkWaiters getWaiters();

    /**
     * Creates a new {@code VirtualNetworkWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request status
     * @return The service waiters.
     */
    VirtualNetworkWaiters newWaiters(WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    VirtualNetworkPaginators getPaginators();
}
