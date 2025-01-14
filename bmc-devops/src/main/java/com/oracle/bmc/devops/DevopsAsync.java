/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops;

import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;

/**
 * Use the DevOps API to create DevOps projects, configure code repositories, add artifacts to
 * deploy, build and test software applications, configure target deployment environments, and
 * deploy software applications. For more information, see
 * [DevOps](https://docs.cloud.oracle.com/Content/devops/using/home.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public interface DevopsAsync extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this region, however, an
     * IllegalArgumentException will be raised.
     *
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     *
     * <p>Note, this will first try to map the region ID to a known Region and call {@link
     * #setRegion(Region) setRegion}.
     *
     * <p>If no known Region could be determined, it will create an endpoint based on the default
     * endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     *
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Submit stage approval.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApproveDeploymentResponse> approveDeployment(
            ApproveDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ApproveDeploymentRequest, ApproveDeploymentResponse>
                    handler);

    /**
     * Cancels the build run based on the build run ID provided in the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelBuildRunResponse> cancelBuildRun(
            CancelBuildRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelBuildRunRequest, CancelBuildRunResponse>
                    handler);

    /**
     * Cancels a deployment resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelDeploymentResponse> cancelDeployment(
            CancelDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<CancelDeploymentRequest, CancelDeploymentResponse>
                    handler);

    /**
     * Cascading operation that restores Project and child resources from a DELETING state to an
     * active state
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelScheduledCascadingProjectDeletionResponse>
            cancelScheduledCascadingProjectDeletion(
                    CancelScheduledCascadingProjectDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CancelScheduledCascadingProjectDeletionRequest,
                                    CancelScheduledCascadingProjectDeletionResponse>
                            handler);

    /**
     * Moves a project resource from one compartment OCID to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeProjectCompartmentResponse> changeProjectCompartment(
            ChangeProjectCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeProjectCompartmentRequest, ChangeProjectCompartmentResponse>
                    handler);

    /**
     * Creates a new build pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBuildPipelineResponse> createBuildPipeline(
            CreateBuildPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildPipelineRequest, CreateBuildPipelineResponse>
                    handler);

    /**
     * Creates a new stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBuildPipelineStageResponse> createBuildPipelineStage(
            CreateBuildPipelineStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBuildPipelineStageRequest, CreateBuildPipelineStageResponse>
                    handler);

    /**
     * Starts a build pipeline run for a predefined build pipeline. Please ensure the completion of
     * any work request for creation/updation of Build Pipeline before starting a Build Run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBuildRunResponse> createBuildRun(
            CreateBuildRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBuildRunRequest, CreateBuildRunResponse>
                    handler);

    /**
     * Creates a new connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateConnectionRequest, CreateConnectionResponse>
                    handler);

    /**
     * Creates a new deployment artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeployArtifactResponse> createDeployArtifact(
            CreateDeployArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployArtifactRequest, CreateDeployArtifactResponse>
                    handler);

    /**
     * Creates a new deployment environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeployEnvironmentResponse> createDeployEnvironment(
            CreateDeployEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployEnvironmentRequest, CreateDeployEnvironmentResponse>
                    handler);

    /**
     * Creates a new deployment pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeployPipelineResponse> createDeployPipeline(
            CreateDeployPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployPipelineRequest, CreateDeployPipelineResponse>
                    handler);

    /**
     * Creates a new deployment stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeployStageResponse> createDeployStage(
            CreateDeployStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDeployStageRequest, CreateDeployStageResponse>
                    handler);

    /**
     * Creates a new deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeploymentResponse> createDeployment(
            CreateDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDeploymentRequest, CreateDeploymentResponse>
                    handler);

    /**
     * Creates a new reference or updates an existing one.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOrUpdateGitRefResponse> createOrUpdateGitRef(
            CreateOrUpdateGitRefRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOrUpdateGitRefRequest, CreateOrUpdateGitRefResponse>
                    handler);

    /**
     * Creates a restriction on a branch that prevents certain actions on it.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOrUpdateProtectedBranchResponse>
            createOrUpdateProtectedBranch(
                    CreateOrUpdateProtectedBranchRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOrUpdateProtectedBranchRequest,
                                    CreateOrUpdateProtectedBranchResponse>
                            handler);

    /**
     * Creates a new project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler);

    /**
     * Creates a new PullRequest.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePullRequestResponse> createPullRequest(
            CreatePullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePullRequestRequest, CreatePullRequestResponse>
                    handler);

    /**
     * Creates PullRequest attachment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePullRequestAttachmentResponse> createPullRequestAttachment(
            CreatePullRequestAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePullRequestAttachmentRequest, CreatePullRequestAttachmentResponse>
                    handler);

    /**
     * Creates a new PullRequest comment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreatePullRequestCommentResponse> createPullRequestComment(
            CreatePullRequestCommentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePullRequestCommentRequest, CreatePullRequestCommentResponse>
                    handler);

    /**
     * Creates a new repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRepositoryResponse> createRepository(
            CreateRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRepositoryRequest, CreateRepositoryResponse>
                    handler);

    /**
     * Creates a new trigger.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTriggerResponse> createTrigger(
            CreateTriggerRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTriggerRequest, CreateTriggerResponse>
                    handler);

    /**
     * Decline a PullRequest
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeclinePullRequestResponse> declinePullRequest(
            DeclinePullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeclinePullRequestRequest, DeclinePullRequestResponse>
                    handler);

    /**
     * Deletes a build pipeline resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBuildPipelineResponse> deleteBuildPipeline(
            DeleteBuildPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBuildPipelineRequest, DeleteBuildPipelineResponse>
                    handler);

    /**
     * Deletes a stage based on the stage ID provided in the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBuildPipelineStageResponse> deleteBuildPipelineStage(
            DeleteBuildPipelineStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBuildPipelineStageRequest, DeleteBuildPipelineStageResponse>
                    handler);

    /**
     * Deletes a connection resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResponse>
                    handler);

    /**
     * Deletes a deployment artifact resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDeployArtifactResponse> deleteDeployArtifact(
            DeleteDeployArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployArtifactRequest, DeleteDeployArtifactResponse>
                    handler);

    /**
     * Deletes a deployment environment resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDeployEnvironmentResponse> deleteDeployEnvironment(
            DeleteDeployEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployEnvironmentRequest, DeleteDeployEnvironmentResponse>
                    handler);

    /**
     * Deletes a deployment pipeline resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDeployPipelineResponse> deleteDeployPipeline(
            DeleteDeployPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployPipelineRequest, DeleteDeployPipelineResponse>
                    handler);

    /**
     * Deletes a deployment stage resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDeployStageResponse> deleteDeployStage(
            DeleteDeployStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDeployStageRequest, DeleteDeployStageResponse>
                    handler);

    /**
     * Deletes a Repository's Ref by its name. Returns an error if the name is ambiguous. Can be
     * disambiguated by using full names like \"heads/<name>\" or \"tags/<name>\".
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGitRefResponse> deleteGitRef(
            DeleteGitRefRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteGitRefRequest, DeleteGitRefResponse>
                    handler);

    /**
     * Deletes a project resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler);

    /**
     * Removes the custom repository settings configured for a project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProjectRepositorySettingsResponse>
            deleteProjectRepositorySettings(
                    DeleteProjectRepositorySettingsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteProjectRepositorySettingsRequest,
                                    DeleteProjectRepositorySettingsResponse>
                            handler);

    /**
     * Removes the protection from a branch
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProtectedBranchResponse> deleteProtectedBranch(
            DeleteProtectedBranchRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteProtectedBranchRequest, DeleteProtectedBranchResponse>
                    handler);

    /**
     * Deletes a PullRequest resource by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePullRequestResponse> deletePullRequest(
            DeletePullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePullRequestRequest, DeletePullRequestResponse>
                    handler);

    /**
     * Deletes a PullRequest attachment metadata by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePullRequestAttachmentResponse> deletePullRequestAttachment(
            DeletePullRequestAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePullRequestAttachmentRequest, DeletePullRequestAttachmentResponse>
                    handler);

    /**
     * Deletes a PullRequest comment by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePullRequestCommentResponse> deletePullRequestComment(
            DeletePullRequestCommentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePullRequestCommentRequest, DeletePullRequestCommentResponse>
                    handler);

    /**
     * Deletes a Repository's Ref by its name. Returns an error if the name is ambiguous. Can be
     * disambiguated by using full names like \"heads/<name>\" or \"tags/<name>\". This API will be
     * deprecated on Wed, 12 June 2024 01:00:00 GMT as it does not get recognized when refName has
     * '/'. This will be replaced by \"/repositories/{repositoryId}/actions/deleteGitRef\".
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRefResponse> deleteRef(
            DeleteRefRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRefRequest, DeleteRefResponse> handler);

    /**
     * Deletes a repository resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRepositoryResponse> deleteRepository(
            DeleteRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRepositoryRequest, DeleteRepositoryResponse>
                    handler);

    /**
     * Removes the custom settings configured for a repository
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRepositorySettingsResponse> deleteRepositorySettings(
            DeleteRepositorySettingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteRepositorySettingsRequest, DeleteRepositorySettingsResponse>
                    handler);

    /**
     * Deletes a trigger resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTriggerResponse> deleteTrigger(
            DeleteTriggerRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTriggerRequest, DeleteTriggerResponse>
                    handler);

    /**
     * Retrieves a build pipeline by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBuildPipelineResponse> getBuildPipeline(
            GetBuildPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBuildPipelineRequest, GetBuildPipelineResponse>
                    handler);

    /**
     * Retrieves a stage based on the stage ID provided in the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBuildPipelineStageResponse> getBuildPipelineStage(
            GetBuildPipelineStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBuildPipelineStageRequest, GetBuildPipelineStageResponse>
                    handler);

    /**
     * Returns the details of a build run for a given build run ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBuildRunResponse> getBuildRun(
            GetBuildRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetBuildRunRequest, GetBuildRunResponse> handler);

    /**
     * Retrieves a repository's commit by commit ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCommitResponse> getCommit(
            GetCommitRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCommitRequest, GetCommitResponse> handler);

    /**
     * Compares two revisions for their differences. Supports comparison between two references or
     * commits.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCommitDiffResponse> getCommitDiff(
            GetCommitDiffRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCommitDiffRequest, GetCommitDiffResponse>
                    handler);

    /**
     * Retrieves a connection by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler);

    /**
     * Retrieves a deployment artifact by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDeployArtifactResponse> getDeployArtifact(
            GetDeployArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDeployArtifactRequest, GetDeployArtifactResponse>
                    handler);

    /**
     * Retrieves a deployment environment by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDeployEnvironmentResponse> getDeployEnvironment(
            GetDeployEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDeployEnvironmentRequest, GetDeployEnvironmentResponse>
                    handler);

    /**
     * Retrieves a deployment pipeline by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDeployPipelineResponse> getDeployPipeline(
            GetDeployPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDeployPipelineRequest, GetDeployPipelineResponse>
                    handler);

    /**
     * Retrieves a deployment stage by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDeployStageResponse> getDeployStage(
            GetDeployStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDeployStageRequest, GetDeployStageResponse>
                    handler);

    /**
     * Retrieves a deployment by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDeploymentResponse> getDeployment(
            GetDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDeploymentRequest, GetDeploymentResponse>
                    handler);

    /**
     * Gets the line-by-line difference between file on different commits. This API will be
     * deprecated on Wed, 29 Mar 2023 01:00:00 GMT as it does not get recognized when filePath has
     * '/'. This will be replaced by \"/repositories/{repositoryId}/file/diffs\"
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFileDiffResponse> getFileDiff(
            GetFileDiffRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFileDiffRequest, GetFileDiffResponse> handler);

    /**
     * Returns either current mirror record or last successful mirror record for a specific mirror
     * repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMirrorRecordResponse> getMirrorRecord(
            GetMirrorRecordRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetMirrorRecordRequest, GetMirrorRecordResponse>
                    handler);

    /**
     * Retrieves blob of specific branch name/commit ID and file path.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetObjectResponse> getObject(
            GetObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetObjectRequest, GetObjectResponse> handler);

    /**
     * Retrieve contents of a specified object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetObjectContentResponse> getObjectContent(
            GetObjectContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetObjectContentRequest, GetObjectContentResponse>
                    handler);

    /**
     * Retrieves a project by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handler);

    /**
     * Get the project notification preference for the user passed as path param
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProjectNotificationPreferenceResponse>
            getProjectNotificationPreference(
                    GetProjectNotificationPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetProjectNotificationPreferenceRequest,
                                    GetProjectNotificationPreferenceResponse>
                            handler);

    /**
     * Retrieves a project's repository settings details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProjectRepositorySettingsResponse> getProjectRepositorySettings(
            GetProjectRepositorySettingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetProjectRepositorySettingsRequest,
                            GetProjectRepositorySettingsResponse>
                    handler);

    /**
     * Gets a PullRequest by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPullRequestResponse> getPullRequest(
            GetPullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPullRequestRequest, GetPullRequestResponse>
                    handler);

    /**
     * Get PullRequest attachment metadata by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPullRequestAttachmentResponse> getPullRequestAttachment(
            GetPullRequestAttachmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPullRequestAttachmentRequest, GetPullRequestAttachmentResponse>
                    handler);

    /**
     * Gets the content of the attachment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPullRequestAttachmentContentResponse>
            getPullRequestAttachmentContent(
                    GetPullRequestAttachmentContentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPullRequestAttachmentContentRequest,
                                    GetPullRequestAttachmentContentResponse>
                            handler);

    /**
     * Get pull request diff summary metric
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPullRequestChangeSummaryMetricsResponse>
            getPullRequestChangeSummaryMetrics(
                    GetPullRequestChangeSummaryMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPullRequestChangeSummaryMetricsRequest,
                                    GetPullRequestChangeSummaryMetricsResponse>
                            handler);

    /**
     * Get PullRequest comment by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPullRequestCommentResponse> getPullRequestComment(
            GetPullRequestCommentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPullRequestCommentRequest, GetPullRequestCommentResponse>
                    handler);

    /**
     * Get the pull request notification preference for the user passed as path param
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPullRequestNotificationPreferenceResponse>
            getPullRequestNotificationPreference(
                    GetPullRequestNotificationPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPullRequestNotificationPreferenceRequest,
                                    GetPullRequestNotificationPreferenceResponse>
                            handler);

    /**
     * This API will be deprecated on Wed, 12 June 2024 01:00:00 GMT as it does not get recognized
     * when refName has '/'. This will be replaced by \"/repositories/{repositoryId}/refs\".
     * Retrieves a repository's reference by its name with preference for branches over tags if the
     * name is ambiguous. This can be disambiguated by using full names like \"heads/<name>\" or
     * \"tags/<name>\".
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRefResponse> getRef(
            GetRefRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRefRequest, GetRefResponse> handler);

    /**
     * Gets the line-by-line difference between file on different commits.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepoFileDiffResponse> getRepoFileDiff(
            GetRepoFileDiffRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRepoFileDiffRequest, GetRepoFileDiffResponse>
                    handler);

    /**
     * Retrieve lines of a specified file. Supports starting line number and limit.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepoFileLinesResponse> getRepoFileLines(
            GetRepoFileLinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRepoFileLinesRequest, GetRepoFileLinesResponse>
                    handler);

    /**
     * Retrieves a repository by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepositoryResponse> getRepository(
            GetRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRepositoryRequest, GetRepositoryResponse>
                    handler);

    /**
     * Returns the archived repository information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepositoryArchiveContentResponse> getRepositoryArchiveContent(
            GetRepositoryArchiveContentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRepositoryArchiveContentRequest, GetRepositoryArchiveContentResponse>
                    handler);

    /**
     * Retrieve lines of a specified file. Supports starting line number and limit. This API will be
     * deprecated on Wed, 29 Mar 2023 01:00:00 GMT as it does not get recognized when filePath has
     * '/'. This will be replaced by \"/repositories/{repositoryId}/file/lines\"
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepositoryFileLinesResponse> getRepositoryFileLines(
            GetRepositoryFileLinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRepositoryFileLinesRequest, GetRepositoryFileLinesResponse>
                    handler);

    /**
     * Get the repository notification preference for the user passed as path param
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepositoryNotificationPreferenceResponse>
            getRepositoryNotificationPreference(
                    GetRepositoryNotificationPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetRepositoryNotificationPreferenceRequest,
                                    GetRepositoryNotificationPreferenceResponse>
                            handler);

    /**
     * Retrieves a repository's settings details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRepositorySettingsResponse> getRepositorySettings(
            GetRepositorySettingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRepositorySettingsRequest, GetRepositorySettingsResponse>
                    handler);

    /**
     * Retrieves a trigger by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTriggerResponse> getTrigger(
            GetTriggerRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTriggerRequest, GetTriggerResponse> handler);

    /**
     * Retrieves the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Like a PullRequest comment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<LikePullRequestCommentResponse> likePullRequestComment(
            LikePullRequestCommentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            LikePullRequestCommentRequest, LikePullRequestCommentResponse>
                    handler);

    /**
     * Retrieve a list of all the authors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAuthorsResponse> listAuthors(
            ListAuthorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAuthorsRequest, ListAuthorsResponse> handler);

    /**
     * Returns a list of all stages in a compartment or build pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBuildPipelineStagesResponse> listBuildPipelineStages(
            ListBuildPipelineStagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBuildPipelineStagesRequest, ListBuildPipelineStagesResponse>
                    handler);

    /**
     * Returns a list of build pipelines.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBuildPipelinesResponse> listBuildPipelines(
            ListBuildPipelinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBuildPipelinesRequest, ListBuildPipelinesResponse>
                    handler);

    /**
     * Returns a list of build run snapshots for a given commit or the latest commit on a pull
     * request if no commit is provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBuildRunSnapshotsResponse> listBuildRunSnapshots(
            ListBuildRunSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBuildRunSnapshotsRequest, ListBuildRunSnapshotsResponse>
                    handler);

    /**
     * Returns a list of build run summary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBuildRunsResponse> listBuildRuns(
            ListBuildRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBuildRunsRequest, ListBuildRunsResponse>
                    handler);

    /**
     * Compares two revisions and lists the differences. Supports comparison between two references
     * or commits.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCommitDiffsResponse> listCommitDiffs(
            ListCommitDiffsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCommitDiffsRequest, ListCommitDiffsResponse>
                    handler);

    /**
     * Returns a list of commits.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCommitsResponse> listCommits(
            ListCommitsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCommitsRequest, ListCommitsResponse> handler);

    /**
     * Returns a list of connections.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListConnectionsRequest, ListConnectionsResponse>
                    handler);

    /**
     * Returns a list of deployment artifacts.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDeployArtifactsResponse> listDeployArtifacts(
            ListDeployArtifactsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeployArtifactsRequest, ListDeployArtifactsResponse>
                    handler);

    /**
     * Returns a list of deployment environments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDeployEnvironmentsResponse> listDeployEnvironments(
            ListDeployEnvironmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeployEnvironmentsRequest, ListDeployEnvironmentsResponse>
                    handler);

    /**
     * Returns a list of deployment pipelines.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDeployPipelinesResponse> listDeployPipelines(
            ListDeployPipelinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDeployPipelinesRequest, ListDeployPipelinesResponse>
                    handler);

    /**
     * Retrieves a list of deployment stages.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDeployStagesResponse> listDeployStages(
            ListDeployStagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDeployStagesRequest, ListDeployStagesResponse>
                    handler);

    /**
     * Returns a list of deployments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDeploymentsResponse> listDeployments(
            ListDeploymentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDeploymentsRequest, ListDeploymentsResponse>
                    handler);

    /**
     * LIST operation that returns a collection of fork sync status objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListForkSyncStatusesResponse> listForkSyncStatuses(
            ListForkSyncStatusesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListForkSyncStatusesRequest, ListForkSyncStatusesResponse>
                    handler);

    /**
     * Returns a list of mirror entry in history within 30 days.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMirrorRecordsResponse> listMirrorRecords(
            ListMirrorRecordsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMirrorRecordsRequest, ListMirrorRecordsResponse>
                    handler);

    /**
     * Retrieves a list of files and directories in a repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPathsResponse> listPaths(
            ListPathsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPathsRequest, ListPathsResponse> handler);

    /**
     * Retrieve a list of all the Commit Analytics authors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProjectCommitAnalyticsAuthorsResponse>
            listProjectCommitAnalyticsAuthors(
                    ListProjectCommitAnalyticsAuthorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListProjectCommitAnalyticsAuthorsRequest,
                                    ListProjectCommitAnalyticsAuthorsResponse>
                            handler);

    /**
     * Returns a list of projects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler);

    /**
     * Returns a list of Protected Branches.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProtectedBranchesResponse> listProtectedBranches(
            ListProtectedBranchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListProtectedBranchesRequest, ListProtectedBranchesResponse>
                    handler);

    /**
     * List actions that have been taken on a pull request
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestActivitiesResponse> listPullRequestActivities(
            ListPullRequestActivitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestActivitiesRequest, ListPullRequestActivitiesResponse>
                    handler);

    /**
     * List PullRequest level attachments by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestAttachmentsResponse> listPullRequestAttachments(
            ListPullRequestAttachmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestAttachmentsRequest, ListPullRequestAttachmentsResponse>
                    handler);

    /**
     * Retrieve a list of all the PR authors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestAuthorsResponse> listPullRequestAuthors(
            ListPullRequestAuthorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestAuthorsRequest, ListPullRequestAuthorsResponse>
                    handler);

    /**
     * List PullRequest level comments by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestCommentsResponse> listPullRequestComments(
            ListPullRequestCommentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestCommentsRequest, ListPullRequestCommentsResponse>
                    handler);

    /**
     * List pull request commits
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestCommitsResponse> listPullRequestCommits(
            ListPullRequestCommitsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestCommitsRequest, ListPullRequestCommitsResponse>
                    handler);

    /**
     * List pull request file changes
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestFileChangesResponse> listPullRequestFileChanges(
            ListPullRequestFileChangesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPullRequestFileChangesRequest, ListPullRequestFileChangesResponse>
                    handler);

    /**
     * Returns a list of PullRequests.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPullRequestsResponse> listPullRequests(
            ListPullRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPullRequestsRequest, ListPullRequestsResponse>
                    handler);

    /**
     * Returns a list of references.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRefsResponse> listRefs(
            ListRefsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRefsRequest, ListRefsResponse> handler);

    /**
     * Returns a list of repositories given a compartment ID or a project ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRepositoriesResponse> listRepositories(
            ListRepositoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRepositoriesRequest, ListRepositoriesResponse>
                    handler);

    /**
     * Retrieve a list of all the Commit Analytics authors.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRepositoryCommitAnalyticsAuthorsResponse>
            listRepositoryCommitAnalyticsAuthors(
                    ListRepositoryCommitAnalyticsAuthorsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListRepositoryCommitAnalyticsAuthorsRequest,
                                    ListRepositoryCommitAnalyticsAuthorsResponse>
                            handler);

    /**
     * Returns a list of triggers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTriggersResponse> listTriggers(
            ListTriggersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTriggersRequest, ListTriggersResponse>
                    handler);

    /**
     * Returns a list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Returns a list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Merge the PullRequest
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MergePullRequestResponse> mergePullRequest(
            MergePullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<MergePullRequestRequest, MergePullRequestResponse>
                    handler);

    /**
     * Synchronize a mirrored repository to the latest version from external providers.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<MirrorRepositoryResponse> mirrorRepository(
            MirrorRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<MirrorRepositoryRequest, MirrorRepositoryResponse>
                    handler);

    /**
     * Updates the reviewer list of a pull request
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PatchPullRequestResponse> patchPullRequest(
            PatchPullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<PatchPullRequestRequest, PatchPullRequestResponse>
                    handler);

    /**
     * Creates a new reference or updates an existing one. This API will be deprecated on Wed, 12
     * June 2024 01:00:00 GMT as it does not get recognized when refName has '/'. This will be
     * replaced by \"/repositories/{repositoryId}/actions/createOrUpdateGitRef\".
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PutRepositoryRefResponse> putRepositoryRef(
            PutRepositoryRefRequest request,
            com.oracle.bmc.responses.AsyncHandler<PutRepositoryRefRequest, PutRepositoryRefResponse>
                    handler);

    /**
     * Reopen a PullRequest
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReopenPullRequestResponse> reopenPullRequest(
            ReopenPullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReopenPullRequestRequest, ReopenPullRequestResponse>
                    handler);

    /**
     * Review a PullRequest
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ReviewPullRequestResponse> reviewPullRequest(
            ReviewPullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ReviewPullRequestRequest, ReviewPullRequestResponse>
                    handler);

    /**
     * Cascading operation that marks Project and child DevOps resources in a DELETING state for a
     * retention period
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScheduleCascadingProjectDeletionResponse>
            scheduleCascadingProjectDeletion(
                    ScheduleCascadingProjectDeletionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ScheduleCascadingProjectDeletionRequest,
                                    ScheduleCascadingProjectDeletionResponse>
                            handler);

    /**
     * Retrieves repository analytics for a given project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeProjectRepositoryAnalyticsResponse>
            summarizeProjectRepositoryAnalytics(
                    SummarizeProjectRepositoryAnalyticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeProjectRepositoryAnalyticsRequest,
                                    SummarizeProjectRepositoryAnalyticsResponse>
                            handler);

    /**
     * Retrieves repository analytics for a given repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeRepositoryAnalyticsResponse> summarizeRepositoryAnalytics(
            SummarizeRepositoryAnalyticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeRepositoryAnalyticsRequest,
                            SummarizeRepositoryAnalyticsResponse>
                    handler);

    /**
     * Synchronize a forked repository to the latest version
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SyncRepositoryResponse> syncRepository(
            SyncRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<SyncRepositoryRequest, SyncRepositoryResponse>
                    handler);

    /**
     * Unlike a PullRequest comment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnlikePullRequestCommentResponse> unlikePullRequestComment(
            UnlikePullRequestCommentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UnlikePullRequestCommentRequest, UnlikePullRequestCommentResponse>
                    handler);

    /**
     * unsubscribe the PullRequest
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnsubscribePullRequestResponse> unsubscribePullRequest(
            UnsubscribePullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UnsubscribePullRequestRequest, UnsubscribePullRequestResponse>
                    handler);

    /**
     * Updates the build pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBuildPipelineResponse> updateBuildPipeline(
            UpdateBuildPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildPipelineRequest, UpdateBuildPipelineResponse>
                    handler);

    /**
     * Updates the stage based on the stage ID provided in the request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBuildPipelineStageResponse> updateBuildPipelineStage(
            UpdateBuildPipelineStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBuildPipelineStageRequest, UpdateBuildPipelineStageResponse>
                    handler);

    /**
     * Updates the build run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBuildRunResponse> updateBuildRun(
            UpdateBuildRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateBuildRunRequest, UpdateBuildRunResponse>
                    handler);

    /**
     * Updates the connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResponse>
                    handler);

    /**
     * Updates the deployment artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeployArtifactResponse> updateDeployArtifact(
            UpdateDeployArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployArtifactRequest, UpdateDeployArtifactResponse>
                    handler);

    /**
     * Updates the deployment environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeployEnvironmentResponse> updateDeployEnvironment(
            UpdateDeployEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployEnvironmentRequest, UpdateDeployEnvironmentResponse>
                    handler);

    /**
     * Updates the deployment pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeployPipelineResponse> updateDeployPipeline(
            UpdateDeployPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployPipelineRequest, UpdateDeployPipelineResponse>
                    handler);

    /**
     * Updates the deployment stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeployStageResponse> updateDeployStage(
            UpdateDeployStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDeployStageRequest, UpdateDeployStageResponse>
                    handler);

    /**
     * Updates the deployment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDeploymentResponse> updateDeployment(
            UpdateDeploymentRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDeploymentRequest, UpdateDeploymentResponse>
                    handler);

    /**
     * Updates the project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler);

    /**
     * Update the project notification preference for the user passed as path param
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProjectNotificationPreferenceResponse>
            updateProjectNotificationPreference(
                    UpdateProjectNotificationPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateProjectNotificationPreferenceRequest,
                                    UpdateProjectNotificationPreferenceResponse>
                            handler);

    /**
     * Updates the repository settings for a project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProjectRepositorySettingsResponse>
            updateProjectRepositorySettings(
                    UpdateProjectRepositorySettingsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateProjectRepositorySettingsRequest,
                                    UpdateProjectRepositorySettingsResponse>
                            handler);

    /**
     * Updates the PullRequest
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePullRequestResponse> updatePullRequest(
            UpdatePullRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePullRequestRequest, UpdatePullRequestResponse>
                    handler);

    /**
     * Updates the PullRequest comment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePullRequestCommentResponse> updatePullRequestComment(
            UpdatePullRequestCommentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdatePullRequestCommentRequest, UpdatePullRequestCommentResponse>
                    handler);

    /**
     * Update the pull request notification preference for the user passed as path param
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePullRequestNotificationPreferenceResponse>
            updatePullRequestNotificationPreference(
                    UpdatePullRequestNotificationPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePullRequestNotificationPreferenceRequest,
                                    UpdatePullRequestNotificationPreferenceResponse>
                            handler);

    /**
     * Updates the repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRepositoryResponse> updateRepository(
            UpdateRepositoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRepositoryRequest, UpdateRepositoryResponse>
                    handler);

    /**
     * Update the repository notification preference for the user passed as path param
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRepositoryNotificationPreferenceResponse>
            updateRepositoryNotificationPreference(
                    UpdateRepositoryNotificationPreferenceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateRepositoryNotificationPreferenceRequest,
                                    UpdateRepositoryNotificationPreferenceResponse>
                            handler);

    /**
     * Updates the settings for a repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRepositorySettingsResponse> updateRepositorySettings(
            UpdateRepositorySettingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateRepositorySettingsRequest, UpdateRepositorySettingsResponse>
                    handler);

    /**
     * Updates the trigger.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTriggerResponse> updateTrigger(
            UpdateTriggerRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTriggerRequest, UpdateTriggerResponse>
                    handler);

    /**
     * Return whether the credentials of the connection are valid.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateConnectionResponse> validateConnection(
            ValidateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateConnectionRequest, ValidateConnectionResponse>
                    handler);
}
