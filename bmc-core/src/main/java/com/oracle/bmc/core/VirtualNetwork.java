/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

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
    void setRegion(Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Creates a new virtual Customer-Premise Equipment (CPE) object in the specified compartment. For
     * more information, see [Managing Customer-Premise Equipment (CPE)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingCPEs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the CPE to reside. Notice that the CPE doesn't have to be in the same compartment as the IPSec
     * connection or other Networking Service components. If you're not sure which compartment to
     * use, put the CPE in the same compartment as the IPSec connection. For more information about
     * compartments and access control, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You must provide the public IP address of your on-premise router. See
     * [Configuring Your On-Premise Router](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/configuringCPE.htm).
     * <p>
     * You may optionally specify a *display name* for the CPE, otherwise a default is provided. It does not have to
     * be unique, and you can change it.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCpeResponse createCpe(CreateCpeRequest request);

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
     * It does not have to be unique, and you can change it.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDhcpOptionsResponse createDhcpOptions(CreateDhcpOptionsRequest request);

    /**
     * Creates a new Dynamic Routing Gateway (DRG) in the specified compartment. For more information,
     * see [Managing Dynamic Routing Gateways (DRGs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDRGs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want
     * the DRG to reside. Notice that the DRG doesn't have to be in the same compartment as the VCN,
     * the DRG attachment, or other Networking Service components. If you're not sure which compartment
     * to use, put the DRG in the same compartment as the VCN. For more information about compartments
     * and access control, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the DRG, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDrgResponse createDrg(CreateDrgRequest request);

    /**
     * Attaches the specified DRG to the specified VCN. A VCN can be attached to only one DRG at a time.
     * The response includes a `DrgAttachment` object with its own OCID. For more information about DRGs, see
     * [Managing Dynamic Routing Gateways (DRGs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDRGs.htm).
     * <p>
     * You may optionally specify a *display name* for the attachment, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     * <p>
     * For the purposes of access control, the DRG attachment is automatically placed into the same compartment
     * as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDrgAttachmentResponse createDrgAttachment(CreateDrgAttachmentRequest request);

    /**
     * Creates a new IPSec connection between the specified DRG and CPE. For more information, see
     * [Managing IPSec Connections](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPsec.htm).
     * <p>
     * In the request, you must include at least one static route to the CPE object (you're allowed a maximum
     * of 10). For example: 10.0.8.0/16.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the
     * IPSec connection to reside. Notice that the IPSec connection doesn't have to be in the same compartment
     * as the DRG, CPE, or other Networking Service components. If you're not sure which compartment to
     * use, put the IPSec connection in the same compartment as the CPE. For more information about
     * compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
     * For information about OCIDs, see [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the IPSec connection, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     * <p>
     * After creating the IPSec connection, you need to configure your on-premise router
     * with tunnel-specific information returned by
     * {@link #getIPSecConnectionDeviceConfig(GetIPSecConnectionDeviceConfigRequest) getIPSecConnectionDeviceConfig}.
     * For each tunnel, that operation gives you the IP address of Oracle's VPN headend and the shared secret
     * (i.e., the pre-shared key). For more information, see
     * [Configuring Your On-Premise Router](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/configuringCPE.htm).
     * <p>
     * To get the status of the tunnels (whether they're up or down), use
     * {@link #getIPSecConnectionDeviceStatus(GetIPSecConnectionDeviceStatusRequest) getIPSecConnectionDeviceStatus}.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateIPSecConnectionResponse createIPSecConnection(CreateIPSecConnectionRequest request);

    /**
     * Creates a new Internet Gateway for the specified VCN. For more information, see
     * [Managing Internet Gateways](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIGs.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the Internet
     * Gateway to reside. Notice that the Internet Gateway doesn't have to be in the same compartment as the VCN or
     * other Networking Service components. If you're not sure which compartment to use, put the Internet
     * Gateway in the same compartment with the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the Internet Gateway, otherwise a default is provided. It
     * does not have to be unique, and you can change it.
     * <p>
     * For traffic to flow between a subnet and an Internet Gateway, you must create a route rule accordingly in
     * the subnet's route table (e.g., 0.0.0.0/0 > Internet Gateway). See
     * {@link #updateRouteTable(UpdateRouteTableRequest) updateRouteTable}.
     * <p>
     * You must specify whether the Internet Gateway is enabled when you create it. If it's disabled, that means no
     * traffic will flow to/from the internet even if there's a route rule that enables that traffic. You can later
     * use {@link #updateInternetGateway(UpdateInternetGatewayRequest) updateInternetGateway} to easily disable/enable
     * the gateway without changing the route rule.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateInternetGatewayResponse createInternetGateway(CreateInternetGatewayRequest request);

    /**
     * Creates a new route table for the specified VCN. In the request you must also include at least one route
     * rule for the new route table. For information on the number of rules you can have in a route table, see
     * [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm). For general information about route
     * tables in your VCN, see [Managing Route Tables](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm).
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the route
     * table to reside. Notice that the route table doesn't have to be in the same compartment as the VCN, subnets,
     * or other Networking Service components. If you're not sure which compartment to use, put the route
     * table in the same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the route table, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request);

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
     * It does not have to be unique, and you can change it.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSecurityListResponse createSecurityList(CreateSecurityListRequest request);

    /**
     * Creates a new subnet in the specified VCN. You can't change the size of the subnet after creation,
     * so it's important to think about the size of subnets you need before creating them.
     * For more information, see [Managing Subnets](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingsubnets.htm).
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
     * [Managing Route Tables](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingroutetables.htm).
     * <p>
     * You may optionally associate a security list with the subnet. If you don't, the subnet will use the
     * VCN's default security list. For more information about security lists, see
     * [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/securitylists.htm).
     * <p>
     * You may optionally associate a set of DHCP options with the subnet. If you don't, the subnet will use the
     * VCN's default set. For more information about DHCP options, see
     * [Managing DHCP Options](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDHCP.htm).
     * <p>
     * You may optionally specify a *display name* for the subnet, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     * <p>
     * You can also add a DNS label for the subnet, which is required if you want the Internet and
     * VCN Resolver to resolve hostnames for instances in the subnet. For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateSubnetResponse createSubnet(CreateSubnetRequest request);

    /**
     * Creates a new Virtual Cloud Network (VCN). For more information, see
     * [Managing Virtual Cloud Networks (VCNs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVCNs.htm).
     * <p>
     * For the VCN you must specify a single, contiguous IPv4 CIDR block in the private IP address ranges specified in
     * [RFC 1918](https://tools.ietf.org/html/rfc1918) (10.0.0.0/8, 172.16/12, and 192.168/16). Example: 172.16.0.0/16.
     * The CIDR block can range from /16 to /30, and it must not overlap with your on-premise network. You can't
     * change the size of the VCN after creation.
     * <p>
     * For the purposes of access control, you must provide the OCID of the compartment where you want the VCN to
     * reside. Consult an Oracle Bare Metal Cloud Services administrator in your organization if you're not sure which
     * compartment to use. Notice that the VCN doesn't have to be in the same compartment as the subnets or other
     * Networking Service components. For more information about compartments and access control, see
     * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm). For information about OCIDs, see
     * [Resource Identifiers](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm).
     * <p>
     * You may optionally specify a *display name* for the VCN, otherwise a default is provided. It does not have to
     * be unique, and you can change it.
     * <p>
     * You can also add a DNS label for the VCN, which is required if you want the instances to use the
     * Interent and VCN Resolver option for DNS in the VCN. For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * The VCN automatically comes with a default route table, default security list, and default set of DHCP options.
     * The OCID for each is returned in the response. You can't delete these default objects, but you can change their
     * contents (i.e., route rules, etc.)
     * <p>
     * The VCN and subnets you create are not accessible until you attach an Internet Gateway or set up a VPN.
     * For more information, see
     * [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateVcnResponse createVcn(CreateVcnRequest request);

    /**
     * Deletes the specified CPE object. The CPE must not be connected to a DRG. This is an asynchronous
     * operation; the CPE's `lifecycleState` will change to TERMINATING temporarily until the CPE is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCpeResponse deleteCpe(DeleteCpeRequest request);

    /**
     * Deletes the specified set of DHCP options, but only if it's not associated with a subnet. You can't delete a
     * VCN's default set of DHCP options.
     * <p>
     * This is an asynchronous operation; the state of the set of options will switch to TERMINATING temporarily
     * until the set is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDhcpOptionsResponse deleteDhcpOptions(DeleteDhcpOptionsRequest request);

    /**
     * Deletes the specified DRG. The DRG must not be attached to a VCN or be connected to your on-premise
     * network. Also, there must not be a route table that lists the DRG as a target. This is an asynchronous
     * operation; the DRG's `lifecycleState` will change to TERMINATING temporarily until the DRG is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDrgResponse deleteDrg(DeleteDrgRequest request);

    /**
     * Detaches a DRG from a VCN by deleting the corresponding `DrgAttachment`. This is an asynchronous
     * operation; the attachment's `lifecycleState` will change to DETACHING temporarily until the attachment
     * is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDrgAttachmentResponse deleteDrgAttachment(DeleteDrgAttachmentRequest request);

    /**
     * Deletes the specified IPSec connection. If your goal is to disable the VPN between your VCN and
     * on-premise network, it's easiest to simply detach the DRG but keep all the VPN components intact.
     * If you were to delete all the components and then later need to create a VPN again, you would
     * need to configure your on-premise router again with the new information returned from
     * {@link #createIPSecConnection(CreateIPSecConnectionRequest) createIPSecConnection}.
     * <p>
     * This is an asynchronous operation; the connection's `lifecycleState` will change to TERMINATING temporarily
     * until the connection is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteIPSecConnectionResponse deleteIPSecConnection(DeleteIPSecConnectionRequest request);

    /**
     * Deletes the specified Internet Gateway. The Internet Gateway does not have to be disabled, but
     * there must not be a route table that lists it as a target.
     * <p>
     * This is an asynchronous operation; the gateway's `lifecycleState` will change to TERMINATING temporarily
     * until the gateway is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteInternetGatewayResponse deleteInternetGateway(DeleteInternetGatewayRequest request);

    /**
     * Deletes the specified route table, but only if it's not associated with a subnet. You can't delete a
     * VCN's default route table.
     * <p>
     * This is an asynchronous operation; the route table's `lifecycleState` will change to TERMINATING temporarily
     * until the route table is completely removed.
     *
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
     * This is an asynchronous operation; the security list's `lifecycleState` will change to TERMINATING temporarily
     * until the security list is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSecurityListResponse deleteSecurityList(DeleteSecurityListRequest request);

    /**
     * Deletes the specified subnet, but only if there are no instances in the subnet. This is an asynchronous
     * operation; the subnet's `lifecycleState` will change to TERMINATING temporarily. If there are any
     * instances in the subnet, the state will instead change back to AVAILABLE.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request);

    /**
     * Deletes the specified VCN. The VCN must be empty and have no attached gateways. This is an asynchronous
     * operation; the VCN's `lifecycleState` will change to TERMINATING temporarily until the VCN is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteVcnResponse deleteVcn(DeleteVcnRequest request);

    /**
     * Gets the specified CPE's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCpeResponse getCpe(GetCpeRequest request);

    /**
     * Gets the specified set of DHCP options.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDhcpOptionsResponse getDhcpOptions(GetDhcpOptionsRequest request);

    /**
     * Gets the specified DRG's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDrgResponse getDrg(GetDrgRequest request);

    /**
     * Gets the information for the specified `DrgAttachment`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDrgAttachmentResponse getDrgAttachment(GetDrgAttachmentRequest request);

    /**
     * Gets the specified IPSec connection's basic information, including the static routes for the
     * on-premise router. If you want the status of the connection (whether it's up or down), use
     * {@link #getIPSecConnectionDeviceStatus(GetIPSecConnectionDeviceStatusRequest) getIPSecConnectionDeviceStatus}.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionResponse getIPSecConnection(GetIPSecConnectionRequest request);

    /**
     * Gets the configuration information for the specified IPSec connection. For each tunnel, the
     * response includes the IP address of Oracle's VPN headend and the shared secret.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionDeviceConfigResponse getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request);

    /**
     * Gets the status of the specified IPSec connection (whether it's up or down).
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetIPSecConnectionDeviceStatusResponse getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request);

    /**
     * Gets the specified Internet Gateway's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetInternetGatewayResponse getInternetGateway(GetInternetGatewayRequest request);

    /**
     * Gets the specified route table's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetRouteTableResponse getRouteTable(GetRouteTableRequest request);

    /**
     * Gets the specified security list's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSecurityListResponse getSecurityList(GetSecurityListRequest request);

    /**
     * Gets the specified subnet's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSubnetResponse getSubnet(GetSubnetRequest request);

    /**
     * Gets the specified VCN's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVcnResponse getVcn(GetVcnRequest request);

    /**
     * Gets the information for the specified Virtual Network Interface Card (VNIC), including the attached
     * instance's public and private IP addresses. You can get the instance's VNIC OCID from the
     * Cloud Compute Service's {@link #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments} operation.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetVnicResponse getVnic(GetVnicRequest request);

    /**
     * Lists the Customer-Premise Equipment objects (CPEs) in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCpesResponse listCpes(ListCpesRequest request);

    /**
     * Lists the sets of DHCP options in the specified VCN and specified compartment.
     * The response includes the default set of options that automatically comes with each VCN,
     * plus any other sets you've created.
     *
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
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDrgAttachmentsResponse listDrgAttachments(ListDrgAttachmentsRequest request);

    /**
     * Lists the DRGs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDrgsResponse listDrgs(ListDrgsRequest request);

    /**
     * Lists the IPSec connections for the specified compartment. You can filter the
     * results by DRG or CPE.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListIPSecConnectionsResponse listIPSecConnections(ListIPSecConnectionsRequest request);

    /**
     * Lists the Internet Gateways in the specified VCN and the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListInternetGatewaysResponse listInternetGateways(ListInternetGatewaysRequest request);

    /**
     * Lists the route tables in the specified VCN and specified compartment. The response
     * includes the default route table that automatically comes with each VCN, plus any route tables
     * you've created.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request);

    /**
     * Lists the security lists in the specified VCN and compartment.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSecurityListsResponse listSecurityLists(ListSecurityListsRequest request);

    /**
     * Lists the subnets in the specified VCN and the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSubnetsResponse listSubnets(ListSubnetsRequest request);

    /**
     * Lists the Virtual Cloud Networks (VCNs) in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListVcnsResponse listVcns(ListVcnsRequest request);

    /**
     * Updates the specified CPE's display name.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCpeResponse updateCpe(UpdateCpeRequest request);

    /**
     * Updates the specified set of DHCP options. You can update the display name or the options
     * themselves. Note that the `options` object you provide replaces the entire existing set of options.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDhcpOptionsResponse updateDhcpOptions(UpdateDhcpOptionsRequest request);

    /**
     * Updates the specified DRG's display name.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDrgResponse updateDrg(UpdateDrgRequest request);

    /**
     * Updates the display name for the specified `DrgAttachment`.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDrgAttachmentResponse updateDrgAttachment(UpdateDrgAttachmentRequest request);

    /**
     * Updates the display name for the specified IPSec connection.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateIPSecConnectionResponse updateIPSecConnection(UpdateIPSecConnectionRequest request);

    /**
     * Updates the specified Internet Gateway. You can disable/enable it, or change its display name.
     * <p>
     * If the gateway is disabled, that means no traffic will flow to/from the internet even if there's
     * a route rule that enables that traffic.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateInternetGatewayResponse updateInternetGateway(UpdateInternetGatewayRequest request);

    /**
     * Updates the specified route table's display name or route rules. Note that the
     * `routeRules` object you provide replaces the entire existing set of rules.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request);

    /**
     * Updates the specified security list's display name or rules. Note that the
     * `egressSecurityRules` or `ingressSecurityRules` objects you provide replace the entire
     * existing objects.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSecurityListResponse updateSecurityList(UpdateSecurityListRequest request);

    /**
     * Updates the specified subnet's display name.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request);

    /**
     * Updates the specified VCN's display name.
     *
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateVcnResponse updateVcn(UpdateVcnRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    VirtualNetworkWaiters getWaiters();
}
