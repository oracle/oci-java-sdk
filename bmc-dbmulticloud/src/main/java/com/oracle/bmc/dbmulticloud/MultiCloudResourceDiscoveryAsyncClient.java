/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.dbmulticloud.requests.*;
import com.oracle.bmc.dbmulticloud.responses.*;

import java.util.Objects;

/**
 * Async client implementation for MultiCloudResourceDiscovery service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class MultiCloudResourceDiscoveryAsyncClient
        extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements MultiCloudResourceDiscoveryAsync {
    /** Service instance for MultiCloudResourceDiscovery. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MULTICLOUDRESOURCEDISCOVERY")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://dbmulticloud.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MultiCloudResourceDiscoveryAsyncClient.class);

    MultiCloudResourceDiscoveryAsyncClient(
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
                    Builder, MultiCloudResourceDiscoveryAsyncClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dbmulticloud";
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
        public MultiCloudResourceDiscoveryAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MultiCloudResourceDiscoveryAsyncClient(this, authenticationDetailsProvider);
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
    public java.util.concurrent.Future<ChangeMultiCloudResourceDiscoveryCompartmentResponse>
            changeMultiCloudResourceDiscoveryCompartment(
                    ChangeMultiCloudResourceDiscoveryCompartmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMultiCloudResourceDiscoveryCompartmentRequest,
                                    ChangeMultiCloudResourceDiscoveryCompartmentResponse>
                            handler) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getChangeMultiCloudResourceDiscoveryCompartmentDetails(),
                "changeMultiCloudResourceDiscoveryCompartmentDetails is required");

        return clientCall(request, ChangeMultiCloudResourceDiscoveryCompartmentResponse::builder)
                .logger(LOG, "changeMultiCloudResourceDiscoveryCompartment")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "ChangeMultiCloudResourceDiscoveryCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/MultiCloudResourceDiscovery/ChangeMultiCloudResourceDiscoveryCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMultiCloudResourceDiscoveryCompartmentRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMultiCloudResourceDiscoveryCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMultiCloudResourceDiscoveryCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateMultiCloudResourceDiscoveryResponse>
            createMultiCloudResourceDiscovery(
                    CreateMultiCloudResourceDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateMultiCloudResourceDiscoveryRequest,
                                    CreateMultiCloudResourceDiscoveryResponse>
                            handler) {
        Objects.requireNonNull(
                request.getCreateMultiCloudResourceDiscoveryDetails(),
                "createMultiCloudResourceDiscoveryDetails is required");

        return clientCall(request, CreateMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "createMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "CreateMultiCloudResourceDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/MultiCloudResourceDiscovery/CreateMultiCloudResourceDiscovery")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery.class,
                        CreateMultiCloudResourceDiscoveryResponse.Builder
                                ::multiCloudResourceDiscovery)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMultiCloudResourceDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateMultiCloudResourceDiscoveryResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateMultiCloudResourceDiscoveryResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "etag", CreateMultiCloudResourceDiscoveryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteMultiCloudResourceDiscoveryResponse>
            deleteMultiCloudResourceDiscovery(
                    DeleteMultiCloudResourceDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteMultiCloudResourceDiscoveryRequest,
                                    DeleteMultiCloudResourceDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");

        return clientCall(request, DeleteMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "deleteMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "DeleteMultiCloudResourceDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/MultiCloudResourceDiscovery/DeleteMultiCloudResourceDiscovery")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMultiCloudResourceDiscoveryResponse.Builder::opcWorkRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMultiCloudResourceDiscoveryResponse>
            getMultiCloudResourceDiscovery(
                    GetMultiCloudResourceDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetMultiCloudResourceDiscoveryRequest,
                                    GetMultiCloudResourceDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");

        return clientCall(request, GetMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "getMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "GetMultiCloudResourceDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/MultiCloudResourceDiscovery/GetMultiCloudResourceDiscovery")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery.class,
                        GetMultiCloudResourceDiscoveryResponse.Builder::multiCloudResourceDiscovery)
                .handleResponseHeaderString(
                        "etag", GetMultiCloudResourceDiscoveryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMultiCloudResourceDiscoveriesResponse>
            listMultiCloudResourceDiscoveries(
                    ListMultiCloudResourceDiscoveriesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListMultiCloudResourceDiscoveriesRequest,
                                    ListMultiCloudResourceDiscoveriesResponse>
                            handler) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMultiCloudResourceDiscoveriesResponse::builder)
                .logger(LOG, "listMultiCloudResourceDiscoveries")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "ListMultiCloudResourceDiscoveries",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/MultiCloudResourceDiscovery/ListMultiCloudResourceDiscoveries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMultiCloudResourceDiscoveriesRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "multiCloudResourceDiscoveryId", request.getMultiCloudResourceDiscoveryId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("oracleDbAzureConnectorId", request.getOracleDbAzureConnectorId())
                .appendEnumQueryParam("resourceType", request.getResourceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.dbmulticloud.model
                                .MultiCloudResourceDiscoverySummaryCollection.class,
                        ListMultiCloudResourceDiscoveriesResponse.Builder
                                ::multiCloudResourceDiscoverySummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListMultiCloudResourceDiscoveriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListMultiCloudResourceDiscoveriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateMultiCloudResourceDiscoveryResponse>
            updateMultiCloudResourceDiscovery(
                    UpdateMultiCloudResourceDiscoveryRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateMultiCloudResourceDiscoveryRequest,
                                    UpdateMultiCloudResourceDiscoveryResponse>
                            handler) {

        Validate.notBlank(
                request.getMultiCloudResourceDiscoveryId(),
                "multiCloudResourceDiscoveryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMultiCloudResourceDiscoveryDetails(),
                "updateMultiCloudResourceDiscoveryDetails is required");

        return clientCall(request, UpdateMultiCloudResourceDiscoveryResponse::builder)
                .logger(LOG, "updateMultiCloudResourceDiscovery")
                .serviceDetails(
                        "MultiCloudResourceDiscovery",
                        "UpdateMultiCloudResourceDiscovery",
                        "https://docs.oracle.com/iaas/api/#/en/database-multicloud-integrations/20240501/MultiCloudResourceDiscovery/UpdateMultiCloudResourceDiscovery")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMultiCloudResourceDiscoveryRequest::builder)
                .basePath("/20240501")
                .appendPathParam("multiCloudResourceDiscovery")
                .appendPathParam(request.getMultiCloudResourceDiscoveryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMultiCloudResourceDiscoveryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateMultiCloudResourceDiscoveryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MultiCloudResourceDiscoveryAsyncClient(
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
    public MultiCloudResourceDiscoveryAsyncClient(
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
    public MultiCloudResourceDiscoveryAsyncClient(
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
    public MultiCloudResourceDiscoveryAsyncClient(
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
    public MultiCloudResourceDiscoveryAsyncClient(
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
    public MultiCloudResourceDiscoveryAsyncClient(
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
    public MultiCloudResourceDiscoveryAsyncClient(
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
