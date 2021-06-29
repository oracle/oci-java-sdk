/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops;

import com.oracle.bmc.devops.requests.*;
import com.oracle.bmc.devops.responses.*;

/**
 * Use the DevOps APIs to create a DevOps project to group the pipelines,  add reference to target deployment environments, add artifacts to deploy,  and create deployment pipelines needed to deploy your software.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public interface Devops extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Submit stage approval.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ApproveDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ApproveDeployment API.
     */
    ApproveDeploymentResponse approveDeployment(ApproveDeploymentRequest request);

    /**
     * Cancels a deployment resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CancelDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelDeployment API.
     */
    CancelDeploymentResponse cancelDeployment(CancelDeploymentRequest request);

    /**
     * Moves a project resource from one compartment OCID to another.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ChangeProjectCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeProjectCompartment API.
     */
    ChangeProjectCompartmentResponse changeProjectCompartment(
            ChangeProjectCompartmentRequest request);

    /**
     * Creates a new deployment artifact.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateDeployArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDeployArtifact API.
     */
    CreateDeployArtifactResponse createDeployArtifact(CreateDeployArtifactRequest request);

    /**
     * Creates a new deployment environment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateDeployEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDeployEnvironment API.
     */
    CreateDeployEnvironmentResponse createDeployEnvironment(CreateDeployEnvironmentRequest request);

    /**
     * Creates a new deployment pipeline.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateDeployPipelineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDeployPipeline API.
     */
    CreateDeployPipelineResponse createDeployPipeline(CreateDeployPipelineRequest request);

    /**
     * Creates a new deployment stage.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateDeployStageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDeployStage API.
     */
    CreateDeployStageResponse createDeployStage(CreateDeployStageRequest request);

    /**
     * Creates a new deployment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDeployment API.
     */
    CreateDeploymentResponse createDeployment(CreateDeploymentRequest request);

    /**
     * Creates a new project.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreateProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateProject API.
     */
    CreateProjectResponse createProject(CreateProjectRequest request);

    /**
     * Deletes a deployment artifact resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/DeleteDeployArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDeployArtifact API.
     */
    DeleteDeployArtifactResponse deleteDeployArtifact(DeleteDeployArtifactRequest request);

    /**
     * Deletes a deployment environment resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/DeleteDeployEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDeployEnvironment API.
     */
    DeleteDeployEnvironmentResponse deleteDeployEnvironment(DeleteDeployEnvironmentRequest request);

    /**
     * Deletes a deployment pipeline resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/DeleteDeployPipelineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDeployPipeline API.
     */
    DeleteDeployPipelineResponse deleteDeployPipeline(DeleteDeployPipelineRequest request);

    /**
     * Deletes a deployment stage resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/DeleteDeployStageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDeployStage API.
     */
    DeleteDeployStageResponse deleteDeployStage(DeleteDeployStageRequest request);

    /**
     * Deletes a project resource by identifier
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/DeleteProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteProject API.
     */
    DeleteProjectResponse deleteProject(DeleteProjectRequest request);

    /**
     * Retrieves a deployment artifact by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetDeployArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDeployArtifact API.
     */
    GetDeployArtifactResponse getDeployArtifact(GetDeployArtifactRequest request);

    /**
     * Retrieves a deployment environment by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetDeployEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDeployEnvironment API.
     */
    GetDeployEnvironmentResponse getDeployEnvironment(GetDeployEnvironmentRequest request);

    /**
     * Retrieves a deployment pipeline by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetDeployPipelineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDeployPipeline API.
     */
    GetDeployPipelineResponse getDeployPipeline(GetDeployPipelineRequest request);

    /**
     * Retrieves a deployment stage by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetDeployStageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDeployStage API.
     */
    GetDeployStageResponse getDeployStage(GetDeployStageRequest request);

    /**
     * Retrieves a deployment by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDeployment API.
     */
    GetDeploymentResponse getDeployment(GetDeploymentRequest request);

    /**
     * Retrieves a project by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetProject API.
     */
    GetProjectResponse getProject(GetProjectRequest request);

    /**
     * Retrieves the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list of deployment artifacts.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListDeployArtifactsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDeployArtifacts API.
     */
    ListDeployArtifactsResponse listDeployArtifacts(ListDeployArtifactsRequest request);

    /**
     * Returns a list of deployment environments.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListDeployEnvironmentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDeployEnvironments API.
     */
    ListDeployEnvironmentsResponse listDeployEnvironments(ListDeployEnvironmentsRequest request);

    /**
     * Returns a list of deployment pipelines.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListDeployPipelinesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDeployPipelines API.
     */
    ListDeployPipelinesResponse listDeployPipelines(ListDeployPipelinesRequest request);

    /**
     * Retrieves a list of deployment stages.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListDeployStagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDeployStages API.
     */
    ListDeployStagesResponse listDeployStages(ListDeployStagesRequest request);

    /**
     * Returns a list of deployments.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListDeploymentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDeployments API.
     */
    ListDeploymentsResponse listDeployments(ListDeploymentsRequest request);

    /**
     * Returns a list of projects.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListProjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProjects API.
     */
    ListProjectsResponse listProjects(ListProjectsRequest request);

    /**
     * Returns a list of errors for a given work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a list of logs for a given work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the deployment artifact.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateDeployArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDeployArtifact API.
     */
    UpdateDeployArtifactResponse updateDeployArtifact(UpdateDeployArtifactRequest request);

    /**
     * Updates the deployment environment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateDeployEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDeployEnvironment API.
     */
    UpdateDeployEnvironmentResponse updateDeployEnvironment(UpdateDeployEnvironmentRequest request);

    /**
     * Updates the deployment pipeline.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateDeployPipelineExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDeployPipeline API.
     */
    UpdateDeployPipelineResponse updateDeployPipeline(UpdateDeployPipelineRequest request);

    /**
     * Updates the deployment stage.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateDeployStageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDeployStage API.
     */
    UpdateDeployStageResponse updateDeployStage(UpdateDeployStageRequest request);

    /**
     * Updates the deployment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateDeploymentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDeployment API.
     */
    UpdateDeploymentResponse updateDeployment(UpdateDeploymentRequest request);

    /**
     * Updates the project.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateProject API.
     */
    UpdateProjectResponse updateProject(UpdateProjectRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DevopsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DevopsPaginators getPaginators();
}
