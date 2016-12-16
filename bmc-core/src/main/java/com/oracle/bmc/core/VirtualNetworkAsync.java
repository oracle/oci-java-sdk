/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.responses.AsyncHandler;

import java.util.concurrent.Future;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

import com.oracle.bmc.*;

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
     * Creates a new virtual Customer-Premise Equipment (CPE) object in the specified compartment. You can
     * think of a CPE object as a virtual representation of the actual router that is on-premise at your site,
     * at your end of the VPN connection to your VCN. You need to create this object as part of the process of
     * setting up the VPN. For more information, see
     * [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three)
     * and [Managing Customer-Premise Equipment (CPE)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingCPEs.htm).
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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateCpeResponse> createCpe(
            CreateCpeRequest request, AsyncHandler<CreateCpeRequest, CreateCpeResponse> handler);

    /**
     * Creates a new set of DHCP options for the specified VCN. The only option available to use is
     * {@link DhcpDnsOption}, which lets you specify how DNS (host name resolution) is
     * handled in the subnets in your VCN. For more information, see
     * [Managing DHCP Options](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDHCP.htm).
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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateDhcpOptionsResponse> createDhcpOptions(
            CreateDhcpOptionsRequest request,
            AsyncHandler<CreateDhcpOptionsRequest, CreateDhcpOptionsResponse> handler);

    /**
     * Creates a new Dynamic Routing Gateway (DRG) in the specified compartment. You can think of a DRG
     * as a virtual router that provides a path for private traffic between your VCN and your on-premise
     * network. You use it with other Networking Service components and an on-premise router to create
     * a site-to-site VPN. For more information, see
     * [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three)
     * and [Managing Dynamic Routing Gateways (DRGs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDRGs.htm).
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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateDrgResponse> createDrg(
            CreateDrgRequest request, AsyncHandler<CreateDrgRequest, CreateDrgResponse> handler);

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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateDrgAttachmentResponse> createDrgAttachment(
            CreateDrgAttachmentRequest request,
            AsyncHandler<CreateDrgAttachmentRequest, CreateDrgAttachmentResponse> handler);

    /**
     * Creates a new IPSec connection between the specified DRG and CPE. This connection consists of multiple IPSec
     * tunnels. Creating this connection is one of the steps required when setting up a VPN. For more
     * information, see
     * [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three)
     * and [Managing IPSec Connections](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPsec.htm).
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
     * {@link #getIPSecConnectionDeviceConfig(GetIPSecConnectionDeviceConfigRequest, Consumer, Consumer) getIPSecConnectionDeviceConfig}.
     * For each tunnel, that operation gives you the IP address of Oracle's VPN headend and the shared secret
     * (i.e., the pre-shared key). For more information, see
     * [Configuring Your On-Premise Router](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/configuringCPE.htm).
     * <p>
     * To get the status of the tunnels (whether they're up or down), use
     * {@link #getIPSecConnectionDeviceStatus(GetIPSecConnectionDeviceStatusRequest, Consumer, Consumer) getIPSecConnectionDeviceStatus}.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateIPSecConnectionResponse> createIPSecConnection(
            CreateIPSecConnectionRequest request,
            AsyncHandler<CreateIPSecConnectionRequest, CreateIPSecConnectionResponse> handler);

    /**
     * Creates a new Internet Gateway for the specified VCN. You can think of an Internet Gateway as a router
     * that connects the edge of the VCN with the Internet. For an example scenario that uses an Internet Gateway,
     * see [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three)
     * and [Managing Internet Gateways](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIGs.htm).
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
     * {@link #updateRouteTable(UpdateRouteTableRequest, Consumer, Consumer) updateRouteTable}.
     * <p>
     * You must specify whether the Internet Gateway is enabled when you create it. If it's disabled, that means no
     * traffic will flow to/from the internet even if there's a route rule that enables that traffic. You can later
     * use {@link #updateInternetGateway(UpdateInternetGatewayRequest, Consumer, Consumer) updateInternetGateway} to easily disable/enable
     * the gateway without changing the route rule.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateInternetGatewayResponse> createInternetGateway(
            CreateInternetGatewayRequest request,
            AsyncHandler<CreateInternetGatewayRequest, CreateInternetGatewayResponse> handler);

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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateRouteTableResponse> createRouteTable(
            CreateRouteTableRequest request,
            AsyncHandler<CreateRouteTableRequest, CreateRouteTableResponse> handler);

    /**
     * Creates a new security list for the specified VCN. A security list provides a stateful firewall
     * for the instance. Security lists are configured at the subnet level, but the rules are applied
     * to the ingress and egress traffic for the individual instances in the subnet. For more information
     * about security lists, see [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/permissions.htm#Security_Lists).
     * For information on the number of rules you can have in a security list, see
     * [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm).
     * <p>
     **Important:** Oracle Bare Metal Cloud Services images that run Oracle Linux automatically include iptables rules.
     * If there are issues with some type of access to an instance, make sure both the security lists associated
     * with the instance's subnet and the instance's iptables rules are set correctly. For more information,
     * see [Ways to Secure Your Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/permissions.htm#one).
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
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateSecurityListResponse> createSecurityList(
            CreateSecurityListRequest request,
            AsyncHandler<CreateSecurityListRequest, CreateSecurityListResponse> handler);

    /**
     * Creates a new subnet in the specified VCN. A subnet is a logical subdivision of a VCN. Each subnet exists
     * in a single Availability Domain and consists of a contiguous range of IP addresses that do not overlap with
     * other subnets in the VCN. Example: 172.16.1.0/24. You can't change the size of the subnet after creation,
     * so it's important to think about the size of subnets you need before creating them.
     * For conceptual information about VCNs, subnets, and other Networking Service components, see
     * [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm)
     * and [Managing Subnets](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingsubnets.htm). For information on
     * the number of subnets you can have in a VCN, see [Service Limits](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/servicelimits.htm).
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
     * [Security Lists](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/permissions.htm#Security_Lists).
     * <p>
     * You may optionally associate a set of DHCP options with the subnet. If you don't, the subnet will use the
     * VCN's default set. For more information about DHCP options, see
     * [Managing DHCP Options](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDHCP.htm).
     * <p>
     * You may optionally specify a *display name* for the subnet, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateSubnetResponse> createSubnet(
            CreateSubnetRequest request,
            AsyncHandler<CreateSubnetRequest, CreateSubnetResponse> handler);

    /**
     * Creates a new Virtual Cloud Network (VCN). For conceptual information about VCNs and other Virtual Network
     * Service components, see [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm) and
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
     * The VCN automatically comes with a default route table, default security list, and default set of DHCP options.
     * The OCID for each is returned in the response. You can't delete these default objects, but you can change their
     * contents (i.e., route rules, etc.)
     * <p>
     * The VCN and subnets you create are not accessible until you attach an Internet Gateway or set up a VPN.
     * For more information, see
     * [Typical Networking Service Scenarios](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm#three).
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     * <p>
     * For information about endpoints and signing API requests, see
     * [About the API](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
     * [SDKS and Other Tools](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/sdks.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<CreateVcnResponse> createVcn(
            CreateVcnRequest request, AsyncHandler<CreateVcnRequest, CreateVcnResponse> handler);

    /**
     * Deletes the specified CPE object. The CPE must not be connected to a DRG. This is an asynchronous
     * operation; the CPE's `lifecycleState` will change to TERMINATING temporarily until the CPE is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteCpeResponse> deleteCpe(
            DeleteCpeRequest request, AsyncHandler<DeleteCpeRequest, DeleteCpeResponse> handler);

    /**
     * Deletes the specified set of DHCP options, but only if it's not associated with a subnet. You can't delete a
     * VCN's default set of DHCP options.
     * <p>
     * This is an asynchronous operation; the state of the set of options will switch to TERMINATING temporarily
     * until the set is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteDhcpOptionsResponse> deleteDhcpOptions(
            DeleteDhcpOptionsRequest request,
            AsyncHandler<DeleteDhcpOptionsRequest, DeleteDhcpOptionsResponse> handler);

    /**
     * Deletes the specified DRG. The DRG must not be attached to a VCN or be connected to your on-premise
     * network. Also, there must not be a route table that lists the DRG as a target. This is an asynchronous
     * operation; the DRG's `lifecycleState` will change to TERMINATING temporarily until the DRG is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteDrgResponse> deleteDrg(
            DeleteDrgRequest request, AsyncHandler<DeleteDrgRequest, DeleteDrgResponse> handler);

    /**
     * Detaches a DRG from a VCN by deleting the corresponding `DrgAttachment`. This is an asynchronous
     * operation; the attachment's `lifecycleState` will change to DETACHING temporarily until the attachment
     * is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteDrgAttachmentResponse> deleteDrgAttachment(
            DeleteDrgAttachmentRequest request,
            AsyncHandler<DeleteDrgAttachmentRequest, DeleteDrgAttachmentResponse> handler);

    /**
     * Deletes the specified IPSec connection. If your goal is to disable the VPN between your VCN and
     * on-premise network, it's easiest to simply detach the DRG but keep all the VPN components intact.
     * If you were to delete all the components and then later need to create a VPN again, you would
     * need to configure your on-premise router again with the new information returned from
     * {@link #createIPSecConnection(CreateIPSecConnectionRequest, Consumer, Consumer) createIPSecConnection}.
     * <p>
     * This is an asynchronous operation; the connection's `lifecycleState` will change to TERMINATING temporarily
     * until the connection is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteIPSecConnectionResponse> deleteIPSecConnection(
            DeleteIPSecConnectionRequest request,
            AsyncHandler<DeleteIPSecConnectionRequest, DeleteIPSecConnectionResponse> handler);

    /**
     * Deletes the specified Internet Gateway. The Internet Gateway does not have to be disabled, but
     * there must not be a route table that lists it as a target.
     * <p>
     * This is an asynchronous operation; the gateway's `lifecycleState` will change to TERMINATING temporarily
     * until the gateway is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteInternetGatewayResponse> deleteInternetGateway(
            DeleteInternetGatewayRequest request,
            AsyncHandler<DeleteInternetGatewayRequest, DeleteInternetGatewayResponse> handler);

    /**
     * Deletes the specified route table, but only if it's not associated with a subnet. You can't delete a
     * VCN's default route table.
     * <p>
     * This is an asynchronous operation; the route table's `lifecycleState` will change to TERMINATING temporarily
     * until the route table is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteRouteTableResponse> deleteRouteTable(
            DeleteRouteTableRequest request,
            AsyncHandler<DeleteRouteTableRequest, DeleteRouteTableResponse> handler);

    /**
     * Deletes the specified security list, but only if it's not associated with a subnet. You can't delete
     * a VCN's default security list.
     * <p>
     * This is an asynchronous operation; the security list's `lifecycleState` will change to TERMINATING temporarily
     * until the security list is completely removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteSecurityListResponse> deleteSecurityList(
            DeleteSecurityListRequest request,
            AsyncHandler<DeleteSecurityListRequest, DeleteSecurityListResponse> handler);

    /**
     * Deletes the specified subnet, but only if there are no instances in the subnet. This is an asynchronous
     * operation; the subnet's `lifecycleState` will change to TERMINATING temporarily. If there are any
     * instances in the subnet, the state will instead change back to AVAILABLE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteSubnetResponse> deleteSubnet(
            DeleteSubnetRequest request,
            AsyncHandler<DeleteSubnetRequest, DeleteSubnetResponse> handler);

    /**
     * Deletes the specified VCN. The VCN must be empty and have no attached gateways. This is an asynchronous
     * operation; the VCN's `lifecycleState` will change to TERMINATING temporarily until the VCN is completely
     * removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<DeleteVcnResponse> deleteVcn(
            DeleteVcnRequest request, AsyncHandler<DeleteVcnRequest, DeleteVcnResponse> handler);

    /**
     * Gets the specified CPE's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetCpeResponse> getCpe(
            GetCpeRequest request, AsyncHandler<GetCpeRequest, GetCpeResponse> handler);

    /**
     * Gets the specified set of DHCP options.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetDhcpOptionsResponse> getDhcpOptions(
            GetDhcpOptionsRequest request,
            AsyncHandler<GetDhcpOptionsRequest, GetDhcpOptionsResponse> handler);

    /**
     * Gets the specified DRG's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetDrgResponse> getDrg(
            GetDrgRequest request, AsyncHandler<GetDrgRequest, GetDrgResponse> handler);

    /**
     * Gets the information for the specified `DrgAttachment`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetDrgAttachmentResponse> getDrgAttachment(
            GetDrgAttachmentRequest request,
            AsyncHandler<GetDrgAttachmentRequest, GetDrgAttachmentResponse> handler);

    /**
     * Gets the specified IPSec connection's basic information, including the static routes for the
     * on-premise router. If you want the status of the connection (whether it's up or down), use
     * {@link #getIPSecConnectionDeviceStatus(GetIPSecConnectionDeviceStatusRequest, Consumer, Consumer) getIPSecConnectionDeviceStatus}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetIPSecConnectionResponse> getIPSecConnection(
            GetIPSecConnectionRequest request,
            AsyncHandler<GetIPSecConnectionRequest, GetIPSecConnectionResponse> handler);

    /**
     * Gets the configuration information for the specified IPSec connection. For each tunnel, the
     * response includes the IP address of Oracle's VPN headend and the shared secret.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetIPSecConnectionDeviceConfigResponse> getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request,
            AsyncHandler<
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
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetIPSecConnectionDeviceStatusResponse> getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request,
            AsyncHandler<
                            GetIPSecConnectionDeviceStatusRequest,
                            GetIPSecConnectionDeviceStatusResponse>
                    handler);

    /**
     * Gets the specified Internet Gateway's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetInternetGatewayResponse> getInternetGateway(
            GetInternetGatewayRequest request,
            AsyncHandler<GetInternetGatewayRequest, GetInternetGatewayResponse> handler);

    /**
     * Gets the specified route table's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetRouteTableResponse> getRouteTable(
            GetRouteTableRequest request,
            AsyncHandler<GetRouteTableRequest, GetRouteTableResponse> handler);

    /**
     * Gets the specified security list's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetSecurityListResponse> getSecurityList(
            GetSecurityListRequest request,
            AsyncHandler<GetSecurityListRequest, GetSecurityListResponse> handler);

    /**
     * Gets the specified subnet's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetSubnetResponse> getSubnet(
            GetSubnetRequest request, AsyncHandler<GetSubnetRequest, GetSubnetResponse> handler);

    /**
     * Gets the specified VCN's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetVcnResponse> getVcn(
            GetVcnRequest request, AsyncHandler<GetVcnRequest, GetVcnResponse> handler);

    /**
     * Gets the information for the specified Virtual Network Interface Card (VNIC), including the attached
     * instance's public and private IP addresses. Each instance automatically has a VNIC attached to it,
     * and the VNIC connects the instance to the subnet. You can get the instance's VNIC OCID from the
     * Cloud Compute Service's {@link #listVnicAttachments(ListVnicAttachmentsRequest, Consumer, Consumer) listVnicAttachments} operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<GetVnicResponse> getVnic(
            GetVnicRequest request, AsyncHandler<GetVnicRequest, GetVnicResponse> handler);

    /**
     * Gets a list of the Customer-Premise Equipment objects (CPEs) in the specified compartment.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListCpesResponse> listCpes(
            ListCpesRequest request, AsyncHandler<ListCpesRequest, ListCpesResponse> handler);

    /**
     * Gets a list of the sets of DHCP options in the specified VCN and specified compartment.
     * The response includes the default set of options that automatically comes with each VCN,
     * plus any other sets you've created.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListDhcpOptionsResponse> listDhcpOptions(
            ListDhcpOptionsRequest request,
            AsyncHandler<ListDhcpOptionsRequest, ListDhcpOptionsResponse> handler);

    /**
     * Gets a list of the `DrgAttachment` objects for the specified compartment. You can filter the
     * results by VCN or DRG.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListDrgAttachmentsResponse> listDrgAttachments(
            ListDrgAttachmentsRequest request,
            AsyncHandler<ListDrgAttachmentsRequest, ListDrgAttachmentsResponse> handler);

    /**
     * Gets a list of the DRGs in the specified compartment.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListDrgsResponse> listDrgs(
            ListDrgsRequest request, AsyncHandler<ListDrgsRequest, ListDrgsResponse> handler);

    /**
     * Gets a list of the IPSec connections for the specified compartment. You can filter the
     * results by DRG or CPE.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListIPSecConnectionsResponse> listIPSecConnections(
            ListIPSecConnectionsRequest request,
            AsyncHandler<ListIPSecConnectionsRequest, ListIPSecConnectionsResponse> handler);

    /**
     * Gets a list of the Internet Gateways in the specified VCN and the specified compartment.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListInternetGatewaysResponse> listInternetGateways(
            ListInternetGatewaysRequest request,
            AsyncHandler<ListInternetGatewaysRequest, ListInternetGatewaysResponse> handler);

    /**
     * Gets a list of the route tables in the specified VCN and specified compartment. The response
     * includes the default route table that automatically comes with each VCN, plus any route tables
     * you've created.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListRouteTablesResponse> listRouteTables(
            ListRouteTablesRequest request,
            AsyncHandler<ListRouteTablesRequest, ListRouteTablesResponse> handler);

    /**
     * Gets a list of the security lists in the specified VCN and compartment.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListSecurityListsResponse> listSecurityLists(
            ListSecurityListsRequest request,
            AsyncHandler<ListSecurityListsRequest, ListSecurityListsResponse> handler);

    /**
     * Gets a list of the subnets in the specified VCN and the specified compartment.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListSubnetsResponse> listSubnets(
            ListSubnetsRequest request,
            AsyncHandler<ListSubnetsRequest, ListSubnetsResponse> handler);

    /**
     * Gets a list of the Virtual Cloud Networks (VCNs) in the specified compartment.
     * <p>
     * To use this and other API operations, you must be authorized in an IAM policy. If you're not authorized,
     * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
     * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<ListVcnsResponse> listVcns(
            ListVcnsRequest request, AsyncHandler<ListVcnsRequest, ListVcnsResponse> handler);

    /**
     * Updates the specified CPE's display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateCpeResponse> updateCpe(
            UpdateCpeRequest request, AsyncHandler<UpdateCpeRequest, UpdateCpeResponse> handler);

    /**
     * Updates the specified set of DHCP options. You can update the display name or the options
     * themselves. Note that the `options` object you provide replaces the entire existing set of options.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateDhcpOptionsResponse> updateDhcpOptions(
            UpdateDhcpOptionsRequest request,
            AsyncHandler<UpdateDhcpOptionsRequest, UpdateDhcpOptionsResponse> handler);

    /**
     * Updates the specified DRG's display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateDrgResponse> updateDrg(
            UpdateDrgRequest request, AsyncHandler<UpdateDrgRequest, UpdateDrgResponse> handler);

    /**
     * Updates the display name for the specified `DrgAttachment`.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateDrgAttachmentResponse> updateDrgAttachment(
            UpdateDrgAttachmentRequest request,
            AsyncHandler<UpdateDrgAttachmentRequest, UpdateDrgAttachmentResponse> handler);

    /**
     * Updates the display name for the specified IPSec connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateIPSecConnectionResponse> updateIPSecConnection(
            UpdateIPSecConnectionRequest request,
            AsyncHandler<UpdateIPSecConnectionRequest, UpdateIPSecConnectionResponse> handler);

    /**
     * Updates the specified Internet Gateway. You can disable/enable it, or change its display name.
     * <p>
     * If the gateway is disabled, that means no traffic will flow to/from the internet even if there's
     * a route rule that enables that traffic.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateInternetGatewayResponse> updateInternetGateway(
            UpdateInternetGatewayRequest request,
            AsyncHandler<UpdateInternetGatewayRequest, UpdateInternetGatewayResponse> handler);

    /**
     * Updates the specified route table's display name or route rules. Note that the
     * `routeRules` object you provide replaces the entire existing set of rules.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateRouteTableResponse> updateRouteTable(
            UpdateRouteTableRequest request,
            AsyncHandler<UpdateRouteTableRequest, UpdateRouteTableResponse> handler);

    /**
     * Updates the specified security list's display name or rules. Note that the
     * `egressSecurityRules` or `ingressSecurityRules` objects you provide replace the entire
     * existing objects.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateSecurityListResponse> updateSecurityList(
            UpdateSecurityListRequest request,
            AsyncHandler<UpdateSecurityListRequest, UpdateSecurityListResponse> handler);

    /**
     * Updates the specified subnet's display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateSubnetResponse> updateSubnet(
            UpdateSubnetRequest request,
            AsyncHandler<UpdateSubnetRequest, UpdateSubnetResponse> handler);

    /**
     * Updates the specified VCN's display name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    Future<UpdateVcnResponse> updateVcn(
            UpdateVcnRequest request, AsyncHandler<UpdateVcnRequest, UpdateVcnResponse> handler);
}
