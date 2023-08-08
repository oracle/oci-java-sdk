/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.goldengate.requests.*;
import com.oracle.bmc.goldengate.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class GoldenGateClient extends com.oracle.bmc.http.internal.BaseSyncClient
        implements GoldenGate {
    /** Service instance for GoldenGate. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("GOLDENGATE")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://goldengate.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(GoldenGateClient.class);

    private final GoldenGateWaiters waiters;

    private final GoldenGatePaginators paginators;

    GoldenGateClient(
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
                                    .nameFormat("GoldenGate-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new GoldenGateWaiters(executorService, this);

        this.paginators = new GoldenGatePaginators(this);
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, GoldenGateClient> {
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
        public GoldenGateClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new GoldenGateClient(this, authenticationDetailsProvider, executorService);
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
    public CancelDeploymentBackupResponse cancelDeploymentBackup(
            CancelDeploymentBackupRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getCancelDeploymentBackupDetails(),
                "cancelDeploymentBackupDetails is required");

        return clientCall(request, CancelDeploymentBackupResponse::builder)
                .logger(LOG, "cancelDeploymentBackup")
                .serviceDetails(
                        "GoldenGate",
                        "CancelDeploymentBackup",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/CancelDeploymentBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDeploymentBackupRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDeploymentBackupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CancelDeploymentUpgradeResponse cancelDeploymentUpgrade(
            CancelDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");
        Objects.requireNonNull(
                request.getCancelDeploymentUpgradeDetails(),
                "cancelDeploymentUpgradeDetails is required");

        return clientCall(request, CancelDeploymentUpgradeResponse::builder)
                .logger(LOG, "cancelDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "CancelDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/CancelDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgrade.class,
                        CancelDeploymentUpgradeResponse.Builder::deploymentUpgrade)
                .handleResponseHeaderString("etag", CancelDeploymentUpgradeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CancelSnoozeDeploymentUpgradeResponse cancelSnoozeDeploymentUpgrade(
            CancelSnoozeDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");
        Objects.requireNonNull(
                request.getCancelSnoozeDeploymentUpgradeDetails(),
                "cancelSnoozeDeploymentUpgradeDetails is required");

        return clientCall(request, CancelSnoozeDeploymentUpgradeResponse::builder)
                .logger(LOG, "cancelSnoozeDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "CancelSnoozeDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/CancelSnoozeDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelSnoozeDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .appendPathParam("actions")
                .appendPathParam("cancelSnooze")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelSnoozeDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeConnectionCompartmentResponse changeConnectionCompartment(
            ChangeConnectionCompartmentRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getChangeConnectionCompartmentDetails(),
                "changeConnectionCompartmentDetails is required");

        return clientCall(request, ChangeConnectionCompartmentResponse::builder)
                .logger(LOG, "changeConnectionCompartment")
                .serviceDetails(
                        "GoldenGate",
                        "ChangeConnectionCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/ChangeConnectionCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeConnectionCompartmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeConnectionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeConnectionCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDatabaseRegistrationCompartmentResponse changeDatabaseRegistrationCompartment(
            ChangeDatabaseRegistrationCompartmentRequest request) {

        Validate.notBlank(
                request.getDatabaseRegistrationId(), "databaseRegistrationId must not be blank");
        Objects.requireNonNull(
                request.getChangeDatabaseRegistrationCompartmentDetails(),
                "changeDatabaseRegistrationCompartmentDetails is required");

        return clientCall(request, ChangeDatabaseRegistrationCompartmentResponse::builder)
                .logger(LOG, "changeDatabaseRegistrationCompartment")
                .serviceDetails(
                        "GoldenGate",
                        "ChangeDatabaseRegistrationCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DatabaseRegistration/ChangeDatabaseRegistrationCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDatabaseRegistrationCompartmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("databaseRegistrations")
                .appendPathParam(request.getDatabaseRegistrationId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseRegistrationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseRegistrationCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", ChangeDatabaseRegistrationCompartmentResponse.Builder::sunset)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDeploymentBackupCompartmentResponse changeDeploymentBackupCompartment(
            ChangeDeploymentBackupCompartmentRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getChangeDeploymentBackupCompartmentDetails(),
                "changeDeploymentBackupCompartmentDetails is required");

        return clientCall(request, ChangeDeploymentBackupCompartmentResponse::builder)
                .logger(LOG, "changeDeploymentBackupCompartment")
                .serviceDetails(
                        "GoldenGate",
                        "ChangeDeploymentBackupCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/ChangeDeploymentBackupCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDeploymentBackupCompartmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDeploymentBackupCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ChangeDeploymentCompartmentResponse changeDeploymentCompartment(
            ChangeDeploymentCompartmentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getChangeDeploymentCompartmentDetails(),
                "changeDeploymentCompartmentDetails is required");

        return clientCall(request, ChangeDeploymentCompartmentResponse::builder)
                .logger(LOG, "changeDeploymentCompartment")
                .serviceDetails(
                        "GoldenGate",
                        "ChangeDeploymentCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/ChangeDeploymentCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeDeploymentCompartmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDeploymentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDeploymentCompartmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CollectDeploymentDiagnosticResponse collectDeploymentDiagnostic(
            CollectDeploymentDiagnosticRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getCollectDeploymentDiagnosticDetails(),
                "collectDeploymentDiagnosticDetails is required");

        return clientCall(request, CollectDeploymentDiagnosticResponse::builder)
                .logger(LOG, "collectDeploymentDiagnostic")
                .serviceDetails(
                        "GoldenGate",
                        "CollectDeploymentDiagnostic",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/CollectDeploymentDiagnostic")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CollectDeploymentDiagnosticRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("collectDiagnostics")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CollectDeploymentDiagnosticResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CollectDeploymentDiagnosticResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CopyDeploymentBackupResponse copyDeploymentBackup(CopyDeploymentBackupRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getCopyDeploymentBackupDetails(),
                "copyDeploymentBackupDetails is required");

        return clientCall(request, CopyDeploymentBackupResponse::builder)
                .logger(LOG, "copyDeploymentBackup")
                .serviceDetails(
                        "GoldenGate",
                        "CopyDeploymentBackup",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/CopyDeploymentBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CopyDeploymentBackupRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .appendPathParam("actions")
                .appendPathParam("copyToBucket")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CopyDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CopyDeploymentBackupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateConnectionDetails(), "createConnectionDetails is required");

        return clientCall(request, CreateConnectionResponse::builder)
                .logger(LOG, "createConnection")
                .serviceDetails(
                        "GoldenGate",
                        "CreateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/CreateConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateConnectionAssignmentResponse createConnectionAssignment(
            CreateConnectionAssignmentRequest request) {
        Objects.requireNonNull(
                request.getCreateConnectionAssignmentDetails(),
                "createConnectionAssignmentDetails is required");

        return clientCall(request, CreateConnectionAssignmentResponse::builder)
                .logger(LOG, "createConnectionAssignment")
                .serviceDetails(
                        "GoldenGate",
                        "CreateConnectionAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/ConnectionAssignment/CreateConnectionAssignment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionAssignmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connectionAssignments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionAssignment.class,
                        CreateConnectionAssignmentResponse.Builder::connectionAssignment)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateConnectionAssignmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionAssignmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateConnectionAssignmentResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDatabaseRegistrationResponse createDatabaseRegistration(
            CreateDatabaseRegistrationRequest request) {
        Objects.requireNonNull(
                request.getCreateDatabaseRegistrationDetails(),
                "createDatabaseRegistrationDetails is required");

        return clientCall(request, CreateDatabaseRegistrationResponse::builder)
                .logger(LOG, "createDatabaseRegistration")
                .serviceDetails(
                        "GoldenGate",
                        "CreateDatabaseRegistration",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DatabaseRegistration/CreateDatabaseRegistration")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDatabaseRegistrationRequest::builder)
                .basePath("/20200407")
                .appendPathParam("databaseRegistrations")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DatabaseRegistration.class,
                        CreateDatabaseRegistrationResponse.Builder::databaseRegistration)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDatabaseRegistrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreateDatabaseRegistrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "sunset", CreateDatabaseRegistrationResponse.Builder::sunset)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) {
        Objects.requireNonNull(
                request.getCreateDeploymentDetails(), "createDeploymentDetails is required");

        return clientCall(request, CreateDeploymentResponse::builder)
                .logger(LOG, "createDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "CreateDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/CreateDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Deployment.class,
                        CreateDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDeploymentResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public CreateDeploymentBackupResponse createDeploymentBackup(
            CreateDeploymentBackupRequest request) {
        Objects.requireNonNull(
                request.getCreateDeploymentBackupDetails(),
                "createDeploymentBackupDetails is required");

        return clientCall(request, CreateDeploymentBackupResponse::builder)
                .logger(LOG, "createDeploymentBackup")
                .serviceDetails(
                        "GoldenGate",
                        "CreateDeploymentBackup",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/CreateDeploymentBackup")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeploymentBackupRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeploymentBackupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, DeleteConnectionResponse::builder)
                .logger(LOG, "deleteConnection")
                .serviceDetails(
                        "GoldenGate",
                        "DeleteConnection",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/DeleteConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteConnectionAssignmentResponse deleteConnectionAssignment(
            DeleteConnectionAssignmentRequest request) {

        Validate.notBlank(
                request.getConnectionAssignmentId(), "connectionAssignmentId must not be blank");

        return clientCall(request, DeleteConnectionAssignmentResponse::builder)
                .logger(LOG, "deleteConnectionAssignment")
                .serviceDetails(
                        "GoldenGate",
                        "DeleteConnectionAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/ConnectionAssignment/DeleteConnectionAssignment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionAssignmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connectionAssignments")
                .appendPathParam(request.getConnectionAssignmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteConnectionAssignmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionAssignmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDatabaseRegistrationResponse deleteDatabaseRegistration(
            DeleteDatabaseRegistrationRequest request) {

        Validate.notBlank(
                request.getDatabaseRegistrationId(), "databaseRegistrationId must not be blank");

        return clientCall(request, DeleteDatabaseRegistrationResponse::builder)
                .logger(LOG, "deleteDatabaseRegistration")
                .serviceDetails(
                        "GoldenGate",
                        "DeleteDatabaseRegistration",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DatabaseRegistration/DeleteDatabaseRegistration")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDatabaseRegistrationRequest::builder)
                .basePath("/20200407")
                .appendPathParam("databaseRegistrations")
                .appendPathParam(request.getDatabaseRegistrationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseRegistrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DeleteDatabaseRegistrationResponse.Builder::sunset)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDeploymentResponse deleteDeployment(DeleteDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, DeleteDeploymentResponse::builder)
                .logger(LOG, "deleteDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "DeleteDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/DeleteDeployment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeleteDeploymentBackupResponse deleteDeploymentBackup(
            DeleteDeploymentBackupRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");

        return clientCall(request, DeleteDeploymentBackupResponse::builder)
                .logger(LOG, "deleteDeploymentBackup")
                .serviceDetails(
                        "GoldenGate",
                        "DeleteDeploymentBackup",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/DeleteDeploymentBackup")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDeploymentBackupRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeploymentBackupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public DeploymentWalletExistsResponse deploymentWalletExists(
            DeploymentWalletExistsRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getDeploymentWalletExistsDetails(),
                "deploymentWalletExistsDetails is required");

        return clientCall(request, DeploymentWalletExistsResponse::builder)
                .logger(LOG, "deploymentWalletExists")
                .serviceDetails(
                        "GoldenGate",
                        "DeploymentWalletExists",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/DeploymentWalletExists")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeploymentWalletExistsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("walletExists")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails.class,
                        DeploymentWalletExistsResponse.Builder
                                ::deploymentWalletExistsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", DeploymentWalletExistsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DeploymentWalletExistsResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ExportDeploymentWalletResponse exportDeploymentWallet(
            ExportDeploymentWalletRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getExportDeploymentWalletDetails(),
                "exportDeploymentWalletDetails is required");

        return clientCall(request, ExportDeploymentWalletResponse::builder)
                .logger(LOG, "exportDeploymentWallet")
                .serviceDetails(
                        "GoldenGate",
                        "ExportDeploymentWallet",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/ExportDeploymentWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ExportDeploymentWalletRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("exportWallet")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportDeploymentWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ExportDeploymentWalletResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetConnectionResponse getConnection(GetConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, GetConnectionResponse::builder)
                .logger(LOG, "getConnection")
                .serviceDetails(
                        "GoldenGate",
                        "GetConnection",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/GetConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetConnectionAssignmentResponse getConnectionAssignment(
            GetConnectionAssignmentRequest request) {

        Validate.notBlank(
                request.getConnectionAssignmentId(), "connectionAssignmentId must not be blank");

        return clientCall(request, GetConnectionAssignmentResponse::builder)
                .logger(LOG, "getConnectionAssignment")
                .serviceDetails(
                        "GoldenGate",
                        "GetConnectionAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/ConnectionAssignment/GetConnectionAssignment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionAssignmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connectionAssignments")
                .appendPathParam(request.getConnectionAssignmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionAssignment.class,
                        GetConnectionAssignmentResponse.Builder::connectionAssignment)
                .handleResponseHeaderString("etag", GetConnectionAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionAssignmentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDatabaseRegistrationResponse getDatabaseRegistration(
            GetDatabaseRegistrationRequest request) {

        Validate.notBlank(
                request.getDatabaseRegistrationId(), "databaseRegistrationId must not be blank");

        return clientCall(request, GetDatabaseRegistrationResponse::builder)
                .logger(LOG, "getDatabaseRegistration")
                .serviceDetails(
                        "GoldenGate",
                        "GetDatabaseRegistration",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DatabaseRegistration/GetDatabaseRegistration")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDatabaseRegistrationRequest::builder)
                .basePath("/20200407")
                .appendPathParam("databaseRegistrations")
                .appendPathParam(request.getDatabaseRegistrationId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DatabaseRegistration.class,
                        GetDatabaseRegistrationResponse.Builder::databaseRegistration)
                .handleResponseHeaderString("etag", GetDatabaseRegistrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", GetDatabaseRegistrationResponse.Builder::sunset)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, GetDeploymentResponse::builder)
                .logger(LOG, "getDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "GetDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/GetDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.Deployment.class,
                        GetDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", GetDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDeploymentBackupResponse getDeploymentBackup(GetDeploymentBackupRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");

        return clientCall(request, GetDeploymentBackupResponse::builder)
                .logger(LOG, "getDeploymentBackup")
                .serviceDetails(
                        "GoldenGate",
                        "GetDeploymentBackup",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/GetDeploymentBackup")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeploymentBackupRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        GetDeploymentBackupResponse.Builder::deploymentBackup)
                .handleResponseHeaderString("etag", GetDeploymentBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentBackupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetDeploymentUpgradeResponse getDeploymentUpgrade(GetDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");

        return clientCall(request, GetDeploymentUpgradeResponse::builder)
                .logger(LOG, "getDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "GetDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/GetDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgrade.class,
                        GetDeploymentUpgradeResponse.Builder::deploymentUpgrade)
                .handleResponseHeaderString("etag", GetDeploymentUpgradeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "GoldenGate",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20200407")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ImportDeploymentWalletResponse importDeploymentWallet(
            ImportDeploymentWalletRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getImportDeploymentWalletDetails(),
                "importDeploymentWalletDetails is required");

        return clientCall(request, ImportDeploymentWalletResponse::builder)
                .logger(LOG, "importDeploymentWallet")
                .serviceDetails(
                        "GoldenGate",
                        "ImportDeploymentWallet",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/ImportDeploymentWallet")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ImportDeploymentWalletRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("importWallet")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ImportDeploymentWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportDeploymentWalletResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListConnectionAssignmentsResponse listConnectionAssignments(
            ListConnectionAssignmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConnectionAssignmentsResponse::builder)
                .logger(LOG, "listConnectionAssignments")
                .serviceDetails(
                        "GoldenGate",
                        "ListConnectionAssignments",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/ConnectionAssignment/ListConnectionAssignments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionAssignmentsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connectionAssignments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendQueryParam("connectionId", request.getConnectionId())
                .appendQueryParam("name", request.getName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionAssignmentCollection.class,
                        ListConnectionAssignmentsResponse.Builder::connectionAssignmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionAssignmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionAssignmentsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListConnectionsResponse::builder)
                .logger(LOG, "listConnections")
                .serviceDetails(
                        "GoldenGate",
                        "ListConnections",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/ListConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendListQueryParam(
                        "technologyType",
                        request.getTechnologyType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendListQueryParam(
                        "connectionType",
                        request.getConnectionType(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .appendQueryParam("assignedDeploymentId", request.getAssignedDeploymentId())
                .appendQueryParam("assignableDeploymentId", request.getAssignableDeploymentId())
                .appendEnumQueryParam(
                        "assignableDeploymentType", request.getAssignableDeploymentType())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionCollection.class,
                        ListConnectionsResponse.Builder::connectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDatabaseRegistrationsResponse listDatabaseRegistrations(
            ListDatabaseRegistrationsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDatabaseRegistrationsResponse::builder)
                .logger(LOG, "listDatabaseRegistrations")
                .serviceDetails(
                        "GoldenGate",
                        "ListDatabaseRegistrations",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DatabaseRegistration/ListDatabaseRegistrations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDatabaseRegistrationsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("databaseRegistrations")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection.class,
                        ListDatabaseRegistrationsResponse.Builder::databaseRegistrationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseRegistrationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseRegistrationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "sunset", ListDatabaseRegistrationsResponse.Builder::sunset)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDeploymentBackupsResponse listDeploymentBackups(
            ListDeploymentBackupsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDeploymentBackupsResponse::builder)
                .logger(LOG, "listDeploymentBackups")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentBackups",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/ListDeploymentBackups")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentBackupsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackupCollection.class,
                        ListDeploymentBackupsResponse.Builder::deploymentBackupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentBackupsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDeploymentTypesResponse listDeploymentTypes(ListDeploymentTypesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDeploymentTypesResponse::builder)
                .logger(LOG, "listDeploymentTypes")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentTypes",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentTypeCollection/ListDeploymentTypes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentTypesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentTypes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("deploymentType", request.getDeploymentType())
                .appendQueryParam("oggVersion", request.getOggVersion())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentTypeCollection.class,
                        ListDeploymentTypesResponse.Builder::deploymentTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentTypesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDeploymentUpgradesResponse listDeploymentUpgrades(
            ListDeploymentUpgradesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDeploymentUpgradesResponse::builder)
                .logger(LOG, "listDeploymentUpgrades")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentUpgrades",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/ListDeploymentUpgrades")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentUpgradesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgradeCollection.class,
                        ListDeploymentUpgradesResponse.Builder::deploymentUpgradeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentUpgradesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentUpgradesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDeploymentVersionsResponse listDeploymentVersions(
            ListDeploymentVersionsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDeploymentVersionsResponse::builder)
                .logger(LOG, "listDeploymentVersions")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentVersions",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentVersionCollection/ListDeploymentVersions")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentVersionsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentVersions")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendEnumQueryParam("deploymentType", request.getDeploymentType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentVersionCollection.class,
                        ListDeploymentVersionsResponse.Builder::deploymentVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentVersionsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDeploymentWalletsOperationsResponse listDeploymentWalletsOperations(
            ListDeploymentWalletsOperationsRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, ListDeploymentWalletsOperationsResponse::builder)
                .logger(LOG, "listDeploymentWalletsOperations")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentWalletsOperations",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentWalletsOperationSummary/ListDeploymentWalletsOperations")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentWalletsOperationsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("deploymentWalletsOperations")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentWalletsOperationCollection.class,
                        ListDeploymentWalletsOperationsResponse.Builder
                                ::deploymentWalletsOperationCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListDeploymentWalletsOperationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListDeploymentWalletsOperationsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDeploymentsResponse::builder)
                .logger(LOG, "listDeployments")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/ListDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam(
                        "supportedConnectionType", request.getSupportedConnectionType())
                .appendQueryParam("assignedConnectionId", request.getAssignedConnectionId())
                .appendQueryParam("assignableConnectionId", request.getAssignableConnectionId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleSubState", request.getLifecycleSubState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("fqdn", request.getFqdn())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentCollection.class,
                        ListDeploymentsResponse.Builder::deploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListMessagesResponse listMessages(ListMessagesRequest request) {
        Objects.requireNonNull(request.getDeploymentId(), "deploymentId is required");

        return clientCall(request, ListMessagesResponse::builder)
                .logger(LOG, "listMessages")
                .serviceDetails(
                        "GoldenGate",
                        "ListMessages",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/MessageSummary/ListMessages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMessagesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("messages")
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentMessageCollection.class,
                        ListMessagesResponse.Builder::deploymentMessageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMessagesResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTrailFilesResponse listTrailFiles(ListTrailFilesRequest request) {
        Objects.requireNonNull(request.getDeploymentId(), "deploymentId is required");

        return clientCall(request, ListTrailFilesResponse::builder)
                .logger(LOG, "listTrailFiles")
                .serviceDetails(
                        "GoldenGate",
                        "ListTrailFiles",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/TrailFileSummary/ListTrailFiles")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTrailFilesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("trailFiles")
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("trailFileId", request.getTrailFileId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.TrailFileCollection.class,
                        ListTrailFilesResponse.Builder::trailFileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTrailFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTrailFilesResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListTrailSequencesResponse listTrailSequences(ListTrailSequencesRequest request) {
        Objects.requireNonNull(request.getDeploymentId(), "deploymentId is required");

        Objects.requireNonNull(request.getTrailFileId(), "trailFileId is required");

        return clientCall(request, ListTrailSequencesResponse::builder)
                .logger(LOG, "listTrailSequences")
                .serviceDetails(
                        "GoldenGate",
                        "ListTrailSequences",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/TrailSequenceSummary/ListTrailSequences")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTrailSequencesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("trailSequences")
                .appendQueryParam("deploymentId", request.getDeploymentId())
                .appendQueryParam("trailFileId", request.getTrailFileId())
                .appendQueryParam("trailSequenceId", request.getTrailSequenceId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.goldengate.model.TrailSequenceCollection.class,
                        ListTrailSequencesResponse.Builder::trailSequenceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTrailSequencesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTrailSequencesResponse.Builder::opcNextPage)
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
                        "GoldenGate",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.goldengate.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
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
                        "GoldenGate",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.goldengate.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListWorkRequestsResponse::builder)
                .logger(LOG, "listWorkRequests")
                .serviceDetails(
                        "GoldenGate",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBodyList(
                        com.oracle.bmc.goldengate.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RescheduleDeploymentUpgradeResponse rescheduleDeploymentUpgrade(
            RescheduleDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");
        Objects.requireNonNull(
                request.getRescheduleDeploymentUpgradeDetails(),
                "rescheduleDeploymentUpgradeDetails is required");

        return clientCall(request, RescheduleDeploymentUpgradeResponse::builder)
                .logger(LOG, "rescheduleDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "RescheduleDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/RescheduleDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RescheduleDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .appendPathParam("actions")
                .appendPathParam("reschedule")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgrade.class,
                        RescheduleDeploymentUpgradeResponse.Builder::deploymentUpgrade)
                .handleResponseHeaderString(
                        "etag", RescheduleDeploymentUpgradeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RescheduleDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RestoreDeploymentResponse restoreDeployment(RestoreDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getRestoreDeploymentDetails(), "restoreDeploymentDetails is required");

        return clientCall(request, RestoreDeploymentResponse::builder)
                .logger(LOG, "restoreDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "RestoreDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/RestoreDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RestoreDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .appendPathParam("actions")
                .appendPathParam("restore")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public RollbackDeploymentUpgradeResponse rollbackDeploymentUpgrade(
            RollbackDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");
        Objects.requireNonNull(
                request.getRollbackDeploymentUpgradeDetails(),
                "rollbackDeploymentUpgradeDetails is required");

        return clientCall(request, RollbackDeploymentUpgradeResponse::builder)
                .logger(LOG, "rollbackDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "RollbackDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/RollbackDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RollbackDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .appendPathParam("actions")
                .appendPathParam("rollback")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RollbackDeploymentUpgradeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RollbackDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public SnoozeDeploymentUpgradeResponse snoozeDeploymentUpgrade(
            SnoozeDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");
        Objects.requireNonNull(
                request.getSnoozeDeploymentUpgradeDetails(),
                "snoozeDeploymentUpgradeDetails is required");

        return clientCall(request, SnoozeDeploymentUpgradeResponse::builder)
                .logger(LOG, "snoozeDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "SnoozeDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/SnoozeDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SnoozeDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .appendPathParam("actions")
                .appendPathParam("snooze")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", SnoozeDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StartDeploymentResponse startDeployment(StartDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getStartDeploymentDetails(), "startDeploymentDetails is required");

        return clientCall(request, StartDeploymentResponse::builder)
                .logger(LOG, "startDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "StartDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/StartDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public StopDeploymentResponse stopDeployment(StopDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getStopDeploymentDetails(), "stopDeploymentDetails is required");

        return clientCall(request, StopDeploymentResponse::builder)
                .logger(LOG, "stopDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "StopDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/StopDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public TestConnectionAssignmentResponse testConnectionAssignment(
            TestConnectionAssignmentRequest request) {

        Validate.notBlank(
                request.getConnectionAssignmentId(), "connectionAssignmentId must not be blank");
        Objects.requireNonNull(
                request.getTestConnectionAssignmentDetails(),
                "testConnectionAssignmentDetails is required");

        return clientCall(request, TestConnectionAssignmentResponse::builder)
                .logger(LOG, "testConnectionAssignment")
                .serviceDetails(
                        "GoldenGate",
                        "TestConnectionAssignment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/ConnectionAssignment/TestConnectionAssignment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestConnectionAssignmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connectionAssignments")
                .appendPathParam(request.getConnectionAssignmentId())
                .appendPathParam("actions")
                .appendPathParam("test")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.TestConnectionAssignmentResult.class,
                        TestConnectionAssignmentResponse.Builder::testConnectionAssignmentResult)
                .handleResponseHeaderString(
                        "opc-request-id", TestConnectionAssignmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", TestConnectionAssignmentResponse.Builder::etag)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getUpdateConnectionDetails(), "updateConnectionDetails is required");

        return clientCall(request, UpdateConnectionResponse::builder)
                .logger(LOG, "updateConnection")
                .serviceDetails(
                        "GoldenGate",
                        "UpdateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/UpdateConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectionRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDatabaseRegistrationResponse updateDatabaseRegistration(
            UpdateDatabaseRegistrationRequest request) {

        Validate.notBlank(
                request.getDatabaseRegistrationId(), "databaseRegistrationId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDatabaseRegistrationDetails(),
                "updateDatabaseRegistrationDetails is required");

        return clientCall(request, UpdateDatabaseRegistrationResponse::builder)
                .logger(LOG, "updateDatabaseRegistration")
                .serviceDetails(
                        "GoldenGate",
                        "UpdateDatabaseRegistration",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DatabaseRegistration/UpdateDatabaseRegistration")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDatabaseRegistrationRequest::builder)
                .basePath("/20200407")
                .appendPathParam("databaseRegistrations")
                .appendPathParam(request.getDatabaseRegistrationId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseRegistrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", UpdateDatabaseRegistrationResponse.Builder::sunset)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeploymentDetails(), "updateDeploymentDetails is required");

        return clientCall(request, UpdateDeploymentResponse::builder)
                .logger(LOG, "updateDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "UpdateDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/UpdateDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpdateDeploymentBackupResponse updateDeploymentBackup(
            UpdateDeploymentBackupRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeploymentBackupDetails(),
                "updateDeploymentBackupDetails is required");

        return clientCall(request, UpdateDeploymentBackupResponse::builder)
                .logger(LOG, "updateDeploymentBackup")
                .serviceDetails(
                        "GoldenGate",
                        "UpdateDeploymentBackup",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/UpdateDeploymentBackup")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeploymentBackupRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        UpdateDeploymentBackupResponse.Builder::deploymentBackup)
                .handleResponseHeaderString("etag", UpdateDeploymentBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeploymentBackupResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpgradeDeploymentResponse upgradeDeployment(UpgradeDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeDeploymentDetails(), "upgradeDeploymentDetails is required");

        return clientCall(request, UpgradeDeploymentResponse::builder)
                .logger(LOG, "upgradeDeployment")
                .serviceDetails(
                        "GoldenGate",
                        "UpgradeDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/UpgradeDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDeploymentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDeploymentResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public UpgradeDeploymentUpgradeResponse upgradeDeploymentUpgrade(
            UpgradeDeploymentUpgradeRequest request) {

        Validate.notBlank(
                request.getDeploymentUpgradeId(), "deploymentUpgradeId must not be blank");
        Objects.requireNonNull(
                request.getUpgradeDeploymentUpgradeDetails(),
                "upgradeDeploymentUpgradeDetails is required");

        return clientCall(request, UpgradeDeploymentUpgradeResponse::builder)
                .logger(LOG, "upgradeDeploymentUpgrade")
                .serviceDetails(
                        "GoldenGate",
                        "UpgradeDeploymentUpgrade",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentUpgrade/UpgradeDeploymentUpgrade")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UpgradeDeploymentUpgradeRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentUpgrades")
                .appendPathParam(request.getDeploymentUpgradeId())
                .appendPathParam("actions")
                .appendPathParam("upgrade")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpgradeDeploymentUpgradeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDeploymentUpgradeResponse.Builder::opcRequestId)
                .operationUsesDefaultRetries()
                .callSync();
    }

    @Override
    public GoldenGateWaiters getWaiters() {
        return waiters;
    }

    @Override
    public GoldenGatePaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public GoldenGateClient(
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
    public GoldenGateClient(
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
    public GoldenGateClient(
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
    public GoldenGateClient(
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
    public GoldenGateClient(
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
    public GoldenGateClient(
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
    public GoldenGateClient(
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
    public GoldenGateClient(
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
