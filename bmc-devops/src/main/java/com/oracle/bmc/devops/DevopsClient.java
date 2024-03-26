/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class DevopsClient extends com.oracle.bmc.http.internal.BaseSyncClient implements Devops {
    /** Service instance for Devops. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DEVOPS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://devops.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DevopsClient.class);

    private final DevopsWaiters waiters;

    private final DevopsPaginators paginators;

    DevopsClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            java.util.concurrent.ExecutorService executorService) {
        this(builder, authenticationDetailsProvider, executorService, true);
    }

    DevopsClient(
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
                                    .nameFormat("Devops-waiters-%d")
                                    .build());
            threadPoolExecutor.allowCoreThreadTimeOut(true);

            executorService = threadPoolExecutor;
        }
        this.waiters = new DevopsWaiters(executorService, this);

        this.paginators = new DevopsPaginators(this);
        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DevopsClient", "getObjectContent,getRepositoryArchiveContent"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DevopsClient> {
        private boolean isStreamWarningEnabled = true;
        private java.util.concurrent.ExecutorService executorService;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "devops";
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
        public DevopsClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DevopsClient(
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
    public ApproveDeploymentResponse approveDeployment(ApproveDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getApproveDeploymentDetails(), "approveDeploymentDetails is required");

        return clientCall(request, ApproveDeploymentResponse::builder)
                .logger(LOG, "approveDeployment")
                .serviceDetails(
                        "Devops",
                        "ApproveDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/ApproveDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ApproveDeploymentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("approve")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        ApproveDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", ApproveDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ApproveDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelBuildRunResponse cancelBuildRun(CancelBuildRunRequest request) {
        Objects.requireNonNull(
                request.getCancelBuildRunDetails(), "cancelBuildRunDetails is required");

        Validate.notBlank(request.getBuildRunId(), "buildRunId must not be blank");

        return clientCall(request, CancelBuildRunResponse::builder)
                .logger(LOG, "cancelBuildRun")
                .serviceDetails(
                        "Devops",
                        "CancelBuildRun",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/CancelBuildRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelBuildRunRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildRuns")
                .appendPathParam(request.getBuildRunId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        CancelBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", CancelBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelBuildRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelDeploymentResponse cancelDeployment(CancelDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");
        Objects.requireNonNull(
                request.getCancelDeploymentDetails(), "cancelDeploymentDetails is required");

        return clientCall(request, CancelDeploymentResponse::builder)
                .logger(LOG, "cancelDeployment")
                .serviceDetails(
                        "Devops",
                        "CancelDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/CancelDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelDeploymentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .appendPathParam("actions")
                .appendPathParam("cancel")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        CancelDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", CancelDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CancelScheduledCascadingProjectDeletionResponse cancelScheduledCascadingProjectDeletion(
            CancelScheduledCascadingProjectDeletionRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, CancelScheduledCascadingProjectDeletionResponse::builder)
                .logger(LOG, "cancelScheduledCascadingProjectDeletion")
                .serviceDetails(
                        "Devops",
                        "CancelScheduledCascadingProjectDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/CancelScheduledCascadingProjectDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CancelScheduledCascadingProjectDeletionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("actions")
                .appendPathParam("cancelScheduledCascadingProjectDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelScheduledCascadingProjectDeletionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelScheduledCascadingProjectDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public ChangeProjectCompartmentResponse changeProjectCompartment(
            ChangeProjectCompartmentRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getChangeProjectCompartmentDetails(),
                "changeProjectCompartmentDetails is required");

        return clientCall(request, ChangeProjectCompartmentResponse::builder)
                .logger(LOG, "changeProjectCompartment")
                .serviceDetails(
                        "Devops",
                        "ChangeProjectCompartment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/ChangeProjectCompartment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ChangeProjectCompartmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
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
                        ChangeProjectCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateBuildPipelineResponse createBuildPipeline(CreateBuildPipelineRequest request) {
        Objects.requireNonNull(
                request.getCreateBuildPipelineDetails(), "createBuildPipelineDetails is required");

        return clientCall(request, CreateBuildPipelineResponse::builder)
                .logger(LOG, "createBuildPipeline")
                .serviceDetails(
                        "Devops",
                        "CreateBuildPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/CreateBuildPipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBuildPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipeline.class,
                        CreateBuildPipelineResponse.Builder::buildPipeline)
                .handleResponseHeaderString("etag", CreateBuildPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateBuildPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBuildPipelineResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateBuildPipelineResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateBuildPipelineStageResponse createBuildPipelineStage(
            CreateBuildPipelineStageRequest request) {
        Objects.requireNonNull(
                request.getCreateBuildPipelineStageDetails(),
                "createBuildPipelineStageDetails is required");

        return clientCall(request, CreateBuildPipelineStageResponse::builder)
                .logger(LOG, "createBuildPipelineStage")
                .serviceDetails(
                        "Devops",
                        "CreateBuildPipelineStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/CreateBuildPipelineStage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBuildPipelineStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelineStages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipelineStage.class,
                        CreateBuildPipelineStageResponse.Builder::buildPipelineStage)
                .handleResponseHeaderString("etag", CreateBuildPipelineStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateBuildPipelineStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBuildPipelineStageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", CreateBuildPipelineStageResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateBuildRunResponse createBuildRun(CreateBuildRunRequest request) {
        Objects.requireNonNull(
                request.getCreateBuildRunDetails(), "createBuildRunDetails is required");

        return clientCall(request, CreateBuildRunResponse::builder)
                .logger(LOG, "createBuildRun")
                .serviceDetails(
                        "Devops",
                        "CreateBuildRun",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/CreateBuildRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateBuildRunRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildRuns")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        CreateBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", CreateBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBuildRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateBuildRunResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        Objects.requireNonNull(
                request.getCreateConnectionDetails(), "createConnectionDetails is required");

        return clientCall(request, CreateConnectionResponse::builder)
                .logger(LOG, "createConnection")
                .serviceDetails(
                        "Devops",
                        "CreateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/CreateConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateConnectionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("connections")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Connection.class,
                        CreateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", CreateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateConnectionResponse.Builder::location)
                .callSync();
    }

    @Override
    public CreateDeployArtifactResponse createDeployArtifact(CreateDeployArtifactRequest request) {
        Objects.requireNonNull(
                request.getCreateDeployArtifactDetails(),
                "createDeployArtifactDetails is required");

        return clientCall(request, CreateDeployArtifactResponse::builder)
                .logger(LOG, "createDeployArtifact")
                .serviceDetails(
                        "Devops",
                        "CreateDeployArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/CreateDeployArtifact")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeployArtifactRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployArtifacts")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployArtifact.class,
                        CreateDeployArtifactResponse.Builder::deployArtifact)
                .handleResponseHeaderString(
                        "location", CreateDeployArtifactResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateDeployArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDeployArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeployArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDeployEnvironmentResponse createDeployEnvironment(
            CreateDeployEnvironmentRequest request) {
        Objects.requireNonNull(
                request.getCreateDeployEnvironmentDetails(),
                "createDeployEnvironmentDetails is required");

        return clientCall(request, CreateDeployEnvironmentResponse::builder)
                .logger(LOG, "createDeployEnvironment")
                .serviceDetails(
                        "Devops",
                        "CreateDeployEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/CreateDeployEnvironment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeployEnvironmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployEnvironments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployEnvironment.class,
                        CreateDeployEnvironmentResponse.Builder::deployEnvironment)
                .handleResponseHeaderString(
                        "location", CreateDeployEnvironmentResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateDeployEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDeployEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeployEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDeployPipelineResponse createDeployPipeline(CreateDeployPipelineRequest request) {
        Objects.requireNonNull(
                request.getCreateDeployPipelineDetails(),
                "createDeployPipelineDetails is required");

        return clientCall(request, CreateDeployPipelineResponse::builder)
                .logger(LOG, "createDeployPipeline")
                .serviceDetails(
                        "Devops",
                        "CreateDeployPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/CreateDeployPipeline")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeployPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployPipelines")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployPipeline.class,
                        CreateDeployPipelineResponse.Builder::deployPipeline)
                .handleResponseHeaderString(
                        "location", CreateDeployPipelineResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateDeployPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("etag", CreateDeployPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeployPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDeployStageResponse createDeployStage(CreateDeployStageRequest request) {
        Objects.requireNonNull(
                request.getCreateDeployStageDetails(), "createDeployStageDetails is required");

        return clientCall(request, CreateDeployStageResponse::builder)
                .logger(LOG, "createDeployStage")
                .serviceDetails(
                        "Devops",
                        "CreateDeployStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/CreateDeployStage")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeployStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployStages")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployStage.class,
                        CreateDeployStageResponse.Builder::deployStage)
                .handleResponseHeaderString("location", CreateDeployStageResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateDeployStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateDeployStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeployStageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateDeploymentResponse createDeployment(CreateDeploymentRequest request) {
        Objects.requireNonNull(
                request.getCreateDeploymentDetails(), "createDeploymentDetails is required");

        return clientCall(request, CreateDeploymentResponse::builder)
                .logger(LOG, "createDeployment")
                .serviceDetails(
                        "Devops",
                        "CreateDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/CreateDeployment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateDeploymentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        CreateDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", CreateDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateProjectResponse createProject(CreateProjectRequest request) {
        Objects.requireNonNull(
                request.getCreateProjectDetails(), "createProjectDetails is required");

        return clientCall(request, CreateProjectResponse::builder)
                .logger(LOG, "createProject")
                .serviceDetails(
                        "Devops",
                        "CreateProject",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/CreateProject")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateProjectRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Project.class,
                        CreateProjectResponse.Builder::project)
                .handleResponseHeaderString("location", CreateProjectResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public CreateRepositoryResponse createRepository(CreateRepositoryRequest request) {
        Objects.requireNonNull(
                request.getCreateRepositoryDetails(), "createRepositoryDetails is required");

        return clientCall(request, CreateRepositoryResponse::builder)
                .logger(LOG, "createRepository")
                .serviceDetails(
                        "Devops",
                        "CreateRepository",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/CreateRepository")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateRepositoryRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Repository.class,
                        CreateRepositoryResponse.Builder::repository)
                .handleResponseHeaderString("location", CreateRepositoryResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreateRepositoryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) {
        Objects.requireNonNull(
                request.getCreateTriggerDetails(), "createTriggerDetails is required");

        return clientCall(request, CreateTriggerResponse::builder)
                .logger(LOG, "createTrigger")
                .serviceDetails(
                        "Devops",
                        "CreateTrigger",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/CreateTrigger")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateTriggerRequest::builder)
                .basePath("/20210630")
                .appendPathParam("triggers")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.TriggerCreateResult.class,
                        CreateTriggerResponse.Builder::triggerCreateResult)
                .handleResponseHeaderString("etag", CreateTriggerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreateTriggerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateTriggerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateTriggerResponse.Builder::location)
                .callSync();
    }

    @Override
    public DeleteBuildPipelineResponse deleteBuildPipeline(DeleteBuildPipelineRequest request) {

        Validate.notBlank(request.getBuildPipelineId(), "buildPipelineId must not be blank");

        return clientCall(request, DeleteBuildPipelineResponse::builder)
                .logger(LOG, "deleteBuildPipeline")
                .serviceDetails(
                        "Devops",
                        "DeleteBuildPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/DeleteBuildPipeline")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBuildPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelines")
                .appendPathParam(request.getBuildPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBuildPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBuildPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteBuildPipelineStageResponse deleteBuildPipelineStage(
            DeleteBuildPipelineStageRequest request) {

        Validate.notBlank(
                request.getBuildPipelineStageId(), "buildPipelineStageId must not be blank");

        return clientCall(request, DeleteBuildPipelineStageResponse::builder)
                .logger(LOG, "deleteBuildPipelineStage")
                .serviceDetails(
                        "Devops",
                        "DeleteBuildPipelineStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/DeleteBuildPipelineStage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteBuildPipelineStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelineStages")
                .appendPathParam(request.getBuildPipelineStageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBuildPipelineStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBuildPipelineStageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, DeleteConnectionResponse::builder)
                .logger(LOG, "deleteConnection")
                .serviceDetails(
                        "Devops",
                        "DeleteConnection",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/DeleteConnection")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteConnectionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
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
    public DeleteDeployArtifactResponse deleteDeployArtifact(DeleteDeployArtifactRequest request) {

        Validate.notBlank(request.getDeployArtifactId(), "deployArtifactId must not be blank");

        return clientCall(request, DeleteDeployArtifactResponse::builder)
                .logger(LOG, "deleteDeployArtifact")
                .serviceDetails(
                        "Devops",
                        "DeleteDeployArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/DeleteDeployArtifact")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDeployArtifactRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployArtifacts")
                .appendPathParam(request.getDeployArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeployArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDeployEnvironmentResponse deleteDeployEnvironment(
            DeleteDeployEnvironmentRequest request) {

        Validate.notBlank(
                request.getDeployEnvironmentId(), "deployEnvironmentId must not be blank");

        return clientCall(request, DeleteDeployEnvironmentResponse::builder)
                .logger(LOG, "deleteDeployEnvironment")
                .serviceDetails(
                        "Devops",
                        "DeleteDeployEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/DeleteDeployEnvironment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDeployEnvironmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployEnvironments")
                .appendPathParam(request.getDeployEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeployEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDeployPipelineResponse deleteDeployPipeline(DeleteDeployPipelineRequest request) {

        Validate.notBlank(request.getDeployPipelineId(), "deployPipelineId must not be blank");

        return clientCall(request, DeleteDeployPipelineResponse::builder)
                .logger(LOG, "deleteDeployPipeline")
                .serviceDetails(
                        "Devops",
                        "DeleteDeployPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/DeleteDeployPipeline")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDeployPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployPipelines")
                .appendPathParam(request.getDeployPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeployPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteDeployStageResponse deleteDeployStage(DeleteDeployStageRequest request) {

        Validate.notBlank(request.getDeployStageId(), "deployStageId must not be blank");

        return clientCall(request, DeleteDeployStageResponse::builder)
                .logger(LOG, "deleteDeployStage")
                .serviceDetails(
                        "Devops",
                        "DeleteDeployStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/DeleteDeployStage")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteDeployStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployStages")
                .appendPathParam(request.getDeployStageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDeployStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployStageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, DeleteProjectResponse::builder)
                .logger(LOG, "deleteProject")
                .serviceDetails(
                        "Devops",
                        "DeleteProject",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/DeleteProject")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteRefResponse deleteRef(DeleteRefRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getRefName(), "refName must not be blank");

        return clientCall(request, DeleteRefResponse::builder)
                .logger(LOG, "deleteRef")
                .serviceDetails(
                        "Devops",
                        "DeleteRef",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/DeleteRef")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRefRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("refs")
                .appendPathParam(request.getRefName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRefResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRefResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", DeleteRefResponse.Builder::sunset)
                .callSync();
    }

    @Override
    public DeleteRepositoryResponse deleteRepository(DeleteRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, DeleteRepositoryResponse::builder)
                .logger(LOG, "deleteRepository")
                .serviceDetails(
                        "Devops",
                        "DeleteRepository",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/DeleteRepository")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRepositoryRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRepositoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) {

        Validate.notBlank(request.getTriggerId(), "triggerId must not be blank");

        return clientCall(request, DeleteTriggerResponse::builder)
                .logger(LOG, "deleteTrigger")
                .serviceDetails(
                        "Devops",
                        "DeleteTrigger",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/DeleteTrigger")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteTriggerRequest::builder)
                .basePath("/20210630")
                .appendPathParam("triggers")
                .appendPathParam(request.getTriggerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTriggerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTriggerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBuildPipelineResponse getBuildPipeline(GetBuildPipelineRequest request) {

        Validate.notBlank(request.getBuildPipelineId(), "buildPipelineId must not be blank");

        return clientCall(request, GetBuildPipelineResponse::builder)
                .logger(LOG, "getBuildPipeline")
                .serviceDetails(
                        "Devops",
                        "GetBuildPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/GetBuildPipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBuildPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelines")
                .appendPathParam(request.getBuildPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipeline.class,
                        GetBuildPipelineResponse.Builder::buildPipeline)
                .handleResponseHeaderString("etag", GetBuildPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBuildPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBuildPipelineStageResponse getBuildPipelineStage(
            GetBuildPipelineStageRequest request) {

        Validate.notBlank(
                request.getBuildPipelineStageId(), "buildPipelineStageId must not be blank");

        return clientCall(request, GetBuildPipelineStageResponse::builder)
                .logger(LOG, "getBuildPipelineStage")
                .serviceDetails(
                        "Devops",
                        "GetBuildPipelineStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/GetBuildPipelineStage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBuildPipelineStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelineStages")
                .appendPathParam(request.getBuildPipelineStageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipelineStage.class,
                        GetBuildPipelineStageResponse.Builder::buildPipelineStage)
                .handleResponseHeaderString("etag", GetBuildPipelineStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBuildPipelineStageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetBuildRunResponse getBuildRun(GetBuildRunRequest request) {

        Validate.notBlank(request.getBuildRunId(), "buildRunId must not be blank");

        return clientCall(request, GetBuildRunResponse::builder)
                .logger(LOG, "getBuildRun")
                .serviceDetails(
                        "Devops",
                        "GetBuildRun",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/GetBuildRun")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetBuildRunRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildRuns")
                .appendPathParam(request.getBuildRunId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        GetBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", GetBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBuildRunResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCommitResponse getCommit(GetCommitRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getCommitId(), "commitId must not be blank");

        return clientCall(request, GetCommitResponse::builder)
                .logger(LOG, "getCommit")
                .serviceDetails(
                        "Devops",
                        "GetCommit",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetCommit")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCommitRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("commits")
                .appendPathParam(request.getCommitId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCommit.class,
                        GetCommitResponse.Builder::repositoryCommit)
                .handleResponseHeaderString("etag", GetCommitResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCommitResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetCommitDiffResponse getCommitDiff(GetCommitDiffRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(request.getTargetVersion(), "targetVersion is required");

        return clientCall(request, GetCommitDiffResponse::builder)
                .logger(LOG, "getCommitDiff")
                .serviceDetails(
                        "Devops",
                        "GetCommitDiff",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetCommitDiff")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetCommitDiffRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("diff")
                .appendQueryParam("baseVersion", request.getBaseVersion())
                .appendQueryParam("targetVersion", request.getTargetVersion())
                .appendQueryParam(
                        "isComparisonFromMergeBase", request.getIsComparisonFromMergeBase())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DiffResponse.class,
                        GetCommitDiffResponse.Builder::diffResponse)
                .handleResponseHeaderString("etag", GetCommitDiffResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCommitDiffResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetConnectionResponse getConnection(GetConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, GetConnectionResponse::builder)
                .logger(LOG, "getConnection")
                .serviceDetails(
                        "Devops",
                        "GetConnection",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/GetConnection")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetConnectionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDeployArtifactResponse getDeployArtifact(GetDeployArtifactRequest request) {

        Validate.notBlank(request.getDeployArtifactId(), "deployArtifactId must not be blank");

        return clientCall(request, GetDeployArtifactResponse::builder)
                .logger(LOG, "getDeployArtifact")
                .serviceDetails(
                        "Devops",
                        "GetDeployArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/GetDeployArtifact")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeployArtifactRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployArtifacts")
                .appendPathParam(request.getDeployArtifactId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployArtifact.class,
                        GetDeployArtifactResponse.Builder::deployArtifact)
                .handleResponseHeaderString("etag", GetDeployArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDeployEnvironmentResponse getDeployEnvironment(GetDeployEnvironmentRequest request) {

        Validate.notBlank(
                request.getDeployEnvironmentId(), "deployEnvironmentId must not be blank");

        return clientCall(request, GetDeployEnvironmentResponse::builder)
                .logger(LOG, "getDeployEnvironment")
                .serviceDetails(
                        "Devops",
                        "GetDeployEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/GetDeployEnvironment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeployEnvironmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployEnvironments")
                .appendPathParam(request.getDeployEnvironmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployEnvironment.class,
                        GetDeployEnvironmentResponse.Builder::deployEnvironment)
                .handleResponseHeaderString("etag", GetDeployEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDeployPipelineResponse getDeployPipeline(GetDeployPipelineRequest request) {

        Validate.notBlank(request.getDeployPipelineId(), "deployPipelineId must not be blank");

        return clientCall(request, GetDeployPipelineResponse::builder)
                .logger(LOG, "getDeployPipeline")
                .serviceDetails(
                        "Devops",
                        "GetDeployPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/GetDeployPipeline")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeployPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployPipelines")
                .appendPathParam(request.getDeployPipelineId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployPipeline.class,
                        GetDeployPipelineResponse.Builder::deployPipeline)
                .handleResponseHeaderString("etag", GetDeployPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDeployStageResponse getDeployStage(GetDeployStageRequest request) {

        Validate.notBlank(request.getDeployStageId(), "deployStageId must not be blank");

        return clientCall(request, GetDeployStageResponse::builder)
                .logger(LOG, "getDeployStage")
                .serviceDetails(
                        "Devops",
                        "GetDeployStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/GetDeployStage")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeployStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployStages")
                .appendPathParam(request.getDeployStageId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployStage.class,
                        GetDeployStageResponse.Builder::deployStage)
                .handleResponseHeaderString("etag", GetDeployStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployStageResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetDeploymentResponse getDeployment(GetDeploymentRequest request) {

        Validate.notBlank(request.getDeploymentId(), "deploymentId must not be blank");

        return clientCall(request, GetDeploymentResponse::builder)
                .logger(LOG, "getDeployment")
                .serviceDetails(
                        "Devops",
                        "GetDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/GetDeployment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetDeploymentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        GetDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", GetDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetFileDiffResponse getFileDiff(GetFileDiffRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getFilePath(), "filePath must not be blank");
        Objects.requireNonNull(request.getBaseVersion(), "baseVersion is required");

        Objects.requireNonNull(request.getTargetVersion(), "targetVersion is required");

        return clientCall(request, GetFileDiffResponse::builder)
                .logger(LOG, "getFileDiff")
                .serviceDetails(
                        "Devops",
                        "GetFileDiff",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetFileDiff")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetFileDiffRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("diffs")
                .appendPathParam(request.getFilePath())
                .appendQueryParam("baseVersion", request.getBaseVersion())
                .appendQueryParam("targetVersion", request.getTargetVersion())
                .appendQueryParam(
                        "isComparisonFromMergeBase", request.getIsComparisonFromMergeBase())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.FileDiffResponse.class,
                        GetFileDiffResponse.Builder::fileDiffResponse)
                .handleResponseHeaderString("etag", GetFileDiffResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFileDiffResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", GetFileDiffResponse.Builder::sunset)
                .callSync();
    }

    @Override
    public GetMirrorRecordResponse getMirrorRecord(GetMirrorRecordRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(
                request.getMirrorRecordType().getValue(), "mirrorRecordType must not be blank");

        return clientCall(request, GetMirrorRecordResponse::builder)
                .logger(LOG, "getMirrorRecord")
                .serviceDetails(
                        "Devops",
                        "GetMirrorRecord",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetMirrorRecord")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetMirrorRecordRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("mirrorRecords")
                .appendPathParam(request.getMirrorRecordType().getValue())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryMirrorRecord.class,
                        GetMirrorRecordResponse.Builder::repositoryMirrorRecord)
                .handleResponseHeaderString("etag", GetMirrorRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMirrorRecordResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetObjectResponse getObject(GetObjectRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, GetObjectResponse::builder)
                .logger(LOG, "getObject")
                .serviceDetails(
                        "Devops",
                        "GetObject",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryObject/GetObject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetObjectRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("object")
                .appendQueryParam("filePath", request.getFilePath())
                .appendQueryParam("refName", request.getRefName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryObject.class,
                        GetObjectResponse.Builder::repositoryObject)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetObjectResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetObjectContentResponse getObjectContent(GetObjectContentRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getSha(), "sha must not be blank");

        return clientCall(request, GetObjectContentResponse::builder)
                .logger(LOG, "getObjectContent")
                .serviceDetails(
                        "Devops",
                        "GetObjectContent",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetObjectContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetObjectContentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("objects")
                .appendPathParam(request.getSha())
                .appendPathParam("content")
                .appendQueryParam("filePath", request.getFilePath())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class, GetObjectContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "Content-Type", GetObjectContentResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "Content-Disposition", GetObjectContentResponse.Builder::contentDisposition)
                .callSync();
    }

    @Override
    public GetProjectResponse getProject(GetProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, GetProjectResponse::builder)
                .logger(LOG, "getProject")
                .serviceDetails(
                        "Devops",
                        "GetProject",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/GetProject")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRefResponse getRef(GetRefRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getRefName(), "refName must not be blank");

        return clientCall(request, GetRefResponse::builder)
                .logger(LOG, "getRef")
                .serviceDetails(
                        "Devops",
                        "GetRef",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRef")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRefRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("refs")
                .appendPathParam(request.getRefName())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryRef.class,
                        GetRefResponse.Builder::repositoryRef)
                .handleResponseHeaderString("etag", GetRefResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetRefResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", GetRefResponse.Builder::sunset)
                .callSync();
    }

    @Override
    public GetRepoFileDiffResponse getRepoFileDiff(GetRepoFileDiffRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(request.getBaseVersion(), "baseVersion is required");

        Objects.requireNonNull(request.getTargetVersion(), "targetVersion is required");

        return clientCall(request, GetRepoFileDiffResponse::builder)
                .logger(LOG, "getRepoFileDiff")
                .serviceDetails(
                        "Devops",
                        "GetRepoFileDiff",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepoFileDiff")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepoFileDiffRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("file")
                .appendPathParam("diffs")
                .appendQueryParam("filePath", request.getFilePath())
                .appendQueryParam("baseVersion", request.getBaseVersion())
                .appendQueryParam("targetVersion", request.getTargetVersion())
                .appendQueryParam(
                        "isComparisonFromMergeBase", request.getIsComparisonFromMergeBase())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.FileDiffResponse.class,
                        GetRepoFileDiffResponse.Builder::fileDiffResponse)
                .handleResponseHeaderString("etag", GetRepoFileDiffResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepoFileDiffResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRepoFileLinesResponse getRepoFileLines(GetRepoFileLinesRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(request.getRevision(), "revision is required");

        return clientCall(request, GetRepoFileLinesResponse::builder)
                .logger(LOG, "getRepoFileLines")
                .serviceDetails(
                        "Devops",
                        "GetRepoFileLines",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepoFileLines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepoFileLinesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("file")
                .appendPathParam("lines")
                .appendQueryParam("filePath", request.getFilePath())
                .appendQueryParam("revision", request.getRevision())
                .appendQueryParam("startLineNumber", request.getStartLineNumber())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryFileLines.class,
                        GetRepoFileLinesResponse.Builder::repositoryFileLines)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepoFileLinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRepoFileLinesResponse.Builder::etag)
                .callSync();
    }

    @Override
    public GetRepositoryResponse getRepository(GetRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, GetRepositoryResponse::builder)
                .logger(LOG, "getRepository")
                .serviceDetails(
                        "Devops",
                        "GetRepository",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepository")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepositoryRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendListQueryParam(
                        "fields",
                        request.getFields(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.Repository.class,
                        GetRepositoryResponse.Builder::repository)
                .handleResponseHeaderString("etag", GetRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetRepositoryArchiveContentResponse getRepositoryArchiveContent(
            GetRepositoryArchiveContentRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, GetRepositoryArchiveContentResponse::builder)
                .logger(LOG, "getRepositoryArchiveContent")
                .serviceDetails(
                        "Devops",
                        "GetRepositoryArchiveContent",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepositoryArchiveContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepositoryArchiveContentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("archive")
                .appendPathParam("content")
                .appendQueryParam("refName", request.getRefName())
                .appendQueryParam("format", request.getFormat())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        java.io.InputStream.class,
                        GetRepositoryArchiveContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositoryArchiveContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "Content-Type", GetRepositoryArchiveContentResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "Content-Disposition",
                        GetRepositoryArchiveContentResponse.Builder::contentDisposition)
                .callSync();
    }

    @Override
    public GetRepositoryFileLinesResponse getRepositoryFileLines(
            GetRepositoryFileLinesRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getFilePath(), "filePath must not be blank");
        Objects.requireNonNull(request.getRevision(), "revision is required");

        return clientCall(request, GetRepositoryFileLinesResponse::builder)
                .logger(LOG, "getRepositoryFileLines")
                .serviceDetails(
                        "Devops",
                        "GetRepositoryFileLines",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/GetRepositoryFileLines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepositoryFileLinesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("files")
                .appendPathParam(request.getFilePath())
                .appendPathParam("lines")
                .appendQueryParam("revision", request.getRevision())
                .appendQueryParam("startLineNumber", request.getStartLineNumber())
                .appendQueryParam("limit", request.getLimit())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryFileLines.class,
                        GetRepositoryFileLinesResponse.Builder::repositoryFileLines)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositoryFileLinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRepositoryFileLinesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "Sunset", GetRepositoryFileLinesResponse.Builder::sunset)
                .callSync();
    }

    @Override
    public GetTriggerResponse getTrigger(GetTriggerRequest request) {

        Validate.notBlank(request.getTriggerId(), "triggerId must not be blank");

        return clientCall(request, GetTriggerResponse::builder)
                .logger(LOG, "getTrigger")
                .serviceDetails(
                        "Devops",
                        "GetTrigger",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/GetTrigger")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetTriggerRequest::builder)
                .basePath("/20210630")
                .appendPathParam("triggers")
                .appendPathParam(request.getTriggerId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.Trigger.class,
                        GetTriggerResponse.Builder::trigger)
                .handleResponseHeaderString("etag", GetTriggerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTriggerResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, GetWorkRequestResponse::builder)
                .logger(LOG, "getWorkRequest")
                .serviceDetails(
                        "Devops",
                        "GetWorkRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequest/GetWorkRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetWorkRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callSync();
    }

    @Override
    public ListAuthorsResponse listAuthors(ListAuthorsRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListAuthorsResponse::builder)
                .logger(LOG, "listAuthors")
                .serviceDetails(
                        "Devops",
                        "ListAuthors",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListAuthors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListAuthorsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("authors")
                .appendQueryParam("refName", request.getRefName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryAuthorCollection.class,
                        ListAuthorsResponse.Builder::repositoryAuthorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuthorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuthorsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBuildPipelineStagesResponse listBuildPipelineStages(
            ListBuildPipelineStagesRequest request) {

        return clientCall(request, ListBuildPipelineStagesResponse::builder)
                .logger(LOG, "listBuildPipelineStages")
                .serviceDetails(
                        "Devops",
                        "ListBuildPipelineStages",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStageSummary/ListBuildPipelineStages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBuildPipelineStagesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelineStages")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("buildPipelineId", request.getBuildPipelineId())
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
                        com.oracle.bmc.devops.model.BuildPipelineStageCollection.class,
                        ListBuildPipelineStagesResponse.Builder::buildPipelineStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildPipelineStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildPipelineStagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBuildPipelinesResponse listBuildPipelines(ListBuildPipelinesRequest request) {

        return clientCall(request, ListBuildPipelinesResponse::builder)
                .logger(LOG, "listBuildPipelines")
                .serviceDetails(
                        "Devops",
                        "ListBuildPipelines",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineCollection/ListBuildPipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBuildPipelinesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelines")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
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
                        com.oracle.bmc.devops.model.BuildPipelineCollection.class,
                        ListBuildPipelinesResponse.Builder::buildPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildPipelinesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListBuildRunsResponse listBuildRuns(ListBuildRunsRequest request) {

        return clientCall(request, ListBuildRunsResponse::builder)
                .logger(LOG, "listBuildRuns")
                .serviceDetails(
                        "Devops",
                        "ListBuildRuns",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRunSummary/ListBuildRuns")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBuildRunsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildRuns")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("buildPipelineId", request.getBuildPipelineId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRunSummaryCollection.class,
                        ListBuildRunsResponse.Builder::buildRunSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildRunsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCommitDiffsResponse listCommitDiffs(ListCommitDiffsRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(request.getBaseVersion(), "baseVersion is required");

        Objects.requireNonNull(request.getTargetVersion(), "targetVersion is required");

        return clientCall(request, ListCommitDiffsResponse::builder)
                .logger(LOG, "listCommitDiffs")
                .serviceDetails(
                        "Devops",
                        "ListCommitDiffs",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListCommitDiffs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCommitDiffsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("diffs")
                .appendQueryParam("baseVersion", request.getBaseVersion())
                .appendQueryParam("targetVersion", request.getTargetVersion())
                .appendQueryParam(
                        "isComparisonFromMergeBase", request.getIsComparisonFromMergeBase())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DiffCollection.class,
                        ListCommitDiffsResponse.Builder::diffCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCommitDiffsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCommitDiffsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListCommitsResponse listCommits(ListCommitsRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListCommitsResponse::builder)
                .logger(LOG, "listCommits")
                .serviceDetails(
                        "Devops",
                        "ListCommits",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryCommit/ListCommits")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListCommitsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("commits")
                .appendQueryParam("refName", request.getRefName())
                .appendQueryParam("excludeRefName", request.getExcludeRefName())
                .appendQueryParam("filePath", request.getFilePath())
                .appendQueryParam(
                        "timestampGreaterThanOrEqualTo", request.getTimestampGreaterThanOrEqualTo())
                .appendQueryParam(
                        "timestampLessThanOrEqualTo", request.getTimestampLessThanOrEqualTo())
                .appendQueryParam("commitMessage", request.getCommitMessage())
                .appendQueryParam("authorName", request.getAuthorName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCommitCollection.class,
                        ListCommitsResponse.Builder::repositoryCommitCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCommitsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCommitsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {

        return clientCall(request, ListConnectionsResponse::builder)
                .logger(LOG, "listConnections")
                .serviceDetails(
                        "Devops",
                        "ListConnections",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ConnectionCollection/ListConnections")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListConnectionsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("connections")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("connectionType", request.getConnectionType())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.ConnectionCollection.class,
                        ListConnectionsResponse.Builder::connectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeployArtifactsResponse listDeployArtifacts(ListDeployArtifactsRequest request) {

        return clientCall(request, ListDeployArtifactsResponse::builder)
                .logger(LOG, "listDeployArtifacts")
                .serviceDetails(
                        "Devops",
                        "ListDeployArtifacts",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifactSummary/ListDeployArtifacts")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeployArtifactsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployArtifacts")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
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
                        com.oracle.bmc.devops.model.DeployArtifactCollection.class,
                        ListDeployArtifactsResponse.Builder::deployArtifactCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployArtifactsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeployEnvironmentsResponse listDeployEnvironments(
            ListDeployEnvironmentsRequest request) {

        return clientCall(request, ListDeployEnvironmentsResponse::builder)
                .logger(LOG, "listDeployEnvironments")
                .serviceDetails(
                        "Devops",
                        "ListDeployEnvironments",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironmentSummary/ListDeployEnvironments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeployEnvironmentsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployEnvironments")
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("id", request.getId())
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
                        com.oracle.bmc.devops.model.DeployEnvironmentCollection.class,
                        ListDeployEnvironmentsResponse.Builder::deployEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployEnvironmentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeployPipelinesResponse listDeployPipelines(ListDeployPipelinesRequest request) {

        return clientCall(request, ListDeployPipelinesResponse::builder)
                .logger(LOG, "listDeployPipelines")
                .serviceDetails(
                        "Devops",
                        "ListDeployPipelines",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipelineSummary/ListDeployPipelines")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeployPipelinesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployPipelines")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("projectId", request.getProjectId())
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
                        com.oracle.bmc.devops.model.DeployPipelineCollection.class,
                        ListDeployPipelinesResponse.Builder::deployPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployPipelinesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeployStagesResponse listDeployStages(ListDeployStagesRequest request) {

        return clientCall(request, ListDeployStagesResponse::builder)
                .logger(LOG, "listDeployStages")
                .serviceDetails(
                        "Devops",
                        "ListDeployStages",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStageSummary/ListDeployStages")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeployStagesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployStages")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("deployPipelineId", request.getDeployPipelineId())
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
                        com.oracle.bmc.devops.model.DeployStageCollection.class,
                        ListDeployStagesResponse.Builder::deployStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployStagesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListDeploymentsResponse listDeployments(ListDeploymentsRequest request) {

        return clientCall(request, ListDeploymentsResponse::builder)
                .logger(LOG, "listDeployments")
                .serviceDetails(
                        "Devops",
                        "ListDeployments",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeploymentSummary/ListDeployments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListDeploymentsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .appendQueryParam("deployPipelineId", request.getDeployPipelineId())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("timeCreatedLessThan", request.getTimeCreatedLessThan())
                .appendQueryParam(
                        "timeCreatedGreaterThanOrEqualTo",
                        request.getTimeCreatedGreaterThanOrEqualTo())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.DeploymentCollection.class,
                        ListDeploymentsResponse.Builder::deploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListMirrorRecordsResponse listMirrorRecords(ListMirrorRecordsRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListMirrorRecordsResponse::builder)
                .logger(LOG, "listMirrorRecords")
                .serviceDetails(
                        "Devops",
                        "ListMirrorRecords",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListMirrorRecords")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListMirrorRecordsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("mirrorRecords")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryMirrorRecordCollection.class,
                        ListMirrorRecordsResponse.Builder::repositoryMirrorRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMirrorRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMirrorRecordsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListPathsResponse listPaths(ListPathsRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListPathsResponse::builder)
                .logger(LOG, "listPaths")
                .serviceDetails(
                        "Devops",
                        "ListPaths",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryPathSummary/ListPaths")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPathsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("paths")
                .appendQueryParam("ref", request.getRef())
                .appendQueryParam("pathsInSubtree", request.getPathsInSubtree())
                .appendQueryParam("folderPath", request.getFolderPath())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryPathCollection.class,
                        ListPathsResponse.Builder::repositoryPathCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPathsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListPathsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListProjectsResponse listProjects(ListProjectsRequest request) {
        Objects.requireNonNull(request.getCompartmentId(), "compartmentId is required");

        return clientCall(request, ListProjectsResponse::builder)
                .logger(LOG, "listProjects")
                .serviceDetails(
                        "Devops",
                        "ListProjects",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectSummary/ListProjects")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendQueryParam("id", request.getId())
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.ProjectCollection.class,
                        ListProjectsResponse.Builder::projectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRefsResponse listRefs(ListRefsRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListRefsResponse::builder)
                .logger(LOG, "listRefs")
                .serviceDetails(
                        "Devops",
                        "ListRefs",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryRef/ListRefs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRefsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("refs")
                .appendEnumQueryParam("refType", request.getRefType())
                .appendQueryParam("commitId", request.getCommitId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("refName", request.getRefName())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryRefCollection.class,
                        ListRefsResponse.Builder::repositoryRefCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRefsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListRefsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListRepositoriesResponse listRepositories(ListRepositoriesRequest request) {

        return clientCall(request, ListRepositoriesResponse::builder)
                .logger(LOG, "listRepositories")
                .serviceDetails(
                        "Devops",
                        "ListRepositories",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListRepositories")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRepositoriesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
                .appendQueryParam("repositoryId", request.getRepositoryId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCollection.class,
                        ListRepositoriesResponse.Builder::repositoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRepositoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRepositoriesResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListTriggersResponse listTriggers(ListTriggersRequest request) {

        return clientCall(request, ListTriggersResponse::builder)
                .logger(LOG, "listTriggers")
                .serviceDetails(
                        "Devops",
                        "ListTriggers",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/TriggerCollection/ListTriggers")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListTriggersRequest::builder)
                .basePath("/20210630")
                .appendPathParam("triggers")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("projectId", request.getProjectId())
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
                        com.oracle.bmc.devops.model.TriggerCollection.class,
                        ListTriggersResponse.Builder::triggerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTriggersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTriggersResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public ListWorkRequestErrorsResponse listWorkRequestErrors(
            ListWorkRequestErrorsRequest request) {

        Validate.notBlank(request.getWorkRequestId(), "workRequestId must not be blank");

        return clientCall(request, ListWorkRequestErrorsResponse::builder)
                .logger(LOG, "listWorkRequestErrors")
                .serviceDetails(
                        "Devops",
                        "ListWorkRequestErrors",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequestError/ListWorkRequestErrors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestErrorsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("errors")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequestErrorCollection.class,
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
                        "Devops",
                        "ListWorkRequestLogs",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequestLogEntry/ListWorkRequestLogs")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestLogsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("workRequests")
                .appendPathParam(request.getWorkRequestId())
                .appendPathParam("logs")
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
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
                        "Devops",
                        "ListWorkRequests",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/WorkRequest/ListWorkRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListWorkRequestsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("workRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendQueryParam("workRequestId", request.getWorkRequestId())
                .appendEnumQueryParam("status", request.getStatus())
                .appendQueryParam("resourceId", request.getResourceId())
                .appendQueryParam("page", request.getPage())
                .appendQueryParam("limit", request.getLimit())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendListQueryParam(
                        "operationTypeMultiValueQuery",
                        request.getOperationTypeMultiValueQuery(),
                        com.oracle.bmc.util.internal.CollectionFormatType.Multi)
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callSync();
    }

    @Override
    public MirrorRepositoryResponse mirrorRepository(MirrorRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, MirrorRepositoryResponse::builder)
                .logger(LOG, "mirrorRepository")
                .serviceDetails(
                        "Devops",
                        "MirrorRepository",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/MirrorRepository")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MirrorRepositoryRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("mirror")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id", MirrorRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MirrorRepositoryResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public PutRepositoryRefResponse putRepositoryRef(PutRepositoryRefRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getRefName(), "refName must not be blank");
        Objects.requireNonNull(
                request.getPutRepositoryRefDetails(), "putRepositoryRefDetails is required");

        return clientCall(request, PutRepositoryRefResponse::builder)
                .logger(LOG, "putRepositoryRef")
                .serviceDetails(
                        "Devops",
                        "PutRepositoryRef",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/PutRepositoryRef")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(PutRepositoryRefRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("refs")
                .appendPathParam(request.getRefName())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryRef.class,
                        PutRepositoryRefResponse.Builder::repositoryRef)
                .handleResponseHeaderString("location", PutRepositoryRefResponse.Builder::location)
                .handleResponseHeaderString("etag", PutRepositoryRefResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", PutRepositoryRefResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", PutRepositoryRefResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", PutRepositoryRefResponse.Builder::sunset)
                .callSync();
    }

    @Override
    public ScheduleCascadingProjectDeletionResponse scheduleCascadingProjectDeletion(
            ScheduleCascadingProjectDeletionRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, ScheduleCascadingProjectDeletionResponse::builder)
                .logger(LOG, "scheduleCascadingProjectDeletion")
                .serviceDetails(
                        "Devops",
                        "ScheduleCascadingProjectDeletion",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/ScheduleCascadingProjectDeletion")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ScheduleCascadingProjectDeletionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("actions")
                .appendPathParam("scheduleCascadingProjectDeletion")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScheduleCascadingProjectDeletionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleCascadingProjectDeletionResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateBuildPipelineResponse updateBuildPipeline(UpdateBuildPipelineRequest request) {

        Validate.notBlank(request.getBuildPipelineId(), "buildPipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBuildPipelineDetails(), "updateBuildPipelineDetails is required");

        return clientCall(request, UpdateBuildPipelineResponse::builder)
                .logger(LOG, "updateBuildPipeline")
                .serviceDetails(
                        "Devops",
                        "UpdateBuildPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipeline/UpdateBuildPipeline")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBuildPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelines")
                .appendPathParam(request.getBuildPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipeline.class,
                        UpdateBuildPipelineResponse.Builder::buildPipeline)
                .handleResponseHeaderString("etag", UpdateBuildPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBuildPipelineResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateBuildPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "location", UpdateBuildPipelineResponse.Builder::location)
                .callSync();
    }

    @Override
    public UpdateBuildPipelineStageResponse updateBuildPipelineStage(
            UpdateBuildPipelineStageRequest request) {

        Validate.notBlank(
                request.getBuildPipelineStageId(), "buildPipelineStageId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBuildPipelineStageDetails(),
                "updateBuildPipelineStageDetails is required");

        return clientCall(request, UpdateBuildPipelineStageResponse::builder)
                .logger(LOG, "updateBuildPipelineStage")
                .serviceDetails(
                        "Devops",
                        "UpdateBuildPipelineStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildPipelineStage/UpdateBuildPipelineStage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBuildPipelineStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildPipelineStages")
                .appendPathParam(request.getBuildPipelineStageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipelineStage.class,
                        UpdateBuildPipelineStageResponse.Builder::buildPipelineStage)
                .handleResponseHeaderString("etag", UpdateBuildPipelineStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateBuildPipelineStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBuildPipelineStageResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "location", UpdateBuildPipelineStageResponse.Builder::location)
                .callSync();
    }

    @Override
    public UpdateBuildRunResponse updateBuildRun(UpdateBuildRunRequest request) {

        Validate.notBlank(request.getBuildRunId(), "buildRunId must not be blank");
        Objects.requireNonNull(
                request.getUpdateBuildRunDetails(), "updateBuildRunDetails is required");

        return clientCall(request, UpdateBuildRunResponse::builder)
                .logger(LOG, "updateBuildRun")
                .serviceDetails(
                        "Devops",
                        "UpdateBuildRun",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/BuildRun/UpdateBuildRun")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateBuildRunRequest::builder)
                .basePath("/20210630")
                .appendPathParam("buildRuns")
                .appendPathParam(request.getBuildRunId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        UpdateBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", UpdateBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBuildRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", UpdateBuildRunResponse.Builder::location)
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
                        "Devops",
                        "UpdateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/UpdateConnection")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateConnectionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Connection.class,
                        UpdateConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", UpdateConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString("location", UpdateConnectionResponse.Builder::location)
                .callSync();
    }

    @Override
    public UpdateDeployArtifactResponse updateDeployArtifact(UpdateDeployArtifactRequest request) {

        Validate.notBlank(request.getDeployArtifactId(), "deployArtifactId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeployArtifactDetails(),
                "updateDeployArtifactDetails is required");

        return clientCall(request, UpdateDeployArtifactResponse::builder)
                .logger(LOG, "updateDeployArtifact")
                .serviceDetails(
                        "Devops",
                        "UpdateDeployArtifact",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployArtifact/UpdateDeployArtifact")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeployArtifactRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployArtifacts")
                .appendPathParam(request.getDeployArtifactId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployArtifact.class,
                        UpdateDeployArtifactResponse.Builder::deployArtifact)
                .handleResponseHeaderString(
                        "location", UpdateDeployArtifactResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateDeployArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDeployArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeployArtifactResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDeployEnvironmentResponse updateDeployEnvironment(
            UpdateDeployEnvironmentRequest request) {

        Validate.notBlank(
                request.getDeployEnvironmentId(), "deployEnvironmentId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeployEnvironmentDetails(),
                "updateDeployEnvironmentDetails is required");

        return clientCall(request, UpdateDeployEnvironmentResponse::builder)
                .logger(LOG, "updateDeployEnvironment")
                .serviceDetails(
                        "Devops",
                        "UpdateDeployEnvironment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployEnvironment/UpdateDeployEnvironment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeployEnvironmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployEnvironments")
                .appendPathParam(request.getDeployEnvironmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployEnvironment.class,
                        UpdateDeployEnvironmentResponse.Builder::deployEnvironment)
                .handleResponseHeaderString(
                        "location", UpdateDeployEnvironmentResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateDeployEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDeployEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeployEnvironmentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDeployPipelineResponse updateDeployPipeline(UpdateDeployPipelineRequest request) {

        Validate.notBlank(request.getDeployPipelineId(), "deployPipelineId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeployPipelineDetails(),
                "updateDeployPipelineDetails is required");

        return clientCall(request, UpdateDeployPipelineResponse::builder)
                .logger(LOG, "updateDeployPipeline")
                .serviceDetails(
                        "Devops",
                        "UpdateDeployPipeline",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployPipeline/UpdateDeployPipeline")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeployPipelineRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployPipelines")
                .appendPathParam(request.getDeployPipelineId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployPipeline.class,
                        UpdateDeployPipelineResponse.Builder::deployPipeline)
                .handleResponseHeaderString(
                        "location", UpdateDeployPipelineResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateDeployPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        UpdateDeployPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeployPipelineResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateDeployStageResponse updateDeployStage(UpdateDeployStageRequest request) {

        Validate.notBlank(request.getDeployStageId(), "deployStageId must not be blank");
        Objects.requireNonNull(
                request.getUpdateDeployStageDetails(), "updateDeployStageDetails is required");

        return clientCall(request, UpdateDeployStageResponse::builder)
                .logger(LOG, "updateDeployStage")
                .serviceDetails(
                        "Devops",
                        "UpdateDeployStage",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/DeployStage/UpdateDeployStage")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeployStageRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployStages")
                .appendPathParam(request.getDeployStageId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.DeployStage.class,
                        UpdateDeployStageResponse.Builder::deployStage)
                .handleResponseHeaderString("location", UpdateDeployStageResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateDeployStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateDeployStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeployStageResponse.Builder::opcRequestId)
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
                        "Devops",
                        "UpdateDeployment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Deployment/UpdateDeployment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateDeploymentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .appendPathParam(request.getDeploymentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        UpdateDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", UpdateDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeploymentResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProjectDetails(), "updateProjectDetails is required");

        return clientCall(request, UpdateProjectResponse::builder)
                .logger(LOG, "updateProject")
                .serviceDetails(
                        "Devops",
                        "UpdateProject",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Project/UpdateProject")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Project.class,
                        UpdateProjectResponse.Builder::project)
                .handleResponseHeaderString("location", UpdateProjectResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateProjectResponse.Builder::opcRequestId)
                .callSync();
    }

    @Override
    public UpdateRepositoryResponse updateRepository(UpdateRepositoryRequest request) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRepositoryDetails(), "updateRepositoryDetails is required");

        return clientCall(request, UpdateRepositoryResponse::builder)
                .logger(LOG, "updateRepository")
                .serviceDetails(
                        "Devops",
                        "UpdateRepository",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/UpdateRepository")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRepositoryRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Repository.class,
                        UpdateRepositoryResponse.Builder::repository)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateRepositoryResponse.Builder::etag)
                .callSync();
    }

    @Override
    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) {

        Validate.notBlank(request.getTriggerId(), "triggerId must not be blank");
        Objects.requireNonNull(
                request.getUpdateTriggerDetails(), "updateTriggerDetails is required");

        return clientCall(request, UpdateTriggerResponse::builder)
                .logger(LOG, "updateTrigger")
                .serviceDetails(
                        "Devops",
                        "UpdateTrigger",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Trigger/UpdateTrigger")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateTriggerRequest::builder)
                .basePath("/20210630")
                .appendPathParam("triggers")
                .appendPathParam(request.getTriggerId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .operationUsesDefaultRetries()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Trigger.class,
                        UpdateTriggerResponse.Builder::trigger)
                .handleResponseHeaderString("etag", UpdateTriggerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateTriggerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateTriggerResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", UpdateTriggerResponse.Builder::location)
                .callSync();
    }

    @Override
    public ValidateConnectionResponse validateConnection(ValidateConnectionRequest request) {

        Validate.notBlank(request.getConnectionId(), "connectionId must not be blank");

        return clientCall(request, ValidateConnectionResponse::builder)
                .logger(LOG, "validateConnection")
                .serviceDetails(
                        "Devops",
                        "ValidateConnection",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Connection/ValidateConnection")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ValidateConnectionRequest::builder)
                .basePath("/20210630")
                .appendPathParam("connections")
                .appendPathParam(request.getConnectionId())
                .appendPathParam("actions")
                .appendPathParam("validate")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .operationUsesDefaultRetries()
                .handleBody(
                        com.oracle.bmc.devops.model.Connection.class,
                        ValidateConnectionResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ValidateConnectionResponse.Builder::etag)
                .callSync();
    }

    @Override
    public DevopsWaiters getWaiters() {
        return waiters;
    }

    @Override
    public DevopsPaginators getPaginators() {
        return paginators;
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DevopsClient(
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
    public DevopsClient(
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
    public DevopsClient(
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
    public DevopsClient(
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
    public DevopsClient(
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
    public DevopsClient(
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
    public DevopsClient(
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
    public DevopsClient(
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
