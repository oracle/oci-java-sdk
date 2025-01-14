/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns;

import com.oracle.bmc.dns.requests.*;
import com.oracle.bmc.dns.responses.*;

/**
 * API for the DNS service. Use this API to manage DNS zones, records, and other DNS resources. For
 * more information, see [Overview of the DNS
 * Service](https://docs.cloud.oracle.com/iaas/Content/DNS/Concepts/dnszonemanagement.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public interface DnsAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
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
     * Moves a resolver into a different compartment along with its protected default view and any
     * endpoints.
     *
     * <p>Zones in the default view are not moved. VCN-dedicated resolvers are initially created in
     * the same compartment as their corresponding VCN, but can then be moved to a different
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeResolverCompartmentResponse> changeResolverCompartment(
            ChangeResolverCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeResolverCompartmentRequest, ChangeResolverCompartmentResponse>
                    handler);

    /**
     * Moves a steering policy into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSteeringPolicyCompartmentResponse>
            changeSteeringPolicyCompartment(
                    ChangeSteeringPolicyCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSteeringPolicyCompartmentRequest,
                                    ChangeSteeringPolicyCompartmentResponse>
                            handler);

    /**
     * Moves a TSIG key into a different compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTsigKeyCompartmentResponse> changeTsigKeyCompartment(
            ChangeTsigKeyCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeTsigKeyCompartmentRequest, ChangeTsigKeyCompartmentResponse>
                    handler);

    /**
     * Moves a view into a different compartment.
     *
     * <p>To change the compartment of a protected view, change the compartment of its corresponding
     * resolver.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeViewCompartmentResponse> changeViewCompartment(
            ChangeViewCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeViewCompartmentRequest, ChangeViewCompartmentResponse>
                    handler);

    /**
     * Moves a zone into a different compartment.
     *
     * <p>Protected zones cannot have their compartment changed. When the zone name is provided as a
     * path parameter and `PRIVATE` is used for the scope query parameter then the viewId query
     * parameter is required.
     *
     * <p>*Note:** All SteeringPolicyAttachment objects associated with this zone will also be moved
     * into the provided compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeZoneCompartmentResponse> changeZoneCompartment(
            ChangeZoneCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeZoneCompartmentRequest, ChangeZoneCompartmentResponse>
                    handler);

    /**
     * Creates a new resolver endpoint in the same compartment as the resolver.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateResolverEndpointResponse> createResolverEndpoint(
            CreateResolverEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateResolverEndpointRequest, CreateResolverEndpointResponse>
                    handler);

    /**
     * Creates a new steering policy in the specified compartment. For more information on creating
     * policies with templates, see [Traffic Management API
     * Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSteeringPolicyResponse> createSteeringPolicy(
            CreateSteeringPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSteeringPolicyRequest, CreateSteeringPolicyResponse>
                    handler);

    /**
     * Creates a new attachment between a steering policy and a domain, giving the policy permission
     * to answer queries for the specified domain. A steering policy must be attached to a domain
     * for the policy to answer DNS queries for that domain.
     *
     * <p>For the purposes of access control, the attachment is automatically placed into the same
     * compartment as the domain's zone.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateSteeringPolicyAttachmentResponse>
            createSteeringPolicyAttachment(
                    CreateSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateSteeringPolicyAttachmentRequest,
                                    CreateSteeringPolicyAttachmentResponse>
                            handler);

    /**
     * Creates a new TSIG key in the specified compartment. There is no `opc-retry-token` header
     * since TSIG key names must be globally unique.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTsigKeyResponse> createTsigKey(
            CreateTsigKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTsigKeyRequest, CreateTsigKeyResponse>
                    handler);

    /**
     * Creates a new view in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateViewResponse> createView(
            CreateViewRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateViewRequest, CreateViewResponse> handler);

    /**
     * Creates a new zone in the specified compartment.
     *
     * <p>Private zones must have a zone type of `PRIMARY`. Creating a private zone at or under
     * `oraclevcn.com` within the default protected view of a VCN-dedicated resolver is not
     * permitted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateZoneResponse> createZone(
            CreateZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateZoneRequest, CreateZoneResponse> handler);

    /**
     * Creates a new zone from a zone file in the specified compartment. Not supported for private
     * zones.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateZoneFromZoneFileResponse> createZoneFromZoneFile(
            CreateZoneFromZoneFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateZoneFromZoneFileRequest, CreateZoneFromZoneFileResponse>
                    handler);

    /**
     * Deletes all records at the specified zone and domain.
     *
     * <p>When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDomainRecordsResponse> deleteDomainRecords(
            DeleteDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDomainRecordsRequest, DeleteDomainRecordsResponse>
                    handler);

    /**
     * Deletes all records in the specified RRSet.
     *
     * <p>When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRRSetResponse> deleteRRSet(
            DeleteRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRRSetRequest, DeleteRRSetResponse> handler);

    /**
     * Deletes the specified resolver endpoint.
     *
     * <p>Note that attempting to delete a resolver endpoint in the DELETED lifecycle state will
     * result in a `404` response to be consistent with other operations of the API. Resolver
     * endpoints may not be deleted if they are referenced by a resolver rule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteResolverEndpointResponse> deleteResolverEndpoint(
            DeleteResolverEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteResolverEndpointRequest, DeleteResolverEndpointResponse>
                    handler);

    /**
     * Deletes the specified steering policy.
     *
     * <p>A `204` response indicates that the delete has been successful. Deletion will fail if the
     * policy is attached to any zones. To detach a policy from a zone, see
     * `DeleteSteeringPolicyAttachment`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSteeringPolicyResponse> deleteSteeringPolicy(
            DeleteSteeringPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSteeringPolicyRequest, DeleteSteeringPolicyResponse>
                    handler);

    /**
     * Deletes the specified steering policy attachment. A `204` response indicates that the delete
     * has been successful.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSteeringPolicyAttachmentResponse>
            deleteSteeringPolicyAttachment(
                    DeleteSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteSteeringPolicyAttachmentRequest,
                                    DeleteSteeringPolicyAttachmentResponse>
                            handler);

    /**
     * Deletes the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTsigKeyResponse> deleteTsigKey(
            DeleteTsigKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTsigKeyRequest, DeleteTsigKeyResponse>
                    handler);

    /**
     * Deletes the specified view.
     *
     * <p>Note that attempting to delete a view in the DELETED lifecycleState will result in a `404`
     * response to be consistent with other operations of the API. Views cannot be deleted if they
     * are referenced by non-deleted zones or resolvers. Protected views cannot be deleted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteViewResponse> deleteView(
            DeleteViewRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteViewRequest, DeleteViewResponse> handler);

    /**
     * Deletes the specified zone and all its steering policy attachments.
     *
     * <p>A `204` response indicates that the zone has been successfully deleted. Protected zones
     * cannot be deleted. When the zone name is provided as a path parameter and `PRIVATE` is used
     * for the scope query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteZoneResponse> deleteZone(
            DeleteZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteZoneRequest, DeleteZoneResponse> handler);

    /**
     * Gets a list of all records at the specified zone and domain.
     *
     * <p>The results are sorted by `rtype` in alphabetical order by default. You can optionally
     * filter and/or sort the results using the listed parameters. When the zone name is provided as
     * a path parameter and `PRIVATE` is used for the scope query parameter then the viewId query
     * parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDomainRecordsResponse> getDomainRecords(
            GetDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDomainRecordsRequest, GetDomainRecordsResponse>
                    handler);

    /**
     * Gets a list of all records in the specified RRSet.
     *
     * <p>The results are sorted by `recordHash` by default. When the zone name is provided as a
     * path parameter and `PRIVATE` is used for the scope query parameter then the viewId query
     * parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRRSetResponse> getRRSet(
            GetRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRRSetRequest, GetRRSetResponse> handler);

    /**
     * Gets information about a specific resolver.
     *
     * <p>Note that attempting to get a resolver in the DELETED lifecycleState will result in a
     * `404` response to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResolverResponse> getResolver(
            GetResolverRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetResolverRequest, GetResolverResponse> handler);

    /**
     * Gets information about a specific resolver endpoint.
     *
     * <p>Note that attempting to get a resolver endpoint in the DELETED lifecycle state will result
     * in a `404` response to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetResolverEndpointResponse> getResolverEndpoint(
            GetResolverEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetResolverEndpointRequest, GetResolverEndpointResponse>
                    handler);

    /**
     * Gets information about the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSteeringPolicyResponse> getSteeringPolicy(
            GetSteeringPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSteeringPolicyRequest, GetSteeringPolicyResponse>
                    handler);

    /**
     * Gets information about the specified steering policy attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSteeringPolicyAttachmentResponse> getSteeringPolicyAttachment(
            GetSteeringPolicyAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSteeringPolicyAttachmentRequest, GetSteeringPolicyAttachmentResponse>
                    handler);

    /**
     * Gets information about the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTsigKeyResponse> getTsigKey(
            GetTsigKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTsigKeyRequest, GetTsigKeyResponse> handler);

    /**
     * Gets information about a specific view.
     *
     * <p>Note that attempting to get a view in the DELETED lifecycleState will result in a `404`
     * response to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetViewResponse> getView(
            GetViewRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetViewRequest, GetViewResponse> handler);

    /**
     * Gets information about the specified zone, including its creation date, zone type, and
     * serial.
     *
     * <p>When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetZoneResponse> getZone(
            GetZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetZoneRequest, GetZoneResponse> handler);

    /**
     * Gets the requested zone's zone file.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetZoneContentResponse> getZoneContent(
            GetZoneContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetZoneContentRequest, GetZoneContentResponse>
                    handler);

    /**
     * Gets all records in the specified zone.
     *
     * <p>The results are sorted by `domain` in alphabetical order by default. For more information
     * about records, see [Resource Record (RR)
     * TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     * When the zone name is provided as a path parameter and `PRIVATE` is used for the scope query
     * parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetZoneRecordsResponse> getZoneRecords(
            GetZoneRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetZoneRecordsRequest, GetZoneRecordsResponse>
                    handler);

    /**
     * Gets a list of all endpoints within a resolver. The collection can be filtered by name or
     * lifecycle state. It can be sorted on creation time or name both in ASC or DESC order. Note
     * that when no lifecycleState query parameter is provided, the collection does not include
     * resolver endpoints in the DELETED lifecycle state to be consistent with other operations of
     * the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResolverEndpointsResponse> listResolverEndpoints(
            ListResolverEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListResolverEndpointsRequest, ListResolverEndpointsResponse>
                    handler);

    /**
     * Gets a list of all resolvers within a compartment.
     *
     * <p>The collection can be filtered by display name, id, or lifecycle state. It can be sorted
     * on creation time or displayName both in ASC or DESC order. Note that when no lifecycleState
     * query parameter is provided, the collection does not include resolvers in the DELETED
     * lifecycleState to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListResolversResponse> listResolvers(
            ListResolversRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListResolversRequest, ListResolversResponse>
                    handler);

    /**
     * Gets a list of all steering policies in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSteeringPoliciesResponse> listSteeringPolicies(
            ListSteeringPoliciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSteeringPoliciesRequest, ListSteeringPoliciesResponse>
                    handler);

    /**
     * Lists the steering policy attachments in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSteeringPolicyAttachmentsResponse>
            listSteeringPolicyAttachments(
                    ListSteeringPolicyAttachmentsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListSteeringPolicyAttachmentsRequest,
                                    ListSteeringPolicyAttachmentsResponse>
                            handler);

    /**
     * Gets a list of all TSIG keys in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTsigKeysResponse> listTsigKeys(
            ListTsigKeysRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTsigKeysRequest, ListTsigKeysResponse>
                    handler);

    /**
     * Gets a list of all views within a compartment.
     *
     * <p>The collection can be filtered by display name, id, or lifecycle state. It can be sorted
     * on creation time or displayName both in ASC or DESC order. Note that when no lifecycleState
     * query parameter is provided, the collection does not include views in the DELETED
     * lifecycleState to be consistent with other operations of the API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListViewsResponse> listViews(
            ListViewsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListViewsRequest, ListViewsResponse> handler);

    /**
     * Gets a list of IP addresses of OCI nameservers for inbound and outbound transfer of zones in
     * the specified compartment (which must be the root compartment of a tenancy) that transfer
     * zone data with external master or downstream nameservers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListZoneTransferServersResponse> listZoneTransferServers(
            ListZoneTransferServersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListZoneTransferServersRequest, ListZoneTransferServersResponse>
                    handler);

    /**
     * Gets a list of all zones in the specified compartment.
     *
     * <p>The collection can be filtered by name, time created, scope, associated view, and zone
     * type. Filtering by view is only supported for private zones.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListZonesResponse> listZones(
            ListZonesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListZonesRequest, ListZonesResponse> handler);

    /**
     * Updates records in the specified zone at a domain.
     *
     * <p>You can update one record or all records for the specified zone depending on the changes
     * provided in the request body. You can also add or remove records using this function. When
     * the zone name is provided as a path parameter and `PRIVATE` is used for the scope query
     * parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchDomainRecordsResponse> patchDomainRecords(
            PatchDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PatchDomainRecordsRequest, PatchDomainRecordsResponse>
                    handler);

    /**
     * Updates records in the specified RRSet.
     *
     * <p>When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchRRSetResponse> patchRRSet(
            PatchRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<PatchRRSetRequest, PatchRRSetResponse> handler);

    /**
     * Updates a collection of records in the specified zone.
     *
     * <p>You can update one record or all records for the specified zone depending on the changes
     * provided in the request body. You can also add or remove records using this function. When
     * the zone name is provided as a path parameter and `PRIVATE` is used for the scope query
     * parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchZoneRecordsResponse> patchZoneRecords(
            PatchZoneRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<PatchZoneRecordsRequest, PatchZoneRecordsResponse>
                    handler);

    /**
     * Promotes a specified `DnssecKeyVersion` on the zone.
     *
     * <p>If the `DnssecKeyVersion` identified in the request body is a key signing key (KSK) that
     * is replacing another `DnssecKeyVersion`, then the old `DnssecKeyVersion` is scheduled for
     * removal from the zone.
     *
     * <p>For key signing keys (KSKs), you must create the DS record with the new key information
     * **before** promoting the new key to establish a chain of trust. To avoid a service
     * disruption, remove the old DS record as soon as its TTL (time to live) expires.
     *
     * <p>For more information, see
     * [DNSSEC](https://docs.cloud.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PromoteZoneDnssecKeyVersionResponse> promoteZoneDnssecKeyVersion(
            PromoteZoneDnssecKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PromoteZoneDnssecKeyVersionRequest, PromoteZoneDnssecKeyVersionResponse>
                    handler);

    /**
     * Stages a new `DnssecKeyVersion` on the zone. Staging is a process that generates a new
     * \"successor\" key version that replaces an existing \"predecessor\" key version. **Note:** A
     * new key-signing key (KSK) version is inert until you update the parent zone DS records.
     *
     * <p>For more information, see the
     * [DNSSEC](https://docs.cloud.oracle.com/iaas/Content/DNS/Concepts/dnssec.htm) documentation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StageZoneDnssecKeyVersionResponse> stageZoneDnssecKeyVersion(
            StageZoneDnssecKeyVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StageZoneDnssecKeyVersionRequest, StageZoneDnssecKeyVersionResponse>
                    handler);

    /**
     * Replaces records in the specified zone at a domain with the records specified in the request
     * body.
     *
     * <p>If a specified record does not exist, it will be created. If the record exists, then it
     * will be updated to represent the record in the body of the request. If a record in the zone
     * does not exist in the request body, the record will be removed from the zone. When the zone
     * name is provided as a path parameter and `PRIVATE` is used for the scope query parameter then
     * the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDomainRecordsResponse> updateDomainRecords(
            UpdateDomainRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDomainRecordsRequest, UpdateDomainRecordsResponse>
                    handler);

    /**
     * Replaces records in the specified RRSet.
     *
     * <p>When the zone name is provided as a path parameter and `PRIVATE` is used for the scope
     * query parameter then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRRSetResponse> updateRRSet(
            UpdateRRSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRRSetRequest, UpdateRRSetResponse> handler);

    /**
     * Updates the specified resolver with your new information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateResolverResponse> updateResolver(
            UpdateResolverRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateResolverRequest, UpdateResolverResponse>
                    handler);

    /**
     * Updates the specified resolver endpoint with your new information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateResolverEndpointResponse> updateResolverEndpoint(
            UpdateResolverEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateResolverEndpointRequest, UpdateResolverEndpointResponse>
                    handler);

    /**
     * Updates the configuration of the specified steering policy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSteeringPolicyResponse> updateSteeringPolicy(
            UpdateSteeringPolicyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSteeringPolicyRequest, UpdateSteeringPolicyResponse>
                    handler);

    /**
     * Updates the specified steering policy attachment with your new information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSteeringPolicyAttachmentResponse>
            updateSteeringPolicyAttachment(
                    UpdateSteeringPolicyAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateSteeringPolicyAttachmentRequest,
                                    UpdateSteeringPolicyAttachmentResponse>
                            handler);

    /**
     * Updates the specified TSIG key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTsigKeyResponse> updateTsigKey(
            UpdateTsigKeyRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTsigKeyRequest, UpdateTsigKeyResponse>
                    handler);

    /**
     * Updates the specified view with your new information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateViewResponse> updateView(
            UpdateViewRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateViewRequest, UpdateViewResponse> handler);

    /**
     * Updates the zone with the specified information.
     *
     * <p>Global secondary zones may have their external masters updated. For more information about
     * secondary zones, see [Manage DNS Service
     * Zone](https://docs.cloud.oracle.com/iaas/Content/DNS/Tasks/managingdnszones.htm). When the
     * zone name is provided as a path parameter and `PRIVATE` is used for the scope query parameter
     * then the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateZoneResponse> updateZone(
            UpdateZoneRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateZoneRequest, UpdateZoneResponse> handler);

    /**
     * Replaces records in the specified zone with the records specified in the request body.
     *
     * <p>If a specified record does not exist, it will be created. If the record exists, then it
     * will be updated to represent the record in the body of the request. If a record in the zone
     * does not exist in the request body, the record will be removed from the zone. When the zone
     * name is provided as a path parameter and `PRIVATE` is used for the scope query parameter then
     * the viewId query parameter is required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateZoneRecordsResponse> updateZoneRecords(
            UpdateZoneRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateZoneRecordsRequest, UpdateZoneRecordsResponse>
                    handler);
}
