/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;

import java.util.Objects;

/**
 * Async client implementation for ScheduledQuery service. <br>
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
public class ScheduledQueryAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements ScheduledQueryAsync {
    /** Service instance for ScheduledQuery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("SCHEDULEDQUERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://apm-trace.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ScheduledQueryAsyncClient.class);

    ScheduledQueryAsyncClient(
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
                    Builder, ScheduledQueryAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "apmtraces";
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
        public ScheduledQueryAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new ScheduledQueryAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateScheduledQueryResponse> createScheduledQuery(
            CreateScheduledQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledQueryRequest, CreateScheduledQueryResponse>
                    handler) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Objects.requireNonNull(
                request.getCreateScheduledQueryDetails(),
                "createScheduledQueryDetails is required");

        return clientCall(request, CreateScheduledQueryResponse::builder)
                .logger(LOG, "createScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "CreateScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/CreateScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQuery.class,
                        CreateScheduledQueryResponse.Builder::scheduledQuery)
                .handleResponseHeaderString(
                        "opc-request-id", CreateScheduledQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateScheduledQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteScheduledQueryResponse> deleteScheduledQuery(
            DeleteScheduledQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledQueryRequest, DeleteScheduledQueryResponse>
                    handler) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScheduledQueryId(), "scheduledQueryId must not be blank");

        return clientCall(request, DeleteScheduledQueryResponse::builder)
                .logger(LOG, "deleteScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "DeleteScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/DeleteScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendPathParam(request.getScheduledQueryId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteScheduledQueryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetScheduledQueryResponse> getScheduledQuery(
            GetScheduledQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetScheduledQueryRequest, GetScheduledQueryResponse>
                    handler) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScheduledQueryId(), "scheduledQueryId must not be blank");

        return clientCall(request, GetScheduledQueryResponse::builder)
                .logger(LOG, "getScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "GetScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/GetScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendPathParam(request.getScheduledQueryId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQuery.class,
                        GetScheduledQueryResponse.Builder::scheduledQuery)
                .handleResponseHeaderString(
                        "opc-request-id", GetScheduledQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetScheduledQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListScheduledQueriesResponse> listScheduledQueries(
            ListScheduledQueriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledQueriesRequest, ListScheduledQueriesResponse>
                    handler) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        return clientCall(request, ListScheduledQueriesResponse::builder)
                .logger(LOG, "listScheduledQueries")
                .serviceDetails(
                        "ScheduledQuery",
                        "ListScheduledQueries",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQueryCollection/ListScheduledQueries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListScheduledQueriesRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQueryCollection.class,
                        ListScheduledQueriesResponse.Builder::scheduledQueryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListScheduledQueriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListScheduledQueriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateScheduledQueryResponse> updateScheduledQuery(
            UpdateScheduledQueryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledQueryRequest, UpdateScheduledQueryResponse>
                    handler) {
        Objects.requireNonNull(request.getApmDomainId(), "apmDomainId is required");

        Validate.notBlank(request.getScheduledQueryId(), "scheduledQueryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateScheduledQueryDetails(),
                "updateScheduledQueryDetails is required");

        return clientCall(request, UpdateScheduledQueryResponse::builder)
                .logger(LOG, "updateScheduledQuery")
                .serviceDetails(
                        "ScheduledQuery",
                        "UpdateScheduledQuery",
                        "https://docs.oracle.com/iaas/api/#/en/apm-trace-explorer/20200630/ScheduledQuery/UpdateScheduledQuery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateScheduledQueryRequest::builder)
                .basePath("/20200630")
                .appendPathParam("scheduledQueries")
                .appendPathParam(request.getScheduledQueryId())
                .appendQueryParam("apmDomainId", request.getApmDomainId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.apmtraces.model.ScheduledQuery.class,
                        UpdateScheduledQueryResponse.Builder::scheduledQuery)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateScheduledQueryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateScheduledQueryResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public ScheduledQueryAsyncClient(
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
    public ScheduledQueryAsyncClient(
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
    public ScheduledQueryAsyncClient(
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
    public ScheduledQueryAsyncClient(
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
    public ScheduledQueryAsyncClient(
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
    public ScheduledQueryAsyncClient(
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
    public ScheduledQueryAsyncClient(
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
