/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.database.requests.*;
import com.oracle.bmc.database.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DatabaseClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements Database {
    /** Service instance for Database. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DATABASE")
                    .serviceEndpointPrefix("database")
                    .serviceEndpointTemplate("https://database.{region}.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DatabaseClient.class);

    protected final java.util.concurrent.ExecutorService executorService;
    private final DatabaseWaiters waiters;

    private final DatabasePaginators paginators;

    DatabaseClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DatabaseClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService,
            boolean isStreamWarningEnabled) {
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
                                    .nameFormat("Database-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.executorService = executorService;
        this.waiters = new DatabaseWaiters(executorService, this);

        this.paginators = new DatabasePaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DatabaseClient",
                            "downloadExadataInfrastructureConfigFile,downloadValidationReport,downloadVmClusterNetworkConfigFile,generateAutonomousDatabaseWallet"));
        }
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DatabaseClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "database";
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
         * Enable/disable the stream warnings for the client
         *
         * @param isStreamWarningEnabled executorService
         * @return this builder
         */
        public Builder isStreamWarningEnabled(boolean isStreamWarningEnabled) {
            this.isStreamWarningEnabled = isStreamWarningEnabled;
            return this;
        }

        /**
         * Build the client.
         *
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public DatabaseClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DatabaseClient(
                    this, authenticationDetailsProvider, executorService, isStreamWarningEnabled);
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
    public ActivateExadataInfrastructureResponse activateExadataInfrastructure(
            ActivateExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getActivateExadataInfrastructureDetails(),
                "activateExadataInfrastructureDetails is required");

        return clientCall(request, ActivateExadataInfrastructureResponse::builder)
                .logger(LOG, "activateExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "ActivateExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/ActivateExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ActivateExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("activate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        ActivateExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ActivateExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", ActivateExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ActivateExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddStorageCapacityCloudExadataInfrastructureResponse
            addStorageCapacityCloudExadataInfrastructure(
                    AddStorageCapacityCloudExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, AddStorageCapacityCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "addStorageCapacityCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "AddStorageCapacityCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/AddStorageCapacityCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStorageCapacityCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("addStorageCapacity")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        AddStorageCapacityCloudExadataInfrastructureResponse.Builder
                                ::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddStorageCapacityCloudExadataInfrastructureResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddStorageCapacityCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddStorageCapacityCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddStorageCapacityExadataInfrastructureResponse addStorageCapacityExadataInfrastructure(
            AddStorageCapacityExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, AddStorageCapacityExadataInfrastructureResponse::builder)
                .logger(LOG, "addStorageCapacityExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "AddStorageCapacityExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/AddStorageCapacityExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddStorageCapacityExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("addStorageCapacity")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        AddStorageCapacityExadataInfrastructureResponse.Builder
                                ::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddStorageCapacityExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddStorageCapacityExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddStorageCapacityExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddVirtualMachineToCloudVmClusterResponse addVirtualMachineToCloudVmCluster(
            AddVirtualMachineToCloudVmClusterRequest request) {
        Objects.requireNonNull(
                request.getAddVirtualMachineToCloudVmClusterDetails(),
                "addVirtualMachineToCloudVmClusterDetails is required");

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, AddVirtualMachineToCloudVmClusterResponse::builder)
                .logger(LOG, "addVirtualMachineToCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "AddVirtualMachineToCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/AddVirtualMachineToCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddVirtualMachineToCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("addVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        AddVirtualMachineToCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddVirtualMachineToCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddVirtualMachineToCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddVirtualMachineToCloudVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddVirtualMachineToVmClusterResponse addVirtualMachineToVmCluster(
            AddVirtualMachineToVmClusterRequest request) {
        Objects.requireNonNull(
                request.getAddVirtualMachineToVmClusterDetails(),
                "addVirtualMachineToVmClusterDetails is required");

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, AddVirtualMachineToVmClusterResponse::builder)
                .logger(LOG, "addVirtualMachineToVmCluster")
                .serviceDetails(
                        "Database",
                        "AddVirtualMachineToVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/AddVirtualMachineToVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddVirtualMachineToVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("addVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        AddVirtualMachineToVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddVirtualMachineToVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", AddVirtualMachineToVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AddVirtualMachineToVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AutonomousDatabaseManualRefreshResponse autonomousDatabaseManualRefresh(
            AutonomousDatabaseManualRefreshRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getAutonomousDatabaseManualRefreshDetails(),
                "autonomousDatabaseManualRefreshDetails is required");

        return clientCall(request, AutonomousDatabaseManualRefreshResponse::builder)
                .logger(LOG, "autonomousDatabaseManualRefresh")
                .serviceDetails(
                        "Database",
                        "AutonomousDatabaseManualRefresh",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/AutonomousDatabaseManualRefresh")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AutonomousDatabaseManualRefreshRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        AutonomousDatabaseManualRefreshResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", AutonomousDatabaseManualRefreshResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        AutonomousDatabaseManualRefreshResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AutonomousDatabaseManualRefreshResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CancelBackupResponse cancelBackup(CancelBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, CancelBackupResponse::builder)
                .logger(LOG, "cancelBackup")
                .serviceDetails(
                        "Database",
                        "CancelBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/CancelBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id", CancelBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAutonomousContainerDatabaseCompartmentResponse
            changeAutonomousContainerDatabaseCompartment(
                    ChangeAutonomousContainerDatabaseCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, ChangeAutonomousContainerDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousContainerDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousContainerDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/ChangeAutonomousContainerDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousContainerDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeAutonomousContainerDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousContainerDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousContainerDatabaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAutonomousDatabaseCompartmentResponse changeAutonomousDatabaseCompartment(
            ChangeAutonomousDatabaseCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ChangeAutonomousDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ChangeAutonomousDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeAutonomousDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousDatabaseCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousDatabaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAutonomousExadataInfrastructureCompartmentResponse
            changeAutonomousExadataInfrastructureCompartment(
                    ChangeAutonomousExadataInfrastructureCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(
                        request, ChangeAutonomousExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousExadataInfrastructureCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/ChangeAutonomousExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        ChangeAutonomousExadataInfrastructureCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousExadataInfrastructureCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousExadataInfrastructureCompartmentResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeAutonomousVmClusterCompartmentResponse changeAutonomousVmClusterCompartment(
            ChangeAutonomousVmClusterCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeAutonomousVmClusterCompartmentDetails(),
                "changeAutonomousVmClusterCompartmentDetails is required");

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, ChangeAutonomousVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeAutonomousVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeAutonomousVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/ChangeAutonomousVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeAutonomousVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeAutonomousVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeAutonomousVmClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeBackupDestinationCompartmentResponse changeBackupDestinationCompartment(
            ChangeBackupDestinationCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");

        return clientCall(request, ChangeBackupDestinationCompartmentResponse::builder)
                .logger(LOG, "changeBackupDestinationCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeBackupDestinationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/ChangeBackupDestinationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeBackupDestinationCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeBackupDestinationCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeBackupDestinationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeBackupDestinationCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeCloudAutonomousVmClusterCompartmentResponse
            changeCloudAutonomousVmClusterCompartment(
                    ChangeCloudAutonomousVmClusterCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCloudAutonomousVmClusterCompartmentDetails(),
                "changeCloudAutonomousVmClusterCompartmentDetails is required");

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, ChangeCloudAutonomousVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeCloudAutonomousVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeCloudAutonomousVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/ChangeCloudAutonomousVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCloudAutonomousVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCloudAutonomousVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCloudAutonomousVmClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeCloudExadataInfrastructureCompartmentResponse
            changeCloudExadataInfrastructureCompartment(
                    ChangeCloudExadataInfrastructureCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCloudExadataInfrastructureCompartmentDetails(),
                "changeCloudExadataInfrastructureCompartmentDetails is required");

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, ChangeCloudExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeCloudExadataInfrastructureCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeCloudExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/ChangeCloudExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCloudExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCloudExadataInfrastructureCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCloudExadataInfrastructureCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeCloudVmClusterCompartmentResponse changeCloudVmClusterCompartment(
            ChangeCloudVmClusterCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCloudVmClusterCompartmentDetails(),
                "changeCloudVmClusterCompartmentDetails is required");

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, ChangeCloudVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeCloudVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeCloudVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/ChangeCloudVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeCloudVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeCloudVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeCloudVmClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDatabaseSoftwareImageCompartmentResponse changeDatabaseSoftwareImageCompartment(
            ChangeDatabaseSoftwareImageCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");

        return clientCall(request, ChangeDatabaseSoftwareImageCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseSoftwareImageCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeDatabaseSoftwareImageCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/ChangeDatabaseSoftwareImageCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseSoftwareImageCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeDatabaseSoftwareImageCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseSoftwareImageCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseSoftwareImageCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDataguardRoleResponse changeDataguardRole(ChangeDataguardRoleRequest request) {
        Objects.requireNonNull(
                request.getChangeDataguardRoleDetails(), "changeDataguardRoleDetails is required");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, ChangeDataguardRoleResponse::builder)
                .logger(LOG, "changeDataguardRole")
                .serviceDetails(
                        "Database",
                        "ChangeDataguardRole",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/ChangeDataguardRole")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDataguardRoleRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeDataguardRole")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        ChangeDataguardRoleResponse.Builder::autonomousContainerDatabase)
                .handleResponseHeaderString("etag", ChangeDataguardRoleResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDataguardRoleResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDataguardRoleResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDbSystemCompartmentResponse changeDbSystemCompartment(
            ChangeDbSystemCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ChangeDbSystemCompartmentResponse::builder)
                .logger(LOG, "changeDbSystemCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeDbSystemCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/ChangeDbSystemCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDbSystemCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString("etag", ChangeDbSystemCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDbSystemCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDbSystemCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeDisasterRecoveryConfigurationResponse changeDisasterRecoveryConfiguration(
            ChangeDisasterRecoveryConfigurationRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeDisasterRecoveryConfigurationDetails(),
                "changeDisasterRecoveryConfigurationDetails is required");

        return clientCall(request, ChangeDisasterRecoveryConfigurationResponse::builder)
                .logger(LOG, "changeDisasterRecoveryConfiguration")
                .serviceDetails(
                        "Database",
                        "ChangeDisasterRecoveryConfiguration",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ChangeDisasterRecoveryConfiguration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(ChangeDisasterRecoveryConfigurationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeDisasterRecoveryConfiguration")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        ChangeDisasterRecoveryConfigurationResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", ChangeDisasterRecoveryConfigurationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDisasterRecoveryConfigurationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDisasterRecoveryConfigurationResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ChangeExadataInfrastructureCompartmentResponse changeExadataInfrastructureCompartment(
            ChangeExadataInfrastructureCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeExadataInfrastructureCompartmentDetails(),
                "changeExadataInfrastructureCompartmentDetails is required");

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, ChangeExadataInfrastructureCompartmentResponse::builder)
                .logger(LOG, "changeExadataInfrastructureCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExadataInfrastructureCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/ChangeExadataInfrastructureCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExadataInfrastructureCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExadataInfrastructureCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExadataInfrastructureCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeExternalContainerDatabaseCompartmentResponse
            changeExternalContainerDatabaseCompartment(
                    ChangeExternalContainerDatabaseCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, ChangeExternalContainerDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeExternalContainerDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExternalContainerDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/ChangeExternalContainerDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalContainerDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeExternalContainerDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalContainerDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalContainerDatabaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeExternalNonContainerDatabaseCompartmentResponse
            changeExternalNonContainerDatabaseCompartment(
                    ChangeExternalNonContainerDatabaseCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(request, ChangeExternalNonContainerDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeExternalNonContainerDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExternalNonContainerDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/ChangeExternalNonContainerDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalNonContainerDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeExternalNonContainerDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalNonContainerDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalNonContainerDatabaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeExternalPluggableDatabaseCompartmentResponse
            changeExternalPluggableDatabaseCompartment(
                    ChangeExternalPluggableDatabaseCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, ChangeExternalPluggableDatabaseCompartmentResponse::builder)
                .logger(LOG, "changeExternalPluggableDatabaseCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeExternalPluggableDatabaseCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/ChangeExternalPluggableDatabaseCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeExternalPluggableDatabaseCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag", ChangeExternalPluggableDatabaseCompartmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeExternalPluggableDatabaseCompartmentResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeExternalPluggableDatabaseCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeKeyStoreCompartmentResponse changeKeyStoreCompartment(
            ChangeKeyStoreCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeKeyStoreCompartmentDetails(),
                "changeKeyStoreCompartmentDetails is required");

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");

        return clientCall(request, ChangeKeyStoreCompartmentResponse::builder)
                .logger(LOG, "changeKeyStoreCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeKeyStoreCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/ChangeKeyStoreCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKeyStoreCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeKeyStoreCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeKeyStoreCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeKeyStoreTypeResponse changeKeyStoreType(ChangeKeyStoreTypeRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getChangeKeyStoreTypeDetails(), "changeKeyStoreTypeDetails is required");

        return clientCall(request, ChangeKeyStoreTypeResponse::builder)
                .logger(LOG, "changeKeyStoreType")
                .serviceDetails(
                        "Database",
                        "ChangeKeyStoreType",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ChangeKeyStoreType")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeKeyStoreTypeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("changeKeyStoreType")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", ChangeKeyStoreTypeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeKeyStoreTypeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeOneoffPatchCompartmentResponse changeOneoffPatchCompartment(
            ChangeOneoffPatchCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeCompartmentDetails(), "changeCompartmentDetails is required");

        Validate.notBlank(request.getOneoffPatchId(), "oneoffPatchId must not be blank");

        return clientCall(request, ChangeOneoffPatchCompartmentResponse::builder)
                .logger(LOG, "changeOneoffPatchCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeOneoffPatchCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/ChangeOneoffPatchCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeOneoffPatchCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .appendPathParam(request.getOneoffPatchId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeOneoffPatchCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeOneoffPatchCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeVmClusterCompartmentResponse changeVmClusterCompartment(
            ChangeVmClusterCompartmentRequest request) {
        Objects.requireNonNull(
                request.getChangeVmClusterCompartmentDetails(),
                "changeVmClusterCompartmentDetails is required");

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ChangeVmClusterCompartmentResponse::builder)
                .logger(LOG, "changeVmClusterCompartment")
                .serviceDetails(
                        "Database",
                        "ChangeVmClusterCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/ChangeVmClusterCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeVmClusterCompartmentRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeVmClusterCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeVmClusterCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CheckExternalDatabaseConnectorConnectionStatusResponse
            checkExternalDatabaseConnectorConnectionStatus(
                    CheckExternalDatabaseConnectorConnectionStatusRequest request) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");

        return clientCall(request, CheckExternalDatabaseConnectorConnectionStatusResponse::builder)
                .logger(LOG, "checkExternalDatabaseConnectorConnectionStatus")
                .serviceDetails(
                        "Database",
                        "CheckExternalDatabaseConnectorConnectionStatus",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/CheckExternalDatabaseConnectorConnectionStatus")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CheckExternalDatabaseConnectorConnectionStatusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .appendPathParam("actions")
                .appendPathParam("checkConnectionStatus")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CheckExternalDatabaseConnectorConnectionStatusResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CheckExternalDatabaseConnectorConnectionStatusResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "etag",
                        CheckExternalDatabaseConnectorConnectionStatusResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CompleteExternalBackupJobResponse completeExternalBackupJob(
            CompleteExternalBackupJobRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");
        Objects.requireNonNull(
                request.getCompleteExternalBackupJobDetails(),
                "completeExternalBackupJobDetails is required");

        return clientCall(request, CompleteExternalBackupJobResponse::builder)
                .logger(LOG, "completeExternalBackupJob")
                .serviceDetails(
                        "Database",
                        "CompleteExternalBackupJob",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalBackupJob/CompleteExternalBackupJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CompleteExternalBackupJobRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalBackupJobs")
                .appendPathParam(request.getBackupId())
                .appendPathParam("actions")
                .appendPathParam("complete")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalBackupJob.class,
                        CompleteExternalBackupJobResponse.Builder::externalBackupJob)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CompleteExternalBackupJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CompleteExternalBackupJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CompleteExternalBackupJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConfigureAutonomousDatabaseVaultKeyResponse configureAutonomousDatabaseVaultKey(
            ConfigureAutonomousDatabaseVaultKeyRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getConfigureAutonomousDatabaseVaultKeyDetails(),
                "configureAutonomousDatabaseVaultKeyDetails is required");

        return clientCall(request, ConfigureAutonomousDatabaseVaultKeyResponse::builder)
                .logger(LOG, "configureAutonomousDatabaseVaultKey")
                .serviceDetails(
                        "Database",
                        "ConfigureAutonomousDatabaseVaultKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ConfigureAutonomousDatabaseVaultKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConfigureAutonomousDatabaseVaultKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("configureAutonomousDatabaseVaultKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ConfigureAutonomousDatabaseVaultKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ConfigureAutonomousDatabaseVaultKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ConvertToPdbResponse convertToPdb(ConvertToPdbRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(request.getConvertToPdbDetails(), "convertToPdbDetails is required");

        return clientCall(request, ConvertToPdbResponse::builder)
                .logger(LOG, "convertToPdb")
                .serviceDetails(
                        "Database",
                        "ConvertToPdb",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ConvertToPdb")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ConvertToPdbRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("convertToPdb")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        ConvertToPdbResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", ConvertToPdbResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", ConvertToPdbResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ConvertToPdbResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateApplicationVipResponse createApplicationVip(CreateApplicationVipRequest request) {
        Objects.requireNonNull(
                request.getCreateApplicationVipDetails(),
                "createApplicationVipDetails is required");

        return clientCall(request, CreateApplicationVipResponse::builder)
                .logger(LOG, "createApplicationVip")
                .serviceDetails(
                        "Database",
                        "CreateApplicationVip",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ApplicationVip/CreateApplicationVip")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateApplicationVipRequest::builder)
                .basePath("/20160918")
                .appendPathParam("applicationVip")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ApplicationVip.class,
                        CreateApplicationVipResponse.Builder::applicationVip)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateApplicationVipResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateApplicationVipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateApplicationVipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateAutonomousContainerDatabaseResponse createAutonomousContainerDatabase(
            CreateAutonomousContainerDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateAutonomousContainerDatabaseDetails(),
                "createAutonomousContainerDatabaseDetails is required");

        return clientCall(request, CreateAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "createAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/CreateAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        CreateAutonomousContainerDatabaseResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", CreateAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateAutonomousDatabaseResponse createAutonomousDatabase(
            CreateAutonomousDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateAutonomousDatabaseDetails(),
                "createAutonomousDatabaseDetails is required");

        return clientCall(request, CreateAutonomousDatabaseResponse::builder)
                .logger(LOG, "createAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/CreateAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        CreateAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", CreateAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateAutonomousDatabaseBackupResponse createAutonomousDatabaseBackup(
            CreateAutonomousDatabaseBackupRequest request) {
        Objects.requireNonNull(
                request.getCreateAutonomousDatabaseBackupDetails(),
                "createAutonomousDatabaseBackupDetails is required");

        return clientCall(request, CreateAutonomousDatabaseBackupResponse::builder)
                .logger(LOG, "createAutonomousDatabaseBackup")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousDatabaseBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/CreateAutonomousDatabaseBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousDatabaseBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackup.class,
                        CreateAutonomousDatabaseBackupResponse.Builder::autonomousDatabaseBackup)
                .handleResponseHeaderString(
                        "etag", CreateAutonomousDatabaseBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateAutonomousDatabaseBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousDatabaseBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateAutonomousVmClusterResponse createAutonomousVmCluster(
            CreateAutonomousVmClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateAutonomousVmClusterDetails(),
                "createAutonomousVmClusterDetails is required");

        return clientCall(request, CreateAutonomousVmClusterResponse::builder)
                .logger(LOG, "createAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/CreateAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVmCluster.class,
                        CreateAutonomousVmClusterResponse.Builder::autonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBackupResponse createBackup(CreateBackupRequest request) {
        Objects.requireNonNull(request.getCreateBackupDetails(), "createBackupDetails is required");

        return clientCall(request, CreateBackupResponse::builder)
                .logger(LOG, "createBackup")
                .serviceDetails(
                        "Database",
                        "CreateBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/CreateBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Backup.class,
                        CreateBackupResponse.Builder::backup)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBackupDestinationResponse createBackupDestination(
            CreateBackupDestinationRequest request) {
        Objects.requireNonNull(
                request.getCreateBackupDestinationDetails(),
                "createBackupDestinationDetails is required");

        return clientCall(request, CreateBackupDestinationResponse::builder)
                .logger(LOG, "createBackupDestination")
                .serviceDetails(
                        "Database",
                        "CreateBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/CreateBackupDestination")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.BackupDestination.class,
                        CreateBackupDestinationResponse.Builder::backupDestination)
                .handleResponseHeaderString("etag", CreateBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBackupDestinationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCloudAutonomousVmClusterResponse createCloudAutonomousVmCluster(
            CreateCloudAutonomousVmClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateCloudAutonomousVmClusterDetails(),
                "createCloudAutonomousVmClusterDetails is required");

        return clientCall(request, CreateCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "createCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/CreateCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmCluster.class,
                        CreateCloudAutonomousVmClusterResponse.Builder::cloudAutonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCloudAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCloudAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCloudExadataInfrastructureResponse createCloudExadataInfrastructure(
            CreateCloudExadataInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getCreateCloudExadataInfrastructureDetails(),
                "createCloudExadataInfrastructureDetails is required");

        return clientCall(request, CreateCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "createCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "CreateCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/CreateCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        CreateCloudExadataInfrastructureResponse.Builder
                                ::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCloudExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateCloudVmClusterResponse createCloudVmCluster(CreateCloudVmClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateCloudVmClusterDetails(),
                "createCloudVmClusterDetails is required");

        return clientCall(request, CreateCloudVmClusterResponse::builder)
                .logger(LOG, "createCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/CreateCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        CreateCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCloudVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateConsoleConnectionResponse createConsoleConnection(
            CreateConsoleConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateConsoleConnectionDetails(),
                "createConsoleConnectionDetails is required");

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        return clientCall(request, CreateConsoleConnectionResponse::builder)
                .logger(LOG, "createConsoleConnection")
                .serviceDetails(
                        "Database",
                        "CreateConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/CreateConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ConsoleConnection.class,
                        CreateConsoleConnectionResponse.Builder::consoleConnection)
                .handleResponseHeaderString("etag", CreateConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConsoleConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateConsoleConnectionResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public CreateDataGuardAssociationResponse createDataGuardAssociation(
            CreateDataGuardAssociationRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getCreateDataGuardAssociationDetails(),
                "createDataGuardAssociationDetails is required");

        return clientCall(request, CreateDataGuardAssociationResponse::builder)
                .logger(LOG, "createDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "CreateDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/CreateDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        CreateDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDataGuardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateNewDatabaseDetails(), "createNewDatabaseDetails is required");

        return clientCall(request, CreateDatabaseResponse::builder)
                .logger(LOG, "createDatabase")
                .serviceDetails(
                        "Database",
                        "CreateDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/CreateDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        CreateDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDatabaseSoftwareImageResponse createDatabaseSoftwareImage(
            CreateDatabaseSoftwareImageRequest request) {
        Objects.requireNonNull(
                request.getCreateDatabaseSoftwareImageDetails(),
                "createDatabaseSoftwareImageDetails is required");

        return clientCall(request, CreateDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "createDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "CreateDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/CreateDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseSoftwareImage.class,
                        CreateDatabaseSoftwareImageResponse.Builder::databaseSoftwareImage)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseSoftwareImageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDatabaseSoftwareImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDbHomeResponse createDbHome(CreateDbHomeRequest request) {
        Objects.requireNonNull(
                request.getCreateDbHomeWithDbSystemIdDetails(),
                "createDbHomeWithDbSystemIdDetails is required");

        return clientCall(request, CreateDbHomeResponse::builder)
                .logger(LOG, "createDbHome")
                .serviceDetails(
                        "Database",
                        "CreateDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/CreateDbHome")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbHome.class,
                        CreateDbHomeResponse.Builder::dbHome)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDbHomeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDbHomeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExadataInfrastructureResponse createExadataInfrastructure(
            CreateExadataInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getCreateExadataInfrastructureDetails(),
                "createExadataInfrastructureDetails is required");

        return clientCall(request, CreateExadataInfrastructureResponse::builder)
                .logger(LOG, "createExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "CreateExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/CreateExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        CreateExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExternalBackupJobResponse createExternalBackupJob(
            CreateExternalBackupJobRequest request) {
        Objects.requireNonNull(
                request.getCreateExternalBackupJobDetails(),
                "createExternalBackupJobDetails is required");

        return clientCall(request, CreateExternalBackupJobResponse::builder)
                .logger(LOG, "createExternalBackupJob")
                .serviceDetails(
                        "Database",
                        "CreateExternalBackupJob",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalBackupJob/CreateExternalBackupJob")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalBackupJobRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalBackupJobs")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalBackupJob.class,
                        CreateExternalBackupJobResponse.Builder::externalBackupJob)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalBackupJobResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateExternalBackupJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateExternalBackupJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExternalContainerDatabaseResponse createExternalContainerDatabase(
            CreateExternalContainerDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateExternalContainerDatabaseDetails(),
                "createExternalContainerDatabaseDetails is required");

        return clientCall(request, CreateExternalContainerDatabaseResponse::builder)
                .logger(LOG, "createExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "CreateExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/CreateExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalContainerDatabase.class,
                        CreateExternalContainerDatabaseResponse.Builder::externalContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExternalDatabaseConnectorResponse createExternalDatabaseConnector(
            CreateExternalDatabaseConnectorRequest request) {
        Objects.requireNonNull(
                request.getCreateExternalDatabaseConnectorDetails(),
                "createExternalDatabaseConnectorDetails is required");

        return clientCall(request, CreateExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "createExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "CreateExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/CreateExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalDatabaseConnector.class,
                        CreateExternalDatabaseConnectorResponse.Builder::externalDatabaseConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalDatabaseConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalDatabaseConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExternalNonContainerDatabaseResponse createExternalNonContainerDatabase(
            CreateExternalNonContainerDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateExternalNonContainerDatabaseDetails(),
                "createExternalNonContainerDatabaseDetails is required");

        return clientCall(request, CreateExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "createExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "CreateExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/CreateExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.class,
                        CreateExternalNonContainerDatabaseResponse.Builder
                                ::externalNonContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalNonContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalNonContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateExternalPluggableDatabaseResponse createExternalPluggableDatabase(
            CreateExternalPluggableDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreateExternalPluggableDatabaseDetails(),
                "createExternalPluggableDatabaseDetails is required");

        return clientCall(request, CreateExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "createExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "CreateExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/CreateExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalPluggableDatabase.class,
                        CreateExternalPluggableDatabaseResponse.Builder::externalPluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateExternalPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", CreateExternalPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateKeyStoreResponse createKeyStore(CreateKeyStoreRequest request) {
        Objects.requireNonNull(
                request.getCreateKeyStoreDetails(), "createKeyStoreDetails is required");

        return clientCall(request, CreateKeyStoreResponse::builder)
                .logger(LOG, "createKeyStore")
                .serviceDetails(
                        "Database",
                        "CreateKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/CreateKeyStore")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.KeyStore.class,
                        CreateKeyStoreResponse.Builder::keyStore)
                .handleResponseHeaderString("etag", CreateKeyStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateKeyStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateOneoffPatchResponse createOneoffPatch(CreateOneoffPatchRequest request) {
        Objects.requireNonNull(
                request.getCreateOneoffPatchDetails(), "createOneoffPatchDetails is required");

        return clientCall(request, CreateOneoffPatchResponse::builder)
                .logger(LOG, "createOneoffPatch")
                .serviceDetails(
                        "Database",
                        "CreateOneoffPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/CreateOneoffPatch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOneoffPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.OneoffPatch.class,
                        CreateOneoffPatchResponse.Builder::oneoffPatch)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateOneoffPatchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateOneoffPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOneoffPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreatePluggableDatabaseResponse createPluggableDatabase(
            CreatePluggableDatabaseRequest request) {
        Objects.requireNonNull(
                request.getCreatePluggableDatabaseDetails(),
                "createPluggableDatabaseDetails is required");

        return clientCall(request, CreatePluggableDatabaseResponse::builder)
                .logger(LOG, "createPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "CreatePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/CreatePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        CreatePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreatePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreatePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVmClusterResponse createVmCluster(CreateVmClusterRequest request) {
        Objects.requireNonNull(
                request.getCreateVmClusterDetails(), "createVmClusterDetails is required");

        return clientCall(request, CreateVmClusterResponse::builder)
                .logger(LOG, "createVmCluster")
                .serviceDetails(
                        "Database",
                        "CreateVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/CreateVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        CreateVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateVmClusterNetworkResponse createVmClusterNetwork(
            CreateVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getVmClusterNetworkDetails(), "vmClusterNetworkDetails is required");

        return clientCall(request, CreateVmClusterNetworkResponse::builder)
                .logger(LOG, "createVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "CreateVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/CreateVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        CreateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DbNodeActionResponse dbNodeAction(DbNodeActionRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");
        Objects.requireNonNull(request.getAction(), "action is required");

        return clientCall(request, DbNodeActionResponse::builder)
                .logger(LOG, "dbNodeAction")
                .serviceDetails(
                        "Database",
                        "DbNodeAction",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/DbNodeAction")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DbNodeActionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendQueryParam("action", request.getAction())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.DbNode.class,
                        DbNodeActionResponse.Builder::dbNode)
                .handleResponseHeaderString(
                        "opc-work-request-id", DbNodeActionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", DbNodeActionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DbNodeActionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteApplicationVipResponse deleteApplicationVip(DeleteApplicationVipRequest request) {

        Validate.notBlank(request.getApplicationVipId(), "applicationVipId must not be blank");

        return clientCall(request, DeleteApplicationVipResponse::builder)
                .logger(LOG, "deleteApplicationVip")
                .serviceDetails(
                        "Database",
                        "DeleteApplicationVip",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ApplicationVip/DeleteApplicationVip")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteApplicationVipRequest::builder)
                .basePath("/20160918")
                .appendPathParam("applicationVip")
                .appendPathParam(request.getApplicationVipId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteApplicationVipResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteApplicationVipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteAutonomousDatabaseResponse deleteAutonomousDatabase(
            DeleteAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DeleteAutonomousDatabaseResponse::builder)
                .logger(LOG, "deleteAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DeleteAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteAutonomousDatabaseBackupResponse deleteAutonomousDatabaseBackup(
            DeleteAutonomousDatabaseBackupRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseBackupId(),
                "autonomousDatabaseBackupId must not be blank");

        return clientCall(request, DeleteAutonomousDatabaseBackupResponse::builder)
                .logger(LOG, "deleteAutonomousDatabaseBackup")
                .serviceDetails(
                        "Database",
                        "DeleteAutonomousDatabaseBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/DeleteAutonomousDatabaseBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutonomousDatabaseBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .appendPathParam(request.getAutonomousDatabaseBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteAutonomousDatabaseBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAutonomousDatabaseBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteAutonomousVmClusterResponse deleteAutonomousVmCluster(
            DeleteAutonomousVmClusterRequest request) {

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, DeleteAutonomousVmClusterResponse::builder)
                .logger(LOG, "deleteAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/DeleteAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, DeleteBackupResponse::builder)
                .logger(LOG, "deleteBackup")
                .serviceDetails(
                        "Database",
                        "DeleteBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/DeleteBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBackupDestinationResponse deleteBackupDestination(
            DeleteBackupDestinationRequest request) {

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");

        return clientCall(request, DeleteBackupDestinationResponse::builder)
                .logger(LOG, "deleteBackupDestination")
                .serviceDetails(
                        "Database",
                        "DeleteBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/DeleteBackupDestination")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBackupDestinationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCloudAutonomousVmClusterResponse deleteCloudAutonomousVmCluster(
            DeleteCloudAutonomousVmClusterRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, DeleteCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "deleteCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/DeleteCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCloudAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCloudExadataInfrastructureResponse deleteCloudExadataInfrastructure(
            DeleteCloudExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, DeleteCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "deleteCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "DeleteCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/DeleteCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendQueryParam("isDeleteVmClusters", request.getIsDeleteVmClusters())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCloudExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteCloudVmClusterResponse deleteCloudVmCluster(DeleteCloudVmClusterRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, DeleteCloudVmClusterResponse::builder)
                .logger(LOG, "deleteCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/DeleteCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCloudVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConsoleConnectionResponse deleteConsoleConnection(
            DeleteConsoleConnectionRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        Validate.notBlank(
                request.getConsoleConnectionId(), "consoleConnectionId must not be blank");

        return clientCall(request, DeleteConsoleConnectionResponse::builder)
                .logger(LOG, "deleteConsoleConnection")
                .serviceDetails(
                        "Database",
                        "DeleteConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/DeleteConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .appendPathParam(request.getConsoleConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConsoleConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteConsoleConnectionResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, DeleteDatabaseResponse::builder)
                .logger(LOG, "deleteDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/DeleteDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendQueryParam("performFinalBackup", request.getPerformFinalBackup())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDatabaseSoftwareImageResponse deleteDatabaseSoftwareImage(
            DeleteDatabaseSoftwareImageRequest request) {

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");

        return clientCall(request, DeleteDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "deleteDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "DeleteDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/DeleteDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseSoftwareImageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDbHomeResponse deleteDbHome(DeleteDbHomeRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, DeleteDbHomeResponse::builder)
                .logger(LOG, "deleteDbHome")
                .serviceDetails(
                        "Database",
                        "DeleteDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/DeleteDbHome")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendQueryParam("performFinalBackup", request.getPerformFinalBackup())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDbHomeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDbHomeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteExadataInfrastructureResponse deleteExadataInfrastructure(
            DeleteExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, DeleteExadataInfrastructureResponse::builder)
                .logger(LOG, "deleteExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "DeleteExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/DeleteExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteExternalContainerDatabaseResponse deleteExternalContainerDatabase(
            DeleteExternalContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, DeleteExternalContainerDatabaseResponse::builder)
                .logger(LOG, "deleteExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/DeleteExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteExternalDatabaseConnectorResponse deleteExternalDatabaseConnector(
            DeleteExternalDatabaseConnectorRequest request) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");

        return clientCall(request, DeleteExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "deleteExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "DeleteExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/DeleteExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalDatabaseConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteExternalNonContainerDatabaseResponse deleteExternalNonContainerDatabase(
            DeleteExternalNonContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(request, DeleteExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "deleteExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DeleteExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalNonContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteExternalPluggableDatabaseResponse deleteExternalPluggableDatabase(
            DeleteExternalPluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, DeleteExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "deleteExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "DeleteExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DeleteExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteExternalPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteKeyStoreResponse deleteKeyStore(DeleteKeyStoreRequest request) {

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");

        return clientCall(request, DeleteKeyStoreResponse::builder)
                .logger(LOG, "deleteKeyStore")
                .serviceDetails(
                        "Database",
                        "DeleteKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/DeleteKeyStore")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteKeyStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteOneoffPatchResponse deleteOneoffPatch(DeleteOneoffPatchRequest request) {

        Validate.notBlank(request.getOneoffPatchId(), "oneoffPatchId must not be blank");

        return clientCall(request, DeleteOneoffPatchResponse::builder)
                .logger(LOG, "deleteOneoffPatch")
                .serviceDetails(
                        "Database",
                        "DeleteOneoffPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/DeleteOneoffPatch")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteOneoffPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .appendPathParam(request.getOneoffPatchId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteOneoffPatchResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteOneoffPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePluggableDatabaseResponse deletePluggableDatabase(
            DeletePluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, DeletePluggableDatabaseResponse::builder)
                .logger(LOG, "deletePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "DeletePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/DeletePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeletePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVmClusterResponse deleteVmCluster(DeleteVmClusterRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, DeleteVmClusterResponse::builder)
                .logger(LOG, "deleteVmCluster")
                .serviceDetails(
                        "Database",
                        "DeleteVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/DeleteVmCluster")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteVmClusterNetworkResponse deleteVmClusterNetwork(
            DeleteVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DeleteVmClusterNetworkResponse::builder)
                .logger(LOG, "deleteVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "DeleteVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/DeleteVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeregisterAutonomousDatabaseDataSafeResponse deregisterAutonomousDatabaseDataSafe(
            DeregisterAutonomousDatabaseDataSafeRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DeregisterAutonomousDatabaseDataSafeResponse::builder)
                .logger(LOG, "deregisterAutonomousDatabaseDataSafe")
                .serviceDetails(
                        "Database",
                        "DeregisterAutonomousDatabaseDataSafe",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DeregisterAutonomousDatabaseDataSafe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeregisterAutonomousDatabaseDataSafeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("deregisterDataSafe")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeregisterAutonomousDatabaseDataSafeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeregisterAutonomousDatabaseDataSafeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableAutonomousDatabaseManagementResponse disableAutonomousDatabaseManagement(
            DisableAutonomousDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DisableAutonomousDatabaseManagementResponse::builder)
                .logger(LOG, "disableAutonomousDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableAutonomousDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DisableAutonomousDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutonomousDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutonomousDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutonomousDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableAutonomousDatabaseOperationsInsightsResponse
            disableAutonomousDatabaseOperationsInsights(
                    DisableAutonomousDatabaseOperationsInsightsRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, DisableAutonomousDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "disableAutonomousDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "DisableAutonomousDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/DisableAutonomousDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableAutonomousDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableAutonomousDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableAutonomousDatabaseOperationsInsightsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableDatabaseManagementResponse disableDatabaseManagement(
            DisableDatabaseManagementRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, DisableDatabaseManagementResponse::builder)
                .logger(LOG, "disableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/DisableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        DisableDatabaseManagementResponse.Builder::database)
                .handleResponseHeaderString("etag", DisableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DisableDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalContainerDatabaseDatabaseManagementResponse
            disableExternalContainerDatabaseDatabaseManagement(
                    DisableExternalContainerDatabaseDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableExternalContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/DisableExternalContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalContainerDatabaseStackMonitoringResponse
            disableExternalContainerDatabaseStackMonitoring(
                    DisableExternalContainerDatabaseStackMonitoringRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, DisableExternalContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "DisableExternalContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/DisableExternalContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalNonContainerDatabaseDatabaseManagementResponse
            disableExternalNonContainerDatabaseDatabaseManagement(
                    DisableExternalNonContainerDatabaseDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableExternalNonContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DisableExternalNonContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DisableExternalNonContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalNonContainerDatabaseOperationsInsightsResponse
            disableExternalNonContainerDatabaseOperationsInsights(
                    DisableExternalNonContainerDatabaseOperationsInsightsRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "DisableExternalNonContainerDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DisableExternalNonContainerDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        DisableExternalNonContainerDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalNonContainerDatabaseStackMonitoringResponse
            disableExternalNonContainerDatabaseStackMonitoring(
                    DisableExternalNonContainerDatabaseStackMonitoringRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalNonContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalNonContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "DisableExternalNonContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/DisableExternalNonContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalNonContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalPluggableDatabaseDatabaseManagementResponse
            disableExternalPluggableDatabaseDatabaseManagement(
                    DisableExternalPluggableDatabaseDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalPluggableDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisableExternalPluggableDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DisableExternalPluggableDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalPluggableDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalPluggableDatabaseOperationsInsightsResponse
            disableExternalPluggableDatabaseOperationsInsights(
                    DisableExternalPluggableDatabaseOperationsInsightsRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(
                        request,
                        DisableExternalPluggableDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "DisableExternalPluggableDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DisableExternalPluggableDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "etag",
                        DisableExternalPluggableDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisableExternalPluggableDatabaseStackMonitoringResponse
            disableExternalPluggableDatabaseStackMonitoring(
                    DisableExternalPluggableDatabaseStackMonitoringRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, DisableExternalPluggableDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "disableExternalPluggableDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "DisableExternalPluggableDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/DisableExternalPluggableDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisableExternalPluggableDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public DisablePluggableDatabaseManagementResponse disablePluggableDatabaseManagement(
            DisablePluggableDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, DisablePluggableDatabaseManagementResponse::builder)
                .logger(LOG, "disablePluggableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "DisablePluggableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/DisablePluggableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DisablePluggableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("disablePluggableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        DisablePluggableDatabaseManagementResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "etag", DisablePluggableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DisablePluggableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DisablePluggableDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DownloadExadataInfrastructureConfigFileResponse downloadExadataInfrastructureConfigFile(
            DownloadExadataInfrastructureConfigFileRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, DownloadExadataInfrastructureConfigFileResponse::builder)
                .logger(LOG, "downloadExadataInfrastructureConfigFile")
                .serviceDetails(
                        "Database",
                        "DownloadExadataInfrastructureConfigFile",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/DownloadExadataInfrastructureConfigFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadExadataInfrastructureConfigFileRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("downloadConfigFile")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadExadataInfrastructureConfigFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadExadataInfrastructureConfigFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadExadataInfrastructureConfigFileResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadExadataInfrastructureConfigFileResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadExadataInfrastructureConfigFileResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public DownloadOneoffPatchResponse downloadOneoffPatch(DownloadOneoffPatchRequest request) {

        Validate.notBlank(request.getOneoffPatchId(), "oneoffPatchId must not be blank");

        return clientCall(request, DownloadOneoffPatchResponse::builder)
                .logger(LOG, "downloadOneoffPatch")
                .serviceDetails(
                        "Database",
                        "DownloadOneoffPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/DownloadOneoffPatch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadOneoffPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .appendPathParam(request.getOneoffPatchId())
                .appendPathParam("actions")
                .appendPathParam("downloadOneoffPatch")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.DownloadOneoffPatch.class,
                        DownloadOneoffPatchResponse.Builder::downloadOneoffPatch)
                .handleResponseHeaderString("etag", DownloadOneoffPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadOneoffPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DownloadValidationReportResponse downloadValidationReport(
            DownloadValidationReportRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DownloadValidationReportResponse::builder)
                .logger(LOG, "downloadValidationReport")
                .serviceDetails(
                        "Database",
                        "DownloadValidationReport",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/DownloadValidationReport")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadValidationReportRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("downloadValidationReport")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadValidationReportResponse.Builder::inputStream)
                .handleResponseHeaderString("etag", DownloadValidationReportResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", DownloadValidationReportResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length", DownloadValidationReportResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified", DownloadValidationReportResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public DownloadVmClusterNetworkConfigFileResponse downloadVmClusterNetworkConfigFile(
            DownloadVmClusterNetworkConfigFileRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, DownloadVmClusterNetworkConfigFileResponse::builder)
                .logger(LOG, "downloadVmClusterNetworkConfigFile")
                .serviceDetails(
                        "Database",
                        "DownloadVmClusterNetworkConfigFile",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/DownloadVmClusterNetworkConfigFile")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DownloadVmClusterNetworkConfigFileRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("downloadConfigFile")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        java.io.InputStream.class,
                        DownloadVmClusterNetworkConfigFileResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", DownloadVmClusterNetworkConfigFileResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        DownloadVmClusterNetworkConfigFileResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        DownloadVmClusterNetworkConfigFileResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        DownloadVmClusterNetworkConfigFileResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public EnableAutonomousDatabaseManagementResponse enableAutonomousDatabaseManagement(
            EnableAutonomousDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, EnableAutonomousDatabaseManagementResponse::builder)
                .logger(LOG, "enableAutonomousDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableAutonomousDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/EnableAutonomousDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutonomousDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutonomousDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutonomousDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableAutonomousDatabaseOperationsInsightsResponse
            enableAutonomousDatabaseOperationsInsights(
                    EnableAutonomousDatabaseOperationsInsightsRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, EnableAutonomousDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "enableAutonomousDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "EnableAutonomousDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/EnableAutonomousDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableAutonomousDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableAutonomousDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableAutonomousDatabaseOperationsInsightsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableDatabaseManagementResponse enableDatabaseManagement(
            EnableDatabaseManagementRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableDatabaseManagementDetails(),
                "enableDatabaseManagementDetails is required");

        return clientCall(request, EnableDatabaseManagementResponse::builder)
                .logger(LOG, "enableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/EnableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        EnableDatabaseManagementResponse.Builder::database)
                .handleResponseHeaderString("etag", EnableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", EnableDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalContainerDatabaseDatabaseManagementResponse
            enableExternalContainerDatabaseDatabaseManagement(
                    EnableExternalContainerDatabaseDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalContainerDatabaseDatabaseManagementDetails(),
                "enableExternalContainerDatabaseDatabaseManagementDetails is required");

        return clientCall(
                        request, EnableExternalContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableExternalContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/EnableExternalContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalContainerDatabaseStackMonitoringResponse
            enableExternalContainerDatabaseStackMonitoring(
                    EnableExternalContainerDatabaseStackMonitoringRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalContainerDatabaseStackMonitoringDetails(),
                "enableExternalContainerDatabaseStackMonitoringDetails is required");

        return clientCall(request, EnableExternalContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "EnableExternalContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/EnableExternalContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalNonContainerDatabaseDatabaseManagementResponse
            enableExternalNonContainerDatabaseDatabaseManagement(
                    EnableExternalNonContainerDatabaseDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseDatabaseManagementDetails(),
                "enableExternalNonContainerDatabaseDatabaseManagementDetails is required");

        return clientCall(
                        request,
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableExternalNonContainerDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/EnableExternalNonContainerDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        EnableExternalNonContainerDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalNonContainerDatabaseOperationsInsightsResponse
            enableExternalNonContainerDatabaseOperationsInsights(
                    EnableExternalNonContainerDatabaseOperationsInsightsRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseOperationsInsightsDetails(),
                "enableExternalNonContainerDatabaseOperationsInsightsDetails is required");

        return clientCall(
                        request,
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "EnableExternalNonContainerDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/EnableExternalNonContainerDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        EnableExternalNonContainerDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalNonContainerDatabaseStackMonitoringResponse
            enableExternalNonContainerDatabaseStackMonitoring(
                    EnableExternalNonContainerDatabaseStackMonitoringRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalNonContainerDatabaseStackMonitoringDetails(),
                "enableExternalNonContainerDatabaseStackMonitoringDetails is required");

        return clientCall(
                        request, EnableExternalNonContainerDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalNonContainerDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "EnableExternalNonContainerDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/EnableExternalNonContainerDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalNonContainerDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalNonContainerDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalPluggableDatabaseDatabaseManagementResponse
            enableExternalPluggableDatabaseDatabaseManagement(
                    EnableExternalPluggableDatabaseDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseDatabaseManagementDetails(),
                "enableExternalPluggableDatabaseDatabaseManagementDetails is required");

        return clientCall(
                        request, EnableExternalPluggableDatabaseDatabaseManagementResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnableExternalPluggableDatabaseDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/EnableExternalPluggableDatabaseDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalPluggableDatabaseDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseDatabaseManagementResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalPluggableDatabaseOperationsInsightsResponse
            enableExternalPluggableDatabaseOperationsInsights(
                    EnableExternalPluggableDatabaseOperationsInsightsRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseOperationsInsightsDetails(),
                "enableExternalPluggableDatabaseOperationsInsightsDetails is required");

        return clientCall(
                        request, EnableExternalPluggableDatabaseOperationsInsightsResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseOperationsInsights")
                .serviceDetails(
                        "Database",
                        "EnableExternalPluggableDatabaseOperationsInsights",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/EnableExternalPluggableDatabaseOperationsInsights")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseOperationsInsightsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableOperationsInsights")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "etag",
                        EnableExternalPluggableDatabaseOperationsInsightsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseOperationsInsightsResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnableExternalPluggableDatabaseStackMonitoringResponse
            enableExternalPluggableDatabaseStackMonitoring(
                    EnableExternalPluggableDatabaseStackMonitoringRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnableExternalPluggableDatabaseStackMonitoringDetails(),
                "enableExternalPluggableDatabaseStackMonitoringDetails is required");

        return clientCall(request, EnableExternalPluggableDatabaseStackMonitoringResponse::builder)
                .logger(LOG, "enableExternalPluggableDatabaseStackMonitoring")
                .serviceDetails(
                        "Database",
                        "EnableExternalPluggableDatabaseStackMonitoring",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/EnableExternalPluggableDatabaseStackMonitoring")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnableExternalPluggableDatabaseStackMonitoringRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enableStackMonitoring")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnableExternalPluggableDatabaseStackMonitoringResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public EnablePluggableDatabaseManagementResponse enablePluggableDatabaseManagement(
            EnablePluggableDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getEnablePluggableDatabaseManagementDetails(),
                "enablePluggableDatabaseManagementDetails is required");

        return clientCall(request, EnablePluggableDatabaseManagementResponse::builder)
                .logger(LOG, "enablePluggableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "EnablePluggableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/EnablePluggableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(EnablePluggableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("enablePluggableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        EnablePluggableDatabaseManagementResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "etag", EnablePluggableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        EnablePluggableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        EnablePluggableDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public FailOverAutonomousDatabaseResponse failOverAutonomousDatabase(
            FailOverAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, FailOverAutonomousDatabaseResponse::builder)
                .logger(LOG, "failOverAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "FailOverAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/FailOverAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FailOverAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .appendQueryParam("peerDbId", request.getPeerDbId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        FailOverAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", FailOverAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", FailOverAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        FailOverAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public FailoverAutonomousContainerDatabaseDataguardAssociationResponse
            failoverAutonomousContainerDatabaseDataguardAssociation(
                    FailoverAutonomousContainerDatabaseDataguardAssociationRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "failoverAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "FailoverAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/FailoverAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        FailoverAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        FailoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public FailoverDataGuardAssociationResponse failoverDataGuardAssociation(
            FailoverDataGuardAssociationRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getFailoverDataGuardAssociationDetails(),
                "failoverDataGuardAssociationDetails is required");

        return clientCall(request, FailoverDataGuardAssociationResponse::builder)
                .logger(LOG, "failoverDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "FailoverDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/FailoverDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(FailoverDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("failover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        FailoverDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        FailoverDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", FailoverDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        FailoverDataGuardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GenerateAutonomousDatabaseWalletResponse generateAutonomousDatabaseWallet(
            GenerateAutonomousDatabaseWalletRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getGenerateAutonomousDatabaseWalletDetails(),
                "generateAutonomousDatabaseWalletDetails is required");

        return clientCall(request, GenerateAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "generateAutonomousDatabaseWallet")
                .serviceDetails(
                        "Database",
                        "GenerateAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/GenerateAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateAutonomousDatabaseWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("generateWallet")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        java.io.InputStream.class,
                        GenerateAutonomousDatabaseWalletResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GenerateAutonomousDatabaseWalletResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderLong(
                        "content-length",
                        GenerateAutonomousDatabaseWalletResponse.Builder::contentLength)
                .handleResponseHeaderDate(
                        "last-modified",
                        GenerateAutonomousDatabaseWalletResponse.Builder::lastModified)
                .callSync();
    }

    @Override
    public GenerateRecommendedVmClusterNetworkResponse generateRecommendedVmClusterNetwork(
            GenerateRecommendedVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getGenerateRecommendedNetworkDetails(),
                "generateRecommendedNetworkDetails is required");

        return clientCall(request, GenerateRecommendedVmClusterNetworkResponse::builder)
                .logger(LOG, "generateRecommendedVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "GenerateRecommendedVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/GenerateRecommendedVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateRecommendedVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam("actions")
                .appendPathParam("generateRecommendedNetwork")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetworkDetails.class,
                        GenerateRecommendedVmClusterNetworkResponse.Builder
                                ::vmClusterNetworkDetails)
                .handleResponseHeaderString(
                        "etag", GenerateRecommendedVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GenerateRecommendedVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetApplicationVipResponse getApplicationVip(GetApplicationVipRequest request) {

        Validate.notBlank(request.getApplicationVipId(), "applicationVipId must not be blank");

        return clientCall(request, GetApplicationVipResponse::builder)
                .logger(LOG, "getApplicationVip")
                .serviceDetails(
                        "Database",
                        "GetApplicationVip",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ApplicationVip/GetApplicationVip")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetApplicationVipRequest::builder)
                .basePath("/20160918")
                .appendPathParam("applicationVip")
                .appendPathParam(request.getApplicationVipId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ApplicationVip.class,
                        GetApplicationVipResponse.Builder::applicationVip)
                .handleResponseHeaderString("etag", GetApplicationVipResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetApplicationVipResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousContainerDatabaseResponse getAutonomousContainerDatabase(
            GetAutonomousContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, GetAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "getAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "GetAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/GetAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        GetAutonomousContainerDatabaseResponse.Builder::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", GetAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousContainerDatabaseDataguardAssociationResponse
            getAutonomousContainerDatabaseDataguardAssociation(
                    GetAutonomousContainerDatabaseDataguardAssociationRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        GetAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "getAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "GetAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/GetAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        GetAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        GetAutonomousContainerDatabaseDataguardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousContainerDatabaseResourceUsageResponse
            getAutonomousContainerDatabaseResourceUsage(
                    GetAutonomousContainerDatabaseResourceUsageRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, GetAutonomousContainerDatabaseResourceUsageResponse::builder)
                .logger(LOG, "getAutonomousContainerDatabaseResourceUsage")
                .serviceDetails(
                        "Database",
                        "GetAutonomousContainerDatabaseResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/GetAutonomousContainerDatabaseResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousContainerDatabaseResourceUsageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("resourceUsage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabaseResourceUsage
                                .class,
                        GetAutonomousContainerDatabaseResourceUsageResponse.Builder
                                ::autonomousContainerDatabaseResourceUsage)
                .handleResponseHeaderString(
                        "etag", GetAutonomousContainerDatabaseResourceUsageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousContainerDatabaseResourceUsageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousDatabaseResponse getAutonomousDatabase(
            GetAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, GetAutonomousDatabaseResponse::builder)
                .logger(LOG, "getAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/GetAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        GetAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", GetAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousDatabaseBackupResponse getAutonomousDatabaseBackup(
            GetAutonomousDatabaseBackupRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseBackupId(),
                "autonomousDatabaseBackupId must not be blank");

        return clientCall(request, GetAutonomousDatabaseBackupResponse::builder)
                .logger(LOG, "getAutonomousDatabaseBackup")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/GetAutonomousDatabaseBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .appendPathParam(request.getAutonomousDatabaseBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackup.class,
                        GetAutonomousDatabaseBackupResponse.Builder::autonomousDatabaseBackup)
                .handleResponseHeaderString(
                        "etag", GetAutonomousDatabaseBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousDatabaseBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousDatabaseDataguardAssociationResponse
            getAutonomousDatabaseDataguardAssociation(
                    GetAutonomousDatabaseDataguardAssociationRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousDatabaseDataguardAssociationId(),
                "autonomousDatabaseDataguardAssociationId must not be blank");

        return clientCall(request, GetAutonomousDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "getAutonomousDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseDataguardAssociation/GetAutonomousDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("autonomousDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousDatabaseDataguardAssociationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation.class,
                        GetAutonomousDatabaseDataguardAssociationResponse.Builder
                                ::autonomousDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag", GetAutonomousDatabaseDataguardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousDatabaseDataguardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousDatabaseRegionalWalletResponse getAutonomousDatabaseRegionalWallet(
            GetAutonomousDatabaseRegionalWalletRequest request) {

        return clientCall(request, GetAutonomousDatabaseRegionalWalletResponse::builder)
                .logger(LOG, "getAutonomousDatabaseRegionalWallet")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseRegionalWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/GetAutonomousDatabaseRegionalWallet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseRegionalWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseWallet.class,
                        GetAutonomousDatabaseRegionalWalletResponse.Builder
                                ::autonomousDatabaseWallet)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousDatabaseRegionalWalletResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousDatabaseWalletResponse getAutonomousDatabaseWallet(
            GetAutonomousDatabaseWalletRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, GetAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "getAutonomousDatabaseWallet")
                .serviceDetails(
                        "Database",
                        "GetAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/GetAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousDatabaseWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseWallet.class,
                        GetAutonomousDatabaseWalletResponse.Builder::autonomousDatabaseWallet)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousExadataInfrastructureResponse getAutonomousExadataInfrastructure(
            GetAutonomousExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, GetAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "getAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "GetAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/GetAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure.class,
                        GetAutonomousExadataInfrastructureResponse.Builder
                                ::autonomousExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", GetAutonomousExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousPatchResponse getAutonomousPatch(GetAutonomousPatchRequest request) {

        Validate.notBlank(request.getAutonomousPatchId(), "autonomousPatchId must not be blank");

        return clientCall(request, GetAutonomousPatchResponse::builder)
                .logger(LOG, "getAutonomousPatch")
                .serviceDetails(
                        "Database",
                        "GetAutonomousPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousPatch/GetAutonomousPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousPatches")
                .appendPathParam(request.getAutonomousPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousPatch.class,
                        GetAutonomousPatchResponse.Builder::autonomousPatch)
                .handleResponseHeaderString("etag", GetAutonomousPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousVirtualMachineResponse getAutonomousVirtualMachine(
            GetAutonomousVirtualMachineRequest request) {

        Validate.notBlank(
                request.getAutonomousVirtualMachineId(),
                "autonomousVirtualMachineId must not be blank");

        return clientCall(request, GetAutonomousVirtualMachineResponse::builder)
                .logger(LOG, "getAutonomousVirtualMachine")
                .serviceDetails(
                        "Database",
                        "GetAutonomousVirtualMachine",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVirtualMachine/GetAutonomousVirtualMachine")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousVirtualMachineRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVirtualMachines")
                .appendPathParam(request.getAutonomousVirtualMachineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVirtualMachine.class,
                        GetAutonomousVirtualMachineResponse.Builder::autonomousVirtualMachine)
                .handleResponseHeaderString(
                        "etag", GetAutonomousVirtualMachineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousVirtualMachineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetAutonomousVmClusterResponse getAutonomousVmCluster(
            GetAutonomousVmClusterRequest request) {

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, GetAutonomousVmClusterResponse::builder)
                .logger(LOG, "getAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "GetAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/GetAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVmCluster.class,
                        GetAutonomousVmClusterResponse.Builder::autonomousVmCluster)
                .handleResponseHeaderString("etag", GetAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBackupResponse getBackup(GetBackupRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetBackupResponse::builder)
                .logger(LOG, "getBackup")
                .serviceDetails(
                        "Database",
                        "GetBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/GetBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Backup.class,
                        GetBackupResponse.Builder::backup)
                .handleResponseHeaderString("etag", GetBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBackupDestinationResponse getBackupDestination(GetBackupDestinationRequest request) {

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");

        return clientCall(request, GetBackupDestinationResponse::builder)
                .logger(LOG, "getBackupDestination")
                .serviceDetails(
                        "Database",
                        "GetBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/GetBackupDestination")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.BackupDestination.class,
                        GetBackupDestinationResponse.Builder::backupDestination)
                .handleResponseHeaderString("etag", GetBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBackupDestinationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudAutonomousVmClusterResponse getCloudAutonomousVmCluster(
            GetCloudAutonomousVmClusterRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, GetCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "getCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "GetCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/GetCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmCluster.class,
                        GetCloudAutonomousVmClusterResponse.Builder::cloudAutonomousVmCluster)
                .handleResponseHeaderString(
                        "etag", GetCloudAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudAutonomousVmClusterResourceUsageResponse
            getCloudAutonomousVmClusterResourceUsage(
                    GetCloudAutonomousVmClusterResourceUsageRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, GetCloudAutonomousVmClusterResourceUsageResponse::builder)
                .logger(LOG, "getCloudAutonomousVmClusterResourceUsage")
                .serviceDetails(
                        "Database",
                        "GetCloudAutonomousVmClusterResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/GetCloudAutonomousVmClusterResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudAutonomousVmClusterResourceUsageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("resourceUsage")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmClusterResourceUsage.class,
                        GetCloudAutonomousVmClusterResourceUsageResponse.Builder
                                ::cloudAutonomousVmClusterResourceUsage)
                .handleResponseHeaderString(
                        "etag", GetCloudAutonomousVmClusterResourceUsageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudAutonomousVmClusterResourceUsageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudExadataInfrastructureResponse getCloudExadataInfrastructure(
            GetCloudExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(request, GetCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "getCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "GetCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/GetCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        GetCloudExadataInfrastructureResponse.Builder::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", GetCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudExadataInfrastructureUnallocatedResourcesResponse
            getCloudExadataInfrastructureUnallocatedResources(
                    GetCloudExadataInfrastructureUnallocatedResourcesRequest request) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");

        return clientCall(
                        request, GetCloudExadataInfrastructureUnallocatedResourcesResponse::builder)
                .logger(LOG, "getCloudExadataInfrastructureUnallocatedResources")
                .serviceDetails(
                        "Database",
                        "GetCloudExadataInfrastructureUnallocatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructureUnallocatedResources/GetCloudExadataInfrastructureUnallocatedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudExadataInfrastructureUnallocatedResourcesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .appendPathParam("unAllocatedResources")
                .appendListQueryParam(
                        "dbServers",
                        request.getDbServers(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructureUnallocatedResources
                                .class,
                        GetCloudExadataInfrastructureUnallocatedResourcesResponse.Builder
                                ::cloudExadataInfrastructureUnallocatedResources)
                .handleResponseHeaderString(
                        "etag",
                        GetCloudExadataInfrastructureUnallocatedResourcesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudExadataInfrastructureUnallocatedResourcesResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudVmClusterResponse getCloudVmCluster(GetCloudVmClusterRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, GetCloudVmClusterResponse::builder)
                .logger(LOG, "getCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "GetCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/GetCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        GetCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString("etag", GetCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudVmClusterIormConfigResponse getCloudVmClusterIormConfig(
            GetCloudVmClusterIormConfigRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, GetCloudVmClusterIormConfigResponse::builder)
                .logger(LOG, "getCloudVmClusterIormConfig")
                .serviceDetails(
                        "Database",
                        "GetCloudVmClusterIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/GetCloudVmClusterIormConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("CloudVmClusterIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        GetCloudVmClusterIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudVmClusterIormConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", GetCloudVmClusterIormConfigResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetCloudVmClusterUpdateResponse getCloudVmClusterUpdate(
            GetCloudVmClusterUpdateRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        Validate.notBlank(request.getUpdateId(), "updateId must not be blank");

        return clientCall(request, GetCloudVmClusterUpdateResponse::builder)
                .logger(LOG, "getCloudVmClusterUpdate")
                .serviceDetails(
                        "Database",
                        "GetCloudVmClusterUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Update/GetCloudVmClusterUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterUpdateRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updates")
                .appendPathParam(request.getUpdateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.Update.class,
                        GetCloudVmClusterUpdateResponse.Builder::update)
                .handleResponseHeaderString(
                        "opc-request-id", GetCloudVmClusterUpdateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCloudVmClusterUpdateHistoryEntryResponse getCloudVmClusterUpdateHistoryEntry(
            GetCloudVmClusterUpdateHistoryEntryRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        Validate.notBlank(
                request.getUpdateHistoryEntryId(), "updateHistoryEntryId must not be blank");

        return clientCall(request, GetCloudVmClusterUpdateHistoryEntryResponse::builder)
                .logger(LOG, "getCloudVmClusterUpdateHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetCloudVmClusterUpdateHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/UpdateHistoryEntry/GetCloudVmClusterUpdateHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCloudVmClusterUpdateHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendPathParam(request.getUpdateHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.UpdateHistoryEntry.class,
                        GetCloudVmClusterUpdateHistoryEntryResponse.Builder::updateHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetCloudVmClusterUpdateHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetCloudVmClusterUpdateHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConsoleConnectionResponse getConsoleConnection(GetConsoleConnectionRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        Validate.notBlank(
                request.getConsoleConnectionId(), "consoleConnectionId must not be blank");

        return clientCall(request, GetConsoleConnectionResponse::builder)
                .logger(LOG, "getConsoleConnection")
                .serviceDetails(
                        "Database",
                        "GetConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/GetConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .appendPathParam(request.getConsoleConnectionId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.ConsoleConnection.class,
                        GetConsoleConnectionResponse.Builder::consoleConnection)
                .handleResponseHeaderString("etag", GetConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConsoleConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDataGuardAssociationResponse getDataGuardAssociation(
            GetDataGuardAssociationRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");

        return clientCall(request, GetDataGuardAssociationResponse::builder)
                .logger(LOG, "getDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "GetDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/GetDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        GetDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString("etag", GetDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDataGuardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, GetDatabaseResponse::builder)
                .logger(LOG, "getDatabase")
                .serviceDetails(
                        "Database",
                        "GetDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/GetDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        GetDatabaseResponse.Builder::database)
                .handleResponseHeaderString("etag", GetDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseSoftwareImageResponse getDatabaseSoftwareImage(
            GetDatabaseSoftwareImageRequest request) {

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");

        return clientCall(request, GetDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "getDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "GetDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/GetDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseSoftwareImage.class,
                        GetDatabaseSoftwareImageResponse.Builder::databaseSoftwareImage)
                .handleResponseHeaderString("etag", GetDatabaseSoftwareImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDatabaseUpgradeHistoryEntryResponse getDatabaseUpgradeHistoryEntry(
            GetDatabaseUpgradeHistoryEntryRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getUpgradeHistoryEntryId(), "upgradeHistoryEntryId must not be blank");

        return clientCall(request, GetDatabaseUpgradeHistoryEntryResponse::builder)
                .logger(LOG, "getDatabaseUpgradeHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDatabaseUpgradeHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseUpgradeHistoryEntry/GetDatabaseUpgradeHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseUpgradeHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("upgradeHistoryEntries")
                .appendPathParam(request.getUpgradeHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntry.class,
                        GetDatabaseUpgradeHistoryEntryResponse.Builder::databaseUpgradeHistoryEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDatabaseUpgradeHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbHomeResponse getDbHome(GetDbHomeRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, GetDbHomeResponse::builder)
                .logger(LOG, "getDbHome")
                .serviceDetails(
                        "Database",
                        "GetDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/GetDbHome")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DbHome.class,
                        GetDbHomeResponse.Builder::dbHome)
                .handleResponseHeaderString("etag", GetDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbHomeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbHomePatchResponse getDbHomePatch(GetDbHomePatchRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetDbHomePatchResponse::builder)
                .logger(LOG, "getDbHomePatch")
                .serviceDetails(
                        "Database",
                        "GetDbHomePatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/GetDbHomePatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbHomePatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Patch.class,
                        GetDbHomePatchResponse.Builder::patch)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbHomePatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbHomePatchHistoryEntryResponse getDbHomePatchHistoryEntry(
            GetDbHomePatchHistoryEntryRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        Validate.notBlank(
                request.getPatchHistoryEntryId(), "patchHistoryEntryId must not be blank");

        return clientCall(request, GetDbHomePatchHistoryEntryResponse::builder)
                .logger(LOG, "getDbHomePatchHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDbHomePatchHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/GetDbHomePatchHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbHomePatchHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patchHistoryEntries")
                .appendPathParam(request.getPatchHistoryEntryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PatchHistoryEntry.class,
                        GetDbHomePatchHistoryEntryResponse.Builder::patchHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetDbHomePatchHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbHomePatchHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbNodeResponse getDbNode(GetDbNodeRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        return clientCall(request, GetDbNodeResponse::builder)
                .logger(LOG, "getDbNode")
                .serviceDetails(
                        "Database",
                        "GetDbNode",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/GetDbNode")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbNodeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DbNode.class,
                        GetDbNodeResponse.Builder::dbNode)
                .handleResponseHeaderString("etag", GetDbNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbNodeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbServerResponse getDbServer(GetDbServerRequest request) {
        Objects.requireNonNull(
                request.getExadataInfrastructureId(), "exadataInfrastructureId is required");

        Validate.notBlank(request.getDbServerId(), "dbServerId must not be blank");

        return clientCall(request, GetDbServerResponse::builder)
                .logger(LOG, "getDbServer")
                .serviceDetails(
                        "Database",
                        "GetDbServer",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbServer/GetDbServer")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbServerRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbServers")
                .appendPathParam(request.getDbServerId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.DbServer.class,
                        GetDbServerResponse.Builder::dbServer)
                .handleResponseHeaderString("etag", GetDbServerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbServerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbSystemResponse getDbSystem(GetDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetDbSystemResponse::builder)
                .logger(LOG, "getDbSystem")
                .serviceDetails(
                        "Database",
                        "GetDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/GetDbSystem")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        GetDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString("etag", GetDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbSystemPatchResponse getDbSystemPatch(GetDbSystemPatchRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetDbSystemPatchResponse::builder)
                .logger(LOG, "getDbSystemPatch")
                .serviceDetails(
                        "Database",
                        "GetDbSystemPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/GetDbSystemPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Patch.class,
                        GetDbSystemPatchResponse.Builder::patch)
                .handleResponseHeaderString(
                        "opc-request-id", GetDbSystemPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbSystemPatchHistoryEntryResponse getDbSystemPatchHistoryEntry(
            GetDbSystemPatchHistoryEntryRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(
                request.getPatchHistoryEntryId(), "patchHistoryEntryId must not be blank");

        return clientCall(request, GetDbSystemPatchHistoryEntryResponse::builder)
                .logger(LOG, "getDbSystemPatchHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDbSystemPatchHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/GetDbSystemPatchHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemPatchHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patchHistoryEntries")
                .appendPathParam(request.getPatchHistoryEntryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PatchHistoryEntry.class,
                        GetDbSystemPatchHistoryEntryResponse.Builder::patchHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetDbSystemPatchHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDbSystemPatchHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDbSystemUpgradeHistoryEntryResponse getDbSystemUpgradeHistoryEntry(
            GetDbSystemUpgradeHistoryEntryRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        Validate.notBlank(
                request.getUpgradeHistoryEntryId(), "upgradeHistoryEntryId must not be blank");

        return clientCall(request, GetDbSystemUpgradeHistoryEntryResponse::builder)
                .logger(LOG, "getDbSystemUpgradeHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetDbSystemUpgradeHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemUpgradeHistoryEntry/GetDbSystemUpgradeHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDbSystemUpgradeHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("upgradeHistoryEntries")
                .appendPathParam(request.getUpgradeHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntry.class,
                        GetDbSystemUpgradeHistoryEntryResponse.Builder::dbSystemUpgradeHistoryEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetDbSystemUpgradeHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExadataInfrastructureResponse getExadataInfrastructure(
            GetExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, GetExadataInfrastructureResponse::builder)
                .logger(LOG, "getExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "GetExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/GetExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendListQueryParam(
                        "excludedFields",
                        request.getExcludedFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        GetExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString("etag", GetExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExadataInfrastructureOcpusResponse getExadataInfrastructureOcpus(
            GetExadataInfrastructureOcpusRequest request) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, GetExadataInfrastructureOcpusResponse::builder)
                .logger(LOG, "getExadataInfrastructureOcpus")
                .serviceDetails(
                        "Database",
                        "GetExadataInfrastructureOcpus",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OCPUs/GetExadataInfrastructureOcpus")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataInfrastructureOcpusRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("ocpus")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.OCPUs.class,
                        GetExadataInfrastructureOcpusResponse.Builder::oCPUs)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExadataInfrastructureOcpusResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExadataInfrastructureUnAllocatedResourcesResponse
            getExadataInfrastructureUnAllocatedResources(
                    GetExadataInfrastructureUnAllocatedResourcesRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        return clientCall(request, GetExadataInfrastructureUnAllocatedResourcesResponse::builder)
                .logger(LOG, "getExadataInfrastructureUnAllocatedResources")
                .serviceDetails(
                        "Database",
                        "GetExadataInfrastructureUnAllocatedResources",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructureUnAllocatedResources/GetExadataInfrastructureUnAllocatedResources")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataInfrastructureUnAllocatedResourcesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("unAllocatedResources")
                .appendListQueryParam(
                        "dbServers",
                        request.getDbServers(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructureUnAllocatedResources
                                .class,
                        GetExadataInfrastructureUnAllocatedResourcesResponse.Builder
                                ::exadataInfrastructureUnAllocatedResources)
                .handleResponseHeaderString(
                        "etag", GetExadataInfrastructureUnAllocatedResourcesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExadataInfrastructureUnAllocatedResourcesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExadataIormConfigResponse getExadataIormConfig(GetExadataIormConfigRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, GetExadataIormConfigResponse::builder)
                .logger(LOG, "getExadataIormConfig")
                .serviceDetails(
                        "Database",
                        "GetExadataIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/GetExadataIormConfig")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExadataIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("ExadataIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        GetExadataIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-request-id", GetExadataIormConfigResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalBackupJobResponse getExternalBackupJob(GetExternalBackupJobRequest request) {

        Validate.notBlank(request.getBackupId(), "backupId must not be blank");

        return clientCall(request, GetExternalBackupJobResponse::builder)
                .logger(LOG, "getExternalBackupJob")
                .serviceDetails(
                        "Database",
                        "GetExternalBackupJob",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalBackupJob/GetExternalBackupJob")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalBackupJobRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalBackupJobs")
                .appendPathParam(request.getBackupId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.ExternalBackupJob.class,
                        GetExternalBackupJobResponse.Builder::externalBackupJob)
                .handleResponseHeaderString("etag", GetExternalBackupJobResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetExternalBackupJobResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalContainerDatabaseResponse getExternalContainerDatabase(
            GetExternalContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");

        return clientCall(request, GetExternalContainerDatabaseResponse::builder)
                .logger(LOG, "getExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "GetExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/GetExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalContainerDatabase.class,
                        GetExternalContainerDatabaseResponse.Builder::externalContainerDatabase)
                .handleResponseHeaderString(
                        "etag", GetExternalContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalDatabaseConnectorResponse getExternalDatabaseConnector(
            GetExternalDatabaseConnectorRequest request) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");

        return clientCall(request, GetExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "getExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "GetExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/GetExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalDatabaseConnector.class,
                        GetExternalDatabaseConnectorResponse.Builder::externalDatabaseConnector)
                .handleResponseHeaderString(
                        "etag", GetExternalDatabaseConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalNonContainerDatabaseResponse getExternalNonContainerDatabase(
            GetExternalNonContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");

        return clientCall(request, GetExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "getExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "GetExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/GetExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.class,
                        GetExternalNonContainerDatabaseResponse.Builder
                                ::externalNonContainerDatabase)
                .handleResponseHeaderString(
                        "etag", GetExternalNonContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetExternalPluggableDatabaseResponse getExternalPluggableDatabase(
            GetExternalPluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");

        return clientCall(request, GetExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "getExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "GetExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/GetExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.ExternalPluggableDatabase.class,
                        GetExternalPluggableDatabaseResponse.Builder::externalPluggableDatabase)
                .handleResponseHeaderString(
                        "etag", GetExternalPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetInfrastructureTargetVersionsResponse getInfrastructureTargetVersions(
            GetInfrastructureTargetVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, GetInfrastructureTargetVersionsResponse::builder)
                .logger(LOG, "getInfrastructureTargetVersions")
                .serviceDetails(
                        "Database",
                        "GetInfrastructureTargetVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/InfrastructureTargetVersion/GetInfrastructureTargetVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetInfrastructureTargetVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("infrastructureTargetVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetResourceId", request.getTargetResourceId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.InfrastructureTargetVersion.class,
                        GetInfrastructureTargetVersionsResponse.Builder
                                ::infrastructureTargetVersion)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetInfrastructureTargetVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        GetInfrastructureTargetVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public GetKeyStoreResponse getKeyStore(GetKeyStoreRequest request) {

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");

        return clientCall(request, GetKeyStoreResponse::builder)
                .logger(LOG, "getKeyStore")
                .serviceDetails(
                        "Database",
                        "GetKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/GetKeyStore")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.KeyStore.class,
                        GetKeyStoreResponse.Builder::keyStore)
                .handleResponseHeaderString("etag", GetKeyStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetKeyStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMaintenanceRunResponse getMaintenanceRun(GetMaintenanceRunRequest request) {

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");

        return clientCall(request, GetMaintenanceRunResponse::builder)
                .logger(LOG, "getMaintenanceRun")
                .serviceDetails(
                        "Database",
                        "GetMaintenanceRun",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRun/GetMaintenanceRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceRunRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.MaintenanceRun.class,
                        GetMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString("etag", GetMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetMaintenanceRunHistoryResponse getMaintenanceRunHistory(
            GetMaintenanceRunHistoryRequest request) {

        Validate.notBlank(
                request.getMaintenanceRunHistoryId(), "maintenanceRunHistoryId must not be blank");

        return clientCall(request, GetMaintenanceRunHistoryResponse::builder)
                .logger(LOG, "getMaintenanceRunHistory")
                .serviceDetails(
                        "Database",
                        "GetMaintenanceRunHistory",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRunHistory/GetMaintenanceRunHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMaintenanceRunHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRunHistory")
                .appendPathParam(request.getMaintenanceRunHistoryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.MaintenanceRunHistory.class,
                        GetMaintenanceRunHistoryResponse.Builder::maintenanceRunHistory)
                .handleResponseHeaderString("etag", GetMaintenanceRunHistoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMaintenanceRunHistoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetOneoffPatchResponse getOneoffPatch(GetOneoffPatchRequest request) {

        Validate.notBlank(request.getOneoffPatchId(), "oneoffPatchId must not be blank");

        return clientCall(request, GetOneoffPatchResponse::builder)
                .logger(LOG, "getOneoffPatch")
                .serviceDetails(
                        "Database",
                        "GetOneoffPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/GetOneoffPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetOneoffPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .appendPathParam(request.getOneoffPatchId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.OneoffPatch.class,
                        GetOneoffPatchResponse.Builder::oneoffPatch)
                .handleResponseHeaderString("etag", GetOneoffPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetOneoffPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPdbConversionHistoryEntryResponse getPdbConversionHistoryEntry(
            GetPdbConversionHistoryEntryRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getPdbConversionHistoryEntryId(),
                "pdbConversionHistoryEntryId must not be blank");

        return clientCall(request, GetPdbConversionHistoryEntryResponse::builder)
                .logger(LOG, "getPdbConversionHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetPdbConversionHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PdbConversionHistoryEntry/GetPdbConversionHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPdbConversionHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("pdbConversionHistoryEntries")
                .appendPathParam(request.getPdbConversionHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.PdbConversionHistoryEntry.class,
                        GetPdbConversionHistoryEntryResponse.Builder::pdbConversionHistoryEntry)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPdbConversionHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPluggableDatabaseResponse getPluggableDatabase(GetPluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, GetPluggableDatabaseResponse::builder)
                .logger(LOG, "getPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "GetPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/GetPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        GetPluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString("etag", GetPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVmClusterResponse getVmCluster(GetVmClusterRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, GetVmClusterResponse::builder)
                .logger(LOG, "getVmCluster")
                .serviceDetails(
                        "Database",
                        "GetVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/GetVmCluster")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        GetVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString("etag", GetVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVmClusterNetworkResponse getVmClusterNetwork(GetVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, GetVmClusterNetworkResponse::builder)
                .logger(LOG, "getVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "GetVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/GetVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        GetVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString("etag", GetVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVmClusterPatchResponse getVmClusterPatch(GetVmClusterPatchRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(request.getPatchId(), "patchId must not be blank");

        return clientCall(request, GetVmClusterPatchResponse::builder)
                .logger(LOG, "getVmClusterPatch")
                .serviceDetails(
                        "Database",
                        "GetVmClusterPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/GetVmClusterPatch")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patches")
                .appendPathParam(request.getPatchId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.Patch.class,
                        GetVmClusterPatchResponse.Builder::patch)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVmClusterPatchHistoryEntryResponse getVmClusterPatchHistoryEntry(
            GetVmClusterPatchHistoryEntryRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(
                request.getPatchHistoryEntryId(), "patchHistoryEntryId must not be blank");

        return clientCall(request, GetVmClusterPatchHistoryEntryResponse::builder)
                .logger(LOG, "getVmClusterPatchHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetVmClusterPatchHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/GetVmClusterPatchHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterPatchHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patchHistoryEntries")
                .appendPathParam(request.getPatchHistoryEntryId())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.PatchHistoryEntry.class,
                        GetVmClusterPatchHistoryEntryResponse.Builder::patchHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetVmClusterPatchHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVmClusterPatchHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVmClusterUpdateResponse getVmClusterUpdate(GetVmClusterUpdateRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(request.getUpdateId(), "updateId must not be blank");

        return clientCall(request, GetVmClusterUpdateResponse::builder)
                .logger(LOG, "getVmClusterUpdate")
                .serviceDetails(
                        "Database",
                        "GetVmClusterUpdate",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdate/GetVmClusterUpdate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterUpdateRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updates")
                .appendPathParam(request.getUpdateId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterUpdate.class,
                        GetVmClusterUpdateResponse.Builder::vmClusterUpdate)
                .handleResponseHeaderString(
                        "opc-request-id", GetVmClusterUpdateResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetVmClusterUpdateHistoryEntryResponse getVmClusterUpdateHistoryEntry(
            GetVmClusterUpdateHistoryEntryRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        Validate.notBlank(
                request.getUpdateHistoryEntryId(), "updateHistoryEntryId must not be blank");

        return clientCall(request, GetVmClusterUpdateHistoryEntryResponse::builder)
                .logger(LOG, "getVmClusterUpdateHistoryEntry")
                .serviceDetails(
                        "Database",
                        "GetVmClusterUpdateHistoryEntry",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdateHistoryEntry/GetVmClusterUpdateHistoryEntry")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetVmClusterUpdateHistoryEntryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendPathParam(request.getUpdateHistoryEntryId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterUpdateHistoryEntry.class,
                        GetVmClusterUpdateHistoryEntryResponse.Builder::vmClusterUpdateHistoryEntry)
                .handleResponseHeaderString(
                        "etag", GetVmClusterUpdateHistoryEntryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetVmClusterUpdateHistoryEntryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public LaunchAutonomousExadataInfrastructureResponse launchAutonomousExadataInfrastructure(
            LaunchAutonomousExadataInfrastructureRequest request) {
        Objects.requireNonNull(
                request.getLaunchAutonomousExadataInfrastructureDetails(),
                "launchAutonomousExadataInfrastructureDetails is required");

        return clientCall(request, LaunchAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "launchAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "LaunchAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/LaunchAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LaunchAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure.class,
                        LaunchAutonomousExadataInfrastructureResponse.Builder
                                ::autonomousExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", LaunchAutonomousExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        LaunchAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        LaunchAutonomousExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public LaunchDbSystemResponse launchDbSystem(LaunchDbSystemRequest request) {
        Objects.requireNonNull(
                request.getLaunchDbSystemDetails(), "launchDbSystemDetails is required");

        return clientCall(request, LaunchDbSystemResponse::builder)
                .logger(LOG, "launchDbSystem")
                .serviceDetails(
                        "Database",
                        "LaunchDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/LaunchDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LaunchDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        LaunchDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString(
                        "opc-work-request-id", LaunchDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", LaunchDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", LaunchDbSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListApplicationVipsResponse listApplicationVips(ListApplicationVipsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getCloudVmClusterId(), "cloudVmClusterId is required");

        return clientCall(request, ListApplicationVipsResponse::builder)
                .logger(LOG, "listApplicationVips")
                .serviceDetails(
                        "Database",
                        "ListApplicationVips",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ApplicationVipSummary/ListApplicationVips")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListApplicationVipsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("applicationVip")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("cloudVmClusterId", request.getCloudVmClusterId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ApplicationVipSummary.class,
                        ListApplicationVipsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListApplicationVipsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListApplicationVipsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousContainerDatabaseDataguardAssociationsResponse
            listAutonomousContainerDatabaseDataguardAssociations(
                    ListAutonomousContainerDatabaseDataguardAssociationsRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(
                        request,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse::builder)
                .logger(LOG, "listAutonomousContainerDatabaseDataguardAssociations")
                .serviceDetails(
                        "Database",
                        "ListAutonomousContainerDatabaseDataguardAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/ListAutonomousContainerDatabaseDataguardAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(
                        ListAutonomousContainerDatabaseDataguardAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousContainerDatabaseDataguardAssociationsResponse.Builder
                                ::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousContainerDatabaseVersionsResponse listAutonomousContainerDatabaseVersions(
            ListAutonomousContainerDatabaseVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getServiceComponent(), "serviceComponent is required");

        return clientCall(request, ListAutonomousContainerDatabaseVersionsResponse::builder)
                .logger(LOG, "listAutonomousContainerDatabaseVersions")
                .serviceDetails(
                        "Database",
                        "ListAutonomousContainerDatabaseVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseVersionSummary/ListAutonomousContainerDatabaseVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousContainerDatabaseVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabaseVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("serviceComponent", request.getServiceComponent())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousContainerDatabaseVersionSummary
                                .class,
                        ListAutonomousContainerDatabaseVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousContainerDatabaseVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousContainerDatabaseVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousContainerDatabasesResponse listAutonomousContainerDatabases(
            ListAutonomousContainerDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousContainerDatabasesResponse::builder)
                .logger(LOG, "listAutonomousContainerDatabases")
                .serviceDetails(
                        "Database",
                        "ListAutonomousContainerDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/ListAutonomousContainerDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousContainerDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "autonomousExadataInfrastructureId",
                        request.getAutonomousExadataInfrastructureId())
                .appendQueryParam("autonomousVmClusterId", request.getAutonomousVmClusterId())
                .appendEnumQueryParam("infrastructureType", request.getInfrastructureType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam(
                        "serviceLevelAgreementType", request.getServiceLevelAgreementType())
                .appendQueryParam(
                        "cloudAutonomousVmClusterId", request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousContainerDatabaseSummary.class,
                        ListAutonomousContainerDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousContainerDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousContainerDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDatabaseBackupsResponse listAutonomousDatabaseBackups(
            ListAutonomousDatabaseBackupsRequest request) {

        return clientCall(request, ListAutonomousDatabaseBackupsResponse::builder)
                .logger(LOG, "listAutonomousDatabaseBackups")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseBackups",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/ListAutonomousDatabaseBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .appendQueryParam("autonomousDatabaseId", request.getAutonomousDatabaseId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("type", request.getType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackupSummary.class,
                        ListAutonomousDatabaseBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDatabaseBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDatabaseCharacterSetsResponse listAutonomousDatabaseCharacterSets(
            ListAutonomousDatabaseCharacterSetsRequest request) {

        return clientCall(request, ListAutonomousDatabaseCharacterSetsResponse::builder)
                .logger(LOG, "listAutonomousDatabaseCharacterSets")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseCharacterSets",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseCharacterSets/ListAutonomousDatabaseCharacterSets")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseCharacterSetsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseCharacterSets")
                .appendQueryParam("isShared", request.getIsShared())
                .appendQueryParam("isDedicated", request.getIsDedicated())
                .appendEnumQueryParam("characterSetType", request.getCharacterSetType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseCharacterSets.class,
                        ListAutonomousDatabaseCharacterSetsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseCharacterSetsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDatabaseCharacterSetsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDatabaseClonesResponse listAutonomousDatabaseClones(
            ListAutonomousDatabaseClonesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ListAutonomousDatabaseClonesResponse::builder)
                .logger(LOG, "listAutonomousDatabaseClones")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseClones",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ListAutonomousDatabaseClones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseClonesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("clones")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("cloneType", request.getCloneType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseSummary.class,
                        ListAutonomousDatabaseClonesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseClonesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDatabaseClonesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDatabaseDataguardAssociationsResponse
            listAutonomousDatabaseDataguardAssociations(
                    ListAutonomousDatabaseDataguardAssociationsRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ListAutonomousDatabaseDataguardAssociationsResponse::builder)
                .logger(LOG, "listAutonomousDatabaseDataguardAssociations")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseDataguardAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseDataguardAssociation/ListAutonomousDatabaseDataguardAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseDataguardAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("autonomousDatabaseDataguardAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseDataguardAssociation.class,
                        ListAutonomousDatabaseDataguardAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseDataguardAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDatabaseDataguardAssociationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDatabaseRefreshableClonesResponse listAutonomousDatabaseRefreshableClones(
            ListAutonomousDatabaseRefreshableClonesRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ListAutonomousDatabaseRefreshableClonesResponse::builder)
                .logger(LOG, "listAutonomousDatabaseRefreshableClones")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabaseRefreshableClones",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ListAutonomousDatabaseRefreshableClones")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabaseRefreshableClonesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("refreshableClones")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.RefreshableCloneCollection.class,
                        ListAutonomousDatabaseRefreshableClonesResponse.Builder
                                ::refreshableCloneCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDatabaseRefreshableClonesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDatabaseRefreshableClonesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDatabasesResponse listAutonomousDatabases(
            ListAutonomousDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousDatabasesResponse::builder)
                .logger(LOG, "listAutonomousDatabases")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ListAutonomousDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "autonomousContainerDatabaseId", request.getAutonomousContainerDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("infrastructureType", request.getInfrastructureType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("dbWorkload", request.getDbWorkload())
                .appendQueryParam("dbVersion", request.getDbVersion())
                .appendQueryParam("isFreeTier", request.getIsFreeTier())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("isRefreshableClone", request.getIsRefreshableClone())
                .appendQueryParam("isDataGuardEnabled", request.getIsDataGuardEnabled())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDatabaseSummary.class,
                        ListAutonomousDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutonomousDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDbPreviewVersionsResponse listAutonomousDbPreviewVersions(
            ListAutonomousDbPreviewVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousDbPreviewVersionsResponse::builder)
                .logger(LOG, "listAutonomousDbPreviewVersions")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDbPreviewVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDbPreviewVersionSummary/ListAutonomousDbPreviewVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDbPreviewVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDbPreviewVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDbPreviewVersionSummary.class,
                        ListAutonomousDbPreviewVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousDbPreviewVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousDbPreviewVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousDbVersionsResponse listAutonomousDbVersions(
            ListAutonomousDbVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousDbVersionsResponse::builder)
                .logger(LOG, "listAutonomousDbVersions")
                .serviceDetails(
                        "Database",
                        "ListAutonomousDbVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDbVersionSummary/ListAutonomousDbVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousDbVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDbVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("dbWorkload", request.getDbWorkload())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousDbVersionSummary.class,
                        ListAutonomousDbVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutonomousDbVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousDbVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousExadataInfrastructureShapesResponse
            listAutonomousExadataInfrastructureShapes(
                    ListAutonomousExadataInfrastructureShapesRequest request) {
        Objects.requireNonNull(request.getAvailabilityDomain(), "availabilityDomain is required");

        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousExadataInfrastructureShapesResponse::builder)
                .logger(LOG, "listAutonomousExadataInfrastructureShapes")
                .serviceDetails(
                        "Database",
                        "ListAutonomousExadataInfrastructureShapes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructureShapeSummary/ListAutonomousExadataInfrastructureShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousExadataInfrastructureShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructureShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructureShapeSummary
                                .class,
                        ListAutonomousExadataInfrastructureShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousExadataInfrastructureShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousExadataInfrastructureShapesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousExadataInfrastructuresResponse listAutonomousExadataInfrastructures(
            ListAutonomousExadataInfrastructuresRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousExadataInfrastructuresResponse::builder)
                .logger(LOG, "listAutonomousExadataInfrastructures")
                .serviceDetails(
                        "Database",
                        "ListAutonomousExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/ListAutonomousExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousExadataInfrastructuresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructureSummary.class,
                        ListAutonomousExadataInfrastructuresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListAutonomousExadataInfrastructuresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousVirtualMachinesResponse listAutonomousVirtualMachines(
            ListAutonomousVirtualMachinesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId is required");

        return clientCall(request, ListAutonomousVirtualMachinesResponse::builder)
                .logger(LOG, "listAutonomousVirtualMachines")
                .serviceDetails(
                        "Database",
                        "ListAutonomousVirtualMachines",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVirtualMachine/ListAutonomousVirtualMachines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousVirtualMachinesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVirtualMachines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("autonomousVmClusterId", request.getAutonomousVmClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousVirtualMachineSummary.class,
                        ListAutonomousVirtualMachinesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListAutonomousVirtualMachinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousVirtualMachinesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListAutonomousVmClustersResponse listAutonomousVmClusters(
            ListAutonomousVmClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListAutonomousVmClustersResponse::builder)
                .logger(LOG, "listAutonomousVmClusters")
                .serviceDetails(
                        "Database",
                        "ListAutonomousVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/ListAutonomousVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAutonomousVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousVmClusterSummary.class,
                        ListAutonomousVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListAutonomousVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAutonomousVmClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBackupDestinationResponse listBackupDestination(
            ListBackupDestinationRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListBackupDestinationResponse::builder)
                .logger(LOG, "listBackupDestination")
                .serviceDetails(
                        "Database",
                        "ListBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestinationSummary/ListBackupDestination")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("type", request.getType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.BackupDestinationSummary.class,
                        ListBackupDestinationResponse.Builder::items)
                .handleResponseHeaderString("etag", ListBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupDestinationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupDestinationResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBackupsResponse listBackups(ListBackupsRequest request) {

        return clientCall(request, ListBackupsResponse::builder)
                .logger(LOG, "listBackups")
                .serviceDetails(
                        "Database",
                        "ListBackups",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Backup/ListBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBackupsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backups")
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.BackupSummary.class,
                        ListBackupsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudAutonomousVmClusterAcdResourceUsageResponse
            listCloudAutonomousVmClusterAcdResourceUsage(
                    ListCloudAutonomousVmClusterAcdResourceUsageRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, ListCloudAutonomousVmClusterAcdResourceUsageResponse::builder)
                .logger(LOG, "listCloudAutonomousVmClusterAcdResourceUsage")
                .serviceDetails(
                        "Database",
                        "ListCloudAutonomousVmClusterAcdResourceUsage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/ListCloudAutonomousVmClusterAcdResourceUsage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudAutonomousVmClusterAcdResourceUsageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("acdResourceUsage")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousContainerDatabaseResourceUsage
                                .class,
                        ListCloudAutonomousVmClusterAcdResourceUsageResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudAutonomousVmClusterAcdResourceUsageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCloudAutonomousVmClusterAcdResourceUsageResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudAutonomousVmClustersResponse listCloudAutonomousVmClusters(
            ListCloudAutonomousVmClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCloudAutonomousVmClustersResponse::builder)
                .logger(LOG, "listCloudAutonomousVmClusters")
                .serviceDetails(
                        "Database",
                        "ListCloudAutonomousVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/ListCloudAutonomousVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudAutonomousVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "cloudExadataInfrastructureId", request.getCloudExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.CloudAutonomousVmClusterSummary.class,
                        ListCloudAutonomousVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudAutonomousVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudAutonomousVmClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudExadataInfrastructuresResponse listCloudExadataInfrastructures(
            ListCloudExadataInfrastructuresRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCloudExadataInfrastructuresResponse::builder)
                .logger(LOG, "listCloudExadataInfrastructures")
                .serviceDetails(
                        "Database",
                        "ListCloudExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/ListCloudExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudExadataInfrastructuresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.CloudExadataInfrastructureSummary.class,
                        ListCloudExadataInfrastructuresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCloudExadataInfrastructuresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudVmClusterUpdateHistoryEntriesResponse listCloudVmClusterUpdateHistoryEntries(
            ListCloudVmClusterUpdateHistoryEntriesRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, ListCloudVmClusterUpdateHistoryEntriesResponse::builder)
                .logger(LOG, "listCloudVmClusterUpdateHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListCloudVmClusterUpdateHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/UpdateHistoryEntry/ListCloudVmClusterUpdateHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudVmClusterUpdateHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.UpdateHistoryEntrySummary.class,
                        ListCloudVmClusterUpdateHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListCloudVmClusterUpdateHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListCloudVmClusterUpdateHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudVmClusterUpdatesResponse listCloudVmClusterUpdates(
            ListCloudVmClusterUpdatesRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, ListCloudVmClusterUpdatesResponse::builder)
                .logger(LOG, "listCloudVmClusterUpdates")
                .serviceDetails(
                        "Database",
                        "ListCloudVmClusterUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Update/ListCloudVmClusterUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudVmClusterUpdatesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("updates")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.UpdateSummary.class,
                        ListCloudVmClusterUpdatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudVmClusterUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudVmClusterUpdatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCloudVmClustersResponse listCloudVmClusters(ListCloudVmClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListCloudVmClustersResponse::builder)
                .logger(LOG, "listCloudVmClusters")
                .serviceDetails(
                        "Database",
                        "ListCloudVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/ListCloudVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCloudVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "cloudExadataInfrastructureId", request.getCloudExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.CloudVmClusterSummary.class,
                        ListCloudVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListCloudVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCloudVmClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListConsoleConnectionsResponse listConsoleConnections(
            ListConsoleConnectionsRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        return clientCall(request, ListConsoleConnectionsResponse::builder)
                .logger(LOG, "listConsoleConnections")
                .serviceDetails(
                        "Database",
                        "ListConsoleConnections",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/ListConsoleConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConsoleConnectionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.ConsoleConnectionSummary.class,
                        ListConsoleConnectionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListConsoleConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConsoleConnectionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListContainerDatabasePatchesResponse listContainerDatabasePatches(
            ListContainerDatabasePatchesRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListContainerDatabasePatchesResponse::builder)
                .logger(LOG, "listContainerDatabasePatches")
                .serviceDetails(
                        "Database",
                        "ListContainerDatabasePatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousPatch/ListContainerDatabasePatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListContainerDatabasePatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.AutonomousPatchSummary.class,
                        ListContainerDatabasePatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListContainerDatabasePatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListContainerDatabasePatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDataGuardAssociationsResponse listDataGuardAssociations(
            ListDataGuardAssociationsRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, ListDataGuardAssociationsResponse::builder)
                .logger(LOG, "listDataGuardAssociations")
                .serviceDetails(
                        "Database",
                        "ListDataGuardAssociations",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/ListDataGuardAssociations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDataGuardAssociationsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DataGuardAssociationSummary.class,
                        ListDataGuardAssociationsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDataGuardAssociationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDataGuardAssociationsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDatabaseSoftwareImagesResponse listDatabaseSoftwareImages(
            ListDatabaseSoftwareImagesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseSoftwareImagesResponse::builder)
                .logger(LOG, "listDatabaseSoftwareImages")
                .serviceDetails(
                        "Database",
                        "ListDatabaseSoftwareImages",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/ListDatabaseSoftwareImages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseSoftwareImagesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("imageType", request.getImageType())
                .appendEnumQueryParam("imageShapeFamily", request.getImageShapeFamily())
                .appendQueryParam("isUpgradeSupported", request.getIsUpgradeSupported())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DatabaseSoftwareImageSummary.class,
                        ListDatabaseSoftwareImagesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseSoftwareImagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseSoftwareImagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDatabaseUpgradeHistoryEntriesResponse listDatabaseUpgradeHistoryEntries(
            ListDatabaseUpgradeHistoryEntriesRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, ListDatabaseUpgradeHistoryEntriesResponse::builder)
                .logger(LOG, "listDatabaseUpgradeHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDatabaseUpgradeHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ListDatabaseUpgradeHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseUpgradeHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("upgradeHistoryEntries")
                .appendEnumQueryParam("upgradeAction", request.getUpgradeAction())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DatabaseUpgradeHistoryEntrySummary.class,
                        ListDatabaseUpgradeHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDatabaseUpgradeHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDatabaseUpgradeHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabasesResponse::builder)
                .logger(LOG, "listDatabases")
                .serviceDetails(
                        "Database",
                        "ListDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ListDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbHomeId", request.getDbHomeId())
                .appendQueryParam("systemId", request.getSystemId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("dbName", request.getDbName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DatabaseSummary.class,
                        ListDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbHomePatchHistoryEntriesResponse listDbHomePatchHistoryEntries(
            ListDbHomePatchHistoryEntriesRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, ListDbHomePatchHistoryEntriesResponse::builder)
                .logger(LOG, "listDbHomePatchHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDbHomePatchHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/ListDbHomePatchHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbHomePatchHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patchHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchHistoryEntrySummary.class,
                        ListDbHomePatchHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbHomePatchHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbHomePatchHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbHomePatchesResponse listDbHomePatches(ListDbHomePatchesRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");

        return clientCall(request, ListDbHomePatchesResponse::builder)
                .logger(LOG, "listDbHomePatches")
                .serviceDetails(
                        "Database",
                        "ListDbHomePatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/ListDbHomePatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbHomePatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchSummary.class,
                        ListDbHomePatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbHomePatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbHomePatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbHomesResponse listDbHomes(ListDbHomesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbHomesResponse::builder)
                .logger(LOG, "listDbHomes")
                .serviceDetails(
                        "Database",
                        "ListDbHomes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/ListDbHomes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbHomesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("vmClusterId", request.getVmClusterId())
                .appendQueryParam("backupId", request.getBackupId())
                .appendQueryParam("dbVersion", request.getDbVersion())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbHomeSummary.class,
                        ListDbHomesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbHomesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbHomesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbNodesResponse listDbNodes(ListDbNodesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbNodesResponse::builder)
                .logger(LOG, "listDbNodes")
                .serviceDetails(
                        "Database",
                        "ListDbNodes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/ListDbNodes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbNodesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendQueryParam("vmClusterId", request.getVmClusterId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("dbServerId", request.getDbServerId())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbNodeSummary.class,
                        ListDbNodesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbNodesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbNodesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbServersResponse listDbServers(ListDbServersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(
                request.getExadataInfrastructureId(), "exadataInfrastructureId is required");

        return clientCall(request, ListDbServersResponse::builder)
                .logger(LOG, "listDbServers")
                .serviceDetails(
                        "Database",
                        "ListDbServers",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbServer/ListDbServers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbServersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbServers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbServerSummary.class,
                        ListDbServersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbServersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbServersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemComputePerformancesResponse listDbSystemComputePerformances(
            ListDbSystemComputePerformancesRequest request) {

        return clientCall(request, ListDbSystemComputePerformancesResponse::builder)
                .logger(LOG, "listDbSystemComputePerformances")
                .serviceDetails(
                        "Database",
                        "ListDbSystemComputePerformances",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/ListDbSystemComputePerformances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemComputePerformancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemComputePerformance")
                .appendQueryParam("dbSystemShape", request.getDbSystemShape())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemComputePerformanceSummary.class,
                        ListDbSystemComputePerformancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemComputePerformancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemComputePerformancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemPatchHistoryEntriesResponse listDbSystemPatchHistoryEntries(
            ListDbSystemPatchHistoryEntriesRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ListDbSystemPatchHistoryEntriesResponse::builder)
                .logger(LOG, "listDbSystemPatchHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDbSystemPatchHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/ListDbSystemPatchHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemPatchHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patchHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchHistoryEntrySummary.class,
                        ListDbSystemPatchHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemPatchHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemPatchHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemPatchesResponse listDbSystemPatches(ListDbSystemPatchesRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ListDbSystemPatchesResponse::builder)
                .logger(LOG, "listDbSystemPatches")
                .serviceDetails(
                        "Database",
                        "ListDbSystemPatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/ListDbSystemPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemPatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchSummary.class,
                        ListDbSystemPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemPatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemShapesResponse listDbSystemShapes(ListDbSystemShapesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbSystemShapesResponse::builder)
                .logger(LOG, "listDbSystemShapes")
                .serviceDetails(
                        "Database",
                        "ListDbSystemShapes",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemShapeSummary/ListDbSystemShapes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemShapesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemShapes")
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemShapeSummary.class,
                        ListDbSystemShapesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemShapesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemShapesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemStoragePerformancesResponse listDbSystemStoragePerformances(
            ListDbSystemStoragePerformancesRequest request) {
        Objects.requireNonNull(request.getStorageManagement(), "storageManagement is required");

        return clientCall(request, ListDbSystemStoragePerformancesResponse::builder)
                .logger(LOG, "listDbSystemStoragePerformances")
                .serviceDetails(
                        "Database",
                        "ListDbSystemStoragePerformances",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/ListDbSystemStoragePerformances")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemStoragePerformancesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemStoragePerformance")
                .appendEnumQueryParam("storageManagement", request.getStorageManagement())
                .appendQueryParam("shapeType", request.getShapeType())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemStoragePerformanceSummary.class,
                        ListDbSystemStoragePerformancesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemStoragePerformancesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemStoragePerformancesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemUpgradeHistoryEntriesResponse listDbSystemUpgradeHistoryEntries(
            ListDbSystemUpgradeHistoryEntriesRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, ListDbSystemUpgradeHistoryEntriesResponse::builder)
                .logger(LOG, "listDbSystemUpgradeHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListDbSystemUpgradeHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystemUpgradeHistoryEntry/ListDbSystemUpgradeHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemUpgradeHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("upgradeHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("upgradeAction", request.getUpgradeAction())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.class,
                        ListDbSystemUpgradeHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDbSystemUpgradeHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDbSystemUpgradeHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbSystemsResponse listDbSystems(ListDbSystemsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbSystemsResponse::builder)
                .logger(LOG, "listDbSystems")
                .serviceDetails(
                        "Database",
                        "ListDbSystems",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/ListDbSystems")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbSystemsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("backupId", request.getBackupId())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbSystemSummary.class,
                        ListDbSystemsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbSystemsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbSystemsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDbVersionsResponse listDbVersions(ListDbVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDbVersionsResponse::builder)
                .logger(LOG, "listDbVersions")
                .serviceDetails(
                        "Database",
                        "ListDbVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbVersionSummary/ListDbVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDbVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("dbSystemShape", request.getDbSystemShape())
                .appendQueryParam("dbSystemId", request.getDbSystemId())
                .appendEnumQueryParam("storageManagement", request.getStorageManagement())
                .appendQueryParam("isUpgradeSupported", request.getIsUpgradeSupported())
                .appendQueryParam(
                        "isDatabaseSoftwareImageSupported",
                        request.getIsDatabaseSoftwareImageSupported())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.DbVersionSummary.class,
                        ListDbVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListDbVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDbVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExadataInfrastructuresResponse listExadataInfrastructures(
            ListExadataInfrastructuresRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExadataInfrastructuresResponse::builder)
                .logger(LOG, "listExadataInfrastructures")
                .serviceDetails(
                        "Database",
                        "ListExadataInfrastructures",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/ListExadataInfrastructures")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExadataInfrastructuresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendListQueryParam(
                        "excludedFields",
                        request.getExcludedFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExadataInfrastructureSummary.class,
                        ListExadataInfrastructuresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListExadataInfrastructuresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListExadataInfrastructuresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalContainerDatabasesResponse listExternalContainerDatabases(
            ListExternalContainerDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalContainerDatabasesResponse::builder)
                .logger(LOG, "listExternalContainerDatabases")
                .serviceDetails(
                        "Database",
                        "ListExternalContainerDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/ListExternalContainerDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalContainerDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalContainerDatabaseSummary.class,
                        ListExternalContainerDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalContainerDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalContainerDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalDatabaseConnectorsResponse listExternalDatabaseConnectors(
            ListExternalDatabaseConnectorsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        Objects.requireNonNull(request.getExternalDatabaseId(), "externalDatabaseId is required");

        return clientCall(request, ListExternalDatabaseConnectorsResponse::builder)
                .logger(LOG, "listExternalDatabaseConnectors")
                .serviceDetails(
                        "Database",
                        "ListExternalDatabaseConnectors",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/ListExternalDatabaseConnectors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalDatabaseConnectorsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("externalDatabaseId", request.getExternalDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalDatabaseConnectorSummary.class,
                        ListExternalDatabaseConnectorsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalDatabaseConnectorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalDatabaseConnectorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalNonContainerDatabasesResponse listExternalNonContainerDatabases(
            ListExternalNonContainerDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalNonContainerDatabasesResponse::builder)
                .logger(LOG, "listExternalNonContainerDatabases")
                .serviceDetails(
                        "Database",
                        "ListExternalNonContainerDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/ListExternalNonContainerDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalNonContainerDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabaseSummary.class,
                        ListExternalNonContainerDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalNonContainerDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalNonContainerDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListExternalPluggableDatabasesResponse listExternalPluggableDatabases(
            ListExternalPluggableDatabasesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListExternalPluggableDatabasesResponse::builder)
                .logger(LOG, "listExternalPluggableDatabases")
                .serviceDetails(
                        "Database",
                        "ListExternalPluggableDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/ListExternalPluggableDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListExternalPluggableDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam(
                        "externalContainerDatabaseId", request.getExternalContainerDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.ExternalPluggableDatabaseSummary.class,
                        ListExternalPluggableDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListExternalPluggableDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListExternalPluggableDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListFlexComponentsResponse listFlexComponents(ListFlexComponentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListFlexComponentsResponse::builder)
                .logger(LOG, "listFlexComponents")
                .serviceDetails(
                        "Database",
                        "ListFlexComponents",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/FlexComponentCollection/ListFlexComponents")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListFlexComponentsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystemShapes")
                .appendPathParam("flexComponents")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBody(
                        com.oracle.bmc.database.model.FlexComponentCollection.class,
                        ListFlexComponentsResponse.Builder::flexComponentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListFlexComponentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListFlexComponentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListGiVersionsResponse listGiVersions(ListGiVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListGiVersionsResponse::builder)
                .logger(LOG, "listGiVersions")
                .serviceDetails(
                        "Database",
                        "ListGiVersions",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/GiVersionSummary/ListGiVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListGiVersionsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("giVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("shape", request.getShape())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.GiVersionSummary.class,
                        ListGiVersionsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListGiVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListGiVersionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListKeyStoresResponse listKeyStores(ListKeyStoresRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListKeyStoresResponse::builder)
                .logger(LOG, "listKeyStores")
                .serviceDetails(
                        "Database",
                        "ListKeyStores",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStoreSummary/ListKeyStores")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListKeyStoresRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.KeyStoreSummary.class,
                        ListKeyStoresResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListKeyStoresResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListKeyStoresResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMaintenanceRunHistoryResponse listMaintenanceRunHistory(
            ListMaintenanceRunHistoryRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceRunHistoryResponse::builder)
                .logger(LOG, "listMaintenanceRunHistory")
                .serviceDetails(
                        "Database",
                        "ListMaintenanceRunHistory",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRunHistory/ListMaintenanceRunHistory")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceRunHistoryRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRunHistory")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetResourceId", request.getTargetResourceId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .appendEnumQueryParam("maintenanceType", request.getMaintenanceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("maintenanceSubtype", request.getMaintenanceSubtype())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.MaintenanceRunHistorySummary.class,
                        ListMaintenanceRunHistoryResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceRunHistoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceRunHistoryResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMaintenanceRunsResponse listMaintenanceRuns(ListMaintenanceRunsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListMaintenanceRunsResponse::builder)
                .logger(LOG, "listMaintenanceRuns")
                .serviceDetails(
                        "Database",
                        "ListMaintenanceRuns",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRun/ListMaintenanceRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMaintenanceRunsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRuns")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("targetResourceId", request.getTargetResourceId())
                .appendEnumQueryParam("targetResourceType", request.getTargetResourceType())
                .appendEnumQueryParam("maintenanceType", request.getMaintenanceType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("availabilityDomain", request.getAvailabilityDomain())
                .appendEnumQueryParam("maintenanceSubtype", request.getMaintenanceSubtype())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.MaintenanceRunSummary.class,
                        ListMaintenanceRunsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListMaintenanceRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMaintenanceRunsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListOneoffPatchesResponse listOneoffPatches(ListOneoffPatchesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListOneoffPatchesResponse::builder)
                .logger(LOG, "listOneoffPatches")
                .serviceDetails(
                        "Database",
                        "ListOneoffPatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/ListOneoffPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListOneoffPatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.OneoffPatchSummary.class,
                        ListOneoffPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListOneoffPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListOneoffPatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPdbConversionHistoryEntriesResponse listPdbConversionHistoryEntries(
            ListPdbConversionHistoryEntriesRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, ListPdbConversionHistoryEntriesResponse::builder)
                .logger(LOG, "listPdbConversionHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListPdbConversionHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ListPdbConversionHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPdbConversionHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("pdbConversionHistoryEntries")
                .appendEnumQueryParam("pdbConversionAction", request.getPdbConversionAction())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.PdbConversionHistoryEntrySummary.class,
                        ListPdbConversionHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPdbConversionHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListPdbConversionHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPluggableDatabasesResponse listPluggableDatabases(
            ListPluggableDatabasesRequest request) {

        return clientCall(request, ListPluggableDatabasesResponse::builder)
                .logger(LOG, "listPluggableDatabases")
                .serviceDetails(
                        "Database",
                        "ListPluggableDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/ListPluggableDatabases")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPluggableDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("databaseId", request.getDatabaseId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("pdbName", request.getPdbName())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PluggableDatabaseSummary.class,
                        ListPluggableDatabasesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListPluggableDatabasesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPluggableDatabasesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClusterNetworksResponse listVmClusterNetworks(
            ListVmClusterNetworksRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVmClusterNetworksResponse::builder)
                .logger(LOG, "listVmClusterNetworks")
                .serviceDetails(
                        "Database",
                        "ListVmClusterNetworks",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/ListVmClusterNetworks")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterNetworksRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterNetworkSummary.class,
                        ListVmClusterNetworksResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterNetworksResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterNetworksResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClusterPatchHistoryEntriesResponse listVmClusterPatchHistoryEntries(
            ListVmClusterPatchHistoryEntriesRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterPatchHistoryEntriesResponse::builder)
                .logger(LOG, "listVmClusterPatchHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListVmClusterPatchHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PatchHistoryEntry/ListVmClusterPatchHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterPatchHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patchHistoryEntries")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchHistoryEntrySummary.class,
                        ListVmClusterPatchHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVmClusterPatchHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVmClusterPatchHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClusterPatchesResponse listVmClusterPatches(ListVmClusterPatchesRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterPatchesResponse::builder)
                .logger(LOG, "listVmClusterPatches")
                .serviceDetails(
                        "Database",
                        "ListVmClusterPatches",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Patch/ListVmClusterPatches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterPatchesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("patches")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .handleBodyList(
                        com.oracle.bmc.database.model.PatchSummary.class,
                        ListVmClusterPatchesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterPatchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterPatchesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClusterUpdateHistoryEntriesResponse listVmClusterUpdateHistoryEntries(
            ListVmClusterUpdateHistoryEntriesRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterUpdateHistoryEntriesResponse::builder)
                .logger(LOG, "listVmClusterUpdateHistoryEntries")
                .serviceDetails(
                        "Database",
                        "ListVmClusterUpdateHistoryEntries",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdateHistoryEntry/ListVmClusterUpdateHistoryEntries")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterUpdateHistoryEntriesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updateHistoryEntries")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterUpdateHistoryEntrySummary.class,
                        ListVmClusterUpdateHistoryEntriesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListVmClusterUpdateHistoryEntriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListVmClusterUpdateHistoryEntriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClusterUpdatesResponse listVmClusterUpdates(ListVmClusterUpdatesRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, ListVmClusterUpdatesResponse::builder)
                .logger(LOG, "listVmClusterUpdates")
                .serviceDetails(
                        "Database",
                        "ListVmClusterUpdates",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterUpdate/ListVmClusterUpdates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClusterUpdatesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("updates")
                .appendEnumQueryParam("updateType", request.getUpdateType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterUpdateSummary.class,
                        ListVmClusterUpdatesResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClusterUpdatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClusterUpdatesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListVmClustersResponse listVmClusters(ListVmClustersRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListVmClustersResponse::builder)
                .logger(LOG, "listVmClusters")
                .serviceDetails(
                        "Database",
                        "ListVmClusters",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/ListVmClusters")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListVmClustersRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("exadataInfrastructureId", request.getExadataInfrastructureId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.database.model.VmClusterSummary.class,
                        ListVmClustersResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListVmClustersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListVmClustersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public LocalClonePluggableDatabaseResponse localClonePluggableDatabase(
            LocalClonePluggableDatabaseRequest request) {
        Objects.requireNonNull(
                request.getLocalClonePluggableDatabaseDetails(),
                "localClonePluggableDatabaseDetails is required");

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, LocalClonePluggableDatabaseResponse::builder)
                .logger(LOG, "localClonePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "LocalClonePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/LocalClonePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LocalClonePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("localClone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        LocalClonePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        LocalClonePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", LocalClonePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", LocalClonePluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public MigrateExadataDbSystemResourceModelResponse migrateExadataDbSystemResourceModel(
            MigrateExadataDbSystemResourceModelRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, MigrateExadataDbSystemResourceModelResponse::builder)
                .logger(LOG, "migrateExadataDbSystemResourceModel")
                .serviceDetails(
                        "Database",
                        "MigrateExadataDbSystemResourceModel",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/MigrateExadataDbSystemResourceModel")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MigrateExadataDbSystemResourceModelRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("migration")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.ExadataDbSystemMigration.class,
                        MigrateExadataDbSystemResourceModelResponse.Builder
                                ::exadataDbSystemMigration)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        MigrateExadataDbSystemResourceModelResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        MigrateExadataDbSystemResourceModelResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", MigrateExadataDbSystemResourceModelResponse.Builder::etag)
                .callSync();
    }

    @Override
    public MigrateVaultKeyResponse migrateVaultKey(MigrateVaultKeyRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getMigrateVaultKeyDetails(), "migrateVaultKeyDetails is required");

        return clientCall(request, MigrateVaultKeyResponse::builder)
                .logger(LOG, "migrateVaultKey")
                .serviceDetails(
                        "Database",
                        "MigrateVaultKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/MigrateVaultKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MigrateVaultKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("migrateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        MigrateVaultKeyResponse.Builder::database)
                .handleResponseHeaderString("etag", MigrateVaultKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", MigrateVaultKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MigrateVaultKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ModifyDatabaseManagementResponse modifyDatabaseManagement(
            ModifyDatabaseManagementRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyDatabaseManagementDetails(),
                "modifyDatabaseManagementDetails is required");

        return clientCall(request, ModifyDatabaseManagementResponse::builder)
                .logger(LOG, "modifyDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "ModifyDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/ModifyDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        ModifyDatabaseManagementResponse.Builder::database)
                .handleResponseHeaderString("etag", ModifyDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ModifyDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ModifyPluggableDatabaseManagementResponse modifyPluggableDatabaseManagement(
            ModifyPluggableDatabaseManagementRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getModifyPluggableDatabaseManagementDetails(),
                "modifyPluggableDatabaseManagementDetails is required");

        return clientCall(request, ModifyPluggableDatabaseManagementResponse::builder)
                .logger(LOG, "modifyPluggableDatabaseManagement")
                .serviceDetails(
                        "Database",
                        "ModifyPluggableDatabaseManagement",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/ModifyPluggableDatabaseManagement")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ModifyPluggableDatabaseManagementRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("modifyPluggableDatabaseManagement")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        ModifyPluggableDatabaseManagementResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "etag", ModifyPluggableDatabaseManagementResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ModifyPluggableDatabaseManagementResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ModifyPluggableDatabaseManagementResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RegisterAutonomousDatabaseDataSafeResponse registerAutonomousDatabaseDataSafe(
            RegisterAutonomousDatabaseDataSafeRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, RegisterAutonomousDatabaseDataSafeResponse::builder)
                .logger(LOG, "registerAutonomousDatabaseDataSafe")
                .serviceDetails(
                        "Database",
                        "RegisterAutonomousDatabaseDataSafe",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RegisterAutonomousDatabaseDataSafe")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RegisterAutonomousDatabaseDataSafeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("registerDataSafe")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RegisterAutonomousDatabaseDataSafeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RegisterAutonomousDatabaseDataSafeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ReinstateAutonomousContainerDatabaseDataguardAssociationResponse
            reinstateAutonomousContainerDatabaseDataguardAssociation(
                    ReinstateAutonomousContainerDatabaseDataguardAssociationRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "reinstateAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "ReinstateAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/ReinstateAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        ReinstateAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("reinstate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReinstateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public ReinstateDataGuardAssociationResponse reinstateDataGuardAssociation(
            ReinstateDataGuardAssociationRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getReinstateDataGuardAssociationDetails(),
                "reinstateDataGuardAssociationDetails is required");

        return clientCall(request, ReinstateDataGuardAssociationResponse::builder)
                .logger(LOG, "reinstateDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "ReinstateDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/ReinstateDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReinstateDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("reinstate")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        ReinstateDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ReinstateDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", ReinstateDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ReinstateDataGuardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoteClonePluggableDatabaseResponse remoteClonePluggableDatabase(
            RemoteClonePluggableDatabaseRequest request) {
        Objects.requireNonNull(
                request.getRemoteClonePluggableDatabaseDetails(),
                "remoteClonePluggableDatabaseDetails is required");

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, RemoteClonePluggableDatabaseResponse::builder)
                .logger(LOG, "remoteClonePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "RemoteClonePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/RemoteClonePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoteClonePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("remoteClone")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        RemoteClonePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoteClonePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", RemoteClonePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoteClonePluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveVirtualMachineFromCloudVmClusterResponse removeVirtualMachineFromCloudVmCluster(
            RemoveVirtualMachineFromCloudVmClusterRequest request) {
        Objects.requireNonNull(
                request.getRemoveVirtualMachineFromCloudVmClusterDetails(),
                "removeVirtualMachineFromCloudVmClusterDetails is required");

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");

        return clientCall(request, RemoveVirtualMachineFromCloudVmClusterResponse::builder)
                .logger(LOG, "removeVirtualMachineFromCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "RemoveVirtualMachineFromCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/RemoveVirtualMachineFromCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveVirtualMachineFromCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("removeVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        RemoveVirtualMachineFromCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveVirtualMachineFromCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveVirtualMachineFromCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveVirtualMachineFromCloudVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveVirtualMachineFromVmClusterResponse removeVirtualMachineFromVmCluster(
            RemoveVirtualMachineFromVmClusterRequest request) {
        Objects.requireNonNull(
                request.getRemoveVirtualMachineFromVmClusterDetails(),
                "removeVirtualMachineFromVmClusterDetails is required");

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");

        return clientCall(request, RemoveVirtualMachineFromVmClusterResponse::builder)
                .logger(LOG, "removeVirtualMachineFromVmCluster")
                .serviceDetails(
                        "Database",
                        "RemoveVirtualMachineFromVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/RemoveVirtualMachineFromVmCluster")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveVirtualMachineFromVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("removeVirtualMachine")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        RemoveVirtualMachineFromVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveVirtualMachineFromVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveVirtualMachineFromVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RemoveVirtualMachineFromVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ResizeVmClusterNetworkResponse resizeVmClusterNetwork(
            ResizeVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getResizeVmClusterNetworkDetails(),
                "resizeVmClusterNetworkDetails is required");

        return clientCall(request, ResizeVmClusterNetworkResponse::builder)
                .logger(LOG, "resizeVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "ResizeVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/ResizeVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResizeVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("resize")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        ResizeVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ResizeVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", ResizeVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ResizeVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RestartAutonomousContainerDatabaseResponse restartAutonomousContainerDatabase(
            RestartAutonomousContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, RestartAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "restartAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "RestartAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/RestartAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        RestartAutonomousContainerDatabaseResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", RestartAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RestartAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RestartAutonomousDatabaseResponse restartAutonomousDatabase(
            RestartAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, RestartAutonomousDatabaseResponse::builder)
                .logger(LOG, "restartAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "RestartAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RestartAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestartAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restart")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        RestartAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", RestartAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestartAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestartAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RestoreAutonomousDatabaseResponse restoreAutonomousDatabase(
            RestoreAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getRestoreAutonomousDatabaseDetails(),
                "restoreAutonomousDatabaseDetails is required");

        return clientCall(request, RestoreAutonomousDatabaseResponse::builder)
                .logger(LOG, "restoreAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "RestoreAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RestoreAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        RestoreAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", RestoreAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RestoreAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public RestoreDatabaseResponse restoreDatabase(RestoreDatabaseRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getRestoreDatabaseDetails(), "restoreDatabaseDetails is required");

        return clientCall(request, RestoreDatabaseResponse::builder)
                .logger(LOG, "restoreDatabase")
                .serviceDetails(
                        "Database",
                        "RestoreDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/RestoreDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        RestoreDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", RestoreDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateAutonomousContainerDatabaseEncryptionKeyResponse
            rotateAutonomousContainerDatabaseEncryptionKey(
                    RotateAutonomousContainerDatabaseEncryptionKeyRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, RotateAutonomousContainerDatabaseEncryptionKeyResponse::builder)
                .logger(LOG, "rotateAutonomousContainerDatabaseEncryptionKey")
                .serviceDetails(
                        "Database",
                        "RotateAutonomousContainerDatabaseEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/RotateAutonomousContainerDatabaseEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateAutonomousContainerDatabaseEncryptionKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag",
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateAutonomousContainerDatabaseEncryptionKeyResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public RotateAutonomousDatabaseEncryptionKeyResponse rotateAutonomousDatabaseEncryptionKey(
            RotateAutonomousDatabaseEncryptionKeyRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, RotateAutonomousDatabaseEncryptionKeyResponse::builder)
                .logger(LOG, "rotateAutonomousDatabaseEncryptionKey")
                .serviceDetails(
                        "Database",
                        "RotateAutonomousDatabaseEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/RotateAutonomousDatabaseEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateAutonomousDatabaseEncryptionKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        RotateAutonomousDatabaseEncryptionKeyResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", RotateAutonomousDatabaseEncryptionKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateAutonomousDatabaseEncryptionKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateAutonomousDatabaseEncryptionKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateAutonomousVmClusterOrdsCertsResponse rotateAutonomousVmClusterOrdsCerts(
            RotateAutonomousVmClusterOrdsCertsRequest request) {
        Objects.requireNonNull(
                request.getRotateAutonomousVmClusterOrdsCertsDetails(),
                "rotateAutonomousVmClusterOrdsCertsDetails is required");

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, RotateAutonomousVmClusterOrdsCertsResponse::builder)
                .logger(LOG, "rotateAutonomousVmClusterOrdsCerts")
                .serviceDetails(
                        "Database",
                        "RotateAutonomousVmClusterOrdsCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/RotateAutonomousVmClusterOrdsCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateAutonomousVmClusterOrdsCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("rotateOrdsCerts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateAutonomousVmClusterOrdsCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateAutonomousVmClusterOrdsCertsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateAutonomousVmClusterSslCertsResponse rotateAutonomousVmClusterSslCerts(
            RotateAutonomousVmClusterSslCertsRequest request) {
        Objects.requireNonNull(
                request.getRotateAutonomousVmClusterSslCertsDetails(),
                "rotateAutonomousVmClusterSslCertsDetails is required");

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");

        return clientCall(request, RotateAutonomousVmClusterSslCertsResponse::builder)
                .logger(LOG, "rotateAutonomousVmClusterSslCerts")
                .serviceDetails(
                        "Database",
                        "RotateAutonomousVmClusterSslCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/RotateAutonomousVmClusterSslCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateAutonomousVmClusterSslCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("rotateSslCerts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateAutonomousVmClusterSslCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateAutonomousVmClusterSslCertsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateCloudAutonomousVmClusterOrdsCertsResponse rotateCloudAutonomousVmClusterOrdsCerts(
            RotateCloudAutonomousVmClusterOrdsCertsRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, RotateCloudAutonomousVmClusterOrdsCertsResponse::builder)
                .logger(LOG, "rotateCloudAutonomousVmClusterOrdsCerts")
                .serviceDetails(
                        "Database",
                        "RotateCloudAutonomousVmClusterOrdsCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/RotateCloudAutonomousVmClusterOrdsCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateCloudAutonomousVmClusterOrdsCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("rotateOrdsCerts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateCloudAutonomousVmClusterOrdsCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateCloudAutonomousVmClusterOrdsCertsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateCloudAutonomousVmClusterSslCertsResponse rotateCloudAutonomousVmClusterSslCerts(
            RotateCloudAutonomousVmClusterSslCertsRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");

        return clientCall(request, RotateCloudAutonomousVmClusterSslCertsResponse::builder)
                .logger(LOG, "rotateCloudAutonomousVmClusterSslCerts")
                .serviceDetails(
                        "Database",
                        "RotateCloudAutonomousVmClusterSslCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/RotateCloudAutonomousVmClusterSslCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateCloudAutonomousVmClusterSslCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .appendPathParam("actions")
                .appendPathParam("rotateSslCerts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotateCloudAutonomousVmClusterSslCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotateCloudAutonomousVmClusterSslCertsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateOrdsCertsResponse rotateOrdsCerts(RotateOrdsCertsRequest request) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, RotateOrdsCertsResponse::builder)
                .logger(LOG, "rotateOrdsCerts")
                .serviceDetails(
                        "Database",
                        "RotateOrdsCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/RotateOrdsCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateOrdsCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("rotateOrdsCerts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateOrdsCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateOrdsCertsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotatePluggableDatabaseEncryptionKeyResponse rotatePluggableDatabaseEncryptionKey(
            RotatePluggableDatabaseEncryptionKeyRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, RotatePluggableDatabaseEncryptionKeyResponse::builder)
                .logger(LOG, "rotatePluggableDatabaseEncryptionKey")
                .serviceDetails(
                        "Database",
                        "RotatePluggableDatabaseEncryptionKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/RotatePluggableDatabaseEncryptionKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotatePluggableDatabaseEncryptionKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RotatePluggableDatabaseEncryptionKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        RotatePluggableDatabaseEncryptionKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateSslCertsResponse rotateSslCerts(RotateSslCertsRequest request) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, RotateSslCertsResponse::builder)
                .logger(LOG, "rotateSslCerts")
                .serviceDetails(
                        "Database",
                        "RotateSslCerts",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/RotateSslCerts")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateSslCertsRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .appendPathParam("actions")
                .appendPathParam("rotateSslCerts")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateSslCertsResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateSslCertsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RotateVaultKeyResponse rotateVaultKey(RotateVaultKeyRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        return clientCall(request, RotateVaultKeyResponse::builder)
                .logger(LOG, "rotateVaultKey")
                .serviceDetails(
                        "Database",
                        "RotateVaultKey",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/RotateVaultKey")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RotateVaultKeyRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("rotateKey")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        RotateVaultKeyResponse.Builder::database)
                .handleResponseHeaderString("etag", RotateVaultKeyResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", RotateVaultKeyResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RotateVaultKeyResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ScanExternalContainerDatabasePluggableDatabasesResponse
            scanExternalContainerDatabasePluggableDatabases(
                    ScanExternalContainerDatabasePluggableDatabasesRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId is required");

        return clientCall(request, ScanExternalContainerDatabasePluggableDatabasesResponse::builder)
                .logger(LOG, "scanExternalContainerDatabasePluggableDatabases")
                .serviceDetails(
                        "Database",
                        "ScanExternalContainerDatabasePluggableDatabases",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/ScanExternalContainerDatabasePluggableDatabases")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScanExternalContainerDatabasePluggableDatabasesRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("scanPluggableDatabases")
                .appendQueryParam(
                        "externalDatabaseConnectorId", request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScanExternalContainerDatabasePluggableDatabasesResponse.Builder
                                ::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScanExternalContainerDatabasePluggableDatabasesResponse.Builder
                                ::opcRequestId)
                .callSync();
    }

    @Override
    public ShrinkAutonomousDatabaseResponse shrinkAutonomousDatabase(
            ShrinkAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, ShrinkAutonomousDatabaseResponse::builder)
                .logger(LOG, "shrinkAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "ShrinkAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/ShrinkAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ShrinkAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("shrink")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        ShrinkAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", ShrinkAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ShrinkAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ShrinkAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StartAutonomousDatabaseResponse startAutonomousDatabase(
            StartAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, StartAutonomousDatabaseResponse::builder)
                .logger(LOG, "startAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "StartAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/StartAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        StartAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", StartAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StartPluggableDatabaseResponse startPluggableDatabase(
            StartPluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, StartPluggableDatabaseResponse::builder)
                .logger(LOG, "startPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "StartPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/StartPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        StartPluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StartPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", StartPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StartPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopAutonomousDatabaseResponse stopAutonomousDatabase(
            StopAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, StopAutonomousDatabaseResponse::builder)
                .logger(LOG, "stopAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "StopAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/StopAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        StopAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", StopAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public StopPluggableDatabaseResponse stopPluggableDatabase(
            StopPluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");

        return clientCall(request, StopPluggableDatabaseResponse::builder)
                .logger(LOG, "stopPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "StopPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/StopPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        StopPluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        StopPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", StopPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", StopPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse
            switchoverAutonomousContainerDatabaseDataguardAssociation(
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");

        return clientCall(
                        request,
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "switchoverAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "SwitchoverAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/SwitchoverAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public SwitchoverAutonomousDatabaseResponse switchoverAutonomousDatabase(
            SwitchoverAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");

        return clientCall(request, SwitchoverAutonomousDatabaseResponse::builder)
                .logger(LOG, "switchoverAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "SwitchoverAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/SwitchoverAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .appendQueryParam("peerDbId", request.getPeerDbId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        SwitchoverAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString(
                        "etag", SwitchoverAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public SwitchoverDataGuardAssociationResponse switchoverDataGuardAssociation(
            SwitchoverDataGuardAssociationRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getSwitchoverDataGuardAssociationDetails(),
                "switchoverDataGuardAssociationDetails is required");

        return clientCall(request, SwitchoverDataGuardAssociationResponse::builder)
                .logger(LOG, "switchoverDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "SwitchoverDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/SwitchoverDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        SwitchoverDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", SwitchoverDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SwitchoverDataGuardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public TerminateAutonomousContainerDatabaseResponse terminateAutonomousContainerDatabase(
            TerminateAutonomousContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        return clientCall(request, TerminateAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "terminateAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "TerminateAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/TerminateAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        TerminateAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TerminateAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public TerminateAutonomousExadataInfrastructureResponse
            terminateAutonomousExadataInfrastructure(
                    TerminateAutonomousExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");

        return clientCall(request, TerminateAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "terminateAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "TerminateAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/TerminateAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-request-id",
                        TerminateAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        TerminateAutonomousExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public TerminateDbSystemResponse terminateDbSystem(TerminateDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");

        return clientCall(request, TerminateDbSystemResponse::builder)
                .logger(LOG, "terminateDbSystem")
                .serviceDetails(
                        "Database",
                        "TerminateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/TerminateDbSystem")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(TerminateDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .handleResponseHeaderString(
                        "opc-work-request-id", TerminateDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", TerminateDbSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousContainerDatabaseResponse updateAutonomousContainerDatabase(
            UpdateAutonomousContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousContainerDatabaseDetails(),
                "updateAutonomousContainerDatabaseDetails is required");

        return clientCall(request, UpdateAutonomousContainerDatabaseResponse::builder)
                .logger(LOG, "updateAutonomousContainerDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabase/UpdateAutonomousContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousContainerDatabase.class,
                        UpdateAutonomousContainerDatabaseResponse.Builder
                                ::autonomousContainerDatabase)
                .handleResponseHeaderString(
                        "etag", UpdateAutonomousContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousContainerDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousContainerDatabaseDataguardAssociationResponse
            updateAutonomousContainerDatabaseDataguardAssociation(
                    UpdateAutonomousContainerDatabaseDataguardAssociationRequest request) {

        Validate.notBlank(
                request.getAutonomousContainerDatabaseId(),
                "autonomousContainerDatabaseId must not be blank");

        Validate.notBlank(
                request.getAutonomousContainerDatabaseDataguardAssociationId(),
                "autonomousContainerDatabaseDataguardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousContainerDatabaseDataGuardAssociationDetails(),
                "updateAutonomousContainerDatabaseDataGuardAssociationDetails is required");

        return clientCall(
                        request,
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse::builder)
                .logger(LOG, "updateAutonomousContainerDatabaseDataguardAssociation")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousContainerDatabaseDataguardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousContainerDatabaseDataguardAssociation/UpdateAutonomousContainerDatabaseDataguardAssociation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(
                        UpdateAutonomousContainerDatabaseDataguardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousContainerDatabases")
                .appendPathParam(request.getAutonomousContainerDatabaseId())
                .appendPathParam("autonomousContainerDatabaseDataguardAssociations")
                .appendPathParam(request.getAutonomousContainerDatabaseDataguardAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model
                                .AutonomousContainerDatabaseDataguardAssociation.class,
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::autonomousContainerDatabaseDataguardAssociation)
                .handleResponseHeaderString(
                        "etag",
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousContainerDatabaseDataguardAssociationResponse.Builder
                                ::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousDatabaseResponse updateAutonomousDatabase(
            UpdateAutonomousDatabaseRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseDetails(),
                "updateAutonomousDatabaseDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseResponse::builder)
                .logger(LOG, "updateAutonomousDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabase/UpdateAutonomousDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabase.class,
                        UpdateAutonomousDatabaseResponse.Builder::autonomousDatabase)
                .handleResponseHeaderString("etag", UpdateAutonomousDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAutonomousDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousDatabaseBackupResponse updateAutonomousDatabaseBackup(
            UpdateAutonomousDatabaseBackupRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseBackupId(),
                "autonomousDatabaseBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseBackupDetails(),
                "updateAutonomousDatabaseBackupDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseBackupResponse::builder)
                .logger(LOG, "updateAutonomousDatabaseBackup")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabaseBackup",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseBackup/UpdateAutonomousDatabaseBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseBackupRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabaseBackups")
                .appendPathParam(request.getAutonomousDatabaseBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousDatabaseBackup.class,
                        UpdateAutonomousDatabaseBackupResponse.Builder::autonomousDatabaseBackup)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousDatabaseBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateAutonomousDatabaseBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseBackupResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousDatabaseRegionalWalletResponse updateAutonomousDatabaseRegionalWallet(
            UpdateAutonomousDatabaseRegionalWalletRequest request) {
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseWalletDetails(),
                "updateAutonomousDatabaseWalletDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseRegionalWalletResponse::builder)
                .logger(LOG, "updateAutonomousDatabaseRegionalWallet")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabaseRegionalWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/UpdateAutonomousDatabaseRegionalWallet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseRegionalWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousDatabaseRegionalWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseRegionalWalletResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousDatabaseWalletResponse updateAutonomousDatabaseWallet(
            UpdateAutonomousDatabaseWalletRequest request) {

        Validate.notBlank(
                request.getAutonomousDatabaseId(), "autonomousDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousDatabaseWalletDetails(),
                "updateAutonomousDatabaseWalletDetails is required");

        return clientCall(request, UpdateAutonomousDatabaseWalletResponse::builder)
                .logger(LOG, "updateAutonomousDatabaseWallet")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousDatabaseWallet",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousDatabaseWallet/UpdateAutonomousDatabaseWallet")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousDatabaseWalletRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousDatabases")
                .appendPathParam(request.getAutonomousDatabaseId())
                .appendPathParam("wallet")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousDatabaseWalletResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousDatabaseWalletResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousExadataInfrastructureResponse updateAutonomousExadataInfrastructure(
            UpdateAutonomousExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getAutonomousExadataInfrastructureId(),
                "autonomousExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousExadataInfrastructuresDetails(),
                "updateAutonomousExadataInfrastructuresDetails is required");

        return clientCall(request, UpdateAutonomousExadataInfrastructureResponse::builder)
                .logger(LOG, "updateAutonomousExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousExadataInfrastructure/UpdateAutonomousExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousExadataInfrastructures")
                .appendPathParam(request.getAutonomousExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousExadataInfrastructure.class,
                        UpdateAutonomousExadataInfrastructureResponse.Builder
                                ::autonomousExadataInfrastructure)
                .handleResponseHeaderString(
                        "etag", UpdateAutonomousExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateAutonomousExadataInfrastructureResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .callSync();
    }

    @Override
    public UpdateAutonomousVmClusterResponse updateAutonomousVmCluster(
            UpdateAutonomousVmClusterRequest request) {

        Validate.notBlank(
                request.getAutonomousVmClusterId(), "autonomousVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateAutonomousVmClusterDetails(),
                "updateAutonomousVmClusterDetails is required");

        return clientCall(request, UpdateAutonomousVmClusterResponse::builder)
                .logger(LOG, "updateAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/AutonomousVmCluster/UpdateAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("autonomousVmClusters")
                .appendPathParam(request.getAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.AutonomousVmCluster.class,
                        UpdateAutonomousVmClusterResponse.Builder::autonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBackupDestinationResponse updateBackupDestination(
            UpdateBackupDestinationRequest request) {

        Validate.notBlank(
                request.getBackupDestinationId(), "backupDestinationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBackupDestinationDetails(),
                "updateBackupDestinationDetails is required");

        return clientCall(request, UpdateBackupDestinationResponse::builder)
                .logger(LOG, "updateBackupDestination")
                .serviceDetails(
                        "Database",
                        "UpdateBackupDestination",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/BackupDestination/UpdateBackupDestination")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBackupDestinationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("backupDestinations")
                .appendPathParam(request.getBackupDestinationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.BackupDestination.class,
                        UpdateBackupDestinationResponse.Builder::backupDestination)
                .handleResponseHeaderString("etag", UpdateBackupDestinationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBackupDestinationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCloudAutonomousVmClusterResponse updateCloudAutonomousVmCluster(
            UpdateCloudAutonomousVmClusterRequest request) {

        Validate.notBlank(
                request.getCloudAutonomousVmClusterId(),
                "cloudAutonomousVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCloudAutonomousVmClusterDetails(),
                "updateCloudAutonomousVmClusterDetails is required");

        return clientCall(request, UpdateCloudAutonomousVmClusterResponse::builder)
                .logger(LOG, "updateCloudAutonomousVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateCloudAutonomousVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudAutonomousVmCluster/UpdateCloudAutonomousVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudAutonomousVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudAutonomousVmClusters")
                .appendPathParam(request.getCloudAutonomousVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudAutonomousVmCluster.class,
                        UpdateCloudAutonomousVmClusterResponse.Builder::cloudAutonomousVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudAutonomousVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCloudAutonomousVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCloudAutonomousVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCloudExadataInfrastructureResponse updateCloudExadataInfrastructure(
            UpdateCloudExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getCloudExadataInfrastructureId(),
                "cloudExadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCloudExadataInfrastructureDetails(),
                "updateCloudExadataInfrastructureDetails is required");

        return clientCall(request, UpdateCloudExadataInfrastructureResponse::builder)
                .logger(LOG, "updateCloudExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "UpdateCloudExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudExadataInfrastructure/UpdateCloudExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudExadataInfrastructures")
                .appendPathParam(request.getCloudExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudExadataInfrastructure.class,
                        UpdateCloudExadataInfrastructureResponse.Builder
                                ::cloudExadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCloudExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCloudExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCloudVmClusterResponse updateCloudVmCluster(UpdateCloudVmClusterRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateCloudVmClusterDetails(),
                "updateCloudVmClusterDetails is required");

        return clientCall(request, UpdateCloudVmClusterResponse::builder)
                .logger(LOG, "updateCloudVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateCloudVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/UpdateCloudVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.CloudVmCluster.class,
                        UpdateCloudVmClusterResponse.Builder::cloudVmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateCloudVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateCloudVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateCloudVmClusterIormConfigResponse updateCloudVmClusterIormConfig(
            UpdateCloudVmClusterIormConfigRequest request) {

        Validate.notBlank(request.getCloudVmClusterId(), "cloudVmClusterId must not be blank");
        Objects.requireNonNull(
                request.getCloudVmClusterIormConfigUpdateDetails(),
                "cloudVmClusterIormConfigUpdateDetails is required");

        return clientCall(request, UpdateCloudVmClusterIormConfigResponse::builder)
                .logger(LOG, "updateCloudVmClusterIormConfig")
                .serviceDetails(
                        "Database",
                        "UpdateCloudVmClusterIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/CloudVmCluster/UpdateCloudVmClusterIormConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateCloudVmClusterIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("cloudVmClusters")
                .appendPathParam(request.getCloudVmClusterId())
                .appendPathParam("CloudVmClusterIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        UpdateCloudVmClusterIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateCloudVmClusterIormConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateCloudVmClusterIormConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateCloudVmClusterIormConfigResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateConsoleConnectionResponse updateConsoleConnection(
            UpdateConsoleConnectionRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");

        Validate.notBlank(
                request.getConsoleConnectionId(), "consoleConnectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConsoleConnectionDetails(),
                "updateConsoleConnectionDetails is required");

        return clientCall(request, UpdateConsoleConnectionResponse::builder)
                .logger(LOG, "updateConsoleConnection")
                .serviceDetails(
                        "Database",
                        "UpdateConsoleConnection",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ConsoleConnection/UpdateConsoleConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConsoleConnectionRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .appendPathParam("consoleConnections")
                .appendPathParam(request.getConsoleConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ConsoleConnection.class,
                        UpdateConsoleConnectionResponse.Builder::consoleConnection)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateConsoleConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateConsoleConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConsoleConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDataGuardAssociationResponse updateDataGuardAssociation(
            UpdateDataGuardAssociationRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");

        Validate.notBlank(
                request.getDataGuardAssociationId(), "dataGuardAssociationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDataGuardAssociationDetails(),
                "updateDataGuardAssociationDetails is required");

        return clientCall(request, UpdateDataGuardAssociationResponse::builder)
                .logger(LOG, "updateDataGuardAssociation")
                .serviceDetails(
                        "Database",
                        "UpdateDataGuardAssociation",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DataGuardAssociation/UpdateDataGuardAssociation")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDataGuardAssociationRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("dataGuardAssociations")
                .appendPathParam(request.getDataGuardAssociationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DataGuardAssociation.class,
                        UpdateDataGuardAssociationResponse.Builder::dataGuardAssociation)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDataGuardAssociationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateDataGuardAssociationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDataGuardAssociationResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseDetails(), "updateDatabaseDetails is required");

        return clientCall(request, UpdateDatabaseResponse::builder)
                .logger(LOG, "updateDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/UpdateDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        UpdateDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDatabaseSoftwareImageResponse updateDatabaseSoftwareImage(
            UpdateDatabaseSoftwareImageRequest request) {

        Validate.notBlank(
                request.getDatabaseSoftwareImageId(), "databaseSoftwareImageId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseSoftwareImageDetails(),
                "updateDatabaseSoftwareImageDetails is required");

        return clientCall(request, UpdateDatabaseSoftwareImageResponse::builder)
                .logger(LOG, "updateDatabaseSoftwareImage")
                .serviceDetails(
                        "Database",
                        "UpdateDatabaseSoftwareImage",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DatabaseSoftwareImage/UpdateDatabaseSoftwareImage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseSoftwareImageRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databaseSoftwareImages")
                .appendPathParam(request.getDatabaseSoftwareImageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DatabaseSoftwareImage.class,
                        UpdateDatabaseSoftwareImageResponse.Builder::databaseSoftwareImage)
                .handleResponseHeaderString(
                        "etag", UpdateDatabaseSoftwareImageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseSoftwareImageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDbHomeResponse updateDbHome(UpdateDbHomeRequest request) {

        Validate.notBlank(request.getDbHomeId(), "dbHomeId must not be blank");
        Objects.requireNonNull(request.getUpdateDbHomeDetails(), "updateDbHomeDetails is required");

        return clientCall(request, UpdateDbHomeResponse::builder)
                .logger(LOG, "updateDbHome")
                .serviceDetails(
                        "Database",
                        "UpdateDbHome",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbHome/UpdateDbHome")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbHomeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbHomes")
                .appendPathParam(request.getDbHomeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbHome.class,
                        UpdateDbHomeResponse.Builder::dbHome)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbHomeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDbHomeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbHomeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDbNodeResponse updateDbNode(UpdateDbNodeRequest request) {

        Validate.notBlank(request.getDbNodeId(), "dbNodeId must not be blank");
        Objects.requireNonNull(request.getUpdateDbNodeDetails(), "updateDbNodeDetails is required");

        return clientCall(request, UpdateDbNodeResponse::builder)
                .logger(LOG, "updateDbNode")
                .serviceDetails(
                        "Database",
                        "UpdateDbNode",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbNode/UpdateDbNode")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbNodeRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbNodes")
                .appendPathParam(request.getDbNodeId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbNode.class,
                        UpdateDbNodeResponse.Builder::dbNode)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbNodeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDbNodeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbNodeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDbSystemResponse updateDbSystem(UpdateDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDbSystemDetails(), "updateDbSystemDetails is required");

        return clientCall(request, UpdateDbSystemResponse::builder)
                .logger(LOG, "updateDbSystem")
                .serviceDetails(
                        "Database",
                        "UpdateDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/UpdateDbSystem")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        UpdateDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDbSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExadataInfrastructureResponse updateExadataInfrastructure(
            UpdateExadataInfrastructureRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExadataInfrastructureDetails(),
                "updateExadataInfrastructureDetails is required");

        return clientCall(request, UpdateExadataInfrastructureResponse::builder)
                .logger(LOG, "updateExadataInfrastructure")
                .serviceDetails(
                        "Database",
                        "UpdateExadataInfrastructure",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExadataInfrastructure/UpdateExadataInfrastructure")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExadataInfrastructureRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataInfrastructure.class,
                        UpdateExadataInfrastructureResponse.Builder::exadataInfrastructure)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExadataInfrastructureResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExadataInfrastructureResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExadataInfrastructureResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExadataIormConfigResponse updateExadataIormConfig(
            UpdateExadataIormConfigRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getExadataIormConfigUpdateDetails(),
                "exadataIormConfigUpdateDetails is required");

        return clientCall(request, UpdateExadataIormConfigResponse::builder)
                .logger(LOG, "updateExadataIormConfig")
                .serviceDetails(
                        "Database",
                        "UpdateExadataIormConfig",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/UpdateExadataIormConfig")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExadataIormConfigRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("ExadataIormConfig")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExadataIormConfig.class,
                        UpdateExadataIormConfigResponse.Builder::exadataIormConfig)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExadataIormConfigResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateExadataIormConfigResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateExadataIormConfigResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateExternalContainerDatabaseResponse updateExternalContainerDatabase(
            UpdateExternalContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalContainerDatabaseId(),
                "externalContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalContainerDatabaseDetails(),
                "updateExternalContainerDatabaseDetails is required");

        return clientCall(request, UpdateExternalContainerDatabaseResponse::builder)
                .logger(LOG, "updateExternalContainerDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateExternalContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalContainerDatabase/UpdateExternalContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalcontainerdatabases")
                .appendPathParam(request.getExternalContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalContainerDatabase.class,
                        UpdateExternalContainerDatabaseResponse.Builder::externalContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalContainerDatabaseResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalContainerDatabaseResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateExternalDatabaseConnectorResponse updateExternalDatabaseConnector(
            UpdateExternalDatabaseConnectorRequest request) {

        Validate.notBlank(
                request.getExternalDatabaseConnectorId(),
                "externalDatabaseConnectorId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalDatabaseConnectorDetails(),
                "updateExternalDatabaseConnectorDetails is required");

        return clientCall(request, UpdateExternalDatabaseConnectorResponse::builder)
                .logger(LOG, "updateExternalDatabaseConnector")
                .serviceDetails(
                        "Database",
                        "UpdateExternalDatabaseConnector",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalDatabaseConnector/UpdateExternalDatabaseConnector")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalDatabaseConnectorRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externaldatabaseconnectors")
                .appendPathParam(request.getExternalDatabaseConnectorId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalDatabaseConnector.class,
                        UpdateExternalDatabaseConnectorResponse.Builder::externalDatabaseConnector)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalDatabaseConnectorResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalDatabaseConnectorResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalDatabaseConnectorResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExternalNonContainerDatabaseResponse updateExternalNonContainerDatabase(
            UpdateExternalNonContainerDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalNonContainerDatabaseId(),
                "externalNonContainerDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalNonContainerDatabaseDetails(),
                "updateExternalNonContainerDatabaseDetails is required");

        return clientCall(request, UpdateExternalNonContainerDatabaseResponse::builder)
                .logger(LOG, "updateExternalNonContainerDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateExternalNonContainerDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalNonContainerDatabase/UpdateExternalNonContainerDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalNonContainerDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalnoncontainerdatabases")
                .appendPathParam(request.getExternalNonContainerDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalNonContainerDatabase.class,
                        UpdateExternalNonContainerDatabaseResponse.Builder
                                ::externalNonContainerDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalNonContainerDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalNonContainerDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalNonContainerDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateExternalPluggableDatabaseResponse updateExternalPluggableDatabase(
            UpdateExternalPluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getExternalPluggableDatabaseId(),
                "externalPluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdateExternalPluggableDatabaseDetails(),
                "updateExternalPluggableDatabaseDetails is required");

        return clientCall(request, UpdateExternalPluggableDatabaseResponse::builder)
                .logger(LOG, "updateExternalPluggableDatabase")
                .serviceDetails(
                        "Database",
                        "UpdateExternalPluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/ExternalPluggableDatabase/UpdateExternalPluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateExternalPluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("externalpluggabledatabases")
                .appendPathParam(request.getExternalPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.ExternalPluggableDatabase.class,
                        UpdateExternalPluggableDatabaseResponse.Builder::externalPluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateExternalPluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "etag", UpdateExternalPluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateExternalPluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateKeyStoreResponse updateKeyStore(UpdateKeyStoreRequest request) {

        Validate.notBlank(request.getKeyStoreId(), "keyStoreId must not be blank");
        Objects.requireNonNull(
                request.getUpdateKeyStoreDetails(), "updateKeyStoreDetails is required");

        return clientCall(request, UpdateKeyStoreResponse::builder)
                .logger(LOG, "updateKeyStore")
                .serviceDetails(
                        "Database",
                        "UpdateKeyStore",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/KeyStore/UpdateKeyStore")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateKeyStoreRequest::builder)
                .basePath("/20160918")
                .appendPathParam("keyStores")
                .appendPathParam(request.getKeyStoreId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.KeyStore.class,
                        UpdateKeyStoreResponse.Builder::keyStore)
                .handleResponseHeaderString("etag", UpdateKeyStoreResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateKeyStoreResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateMaintenanceRunResponse updateMaintenanceRun(UpdateMaintenanceRunRequest request) {

        Validate.notBlank(request.getMaintenanceRunId(), "maintenanceRunId must not be blank");
        Objects.requireNonNull(
                request.getUpdateMaintenanceRunDetails(),
                "updateMaintenanceRunDetails is required");

        return clientCall(request, UpdateMaintenanceRunResponse::builder)
                .logger(LOG, "updateMaintenanceRun")
                .serviceDetails(
                        "Database",
                        "UpdateMaintenanceRun",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/MaintenanceRun/UpdateMaintenanceRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateMaintenanceRunRequest::builder)
                .basePath("/20160918")
                .appendPathParam("maintenanceRuns")
                .appendPathParam(request.getMaintenanceRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.MaintenanceRun.class,
                        UpdateMaintenanceRunResponse.Builder::maintenanceRun)
                .handleResponseHeaderString("etag", UpdateMaintenanceRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateMaintenanceRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateOneoffPatchResponse updateOneoffPatch(UpdateOneoffPatchRequest request) {

        Validate.notBlank(request.getOneoffPatchId(), "oneoffPatchId must not be blank");
        Objects.requireNonNull(
                request.getUpdateOneoffPatchDetails(), "updateOneoffPatchDetails is required");

        return clientCall(request, UpdateOneoffPatchResponse::builder)
                .logger(LOG, "updateOneoffPatch")
                .serviceDetails(
                        "Database",
                        "UpdateOneoffPatch",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/OneoffPatch/UpdateOneoffPatch")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateOneoffPatchRequest::builder)
                .basePath("/20160918")
                .appendPathParam("oneoffPatches")
                .appendPathParam(request.getOneoffPatchId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.OneoffPatch.class,
                        UpdateOneoffPatchResponse.Builder::oneoffPatch)
                .handleResponseHeaderString("etag", UpdateOneoffPatchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateOneoffPatchResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePluggableDatabaseResponse updatePluggableDatabase(
            UpdatePluggableDatabaseRequest request) {

        Validate.notBlank(
                request.getPluggableDatabaseId(), "pluggableDatabaseId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePluggableDatabaseDetails(),
                "updatePluggableDatabaseDetails is required");

        return clientCall(request, UpdatePluggableDatabaseResponse::builder)
                .logger(LOG, "updatePluggableDatabase")
                .serviceDetails(
                        "Database",
                        "UpdatePluggableDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/PluggableDatabase/UpdatePluggableDatabase")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePluggableDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("pluggableDatabases")
                .appendPathParam(request.getPluggableDatabaseId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.PluggableDatabase.class,
                        UpdatePluggableDatabaseResponse.Builder::pluggableDatabase)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdatePluggableDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdatePluggableDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePluggableDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVmClusterResponse updateVmCluster(UpdateVmClusterRequest request) {

        Validate.notBlank(request.getVmClusterId(), "vmClusterId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVmClusterDetails(), "updateVmClusterDetails is required");

        return clientCall(request, UpdateVmClusterResponse::builder)
                .logger(LOG, "updateVmCluster")
                .serviceDetails(
                        "Database",
                        "UpdateVmCluster",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmCluster/UpdateVmCluster")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVmClusterRequest::builder)
                .basePath("/20160918")
                .appendPathParam("vmClusters")
                .appendPathParam(request.getVmClusterId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmCluster.class,
                        UpdateVmClusterResponse.Builder::vmCluster)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateVmClusterResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateVmClusterResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVmClusterResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateVmClusterNetworkResponse updateVmClusterNetwork(
            UpdateVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");
        Objects.requireNonNull(
                request.getUpdateVmClusterNetworkDetails(),
                "updateVmClusterNetworkDetails is required");

        return clientCall(request, UpdateVmClusterNetworkResponse::builder)
                .logger(LOG, "updateVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "UpdateVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/UpdateVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        UpdateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpdateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpgradeDatabaseResponse upgradeDatabase(UpgradeDatabaseRequest request) {

        Validate.notBlank(request.getDatabaseId(), "databaseId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeDatabaseDetails(), "upgradeDatabaseDetails is required");

        return clientCall(request, UpgradeDatabaseResponse::builder)
                .logger(LOG, "upgradeDatabase")
                .serviceDetails(
                        "Database",
                        "UpgradeDatabase",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/Database/UpgradeDatabase")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDatabaseRequest::builder)
                .basePath("/20160918")
                .appendPathParam("databases")
                .appendPathParam(request.getDatabaseId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.Database.class,
                        UpgradeDatabaseResponse.Builder::database)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDatabaseResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpgradeDatabaseResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDatabaseResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpgradeDbSystemResponse upgradeDbSystem(UpgradeDbSystemRequest request) {

        Validate.notBlank(request.getDbSystemId(), "dbSystemId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeDbSystemDetails(), "upgradeDbSystemDetails is required");

        return clientCall(request, UpgradeDbSystemResponse::builder)
                .logger(LOG, "upgradeDbSystem")
                .serviceDetails(
                        "Database",
                        "UpgradeDbSystem",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/DbSystem/UpgradeDbSystem")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDbSystemRequest::builder)
                .basePath("/20160918")
                .appendPathParam("dbSystems")
                .appendPathParam(request.getDbSystemId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.database.model.DbSystem.class,
                        UpgradeDbSystemResponse.Builder::dbSystem)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDbSystemResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", UpgradeDbSystemResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDbSystemResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ValidateVmClusterNetworkResponse validateVmClusterNetwork(
            ValidateVmClusterNetworkRequest request) {

        Validate.notBlank(
                request.getExadataInfrastructureId(), "exadataInfrastructureId must not be blank");

        Validate.notBlank(request.getVmClusterNetworkId(), "vmClusterNetworkId must not be blank");

        return clientCall(request, ValidateVmClusterNetworkResponse::builder)
                .logger(LOG, "validateVmClusterNetwork")
                .serviceDetails(
                        "Database",
                        "ValidateVmClusterNetwork",
                        "https://docs.oracle.com/iaas/api/#/en/database/20160918/VmClusterNetwork/ValidateVmClusterNetwork")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateVmClusterNetworkRequest::builder)
                .basePath("/20160918")
                .appendPathParam("exadataInfrastructures")
                .appendPathParam(request.getExadataInfrastructureId())
                .appendPathParam("vmClusterNetworks")
                .appendPathParam(request.getVmClusterNetworkId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .handleBody(
                        com.oracle.bmc.database.model.VmClusterNetwork.class,
                        ValidateVmClusterNetworkResponse.Builder::vmClusterNetwork)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ValidateVmClusterNetworkResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", ValidateVmClusterNetworkResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateVmClusterNetworkResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DatabaseWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DatabaseWaiters newWaiters(com.oracle.bmc.workrequests.WorkRequest workRequestClient) {
        return new DatabaseWaiters(executorService, this, workRequestClient);
    }

    @Override
    public DatabasePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
    public DatabaseClient(
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
