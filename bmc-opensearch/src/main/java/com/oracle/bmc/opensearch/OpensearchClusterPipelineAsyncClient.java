/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.opensearch.requests.*;
import com.oracle.bmc.opensearch.responses.*;

import java.util.Objects;

/**
 * Async client implementation for OpensearchClusterPipeline service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class OpensearchClusterPipelineAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements OpensearchClusterPipelineAsync {
    /** Service instance for OpensearchClusterPipeline. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(OpensearchClusterPipelineClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://search-indexing.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(OpensearchClusterPipelineAsyncClient.class);

    OpensearchClusterPipelineAsyncClient(
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
                    Builder, OpensearchClusterPipelineAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "opensearch";
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
        public OpensearchClusterPipelineAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new OpensearchClusterPipelineAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateOpensearchClusterPipelineResponse>
            createOpensearchClusterPipeline(
                    CreateOpensearchClusterPipelineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOpensearchClusterPipelineRequest,
                                    CreateOpensearchClusterPipelineResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateOpensearchClusterPipelineDetails(),
                "createOpensearchClusterPipelineDetails is required");

        return clientCall(request, CreateOpensearchClusterPipelineResponse::builder)
                .logger(LOG, "createOpensearchClusterPipeline")
                .serviceDetails(
                        "OpensearchClusterPipeline",
                        "CreateOpensearchClusterPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchClusterPipeline/CreateOpensearchClusterPipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOpensearchClusterPipelineRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusterPipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOpensearchClusterPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOpensearchClusterPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteOpensearchClusterPipelineResponse>
            deleteOpensearchClusterPipeline(
                    DeleteOpensearchClusterPipelineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOpensearchClusterPipelineRequest,
                                    DeleteOpensearchClusterPipelineResponse>
                            handler) {

        Validate.notBlank(
                request.getOpensearchClusterPipelineId(),
                "opensearchClusterPipelineId must not be blank");

        return clientCall(request, DeleteOpensearchClusterPipelineResponse::builder)
                .logger(LOG, "deleteOpensearchClusterPipeline")
                .serviceDetails(
                        "OpensearchClusterPipeline",
                        "DeleteOpensearchClusterPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchClusterPipeline/DeleteOpensearchClusterPipeline")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOpensearchClusterPipelineRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusterPipelines")
                .appendPathParam(request.getOpensearchClusterPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteOpensearchClusterPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteOpensearchClusterPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetOpensearchClusterPipelineResponse>
            getOpensearchClusterPipeline(
                    GetOpensearchClusterPipelineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetOpensearchClusterPipelineRequest,
                                    GetOpensearchClusterPipelineResponse>
                            handler) {

        Validate.notBlank(
                request.getOpensearchClusterPipelineId(),
                "opensearchClusterPipelineId must not be blank");

        return clientCall(request, GetOpensearchClusterPipelineResponse::builder)
                .logger(LOG, "getOpensearchClusterPipeline")
                .serviceDetails(
                        "OpensearchClusterPipeline",
                        "GetOpensearchClusterPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchClusterPipeline/GetOpensearchClusterPipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOpensearchClusterPipelineRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusterPipelines")
                .appendPathParam(request.getOpensearchClusterPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.OpensearchClusterPipeline.class,
                        GetOpensearchClusterPipelineResponse.Builder::opensearchClusterPipeline)
                .handleResponseHeaderString(
                        "etag", GetOpensearchClusterPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetOpensearchClusterPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListOpensearchClusterPipelinesResponse>
            listOpensearchClusterPipelines(
                    ListOpensearchClusterPipelinesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListOpensearchClusterPipelinesRequest,
                                    ListOpensearchClusterPipelinesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOpensearchClusterPipelinesResponse::builder)
                .logger(LOG, "listOpensearchClusterPipelines")
                .serviceDetails(
                        "OpensearchClusterPipeline",
                        "ListOpensearchClusterPipelines",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchClusterPipelineCollection/ListOpensearchClusterPipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOpensearchClusterPipelinesRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusterPipelines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("pipelineComponentId", request.getPipelineComponentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.opensearch.model.OpensearchClusterPipelineCollection.class,
                        ListOpensearchClusterPipelinesResponse.Builder
                                ::opensearchClusterPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListOpensearchClusterPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListOpensearchClusterPipelinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateOpensearchClusterPipelineResponse>
            updateOpensearchClusterPipeline(
                    UpdateOpensearchClusterPipelineRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOpensearchClusterPipelineRequest,
                                    UpdateOpensearchClusterPipelineResponse>
                            handler) {

        Validate.notBlank(
                request.getOpensearchClusterPipelineId(),
                "opensearchClusterPipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOpensearchClusterPipelineDetails(),
                "updateOpensearchClusterPipelineDetails is required");

        return clientCall(request, UpdateOpensearchClusterPipelineResponse::builder)
                .logger(LOG, "updateOpensearchClusterPipeline")
                .serviceDetails(
                        "OpensearchClusterPipeline",
                        "UpdateOpensearchClusterPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/opensearch/20180828/OpensearchClusterPipeline/UpdateOpensearchClusterPipeline")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOpensearchClusterPipelineRequest::builder)
                .basePath("/20180828")
                .appendPathParam("opensearchClusterPipelines")
                .appendPathParam(request.getOpensearchClusterPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-dry-run", request.getOpcDryRun())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateOpensearchClusterPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateOpensearchClusterPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OpensearchClusterPipelineAsyncClient(
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
    public OpensearchClusterPipelineAsyncClient(
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
    public OpensearchClusterPipelineAsyncClient(
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
    public OpensearchClusterPipelineAsyncClient(
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
    public OpensearchClusterPipelineAsyncClient(
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
    public OpensearchClusterPipelineAsyncClient(
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
    public OpensearchClusterPipelineAsyncClient(
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
