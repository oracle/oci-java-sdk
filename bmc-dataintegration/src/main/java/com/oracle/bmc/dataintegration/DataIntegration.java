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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ChangeCompartmentExample.java.html">here</a> to see how to use ChangeCompartment API.
     */
    ChangeCompartmentResponse changeCompartment(ChangeCompartmentRequest request);

    /**
     * Creates an application.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateApplicationExample.java.html">here</a> to see how to use CreateApplication API.
     */
    CreateApplicationResponse createApplication(CreateApplicationRequest request);

    /**
     * Creates a connection under an existing data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateConnectionExample.java.html">here</a> to see how to use CreateConnection API.
     */
    CreateConnectionResponse createConnection(CreateConnectionRequest request);

    /**
     * Creates a connection validation.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateConnectionValidationExample.java.html">here</a> to see how to use CreateConnectionValidation API.
     */
    CreateConnectionValidationResponse createConnectionValidation(
            CreateConnectionValidationRequest request);

    /**
     * Creates a data asset with default connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateDataAssetExample.java.html">here</a> to see how to use CreateDataAsset API.
     */
    CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request);

    /**
     * Creates a new data flow in a project or folder ready for performing data integrations.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateDataFlowExample.java.html">here</a> to see how to use CreateDataFlow API.
     */
    CreateDataFlowResponse createDataFlow(CreateDataFlowRequest request);

    /**
     * Accepts the data flow definition in the request payload and creates a data flow validation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateDataFlowValidationExample.java.html">here</a> to see how to use CreateDataFlowValidation API.
     */
    CreateDataFlowValidationResponse createDataFlowValidation(
            CreateDataFlowValidationRequest request);

    /**
     * Creates the data entity shape using the shape from the data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateEntityShapeExample.java.html">here</a> to see how to use CreateEntityShape API.
     */
    CreateEntityShapeResponse createEntityShape(CreateEntityShapeRequest request);

    /**
     * Publish a DataFlow in a OCI DataFlow application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateExternalPublicationExample.java.html">here</a> to see how to use CreateExternalPublication API.
     */
    CreateExternalPublicationResponse createExternalPublication(
            CreateExternalPublicationRequest request);

    /**
     * Validates a specific task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateExternalPublicationValidationExample.java.html">here</a> to see how to use CreateExternalPublicationValidation API.
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
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateFolderExample.java.html">here</a> to see how to use CreateFolder API.
     */
    CreateFolderResponse createFolder(CreateFolderRequest request);

    /**
     * Creates a patch in an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreatePatchExample.java.html">here</a> to see how to use CreatePatch API.
     */
    CreatePatchResponse createPatch(CreatePatchRequest request);

    /**
     * Creates a project. Projects are organizational constructs within a workspace that you use to organize your design-time resources, such as tasks or data flows. Projects can be organized into folders.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateProjectExample.java.html">here</a> to see how to use CreateProject API.
     */
    CreateProjectResponse createProject(CreateProjectRequest request);

    /**
     * Creates a new task ready for performing data integrations. There are specialized types of tasks that include data loader and integration tasks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateTaskExample.java.html">here</a> to see how to use CreateTask API.
     */
    CreateTaskResponse createTask(CreateTaskRequest request);

    /**
     * Creates a data integration task run for the specified task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateTaskRunExample.java.html">here</a> to see how to use CreateTaskRun API.
     */
    CreateTaskRunResponse createTaskRun(CreateTaskRunRequest request);

    /**
     * Validates a specific task.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateTaskValidationExample.java.html">here</a> to see how to use CreateTaskValidation API.
     */
    CreateTaskValidationResponse createTaskValidation(CreateTaskValidationRequest request);

    /**
     * Creates a new Data Integration workspace ready for performing data integration tasks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateWorkspaceExample.java.html">here</a> to see how to use CreateWorkspace API.
     */
    CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request);

    /**
     * Removes an application using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteApplicationExample.java.html">here</a> to see how to use DeleteApplication API.
     */
    DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request);

    /**
     * Removes a connection using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteConnectionExample.java.html">here</a> to see how to use DeleteConnection API.
     */
    DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request);

    /**
     * Deletes a connection validation.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteConnectionValidationExample.java.html">here</a> to see how to use DeleteConnectionValidation API.
     */
    DeleteConnectionValidationResponse deleteConnectionValidation(
            DeleteConnectionValidationRequest request);

    /**
     * Removes a data asset using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteDataAssetExample.java.html">here</a> to see how to use DeleteDataAsset API.
     */
    DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request);

    /**
     * Removes a data flow from a project or folder using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteDataFlowExample.java.html">here</a> to see how to use DeleteDataFlow API.
     */
    DeleteDataFlowResponse deleteDataFlow(DeleteDataFlowRequest request);

    /**
     * Removes a data flow validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteDataFlowValidationExample.java.html">here</a> to see how to use DeleteDataFlowValidation API.
     */
    DeleteDataFlowValidationResponse deleteDataFlowValidation(
            DeleteDataFlowValidationRequest request);

    /**
     * Removes a published object using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteExternalPublicationExample.java.html">here</a> to see how to use DeleteExternalPublication API.
     */
    DeleteExternalPublicationResponse deleteExternalPublication(
            DeleteExternalPublicationRequest request);

    /**
     * Removes a task validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteExternalPublicationValidationExample.java.html">here</a> to see how to use DeleteExternalPublicationValidation API.
     */
    DeleteExternalPublicationValidationResponse deleteExternalPublicationValidation(
            DeleteExternalPublicationValidationRequest request);

    /**
     * Removes a folder from a project using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteFolderExample.java.html">here</a> to see how to use DeleteFolder API.
     */
    DeleteFolderResponse deleteFolder(DeleteFolderRequest request);

    /**
     * Removes a patch using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeletePatchExample.java.html">here</a> to see how to use DeletePatch API.
     */
    DeletePatchResponse deletePatch(DeletePatchRequest request);

    /**
     * Removes a project from the workspace using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteProjectExample.java.html">here</a> to see how to use DeleteProject API.
     */
    DeleteProjectResponse deleteProject(DeleteProjectRequest request);

    /**
     * Removes a task using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteTaskExample.java.html">here</a> to see how to use DeleteTask API.
     */
    DeleteTaskResponse deleteTask(DeleteTaskRequest request);

    /**
     * Deletes a task run using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteTaskRunExample.java.html">here</a> to see how to use DeleteTaskRun API.
     */
    DeleteTaskRunResponse deleteTaskRun(DeleteTaskRunRequest request);

    /**
     * Removes a task validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteTaskValidationExample.java.html">here</a> to see how to use DeleteTaskValidation API.
     */
    DeleteTaskValidationResponse deleteTaskValidation(DeleteTaskValidationRequest request);

    /**
     * Deletes a Data Integration workspace resource using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/DeleteWorkspaceExample.java.html">here</a> to see how to use DeleteWorkspace API.
     */
    DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request);

    /**
     * Retrieves an application using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetApplicationExample.java.html">here</a> to see how to use GetApplication API.
     */
    GetApplicationResponse getApplication(GetApplicationRequest request);

    /**
     * Retrieves the connection details using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetConnectionExample.java.html">here</a> to see how to use GetConnection API.
     */
    GetConnectionResponse getConnection(GetConnectionRequest request);

    /**
     * Retrieves a connection validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetConnectionValidationExample.java.html">here</a> to see how to use GetConnectionValidation API.
     */
    GetConnectionValidationResponse getConnectionValidation(GetConnectionValidationRequest request);

    /**
     * Retrieves statistics on a workspace. It returns an object with an array of property values, such as the number of projects, |
     *        applications, data assets, and so on.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetCountStatisticExample.java.html">here</a> to see how to use GetCountStatistic API.
     */
    GetCountStatisticResponse getCountStatistic(GetCountStatisticRequest request);

    /**
     * Retrieves details of a data asset using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetDataAssetExample.java.html">here</a> to see how to use GetDataAsset API.
     */
    GetDataAssetResponse getDataAsset(GetDataAssetRequest request);

    /**
     * Retrieves the data entity details with the given name from live schema.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetDataEntityExample.java.html">here</a> to see how to use GetDataEntity API.
     */
    GetDataEntityResponse getDataEntity(GetDataEntityRequest request);

    /**
     * Retrieves a data flow using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetDataFlowExample.java.html">here</a> to see how to use GetDataFlow API.
     */
    GetDataFlowResponse getDataFlow(GetDataFlowRequest request);

    /**
     * Retrieves a data flow validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetDataFlowValidationExample.java.html">here</a> to see how to use GetDataFlowValidation API.
     */
    GetDataFlowValidationResponse getDataFlowValidation(GetDataFlowValidationRequest request);

    /**
     * Retrieves the details of a dependent object from an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetDependentObjectExample.java.html">here</a> to see how to use GetDependentObject API.
     */
    GetDependentObjectResponse getDependentObject(GetDependentObjectRequest request);

    /**
     * Retrieves a publshed object in an task using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetExternalPublicationExample.java.html">here</a> to see how to use GetExternalPublication API.
     */
    GetExternalPublicationResponse getExternalPublication(GetExternalPublicationRequest request);

    /**
     * Retrieves an external publication validation using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetExternalPublicationValidationExample.java.html">here</a> to see how to use GetExternalPublicationValidation API.
     */
    GetExternalPublicationValidationResponse getExternalPublicationValidation(
            GetExternalPublicationValidationRequest request);

    /**
     * Retrieves a folder using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetFolderExample.java.html">here</a> to see how to use GetFolder API.
     */
    GetFolderResponse getFolder(GetFolderRequest request);

    /**
     * Retrieves a patch in an application using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetPatchExample.java.html">here</a> to see how to use GetPatch API.
     */
    GetPatchResponse getPatch(GetPatchRequest request);

    /**
     * Retrieves a project using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetProjectExample.java.html">here</a> to see how to use GetProject API.
     */
    GetProjectResponse getProject(GetProjectRequest request);

    /**
     * Retrieves the details of a published object from an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetPublishedObjectExample.java.html">here</a> to see how to use GetPublishedObject API.
     */
    GetPublishedObjectResponse getPublishedObject(GetPublishedObjectRequest request);

    /**
     * Retrieves a reference in an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetReferenceExample.java.html">here</a> to see how to use GetReference API.
     */
    GetReferenceResponse getReference(GetReferenceRequest request);

    /**
     * Retrieves a schema that can be accessed using the specified connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetSchemaExample.java.html">here</a> to see how to use GetSchema API.
     */
    GetSchemaResponse getSchema(GetSchemaRequest request);

    /**
     * Retrieves a task using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetTaskExample.java.html">here</a> to see how to use GetTask API.
     */
    GetTaskResponse getTask(GetTaskRequest request);

    /**
     * Retrieves a task run using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetTaskRunExample.java.html">here</a> to see how to use GetTaskRun API.
     */
    GetTaskRunResponse getTaskRun(GetTaskRunRequest request);

    /**
     * Retrieves a task validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetTaskValidationExample.java.html">here</a> to see how to use GetTaskValidation API.
     */
    GetTaskValidationResponse getTaskValidation(GetTaskValidationRequest request);

    /**
     * Retrieves the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetWorkRequestExample.java.html">here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Retrieves a Data Integration workspace using the specified identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetWorkspaceExample.java.html">here</a> to see how to use GetWorkspace API.
     */
    GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request);

    /**
     * Retrieves a list of applications and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListApplicationsExample.java.html">here</a> to see how to use ListApplications API.
     */
    ListApplicationsResponse listApplications(ListApplicationsRequest request);

    /**
     * Retrieves a list of connection validations within the specified workspace.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListConnectionValidationsExample.java.html">here</a> to see how to use ListConnectionValidations API.
     */
    ListConnectionValidationsResponse listConnectionValidations(
            ListConnectionValidationsRequest request);

    /**
     * Retrieves a list of all connections.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListConnectionsExample.java.html">here</a> to see how to use ListConnections API.
     */
    ListConnectionsResponse listConnections(ListConnectionsRequest request);

    /**
     * Retrieves a list of all data asset summaries.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListDataAssetsExample.java.html">here</a> to see how to use ListDataAssets API.
     */
    ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request);

    /**
     * Lists a summary of data entities from the data asset using the specified connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListDataEntitiesExample.java.html">here</a> to see how to use ListDataEntities API.
     */
    ListDataEntitiesResponse listDataEntities(ListDataEntitiesRequest request);

    /**
     * Retrieves a list of data flow validations within the specified workspace.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListDataFlowValidationsExample.java.html">here</a> to see how to use ListDataFlowValidations API.
     */
    ListDataFlowValidationsResponse listDataFlowValidations(ListDataFlowValidationsRequest request);

    /**
     * Retrieves a list of data flows in a project or folder.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListDataFlowsExample.java.html">here</a> to see how to use ListDataFlows API.
     */
    ListDataFlowsResponse listDataFlows(ListDataFlowsRequest request);

    /**
     * Retrieves a list of all dependent objects for a specific application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListDependentObjectsExample.java.html">here</a> to see how to use ListDependentObjects API.
     */
    ListDependentObjectsResponse listDependentObjects(ListDependentObjectsRequest request);

    /**
     * Retrieves a lists of external publication validations in a workspace and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListExternalPublicationValidationsExample.java.html">here</a> to see how to use ListExternalPublicationValidations API.
     */
    ListExternalPublicationValidationsResponse listExternalPublicationValidations(
            ListExternalPublicationValidationsRequest request);

    /**
     * Retrieves a list of external publications in an application and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListExternalPublicationsExample.java.html">here</a> to see how to use ListExternalPublications API.
     */
    ListExternalPublicationsResponse listExternalPublications(
            ListExternalPublicationsRequest request);

    /**
     * Retrieves a list of folders in a project and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListFoldersExample.java.html">here</a> to see how to use ListFolders API.
     */
    ListFoldersResponse listFolders(ListFoldersRequest request);

    /**
     * Retrieves a list of patches in an application and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListPatchChangesExample.java.html">here</a> to see how to use ListPatchChanges API.
     */
    ListPatchChangesResponse listPatchChanges(ListPatchChangesRequest request);

    /**
     * Retrieves a list of patches in an application and provides options to filter the list. For listing changes based on a period and logical objects changed, see ListPatchChanges API.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListPatchesExample.java.html">here</a> to see how to use ListPatches API.
     */
    ListPatchesResponse listPatches(ListPatchesRequest request);

    /**
     * Retrieves a lists of projects in a workspace and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListProjectsExample.java.html">here</a> to see how to use ListProjects API.
     */
    ListProjectsResponse listProjects(ListProjectsRequest request);

    /**
     * Retrieves a list of all the published objects for a specified application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListPublishedObjectsExample.java.html">here</a> to see how to use ListPublishedObjects API.
     */
    ListPublishedObjectsResponse listPublishedObjects(ListPublishedObjectsRequest request);

    /**
     * Retrieves a list of references in an application. Reference objects are created when dataflows and tasks use objects, such as data assets and connections.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListReferencesExample.java.html">here</a> to see how to use ListReferences API.
     */
    ListReferencesResponse listReferences(ListReferencesRequest request);

    /**
     * Retrieves a list of all the schemas that can be accessed using the specified connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListSchemasExample.java.html">here</a> to see how to use ListSchemas API.
     */
    ListSchemasResponse listSchemas(ListSchemasRequest request);

    /**
     * Gets log entries for task runs using its key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListTaskRunLogsExample.java.html">here</a> to see how to use ListTaskRunLogs API.
     */
    ListTaskRunLogsResponse listTaskRunLogs(ListTaskRunLogsRequest request);

    /**
     * Retrieves a list of task runs and provides options to filter the list.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListTaskRunsExample.java.html">here</a> to see how to use ListTaskRuns API.
     */
    ListTaskRunsResponse listTaskRuns(ListTaskRunsRequest request);

    /**
     * Retrieves a list of task validations within the specified workspace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListTaskValidationsExample.java.html">here</a> to see how to use ListTaskValidations API.
     */
    ListTaskValidationsResponse listTaskValidations(ListTaskValidationsRequest request);

    /**
     * Retrieves a list of all tasks in a specified project or folder.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListTasksExample.java.html">here</a> to see how to use ListTasks API.
     */
    ListTasksResponse listTasks(ListTasksRequest request);

    /**
     * Retrieves a paginated list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListWorkRequestErrorsExample.java.html">here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Retrieves a paginated list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListWorkRequestLogsExample.java.html">here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListWorkRequestsExample.java.html">here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Retrieves a list of Data Integration workspaces.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListWorkspacesExample.java.html">here</a> to see how to use ListWorkspaces API.
     */
    ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request);

    /**
     * Starts a workspace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/StartWorkspaceExample.java.html">here</a> to see how to use StartWorkspace API.
     */
    StartWorkspaceResponse startWorkspace(StartWorkspaceRequest request);

    /**
     * Stops a workspace.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/StopWorkspaceExample.java.html">here</a> to see how to use StopWorkspace API.
     */
    StopWorkspaceResponse stopWorkspace(StopWorkspaceRequest request);

    /**
     * Updates an application.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateApplicationExample.java.html">here</a> to see how to use UpdateApplication API.
     */
    UpdateApplicationResponse updateApplication(UpdateApplicationRequest request);

    /**
     * Updates a connection under a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateConnectionExample.java.html">here</a> to see how to use UpdateConnection API.
     */
    UpdateConnectionResponse updateConnection(UpdateConnectionRequest request);

    /**
     * Updates a specific data asset with default connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateDataAssetExample.java.html">here</a> to see how to use UpdateDataAsset API.
     */
    UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request);

    /**
     * Updates a specific data flow.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateDataFlowExample.java.html">here</a> to see how to use UpdateDataFlow API.
     */
    UpdateDataFlowResponse updateDataFlow(UpdateDataFlowRequest request);

    /**
     * Updates the external publication object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateExternalPublicationExample.java.html">here</a> to see how to use UpdateExternalPublication API.
     */
    UpdateExternalPublicationResponse updateExternalPublication(
            UpdateExternalPublicationRequest request);

    /**
     * Updates a specific folder.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateFolderExample.java.html">here</a> to see how to use UpdateFolder API.
     */
    UpdateFolderResponse updateFolder(UpdateFolderRequest request);

    /**
     * Updates a specific project.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateProjectExample.java.html">here</a> to see how to use UpdateProject API.
     */
    UpdateProjectResponse updateProject(UpdateProjectRequest request);

    /**
     * Updates the application references. For example, to map a data asset to a different target object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateReferenceExample.java.html">here</a> to see how to use UpdateReference API.
     */
    UpdateReferenceResponse updateReference(UpdateReferenceRequest request);

    /**
     * Updates a specific task. For example, you can update the task description or move the task to a different folder by changing the `aggregatorKey` to a different folder in the registry.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateTaskExample.java.html">here</a> to see how to use UpdateTask API.
     */
    UpdateTaskResponse updateTask(UpdateTaskRequest request);

    /**
     * Updates the status of the task run. For example, aborts a task run.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateTaskRunExample.java.html">here</a> to see how to use UpdateTaskRun API.
     */
    UpdateTaskRunResponse updateTaskRun(UpdateTaskRunRequest request);

    /**
     * Updates the specified Data Integration workspace.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateWorkspaceExample.java.html">here</a> to see how to use UpdateWorkspace API.
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
