/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;

/**
 * Use the Marketplace API to manage applications in Oracle Cloud Infrastructure Marketplace. For more information, see [Overview of Marketplace](https://docs.cloud.oracle.com/Content/Marketplace/Concepts/marketoverview.htm)
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface MarketplaceAsync extends AutoCloseable {

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
     * Moves the specified publication from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangePublicationCompartmentResponse> changePublicationCompartment(
            ChangePublicationCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangePublicationCompartmentRequest,
                            ChangePublicationCompartmentResponse>
                    handler);

    /**
     * Accepts a terms of use agreement for a specific package version of a listing. You must accept all
     * terms of use for a package before you can deploy the package.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAcceptedAgreementResponse> createAcceptedAgreement(
            CreateAcceptedAgreementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAcceptedAgreementRequest, CreateAcceptedAgreementResponse>
                    handler);

    /**
     * Creates a publication of the specified listing type with an optional default package.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePublicationResponse> createPublication(
            CreatePublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePublicationRequest, CreatePublicationResponse>
                    handler);

    /**
     * Removes a previously accepted terms of use agreement from the list of agreements that Marketplace checks
     * before initiating a deployment. Listings in Marketplace that require acceptance of the specified terms
     * of use can no longer be deployed, but existing deployments aren't affected.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAcceptedAgreementResponse> deleteAcceptedAgreement(
            DeleteAcceptedAgreementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAcceptedAgreementRequest, DeleteAcceptedAgreementResponse>
                    handler);

    /**
     * Deletes a publication, which also removes the associated listing from anywhere it was published, such as Marketplace or Compute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePublicationResponse> deletePublication(
            DeletePublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePublicationRequest, DeletePublicationResponse>
                    handler);

    /**
     * Gets the details of a specific, previously accepted terms of use agreement.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAcceptedAgreementResponse> getAcceptedAgreement(
            GetAcceptedAgreementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAcceptedAgreementRequest, GetAcceptedAgreementResponse>
                    handler);

    /**
     * Returns a terms of use agreement for a package with a time-based signature that can be used to
     * accept the agreement.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAgreementResponse> getAgreement(
            GetAgreementRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAgreementRequest, GetAgreementResponse>
                    handler);

    /**
     * Gets detailed information about a listing, including the listing's name, version, description, and
     * resources.
     * <p>
     * If you plan to launch an instance from an image listing, you must first subscribe to the listing. When
     * you launch the instance, you also need to provide the image ID of the listing resource version that you want.
     * <p>
     * Subscribing to the listing requires you to first get a signature from the terms of use agreement for the
     * listing resource version. To get the signature, issue a [GetAppCatalogListingAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements) API call.
     * The [AppCatalogListingResourceVersionAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements) object, including
     * its signature, is returned in the response. With the signature for the terms of use agreement for the desired
     * listing resource version, create a subscription by issuing a
     * [CreateAppCatalogSubscription](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogSubscription/CreateAppCatalogSubscription) API call.
     * <p>
     * To get the image ID to launch an instance, issue a [GetAppCatalogListingResourceVersion](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion) API call.
     * Lastly, to launch the instance, use the image ID of the listing resource version to issue a [LaunchInstance](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/Instance/LaunchInstance) API call.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetListingResponse> getListing(
            GetListingRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetListingRequest, GetListingResponse> handler);

    /**
     * Get the details of the specified version of a package, including information needed to launch the package.
     * <p>
     * If you plan to launch an instance from an image listing, you must first subscribe to the listing. When
     * you launch the instance, you also need to provide the image ID of the listing resource version that you want.
     * <p>
     * Subscribing to the listing requires you to first get a signature from the terms of use agreement for the
     * listing resource version. To get the signature, issue a [GetAppCatalogListingAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements) API call.
     * The [AppCatalogListingResourceVersionAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements) object, including
     * its signature, is returned in the response. With the signature for the terms of use agreement for the desired
     * listing resource version, create a subscription by issuing a
     * [CreateAppCatalogSubscription](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogSubscription/CreateAppCatalogSubscription) API call.
     * <p>
     * To get the image ID to launch an instance, issue a [GetAppCatalogListingResourceVersion](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion) API call.
     * Lastly, to launch the instance, use the image ID of the listing resource version to issue a [LaunchInstance](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/Instance/LaunchInstance) API call.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPackageResponse> getPackage(
            GetPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPackageRequest, GetPackageResponse> handler);

    /**
     * Gets the details of the specified publication.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublicationResponse> getPublication(
            GetPublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPublicationRequest, GetPublicationResponse>
                    handler);

    /**
     * Gets the details of a specific package version within a given publication.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublicationPackageResponse> getPublicationPackage(
            GetPublicationPackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPublicationPackageRequest, GetPublicationPackageResponse>
                    handler);

    /**
     * Lists the terms of use agreements that have been accepted in the specified compartment.
     * You can filter results by specifying query parameters.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAcceptedAgreementsResponse> listAcceptedAgreements(
            ListAcceptedAgreementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAcceptedAgreementsRequest, ListAcceptedAgreementsResponse>
                    handler);

    /**
     * Returns the terms of use agreements that must be accepted before you can deploy the specified version of a package.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAgreementsResponse> listAgreements(
            ListAgreementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAgreementsRequest, ListAgreementsResponse>
                    handler);

    /**
     * Gets the list of all the categories for listings published to Oracle Cloud Infrastructure Marketplace. Categories apply
     * to the software product provided by the listing.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCategoriesResponse> listCategories(
            ListCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCategoriesRequest, ListCategoriesResponse>
                    handler);

    /**
     * Gets a list of listings from Oracle Cloud Infrastructure Marketplace by searching keywords and
     * filtering according to listing attributes.
     * <p>
     * If you plan to launch an instance from an image listing, you must first subscribe to the listing. When
     * you launch the instance, you also need to provide the image ID of the listing resource version that you want.
     * <p>
     * Subscribing to the listing requires you to first get a signature from the terms of use agreement for the
     * listing resource version. To get the signature, issue a [GetAppCatalogListingAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements) API call.
     * The [AppCatalogListingResourceVersionAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements) object, including
     * its signature, is returned in the response. With the signature for the terms of use agreement for the desired
     * listing resource version, create a subscription by issuing a
     * [CreateAppCatalogSubscription](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogSubscription/CreateAppCatalogSubscription) API call.
     * <p>
     * To get the image ID to launch an instance, issue a [GetAppCatalogListingResourceVersion](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion) API call.
     * Lastly, to launch the instance, use the image ID of the listing resource version to issue a [LaunchInstance](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/Instance/LaunchInstance) API call.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListListingsResponse> listListings(
            ListListingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListListingsRequest, ListListingsResponse>
                    handler);

    /**
     * Gets the list of packages for a listing.
     * <p>
     * If you plan to launch an instance from an image listing, you must first subscribe to the listing. When
     * you launch the instance, you also need to provide the image ID of the listing resource version that you want.
     * <p>
     * Subscribing to the listing requires you to first get a signature from the terms of use agreement for the
     * listing resource version. To get the signature, issue a [GetAppCatalogListingAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements/GetAppCatalogListingAgreements) API call.
     * The [AppCatalogListingResourceVersionAgreements](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersionAgreements) object, including
     * its signature, is returned in the response. With the signature for the terms of use agreement for the desired
     * listing resource version, create a subscription by issuing a
     * [CreateAppCatalogSubscription](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogSubscription/CreateAppCatalogSubscription) API call.
     * <p>
     * To get the image ID to launch an instance, issue a [GetAppCatalogListingResourceVersion](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/AppCatalogListingResourceVersion/GetAppCatalogListingResourceVersion) API call.
     * Lastly, to launch the instance, use the image ID of the listing resource version to issue a [LaunchInstance](https://docs.cloud.oracle.com/en-us/iaas/api/#/en/iaas/latest/Instance/LaunchInstance) API call.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPackagesResponse> listPackages(
            ListPackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPackagesRequest, ListPackagesResponse>
                    handler);

    /**
     * Lists the packages in the specified publication.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPublicationPackagesResponse> listPublicationPackages(
            ListPublicationPackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPublicationPackagesRequest, ListPublicationPackagesResponse>
                    handler);

    /**
     * Lists the publications in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPublicationsResponse> listPublications(
            ListPublicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPublicationsRequest, ListPublicationsResponse>
                    handler);

    /**
     * Gets the list of all the publishers of listings available in Oracle Cloud Infrastructure Marketplace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPublishersResponse> listPublishers(
            ListPublishersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPublishersRequest, ListPublishersResponse>
                    handler);

    /**
     * Lists available types of reports for the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListReportTypesResponse> listReportTypes(
            ListReportTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListReportTypesRequest, ListReportTypesResponse>
                    handler);

    /**
     * Lists reports in the compartment that match the specified report type and date.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListReportsResponse> listReports(
            ListReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse> handler);

    /**
     * Returns list of all tax implications that current tenant may be liable to once they launch the listing.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTaxesResponse> listTaxes(
            ListTaxesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTaxesRequest, ListTaxesResponse> handler);

    /**
     * Queries all Marketplace Applications to find listings that match the specified criteria. To search
     * for a listing, you can use a free text or structured search.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SearchListingsResponse> searchListings(
            SearchListingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<SearchListingsRequest, SearchListingsResponse>
                    handler);

    /**
     * Updates the display name or tags associated with a listing's previously accepted terms of use agreement.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAcceptedAgreementResponse> updateAcceptedAgreement(
            UpdateAcceptedAgreementRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAcceptedAgreementRequest, UpdateAcceptedAgreementResponse>
                    handler);

    /**
     * Updates the details of an existing publication.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePublicationResponse> updatePublication(
            UpdatePublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePublicationRequest, UpdatePublicationResponse>
                    handler);
}
