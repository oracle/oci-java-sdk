/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.limitsincrease.requests.*;
import com.oracle.bmc.limitsincrease.responses.*;

import java.util.Objects;

/**
 * Async client implementation for LimitsIncrease service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class LimitsIncreaseAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements LimitsIncreaseAsync {
    /** Service instance for LimitsIncrease. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(LimitsIncreaseClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://limits.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(LimitsIncreaseAsyncClient.class);

    LimitsIncreaseAsyncClient(
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
                    Builder, LimitsIncreaseAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "limitsincrease";
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
        public LimitsIncreaseAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new LimitsIncreaseAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelLimitsIncreaseItemRequestResponse>
            cancelLimitsIncreaseItemRequest(
                    CancelLimitsIncreaseItemRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelLimitsIncreaseItemRequestRequest,
                                    CancelLimitsIncreaseItemRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getLimitsIncreaseItemRequestId(),
                "limitsIncreaseItemRequestId must not be blank");

        return clientCall(request, CancelLimitsIncreaseItemRequestResponse::builder)
                .logger(LOG, "cancelLimitsIncreaseItemRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "CancelLimitsIncreaseItemRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseItemRequest/CancelLimitsIncreaseItemRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelLimitsIncreaseItemRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseItemRequests")
                .appendPathParam(request.getLimitsIncreaseItemRequestId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.class,
                        CancelLimitsIncreaseItemRequestResponse.Builder::limitsIncreaseItemRequest)
                .handleResponseHeaderString(
                        "etag", CancelLimitsIncreaseItemRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelLimitsIncreaseItemRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelLimitsIncreaseRequestResponse>
            cancelLimitsIncreaseRequest(
                    CancelLimitsIncreaseRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelLimitsIncreaseRequestRequest,
                                    CancelLimitsIncreaseRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, CancelLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "cancelLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "CancelLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/CancelLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        CancelLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", CancelLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateLimitsIncreaseRequestResponse>
            createLimitsIncreaseRequest(
                    CreateLimitsIncreaseRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateLimitsIncreaseRequestRequest,
                                    CreateLimitsIncreaseRequestResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateLimitsIncreaseRequestDetails(),
                "createLimitsIncreaseRequestDetails is required");

        return clientCall(request, CreateLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "createLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "CreateLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/CreateLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        CreateLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", CreateLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteLimitsIncreaseRequestResponse>
            deleteLimitsIncreaseRequest(
                    DeleteLimitsIncreaseRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteLimitsIncreaseRequestRequest,
                                    DeleteLimitsIncreaseRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, DeleteLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "deleteLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "DeleteLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/DeleteLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLimitsIncreaseItemRequestResponse>
            getLimitsIncreaseItemRequest(
                    GetLimitsIncreaseItemRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetLimitsIncreaseItemRequestRequest,
                                    GetLimitsIncreaseItemRequestResponse>
                            handler) {

        Validate.notBlank(
                request.getLimitsIncreaseItemRequestId(),
                "limitsIncreaseItemRequestId must not be blank");

        return clientCall(request, GetLimitsIncreaseItemRequestResponse::builder)
                .logger(LOG, "getLimitsIncreaseItemRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "GetLimitsIncreaseItemRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseItemRequest/GetLimitsIncreaseItemRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLimitsIncreaseItemRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseItemRequests")
                .appendPathParam(request.getLimitsIncreaseItemRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest.class,
                        GetLimitsIncreaseItemRequestResponse.Builder::limitsIncreaseItemRequest)
                .handleResponseHeaderString(
                        "etag", GetLimitsIncreaseItemRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetLimitsIncreaseItemRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetLimitsIncreaseRequestResponse> getLimitsIncreaseRequest(
            GetLimitsIncreaseRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetLimitsIncreaseRequestRequest, GetLimitsIncreaseRequestResponse>
                    handler) {

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, GetLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "getLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "GetLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/GetLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        GetLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString("etag", GetLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLimitsIncreaseItemRequestsResponse>
            listLimitsIncreaseItemRequests(
                    ListLimitsIncreaseItemRequestsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLimitsIncreaseItemRequestsRequest,
                                    ListLimitsIncreaseItemRequestsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitsIncreaseItemRequestsResponse::builder)
                .logger(LOG, "listLimitsIncreaseItemRequests")
                .serviceDetails(
                        "LimitsIncrease",
                        "ListLimitsIncreaseItemRequests",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseItemRequestCollection/ListLimitsIncreaseItemRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitsIncreaseItemRequestsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseItemRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("service", request.getService())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limitsIncreaseRequestId", request.getLimitsIncreaseRequestId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequestCollection
                                .class,
                        ListLimitsIncreaseItemRequestsResponse.Builder
                                ::limitsIncreaseItemRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListLimitsIncreaseItemRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListLimitsIncreaseItemRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLimitsIncreaseQuestionsResponse>
            listLimitsIncreaseQuestions(
                    ListLimitsIncreaseQuestionsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLimitsIncreaseQuestionsRequest,
                                    ListLimitsIncreaseQuestionsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitsIncreaseQuestionsResponse::builder)
                .logger(LOG, "listLimitsIncreaseQuestions")
                .serviceDetails(
                        "LimitsIncrease",
                        "ListLimitsIncreaseQuestions",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseQuestionCollection/ListLimitsIncreaseQuestions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitsIncreaseQuestionsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseQuestionnaires")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("serviceName", request.getServiceName())
                .appendQueryParam("limitName", request.getLimitName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseQuestionCollection.class,
                        ListLimitsIncreaseQuestionsResponse.Builder
                                ::limitsIncreaseQuestionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLimitsIncreaseQuestionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLimitsIncreaseQuestionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListLimitsIncreaseRequestsResponse>
            listLimitsIncreaseRequests(
                    ListLimitsIncreaseRequestsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListLimitsIncreaseRequestsRequest,
                                    ListLimitsIncreaseRequestsResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListLimitsIncreaseRequestsResponse::builder)
                .logger(LOG, "listLimitsIncreaseRequests")
                .serviceDetails(
                        "LimitsIncrease",
                        "ListLimitsIncreaseRequests",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/ListLimitsIncreaseRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListLimitsIncreaseRequestsRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequestCollection.class,
                        ListLimitsIncreaseRequestsResponse.Builder::limitsIncreaseRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListLimitsIncreaseRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListLimitsIncreaseRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchLimitsIncreaseRequestResponse>
            patchLimitsIncreaseRequest(
                    PatchLimitsIncreaseRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    PatchLimitsIncreaseRequestRequest,
                                    PatchLimitsIncreaseRequestResponse>
                            handler) {
        Objects.requireNonNull(
                request.getPatchLimitsIncreaseRequestDetails(),
                "patchLimitsIncreaseRequestDetails is required");

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, PatchLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "patchLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "PatchLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/PatchLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        PatchLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", PatchLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", PatchLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateLimitsIncreaseRequestResponse>
            updateLimitsIncreaseRequest(
                    UpdateLimitsIncreaseRequestRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateLimitsIncreaseRequestRequest,
                                    UpdateLimitsIncreaseRequestResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateLimitsIncreaseRequestDetails(),
                "updateLimitsIncreaseRequestDetails is required");

        Validate.notBlank(
                request.getLimitsIncreaseRequestId(), "limitsIncreaseRequestId must not be blank");

        return clientCall(request, UpdateLimitsIncreaseRequestResponse::builder)
                .logger(LOG, "updateLimitsIncreaseRequest")
                .serviceDetails(
                        "LimitsIncrease",
                        "UpdateLimitsIncreaseRequest",
                        "https://docs.oracle.com/iaas/api/#/en/limits-increase/20251101/LimitsIncreaseRequest/UpdateLimitsIncreaseRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateLimitsIncreaseRequestRequest::builder)
                .basePath("/20251101")
                .appendPathParam("limitsIncreaseRequests")
                .appendPathParam(request.getLimitsIncreaseRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limitsincrease.model.LimitsIncreaseRequest.class,
                        UpdateLimitsIncreaseRequestResponse.Builder::limitsIncreaseRequest)
                .handleResponseHeaderString(
                        "etag", UpdateLimitsIncreaseRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateLimitsIncreaseRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public LimitsIncreaseAsyncClient(
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
    public LimitsIncreaseAsyncClient(
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
    public LimitsIncreaseAsyncClient(
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
    public LimitsIncreaseAsyncClient(
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
    public LimitsIncreaseAsyncClient(
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
    public LimitsIncreaseAsyncClient(
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
    public LimitsIncreaseAsyncClient(
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
