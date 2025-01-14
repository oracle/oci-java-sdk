/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog;

import com.oracle.bmc.datacatalog.requests.*;
import com.oracle.bmc.datacatalog.responses.*;

/**
 * Use the Data Catalog APIs to collect, organize, find, access, understand, enrich, and activate
 * technical, business, and operational metadata. For more information, see [Data
 * Catalog](https://docs.oracle.com/iaas/data-catalog/home.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public interface DataCatalog extends AutoCloseable {

    /** Rebuilds the client from scratch. Useful to refresh certificates. */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     *
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /** Gets the set endpoint for REST call (ex, https://www.example.com) */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     *
     * <p>Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the
     * endpoint. If the service is not available in this Region, however, an
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
     * Adds a lock to a Catalog resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AddCatalogLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddCatalogLock API.
     */
    AddCatalogLockResponse addCatalogLock(AddCatalogLockRequest request);

    /**
     * Adds a lock to a CatalogPrivateEndpoint resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AddCatalogPrivateEndpointLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddCatalogPrivateEndpointLock API.
     */
    AddCatalogPrivateEndpointLockResponse addCatalogPrivateEndpointLock(
            AddCatalogPrivateEndpointLockRequest request);

    /**
     * Add data selector pattern to the data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AddDataSelectorPatternsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddDataSelectorPatterns API.
     */
    AddDataSelectorPatternsResponse addDataSelectorPatterns(AddDataSelectorPatternsRequest request);

    /**
     * Adds a lock to a Metastore resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AddMetastoreLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddMetastoreLock
     *     API.
     */
    AddMetastoreLockResponse addMetastoreLock(AddMetastoreLockRequest request);

    /**
     * Associate the custom property for the given type
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AssociateCustomPropertyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AssociateCustomProperty API.
     */
    AssociateCustomPropertyResponse associateCustomProperty(AssociateCustomPropertyRequest request);

    /**
     * Export technical objects from a Data Asset in Excel format. Returns details about the job
     * which actually performs the export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AsynchronousExportDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AsynchronousExportDataAsset API.
     */
    AsynchronousExportDataAssetResponse asynchronousExportDataAsset(
            AsynchronousExportDataAssetRequest request);

    /**
     * Exports the contents of a glossary in Excel format. Returns details about the job which
     * actually performs the export.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AsynchronousExportGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AsynchronousExportGlossary API.
     */
    AsynchronousExportGlossaryResponse asynchronousExportGlossary(
            AsynchronousExportGlossaryRequest request);

    /**
     * Attaches a private reverse connection endpoint resource to a data catalog resource. When
     * provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/AttachCatalogPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachCatalogPrivateEndpoint API.
     */
    AttachCatalogPrivateEndpointResponse attachCatalogPrivateEndpoint(
            AttachCatalogPrivateEndpointRequest request);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against
     * 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ChangeCatalogCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCatalogCompartment API.
     */
    ChangeCatalogCompartmentResponse changeCatalogCompartment(
            ChangeCatalogCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against
     * 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ChangeCatalogPrivateEndpointCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeCatalogPrivateEndpointCompartment API.
     */
    ChangeCatalogPrivateEndpointCompartmentResponse changeCatalogPrivateEndpointCompartment(
            ChangeCatalogPrivateEndpointCompartmentRequest request);

    /**
     * Moves a resource into a different compartment. When provided, 'If-Match' is checked against
     * 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ChangeMetastoreCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeMetastoreCompartment API.
     */
    ChangeMetastoreCompartmentResponse changeMetastoreCompartment(
            ChangeMetastoreCompartmentRequest request);

    /**
     * Creates a new entity attribute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAttribute
     *     API.
     */
    CreateAttributeResponse createAttribute(CreateAttributeRequest request);

    /**
     * Creates a new entity attribute tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateAttributeTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAttributeTag
     *     API.
     */
    CreateAttributeTagResponse createAttributeTag(CreateAttributeTagRequest request);

    /**
     * Creates a new data catalog instance that includes a console and an API URL for managing
     * metadata operations. For more information, please see the documentation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateCatalogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateCatalog API.
     */
    CreateCatalogResponse createCatalog(CreateCatalogRequest request);

    /**
     * Create a new private reverse connection endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateCatalogPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCatalogPrivateEndpoint API.
     */
    CreateCatalogPrivateEndpointResponse createCatalogPrivateEndpoint(
            CreateCatalogPrivateEndpointRequest request);

    /**
     * Creates a new connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateConnection
     *     API.
     */
    CreateConnectionResponse createConnection(CreateConnectionRequest request);

    /**
     * Create a new Custom Property
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateCustomPropertyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateCustomProperty API.
     */
    CreateCustomPropertyResponse createCustomProperty(CreateCustomPropertyRequest request);

    /**
     * Create a new data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataAsset
     *     API.
     */
    CreateDataAssetResponse createDataAsset(CreateDataAssetRequest request);

    /**
     * Creates a new data asset tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateDataAssetTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDataAssetTag
     *     API.
     */
    CreateDataAssetTagResponse createDataAssetTag(CreateDataAssetTagRequest request);

    /**
     * Creates a new data entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateEntityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEntity API.
     */
    CreateEntityResponse createEntity(CreateEntityRequest request);

    /**
     * Creates a new entity tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateEntityTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEntityTag
     *     API.
     */
    CreateEntityTagResponse createEntityTag(CreateEntityTagRequest request);

    /**
     * Creates a new folder.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateFolderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFolder API.
     */
    CreateFolderResponse createFolder(CreateFolderRequest request);

    /**
     * Creates a new folder tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateFolderTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFolderTag
     *     API.
     */
    CreateFolderTagResponse createFolderTag(CreateFolderTagRequest request);

    /**
     * Creates a new glossary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateGlossary API.
     */
    CreateGlossaryResponse createGlossary(CreateGlossaryRequest request);

    /**
     * Creates a new job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJob API.
     */
    CreateJobResponse createJob(CreateJobRequest request);

    /**
     * Creates a new job definition.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateJobDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJobDefinition
     *     API.
     */
    CreateJobDefinitionResponse createJobDefinition(CreateJobDefinitionRequest request);

    /**
     * Creates a new job execution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateJobExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJobExecution
     *     API.
     */
    CreateJobExecutionResponse createJobExecution(CreateJobExecutionRequest request);

    /**
     * Creates a new metastore.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateMetastoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateMetastore
     *     API.
     */
    CreateMetastoreResponse createMetastore(CreateMetastoreRequest request);

    /**
     * Create a new Namespace to be used by a custom property
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateNamespaceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateNamespace
     *     API.
     */
    CreateNamespaceResponse createNamespace(CreateNamespaceRequest request);

    /**
     * Create a new pattern.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreatePatternExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePattern API.
     */
    CreatePatternResponse createPattern(CreatePatternRequest request);

    /**
     * Create a new term within a glossary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateTermExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateTerm API.
     */
    CreateTermResponse createTerm(CreateTermRequest request);

    /**
     * Creates a new term relationship for this term within a glossary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/CreateTermRelationshipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateTermRelationship API.
     */
    CreateTermRelationshipResponse createTermRelationship(CreateTermRelationshipRequest request);

    /**
     * Deletes a specific entity attribute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAttribute
     *     API.
     */
    DeleteAttributeResponse deleteAttribute(DeleteAttributeRequest request);

    /**
     * Deletes a specific entity attribute tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteAttributeTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAttributeTag
     *     API.
     */
    DeleteAttributeTagResponse deleteAttributeTag(DeleteAttributeTagRequest request);

    /**
     * Deletes a data catalog resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteCatalogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteCatalog API.
     */
    DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request);

    /**
     * Deletes a private reverse connection endpoint by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteCatalogPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCatalogPrivateEndpoint API.
     */
    DeleteCatalogPrivateEndpointResponse deleteCatalogPrivateEndpoint(
            DeleteCatalogPrivateEndpointRequest request);

    /**
     * Deletes a specific connection of a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteConnection
     *     API.
     */
    DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request);

    /**
     * Deletes a specific custom property identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteCustomPropertyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCustomProperty API.
     */
    DeleteCustomPropertyResponse deleteCustomProperty(DeleteCustomPropertyRequest request);

    /**
     * Deletes a specific data asset identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataAsset
     *     API.
     */
    DeleteDataAssetResponse deleteDataAsset(DeleteDataAssetRequest request);

    /**
     * Deletes a specific data asset tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteDataAssetTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDataAssetTag
     *     API.
     */
    DeleteDataAssetTagResponse deleteDataAssetTag(DeleteDataAssetTagRequest request);

    /**
     * Deletes a specific data entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteEntityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteEntity API.
     */
    DeleteEntityResponse deleteEntity(DeleteEntityRequest request);

    /**
     * Deletes a specific entity tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteEntityTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteEntityTag
     *     API.
     */
    DeleteEntityTagResponse deleteEntityTag(DeleteEntityTagRequest request);

    /**
     * Deletes a specific folder of a data asset identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteFolderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFolder API.
     */
    DeleteFolderResponse deleteFolder(DeleteFolderRequest request);

    /**
     * Deletes a specific folder tag.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteFolderTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFolderTag
     *     API.
     */
    DeleteFolderTagResponse deleteFolderTag(DeleteFolderTagRequest request);

    /**
     * Deletes a specific glossary identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteGlossary API.
     */
    DeleteGlossaryResponse deleteGlossary(DeleteGlossaryRequest request);

    /**
     * Deletes a specific job identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteJob API.
     */
    DeleteJobResponse deleteJob(DeleteJobRequest request);

    /**
     * Deletes a specific job definition identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteJobDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteJobDefinition
     *     API.
     */
    DeleteJobDefinitionResponse deleteJobDefinition(DeleteJobDefinitionRequest request);

    /**
     * Deletes a metastore resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteMetastoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteMetastore
     *     API.
     */
    DeleteMetastoreResponse deleteMetastore(DeleteMetastoreRequest request);

    /**
     * Deletes a specific Namespace identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteNamespaceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteNamespace
     *     API.
     */
    DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request);

    /**
     * Deletes a specific pattern identified by it's key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeletePatternExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePattern API.
     */
    DeletePatternResponse deletePattern(DeletePatternRequest request);

    /**
     * Deletes a specific glossary term.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteTermExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteTerm API.
     */
    DeleteTermResponse deleteTerm(DeleteTermRequest request);

    /**
     * Deletes a specific glossary term relationship.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DeleteTermRelationshipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteTermRelationship API.
     */
    DeleteTermRelationshipResponse deleteTermRelationship(DeleteTermRelationshipRequest request);

    /**
     * Detaches a private reverse connection endpoint resource to a data catalog resource. When
     * provided, 'If-Match' is checked against 'ETag' values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DetachCatalogPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachCatalogPrivateEndpoint API.
     */
    DetachCatalogPrivateEndpointResponse detachCatalogPrivateEndpoint(
            DetachCatalogPrivateEndpointRequest request);

    /**
     * Remove the custom property for the given type
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/DisassociateCustomPropertyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisassociateCustomProperty API.
     */
    DisassociateCustomPropertyResponse disassociateCustomProperty(
            DisassociateCustomPropertyRequest request);

    /**
     * Returns the fully expanded tree hierarchy of parent and child terms in this glossary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ExpandTreeForGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ExpandTreeForGlossary API.
     */
    ExpandTreeForGlossaryResponse expandTreeForGlossary(ExpandTreeForGlossaryRequest request);

    /**
     * Export the glossary and the terms and return the exported glossary as csv or json.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ExportGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ExportGlossary API.
     */
    ExportGlossaryResponse exportGlossary(ExportGlossaryRequest request);

    /**
     * Returns lineage for a given entity object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/FetchEntityLineageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use FetchEntityLineage
     *     API.
     */
    FetchEntityLineageResponse fetchEntityLineage(FetchEntityLineageRequest request);

    /**
     * Gets a specific entity attribute by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAttribute API.
     */
    GetAttributeResponse getAttribute(GetAttributeRequest request);

    /**
     * Gets a specific entity attribute tag by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetAttributeTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAttributeTag
     *     API.
     */
    GetAttributeTagResponse getAttributeTag(GetAttributeTagRequest request);

    /**
     * Gets a data catalog by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetCatalogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCatalog API.
     */
    GetCatalogResponse getCatalog(GetCatalogRequest request);

    /**
     * Gets a specific private reverse connection by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetCatalogPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCatalogPrivateEndpoint API.
     */
    GetCatalogPrivateEndpointResponse getCatalogPrivateEndpoint(
            GetCatalogPrivateEndpointRequest request);

    /**
     * Gets a specific data asset connection by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetConnection API.
     */
    GetConnectionResponse getConnection(GetConnectionRequest request);

    /**
     * Gets a specific custom property for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetCustomPropertyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetCustomProperty
     *     API.
     */
    GetCustomPropertyResponse getCustomProperty(GetCustomPropertyRequest request);

    /**
     * Gets a specific data asset for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataAsset API.
     */
    GetDataAssetResponse getDataAsset(GetDataAssetRequest request);

    /**
     * Gets a specific data asset tag by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetDataAssetTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDataAssetTag
     *     API.
     */
    GetDataAssetTagResponse getDataAssetTag(GetDataAssetTagRequest request);

    /**
     * Gets a specific data entity by key for a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetEntityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEntity API.
     */
    GetEntityResponse getEntity(GetEntityRequest request);

    /**
     * Gets a specific entity tag by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetEntityTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEntityTag API.
     */
    GetEntityTagResponse getEntityTag(GetEntityTagRequest request);

    /**
     * Gets a specific data asset folder by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetFolderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFolder API.
     */
    GetFolderResponse getFolder(GetFolderRequest request);

    /**
     * Gets a specific folder tag by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetFolderTagExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFolderTag API.
     */
    GetFolderTagResponse getFolderTag(GetFolderTagRequest request);

    /**
     * Gets a specific glossary by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetGlossary API.
     */
    GetGlossaryResponse getGlossary(GetGlossaryRequest request);

    /**
     * Gets a specific job by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJob API.
     */
    GetJobResponse getJob(GetJobRequest request);

    /**
     * Gets a specific job definition by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobDefinition
     *     API.
     */
    GetJobDefinitionResponse getJobDefinition(GetJobDefinitionRequest request);

    /**
     * Gets a specific job execution by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobExecutionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobExecution
     *     API.
     */
    GetJobExecutionResponse getJobExecution(GetJobExecutionRequest request);

    /**
     * Gets a specific job log by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobLogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobLog API.
     */
    GetJobLogResponse getJobLog(GetJobLogRequest request);

    /**
     * Gets a specific job metric by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetJobMetricsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJobMetrics API.
     */
    GetJobMetricsResponse getJobMetrics(GetJobMetricsRequest request);

    /**
     * Gets a metastore by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetMetastoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetMetastore API.
     */
    GetMetastoreResponse getMetastore(GetMetastoreRequest request);

    /**
     * Gets a specific namespace for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetNamespaceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetNamespace API.
     */
    GetNamespaceResponse getNamespace(GetNamespaceRequest request);

    /**
     * Gets a specific pattern for the given key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetPatternExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPattern API.
     */
    GetPatternResponse getPattern(GetPatternRequest request);

    /**
     * Gets a specific glossary term by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetTermExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTerm API.
     */
    GetTermResponse getTerm(GetTermRequest request);

    /**
     * Gets a specific glossary term relationship by key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetTermRelationshipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetTermRelationship
     *     API.
     */
    GetTermRelationshipResponse getTermRelationship(GetTermRelationshipRequest request);

    /**
     * Gets a specific type by key within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetTypeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetType API.
     */
    GetTypeResponse getType(GetTypeRequest request);

    /**
     * Gets the status of the work request with the given OCID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Import new connection for this data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ImportConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportConnection
     *     API.
     */
    ImportConnectionResponse importConnection(ImportConnectionRequest request);

    /**
     * Import technical objects to a Data Asset
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ImportDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportDataAsset
     *     API.
     */
    ImportDataAssetResponse importDataAsset(ImportDataAssetRequest request);

    /**
     * Import the glossary and the terms from csv or json files and return the imported glossary
     * resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ImportGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportGlossary API.
     */
    ImportGlossaryResponse importGlossary(ImportGlossaryRequest request);

    /**
     * Imports lineage metadata. Returns details about the job that performs the import.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ImportLineageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ImportLineage API.
     */
    ImportLineageResponse importLineage(ImportLineageRequest request);

    /**
     * List the physical entities aggregated by this logical entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListAggregatedPhysicalEntitiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListAggregatedPhysicalEntities API.
     */
    ListAggregatedPhysicalEntitiesResponse listAggregatedPhysicalEntities(
            ListAggregatedPhysicalEntitiesRequest request);

    /**
     * Returns a list of all tags for an entity attribute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListAttributeTagsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAttributeTags
     *     API.
     */
    ListAttributeTagsResponse listAttributeTags(ListAttributeTagsRequest request);

    /**
     * Returns a list of all attributes of an data entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListAttributesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAttributes API.
     */
    ListAttributesResponse listAttributes(ListAttributesRequest request);

    /**
     * Returns a list of all the catalog private endpoints in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListCatalogPrivateEndpointsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCatalogPrivateEndpoints API.
     */
    ListCatalogPrivateEndpointsResponse listCatalogPrivateEndpoints(
            ListCatalogPrivateEndpointsRequest request);

    /**
     * Returns a list of all the data catalogs in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListCatalogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListCatalogs API.
     */
    ListCatalogsResponse listCatalogs(ListCatalogsRequest request);

    /**
     * Returns a list of all Connections for a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListConnectionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListConnections
     *     API.
     */
    ListConnectionsResponse listConnections(ListConnectionsRequest request);

    /**
     * Returns a list of custom properties within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListCustomPropertiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCustomProperties API.
     */
    ListCustomPropertiesResponse listCustomProperties(ListCustomPropertiesRequest request);

    /**
     * Returns a list of all tags for a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListDataAssetTagsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataAssetTags
     *     API.
     */
    ListDataAssetTagsResponse listDataAssetTags(ListDataAssetTagsRequest request);

    /**
     * Returns a list of data assets within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListDataAssetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDataAssets API.
     */
    ListDataAssetsResponse listDataAssets(ListDataAssetsRequest request);

    /**
     * List logical entities derived from this pattern.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListDerivedLogicalEntitiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListDerivedLogicalEntities API.
     */
    ListDerivedLogicalEntitiesResponse listDerivedLogicalEntities(
            ListDerivedLogicalEntitiesRequest request);

    /**
     * Returns a list of all entities of a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListEntitiesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEntities API.
     */
    ListEntitiesResponse listEntities(ListEntitiesRequest request);

    /**
     * Returns a list of all tags for a data entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListEntityTagsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEntityTags API.
     */
    ListEntityTagsResponse listEntityTags(ListEntityTagsRequest request);

    /**
     * Returns a list of all tags for a folder.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListFolderTagsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFolderTags API.
     */
    ListFolderTagsResponse listFolderTags(ListFolderTagsRequest request);

    /**
     * Returns a list of all folders.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListFoldersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFolders API.
     */
    ListFoldersResponse listFolders(ListFoldersRequest request);

    /**
     * Returns a list of all glossaries within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListGlossariesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListGlossaries API.
     */
    ListGlossariesResponse listGlossaries(ListGlossariesRequest request);

    /**
     * Returns a list of job definitions within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobDefinitionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobDefinitions
     *     API.
     */
    ListJobDefinitionsResponse listJobDefinitions(ListJobDefinitionsRequest request);

    /**
     * Returns a list of job executions for a job.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobExecutionsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobExecutions
     *     API.
     */
    ListJobExecutionsResponse listJobExecutions(ListJobExecutionsRequest request);

    /**
     * Returns a list of job logs.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobLogs API.
     */
    ListJobLogsResponse listJobLogs(ListJobLogsRequest request);

    /**
     * Returns a list of job metrics.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobMetricsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobMetrics API.
     */
    ListJobMetricsResponse listJobMetrics(ListJobMetricsRequest request);

    /**
     * Returns a list of jobs within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJobs API.
     */
    ListJobsResponse listJobs(ListJobsRequest request);

    /**
     * Returns a list of all metastores in the specified compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListMetastoresExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListMetastores API.
     */
    ListMetastoresResponse listMetastores(ListMetastoresRequest request);

    /**
     * Returns a list of namespaces within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListNamespacesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListNamespaces API.
     */
    ListNamespacesResponse listNamespaces(ListNamespacesRequest request);

    /**
     * Returns a list of patterns within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListPatternsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPatterns API.
     */
    ListPatternsResponse listPatterns(ListPatternsRequest request);

    /**
     * Returns a list of all rules of a data entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListRulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListRules API.
     */
    ListRulesResponse listRules(ListRulesRequest request);

    /**
     * Returns a list of all user created tags in the system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListTagsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTags API.
     */
    ListTagsResponse listTags(ListTagsRequest request);

    /**
     * Returns a list of all term relationships within a glossary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListTermRelationshipsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListTermRelationships API.
     */
    ListTermRelationshipsResponse listTermRelationships(ListTermRelationshipsRequest request);

    /**
     * Returns a list of all terms within a glossary.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListTermsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTerms API.
     */
    ListTermsResponse listTerms(ListTermsRequest request);

    /**
     * Returns a list of all types within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListTypesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListTypes API.
     */
    ListTypesResponse listTypes(ListTypesRequest request);

    /**
     * Returns a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Returns stats on objects by type in the repository.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ObjectStatsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ObjectStats API.
     */
    ObjectStatsResponse objectStats(ObjectStatsRequest request);

    /**
     * Parse data asset references through connections from this data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ParseConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ParseConnection
     *     API.
     */
    ParseConnectionResponse parseConnection(ParseConnectionRequest request);

    /**
     * Act on a recommendation. A recommendation can be accepted or rejected. For example, if a
     * recommendation of type LINK_GLOSSARY_TERM is accepted, the system will link the source object
     * (e.g. an attribute) to a target glossary term.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ProcessRecommendationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ProcessRecommendation API.
     */
    ProcessRecommendationResponse processRecommendation(ProcessRecommendationRequest request);

    /**
     * Returns a list of recommendations for the given object and recommendation type. By default,
     * it will return inferred recommendations for review. The optional query param
     * 'RecommendationStatus' can be set, to return only recommendations having that status.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/RecommendationsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Recommendations
     *     API.
     */
    RecommendationsResponse recommendations(RecommendationsRequest request);

    /**
     * Removes a lock from a Catalog resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/RemoveCatalogLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveCatalogLock
     *     API.
     */
    RemoveCatalogLockResponse removeCatalogLock(RemoveCatalogLockRequest request);

    /**
     * Removes a lock from a CatalogPrivateEndpoint resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/RemoveCatalogPrivateEndpointLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveCatalogPrivateEndpointLock API.
     */
    RemoveCatalogPrivateEndpointLockResponse removeCatalogPrivateEndpointLock(
            RemoveCatalogPrivateEndpointLockRequest request);

    /**
     * Remove data selector pattern from the data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/RemoveDataSelectorPatternsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveDataSelectorPatterns API.
     */
    RemoveDataSelectorPatternsResponse removeDataSelectorPatterns(
            RemoveDataSelectorPatternsRequest request);

    /**
     * Removes a lock from a Metastore resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/RemoveMetastoreLockExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveMetastoreLock
     *     API.
     */
    RemoveMetastoreLockResponse removeMetastoreLock(RemoveMetastoreLockRequest request);

    /**
     * Returns a list of search results within a data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/SearchCriteriaExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchCriteria API.
     */
    SearchCriteriaResponse searchCriteria(SearchCriteriaRequest request);

    /**
     * Returns a list of potential string matches for a given input string.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/SuggestMatchesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SuggestMatches API.
     */
    SuggestMatchesResponse suggestMatches(SuggestMatchesRequest request);

    /**
     * Export technical objects from a Data Asset
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/SynchronousExportDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SynchronousExportDataAsset API.
     */
    SynchronousExportDataAssetResponse synchronousExportDataAsset(
            SynchronousExportDataAssetRequest request);

    /**
     * Test the connection by connecting to the data asset using credentials in the metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/TestConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use TestConnection API.
     */
    TestConnectionResponse testConnection(TestConnectionRequest request);

    /**
     * Updates a specific data asset attribute.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateAttributeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAttribute
     *     API.
     */
    UpdateAttributeResponse updateAttribute(UpdateAttributeRequest request);

    /**
     * Updates the data catalog.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateCatalogExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateCatalog API.
     */
    UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request);

    /**
     * Updates the private reverse connection endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateCatalogPrivateEndpointExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCatalogPrivateEndpoint API.
     */
    UpdateCatalogPrivateEndpointResponse updateCatalogPrivateEndpoint(
            UpdateCatalogPrivateEndpointRequest request);

    /**
     * Updates a specific connection of a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateConnection
     *     API.
     */
    UpdateConnectionResponse updateConnection(UpdateConnectionRequest request);

    /**
     * Updates a specific custom property identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateCustomPropertyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateCustomProperty API.
     */
    UpdateCustomPropertyResponse updateCustomProperty(UpdateCustomPropertyRequest request);

    /**
     * Updates a specific data asset identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateDataAssetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDataAsset
     *     API.
     */
    UpdateDataAssetResponse updateDataAsset(UpdateDataAssetRequest request);

    /**
     * Updates a specific data entity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateEntityExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateEntity API.
     */
    UpdateEntityResponse updateEntity(UpdateEntityRequest request);

    /**
     * Updates a specific folder of a data asset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateFolderExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFolder API.
     */
    UpdateFolderResponse updateFolder(UpdateFolderRequest request);

    /**
     * Updates a specific glossary identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateGlossaryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateGlossary API.
     */
    UpdateGlossaryResponse updateGlossary(UpdateGlossaryRequest request);

    /**
     * Updates a specific job identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateJobExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateJob API.
     */
    UpdateJobResponse updateJob(UpdateJobRequest request);

    /**
     * Update a specific job definition identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateJobDefinitionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateJobDefinition
     *     API.
     */
    UpdateJobDefinitionResponse updateJobDefinition(UpdateJobDefinitionRequest request);

    /**
     * Updates a metastore resource by identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateMetastoreExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateMetastore
     *     API.
     */
    UpdateMetastoreResponse updateMetastore(UpdateMetastoreRequest request);

    /**
     * Updates a specific namespace identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateNamespaceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateNamespace
     *     API.
     */
    UpdateNamespaceResponse updateNamespace(UpdateNamespaceRequest request);

    /**
     * Updates a specific pattern identified by the given key.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdatePatternExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePattern API.
     */
    UpdatePatternResponse updatePattern(UpdatePatternRequest request);

    /**
     * Updates a specific glossary term.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateTermExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateTerm API.
     */
    UpdateTermResponse updateTerm(UpdateTermRequest request);

    /**
     * Updates a specific glossary term relationship.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UpdateTermRelationshipExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateTermRelationship API.
     */
    UpdateTermRelationshipResponse updateTermRelationship(UpdateTermRelationshipRequest request);

    /**
     * Upload connection credentails and metadata for this connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation will not retry by default, users
     *     can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to
     *     enable retries for it. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UploadCredentialsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UploadCredentials
     *     API.
     */
    UploadCredentialsResponse uploadCredentials(UploadCredentialsRequest request);

    /**
     * Returns active users in the system.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/UsersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use Users API.
     */
    UsersResponse users(UsersRequest request);

    /**
     * Validate connection by connecting to the data asset using credentials in metadata.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ValidateConnectionExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateConnection
     *     API.
     */
    ValidateConnectionResponse validateConnection(ValidateConnectionRequest request);

    /**
     * Validate pattern by deriving file groups representing logical entities using the expression
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ValidatePatternExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidatePattern
     *     API.
     */
    ValidatePatternResponse validatePattern(ValidatePatternRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DataCatalogWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DataCatalogPaginators getPaginators();
}
