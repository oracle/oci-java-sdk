/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;

/**
 * Use the Data Catalog APIs to collect, organize, find, access, understand, enrich, and activate technical, business, and operational metadata.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public interface DataCatalogAsync extends AutoCloseable {

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
     * Add data selector pattern to the data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddDataSelectorPatternsResponse> addDataSelectorPatterns(
            AddDataSelectorPatternsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddDataSelectorPatternsRequest, AddDataSelectorPatternsResponse>
                    handler);

    /**
     * Associate the custom property for the given type
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AssociateCustomPropertyResponse> associateCustomProperty(
            AssociateCustomPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AssociateCustomPropertyRequest, AssociateCustomPropertyResponse>
                    handler);

    /**
     * Attaches a private reverse connection endpoint resource to a data catalog resource. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachCatalogPrivateEndpointResponse> attachCatalogPrivateEndpoint(
            AttachCatalogPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AttachCatalogPrivateEndpointRequest,
                            AttachCatalogPrivateEndpointResponse>
                    handler);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCatalogCompartmentResponse> changeCatalogCompartment(
            ChangeCatalogCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeCatalogCompartmentRequest, ChangeCatalogCompartmentResponse>
                    handler);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeCatalogPrivateEndpointCompartmentResponse>
            changeCatalogPrivateEndpointCompartment(
                    ChangeCatalogPrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeCatalogPrivateEndpointCompartmentRequest,
                                    ChangeCatalogPrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Creates a new entity attribute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAttributeResponse> createAttribute(
            CreateAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAttributeRequest, CreateAttributeResponse>
                    handler);

    /**
     * Creates a new entity attribute tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAttributeTagResponse> createAttributeTag(
            CreateAttributeTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAttributeTagRequest, CreateAttributeTagResponse>
                    handler);

    /**
     * Creates a new data catalog instance that includes a console and an API URL for managing metadata operations.
     * For more information, please see the documentation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCatalogResponse> createCatalog(
            CreateCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateCatalogRequest, CreateCatalogResponse>
                    handler);

    /**
     * Create a new private reverse connection endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCatalogPrivateEndpointResponse> createCatalogPrivateEndpoint(
            CreateCatalogPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCatalogPrivateEndpointRequest,
                            CreateCatalogPrivateEndpointResponse>
                    handler);

    /**
     * Creates a new connection.
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
     * Create a new Custom Property
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateCustomPropertyResponse> createCustomProperty(
            CreateCustomPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateCustomPropertyRequest, CreateCustomPropertyResponse>
                    handler);

    /**
     * Create a new data asset.
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
     * Creates a new data asset tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDataAssetTagResponse> createDataAssetTag(
            CreateDataAssetTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDataAssetTagRequest, CreateDataAssetTagResponse>
                    handler);

    /**
     * Creates a new data entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEntityResponse> createEntity(
            CreateEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateEntityRequest, CreateEntityResponse>
                    handler);

    /**
     * Creates a new entity tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEntityTagResponse> createEntityTag(
            CreateEntityTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateEntityTagRequest, CreateEntityTagResponse>
                    handler);

    /**
     * Creates a new folder.
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
     * Creates a new folder tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateFolderTagResponse> createFolderTag(
            CreateFolderTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFolderTagRequest, CreateFolderTagResponse>
                    handler);

    /**
     * Creates a new glossary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateGlossaryResponse> createGlossary(
            CreateGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateGlossaryRequest, CreateGlossaryResponse>
                    handler);

    /**
     * Creates a new job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobResponse> createJob(
            CreateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJobRequest, CreateJobResponse> handler);

    /**
     * Creates a new job definition.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobDefinitionResponse> createJobDefinition(
            CreateJobDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateJobDefinitionRequest, CreateJobDefinitionResponse>
                    handler);

    /**
     * Creates a new job execution.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateJobExecutionResponse> createJobExecution(
            CreateJobExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateJobExecutionRequest, CreateJobExecutionResponse>
                    handler);

    /**
     * Create a new Namespace to be used by a custom property
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateNamespaceResponse> createNamespace(
            CreateNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateNamespaceRequest, CreateNamespaceResponse>
                    handler);

    /**
     * Create a new pattern.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreatePatternResponse> createPattern(
            CreatePatternRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreatePatternRequest, CreatePatternResponse>
                    handler);

    /**
     * Create a new term within a glossary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTermResponse> createTerm(
            CreateTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateTermRequest, CreateTermResponse> handler);

    /**
     * Creates a new term relationship for this term within a glossary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateTermRelationshipResponse> createTermRelationship(
            CreateTermRelationshipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateTermRelationshipRequest, CreateTermRelationshipResponse>
                    handler);

    /**
     * Deletes a specific entity attribute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAttributeResponse> deleteAttribute(
            DeleteAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAttributeRequest, DeleteAttributeResponse>
                    handler);

    /**
     * Deletes a specific entity attribute tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAttributeTagResponse> deleteAttributeTag(
            DeleteAttributeTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAttributeTagRequest, DeleteAttributeTagResponse>
                    handler);

    /**
     * Deletes a data catalog resource by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCatalogResponse> deleteCatalog(
            DeleteCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteCatalogRequest, DeleteCatalogResponse>
                    handler);

    /**
     * Deletes a private reverse connection endpoint by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCatalogPrivateEndpointResponse> deleteCatalogPrivateEndpoint(
            DeleteCatalogPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCatalogPrivateEndpointRequest,
                            DeleteCatalogPrivateEndpointResponse>
                    handler);

    /**
     * Deletes a specific connection of a data asset.
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
     * Deletes a specific custom property identified by it's key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCustomPropertyResponse> deleteCustomProperty(
            DeleteCustomPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCustomPropertyRequest, DeleteCustomPropertyResponse>
                    handler);

    /**
     * Deletes a specific data asset identified by it's key.
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
     * Deletes a specific data asset tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDataAssetTagResponse> deleteDataAssetTag(
            DeleteDataAssetTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDataAssetTagRequest, DeleteDataAssetTagResponse>
                    handler);

    /**
     * Deletes a specific data entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEntityResponse> deleteEntity(
            DeleteEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteEntityRequest, DeleteEntityResponse>
                    handler);

    /**
     * Deletes a specific entity tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEntityTagResponse> deleteEntityTag(
            DeleteEntityTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteEntityTagRequest, DeleteEntityTagResponse>
                    handler);

    /**
     * Deletes a specific folder of a data asset identified by it's key.
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
     * Deletes a specific folder tag.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFolderTagResponse> deleteFolderTag(
            DeleteFolderTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFolderTagRequest, DeleteFolderTagResponse>
                    handler);

    /**
     * Deletes a specific glossary identified by it's key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteGlossaryResponse> deleteGlossary(
            DeleteGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteGlossaryRequest, DeleteGlossaryResponse>
                    handler);

    /**
     * Deletes a specific job identified by it's key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJobResponse> deleteJob(
            DeleteJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteJobRequest, DeleteJobResponse> handler);

    /**
     * Deletes a specific job definition identified by it's key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJobDefinitionResponse> deleteJobDefinition(
            DeleteJobDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteJobDefinitionRequest, DeleteJobDefinitionResponse>
                    handler);

    /**
     * Deletes a specific Namespace identified by it's key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNamespaceResponse> deleteNamespace(
            DeleteNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNamespaceRequest, DeleteNamespaceResponse>
                    handler);

    /**
     * Deletes a specific pattern identified by it's key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeletePatternResponse> deletePattern(
            DeletePatternRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeletePatternRequest, DeletePatternResponse>
                    handler);

    /**
     * Deletes a specific glossary term.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTermResponse> deleteTerm(
            DeleteTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteTermRequest, DeleteTermResponse> handler);

    /**
     * Deletes a specific glossary term relationship.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteTermRelationshipResponse> deleteTermRelationship(
            DeleteTermRelationshipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteTermRelationshipRequest, DeleteTermRelationshipResponse>
                    handler);

    /**
     * Detaches a private reverse connection endpoint resource to a data catalog resource. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachCatalogPrivateEndpointResponse> detachCatalogPrivateEndpoint(
            DetachCatalogPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DetachCatalogPrivateEndpointRequest,
                            DetachCatalogPrivateEndpointResponse>
                    handler);

    /**
     * Remove the custom property for the given type
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisassociateCustomPropertyResponse> disassociateCustomProperty(
            DisassociateCustomPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisassociateCustomPropertyRequest, DisassociateCustomPropertyResponse>
                    handler);

    /**
     * Returns the fully expanded tree hierarchy of parent and child terms in this glossary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExpandTreeForGlossaryResponse> expandTreeForGlossary(
            ExpandTreeForGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExpandTreeForGlossaryRequest, ExpandTreeForGlossaryResponse>
                    handler);

    /**
     * Export the glossary and the terms and return the exported glossary as csv or json.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ExportGlossaryResponse> exportGlossary(
            ExportGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<ExportGlossaryRequest, ExportGlossaryResponse>
                    handler);

    /**
     * Gets a specific entity attribute by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAttributeResponse> getAttribute(
            GetAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAttributeRequest, GetAttributeResponse>
                    handler);

    /**
     * Gets a specific entity attribute tag by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAttributeTagResponse> getAttributeTag(
            GetAttributeTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAttributeTagRequest, GetAttributeTagResponse>
                    handler);

    /**
     * Gets a data catalog by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCatalogResponse> getCatalog(
            GetCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetCatalogRequest, GetCatalogResponse> handler);

    /**
     * Gets a specific private reverse connection by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCatalogPrivateEndpointResponse> getCatalogPrivateEndpoint(
            GetCatalogPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCatalogPrivateEndpointRequest, GetCatalogPrivateEndpointResponse>
                    handler);

    /**
     * Gets a specific data asset connection by key.
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
     * Gets a specific custom property for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetCustomPropertyResponse> getCustomProperty(
            GetCustomPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCustomPropertyRequest, GetCustomPropertyResponse>
                    handler);

    /**
     * Gets a specific data asset for the given key within a data catalog.
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
     * Gets a specific data asset tag by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDataAssetTagResponse> getDataAssetTag(
            GetDataAssetTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDataAssetTagRequest, GetDataAssetTagResponse>
                    handler);

    /**
     * Gets a specific data entity by key for a data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetEntityResponse> getEntity(
            GetEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEntityRequest, GetEntityResponse> handler);

    /**
     * Gets a specific entity tag by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetEntityTagResponse> getEntityTag(
            GetEntityTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetEntityTagRequest, GetEntityTagResponse>
                    handler);

    /**
     * Gets a specific data asset folder by key.
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
     * Gets a specific folder tag by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetFolderTagResponse> getFolderTag(
            GetFolderTagRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFolderTagRequest, GetFolderTagResponse>
                    handler);

    /**
     * Gets a specific glossary by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetGlossaryResponse> getGlossary(
            GetGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetGlossaryRequest, GetGlossaryResponse> handler);

    /**
     * Gets a specific job by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobResponse> getJob(
            GetJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobRequest, GetJobResponse> handler);

    /**
     * Gets a specific job definition by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobDefinitionResponse> getJobDefinition(
            GetJobDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobDefinitionRequest, GetJobDefinitionResponse>
                    handler);

    /**
     * Gets a specific job execution by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobExecutionResponse> getJobExecution(
            GetJobExecutionRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobExecutionRequest, GetJobExecutionResponse>
                    handler);

    /**
     * Gets a specific job log by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobLogResponse> getJobLog(
            GetJobLogRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobLogRequest, GetJobLogResponse> handler);

    /**
     * Gets a specific job metric by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetJobMetricsResponse> getJobMetrics(
            GetJobMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJobMetricsRequest, GetJobMetricsResponse>
                    handler);

    /**
     * Gets a specific namespace for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetNamespaceResponse> getNamespace(
            GetNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNamespaceRequest, GetNamespaceResponse>
                    handler);

    /**
     * Gets a specific pattern for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetPatternResponse> getPattern(
            GetPatternRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetPatternRequest, GetPatternResponse> handler);

    /**
     * Gets a specific glossary term by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTermResponse> getTerm(
            GetTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTermRequest, GetTermResponse> handler);

    /**
     * Gets a specific glossary term relationship by key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTermRelationshipResponse> getTermRelationship(
            GetTermRelationshipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetTermRelationshipRequest, GetTermRelationshipResponse>
                    handler);

    /**
     * Gets a specific type by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetTypeResponse> getType(
            GetTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetTypeRequest, GetTypeResponse> handler);

    /**
     * Gets the status of the work request with the given OCID.
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
     * Import new connection for this data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportConnectionResponse> importConnection(
            ImportConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportConnectionRequest, ImportConnectionResponse>
                    handler);

    /**
     * Import the glossary and the terms from csv or json files and return the imported glossary resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ImportGlossaryResponse> importGlossary(
            ImportGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<ImportGlossaryRequest, ImportGlossaryResponse>
                    handler);

    /**
     * List the physical entities aggregated by this logical entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAggregatedPhysicalEntitiesResponse>
            listAggregatedPhysicalEntities(
                    ListAggregatedPhysicalEntitiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAggregatedPhysicalEntitiesRequest,
                                    ListAggregatedPhysicalEntitiesResponse>
                            handler);

    /**
     * Returns a list of all tags for an entity attribute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAttributeTagsResponse> listAttributeTags(
            ListAttributeTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAttributeTagsRequest, ListAttributeTagsResponse>
                    handler);

    /**
     * Returns a list of all attributes of an data entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAttributesResponse> listAttributes(
            ListAttributesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAttributesRequest, ListAttributesResponse>
                    handler);

    /**
     * Returns a list of all the catalog private endpoints in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCatalogPrivateEndpointsResponse> listCatalogPrivateEndpoints(
            ListCatalogPrivateEndpointsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCatalogPrivateEndpointsRequest, ListCatalogPrivateEndpointsResponse>
                    handler);

    /**
     * Returns a list of all the data catalogs in the specified compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCatalogsResponse> listCatalogs(
            ListCatalogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListCatalogsRequest, ListCatalogsResponse>
                    handler);

    /**
     * Returns a list of all Connections for a data asset.
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
     * Returns a list of custom properties within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListCustomPropertiesResponse> listCustomProperties(
            ListCustomPropertiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCustomPropertiesRequest, ListCustomPropertiesResponse>
                    handler);

    /**
     * Returns a list of all tags for a data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDataAssetTagsResponse> listDataAssetTags(
            ListDataAssetTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDataAssetTagsRequest, ListDataAssetTagsResponse>
                    handler);

    /**
     * Returns a list of data assets within a data catalog.
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
     * List logical entities derived from this pattern.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDerivedLogicalEntitiesResponse> listDerivedLogicalEntities(
            ListDerivedLogicalEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDerivedLogicalEntitiesRequest, ListDerivedLogicalEntitiesResponse>
                    handler);

    /**
     * Returns a list of all entities of a data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEntitiesResponse> listEntities(
            ListEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEntitiesRequest, ListEntitiesResponse>
                    handler);

    /**
     * Returns a list of all tags for a data entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEntityTagsResponse> listEntityTags(
            ListEntityTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListEntityTagsRequest, ListEntityTagsResponse>
                    handler);

    /**
     * Returns a list of all tags for a folder.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListFolderTagsResponse> listFolderTags(
            ListFolderTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFolderTagsRequest, ListFolderTagsResponse>
                    handler);

    /**
     * Returns a list of all folders.
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
     * Returns a list of all glossaries within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListGlossariesResponse> listGlossaries(
            ListGlossariesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListGlossariesRequest, ListGlossariesResponse>
                    handler);

    /**
     * Returns a list of job definitions within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobDefinitionsResponse> listJobDefinitions(
            ListJobDefinitionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJobDefinitionsRequest, ListJobDefinitionsResponse>
                    handler);

    /**
     * Returns a list of job executions for a job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobExecutionsResponse> listJobExecutions(
            ListJobExecutionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListJobExecutionsRequest, ListJobExecutionsResponse>
                    handler);

    /**
     * Returns a list of job logs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobLogsResponse> listJobLogs(
            ListJobLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobLogsRequest, ListJobLogsResponse> handler);

    /**
     * Returns a list of job metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobMetricsResponse> listJobMetrics(
            ListJobMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobMetricsRequest, ListJobMetricsResponse>
                    handler);

    /**
     * Returns a list of jobs within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListJobsResponse> listJobs(
            ListJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJobsRequest, ListJobsResponse> handler);

    /**
     * Returns a list of namespaces within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNamespacesResponse> listNamespaces(
            ListNamespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNamespacesRequest, ListNamespacesResponse>
                    handler);

    /**
     * Returns a list of patterns within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPatternsResponse> listPatterns(
            ListPatternsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListPatternsRequest, ListPatternsResponse>
                    handler);

    /**
     * Returns a list of all rules of a data entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListRulesResponse> listRules(
            ListRulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListRulesRequest, ListRulesResponse> handler);

    /**
     * Returns a list of all user created tags in the system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTagsResponse> listTags(
            ListTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTagsRequest, ListTagsResponse> handler);

    /**
     * Returns a list of all term relationships within a glossary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTermRelationshipsResponse> listTermRelationships(
            ListTermRelationshipsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListTermRelationshipsRequest, ListTermRelationshipsResponse>
                    handler);

    /**
     * Returns a list of all terms within a glossary.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTermsResponse> listTerms(
            ListTermsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTermsRequest, ListTermsResponse> handler);

    /**
     * Returns a list of all types within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListTypesResponse> listTypes(
            ListTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListTypesRequest, ListTypesResponse> handler);

    /**
     * Returns a (paginated) list of errors for a given work request.
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
     * Returns a (paginated) list of logs for a given work request.
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
     * Returns stats on objects by type in the repository.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ObjectStatsResponse> objectStats(
            ObjectStatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ObjectStatsRequest, ObjectStatsResponse> handler);

    /**
     * Parse data asset references through connections from this data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ParseConnectionResponse> parseConnection(
            ParseConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<ParseConnectionRequest, ParseConnectionResponse>
                    handler);

    /**
     * Remove data selector pattern from the data asset.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveDataSelectorPatternsResponse> removeDataSelectorPatterns(
            RemoveDataSelectorPatternsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveDataSelectorPatternsRequest, RemoveDataSelectorPatternsResponse>
                    handler);

    /**
     * Returns a list of search results within a data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SearchCriteriaResponse> searchCriteria(
            SearchCriteriaRequest request,
            com.oracle.bmc.responses.AsyncHandler<SearchCriteriaRequest, SearchCriteriaResponse>
                    handler);

    /**
     * Test the connection by connecting to the data asset using credentials in the metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<TestConnectionResponse> testConnection(
            TestConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<TestConnectionRequest, TestConnectionResponse>
                    handler);

    /**
     * Updates a specific data asset attribute.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAttributeResponse> updateAttribute(
            UpdateAttributeRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAttributeRequest, UpdateAttributeResponse>
                    handler);

    /**
     * Updates the data catalog.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCatalogResponse> updateCatalog(
            UpdateCatalogRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateCatalogRequest, UpdateCatalogResponse>
                    handler);

    /**
     * Updates the private reverse connection endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCatalogPrivateEndpointResponse> updateCatalogPrivateEndpoint(
            UpdateCatalogPrivateEndpointRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCatalogPrivateEndpointRequest,
                            UpdateCatalogPrivateEndpointResponse>
                    handler);

    /**
     * Updates a specific connection of a data asset.
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
     * Updates a specific custom property identified by the given key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateCustomPropertyResponse> updateCustomProperty(
            UpdateCustomPropertyRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateCustomPropertyRequest, UpdateCustomPropertyResponse>
                    handler);

    /**
     * Updates a specific data asset identified by the given key.
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
     * Updates a specific data entity.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEntityResponse> updateEntity(
            UpdateEntityRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateEntityRequest, UpdateEntityResponse>
                    handler);

    /**
     * Updates a specific folder of a data asset.
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
     * Updates a specific glossary identified by the given key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateGlossaryResponse> updateGlossary(
            UpdateGlossaryRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateGlossaryRequest, UpdateGlossaryResponse>
                    handler);

    /**
     * Updates a specific job identified by the given key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobResponse> updateJob(
            UpdateJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJobRequest, UpdateJobResponse> handler);

    /**
     * Update a specific job definition identified by the given key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJobDefinitionResponse> updateJobDefinition(
            UpdateJobDefinitionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateJobDefinitionRequest, UpdateJobDefinitionResponse>
                    handler);

    /**
     * Updates a specific namespace identified by the given key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNamespaceResponse> updateNamespace(
            UpdateNamespaceRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateNamespaceRequest, UpdateNamespaceResponse>
                    handler);

    /**
     * Updates a specific pattern identified by the given key.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePatternResponse> updatePattern(
            UpdatePatternRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdatePatternRequest, UpdatePatternResponse>
                    handler);

    /**
     * Updates a specific glossary term.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTermResponse> updateTerm(
            UpdateTermRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateTermRequest, UpdateTermResponse> handler);

    /**
     * Updates a specific glossary term relationship.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateTermRelationshipResponse> updateTermRelationship(
            UpdateTermRelationshipRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateTermRelationshipRequest, UpdateTermRelationshipResponse>
                    handler);

    /**
     * Upload connection credentails and metadata for this connection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UploadCredentialsResponse> uploadCredentials(
            UploadCredentialsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UploadCredentialsRequest, UploadCredentialsResponse>
                    handler);

    /**
     * Returns active users in the system.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UsersResponse> users(
            UsersRequest request,
            com.oracle.bmc.responses.AsyncHandler<UsersRequest, UsersResponse> handler);

    /**
     * Validate connection by connecting to the data asset using credentials in metadata.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidateConnectionResponse> validateConnection(
            ValidateConnectionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ValidateConnectionRequest, ValidateConnectionResponse>
                    handler);

    /**
     * Validate pattern by deriving file groups representing logical entities using the expression
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ValidatePatternResponse> validatePattern(
            ValidatePatternRequest request,
            com.oracle.bmc.responses.AsyncHandler<ValidatePatternRequest, ValidatePatternResponse>
                    handler);
}
