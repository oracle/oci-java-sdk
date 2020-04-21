/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface MarketplaceAsync extends AutoCloseable {

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
     * Removes a previously accepted terms of use agreement from the list of agreements that Marketplace checks
     * before initiating a deployment. Listings in the Marketplace that require acceptance of the specified terms
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
}
