/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface Marketplace extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Accepts a terms of use agreement for a specific package version of a listing. You must accept all
     * terms of use for a package before you can deploy the package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAcceptedAgreementResponse createAcceptedAgreement(CreateAcceptedAgreementRequest request);

    /**
     * Removes a previously accepted terms of use agreement from the list of agreements that Marketplace checks
     * before initiating a deployment. Listings in the Marketplace that require acceptance of the specified terms
     * of use can no longer be deployed, but existing deployments aren't affected.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAcceptedAgreementResponse deleteAcceptedAgreement(DeleteAcceptedAgreementRequest request);

    /**
     * Gets the details of a specific, previously accepted terms of use agreement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAcceptedAgreementResponse getAcceptedAgreement(GetAcceptedAgreementRequest request);

    /**
     * Returns a terms of use agreement for a package with a time-based signature that can be used to
     * accept the agreement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAgreementResponse getAgreement(GetAgreementRequest request);

    /**
     * Gets detailed information about a listing, including the listing's name, version, description, and
     * resources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetListingResponse getListing(GetListingRequest request);

    /**
     * Get the details of the specified version of a package, including information needed to launch the package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPackageResponse getPackage(GetPackageRequest request);

    /**
     * Lists the terms of use agreements that have been accepted in the specified compartment.
     * You can filter results by specifying query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAcceptedAgreementsResponse listAcceptedAgreements(ListAcceptedAgreementsRequest request);

    /**
     * Returns the terms of use agreements that must be accepted before you can deploy the specified version of a package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAgreementsResponse listAgreements(ListAgreementsRequest request);

    /**
     * Gets the list of all the categories for listings published to Oracle Cloud Infrastructure Marketplace. Categories apply
     * to the software product provided by the listing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCategoriesResponse listCategories(ListCategoriesRequest request);

    /**
     * Gets a list of listings from Oracle Cloud Infrastructure Marketplace by searching keywords and
     * filtering according to listing attributes.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListListingsResponse listListings(ListListingsRequest request);

    /**
     * Gets the list of packages for a listing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPackagesResponse listPackages(ListPackagesRequest request);

    /**
     * Gets the list of all the publishers of listings available in Oracle Cloud Infrastructure Marketplace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPublishersResponse listPublishers(ListPublishersRequest request);

    /**
     * Updates the display name or tags associated with a listing's previously accepted terms of use agreement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAcceptedAgreementResponse updateAcceptedAgreement(UpdateAcceptedAgreementRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    MarketplacePaginators getPaginators();
}
