/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public class RoverBundleClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements RoverBundle {
    /** Service instance for RoverBundle. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("ROVERBUNDLE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://rover.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RoverBundleClient.class);

    private final RoverBundlePaginators paginators;

    RoverBundleClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new RoverBundlePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, RoverBundleClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "rover";
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
        public RoverBundleClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new RoverBundleClient(this, authenticationDetailsProvider);
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
    public ListRoverClusterRoverBundleRequestsResponse listRoverClusterRoverBundleRequests(
            ListRoverClusterRoverBundleRequestsRequest request) {

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, ListRoverClusterRoverBundleRequestsResponse::builder)
                .logger(LOG, "listRoverClusterRoverBundleRequests")
                .serviceDetails(
                        "RoverBundle",
                        "ListRoverClusterRoverBundleRequests",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/ListRoverClusterRoverBundleRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoverClusterRoverBundleRequestsRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("roverBundleRequests")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverBundleRequestCollection.class,
                        ListRoverClusterRoverBundleRequestsResponse.Builder
                                ::roverBundleRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListRoverClusterRoverBundleRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListRoverClusterRoverBundleRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRoverNodeRoverBundleRequestsResponse listRoverNodeRoverBundleRequests(
            ListRoverNodeRoverBundleRequestsRequest request) {

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, ListRoverNodeRoverBundleRequestsResponse::builder)
                .logger(LOG, "listRoverNodeRoverBundleRequests")
                .serviceDetails(
                        "RoverBundle",
                        "ListRoverNodeRoverBundleRequests",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/ListRoverNodeRoverBundleRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRoverNodeRoverBundleRequestsRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("roverBundleRequests")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverBundleRequestCollection.class,
                        ListRoverNodeRoverBundleRequestsResponse.Builder
                                ::roverBundleRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListRoverNodeRoverBundleRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListRoverNodeRoverBundleRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RequestBundleRoverClusterResponse requestBundleRoverCluster(
            RequestBundleRoverClusterRequest request) {
        Objects.requireNonNull(
                request.getRequestRoverBundleDetails(), "requestRoverBundleDetails is required");

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, RequestBundleRoverClusterResponse::builder)
                .logger(LOG, "requestBundleRoverCluster")
                .serviceDetails(
                        "RoverBundle",
                        "RequestBundleRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/RequestBundleRoverCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestBundleRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("actions")
                .appendPathParam("requestRoverBundle")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RequestBundleRoverClusterResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestBundleRoverClusterResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RequestBundleRoverNodeResponse requestBundleRoverNode(
            RequestBundleRoverNodeRequest request) {
        Objects.requireNonNull(
                request.getRequestRoverBundleDetails(), "requestRoverBundleDetails is required");

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RequestBundleRoverNodeResponse::builder)
                .logger(LOG, "requestBundleRoverNode")
                .serviceDetails(
                        "RoverBundle",
                        "RequestBundleRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RequestBundleRoverNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RequestBundleRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("requestRoverBundle")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", RequestBundleRoverNodeResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RequestBundleRoverNodeResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RetrieveAvailableBundleVersionsRoverClusterResponse
            retrieveAvailableBundleVersionsRoverCluster(
                    RetrieveAvailableBundleVersionsRoverClusterRequest request) {
        Objects.requireNonNull(
                request.getCurrentRoverBundleDetails(), "currentRoverBundleDetails is required");

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, RetrieveAvailableBundleVersionsRoverClusterResponse::builder)
                .logger(LOG, "retrieveAvailableBundleVersionsRoverCluster")
                .serviceDetails(
                        "RoverBundle",
                        "RetrieveAvailableBundleVersionsRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/RetrieveAvailableBundleVersionsRoverCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveAvailableBundleVersionsRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("actions")
                .appendPathParam("retrieveAvailableRoverBundleVersion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverBundleVersion.class,
                        RetrieveAvailableBundleVersionsRoverClusterResponse.Builder
                                ::roverBundleVersion)
                .handleResponseHeaderString(
                        "etag", RetrieveAvailableBundleVersionsRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RetrieveAvailableBundleVersionsRoverClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RetrieveAvailableBundleVersionsRoverNodeResponse
            retrieveAvailableBundleVersionsRoverNode(
                    RetrieveAvailableBundleVersionsRoverNodeRequest request) {
        Objects.requireNonNull(
                request.getCurrentRoverBundleDetails(), "currentRoverBundleDetails is required");

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RetrieveAvailableBundleVersionsRoverNodeResponse::builder)
                .logger(LOG, "retrieveAvailableBundleVersionsRoverNode")
                .serviceDetails(
                        "RoverBundle",
                        "RetrieveAvailableBundleVersionsRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RetrieveAvailableBundleVersionsRoverNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveAvailableBundleVersionsRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("retrieveAvailableRoverBundleVersion")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverBundleVersion.class,
                        RetrieveAvailableBundleVersionsRoverNodeResponse.Builder
                                ::roverBundleVersion)
                .handleResponseHeaderString(
                        "etag", RetrieveAvailableBundleVersionsRoverNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RetrieveAvailableBundleVersionsRoverNodeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RetrieveBundleStatusRoverClusterResponse retrieveBundleStatusRoverCluster(
            RetrieveBundleStatusRoverClusterRequest request) {
        Objects.requireNonNull(
                request.getRoverBundleStatusDetails(), "roverBundleStatusDetails is required");

        Validate.notBlank(request.getRoverClusterId(), "roverClusterId must not be blank");

        return clientCall(request, RetrieveBundleStatusRoverClusterResponse::builder)
                .logger(LOG, "retrieveBundleStatusRoverCluster")
                .serviceDetails(
                        "RoverBundle",
                        "RetrieveBundleStatusRoverCluster",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverCluster/RetrieveBundleStatusRoverCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveBundleStatusRoverClusterRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverClusters")
                .appendPathParam(request.getRoverClusterId())
                .appendPathParam("actions")
                .appendPathParam("retrieveRoverBundleStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverBundleStatus.class,
                        RetrieveBundleStatusRoverClusterResponse.Builder::roverBundleStatus)
                .handleResponseHeaderString(
                        "etag", RetrieveBundleStatusRoverClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RetrieveBundleStatusRoverClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RetrieveBundleStatusRoverNodeResponse retrieveBundleStatusRoverNode(
            RetrieveBundleStatusRoverNodeRequest request) {
        Objects.requireNonNull(
                request.getRoverBundleStatusDetails(), "roverBundleStatusDetails is required");

        Validate.notBlank(request.getRoverNodeId(), "roverNodeId must not be blank");

        return clientCall(request, RetrieveBundleStatusRoverNodeResponse::builder)
                .logger(LOG, "retrieveBundleStatusRoverNode")
                .serviceDetails(
                        "RoverBundle",
                        "RetrieveBundleStatusRoverNode",
                        "https://docs.oracle.com/iaas/api/#/en/rover/20201210/RoverNode/RetrieveBundleStatusRoverNode")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RetrieveBundleStatusRoverNodeRequest::builder)
                .basePath("/20201210")
                .appendPathParam("roverNodes")
                .appendPathParam(request.getRoverNodeId())
                .appendPathParam("actions")
                .appendPathParam("retrieveRoverBundleStatus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.rover.model.RoverBundleStatus.class,
                        RetrieveBundleStatusRoverNodeResponse.Builder::roverBundleStatus)
                .handleResponseHeaderString(
                        "etag", RetrieveBundleStatusRoverNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RetrieveBundleStatusRoverNodeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RoverBundlePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public RoverBundleClient(
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
    public RoverBundleClient(
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
    public RoverBundleClient(
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
    public RoverBundleClient(
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
    public RoverBundleClient(
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
    public RoverBundleClient(
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
    public RoverBundleClient(
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
