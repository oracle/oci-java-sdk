/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration;

import com.oracle.bmc.dataintegration.requests.*;
import com.oracle.bmc.dataintegration.responses.*;

/**
 * Use the Data Integration Service APIs to perform common extract, load, and transform (ETL) tasks.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public interface DataIntegration extends AutoCloseable {

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
     * Moves a workspace to a specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeCompartmentResponse changeCompartment(ChangeCompartmentRequest request);

    /**
     * Creates an application.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateApplicationResponse createApplication(CreateApplicationRequest request);

    /**
     * Creates a connection under an existing data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateConnectionResponse createConnection(CreateConnectionRequest request);

    /**
     * Creates a connection validation.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateConnectionValidationResponse createConnectionValidation(
            CreateConnectionValidationRequest request);

    /**
     * Creates a data asset with default connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request);

    /**
     * Creates a new data flow in a project or folder ready for performing data integrations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDataFlowResponse createDataFlow(CreateDataFlowRequest request);

    /**
     * Accepts the data flow definition in the request payload and creates a data flow validation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDataFlowValidationResponse createDataFlowValidation(
            CreateDataFlowValidationRequest request);

    /**
     * Creates the data entity shape using the shape from the data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateEntityShapeResponse createEntityShape(CreateEntityShapeRequest request);

    /**
     * Publish a DataFlow in a OCI DataFlow application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateExternalPublicationResponse createExternalPublication(
            CreateExternalPublicationRequest request);

    /**
     * Validates a specific task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateExternalPublicationValidationResponse createExternalPublicationValidation(
            CreateExternalPublicationValidationRequest request);

    /**
     * Creates a folder in a project or in another folder, limited to two levels of folders. |
     * Folders are used to organize your design-time resources, such as tasks or data flows.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateFolderResponse createFolder(CreateFolderRequest request);

    /**
     * Creates a patch in an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreatePatchResponse createPatch(CreatePatchRequest request);

    /**
     * Creates a project. Projects are organizational constructs within a workspace that you use to organize your design-time resources, such as tasks or data flows. Projects can be organized into folders.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateProjectResponse createProject(CreateProjectRequest request);

    /**
     * Creates a new task ready for performing data integrations. There are specialized types of tasks that include data loader and integration tasks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTaskResponse createTask(CreateTaskRequest request);

    /**
     * Creates a data integration task run for the specified task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTaskRunResponse createTaskRun(CreateTaskRunRequest request);

    /**
     * Validates a specific task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTaskValidationResponse createTaskValidation(CreateTaskValidationRequest request);

    /**
     * Creates a new Data Integration workspace ready for performing data integration tasks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request);

    /**
     * Removes an application using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request);

    /**
     * Removes a connection using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request);

    /**
     * Deletes a connection validation.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConnectionValidationResponse deleteConnectionValidation(
            DeleteConnectionValidationRequest request);

    /**
     * Removes a data asset using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request);

    /**
     * Removes a data flow from a project or folder using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDataFlowResponse deleteDataFlow(DeleteDataFlowRequest request);

    /**
     * Removes a data flow validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDataFlowValidationResponse deleteDataFlowValidation(
            DeleteDataFlowValidationRequest request);

    /**
     * Removes a published object using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteExternalPublicationResponse deleteExternalPublication(
            DeleteExternalPublicationRequest request);

    /**
     * Removes a task validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteExternalPublicationValidationResponse deleteExternalPublicationValidation(
            DeleteExternalPublicationValidationRequest request);

    /**
     * Removes a folder from a project using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteFolderResponse deleteFolder(DeleteFolderRequest request);

    /**
     * Removes a patch using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeletePatchResponse deletePatch(DeletePatchRequest request);

    /**
     * Removes a project from the workspace using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteProjectResponse deleteProject(DeleteProjectRequest request);

    /**
     * Removes a task using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTaskResponse deleteTask(DeleteTaskRequest request);

    /**
     * Deletes a task run using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTaskRunResponse deleteTaskRun(DeleteTaskRunRequest request);

    /**
     * Removes a task validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTaskValidationResponse deleteTaskValidation(DeleteTaskValidationRequest request);

    /**
     * Deletes a Data Integration workspace resource using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * Retrieves an application using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetApplicationResponse getApplication(GetApplicationRequest request);

    /**
     * Retrieves the connection details using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConnectionResponse getConnection(GetConnectionRequest request);

    /**
     * Retrieves a connection validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConnectionValidationResponse getConnectionValidation(GetConnectionValidationRequest request);

    /**
     * Retrieves statistics on a workspace. It returns an object with an array of property values, such as the number of projects, |
     *        applications, data assets, and so on.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCountStatisticResponse getCountStatistic(GetCountStatisticRequest request);

    /**
     * Retrieves details of a data asset using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataAssetResponse getDataAsset(GetDataAssetRequest request);

    /**
     * Retrieves the data entity details with the given name from live schema.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataEntityResponse getDataEntity(GetDataEntityRequest request);

    /**
     * Retrieves a data flow using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataFlowResponse getDataFlow(GetDataFlowRequest request);

    /**
     * Retrieves a data flow validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataFlowValidationResponse getDataFlowValidation(GetDataFlowValidationRequest request);

    /**
     * Retrieves the details of a dependent object from an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDependentObjectResponse getDependentObject(GetDependentObjectRequest request);

    /**
     * Retrieves a publshed object in an task using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExternalPublicationResponse getExternalPublication(GetExternalPublicationRequest request);

    /**
     * Retrieves an external publication validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetExternalPublicationValidationResponse getExternalPublicationValidation(
            GetExternalPublicationValidationRequest request);

    /**
     * Retrieves a folder using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFolderResponse getFolder(GetFolderRequest request);

    /**
     * Retrieves a patch in an application using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPatchResponse getPatch(GetPatchRequest request);

    /**
     * Retrieves a project using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetProjectResponse getProject(GetProjectRequest request);

    /**
     * Retrieves the details of a published object from an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetPublishedObjectResponse getPublishedObject(GetPublishedObjectRequest request);

    /**
     * Retrieves a reference in an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetReferenceResponse getReference(GetReferenceRequest request);

    /**
     * Retrieves a schema that can be accessed using the specified connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetSchemaResponse getSchema(GetSchemaRequest request);

    /**
     * Retrieves a task using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTaskResponse getTask(GetTaskRequest request);

    /**
     * Retrieves a task run using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTaskRunResponse getTaskRun(GetTaskRunRequest request);

    /**
     * Retrieves a task validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTaskValidationResponse getTaskValidation(GetTaskValidationRequest request);

    /**
     * Retrieves the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Retrieves a Data Integration workspace using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request);

    /**
     * Retrieves a list of applications and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListApplicationsResponse listApplications(ListApplicationsRequest request);

    /**
     * Retrieves a list of connection validations within the specified workspace.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConnectionValidationsResponse listConnectionValidations(
            ListConnectionValidationsRequest request);

    /**
     * Retrieves a list of all connections.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConnectionsResponse listConnections(ListConnectionsRequest request);

    /**
     * Retrieves a list of all data asset summaries.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request);

    /**
     * Lists a summary of data entities from the data asset using the specified connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataEntitiesResponse listDataEntities(ListDataEntitiesRequest request);

    /**
     * Retrieves a list of data flow validations within the specified workspace.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataFlowValidationsResponse listDataFlowValidations(ListDataFlowValidationsRequest request);

    /**
     * Retrieves a list of data flows in a project or folder.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataFlowsResponse listDataFlows(ListDataFlowsRequest request);

    /**
     * Retrieves a list of all dependent objects for a specific application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDependentObjectsResponse listDependentObjects(ListDependentObjectsRequest request);

    /**
     * Retrieves a lists of external publication validations in a workspace and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListExternalPublicationValidationsResponse listExternalPublicationValidations(
            ListExternalPublicationValidationsRequest request);

    /**
     * Retrieves a list of external publications in an application and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListExternalPublicationsResponse listExternalPublications(
            ListExternalPublicationsRequest request);

    /**
     * Retrieves a list of folders in a project and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFoldersResponse listFolders(ListFoldersRequest request);

    /**
     * Retrieves a list of patches in an application and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPatchChangesResponse listPatchChanges(ListPatchChangesRequest request);

    /**
     * Retrieves a list of patches in an application and provides options to filter the list. For listing changes based on a period and logical objects changed, see ListPatchChanges API.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPatchesResponse listPatches(ListPatchesRequest request);

    /**
     * Retrieves a lists of projects in a workspace and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListProjectsResponse listProjects(ListProjectsRequest request);

    /**
     * Retrieves a list of all the published objects for a specified application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListPublishedObjectsResponse listPublishedObjects(ListPublishedObjectsRequest request);

    /**
     * Retrieves a list of references in an application. Reference objects are created when dataflows and tasks use objects, such as data assets and connections.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListReferencesResponse listReferences(ListReferencesRequest request);

    /**
     * Retrieves a list of all the schemas that can be accessed using the specified connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListSchemasResponse listSchemas(ListSchemasRequest request);

    /**
     * Gets log entries for task runs using its key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTaskRunLogsResponse listTaskRunLogs(ListTaskRunLogsRequest request);

    /**
     * Retrieves a list of task runs and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTaskRunsResponse listTaskRuns(ListTaskRunsRequest request);

    /**
     * Retrieves a list of task validations within the specified workspace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTaskValidationsResponse listTaskValidations(ListTaskValidationsRequest request);

    /**
     * Retrieves a list of all tasks in a specified project or folder.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTasksResponse listTasks(ListTasksRequest request);

    /**
     * Retrieves a paginated list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Retrieves a paginated list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Retrieves a list of Data Integration workspaces.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request);

    /**
     * Starts a workspace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StartWorkspaceResponse startWorkspace(StartWorkspaceRequest request);

    /**
     * Stops a workspace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    StopWorkspaceResponse stopWorkspace(StopWorkspaceRequest request);

    /**
     * Updates an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateApplicationResponse updateApplication(UpdateApplicationRequest request);

    /**
     * Updates a connection under a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateConnectionResponse updateConnection(UpdateConnectionRequest request);

    /**
     * Updates a specific data asset with default connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request);

    /**
     * Updates a specific data flow.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDataFlowResponse updateDataFlow(UpdateDataFlowRequest request);

    /**
     * Updates the external publication object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateExternalPublicationResponse updateExternalPublication(
            UpdateExternalPublicationRequest request);

    /**
     * Updates a specific folder.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateFolderResponse updateFolder(UpdateFolderRequest request);

    /**
     * Updates a specific project.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateProjectResponse updateProject(UpdateProjectRequest request);

    /**
     * Updates the application references. For example, to map a data asset to a different target object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateReferenceResponse updateReference(UpdateReferenceRequest request);

    /**
     * Updates a specific task. For example, you can update the task description or move the task to a different folder by changing the `aggregatorKey` to a different folder in the registry.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateTaskResponse updateTask(UpdateTaskRequest request);

    /**
     * Updates the status of the task run. For example, aborts a task run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateTaskRunResponse updateTaskRun(UpdateTaskRunRequest request);

    /**
     * Updates the specified Data Integration workspace.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataIntegrationWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataIntegrationPaginators getPaginators();
}
