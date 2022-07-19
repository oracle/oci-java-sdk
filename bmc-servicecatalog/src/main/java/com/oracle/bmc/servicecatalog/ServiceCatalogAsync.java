/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog;

import com.oracle.bmc.servicecatalog.requests.*;
import com.oracle.bmc.servicecatalog.responses.*;

/**
 * Manage solutions in Oracle Cloud Infrastructure Service Catalog.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
public interface ServiceCatalogAsync extends AutoCloseable {

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
     * Replace all associations of a given service catalog in one bulk transaction.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<BulkReplaceServiceCatalogAssociationsResponse>
            bulkReplaceServiceCatalogAssociations(
                    BulkReplaceServiceCatalogAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    BulkReplaceServiceCatalogAssociationsRequest,
                                    BulkReplaceServiceCatalogAssociationsResponse>
                            handler);

    /**
     * Moves the specified private application from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangePrivateApplicationCompartmentResponse>
            changePrivateApplicationCompartment(
                    ChangePrivateApplicationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePrivateApplicationCompartmentRequest,
                                    ChangePrivateApplicationCompartmentResponse>
                            handler);

    /**
     * Moves the specified service catalog from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeServiceCatalogCompartmentResponse>
            changeServiceCatalogCompartment(
                    ChangeServiceCatalogCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeServiceCatalogCompartmentRequest,
                                    ChangeServiceCatalogCompartmentResponse>
                            handler);

    /**
     * Creates a private application along with a single package to be hosted.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePrivateApplicationResponse> createPrivateApplication(
            CreatePrivateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePrivateApplicationRequest, CreatePrivateApplicationResponse>
                    handler);

    /**
     * Creates a brand new service catalog in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateServiceCatalogResponse> createServiceCatalog(
            CreateServiceCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateServiceCatalogRequest, CreateServiceCatalogResponse>
                    handler);

    /**
     * Creates an association between service catalog and a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateServiceCatalogAssociationResponse>
            createServiceCatalogAssociation(
                    CreateServiceCatalogAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateServiceCatalogAssociationRequest,
                                    CreateServiceCatalogAssociationResponse>
                            handler);

    /**
     * Deletes an existing private application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePrivateApplicationResponse> deletePrivateApplication(
            DeletePrivateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePrivateApplicationRequest, DeletePrivateApplicationResponse>
                    handler);

    /**
     * Deletes the specified service catalog from the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteServiceCatalogResponse> deleteServiceCatalog(
            DeleteServiceCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteServiceCatalogRequest, DeleteServiceCatalogResponse>
                    handler);

    /**
     * Removes an association between service catalog and a resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteServiceCatalogAssociationResponse>
            deleteServiceCatalogAssociation(
                    DeleteServiceCatalogAssociationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteServiceCatalogAssociationRequest,
                                    DeleteServiceCatalogAssociationResponse>
                            handler);

    /**
     * Gets the details of the specified private application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateApplicationResponse> getPrivateApplication(
            GetPrivateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateApplicationRequest, GetPrivateApplicationResponse>
                    handler);

    /**
     * Downloads the binary payload of the logo image of the private application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateApplicationActionDownloadLogoResponse>
            getPrivateApplicationActionDownloadLogo(
                    GetPrivateApplicationActionDownloadLogoRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPrivateApplicationActionDownloadLogoRequest,
                                    GetPrivateApplicationActionDownloadLogoResponse>
                            handler);

    /**
     * Gets the details of a specific package within a given private application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateApplicationPackageResponse> getPrivateApplicationPackage(
            GetPrivateApplicationPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPrivateApplicationPackageRequest,
                            GetPrivateApplicationPackageResponse>
                    handler);

    /**
     * Downloads the configuration that was used to create the private application package.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPrivateApplicationPackageActionDownloadConfigResponse>
            getPrivateApplicationPackageActionDownloadConfig(
                    GetPrivateApplicationPackageActionDownloadConfigRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPrivateApplicationPackageActionDownloadConfigRequest,
                                    GetPrivateApplicationPackageActionDownloadConfigResponse>
                            handler);

    /**
     * Gets detailed information about the service catalog including name, compartmentId
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceCatalogResponse> getServiceCatalog(
            GetServiceCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceCatalogRequest, GetServiceCatalogResponse>
                    handler);

    /**
     * Gets detailed information about specific service catalog association.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetServiceCatalogAssociationResponse> getServiceCatalogAssociation(
            GetServiceCatalogAssociationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetServiceCatalogAssociationRequest,
                            GetServiceCatalogAssociationResponse>
                    handler);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Lists all the applications in a service catalog or a tenancy.
     * If no parameter is specified, all catalogs from all compartments in
     * the tenancy will be scanned for any type of content.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApplicationsRequest, ListApplicationsResponse>
                    handler);

    /**
     * Lists the packages in the specified private application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateApplicationPackagesResponse>
            listPrivateApplicationPackages(
                    ListPrivateApplicationPackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListPrivateApplicationPackagesRequest,
                                    ListPrivateApplicationPackagesResponse>
                            handler);

    /**
     * Lists all the private applications in a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPrivateApplicationsResponse> listPrivateApplications(
            ListPrivateApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPrivateApplicationsRequest, ListPrivateApplicationsResponse>
                    handler);

    /**
     * Lists all the resource associations for a specific service catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceCatalogAssociationsResponse>
            listServiceCatalogAssociations(
                    ListServiceCatalogAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListServiceCatalogAssociationsRequest,
                                    ListServiceCatalogAssociationsResponse>
                            handler);

    /**
     * Lists all the service catalogs in the given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListServiceCatalogsResponse> listServiceCatalogs(
            ListServiceCatalogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListServiceCatalogsRequest, ListServiceCatalogsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
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
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Updates the details of an existing private application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePrivateApplicationResponse> updatePrivateApplication(
            UpdatePrivateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePrivateApplicationRequest, UpdatePrivateApplicationResponse>
                    handler);

    /**
     * Updates the details of a previously created service catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateServiceCatalogResponse> updateServiceCatalog(
            UpdateServiceCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateServiceCatalogRequest, UpdateServiceCatalogResponse>
                    handler);
}
