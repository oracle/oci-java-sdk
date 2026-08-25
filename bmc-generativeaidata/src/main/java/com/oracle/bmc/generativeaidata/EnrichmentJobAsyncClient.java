/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.generativeaidata.requests.*;
import com.oracle.bmc.generativeaidata.responses.*;

import java.util.Objects;

/**
 * Async client implementation for EnrichmentJob service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
public class EnrichmentJobAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements EnrichmentJobAsync {
    /** Service instance for EnrichmentJob. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(EnrichmentJobClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://inference.generativeai.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EnrichmentJobAsyncClient.class);

    EnrichmentJobAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, EnrichmentJobAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "generativeaidata";
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
        public EnrichmentJobAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new EnrichmentJobAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CancelEnrichmentJobResponse> cancelEnrichmentJob(
            CancelEnrichmentJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelEnrichmentJobRequest, CancelEnrichmentJobResponse>
                    handler) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        Validate.notBlank(request.getEnrichmentJobId(), "enrichmentJobId must not be blank");

        return clientCall(request, CancelEnrichmentJobResponse::builder)
                .logger(LOG, "cancelEnrichmentJob")
                .serviceDetails(
                        "EnrichmentJob",
                        "CancelEnrichmentJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJob/CancelEnrichmentJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelEnrichmentJobRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("enrichmentJobs")
                .appendPathParam(request.getEnrichmentJobId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJob.class,
                        CancelEnrichmentJobResponse.Builder::enrichmentJob)
                .handleResponseHeaderString("etag", CancelEnrichmentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelEnrichmentJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelEnrichmentJobResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GenerateEnrichmentJobResponse> generateEnrichmentJob(
            GenerateEnrichmentJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GenerateEnrichmentJobRequest, GenerateEnrichmentJobResponse>
                    handler) {
        Objects.requireNonNull(
                request.getGenerateEnrichmentJobDetails(),
                "generateEnrichmentJobDetails is required");

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        return clientCall(request, GenerateEnrichmentJobResponse::builder)
                .logger(LOG, "generateEnrichmentJob")
                .serviceDetails(
                        "EnrichmentJob",
                        "GenerateEnrichmentJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJob/GenerateEnrichmentJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateEnrichmentJobRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("actions")
                .appendPathParam("enrich")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJob.class,
                        GenerateEnrichmentJobResponse.Builder::enrichmentJob)
                .handleResponseHeaderString("etag", GenerateEnrichmentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateEnrichmentJobResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        GenerateEnrichmentJobResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetEnrichmentJobResponse> getEnrichmentJob(
            GetEnrichmentJobRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetEnrichmentJobRequest, GetEnrichmentJobResponse>
                    handler) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");

        Validate.notBlank(request.getEnrichmentJobId(), "enrichmentJobId must not be blank");

        return clientCall(request, GetEnrichmentJobResponse::builder)
                .logger(LOG, "getEnrichmentJob")
                .serviceDetails(
                        "EnrichmentJob",
                        "GetEnrichmentJob",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJob/GetEnrichmentJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetEnrichmentJobRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("enrichmentJobs")
                .appendPathParam(request.getEnrichmentJobId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJob.class,
                        GetEnrichmentJobResponse.Builder::enrichmentJob)
                .handleResponseHeaderString("etag", GetEnrichmentJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetEnrichmentJobResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListEnrichmentJobsResponse> listEnrichmentJobs(
            ListEnrichmentJobsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListEnrichmentJobsRequest, ListEnrichmentJobsResponse>
                    handler) {

        Validate.notBlank(request.getSemanticStoreId(), "semanticStoreId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListEnrichmentJobsResponse::builder)
                .logger(LOG, "listEnrichmentJobs")
                .serviceDetails(
                        "EnrichmentJob",
                        "ListEnrichmentJobs",
                        "https://docs.oracle.com/iaas/api/#/en/generative-ai-nl2sql/20260325/EnrichmentJobCollection/ListEnrichmentJobs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListEnrichmentJobsRequest::builder)
                .basePath("/20260325")
                .appendPathParam("semanticStores")
                .appendPathParam(request.getSemanticStoreId())
                .appendPathParam("enrichmentJobs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.generativeaidata.model.EnrichmentJobCollection.class,
                        ListEnrichmentJobsResponse.Builder::enrichmentJobCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListEnrichmentJobsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListEnrichmentJobsResponse.Builder::opcPrevPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListEnrichmentJobsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public EnrichmentJobAsyncClient(
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
    public EnrichmentJobAsyncClient(
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
    public EnrichmentJobAsyncClient(
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
    public EnrichmentJobAsyncClient(
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
    public EnrichmentJobAsyncClient(
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
    public EnrichmentJobAsyncClient(
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
    public EnrichmentJobAsyncClient(
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
