/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;

/**
 * Use the Marketplace Publisher API to manage the publishing of applications in Oracle Cloud Infrastructure Marketplace.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public interface MarketplaceAdministratorAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Change the Listing Revision status to New
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeListingRevisionStatusToNewResponse>
            changeListingRevisionStatusToNew(
                    ChangeListingRevisionStatusToNewRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeListingRevisionStatusToNewRequest,
                                    ChangeListingRevisionStatusToNewResponse>
                            handler);

    /**
     * Creates a new Market.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateMarketResponse> createMarket(
            CreateMarketRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateMarketRequest, CreateMarketResponse>
                    handler);

    /**
     * Gets the specified artifact's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminArtifactResponse> getAdminArtifact(
            GetAdminArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAdminArtifactRequest, GetAdminArtifactResponse>
                    handler);

    /**
     * Returns details of the Listing.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminListingResponse> getAdminListing(
            GetAdminListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAdminListingRequest, GetAdminListingResponse>
                    handler);

    /**
     * Returns details of the Listing revision.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminListingRevisionResponse> getAdminListingRevision(
            GetAdminListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAdminListingRevisionRequest, GetAdminListingRevisionResponse>
                    handler);

    /**
     * Get the details of the specified listing revision attachment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminListingRevisionAttachmentResponse>
            getAdminListingRevisionAttachment(
                    GetAdminListingRevisionAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAdminListingRevisionAttachmentRequest,
                                    GetAdminListingRevisionAttachmentResponse>
                            handler);

    /**
     * Get the details of the specified version of a package.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminListingRevisionPackageResponse>
            getAdminListingRevisionPackage(
                    GetAdminListingRevisionPackageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetAdminListingRevisionPackageRequest,
                                    GetAdminListingRevisionPackageResponse>
                            handler);

    /**
     * Gets a Term by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminTermResponse> getAdminTerm(
            GetAdminTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAdminTermRequest, GetAdminTermResponse>
                    handler);

    /**
     * Gets a Term Version by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAdminTermVersionResponse> getAdminTermVersion(
            GetAdminTermVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAdminTermVersionRequest, GetAdminTermVersionResponse>
                    handler);

    /**
     * Lists the artifacts in your compartment. You must specify your compartment's OCID as the value for
     * the compartment ID.
     * For information about OCIDs, see Resource Identifiers (Content/General/Concepts/identifiers.htm).
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminArtifactsResponse> listAdminArtifacts(
            ListAdminArtifactsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAdminArtifactsRequest, ListAdminArtifactsResponse>
                    handler);

    /**
     * Gets the list of attachments for a listing revision
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminListingRevisionAttachmentsResponse>
            listAdminListingRevisionAttachments(
                    ListAdminListingRevisionAttachmentsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAdminListingRevisionAttachmentsRequest,
                                    ListAdminListingRevisionAttachmentsResponse>
                            handler);

    /**
     * Gets the list of packages for a listing revision.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminListingRevisionPackagesResponse>
            listAdminListingRevisionPackages(
                    ListAdminListingRevisionPackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAdminListingRevisionPackagesRequest,
                                    ListAdminListingRevisionPackagesResponse>
                            handler);

    /**
     * Returns a list of all the Listing revisions.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminListingRevisionsResponse> listAdminListingRevisions(
            ListAdminListingRevisionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAdminListingRevisionsRequest, ListAdminListingRevisionsResponse>
                    handler);

    /**
     * Retrieve a list of publisher SKUs
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminPublisherSkusResponse> listAdminPublisherSkus(
            ListAdminPublisherSkusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAdminPublisherSkusRequest, ListAdminPublisherSkusResponse>
                    handler);

    /**
     * Returns a list of the publisher term versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminTermVersionsResponse> listAdminTermVersions(
            ListAdminTermVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAdminTermVersionsRequest, ListAdminTermVersionsResponse>
                    handler);

    /**
     * Returns a list of the publisher terms.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminTermsResponse> listAdminTerms(
            ListAdminTermsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAdminTermsRequest, ListAdminTermsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAdminWorkRequestsResponse> listAdminWorkRequests(
            ListAdminWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAdminWorkRequestsRequest, ListAdminWorkRequestsResponse>
                    handler);
}
