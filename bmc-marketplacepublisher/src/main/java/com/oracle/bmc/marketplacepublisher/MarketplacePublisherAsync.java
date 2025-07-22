/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;

/**
 * Use the Marketplace Publisher API to manage the publishing of applications in Oracle Cloud
 * Infrastructure Marketplace.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public interface MarketplacePublisherAsync extends AutoCloseable {

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
     * Mark the Term Version identified by the id as active
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ActivateTermVersionResponse> activateTermVersion(
            ActivateTermVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ActivateTermVersionRequest, ActivateTermVersionResponse>
                    handler);

    /**
     * Cancels the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Cascade delete the listing and its subresources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteListingResponse> cascadingDeleteListing(
            CascadingDeleteListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CascadingDeleteListingRequest, CascadingDeleteListingResponse>
                    handler);

    /**
     * Cascade delete listing revision and its subresources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CascadingDeleteListingRevisionResponse>
            cascadingDeleteListingRevision(
                    CascadingDeleteListingRevisionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CascadingDeleteListingRevisionRequest,
                                    CascadingDeleteListingRevisionResponse>
                            handler);

    /**
     * Moves the specified artifact to the specified compartment within the same tenancy.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeArtifactCompartmentResponse> changeArtifactCompartment(
            ChangeArtifactCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeArtifactCompartmentRequest, ChangeArtifactCompartmentResponse>
                    handler);

    /**
     * Moves a listing from one compartment to another
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeListingCompartmentResponse> changeListingCompartment(
            ChangeListingCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeListingCompartmentRequest, ChangeListingCompartmentResponse>
                    handler);

    /**
     * Updates the Listing Revision to New status
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeListingRevisionToNewStatusResponse>
            changeListingRevisionToNewStatus(
                    ChangeListingRevisionToNewStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeListingRevisionToNewStatusRequest,
                                    ChangeListingRevisionToNewStatusResponse>
                            handler);

    /**
     * Moves a term from one compartment to another
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeTermCompartmentResponse> changeTermCompartment(
            ChangeTermCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeTermCompartmentRequest, ChangeTermCompartmentResponse>
                    handler);

    /**
     * Clone the published/withdrawn Listing Revision identified by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CloneListingRevisionResponse> cloneListingRevision(
            CloneListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CloneListingRevisionRequest, CloneListingRevisionResponse>
                    handler);

    /**
     * Creates a new artifact in your compartment. You must specify your compartment ID in the
     * request object.
     *
     * <p>You must also specify a *name* for the artifact(although it can be an empty string). It
     * does not have to be unique, and you can change it anytime with {@link
     * #updateArtifact(UpdateArtifactRequest, Consumer, Consumer) updateArtifact}..
     *
     * <p>You must also specify a *artifactType* for the artifact. Allowed values are
     * CONTAINER_IMAGE and HELM_CHART
     *
     * <p>You must also provide the container or helm chart registry details for the corresponding
     * images. Oracle container registry details (Registry/Concepts/registryoverview.htm).
     *
     * <p>After you send your request, the new object's `status` will temporarily be IN_PROGRESS and
     * `lifecycleState` will be CREATING. Before using the object, first make sure its
     * `lifecycleState` has changed to ACTIVE and the status has changed to \u2018AVAILABLE\u2019
     * for the new Artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateArtifactResponse> createArtifact(
            CreateArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateArtifactRequest, CreateArtifactResponse>
                    handler);

    /**
     * Creates a new listing in your compartment. You must specify your compartment ID in the
     * request object.
     *
     * <p>You must also specify a *name* for the listing and cannot be updated later.
     *
     * <p>You must also specify a *packageType* for the listing. Allowed values are CONTAINER_IMAGE
     * and HELM_CHART
     *
     * <p>After you send your request, the new object's `lifecycleState` will be CREATING. Before
     * using the object, first make sure its `lifecycleState` has changed to ACTIVE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateListingResponse> createListing(
            CreateListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateListingRequest, CreateListingResponse>
                    handler);

    /**
     * Creates a new Listing Revision.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateListingRevisionResponse> createListingRevision(
            CreateListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateListingRevisionRequest, CreateListingRevisionResponse>
                    handler);

    /**
     * Creates a new listing revision attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateListingRevisionAttachmentResponse>
            createListingRevisionAttachment(
                    CreateListingRevisionAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateListingRevisionAttachmentRequest,
                                    CreateListingRevisionAttachmentResponse>
                            handler);

    /**
     * Creates a new Listing Revision Note.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateListingRevisionNoteResponse> createListingRevisionNote(
            CreateListingRevisionNoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateListingRevisionNoteRequest, CreateListingRevisionNoteResponse>
                    handler);

    /**
     * Creates a new Listing Revision Package.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateListingRevisionPackageResponse> createListingRevisionPackage(
            CreateListingRevisionPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateListingRevisionPackageRequest,
                            CreateListingRevisionPackageResponse>
                    handler);

    /**
     * Creates a new Term.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTermResponse> createTerm(
            CreateTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTermRequest, CreateTermResponse> handler);

    /**
     * Creates a new Term Version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTermVersionResponse> createTermVersion(
            CreateTermVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTermVersionRequest, CreateTermVersionResponse>
                    handler);

    /**
     * Deletes the specified artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteArtifactResponse> deleteArtifact(
            DeleteArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteArtifactRequest, DeleteArtifactResponse>
                    handler);

    /**
     * Deletes a listing by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteListingResponse> deleteListing(
            DeleteListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteListingRequest, DeleteListingResponse>
                    handler);

    /**
     * Deletes a listing by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteListingRevisionResponse> deleteListingRevision(
            DeleteListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteListingRevisionRequest, DeleteListingRevisionResponse>
                    handler);

    /**
     * Deletes a listing revision attachment by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteListingRevisionAttachmentResponse>
            deleteListingRevisionAttachment(
                    DeleteListingRevisionAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteListingRevisionAttachmentRequest,
                                    DeleteListingRevisionAttachmentResponse>
                            handler);

    /**
     * Deletes a listing revision note by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteListingRevisionNoteResponse> deleteListingRevisionNote(
            DeleteListingRevisionNoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteListingRevisionNoteRequest, DeleteListingRevisionNoteResponse>
                    handler);

    /**
     * Deletes a listing revision package by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteListingRevisionPackageResponse> deleteListingRevisionPackage(
            DeleteListingRevisionPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteListingRevisionPackageRequest,
                            DeleteListingRevisionPackageResponse>
                    handler);

    /**
     * Deletes a Term by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTermResponse> deleteTerm(
            DeleteTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTermRequest, DeleteTermResponse> handler);

    /**
     * Deletes a Term by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTermVersionResponse> deleteTermVersion(
            DeleteTermVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTermVersionRequest, DeleteTermVersionResponse>
                    handler);

    /**
     * Gets the specified artifact's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetArtifactResponse> getArtifact(
            GetArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetArtifactRequest, GetArtifactResponse> handler);

    /**
     * Gets the specified category's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCategoryResponse> getCategory(
            GetCategoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCategoryRequest, GetCategoryResponse> handler);

    /**
     * Gets the details for a lead.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLeadResponse> getLead(
            GetLeadRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetLeadRequest, GetLeadResponse> handler);

    /**
     * Gets the details for a listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingResponse> getListing(
            GetListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetListingRequest, GetListingResponse> handler);

    /**
     * Gets the details for a listing revision.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingRevisionResponse> getListingRevision(
            GetListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionRequest, GetListingRevisionResponse>
                    handler);

    /**
     * Get the details of the specified listing revision attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingRevisionAttachmentResponse> getListingRevisionAttachment(
            GetListingRevisionAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionAttachmentRequest,
                            GetListingRevisionAttachmentResponse>
                    handler);

    /**
     * Get the attachment content by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingRevisionAttachmentContentResponse>
            getListingRevisionAttachmentContent(
                    GetListingRevisionAttachmentContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetListingRevisionAttachmentContentRequest,
                                    GetListingRevisionAttachmentContentResponse>
                            handler);

    /**
     * Gets the content for a listing revision icon.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingRevisionIconContentResponse>
            getListingRevisionIconContent(
                    GetListingRevisionIconContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetListingRevisionIconContentRequest,
                                    GetListingRevisionIconContentResponse>
                            handler);

    /**
     * Get note details by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingRevisionNoteResponse> getListingRevisionNote(
            GetListingRevisionNoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionNoteRequest, GetListingRevisionNoteResponse>
                    handler);

    /**
     * Get the details of the specified version of a package.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetListingRevisionPackageResponse> getListingRevisionPackage(
            GetListingRevisionPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetListingRevisionPackageRequest, GetListingRevisionPackageResponse>
                    handler);

    /**
     * Gets the specified market's information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMarketResponse> getMarket(
            GetMarketRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMarketRequest, GetMarketResponse> handler);

    /**
     * Gets a Product by code identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProductResponse> getProduct(
            GetProductRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProductRequest, GetProductResponse> handler);

    /**
     * Gets a Publisher by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPublisherResponse> getPublisher(
            GetPublisherRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPublisherRequest, GetPublisherResponse>
                    handler);

    /**
     * Gets a SupportDoc by code identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSupportDocResponse> getSupportDoc(
            GetSupportDocRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSupportDocRequest, GetSupportDocResponse>
                    handler);

    /**
     * Gets a Support Doc content by supportDocCode
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSupportDocContentResponse> getSupportDocContent(
            GetSupportDocContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSupportDocContentRequest, GetSupportDocContentResponse>
                    handler);

    /**
     * Gets a Term by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTermResponse> getTerm(
            GetTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTermRequest, GetTermResponse> handler);

    /**
     * Gets a Term Version by the identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTermVersionResponse> getTermVersion(
            GetTermVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTermVersionRequest, GetTermVersionResponse>
                    handler);

    /**
     * Gets a Term Version content by the identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTermVersionContentResponse> getTermVersionContent(
            GetTermVersionContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTermVersionContentRequest, GetTermVersionContentResponse>
                    handler);

    /**
     * Gets details of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists the artifacts in your compartment. You must specify your compartment's OCID as the
     * value for the compartment ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListArtifactsResponse> listArtifacts(
            ListArtifactsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListArtifactsRequest, ListArtifactsResponse>
                    handler);

    /**
     * List all published service listing revisions
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableServicesResponse> listAvailableServices(
            ListAvailableServicesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAvailableServicesRequest, ListAvailableServicesResponse>
                    handler);

    /**
     * Lists the categories in your compartment. You must specify your compartment's OCID as the
     * value for the compartment ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCategoriesResponse> listCategories(
            ListCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCategoriesRequest, ListCategoriesResponse>
                    handler);

    /**
     * List customer instance report records
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCustomerInstanceReportRecordsResponse>
            listCustomerInstanceReportRecords(
                    ListCustomerInstanceReportRecordsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCustomerInstanceReportRecordsRequest,
                                    ListCustomerInstanceReportRecordsResponse>
                            handler);

    /**
     * List disbursement report records
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDisbursementReportRecordsResponse>
            listDisbursementReportRecords(
                    ListDisbursementReportRecordsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDisbursementReportRecordsRequest,
                                    ListDisbursementReportRecordsResponse>
                            handler);

    /**
     * Lists the leads in your compartment that belong to a listing. You must specify your listing's
     * OCID as the value for the listing ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLeadsResponse> listLeads(
            ListLeadsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListLeadsRequest, ListLeadsResponse> handler);

    /**
     * Gets the list of attachments for a listing revision in a compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListListingRevisionAttachmentsResponse>
            listListingRevisionAttachments(
                    ListListingRevisionAttachmentsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListListingRevisionAttachmentsRequest,
                                    ListListingRevisionAttachmentsResponse>
                            handler);

    /**
     * Gets the list of notes for a listing revision.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListListingRevisionNotesResponse> listListingRevisionNotes(
            ListListingRevisionNotesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListListingRevisionNotesRequest, ListListingRevisionNotesResponse>
                    handler);

    /**
     * Gets the list of packages for a listing revision.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListListingRevisionPackagesResponse> listListingRevisionPackages(
            ListListingRevisionPackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListListingRevisionPackagesRequest, ListListingRevisionPackagesResponse>
                    handler);

    /**
     * Lists the list of listing revisions for a specific listing ID, compartment ID or listing
     * revision status.
     *
     * <p>You can specify your compartment's OCID as the value for the compartment ID. For
     * information about OCIDs, see Resource Identifiers (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListListingRevisionsResponse> listListingRevisions(
            ListListingRevisionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListListingRevisionsRequest, ListListingRevisionsResponse>
                    handler);

    /**
     * Lists the listings in your compartment. You must specify your compartment's OCID as the value
     * for the compartment ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListListingsResponse> listListings(
            ListListingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListListingsRequest, ListListingsResponse>
                    handler);

    /**
     * Lists the markets in your compartment. You must specify your compartment's OCID as the value
     * for the compartment ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMarketsResponse> listMarkets(
            ListMarketsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListMarketsRequest, ListMarketsResponse> handler);

    /**
     * Lists the products in your compartment. You must specify your compartment's OCID as the value
     * for the compartment ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProductsResponse> listProducts(
            ListProductsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProductsRequest, ListProductsResponse>
                    handler);

    /**
     * Returns a list of publishers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPublishersResponse> listPublishers(
            ListPublishersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPublishersRequest, ListPublishersResponse>
                    handler);

    /**
     * Lists the supportDocs in your compartment. You must specify your compartment's OCID as the
     * value for the compartment ID. For information about OCIDs, see Resource Identifiers
     * (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSupportDocsResponse> listSupportDocs(
            ListSupportDocsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSupportDocsRequest, ListSupportDocsResponse>
                    handler);

    /**
     * Lists the currencies supported by the Marketplace Publisher Service. You must specify your
     * compartment's OCID as the value for the compartment ID. For information about OCIDs, see
     * Resource Identifiers (Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSupportedCurrenciesResponse> listSupportedCurrencies(
            ListSupportedCurrenciesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedCurrenciesRequest, ListSupportedCurrenciesResponse>
                    handler);

    /**
     * Lists the shapes available to select from.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSupportedShapesResponse> listSupportedShapes(
            ListSupportedShapesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSupportedShapesRequest, ListSupportedShapesResponse>
                    handler);

    /**
     * Returns a list of the publisher term versions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTermVersionsResponse> listTermVersions(
            ListTermVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTermVersionsRequest, ListTermVersionsResponse>
                    handler);

    /**
     * Returns a list of the publisher terms.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTermsResponse> listTerms(
            ListTermsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTermsRequest, ListTermsResponse> handler);

    /**
     * Returns a (paginated) list of errors for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a (paginated) list of logs for the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Mark the Listing Revision Package identified by the id and package version as default
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MarkListingRevisionPackageAsDefaultResponse>
            markListingRevisionPackageAsDefault(
                    MarkListingRevisionPackageAsDefaultRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    MarkListingRevisionPackageAsDefaultRequest,
                                    MarkListingRevisionPackageAsDefaultResponse>
                            handler);

    /**
     * Publish the Listing revision identified by Identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishListingRevisionResponse> publishListingRevision(
            PublishListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PublishListingRevisionRequest, PublishListingRevisionResponse>
                    handler);

    /**
     * Updates the Listing Revision to PublishAsPrivate
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishListingRevisionAsPrivateResponse>
            publishListingRevisionAsPrivate(
                    PublishListingRevisionAsPrivateRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PublishListingRevisionAsPrivateRequest,
                                    PublishListingRevisionAsPrivateResponse>
                            handler);

    /**
     * Updates the Listing Revision Package to publish status
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishListingRevisionPackageResponse>
            publishListingRevisionPackage(
                    PublishListingRevisionPackageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PublishListingRevisionPackageRequest,
                                    PublishListingRevisionPackageResponse>
                            handler);

    /**
     * Update the Listing Revision identified by the id for review
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SubmitListingRevisionForReviewResponse>
            submitListingRevisionForReview(
                    SubmitListingRevisionForReviewRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SubmitListingRevisionForReviewRequest,
                                    SubmitListingRevisionForReviewResponse>
                            handler);

    /**
     * Updates the Listing Revision Package to Unpublish status
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnPublishListingRevisionPackageResponse>
            unPublishListingRevisionPackage(
                    UnPublishListingRevisionPackageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UnPublishListingRevisionPackageRequest,
                                    UnPublishListingRevisionPackageResponse>
                            handler);

    /**
     * Updates the specified artifact identified by the id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateArtifactResponse> updateArtifact(
            UpdateArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateArtifactRequest, UpdateArtifactResponse>
                    handler);

    /**
     * Updates the specified Listing identified by the id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingResponse> updateListing(
            UpdateListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateListingRequest, UpdateListingResponse>
                    handler);

    /**
     * Updates the Listing Revision
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingRevisionResponse> updateListingRevision(
            UpdateListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateListingRevisionRequest, UpdateListingRevisionResponse>
                    handler);

    /**
     * Updates the Listing Revision Attachment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingRevisionAttachmentResponse>
            updateListingRevisionAttachment(
                    UpdateListingRevisionAttachmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionAttachmentRequest,
                                    UpdateListingRevisionAttachmentResponse>
                            handler);

    /**
     * Update a file to listing revision attachment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingRevisionAttachmentContentResponse>
            updateListingRevisionAttachmentContent(
                    UpdateListingRevisionAttachmentContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionAttachmentContentRequest,
                                    UpdateListingRevisionAttachmentContentResponse>
                            handler);

    /**
     * Updates the Listing Revision
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingRevisionIconContentResponse>
            updateListingRevisionIconContent(
                    UpdateListingRevisionIconContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateListingRevisionIconContentRequest,
                                    UpdateListingRevisionIconContentResponse>
                            handler);

    /**
     * Updates the Listing Revision Note tag data
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingRevisionNoteResponse> updateListingRevisionNote(
            UpdateListingRevisionNoteRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateListingRevisionNoteRequest, UpdateListingRevisionNoteResponse>
                    handler);

    /**
     * Updates the Listing Revision Package.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateListingRevisionPackageResponse> updateListingRevisionPackage(
            UpdateListingRevisionPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateListingRevisionPackageRequest,
                            UpdateListingRevisionPackageResponse>
                    handler);

    /**
     * Updates the Term
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTermResponse> updateTerm(
            UpdateTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTermRequest, UpdateTermResponse> handler);

    /**
     * Updates the Term Version
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTermVersionResponse> updateTermVersion(
            UpdateTermVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermVersionRequest, UpdateTermVersionResponse>
                    handler);

    /**
     * Updates the Term Version attachment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTermVersionContentResponse> updateTermVersionContent(
            UpdateTermVersionContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermVersionContentRequest, UpdateTermVersionContentResponse>
                    handler);

    /**
     * Validate and publish artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateAndPublishArtifactResponse> validateAndPublishArtifact(
            ValidateAndPublishArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateAndPublishArtifactRequest, ValidateAndPublishArtifactResponse>
                    handler);

    /**
     * Update the Listing Revision identified by the id as Withdraw/UnPublished.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<WithdrawListingRevisionResponse> withdrawListingRevision(
            WithdrawListingRevisionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            WithdrawListingRevisionRequest, WithdrawListingRevisionResponse>
                    handler);
}
