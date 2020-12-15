/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * API for the DNS service. Use this API to manage DNS zones, records, and other DNS resources.
 * For more information, see [Overview of the DNS Service](https://docs.cloud.oracle.com/iaas/Content/DNS/Concepts/dnszonemanagement.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public interface Dns extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

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
     * Moves a resolver into a different compartment along with its protected default view and any endpoints.
     * Zones in the default view are not moved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeResolverCompartmentExample.java.html">here</a> to see how to use ChangeResolverCompartment API.
     */
    ChangeResolverCompartmentResponse changeResolverCompartment(
            ChangeResolverCompartmentRequest request);

    /**
     * Moves a steering policy into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeSteeringPolicyCompartmentExample.java.html">here</a> to see how to use ChangeSteeringPolicyCompartment API.
     */
    ChangeSteeringPolicyCompartmentResponse changeSteeringPolicyCompartment(
            ChangeSteeringPolicyCompartmentRequest request);

    /**
     * Moves a TSIG key into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeTsigKeyCompartmentExample.java.html">here</a> to see how to use ChangeTsigKeyCompartment API.
     */
    ChangeTsigKeyCompartmentResponse changeTsigKeyCompartment(
            ChangeTsigKeyCompartmentRequest request);

    /**
     * Moves a view into a different compartment. Protected views cannot have their compartment changed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeViewCompartmentExample.java.html">here</a> to see how to use ChangeViewCompartment API.
     */
    ChangeViewCompartmentResponse changeViewCompartment(ChangeViewCompartmentRequest request);

    /**
     * Moves a zone into a different compartment. Protected zones cannot have their compartment changed.
     * <p>
     **Note:** All SteeringPolicyAttachment objects associated with this zone will also be moved into the provided compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeZoneCompartmentExample.java.html">here</a> to see how to use ChangeZoneCompartment API.
     */
    ChangeZoneCompartmentResponse changeZoneCompartment(ChangeZoneCompartmentRequest request);

    /**
     * Creates a new resolver endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateResolverEndpointExample.java.html">here</a> to see how to use CreateResolverEndpoint API.
     */
    CreateResolverEndpointResponse createResolverEndpoint(CreateResolverEndpointRequest request);

    /**
     * Creates a new steering policy in the specified compartment. For more information on
     * creating policies with templates, see [Traffic Management API Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateSteeringPolicyExample.java.html">here</a> to see how to use CreateSteeringPolicy API.
     */
    CreateSteeringPolicyResponse createSteeringPolicy(CreateSteeringPolicyRequest request);

    /**
     * Creates a new attachment between a steering policy and a domain, giving the
     * policy permission to answer queries for the specified domain. A steering policy must
     * be attached to a domain for the policy to answer DNS queries for that domain.
     * <p>
     * For the purposes of access control, the attachment is automatically placed
     * into the same compartment as the domain's zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateSteeringPolicyAttachmentExample.java.html">here</a> to see how to use CreateSteeringPolicyAttachment API.
     */
    CreateSteeringPolicyAttachmentResponse createSteeringPolicyAttachment(
            CreateSteeringPolicyAttachmentRequest request);

    /**
     * Creates a new TSIG key in the specified compartment. There is no
     * `opc-retry-token` header since TSIG key names must be globally unique.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateTsigKeyExample.java.html">here</a> to see how to use CreateTsigKey API.
     */
    CreateTsigKeyResponse createTsigKey(CreateTsigKeyRequest request);

    /**
     * Creates a new view in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateViewExample.java.html">here</a> to see how to use CreateView API.
     */
    CreateViewResponse createView(CreateViewRequest request);

    /**
     * Creates a new zone in the specified compartment. If the `Content-Type` header for the request is `text/dns`, the
     * `compartmentId` query parameter is required. Additionally, for `text/dns`, the `scope` and `viewId` query
     * parameters are required to create a private zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateZoneExample.java.html">here</a> to see how to use CreateZone API.
     */
    CreateZoneResponse createZone(CreateZoneRequest request);

    /**
     * Deletes all records at the specified zone and domain.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteDomainRecordsExample.java.html">here</a> to see how to use DeleteDomainRecords API.
     */
    DeleteDomainRecordsResponse deleteDomainRecords(DeleteDomainRecordsRequest request);

    /**
     * Deletes all records in the specified RRSet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteRRSetExample.java.html">here</a> to see how to use DeleteRRSet API.
     */
    DeleteRRSetResponse deleteRRSet(DeleteRRSetRequest request);

    /**
     * Deletes the specified resolver endpoint. Note that attempting to delete a resolver endpoint in the
     * DELETED lifecycle state will result in a 404 to be consistent with other operations of the API.
     * Resolver endpoints may not be deleted if they are referenced by a resolver rule.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteResolverEndpointExample.java.html">here</a> to see how to use DeleteResolverEndpoint API.
     */
    DeleteResolverEndpointResponse deleteResolverEndpoint(DeleteResolverEndpointRequest request);

    /**
     * Deletes the specified steering policy.
     * A `204` response indicates that the delete has been successful.
     * Deletion will fail if the policy is attached to any zones. To detach a
     * policy from a zone, see `DeleteSteeringPolicyAttachment`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteSteeringPolicyExample.java.html">here</a> to see how to use DeleteSteeringPolicy API.
     */
    DeleteSteeringPolicyResponse deleteSteeringPolicy(DeleteSteeringPolicyRequest request);

    /**
     * Deletes the specified steering policy attachment.
     * A `204` response indicates that the delete has been successful.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteSteeringPolicyAttachmentExample.java.html">here</a> to see how to use DeleteSteeringPolicyAttachment API.
     */
    DeleteSteeringPolicyAttachmentResponse deleteSteeringPolicyAttachment(
            DeleteSteeringPolicyAttachmentRequest request);

    /**
     * Deletes the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteTsigKeyExample.java.html">here</a> to see how to use DeleteTsigKey API.
     */
    DeleteTsigKeyResponse deleteTsigKey(DeleteTsigKeyRequest request);

    /**
     * Deletes the specified view. Note that attempting to delete a
     * view in the DELETED lifecycleState will result in a 404 to be
     * consistent with other operations of the API. Views can not be
     * deleted if they are referenced by non-deleted zones or resolvers.
     * Protected views cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteViewExample.java.html">here</a> to see how to use DeleteView API.
     */
    DeleteViewResponse deleteView(DeleteViewRequest request);

    /**
     * Deletes the specified zone and all its steering policy attachments.
     * A `204` response indicates that the zone has been successfully deleted.
     * Protected zones cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/DeleteZoneExample.java.html">here</a> to see how to use DeleteZone API.
     */
    DeleteZoneResponse deleteZone(DeleteZoneRequest request);

    /**
     * Gets a list of all records at the specified zone and domain.
     * The results are sorted by `rtype` in alphabetical order by default. You
     * can optionally filter and/or sort the results using the listed parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetDomainRecordsExample.java.html">here</a> to see how to use GetDomainRecords API.
     */
    GetDomainRecordsResponse getDomainRecords(GetDomainRecordsRequest request);

    /**
     * Gets a list of all records in the specified RRSet. The results are
     * sorted by `recordHash` by default.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetRRSetExample.java.html">here</a> to see how to use GetRRSet API.
     */
    GetRRSetResponse getRRSet(GetRRSetRequest request);

    /**
     * Get information about a specific resolver. Note that attempting to get a
     * resolver in the DELETED lifecycleState will result in a 404 to be
     * consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetResolverExample.java.html">here</a> to see how to use GetResolver API.
     */
    GetResolverResponse getResolver(GetResolverRequest request);

    /**
     * Get information about a specific resolver endpoint. Note that attempting to get a resolver endpoint
     * in the DELETED lifecycle state will result in a 404 to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetResolverEndpointExample.java.html">here</a> to see how to use GetResolverEndpoint API.
     */
    GetResolverEndpointResponse getResolverEndpoint(GetResolverEndpointRequest request);

    /**
     * Gets information about the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetSteeringPolicyExample.java.html">here</a> to see how to use GetSteeringPolicy API.
     */
    GetSteeringPolicyResponse getSteeringPolicy(GetSteeringPolicyRequest request);

    /**
     * Gets information about the specified steering policy attachment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetSteeringPolicyAttachmentExample.java.html">here</a> to see how to use GetSteeringPolicyAttachment API.
     */
    GetSteeringPolicyAttachmentResponse getSteeringPolicyAttachment(
            GetSteeringPolicyAttachmentRequest request);

    /**
     * Gets information about the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetTsigKeyExample.java.html">here</a> to see how to use GetTsigKey API.
     */
    GetTsigKeyResponse getTsigKey(GetTsigKeyRequest request);

    /**
     * Get information about a specific view. Note that attempting to get a
     * view in the DELETED lifecycleState will result in a 404 to be
     * consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetViewExample.java.html">here</a> to see how to use GetView API.
     */
    GetViewResponse getView(GetViewRequest request);

    /**
     * Gets information about the specified zone, including its creation date,
     * zone type, and serial.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneExample.java.html">here</a> to see how to use GetZone API.
     */
    GetZoneResponse getZone(GetZoneRequest request);

    /**
     * Gets all records in the specified zone. The results are
     * sorted by `domain` in alphabetical order by default. For more
     * information about records, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneRecordsExample.java.html">here</a> to see how to use GetZoneRecords API.
     */
    GetZoneRecordsResponse getZoneRecords(GetZoneRecordsRequest request);

    /**
     * Gets a list of all endpoints within a resolver. The collection can be filtered by name or lifecycle state.
     * It can be sorted on creation time or name both in ASC or DESC order. Note that when no lifecycleState
     * query parameter is provided that the collection does not include resolver endpoints in the DELETED
     * lifecycle state to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListResolverEndpointsExample.java.html">here</a> to see how to use ListResolverEndpoints API.
     */
    ListResolverEndpointsResponse listResolverEndpoints(ListResolverEndpointsRequest request);

    /**
     * Gets a list of all resolvers within a compartment. The collection can
     * be filtered by display name, id, or lifecycle state. It can be sorted
     * on creation time or displayName both in ASC or DESC order. Note that
     * when no lifecycleState query parameter is provided that the collection
     * does not include resolvers in the DELETED lifecycleState to be consistent
     * with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListResolversExample.java.html">here</a> to see how to use ListResolvers API.
     */
    ListResolversResponse listResolvers(ListResolversRequest request);

    /**
     * Gets a list of all steering policies in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListSteeringPoliciesExample.java.html">here</a> to see how to use ListSteeringPolicies API.
     */
    ListSteeringPoliciesResponse listSteeringPolicies(ListSteeringPoliciesRequest request);

    /**
     * Lists the steering policy attachments in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListSteeringPolicyAttachmentsExample.java.html">here</a> to see how to use ListSteeringPolicyAttachments API.
     */
    ListSteeringPolicyAttachmentsResponse listSteeringPolicyAttachments(
            ListSteeringPolicyAttachmentsRequest request);

    /**
     * Gets a list of all TSIG keys in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListTsigKeysExample.java.html">here</a> to see how to use ListTsigKeys API.
     */
    ListTsigKeysResponse listTsigKeys(ListTsigKeysRequest request);

    /**
     * Gets a list of all views within a compartment. The collection can
     * be filtered by display name, id, or lifecycle state. It can be sorted
     * on creation time or displayName both in ASC or DESC order. Note that
     * when no lifecycleState query parameter is provided that the collection
     * does not include views in the DELETED lifecycleState to be consistent
     * with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListViewsExample.java.html">here</a> to see how to use ListViews API.
     */
    ListViewsResponse listViews(ListViewsRequest request);

    /**
     * Gets a list of all zones in the specified compartment. The collection
     * can be filtered by name, time created, scope, associated view, and zone type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListZonesExample.java.html">here</a> to see how to use ListZones API.
     */
    ListZonesResponse listZones(ListZonesRequest request);

    /**
     * Updates records in the specified zone at a domain. You can update
     * one record or all records for the specified zone depending on the changes
     * provided in the request body. You can also add or remove records using this
     * function.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchDomainRecordsExample.java.html">here</a> to see how to use PatchDomainRecords API.
     */
    PatchDomainRecordsResponse patchDomainRecords(PatchDomainRecordsRequest request);

    /**
     * Updates records in the specified RRSet.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchRRSetExample.java.html">here</a> to see how to use PatchRRSet API.
     */
    PatchRRSetResponse patchRRSet(PatchRRSetRequest request);

    /**
     * Updates a collection of records in the specified zone. You can update
     * one record or all records for the specified zone depending on the
     * changes provided in the request body. You can also add or remove records
     * using this function.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchZoneRecordsExample.java.html">here</a> to see how to use PatchZoneRecords API.
     */
    PatchZoneRecordsResponse patchZoneRecords(PatchZoneRecordsRequest request);

    /**
     * Replaces records in the specified zone at a domain with the records
     * specified in the request body. If a specified record does not exist,
     * it will be created. If the record exists, then it will be updated to
     * represent the record in the body of the request. If a record in the zone
     * does not exist in the request body, the record will be removed from the
     * zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateDomainRecordsExample.java.html">here</a> to see how to use UpdateDomainRecords API.
     */
    UpdateDomainRecordsResponse updateDomainRecords(UpdateDomainRecordsRequest request);

    /**
     * Replaces records in the specified RRSet.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateRRSetExample.java.html">here</a> to see how to use UpdateRRSet API.
     */
    UpdateRRSetResponse updateRRSet(UpdateRRSetRequest request);

    /**
     * Updates the specified resolver with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateResolverExample.java.html">here</a> to see how to use UpdateResolver API.
     */
    UpdateResolverResponse updateResolver(UpdateResolverRequest request);

    /**
     * Updates the specified resolver endpoint with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateResolverEndpointExample.java.html">here</a> to see how to use UpdateResolverEndpoint API.
     */
    UpdateResolverEndpointResponse updateResolverEndpoint(UpdateResolverEndpointRequest request);

    /**
     * Updates the configuration of the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateSteeringPolicyExample.java.html">here</a> to see how to use UpdateSteeringPolicy API.
     */
    UpdateSteeringPolicyResponse updateSteeringPolicy(UpdateSteeringPolicyRequest request);

    /**
     * Updates the specified steering policy attachment with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateSteeringPolicyAttachmentExample.java.html">here</a> to see how to use UpdateSteeringPolicyAttachment API.
     */
    UpdateSteeringPolicyAttachmentResponse updateSteeringPolicyAttachment(
            UpdateSteeringPolicyAttachmentRequest request);

    /**
     * Updates the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateTsigKeyExample.java.html">here</a> to see how to use UpdateTsigKey API.
     */
    UpdateTsigKeyResponse updateTsigKey(UpdateTsigKeyRequest request);

    /**
     * Updates the specified view with your new information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateViewExample.java.html">here</a> to see how to use UpdateView API.
     */
    UpdateViewResponse updateView(UpdateViewRequest request);

    /**
     * Updates the specified secondary zone with your new external master
     * server information. For more information about secondary zone, see
     * [Manage DNS Service Zone](https://docs.cloud.oracle.com/iaas/Content/DNS/Tasks/managingdnszones.htm).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateZoneExample.java.html">here</a> to see how to use UpdateZone API.
     */
    UpdateZoneResponse updateZone(UpdateZoneRequest request);

    /**
     * Replaces records in the specified zone with the records specified in the
     * request body. If a specified record does not exist, it will be created.
     * If the record exists, then it will be updated to represent the record in
     * the body of the request. If a record in the zone does not exist in the
     * request body, the record will be removed from the zone.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateZoneRecordsExample.java.html">here</a> to see how to use UpdateZoneRecords API.
     */
    UpdateZoneRecordsResponse updateZoneRecords(UpdateZoneRecordsRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DnsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DnsPaginators getPaginators();
}
