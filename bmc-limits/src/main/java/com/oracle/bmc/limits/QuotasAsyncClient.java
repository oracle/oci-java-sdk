/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.limits.requests.*;
import com.oracle.bmc.limits.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Quotas service. <br>
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class QuotasAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements QuotasAsync {
    /** Service instance for Quotas. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("QUOTAS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://limits.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(QuotasAsyncClient.class);

    private QuotasAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, QuotasAsyncClient> {
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
        public QuotasAsyncClient build(
                @javax.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new QuotasAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<AddQuotaLockResponse> addQuotaLock(
            AddQuotaLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<AddQuotaLockRequest, AddQuotaLockResponse>
                    handler) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");
        Objects.requireNonNull(request.getAddLockDetails(), "addLockDetails is required");

        return clientCall(request, AddQuotaLockResponse::builder)
                .logger(LOG, "addQuotaLock")
                .serviceDetails(
                        "Quotas",
                        "AddQuotaLock",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/AddQuotaLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddQuotaLockRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class,
                        AddQuotaLockResponse.Builder::quota)
                .handleResponseHeaderString("etag", AddQuotaLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", AddQuotaLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateQuotaResponse> createQuota(
            CreateQuotaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateQuotaRequest, CreateQuotaResponse>
                    handler) {
        Objects.requireNonNull(request.getCreateQuotaDetails(), "createQuotaDetails is required");

        return clientCall(request, CreateQuotaResponse::builder)
                .logger(LOG, "createQuota")
                .serviceDetails(
                        "Quotas",
                        "CreateQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/CreateQuota")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class, CreateQuotaResponse.Builder::quota)
                .handleResponseHeaderString(
                        "opc-request-id", CreateQuotaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateQuotaResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteQuotaResponse> deleteQuota(
            DeleteQuotaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteQuotaRequest, DeleteQuotaResponse>
                    handler) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");

        return clientCall(request, DeleteQuotaResponse::builder)
                .logger(LOG, "deleteQuota")
                .serviceDetails(
                        "Quotas",
                        "DeleteQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/DeleteQuota")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteQuotaResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetQuotaResponse> getQuota(
            GetQuotaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetQuotaRequest, GetQuotaResponse>
                    handler) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");

        return clientCall(request, GetQuotaResponse::builder)
                .logger(LOG, "getQuota")
                .serviceDetails(
                        "Quotas",
                        "GetQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/GetQuota")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class, GetQuotaResponse.Builder::quota)
                .handleResponseHeaderString(
                        "opc-request-id", GetQuotaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetQuotaResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListQuotasResponse> listQuotas(
            ListQuotasRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListQuotasRequest, ListQuotasResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListQuotasResponse::builder)
                .logger(LOG, "listQuotas")
                .serviceDetails(
                        "Quotas",
                        "ListQuotas",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/QuotaSummary/ListQuotas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListQuotasRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.limits.model.QuotaSummary.class,
                        ListQuotasResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListQuotasResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListQuotasResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<RemoveQuotaLockResponse> removeQuotaLock(
            RemoveQuotaLockRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            RemoveQuotaLockRequest, RemoveQuotaLockResponse>
                    handler) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");
        Objects.requireNonNull(request.getRemoveLockDetails(), "removeLockDetails is required");

        return clientCall(request, RemoveQuotaLockResponse::builder)
                .logger(LOG, "removeQuotaLock")
                .serviceDetails(
                        "Quotas",
                        "RemoveQuotaLock",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/RemoveQuotaLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveQuotaLockRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class,
                        RemoveQuotaLockResponse.Builder::quota)
                .handleResponseHeaderString("etag", RemoveQuotaLockResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveQuotaLockResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateQuotaResponse> updateQuota(
            UpdateQuotaRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateQuotaRequest, UpdateQuotaResponse>
                    handler) {

        Validate.notBlank(request.getQuotaId(), "quotaId must not be blank");
        Objects.requireNonNull(request.getUpdateQuotaDetails(), "updateQuotaDetails is required");

        return clientCall(request, UpdateQuotaResponse::builder)
                .logger(LOG, "updateQuota")
                .serviceDetails(
                        "Quotas",
                        "UpdateQuota",
                        "https://docs.oracle.com/iaas/api/#/en/limits/20181025/Quota/UpdateQuota")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateQuotaRequest::builder)
                .basePath("/")
                .appendPathParam("20181025")
                .appendPathParam("quotas")
                .appendPathParam(request.getQuotaId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.limits.model.Quota.class, UpdateQuotaResponse.Builder::quota)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateQuotaResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateQuotaResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public QuotasAsyncClient(
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
    public QuotasAsyncClient(
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
    public QuotasAsyncClient(
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
    public QuotasAsyncClient(
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
    public QuotasAsyncClient(
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
    public QuotasAsyncClient(
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
    public QuotasAsyncClient(
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
