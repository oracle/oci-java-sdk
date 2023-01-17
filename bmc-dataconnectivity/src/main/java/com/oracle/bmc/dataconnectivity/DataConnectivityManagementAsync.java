/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity;

import com.oracle.bmc.dataconnectivity.requests.*;
import com.oracle.bmc.dataconnectivity.responses.*;

/**
 * Use the Data Connectivity Management Service APIs to perform common extract, load, and transform
 * (ETL) tasks.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public interface DataConnectivityManagementAsync extends AutoCloseable {

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
     * The endpoint will be moved to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEndpointCompartmentResponse> changeEndpointCompartment(
            ChangeEndpointCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeEndpointCompartmentRequest, ChangeEndpointCompartmentResponse>
                    handler);

    /**
     * The registry will be moved to the specified compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeRegistryCompartmentResponse> changeRegistryCompartment(
            ChangeRegistryCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeRegistryCompartmentRequest, ChangeRegistryCompartmentResponse>
                    handler);

    /**
     * Attaches a list of data assets to the given endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAttachDataAssetResponse> createAttachDataAsset(
            CreateAttachDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAttachDataAssetRequest, CreateAttachDataAssetResponse>
                    handler);

    /**
     * Creates a connection under an existing data asset.
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
     * Creates a connection validation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectionValidationResponse> createConnectionValidation(
            CreateConnectionValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectionValidationRequest, CreateConnectionValidationResponse>
                    handler);

    /**
     * This endpoint is used to trigger validation of dataAsset, connection, schema, entity,
     * dataOperationConfig
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateConnectivityValidationResponse> createConnectivityValidation(
            CreateConnectivityValidationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateConnectivityValidationRequest,
                            CreateConnectivityValidationResponse>
                    handler);

    /**
     * Creates a data asset with default connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataAssetResponse> createDataAsset(
            CreateDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDataAssetRequest, CreateDataAssetResponse>
                    handler);

    /**
     * Provide data preview on live schema.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataPreviewResponse> createDataPreview(
            CreateDataPreviewRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataPreviewRequest, CreateDataPreviewResponse>
                    handler);

    /**
     * Execute data profiling on live schema.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataProfileResponse> createDataProfile(
            CreateDataProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataProfileRequest, CreateDataProfileResponse>
                    handler);

    /**
     * Dereferenced a dcms artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDeReferenceArtifactResponse> createDeReferenceArtifact(
            CreateDeReferenceArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDeReferenceArtifactRequest, CreateDeReferenceArtifactResponse>
                    handler);

    /**
     * Detaches a list of data assets to the given endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDetachDataAssetResponse> createDetachDataAsset(
            CreateDetachDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDetachDataAssetRequest, CreateDetachDataAssetResponse>
                    handler);

    /**
     * Creates a new Data Connectivity Management endpoint ready to perform data connectivity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEndpointResponse> createEndpoint(
            CreateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateEndpointRequest, CreateEndpointResponse>
                    handler);

    /**
     * Creates the data entity shape using the shape from the data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEntityShapeResponse> createEntityShape(
            CreateEntityShapeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateEntityShapeRequest, CreateEntityShapeResponse>
                    handler);

    /**
     * Call the operation to execute
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExecuteOperationJobResponse> createExecuteOperationJob(
            CreateExecuteOperationJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExecuteOperationJobRequest, CreateExecuteOperationJobResponse>
                    handler);

    /**
     * Creates a folder under a specified registry.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFolderResponse> createFolder(
            CreateFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFolderRequest, CreateFolderResponse>
                    handler);

    /**
     * This endpoint is used to create a connectivity task (such as PushdownTask).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFullPushDownTaskResponse> createFullPushDownTask(
            CreateFullPushDownTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateFullPushDownTaskRequest, CreateFullPushDownTaskResponse>
                    handler);

    /**
     * Reference a data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateReferenceArtifactResponse> createReferenceArtifact(
            CreateReferenceArtifactRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateReferenceArtifactRequest, CreateReferenceArtifactResponse>
                    handler);

    /**
     * Creates a new Data Connectivity Management registry ready to perform data connectivity
     * management.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateRegistryResponse> createRegistry(
            CreateRegistryRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateRegistryRequest, CreateRegistryResponse>
                    handler);

    /**
     * Execute network validation on the selected data assets associated with the provided private
     * endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateTestNetworkConnectivityResponse>
            createTestNetworkConnectivity(
                    CreateTestNetworkConnectivityRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateTestNetworkConnectivityRequest,
                                    CreateTestNetworkConnectivityResponse>
                            handler);

    /**
     * Removes a connection using the specified identifier.
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
     * Removes a data asset using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataAssetResponse> deleteDataAsset(
            DeleteDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDataAssetRequest, DeleteDataAssetResponse>
                    handler);

    /**
     * Deletes a Data Connectivity Management endpoint resource by its identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEndpointResponse> deleteEndpoint(
            DeleteEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResponse>
                    handler);

    /**
     * Removes a folder using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFolderResponse> deleteFolder(
            DeleteFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFolderRequest, DeleteFolderResponse>
                    handler);

    /**
     * This api is used to delete a persisted NetworkValidationStatus by its key
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNetworkConnectivityStatusResponse>
            deleteNetworkConnectivityStatus(
                    DeleteNetworkConnectivityStatusRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteNetworkConnectivityStatusRequest,
                                    DeleteNetworkConnectivityStatusResponse>
                            handler);

    /**
     * Deletes a Data Connectivity Management registry resource by its identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteRegistryResponse> deleteRegistry(
            DeleteRegistryRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteRegistryRequest, DeleteRegistryResponse>
                    handler);

    /**
     * Get the Derived Entities from the EntityFlowMode and reference key of DataObject
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeriveEntitiesResponse> deriveEntities(
            DeriveEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeriveEntitiesRequest, DeriveEntitiesResponse>
                    handler);

    /**
     * Retrieves the connection details using the specified identifier.
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
     * Retrieves details of a data asset using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
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
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDataEntityResponse> getDataEntity(
            GetDataEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataEntityRequest, GetDataEntityResponse>
                    handler);

    /**
     * Gets a Data Connectivity Management endpoint by its identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEndpointResponse> getEndpoint(
            GetEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEndpointRequest, GetEndpointResponse> handler);

    /**
     * This endpoint is used to fetch connector-specific engine configurations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEngineConfigurationsResponse> getEngineConfigurations(
            GetEngineConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEngineConfigurationsRequest, GetEngineConfigurationsResponse>
                    handler);

    /**
     * Get the status or the result of the execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExecuteOperationJobResponse> getExecuteOperationJob(
            GetExecuteOperationJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExecuteOperationJobRequest, GetExecuteOperationJobResponse>
                    handler);

    /**
     * Retrieves the folder details using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFolderResponse> getFolder(
            GetFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFolderRequest, GetFolderResponse> handler);

    /**
     * Get the status of network reachability check, with the timestamp of when the status was last
     * checked, for a given PrivateEndpoint-DataAsset pair.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNetworkConnectivityStatusResponse> getNetworkConnectivityStatus(
            GetNetworkConnectivityStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetNetworkConnectivityStatusRequest,
                            GetNetworkConnectivityStatusResponse>
                    handler);

    /**
     * Retrieves the details of operation with the given resource name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOperationResponse> getOperation(
            GetOperationRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetOperationRequest, GetOperationResponse>
                    handler);

    /**
     * Retrieves a Data Connectivity Management registry using the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetRegistryResponse> getRegistry(
            GetRegistryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetRegistryRequest, GetRegistryResponse> handler);

    /**
     * Retrieves a schema that can be accessed using the specified connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetSchemaResponse> getSchema(
            GetSchemaRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetSchemaRequest, GetSchemaResponse> handler);

    /**
     * This endpoint retrieves dataAsset and connection attributes from DataAssetRegistry.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetTypeResponse> getType(
            GetTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTypeRequest, GetTypeResponse> handler);

    /**
     * Gets the status of the work request with the given ID.
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
     * Retrieves a list of all connections.
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
     * Retrieves a list of all data asset summaries.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataAssetsResponse> listDataAssets(
            ListDataAssetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDataAssetsRequest, ListDataAssetsResponse>
                    handler);

    /**
     * Lists a summary of data entities from the data asset using the specified connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDataEntitiesResponse> listDataEntities(
            ListDataEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDataEntitiesRequest, ListDataEntitiesResponse>
                    handler);

    /**
     * Returns a list of Data Connectivity Management endpoints.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEndpointsResponse> listEndpoints(
            ListEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEndpointsRequest, ListEndpointsResponse>
                    handler);

    /**
     * Retrieves a list of all the folders.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFoldersResponse> listFolders(
            ListFoldersRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFoldersRequest, ListFoldersResponse> handler);

    /**
     * Lists the summary of operations that are present in the schema, identified by the schema
     * name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOperationsResponse> listOperations(
            ListOperationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListOperationsRequest, ListOperationsResponse>
                    handler);

    /**
     * Retrieves a list of all reference info of a dcms artifact.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListReferenceArtifactsResponse> listReferenceArtifacts(
            ListReferenceArtifactsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListReferenceArtifactsRequest, ListReferenceArtifactsResponse>
                    handler);

    /**
     * Retrieves a list of Data Connectivity Management registries.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListRegistriesResponse> listRegistries(
            ListRegistriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRegistriesRequest, ListRegistriesResponse>
                    handler);

    /**
     * Retrieves a list of all the schemas that can be accessed using the specified connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSchemasResponse> listSchemas(
            ListSchemasRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSchemasRequest, ListSchemasResponse> handler);

    /**
     * This endpoint retrieves a list of all the supported connector types.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListTypesResponse> listTypes(
            ListTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTypesRequest, ListTypesResponse> handler);

    /**
     * Returns a (paginated) list of errors for a given work request.
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
     * Returns a (paginated) list of logs for a given work request.
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
     * Updates a connection under a data asset.
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
     * Updates a specific data asset with default connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDataAssetResponse> updateDataAsset(
            UpdateDataAssetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDataAssetRequest, UpdateDataAssetResponse>
                    handler);

    /**
     * Updates the Data Connectivity Management endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEndpointResponse> updateEndpoint(
            UpdateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateEndpointRequest, UpdateEndpointResponse>
                    handler);

    /**
     * Updates a folder under a specified registry.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFolderResponse> updateFolder(
            UpdateFolderRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFolderRequest, UpdateFolderResponse>
                    handler);

    /**
     * Updates the Data Connectivity Management Registry.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateRegistryResponse> updateRegistry(
            UpdateRegistryRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateRegistryRequest, UpdateRegistryResponse>
                    handler);

    /**
     * Validates the dataAsset network reachability.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ValidateDataAssetNetworkReachablityResponse>
            validateDataAssetNetworkReachablity(
                    ValidateDataAssetNetworkReachablityRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ValidateDataAssetNetworkReachablityRequest,
                                    ValidateDataAssetNetworkReachablityResponse>
                            handler);
}
