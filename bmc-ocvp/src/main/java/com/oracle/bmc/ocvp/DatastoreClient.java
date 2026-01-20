/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class DatastoreClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Datastore {
    /** Service instance for Datastore. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatastoreClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatastoreClient.class);

    private final DatastoreWaiters waiters;

    private final DatastorePaginators paginators;

    DatastoreClient(
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
                                    .nameFormat("Datastore-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DatastoreWaiters(executorService, this);

        this.paginators = new DatastorePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatastoreClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "ocvp";
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
        public DatastoreClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatastoreClient(this, authenticationDetailsProvider, executorService);
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
    public AddBlockVolumeToDatastoreResponse addBlockVolumeToDatastore(
            AddBlockVolumeToDatastoreRequest request) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");
        Objects.requireNonNull(
                request.getAddBlockVolumeToDatastoreDetails(),
                "addBlockVolumeToDatastoreDetails is required");

        return clientCall(request, AddBlockVolumeToDatastoreResponse::builder)
                .logger(LOG, "addBlockVolumeToDatastore")
                .serviceDetails(
                        "Datastore",
                        "AddBlockVolumeToDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/AddBlockVolumeToDatastore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddBlockVolumeToDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .appendPathParam("actions")
                .appendPathParam("addBlockVolume")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddBlockVolumeToDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddBlockVolumeToDatastoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDatastoreCompartmentResponse changeDatastoreCompartment(
            ChangeDatastoreCompartmentRequest request) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatastoreCompartmentDetails(),
                "changeDatastoreCompartmentDetails is required");

        return clientCall(request, ChangeDatastoreCompartmentResponse::builder)
                .logger(LOG, "changeDatastoreCompartment")
                .serviceDetails(
                        "Datastore",
                        "ChangeDatastoreCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/ChangeDatastoreCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatastoreCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDatastoreCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatastoreResponse createDatastore(CreateDatastoreRequest request) {
        Objects.requireNonNull(
                request.getCreateDatastoreDetails(), "createDatastoreDetails is required");

        return clientCall(request, CreateDatastoreResponse::builder)
                .logger(LOG, "createDatastore")
                .serviceDetails(
                        "Datastore",
                        "CreateDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/CreateDatastore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatastoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatastoreResponse deleteDatastore(DeleteDatastoreRequest request) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");

        return clientCall(request, DeleteDatastoreResponse::builder)
                .logger(LOG, "deleteDatastore")
                .serviceDetails(
                        "Datastore",
                        "DeleteDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/DeleteDatastore")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatastoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatastoreResponse getDatastore(GetDatastoreRequest request) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");

        return clientCall(request, GetDatastoreResponse::builder)
                .logger(LOG, "getDatastore")
                .serviceDetails(
                        "Datastore",
                        "GetDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/GetDatastore")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.Datastore.class,
                        GetDatastoreResponse.Builder::datastore)
                .handleResponseHeaderString("etag", GetDatastoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatastoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatastoresResponse::builder)
                .logger(LOG, "listDatastores")
                .serviceDetails(
                        "Datastore",
                        "ListDatastores",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/ListDatastores")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatastoresRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("datastoreId", request.getDatastoreId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.DatastoreCollection.class,
                        ListDatastoresResponse.Builder::datastoreCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatastoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatastoresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateDatastoreResponse updateDatastore(UpdateDatastoreRequest request) {

        Validate.notBlank(request.getDatastoreId(), "datastoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatastoreDetails(), "updateDatastoreDetails is required");

        return clientCall(request, UpdateDatastoreResponse::builder)
                .logger(LOG, "updateDatastore")
                .serviceDetails(
                        "Datastore",
                        "UpdateDatastore",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/Datastore/UpdateDatastore")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatastoreRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastores")
                .appendPathParam(request.getDatastoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDatastoreResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatastoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DatastoreWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatastorePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatastoreClient(
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
    public DatastoreClient(
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
    public DatastoreClient(
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
    public DatastoreClient(
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
    public DatastoreClient(
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
    public DatastoreClient(
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
    public DatastoreClient(
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
    public DatastoreClient(
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
