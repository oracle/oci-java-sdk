/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplace.requests.*;
import com.oracle.bmc.marketplace.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Marketplace service. <br>
 * There are two ways to use async client: 1. Use AsyncHandler: using AsyncHandler, if the response
 * to the call is an {@link java.io.InputStream}, like getObject Api in object storage service,
 * developers need to process the stream in AsyncHandler, and not anywhere else, because the stream
 * will be closed right after the AsyncHandler is invoked. <br>
 * 2. Use Java Future: using Java Future, developers need to close the stream after they are done
 * with the Java Future.<br>
 * Accessing the result should be done in a mutually exclusive manner, either through the Future or
 * the AsyncHandler, but not both. If the Future is used, the caller should pass in null as the
 * AsyncHandler. If the AsyncHandler is used, it is still safe to use the Future to determine
 * whether or not the request was completed via Future.isDone/isCancelled.<br>
 * Please refer to
 * https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class MarketplaceAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MarketplaceAsync {
    /** Service instance for Marketplace. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MARKETPLACE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://marketplace.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MarketplaceAsyncClient.class);

    MarketplaceAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(builder, authenticationDetailsProvider);
    }

    /**
     * Create a builder for this client.
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be
     * passed to the {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MarketplaceAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "marketplace";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public MarketplaceAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MarketplaceAsyncClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    public java.util.concurrent.Future<ChangePublicationCompartmentResponse>
            changePublicationCompartment(
                    ChangePublicationCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangePublicationCompartmentRequest,
                                    ChangePublicationCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");
        Objects.requireNonNull(
                request.getChangePublicationCompartmentDetails(),
                "changePublicationCompartmentDetails is required");

        return clientCall(request, ChangePublicationCompartmentResponse::builder)
                .logger(LOG, "changePublicationCompartment")
                .serviceDetails(
                        "Marketplace",
                        "ChangePublicationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/ChangePublicationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePublicationCompartmentRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangePublicationCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateAcceptedAgreementResponse> createAcceptedAgreement(
            CreateAcceptedAgreementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateAcceptedAgreementRequest, CreateAcceptedAgreementResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateAcceptedAgreementDetails(),
                "createAcceptedAgreementDetails is required");

        return clientCall(request, CreateAcceptedAgreementResponse::builder)
                .logger(LOG, "createAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "CreateAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/CreateAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.AcceptedAgreement.class,
                        CreateAcceptedAgreementResponse.Builder::acceptedAgreement)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAcceptedAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateAcceptedAgreementResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePublicationResponse> createPublication(
            CreatePublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePublicationRequest, CreatePublicationResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePublicationDetails(), "createPublicationDetails is required");

        return clientCall(request, CreatePublicationResponse::builder)
                .logger(LOG, "createPublication")
                .serviceDetails(
                        "Marketplace",
                        "CreatePublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/CreatePublication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.Publication.class,
                        CreatePublicationResponse.Builder::publication)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePublicationResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePublicationResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteAcceptedAgreementResponse> deleteAcceptedAgreement(
            DeleteAcceptedAgreementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteAcceptedAgreementRequest, DeleteAcceptedAgreementResponse>
                    handler) {

        Validate.notBlank(
                request.getAcceptedAgreementId(), "acceptedAgreementId must not be blank");

        return clientCall(request, DeleteAcceptedAgreementResponse::builder)
                .logger(LOG, "deleteAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "DeleteAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/DeleteAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendPathParam(request.getAcceptedAgreementId())
                .appendQueryParam("signature", request.getSignature())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAcceptedAgreementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePublicationResponse> deletePublication(
            DeletePublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePublicationRequest, DeletePublicationResponse>
                    handler) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        return clientCall(request, DeletePublicationResponse::builder)
                .logger(LOG, "deletePublication")
                .serviceDetails(
                        "Marketplace",
                        "DeletePublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/DeletePublication")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAcceptedAgreementResponse> getAcceptedAgreement(
            GetAcceptedAgreementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAcceptedAgreementRequest, GetAcceptedAgreementResponse>
                    handler) {

        Validate.notBlank(
                request.getAcceptedAgreementId(), "acceptedAgreementId must not be blank");

        return clientCall(request, GetAcceptedAgreementResponse::builder)
                .logger(LOG, "getAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "GetAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/GetAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendPathParam(request.getAcceptedAgreementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.AcceptedAgreement.class,
                        GetAcceptedAgreementResponse.Builder::acceptedAgreement)
                .handleResponseHeaderString(
                        "opc-request-id", GetAcceptedAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAcceptedAgreementResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAgreementResponse> getAgreement(
            GetAgreementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAgreementRequest, GetAgreementResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        Validate.notBlank(request.getAgreementId(), "agreementId must not be blank");

        return clientCall(request, GetAgreementResponse::builder)
                .logger(LOG, "getAgreement")
                .serviceDetails(
                        "Marketplace",
                        "GetAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Agreement/GetAgreement")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .appendPathParam("agreements")
                .appendPathParam(request.getAgreementId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.Agreement.class,
                        GetAgreementResponse.Builder::agreement)
                .handleResponseHeaderString(
                        "opc-request-id", GetAgreementResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetListingResponse> getListing(
            GetListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetListingRequest, GetListingResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, GetListingResponse::builder)
                .logger(LOG, "getListing")
                .serviceDetails(
                        "Marketplace",
                        "GetListing",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Listing/GetListing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetListingRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.Listing.class,
                        GetListingResponse.Builder::listing)
                .handleResponseHeaderString(
                        "opc-request-id", GetListingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetListingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPackageResponse> getPackage(
            GetPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetPackageRequest, GetPackageResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        return clientCall(request, GetPackageResponse::builder)
                .logger(LOG, "getPackage")
                .serviceDetails(
                        "Marketplace",
                        "GetPackage",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingPackage/GetPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPackageRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.ListingPackage.class,
                        GetPackageResponse.Builder::listingPackage)
                .handleResponseHeaderString(
                        "opc-request-id", GetPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPublicationResponse> getPublication(
            GetPublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublicationRequest, GetPublicationResponse>
                    handler) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        return clientCall(request, GetPublicationResponse::builder)
                .logger(LOG, "getPublication")
                .serviceDetails(
                        "Marketplace",
                        "GetPublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/GetPublication")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.Publication.class,
                        GetPublicationResponse.Builder::publication)
                .handleResponseHeaderString("etag", GetPublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPublicationPackageResponse> getPublicationPackage(
            GetPublicationPackageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPublicationPackageRequest, GetPublicationPackageResponse>
                    handler) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        return clientCall(request, GetPublicationPackageResponse::builder)
                .logger(LOG, "getPublicationPackage")
                .serviceDetails(
                        "Marketplace",
                        "GetPublicationPackage",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublicationPackage/GetPublicationPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPublicationPackageRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.PublicationPackage.class,
                        GetPublicationPackageResponse.Builder::publicationPackage)
                .handleResponseHeaderString("etag", GetPublicationPackageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPublicationPackageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAcceptedAgreementsResponse> listAcceptedAgreements(
            ListAcceptedAgreementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAcceptedAgreementsRequest, ListAcceptedAgreementsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAcceptedAgreementsResponse::builder)
                .logger(LOG, "listAcceptedAgreements")
                .serviceDetails(
                        "Marketplace",
                        "ListAcceptedAgreements",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreementSummary/ListAcceptedAgreements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAcceptedAgreementsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("packageVersion", request.getPackageVersion())
                .appendQueryParam("acceptedAgreementId", request.getAcceptedAgreementId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.AcceptedAgreementSummary.class,
                        ListAcceptedAgreementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAcceptedAgreementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAcceptedAgreementsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAgreementsResponse> listAgreements(
            ListAgreementsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAgreementsRequest, ListAgreementsResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        Validate.notBlank(request.getPackageVersion(), "packageVersion must not be blank");

        return clientCall(request, ListAgreementsResponse::builder)
                .logger(LOG, "listAgreements")
                .serviceDetails(
                        "Marketplace",
                        "ListAgreements",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AgreementSummary/ListAgreements")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAgreementsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendPathParam(request.getPackageVersion())
                .appendPathParam("agreements")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.AgreementSummary.class,
                        ListAgreementsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAgreementsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAgreementsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCategoriesResponse> listCategories(
            ListCategoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCategoriesRequest, ListCategoriesResponse>
                    handler) {

        return clientCall(request, ListCategoriesResponse::builder)
                .logger(LOG, "listCategories")
                .serviceDetails(
                        "Marketplace",
                        "ListCategories",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/CategorySummary/ListCategories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCategoriesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("categories")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.CategorySummary.class,
                        ListCategoriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCategoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCategoriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListListingsResponse> listListings(
            ListListingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListListingsRequest, ListListingsResponse>
                    handler) {

        return clientCall(request, ListListingsResponse::builder)
                .logger(LOG, "listListings")
                .serviceDetails(
                        "Marketplace",
                        "ListListings",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingSummary/ListListings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListListingsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("imageId", request.getImageId())
                .appendQueryParam("publisherId", request.getPublisherId())
                .appendQueryParam("packageType", request.getPackageType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendListQueryParam(
                        "category",
                        request.getCategory(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "pricing",
                        request.getPricing(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("isFeatured", request.getIsFeatured())
                .appendListQueryParam(
                        "listingTypes",
                        request.getListingTypes(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "operatingSystems",
                        request.getOperatingSystems(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.ListingSummary.class,
                        ListListingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListListingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListListingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPackagesResponse> listPackages(
            ListPackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPackagesRequest, ListPackagesResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, ListPackagesResponse::builder)
                .logger(LOG, "listPackages")
                .serviceDetails(
                        "Marketplace",
                        "ListPackages",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingPackageSummary/ListPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPackagesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("packages")
                .appendQueryParam("packageVersion", request.getPackageVersion())
                .appendQueryParam("packageType", request.getPackageType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.ListingPackageSummary.class,
                        ListPackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPublicationPackagesResponse> listPublicationPackages(
            ListPublicationPackagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublicationPackagesRequest, ListPublicationPackagesResponse>
                    handler) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");

        return clientCall(request, ListPublicationPackagesResponse::builder)
                .logger(LOG, "listPublicationPackages")
                .serviceDetails(
                        "Marketplace",
                        "ListPublicationPackages",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublicationPackageSummary/ListPublicationPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicationPackagesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .appendPathParam("packages")
                .appendQueryParam("packageVersion", request.getPackageVersion())
                .appendQueryParam("packageType", request.getPackageType())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.PublicationPackageSummary.class,
                        ListPublicationPackagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicationPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicationPackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPublicationsResponse> listPublications(
            ListPublicationsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublicationsRequest, ListPublicationsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getListingType(), "listingType is required");

        return clientCall(request, ListPublicationsResponse::builder)
                .logger(LOG, "listPublications")
                .serviceDetails(
                        "Marketplace",
                        "ListPublications",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublicationSummary/ListPublications")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublicationsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "name",
                        request.getName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("listingType", request.getListingType())
                .appendQueryParam("publicationId", request.getPublicationId())
                .appendListQueryParam(
                        "operatingSystems",
                        request.getOperatingSystems(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.PublicationSummary.class,
                        ListPublicationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublicationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublicationsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPublishersResponse> listPublishers(
            ListPublishersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPublishersRequest, ListPublishersResponse>
                    handler) {

        return clientCall(request, ListPublishersResponse::builder)
                .logger(LOG, "listPublishers")
                .serviceDetails(
                        "Marketplace",
                        "ListPublishers",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/PublisherSummary/ListPublishers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPublishersRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publishers")
                .appendQueryParam("publisherId", request.getPublisherId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.PublisherSummary.class,
                        ListPublishersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPublishersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPublishersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReportTypesResponse> listReportTypes(
            ListReportTypesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListReportTypesRequest, ListReportTypesResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListReportTypesResponse::builder)
                .logger(LOG, "listReportTypes")
                .serviceDetails(
                        "Marketplace",
                        "ListReportTypes",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ReportTypeCollection/ListReportTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReportTypesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("reportTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.ReportTypeCollection.class,
                        ListReportTypesResponse.Builder::reportTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportTypesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListReportsResponse> listReports(
            ListReportsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListReportsRequest, ListReportsResponse>
                    handler) {
        Objects.requireNonNull(request.getReportType(), "reportType is required");

        Objects.requireNonNull(request.getDate(), "date is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListReportsResponse::builder)
                .logger(LOG, "listReports")
                .serviceDetails(
                        "Marketplace",
                        "ListReports",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ReportCollection/ListReports")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReportsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("reports")
                .appendQueryParam("reportType", request.getReportType())
                .appendQueryParam("date", request.getDate())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplace.model.ReportCollection.class,
                        ListReportsResponse.Builder::reportCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReportsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReportsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTaxesResponse> listTaxes(
            ListTaxesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTaxesRequest, ListTaxesResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, ListTaxesResponse::builder)
                .logger(LOG, "listTaxes")
                .serviceDetails(
                        "Marketplace",
                        "ListTaxes",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/TaxSummary/ListTaxes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTaxesRequest::builder)
                .basePath("/20181001")
                .appendPathParam("listings")
                .appendPathParam(request.getListingId())
                .appendPathParam("taxes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.TaxSummary.class,
                        ListTaxesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListTaxesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListTaxesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SearchListingsResponse> searchListings(
            SearchListingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SearchListingsRequest, SearchListingsResponse>
                    handler) {
        Objects.requireNonNull(
                request.getSearchListingsDetails(), "searchListingsDetails is required");

        return clientCall(request, SearchListingsResponse::builder)
                .logger(LOG, "searchListings")
                .serviceDetails(
                        "Marketplace",
                        "SearchListings",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/ListingSummary/SearchListings")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SearchListingsRequest::builder)
                .basePath("/20181001")
                .appendPathParam("searchListings")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBodyList(
                        com.oracle.bmc.marketplace.model.ListingSummary.class,
                        SearchListingsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", SearchListingsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SearchListingsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateAcceptedAgreementResponse> updateAcceptedAgreement(
            UpdateAcceptedAgreementRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateAcceptedAgreementRequest, UpdateAcceptedAgreementResponse>
                    handler) {

        Validate.notBlank(
                request.getAcceptedAgreementId(), "acceptedAgreementId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAcceptedAgreementDetails(),
                "updateAcceptedAgreementDetails is required");

        return clientCall(request, UpdateAcceptedAgreementResponse::builder)
                .logger(LOG, "updateAcceptedAgreement")
                .serviceDetails(
                        "Marketplace",
                        "UpdateAcceptedAgreement",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/AcceptedAgreement/UpdateAcceptedAgreement")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAcceptedAgreementRequest::builder)
                .basePath("/20181001")
                .appendPathParam("acceptedAgreements")
                .appendPathParam(request.getAcceptedAgreementId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.AcceptedAgreement.class,
                        UpdateAcceptedAgreementResponse.Builder::acceptedAgreement)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAcceptedAgreementResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateAcceptedAgreementResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePublicationResponse> updatePublication(
            UpdatePublicationRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePublicationRequest, UpdatePublicationResponse>
                    handler) {

        Validate.notBlank(request.getPublicationId(), "publicationId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePublicationDetails(), "updatePublicationDetails is required");

        return clientCall(request, UpdatePublicationResponse::builder)
                .logger(LOG, "updatePublication")
                .serviceDetails(
                        "Marketplace",
                        "UpdatePublication",
                        "https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Publication/UpdatePublication")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePublicationRequest::builder)
                .basePath("/20181001")
                .appendPathParam("publications")
                .appendPathParam(request.getPublicationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.marketplace.model.Publication.class,
                        UpdatePublicationResponse.Builder::publication)
                .handleResponseHeaderString("etag", UpdatePublicationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePublicationResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint),
                authenticationDetailsProvider);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link
     *     Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAsyncClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider);
    }
}
