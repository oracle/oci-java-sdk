/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ccdoffers.requests.*;
import com.oracle.bmc.ccdoffers.responses.*;

import java.util.Objects;

/**
 * Async client implementation for CcdCommitments service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
public class CcdCommitmentsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements CcdCommitmentsAsync {
    /** Service instance for CcdCommitments. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(CcdCommitmentsClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ccdOffers.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CcdCommitmentsAsyncClient.class);

    CcdCommitmentsAsyncClient(
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
                    Builder, CcdCommitmentsAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ccdoffers";
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
        public CcdCommitmentsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new CcdCommitmentsAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<CreateCcdCommitmentResponse> createCcdCommitment(
            CreateCcdCommitmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateCcdCommitmentRequest, CreateCcdCommitmentResponse>
                    handler) {
        Objects.requireNonNull(request.getCcdOfferId(), "ccdOfferId is required");

        Objects.requireNonNull(
                request.getCreateCcdCommitmentDetails(), "createCcdCommitmentDetails is required");

        return clientCall(request, CreateCcdCommitmentResponse::builder)
                .logger(LOG, "createCcdCommitment")
                .serviceDetails("CcdCommitments", "CreateCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendQueryParam("ccdOfferId", request.getCcdOfferId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitment.class,
                        CreateCcdCommitmentResponse.Builder::ccdCommitment)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCcdCommitmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateCcdCommitmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteCcdCommitmentResponse> deleteCcdCommitment(
            DeleteCcdCommitmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteCcdCommitmentRequest, DeleteCcdCommitmentResponse>
                    handler) {

        Validate.notBlank(request.getCcdCommitmentId(), "ccdCommitmentId must not be blank");

        return clientCall(request, DeleteCcdCommitmentResponse::builder)
                .logger(LOG, "deleteCcdCommitment")
                .serviceDetails("CcdCommitments", "DeleteCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendPathParam(request.getCcdCommitmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCcdCommitmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCcdCommitmentResponse> getCcdCommitment(
            GetCcdCommitmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetCcdCommitmentRequest, GetCcdCommitmentResponse>
                    handler) {

        Validate.notBlank(request.getCcdCommitmentId(), "ccdCommitmentId must not be blank");

        return clientCall(request, GetCcdCommitmentResponse::builder)
                .logger(LOG, "getCcdCommitment")
                .serviceDetails("CcdCommitments", "GetCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendPathParam(request.getCcdCommitmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitment.class,
                        GetCcdCommitmentResponse.Builder::ccdCommitment)
                .handleResponseHeaderString(
                        "opc-request-id", GetCcdCommitmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetCcdCommitmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCcdCommitmentsResponse> listCcdCommitments(
            ListCcdCommitmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCcdCommitmentsRequest, ListCcdCommitmentsResponse>
                    handler) {
        Objects.requireNonNull(request.getSubscriptionId(), "subscriptionId is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCcdCommitmentsResponse::builder)
                .logger(LOG, "listCcdCommitments")
                .serviceDetails("CcdCommitments", "ListCcdCommitments", "")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCcdCommitmentsRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendEnumQueryParam("sourceType", request.getSourceType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitmentCollection.class,
                        ListCcdCommitmentsResponse.Builder::ccdCommitmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCcdCommitmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCcdCommitmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateCcdCommitmentResponse> updateCcdCommitment(
            UpdateCcdCommitmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateCcdCommitmentRequest, UpdateCcdCommitmentResponse>
                    handler) {

        Validate.notBlank(request.getCcdCommitmentId(), "ccdCommitmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCcdCommitmentDetails(), "updateCcdCommitmentDetails is required");

        return clientCall(request, UpdateCcdCommitmentResponse::builder)
                .logger(LOG, "updateCcdCommitment")
                .serviceDetails("CcdCommitments", "UpdateCcdCommitment", "")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCcdCommitmentRequest::builder)
                .basePath("/20240601")
                .appendPathParam("ccdCommitments")
                .appendPathParam(request.getCcdCommitmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.ccdoffers.model.CcdCommitment.class,
                        UpdateCcdCommitmentResponse.Builder::ccdCommitment)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCcdCommitmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateCcdCommitmentResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public CcdCommitmentsAsyncClient(
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
    public CcdCommitmentsAsyncClient(
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
    public CcdCommitmentsAsyncClient(
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
    public CcdCommitmentsAsyncClient(
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
    public CcdCommitmentsAsyncClient(
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
    public CcdCommitmentsAsyncClient(
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
    public CcdCommitmentsAsyncClient(
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
