/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public class DatastoreClusterClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements DatastoreCluster {
    /** Service instance for DatastoreCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName(DatastoreClusterClient.class.getName())
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://ocvps.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatastoreClusterClient.class);

    private final DatastoreClusterWaiters waiters;

    private final DatastoreClusterPaginators paginators;

    DatastoreClusterClient(
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
                                    .nameFormat("DatastoreCluster-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DatastoreClusterWaiters(executorService, this);

        this.paginators = new DatastoreClusterPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatastoreClusterClient> {
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
        public DatastoreClusterClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatastoreClusterClient(this, authenticationDetailsProvider, executorService);
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
    public AddDatastoreToDatastoreClusterResponse addDatastoreToDatastoreCluster(
            AddDatastoreToDatastoreClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getAddDatastoreToDatastoreClusterDetails(),
                "addDatastoreToDatastoreClusterDetails is required");

        return clientCall(request, AddDatastoreToDatastoreClusterResponse::builder)
                .logger(LOG, "addDatastoreToDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "AddDatastoreToDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/AddDatastoreToDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDatastoreToDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("addDatastore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddDatastoreToDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddDatastoreToDatastoreClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachDatastoreClusterToClusterResponse attachDatastoreClusterToCluster(
            AttachDatastoreClusterToClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getAttachDatastoreClusterToClusterDetails(),
                "attachDatastoreClusterToClusterDetails is required");

        return clientCall(request, AttachDatastoreClusterToClusterResponse::builder)
                .logger(LOG, "attachDatastoreClusterToCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "AttachDatastoreClusterToCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/AttachDatastoreClusterToCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachDatastoreClusterToClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("attachToCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachDatastoreClusterToClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachDatastoreClusterToClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AttachDatastoreClusterToEsxiHostResponse attachDatastoreClusterToEsxiHost(
            AttachDatastoreClusterToEsxiHostRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getAttachDatastoreClusterToEsxiHostDetails(),
                "attachDatastoreClusterToEsxiHostDetails is required");

        return clientCall(request, AttachDatastoreClusterToEsxiHostResponse::builder)
                .logger(LOG, "attachDatastoreClusterToEsxiHost")
                .serviceDetails(
                        "DatastoreCluster",
                        "AttachDatastoreClusterToEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/AttachDatastoreClusterToEsxiHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AttachDatastoreClusterToEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("attachToEsxiHost")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AttachDatastoreClusterToEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AttachDatastoreClusterToEsxiHostResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDatastoreClusterCompartmentResponse changeDatastoreClusterCompartment(
            ChangeDatastoreClusterCompartmentRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatastoreClusterCompartmentDetails(),
                "changeDatastoreClusterCompartmentDetails is required");

        return clientCall(request, ChangeDatastoreClusterCompartmentResponse::builder)
                .logger(LOG, "changeDatastoreClusterCompartment")
                .serviceDetails(
                        "DatastoreCluster",
                        "ChangeDatastoreClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/ChangeDatastoreClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatastoreClusterCompartmentRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
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
                        ChangeDatastoreClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatastoreClusterResponse createDatastoreCluster(
            CreateDatastoreClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateDatastoreClusterDetails(),
                "createDatastoreClusterDetails is required");

        return clientCall(request, CreateDatastoreClusterResponse::builder)
                .logger(LOG, "createDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "CreateDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/CreateDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatastoreClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatastoreClusterResponse deleteDatastoreCluster(
            DeleteDatastoreClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");

        return clientCall(request, DeleteDatastoreClusterResponse::builder)
                .logger(LOG, "deleteDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "DeleteDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/DeleteDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatastoreClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachDatastoreClusterFromClusterResponse detachDatastoreClusterFromCluster(
            DetachDatastoreClusterFromClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");

        return clientCall(request, DetachDatastoreClusterFromClusterResponse::builder)
                .logger(LOG, "detachDatastoreClusterFromCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "DetachDatastoreClusterFromCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/DetachDatastoreClusterFromCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachDatastoreClusterFromClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("detachFromCluster")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachDatastoreClusterFromClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachDatastoreClusterFromClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DetachDatastoreClusterFromEsxiHostResponse detachDatastoreClusterFromEsxiHost(
            DetachDatastoreClusterFromEsxiHostRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getDetachDatastoreClusterFromEsxiHostDetails(),
                "detachDatastoreClusterFromEsxiHostDetails is required");

        return clientCall(request, DetachDatastoreClusterFromEsxiHostResponse::builder)
                .logger(LOG, "detachDatastoreClusterFromEsxiHost")
                .serviceDetails(
                        "DatastoreCluster",
                        "DetachDatastoreClusterFromEsxiHost",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/DetachDatastoreClusterFromEsxiHost")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DetachDatastoreClusterFromEsxiHostRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("detachFromEsxiHost")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DetachDatastoreClusterFromEsxiHostResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DetachDatastoreClusterFromEsxiHostResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatastoreClusterResponse getDatastoreCluster(GetDatastoreClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");

        return clientCall(request, GetDatastoreClusterResponse::builder)
                .logger(LOG, "getDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "GetDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/GetDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.DatastoreCluster.class,
                        GetDatastoreClusterResponse.Builder::datastoreCluster)
                .handleResponseHeaderString("etag", GetDatastoreClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatastoreClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListDatastoreClustersResponse listDatastoreClusters(
            ListDatastoreClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatastoreClustersResponse::builder)
                .logger(LOG, "listDatastoreClusters")
                .serviceDetails(
                        "DatastoreCluster",
                        "ListDatastoreClusters",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/ListDatastoreClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatastoreClustersRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("datastoreClusterId", request.getDatastoreClusterId())
                .appendQueryParam("clusterId", request.getClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.ocvp.model.DatastoreClusterCollection.class,
                        ListDatastoreClustersResponse.Builder::datastoreClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatastoreClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatastoreClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RemoveDatastoreFromDatastoreClusterResponse removeDatastoreFromDatastoreCluster(
            RemoveDatastoreFromDatastoreClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDatastoreFromDatastoreClusterDetails(),
                "removeDatastoreFromDatastoreClusterDetails is required");

        return clientCall(request, RemoveDatastoreFromDatastoreClusterResponse::builder)
                .logger(LOG, "removeDatastoreFromDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "RemoveDatastoreFromDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/RemoveDatastoreFromDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDatastoreFromDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .appendPathParam("actions")
                .appendPathParam("removeDatastore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveDatastoreFromDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveDatastoreFromDatastoreClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDatastoreClusterResponse updateDatastoreCluster(
            UpdateDatastoreClusterRequest request) {

        Validate.notBlank(request.getDatastoreClusterId(), "datastoreClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatastoreClusterDetails(),
                "updateDatastoreClusterDetails is required");

        return clientCall(request, UpdateDatastoreClusterResponse::builder)
                .logger(LOG, "updateDatastoreCluster")
                .serviceDetails(
                        "DatastoreCluster",
                        "UpdateDatastoreCluster",
                        "https://docs.oracle.com/iaas/api/#/en/vmware/20230701/DatastoreCluster/UpdateDatastoreCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatastoreClusterRequest::builder)
                .basePath("/20230701")
                .appendPathParam("datastoreClusters")
                .appendPathParam(request.getDatastoreClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatastoreClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatastoreClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DatastoreClusterWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatastoreClusterPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
    public DatastoreClusterClient(
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
