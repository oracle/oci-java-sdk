/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.marketplacepublisher.requests.*;
import com.oracle.bmc.marketplacepublisher.responses.*;

import java.util.Objects;

/**
 * Async client implementation for MarketplaceAdministrator service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class MarketplaceAdministratorAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MarketplaceAdministratorAsync {
    /** Service instance for MarketplaceAdministrator. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(MarketplaceAdministratorClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://marketplace-publisher.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MarketplaceAdministratorAsyncClient.class);

    MarketplaceAdministratorAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<
                    Builder, MarketplaceAdministratorAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "marketplacepublisher";
            com.oracle.bmc.internal.DeveloperToolConfiguration
                    .throwDisabledServiceExceptionIfAppropriate(packageName);
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
        public MarketplaceAdministratorAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MarketplaceAdministratorAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeListingRevisionStatusToNewResponse>
            changeListingRevisionStatusToNew(
                    ChangeListingRevisionStatusToNewRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeListingRevisionStatusToNewRequest,
                                    ChangeListingRevisionStatusToNewResponse>
                            handler) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, ChangeListingRevisionStatusToNewResponse::builder)
                .logger(LOG, "changeListingRevisionStatusToNew")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ChangeListingRevisionStatusToNew",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevision/ChangeListingRevisionStatusToNew")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeListingRevisionStatusToNewRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .appendPathParam("status")
                .appendPathParam("new")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminListingRevision.class,
                        ChangeListingRevisionStatusToNewResponse.Builder::adminListingRevision)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeListingRevisionStatusToNewResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", ChangeListingRevisionStatusToNewResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMarketResponse> createMarket(
            CreateMarketRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateMarketRequest, CreateMarketResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateMarketDetails(), "createMarketDetails is required");

        return clientCall(request, CreateMarketResponse::builder)
                .logger(LOG, "createMarket")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "CreateMarket",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/Market/CreateMarket")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMarketRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminMarkets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateMarketResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMarketResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminArtifactResponse> getAdminArtifact(
            GetAdminArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAdminArtifactRequest, GetAdminArtifactResponse>
                    handler) {

        Validate.notBlank(request.getArtifactId(), "artifactId must not be blank");

        return clientCall(request, GetAdminArtifactResponse::builder)
                .logger(LOG, "getAdminArtifact")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminArtifact/GetAdminArtifact")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminArtifactRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminArtifacts")
                .appendPathParam(request.getArtifactId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminArtifact.class,
                        GetAdminArtifactResponse.Builder::adminArtifact)
                .handleResponseHeaderString("etag", GetAdminArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdminArtifactResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminListingResponse> getAdminListing(
            GetAdminListingRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAdminListingRequest, GetAdminListingResponse>
                    handler) {

        Validate.notBlank(request.getListingId(), "listingId must not be blank");

        return clientCall(request, GetAdminListingResponse::builder)
                .logger(LOG, "getAdminListing")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminListing",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListing/GetAdminListing")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminListingRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListings")
                .appendPathParam(request.getListingId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminListing.class,
                        GetAdminListingResponse.Builder::adminListing)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdminListingResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetAdminListingResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminListingRevisionResponse> getAdminListingRevision(
            GetAdminListingRevisionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAdminListingRevisionRequest, GetAdminListingRevisionResponse>
                    handler) {

        Validate.notBlank(request.getListingRevisionId(), "listingRevisionId must not be blank");

        return clientCall(request, GetAdminListingRevisionResponse::builder)
                .logger(LOG, "getAdminListingRevision")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminListingRevision",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevision/GetAdminListingRevision")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminListingRevisionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisions")
                .appendPathParam(request.getListingRevisionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminListingRevision.class,
                        GetAdminListingRevisionResponse.Builder::adminListingRevision)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdminListingRevisionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", GetAdminListingRevisionResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminListingRevisionAttachmentResponse>
            getAdminListingRevisionAttachment(
                    GetAdminListingRevisionAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAdminListingRevisionAttachmentRequest,
                                    GetAdminListingRevisionAttachmentResponse>
                            handler) {

        Validate.notBlank(
                request.getListingRevisionAttachmentId(),
                "listingRevisionAttachmentId must not be blank");

        return clientCall(request, GetAdminListingRevisionAttachmentResponse::builder)
                .logger(LOG, "getAdminListingRevisionAttachment")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminListingRevisionAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevisionAttachment/GetAdminListingRevisionAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminListingRevisionAttachmentRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisionAttachments")
                .appendPathParam(request.getListingRevisionAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionAttachment
                                .class,
                        GetAdminListingRevisionAttachmentResponse.Builder
                                ::adminListingRevisionAttachment)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAdminListingRevisionAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetAdminListingRevisionAttachmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminListingRevisionPackageResponse>
            getAdminListingRevisionPackage(
                    GetAdminListingRevisionPackageRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetAdminListingRevisionPackageRequest,
                                    GetAdminListingRevisionPackageResponse>
                            handler) {

        Validate.notBlank(
                request.getListingRevisionPackageId(),
                "listingRevisionPackageId must not be blank");

        return clientCall(request, GetAdminListingRevisionPackageResponse::builder)
                .logger(LOG, "getAdminListingRevisionPackage")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminListingRevisionPackage",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevisionPackage/GetAdminListingRevisionPackage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminListingRevisionPackageRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisionPackages")
                .appendPathParam(request.getListingRevisionPackageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionPackage.class,
                        GetAdminListingRevisionPackageResponse.Builder::adminListingRevisionPackage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAdminListingRevisionPackageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetAdminListingRevisionPackageResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminTermResponse> getAdminTerm(
            GetAdminTermRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetAdminTermRequest, GetAdminTermResponse>
                    handler) {

        Validate.notBlank(request.getTermId(), "termId must not be blank");

        return clientCall(request, GetAdminTermResponse::builder)
                .logger(LOG, "getAdminTerm")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminTerm",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminTerm/GetAdminTerm")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminTermRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminTerms")
                .appendPathParam(request.getTermId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminTerm.class,
                        GetAdminTermResponse.Builder::adminTerm)
                .handleResponseHeaderString("etag", GetAdminTermResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdminTermResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAdminTermVersionResponse> getAdminTermVersion(
            GetAdminTermVersionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAdminTermVersionRequest, GetAdminTermVersionResponse>
                    handler) {

        Validate.notBlank(request.getTermVersionId(), "termVersionId must not be blank");

        return clientCall(request, GetAdminTermVersionResponse::builder)
                .logger(LOG, "getAdminTermVersion")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "GetAdminTermVersion",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminTermVersion/GetAdminTermVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAdminTermVersionRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminTermVersions")
                .appendPathParam(request.getTermVersionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminTermVersion.class,
                        GetAdminTermVersionResponse.Builder::adminTermVersion)
                .handleResponseHeaderString("etag", GetAdminTermVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAdminTermVersionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminArtifactsResponse> listAdminArtifacts(
            ListAdminArtifactsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminArtifactsRequest, ListAdminArtifactsResponse>
                    handler) {

        return clientCall(request, ListAdminArtifactsResponse::builder)
                .logger(LOG, "listAdminArtifacts")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminArtifacts",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminArtifactCollection/ListAdminArtifacts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminArtifactsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminArtifacts")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("publisherId", request.getPublisherId())
                .appendEnumQueryParam("artifactType", request.getArtifactType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminArtifactCollection.class,
                        ListAdminArtifactsResponse.Builder::adminArtifactCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminArtifactsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminListingRevisionAttachmentsResponse>
            listAdminListingRevisionAttachments(
                    ListAdminListingRevisionAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAdminListingRevisionAttachmentsRequest,
                                    ListAdminListingRevisionAttachmentsResponse>
                            handler) {
        Objects.requireNonNull(request.getListingRevisionId(), "listingRevisionId is required");

        return clientCall(request, ListAdminListingRevisionAttachmentsResponse::builder)
                .logger(LOG, "listAdminListingRevisionAttachments")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminListingRevisionAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevisionAttachmentCollection/ListAdminListingRevisionAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminListingRevisionAttachmentsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisionAttachments")
                .appendQueryParam("listingRevisionId", request.getListingRevisionId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model
                                .AdminListingRevisionAttachmentCollection.class,
                        ListAdminListingRevisionAttachmentsResponse.Builder
                                ::adminListingRevisionAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAdminListingRevisionAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAdminListingRevisionAttachmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminListingRevisionPackagesResponse>
            listAdminListingRevisionPackages(
                    ListAdminListingRevisionPackagesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAdminListingRevisionPackagesRequest,
                                    ListAdminListingRevisionPackagesResponse>
                            handler) {
        Objects.requireNonNull(request.getListingRevisionId(), "listingRevisionId is required");

        return clientCall(request, ListAdminListingRevisionPackagesResponse::builder)
                .logger(LOG, "listAdminListingRevisionPackages")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminListingRevisionPackages",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevisionPackageCollection/ListAdminListingRevisionPackages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminListingRevisionPackagesRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisionPackages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("listingRevisionId", request.getListingRevisionId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model
                                .AdminListingRevisionPackageCollection.class,
                        ListAdminListingRevisionPackagesResponse.Builder
                                ::adminListingRevisionPackageCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAdminListingRevisionPackagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAdminListingRevisionPackagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminListingRevisionsResponse> listAdminListingRevisions(
            ListAdminListingRevisionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminListingRevisionsRequest, ListAdminListingRevisionsResponse>
                    handler) {

        return clientCall(request, ListAdminListingRevisionsResponse::builder)
                .logger(LOG, "listAdminListingRevisions")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminListingRevisions",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminListingRevisionCollection/ListAdminListingRevisions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminListingRevisionsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminListingRevisions")
                .appendQueryParam("listingId", request.getListingId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("listingType", request.getListingType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("publisherId", request.getPublisherId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("listingRevisionStatus", request.getListingRevisionStatus())
                .appendQueryParam("statusCsv", request.getStatusCsv())
                .appendQueryParam("product", request.getProduct())
                .appendQueryParam("timeCreatedAfter", request.getTimeCreatedAfter())
                .appendQueryParam("timeUpdatedAfter", request.getTimeUpdatedAfter())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("pricingType", request.getPricingType())
                .appendQueryParam("isPrivateOfferEnabled", request.getIsPrivateOfferEnabled())
                .appendQueryParam("dataSource", request.getDataSource())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminListingRevisionCollection
                                .class,
                        ListAdminListingRevisionsResponse.Builder::adminListingRevisionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminListingRevisionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminListingRevisionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminPublisherSkusResponse> listAdminPublisherSkus(
            ListAdminPublisherSkusRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminPublisherSkusRequest, ListAdminPublisherSkusResponse>
                    handler) {

        return clientCall(request, ListAdminPublisherSkusResponse::builder)
                .logger(LOG, "listAdminPublisherSkus")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminPublisherSkus",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminPublisherSkuCollection/ListAdminPublisherSkus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminPublisherSkusRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminPublisherSkus")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminPublisherSkuCollection.class,
                        ListAdminPublisherSkusResponse.Builder::adminPublisherSkuCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminPublisherSkusResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminPublisherSkusResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminTermVersionsResponse> listAdminTermVersions(
            ListAdminTermVersionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminTermVersionsRequest, ListAdminTermVersionsResponse>
                    handler) {
        Objects.requireNonNull(request.getTermId(), "termId is required");

        return clientCall(request, ListAdminTermVersionsResponse::builder)
                .logger(LOG, "listAdminTermVersions")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminTermVersions",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminTermVersionCollection/ListAdminTermVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminTermVersionsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminTermVersions")
                .appendQueryParam("termId", request.getTermId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminTermVersionCollection.class,
                        ListAdminTermVersionsResponse.Builder::adminTermVersionCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminTermVersionsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminTermVersionsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminTermsResponse> listAdminTerms(
            ListAdminTermsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminTermsRequest, ListAdminTermsResponse>
                    handler) {

        return clientCall(request, ListAdminTermsResponse::builder)
                .logger(LOG, "listAdminTerms")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminTerms",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminTermCollection/ListAdminTerms")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminTermsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminTerms")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("name", request.getName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminTermCollection.class,
                        ListAdminTermsResponse.Builder::adminTermCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminTermsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminTermsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAdminWorkRequestsResponse> listAdminWorkRequests(
            ListAdminWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAdminWorkRequestsRequest, ListAdminWorkRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAdminWorkRequestsResponse::builder)
                .logger(LOG, "listAdminWorkRequests")
                .serviceDetails(
                        "MarketplaceAdministrator",
                        "ListAdminWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/publisher/20241201/AdminWorkRequestSummary/ListAdminWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAdminWorkRequestsRequest::builder)
                .basePath("/20241201")
                .appendPathParam("adminWorkRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.marketplacepublisher.model.AdminWorkRequestSummaryCollection
                                .class,
                        ListAdminWorkRequestsResponse.Builder::adminWorkRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAdminWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAdminWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MarketplaceAdministratorAsyncClient(
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
    public MarketplaceAdministratorAsyncClient(
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
    public MarketplaceAdministratorAsyncClient(
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
    public MarketplaceAdministratorAsyncClient(
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
    public MarketplaceAdministratorAsyncClient(
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
    public MarketplaceAdministratorAsyncClient(
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
    public MarketplaceAdministratorAsyncClient(
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
