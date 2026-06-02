/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools;

import com.oracle.bmc.databasetools.requests.*;
import com.oracle.bmc.databasetools.responses.*;

/**
 * Use the Database Tools API to manage connections, private endpoints, and work requests in the Database Tools service.
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public interface DatabaseTools extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Adds a lock to a DatabaseToolsConnection resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsConnectionLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsConnectionLock API.
     */
    AddDatabaseToolsConnectionLockResponse addDatabaseToolsConnectionLock(
            AddDatabaseToolsConnectionLockRequest request);

    /**
     * Adds a lock to a DatabaseToolsDatabaseApiGatewayConfig resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsDatabaseApiGatewayConfigLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsDatabaseApiGatewayConfigLock API.
     */
    AddDatabaseToolsDatabaseApiGatewayConfigLockResponse
            addDatabaseToolsDatabaseApiGatewayConfigLock(
                    AddDatabaseToolsDatabaseApiGatewayConfigLockRequest request);

    /**
     * Adds a lock to a DatabaseToolsIdentity resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsIdentityLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsIdentityLock API.
     */
    AddDatabaseToolsIdentityLockResponse addDatabaseToolsIdentityLock(
            AddDatabaseToolsIdentityLockRequest request);

    /**
     * Adds a lock to a DatabaseToolsMcpServer resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsMcpServerLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsMcpServerLock API.
     */
    AddDatabaseToolsMcpServerLockResponse addDatabaseToolsMcpServerLock(
            AddDatabaseToolsMcpServerLockRequest request);

    /**
     * Adds a lock to a DatabaseToolsMcpToolset resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsMcpToolsetLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsMcpToolsetLock API.
     */
    AddDatabaseToolsMcpToolsetLockResponse addDatabaseToolsMcpToolsetLock(
            AddDatabaseToolsMcpToolsetLockRequest request);

    /**
     * Adds a lock to a DatabaseToolsPrivateEndpoint resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsPrivateEndpointLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsPrivateEndpointLock API.
     */
    AddDatabaseToolsPrivateEndpointLockResponse addDatabaseToolsPrivateEndpointLock(
            AddDatabaseToolsPrivateEndpointLockRequest request);

    /**
     * Adds a lock to a DatabaseToolsSqlReport resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/AddDatabaseToolsSqlReportLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddDatabaseToolsSqlReportLock API.
     */
    AddDatabaseToolsSqlReportLockResponse addDatabaseToolsSqlReportLock(
            AddDatabaseToolsSqlReportLockRequest request);

    /**
     * Deletes Database Tools McpServer resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CascadingDeleteDatabaseToolsMcpServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CascadingDeleteDatabaseToolsMcpServer API.
     */
    CascadingDeleteDatabaseToolsMcpServerResponse cascadingDeleteDatabaseToolsMcpServer(
            CascadingDeleteDatabaseToolsMcpServerRequest request);

    /**
     * Moves the specified Database Tools connection to a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsConnectionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsConnectionCompartment API.
     */
    ChangeDatabaseToolsConnectionCompartmentResponse changeDatabaseToolsConnectionCompartment(
            ChangeDatabaseToolsConnectionCompartmentRequest request);

    /**
     * Moves the specified Database Tools database API gateway config to a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/DbApiGatewayConfig/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsDatabaseApiGatewayConfigCompartment API.
     */
    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentResponse
            changeDatabaseToolsDatabaseApiGatewayConfigCompartment(
                    ChangeDatabaseToolsDatabaseApiGatewayConfigCompartmentRequest request);

    /**
     * Moves the specified Database Tools identity to a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsIdentityCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsIdentityCompartment API.
     */
    ChangeDatabaseToolsIdentityCompartmentResponse changeDatabaseToolsIdentityCompartment(
            ChangeDatabaseToolsIdentityCompartmentRequest request);

    /**
     * Moves the specified Database Tools mcpserver to a different compartment in the same tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsMcpServerCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsMcpServerCompartment API.
     */
    ChangeDatabaseToolsMcpServerCompartmentResponse changeDatabaseToolsMcpServerCompartment(
            ChangeDatabaseToolsMcpServerCompartmentRequest request);

    /**
     * Moves the specified Database Tools MCP Toolset to a different compartment in the same tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsMcpToolsetCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsMcpToolsetCompartment API.
     */
    ChangeDatabaseToolsMcpToolsetCompartmentResponse changeDatabaseToolsMcpToolsetCompartment(
            ChangeDatabaseToolsMcpToolsetCompartmentRequest request);

    /**
     * Moves a Database Tools private endpoint into a different compartment in the same tenancy.
     * For information about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsPrivateEndpointCompartment API.
     */
    ChangeDatabaseToolsPrivateEndpointCompartmentResponse
            changeDatabaseToolsPrivateEndpointCompartment(
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest request);

    /**
     * Moves the specified Database Tools SQL Report to a different compartment in the same tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsSqlReportCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseToolsSqlReportCompartment API.
     */
    ChangeDatabaseToolsSqlReportCompartmentResponse changeDatabaseToolsSqlReportCompartment(
            ChangeDatabaseToolsSqlReportCompartmentRequest request);

    /**
     * Creates a new Database Tools connection.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsConnection API.
     */
    CreateDatabaseToolsConnectionResponse createDatabaseToolsConnection(
            CreateDatabaseToolsConnectionRequest request);

    /**
     * Creates a new Database Tools database API gateway config.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsDatabaseApiGatewayConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsDatabaseApiGatewayConfig API.
     */
    CreateDatabaseToolsDatabaseApiGatewayConfigResponse createDatabaseToolsDatabaseApiGatewayConfig(
            CreateDatabaseToolsDatabaseApiGatewayConfigRequest request);

    /**
     * Creates a new Database Tools identity.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsIdentityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsIdentity API.
     */
    CreateDatabaseToolsIdentityResponse createDatabaseToolsIdentity(
            CreateDatabaseToolsIdentityRequest request);

    /**
     * Creates a new Database Tools MCP server.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsMcpServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsMcpServer API.
     */
    CreateDatabaseToolsMcpServerResponse createDatabaseToolsMcpServer(
            CreateDatabaseToolsMcpServerRequest request);

    /**
     * Creates a new Database Tools MCP Toolset.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsMcpToolsetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsMcpToolset API.
     */
    CreateDatabaseToolsMcpToolsetResponse createDatabaseToolsMcpToolset(
            CreateDatabaseToolsMcpToolsetRequest request);

    /**
     * Creates a new Database Tools private endpoint.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsPrivateEndpoint API.
     */
    CreateDatabaseToolsPrivateEndpointResponse createDatabaseToolsPrivateEndpoint(
            CreateDatabaseToolsPrivateEndpointRequest request);

    /**
     * Creates a new Database Tools  Sql Report.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/CreateDatabaseToolsSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseToolsSqlReport API.
     */
    CreateDatabaseToolsSqlReportResponse createDatabaseToolsSqlReport(
            CreateDatabaseToolsSqlReportRequest request);

    /**
     * Deletes the specified Database Tools connection resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsConnection API.
     */
    DeleteDatabaseToolsConnectionResponse deleteDatabaseToolsConnection(
            DeleteDatabaseToolsConnectionRequest request);

    /**
     * Deletes the specified Database Tools database API gateway config resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsDatabaseApiGatewayConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsDatabaseApiGatewayConfig API.
     */
    DeleteDatabaseToolsDatabaseApiGatewayConfigResponse deleteDatabaseToolsDatabaseApiGatewayConfig(
            DeleteDatabaseToolsDatabaseApiGatewayConfigRequest request);

    /**
     * Deletes the specified Database Tools identity resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsIdentityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsIdentity API.
     */
    DeleteDatabaseToolsIdentityResponse deleteDatabaseToolsIdentity(
            DeleteDatabaseToolsIdentityRequest request);

    /**
     * Deletes the specified Database Tools MCP server resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsMcpServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsMcpServer API.
     */
    DeleteDatabaseToolsMcpServerResponse deleteDatabaseToolsMcpServer(
            DeleteDatabaseToolsMcpServerRequest request);

    /**
     * Deletes the specified Database Tools MCP Toolset resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsMcpToolsetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsMcpToolset API.
     */
    DeleteDatabaseToolsMcpToolsetResponse deleteDatabaseToolsMcpToolset(
            DeleteDatabaseToolsMcpToolsetRequest request);

    /**
     * Deletes the specified Database Tools private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsPrivateEndpoint API.
     */
    DeleteDatabaseToolsPrivateEndpointResponse deleteDatabaseToolsPrivateEndpoint(
            DeleteDatabaseToolsPrivateEndpointRequest request);

    /**
     * Deletes the specified Database Tools SQL Report resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/DeleteDatabaseToolsSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseToolsSqlReport API.
     */
    DeleteDatabaseToolsSqlReportResponse deleteDatabaseToolsSqlReport(
            DeleteDatabaseToolsSqlReportRequest request);

    /**
     * Gets details of the specified Database Tools connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsConnection API.
     */
    GetDatabaseToolsConnectionResponse getDatabaseToolsConnection(
            GetDatabaseToolsConnectionRequest request);

    /**
     * Gets details of the specified Database Tools database API gateway config.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsDatabaseApiGatewayConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsDatabaseApiGatewayConfig API.
     */
    GetDatabaseToolsDatabaseApiGatewayConfigResponse getDatabaseToolsDatabaseApiGatewayConfig(
            GetDatabaseToolsDatabaseApiGatewayConfigRequest request);

    /**
     * Gets details for the specified Database Tools endpoint service.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsEndpointServiceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsEndpointService API.
     */
    GetDatabaseToolsEndpointServiceResponse getDatabaseToolsEndpointService(
            GetDatabaseToolsEndpointServiceRequest request);

    /**
     * Gets details of the specified Database Tools identity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsIdentityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsIdentity API.
     */
    GetDatabaseToolsIdentityResponse getDatabaseToolsIdentity(
            GetDatabaseToolsIdentityRequest request);

    /**
     * Gets details of the specified Database Tools MCP server.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsMcpServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsMcpServer API.
     */
    GetDatabaseToolsMcpServerResponse getDatabaseToolsMcpServer(
            GetDatabaseToolsMcpServerRequest request);

    /**
     * Gets details of the specified Database Tools MCP Toolset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsMcpToolsetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsMcpToolset API.
     */
    GetDatabaseToolsMcpToolsetResponse getDatabaseToolsMcpToolset(
            GetDatabaseToolsMcpToolsetRequest request);

    /**
     * Gets details of a specified Database Tools private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsPrivateEndpoint API.
     */
    GetDatabaseToolsPrivateEndpointResponse getDatabaseToolsPrivateEndpoint(
            GetDatabaseToolsPrivateEndpointRequest request);

    /**
     * Gets details of the specified Database Tools SQL report.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetDatabaseToolsSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseToolsSqlReport API.
     */
    GetDatabaseToolsSqlReportResponse getDatabaseToolsSqlReport(
            GetDatabaseToolsSqlReportRequest request);

    /**
     * Gets the status of the specified work request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list of Database Tools connections.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsConnectionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsConnections API.
     */
    ListDatabaseToolsConnectionsResponse listDatabaseToolsConnections(
            ListDatabaseToolsConnectionsRequest request);

    /**
     * Returns a list of Database Tools database API gateway configs.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsDatabaseApiGatewayConfigsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsDatabaseApiGatewayConfigs API.
     */
    ListDatabaseToolsDatabaseApiGatewayConfigsResponse listDatabaseToolsDatabaseApiGatewayConfigs(
            ListDatabaseToolsDatabaseApiGatewayConfigsRequest request);

    /**
     * Returns a list of Database Tools endpoint services.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsEndpointServicesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsEndpointServices API.
     */
    ListDatabaseToolsEndpointServicesResponse listDatabaseToolsEndpointServices(
            ListDatabaseToolsEndpointServicesRequest request);

    /**
     * Returns a list of Database Tools identities.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsIdentitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsIdentities API.
     */
    ListDatabaseToolsIdentitiesResponse listDatabaseToolsIdentities(
            ListDatabaseToolsIdentitiesRequest request);

    /**
     * Returns a list of Database Tools MCP servers.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsMcpServersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsMcpServers API.
     */
    ListDatabaseToolsMcpServersResponse listDatabaseToolsMcpServers(
            ListDatabaseToolsMcpServersRequest request);

    /**
     * Returns a list of Database Tools Toolset versions
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsMcpToolsetVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsMcpToolsetVersions API.
     */
    ListDatabaseToolsMcpToolsetVersionsResponse listDatabaseToolsMcpToolsetVersions(
            ListDatabaseToolsMcpToolsetVersionsRequest request);

    /**
     * Returns a list of Database Tools Toolsets.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsMcpToolsetsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsMcpToolsets API.
     */
    ListDatabaseToolsMcpToolsetsResponse listDatabaseToolsMcpToolsets(
            ListDatabaseToolsMcpToolsetsRequest request);

    /**
     * Returns a list of Database Tools private endpoints.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsPrivateEndpoints API.
     */
    ListDatabaseToolsPrivateEndpointsResponse listDatabaseToolsPrivateEndpoints(
            ListDatabaseToolsPrivateEndpointsRequest request);

    /**
     * Returns a list of Database Tools SQL reports.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsSqlReportsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseToolsSqlReports API.
     */
    ListDatabaseToolsSqlReportsResponse listDatabaseToolsSqlReports(
            ListDatabaseToolsSqlReportsRequest request);

    /**
     * Returns a paginated list of errors for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Returns a paginated list of logs for the specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Refresh Database Tools identity credential.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RefreshDatabaseToolsIdentityCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RefreshDatabaseToolsIdentityCredential API.
     */
    RefreshDatabaseToolsIdentityCredentialResponse refreshDatabaseToolsIdentityCredential(
            RefreshDatabaseToolsIdentityCredentialRequest request);

    /**
     * Removes a lock from a DatabaseToolsConnection resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsConnectionLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsConnectionLock API.
     */
    RemoveDatabaseToolsConnectionLockResponse removeDatabaseToolsConnectionLock(
            RemoveDatabaseToolsConnectionLockRequest request);

    /**
     * Removes a lock from a DatabaseToolsDatabaseApiGatewayConfig resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsDatabaseApiGatewayConfigLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsDatabaseApiGatewayConfigLock API.
     */
    RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse
            removeDatabaseToolsDatabaseApiGatewayConfigLock(
                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockRequest request);

    /**
     * Removes a lock from a DatabaseToolsIdentity resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsIdentityLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsIdentityLock API.
     */
    RemoveDatabaseToolsIdentityLockResponse removeDatabaseToolsIdentityLock(
            RemoveDatabaseToolsIdentityLockRequest request);

    /**
     * Removes a lock from a DatabaseToolsMcpServer resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsMcpServerLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsMcpServerLock API.
     */
    RemoveDatabaseToolsMcpServerLockResponse removeDatabaseToolsMcpServerLock(
            RemoveDatabaseToolsMcpServerLockRequest request);

    /**
     * Removes a lock from a DatabaseToolsMcpToolset resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsMcpToolsetLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsMcpToolsetLock API.
     */
    RemoveDatabaseToolsMcpToolsetLockResponse removeDatabaseToolsMcpToolsetLock(
            RemoveDatabaseToolsMcpToolsetLockRequest request);

    /**
     * Removes a lock from a DatabaseToolsPrivateEndpoint resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsPrivateEndpointLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsPrivateEndpointLock API.
     */
    RemoveDatabaseToolsPrivateEndpointLockResponse removeDatabaseToolsPrivateEndpointLock(
            RemoveDatabaseToolsPrivateEndpointLockRequest request);

    /**
     * Removes a lock from a DatabaseToolsSqlReport resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/RemoveDatabaseToolsSqlReportLockExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RemoveDatabaseToolsSqlReportLock API.
     */
    RemoveDatabaseToolsSqlReportLockResponse removeDatabaseToolsSqlReportLock(
            RemoveDatabaseToolsSqlReportLockRequest request);

    /**
     * Updates the specified Database Tools connection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsConnection API.
     */
    UpdateDatabaseToolsConnectionResponse updateDatabaseToolsConnection(
            UpdateDatabaseToolsConnectionRequest request);

    /**
     * Updates the specified Database Tools database API gateway config.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsDatabaseApiGatewayConfigExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsDatabaseApiGatewayConfig API.
     */
    UpdateDatabaseToolsDatabaseApiGatewayConfigResponse updateDatabaseToolsDatabaseApiGatewayConfig(
            UpdateDatabaseToolsDatabaseApiGatewayConfigRequest request);

    /**
     * Updates the specified Database Tools identity.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsIdentityExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsIdentity API.
     */
    UpdateDatabaseToolsIdentityResponse updateDatabaseToolsIdentity(
            UpdateDatabaseToolsIdentityRequest request);

    /**
     * Updates the specified Database Tools MCP server.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsMcpServerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsMcpServer API.
     */
    UpdateDatabaseToolsMcpServerResponse updateDatabaseToolsMcpServer(
            UpdateDatabaseToolsMcpServerRequest request);

    /**
     * Updates the specified Database Tools MCP Toolset.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsMcpToolsetExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsMcpToolset API.
     */
    UpdateDatabaseToolsMcpToolsetResponse updateDatabaseToolsMcpToolset(
            UpdateDatabaseToolsMcpToolsetRequest request);

    /**
     * Updates the specified Database Tools private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsPrivateEndpoint API.
     */
    UpdateDatabaseToolsPrivateEndpointResponse updateDatabaseToolsPrivateEndpoint(
            UpdateDatabaseToolsPrivateEndpointRequest request);

    /**
     * Updates the specified Database Tools SQL Report.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/UpdateDatabaseToolsSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseToolsSqlReport API.
     */
    UpdateDatabaseToolsSqlReportResponse updateDatabaseToolsSqlReport(
            UpdateDatabaseToolsSqlReportRequest request);

    /**
     * Validates the Database Tools connection details by establishing a connection to the database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ValidateDatabaseToolsConnectionExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateDatabaseToolsConnection API.
     */
    ValidateDatabaseToolsConnectionResponse validateDatabaseToolsConnection(
            ValidateDatabaseToolsConnectionRequest request);

    /**
     * Validates the Database Tools identity credentials by establishing a connection to the customer database
     * and executing the dbms_cloud.send_request to validate the credential.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ValidateDatabaseToolsIdentityCredentialExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ValidateDatabaseToolsIdentityCredential API.
     */
    ValidateDatabaseToolsIdentityCredentialResponse validateDatabaseToolsIdentityCredential(
            ValidateDatabaseToolsIdentityCredentialRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    DatabaseToolsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    DatabaseToolsPaginators getPaginators();
}
