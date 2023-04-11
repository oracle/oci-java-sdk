/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.operatoraccesscontrol.requests.*;
import com.oracle.bmc.operatoraccesscontrol.responses.*;

import java.util.Objects;

/**
 * Async client implementation for AccessRequests service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class AccessRequestsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements AccessRequestsAsync {
    /** Service instance for AccessRequests. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ACCESSREQUESTS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://operator-access-control.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(AccessRequestsAsyncClient.class);

    AccessRequestsAsyncClient(
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
                    Builder, AccessRequestsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public AccessRequestsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new AccessRequestsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ApproveAccessRequestResponse> approveAccessRequest(
            ApproveAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApproveAccessRequestRequest, ApproveAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");
        Objects.requireNonNull(
                request.getApproveAccessRequestDetails(),
                "approveAccessRequestDetails is required");

        return clientCall(request, ApproveAccessRequestResponse::builder)
                .logger(LOG, "approveAccessRequest")
                .serviceDetails(
                        "AccessRequests",
                        "ApproveAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/ApproveAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApproveAccessRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("action")
                .appendPathParam("approve")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ApproveAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ApproveAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetAccessRequestResponse> getAccessRequest(
            GetAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetAccessRequestRequest, GetAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");

        return clientCall(request, GetAccessRequestResponse::builder)
                .logger(LOG, "getAccessRequest")
                .serviceDetails(
                        "AccessRequests",
                        "GetAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/GetAccessRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAccessRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.AccessRequest.class,
                        GetAccessRequestResponse.Builder::accessRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<InteractionRequestResponse> interactionRequest(
            InteractionRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            InteractionRequestRequest, InteractionRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");
        Objects.requireNonNull(
                request.getInteractionRequestDetails(), "interactionRequestDetails is required");

        return clientCall(request, InteractionRequestResponse::builder)
                .logger(LOG, "interactionRequest")
                .serviceDetails(
                        "AccessRequests",
                        "InteractionRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/InteractionRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(InteractionRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("action")
                .appendPathParam("interactionRequest")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.AccessRequest.class,
                        InteractionRequestResponse.Builder::accessRequest)
                .handleResponseHeaderString("etag", InteractionRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", InteractionRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAccessRequestHistoriesResponse>
            listAccessRequestHistories(
                    ListAccessRequestHistoriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListAccessRequestHistoriesRequest,
                                    ListAccessRequestHistoriesResponse>
                            handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");

        return clientCall(request, ListAccessRequestHistoriesResponse::builder)
                .logger(LOG, "listAccessRequestHistories")
                .serviceDetails(
                        "AccessRequests",
                        "ListAccessRequestHistories",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/ListAccessRequestHistories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccessRequestHistoriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("history")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.AccessRequestHistoryCollection
                                .class,
                        ListAccessRequestHistoriesResponse.Builder::accessRequestHistoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessRequestHistoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessRequestHistoriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAccessRequestsResponse> listAccessRequests(
            ListAccessRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListAccessRequestsRequest, ListAccessRequestsResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAccessRequestsResponse::builder)
                .logger(LOG, "listAccessRequests")
                .serviceDetails(
                        "AccessRequests",
                        "ListAccessRequests",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/ListAccessRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAccessRequestsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceName", request.getResourceName())
                .appendQueryParam("resourceType", request.getResourceType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("timeStart", request.getTimeStart())
                .appendQueryParam("timeEnd", request.getTimeEnd())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.AccessRequestCollection.class,
                        ListAccessRequestsResponse.Builder::accessRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAccessRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAccessRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListInteractionsResponse> listInteractions(
            ListInteractionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListInteractionsRequest, ListInteractionsResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");

        return clientCall(request, ListInteractionsResponse::builder)
                .logger(LOG, "listInteractions")
                .serviceDetails(
                        "AccessRequests",
                        "ListInteractions",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/ListInteractions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListInteractionsRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("interactions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.InteractionCollection.class,
                        ListInteractionsResponse.Builder::interactionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListInteractionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListInteractionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RejectAccessRequestResponse> rejectAccessRequest(
            RejectAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RejectAccessRequestRequest, RejectAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");
        Objects.requireNonNull(
                request.getRejectAccessRequestDetails(), "rejectAccessRequestDetails is required");

        return clientCall(request, RejectAccessRequestResponse::builder)
                .logger(LOG, "rejectAccessRequest")
                .serviceDetails(
                        "AccessRequests",
                        "RejectAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/RejectAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RejectAccessRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("action")
                .appendPathParam("reject")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RejectAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RejectAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReviewAccessRequestResponse> reviewAccessRequest(
            ReviewAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReviewAccessRequestRequest, ReviewAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");
        Objects.requireNonNull(
                request.getReviewAccessRequestDetails(), "reviewAccessRequestDetails is required");

        return clientCall(request, ReviewAccessRequestResponse::builder)
                .logger(LOG, "reviewAccessRequest")
                .serviceDetails(
                        "AccessRequests",
                        "ReviewAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/ReviewAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReviewAccessRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("action")
                .appendPathParam("review")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.operatoraccesscontrol.model.AccessRequest.class,
                        ReviewAccessRequestResponse.Builder::accessRequest)
                .handleResponseHeaderString("etag", ReviewAccessRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ReviewAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RevokeAccessRequestResponse> revokeAccessRequest(
            RevokeAccessRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RevokeAccessRequestRequest, RevokeAccessRequestResponse>
                    handler) {

        Validate.notBlank(request.getAccessRequestId(), "accessRequestId must not be blank");
        Objects.requireNonNull(
                request.getRevokeAccessRequestDetails(), "revokeAccessRequestDetails is required");

        return clientCall(request, RevokeAccessRequestResponse::builder)
                .logger(LOG, "revokeAccessRequest")
                .serviceDetails(
                        "AccessRequests",
                        "RevokeAccessRequest",
                        "https://docs.oracle.com/iaas/api/#/en/operatoraccesscontrol/20200630/AccessRequest/RevokeAccessRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RevokeAccessRequestRequest::builder)
                .basePath("/20200630")
                .appendPathParam("accessRequests")
                .appendPathParam(request.getAccessRequestId())
                .appendPathParam("action")
                .appendPathParam("revoke")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RevokeAccessRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RevokeAccessRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public AccessRequestsAsyncClient(
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
    public AccessRequestsAsyncClient(
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
    public AccessRequestsAsyncClient(
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
    public AccessRequestsAsyncClient(
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
    public AccessRequestsAsyncClient(
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
    public AccessRequestsAsyncClient(
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
    public AccessRequestsAsyncClient(
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
