/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;

/**
 * Manage applications in Oracle Cloud Infrastructure Marketplace.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public interface Marketplace extends AutoCloseable {

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
     * Accepts a terms of use agreement for a specific package version of a listing. You must accept all
     * terms of use for a package before you can deploy the package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/CreateAcceptedAgreementExample.java.html">here</a> to see how to use CreateAcceptedAgreement API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/DeleteAcceptedAgreementExample.java.html">here</a> to see how to use DeleteAcceptedAgreement API.
     */
    DeleteAcceptedAgreementResponse deleteAcceptedAgreement(DeleteAcceptedAgreementRequest request);

    /**
     * Gets the details of a specific, previously accepted terms of use agreement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/GetAcceptedAgreementExample.java.html">here</a> to see how to use GetAcceptedAgreement API.
     */
    GetAcceptedAgreementResponse getAcceptedAgreement(GetAcceptedAgreementRequest request);

    /**
     * Returns a terms of use agreement for a package with a time-based signature that can be used to
     * accept the agreement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/GetAgreementExample.java.html">here</a> to see how to use GetAgreement API.
     */
    GetAgreementResponse getAgreement(GetAgreementRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/GetListingExample.java.html">here</a> to see how to use GetListing API.
     */
    GetListingResponse getListing(GetListingRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/GetPackageExample.java.html">here</a> to see how to use GetPackage API.
     */
    GetPackageResponse getPackage(GetPackageRequest request);

    /**
     * Lists the terms of use agreements that have been accepted in the specified compartment.
     * You can filter results by specifying query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListAcceptedAgreementsExample.java.html">here</a> to see how to use ListAcceptedAgreements API.
     */
    ListAcceptedAgreementsResponse listAcceptedAgreements(ListAcceptedAgreementsRequest request);

    /**
     * Returns the terms of use agreements that must be accepted before you can deploy the specified version of a package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListAgreementsExample.java.html">here</a> to see how to use ListAgreements API.
     */
    ListAgreementsResponse listAgreements(ListAgreementsRequest request);

    /**
     * Gets the list of all the categories for listings published to Oracle Cloud Infrastructure Marketplace. Categories apply
     * to the software product provided by the listing.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListCategoriesExample.java.html">here</a> to see how to use ListCategories API.
     */
    ListCategoriesResponse listCategories(ListCategoriesRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListListingsExample.java.html">here</a> to see how to use ListListings API.
     */
    ListListingsResponse listListings(ListListingsRequest request);

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
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListPackagesExample.java.html">here</a> to see how to use ListPackages API.
     */
    ListPackagesResponse listPackages(ListPackagesRequest request);

    /**
     * Gets the list of all the publishers of listings available in Oracle Cloud Infrastructure Marketplace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListPublishersExample.java.html">here</a> to see how to use ListPublishers API.
     */
    ListPublishersResponse listPublishers(ListPublishersRequest request);

    /**
     * Lists available types of reports for the compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListReportTypesExample.java.html">here</a> to see how to use ListReportTypes API.
     */
    ListReportTypesResponse listReportTypes(ListReportTypesRequest request);

    /**
     * Lists reports in the compartment that match the specified report type and date.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListReportsExample.java.html">here</a> to see how to use ListReports API.
     */
    ListReportsResponse listReports(ListReportsRequest request);

    /**
     * Returns list of all tax implications that current tenant may be liable to once they launch the listing.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/ListTaxesExample.java.html">here</a> to see how to use ListTaxes API.
     */
    ListTaxesResponse listTaxes(ListTaxesRequest request);

    /**
     * Updates the display name or tags associated with a listing's previously accepted terms of use agreement.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/UpdateAcceptedAgreementExample.java.html">here</a> to see how to use UpdateAcceptedAgreement API.
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
