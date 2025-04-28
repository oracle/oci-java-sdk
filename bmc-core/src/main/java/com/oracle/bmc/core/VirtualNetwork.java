/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Use the Core Services API to manage resources such as virtual cloud networks (VCNs), compute
 * instances, and block storage volumes. For more information, see the console documentation for the
 * [Networking](https://docs.oracle.com/iaas/Content/Network/Concepts/overview.htm),
 * [Compute](https://docs.oracle.com/iaas/Content/Compute/Concepts/computeoverview.htm), and [Block
 * Volume](https://docs.oracle.com/iaas/Content/Block/Concepts/overview.htm) services. The required
 * permissions are documented in the [Details for the Core
 * Services](https://docs.oracle.com/iaas/Content/Identity/Reference/corepolicyreference.htm)
 * article.
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public interface VirtualNetwork extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Adds one or more route distribution statements to the specified route distribution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddDrgRouteDistributionStatementsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddDrgRouteDistributionStatements API.
     */
    AddDrgRouteDistributionStatementsResponse addDrgRouteDistributionStatements(
            AddDrgRouteDistributionStatementsRequest request);

    /**
     * Adds one or more static route rules to the specified DRG route table.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddDrgRouteRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDrgRouteRules
     *     API.
     */
    AddDrgRouteRulesResponse addDrgRouteRules(AddDrgRouteRulesRequest request);

    /**
     * Add an IPv6 prefix to a subnet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddIpv6SubnetCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddIpv6SubnetCidr
     *     API.
     */
    AddIpv6SubnetCidrResponse addIpv6SubnetCidr(AddIpv6SubnetCidrRequest request);

    /**
     * Add an IPv6 prefix to a VCN. The VCN size is always /56 and assigned by Oracle. Once added
     * the IPv6 prefix cannot be removed or modified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddIpv6VcnCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddIpv6VcnCidr API.
     */
    AddIpv6VcnCidrResponse addIpv6VcnCidr(AddIpv6VcnCidrRequest request);

    /**
     * Adds up to 25 security rules to the specified network security group. Adding more than 25
     * rules requires multiple operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddNetworkSecurityGroupSecurityRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddNetworkSecurityGroupSecurityRules API.
     */
    AddNetworkSecurityGroupSecurityRulesResponse addNetworkSecurityGroupSecurityRules(
            AddNetworkSecurityGroupSecurityRulesRequest request);

    /**
     * Adds some or all of a CIDR block to a public IP pool.
     *
     * <p>The CIDR block (or subrange) must not overlap with any other CIDR block already added to
     * this or any other public IP pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddPublicIpPoolCapacityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddPublicIpPoolCapacity API.
     */
    AddPublicIpPoolCapacityResponse addPublicIpPoolCapacity(AddPublicIpPoolCapacityRequest request);

    /**
     * Adds a CIDR block to a VCN. The CIDR block you add:
     *
     * <p>- Must be valid. - Must not overlap with another CIDR block in the VCN, a CIDR block of a
     * peered VCN, or the on-premises network CIDR block. - Must not exceed the limit of CIDR blocks
     * allowed per VCN.
     *
     * <p>*Note:** Adding a CIDR block places your VCN in an updating state until the changes are
     * complete. You cannot create or update the VCN's subnets, VLANs, LPGs, or route tables during
     * this operation. The time to completion can take a few minutes. You can use the
     * `GetWorkRequest` operation to check the status of the update.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AddVcnCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddVcnCidr API.
     */
    AddVcnCidrResponse addVcnCidr(AddVcnCidrRequest request);

    /**
     * Begins BGP route advertisements for the BYOIP CIDR block you imported to the Oracle Cloud.
     * The `ByoipRange` resource must be in the PROVISIONED state before the BYOIP CIDR block routes
     * can be advertised with BGP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AdvertiseByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AdvertiseByoipRange
     *     API.
     */
    AdvertiseByoipRangeResponse advertiseByoipRange(AdvertiseByoipRangeRequest request);

    /**
     * Adds the specified {@link Service} to the list of enabled `Service` objects for the specified
     * gateway. You must also set up a route rule with the `cidrBlock` of the `Service` as the
     * rule's destination and the service gateway as the rule's target. See {@link RouteTable}.
     *
     * <p>*Note:** The `AttachServiceId` operation is an easy way to add an individual `Service` to
     * the service gateway. Compare it with {@link
     * #updateServiceGateway(UpdateServiceGatewayRequest) updateServiceGateway}, which replaces the
     * entire existing list of enabled `Service` objects with the list that you provide in the
     * `Update` call.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/AttachServiceIdExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AttachServiceId
     *     API.
     */
    AttachServiceIdResponse attachServiceId(AttachServiceIdRequest request);

    /**
     * Adds one or more customer public IP prefixes to the specified public virtual circuit. Use
     * this operation (and not {@link #updateVirtualCircuit(UpdateVirtualCircuitRequest)
     * updateVirtualCircuit}) to add prefixes to the virtual circuit. Oracle must verify the
     * customer's ownership of each prefix before traffic for that prefix will flow across the
     * virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/BulkAddVirtualCircuitPublicPrefixesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     BulkAddVirtualCircuitPublicPrefixes API.
     */
    BulkAddVirtualCircuitPublicPrefixesResponse bulkAddVirtualCircuitPublicPrefixes(
            BulkAddVirtualCircuitPublicPrefixesRequest request);

    /**
     * Removes one or more customer public IP prefixes from the specified public virtual circuit.
     * Use this operation (and not {@link #updateVirtualCircuit(UpdateVirtualCircuitRequest)
     * updateVirtualCircuit}) to remove prefixes from the virtual circuit. When the virtual
     * circuit's state switches back to PROVISIONED, Oracle stops advertising the specified prefixes
     * across the connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/BulkDeleteVirtualCircuitPublicPrefixesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     BulkDeleteVirtualCircuitPublicPrefixes API.
     */
    BulkDeleteVirtualCircuitPublicPrefixesResponse bulkDeleteVirtualCircuitPublicPrefixes(
            BulkDeleteVirtualCircuitPublicPrefixesRequest request);

    /**
     * Moves a BYOASN Resource to a different compartment. For information about moving resources
     * between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeByoasnCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeByoasnCompartment API.
     */
    ChangeByoasnCompartmentResponse changeByoasnCompartment(ChangeByoasnCompartmentRequest request);

    /**
     * Moves a BYOIP CIDR block to a different compartment. For information about moving resources
     * between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeByoipRangeCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeByoipRangeCompartment API.
     */
    ChangeByoipRangeCompartmentResponse changeByoipRangeCompartment(
            ChangeByoipRangeCompartmentRequest request);

    /**
     * Moves a capture filter to a new compartment in the same tenancy. For information about moving
     * resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeCaptureFilterCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCaptureFilterCompartment API.
     */
    ChangeCaptureFilterCompartmentResponse changeCaptureFilterCompartment(
            ChangeCaptureFilterCompartmentRequest request);

    /**
     * Moves a CPE object into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeCpeCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCpeCompartment API.
     */
    ChangeCpeCompartmentResponse changeCpeCompartment(ChangeCpeCompartmentRequest request);

    /**
     * Moves a cross-connect into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeCrossConnectCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCrossConnectCompartment API.
     */
    ChangeCrossConnectCompartmentResponse changeCrossConnectCompartment(
            ChangeCrossConnectCompartmentRequest request);

    /**
     * Moves a cross-connect group into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeCrossConnectGroupCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCrossConnectGroupCompartment API.
     */
    ChangeCrossConnectGroupCompartmentResponse changeCrossConnectGroupCompartment(
            ChangeCrossConnectGroupCompartmentRequest request);

    /**
     * Moves a set of DHCP options into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeDhcpOptionsCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDhcpOptionsCompartment API.
     */
    ChangeDhcpOptionsCompartmentResponse changeDhcpOptionsCompartment(
            ChangeDhcpOptionsCompartmentRequest request);

    /**
     * Moves a DRG into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeDrgCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeDrgCompartment API.
     */
    ChangeDrgCompartmentResponse changeDrgCompartment(ChangeDrgCompartmentRequest request);

    /**
     * Moves an IPSec connection into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeIPSecConnectionCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeIPSecConnectionCompartment API.
     */
    ChangeIPSecConnectionCompartmentResponse changeIPSecConnectionCompartment(
            ChangeIPSecConnectionCompartmentRequest request);

    /**
     * Moves an internet gateway into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeInternetGatewayCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeInternetGatewayCompartment API.
     */
    ChangeInternetGatewayCompartmentResponse changeInternetGatewayCompartment(
            ChangeInternetGatewayCompartmentRequest request);

    /**
     * Moves a local peering gateway into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeLocalPeeringGatewayCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeLocalPeeringGatewayCompartment API.
     */
    ChangeLocalPeeringGatewayCompartmentResponse changeLocalPeeringGatewayCompartment(
            ChangeLocalPeeringGatewayCompartmentRequest request);

    /**
     * Moves a NAT gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeNatGatewayCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeNatGatewayCompartment API.
     */
    ChangeNatGatewayCompartmentResponse changeNatGatewayCompartment(
            ChangeNatGatewayCompartmentRequest request);

    /**
     * Moves a network security group into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeNetworkSecurityGroupCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeNetworkSecurityGroupCompartment API.
     */
    ChangeNetworkSecurityGroupCompartmentResponse changeNetworkSecurityGroupCompartment(
            ChangeNetworkSecurityGroupCompartmentRequest request);

    /**
     * Moves a public IP into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>This operation applies only to reserved public IPs. Ephemeral public IPs always belong to
     * the same compartment as their VNIC and move accordingly.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangePublicIpCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangePublicIpCompartment API.
     */
    ChangePublicIpCompartmentResponse changePublicIpCompartment(
            ChangePublicIpCompartmentRequest request);

    /**
     * Moves a public IP pool to a different compartment. For information about moving resources
     * between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangePublicIpPoolCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangePublicIpPoolCompartment API.
     */
    ChangePublicIpPoolCompartmentResponse changePublicIpPoolCompartment(
            ChangePublicIpPoolCompartmentRequest request);

    /**
     * Moves a remote peering connection (RPC) into a different compartment within the same tenancy.
     * For information about moving resources between compartments, see [Moving Resources to a
     * Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeRemotePeeringConnectionCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeRemotePeeringConnectionCompartment API.
     */
    ChangeRemotePeeringConnectionCompartmentResponse changeRemotePeeringConnectionCompartment(
            ChangeRemotePeeringConnectionCompartmentRequest request);

    /**
     * Moves a route table into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeRouteTableCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeRouteTableCompartment API.
     */
    ChangeRouteTableCompartmentResponse changeRouteTableCompartment(
            ChangeRouteTableCompartmentRequest request);

    /**
     * Moves a security list into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeSecurityListCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSecurityListCompartment API.
     */
    ChangeSecurityListCompartmentResponse changeSecurityListCompartment(
            ChangeSecurityListCompartmentRequest request);

    /**
     * Moves a service gateway into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeServiceGatewayCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeServiceGatewayCompartment API.
     */
    ChangeServiceGatewayCompartmentResponse changeServiceGatewayCompartment(
            ChangeServiceGatewayCompartmentRequest request);

    /**
     * Moves a subnet into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeSubnetCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeSubnetCompartment API.
     */
    ChangeSubnetCompartmentResponse changeSubnetCompartment(ChangeSubnetCompartmentRequest request);

    /**
     * Moves a VCN into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVcnCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeVcnCompartment API.
     */
    ChangeVcnCompartmentResponse changeVcnCompartment(ChangeVcnCompartmentRequest request);

    /**
     * Moves a virtual circuit into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVirtualCircuitCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeVirtualCircuitCompartment API.
     */
    ChangeVirtualCircuitCompartmentResponse changeVirtualCircuitCompartment(
            ChangeVirtualCircuitCompartmentRequest request);

    /**
     * Moves a VLAN into a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVlanCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeVlanCompartment API.
     */
    ChangeVlanCompartmentResponse changeVlanCompartment(ChangeVlanCompartmentRequest request);

    /**
     * Moves a VTAP to a new compartment within the same tenancy. For information about moving
     * resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeVtapCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeVtapCompartment API.
     */
    ChangeVtapCompartmentResponse changeVtapCompartment(ChangeVtapCompartmentRequest request);

    /**
     * Connects this local peering gateway (LPG) to another one in the same region.
     *
     * <p>This operation must be called by the VCN administrator who is designated as the
     * *requestor* in the peering relationship. The *acceptor* must implement an Identity and Access
     * Management (IAM) policy that gives the requestor permission to connect to LPGs in the
     * acceptor's compartment. Without that permission, this operation will fail. For more
     * information, see [VCN
     * Peering](https://docs.oracle.com/iaas/Content/Network/Tasks/VCNpeering.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ConnectLocalPeeringGatewaysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConnectLocalPeeringGateways API.
     */
    ConnectLocalPeeringGatewaysResponse connectLocalPeeringGateways(
            ConnectLocalPeeringGatewaysRequest request);

    /**
     * Connects this RPC to another one in a different region.
     *
     * <p>This operation must be called by the VCN administrator who is designated as the
     * *requestor* in the peering relationship. The *acceptor* must implement an Identity and Access
     * Management (IAM) policy that gives the requestor permission to connect to RPCs in the
     * acceptor's compartment. Without that permission, this operation will fail. For more
     * information, see [VCN
     * Peering](https://docs.oracle.com/iaas/Content/Network/Tasks/VCNpeering.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ConnectRemotePeeringConnectionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ConnectRemotePeeringConnections API.
     */
    ConnectRemotePeeringConnectionsResponse connectRemotePeeringConnections(
            ConnectRemotePeeringConnectionsRequest request);

    /**
     * Creates a BYOASN Resource
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateByoasnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateByoasn API.
     */
    CreateByoasnResponse createByoasn(CreateByoasnRequest request);

    /**
     * Creates a subrange of the BYOIP CIDR block.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateByoipRange
     *     API.
     */
    CreateByoipRangeResponse createByoipRange(CreateByoipRangeRequest request);

    /**
     * Creates a virtual test access point (VTAP) capture filter in the specified compartment.
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the VTAP. For more information about compartments and access
     * control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the VTAP, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateCaptureFilterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCaptureFilter
     *     API.
     */
    CreateCaptureFilterResponse createCaptureFilter(CreateCaptureFilterRequest request);

    /**
     * Creates a new virtual customer-premises equipment (CPE) object in the specified compartment.
     * For more information, see [Site-to-Site VPN
     * Overview](https://docs.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the CPE to reside. Notice that the CPE doesn't have to be in the
     * same compartment as the IPSec connection or other Networking Service components. If you're
     * not sure which compartment to use, put the CPE in the same compartment as the DRG. For more
     * information about compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You must provide the public IP address of your on-premises router. See [CPE
     * Configuration](https://docs.oracle.com/iaas/Content/Network/Tasks/configuringCPE.htm).
     *
     * <p>You may optionally specify a *display name* for the CPE, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateCpeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCpe API.
     */
    CreateCpeResponse createCpe(CreateCpeRequest request);

    /**
     * Creates a new cross-connect. Oracle recommends you create each cross-connect in a {@link
     * CrossConnectGroup} so you can use link aggregation with the connection.
     *
     * <p>After creating the `CrossConnect` object, you need to go the FastConnect location and
     * request to have the physical cable installed. For more information, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the cross-connect to reside. If you're not sure which compartment
     * to use, put the cross-connect in the same compartment with your VCN. For more information
     * about compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the cross-connect. It does not have to be
     * unique, and you can change it. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateCrossConnectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCrossConnect
     *     API.
     */
    CreateCrossConnectResponse createCrossConnect(CreateCrossConnectRequest request);

    /**
     * Creates a new cross-connect group to use with Oracle Cloud Infrastructure FastConnect. For
     * more information, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the cross-connect group to reside. If you're not sure which
     * compartment to use, put the cross-connect group in the same compartment with your VCN. For
     * more information about compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the cross-connect group. It does not have
     * to be unique, and you can change it. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateCrossConnectGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCrossConnectGroup API.
     */
    CreateCrossConnectGroupResponse createCrossConnectGroup(CreateCrossConnectGroupRequest request);

    /**
     * Creates a new set of DHCP options for the specified VCN. For more information, see {@link
     * DhcpOptions}.
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the set of DHCP options to reside. Notice that the set of options
     * doesn't have to be in the same compartment as the VCN, subnets, or other Networking Service
     * components. If you're not sure which compartment to use, put the set of DHCP options in the
     * same compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the set of DHCP options, otherwise a
     * default is provided. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateDhcpOptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDhcpOptions
     *     API.
     */
    CreateDhcpOptionsResponse createDhcpOptions(CreateDhcpOptionsRequest request);

    /**
     * Creates a new dynamic routing gateway (DRG) in the specified compartment. For more
     * information, see [Dynamic Routing Gateways
     * (DRGs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingDRGs.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the DRG to reside. Notice that the DRG doesn't have to be in the
     * same compartment as the VCN, the DRG attachment, or other Networking Service components. If
     * you're not sure which compartment to use, put the DRG in the same compartment as the VCN. For
     * more information about compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the DRG, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateDrgExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDrg API.
     */
    CreateDrgResponse createDrg(CreateDrgRequest request);

    /**
     * Attaches the specified DRG to the specified network resource. A VCN can be attached to only
     * one DRG at a time, but a DRG can be attached to more than one VCN. The response includes a
     * `DrgAttachment` object with its own
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). For more
     * information about DRGs, see [Dynamic Routing Gateways
     * (DRGs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingDRGs.htm).
     *
     * <p>You may optionally specify a *display name* for the attachment, otherwise a default is
     * provided. It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * <p>For the purposes of access control, the DRG attachment is automatically placed into the
     * currently selected compartment. For more information about compartments and access control,
     * see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateDrgAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDrgAttachment
     *     API.
     */
    CreateDrgAttachmentResponse createDrgAttachment(CreateDrgAttachmentRequest request);

    /**
     * Creates a new route distribution for the specified DRG. Assign the route distribution as an
     * import distribution to a DRG route table using the `UpdateDrgRouteTable` or
     * `CreateDrgRouteTable` operations. Assign the route distribution as an export distribution to
     * a DRG attachment using the `UpdateDrgAttachment` or `CreateDrgAttachment` operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateDrgRouteDistributionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateDrgRouteDistribution API.
     */
    CreateDrgRouteDistributionResponse createDrgRouteDistribution(
            CreateDrgRouteDistributionRequest request);

    /**
     * Creates a new DRG route table for the specified DRG. Assign the DRG route table to a DRG
     * attachment using the `UpdateDrgAttachment` or `CreateDrgAttachment` operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateDrgRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDrgRouteTable
     *     API.
     */
    CreateDrgRouteTableResponse createDrgRouteTable(CreateDrgRouteTableRequest request);

    /**
     * Creates a new IPSec connection between the specified DRG and CPE. For more information, see
     * [Site-to-Site VPN
     * Overview](https://docs.oracle.com/iaas/Content/Network/Tasks/overviewIPsec.htm).
     *
     * <p>If you configure at least one tunnel to use static routing, then in the request you must
     * provide at least one valid static route (you're allowed a maximum of 10). For example:
     * 10.0.0.0/16. If you configure both tunnels to use BGP dynamic routing, you can provide an
     * empty list for the static routes. For more information, see the important note in {@link
     * IPSecConnection}.
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the IPSec connection to reside. Notice that the IPSec connection
     * doesn't have to be in the same compartment as the DRG, CPE, or other Networking Service
     * components. If you're not sure which compartment to use, put the IPSec connection in the same
     * compartment as the DRG. For more information about compartments and access control, see
     * [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>You may optionally specify a *display name* for the IPSec connection, otherwise a default
     * is provided. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     * <p>After creating the IPSec connection, you need to configure your on-premises router with
     * tunnel-specific information. For tunnel status and the required configuration information,
     * see:
     *
     * <p>{@link IPSecConnectionTunnel} * {@link IPSecConnectionTunnelSharedSecret}
     *
     * <p>For each tunnel, you need the IP address of Oracle's VPN headend and the shared secret
     * (that is, the pre-shared key). For more information, see [CPE
     * Configuration](https://docs.oracle.com/iaas/Content/Network/Tasks/configuringCPE.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateIPSecConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateIPSecConnection API.
     */
    CreateIPSecConnectionResponse createIPSecConnection(CreateIPSecConnectionRequest request);

    /**
     * Creates a new internet gateway for the specified VCN. For more information, see [Access to
     * the Internet](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIGs.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the Internet Gateway to reside. Notice that the internet gateway
     * doesn't have to be in the same compartment as the VCN or other Networking Service components.
     * If you're not sure which compartment to use, put the Internet Gateway in the same compartment
     * with the VCN. For more information about compartments and access control, see [Overview of
     * the IAM Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm).
     *
     * <p>You may optionally specify a *display name* for the internet gateway, otherwise a default
     * is provided. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     * <p>For traffic to flow between a subnet and an internet gateway, you must create a route rule
     * accordingly in the subnet's route table (for example, 0.0.0.0/0 > internet gateway). See
     * {@link #updateRouteTable(UpdateRouteTableRequest) updateRouteTable}.
     *
     * <p>You must specify whether the internet gateway is enabled when you create it. If it's
     * disabled, that means no traffic will flow to/from the internet even if there's a route rule
     * that enables that traffic. You can later use {@link
     * #updateInternetGateway(UpdateInternetGatewayRequest) updateInternetGateway} to easily
     * disable/enable the gateway without changing the route rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateInternetGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateInternetGateway API.
     */
    CreateInternetGatewayResponse createInternetGateway(CreateInternetGatewayRequest request);

    /**
     * Creates an IPv6 for the specified VNIC.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateIpv6Example.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateIpv6 API.
     */
    CreateIpv6Response createIpv6(CreateIpv6Request request);

    /**
     * Creates a new local peering gateway (LPG) for the specified VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateLocalPeeringGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateLocalPeeringGateway API.
     */
    CreateLocalPeeringGatewayResponse createLocalPeeringGateway(
            CreateLocalPeeringGatewayRequest request);

    /**
     * Creates a new NAT gateway for the specified VCN. You must also set up a route rule with the
     * NAT gateway as the rule's target. See {@link RouteTable}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateNatGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateNatGateway
     *     API.
     */
    CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request);

    /**
     * Creates a new network security group for the specified VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateNetworkSecurityGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateNetworkSecurityGroup API.
     */
    CreateNetworkSecurityGroupResponse createNetworkSecurityGroup(
            CreateNetworkSecurityGroupRequest request);

    /**
     * Creates a secondary private IP for the specified VNIC. For more information about secondary
     * private IPs, see [IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreatePrivateIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePrivateIp
     *     API.
     */
    CreatePrivateIpResponse createPrivateIp(CreatePrivateIpRequest request);

    /**
     * Creates a public IP. Use the `lifetime` property to specify whether it's an ephemeral or
     * reserved public IP. For information about limits on how many you can create, see [Public IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     * <p>**For an ephemeral public IP assigned to a private IP:** You must also specify a
     * `privateIpId` with the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the primary
     * private IP you want to assign the public IP to. The public IP is created in the same
     * availability domain as the private IP. An ephemeral public IP must always be assigned to a
     * private IP, and only to the *primary* private IP on a VNIC, not a secondary private IP.
     * Exception: If you create a {@link NatGateway}, Oracle automatically assigns the NAT gateway a
     * regional ephemeral public IP that you cannot remove.
     *
     * <p>**For a reserved public IP:** You may also optionally assign the public IP to a private IP
     * by specifying `privateIpId`. Or you can later assign the public IP with {@link
     * #updatePublicIp(UpdatePublicIpRequest) updatePublicIp}.
     *
     * <p>*Note:** When assigning a public IP to a private IP, the private IP must not already have
     * a public IP with `lifecycleState` = ASSIGNING or ASSIGNED. If it does, an error is returned.
     *
     * <p>Also, for reserved public IPs, the optional assignment part of this operation is
     * asynchronous. Poll the public IP's `lifecycleState` to determine if the assignment succeeded.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreatePublicIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePublicIp API.
     */
    CreatePublicIpResponse createPublicIp(CreatePublicIpRequest request);

    /**
     * Creates a public IP pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreatePublicIpPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePublicIpPool
     *     API.
     */
    CreatePublicIpPoolResponse createPublicIpPool(CreatePublicIpPoolRequest request);

    /**
     * Creates a new remote peering connection (RPC) for the specified DRG.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateRemotePeeringConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateRemotePeeringConnection API.
     */
    CreateRemotePeeringConnectionResponse createRemotePeeringConnection(
            CreateRemotePeeringConnectionRequest request);

    /**
     * Creates a new route table for the specified VCN. In the request you must also include at
     * least one route rule for the new route table. For information on the number of rules you can
     * have in a route table, see [Service
     * Limits](https://docs.oracle.com/iaas/Content/General/Concepts/servicelimits.htm). For general
     * information about route tables in your VCN and the types of targets you can use in route
     * rules, see [Route
     * Tables](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the route table to reside. Notice that the route table doesn't
     * have to be in the same compartment as the VCN, subnets, or other Networking Service
     * components. If you're not sure which compartment to use, put the route table in the same
     * compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the route table, otherwise a default is
     * provided. It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateRouteTable
     *     API.
     */
    CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request);

    /**
     * Creates a new security list for the specified VCN. For more information about security lists,
     * see [Security
     * Lists](https://docs.oracle.com/iaas/Content/Network/Concepts/securitylists.htm). For
     * information on the number of rules you can have in a security list, see [Service
     * Limits](https://docs.oracle.com/iaas/Content/General/Concepts/servicelimits.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the security list to reside. Notice that the security list doesn't
     * have to be in the same compartment as the VCN, subnets, or other Networking Service
     * components. If you're not sure which compartment to use, put the security list in the same
     * compartment as the VCN. For more information about compartments and access control, see
     * [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the security list, otherwise a default is
     * provided. It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateSecurityListExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSecurityList
     *     API.
     */
    CreateSecurityListResponse createSecurityList(CreateSecurityListRequest request);

    /**
     * Creates a new service gateway in the specified compartment.
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the service gateway to reside. For more information about
     * compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the service gateway, otherwise a default
     * is provided. It does not have to be unique, and you can change it. Avoid entering
     * confidential information.
     *
     * <p>Use the {@link #listServices(ListServicesRequest) listServices} operation to find service
     * CIDR labels available in the region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateServiceGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateServiceGateway API.
     */
    CreateServiceGatewayResponse createServiceGateway(CreateServiceGatewayRequest request);

    /**
     * Creates a new subnet in the specified VCN. You can't change the size of the subnet after
     * creation, so it's important to think about the size of subnets you need before creating them.
     * For more information, see [VCNs and
     * Subnets](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVCNs.htm). For
     * information on the number of subnets you can have in a VCN, see [Service
     * Limits](https://docs.oracle.com/iaas/Content/General/Concepts/servicelimits.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the subnet to reside. Notice that the subnet doesn't have to be in
     * the same compartment as the VCN, route tables, or other Networking Service components. If
     * you're not sure which compartment to use, put the subnet in the same compartment as the VCN.
     * For more information about compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally associate a route table with the subnet. If you don't, the subnet will
     * use the VCN's default route table. For more information about route tables, see [Route
     * Tables](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
     *
     * <p>You may optionally associate a security list with the subnet. If you don't, the subnet
     * will use the VCN's default security list. For more information about security lists, see
     * [Security Lists](https://docs.oracle.com/iaas/Content/Network/Concepts/securitylists.htm).
     *
     * <p>You may optionally associate a set of DHCP options with the subnet. If you don't, the
     * subnet will use the VCN's default set. For more information about DHCP options, see [DHCP
     * Options](https://docs.oracle.com/iaas/Content/Network/Tasks/managingDHCP.htm).
     *
     * <p>You may optionally specify a *display name* for the subnet, otherwise a default is
     * provided. It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * <p>You can also add a DNS label for the subnet, which is required if you want the Internet
     * and VCN Resolver to resolve hostnames for instances in the subnet. For more information, see
     * [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateSubnetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSubnet API.
     */
    CreateSubnetResponse createSubnet(CreateSubnetRequest request);

    /**
     * Creates a new virtual cloud network (VCN). For more information, see [VCNs and
     * Subnets](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVCNs.htm).
     *
     * <p>For the VCN, you specify a list of one or more IPv4 CIDR blocks that meet the following
     * criteria:
     *
     * <p>- The CIDR blocks must be valid. - They must not overlap with each other or with the
     * on-premises network CIDR block. - The number of CIDR blocks does not exceed the limit of CIDR
     * blocks allowed per VCN.
     *
     * <p>For a CIDR block, Oracle recommends that you use one of the private IP address ranges
     * specified in [RFC 1918](https://tools.ietf.org/html/rfc1918) (10.0.0.0/8, 172.16/12, and
     * 192.168/16). Example: 172.16.0.0/16. The CIDR blocks can range from /16 to /30.
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the VCN to reside. Consult an Oracle Cloud Infrastructure
     * administrator in your organization if you're not sure which compartment to use. Notice that
     * the VCN doesn't have to be in the same compartment as the subnets or other Networking Service
     * components. For more information about compartments and access control, see [Overview of the
     * IAM Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the VCN, otherwise a default is provided.
     * It does not have to be unique, and you can change it. Avoid entering confidential
     * information.
     *
     * <p>You can also add a DNS label for the VCN, which is required if you want the instances to
     * use the Interent and VCN Resolver option for DNS in the VCN. For more information, see [DNS
     * in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>The VCN automatically comes with a default route table, default security list, and default
     * set of DHCP options. The
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for each is
     * returned in the response. You can't delete these default objects, but you can change their
     * contents (that is, change the route rules, security list rules, and so on).
     *
     * <p>The VCN and subnets you create are not accessible until you attach an internet gateway or
     * set up a Site-to-Site VPN or FastConnect. For more information, see [Overview of the
     * Networking Service](https://docs.oracle.com/iaas/Content/Network/Concepts/overview.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVcnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVcn API.
     */
    CreateVcnResponse createVcn(CreateVcnRequest request);

    /**
     * Creates a new virtual circuit to use with Oracle Cloud Infrastructure FastConnect. For more
     * information, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where you want the virtual circuit to reside. If you're not sure which
     * compartment to use, put the virtual circuit in the same compartment with the DRG it's using.
     * For more information about compartments and access control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the virtual circuit. It does not have to
     * be unique, and you can change it. Avoid entering confidential information.
     *
     * <p>*Important:** When creating a virtual circuit, you specify a DRG for the traffic to flow
     * through. Make sure you attach the DRG to your VCN and confirm the VCN's routing sends traffic
     * to the DRG. Otherwise traffic will not flow. For more information, see [Route
     * Tables](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVirtualCircuitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateVirtualCircuit API.
     */
    CreateVirtualCircuitResponse createVirtualCircuit(CreateVirtualCircuitRequest request);

    /**
     * Creates a VLAN in the specified VCN and the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVlan API.
     */
    CreateVlanResponse createVlan(CreateVlanRequest request);

    /**
     * Creates a virtual test access point (VTAP) in the specified compartment.
     *
     * <p>For the purposes of access control, you must provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the VTAP. For more information about compartments and access
     * control, see [Overview of the IAM
     * Service](https://docs.oracle.com/iaas/Content/Identity/Concepts/overview.htm). For
     * information about OCIDs, see [Resource
     * Identifiers](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>You may optionally specify a *display name* for the VTAP, otherwise a default is provided.
     * It does not have to be unique, and you can change it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateVtapExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateVtap API.
     */
    CreateVtapResponse createVtap(CreateVtapRequest request);

    /**
     * Deletes the specified `Byoasn` resource. The resource must be in one of the following states:
     * CREATING, ACTIVE or FAILED. It must not be in use by any of the byoipRanges or deletion will
     * fail. You must specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteByoasnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteByoasn API.
     */
    DeleteByoasnResponse deleteByoasn(DeleteByoasnRequest request);

    /**
     * Deletes the specified `ByoipRange` resource. The resource must be in one of the following
     * states: CREATING, PROVISIONED, ACTIVE, or FAILED. It must not have any subranges currently
     * allocated to a PublicIpPool object or the deletion will fail. You must specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If the
     * `ByoipRange` resource is currently in the PROVISIONED or ACTIVE state, it will be
     * de-provisioned and then deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteByoipRange
     *     API.
     */
    DeleteByoipRangeResponse deleteByoipRange(DeleteByoipRangeRequest request);

    /**
     * Deletes the specified VTAP capture filter. This is an asynchronous operation. The VTAP
     * capture filter's `lifecycleState` will change to TERMINATING temporarily until the VTAP
     * capture filter is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteCaptureFilterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCaptureFilter
     *     API.
     */
    DeleteCaptureFilterResponse deleteCaptureFilter(DeleteCaptureFilterRequest request);

    /**
     * Deletes the specified CPE object. The CPE must not be connected to a DRG. This is an
     * asynchronous operation. The CPE's `lifecycleState` will change to TERMINATING temporarily
     * until the CPE is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteCpeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCpe API.
     */
    DeleteCpeResponse deleteCpe(DeleteCpeRequest request);

    /**
     * Deletes the specified cross-connect. It must not be mapped to a {@link VirtualCircuit}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteCrossConnectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCrossConnect
     *     API.
     */
    DeleteCrossConnectResponse deleteCrossConnect(DeleteCrossConnectRequest request);

    /**
     * Deletes the specified cross-connect group. It must not contain any cross-connects, and it
     * cannot be mapped to a {@link VirtualCircuit}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteCrossConnectGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCrossConnectGroup API.
     */
    DeleteCrossConnectGroupResponse deleteCrossConnectGroup(DeleteCrossConnectGroupRequest request);

    /**
     * Deletes the specified set of DHCP options, but only if it's not associated with a subnet. You
     * can't delete a VCN's default set of DHCP options.
     *
     * <p>This is an asynchronous operation. The state of the set of options will switch to
     * TERMINATING temporarily until the set is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteDhcpOptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDhcpOptions
     *     API.
     */
    DeleteDhcpOptionsResponse deleteDhcpOptions(DeleteDhcpOptionsRequest request);

    /**
     * Deletes the specified DRG. The DRG must not be attached to a VCN or be connected to your
     * on-premise network. Also, there must not be a route table that lists the DRG as a target.
     * This is an asynchronous operation. The DRG's `lifecycleState` will change to TERMINATING
     * temporarily until the DRG is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteDrgExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDrg API.
     */
    DeleteDrgResponse deleteDrg(DeleteDrgRequest request);

    /**
     * Detaches a DRG from a network resource by deleting the corresponding `DrgAttachment`
     * resource. This is an asynchronous operation. The attachment's `lifecycleState` will
     * temporarily change to DETACHING until the attachment is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteDrgAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDrgAttachment
     *     API.
     */
    DeleteDrgAttachmentResponse deleteDrgAttachment(DeleteDrgAttachmentRequest request);

    /**
     * Deletes the specified route distribution. You can't delete a route distribution currently in
     * use by a DRG attachment or DRG route table.
     *
     * <p>Remove the DRG route distribution from a DRG attachment or DRG route table by using the
     * \"RemoveExportDrgRouteDistribution\" or \"RemoveImportDrgRouteDistribution' operations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteDrgRouteDistributionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteDrgRouteDistribution API.
     */
    DeleteDrgRouteDistributionResponse deleteDrgRouteDistribution(
            DeleteDrgRouteDistributionRequest request);

    /**
     * Deletes the specified DRG route table. There must not be any DRG attachments assigned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteDrgRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDrgRouteTable
     *     API.
     */
    DeleteDrgRouteTableResponse deleteDrgRouteTable(DeleteDrgRouteTableRequest request);

    /**
     * Deletes the specified IPSec connection. If your goal is to disable the Site-to-Site VPN
     * between your VCN and on-premises network, it's easiest to simply detach the DRG but keep all
     * the Site-to-Site VPN components intact. If you were to delete all the components and then
     * later need to create an Site-to-Site VPN again, you would need to configure your on-premises
     * router again with the new information returned from {@link
     * #createIPSecConnection(CreateIPSecConnectionRequest) createIPSecConnection}.
     *
     * <p>This is an asynchronous operation. The connection's `lifecycleState` will change to
     * TERMINATING temporarily until the connection is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteIPSecConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteIPSecConnection API.
     */
    DeleteIPSecConnectionResponse deleteIPSecConnection(DeleteIPSecConnectionRequest request);

    /**
     * Deletes the specified internet gateway. The internet gateway does not have to be disabled,
     * but there must not be a route table that lists it as a target.
     *
     * <p>This is an asynchronous operation. The gateway's `lifecycleState` will change to
     * TERMINATING temporarily until the gateway is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteInternetGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteInternetGateway API.
     */
    DeleteInternetGatewayResponse deleteInternetGateway(DeleteInternetGatewayRequest request);

    /**
     * Unassigns and deletes the specified IPv6. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). The IPv6
     * address is returned to the subnet's pool of available addresses.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteIpv6Example.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteIpv6 API.
     */
    DeleteIpv6Response deleteIpv6(DeleteIpv6Request request);

    /**
     * Deletes the specified local peering gateway (LPG).
     *
     * <p>This is an asynchronous operation; the local peering gateway's `lifecycleState` changes to
     * TERMINATING temporarily until the local peering gateway is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteLocalPeeringGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteLocalPeeringGateway API.
     */
    DeleteLocalPeeringGatewayResponse deleteLocalPeeringGateway(
            DeleteLocalPeeringGatewayRequest request);

    /**
     * Deletes the specified NAT gateway. The NAT gateway does not have to be disabled, but there
     * must not be a route rule that lists the NAT gateway as a target.
     *
     * <p>This is an asynchronous operation. The NAT gateway's `lifecycleState` will change to
     * TERMINATING temporarily until the NAT gateway is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteNatGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteNatGateway
     *     API.
     */
    DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request);

    /**
     * Deletes the specified network security group. The group must not contain any VNICs.
     *
     * <p>To get a list of the VNICs in a network security group, use {@link
     * #listNetworkSecurityGroupVnics(ListNetworkSecurityGroupVnicsRequest)
     * listNetworkSecurityGroupVnics}. Each returned {@link NetworkSecurityGroupVnic} object
     * contains both the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VNIC and
     * the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * VNIC's parent resource (for example, the Compute instance that the VNIC is attached to).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteNetworkSecurityGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteNetworkSecurityGroup API.
     */
    DeleteNetworkSecurityGroupResponse deleteNetworkSecurityGroup(
            DeleteNetworkSecurityGroupRequest request);

    /**
     * Unassigns and deletes the specified private IP. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). The private IP
     * address is returned to the subnet's pool of available addresses.
     *
     * <p>This operation cannot be used with primary private IPs, which are automatically unassigned
     * and deleted when the VNIC is terminated.
     *
     * <p>*Important:** If a secondary private IP is the [target of a route
     * rule](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip),
     * unassigning it from the VNIC causes that route rule to blackhole and the traffic will be
     * dropped.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeletePrivateIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePrivateIp
     *     API.
     */
    DeletePrivateIpResponse deletePrivateIp(DeletePrivateIpRequest request);

    /**
     * Unassigns and deletes the specified public IP (either ephemeral or reserved). You must
     * specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). The public IP
     * address is returned to the Oracle Cloud Infrastructure public IP pool.
     *
     * <p>*Note:** You cannot update, unassign, or delete the public IP that Oracle automatically
     * assigned to an entity for you (such as a load balancer or NAT gateway). The public IP is
     * automatically deleted if the assigned entity is terminated.
     *
     * <p>For an assigned reserved public IP, the initial unassignment portion of this operation is
     * asynchronous. Poll the public IP's `lifecycleState` to determine if the operation succeeded.
     *
     * <p>If you want to simply unassign a reserved public IP and return it to your pool of reserved
     * public IPs, instead use {@link #updatePublicIp(UpdatePublicIpRequest) updatePublicIp}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeletePublicIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePublicIp API.
     */
    DeletePublicIpResponse deletePublicIp(DeletePublicIpRequest request);

    /**
     * Deletes the specified public IP pool. To delete a public IP pool it must not have any active
     * IP address allocations. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) when deleting
     * an IP pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeletePublicIpPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePublicIpPool
     *     API.
     */
    DeletePublicIpPoolResponse deletePublicIpPool(DeletePublicIpPoolRequest request);

    /**
     * Deletes the remote peering connection (RPC).
     *
     * <p>This is an asynchronous operation; the RPC's `lifecycleState` changes to TERMINATING
     * temporarily until the RPC is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteRemotePeeringConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteRemotePeeringConnection API.
     */
    DeleteRemotePeeringConnectionResponse deleteRemotePeeringConnection(
            DeleteRemotePeeringConnectionRequest request);

    /**
     * Deletes the specified route table, but only if it's not associated with a subnet. You can't
     * delete a VCN's default route table.
     *
     * <p>This is an asynchronous operation. The route table's `lifecycleState` will change to
     * TERMINATING temporarily until the route table is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteRouteTable
     *     API.
     */
    DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request);

    /**
     * Deletes the specified security list, but only if it's not associated with a subnet. You can't
     * delete a VCN's default security list.
     *
     * <p>This is an asynchronous operation. The security list's `lifecycleState` will change to
     * TERMINATING temporarily until the security list is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteSecurityListExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSecurityList
     *     API.
     */
    DeleteSecurityListResponse deleteSecurityList(DeleteSecurityListRequest request);

    /**
     * Deletes the specified service gateway. There must not be a route table that lists the service
     * gateway as a target.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteServiceGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteServiceGateway API.
     */
    DeleteServiceGatewayResponse deleteServiceGateway(DeleteServiceGatewayRequest request);

    /**
     * Deletes the specified subnet, but only if there are no instances in the subnet. This is an
     * asynchronous operation. The subnet's `lifecycleState` will change to TERMINATING temporarily.
     * If there are any instances in the subnet, the state will instead change back to AVAILABLE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteSubnetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSubnet API.
     */
    DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request);

    /**
     * Deletes the specified VCN. The VCN must be completely empty and have no attached gateways.
     * This is an asynchronous operation.
     *
     * <p>A deleted VCN's `lifecycleState` changes to TERMINATING and then TERMINATED temporarily
     * until the VCN is completely removed. A completely removed VCN does not appear in the results
     * of a `ListVcns` operation and can't be used in a `GetVcn` operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVcnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVcn API.
     */
    DeleteVcnResponse deleteVcn(DeleteVcnRequest request);

    /**
     * Deletes the specified virtual circuit.
     *
     * <p>*Important:** If you're using FastConnect via a provider, make sure to also terminate the
     * connection with the provider, or else the provider may continue to bill you.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVirtualCircuitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteVirtualCircuit API.
     */
    DeleteVirtualCircuitResponse deleteVirtualCircuit(DeleteVirtualCircuitRequest request);

    /**
     * Deletes the specified VLAN, but only if there are no VNICs in the VLAN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVlan API.
     */
    DeleteVlanResponse deleteVlan(DeleteVlanRequest request);

    /**
     * Deletes the specified VTAP. This is an asynchronous operation. The VTAP's `lifecycleState`
     * will change to TERMINATING temporarily until the VTAP is completely removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteVtapExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteVtap API.
     */
    DeleteVtapResponse deleteVtap(DeleteVtapRequest request);

    /**
     * Removes the specified {@link Service} from the list of enabled `Service` objects for the
     * specified gateway. You do not need to remove any route rules that specify this `Service`
     * object's `cidrBlock` as the destination CIDR. However, consider removing the rules if your
     * intent is to permanently disable use of the `Service` through this service gateway.
     *
     * <p>*Note:** The `DetachServiceId` operation is an easy way to remove an individual `Service`
     * from the service gateway. Compare it with {@link
     * #updateServiceGateway(UpdateServiceGatewayRequest) updateServiceGateway}, which replaces the
     * entire existing list of enabled `Service` objects with the list that you provide in the
     * `Update` call. `UpdateServiceGateway` also lets you block all traffic through the service
     * gateway without having to remove each of the individual `Service` objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DetachServiceIdExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetachServiceId
     *     API.
     */
    DetachServiceIdResponse detachServiceId(DetachServiceIdRequest request);

    /**
     * Returns a complete list of DRG attachments that belong to a particular DRG.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetAllDrgAttachmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAllDrgAttachments API.
     */
    GetAllDrgAttachmentsResponse getAllDrgAttachments(GetAllDrgAttachmentsRequest request);

    /**
     * The parameters allowed for IKE IPSec tunnels.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetAllowedIkeIPSecParametersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetAllowedIkeIPSecParameters API.
     */
    GetAllowedIkeIPSecParametersResponse getAllowedIkeIPSecParameters(
            GetAllowedIkeIPSecParametersRequest request);

    /**
     * Gets the `Byoasn` resource. You must specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetByoasnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetByoasn API.
     */
    GetByoasnResponse getByoasn(GetByoasnRequest request);

    /**
     * Gets the `ByoipRange` resource. You must specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetByoipRange API.
     */
    GetByoipRangeResponse getByoipRange(GetByoipRangeRequest request);

    /**
     * Gets information about the specified VTAP capture filter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCaptureFilterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCaptureFilter
     *     API.
     */
    GetCaptureFilterResponse getCaptureFilter(GetCaptureFilterRequest request);

    /**
     * Gets the specified CPE's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCpeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCpe API.
     */
    GetCpeResponse getCpe(GetCpeRequest request);

    /**
     * Renders a set of CPE configuration content that can help a network engineer configure the
     * actual CPE device (for example, a hardware router) represented by the specified {@link Cpe}
     * object.
     *
     * <p>The rendered content is specific to the type of CPE device (for example, Cisco ASA).
     * Therefore the {@link Cpe} must have the CPE's device type specified by the `cpeDeviceShapeId`
     * attribute. The content optionally includes answers that the customer provides (see {@link
     * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}), merged with a template of other information specific to the
     * CPE device type.
     *
     * <p>The operation returns configuration information for *all* of the {@link IPSecConnection}
     * objects that use the specified CPE. Here are similar operations:
     *
     * <p>{@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} returns CPE configuration content for all IPSec tunnels in a
     * single IPSec connection. * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent} returns CPE configuration content for a specific IPSec
     * tunnel in an IPSec connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCpeDeviceConfigContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCpeDeviceConfigContent API.
     */
    GetCpeDeviceConfigContentResponse getCpeDeviceConfigContent(
            GetCpeDeviceConfigContentRequest request);

    /**
     * Gets the detailed information about the specified CPE device type. This might include a set
     * of questions that are specific to the particular CPE device type. The customer must supply
     * answers to those questions (see {@link
     * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}). The service merges the answers with a template of other
     * information for the CPE device type. The following operations return the merged content:
     *
     * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} * {@link
     * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent}
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCpeDeviceShapeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCpeDeviceShape
     *     API.
     */
    GetCpeDeviceShapeResponse getCpeDeviceShape(GetCpeDeviceShapeRequest request);

    /**
     * Gets the specified cross-connect's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCrossConnectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCrossConnect
     *     API.
     */
    GetCrossConnectResponse getCrossConnect(GetCrossConnectRequest request);

    /**
     * Gets the specified cross-connect group's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCrossConnectGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCrossConnectGroup API.
     */
    GetCrossConnectGroupResponse getCrossConnectGroup(GetCrossConnectGroupRequest request);

    /**
     * Gets the Letter of Authority for the specified cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCrossConnectLetterOfAuthorityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCrossConnectLetterOfAuthority API.
     */
    GetCrossConnectLetterOfAuthorityResponse getCrossConnectLetterOfAuthority(
            GetCrossConnectLetterOfAuthorityRequest request);

    /**
     * Gets the status of the specified cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetCrossConnectStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCrossConnectStatus API.
     */
    GetCrossConnectStatusResponse getCrossConnectStatus(GetCrossConnectStatusRequest request);

    /**
     * Gets the specified set of DHCP options.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDhcpOptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDhcpOptions API.
     */
    GetDhcpOptionsResponse getDhcpOptions(GetDhcpOptionsRequest request);

    /**
     * Gets the specified DRG's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDrgExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDrg API.
     */
    GetDrgResponse getDrg(GetDrgRequest request);

    /**
     * Gets the `DrgAttachment` resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDrgAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDrgAttachment
     *     API.
     */
    GetDrgAttachmentResponse getDrgAttachment(GetDrgAttachmentRequest request);

    /**
     * Gets the redundancy status for the specified DRG. For more information, see [Redundancy
     * Remedies](https://docs.oracle.com/iaas/Content/Network/Troubleshoot/drgredundancy.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDrgRedundancyStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDrgRedundancyStatus API.
     */
    GetDrgRedundancyStatusResponse getDrgRedundancyStatus(GetDrgRedundancyStatusRequest request);

    /**
     * Gets the specified route distribution's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDrgRouteDistributionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetDrgRouteDistribution API.
     */
    GetDrgRouteDistributionResponse getDrgRouteDistribution(GetDrgRouteDistributionRequest request);

    /**
     * Gets the specified DRG route table's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetDrgRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDrgRouteTable
     *     API.
     */
    GetDrgRouteTableResponse getDrgRouteTable(GetDrgRouteTableRequest request);

    /**
     * Gets the specified provider service. For more information, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetFastConnectProviderServiceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetFastConnectProviderService API.
     */
    GetFastConnectProviderServiceResponse getFastConnectProviderService(
            GetFastConnectProviderServiceRequest request);

    /**
     * Gets the specified provider service key's information. Use this operation to validate a
     * provider service key. An invalid key returns a 404 error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetFastConnectProviderServiceKeyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetFastConnectProviderServiceKey API.
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
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIPSecConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIPSecConnection
     *     API.
     */
    GetIPSecConnectionResponse getIPSecConnection(GetIPSecConnectionRequest request);

    /**
     * Deprecated. To get tunnel information, instead use:
     *
     * <p>{@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest)
     * getIPSecConnectionTunnel} * {@link
     * #getIPSecConnectionTunnelSharedSecret(GetIPSecConnectionTunnelSharedSecretRequest)
     * getIPSecConnectionTunnelSharedSecret}
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIPSecConnectionDeviceConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetIPSecConnectionDeviceConfig API.
     */
    GetIPSecConnectionDeviceConfigResponse getIPSecConnectionDeviceConfig(
            GetIPSecConnectionDeviceConfigRequest request);

    /**
     * Deprecated. To get the tunnel status, instead use {@link
     * #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest) getIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIPSecConnectionDeviceStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetIPSecConnectionDeviceStatus API.
     */
    GetIPSecConnectionDeviceStatusResponse getIPSecConnectionDeviceStatus(
            GetIPSecConnectionDeviceStatusRequest request);

    /**
     * Gets the specified tunnel's information. The resulting object does not include the tunnel's
     * shared secret (pre-shared key). To retrieve that, use {@link
     * #getIPSecConnectionTunnelSharedSecret(GetIPSecConnectionTunnelSharedSecretRequest)
     * getIPSecConnectionTunnelSharedSecret}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIPSecConnectionTunnelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetIPSecConnectionTunnel API.
     */
    GetIPSecConnectionTunnelResponse getIPSecConnectionTunnel(
            GetIPSecConnectionTunnelRequest request);

    /**
     * Gets the identified error for the specified IPSec tunnel ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIPSecConnectionTunnelErrorExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetIPSecConnectionTunnelError API.
     */
    GetIPSecConnectionTunnelErrorResponse getIPSecConnectionTunnelError(
            GetIPSecConnectionTunnelErrorRequest request);

    /**
     * Gets the specified tunnel's shared secret (pre-shared key). To get other information about
     * the tunnel, use {@link #getIPSecConnectionTunnel(GetIPSecConnectionTunnelRequest)
     * getIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIPSecConnectionTunnelSharedSecretExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetIPSecConnectionTunnelSharedSecret API.
     */
    GetIPSecConnectionTunnelSharedSecretResponse getIPSecConnectionTunnelSharedSecret(
            GetIPSecConnectionTunnelSharedSecretRequest request);

    /**
     * Gets the specified internet gateway's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInternetGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetInternetGateway
     *     API.
     */
    GetInternetGatewayResponse getInternetGateway(GetInternetGatewayRequest request);

    /**
     * Renders a set of CPE configuration content for the specified IPSec connection (for all the
     * tunnels in the connection). The content helps a network engineer configure the actual CPE
     * device (for example, a hardware router) that the specified IPSec connection terminates on.
     *
     * <p>The rendered content is specific to the type of CPE device (for example, Cisco ASA).
     * Therefore the {@link Cpe} used by the specified {@link IPSecConnection} must have the CPE's
     * device type specified by the `cpeDeviceShapeId` attribute. The content optionally includes
     * answers that the customer provides (see {@link
     * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}), merged with a template of other information specific to the
     * CPE device type.
     *
     * <p>The operation returns configuration information for all tunnels in the single specified
     * {@link IPSecConnection} object. Here are other similar operations:
     *
     * <p>{@link #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent} returns CPE configuration content for a specific tunnel
     * within an IPSec connection. * {@link
     * #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest) getCpeDeviceConfigContent}
     * returns CPE configuration content for *all* IPSec connections that use a specific CPE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIpsecCpeDeviceConfigContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetIpsecCpeDeviceConfigContent API.
     */
    GetIpsecCpeDeviceConfigContentResponse getIpsecCpeDeviceConfigContent(
            GetIpsecCpeDeviceConfigContentRequest request);

    /**
     * Gets the specified IPv6. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Alternatively,
     * you can get the object by using {@link #listIpv6s(ListIpv6sRequest) listIpv6s} with the IPv6
     * address (for example, 2001:0db8:0123:1111:98fe:dcba:9876:4321) and subnet
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetIpv6Example.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetIpv6 API.
     */
    GetIpv6Response getIpv6(GetIpv6Request request);

    /**
     * Gets the specified local peering gateway's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetLocalPeeringGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetLocalPeeringGateway API.
     */
    GetLocalPeeringGatewayResponse getLocalPeeringGateway(GetLocalPeeringGatewayRequest request);

    /**
     * Gets the specified NAT gateway's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetNatGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetNatGateway API.
     */
    GetNatGatewayResponse getNatGateway(GetNatGatewayRequest request);

    /**
     * Gets the specified network security group's information.
     *
     * <p>To list the VNICs in an NSG, see {@link
     * #listNetworkSecurityGroupVnics(ListNetworkSecurityGroupVnicsRequest)
     * listNetworkSecurityGroupVnics}.
     *
     * <p>To list the security rules in an NSG, see {@link
     * #listNetworkSecurityGroupSecurityRules(ListNetworkSecurityGroupSecurityRulesRequest)
     * listNetworkSecurityGroupSecurityRules}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetNetworkSecurityGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetNetworkSecurityGroup API.
     */
    GetNetworkSecurityGroupResponse getNetworkSecurityGroup(GetNetworkSecurityGroupRequest request);

    /**
     * Gets a virtual networking topology for the current region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetNetworkingTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetNetworkingTopology API.
     */
    GetNetworkingTopologyResponse getNetworkingTopology(GetNetworkingTopologyRequest request);

    /**
     * Gets the specified private IP. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Alternatively,
     * you can get the object by using {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps}
     * with the private IP address (for example, 10.0.3.3) and subnet
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPrivateIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPrivateIp API.
     */
    GetPrivateIpResponse getPrivateIp(GetPrivateIpRequest request);

    /**
     * Gets the specified public IP. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>Alternatively, you can get the object by using {@link
     * #getPublicIpByIpAddress(GetPublicIpByIpAddressRequest) getPublicIpByIpAddress} with the
     * public IP address (for example, 203.0.113.2).
     *
     * <p>Or you can use {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest)
     * getPublicIpByPrivateIpId} with the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the private
     * IP that the public IP is assigned to.
     *
     * <p>*Note:** If you're fetching a reserved public IP that is in the process of being moved to
     * a different private IP, the service returns the public IP object with `lifecycleState` =
     * ASSIGNING and `assignedEntityId` =
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the target
     * private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPublicIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPublicIp API.
     */
    GetPublicIpResponse getPublicIp(GetPublicIpRequest request);

    /**
     * Gets the public IP based on the public IP address (for example, 203.0.113.2).
     *
     * <p>*Note:** If you're fetching a reserved public IP that is in the process of being moved to
     * a different private IP, the service returns the public IP object with `lifecycleState` =
     * ASSIGNING and `assignedEntityId` =
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the target
     * private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPublicIpByIpAddressExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPublicIpByIpAddress API.
     */
    GetPublicIpByIpAddressResponse getPublicIpByIpAddress(GetPublicIpByIpAddressRequest request);

    /**
     * Gets the public IP assigned to the specified private IP. You must specify the OCID of the
     * private IP. If no public IP is assigned, a 404 is returned.
     *
     * <p>*Note:** If you're fetching a reserved public IP that is in the process of being moved to
     * a different private IP, and you provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the original
     * private IP, this operation returns a 404. If you instead provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the target
     * private IP, or if you instead call {@link #getPublicIp(GetPublicIpRequest) getPublicIp} or
     * {@link #getPublicIpByIpAddress(GetPublicIpByIpAddressRequest) getPublicIpByIpAddress}, the
     * service returns the public IP object with `lifecycleState` = ASSIGNING and `assignedEntityId`
     * = [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the target
     * private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPublicIpByPrivateIpIdExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPublicIpByPrivateIpId API.
     */
    GetPublicIpByPrivateIpIdResponse getPublicIpByPrivateIpId(
            GetPublicIpByPrivateIpIdRequest request);

    /**
     * Gets the specified `PublicIpPool` object. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetPublicIpPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPublicIpPool
     *     API.
     */
    GetPublicIpPoolResponse getPublicIpPool(GetPublicIpPoolRequest request);

    /**
     * Get the specified remote peering connection's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetRemotePeeringConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetRemotePeeringConnection API.
     */
    GetRemotePeeringConnectionResponse getRemotePeeringConnection(
            GetRemotePeeringConnectionRequest request);

    /**
     * Gets the `IpInventory` resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetResourceIpInventoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetResourceIpInventory API.
     */
    GetResourceIpInventoryResponse getResourceIpInventory(GetResourceIpInventoryRequest request);

    /**
     * Gets the specified route table's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetRouteTable API.
     */
    GetRouteTableResponse getRouteTable(GetRouteTableRequest request);

    /**
     * Gets the specified security list's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetSecurityListExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSecurityList
     *     API.
     */
    GetSecurityListResponse getSecurityList(GetSecurityListRequest request);

    /**
     * Gets the specified {@link Service} object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetServiceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetService API.
     */
    GetServiceResponse getService(GetServiceRequest request);

    /**
     * Gets the specified service gateway's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetServiceGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetServiceGateway
     *     API.
     */
    GetServiceGatewayResponse getServiceGateway(GetServiceGatewayRequest request);

    /**
     * Gets the specified subnet's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetSubnetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSubnet API.
     */
    GetSubnetResponse getSubnet(GetSubnetRequest request);

    /**
     * Gets the CIDR utilization data of the specified subnet. Specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetSubnetCidrUtilizationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSubnetCidrUtilization API.
     */
    GetSubnetCidrUtilizationResponse getSubnetCidrUtilization(
            GetSubnetCidrUtilizationRequest request);

    /**
     * Gets the IP Inventory data of the specified subnet. Specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetSubnetIpInventoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetSubnetIpInventory API.
     */
    GetSubnetIpInventoryResponse getSubnetIpInventory(GetSubnetIpInventoryRequest request);

    /**
     * Gets a topology for a given subnet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetSubnetTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSubnetTopology
     *     API.
     */
    GetSubnetTopologyResponse getSubnetTopology(GetSubnetTopologyRequest request);

    /**
     * Gets the set of CPE configuration answers for the tunnel, which the customer provided in
     * {@link #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}. To get the full set of content for the tunnel (any answers
     * merged with the template of other information specific to the CPE device type), use {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetTunnelCpeDeviceConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetTunnelCpeDeviceConfig API.
     */
    GetTunnelCpeDeviceConfigResponse getTunnelCpeDeviceConfig(
            GetTunnelCpeDeviceConfigRequest request);

    /**
     * Renders a set of CPE configuration content for the specified IPSec tunnel. The content helps
     * a network engineer configure the actual CPE device (for example, a hardware router) that the
     * specified IPSec tunnel terminates on.
     *
     * <p>The rendered content is specific to the type of CPE device (for example, Cisco ASA).
     * Therefore the {@link Cpe} used by the specified {@link IPSecConnection} must have the CPE's
     * device type specified by the `cpeDeviceShapeId` attribute. The content optionally includes
     * answers that the customer provides (see {@link
     * #updateTunnelCpeDeviceConfig(UpdateTunnelCpeDeviceConfigRequest)
     * updateTunnelCpeDeviceConfig}), merged with a template of other information specific to the
     * CPE device type.
     *
     * <p>The operation returns configuration information for only the specified IPSec tunnel. Here
     * are other similar operations:
     *
     * <p>{@link #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} returns CPE configuration content for all tunnels in a single
     * IPSec connection. * {@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} returns CPE configuration content for *all* IPSec connections that
     * use a specific CPE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetTunnelCpeDeviceConfigContentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetTunnelCpeDeviceConfigContent API.
     */
    GetTunnelCpeDeviceConfigContentResponse getTunnelCpeDeviceConfigContent(
            GetTunnelCpeDeviceConfigContentRequest request);

    /**
     * Returns the DRG upgrade status. The status can be not updated, in progress, or updated. Also
     * indicates how much of the upgrade is completed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetUpgradeStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetUpgradeStatus
     *     API.
     */
    GetUpgradeStatusResponse getUpgradeStatus(GetUpgradeStatusRequest request);

    /**
     * Gets the specified VCN's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVcnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVcn API.
     */
    GetVcnResponse getVcn(GetVcnRequest request);

    /**
     * Get the associated DNS resolver information with a vcn
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVcnDnsResolverAssociationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetVcnDnsResolverAssociation API.
     */
    GetVcnDnsResolverAssociationResponse getVcnDnsResolverAssociation(
            GetVcnDnsResolverAssociationRequest request);

    /**
     * Gets the CIDR overlap information of the specified VCN in selected compartments. Specify the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVcnOverlapExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVcnOverlap API.
     */
    GetVcnOverlapResponse getVcnOverlap(GetVcnOverlapRequest request);

    /**
     * Gets a virtual network topology for a given VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVcnTopologyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVcnTopology API.
     */
    GetVcnTopologyResponse getVcnTopology(GetVcnTopologyRequest request);

    /**
     * Gets the specified virtual circuit's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVirtualCircuitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVirtualCircuit
     *     API.
     */
    GetVirtualCircuitResponse getVirtualCircuit(GetVirtualCircuitRequest request);

    /**
     * Gets the specified VLAN's information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVlan API.
     */
    GetVlanResponse getVlan(GetVlanRequest request);

    /**
     * Gets the information for the specified virtual network interface card (VNIC). You can get the
     * VNIC [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) from the
     * {@link #listVnicAttachments(ListVnicAttachmentsRequest) listVnicAttachments} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVnicExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVnic API.
     */
    GetVnicResponse getVnic(GetVnicRequest request);

    /**
     * Gets the specified `Vtap` resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetVtapExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetVtap API.
     */
    GetVtapResponse getVtap(GetVtapRequest request);

    /**
     * Unassign the specified IPv6 address from Virtual Network Interface Card (VNIC). You must
     * specify the IPv6
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/Ipv6VnicDetachExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Ipv6VnicDetach API.
     */
    Ipv6VnicDetachResponse ipv6VnicDetach(Ipv6VnicDetachRequest request);

    /**
     * Lists the regions that support remote VCN peering (which is peering across regions). For more
     * information, see [VCN
     * Peering](https://docs.oracle.com/iaas/Content/Network/Tasks/VCNpeering.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListAllowedPeerRegionsForRemotePeeringExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAllowedPeerRegionsForRemotePeering API.
     */
    ListAllowedPeerRegionsForRemotePeeringResponse listAllowedPeerRegionsForRemotePeering(
            ListAllowedPeerRegionsForRemotePeeringRequest request);

    /**
     * Lists the `Byoasn` resources in the specified compartment. You can filter the list using
     * query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListByoasnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListByoasns API.
     */
    ListByoasnsResponse listByoasns(ListByoasnsRequest request);

    /**
     * Lists the subranges of a BYOIP CIDR block currently allocated to an IP pool. Each
     * `ByoipAllocatedRange` object also lists the IP pool where it is allocated.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListByoipAllocatedRangesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListByoipAllocatedRanges API.
     */
    ListByoipAllocatedRangesResponse listByoipAllocatedRanges(
            ListByoipAllocatedRangesRequest request);

    /**
     * Lists the `ByoipRange` resources in the specified compartment. You can filter the list using
     * query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListByoipRangesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListByoipRanges
     *     API.
     */
    ListByoipRangesResponse listByoipRanges(ListByoipRangesRequest request);

    /**
     * Lists the capture filters in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCaptureFiltersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCaptureFilters
     *     API.
     */
    ListCaptureFiltersResponse listCaptureFilters(ListCaptureFiltersRequest request);

    /**
     * Lists the CPE device types that the Networking service provides CPE configuration content for
     * (example: Cisco ASA). The content helps a network engineer configure the actual CPE device
     * represented by a {@link Cpe} object.
     *
     * <p>If you want to generate CPE configuration content for one of the returned CPE device
     * types, ensure that the {@link Cpe} object's `cpeDeviceShapeId` attribute is set to the CPE
     * device type's [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * (returned by this operation).
     *
     * <p>For information about generating CPE configuration content, see these operations:
     *
     * <p>{@link #getCpeDeviceConfigContent(GetCpeDeviceConfigContentRequest)
     * getCpeDeviceConfigContent} * {@link
     * #getIpsecCpeDeviceConfigContent(GetIpsecCpeDeviceConfigContentRequest)
     * getIpsecCpeDeviceConfigContent} * {@link
     * #getTunnelCpeDeviceConfigContent(GetTunnelCpeDeviceConfigContentRequest)
     * getTunnelCpeDeviceConfigContent}
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCpeDeviceShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCpeDeviceShapes
     *     API.
     */
    ListCpeDeviceShapesResponse listCpeDeviceShapes(ListCpeDeviceShapesRequest request);

    /**
     * Lists the customer-premises equipment objects (CPEs) in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCpesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCpes API.
     */
    ListCpesResponse listCpes(ListCpesRequest request);

    /**
     * Lists the cross-connect groups in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCrossConnectGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCrossConnectGroups API.
     */
    ListCrossConnectGroupsResponse listCrossConnectGroups(ListCrossConnectGroupsRequest request);

    /**
     * Lists the available FastConnect locations for cross-connect installation. You need this
     * information so you can specify your desired location when you create a cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCrossConnectLocationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCrossConnectLocations API.
     */
    ListCrossConnectLocationsResponse listCrossConnectLocations(
            ListCrossConnectLocationsRequest request);

    /**
     * Lists the Cross Connect mapping Details for the specified virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCrossConnectMappingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCrossConnectMappings API.
     */
    ListCrossConnectMappingsResponse listCrossConnectMappings(
            ListCrossConnectMappingsRequest request);

    /**
     * Lists the cross-connects in the specified compartment. You can filter the list by specifying
     * the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * cross-connect group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCrossConnectsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCrossConnects
     *     API.
     */
    ListCrossConnectsResponse listCrossConnects(ListCrossConnectsRequest request);

    /**
     * Lists the available port speeds for cross-connects. You need this information so you can
     * specify your desired port speed (that is, shape) when you create a cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListCrossconnectPortSpeedShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCrossconnectPortSpeedShapes API.
     */
    ListCrossconnectPortSpeedShapesResponse listCrossconnectPortSpeedShapes(
            ListCrossconnectPortSpeedShapesRequest request);

    /**
     * Lists the sets of DHCP options in the specified VCN and specified compartment. If the VCN ID
     * is not provided, then the list includes the sets of DHCP options from all VCNs in the
     * specified compartment. The response includes the default set of options that automatically
     * comes with each VCN, plus any other sets you've created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDhcpOptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDhcpOptions
     *     API.
     */
    ListDhcpOptionsResponse listDhcpOptions(ListDhcpOptionsRequest request);

    /**
     * Lists the `DrgAttachment` resource for the specified compartment. You can filter the results
     * by DRG, attached network, attachment type, DRG route table or VCN route table.
     *
     * <p>The LIST API lists DRG attachments by attachment type. It will default to list VCN
     * attachments, but you may request to list ALL attachments of ALL types.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDrgAttachmentsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDrgAttachments
     *     API.
     */
    ListDrgAttachmentsResponse listDrgAttachments(ListDrgAttachmentsRequest request);

    /**
     * Lists the statements for the specified route distribution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDrgRouteDistributionStatementsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDrgRouteDistributionStatements API.
     */
    ListDrgRouteDistributionStatementsResponse listDrgRouteDistributionStatements(
            ListDrgRouteDistributionStatementsRequest request);

    /**
     * Lists the route distributions in the specified DRG.
     *
     * <p>To retrieve the statements in a distribution, use the ListDrgRouteDistributionStatements
     * operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDrgRouteDistributionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDrgRouteDistributions API.
     */
    ListDrgRouteDistributionsResponse listDrgRouteDistributions(
            ListDrgRouteDistributionsRequest request);

    /**
     * Lists the route rules in the specified DRG route table.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDrgRouteRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDrgRouteRules
     *     API.
     */
    ListDrgRouteRulesResponse listDrgRouteRules(ListDrgRouteRulesRequest request);

    /**
     * Lists the DRG route tables for the specified DRG.
     *
     * <p>Use the `ListDrgRouteRules` operation to retrieve the route rules in a table.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDrgRouteTablesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDrgRouteTables
     *     API.
     */
    ListDrgRouteTablesResponse listDrgRouteTables(ListDrgRouteTablesRequest request);

    /**
     * Lists the DRGs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListDrgsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDrgs API.
     */
    ListDrgsResponse listDrgs(ListDrgsRequest request);

    /**
     * Lists the service offerings from supported providers. You need this information so you can
     * specify your desired provider and service offering when you create a virtual circuit.
     *
     * <p>For the compartment ID, provide the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of your tenancy
     * (the root compartment).
     *
     * <p>For more information, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListFastConnectProviderServicesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListFastConnectProviderServices API.
     */
    ListFastConnectProviderServicesResponse listFastConnectProviderServices(
            ListFastConnectProviderServicesRequest request);

    /**
     * Gets the list of available virtual circuit bandwidth levels for a provider. You need this
     * information so you can specify your desired bandwidth level (shape) when you create a virtual
     * circuit.
     *
     * <p>For more information about virtual circuits, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListFastConnectProviderVirtualCircuitBandwidthShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListFastConnectProviderVirtualCircuitBandwidthShapes API.
     */
    ListFastConnectProviderVirtualCircuitBandwidthShapesResponse
            listFastConnectProviderVirtualCircuitBandwidthShapes(
                    ListFastConnectProviderVirtualCircuitBandwidthShapesRequest request);

    /**
     * The routes advertised to the on-premises network and the routes received from the on-premises
     * network.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIPSecConnectionTunnelRoutesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListIPSecConnectionTunnelRoutes API.
     */
    ListIPSecConnectionTunnelRoutesResponse listIPSecConnectionTunnelRoutes(
            ListIPSecConnectionTunnelRoutesRequest request);

    /**
     * Lists the tunnel security associations information for the specified IPSec tunnel ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIPSecConnectionTunnelSecurityAssociationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListIPSecConnectionTunnelSecurityAssociations API.
     */
    ListIPSecConnectionTunnelSecurityAssociationsResponse
            listIPSecConnectionTunnelSecurityAssociations(
                    ListIPSecConnectionTunnelSecurityAssociationsRequest request);

    /**
     * Lists the tunnel information for the specified IPSec connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIPSecConnectionTunnelsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListIPSecConnectionTunnels API.
     */
    ListIPSecConnectionTunnelsResponse listIPSecConnectionTunnels(
            ListIPSecConnectionTunnelsRequest request);

    /**
     * Lists the IPSec connections for the specified compartment. You can filter the results by DRG
     * or CPE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIPSecConnectionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListIPSecConnections API.
     */
    ListIPSecConnectionsResponse listIPSecConnections(ListIPSecConnectionsRequest request);

    /**
     * Lists the internet gateways in the specified VCN and the specified compartment. If the VCN ID
     * is not provided, then the list includes the internet gateways from all VCNs in the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInternetGatewaysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListInternetGateways API.
     */
    ListInternetGatewaysResponse listInternetGateways(ListInternetGatewaysRequest request);

    /**
     * Lists the IP Inventory information in the selected compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIpInventoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIpInventory
     *     API.
     */
    ListIpInventoryResponse listIpInventory(ListIpInventoryRequest request);

    /**
     * Lists the {@link Ipv6} objects based on one of these filters:
     *
     * <p>Subnet [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). *
     * VNIC [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). * Both
     * IPv6 address and subnet OCID: This lets you get an `Ipv6` object based on its private IPv6
     * address (for example, 2001:0db8:0123:1111:abcd:ef01:2345:6789) and not its
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). For
     * comparison, {@link #getIpv6(GetIpv6Request) getIpv6} requires the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListIpv6sExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListIpv6s API.
     */
    ListIpv6sResponse listIpv6s(ListIpv6sRequest request);

    /**
     * Lists the local peering gateways (LPGs) for the specified VCN and specified compartment. If
     * the VCN ID is not provided, then the list includes the LPGs from all VCNs in the specified
     * compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListLocalPeeringGatewaysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListLocalPeeringGateways API.
     */
    ListLocalPeeringGatewaysResponse listLocalPeeringGateways(
            ListLocalPeeringGatewaysRequest request);

    /**
     * Lists the NAT gateways in the specified compartment. You may optionally specify a VCN OCID to
     * filter the results by VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListNatGatewaysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListNatGateways
     *     API.
     */
    ListNatGatewaysResponse listNatGateways(ListNatGatewaysRequest request);

    /**
     * Lists the security rules in the specified network security group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListNetworkSecurityGroupSecurityRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListNetworkSecurityGroupSecurityRules API.
     */
    ListNetworkSecurityGroupSecurityRulesResponse listNetworkSecurityGroupSecurityRules(
            ListNetworkSecurityGroupSecurityRulesRequest request);

    /**
     * Lists the VNICs in the specified network security group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListNetworkSecurityGroupVnicsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListNetworkSecurityGroupVnics API.
     */
    ListNetworkSecurityGroupVnicsResponse listNetworkSecurityGroupVnics(
            ListNetworkSecurityGroupVnicsRequest request);

    /**
     * Lists either the network security groups in the specified compartment, or those associated
     * with the specified VLAN. You must specify either a `vlanId` or a `compartmentId`, but not
     * both. If you specify a `vlanId`, all other parameters are ignored.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListNetworkSecurityGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListNetworkSecurityGroups API.
     */
    ListNetworkSecurityGroupsResponse listNetworkSecurityGroups(
            ListNetworkSecurityGroupsRequest request);

    /**
     * Lists the {@link PrivateIp} objects based on one of these filters:
     *
     * <p>- Subnet [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). -
     * VNIC [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). - Both
     * private IP address and subnet OCID: This lets you get a `privateIP` object based on its
     * private IP address (for example, 10.0.3.3) and not its
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). For
     * comparison, {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} requires the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * <p>If you're listing all the private IPs associated with a given subnet or VNIC, the response
     * includes both primary and secondary private IPs.
     *
     * <p>If you are an Oracle Cloud VMware Solution customer and have VLANs in your VCN, you can
     * filter the list by VLAN
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). See {@link
     * Vlan}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListPrivateIpsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPrivateIps API.
     */
    ListPrivateIpsResponse listPrivateIps(ListPrivateIpsRequest request);

    /**
     * Lists the public IP pools in the specified compartment. You can filter the list using query
     * parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListPublicIpPoolsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPublicIpPools
     *     API.
     */
    ListPublicIpPoolsResponse listPublicIpPools(ListPublicIpPoolsRequest request);

    /**
     * Lists the {@link PublicIp} objects in the specified compartment. You can filter the list by
     * using query parameters.
     *
     * <p>To list your reserved public IPs: * Set `scope` = `REGION` (required) * Leave the
     * `availabilityDomain` parameter empty * Set `lifetime` = `RESERVED`
     *
     * <p>To list the ephemeral public IPs assigned to a regional entity such as a NAT gateway: *
     * Set `scope` = `REGION` (required) * Leave the `availabilityDomain` parameter empty * Set
     * `lifetime` = `EPHEMERAL`
     *
     * <p>To list the ephemeral public IPs assigned to private IPs: * Set `scope` =
     * `AVAILABILITY_DOMAIN` (required) * Set the `availabilityDomain` parameter to the desired
     * availability domain (required) * Set `lifetime` = `EPHEMERAL`
     *
     * <p>*Note:** An ephemeral public IP assigned to a private IP is always in the same
     * availability domain and compartment as the private IP.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListPublicIpsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPublicIps API.
     */
    ListPublicIpsResponse listPublicIps(ListPublicIpsRequest request);

    /**
     * Lists the remote peering connections (RPCs) for the specified DRG and compartment (the RPC's
     * compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListRemotePeeringConnectionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListRemotePeeringConnections API.
     */
    ListRemotePeeringConnectionsResponse listRemotePeeringConnections(
            ListRemotePeeringConnectionsRequest request);

    /**
     * Lists the route tables in the specified VCN and specified compartment. If the VCN ID is not
     * provided, then the list includes the route tables from all VCNs in the specified compartment.
     * The response includes the default route table that automatically comes with each VCN in the
     * specified compartment, plus any route tables you've created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListRouteTablesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRouteTables
     *     API.
     */
    ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request);

    /**
     * Lists the security lists in the specified VCN and compartment. If the VCN ID is not provided,
     * then the list includes the security lists from all VCNs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListSecurityListsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSecurityLists
     *     API.
     */
    ListSecurityListsResponse listSecurityLists(ListSecurityListsRequest request);

    /**
     * Lists the service gateways in the specified compartment. You may optionally specify a VCN
     * OCID to filter the results by VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListServiceGatewaysExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListServiceGateways
     *     API.
     */
    ListServiceGatewaysResponse listServiceGateways(ListServiceGatewaysRequest request);

    /**
     * Lists the available {@link Service} objects that you can enable for a service gateway in this
     * region.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListServicesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListServices API.
     */
    ListServicesResponse listServices(ListServicesRequest request);

    /**
     * Lists the subnets in the specified VCN and the specified compartment. If the VCN ID is not
     * provided, then the list includes the subnets from all VCNs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListSubnetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSubnets API.
     */
    ListSubnetsResponse listSubnets(ListSubnetsRequest request);

    /**
     * Lists the virtual cloud networks (VCNs) in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVcnsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVcns API.
     */
    ListVcnsResponse listVcns(ListVcnsRequest request);

    /**
     * Gets the specified virtual circuit's associatedTunnelsInfo.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVirtualCircuitAssociatedTunnelsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVirtualCircuitAssociatedTunnels API.
     */
    ListVirtualCircuitAssociatedTunnelsResponse listVirtualCircuitAssociatedTunnels(
            ListVirtualCircuitAssociatedTunnelsRequest request);

    /**
     * The operation lists available bandwidth levels for virtual circuits. For the compartment ID,
     * provide the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * your tenancy (the root compartment).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVirtualCircuitBandwidthShapesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVirtualCircuitBandwidthShapes API.
     */
    ListVirtualCircuitBandwidthShapesResponse listVirtualCircuitBandwidthShapes(
            ListVirtualCircuitBandwidthShapesRequest request);

    /**
     * Lists the public IP prefixes and their details for the specified public virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVirtualCircuitPublicPrefixesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListVirtualCircuitPublicPrefixes API.
     */
    ListVirtualCircuitPublicPrefixesResponse listVirtualCircuitPublicPrefixes(
            ListVirtualCircuitPublicPrefixesRequest request);

    /**
     * Lists the virtual circuits in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVirtualCircuitsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVirtualCircuits
     *     API.
     */
    ListVirtualCircuitsResponse listVirtualCircuits(ListVirtualCircuitsRequest request);

    /**
     * Lists the VLANs in the specified VCN and the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVlansExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVlans API.
     */
    ListVlansResponse listVlans(ListVlansRequest request);

    /**
     * Lists the virtual test access points (VTAPs) in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVtapsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListVtaps API.
     */
    ListVtapsResponse listVtaps(ListVtapsRequest request);

    /**
     * Updates the specified CIDR block of a VCN. The new CIDR IP range must meet the following
     * criteria:
     *
     * <p>- Must be valid. - Must not overlap with another CIDR block in the VCN, a CIDR block of a
     * peered VCN, or the on-premises network CIDR block. - Must not exceed the limit of CIDR blocks
     * allowed per VCN. - Must include IP addresses from the original CIDR block that are used in
     * the VCN's existing route rules. - No IP address in an existing subnet should be outside of
     * the new CIDR block range.
     *
     * <p>*Note:** Modifying a CIDR block places your VCN in an updating state until the changes are
     * complete. You cannot create or update the VCN's subnets, VLANs, LPGs, or route tables during
     * this operation. The time to completion can vary depending on the size of your network.
     * Updating a small network could take about a minute, and updating a large network could take
     * up to an hour. You can use the `GetWorkRequest` operation to check the status of the update.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ModifyVcnCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ModifyVcnCidr API.
     */
    ModifyVcnCidrResponse modifyVcnCidr(ModifyVcnCidrRequest request);

    /**
     * Unassign the specified PrivateIP address from Virtual Network Interface Card (VNIC). You must
     * specify the PrivateIP
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/PrivateIpVnicDetachExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use PrivateIpVnicDetach
     *     API.
     */
    PrivateIpVnicDetachResponse privateIpVnicDetach(PrivateIpVnicDetachRequest request);

    /**
     * Removes one or more route distribution statements from the specified route distribution's
     * map.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveDrgRouteDistributionStatementsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveDrgRouteDistributionStatements API.
     */
    RemoveDrgRouteDistributionStatementsResponse removeDrgRouteDistributionStatements(
            RemoveDrgRouteDistributionStatementsRequest request);

    /**
     * Removes one or more route rules from the specified DRG route table.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveDrgRouteRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDrgRouteRules
     *     API.
     */
    RemoveDrgRouteRulesResponse removeDrgRouteRules(RemoveDrgRouteRulesRequest request);

    /**
     * Removes the export route distribution from the DRG attachment so no routes are advertised to
     * it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveExportDrgRouteDistributionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveExportDrgRouteDistribution API.
     */
    RemoveExportDrgRouteDistributionResponse removeExportDrgRouteDistribution(
            RemoveExportDrgRouteDistributionRequest request);

    /**
     * Removes the import route distribution from the DRG route table so no routes are imported into
     * it.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveImportDrgRouteDistributionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveImportDrgRouteDistribution API.
     */
    RemoveImportDrgRouteDistributionResponse removeImportDrgRouteDistribution(
            RemoveImportDrgRouteDistributionRequest request);

    /**
     * Remove an IPv6 prefix from a subnet. At least one IPv6 CIDR should remain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveIpv6SubnetCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveIpv6SubnetCidr API.
     */
    RemoveIpv6SubnetCidrResponse removeIpv6SubnetCidr(RemoveIpv6SubnetCidrRequest request);

    /**
     * Removing an existing IPv6 prefix from a VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveIpv6VcnCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveIpv6VcnCidr
     *     API.
     */
    RemoveIpv6VcnCidrResponse removeIpv6VcnCidr(RemoveIpv6VcnCidrRequest request);

    /**
     * Removes one or more security rules from the specified network security group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveNetworkSecurityGroupSecurityRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveNetworkSecurityGroupSecurityRules API.
     */
    RemoveNetworkSecurityGroupSecurityRulesResponse removeNetworkSecurityGroupSecurityRules(
            RemoveNetworkSecurityGroupSecurityRulesRequest request);

    /**
     * Removes a CIDR block from the referenced public IP pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemovePublicIpPoolCapacityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemovePublicIpPoolCapacity API.
     */
    RemovePublicIpPoolCapacityResponse removePublicIpPoolCapacity(
            RemovePublicIpPoolCapacityRequest request);

    /**
     * Removes a specified CIDR block from a VCN.
     *
     * <p>*Notes:** - You cannot remove a CIDR block if an IP address in its range is in use. -
     * Removing a CIDR block places your VCN in an updating state until the changes are complete.
     * You cannot create or update the VCN's subnets, VLANs, LPGs, or route tables during this
     * operation. The time to completion can take a few minutes. You can use the `GetWorkRequest`
     * operation to check the status of the update.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/RemoveVcnCidrExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveVcnCidr API.
     */
    RemoveVcnCidrResponse removeVcnCidr(RemoveVcnCidrRequest request);

    /**
     * Update BYOIP's origin ASN to byoasn.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/SetOriginAsnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SetOriginAsn API.
     */
    SetOriginAsnResponse setOriginAsn(SetOriginAsnRequest request);

    /**
     * Update prefix's origin ASN to OCI
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/SetOriginAsnToOracleExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SetOriginAsnToOracle API.
     */
    SetOriginAsnToOracleResponse setOriginAsnToOracle(SetOriginAsnToOracleRequest request);

    /**
     * Updates the tags or display name associated with the specified BYOASN Resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateByoasnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateByoasn API.
     */
    UpdateByoasnResponse updateByoasn(UpdateByoasnRequest request);

    /**
     * Updates the tags or display name associated to the specified BYOIP CIDR block.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateByoipRange
     *     API.
     */
    UpdateByoipRangeResponse updateByoipRange(UpdateByoipRangeRequest request);

    /**
     * Updates the specified VTAP capture filter's display name or tags.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateCaptureFilterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCaptureFilter
     *     API.
     */
    UpdateCaptureFilterResponse updateCaptureFilter(UpdateCaptureFilterRequest request);

    /**
     * Updates the specified CPE's display name or tags. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateCpeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCpe API.
     */
    UpdateCpeResponse updateCpe(UpdateCpeRequest request);

    /**
     * Updates the specified cross-connect.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateCrossConnectExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCrossConnect
     *     API.
     */
    UpdateCrossConnectResponse updateCrossConnect(UpdateCrossConnectRequest request);

    /**
     * Updates the specified cross-connect group's display name. Avoid entering confidential
     * information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateCrossConnectGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCrossConnectGroup API.
     */
    UpdateCrossConnectGroupResponse updateCrossConnectGroup(UpdateCrossConnectGroupRequest request);

    /**
     * Updates the specified set of DHCP options. You can update the display name or the options
     * themselves. Avoid entering confidential information.
     *
     * <p>Note that the `options` object you provide replaces the entire existing set of options.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDhcpOptionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDhcpOptions
     *     API.
     */
    UpdateDhcpOptionsResponse updateDhcpOptions(UpdateDhcpOptionsRequest request);

    /**
     * Updates the specified DRG's display name or tags. Avoid entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDrg API.
     */
    UpdateDrgResponse updateDrg(UpdateDrgRequest request);

    /**
     * Updates the display name and routing information for the specified `DrgAttachment`. Avoid
     * entering confidential information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgAttachmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDrgAttachment
     *     API.
     */
    UpdateDrgAttachmentResponse updateDrgAttachment(UpdateDrgAttachmentRequest request);

    /**
     * Updates the specified route distribution
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgRouteDistributionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDrgRouteDistribution API.
     */
    UpdateDrgRouteDistributionResponse updateDrgRouteDistribution(
            UpdateDrgRouteDistributionRequest request);

    /**
     * Updates one or more route distribution statements in the specified route distribution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgRouteDistributionStatementsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateDrgRouteDistributionStatements API.
     */
    UpdateDrgRouteDistributionStatementsResponse updateDrgRouteDistributionStatements(
            UpdateDrgRouteDistributionStatementsRequest request);

    /**
     * Updates one or more route rules in the specified DRG route table.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgRouteRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDrgRouteRules
     *     API.
     */
    UpdateDrgRouteRulesResponse updateDrgRouteRules(UpdateDrgRouteRulesRequest request);

    /**
     * Updates the specified DRG route table.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateDrgRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDrgRouteTable
     *     API.
     */
    UpdateDrgRouteTableResponse updateDrgRouteTable(UpdateDrgRouteTableRequest request);

    /**
     * Updates the specified IPSec connection.
     *
     * <p>To update an individual IPSec tunnel's attributes, use {@link
     * #updateIPSecConnectionTunnel(UpdateIPSecConnectionTunnelRequest)
     * updateIPSecConnectionTunnel}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIPSecConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateIPSecConnection API.
     */
    UpdateIPSecConnectionResponse updateIPSecConnection(UpdateIPSecConnectionRequest request);

    /**
     * Updates the specified tunnel. This operation lets you change tunnel attributes such as the
     * routing type (BGP dynamic routing or static routing). Here are some important notes:
     *
     * <p>If you change the tunnel's routing type or BGP session configuration, the tunnel will go
     * down while it's reprovisioned.
     *
     * <p>If you want to switch the tunnel's `routing` from `STATIC` to `BGP`, make sure the
     * tunnel's BGP session configuration attributes have been set ({@link
     * #bgpSessionInfo(BgpSessionInfoRequest) bgpSessionInfo}).
     *
     * <p>If you want to switch the tunnel's `routing` from `BGP` to `STATIC`, make sure the {@link
     * IPSecConnection} already has at least one valid CIDR static route.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIPSecConnectionTunnelExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateIPSecConnectionTunnel API.
     */
    UpdateIPSecConnectionTunnelResponse updateIPSecConnectionTunnel(
            UpdateIPSecConnectionTunnelRequest request);

    /**
     * Updates the shared secret (pre-shared key) for the specified tunnel.
     *
     * <p>*Important:** If you change the shared secret, the tunnel will go down while it's
     * reprovisioned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIPSecConnectionTunnelSharedSecretExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateIPSecConnectionTunnelSharedSecret API.
     */
    UpdateIPSecConnectionTunnelSharedSecretResponse updateIPSecConnectionTunnelSharedSecret(
            UpdateIPSecConnectionTunnelSharedSecretRequest request);

    /**
     * Updates the specified internet gateway. You can disable/enable it, or change its display name
     * or tags. Avoid entering confidential information.
     *
     * <p>If the gateway is disabled, that means no traffic will flow to/from the internet even if
     * there's a route rule that enables that traffic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateInternetGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateInternetGateway API.
     */
    UpdateInternetGatewayResponse updateInternetGateway(UpdateInternetGatewayRequest request);

    /**
     * Updates the specified IPv6. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Use this
     * operation if you want to:
     *
     * <p>Move an IPv6 to a different VNIC in the same subnet. * Enable/disable internet access for
     * an IPv6. * Change the display name for an IPv6. * Update resource tags for an IPv6.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateIpv6Example.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateIpv6 API.
     */
    UpdateIpv6Response updateIpv6(UpdateIpv6Request request);

    /**
     * Updates the specified local peering gateway (LPG).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateLocalPeeringGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateLocalPeeringGateway API.
     */
    UpdateLocalPeeringGatewayResponse updateLocalPeeringGateway(
            UpdateLocalPeeringGatewayRequest request);

    /**
     * Updates the specified NAT gateway.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateNatGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateNatGateway
     *     API.
     */
    UpdateNatGatewayResponse updateNatGateway(UpdateNatGatewayRequest request);

    /**
     * Updates the specified network security group.
     *
     * <p>To add or remove an existing VNIC from the group, use {@link
     * #updateVnic(UpdateVnicRequest) updateVnic}.
     *
     * <p>To add a VNIC to the group *when you create the VNIC*, specify the NSG's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) during
     * creation. For example, see the `nsgIds` attribute in {@link
     * #createVnicDetails(CreateVnicDetailsRequest) createVnicDetails}.
     *
     * <p>To add or remove security rules from the group, use {@link
     * #addNetworkSecurityGroupSecurityRules(AddNetworkSecurityGroupSecurityRulesRequest)
     * addNetworkSecurityGroupSecurityRules} or {@link
     * #removeNetworkSecurityGroupSecurityRules(RemoveNetworkSecurityGroupSecurityRulesRequest)
     * removeNetworkSecurityGroupSecurityRules}.
     *
     * <p>To edit the contents of existing security rules in the group, use {@link
     * #updateNetworkSecurityGroupSecurityRules(UpdateNetworkSecurityGroupSecurityRulesRequest)
     * updateNetworkSecurityGroupSecurityRules}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateNetworkSecurityGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateNetworkSecurityGroup API.
     */
    UpdateNetworkSecurityGroupResponse updateNetworkSecurityGroup(
            UpdateNetworkSecurityGroupRequest request);

    /**
     * Updates one or more security rules in the specified network security group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateNetworkSecurityGroupSecurityRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateNetworkSecurityGroupSecurityRules API.
     */
    UpdateNetworkSecurityGroupSecurityRulesResponse updateNetworkSecurityGroupSecurityRules(
            UpdateNetworkSecurityGroupSecurityRulesRequest request);

    /**
     * Updates the specified private IP. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Use this
     * operation if you want to:
     *
     * <p>- Move a secondary private IP to a different VNIC in the same subnet. - Change the display
     * name for a secondary private IP. - Change the hostname for a secondary private IP.
     *
     * <p>This operation cannot be used with primary private IPs. To update the hostname for the
     * primary IP on a VNIC, use {@link #updateVnic(UpdateVnicRequest) updateVnic}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdatePrivateIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePrivateIp
     *     API.
     */
    UpdatePrivateIpResponse updatePrivateIp(UpdatePrivateIpRequest request);

    /**
     * Updates the specified public IP. You must specify the object's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Use this
     * operation if you want to:
     *
     * <p>Assign a reserved public IP in your pool to a private IP. * Move a reserved public IP to a
     * different private IP. * Unassign a reserved public IP from a private IP (which returns it to
     * your pool of reserved public IPs). * Change the display name or tags for a public IP.
     *
     * <p>Assigning, moving, and unassigning a reserved public IP are asynchronous operations. Poll
     * the public IP's `lifecycleState` to determine if the operation succeeded.
     *
     * <p>*Note:** When moving a reserved public IP, the target private IP must not already have a
     * public IP with `lifecycleState` = ASSIGNING or ASSIGNED. If it does, an error is returned.
     * Also, the initial unassignment from the original private IP always succeeds, but the
     * assignment to the target private IP is asynchronous and could fail silently (for example, if
     * the target private IP is deleted or has a different public IP assigned to it in the interim).
     * If that occurs, the public IP remains unassigned and its `lifecycleState` switches to
     * AVAILABLE (it is not reassigned to its original private IP). You must poll the public IP's
     * `lifecycleState` to determine if the move succeeded.
     *
     * <p>Regarding ephemeral public IPs:
     *
     * <p>If you want to assign an ephemeral public IP to a primary private IP, use {@link
     * #createPublicIp(CreatePublicIpRequest) createPublicIp}. * You can't move an ephemeral public
     * IP to a different private IP. * If you want to unassign an ephemeral public IP from its
     * private IP, use {@link #deletePublicIp(DeletePublicIpRequest) deletePublicIp}, which
     * unassigns and deletes the ephemeral public IP.
     *
     * <p>*Note:** If a public IP is assigned to a secondary private IP (see {@link PrivateIp}), and
     * you move that secondary private IP to another VNIC, the public IP moves with it.
     *
     * <p>*Note:** There's a limit to the number of {@link PublicIp} a VNIC or instance can have. If
     * you try to move a reserved public IP to a VNIC or instance that has already reached its
     * public IP limit, an error is returned. For information about the public IP limits, see
     * [Public IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdatePublicIpExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePublicIp API.
     */
    UpdatePublicIpResponse updatePublicIp(UpdatePublicIpRequest request);

    /**
     * Updates the specified public IP pool.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdatePublicIpPoolExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePublicIpPool
     *     API.
     */
    UpdatePublicIpPoolResponse updatePublicIpPool(UpdatePublicIpPoolRequest request);

    /**
     * Updates the specified remote peering connection (RPC).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateRemotePeeringConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateRemotePeeringConnection API.
     */
    UpdateRemotePeeringConnectionResponse updateRemotePeeringConnection(
            UpdateRemotePeeringConnectionRequest request);

    /**
     * Updates the specified route table's display name or route rules. Avoid entering confidential
     * information.
     *
     * <p>Note that the `routeRules` object you provide replaces the entire existing set of rules.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateRouteTableExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateRouteTable
     *     API.
     */
    UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request);

    /**
     * Updates the specified security list's display name or rules. Avoid entering confidential
     * information.
     *
     * <p>Note that the `egressSecurityRules` or `ingressSecurityRules` objects you provide replace
     * the entire existing objects.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateSecurityListExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSecurityList
     *     API.
     */
    UpdateSecurityListResponse updateSecurityList(UpdateSecurityListRequest request);

    /**
     * Updates the specified service gateway. The information you provide overwrites the existing
     * attributes of the gateway.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateServiceGatewayExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateServiceGateway API.
     */
    UpdateServiceGatewayResponse updateServiceGateway(UpdateServiceGatewayRequest request);

    /**
     * Updates the specified subnet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateSubnetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSubnet API.
     */
    UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request);

    /**
     * Creates or updates the set of CPE configuration answers for the specified tunnel. The answers
     * correlate to the questions that are specific to the CPE device type (see the `parameters`
     * attribute of {@link CpeDeviceShapeDetail}).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateTunnelCpeDeviceConfigExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateTunnelCpeDeviceConfig API.
     */
    UpdateTunnelCpeDeviceConfigResponse updateTunnelCpeDeviceConfig(
            UpdateTunnelCpeDeviceConfigRequest request);

    /**
     * Updates the specified VCN.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVcnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVcn API.
     */
    UpdateVcnResponse updateVcn(UpdateVcnRequest request);

    /**
     * Updates the specified virtual circuit. This can be called by either the customer who owns the
     * virtual circuit, or the provider (when provisioning or de-provisioning the virtual circuit
     * from their end). The documentation for {@link
     * #updateVirtualCircuitDetails(UpdateVirtualCircuitDetailsRequest) updateVirtualCircuitDetails}
     * indicates who can update each property of the virtual circuit.
     *
     * <p>*Important:** If the virtual circuit is working and in the PROVISIONED state, updating any
     * of the network-related properties (such as the DRG being used, the BGP ASN, and so on) will
     * cause the virtual circuit's state to switch to PROVISIONING and the related BGP session to go
     * down. After Oracle re-provisions the virtual circuit, its state will return to PROVISIONED.
     * Make sure you confirm that the associated BGP session is back up. For more information about
     * the various states and how to test connectivity, see [FastConnect
     * Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
     *
     * <p>To change the list of public IP prefixes for a public virtual circuit, use {@link
     * #bulkAddVirtualCircuitPublicPrefixes(BulkAddVirtualCircuitPublicPrefixesRequest)
     * bulkAddVirtualCircuitPublicPrefixes} and {@link
     * #bulkDeleteVirtualCircuitPublicPrefixes(BulkDeleteVirtualCircuitPublicPrefixesRequest)
     * bulkDeleteVirtualCircuitPublicPrefixes}. Updating the list of prefixes does NOT cause the BGP
     * session to go down. However, Oracle must verify the customer's ownership of each added prefix
     * before traffic for that prefix will flow across the virtual circuit.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVirtualCircuitExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateVirtualCircuit API.
     */
    UpdateVirtualCircuitResponse updateVirtualCircuit(UpdateVirtualCircuitRequest request);

    /**
     * Updates the specified VLAN. Note that this operation might require changes to all the VNICs
     * in the VLAN, which can take a while. The VLAN will be in the UPDATING state until the changes
     * are complete.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVlanExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVlan API.
     */
    UpdateVlanResponse updateVlan(UpdateVlanRequest request);

    /**
     * Updates the specified VNIC.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVnicExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVnic API.
     */
    UpdateVnicResponse updateVnic(UpdateVnicRequest request);

    /**
     * Updates the specified VTAP's display name or tags.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateVtapExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateVtap API.
     */
    UpdateVtapResponse updateVtap(UpdateVtapRequest request);

    /**
     * Upgrades the DRG. After upgrade, you can control routing inside your DRG via DRG attachments,
     * route distributions, and DRG route tables.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpgradeDrgExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpgradeDrg API.
     */
    UpgradeDrgResponse upgradeDrg(UpgradeDrgRequest request);

    /**
     * Submits the BYOASN for validation. Please do not submit to Oracle for validation if the
     * information for the BYOASN is not already modified in the Regional Internet Registry. See [To
     * import a BYOASN](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOASN.htm) for
     * details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ValidateByoasnExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateByoasn API.
     */
    ValidateByoasnResponse validateByoasn(ValidateByoasnRequest request);

    /**
     * Submits the BYOIP CIDR block you are importing for validation. Do not submit to Oracle for
     * validation if you have not already modified the information for the BYOIP CIDR block with
     * your Regional Internet Registry. See [To import a CIDR
     * block](https://docs.oracle.com/iaas/Content/Network/Concepts/BYOIP.htm#import_cidr) for
     * details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ValidateByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateByoipRange
     *     API.
     */
    ValidateByoipRangeResponse validateByoipRange(ValidateByoipRangeRequest request);

    /**
     * Withdraws BGP route advertisement for the BYOIP CIDR block.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/WithdrawByoipRangeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use WithdrawByoipRange
     *     API.
     */
    WithdrawByoipRangeResponse withdrawByoipRange(WithdrawByoipRangeRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     * @deprecated use {@link #newWaiters(WorkRequest)} instead. Otherwise, a default one will be
     *     provided that does not support operations that rely on the {@code WorkRequestClient} for
     *     polling. An {@code IllegalStateException} will be thrown for such operations.
     */
    @Deprecated
    VirtualNetworkWaiters getWaiters();

    /**
     * Creates a new {@code VirtualNetworkWaiters} for resources for this service.
     *
     * @param workRequestClient The work request service client used to query for work request
     *     status
     * @return The service waiters.
     */
    VirtualNetworkWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    VirtualNetworkPaginators getPaginators();
}
