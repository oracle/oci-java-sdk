/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.managedkafka.requests.*;
import com.oracle.bmc.managedkafka.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
public class KafkaClusterClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements KafkaCluster {
    /** Service instance for KafkaCluster. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("KAFKACLUSTER")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://kafka.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(KafkaClusterClient.class);

    private final KafkaClusterWaiters waiters;

    private final KafkaClusterPaginators paginators;

    KafkaClusterClient(
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
                                    .nameFormat("KafkaCluster-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new KafkaClusterWaiters(executorService, this);

        this.paginators = new KafkaClusterPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, KafkaClusterClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "managedkafka";
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
        public KafkaClusterClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new KafkaClusterClient(this, authenticationDetailsProvider, executorService);
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
    public CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, CancelWorkRequestResponse::builder)
                .logger(LOG, "cancelWorkRequest")
                .serviceDetails(
                        "KafkaCluster",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20240901")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeKafkaClusterCompartmentResponse changeKafkaClusterCompartment(
            ChangeKafkaClusterCompartmentRequest request) {

        Validate.notBlank(request.getKafkaClusterId(), "kafkaClusterId must not be blank");
        Objects.requireNonNull(
                request.getChangeKafkaClusterCompartmentDetails(),
                "changeKafkaClusterCompartmentDetails is required");

        return clientCall(request, ChangeKafkaClusterCompartmentResponse::builder)
                .logger(LOG, "changeKafkaClusterCompartment")
                .serviceDetails(
                        "KafkaCluster",
                        "ChangeKafkaClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/ChangeKafkaClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKafkaClusterCompartmentRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendPathParam(request.getKafkaClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeKafkaClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeKafkaClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeKafkaClusterConfigCompartmentResponse changeKafkaClusterConfigCompartment(
            ChangeKafkaClusterConfigCompartmentRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");
        Objects.requireNonNull(
                request.getChangeKafkaClusterConfigCompartmentDetails(),
                "changeKafkaClusterConfigCompartmentDetails is required");

        return clientCall(request, ChangeKafkaClusterConfigCompartmentResponse::builder)
                .logger(LOG, "changeKafkaClusterConfigCompartment")
                .serviceDetails(
                        "KafkaCluster",
                        "ChangeKafkaClusterConfigCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfig/ChangeKafkaClusterConfigCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKafkaClusterConfigCompartmentRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeKafkaClusterConfigCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateKafkaClusterResponse createKafkaCluster(CreateKafkaClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateKafkaClusterDetails(), "createKafkaClusterDetails is required");

        return clientCall(request, CreateKafkaClusterResponse::builder)
                .logger(LOG, "createKafkaCluster")
                .serviceDetails(
                        "KafkaCluster",
                        "CreateKafkaCluster",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/CreateKafkaCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKafkaClusterRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaCluster.class,
                        CreateKafkaClusterResponse.Builder::kafkaCluster)
                .handleResponseHeaderString(
                        "location", CreateKafkaClusterResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateKafkaClusterResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", CreateKafkaClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateKafkaClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKafkaClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateKafkaClusterConfigResponse createKafkaClusterConfig(
            CreateKafkaClusterConfigRequest request) {
        Objects.requireNonNull(
                request.getCreateKafkaClusterConfigDetails(),
                "createKafkaClusterConfigDetails is required");

        return clientCall(request, CreateKafkaClusterConfigResponse::builder)
                .logger(LOG, "createKafkaClusterConfig")
                .serviceDetails(
                        "KafkaCluster",
                        "CreateKafkaClusterConfig",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfig/CreateKafkaClusterConfig")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKafkaClusterConfigRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterConfig.class,
                        CreateKafkaClusterConfigResponse.Builder::kafkaClusterConfig)
                .handleResponseHeaderString("etag", CreateKafkaClusterConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKafkaClusterConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateKafkaClusterConfigResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateKafkaClusterConfigResponse.Builder::contentLocation)
                .callSync();
    }

    @Override
    public DeleteKafkaClusterResponse deleteKafkaCluster(DeleteKafkaClusterRequest request) {

        Validate.notBlank(request.getKafkaClusterId(), "kafkaClusterId must not be blank");

        return clientCall(request, DeleteKafkaClusterResponse::builder)
                .logger(LOG, "deleteKafkaCluster")
                .serviceDetails(
                        "KafkaCluster",
                        "DeleteKafkaCluster",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/DeleteKafkaCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKafkaClusterRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendPathParam(request.getKafkaClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteKafkaClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKafkaClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteKafkaClusterConfigResponse deleteKafkaClusterConfig(
            DeleteKafkaClusterConfigRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");

        return clientCall(request, DeleteKafkaClusterConfigResponse::builder)
                .logger(LOG, "deleteKafkaClusterConfig")
                .serviceDetails(
                        "KafkaCluster",
                        "DeleteKafkaClusterConfig",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfig/DeleteKafkaClusterConfig")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKafkaClusterConfigRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKafkaClusterConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteKafkaClusterConfigVersionResponse deleteKafkaClusterConfigVersion(
            DeleteKafkaClusterConfigVersionRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");

        return clientCall(request, DeleteKafkaClusterConfigVersionResponse::builder)
                .logger(LOG, "deleteKafkaClusterConfigVersion")
                .serviceDetails(
                        "KafkaCluster",
                        "DeleteKafkaClusterConfigVersion",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfigVersion/DeleteKafkaClusterConfigVersion")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKafkaClusterConfigVersionRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .appendPathParam("versions")
                .appendPathParam(request.getVersionNumber())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteKafkaClusterConfigVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableSuperuserResponse disableSuperuser(DisableSuperuserRequest request) {

        Validate.notBlank(request.getKafkaClusterId(), "kafkaClusterId must not be blank");

        return clientCall(request, DisableSuperuserResponse::builder)
                .logger(LOG, "disableSuperuser")
                .serviceDetails(
                        "KafkaCluster",
                        "DisableSuperuser",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/DisableSuperuser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableSuperuserRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendPathParam(request.getKafkaClusterId())
                .appendPathParam("actions")
                .appendPathParam("disableSuperuser")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DisableSuperuserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableSuperuserResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableSuperuserResponse enableSuperuser(EnableSuperuserRequest request) {

        Validate.notBlank(request.getKafkaClusterId(), "kafkaClusterId must not be blank");
        Objects.requireNonNull(
                request.getEnableSuperuserDetails(), "enableSuperuserDetails is required");

        return clientCall(request, EnableSuperuserResponse::builder)
                .logger(LOG, "enableSuperuser")
                .serviceDetails(
                        "KafkaCluster",
                        "EnableSuperuser",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/EnableSuperuser")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableSuperuserRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendPathParam(request.getKafkaClusterId())
                .appendPathParam("actions")
                .appendPathParam("enableSuperuser")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", EnableSuperuserResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableSuperuserResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKafkaClusterResponse getKafkaCluster(GetKafkaClusterRequest request) {

        Validate.notBlank(request.getKafkaClusterId(), "kafkaClusterId must not be blank");

        return clientCall(request, GetKafkaClusterResponse::builder)
                .logger(LOG, "getKafkaCluster")
                .serviceDetails(
                        "KafkaCluster",
                        "GetKafkaCluster",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/GetKafkaCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKafkaClusterRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendPathParam(request.getKafkaClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaCluster.class,
                        GetKafkaClusterResponse.Builder::kafkaCluster)
                .handleResponseHeaderString("etag", GetKafkaClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetKafkaClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKafkaClusterConfigResponse getKafkaClusterConfig(
            GetKafkaClusterConfigRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");

        return clientCall(request, GetKafkaClusterConfigResponse::builder)
                .logger(LOG, "getKafkaClusterConfig")
                .serviceDetails(
                        "KafkaCluster",
                        "GetKafkaClusterConfig",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfig/GetKafkaClusterConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKafkaClusterConfigRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterConfig.class,
                        GetKafkaClusterConfigResponse.Builder::kafkaClusterConfig)
                .handleResponseHeaderString("etag", GetKafkaClusterConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetKafkaClusterConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetKafkaClusterConfigVersionResponse getKafkaClusterConfigVersion(
            GetKafkaClusterConfigVersionRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");

        return clientCall(request, GetKafkaClusterConfigVersionResponse::builder)
                .logger(LOG, "getKafkaClusterConfigVersion")
                .serviceDetails(
                        "KafkaCluster",
                        "GetKafkaClusterConfigVersion",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfigVersion/GetKafkaClusterConfigVersion")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKafkaClusterConfigVersionRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .appendPathParam("versions")
                .appendPathParam(request.getVersionNumber())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterConfigVersion.class,
                        GetKafkaClusterConfigVersionResponse.Builder::kafkaClusterConfigVersion)
                .handleResponseHeaderString(
                        "etag", GetKafkaClusterConfigVersionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetKafkaClusterConfigVersionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "KafkaCluster",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20240901")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListKafkaClusterConfigVersionsResponse listKafkaClusterConfigVersions(
            ListKafkaClusterConfigVersionsRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");

        return clientCall(request, ListKafkaClusterConfigVersionsResponse::builder)
                .logger(LOG, "listKafkaClusterConfigVersions")
                .serviceDetails(
                        "KafkaCluster",
                        "ListKafkaClusterConfigVersions",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfigVersionCollection/ListKafkaClusterConfigVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKafkaClusterConfigVersionsRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .appendPathParam("versions")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterConfigVersionCollection.class,
                        ListKafkaClusterConfigVersionsResponse.Builder
                                ::kafkaClusterConfigVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListKafkaClusterConfigVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListKafkaClusterConfigVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListKafkaClusterConfigsResponse listKafkaClusterConfigs(
            ListKafkaClusterConfigsRequest request) {

        return clientCall(request, ListKafkaClusterConfigsResponse::builder)
                .logger(LOG, "listKafkaClusterConfigs")
                .serviceDetails(
                        "KafkaCluster",
                        "ListKafkaClusterConfigs",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfig/ListKafkaClusterConfigs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKafkaClusterConfigsRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterConfigCollection.class,
                        ListKafkaClusterConfigsResponse.Builder::kafkaClusterConfigCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListKafkaClusterConfigsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKafkaClusterConfigsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListKafkaClustersResponse listKafkaClusters(ListKafkaClustersRequest request) {

        return clientCall(request, ListKafkaClustersResponse::builder)
                .logger(LOG, "listKafkaClusters")
                .serviceDetails(
                        "KafkaCluster",
                        "ListKafkaClusters",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/ListKafkaClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKafkaClustersRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterCollection.class,
                        ListKafkaClustersResponse.Builder::kafkaClusterCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListKafkaClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKafkaClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "KafkaCluster",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20240901")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "KafkaCluster",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20240901")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "KafkaCluster",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20240901")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public UpdateKafkaClusterResponse updateKafkaCluster(UpdateKafkaClusterRequest request) {

        Validate.notBlank(request.getKafkaClusterId(), "kafkaClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateKafkaClusterDetails(), "updateKafkaClusterDetails is required");

        return clientCall(request, UpdateKafkaClusterResponse::builder)
                .logger(LOG, "updateKafkaCluster")
                .serviceDetails(
                        "KafkaCluster",
                        "UpdateKafkaCluster",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaCluster/UpdateKafkaCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKafkaClusterRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusters")
                .appendPathParam(request.getKafkaClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaCluster.class,
                        UpdateKafkaClusterResponse.Builder::kafkaCluster)
                .handleResponseHeaderString("etag", UpdateKafkaClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateKafkaClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKafkaClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateKafkaClusterConfigResponse updateKafkaClusterConfig(
            UpdateKafkaClusterConfigRequest request) {

        Validate.notBlank(
                request.getKafkaClusterConfigId(), "kafkaClusterConfigId must not be blank");
        Objects.requireNonNull(
                request.getUpdateKafkaClusterConfigDetails(),
                "updateKafkaClusterConfigDetails is required");

        return clientCall(request, UpdateKafkaClusterConfigResponse::builder)
                .logger(LOG, "updateKafkaClusterConfig")
                .serviceDetails(
                        "KafkaCluster",
                        "UpdateKafkaClusterConfig",
                        "https://docs.oracle.com/iaas/api/#/en/kafka/20240901/KafkaClusterConfig/UpdateKafkaClusterConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKafkaClusterConfigRequest::builder)
                .basePath("/20240901")
                .appendPathParam("kafkaClusterConfigs")
                .appendPathParam(request.getKafkaClusterConfigId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.managedkafka.model.KafkaClusterConfig.class,
                        UpdateKafkaClusterConfigResponse.Builder::kafkaClusterConfig)
                .handleResponseHeaderString("etag", UpdateKafkaClusterConfigResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKafkaClusterConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public KafkaClusterWaiters getWaiters() {
        return waiters;
    }

    @Override
    public KafkaClusterPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
    public KafkaClusterClient(
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
