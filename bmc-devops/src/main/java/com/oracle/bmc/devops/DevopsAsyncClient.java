/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;

import java.util.Objects;

/**
 * Async client implementation for Devops service. <br>
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class DevopsAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient
        implements DevopsAsync {
    /** Service instance for Devops. */
    public static final com.oracle.bmc.Service SERVICE =
            com.oracle.bmc.Services.serviceBuilder()
                    .serviceName("DEVOPS")
                    .serviceEndpointPrefix("")
                    .serviceEndpointTemplate("https://devops.{region}.oci.{secondLevelDomain}")
                    .build();

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(DevopsAsyncClient.class);

    DevopsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                    authenticationDetailsProvider) {
        this(builder, authenticationDetailsProvider, true);
    }

    DevopsAsyncClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            boolean isStreamWarningEnabled) {
        super(builder, authenticationDetailsProvider);

        if (isStreamWarningEnabled && com.oracle.bmc.util.StreamUtils.isExtraStreamLogsEnabled()) {
            LOG.warn(
                    com.oracle.bmc.util.StreamUtils.getStreamWarningMessage(
                            "DevopsAsyncClient",
                            "getObjectContent,getPullRequestAttachmentContent,getRepositoryArchiveContent,unsubscribePullRequest"));
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
            extends com.oracle.bmc.common.RegionalClientBuilder<Builder, DevopsAsyncClient> {
        private boolean isStreamWarningEnabled = true;

        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "devops";
            com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory =
                    new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                            com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
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
        public DevopsAsyncClient build(
                @jakarta.annotation.Nonnull
                        com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
                                authenticationDetailsProvider) {
            return new DevopsAsyncClient(
                    this, authenticationDetailsProvider, isStreamWarningEnabled);
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
    public java.util.concurrent.Future<ApproveDeploymentResponse> approveDeployment(
            ApproveDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ApproveDeploymentRequest, ApproveDeploymentResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        ApproveDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", ApproveDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ApproveDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelBuildRunResponse> cancelBuildRun(
            CancelBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelBuildRunRequest, CancelBuildRunResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        CancelBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", CancelBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelBuildRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelDeploymentResponse> cancelDeployment(
            CancelDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CancelDeploymentRequest, CancelDeploymentResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        CancelDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", CancelDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CancelDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CancelScheduledCascadingProjectDeletionResponse>
            cancelScheduledCascadingProjectDeletion(
                    CancelScheduledCascadingProjectDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CancelScheduledCascadingProjectDeletionRequest,
                                    CancelScheduledCascadingProjectDeletionResponse>
                            handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CancelScheduledCascadingProjectDeletionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CancelScheduledCascadingProjectDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler) {

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
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ChangeProjectCompartmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", ChangeProjectCompartmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBuildPipelineResponse> createBuildPipeline(
            CreateBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildPipelineRequest, CreateBuildPipelineResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBuildPipelineStageResponse> createBuildPipelineStage(
            CreateBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildPipelineStageRequest, CreateBuildPipelineStageResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateBuildRunResponse> createBuildRun(
            CreateBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildRunRequest, CreateBuildRunResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        CreateBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", CreateBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateBuildRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", CreateBuildRunResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionRequest, CreateConnectionResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDeployArtifactResponse> createDeployArtifact(
            CreateDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployArtifactRequest, CreateDeployArtifactResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDeployEnvironmentResponse> createDeployEnvironment(
            CreateDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployEnvironmentRequest, CreateDeployEnvironmentResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDeployPipelineResponse> createDeployPipeline(
            CreateDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployPipelineRequest, CreateDeployPipelineResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDeployStageResponse> createDeployStage(
            CreateDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployStageRequest, CreateDeployStageResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateDeploymentResponse> createDeployment(
            CreateDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateDeploymentRequest, CreateDeploymentResponse>
                    handler) {
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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        CreateDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", CreateDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", CreateDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOrUpdateGitRefResponse> createOrUpdateGitRef(
            CreateOrUpdateGitRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateOrUpdateGitRefRequest, CreateOrUpdateGitRefResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getCreateOrUpdateGitRefDetails(),
                "createOrUpdateGitRefDetails is required");

        return clientCall(request, CreateOrUpdateGitRefResponse::builder)
                .logger(LOG, "createOrUpdateGitRef")
                .serviceDetails(
                        "Devops",
                        "CreateOrUpdateGitRef",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/CreateOrUpdateGitRef")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOrUpdateGitRefRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("createOrUpdateGitRef")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryRef.class,
                        CreateOrUpdateGitRefResponse.Builder::repositoryRef)
                .handleResponseHeaderString(
                        "location", CreateOrUpdateGitRefResponse.Builder::location)
                .handleResponseHeaderString("etag", CreateOrUpdateGitRefResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        CreateOrUpdateGitRefResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreateOrUpdateGitRefResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateOrUpdateProtectedBranchResponse>
            createOrUpdateProtectedBranch(
                    CreateOrUpdateProtectedBranchRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreateOrUpdateProtectedBranchRequest,
                                    CreateOrUpdateProtectedBranchResponse>
                            handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getCreateOrUpdateProtectedBranchDetails(),
                "createOrUpdateProtectedBranchDetails is required");

        return clientCall(request, CreateOrUpdateProtectedBranchResponse::builder)
                .logger(LOG, "createOrUpdateProtectedBranch")
                .serviceDetails(
                        "Devops",
                        "CreateOrUpdateProtectedBranch",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProtectedBranch/CreateOrUpdateProtectedBranch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreateOrUpdateProtectedBranchRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("createOrUpdateProtectedBranch")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.ProtectedBranch.class,
                        CreateOrUpdateProtectedBranchResponse.Builder::protectedBranch)
                .handleResponseHeaderString(
                        "location", CreateOrUpdateProtectedBranchResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", CreateOrUpdateProtectedBranchResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        CreateOrUpdateProtectedBranchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestResponse> createPullRequest(
            CreatePullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePullRequestRequest, CreatePullRequestResponse>
                    handler) {
        Objects.requireNonNull(
                request.getCreatePullRequestDetails(), "createPullRequestDetails is required");

        return clientCall(request, CreatePullRequestResponse::builder)
                .logger(LOG, "createPullRequest")
                .serviceDetails(
                        "Devops",
                        "CreatePullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/CreatePullRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        CreatePullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString("location", CreatePullRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "content-location", CreatePullRequestResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "opc-work-request-id", CreatePullRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePullRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePullRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestAttachmentResponse>
            createPullRequestAttachment(
                    CreatePullRequestAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    CreatePullRequestAttachmentRequest,
                                    CreatePullRequestAttachmentResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(request.getContentDisposition(), "contentDisposition is required");

        Objects.requireNonNull(
                request.getCreatePullRequestAttachmentBody(),
                "createPullRequestAttachmentBody is required");

        return clientCall(request, CreatePullRequestAttachmentResponse::builder)
                .logger(LOG, "createPullRequestAttachment")
                .serviceDetails(
                        "Devops",
                        "CreatePullRequestAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/CreatePullRequestAttachment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePullRequestAttachmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("attachments")
                .accept("application/json")
                .appendHeader("content-disposition", request.getContentDisposition())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBinaryRequestBody()
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestAttachment.class,
                        CreatePullRequestAttachmentResponse.Builder::pullRequestAttachment)
                .handleResponseHeaderString(
                        "content-location",
                        CreatePullRequestAttachmentResponse.Builder::contentLocation)
                .handleResponseHeaderString(
                        "location", CreatePullRequestAttachmentResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePullRequestAttachmentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "etag", CreatePullRequestAttachmentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreatePullRequestCommentResponse> createPullRequestComment(
            CreatePullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreatePullRequestCommentRequest, CreatePullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(
                request.getCreatePullRequestCommentDetails(),
                "createPullRequestCommentDetails is required");

        return clientCall(request, CreatePullRequestCommentResponse::builder)
                .logger(LOG, "createPullRequestComment")
                .serviceDetails(
                        "Devops",
                        "CreatePullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/CreatePullRequestComment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(CreatePullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        CreatePullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString(
                        "opc-request-id", CreatePullRequestCommentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", CreatePullRequestCommentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateRepositoryResponse> createRepository(
            CreateRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            CreateRepositoryRequest, CreateRepositoryResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<CreateTriggerResponse> createTrigger(
            CreateTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<CreateTriggerRequest, CreateTriggerResponse>
                    handler) {
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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeclinePullRequestResponse> declinePullRequest(
            DeclinePullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeclinePullRequestRequest, DeclinePullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, DeclinePullRequestResponse::builder)
                .logger(LOG, "declinePullRequest")
                .serviceDetails(
                        "Devops",
                        "DeclinePullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/DeclinePullRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeclinePullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("actions")
                .appendPathParam("decline")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        DeclinePullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString(
                        "location", DeclinePullRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", DeclinePullRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", DeclinePullRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildPipelineResponse> deleteBuildPipeline(
            DeleteBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBuildPipelineRequest, DeleteBuildPipelineResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBuildPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBuildPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildPipelineStageResponse> deleteBuildPipelineStage(
            DeleteBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteBuildPipelineStageRequest, DeleteBuildPipelineStageResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteBuildPipelineStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteBuildPipelineStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionRequest, DeleteConnectionResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteConnectionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployArtifactResponse> deleteDeployArtifact(
            DeleteDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployArtifactRequest, DeleteDeployArtifactResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeployArtifactResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployArtifactResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployEnvironmentResponse> deleteDeployEnvironment(
            DeleteDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployEnvironmentRequest, DeleteDeployEnvironmentResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeployEnvironmentResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployPipelineResponse> deleteDeployPipeline(
            DeleteDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployPipelineRequest, DeleteDeployPipelineResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        DeleteDeployPipelineResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeployStageResponse> deleteDeployStage(
            DeleteDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployStageRequest, DeleteDeployStageResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteDeployStageResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteDeployStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteGitRefResponse> deleteGitRef(
            DeleteGitRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteGitRefRequest, DeleteGitRefResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(request.getDeleteGitRefDetails(), "deleteGitRefDetails is required");

        return clientCall(request, DeleteGitRefResponse::builder)
                .logger(LOG, "deleteGitRef")
                .serviceDetails(
                        "Devops",
                        "DeleteGitRef",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/DeleteGitRef")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeleteGitRefRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("deleteGitRef")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteGitRefResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteGitRefResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteProjectResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProjectRepositorySettingsResponse>
            deleteProjectRepositorySettings(
                    DeleteProjectRepositorySettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeleteProjectRepositorySettingsRequest,
                                    DeleteProjectRepositorySettingsResponse>
                            handler) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, DeleteProjectRepositorySettingsResponse::builder)
                .logger(LOG, "deleteProjectRepositorySettings")
                .serviceDetails(
                        "Devops",
                        "DeleteProjectRepositorySettings",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectRepositorySettings/DeleteProjectRepositorySettings")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteProjectRepositorySettingsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("repositorySettings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id",
                        DeleteProjectRepositorySettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteProtectedBranchResponse> deleteProtectedBranch(
            DeleteProtectedBranchRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteProtectedBranchRequest, DeleteProtectedBranchResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getDeleteProtectedBranchDetails(),
                "deleteProtectedBranchDetails is required");

        return clientCall(request, DeleteProtectedBranchResponse::builder)
                .logger(LOG, "deleteProtectedBranch")
                .serviceDetails(
                        "Devops",
                        "DeleteProtectedBranch",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProtectedBranch/DeleteProtectedBranch")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(DeleteProtectedBranchRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("deleteProtectedBranch")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-request-id", DeleteProtectedBranchResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePullRequestResponse> deletePullRequest(
            DeletePullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePullRequestRequest, DeletePullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, DeletePullRequestResponse::builder)
                .logger(LOG, "deletePullRequest")
                .serviceDetails(
                        "Devops",
                        "DeletePullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/DeletePullRequest")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePullRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePullRequestAttachmentResponse>
            deletePullRequestAttachment(
                    DeletePullRequestAttachmentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    DeletePullRequestAttachmentRequest,
                                    DeletePullRequestAttachmentResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, DeletePullRequestAttachmentResponse::builder)
                .logger(LOG, "deletePullRequestAttachment")
                .serviceDetails(
                        "Devops",
                        "DeletePullRequestAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/DeletePullRequestAttachment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePullRequestAttachmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePullRequestAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeletePullRequestCommentResponse> deletePullRequestComment(
            DeletePullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeletePullRequestCommentRequest, DeletePullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");

        return clientCall(request, DeletePullRequestCommentResponse::builder)
                .logger(LOG, "deletePullRequestComment")
                .serviceDetails(
                        "Devops",
                        "DeletePullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/DeletePullRequestComment")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeletePullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeletePullRequestCommentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRefResponse> deleteRef(
            DeleteRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteRefRequest, DeleteRefResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRefResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRefResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", DeleteRefResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositoryResponse> deleteRepository(
            DeleteRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRepositoryRequest, DeleteRepositoryResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRepositoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteRepositorySettingsResponse> deleteRepositorySettings(
            DeleteRepositorySettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            DeleteRepositorySettingsRequest, DeleteRepositorySettingsResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, DeleteRepositorySettingsResponse::builder)
                .logger(LOG, "deleteRepositorySettings")
                .serviceDetails(
                        "Devops",
                        "DeleteRepositorySettings",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositorySettings/DeleteRepositorySettings")
                .method(com.oracle.bmc.http.client.Method.DELETE)
                .requestBuilder(DeleteRepositorySettingsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("repositorySettings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleResponseHeaderString(
                        "opc-request-id", DeleteRepositorySettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<DeleteTriggerResponse> deleteTrigger(
            DeleteTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<DeleteTriggerRequest, DeleteTriggerResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", DeleteTriggerResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", DeleteTriggerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBuildPipelineResponse> getBuildPipeline(
            GetBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBuildPipelineRequest, GetBuildPipelineResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipeline.class,
                        GetBuildPipelineResponse.Builder::buildPipeline)
                .handleResponseHeaderString("etag", GetBuildPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBuildPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBuildPipelineStageResponse> getBuildPipelineStage(
            GetBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetBuildPipelineStageRequest, GetBuildPipelineStageResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipelineStage.class,
                        GetBuildPipelineStageResponse.Builder::buildPipelineStage)
                .handleResponseHeaderString("etag", GetBuildPipelineStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBuildPipelineStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetBuildRunResponse> getBuildRun(
            GetBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetBuildRunRequest, GetBuildRunResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        GetBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", GetBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetBuildRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCommitResponse> getCommit(
            GetCommitRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCommitRequest, GetCommitResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCommit.class,
                        GetCommitResponse.Builder::repositoryCommit)
                .handleResponseHeaderString("etag", GetCommitResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCommitResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetCommitDiffResponse> getCommitDiff(
            GetCommitDiffRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetCommitDiffRequest, GetCommitDiffResponse>
                    handler) {

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
                .appendQueryParam("targetRepositoryId", request.getTargetRepositoryId())
                .appendQueryParam(
                        "isComparisonFromMergeBase", request.getIsComparisonFromMergeBase())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.DiffResponse.class,
                        GetCommitDiffResponse.Builder::diffResponse)
                .handleResponseHeaderString("etag", GetCommitDiffResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetCommitDiffResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.Connection.class,
                        GetConnectionResponse.Builder::connection)
                .handleResponseHeaderString("etag", GetConnectionResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetConnectionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDeployArtifactResponse> getDeployArtifact(
            GetDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployArtifactRequest, GetDeployArtifactResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployArtifact.class,
                        GetDeployArtifactResponse.Builder::deployArtifact)
                .handleResponseHeaderString("etag", GetDeployArtifactResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployArtifactResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDeployEnvironmentResponse> getDeployEnvironment(
            GetDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployEnvironmentRequest, GetDeployEnvironmentResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployEnvironment.class,
                        GetDeployEnvironmentResponse.Builder::deployEnvironment)
                .handleResponseHeaderString("etag", GetDeployEnvironmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployEnvironmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDeployPipelineResponse> getDeployPipeline(
            GetDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployPipelineRequest, GetDeployPipelineResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployPipeline.class,
                        GetDeployPipelineResponse.Builder::deployPipeline)
                .handleResponseHeaderString("etag", GetDeployPipelineResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployPipelineResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDeployStageResponse> getDeployStage(
            GetDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetDeployStageRequest, GetDeployStageResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployStage.class,
                        GetDeployStageResponse.Builder::deployStage)
                .handleResponseHeaderString("etag", GetDeployStageResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeployStageResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetDeploymentResponse> getDeployment(
            GetDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetDeploymentRequest, GetDeploymentResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        GetDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", GetDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetFileDiffResponse> getFileDiff(
            GetFileDiffRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetFileDiffRequest, GetFileDiffResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.FileDiffResponse.class,
                        GetFileDiffResponse.Builder::fileDiffResponse)
                .handleResponseHeaderString("etag", GetFileDiffResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetFileDiffResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", GetFileDiffResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetMirrorRecordResponse> getMirrorRecord(
            GetMirrorRecordRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetMirrorRecordRequest, GetMirrorRecordResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryMirrorRecord.class,
                        GetMirrorRecordResponse.Builder::repositoryMirrorRecord)
                .handleResponseHeaderString("etag", GetMirrorRecordResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetMirrorRecordResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetObjectResponse> getObject(
            GetObjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryObject.class,
                        GetObjectResponse.Builder::repositoryObject)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetObjectResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetObjectContentResponse> getObjectContent(
            GetObjectContentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetObjectContentRequest, GetObjectContentResponse>
                    handler) {

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
                .handleBody(
                        java.io.InputStream.class, GetObjectContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "opc-request-id", GetObjectContentResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "Content-Type", GetObjectContentResponse.Builder::contentType)
                .handleResponseHeaderString(
                        "Content-Disposition", GetObjectContentResponse.Builder::contentDisposition)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.Project.class,
                        GetProjectResponse.Builder::project)
                .handleResponseHeaderString("etag", GetProjectResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetProjectResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProjectNotificationPreferenceResponse>
            getProjectNotificationPreference(
                    GetProjectNotificationPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetProjectNotificationPreferenceRequest,
                                    GetProjectNotificationPreferenceResponse>
                            handler) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        return clientCall(request, GetProjectNotificationPreferenceResponse::builder)
                .logger(LOG, "getProjectNotificationPreference")
                .serviceDetails(
                        "Devops",
                        "GetProjectNotificationPreference",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectNotificationPreference/GetProjectNotificationPreference")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectNotificationPreferenceRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("principals")
                .appendPathParam(request.getPrincipalId())
                .appendPathParam("pullRequestNotificationPreference")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.ProjectNotificationPreference.class,
                        GetProjectNotificationPreferenceResponse.Builder
                                ::projectNotificationPreference)
                .handleResponseHeaderString(
                        "etag", GetProjectNotificationPreferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetProjectNotificationPreferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetProjectRepositorySettingsResponse>
            getProjectRepositorySettings(
                    GetProjectRepositorySettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetProjectRepositorySettingsRequest,
                                    GetProjectRepositorySettingsResponse>
                            handler) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, GetProjectRepositorySettingsResponse::builder)
                .logger(LOG, "getProjectRepositorySettings")
                .serviceDetails(
                        "Devops",
                        "GetProjectRepositorySettings",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectRepositorySettings/GetProjectRepositorySettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetProjectRepositorySettingsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("repositorySettings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.ProjectRepositorySettings.class,
                        GetProjectRepositorySettingsResponse.Builder::projectRepositorySettings)
                .handleResponseHeaderString(
                        "etag", GetProjectRepositorySettingsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetProjectRepositorySettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestResponse> getPullRequest(
            GetPullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPullRequestRequest, GetPullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, GetPullRequestResponse::builder)
                .logger(LOG, "getPullRequest")
                .serviceDetails(
                        "Devops",
                        "GetPullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/GetPullRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        GetPullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString("etag", GetPullRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPullRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestAttachmentResponse> getPullRequestAttachment(
            GetPullRequestAttachmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPullRequestAttachmentRequest, GetPullRequestAttachmentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, GetPullRequestAttachmentResponse::builder)
                .logger(LOG, "getPullRequestAttachment")
                .serviceDetails(
                        "Devops",
                        "GetPullRequestAttachment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/GetPullRequestAttachment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPullRequestAttachmentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestAttachment.class,
                        GetPullRequestAttachmentResponse.Builder::pullRequestAttachment)
                .handleResponseHeaderString("etag", GetPullRequestAttachmentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPullRequestAttachmentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestAttachmentContentResponse>
            getPullRequestAttachmentContent(
                    GetPullRequestAttachmentContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPullRequestAttachmentContentRequest,
                                    GetPullRequestAttachmentContentResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getAttachmentId(), "attachmentId must not be blank");

        return clientCall(request, GetPullRequestAttachmentContentResponse::builder)
                .logger(LOG, "getPullRequestAttachmentContent")
                .serviceDetails(
                        "Devops",
                        "GetPullRequestAttachmentContent",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/GetPullRequestAttachmentContent")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPullRequestAttachmentContentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("attachments")
                .appendPathParam(request.getAttachmentId())
                .appendPathParam("content")
                .accept("application/octet-stream")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        GetPullRequestAttachmentContentResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "etag", GetPullRequestAttachmentContentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPullRequestAttachmentContentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestChangeSummaryMetricsResponse>
            getPullRequestChangeSummaryMetrics(
                    GetPullRequestChangeSummaryMetricsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPullRequestChangeSummaryMetricsRequest,
                                    GetPullRequestChangeSummaryMetricsResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, GetPullRequestChangeSummaryMetricsResponse::builder)
                .logger(LOG, "getPullRequestChangeSummaryMetrics")
                .serviceDetails(
                        "Devops",
                        "GetPullRequestChangeSummaryMetrics",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/GetPullRequestChangeSummaryMetrics")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPullRequestChangeSummaryMetricsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("changeSummaryMetrics")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestChangeSummaryMetrics.class,
                        GetPullRequestChangeSummaryMetricsResponse.Builder
                                ::pullRequestChangeSummaryMetrics)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPullRequestChangeSummaryMetricsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestCommentResponse> getPullRequestComment(
            GetPullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetPullRequestCommentRequest, GetPullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");

        return clientCall(request, GetPullRequestCommentResponse::builder)
                .logger(LOG, "getPullRequestComment")
                .serviceDetails(
                        "Devops",
                        "GetPullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/GetPullRequestComment")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        GetPullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString("etag", GetPullRequestCommentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetPullRequestCommentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetPullRequestNotificationPreferenceResponse>
            getPullRequestNotificationPreference(
                    GetPullRequestNotificationPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetPullRequestNotificationPreferenceRequest,
                                    GetPullRequestNotificationPreferenceResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        return clientCall(request, GetPullRequestNotificationPreferenceResponse::builder)
                .logger(LOG, "getPullRequestNotificationPreference")
                .serviceDetails(
                        "Devops",
                        "GetPullRequestNotificationPreference",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequestNotificationPreference/GetPullRequestNotificationPreference")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetPullRequestNotificationPreferenceRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("principals")
                .appendPathParam(request.getPrincipalId())
                .appendPathParam("pullRequestNotificationPreference")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestNotificationPreference.class,
                        GetPullRequestNotificationPreferenceResponse.Builder
                                ::pullRequestNotificationPreference)
                .handleResponseHeaderString(
                        "etag", GetPullRequestNotificationPreferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetPullRequestNotificationPreferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRefResponse> getRef(
            GetRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRefRequest, GetRefResponse> handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryRef.class,
                        GetRefResponse.Builder::repositoryRef)
                .handleResponseHeaderString("etag", GetRefResponse.Builder::etag)
                .handleResponseHeaderString("opc-request-id", GetRefResponse.Builder::opcRequestId)
                .handleResponseHeaderString("Sunset", GetRefResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepoFileDiffResponse> getRepoFileDiff(
            GetRepoFileDiffRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepoFileDiffRequest, GetRepoFileDiffResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.FileDiffResponse.class,
                        GetRepoFileDiffResponse.Builder::fileDiffResponse)
                .handleResponseHeaderString("etag", GetRepoFileDiffResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepoFileDiffResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepoFileLinesResponse> getRepoFileLines(
            GetRepoFileLinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepoFileLinesRequest, GetRepoFileLinesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryFileLines.class,
                        GetRepoFileLinesResponse.Builder::repositoryFileLines)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepoFileLinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRepoFileLinesResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryResponse> getRepository(
            GetRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetRepositoryRequest, GetRepositoryResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.Repository.class,
                        GetRepositoryResponse.Builder::repository)
                .handleResponseHeaderString("etag", GetRepositoryResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryArchiveContentResponse>
            getRepositoryArchiveContent(
                    GetRepositoryArchiveContentRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetRepositoryArchiveContentRequest,
                                    GetRepositoryArchiveContentResponse>
                            handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryFileLinesResponse> getRepositoryFileLines(
            GetRepositoryFileLinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepositoryFileLinesRequest, GetRepositoryFileLinesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryFileLines.class,
                        GetRepositoryFileLinesResponse.Builder::repositoryFileLines)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositoryFileLinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", GetRepositoryFileLinesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "Sunset", GetRepositoryFileLinesResponse.Builder::sunset)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepositoryNotificationPreferenceResponse>
            getRepositoryNotificationPreference(
                    GetRepositoryNotificationPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    GetRepositoryNotificationPreferenceRequest,
                                    GetRepositoryNotificationPreferenceResponse>
                            handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        return clientCall(request, GetRepositoryNotificationPreferenceResponse::builder)
                .logger(LOG, "getRepositoryNotificationPreference")
                .serviceDetails(
                        "Devops",
                        "GetRepositoryNotificationPreference",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryNotificationPreference/GetRepositoryNotificationPreference")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepositoryNotificationPreferenceRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("principals")
                .appendPathParam(request.getPrincipalId())
                .appendPathParam("pullRequestNotificationPreference")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryNotificationPreference.class,
                        GetRepositoryNotificationPreferenceResponse.Builder
                                ::repositoryNotificationPreference)
                .handleResponseHeaderString(
                        "etag", GetRepositoryNotificationPreferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        GetRepositoryNotificationPreferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetRepositorySettingsResponse> getRepositorySettings(
            GetRepositorySettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetRepositorySettingsRequest, GetRepositorySettingsResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, GetRepositorySettingsResponse::builder)
                .logger(LOG, "getRepositorySettings")
                .serviceDetails(
                        "Devops",
                        "GetRepositorySettings",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositorySettings/GetRepositorySettings")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(GetRepositorySettingsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("repositorySettings")
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.RepositorySettings.class,
                        GetRepositorySettingsResponse.Builder::repositorySettings)
                .handleResponseHeaderString("etag", GetRepositorySettingsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetRepositorySettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetTriggerResponse> getTrigger(
            GetTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<GetTriggerRequest, GetTriggerResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.Trigger.class,
                        GetTriggerResponse.Builder::trigger)
                .handleResponseHeaderString("etag", GetTriggerResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", GetTriggerResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            GetWorkRequestRequest, GetWorkRequestResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequest.class,
                        GetWorkRequestResponse.Builder::workRequest)
                .handleResponseHeaderString(
                        "opc-request-id", GetWorkRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderFloat(
                        "retry-after", GetWorkRequestResponse.Builder::retryAfter)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<LikePullRequestCommentResponse> likePullRequestComment(
            LikePullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            LikePullRequestCommentRequest, LikePullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");

        return clientCall(request, LikePullRequestCommentResponse::builder)
                .logger(LOG, "likePullRequestComment")
                .serviceDetails(
                        "Devops",
                        "LikePullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/LikePullRequestComment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(LikePullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .appendPathParam("actions")
                .appendPathParam("like")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        LikePullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString(
                        "opc-request-id", LikePullRequestCommentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", LikePullRequestCommentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListAuthorsResponse> listAuthors(
            ListAuthorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListAuthorsRequest, ListAuthorsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryAuthorCollection.class,
                        ListAuthorsResponse.Builder::repositoryAuthorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListAuthorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListAuthorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBuildPipelineStagesResponse> listBuildPipelineStages(
            ListBuildPipelineStagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipelineStageCollection.class,
                        ListBuildPipelineStagesResponse.Builder::buildPipelineStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildPipelineStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildPipelineStagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBuildPipelinesResponse> listBuildPipelines(
            ListBuildPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBuildPipelinesRequest, ListBuildPipelinesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.BuildPipelineCollection.class,
                        ListBuildPipelinesResponse.Builder::buildPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildPipelinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBuildRunSnapshotsResponse> listBuildRunSnapshots(
            ListBuildRunSnapshotsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListBuildRunSnapshotsRequest, ListBuildRunSnapshotsResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ListBuildRunSnapshotsResponse::builder)
                .logger(LOG, "listBuildRunSnapshots")
                .serviceDetails(
                        "Devops",
                        "ListBuildRunSnapshots",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListBuildRunSnapshots")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListBuildRunSnapshotsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("buildRunSnapshots")
                .appendQueryParam("pipelineId", request.getPipelineId())
                .appendQueryParam("buildRunId", request.getBuildRunId())
                .appendQueryParam("commitId", request.getCommitId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRunSnapshotCollection.class,
                        ListBuildRunSnapshotsResponse.Builder::buildRunSnapshotCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildRunSnapshotsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildRunSnapshotsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListBuildRunsResponse> listBuildRuns(
            ListBuildRunsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListBuildRunsRequest, ListBuildRunsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRunSummaryCollection.class,
                        ListBuildRunsResponse.Builder::buildRunSummaryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListBuildRunsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListBuildRunsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCommitDiffsResponse> listCommitDiffs(
            ListCommitDiffsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListCommitDiffsRequest, ListCommitDiffsResponse>
                    handler) {

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
                .appendQueryParam("targetRepositoryId", request.getTargetRepositoryId())
                .appendQueryParam(
                        "isComparisonFromMergeBase", request.getIsComparisonFromMergeBase())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.DiffCollection.class,
                        ListCommitDiffsResponse.Builder::diffCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCommitDiffsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCommitDiffsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListCommitsResponse> listCommits(
            ListCommitsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListCommitsRequest, ListCommitsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCommitCollection.class,
                        ListCommitsResponse.Builder::repositoryCommitCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListCommitsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListCommitsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionsRequest, ListConnectionsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.ConnectionCollection.class,
                        ListConnectionsResponse.Builder::connectionCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListConnectionsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListConnectionsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDeployArtifactsResponse> listDeployArtifacts(
            ListDeployArtifactsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployArtifactsRequest, ListDeployArtifactsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployArtifactCollection.class,
                        ListDeployArtifactsResponse.Builder::deployArtifactCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployArtifactsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployArtifactsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDeployEnvironmentsResponse> listDeployEnvironments(
            ListDeployEnvironmentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployEnvironmentCollection.class,
                        ListDeployEnvironmentsResponse.Builder::deployEnvironmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployEnvironmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployEnvironmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDeployPipelinesResponse> listDeployPipelines(
            ListDeployPipelinesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployPipelinesRequest, ListDeployPipelinesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployPipelineCollection.class,
                        ListDeployPipelinesResponse.Builder::deployPipelineCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployPipelinesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployPipelinesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDeployStagesResponse> listDeployStages(
            ListDeployStagesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeployStagesRequest, ListDeployStagesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeployStageCollection.class,
                        ListDeployStagesResponse.Builder::deployStageCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeployStagesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeployStagesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListDeploymentsResponse> listDeployments(
            ListDeploymentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListDeploymentsRequest, ListDeploymentsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.DeploymentCollection.class,
                        ListDeploymentsResponse.Builder::deploymentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListDeploymentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListDeploymentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListForkSyncStatusesResponse> listForkSyncStatuses(
            ListForkSyncStatusesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListForkSyncStatusesRequest, ListForkSyncStatusesResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getBranchNameQueryParam(), "branchNameQueryParam is required");

        return clientCall(request, ListForkSyncStatusesResponse::builder)
                .logger(LOG, "listForkSyncStatuses")
                .serviceDetails(
                        "Devops",
                        "ListForkSyncStatuses",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListForkSyncStatuses")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListForkSyncStatusesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("forkSyncStatuses")
                .appendQueryParam("branchNameQueryParam", request.getBranchNameQueryParam())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.ForkSyncStatusCollection.class,
                        ListForkSyncStatusesResponse.Builder::forkSyncStatusCollection)
                .handleResponseHeaderString("etag", ListForkSyncStatusesResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", ListForkSyncStatusesResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListMirrorRecordsResponse> listMirrorRecords(
            ListMirrorRecordsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListMirrorRecordsRequest, ListMirrorRecordsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryMirrorRecordCollection.class,
                        ListMirrorRecordsResponse.Builder::repositoryMirrorRecordCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListMirrorRecordsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListMirrorRecordsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPathsResponse> listPaths(
            ListPathsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListPathsRequest, ListPathsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryPathCollection.class,
                        ListPathsResponse.Builder::repositoryPathCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPathsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListPathsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProjectCommitAnalyticsAuthorsResponse>
            listProjectCommitAnalyticsAuthors(
                    ListProjectCommitAnalyticsAuthorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListProjectCommitAnalyticsAuthorsRequest,
                                    ListProjectCommitAnalyticsAuthorsResponse>
                            handler) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        return clientCall(request, ListProjectCommitAnalyticsAuthorsResponse::builder)
                .logger(LOG, "listProjectCommitAnalyticsAuthors")
                .serviceDetails(
                        "Devops",
                        "ListProjectCommitAnalyticsAuthors",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListProjectCommitAnalyticsAuthors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProjectCommitAnalyticsAuthorsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("commitAnalyticsAuthors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.CommitAnalyticsAuthorCollection.class,
                        ListProjectCommitAnalyticsAuthorsResponse.Builder
                                ::commitAnalyticsAuthorCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListProjectCommitAnalyticsAuthorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListProjectCommitAnalyticsAuthorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.devops.model.ProjectCollection.class,
                        ListProjectsResponse.Builder::projectCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProjectsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProjectsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListProtectedBranchesResponse> listProtectedBranches(
            ListProtectedBranchesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListProtectedBranchesRequest, ListProtectedBranchesResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListProtectedBranchesResponse::builder)
                .logger(LOG, "listProtectedBranches")
                .serviceDetails(
                        "Devops",
                        "ListProtectedBranches",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProtectedBranchCollection/ListProtectedBranches")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListProtectedBranchesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("protectedBranches")
                .appendQueryParam("name", request.getName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.ProtectedBranchCollection.class,
                        ListProtectedBranchesResponse.Builder::protectedBranchCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListProtectedBranchesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListProtectedBranchesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestActivitiesResponse> listPullRequestActivities(
            ListPullRequestActivitiesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestActivitiesRequest, ListPullRequestActivitiesResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ListPullRequestActivitiesResponse::builder)
                .logger(LOG, "listPullRequestActivities")
                .serviceDetails(
                        "Devops",
                        "ListPullRequestActivities",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ListPullRequestActivities")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestActivitiesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("activities")
                .appendEnumQueryParam("activityType", request.getActivityType())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestActivityCollection.class,
                        ListPullRequestActivitiesResponse.Builder::pullRequestActivityCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestActivitiesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestActivitiesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestAttachmentsResponse>
            listPullRequestAttachments(
                    ListPullRequestAttachmentsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPullRequestAttachmentsRequest,
                                    ListPullRequestAttachmentsResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ListPullRequestAttachmentsResponse::builder)
                .logger(LOG, "listPullRequestAttachments")
                .serviceDetails(
                        "Devops",
                        "ListPullRequestAttachments",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ListPullRequestAttachments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestAttachmentsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("attachments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("fileName", request.getFileName())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestAttachmentCollection.class,
                        ListPullRequestAttachmentsResponse.Builder::pullRequestAttachmentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestAttachmentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestAttachmentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestAuthorsResponse> listPullRequestAuthors(
            ListPullRequestAuthorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestAuthorsRequest, ListPullRequestAuthorsResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListPullRequestAuthorsResponse::builder)
                .logger(LOG, "listPullRequestAuthors")
                .serviceDetails(
                        "Devops",
                        "ListPullRequestAuthors",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListPullRequestAuthors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestAuthorsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("pullRequestAuthors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestAuthorCollection.class,
                        ListPullRequestAuthorsResponse.Builder::pullRequestAuthorCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestAuthorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestAuthorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestCommentsResponse> listPullRequestComments(
            ListPullRequestCommentsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestCommentsRequest, ListPullRequestCommentsResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ListPullRequestCommentsResponse::builder)
                .logger(LOG, "listPullRequestComments")
                .serviceDetails(
                        "Devops",
                        "ListPullRequestComments",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ListPullRequestComments")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestCommentsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .appendQueryParam("commentId", request.getCommentId())
                .appendQueryParam("commitId", request.getCommitId())
                .appendQueryParam("filePath", request.getFilePath())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestCommentCollection.class,
                        ListPullRequestCommentsResponse.Builder::pullRequestCommentCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestCommentsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestCommentsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestCommitsResponse> listPullRequestCommits(
            ListPullRequestCommitsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestCommitsRequest, ListPullRequestCommitsResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ListPullRequestCommitsResponse::builder)
                .logger(LOG, "listPullRequestCommits")
                .serviceDetails(
                        "Devops",
                        "ListPullRequestCommits",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ListPullRequestCommits")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestCommitsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("commits")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCommitCollection.class,
                        ListPullRequestCommitsResponse.Builder::repositoryCommitCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestCommitsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestCommitsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestFileChangesResponse>
            listPullRequestFileChanges(
                    ListPullRequestFileChangesRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListPullRequestFileChangesRequest,
                                    ListPullRequestFileChangesResponse>
                            handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ListPullRequestFileChangesResponse::builder)
                .logger(LOG, "listPullRequestFileChanges")
                .serviceDetails(
                        "Devops",
                        "ListPullRequestFileChanges",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ListPullRequestFileChanges")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestFileChangesRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("fileChanges")
                .appendQueryParam("filePath", request.getFilePath())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestFileChangeCollection.class,
                        ListPullRequestFileChangesResponse.Builder::pullRequestFileChangeCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestFileChangesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestFileChangesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListPullRequestsResponse> listPullRequests(
            ListPullRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestsRequest, ListPullRequestsResponse>
                    handler) {

        return clientCall(request, ListPullRequestsResponse::builder)
                .logger(LOG, "listPullRequests")
                .serviceDetails(
                        "Devops",
                        "ListPullRequests",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequestCollection/ListPullRequests")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListPullRequestsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendQueryParam("compartmentId", request.getCompartmentId())
                .appendEnumQueryParam("lifecycleState", request.getLifecycleState())
                .appendEnumQueryParam("lifecycleDetails", request.getLifecycleDetails())
                .appendQueryParam("repositoryId", request.getRepositoryId())
                .appendQueryParam("displayName", request.getDisplayName())
                .appendQueryParam("id", request.getId())
                .appendQueryParam("createdBy", request.getCreatedBy())
                .appendQueryParam("destinationBranch", request.getDestinationBranch())
                .appendQueryParam("sourceBranch", request.getSourceBranch())
                .appendQueryParam("reviewerPrincipalId", request.getReviewerPrincipalId())
                .appendQueryParam("sourceRepositoryId", request.getSourceRepositoryId())
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestCollection.class,
                        ListPullRequestsResponse.Builder::pullRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListPullRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListPullRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRefsResponse> listRefs(
            ListRefsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListRefsRequest, ListRefsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryRefCollection.class,
                        ListRefsResponse.Builder::repositoryRefCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRefsResponse.Builder::opcRequestId)
                .handleResponseHeaderString("opc-next-page", ListRefsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoriesResponse> listRepositories(
            ListRepositoriesRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListRepositoriesRequest, ListRepositoriesResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryCollection.class,
                        ListRepositoriesResponse.Builder::repositoryCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListRepositoriesResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListRepositoriesResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListRepositoryCommitAnalyticsAuthorsResponse>
            listRepositoryCommitAnalyticsAuthors(
                    ListRepositoryCommitAnalyticsAuthorsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ListRepositoryCommitAnalyticsAuthorsRequest,
                                    ListRepositoryCommitAnalyticsAuthorsResponse>
                            handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        return clientCall(request, ListRepositoryCommitAnalyticsAuthorsResponse::builder)
                .logger(LOG, "listRepositoryCommitAnalyticsAuthors")
                .serviceDetails(
                        "Devops",
                        "ListRepositoryCommitAnalyticsAuthors",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/ListRepositoryCommitAnalyticsAuthors")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(ListRepositoryCommitAnalyticsAuthorsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("commitAnalyticsAuthors")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .appendEnumQueryParam("sortOrder", request.getSortOrder())
                .appendEnumQueryParam("sortBy", request.getSortBy())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.CommitAnalyticsAuthorCollection.class,
                        ListRepositoryCommitAnalyticsAuthorsResponse.Builder
                                ::commitAnalyticsAuthorCollection)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ListRepositoryCommitAnalyticsAuthorsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        ListRepositoryCommitAnalyticsAuthorsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListTriggersResponse> listTriggers(
            ListTriggersRequest request,
            final com.oracle.bmc.responses.AsyncHandler<ListTriggersRequest, ListTriggersResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.TriggerCollection.class,
                        ListTriggersResponse.Builder::triggerCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListTriggersResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListTriggersResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequestErrorCollection.class,
                        ListWorkRequestErrorsResponse.Builder::workRequestErrorCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestErrorsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestErrorsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequestLogEntryCollection.class,
                        ListWorkRequestLogsResponse.Builder::workRequestLogEntryCollection)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestLogsResponse.Builder::opcNextPage)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestLogsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler) {
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
                .handleBody(
                        com.oracle.bmc.devops.model.WorkRequestCollection.class,
                        ListWorkRequestsResponse.Builder::workRequestCollection)
                .handleResponseHeaderString(
                        "opc-request-id", ListWorkRequestsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", ListWorkRequestsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MergePullRequestResponse> mergePullRequest(
            MergePullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MergePullRequestRequest, MergePullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(
                request.getMergePullRequestDetails(), "mergePullRequestDetails is required");

        return clientCall(request, MergePullRequestResponse::builder)
                .logger(LOG, "mergePullRequest")
                .serviceDetails(
                        "Devops",
                        "MergePullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/MergePullRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(MergePullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("actions")
                .appendPathParam("merge")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        MergePullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString(
                        "content-location", MergePullRequestResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", MergePullRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", MergePullRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MergePullRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<MirrorRepositoryResponse> mirrorRepository(
            MirrorRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            MirrorRepositoryRequest, MirrorRepositoryResponse>
                    handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id", MirrorRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", MirrorRepositoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PatchPullRequestResponse> patchPullRequest(
            PatchPullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PatchPullRequestRequest, PatchPullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(
                request.getPatchPullRequestDetails(), "patchPullRequestDetails is required");

        return clientCall(request, PatchPullRequestResponse::builder)
                .logger(LOG, "patchPullRequest")
                .serviceDetails(
                        "Devops",
                        "PatchPullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/PatchPullRequest")
                .method(com.oracle.bmc.http.client.Method.PATCH)
                .requestBuilder(PatchPullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        PatchPullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString("location", PatchPullRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", PatchPullRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", PatchPullRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<PutRepositoryRefResponse> putRepositoryRef(
            PutRepositoryRefRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            PutRepositoryRefRequest, PutRepositoryRefResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReopenPullRequestResponse> reopenPullRequest(
            ReopenPullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReopenPullRequestRequest, ReopenPullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        return clientCall(request, ReopenPullRequestResponse::builder)
                .logger(LOG, "reopenPullRequest")
                .serviceDetails(
                        "Devops",
                        "ReopenPullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ReopenPullRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReopenPullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("actions")
                .appendPathParam("reopen")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        ReopenPullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString("location", ReopenPullRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", ReopenPullRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ReopenPullRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReopenPullRequestCommentResponse> reopenPullRequestComment(
            ReopenPullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReopenPullRequestCommentRequest, ReopenPullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");

        return clientCall(request, ReopenPullRequestCommentResponse::builder)
                .logger(LOG, "reopenPullRequestComment")
                .serviceDetails(
                        "Devops",
                        "ReopenPullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ReopenPullRequestComment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReopenPullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .appendPathParam("actions")
                .appendPathParam("reopen")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        ReopenPullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString(
                        "opc-request-id", ReopenPullRequestCommentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ReopenPullRequestCommentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ResolvePullRequestCommentResponse> resolvePullRequestComment(
            ResolvePullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ResolvePullRequestCommentRequest, ResolvePullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");

        return clientCall(request, ResolvePullRequestCommentResponse::builder)
                .logger(LOG, "resolvePullRequestComment")
                .serviceDetails(
                        "Devops",
                        "ResolvePullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ResolvePullRequestComment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ResolvePullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .appendPathParam("actions")
                .appendPathParam("resolve")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        ResolvePullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString(
                        "opc-request-id", ResolvePullRequestCommentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ResolvePullRequestCommentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ReviewPullRequestResponse> reviewPullRequest(
            ReviewPullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ReviewPullRequestRequest, ReviewPullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(
                request.getReviewPullRequestDetails(), "reviewPullRequestDetails is required");

        return clientCall(request, ReviewPullRequestResponse::builder)
                .logger(LOG, "reviewPullRequest")
                .serviceDetails(
                        "Devops",
                        "ReviewPullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/ReviewPullRequest")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(ReviewPullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("actions")
                .appendPathParam("review")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        ReviewPullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString("location", ReviewPullRequestResponse.Builder::location)
                .handleResponseHeaderString(
                        "opc-request-id", ReviewPullRequestResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ReviewPullRequestResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ScheduleCascadingProjectDeletionResponse>
            scheduleCascadingProjectDeletion(
                    ScheduleCascadingProjectDeletionRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCascadingProjectDeletionRequest,
                                    ScheduleCascadingProjectDeletionResponse>
                            handler) {

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
                .handleResponseHeaderString(
                        "opc-work-request-id",
                        ScheduleCascadingProjectDeletionResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id",
                        ScheduleCascadingProjectDeletionResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeProjectRepositoryAnalyticsResponse>
            summarizeProjectRepositoryAnalytics(
                    SummarizeProjectRepositoryAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeProjectRepositoryAnalyticsRequest,
                                    SummarizeProjectRepositoryAnalyticsResponse>
                            handler) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getSummarizeProjectRepositoryAnalyticsDetails(),
                "summarizeProjectRepositoryAnalyticsDetails is required");

        return clientCall(request, SummarizeProjectRepositoryAnalyticsResponse::builder)
                .logger(LOG, "summarizeProjectRepositoryAnalytics")
                .serviceDetails(
                        "Devops",
                        "SummarizeProjectRepositoryAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryMetricAggregation/SummarizeProjectRepositoryAnalytics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SummarizeProjectRepositoryAnalyticsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("repositoryAnalytics")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryMetricAggregation.class,
                        SummarizeProjectRepositoryAnalyticsResponse.Builder
                                ::repositoryMetricAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeProjectRepositoryAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page",
                        SummarizeProjectRepositoryAnalyticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SummarizeRepositoryAnalyticsResponse>
            summarizeRepositoryAnalytics(
                    SummarizeRepositoryAnalyticsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeRepositoryAnalyticsRequest,
                                    SummarizeRepositoryAnalyticsResponse>
                            handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getSummarizeRepositoryAnalyticsDetails(),
                "summarizeRepositoryAnalyticsDetails is required");

        return clientCall(request, SummarizeRepositoryAnalyticsResponse::builder)
                .logger(LOG, "summarizeRepositoryAnalytics")
                .serviceDetails(
                        "Devops",
                        "SummarizeRepositoryAnalytics",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryMetricAggregation/SummarizeRepositoryAnalytics")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SummarizeRepositoryAnalyticsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repository")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("repositoryAnalytics")
                .appendQueryParam("limit", request.getLimit())
                .appendQueryParam("page", request.getPage())
                .accept("application/json")
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryMetricAggregation.class,
                        SummarizeRepositoryAnalyticsResponse.Builder::repositoryMetricAggregation)
                .handleResponseHeaderString(
                        "opc-request-id",
                        SummarizeRepositoryAnalyticsResponse.Builder::opcRequestId)
                .handleResponseHeaderString(
                        "opc-next-page", SummarizeRepositoryAnalyticsResponse.Builder::opcNextPage)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<SyncRepositoryResponse> syncRepository(
            SyncRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            SyncRepositoryRequest, SyncRepositoryResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(request.getSyncMergeStrategy(), "syncMergeStrategy is required");

        Objects.requireNonNull(
                request.getSyncRepositoryDetails(), "syncRepositoryDetails is required");

        return clientCall(request, SyncRepositoryResponse::builder)
                .logger(LOG, "syncRepository")
                .serviceDetails(
                        "Devops",
                        "SyncRepository",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/Repository/SyncRepository")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(SyncRepositoryRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("actions")
                .appendPathParam("sync")
                .appendEnumQueryParam("syncMergeStrategy", request.getSyncMergeStrategy())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .hasBody()
                .handleResponseHeaderString(
                        "opc-work-request-id", SyncRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", SyncRepositoryResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<TriggerDeploymentDryRunResponse> triggerDeploymentDryRun(
            TriggerDeploymentDryRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            TriggerDeploymentDryRunRequest, TriggerDeploymentDryRunResponse>
                    handler) {
        Objects.requireNonNull(
                request.getTriggerDeploymentDryRunDetails(),
                "triggerDeploymentDryRunDetails is required");

        return clientCall(request, TriggerDeploymentDryRunResponse::builder)
                .logger(LOG, "triggerDeploymentDryRun")
                .serviceDetails(
                        "Devops",
                        "TriggerDeploymentDryRun",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/TriggerDryRunResult/TriggerDeploymentDryRun")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(TriggerDeploymentDryRunRequest::builder)
                .basePath("/20210630")
                .appendPathParam("deployments")
                .appendPathParam("actions")
                .appendPathParam("triggerDryRun")
                .accept("application/json")
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.TriggerDryRunResult.class,
                        TriggerDeploymentDryRunResponse.Builder::triggerDryRunResult)
                .handleResponseHeaderString(
                        "opc-request-id", TriggerDeploymentDryRunResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnlikePullRequestCommentResponse> unlikePullRequestComment(
            UnlikePullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnlikePullRequestCommentRequest, UnlikePullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");

        return clientCall(request, UnlikePullRequestCommentResponse::builder)
                .logger(LOG, "unlikePullRequestComment")
                .serviceDetails(
                        "Devops",
                        "UnlikePullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/UnlikePullRequestComment")
                .method(com.oracle.bmc.http.client.Method.POST)
                .requestBuilder(UnlikePullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .appendPathParam("actions")
                .appendPathParam("unlike")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        UnlikePullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString(
                        "opc-request-id", UnlikePullRequestCommentResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UnlikePullRequestCommentResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribePullRequestResponse> unsubscribePullRequest(
            UnsubscribePullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UnsubscribePullRequestRequest, UnsubscribePullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(request.getToken(), "token is required");

        return clientCall(request, UnsubscribePullRequestResponse::builder)
                .logger(LOG, "unsubscribePullRequest")
                .serviceDetails(
                        "Devops",
                        "UnsubscribePullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/UnsubscribePullRequest")
                .method(com.oracle.bmc.http.client.Method.GET)
                .requestBuilder(UnsubscribePullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("actions")
                .appendPathParam("unsubscribe")
                .appendQueryParam("token", request.getToken())
                .accept("text/html")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .handleBody(
                        java.io.InputStream.class,
                        UnsubscribePullRequestResponse.Builder::inputStream)
                .handleResponseHeaderString(
                        "content-location", UnsubscribePullRequestResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", UnsubscribePullRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UnsubscribePullRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildPipelineResponse> updateBuildPipeline(
            UpdateBuildPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildPipelineRequest, UpdateBuildPipelineResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildPipelineStageResponse> updateBuildPipelineStage(
            UpdateBuildPipelineStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildPipelineStageRequest, UpdateBuildPipelineStageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildRunResponse> updateBuildRun(
            UpdateBuildRunRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildRunRequest, UpdateBuildRunResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.BuildRun.class,
                        UpdateBuildRunResponse.Builder::buildRun)
                .handleResponseHeaderString("etag", UpdateBuildRunResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateBuildRunResponse.Builder::opcRequestId)
                .handleResponseHeaderString("location", UpdateBuildRunResponse.Builder::location)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateConnectionRequest, UpdateConnectionResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployArtifactResponse> updateDeployArtifact(
            UpdateDeployArtifactRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployArtifactRequest, UpdateDeployArtifactResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployEnvironmentResponse> updateDeployEnvironment(
            UpdateDeployEnvironmentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployEnvironmentRequest, UpdateDeployEnvironmentResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployPipelineResponse> updateDeployPipeline(
            UpdateDeployPipelineRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployPipelineRequest, UpdateDeployPipelineResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeployStageResponse> updateDeployStage(
            UpdateDeployStageRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployStageRequest, UpdateDeployStageResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeploymentResponse> updateDeployment(
            UpdateDeploymentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeploymentRequest, UpdateDeploymentResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Deployment.class,
                        UpdateDeploymentResponse.Builder::deployment)
                .handleResponseHeaderString("etag", UpdateDeploymentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateDeploymentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectNotificationPreferenceResponse>
            updateProjectNotificationPreference(
                    UpdateProjectNotificationPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateProjectNotificationPreferenceRequest,
                                    UpdateProjectNotificationPreferenceResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateProjectNotificationPreferenceDetails(),
                "updateProjectNotificationPreferenceDetails is required");

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");

        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        return clientCall(request, UpdateProjectNotificationPreferenceResponse::builder)
                .logger(LOG, "updateProjectNotificationPreference")
                .serviceDetails(
                        "Devops",
                        "UpdateProjectNotificationPreference",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectNotificationPreference/UpdateProjectNotificationPreference")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectNotificationPreferenceRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("principals")
                .appendPathParam(request.getPrincipalId())
                .appendPathParam("pullRequestNotificationPreference")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.ProjectNotificationPreference.class,
                        UpdateProjectNotificationPreferenceResponse.Builder
                                ::projectNotificationPreference)
                .handleResponseHeaderString(
                        "location", UpdateProjectNotificationPreferenceResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", UpdateProjectNotificationPreferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateProjectNotificationPreferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateProjectRepositorySettingsResponse>
            updateProjectRepositorySettings(
                    UpdateProjectRepositorySettingsRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateProjectRepositorySettingsRequest,
                                    UpdateProjectRepositorySettingsResponse>
                            handler) {

        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(
                request.getUpdateProjectRepositorySettingsDetails(),
                "updateProjectRepositorySettingsDetails is required");

        return clientCall(request, UpdateProjectRepositorySettingsResponse::builder)
                .logger(LOG, "updateProjectRepositorySettings")
                .serviceDetails(
                        "Devops",
                        "UpdateProjectRepositorySettings",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/ProjectRepositorySettings/UpdateProjectRepositorySettings")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateProjectRepositorySettingsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("projects")
                .appendPathParam(request.getProjectId())
                .appendPathParam("repositorySettings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.ProjectRepositorySettings.class,
                        UpdateProjectRepositorySettingsResponse.Builder::projectRepositorySettings)
                .handleResponseHeaderString(
                        "location", UpdateProjectRepositorySettingsResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", UpdateProjectRepositorySettingsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateProjectRepositorySettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestResponse> updatePullRequest(
            UpdatePullRequestRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePullRequestRequest, UpdatePullRequestResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePullRequestDetails(), "updatePullRequestDetails is required");

        return clientCall(request, UpdatePullRequestResponse::builder)
                .logger(LOG, "updatePullRequest")
                .serviceDetails(
                        "Devops",
                        "UpdatePullRequest",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/UpdatePullRequest")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePullRequestRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequest.class,
                        UpdatePullRequestResponse.Builder::pullRequest)
                .handleResponseHeaderString(
                        "content-location", UpdatePullRequestResponse.Builder::contentLocation)
                .handleResponseHeaderString("etag", UpdatePullRequestResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdatePullRequestResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePullRequestResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestCommentResponse> updatePullRequestComment(
            UpdatePullRequestCommentRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdatePullRequestCommentRequest, UpdatePullRequestCommentResponse>
                    handler) {

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getCommentId(), "commentId must not be blank");
        Objects.requireNonNull(
                request.getUpdatePullRequestCommentDetails(),
                "updatePullRequestCommentDetails is required");

        return clientCall(request, UpdatePullRequestCommentResponse::builder)
                .logger(LOG, "updatePullRequestComment")
                .serviceDetails(
                        "Devops",
                        "UpdatePullRequestComment",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequest/UpdatePullRequestComment")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePullRequestCommentRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("comments")
                .appendPathParam(request.getCommentId())
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestComment.class,
                        UpdatePullRequestCommentResponse.Builder::pullRequestComment)
                .handleResponseHeaderString("etag", UpdatePullRequestCommentResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdatePullRequestCommentResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdatePullRequestNotificationPreferenceResponse>
            updatePullRequestNotificationPreference(
                    UpdatePullRequestNotificationPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePullRequestNotificationPreferenceRequest,
                                    UpdatePullRequestNotificationPreferenceResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdatePullRequestNotificationPreferenceDetails(),
                "updatePullRequestNotificationPreferenceDetails is required");

        Validate.notBlank(request.getPullRequestId(), "pullRequestId must not be blank");

        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        return clientCall(request, UpdatePullRequestNotificationPreferenceResponse::builder)
                .logger(LOG, "updatePullRequestNotificationPreference")
                .serviceDetails(
                        "Devops",
                        "UpdatePullRequestNotificationPreference",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/PullRequestNotificationPreference/UpdatePullRequestNotificationPreference")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdatePullRequestNotificationPreferenceRequest::builder)
                .basePath("/20210630")
                .appendPathParam("pullRequests")
                .appendPathParam(request.getPullRequestId())
                .appendPathParam("principals")
                .appendPathParam(request.getPrincipalId())
                .appendPathParam("pullRequestNotificationPreference")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.PullRequestNotificationPreference.class,
                        UpdatePullRequestNotificationPreferenceResponse.Builder
                                ::pullRequestNotificationPreference)
                .handleResponseHeaderString(
                        "location",
                        UpdatePullRequestNotificationPreferenceResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", UpdatePullRequestNotificationPreferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdatePullRequestNotificationPreferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryResponse> updateRepository(
            UpdateRepositoryRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRepositoryRequest, UpdateRepositoryResponse>
                    handler) {

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
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.Repository.class,
                        UpdateRepositoryResponse.Builder::repository)
                .handleResponseHeaderString(
                        "opc-work-request-id", UpdateRepositoryResponse.Builder::opcWorkRequestId)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRepositoryResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", UpdateRepositoryResponse.Builder::etag)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositoryNotificationPreferenceResponse>
            updateRepositoryNotificationPreference(
                    UpdateRepositoryNotificationPreferenceRequest request,
                    final com.oracle.bmc.responses.AsyncHandler<
                                    UpdateRepositoryNotificationPreferenceRequest,
                                    UpdateRepositoryNotificationPreferenceResponse>
                            handler) {
        Objects.requireNonNull(
                request.getUpdateRepositoryNotificationPreferenceDetails(),
                "updateRepositoryNotificationPreferenceDetails is required");

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");

        Validate.notBlank(request.getPrincipalId(), "principalId must not be blank");

        return clientCall(request, UpdateRepositoryNotificationPreferenceResponse::builder)
                .logger(LOG, "updateRepositoryNotificationPreference")
                .serviceDetails(
                        "Devops",
                        "UpdateRepositoryNotificationPreference",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositoryNotificationPreference/UpdateRepositoryNotificationPreference")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRepositoryNotificationPreferenceRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("principals")
                .appendPathParam(request.getPrincipalId())
                .appendPathParam("pullRequestNotificationPreference")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositoryNotificationPreference.class,
                        UpdateRepositoryNotificationPreferenceResponse.Builder
                                ::repositoryNotificationPreference)
                .handleResponseHeaderString(
                        "location",
                        UpdateRepositoryNotificationPreferenceResponse.Builder::location)
                .handleResponseHeaderString(
                        "etag", UpdateRepositoryNotificationPreferenceResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id",
                        UpdateRepositoryNotificationPreferenceResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateRepositorySettingsResponse> updateRepositorySettings(
            UpdateRepositorySettingsRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            UpdateRepositorySettingsRequest, UpdateRepositorySettingsResponse>
                    handler) {

        Validate.notBlank(request.getRepositoryId(), "repositoryId must not be blank");
        Objects.requireNonNull(
                request.getUpdateRepositorySettingsDetails(),
                "updateRepositorySettingsDetails is required");

        return clientCall(request, UpdateRepositorySettingsResponse::builder)
                .logger(LOG, "updateRepositorySettings")
                .serviceDetails(
                        "Devops",
                        "UpdateRepositorySettings",
                        "https://docs.oracle.com/iaas/api/#/en/devops/20210630/RepositorySettings/UpdateRepositorySettings")
                .method(com.oracle.bmc.http.client.Method.PUT)
                .requestBuilder(UpdateRepositorySettingsRequest::builder)
                .basePath("/20210630")
                .appendPathParam("repositories")
                .appendPathParam(request.getRepositoryId())
                .appendPathParam("repositorySettings")
                .accept("application/json")
                .appendHeader("if-match", request.getIfMatch())
                .appendHeader("opc-retry-token", request.getOpcRetryToken())
                .appendHeader("opc-request-id", request.getOpcRequestId())
                .hasBody()
                .handleBody(
                        com.oracle.bmc.devops.model.RepositorySettings.class,
                        UpdateRepositorySettingsResponse.Builder::repositorySettings)
                .handleResponseHeaderString(
                        "location", UpdateRepositorySettingsResponse.Builder::location)
                .handleResponseHeaderString("etag", UpdateRepositorySettingsResponse.Builder::etag)
                .handleResponseHeaderString(
                        "opc-request-id", UpdateRepositorySettingsResponse.Builder::opcRequestId)
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<UpdateTriggerResponse> updateTrigger(
            UpdateTriggerRequest request,
            final com.oracle.bmc.responses.AsyncHandler<UpdateTriggerRequest, UpdateTriggerResponse>
                    handler) {

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
                .callAsync(handler);
    }

    @Override
    public java.util.concurrent.Future<ValidateConnectionResponse> validateConnection(
            ValidateConnectionRequest request,
            final com.oracle.bmc.responses.AsyncHandler<
                            ValidateConnectionRequest, ValidateConnectionResponse>
                    handler) {

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
                .handleBody(
                        com.oracle.bmc.devops.model.Connection.class,
                        ValidateConnectionResponse.Builder::connection)
                .handleResponseHeaderString(
                        "opc-request-id", ValidateConnectionResponse.Builder::opcRequestId)
                .handleResponseHeaderString("etag", ValidateConnectionResponse.Builder::etag)
                .callAsync(handler);
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
    public DevopsAsyncClient(
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
