/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public class RoverClusterClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements RoverCluster {
    /** Service instance for RoverCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(RoverClusterClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://rover.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RoverClusterClient.class);

    private final RoverClusterWaiters waiters;

    private final RoverClusterPaginators paginators;

    RoverClusterClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        if (executorService == null) {
            // up to 50 (core) threads, time out after 60s idle, all daemon
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor =
                    new java.util.concurrent.ThreadPoolExecutor(
                            50,
                            50,
                            60L,
                            java.util.concurrent.TimeUnit.SECONDS,
                            new java.util.concurrent.LinkedBlockingQueue<Runnable>(),
                            com.oracle.bmc.internal.ClientThreadFactory.builder()
                                    .isDaemon(true)
                                    .nameFormat("RoverCluster-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new RoverClusterWaiters(executorService, this);

        this.paginators = new RoverClusterPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RoverClusterClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "rover";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Set the ExecutorService for the client to be created.
         *
         * @param executorService executorService
         * @return this builder
         */
        public Builder executorService(java.util.concurrent.ExecutorService executorService) {
            this.executorService = executorService;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public RoverClusterClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RoverClusterClient(this, authenticationDetailsProvider, executorService);
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
    public ChangeRoverClusterCompartmentResponse changeRoverClusterCompartment(
            ChangeRoverClusterCompartmentRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeRoverClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRoverClusterResponse createRoverCluster(CreateRoverClusterRequest request) {
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverCluster.class,
                        CreateRoverClusterResponse.Builder::roverCluster)
                .handleResponseHeaderString("etag", CreateRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRoverClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRoverClusterResponse deleteRoverCluster(DeleteRoverClusterRequest request) {

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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRoverClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRoverClusterResponse getRoverCluster(GetRoverClusterRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverCluster.class,
                        GetRoverClusterResponse.Builder::roverCluster)
                .handleResponseHeaderString("etag", GetRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRoverClusterCertificateResponse getRoverClusterCertificate(
            GetRoverClusterCertificateRequest request) {

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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverClusterCertificate.class,
                        GetRoverClusterCertificateResponse.Builder::roverClusterCertificate)
                .handleResponseHeaderString(
                        "etag", GetRoverClusterCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRoverClusterCertificateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListRoverClustersResponse listRoverClusters(ListRoverClustersRequest request) {
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverClusterCollection.class,
                        ListRoverClustersResponse.Builder::roverClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRoverClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRoverClustersResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-prev-page", ListRoverClustersResponse.Builder::opcPrevPage)
                .callSync();
    }

    @Override
    public RequestAdditionalNodesResponse requestAdditionalNodes(
            RequestAdditionalNodesRequest request) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");
        Objects.requireNonNull(
                request.getRequestAdditionalNodesDetails(),
                "requestAdditionalNodesDetails is required");

        return clientCall(request, RequestAdditionalNodesResponse::builder)
                .logger(LOG, "requestAdditionalNodes")
                .serviceDetails(
                        "RoverCluster",
                        "RequestAdditionalNodes",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/RequestAdditionalNodes")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestAdditionalNodesRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("actions")
                .appendPathParam("requestAdditionalNodes")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RequestAdditionalNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestAdditionalNodesResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateRoverClusterResponse updateRoverCluster(UpdateRoverClusterRequest request) {

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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverCluster.class,
                        UpdateRoverClusterResponse.Builder::roverCluster)
                .handleResponseHeaderString("etag", UpdateRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRoverClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RoverClusterWaiters getWaiters() {
        return waiters;
    }

    @Override
    public RoverClusterPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverClusterClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(builder(), authenticationDetailsProvider, null);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverClusterClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration) {
        this(builder().configuration(configuration), authenticationDetailsProvider, null);
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
    public RoverClusterClient(
            com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
                builder().configuration(configuration).clientConfigurator(clientConfigurator),
                authenticationDetailsProvider,
                null);
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
    public RoverClusterClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory),
                authenticationDetailsProvider,
                null);
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
    public RoverClusterClient(
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
                authenticationDetailsProvider,
                null);
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
    public RoverClusterClient(
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
                authenticationDetailsProvider,
                null);
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
    public RoverClusterClient(
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
                authenticationDetailsProvider,
                null);
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
     * @param executorService {@link Builder#executorService}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverClusterClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<
                            com.oracle.bmc.http.signing.SigningStrategy,
                            com.oracle.bmc.http.signing.RequestSignerFactory>
                    signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint,
            java.util.concurrent.ExecutorService executorService) {
        this(
                builder()
                        .configuration(configuration)
                        .clientConfigurator(clientConfigurator)
                        .requestSignerFactory(defaultRequestSignerFactory)
                        .additionalClientConfigurators(additionalClientConfigurators)
                        .endpoint(endpoint)
                        .signingStrategyRequestSignerFactories(
                                signingStrategyRequestSignerFactories),
                authenticationDetailsProvider,
                executorService);
    }
}
