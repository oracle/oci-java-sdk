/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.cloudmigrations.requests.*;
import com.oracle.bmc.cloudmigrations.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public class MigrationClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Migration {
    /** Service instance for Migration. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("MIGRATION")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate(
                            "https://cloudmigration.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(MigrationClient.class);

    private final MigrationWaiters waiters;

    private final MigrationPaginators paginators;

    MigrationClient(
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
                                    .nameFormat("Migration-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new MigrationWaiters(executorService, this);

        this.paginators = new MigrationPaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, MigrationClient> {
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
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
        public MigrationClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new MigrationClient(this, authenticationDetailsProvider, executorService);
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
                        "Migration",
                        "CancelWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/WorkRequest/CancelWorkRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(CancelWorkRequestRequest::builder)
                .basePath("/20220919")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", CancelWorkRequestResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeMigrationCompartmentResponse changeMigrationCompartment(
            ChangeMigrationCompartmentRequest request) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getChangeMigrationCompartmentDetails(),
                "changeMigrationCompartmentDetails is required");

        return clientCall(request, ChangeMigrationCompartmentResponse::builder)
                .logger(LOG, "changeMigrationCompartment")
                .serviceDetails(
                        "Migration",
                        "ChangeMigrationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/ChangeMigrationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMigrationCompartmentRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMigrationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeMigrationCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeMigrationPlanCompartmentResponse changeMigrationPlanCompartment(
            ChangeMigrationPlanCompartmentRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");
        Objects.requireNonNull(
                request.getChangeMigrationPlanCompartmentDetails(),
                "changeMigrationPlanCompartmentDetails is required");

        return clientCall(request, ChangeMigrationPlanCompartmentResponse::builder)
                .logger(LOG, "changeMigrationPlanCompartment")
                .serviceDetails(
                        "Migration",
                        "ChangeMigrationPlanCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/ChangeMigrationPlanCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeMigrationPlanCompartmentRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeMigrationPlanCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeMigrationPlanCompartmentResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeReplicationScheduleCompartmentResponse changeReplicationScheduleCompartment(
            ChangeReplicationScheduleCompartmentRequest request) {

        Validate.notBlank(
                request.getReplicationScheduleId(), "replicationScheduleId must not be blank");
        Objects.requireNonNull(
                request.getChangeReplicationScheduleCompartmentDetails(),
                "changeReplicationScheduleCompartmentDetails is required");

        return clientCall(request, ChangeReplicationScheduleCompartmentResponse::builder)
                .logger(LOG, "changeReplicationScheduleCompartment")
                .serviceDetails(
                        "Migration",
                        "ChangeReplicationScheduleCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/ReplicationSchedule/ChangeReplicationScheduleCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeReplicationScheduleCompartmentRequest::builder)
                .basePath("/20220919")
                .appendPathParam("replicationSchedules")
                .appendPathParam(request.getReplicationScheduleId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeReplicationScheduleCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeReplicationScheduleCompartmentResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMigrationResponse createMigration(CreateMigrationRequest request) {
        Objects.requireNonNull(
                request.getCreateMigrationDetails(), "createMigrationDetails is required");

        return clientCall(request, CreateMigrationResponse::builder)
                .logger(LOG, "createMigration")
                .serviceDetails(
                        "Migration",
                        "CreateMigration",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/CreateMigration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMigrationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.Migration.class,
                        CreateMigrationResponse.Builder::migration)
                .handleResponseHeaderString("etag", CreateMigrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMigrationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMigrationAssetResponse createMigrationAsset(CreateMigrationAssetRequest request) {
        Objects.requireNonNull(
                request.getCreateMigrationAssetDetails(),
                "createMigrationAssetDetails is required");

        return clientCall(request, CreateMigrationAssetResponse::builder)
                .logger(LOG, "createMigrationAsset")
                .serviceDetails(
                        "Migration",
                        "CreateMigrationAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/CreateMigrationAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMigrationAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationAsset.class,
                        CreateMigrationAssetResponse.Builder::migrationAsset)
                .handleResponseHeaderString("etag", CreateMigrationAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMigrationAssetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMigrationAssetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateMigrationAssetResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateMigrationAssetResponse.Builder::contentLocation)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateMigrationPlanResponse createMigrationPlan(CreateMigrationPlanRequest request) {
        Objects.requireNonNull(
                request.getCreateMigrationPlanDetails(), "createMigrationPlanDetails is required");

        return clientCall(request, CreateMigrationPlanResponse::builder)
                .logger(LOG, "createMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "CreateMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/CreateMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationPlan.class,
                        CreateMigrationPlanResponse.Builder::migrationPlan)
                .handleResponseHeaderString("etag", CreateMigrationPlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateMigrationPlanResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateMigrationPlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateMigrationPlanResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateMigrationPlanResponse.Builder::contentLocation)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateReplicationScheduleResponse createReplicationSchedule(
            CreateReplicationScheduleRequest request) {
        Objects.requireNonNull(
                request.getCreateReplicationScheduleDetails(),
                "createReplicationScheduleDetails is required");

        return clientCall(request, CreateReplicationScheduleResponse::builder)
                .logger(LOG, "createReplicationSchedule")
                .serviceDetails(
                        "Migration",
                        "CreateReplicationSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/ReplicationSchedule/CreateReplicationSchedule")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateReplicationScheduleRequest::builder)
                .basePath("/20220919")
                .appendPathParam("replicationSchedules")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.ReplicationSchedule.class,
                        CreateReplicationScheduleResponse.Builder::replicationSchedule)
                .handleResponseHeaderString("etag", CreateReplicationScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateReplicationScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateReplicationScheduleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", CreateReplicationScheduleResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location",
                        CreateReplicationScheduleResponse.Builder::contentLocation)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateTargetAssetResponse createTargetAsset(CreateTargetAssetRequest request) {
        Objects.requireNonNull(
                request.getCreateTargetAssetDetails(), "createTargetAssetDetails is required");

        return clientCall(request, CreateTargetAssetResponse::builder)
                .logger(LOG, "createTargetAsset")
                .serviceDetails(
                        "Migration",
                        "CreateTargetAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/TargetAsset/CreateTargetAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTargetAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("targetAssets")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.TargetAsset.class,
                        CreateTargetAssetResponse.Builder::targetAsset)
                .handleResponseHeaderString("etag", CreateTargetAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTargetAssetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateTargetAssetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("location", CreateTargetAssetResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreateTargetAssetResponse.Builder::contentLocation)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMigrationResponse deleteMigration(DeleteMigrationRequest request) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, DeleteMigrationResponse::builder)
                .logger(LOG, "deleteMigration")
                .serviceDetails(
                        "Migration",
                        "DeleteMigration",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/DeleteMigration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMigrationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteMigrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMigrationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMigrationAssetResponse deleteMigrationAsset(DeleteMigrationAssetRequest request) {

        Validate.notBlank(request.getMigrationAssetId(), "migrationAssetId must not be blank");

        return clientCall(request, DeleteMigrationAssetResponse::builder)
                .logger(LOG, "deleteMigrationAsset")
                .serviceDetails(
                        "Migration",
                        "DeleteMigrationAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/DeleteMigrationAsset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMigrationAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendPathParam(request.getMigrationAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMigrationAssetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMigrationAssetResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteMigrationPlanResponse deleteMigrationPlan(DeleteMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");

        return clientCall(request, DeleteMigrationPlanResponse::builder)
                .logger(LOG, "deleteMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "DeleteMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/DeleteMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteMigrationPlanResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteMigrationPlanResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteReplicationScheduleResponse deleteReplicationSchedule(
            DeleteReplicationScheduleRequest request) {

        Validate.notBlank(
                request.getReplicationScheduleId(), "replicationScheduleId must not be blank");

        return clientCall(request, DeleteReplicationScheduleResponse::builder)
                .logger(LOG, "deleteReplicationSchedule")
                .serviceDetails(
                        "Migration",
                        "DeleteReplicationSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/ReplicationSchedule/DeleteReplicationSchedule")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteReplicationScheduleRequest::builder)
                .basePath("/20220919")
                .appendPathParam("replicationSchedules")
                .appendPathParam(request.getReplicationScheduleId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteReplicationScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteReplicationScheduleResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteTargetAssetResponse deleteTargetAsset(DeleteTargetAssetRequest request) {

        Validate.notBlank(request.getTargetAssetId(), "targetAssetId must not be blank");

        return clientCall(request, DeleteTargetAssetResponse::builder)
                .logger(LOG, "deleteTargetAsset")
                .serviceDetails(
                        "Migration",
                        "DeleteTargetAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/TargetAsset/DeleteTargetAsset")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTargetAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("targetAssets")
                .appendPathParam(request.getTargetAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTargetAssetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTargetAssetResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExecuteMigrationPlanResponse executeMigrationPlan(ExecuteMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");

        return clientCall(request, ExecuteMigrationPlanResponse::builder)
                .logger(LOG, "executeMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "ExecuteMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/ExecuteMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExecuteMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .appendPathParam("actions")
                .appendPathParam("execute")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExecuteMigrationPlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ExecuteMigrationPlanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExportMigrationPlanResponse exportMigrationPlan(ExportMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");

        return clientCall(request, ExportMigrationPlanResponse::builder)
                .logger(LOG, "exportMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "ExportMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/ExportMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ExportMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .appendPathParam("actions")
                .appendPathParam("export")
                .accept("text/csv")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class, ExportMigrationPlanResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", ExportMigrationPlanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMigrationResponse getMigration(GetMigrationRequest request) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, GetMigrationResponse::builder)
                .logger(LOG, "getMigration")
                .serviceDetails(
                        "Migration",
                        "GetMigration",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/GetMigration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMigrationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.Migration.class,
                        GetMigrationResponse.Builder::migration)
                .handleResponseHeaderString("etag", GetMigrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMigrationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMigrationAssetResponse getMigrationAsset(GetMigrationAssetRequest request) {

        Validate.notBlank(request.getMigrationAssetId(), "migrationAssetId must not be blank");

        return clientCall(request, GetMigrationAssetResponse::builder)
                .logger(LOG, "getMigrationAsset")
                .serviceDetails(
                        "Migration",
                        "GetMigrationAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/GetMigrationAsset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMigrationAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendPathParam(request.getMigrationAssetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationAsset.class,
                        GetMigrationAssetResponse.Builder::migrationAsset)
                .handleResponseHeaderString("etag", GetMigrationAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMigrationAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetMigrationPlanResponse getMigrationPlan(GetMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");

        return clientCall(request, GetMigrationPlanResponse::builder)
                .logger(LOG, "getMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "GetMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/GetMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationPlan.class,
                        GetMigrationPlanResponse.Builder::migrationPlan)
                .handleResponseHeaderString("etag", GetMigrationPlanResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMigrationPlanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetReplicationProgressResponse getReplicationProgress(
            GetReplicationProgressRequest request) {

        Validate.notBlank(request.getMigrationAssetId(), "migrationAssetId must not be blank");

        return clientCall(request, GetReplicationProgressResponse::builder)
                .logger(LOG, "getReplicationProgress")
                .serviceDetails(
                        "Migration",
                        "GetReplicationProgress",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/GetReplicationProgress")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReplicationProgressRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendPathParam(request.getMigrationAssetId())
                .appendPathParam("actions")
                .appendPathParam("replicationProgress")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.ReplicationProgress.class,
                        GetReplicationProgressResponse.Builder::replicationProgress)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationProgressResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetReplicationScheduleResponse getReplicationSchedule(
            GetReplicationScheduleRequest request) {

        Validate.notBlank(
                request.getReplicationScheduleId(), "replicationScheduleId must not be blank");

        return clientCall(request, GetReplicationScheduleResponse::builder)
                .logger(LOG, "getReplicationSchedule")
                .serviceDetails(
                        "Migration",
                        "GetReplicationSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/ReplicationSchedule/GetReplicationSchedule")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetReplicationScheduleRequest::builder)
                .basePath("/20220919")
                .appendPathParam("replicationSchedules")
                .appendPathParam(request.getReplicationScheduleId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.ReplicationSchedule.class,
                        GetReplicationScheduleResponse.Builder::replicationSchedule)
                .handleResponseHeaderString("etag", GetReplicationScheduleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetReplicationScheduleResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetTargetAssetResponse getTargetAsset(GetTargetAssetRequest request) {

        Validate.notBlank(request.getTargetAssetId(), "targetAssetId must not be blank");

        return clientCall(request, GetTargetAssetResponse::builder)
                .logger(LOG, "getTargetAsset")
                .serviceDetails(
                        "Migration",
                        "GetTargetAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/TargetAsset/GetTargetAsset")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTargetAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("targetAssets")
                .appendPathParam(request.getTargetAssetId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.TargetAsset.class,
                        GetTargetAssetResponse.Builder::targetAsset)
                .handleResponseHeaderString("etag", GetTargetAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTargetAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Migration",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20220919")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString("etag", GetWorkRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ImportMigrationPlanResponse importMigrationPlan(ImportMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");
        Objects.requireNonNull(
                request.getImportMigrationPlanDetails(), "importMigrationPlanDetails is required");

        return clientCall(request, ImportMigrationPlanResponse::builder)
                .logger(LOG, "importMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "ImportMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/ImportMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .appendPathParam("actions")
                .appendPathParam("import")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBinaryRequestBody()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ImportMigrationPlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportMigrationPlanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListAvailableShapesResponse listAvailableShapes(ListAvailableShapesRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");

        return clientCall(request, ListAvailableShapesResponse::builder)
                .logger(LOG, "listAvailableShapes")
                .serviceDetails(
                        "Migration",
                        "ListAvailableShapes",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/AvailableShapesCollection/ListAvailableShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAvailableShapesRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .appendPathParam("availableShapes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dvhHostId", request.getDvhHostId())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("reservedCapacityId", request.getReservedCapacityId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.AvailableShapesCollection.class,
                        ListAvailableShapesResponse.Builder::availableShapesCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAvailableShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAvailableShapesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMigrationAssetsResponse listMigrationAssets(ListMigrationAssetsRequest request) {

        return clientCall(request, ListMigrationAssetsResponse::builder)
                .logger(LOG, "listMigrationAssets")
                .serviceDetails(
                        "Migration",
                        "ListMigrationAssets",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAssetCollection/ListMigrationAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationAssetsRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendQueryParam("migrationId", request.getMigrationId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("migrationAssetId", request.getMigrationAssetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationAssetCollection.class,
                        ListMigrationAssetsResponse.Builder::migrationAssetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationAssetsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMigrationPlansResponse listMigrationPlans(ListMigrationPlansRequest request) {

        return clientCall(request, ListMigrationPlansResponse::builder)
                .logger(LOG, "listMigrationPlans")
                .serviceDetails(
                        "Migration",
                        "ListMigrationPlans",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlanCollection/ListMigrationPlans")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationPlansRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("migrationId", request.getMigrationId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("migrationPlanId", request.getMigrationPlanId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationPlanCollection.class,
                        ListMigrationPlansResponse.Builder::migrationPlanCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationPlansResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationPlansResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMigrationsResponse listMigrations(ListMigrationsRequest request) {

        return clientCall(request, ListMigrationsResponse::builder)
                .logger(LOG, "listMigrations")
                .serviceDetails(
                        "Migration",
                        "ListMigrations",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationCollection/ListMigrations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMigrationsRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("migrationId", request.getMigrationId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationCollection.class,
                        ListMigrationsResponse.Builder::migrationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMigrationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMigrationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListReplicationSchedulesResponse listReplicationSchedules(
            ListReplicationSchedulesRequest request) {

        return clientCall(request, ListReplicationSchedulesResponse::builder)
                .logger(LOG, "listReplicationSchedules")
                .serviceDetails(
                        "Migration",
                        "ListReplicationSchedules",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/ReplicationScheduleCollection/ListReplicationSchedules")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListReplicationSchedulesRequest::builder)
                .basePath("/20220919")
                .appendPathParam("replicationSchedules")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("replicationScheduleId", request.getReplicationScheduleId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.ReplicationScheduleCollection.class,
                        ListReplicationSchedulesResponse.Builder::replicationScheduleCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListReplicationSchedulesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListReplicationSchedulesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTargetAssetsResponse listTargetAssets(ListTargetAssetsRequest request) {

        return clientCall(request, ListTargetAssetsResponse::builder)
                .logger(LOG, "listTargetAssets")
                .serviceDetails(
                        "Migration",
                        "ListTargetAssets",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/TargetAssetCollection/ListTargetAssets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTargetAssetsRequest::builder)
                .basePath("/20220919")
                .appendPathParam("targetAssets")
                .appendQueryParam("migrationPlanId", request.getMigrationPlanId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("targetAssetId", request.getTargetAssetId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.TargetAssetCollection.class,
                        ListTargetAssetsResponse.Builder::targetAssetCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTargetAssetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTargetAssetsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Migration",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20220919")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestLogsResponse::builder)
                .logger(LOG, "listWorkRequestLogs")
                .serviceDetails(
                        "Migration",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20220919")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "Migration",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20220919")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendEnumQueryParam("operationType", request.getOperationType())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.WorkRequestSummaryCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RefreshMigrationResponse refreshMigration(RefreshMigrationRequest request) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, RefreshMigrationResponse::builder)
                .logger(LOG, "refreshMigration")
                .serviceDetails(
                        "Migration",
                        "RefreshMigration",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/RefreshMigration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshMigrationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", RefreshMigrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshMigrationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RefreshMigrationAssetResponse refreshMigrationAsset(
            RefreshMigrationAssetRequest request) {

        Validate.notBlank(request.getMigrationAssetId(), "migrationAssetId must not be blank");

        return clientCall(request, RefreshMigrationAssetResponse::builder)
                .logger(LOG, "refreshMigrationAsset")
                .serviceDetails(
                        "Migration",
                        "RefreshMigrationAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/RefreshMigrationAsset")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshMigrationAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendPathParam(request.getMigrationAssetId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshMigrationAssetResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshMigrationAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RefreshMigrationPlanResponse refreshMigrationPlan(RefreshMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");

        return clientCall(request, RefreshMigrationPlanResponse::builder)
                .logger(LOG, "refreshMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "RefreshMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/RefreshMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RefreshMigrationPlanResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshMigrationPlanResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartAssetReplicationResponse startAssetReplication(
            StartAssetReplicationRequest request) {

        Validate.notBlank(request.getMigrationAssetId(), "migrationAssetId must not be blank");

        return clientCall(request, StartAssetReplicationResponse::builder)
                .logger(LOG, "startAssetReplication")
                .serviceDetails(
                        "Migration",
                        "StartAssetReplication",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/StartAssetReplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartAssetReplicationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendPathParam(request.getMigrationAssetId())
                .appendPathParam("actions")
                .appendPathParam("startAssetReplication")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartAssetReplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartAssetReplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartMigrationReplicationResponse startMigrationReplication(
            StartMigrationReplicationRequest request) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");

        return clientCall(request, StartMigrationReplicationResponse::builder)
                .logger(LOG, "startMigrationReplication")
                .serviceDetails(
                        "Migration",
                        "StartMigrationReplication",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/StartMigrationReplication")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartMigrationReplicationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .appendPathParam("actions")
                .appendPathParam("startMigrationReplication")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartMigrationReplicationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartMigrationReplicationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMigrationResponse updateMigration(UpdateMigrationRequest request) {

        Validate.notBlank(request.getMigrationId(), "migrationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMigrationDetails(), "updateMigrationDetails is required");

        return clientCall(request, UpdateMigrationResponse::builder)
                .logger(LOG, "updateMigration")
                .serviceDetails(
                        "Migration",
                        "UpdateMigration",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/Migration/UpdateMigration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMigrationRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrations")
                .appendPathParam(request.getMigrationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.Migration.class,
                        UpdateMigrationResponse.Builder::migration)
                .handleResponseHeaderString("etag", UpdateMigrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMigrationResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMigrationAssetResponse updateMigrationAsset(UpdateMigrationAssetRequest request) {

        Validate.notBlank(request.getMigrationAssetId(), "migrationAssetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMigrationAssetDetails(),
                "updateMigrationAssetDetails is required");

        return clientCall(request, UpdateMigrationAssetResponse::builder)
                .logger(LOG, "updateMigrationAsset")
                .serviceDetails(
                        "Migration",
                        "UpdateMigrationAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationAsset/UpdateMigrationAsset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMigrationAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationAssets")
                .appendPathParam(request.getMigrationAssetId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.cloudmigrations.model.MigrationAsset.class,
                        UpdateMigrationAssetResponse.Builder::migrationAsset)
                .handleResponseHeaderString("etag", UpdateMigrationAssetResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMigrationAssetResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateMigrationPlanResponse updateMigrationPlan(UpdateMigrationPlanRequest request) {

        Validate.notBlank(request.getMigrationPlanId(), "migrationPlanId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMigrationPlanDetails(), "updateMigrationPlanDetails is required");

        return clientCall(request, UpdateMigrationPlanResponse::builder)
                .logger(LOG, "updateMigrationPlan")
                .serviceDetails(
                        "Migration",
                        "UpdateMigrationPlan",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/MigrationPlan/UpdateMigrationPlan")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMigrationPlanRequest::builder)
                .basePath("/20220919")
                .appendPathParam("migrationPlans")
                .appendPathParam(request.getMigrationPlanId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMigrationPlanResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateMigrationPlanResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateReplicationScheduleResponse updateReplicationSchedule(
            UpdateReplicationScheduleRequest request) {

        Validate.notBlank(
                request.getReplicationScheduleId(), "replicationScheduleId must not be blank");
        Objects.requireNonNull(
                request.getUpdateReplicationScheduleDetails(),
                "updateReplicationScheduleDetails is required");

        return clientCall(request, UpdateReplicationScheduleResponse::builder)
                .logger(LOG, "updateReplicationSchedule")
                .serviceDetails(
                        "Migration",
                        "UpdateReplicationSchedule",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/ReplicationSchedule/UpdateReplicationSchedule")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateReplicationScheduleRequest::builder)
                .basePath("/20220919")
                .appendPathParam("replicationSchedules")
                .appendPathParam(request.getReplicationScheduleId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateReplicationScheduleResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateReplicationScheduleResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateTargetAssetResponse updateTargetAsset(UpdateTargetAssetRequest request) {

        Validate.notBlank(request.getTargetAssetId(), "targetAssetId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTargetAssetDetails(), "updateTargetAssetDetails is required");

        return clientCall(request, UpdateTargetAssetResponse::builder)
                .logger(LOG, "updateTargetAsset")
                .serviceDetails(
                        "Migration",
                        "UpdateTargetAsset",
                        "https://docs.oracle.com/iaas/api/#/en/ocm/20220919/TargetAsset/UpdateTargetAsset")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTargetAssetRequest::builder)
                .basePath("/20220919")
                .appendPathParam("targetAssets")
                .appendPathParam(request.getTargetAssetId())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTargetAssetResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateTargetAssetResponse.Builder::opcWorkRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public MigrationWaiters getWaiters() {
        return waiters;
    }

    @Override
    public MigrationPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public MigrationClient(
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
    public MigrationClient(
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
    public MigrationClient(
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
    public MigrationClient(
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
    public MigrationClient(
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
    public MigrationClient(
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
    public MigrationClient(
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
    public MigrationClient(
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
