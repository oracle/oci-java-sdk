/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

import java.util.Objects;

/**
 * Async client implementation for RoverCluster service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RoverClusterAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements RoverClusterAsync {
    /** Service instance for RoverCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ROVERCLUSTER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://rover.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RoverClusterAsyncClient.class);

    RoverClusterAsyncClient(
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RoverClusterAsyncClient> {
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
        public RoverClusterAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RoverClusterAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeRoverClusterCompartmentResponse>
            changeRoverClusterCompartment(
                    ChangeRoverClusterCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeRoverClusterCompartmentRequest,
                                    ChangeRoverClusterCompartmentResponse>
                            handler) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeRoverClusterCompartmentDetails(),
                "changeRoverClusterCompartmentDetails is required");

        return clientCall(request, ChangeRoverClusterCompartmentResponse::builder)
                .logger(LOG, "changeRoverClusterCompartment")
                .serviceDetails(
                        "RoverCluster",
                        "ChangeRoverClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/ChangeRoverClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeRoverClusterCompartmentRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRoverClusterCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRoverClusterResponse> createRoverCluster(
            CreateRoverClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRoverClusterRequest, CreateRoverClusterResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreateRoverClusterDetails(), "createRoverClusterDetails is required");

        return clientCall(request, CreateRoverClusterResponse::builder)
                .logger(LOG, "createRoverCluster")
                .serviceDetails(
                        "RoverCluster",
                        "CreateRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/CreateRoverCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverCluster.class,
                        CreateRoverClusterResponse.Builder::roverCluster)
                .handleResponseHeaderString("etag", CreateRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRoverClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoverClusterResponse> deleteRoverCluster(
            DeleteRoverClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRoverClusterRequest, DeleteRoverClusterResponse>
                    handler) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, DeleteRoverClusterResponse::builder)
                .logger(LOG, "deleteRoverCluster")
                .serviceDetails(
                        "RoverCluster",
                        "DeleteRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/DeleteRoverCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRoverClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverClusterResponse> getRoverCluster(
            GetRoverClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRoverClusterRequest, GetRoverClusterResponse>
                    handler) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, GetRoverClusterResponse::builder)
                .logger(LOG, "getRoverCluster")
                .serviceDetails(
                        "RoverCluster",
                        "GetRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/GetRoverCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverCluster.class,
                        GetRoverClusterResponse.Builder::roverCluster)
                .handleResponseHeaderString("etag", GetRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRoverClusterCertificateResponse>
            getRoverClusterCertificate(
                    GetRoverClusterCertificateRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetRoverClusterCertificateRequest,
                                    GetRoverClusterCertificateResponse>
                            handler) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, GetRoverClusterCertificateResponse::builder)
                .logger(LOG, "getRoverClusterCertificate")
                .serviceDetails(
                        "RoverCluster",
                        "GetRoverClusterCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverClusterCertificate/GetRoverClusterCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRoverClusterCertificateRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("certificate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverClusterCertificate.class,
                        GetRoverClusterCertificateResponse.Builder::roverClusterCertificate)
                .handleResponseHeaderString(
                        "etag", GetRoverClusterCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverClusterCertificateResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRoverClustersResponse> listRoverClusters(
            ListRoverClustersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRoverClustersRequest, ListRoverClustersResponse>
                    handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRoverClustersResponse::builder)
                .logger(LOG, "listRoverClusters")
                .serviceDetails(
                        "RoverCluster",
                        "ListRoverClusters",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/ListRoverClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoverClustersRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("clusterType", request.getClusterType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.rover.model.RoverClusterCollection.class,
                        ListRoverClustersResponse.Builder::roverClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRoverClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRoverClustersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRoverClustersResponse.Builder::opcPrevPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoverClusterResponse> updateRoverCluster(
            UpdateRoverClusterRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRoverClusterRequest, UpdateRoverClusterResponse>
                    handler) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRoverClusterDetails(), "updateRoverClusterDetails is required");

        return clientCall(request, UpdateRoverClusterResponse::builder)
                .logger(LOG, "updateRoverCluster")
                .serviceDetails(
                        "RoverCluster",
                        "UpdateRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/UpdateRoverCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverCluster.class,
                        UpdateRoverClusterResponse.Builder::roverCluster)
                .handleResponseHeaderString("etag", UpdateRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRoverClusterResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverClusterAsyncClient(
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
    public RoverClusterAsyncClient(
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
    public RoverClusterAsyncClient(
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
    public RoverClusterAsyncClient(
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
    public RoverClusterAsyncClient(
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
    public RoverClusterAsyncClient(
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
    public RoverClusterAsyncClient(
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
