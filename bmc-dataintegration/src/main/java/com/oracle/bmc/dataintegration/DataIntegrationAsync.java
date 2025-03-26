/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration;

import com.oracle.bmc.dataintegration.requests.*;
import com.oracle.bmc.dataintegration.responses.*;

/**
 * Use the Data Integration API to organize your data integration projects, create data flows, pipelines and tasks, and then publish, schedule, and run tasks that extract, transform, and load data. For more information, see [Data Integration](https://docs.oracle.com/iaas/data-integration/home.htm).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public interface DataIntegrationAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Moves a workspace to a specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCompartmentResponse> changeCompartment(
            ChangeCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeCompartmentRequest, ChangeCompartmentResponse>
                    handler);

    /**
     * Moves a DIS Application to a specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDisApplicationCompartmentResponse>
            changeDisApplicationCompartment(
                    ChangeDisApplicationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDisApplicationCompartmentRequest,
                                    ChangeDisApplicationCompartmentResponse>
                            handler);

    /**
     * Creates an application.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateApplicationResponse> createApplication(
            CreateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateApplicationRequest, CreateApplicationResponse>
                    handler);

    /**
     * Creates detailed description for an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateApplicationDetailedDescriptionResponse>
            createApplicationDetailedDescription(
                    CreateApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateApplicationDetailedDescriptionRequest,
                                    CreateApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * Creates a connection under an existing data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectionResponse> createConnection(
            CreateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateConnectionRequest, CreateConnectionResponse>
                    handler);

    /**
     * Creates a connection validation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectionValidationResponse> createConnectionValidation(
            CreateConnectionValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionValidationRequest, CreateConnectionValidationResponse>
                    handler);

    /**
     * Copy Metadata Object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCopyObjectRequestResponse> createCopyObjectRequest(
            CreateCopyObjectRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCopyObjectRequestRequest, CreateCopyObjectRequestResponse>
                    handler);

    /**
     * Creates a data asset with default connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataAssetResponse> createDataAsset(
            CreateDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDataAssetRequest, CreateDataAssetResponse>
                    handler);

    /**
     * Creates a new data flow in a project or folder ready for performing data integrations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataFlowResponse> createDataFlow(
            CreateDataFlowRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDataFlowRequest, CreateDataFlowResponse>
                    handler);

    /**
     * Accepts the data flow definition in the request payload and creates a data flow validation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataFlowValidationResponse> createDataFlowValidation(
            CreateDataFlowValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataFlowValidationRequest, CreateDataFlowValidationResponse>
                    handler);

    /**
     * Creates a DIS Application.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDisApplicationResponse> createDisApplication(
            CreateDisApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDisApplicationRequest, CreateDisApplicationResponse>
                    handler);

    /**
     * Creates detailed description for an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDisApplicationDetailedDescriptionResponse>
            createDisApplicationDetailedDescription(
                    CreateDisApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateDisApplicationDetailedDescriptionRequest,
                                    CreateDisApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * Creates the data entity shape using the shape from the data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEntityShapeResponse> createEntityShape(
            CreateEntityShapeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEntityShapeRequest, CreateEntityShapeResponse>
                    handler);

    /**
     * Export Metadata Object
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExportRequestResponse> createExportRequest(
            CreateExportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExportRequestRequest, CreateExportRequestResponse>
                    handler);

    /**
     * Publish a DataFlow in a OCI DataFlow application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalPublicationResponse> createExternalPublication(
            CreateExternalPublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExternalPublicationRequest, CreateExternalPublicationResponse>
                    handler);

    /**
     * Validates a specific task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExternalPublicationValidationResponse>
            createExternalPublicationValidation(
                    CreateExternalPublicationValidationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateExternalPublicationValidationRequest,
                                    CreateExternalPublicationValidationResponse>
                            handler);

    /**
     * Creates a folder in a project or in another folder, limited to two levels of folders. |
     * Folders are used to organize your design-time resources, such as tasks or data flows.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFolderResponse> createFolder(
            CreateFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                    handler);

    /**
     * Creates a function library in a project or in another function library, limited to two levels of function libraries. |
     * FunctionLibraries are used to organize your design-time resources, such as tasks or data flows.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFunctionLibraryResponse> createFunctionLibrary(
            CreateFunctionLibraryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateFunctionLibraryRequest, CreateFunctionLibraryResponse>
                    handler);

    /**
     * Import Metadata Object
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateImportRequestResponse> createImportRequest(
            CreateImportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateImportRequestRequest, CreateImportRequestResponse>
                    handler);

    /**
     * Creates a patch in an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePatchResponse> createPatch(
            CreatePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePatchRequest, CreatePatchResponse> handler);

    /**
     * Creates a new pipeline in a project or folder ready for performing task orchestration.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePipelineResponse> createPipeline(
            CreatePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePipelineRequest, CreatePipelineResponse>
                    handler);

    /**
     * Accepts the data flow definition in the request payload and creates a pipeline validation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePipelineValidationResponse> createPipelineValidation(
            CreatePipelineValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreatePipelineValidationRequest, CreatePipelineValidationResponse>
                    handler);

    /**
     * Creates a project. Projects are organizational constructs within a workspace that you use to organize your design-time resources, such as tasks or data flows. Projects can be organized into folders.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateProjectResponse> createProject(
            CreateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateProjectRequest, CreateProjectResponse>
                    handler);

    /**
     * Endpoint to create a new schedule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduleResponse> createSchedule(
            CreateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateScheduleRequest, CreateScheduleResponse>
                    handler);

    /**
     * Creates a new task ready for performing data integrations. There are specialized types of tasks that include data loader and integration tasks.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTaskResponse> createTask(
            CreateTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTaskRequest, CreateTaskResponse> handler);

    /**
     * Creates a data integration task run for the specified task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTaskRunResponse> createTaskRun(
            CreateTaskRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTaskRunRequest, CreateTaskRunResponse>
                    handler);

    /**
     * Endpoint to be used create TaskSchedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTaskScheduleResponse> createTaskSchedule(
            CreateTaskScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskScheduleRequest, CreateTaskScheduleResponse>
                    handler);

    /**
     * Validates a specific task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTaskValidationResponse> createTaskValidation(
            CreateTaskValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTaskValidationRequest, CreateTaskValidationResponse>
                    handler);

    /**
     * Creates a new UserDefinedFunction in a function library ready for performing data integrations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateUserDefinedFunctionResponse> createUserDefinedFunction(
            CreateUserDefinedFunctionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateUserDefinedFunctionRequest, CreateUserDefinedFunctionResponse>
                    handler);

    /**
     * Accepts the UserDefinedFunction definition in the request payload and creates a UserDefinedFunction validation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateUserDefinedFunctionValidationResponse>
            createUserDefinedFunctionValidation(
                    CreateUserDefinedFunctionValidationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateUserDefinedFunctionValidationRequest,
                                    CreateUserDefinedFunctionValidationResponse>
                            handler);

    /**
     * Creates a new Data Integration workspace ready for performing data integration tasks. To retrieve the OCID for the new workspace, use the opc-work-request-id returned by this API and call the {@link #getWorkRequest(GetWorkRequestRequest, Consumer, Consumer) getWorkRequest} API.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateWorkspaceResponse> createWorkspace(
            CreateWorkspaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateWorkspaceRequest, CreateWorkspaceResponse>
                    handler);

    /**
     * Removes an application using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApplicationResponse> deleteApplication(
            DeleteApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteApplicationRequest, DeleteApplicationResponse>
                    handler);

    /**
     * Deletes detailed description of an Application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteApplicationDetailedDescriptionResponse>
            deleteApplicationDetailedDescription(
                    DeleteApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteApplicationDetailedDescriptionRequest,
                                    DeleteApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * Removes a connection using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConnectionResponse> deleteConnection(
            DeleteConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResponse>
                    handler);

    /**
     * Deletes a connection validation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConnectionValidationResponse> deleteConnectionValidation(
            DeleteConnectionValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteConnectionValidationRequest, DeleteConnectionValidationResponse>
                    handler);

    /**
     * Delete copy object request using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCopyObjectRequestResponse> deleteCopyObjectRequest(
            DeleteCopyObjectRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCopyObjectRequestRequest, DeleteCopyObjectRequestResponse>
                    handler);

    /**
     * Removes a data asset using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataAssetResponse> deleteDataAsset(
            DeleteDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDataAssetRequest, DeleteDataAssetResponse>
                    handler);

    /**
     * Removes a data flow from a project or folder using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataFlowResponse> deleteDataFlow(
            DeleteDataFlowRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDataFlowRequest, DeleteDataFlowResponse>
                    handler);

    /**
     * Removes a data flow validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataFlowValidationResponse> deleteDataFlowValidation(
            DeleteDataFlowValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataFlowValidationRequest, DeleteDataFlowValidationResponse>
                    handler);

    /**
     * Removes a DIS application using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDisApplicationResponse> deleteDisApplication(
            DeleteDisApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDisApplicationRequest, DeleteDisApplicationResponse>
                    handler);

    /**
     * Deletes detailed description of an Application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDisApplicationDetailedDescriptionResponse>
            deleteDisApplicationDetailedDescription(
                    DeleteDisApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteDisApplicationDetailedDescriptionRequest,
                                    DeleteDisApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * Delete export object request using the specified identifier.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExportRequestResponse> deleteExportRequest(
            DeleteExportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExportRequestRequest, DeleteExportRequestResponse>
                    handler);

    /**
     * Removes a published object using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalPublicationResponse> deleteExternalPublication(
            DeleteExternalPublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExternalPublicationRequest, DeleteExternalPublicationResponse>
                    handler);

    /**
     * Removes a task validation using the specified identifier.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExternalPublicationValidationResponse>
            deleteExternalPublicationValidation(
                    DeleteExternalPublicationValidationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteExternalPublicationValidationRequest,
                                    DeleteExternalPublicationValidationResponse>
                            handler);

    /**
     * Removes a folder from a project using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFolderResponse> deleteFolder(
            DeleteFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                    handler);

    /**
     * Removes a Function Library from a project using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFunctionLibraryResponse> deleteFunctionLibrary(
            DeleteFunctionLibraryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteFunctionLibraryRequest, DeleteFunctionLibraryResponse>
                    handler);

    /**
     * Delete import object request using the specified identifier.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteImportRequestResponse> deleteImportRequest(
            DeleteImportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteImportRequestRequest, DeleteImportRequestResponse>
                    handler);

    /**
     * Removes a patch using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePatchResponse> deletePatch(
            DeletePatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePatchRequest, DeletePatchResponse> handler);

    /**
     * Removes a pipeline from a project or folder using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePipelineResponse> deletePipeline(
            DeletePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePipelineRequest, DeletePipelineResponse>
                    handler);

    /**
     * Removes a pipeline validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePipelineValidationResponse> deletePipelineValidation(
            DeletePipelineValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeletePipelineValidationRequest, DeletePipelineValidationResponse>
                    handler);

    /**
     * Removes a project from the workspace using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProjectResponse> deleteProject(
            DeleteProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteProjectRequest, DeleteProjectResponse>
                    handler);

    /**
     * Endpoint to delete schedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduleResponse> deleteSchedule(
            DeleteScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteScheduleRequest, DeleteScheduleResponse>
                    handler);

    /**
     * Removes a task using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTaskResponse> deleteTask(
            DeleteTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTaskRequest, DeleteTaskResponse> handler);

    /**
     * Deletes a task run using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTaskRunResponse> deleteTaskRun(
            DeleteTaskRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTaskRunRequest, DeleteTaskRunResponse>
                    handler);

    /**
     * Endpoint to delete TaskSchedule.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTaskScheduleResponse> deleteTaskSchedule(
            DeleteTaskScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskScheduleRequest, DeleteTaskScheduleResponse>
                    handler);

    /**
     * Removes a task validation using the specified identifier.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTaskValidationResponse> deleteTaskValidation(
            DeleteTaskValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTaskValidationRequest, DeleteTaskValidationResponse>
                    handler);

    /**
     * Removes a UserDefinedFunction from a function library using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUserDefinedFunctionResponse> deleteUserDefinedFunction(
            DeleteUserDefinedFunctionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteUserDefinedFunctionRequest, DeleteUserDefinedFunctionResponse>
                    handler);

    /**
     * Removes a UserDefinedFunction validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteUserDefinedFunctionValidationResponse>
            deleteUserDefinedFunctionValidation(
                    DeleteUserDefinedFunctionValidationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteUserDefinedFunctionValidationRequest,
                                    DeleteUserDefinedFunctionValidationResponse>
                            handler);

    /**
     * Deletes a Data Integration workspace resource using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteWorkspaceResponse> deleteWorkspace(
            DeleteWorkspaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteWorkspaceRequest, DeleteWorkspaceResponse>
                    handler);

    /**
     * Retrieves an application using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetApplicationResponse> getApplication(
            GetApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetApplicationRequest, GetApplicationResponse>
                    handler);

    /**
     * Retrieves detailed description of an Application
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetApplicationDetailedDescriptionResponse>
            getApplicationDetailedDescription(
                    GetApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetApplicationDetailedDescriptionRequest,
                                    GetApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * This endpoint can be used to get composite state for a given aggregator
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCompositeStateResponse> getCompositeState(
            GetCompositeStateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCompositeStateRequest, GetCompositeStateResponse>
                    handler);

    /**
     * Retrieves the connection details using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConnectionResponse> getConnection(
            GetConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConnectionRequest, GetConnectionResponse>
                    handler);

    /**
     * Retrieves a connection validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetConnectionValidationResponse> getConnectionValidation(
            GetConnectionValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetConnectionValidationRequest, GetConnectionValidationResponse>
                    handler);

    /**
     * This endpoint can be used to get the summary/details of object being copied.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCopyObjectRequestResponse> getCopyObjectRequest(
            GetCopyObjectRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCopyObjectRequestRequest, GetCopyObjectRequestResponse>
                    handler);

    /**
     * Retrieves statistics on a workspace. It returns an object with an array of property values, such as the number of projects, |
     *        applications, data assets, and so on.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCountStatisticResponse> getCountStatistic(
            GetCountStatisticRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCountStatisticRequest, GetCountStatisticResponse>
                    handler);

    /**
     * Retrieves details of a data asset using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataAssetResponse> getDataAsset(
            GetDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataAssetRequest, GetDataAssetResponse>
                    handler);

    /**
     * Retrieves the data entity details with the given name from live schema.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataEntityResponse> getDataEntity(
            GetDataEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataEntityRequest, GetDataEntityResponse>
                    handler);

    /**
     * Retrieves a data flow using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataFlowResponse> getDataFlow(
            GetDataFlowRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataFlowRequest, GetDataFlowResponse> handler);

    /**
     * Retrieves a data flow validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataFlowValidationResponse> getDataFlowValidation(
            GetDataFlowValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDataFlowValidationRequest, GetDataFlowValidationResponse>
                    handler);

    /**
     * Retrieves the details of a dependent object from an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDependentObjectResponse> getDependentObject(
            GetDependentObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDependentObjectRequest, GetDependentObjectResponse>
                    handler);

    /**
     * Retrieves an application using the specified OCID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDisApplicationResponse> getDisApplication(
            GetDisApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDisApplicationRequest, GetDisApplicationResponse>
                    handler);

    /**
     * Retrieves detailed description of an Application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDisApplicationDetailedDescriptionResponse>
            getDisApplicationDetailedDescription(
                    GetDisApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetDisApplicationDetailedDescriptionRequest,
                                    GetDisApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * This endpoint can be used to get the summary/details of object being exported.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExportRequestResponse> getExportRequest(
            GetExportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExportRequestRequest, GetExportRequestResponse>
                    handler);

    /**
     * Retrieves a publshed object in an task using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalPublicationResponse> getExternalPublication(
            GetExternalPublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExternalPublicationRequest, GetExternalPublicationResponse>
                    handler);

    /**
     * Retrieves an external publication validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExternalPublicationValidationResponse>
            getExternalPublicationValidation(
                    GetExternalPublicationValidationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetExternalPublicationValidationRequest,
                                    GetExternalPublicationValidationResponse>
                            handler);

    /**
     * Retrieves a folder using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFolderResponse> getFolder(
            GetFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse> handler);

    /**
     * Retrieves a Function Library using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFunctionLibraryResponse> getFunctionLibrary(
            GetFunctionLibraryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFunctionLibraryRequest, GetFunctionLibraryResponse>
                    handler);

    /**
     * This endpoint can be used to get the summary/details of object being imported.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetImportRequestResponse> getImportRequest(
            GetImportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetImportRequestRequest, GetImportRequestResponse>
                    handler);

    /**
     * Retrieves a patch in an application using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPatchResponse> getPatch(
            GetPatchRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPatchRequest, GetPatchResponse> handler);

    /**
     * Retrieves a pipeline using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPipelineResponse> getPipeline(
            GetPipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPipelineRequest, GetPipelineResponse> handler);

    /**
     * Retrieves a pipeline validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPipelineValidationResponse> getPipelineValidation(
            GetPipelineValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPipelineValidationRequest, GetPipelineValidationResponse>
                    handler);

    /**
     * Retrieves a project using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetProjectResponse> getProject(
            GetProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProjectRequest, GetProjectResponse> handler);

    /**
     * Retrieves the details of a published object from an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPublishedObjectResponse> getPublishedObject(
            GetPublishedObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetPublishedObjectRequest, GetPublishedObjectResponse>
                    handler);

    /**
     * Retrieves a reference in an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetReferenceResponse> getReference(
            GetReferenceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetReferenceRequest, GetReferenceResponse>
                    handler);

    /**
     * Retrieves a runtime operator using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRuntimeOperatorResponse> getRuntimeOperator(
            GetRuntimeOperatorRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRuntimeOperatorRequest, GetRuntimeOperatorResponse>
                    handler);

    /**
     * Retrieves a runtime pipeline using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetRuntimePipelineResponse> getRuntimePipeline(
            GetRuntimePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetRuntimePipelineRequest, GetRuntimePipelineResponse>
                    handler);

    /**
     * Retrieves schedule by schedule key
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduleResponse> getSchedule(
            GetScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduleRequest, GetScheduleResponse> handler);

    /**
     * Retrieves a schema that can be accessed using the specified connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSchemaResponse> getSchema(
            GetSchemaRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse> handler);

    /**
     * Retrieves a task using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTaskResponse> getTask(
            GetTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTaskRequest, GetTaskResponse> handler);

    /**
     * Retrieves a task run using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTaskRunResponse> getTaskRun(
            GetTaskRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTaskRunRequest, GetTaskRunResponse> handler);

    /**
     * Endpoint used to get taskSchedule by its key
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTaskScheduleResponse> getTaskSchedule(
            GetTaskScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTaskScheduleRequest, GetTaskScheduleResponse>
                    handler);

    /**
     * Retrieves a task validation using the specified identifier.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTaskValidationResponse> getTaskValidation(
            GetTaskValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTaskValidationRequest, GetTaskValidationResponse>
                    handler);

    /**
     * This endpoint can be used to get an application template using a key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTemplateResponse> getTemplate(
            GetTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTemplateRequest, GetTemplateResponse> handler);

    /**
     * Retrieves a UserDefinedFunction using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUserDefinedFunctionResponse> getUserDefinedFunction(
            GetUserDefinedFunctionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetUserDefinedFunctionRequest, GetUserDefinedFunctionResponse>
                    handler);

    /**
     * Retrieves a UserDefinedFunction validation using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetUserDefinedFunctionValidationResponse>
            getUserDefinedFunctionValidation(
                    GetUserDefinedFunctionValidationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetUserDefinedFunctionValidationRequest,
                                    GetUserDefinedFunctionValidationResponse>
                            handler);

    /**
     * Retrieves the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * Retrieves a Data Integration workspace using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkspaceResponse> getWorkspace(
            GetWorkspaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkspaceRequest, GetWorkspaceResponse>
                    handler);

    /**
     * Retrieves a list of applications and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListApplicationsResponse> listApplications(
            ListApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListApplicationsRequest, ListApplicationsResponse>
                    handler);

    /**
     * Retrieves a list of connection validations within the specified workspace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConnectionValidationsResponse> listConnectionValidations(
            ListConnectionValidationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListConnectionValidationsRequest, ListConnectionValidationsResponse>
                    handler);

    /**
     * Retrieves a list of all connections.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListConnectionsResponse> listConnections(
            ListConnectionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListConnectionsRequest, ListConnectionsResponse>
                    handler);

    /**
     * This endpoint can be used to get the list of copy object requests.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCopyObjectRequestsResponse> listCopyObjectRequests(
            ListCopyObjectRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCopyObjectRequestsRequest, ListCopyObjectRequestsResponse>
                    handler);

    /**
     * Retrieves a list of all data asset summaries.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataAssetsResponse> listDataAssets(
            ListDataAssetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDataAssetsRequest, ListDataAssetsResponse>
                    handler);

    /**
     * Lists a summary of data entities from the data asset using the specified connection.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataEntitiesResponse> listDataEntities(
            ListDataEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDataEntitiesRequest, ListDataEntitiesResponse>
                    handler);

    /**
     * Retrieves a list of data flow validations within the specified workspace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataFlowValidationsResponse> listDataFlowValidations(
            ListDataFlowValidationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataFlowValidationsRequest, ListDataFlowValidationsResponse>
                    handler);

    /**
     * Retrieves a list of data flows in a project or folder.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataFlowsResponse> listDataFlows(
            ListDataFlowsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDataFlowsRequest, ListDataFlowsResponse>
                    handler);

    /**
     * Retrieves a list of all dependent objects for a specific application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDependentObjectsResponse> listDependentObjects(
            ListDependentObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDependentObjectsRequest, ListDependentObjectsResponse>
                    handler);

    /**
     * This endpoint can be used to list Task Run Lineages within a given time window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDisApplicationTaskRunLineagesResponse>
            listDisApplicationTaskRunLineages(
                    ListDisApplicationTaskRunLineagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDisApplicationTaskRunLineagesRequest,
                                    ListDisApplicationTaskRunLineagesResponse>
                            handler);

    /**
     * Retrieves a list of DIS Applications in a compartment and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDisApplicationsResponse> listDisApplications(
            ListDisApplicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDisApplicationsRequest, ListDisApplicationsResponse>
                    handler);

    /**
     * This endpoint can be used to get the list of export object requests.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExportRequestsResponse> listExportRequests(
            ListExportRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExportRequestsRequest, ListExportRequestsResponse>
                    handler);

    /**
     * Retrieves a lists of external publication validations in a workspace and provides options to filter the list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalPublicationValidationsResponse>
            listExternalPublicationValidations(
                    ListExternalPublicationValidationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListExternalPublicationValidationsRequest,
                                    ListExternalPublicationValidationsResponse>
                            handler);

    /**
     * Retrieves a list of external publications in an application and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExternalPublicationsResponse> listExternalPublications(
            ListExternalPublicationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExternalPublicationsRequest, ListExternalPublicationsResponse>
                    handler);

    /**
     * Retrieves a list of folders in a project and provides options to filter the list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFoldersResponse> listFolders(
            ListFoldersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse> handler);

    /**
     * Retrieves a list of function libraries in a project and provides options to filter the list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFunctionLibrariesResponse> listFunctionLibraries(
            ListFunctionLibrariesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFunctionLibrariesRequest, ListFunctionLibrariesResponse>
                    handler);

    /**
     * This endpoint can be used to get the list of import object requests.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImportRequestsResponse> listImportRequests(
            ListImportRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListImportRequestsRequest, ListImportRequestsResponse>
                    handler);

    /**
     * Retrieves a list of patches in an application and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPatchChangesResponse> listPatchChanges(
            ListPatchChangesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPatchChangesRequest, ListPatchChangesResponse>
                    handler);

    /**
     * Retrieves a list of patches in an application and provides options to filter the list. For listing changes based on a period and logical objects changed, see ListPatchChanges API.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPatchesResponse> listPatches(
            ListPatchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPatchesRequest, ListPatchesResponse> handler);

    /**
     * Retrieves a list of pipeline validations within the specified workspace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPipelineValidationsResponse> listPipelineValidations(
            ListPipelineValidationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPipelineValidationsRequest, ListPipelineValidationsResponse>
                    handler);

    /**
     * Retrieves a list of pipelines in a project or folder from within a workspace, the query parameter specifies the project or folder.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPipelinesResponse> listPipelines(
            ListPipelinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPipelinesRequest, ListPipelinesResponse>
                    handler);

    /**
     * Retrieves a lists of projects in a workspace and provides options to filter the list.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListProjectsResponse> listProjects(
            ListProjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProjectsRequest, ListProjectsResponse>
                    handler);

    /**
     * Retrieves a list of all the published objects for a specified application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPublishedObjectsResponse> listPublishedObjects(
            ListPublishedObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListPublishedObjectsRequest, ListPublishedObjectsResponse>
                    handler);

    /**
     * Retrieves a list of references in an application. Reference objects are created when dataflows and tasks use objects, such as data assets and connections.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListReferencesResponse> listReferences(
            ListReferencesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListReferencesRequest, ListReferencesResponse>
                    handler);

    /**
     * This endpoint can be used to list runtime operators with filtering options
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRuntimeOperatorsResponse> listRuntimeOperators(
            ListRuntimeOperatorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRuntimeOperatorsRequest, ListRuntimeOperatorsResponse>
                    handler);

    /**
     * This endpoint can be used to list runtime pipelines with filtering options
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRuntimePipelinesResponse> listRuntimePipelines(
            ListRuntimePipelinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListRuntimePipelinesRequest, ListRuntimePipelinesResponse>
                    handler);

    /**
     * Use this endpoint to list schedules.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSchedulesResponse> listSchedules(
            ListSchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSchedulesRequest, ListSchedulesResponse>
                    handler);

    /**
     * Retrieves a list of all the schemas that can be accessed using the specified connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse> handler);

    /**
     * This endpoint can be used to list Task Run Lineages within a given time window.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTaskRunLineagesResponse> listTaskRunLineages(
            ListTaskRunLineagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTaskRunLineagesRequest, ListTaskRunLineagesResponse>
                    handler);

    /**
     * Gets log entries for task runs using its key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTaskRunLogsResponse> listTaskRunLogs(
            ListTaskRunLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTaskRunLogsRequest, ListTaskRunLogsResponse>
                    handler);

    /**
     * Retrieves a list of task runs and provides options to filter the list.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTaskRunsResponse> listTaskRuns(
            ListTaskRunsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTaskRunsRequest, ListTaskRunsResponse>
                    handler);

    /**
     * This endpoint can be used to get the list of all the TaskSchedule objects.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTaskSchedulesResponse> listTaskSchedules(
            ListTaskSchedulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTaskSchedulesRequest, ListTaskSchedulesResponse>
                    handler);

    /**
     * Retrieves a list of task validations within the specified workspace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTaskValidationsResponse> listTaskValidations(
            ListTaskValidationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTaskValidationsRequest, ListTaskValidationsResponse>
                    handler);

    /**
     * Retrieves a list of all tasks in a specified project or folder.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTasksResponse> listTasks(
            ListTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTasksRequest, ListTasksResponse> handler);

    /**
     * This endpoint can be used to list application templates with filtering options.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTemplatesResponse> listTemplates(
            ListTemplatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTemplatesRequest, ListTemplatesResponse>
                    handler);

    /**
     * Retrieves a list of UserDefinedFunctionvalidations within the specified workspace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUserDefinedFunctionValidationsResponse>
            listUserDefinedFunctionValidations(
                    ListUserDefinedFunctionValidationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListUserDefinedFunctionValidationsRequest,
                                    ListUserDefinedFunctionValidationsResponse>
                            handler);

    /**
     * Retrieves a list of UserDefinedFunctions in a function library.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUserDefinedFunctionsResponse> listUserDefinedFunctions(
            ListUserDefinedFunctionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUserDefinedFunctionsRequest, ListUserDefinedFunctionsResponse>
                    handler);

    /**
     * Retrieves a paginated list of errors for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Retrieves a paginated list of logs for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Retrieves a list of Data Integration workspaces.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkspacesResponse> listWorkspaces(
            ListWorkspacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkspacesRequest, ListWorkspacesResponse>
                    handler);

    /**
     * Starts a workspace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StartWorkspaceResponse> startWorkspace(
            StartWorkspaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<StartWorkspaceRequest, StartWorkspaceResponse>
                    handler);

    /**
     * Stops a workspace.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<StopWorkspaceResponse> stopWorkspace(
            StopWorkspaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<StopWorkspaceRequest, StopWorkspaceResponse>
                    handler);

    /**
     * Updates an application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateApplicationResponse> updateApplication(
            UpdateApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateApplicationRequest, UpdateApplicationResponse>
                    handler);

    /**
     * Updates the detailed description of an Application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateApplicationDetailedDescriptionResponse>
            updateApplicationDetailedDescription(
                    UpdateApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateApplicationDetailedDescriptionRequest,
                                    UpdateApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * Updates a connection under a data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConnectionResponse> updateConnection(
            UpdateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResponse>
                    handler);

    /**
     * Updates the status of a copy object request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCopyObjectRequestResponse> updateCopyObjectRequest(
            UpdateCopyObjectRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCopyObjectRequestRequest, UpdateCopyObjectRequestResponse>
                    handler);

    /**
     * Updates a specific data asset with default connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataAssetResponse> updateDataAsset(
            UpdateDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDataAssetRequest, UpdateDataAssetResponse>
                    handler);

    /**
     * Updates a specific data flow.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataFlowResponse> updateDataFlow(
            UpdateDataFlowRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDataFlowRequest, UpdateDataFlowResponse>
                    handler);

    /**
     * Updates a DIS Application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDisApplicationResponse> updateDisApplication(
            UpdateDisApplicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDisApplicationRequest, UpdateDisApplicationResponse>
                    handler);

    /**
     * Updates the detailed description of an Application.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDisApplicationDetailedDescriptionResponse>
            updateDisApplicationDetailedDescription(
                    UpdateDisApplicationDetailedDescriptionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateDisApplicationDetailedDescriptionRequest,
                                    UpdateDisApplicationDetailedDescriptionResponse>
                            handler);

    /**
     * Updates the status of a export object request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExportRequestResponse> updateExportRequest(
            UpdateExportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExportRequestRequest, UpdateExportRequestResponse>
                    handler);

    /**
     * Updates the external publication object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExternalPublicationResponse> updateExternalPublication(
            UpdateExternalPublicationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExternalPublicationRequest, UpdateExternalPublicationResponse>
                    handler);

    /**
     * Updates a specific folder.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFolderResponse> updateFolder(
            UpdateFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                    handler);

    /**
     * Updates a specific Function Library.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFunctionLibraryResponse> updateFunctionLibrary(
            UpdateFunctionLibraryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateFunctionLibraryRequest, UpdateFunctionLibraryResponse>
                    handler);

    /**
     * Updates the status of a import object request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateImportRequestResponse> updateImportRequest(
            UpdateImportRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateImportRequestRequest, UpdateImportRequestResponse>
                    handler);

    /**
     * Updates a specific pipeline.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePipelineResponse> updatePipeline(
            UpdatePipelineRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePipelineRequest, UpdatePipelineResponse>
                    handler);

    /**
     * Updates a specific project.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProjectResponse> updateProject(
            UpdateProjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateProjectRequest, UpdateProjectResponse>
                    handler);

    /**
     * Updates the application references. For example, to map a data asset to a different target object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateReferenceResponse> updateReference(
            UpdateReferenceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateReferenceRequest, UpdateReferenceResponse>
                    handler);

    /**
     * Endpoint used to update the schedule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduleResponse> updateSchedule(
            UpdateScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateScheduleRequest, UpdateScheduleResponse>
                    handler);

    /**
     * Updates a specific task. For example, you can update the task description or move the task to a different folder by changing the `aggregatorKey` to a different folder in the registry.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTaskResponse> updateTask(
            UpdateTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTaskRequest, UpdateTaskResponse> handler);

    /**
     * Updates the status of the task run. For example, aborts a task run.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTaskRunResponse> updateTaskRun(
            UpdateTaskRunRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTaskRunRequest, UpdateTaskRunResponse>
                    handler);

    /**
     * Endpoint used to update the TaskSchedule
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTaskScheduleResponse> updateTaskSchedule(
            UpdateTaskScheduleRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTaskScheduleRequest, UpdateTaskScheduleResponse>
                    handler);

    /**
     * Updates a specific UserDefinedFunction.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateUserDefinedFunctionResponse> updateUserDefinedFunction(
            UpdateUserDefinedFunctionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateUserDefinedFunctionRequest, UpdateUserDefinedFunctionResponse>
                    handler);

    /**
     * Updates the specified Data Integration workspace.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateWorkspaceResponse> updateWorkspace(
            UpdateWorkspaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateWorkspaceRequest, UpdateWorkspaceResponse>
                    handler);
}
