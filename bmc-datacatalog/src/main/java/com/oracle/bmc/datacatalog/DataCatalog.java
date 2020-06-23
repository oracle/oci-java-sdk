/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public interface DataCatalog extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

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
     * Attaches a private reverse connection endpoint resource to a data catalog resource. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    AttachCatalogPrivateEndpointResponse attachCatalogPrivateEndpoint(
            AttachCatalogPrivateEndpointRequest request);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeCatalogCompartmentResponse changeCatalogCompartment(
            ChangeCatalogCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ChangeCatalogPrivateEndpointCompartmentResponse changeCatalogPrivateEndpointCompartment(
            ChangeCatalogPrivateEndpointCompartmentRequest request);

    /**
     * Creates a new entity attribute.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAttributeResponse createAttribute(CreateAttributeRequest request);

    /**
     * Creates a new entity attribute tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateAttributeTagResponse createAttributeTag(CreateAttributeTagRequest request);

    /**
     * Creates a new data catalog instance that includes a console and an API URL for managing metadata operations.
     * For more information, please see the documentation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCatalogResponse createCatalog(CreateCatalogRequest request);

    /**
     * Create a new private reverse connection endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateCatalogPrivateEndpointResponse createCatalogPrivateEndpoint(
            CreateCatalogPrivateEndpointRequest request);

    /**
     * Creates a new connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateConnectionResponse createConnection(CreateConnectionRequest request);

    /**
     * Create a new data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request);

    /**
     * Creates a new data asset tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateDataAssetTagResponse createDataAssetTag(CreateDataAssetTagRequest request);

    /**
     * Creates a new data entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateEntityResponse createEntity(CreateEntityRequest request);

    /**
     * Creates a new entity tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateEntityTagResponse createEntityTag(CreateEntityTagRequest request);

    /**
     * Creates a new folder.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateFolderResponse createFolder(CreateFolderRequest request);

    /**
     * Creates a new folder tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateFolderTagResponse createFolderTag(CreateFolderTagRequest request);

    /**
     * Creates a new glossary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateGlossaryResponse createGlossary(CreateGlossaryRequest request);

    /**
     * Creates a new job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a new job definition.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateJobDefinitionResponse createJobDefinition(CreateJobDefinitionRequest request);

    /**
     * Creates a new job execution.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateJobExecutionResponse createJobExecution(CreateJobExecutionRequest request);

    /**
     * Create a new term within a glossary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTermResponse createTerm(CreateTermRequest request);

    /**
     * Creates a new term relationship for this term within a glossary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    CreateTermRelationshipResponse createTermRelationship(CreateTermRelationshipRequest request);

    /**
     * Deletes a specific entity attribute.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAttributeResponse deleteAttribute(DeleteAttributeRequest request);

    /**
     * Deletes a specific entity attribute tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteAttributeTagResponse deleteAttributeTag(DeleteAttributeTagRequest request);

    /**
     * Deletes a data catalog resource by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request);

    /**
     * Deletes a private reverse connection endpoint by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteCatalogPrivateEndpointResponse deleteCatalogPrivateEndpoint(
            DeleteCatalogPrivateEndpointRequest request);

    /**
     * Deletes a specific connection of a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request);

    /**
     * Deletes a specific data asset identified by it's key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request);

    /**
     * Deletes a specific data asset tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteDataAssetTagResponse deleteDataAssetTag(DeleteDataAssetTagRequest request);

    /**
     * Deletes a specific data entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteEntityResponse deleteEntity(DeleteEntityRequest request);

    /**
     * Deletes a specific entity tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteEntityTagResponse deleteEntityTag(DeleteEntityTagRequest request);

    /**
     * Deletes a specific folder of a data asset identified by it's key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteFolderResponse deleteFolder(DeleteFolderRequest request);

    /**
     * Deletes a specific folder tag.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteFolderTagResponse deleteFolderTag(DeleteFolderTagRequest request);

    /**
     * Deletes a specific glossary identified by it's key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteGlossaryResponse deleteGlossary(DeleteGlossaryRequest request);

    /**
     * Deletes a specific job identified by it's key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteJobResponse deleteJob(DeleteJobRequest request);

    /**
     * Deletes a specific job definition identified by it's key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteJobDefinitionResponse deleteJobDefinition(DeleteJobDefinitionRequest request);

    /**
     * Deletes a specific glossary term.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTermResponse deleteTerm(DeleteTermRequest request);

    /**
     * Deletes a specific glossary term relationship.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DeleteTermRelationshipResponse deleteTermRelationship(DeleteTermRelationshipRequest request);

    /**
     * Detaches a private reverse connection endpoint resource to a data catalog resource. When provided, 'If-Match' is checked against 'ETag' values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    DetachCatalogPrivateEndpointResponse detachCatalogPrivateEndpoint(
            DetachCatalogPrivateEndpointRequest request);

    /**
     * Returns the fully expanded tree hierarchy of parent and child terms in this glossary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExpandTreeForGlossaryResponse expandTreeForGlossary(ExpandTreeForGlossaryRequest request);

    /**
     * Export the glossary and the terms and return the exported glossary as csv or json.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ExportGlossaryResponse exportGlossary(ExportGlossaryRequest request);

    /**
     * Gets a specific entity attribute by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAttributeResponse getAttribute(GetAttributeRequest request);

    /**
     * Gets a specific entity attribute tag by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetAttributeTagResponse getAttributeTag(GetAttributeTagRequest request);

    /**
     * Gets a data catalog by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCatalogResponse getCatalog(GetCatalogRequest request);

    /**
     * Gets a specific private reverse connection by identifier.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetCatalogPrivateEndpointResponse getCatalogPrivateEndpoint(
            GetCatalogPrivateEndpointRequest request);

    /**
     * Gets a specific data asset connection by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetConnectionResponse getConnection(GetConnectionRequest request);

    /**
     * Gets a specific data asset for the given key within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataAssetResponse getDataAsset(GetDataAssetRequest request);

    /**
     * Gets a specific data asset tag by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetDataAssetTagResponse getDataAssetTag(GetDataAssetTagRequest request);

    /**
     * Gets a specific data entity by key for a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetEntityResponse getEntity(GetEntityRequest request);

    /**
     * Gets a specific entity tag by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetEntityTagResponse getEntityTag(GetEntityTagRequest request);

    /**
     * Gets a specific data asset folder by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFolderResponse getFolder(GetFolderRequest request);

    /**
     * Gets a specific folder tag by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetFolderTagResponse getFolderTag(GetFolderTagRequest request);

    /**
     * Gets a specific glossary by key within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetGlossaryResponse getGlossary(GetGlossaryRequest request);

    /**
     * Gets a specific job by key within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Gets a specific job definition by key within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobDefinitionResponse getJobDefinition(GetJobDefinitionRequest request);

    /**
     * Gets a specific job execution by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request);

    /**
     * Gets a specific job log by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobLogResponse getJobLog(GetJobLogRequest request);

    /**
     * Gets a specific job metric by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetJobMetricsResponse getJobMetrics(GetJobMetricsRequest request);

    /**
     * Gets a specific glossary term by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTermResponse getTerm(GetTermRequest request);

    /**
     * Gets a specific glossary term relationship by key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTermRelationshipResponse getTermRelationship(GetTermRelationshipRequest request);

    /**
     * Gets a specific type by key within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetTypeResponse getType(GetTypeRequest request);

    /**
     * Gets the status of the work request with the given OCID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Import new connection for this data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ImportConnectionResponse importConnection(ImportConnectionRequest request);

    /**
     * Import the glossary and the terms from csv or json files and return the imported glossary resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ImportGlossaryResponse importGlossary(ImportGlossaryRequest request);

    /**
     * Returns a list of all tags for an entity attribute.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAttributeTagsResponse listAttributeTags(ListAttributeTagsRequest request);

    /**
     * Returns a list of all attributes of an data entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListAttributesResponse listAttributes(ListAttributesRequest request);

    /**
     * Returns a list of all the catalog private endpoints in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCatalogPrivateEndpointsResponse listCatalogPrivateEndpoints(
            ListCatalogPrivateEndpointsRequest request);

    /**
     * Returns a list of all the data catalogs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListCatalogsResponse listCatalogs(ListCatalogsRequest request);

    /**
     * Returns a list of all Connections for a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListConnectionsResponse listConnections(ListConnectionsRequest request);

    /**
     * Returns a list of all tags for a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataAssetTagsResponse listDataAssetTags(ListDataAssetTagsRequest request);

    /**
     * Returns a list of data assets within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request);

    /**
     * Returns a list of all entities of a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEntitiesResponse listEntities(ListEntitiesRequest request);

    /**
     * Returns a list of all tags for a data entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListEntityTagsResponse listEntityTags(ListEntityTagsRequest request);

    /**
     * Returns a list of all tags for a folder.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFolderTagsResponse listFolderTags(ListFolderTagsRequest request);

    /**
     * Returns a list of all folders.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListFoldersResponse listFolders(ListFoldersRequest request);

    /**
     * Returns a list of all glossaries within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListGlossariesResponse listGlossaries(ListGlossariesRequest request);

    /**
     * Returns a list of job definitions within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobDefinitionsResponse listJobDefinitions(ListJobDefinitionsRequest request);

    /**
     * Returns a list of job executions for a job.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request);

    /**
     * Returns a list of job logs.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobLogsResponse listJobLogs(ListJobLogsRequest request);

    /**
     * Returns a list of job metrics.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobMetricsResponse listJobMetrics(ListJobMetricsRequest request);

    /**
     * Returns a list of jobs within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Returns a list of all user created tags in the system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTagsResponse listTags(ListTagsRequest request);

    /**
     * Returns a list of all term relationships within a glossary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTermRelationshipsResponse listTermRelationships(ListTermRelationshipsRequest request);

    /**
     * Returns a list of all terms within a glossary.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTermsResponse listTerms(ListTermsRequest request);

    /**
     * Returns a list of all types within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListTypesResponse listTypes(ListTypesRequest request);

    /**
     * Returns a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a (paginated) list of logs for a given work request.
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
     * Returns stats on objects by type in the repository.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ObjectStatsResponse objectStats(ObjectStatsRequest request);

    /**
     * Parse data asset references through connections from this data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ParseConnectionResponse parseConnection(ParseConnectionRequest request);

    /**
     * Returns a list of search results within a data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    SearchCriteriaResponse searchCriteria(SearchCriteriaRequest request);

    /**
     * Test the connection by connecting to the data asset using credentials in the metadata.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    TestConnectionResponse testConnection(TestConnectionRequest request);

    /**
     * Updates a specific data asset attribute.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateAttributeResponse updateAttribute(UpdateAttributeRequest request);

    /**
     * Updates the data catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request);

    /**
     * Updates the private reverse connection endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateCatalogPrivateEndpointResponse updateCatalogPrivateEndpoint(
            UpdateCatalogPrivateEndpointRequest request);

    /**
     * Updates a specific connection of a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateConnectionResponse updateConnection(UpdateConnectionRequest request);

    /**
     * Updates a specific data asset identified by the given key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request);

    /**
     * Updates a specific data entity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateEntityResponse updateEntity(UpdateEntityRequest request);

    /**
     * Updates a specific folder of a data asset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateFolderResponse updateFolder(UpdateFolderRequest request);

    /**
     * Updates a specific glossary identified by the given key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateGlossaryResponse updateGlossary(UpdateGlossaryRequest request);

    /**
     * Updates a specific job identified by the given key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateJobResponse updateJob(UpdateJobRequest request);

    /**
     * Update a specific job definition identified by the given key.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateJobDefinitionResponse updateJobDefinition(UpdateJobDefinitionRequest request);

    /**
     * Updates a specific glossary term.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateTermResponse updateTerm(UpdateTermRequest request);

    /**
     * Updates a specific glossary term relationship.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UpdateTermRelationshipResponse updateTermRelationship(UpdateTermRelationshipRequest request);

    /**
     * Upload connection credentails and metadata for this connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UploadCredentialsResponse uploadCredentials(UploadCredentialsRequest request);

    /**
     * Returns active users in the system.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    UsersResponse users(UsersRequest request);

    /**
     * Validate connection by connecting to the data asset using credentials in metadata.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     */
    ValidateConnectionResponse validateConnection(ValidateConnectionRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataCatalogWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataCatalogPaginators getPaginators();
}
