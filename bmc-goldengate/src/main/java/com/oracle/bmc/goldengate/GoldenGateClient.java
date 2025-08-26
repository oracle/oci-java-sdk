/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
            final String packageName = "goldengate";
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
    public AddConnectionLockResponse addConnectionLock(AddConnectionLockRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddConnectionLockResponse::builder)
                .logger(LOG, "addConnectionLock")
                .serviceDetails(
                        "GoldenGate",
                        "AddConnectionLock",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/AddConnectionLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddConnectionLockRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Connection.class,
                        AddConnectionLockResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-request-id", AddConnectionLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddConnectionLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public AddDeploymentBackupLockResponse addDeploymentBackupLock(
            AddDeploymentBackupLockRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddDeploymentBackupLockResponse::builder)
                .logger(LOG, "addDeploymentBackupLock")
                .serviceDetails(
                        "GoldenGate",
                        "AddDeploymentBackupLock",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/AddDeploymentBackupLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDeploymentBackupLockRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        AddDeploymentBackupLockResponse.Builder::deploymentBackup)
                .handleResponseHeaderString(
                        "opc-request-id", AddDeploymentBackupLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddDeploymentBackupLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public AddDeploymentLocalPeerResponse addDeploymentLocalPeer(
            AddDeploymentLocalPeerRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getAddDeploymentLocalPeerDetails(),
                "addDeploymentLocalPeerDetails is required");

        return clientCall(request, AddDeploymentLocalPeerResponse::builder)
                .logger(LOG, "addDeploymentLocalPeer")
                .serviceDetails(
                        "GoldenGate",
                        "AddDeploymentLocalPeer",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/AddDeploymentLocalPeer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDeploymentLocalPeerRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("addLocalPeer")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        AddDeploymentLocalPeerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", AddDeploymentLocalPeerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public AddDeploymentLockResponse addDeploymentLock(AddDeploymentLockRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getAddResourceLockDetails(), "addResourceLockDetails is required");

        return clientCall(request, AddDeploymentLockResponse::builder)
                .logger(LOG, "addDeploymentLock")
                .serviceDetails(
                        "GoldenGate",
                        "AddDeploymentLock",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/AddDeploymentLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(AddDeploymentLockRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("addLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Deployment.class,
                        AddDeploymentLockResponse.Builder::deployment)
                .handleResponseHeaderString(
                        "opc-request-id", AddDeploymentLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", AddDeploymentLockResponse.Builder::etag)
                .callSync();
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDeploymentBackupResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgrade.class,
                        CancelDeploymentUpgradeResponse.Builder::deploymentUpgrade)
                .handleResponseHeaderString("etag", CancelDeploymentUpgradeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDeploymentUpgradeResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelSnoozeDeploymentUpgradeResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeConnectionCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeConnectionCompartmentResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDatabaseRegistrationCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDatabaseRegistrationCompartmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", ChangeDatabaseRegistrationCompartmentResponse.Builder::sunset)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id",
                        ChangeDeploymentBackupCompartmentResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeDeploymentCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeDeploymentCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangePipelineCompartmentResponse changePipelineCompartment(
            ChangePipelineCompartmentRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getChangePipelineCompartmentDetails(),
                "changePipelineCompartmentDetails is required");

        return clientCall(request, ChangePipelineCompartmentResponse::builder)
                .logger(LOG, "changePipelineCompartment")
                .serviceDetails(
                        "GoldenGate",
                        "ChangePipelineCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/ChangePipelineCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangePipelineCompartmentRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("actions")
                .appendPathParam("changeCompartment")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangePipelineCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangePipelineCompartmentResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CollectDeploymentDiagnosticResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CollectDeploymentDiagnosticResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CollectPipelineDiagnosticResponse collectPipelineDiagnostic(
            CollectPipelineDiagnosticRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getCollectPipelineDiagnosticDetails(),
                "collectPipelineDiagnosticDetails is required");

        return clientCall(request, CollectPipelineDiagnosticResponse::builder)
                .logger(LOG, "collectPipelineDiagnostic")
                .serviceDetails(
                        "GoldenGate",
                        "CollectPipelineDiagnostic",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/CollectPipelineDiagnostic")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CollectPipelineDiagnosticRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("actions")
                .appendPathParam("collectDiagnostics")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CollectPipelineDiagnosticResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CollectPipelineDiagnosticResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        CopyDeploymentBackupResponse.Builder::deploymentBackup)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CopyDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CopyDeploymentBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CopyDeploymentBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest request) {
        Objects.requireNonNull(
                request.getCreateCertificateDetails(), "createCertificateDetails is required");

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, CreateCertificateResponse::builder)
                .logger(LOG, "createCertificate")
                .serviceDetails(
                        "GoldenGate",
                        "CreateCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/CertificateCollection/CreateCertificate")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateCertificateRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("certificates")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateCertificateResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
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
                .operationUsesDefaultRetries()
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Deployment.class,
                        CreateDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeploymentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDeploymentResponse.Builder::etag)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        CreateDeploymentBackupResponse.Builder::deploymentBackup)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeploymentBackupResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateDeploymentBackupResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreatePipelineResponse createPipeline(CreatePipelineRequest request) {
        Objects.requireNonNull(
                request.getCreatePipelineDetails(), "createPipelineDetails is required");

        return clientCall(request, CreatePipelineResponse::builder)
                .logger(LOG, "createPipeline")
                .serviceDetails(
                        "GoldenGate",
                        "CreatePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/CreatePipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePipelineRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Pipeline.class,
                        CreatePipelineResponse.Builder::pipeline)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreatePipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePipelineResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePipelineResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        Validate.notBlank(request.getCertificateKey(), "certificateKey must not be blank");

        return clientCall(request, DeleteCertificateResponse::builder)
                .logger(LOG, "deleteCertificate")
                .serviceDetails(
                        "GoldenGate",
                        "DeleteCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Certificate/DeleteCertificate")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteCertificateRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateKey())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteCertificateResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteCertificateResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteConnectionAssignmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionAssignmentResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDatabaseRegistrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", DeleteDatabaseRegistrationResponse.Builder::sunset)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeploymentResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeploymentBackupResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeploymentBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeletePipelineResponse deletePipeline(DeletePipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, DeletePipelineResponse::builder)
                .logger(LOG, "deletePipeline")
                .serviceDetails(
                        "GoldenGate",
                        "DeletePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/DeletePipeline")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePipelineRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeletePipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeletePipelineResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentWalletExistsResponseDetails.class,
                        DeploymentWalletExistsResponse.Builder
                                ::deploymentWalletExistsResponseDetails)
                .handleResponseHeaderString(
                        "opc-request-id", DeploymentWalletExistsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DeploymentWalletExistsResponse.Builder::etag)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ExportDeploymentWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ExportDeploymentWalletResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GenerateLibraryUrlResponse generateLibraryUrl(GenerateLibraryUrlRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getGenerateLibraryUrlDetails(), "generateLibraryUrlDetails is required");

        return clientCall(request, GenerateLibraryUrlResponse::builder)
                .logger(LOG, "generateLibraryUrl")
                .serviceDetails(
                        "GoldenGate",
                        "GenerateLibraryUrl",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/GenerateLibraryUrl")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(GenerateLibraryUrlRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("generateLibraryUrl")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.LibraryUrl.class,
                        GenerateLibraryUrlResponse.Builder::libraryUrl)
                .handleResponseHeaderString(
                        "opc-request-id", GenerateLibraryUrlResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GenerateLibraryUrlResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetCertificateResponse getCertificate(GetCertificateRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        Validate.notBlank(request.getCertificateKey(), "certificateKey must not be blank");

        return clientCall(request, GetCertificateResponse::builder)
                .logger(LOG, "getCertificate")
                .serviceDetails(
                        "GoldenGate",
                        "GetCertificate",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Certificate/GetCertificate")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCertificateRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("certificates")
                .appendPathParam(request.getCertificateKey())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Certificate.class,
                        GetCertificateResponse.Builder::certificate)
                .handleResponseHeaderString("etag", GetCertificateResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCertificateResponse.Builder::opcRequestId)
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
                .appendEnumQueryParam("view", request.getView())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionAssignment.class,
                        GetConnectionAssignmentResponse.Builder::connectionAssignment)
                .handleResponseHeaderString("etag", GetConnectionAssignmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionAssignmentResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DatabaseRegistration.class,
                        GetDatabaseRegistrationResponse.Builder::databaseRegistration)
                .handleResponseHeaderString("etag", GetDatabaseRegistrationResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", GetDatabaseRegistrationResponse.Builder::sunset)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Deployment.class,
                        GetDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", GetDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        GetDeploymentBackupResponse.Builder::deploymentBackup)
                .handleResponseHeaderString("etag", GetDeploymentBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentBackupResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgrade.class,
                        GetDeploymentUpgradeResponse.Builder::deploymentUpgrade)
                .handleResponseHeaderString("etag", GetDeploymentUpgradeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentUpgradeResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetPipelineResponse getPipeline(GetPipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, GetPipelineResponse::builder)
                .logger(LOG, "getPipeline")
                .serviceDetails(
                        "GoldenGate",
                        "GetPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/GetPipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPipelineRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Pipeline.class,
                        GetPipelineResponse.Builder::pipeline)
                .handleResponseHeaderString("etag", GetPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPipelineResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderInteger(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ImportDeploymentWalletResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ImportDeploymentWalletResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, ListCertificatesResponse::builder)
                .logger(LOG, "listCertificates")
                .serviceDetails(
                        "GoldenGate",
                        "ListCertificates",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/CertificateCollection/ListCertificates")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCertificatesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("certificates")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.CertificateCollection.class,
                        ListCertificatesResponse.Builder::certificateCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCertificatesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCertificatesResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionAssignmentCollection.class,
                        ListConnectionAssignmentsResponse.Builder::connectionAssignmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionAssignmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionAssignmentsResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.ConnectionCollection.class,
                        ListConnectionsResponse.Builder::connectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DatabaseRegistrationCollection.class,
                        ListDatabaseRegistrationsResponse.Builder::databaseRegistrationCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDatabaseRegistrationsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDatabaseRegistrationsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "sunset", ListDatabaseRegistrationsResponse.Builder::sunset)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackupCollection.class,
                        ListDeploymentBackupsResponse.Builder::deploymentBackupCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentBackupsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentBackupsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeploymentEnvironmentsResponse listDeploymentEnvironments(
            ListDeploymentEnvironmentsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListDeploymentEnvironmentsResponse::builder)
                .logger(LOG, "listDeploymentEnvironments")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentEnvironments",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentEnvironmentCollection/ListDeploymentEnvironments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentEnvironmentsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentEnvironments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentEnvironmentCollection.class,
                        ListDeploymentEnvironmentsResponse.Builder::deploymentEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentEnvironmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeploymentPeersResponse listDeploymentPeers(ListDeploymentPeersRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, ListDeploymentPeersResponse::builder)
                .logger(LOG, "listDeploymentPeers")
                .serviceDetails(
                        "GoldenGate",
                        "ListDeploymentPeers",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentPeerSummary/ListDeploymentPeers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentPeersRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("peers")
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentPeerCollection.class,
                        ListDeploymentPeersResponse.Builder::deploymentPeerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentPeersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentPeersResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentTypeCollection.class,
                        ListDeploymentTypesResponse.Builder::deploymentTypeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentTypesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentTypesResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgradeCollection.class,
                        ListDeploymentUpgradesResponse.Builder::deploymentUpgradeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentUpgradesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentUpgradesResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentVersionCollection.class,
                        ListDeploymentVersionsResponse.Builder::deploymentVersionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentVersionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentVersionsResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
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
                .appendEnumQueryParam("deploymentType", request.getDeploymentType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("fqdn", request.getFqdn())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentCollection.class,
                        ListDeploymentsResponse.Builder::deploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentsResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentMessageCollection.class,
                        ListMessagesResponse.Builder::deploymentMessageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMessagesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPipelineInitializationStepsResponse listPipelineInitializationSteps(
            ListPipelineInitializationStepsRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, ListPipelineInitializationStepsResponse::builder)
                .logger(LOG, "listPipelineInitializationSteps")
                .serviceDetails(
                        "GoldenGate",
                        "ListPipelineInitializationSteps",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/ListPipelineInitializationSteps")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelineInitializationStepsRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("initializationSteps")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.PipelineInitializationSteps.class,
                        ListPipelineInitializationStepsResponse.Builder
                                ::pipelineInitializationSteps)
                .handleResponseHeaderString(
                        "etag", ListPipelineInitializationStepsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPipelineInitializationStepsResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPipelineRunningProcessesResponse listPipelineRunningProcesses(
            ListPipelineRunningProcessesRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, ListPipelineRunningProcessesResponse::builder)
                .logger(LOG, "listPipelineRunningProcesses")
                .serviceDetails(
                        "GoldenGate",
                        "ListPipelineRunningProcesses",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/ListPipelineRunningProcesses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelineRunningProcessesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("runningProcesses")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.PipelineRunningProcessCollection.class,
                        ListPipelineRunningProcessesResponse.Builder
                                ::pipelineRunningProcessCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelineRunningProcessesResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListPipelineRunningProcessesResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ListPipelineSchemaTablesResponse listPipelineSchemaTables(
            ListPipelineSchemaTablesRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(request.getSourceSchemaName(), "sourceSchemaName is required");

        Objects.requireNonNull(request.getTargetSchemaName(), "targetSchemaName is required");

        return clientCall(request, ListPipelineSchemaTablesResponse::builder)
                .logger(LOG, "listPipelineSchemaTables")
                .serviceDetails(
                        "GoldenGate",
                        "ListPipelineSchemaTables",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/ListPipelineSchemaTables")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelineSchemaTablesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("schemaTables")
                .appendQueryParam("sourceSchemaName", request.getSourceSchemaName())
                .appendQueryParam("targetSchemaName", request.getTargetSchemaName())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.PipelineSchemaTableCollection.class,
                        ListPipelineSchemaTablesResponse.Builder::pipelineSchemaTableCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelineSchemaTablesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelineSchemaTablesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPipelineSchemasResponse listPipelineSchemas(ListPipelineSchemasRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");

        return clientCall(request, ListPipelineSchemasResponse::builder)
                .logger(LOG, "listPipelineSchemas")
                .serviceDetails(
                        "GoldenGate",
                        "ListPipelineSchemas",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/ListPipelineSchemas")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelineSchemasRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("schemas")
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.PipelineSchemaCollection.class,
                        ListPipelineSchemasResponse.Builder::pipelineSchemaCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelineSchemasResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelineSchemasResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListPipelinesResponse::builder)
                .logger(LOG, "listPipelines")
                .serviceDetails(
                        "GoldenGate",
                        "ListPipelines",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/ListPipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPipelinesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleSubState", request.getLifecycleSubState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.PipelineCollection.class,
                        ListPipelinesResponse.Builder::pipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPipelinesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRecipesResponse listRecipes(ListRecipesRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListRecipesResponse::builder)
                .logger(LOG, "listRecipes")
                .serviceDetails(
                        "GoldenGate",
                        "ListRecipes",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/RecipeSummaryCollection/ListRecipes")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRecipesRequest::builder)
                .basePath("/20200407")
                .appendPathParam("recipes")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("recipeType", request.getRecipeType())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.RecipeSummaryCollection.class,
                        ListRecipesResponse.Builder::recipeSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRecipesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRecipesResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.TrailFileCollection.class,
                        ListTrailFilesResponse.Builder::trailFileCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTrailFilesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTrailFilesResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.goldengate.model.TrailSequenceCollection.class,
                        ListTrailSequencesResponse.Builder::trailSequenceCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTrailSequencesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTrailSequencesResponse.Builder::opcNextPage)
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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.goldengate.model.WorkRequestError.class,
                        ListWorkRequestErrorsResponse.Builder::items)
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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.goldengate.model.WorkRequestLogEntry.class,
                        ListWorkRequestLogsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .handleBodyList(
                        com.oracle.bmc.goldengate.model.WorkRequest.class,
                        ListWorkRequestsResponse.Builder::items)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public RefreshConnectionResponse refreshConnection(RefreshConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getRefreshConnectionDetails(), "refreshConnectionDetails is required");

        return clientCall(request, RefreshConnectionResponse::builder)
                .logger(LOG, "refreshConnection")
                .serviceDetails(
                        "GoldenGate",
                        "RefreshConnection",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/RefreshConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RefreshConnectionRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("refresh")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RefreshConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RefreshConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveConnectionLockResponse removeConnectionLock(RemoveConnectionLockRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveConnectionLockResponse::builder)
                .logger(LOG, "removeConnectionLock")
                .serviceDetails(
                        "GoldenGate",
                        "RemoveConnectionLock",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Connection/RemoveConnectionLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveConnectionLockRequest::builder)
                .basePath("/20200407")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Connection.class,
                        RemoveConnectionLockResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveConnectionLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveConnectionLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RemoveDeploymentBackupLockResponse removeDeploymentBackupLock(
            RemoveDeploymentBackupLockRequest request) {

        Validate.notBlank(request.getDeploymentBackupId(), "deploymentBackupId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveDeploymentBackupLockResponse::builder)
                .logger(LOG, "removeDeploymentBackupLock")
                .serviceDetails(
                        "GoldenGate",
                        "RemoveDeploymentBackupLock",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/DeploymentBackup/RemoveDeploymentBackupLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDeploymentBackupLockRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deploymentBackups")
                .appendPathParam(request.getDeploymentBackupId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        RemoveDeploymentBackupLockResponse.Builder::deploymentBackup)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDeploymentBackupLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", RemoveDeploymentBackupLockResponse.Builder::etag)
                .callSync();
    }

    @Override
    public RemoveDeploymentLocalPeerResponse removeDeploymentLocalPeer(
            RemoveDeploymentLocalPeerRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getRemoveDeploymentLocalPeerDetails(),
                "removeDeploymentLocalPeerDetails is required");

        return clientCall(request, RemoveDeploymentLocalPeerResponse::builder)
                .logger(LOG, "removeDeploymentLocalPeer")
                .serviceDetails(
                        "GoldenGate",
                        "RemoveDeploymentLocalPeer",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/RemoveDeploymentLocalPeer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDeploymentLocalPeerRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("removeLocalPeer")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RemoveDeploymentLocalPeerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDeploymentLocalPeerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public RemoveDeploymentLockResponse removeDeploymentLock(RemoveDeploymentLockRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getRemoveResourceLockDetails(), "removeResourceLockDetails is required");

        return clientCall(request, RemoveDeploymentLockResponse::builder)
                .logger(LOG, "removeDeploymentLock")
                .serviceDetails(
                        "GoldenGate",
                        "RemoveDeploymentLock",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/RemoveDeploymentLock")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(RemoveDeploymentLockRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("removeLock")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.Deployment.class,
                        RemoveDeploymentLockResponse.Builder::deployment)
                .handleResponseHeaderString(
                        "opc-request-id", RemoveDeploymentLockResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", RemoveDeploymentLockResponse.Builder::etag)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentUpgrade.class,
                        RescheduleDeploymentUpgradeResponse.Builder::deploymentUpgrade)
                .handleResponseHeaderString(
                        "etag", RescheduleDeploymentUpgradeResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", RescheduleDeploymentUpgradeResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", RestoreDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RestoreDeploymentResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        RollbackDeploymentUpgradeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", RollbackDeploymentUpgradeResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", SnoozeDeploymentUpgradeResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StartPipelineResponse startPipeline(StartPipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getStartPipelineDetails(), "startPipelineDetails is required");

        return clientCall(request, StartPipelineResponse::builder)
                .logger(LOG, "startPipeline")
                .serviceDetails(
                        "GoldenGate",
                        "StartPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/StartPipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StartPipelineRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("actions")
                .appendPathParam("start")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StartPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StartPipelineResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public StopPipelineResponse stopPipeline(StopPipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(request.getStopPipelineDetails(), "stopPipelineDetails is required");

        return clientCall(request, StopPipelineResponse::builder)
                .logger(LOG, "stopPipeline")
                .serviceDetails(
                        "GoldenGate",
                        "StopPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/StopPipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(StopPipelineRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("actions")
                .appendPathParam("stop")
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", StopPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", StopPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public SwitchoverDeploymentPeerResponse switchoverDeploymentPeer(
            SwitchoverDeploymentPeerRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getSwitchoverDeploymentPeerDetails(),
                "switchoverDeploymentPeerDetails is required");

        return clientCall(request, SwitchoverDeploymentPeerResponse::builder)
                .logger(LOG, "switchoverDeploymentPeer")
                .serviceDetails(
                        "GoldenGate",
                        "SwitchoverDeploymentPeer",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Deployment/SwitchoverDeploymentPeer")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SwitchoverDeploymentPeerRequest::builder)
                .basePath("/20200407")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("switchover")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        SwitchoverDeploymentPeerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SwitchoverDeploymentPeerResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.TestConnectionAssignmentResult.class,
                        TestConnectionAssignmentResponse.Builder::testConnectionAssignmentResult)
                .handleResponseHeaderString(
                        "opc-request-id", TestConnectionAssignmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", TestConnectionAssignmentResponse.Builder::etag)
                .callSync();
    }

    @Override
    public TestPipelineConnectionResponse testPipelineConnection(
            TestPipelineConnectionRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getTestPipelineConnectionDetails(),
                "testPipelineConnectionDetails is required");

        return clientCall(request, TestPipelineConnectionResponse::builder)
                .logger(LOG, "testPipelineConnection")
                .serviceDetails(
                        "GoldenGate",
                        "TestPipelineConnection",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/TestPipelineConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TestPipelineConnectionRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendPathParam("actions")
                .appendPathParam("testConnection")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.TestPipelineConnectionResult.class,
                        TestPipelineConnectionResponse.Builder::testPipelineConnectionResult)
                .handleResponseHeaderString(
                        "opc-request-id", TestPipelineConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", TestPipelineConnectionResponse.Builder::etag)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
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
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDatabaseRegistrationResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDatabaseRegistrationResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "sunset", UpdateDatabaseRegistrationResponse.Builder::sunset)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeploymentResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.goldengate.model.DeploymentBackup.class,
                        UpdateDeploymentBackupResponse.Builder::deploymentBackup)
                .handleResponseHeaderString("etag", UpdateDeploymentBackupResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeploymentBackupResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdatePipelineResponse updatePipeline(UpdatePipelineRequest request) {

        Validate.notBlank(request.getPipelineId(), "pipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePipelineDetails(), "updatePipelineDetails is required");

        return clientCall(request, UpdatePipelineResponse::builder)
                .logger(LOG, "updatePipeline")
                .serviceDetails(
                        "GoldenGate",
                        "UpdatePipeline",
                        "https://docs.oracle.com/iaas/api/#/en/goldengate/20200407/Pipeline/UpdatePipeline")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePipelineRequest::builder)
                .basePath("/20200407")
                .appendPathParam("pipelines")
                .appendPathParam(request.getPipelineId())
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePipelineResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", UpgradeDeploymentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDeploymentResponse.Builder::opcRequestId)
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
                .appendQueryParam("isLockOverride", request.getIsLockOverride())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpgradeDeploymentUpgradeResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpgradeDeploymentUpgradeResponse.Builder::opcRequestId)
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
