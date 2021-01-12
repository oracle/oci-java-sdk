/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience;

import com.oracle.bmc.datascience.requests.*;
import com.oracle.bmc.datascience.responses.*;

/**
 * Use the Data Science APIs to organize your data science work, access data and computing resources, and build, train, deploy, and manage models on Oracle Cloud.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public interface DataScience extends AutoCloseable {

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
     * Activates the model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ActivateModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateModel API.
     */
    ActivateModelResponse activateModel(ActivateModelRequest request);

    /**
     * Activates the notebook session.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ActivateNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ActivateNotebookSession API.
     */
    ActivateNotebookSessionResponse activateNotebookSession(ActivateNotebookSessionRequest request);

    /**
     * Cancels a work request that has not started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CancelWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Moves a model resource into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ChangeModelCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeModelCompartment API.
     */
    ChangeModelCompartmentResponse changeModelCompartment(ChangeModelCompartmentRequest request);

    /**
     * Moves a notebook session resource into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ChangeNotebookSessionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeNotebookSessionCompartment API.
     */
    ChangeNotebookSessionCompartmentResponse changeNotebookSessionCompartment(
            ChangeNotebookSessionCompartmentRequest request);

    /**
     * Moves a project resource into a different compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ChangeProjectCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeProjectCompartment API.
     */
    ChangeProjectCompartmentResponse changeProjectCompartment(
            ChangeProjectCompartmentRequest request);

    /**
     * Creates a new model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateModel API.
     */
    CreateModelResponse createModel(CreateModelRequest request);

    /**
     * Creates model artifact for specified model.
     *
     * Note: This operation consumes a stream.
     *
     * If the stream supports {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, when a retry is
     * necessary, the stream is reset so it starts at the beginning (or whatever the stream's position was at the time this
     * operation is called}.
     *
     * Note this means that if the caller has used {@link java.io.InputStream#mark(int)} before, then the mark
     * will not be the same anymore after this operation, and a subsequent call to {@link java.io.InputStream#reset()} by
     * the caller will reset the stream not to the caller's mark, but to the position the stream was in when this operation
     * was called.
     *
     * If the stream is a {@link java.io.FileInputStream}, and the stream's {@link java.nio.channels.FileChannel} position
     * can be changed (like for a regular file), the stream will be wrapped in such a way that it does provide
     * support for {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}. Then the same procedure as
     * above is followed. If the stream's {@link java.nio.channels.FileChannel} position cannot be changed (like for a
     * named pipe), then the stream's contents will be buffered in memory, as described below.
     *
     * If the stream does not support {@link java.io.InputStream#mark(int)} and {@link java.io.InputStream#reset()}, then
     * the stream is wrapped in a {@link java.io.BufferedInputStream}, which means the entire contents may
     * be buffered in memory. Then the same procedure as above is followed.
     *
     * The contents of the stream, except when the stream is a {@link java.io.FileInputStream} whose
     * {@link java.nio.channels.FileChannel} position can be changed, should be less than 2 GiB in size if retries are used.
     * This is because streams 2 GiB in size or larger do no guarantee that mark-and-reset can be performed. If the stream
     * is larger, do not use built-in retries and manage retries yourself.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateModelArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateModelArtifact API.
     */
    CreateModelArtifactResponse createModelArtifact(CreateModelArtifactRequest request);

    /**
     * Creates provenance information for the specified model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateModelProvenanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateModelProvenance API.
     */
    CreateModelProvenanceResponse createModelProvenance(CreateModelProvenanceRequest request);

    /**
     * Creates a new notebook session.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateNotebookSession API.
     */
    CreateNotebookSessionResponse createNotebookSession(CreateNotebookSessionRequest request);

    /**
     * Creates a new project.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/CreateProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateProject API.
     */
    CreateProjectResponse createProject(CreateProjectRequest request);

    /**
     * Deactivates the model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeactivateModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeactivateModel API.
     */
    DeactivateModelResponse deactivateModel(DeactivateModelRequest request);

    /**
     * Deactivates the notebook session.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeactivateNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeactivateNotebookSession API.
     */
    DeactivateNotebookSessionResponse deactivateNotebookSession(
            DeactivateNotebookSessionRequest request);

    /**
     * Deletes the specified model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeleteModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteModel API.
     */
    DeleteModelResponse deleteModel(DeleteModelRequest request);

    /**
     * Deletes the specified notebook session. Any unsaved work in this notebook session will be lost.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeleteNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteNotebookSession API.
     */
    DeleteNotebookSessionResponse deleteNotebookSession(DeleteNotebookSessionRequest request);

    /**
     * Deletes the specified project. This operation will fail unless all associated resources (such as notebook sessions or models) are in a DELETED state. You must delete all associated resources before deleting a project.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/DeleteProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteProject API.
     */
    DeleteProjectResponse deleteProject(DeleteProjectRequest request);

    /**
     * Gets the specified model's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModel API.
     */
    GetModelResponse getModel(GetModelRequest request);

    /**
     * Downloads model artifact content for specified model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetModelArtifactContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModelArtifactContent API.
     */
    GetModelArtifactContentResponse getModelArtifactContent(GetModelArtifactContentRequest request);

    /**
     * Gets provenance information for specified model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetModelProvenanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModelProvenance API.
     */
    GetModelProvenanceResponse getModelProvenance(GetModelProvenanceRequest request);

    /**
     * Gets the specified notebook session's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetNotebookSession API.
     */
    GetNotebookSessionResponse getNotebookSession(GetNotebookSessionRequest request);

    /**
     * Gets the specified project's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetProject API.
     */
    GetProjectResponse getProject(GetProjectRequest request);

    /**
     * Gets the specified work request's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Gets model artifact metadata for specified model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/HeadModelArtifactExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use HeadModelArtifact API.
     */
    HeadModelArtifactResponse headModelArtifact(HeadModelArtifactRequest request);

    /**
     * Lists models in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListModelsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListModels API.
     */
    ListModelsResponse listModels(ListModelsRequest request);

    /**
     * Lists the valid notebook session shapes.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListNotebookSessionShapesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListNotebookSessionShapes API.
     */
    ListNotebookSessionShapesResponse listNotebookSessionShapes(
            ListNotebookSessionShapesRequest request);

    /**
     * Lists notebook sessions in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListNotebookSessionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListNotebookSessions API.
     */
    ListNotebookSessionsResponse listNotebookSessions(ListNotebookSessionsRequest request);

    /**
     * Lists projects in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListProjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListProjects API.
     */
    ListProjectsResponse listProjects(ListProjectsRequest request);

    /**
     * Lists work request errors for the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Lists work request logs for the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists work requests in the specified compartment.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Updates the properties of a model. You can update the `displayName`, `description`, `freeformTags`, and `definedTags` properties.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateModelExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateModel API.
     */
    UpdateModelResponse updateModel(UpdateModelRequest request);

    /**
     * Updates provenance information for the specified model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateModelProvenanceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateModelProvenance API.
     */
    UpdateModelProvenanceResponse updateModelProvenance(UpdateModelProvenanceRequest request);

    /**
     * Updates the properties of a notebook session. You can update the `displayName`, `freeformTags`, and `definedTags` properties.
     * When the notebook session is in the INACTIVE lifecycle state, you can update `notebookSessionConfigurationDetails` and change `shape`, `subnetId`, and `blockStorageSizeInGBs`.
     * Changes to the `notebookSessionConfigurationDetails` will take effect the next time the `ActivateNotebookSession` action is invoked on the notebook session resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateNotebookSessionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateNotebookSession API.
     */
    UpdateNotebookSessionResponse updateNotebookSession(UpdateNotebookSessionRequest request);

    /**
     * Updates the properties of a project. You can update the `displayName`, `description`, `freeformTags`, and `definedTags` properties.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/UpdateProjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateProject API.
     */
    UpdateProjectResponse updateProject(UpdateProjectRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataScienceWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataSciencePaginators getPaginators();
}
