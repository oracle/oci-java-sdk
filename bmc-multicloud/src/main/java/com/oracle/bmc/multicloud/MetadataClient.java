/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.multicloud.requests.*;
import com.oracle.bmc.multicloud.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class MetadataClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Metadata {
    /** Service instance for Metadata. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(MetadataClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://multicloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MetadataClient.class);

    private final MetadataPaginators paginators;

    MetadataClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        super(
                builder,
                authenticationDetailsProvider,
                CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION);

        this.paginators = new MetadataPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MetadataClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "multicloud";
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
        public MetadataClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MetadataClient(this, authenticationDetailsProvider);
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
    public ListExternalLocationDetailsMetadataResponse listExternalLocationDetailsMetadata(
            ListExternalLocationDetailsMetadataRequest request) {
        Objects.requireNonNull(request.getSubscriptionId(), "subscriptionId is required");

        Objects.requireNonNull(
                request.getSubscriptionServiceName(), "subscriptionServiceName is required");

        return clientCall(request, ListExternalLocationDetailsMetadataResponse::builder)
                .logger(LOG, "listExternalLocationDetailsMetadata")
                .serviceDetails(
                        "Metadata",
                        "ListExternalLocationDetailsMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/multicloud-omhub-cp/20180828/ExternalLocationsMetadatumCollection/ListExternalLocationDetailsMetadata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalLocationDetailsMetadataRequest::builder)
                .basePath("/20180828")
                .appendPathParam("externalLocationsMetadata")
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendEnumQueryParam("entityType", request.getEntityType())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("linkedCompartmentId", request.getLinkedCompartmentId())
                .appendEnumQueryParam(
                        "subscriptionServiceName", request.getSubscriptionServiceName())
                .appendQueryParam("externalLocation", request.getExternalLocation())
                .appendQueryParam("logicalZone", request.getLogicalZone())
                .appendQueryParam("clusterPlacementGroupId", request.getClusterPlacementGroupId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.multicloud.model.ExternalLocationsMetadatumCollection.class,
                        ListExternalLocationDetailsMetadataResponse.Builder
                                ::externalLocationsMetadatumCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalLocationDetailsMetadataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalLocationDetailsMetadataResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalLocationMappingMetadataResponse listExternalLocationMappingMetadata(
            ListExternalLocationMappingMetadataRequest request) {
        Objects.requireNonNull(
                request.getSubscriptionServiceName(), "subscriptionServiceName is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalLocationMappingMetadataResponse::builder)
                .logger(LOG, "listExternalLocationMappingMetadata")
                .serviceDetails(
                        "Metadata",
                        "ListExternalLocationMappingMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/multicloud-omhub-cp/20180828/ExternalLocationMappingMetadatumSummaryCollection/ListExternalLocationMappingMetadata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalLocationMappingMetadataRequest::builder)
                .basePath("/20180828")
                .appendPathParam("externalLocationMappingMetadata")
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendListQueryParam(
                        "subscriptionServiceName",
                        request.getSubscriptionServiceName(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.multicloud.model
                                .ExternalLocationMappingMetadatumSummaryCollection.class,
                        ListExternalLocationMappingMetadataResponse.Builder
                                ::externalLocationMappingMetadatumSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalLocationMappingMetadataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalLocationMappingMetadataResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalLocationSummariesMetadataResponse listExternalLocationSummariesMetadata(
            ListExternalLocationSummariesMetadataRequest request) {
        Objects.requireNonNull(
                request.getSubscriptionServiceName(), "subscriptionServiceName is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalLocationSummariesMetadataResponse::builder)
                .logger(LOG, "listExternalLocationSummariesMetadata")
                .serviceDetails(
                        "Metadata",
                        "ListExternalLocationSummariesMetadata",
                        "https://docs.oracle.com/iaas/api/#/en/multicloud-omhub-cp/20180828/ExternalLocationSummariesMetadatumSummaryCollection/ListExternalLocationSummariesMetadata")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalLocationSummariesMetadataRequest::builder)
                .basePath("/20180828")
                .appendPathParam("externalLocationSummariesMetadata")
                .appendQueryParam("subscriptionId", request.getSubscriptionId())
                .appendEnumQueryParam(
                        "subscriptionServiceName", request.getSubscriptionServiceName())
                .appendEnumQueryParam("entityType", request.getEntityType())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.multicloud.model
                                .ExternalLocationSummariesMetadatumSummaryCollection.class,
                        ListExternalLocationSummariesMetadataResponse.Builder
                                ::externalLocationSummariesMetadatumSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalLocationSummariesMetadataResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalLocationSummariesMetadataResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public MetadataPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MetadataClient(
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
    public MetadataClient(
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
    public MetadataClient(
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
    public MetadataClient(
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
    public MetadataClient(
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
    public MetadataClient(
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
    public MetadataClient(
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
