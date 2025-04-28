/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement;

import com.oracle.bmc.certificatesmanagement.requests.*;
import com.oracle.bmc.certificatesmanagement.responses.*;

/** API for managing certificates. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public interface CertificatesManagementAsync extends AutoCloseable {

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
     * Cancels the scheduled deletion of the specified certificate authority (CA).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelCertificateAuthorityDeletionResponse>
            cancelCertificateAuthorityDeletion(
                    CancelCertificateAuthorityDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateAuthorityDeletionRequest,
                                    CancelCertificateAuthorityDeletionResponse>
                            handler);

    /**
     * Cancels the scheduled deletion of the specified certificate authority (CA) version. Canceling
     * a scheduled deletion restores the CA version's lifecycle state to what it was before its
     * scheduled deletion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelCertificateAuthorityVersionDeletionResponse>
            cancelCertificateAuthorityVersionDeletion(
                    CancelCertificateAuthorityVersionDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateAuthorityVersionDeletionRequest,
                                    CancelCertificateAuthorityVersionDeletionResponse>
                            handler);

    /**
     * Cancels the pending deletion of the specified certificate. Canceling a scheduled deletion
     * restores the certificate's lifecycle state to what it was before you scheduled the
     * certificate for deletion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelCertificateDeletionResponse> cancelCertificateDeletion(
            CancelCertificateDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelCertificateDeletionRequest, CancelCertificateDeletionResponse>
                    handler);

    /**
     * Cancels the scheduled deletion of the specified certificate version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelCertificateVersionDeletionResponse>
            cancelCertificateVersionDeletion(
                    CancelCertificateVersionDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelCertificateVersionDeletionRequest,
                                    CancelCertificateVersionDeletionResponse>
                            handler);

    /**
     * Moves a CA bundle to a different compartment in the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When provided, if-match is checked against the ETag values of the secret.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCaBundleCompartmentResponse> changeCaBundleCompartment(
            ChangeCaBundleCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeCaBundleCompartmentRequest, ChangeCaBundleCompartmentResponse>
                    handler);

    /**
     * Moves a certificate authority (CA) to a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When provided, If-Match is checked against the ETag values of the source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCertificateAuthorityCompartmentResponse>
            changeCertificateAuthorityCompartment(
                    ChangeCertificateAuthorityCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCertificateAuthorityCompartmentRequest,
                                    ChangeCertificateAuthorityCompartmentResponse>
                            handler);

    /**
     * Moves a certificate to a different compartment within the same tenancy. For information about
     * moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * <p>When provided, if-match is checked against the ETag values of the secret.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCertificateCompartmentResponse> changeCertificateCompartment(
            ChangeCertificateCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeCertificateCompartmentRequest,
                            ChangeCertificateCompartmentResponse>
                    handler);

    /**
     * Creates a new CA bundle according to the details of the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCaBundleResponse> createCaBundle(
            CreateCaBundleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateCaBundleRequest, CreateCaBundleResponse>
                    handler);

    /**
     * Creates a new certificate according to the details of the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCertificateResponse> createCertificate(
            CreateCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateRequest, CreateCertificateResponse>
                    handler);

    /**
     * Creates a new certificate authority (CA) according to the details of the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateCertificateAuthorityResponse> createCertificateAuthority(
            CreateCertificateAuthorityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCertificateAuthorityRequest, CreateCertificateAuthorityResponse>
                    handler);

    /**
     * Deletes the specified CA bundle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCaBundleResponse> deleteCaBundle(
            DeleteCaBundleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteCaBundleRequest, DeleteCaBundleResponse>
                    handler);

    /**
     * Gets details about the specified association.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAssociationResponse> getAssociation(
            GetAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAssociationRequest, GetAssociationResponse>
                    handler);

    /**
     * Gets details about the specified CA bundle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCaBundleResponse> getCaBundle(
            GetCaBundleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCaBundleRequest, GetCaBundleResponse> handler);

    /**
     * Gets details about the specified certificate.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCertificateResponse> getCertificate(
            GetCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCertificateRequest, GetCertificateResponse>
                    handler);

    /**
     * Gets details about the specified certificate authority (CA).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCertificateAuthorityResponse> getCertificateAuthority(
            GetCertificateAuthorityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateAuthorityRequest, GetCertificateAuthorityResponse>
                    handler);

    /**
     * Gets details about the specified certificate authority (CA) version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCertificateAuthorityVersionResponse>
            getCertificateAuthorityVersion(
                    GetCertificateAuthorityVersionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetCertificateAuthorityVersionRequest,
                                    GetCertificateAuthorityVersionResponse>
                            handler);

    /**
     * Gets details about the specified version of a certificate.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCertificateVersionResponse> getCertificateVersion(
            GetCertificateVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCertificateVersionRequest, GetCertificateVersionResponse>
                    handler);

    /**
     * Lists all associations that match the query parameters. Optionally, you can use the parameter
     * `FilterByAssociationIdQueryParam` to limit the result set to a single item that matches the
     * specified association.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAssociationsResponse> listAssociations(
            ListAssociationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAssociationsRequest, ListAssociationsResponse>
                    handler);

    /**
     * Lists all CA bundles that match the query parameters. Optionally, you can use the parameter
     * `FilterByCaBundleIdQueryParam` to limit the result set to a single item that matches the
     * specified CA bundle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCaBundlesResponse> listCaBundles(
            ListCaBundlesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCaBundlesRequest, ListCaBundlesResponse>
                    handler);

    /**
     * Lists all certificate authorities (CAs) in the specified compartment. Optionally, you can use
     * the parameter `FilterByCertificateAuthorityIdQueryParam` to limit the results to a single
     * item that matches the specified CA.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificateAuthoritiesResponse> listCertificateAuthorities(
            ListCertificateAuthoritiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCertificateAuthoritiesRequest, ListCertificateAuthoritiesResponse>
                    handler);

    /**
     * Lists all versions for the specified certificate authority (CA). Optionally, you can use the
     * parameter `FilterByVersionNumberQueryParam` to limit the results to a single item that
     * matches the specified version number.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificateAuthorityVersionsResponse>
            listCertificateAuthorityVersions(
                    ListCertificateAuthorityVersionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListCertificateAuthorityVersionsRequest,
                                    ListCertificateAuthorityVersionsResponse>
                            handler);

    /**
     * Lists all certificate versions for the specified certificate. Optionally, you can use the
     * parameter `FilterByVersionNumberQueryParam` to limit the result set to a single item that
     * matches the specified version number.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificateVersionsResponse> listCertificateVersions(
            ListCertificateVersionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCertificateVersionsRequest, ListCertificateVersionsResponse>
                    handler);

    /**
     * Lists all certificates that match the query parameters. Optionally, you can use the parameter
     * `FilterByCertificateIdQueryParam` to limit the result set to a single item that matches the
     * specified certificate.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCertificatesResponse> listCertificates(
            ListCertificatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCertificatesRequest, ListCertificatesResponse>
                    handler);

    /**
     * Revokes a certificate authority (CA) version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RevokeCertificateAuthorityVersionResponse>
            revokeCertificateAuthorityVersion(
                    RevokeCertificateAuthorityVersionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RevokeCertificateAuthorityVersionRequest,
                                    RevokeCertificateAuthorityVersionResponse>
                            handler);

    /**
     * Revokes the specified certificate version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RevokeCertificateVersionResponse> revokeCertificateVersion(
            RevokeCertificateVersionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RevokeCertificateVersionRequest, RevokeCertificateVersionResponse>
                    handler);

    /**
     * Schedules the deletion of the specified certificate authority (CA). This sets the lifecycle
     * state of the CA to `PENDING_DELETION` and then deletes it after the specified retention
     * period ends. If needed, you can determine the status of the deletion by using
     * `GetCertificateAuthority`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleCertificateAuthorityDeletionResponse>
            scheduleCertificateAuthorityDeletion(
                    ScheduleCertificateAuthorityDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateAuthorityDeletionRequest,
                                    ScheduleCertificateAuthorityDeletionResponse>
                            handler);

    /**
     * Schedules the deletion of the specified certificate authority (CA) version. This sets the
     * lifecycle state of the CA version to `PENDING_DELETION` and then deletes it after the
     * specified retention period ends. If needed, you can determine the status of the deletion by
     * using `GetCertificateAuthorityVersion`.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleCertificateAuthorityVersionDeletionResponse>
            scheduleCertificateAuthorityVersionDeletion(
                    ScheduleCertificateAuthorityVersionDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateAuthorityVersionDeletionRequest,
                                    ScheduleCertificateAuthorityVersionDeletionResponse>
                            handler);

    /**
     * Schedules the deletion of the specified certificate. This sets the lifecycle state of the
     * certificate to `PENDING_DELETION` and then deletes it after the specified retention period
     * ends. You can subsequently use `GetCertificate` to determine the current deletion status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleCertificateDeletionResponse> scheduleCertificateDeletion(
            ScheduleCertificateDeletionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScheduleCertificateDeletionRequest, ScheduleCertificateDeletionResponse>
                    handler);

    /**
     * Schedules the deletion of the specified certificate version. This sets the lifecycle state of
     * the certificate version to `PENDING_DELETION` and then deletes it after the specified
     * retention period ends. You can only delete a certificate version if the certificate version
     * rotation state is marked as `DEPRECATED`.
     *
     * <p>You can subsequently use `GetCertificateVersion` to determine the current certificate
     * version deletion status.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleCertificateVersionDeletionResponse>
            scheduleCertificateVersionDeletion(
                    ScheduleCertificateVersionDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCertificateVersionDeletionRequest,
                                    ScheduleCertificateVersionDeletionResponse>
                            handler);

    /**
     * Updates the properties of a CA bundle.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCaBundleResponse> updateCaBundle(
            UpdateCaBundleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateCaBundleRequest, UpdateCaBundleResponse>
                    handler);

    /**
     * Updates the properties of a certificate.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCertificateResponse> updateCertificate(
            UpdateCertificateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateRequest, UpdateCertificateResponse>
                    handler);

    /**
     * Updates the properties of the specified certificate authority (CA).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCertificateAuthorityResponse> updateCertificateAuthority(
            UpdateCertificateAuthorityRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCertificateAuthorityRequest, UpdateCertificateAuthorityResponse>
                    handler);
}
