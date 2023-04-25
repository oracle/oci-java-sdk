/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Use the Operations Insights API to perform data extraction operations to obtain database
 * resource utilization, performance statistics, and reference information. For more information,
 * see [About Oracle Cloud Infrastructure Operations Insights](https://docs.cloud.oracle.com/en-us/iaas/operations-insights/doc/operations-insights.html).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface OperationsInsights extends AutoCloseable {

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
     * Add new members (e.g. databases and hosts) to an Exadata system in Operations Insights. Exadata-related metric collection and analysis will be started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/AddExadataInsightMembersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use AddExadataInsightMembers API.
     */
    AddExadataInsightMembersResponse addExadataInsightMembers(
            AddExadataInsightMembersRequest request);

    /**
     * Update connection detail for advanced features of Autonomous Database in Operations Insights.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeAutonomousDatabaseInsightAdvancedFeaturesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAutonomousDatabaseInsightAdvancedFeatures API.
     */
    ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse
            changeAutonomousDatabaseInsightAdvancedFeatures(
                    ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest request);

    /**
     * Moves a DatabaseInsight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeDatabaseInsightCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeDatabaseInsightCompartment API.
     */
    ChangeDatabaseInsightCompartmentResponse changeDatabaseInsightCompartment(
            ChangeDatabaseInsightCompartmentRequest request);

    /**
     * Moves a EnterpriseManagerBridge resource from one compartment to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeEnterpriseManagerBridgeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeEnterpriseManagerBridgeCompartment API.
     */
    ChangeEnterpriseManagerBridgeCompartmentResponse changeEnterpriseManagerBridgeCompartment(
            ChangeEnterpriseManagerBridgeCompartmentRequest request);

    /**
     * Moves an Exadata insight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeExadataInsightCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeExadataInsightCompartment API.
     */
    ChangeExadataInsightCompartmentResponse changeExadataInsightCompartment(
            ChangeExadataInsightCompartmentRequest request);

    /**
     * Moves a HostInsight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeHostInsightCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeHostInsightCompartment API.
     */
    ChangeHostInsightCompartmentResponse changeHostInsightCompartment(
            ChangeHostInsightCompartmentRequest request);

    /**
     * Moves a private endpoint from one compartment to another. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeOperationsInsightsPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeOperationsInsightsPrivateEndpointCompartment API.
     */
    ChangeOperationsInsightsPrivateEndpointCompartmentResponse
            changeOperationsInsightsPrivateEndpointCompartment(
                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest request);

    /**
     * Moves an OpsiConfiguration resource from one compartment to another.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangeOpsiConfigurationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeOpsiConfigurationCompartment API.
     */
    ChangeOpsiConfigurationCompartmentResponse changeOpsiConfigurationCompartment(
            ChangeOpsiConfigurationCompartmentRequest request);

    /**
     * Change the connection details of a co-managed  database insight. When provided, If-Match is checked against ETag values of the resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangePeComanagedDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangePeComanagedDatabaseInsight API.
     */
    ChangePeComanagedDatabaseInsightResponse changePeComanagedDatabaseInsight(
            ChangePeComanagedDatabaseInsightRequest request);

    /**
     * Create a AWR hub resource for the tenant in Operations Insights.
     * This resource will be created in root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateAwrHubExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateAwrHub API.
     */
    CreateAwrHubResponse createAwrHub(CreateAwrHubRequest request);

    /**
     * Create a Database Insight resource for a database in Operations Insights. The database will be enabled in Operations Insights. Database metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDatabaseInsight API.
     */
    CreateDatabaseInsightResponse createDatabaseInsight(CreateDatabaseInsightRequest request);

    /**
     * Create a Enterprise Manager bridge in Operations Insights.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEnterpriseManagerBridge API.
     */
    CreateEnterpriseManagerBridgeResponse createEnterpriseManagerBridge(
            CreateEnterpriseManagerBridgeRequest request);

    /**
     * Create an Exadata insight resource for an Exadata system in Operations Insights. The Exadata system will be enabled in Operations Insights. Exadata-related metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateExadataInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateExadataInsight API.
     */
    CreateExadataInsightResponse createExadataInsight(CreateExadataInsightRequest request);

    /**
     * Create a Host Insight resource for a host in Operations Insights. The host will be enabled in Operations Insights. Host metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHostInsight API.
     */
    CreateHostInsightResponse createHostInsight(CreateHostInsightRequest request);

    /**
     * Create a private endpoint resource for the tenant in Operations Insights.
     * This resource will be created in customer compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateOperationsInsightsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOperationsInsightsPrivateEndpoint API.
     */
    CreateOperationsInsightsPrivateEndpointResponse createOperationsInsightsPrivateEndpoint(
            CreateOperationsInsightsPrivateEndpointRequest request);

    /**
     * Create a Operations Insights Warehouse resource for the tenant in Operations Insights. New ADW will be provisioned for this tenant.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment. If the 'opsi-warehouse-type'
     * header is passed to the API, a warehouse resource without ADW or Schema provisioning is created.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateOperationsInsightsWarehouseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOperationsInsightsWarehouse API.
     */
    CreateOperationsInsightsWarehouseResponse createOperationsInsightsWarehouse(
            CreateOperationsInsightsWarehouseRequest request);

    /**
     * Create a Operations Insights Warehouse user resource for the tenant in Operations Insights.
     * This resource will be created in root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateOperationsInsightsWarehouseUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOperationsInsightsWarehouseUser API.
     */
    CreateOperationsInsightsWarehouseUserResponse createOperationsInsightsWarehouseUser(
            CreateOperationsInsightsWarehouseUserRequest request);

    /**
     * Create an OPSI configuration resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/CreateOpsiConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOpsiConfiguration API.
     */
    CreateOpsiConfigurationResponse createOpsiConfiguration(CreateOpsiConfigurationRequest request);

    /**
     * Deletes an AWR hub.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteAwrHubExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteAwrHub API.
     */
    DeleteAwrHubResponse deleteAwrHub(DeleteAwrHubRequest request);

    /**
     * Deletes a database insight. The database insight will be deleted and cannot be enabled again.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDatabaseInsight API.
     */
    DeleteDatabaseInsightResponse deleteDatabaseInsight(DeleteDatabaseInsightRequest request);

    /**
     * Deletes an Operations Insights Enterprise Manager bridge. If any database insight is still referencing this bridge, the operation will fail.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteEnterpriseManagerBridge API.
     */
    DeleteEnterpriseManagerBridgeResponse deleteEnterpriseManagerBridge(
            DeleteEnterpriseManagerBridgeRequest request);

    /**
     * Deletes an Exadata insight. The Exadata insight will be deleted and cannot be enabled again.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteExadataInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteExadataInsight API.
     */
    DeleteExadataInsightResponse deleteExadataInsight(DeleteExadataInsightRequest request);

    /**
     * Deletes a host insight. The host insight will be deleted and cannot be enabled again.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHostInsight API.
     */
    DeleteHostInsightResponse deleteHostInsight(DeleteHostInsightRequest request);

    /**
     * Deletes a private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteOperationsInsightsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOperationsInsightsPrivateEndpoint API.
     */
    DeleteOperationsInsightsPrivateEndpointResponse deleteOperationsInsightsPrivateEndpoint(
            DeleteOperationsInsightsPrivateEndpointRequest request);

    /**
     * Deletes an Operations Insights Warehouse. There is only expected to be 1 warehouse per tenant.
     * The warehouse is expected to be in the root compartment.
     * User must delete AWR Hub resource for this warehouse before calling this operation.
     * User must delete the warehouse users before calling this operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteOperationsInsightsWarehouseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOperationsInsightsWarehouse API.
     */
    DeleteOperationsInsightsWarehouseResponse deleteOperationsInsightsWarehouse(
            DeleteOperationsInsightsWarehouseRequest request);

    /**
     * Deletes an Operations Insights Warehouse User.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteOperationsInsightsWarehouseUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOperationsInsightsWarehouseUser API.
     */
    DeleteOperationsInsightsWarehouseUserResponse deleteOperationsInsightsWarehouseUser(
            DeleteOperationsInsightsWarehouseUserRequest request);

    /**
     * Deletes an OPSI configuration resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteOpsiConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOpsiConfiguration API.
     */
    DeleteOpsiConfigurationResponse deleteOpsiConfiguration(DeleteOpsiConfigurationRequest request);

    /**
     * Disable advanced features for an Autonomous Database in Operations Insights. The connection detail and advanced features will be removed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DisableAutonomousDatabaseInsightAdvancedFeaturesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableAutonomousDatabaseInsightAdvancedFeatures API.
     */
    DisableAutonomousDatabaseInsightAdvancedFeaturesResponse
            disableAutonomousDatabaseInsightAdvancedFeatures(
                    DisableAutonomousDatabaseInsightAdvancedFeaturesRequest request);

    /**
     * Disables a database in Operations Insights. Database metric collection and analysis will be stopped.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DisableDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableDatabaseInsight API.
     */
    DisableDatabaseInsightResponse disableDatabaseInsight(DisableDatabaseInsightRequest request);

    /**
     * Disables an Exadata system in Operations Insights. Exadata-related metric collection and analysis will be stopped.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DisableExadataInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableExadataInsight API.
     */
    DisableExadataInsightResponse disableExadataInsight(DisableExadataInsightRequest request);

    /**
     * Disables a host in Operations Insights. Host metric collection and analysis will be stopped.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DisableHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableHostInsight API.
     */
    DisableHostInsightResponse disableHostInsight(DisableHostInsightRequest request);

    /**
     * Download the ADW wallet for Operations Insights Warehouse using which the Hub data is exposed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DownloadOperationsInsightsWarehouseWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DownloadOperationsInsightsWarehouseWallet API.
     */
    DownloadOperationsInsightsWarehouseWalletResponse downloadOperationsInsightsWarehouseWallet(
            DownloadOperationsInsightsWarehouseWalletRequest request);

    /**
     * Enables advanced features for an Autonomous Database in Operations Insights. A direct connection will be available for further collection.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/EnableAutonomousDatabaseInsightAdvancedFeaturesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableAutonomousDatabaseInsightAdvancedFeatures API.
     */
    EnableAutonomousDatabaseInsightAdvancedFeaturesResponse
            enableAutonomousDatabaseInsightAdvancedFeatures(
                    EnableAutonomousDatabaseInsightAdvancedFeaturesRequest request);

    /**
     * Enables a database in Operations Insights. Database metric collection and analysis will be started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/EnableDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableDatabaseInsight API.
     */
    EnableDatabaseInsightResponse enableDatabaseInsight(EnableDatabaseInsightRequest request);

    /**
     * Enables an Exadata system in Operations Insights. Exadata-related metric collection and analysis will be started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/EnableExadataInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableExadataInsight API.
     */
    EnableExadataInsightResponse enableExadataInsight(EnableExadataInsightRequest request);

    /**
     * Enables a host in Operations Insights. Host metric collection and analysis will be started.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/EnableHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableHostInsight API.
     */
    EnableHostInsightResponse enableHostInsight(EnableHostInsightRequest request);

    /**
     * Gets the AWR report for the specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetAwrDatabaseReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrDatabaseReport API.
     */
    GetAwrDatabaseReportResponse getAwrDatabaseReport(GetAwrDatabaseReportRequest request);

    /**
     * Gets the SQL health check report for one SQL of the specified database.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetAwrDatabaseSqlReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrDatabaseSqlReport API.
     */
    GetAwrDatabaseSqlReportResponse getAwrDatabaseSqlReport(GetAwrDatabaseSqlReportRequest request);

    /**
     * Gets details of an AWR hub.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetAwrHubExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrHub API.
     */
    GetAwrHubResponse getAwrHub(GetAwrHubRequest request);

    /**
     * Gets the AWR report for the specified source database in the AWR hub. The difference between the timeGreaterThanOrEqualTo and timeLessThanOrEqualTo should not be greater than 7 days.
     * Either beginSnapshotIdentifierGreaterThanOrEqualTo & endSnapshotIdentifierLessThanOrEqualTo params Or timeGreaterThanOrEqualTo & timeLessThanOrEqualTo params are required.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetAwrReportExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetAwrReport API.
     */
    GetAwrReportResponse getAwrReport(GetAwrReportRequest request);

    /**
     * Gets details of a database insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDatabaseInsight API.
     */
    GetDatabaseInsightResponse getDatabaseInsight(GetDatabaseInsightRequest request);

    /**
     * Gets details of an Operations Insights Enterprise Manager bridge.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetEnterpriseManagerBridge API.
     */
    GetEnterpriseManagerBridgeResponse getEnterpriseManagerBridge(
            GetEnterpriseManagerBridgeRequest request);

    /**
     * Gets details of an Exadata insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetExadataInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExadataInsight API.
     */
    GetExadataInsightResponse getExadataInsight(GetExadataInsightRequest request);

    /**
     * Gets details of a host insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHostInsight API.
     */
    GetHostInsightResponse getHostInsight(GetHostInsightRequest request);

    /**
     * Gets the details of the specified private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetOperationsInsightsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOperationsInsightsPrivateEndpoint API.
     */
    GetOperationsInsightsPrivateEndpointResponse getOperationsInsightsPrivateEndpoint(
            GetOperationsInsightsPrivateEndpointRequest request);

    /**
     * Gets details of an Operations Insights Warehouse.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetOperationsInsightsWarehouseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOperationsInsightsWarehouse API.
     */
    GetOperationsInsightsWarehouseResponse getOperationsInsightsWarehouse(
            GetOperationsInsightsWarehouseRequest request);

    /**
     * Gets details of an Operations Insights Warehouse User.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetOperationsInsightsWarehouseUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOperationsInsightsWarehouseUser API.
     */
    GetOperationsInsightsWarehouseUserResponse getOperationsInsightsWarehouseUser(
            GetOperationsInsightsWarehouseUserRequest request);

    /**
     * Gets details of an OPSI configuration resource.
     * Values specified in configItemField and configItemCustomStatus query params will be considered, only if configItems field is requested as part of opsiConfigField query param.
     * Values specified in configItemCustomStatus will determine whether only customized configuration items or only non-customized configuration items or both have to be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetOpsiConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOpsiConfiguration API.
     */
    GetOpsiConfigurationResponse getOpsiConfiguration(GetOpsiConfigurationRequest request);

    /**
     * Gets details of an OPSI data object.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetOpsiDataObjectExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOpsiDataObject API.
     */
    GetOpsiDataObjectResponse getOpsiDataObject(GetOpsiDataObjectRequest request);

    /**
     * Gets the status of the work request with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/GetWorkRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * This endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestAddmReportsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestAddmReports API.
     */
    IngestAddmReportsResponse ingestAddmReports(IngestAddmReportsRequest request);

    /**
     * This is a generic ingest endpoint for all database configuration metrics.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestDatabaseConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestDatabaseConfiguration API.
     */
    IngestDatabaseConfigurationResponse ingestDatabaseConfiguration(
            IngestDatabaseConfigurationRequest request);

    /**
     * This is a generic ingest endpoint for all the host configuration metrics
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestHostConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestHostConfiguration API.
     */
    IngestHostConfigurationResponse ingestHostConfiguration(IngestHostConfigurationRequest request);

    /**
     * This is a generic ingest endpoint for all the host performance metrics
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestHostMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestHostMetrics API.
     */
    IngestHostMetricsResponse ingestHostMetrics(IngestHostMetricsRequest request);

    /**
     * The sqlbucket endpoint takes in a JSON payload, persists it in Operations Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlBucketExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlBucket API.
     */
    IngestSqlBucketResponse ingestSqlBucket(IngestSqlBucketRequest request);

    /**
     * The SqlPlanLines endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlPlanLinesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlPlanLines API.
     */
    IngestSqlPlanLinesResponse ingestSqlPlanLines(IngestSqlPlanLinesRequest request);

    /**
     * The SQL Stats endpoint takes in a JSON payload, persists it in Operations Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlStatsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlStats API.
     */
    IngestSqlStatsResponse ingestSqlStats(IngestSqlStatsRequest request);

    /**
     * The SqlText endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     * Disclaimer: SQL text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in the sqlFullText column should be masked prior to ingestion.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/IngestSqlTextExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use IngestSqlText API.
     */
    IngestSqlTextResponse ingestSqlText(IngestSqlTextRequest request);

    /**
     * Gets list of ADDM finding categories.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAddmDbFindingCategoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAddmDbFindingCategories API.
     */
    ListAddmDbFindingCategoriesResponse listAddmDbFindingCategories(
            ListAddmDbFindingCategoriesRequest request);

    /**
     * Get the ADDM findings time series for the specified databases for a given time period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAddmDbFindingsTimeSeriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAddmDbFindingsTimeSeries API.
     */
    ListAddmDbFindingsTimeSeriesResponse listAddmDbFindingsTimeSeries(
            ListAddmDbFindingsTimeSeriesRequest request);

    /**
     * Gets list of ADDM database parameter categories for the specified databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAddmDbParameterCategoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAddmDbParameterCategories API.
     */
    ListAddmDbParameterCategoriesResponse listAddmDbParameterCategories(
            ListAddmDbParameterCategoriesRequest request);

    /**
     * Gets list of ADDM recommendation categories for the specified databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAddmDbRecommendationCategoriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAddmDbRecommendationCategories API.
     */
    ListAddmDbRecommendationCategoriesResponse listAddmDbRecommendationCategories(
            ListAddmDbRecommendationCategoriesRequest request);

    /**
     * Gets time series data for ADDM recommendations for the specified databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAddmDbRecommendationsTimeSeriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAddmDbRecommendationsTimeSeries API.
     */
    ListAddmDbRecommendationsTimeSeriesResponse listAddmDbRecommendationsTimeSeries(
            ListAddmDbRecommendationsTimeSeriesRequest request);

    /**
     * Gets a list of ADDM database information
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAddmDbsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAddmDbs API.
     */
    ListAddmDbsResponse listAddmDbs(ListAddmDbsRequest request);

    /**
     * Lists AWR snapshots for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAwrDatabaseSnapshotsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrDatabaseSnapshots API.
     */
    ListAwrDatabaseSnapshotsResponse listAwrDatabaseSnapshots(
            ListAwrDatabaseSnapshotsRequest request);

    /**
     * Gets the list of databases and their snapshot summary details available in the AWRHub.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAwrDatabasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrDatabases API.
     */
    ListAwrDatabasesResponse listAwrDatabases(ListAwrDatabasesRequest request);

    /**
     * Gets a list of AWR hubs. Either compartmentId or id must be specified. All these resources are expected to be in root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAwrHubsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrHubs API.
     */
    ListAwrHubsResponse listAwrHubs(ListAwrHubsRequest request);

    /**
     * Lists AWR snapshots for the specified source database in the AWR hub. The difference between the timeGreaterThanOrEqualTo and timeLessThanOrEqualTo should not exceed an elapsed range of 1 day.
     * The timeGreaterThanOrEqualTo & timeLessThanOrEqualTo params are optional. If these params are not provided, by default last 1 day snapshots will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListAwrSnapshotsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAwrSnapshots API.
     */
    ListAwrSnapshotsResponse listAwrSnapshots(ListAwrSnapshotsRequest request);

    /**
     * Gets a list of database insight configurations based on the query parameters specified. Either compartmentId or databaseInsightId query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of database insight configurations in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListDatabaseConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseConfigurations API.
     */
    ListDatabaseConfigurationsResponse listDatabaseConfigurations(
            ListDatabaseConfigurationsRequest request);

    /**
     * Gets a list of database insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of database insights in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListDatabaseInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDatabaseInsights API.
     */
    ListDatabaseInsightsResponse listDatabaseInsights(ListDatabaseInsightsRequest request);

    /**
     * Gets a list of Operations Insights Enterprise Manager bridges. Either compartmentId or id must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of bridges in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListEnterpriseManagerBridgesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEnterpriseManagerBridges API.
     */
    ListEnterpriseManagerBridgesResponse listEnterpriseManagerBridges(
            ListEnterpriseManagerBridgesRequest request);

    /**
     * Gets a list of exadata insight configurations. Either compartmentId or exadataInsightsId query parameter must be specified.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListExadataConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExadataConfigurations API.
     */
    ListExadataConfigurationsResponse listExadataConfigurations(
            ListExadataConfigurationsRequest request);

    /**
     * Gets a list of Exadata insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of Exadata insights in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListExadataInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListExadataInsights API.
     */
    ListExadataInsightsResponse listExadataInsights(ListExadataInsightsRequest request);

    /**
     * Gets a list of host insight configurations based on the query parameters specified. Either compartmentId or hostInsightId query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of host insight configurations in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListHostConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostConfigurations API.
     */
    ListHostConfigurationsResponse listHostConfigurations(ListHostConfigurationsRequest request);

    /**
     * Gets a list of host insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of host insights in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListHostInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostInsights API.
     */
    ListHostInsightsResponse listHostInsights(ListHostInsightsRequest request);

    /**
     * Get a list of hosted entities details.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListHostedEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHostedEntities API.
     */
    ListHostedEntitiesResponse listHostedEntities(ListHostedEntitiesRequest request);

    /**
     * Gets a list of agent entities available to add a new hostInsight.  An agent entity is \"available\"
     * and will be shown if all the following conditions are true:
     *    1.  The agent OCID is not already being used for an existing hostInsight.
     *    2.  The agent availabilityStatus = 'ACTIVE'
     *    3.  The agent lifecycleState = 'ACTIVE'
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListImportableAgentEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImportableAgentEntities API.
     */
    ListImportableAgentEntitiesResponse listImportableAgentEntities(
            ListImportableAgentEntitiesRequest request);

    /**
     * Gets a list of available compute intances running cloud agent to add a new hostInsight.  An Compute entity is \"available\"
     * and will be shown if all the following conditions are true:
     *    1. Compute is running OCA
     *    2. OCI Management Agent is not enabled or If OCI Management Agent is enabled
     *       2.1 The agent OCID is not already being used for an existing hostInsight.
     *       2.2 The agent availabilityStatus = 'ACTIVE'
     *       2.3 The agent lifecycleState = 'ACTIVE'
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListImportableComputeEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImportableComputeEntities API.
     */
    ListImportableComputeEntitiesResponse listImportableComputeEntities(
            ListImportableComputeEntitiesRequest request);

    /**
     * Gets a list of importable entities for an Operations Insights Enterprise Manager bridge that have not been imported before.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListImportableEnterpriseManagerEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListImportableEnterpriseManagerEntities API.
     */
    ListImportableEnterpriseManagerEntitiesResponse listImportableEnterpriseManagerEntities(
            ListImportableEnterpriseManagerEntitiesRequest request);

    /**
     * Gets a list of Operation Insights private endpoints.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListOperationsInsightsPrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOperationsInsightsPrivateEndpoints API.
     */
    ListOperationsInsightsPrivateEndpointsResponse listOperationsInsightsPrivateEndpoints(
            ListOperationsInsightsPrivateEndpointsRequest request);

    /**
     * Gets a list of Operations Insights Warehouse users. Either compartmentId or id must be specified. All these resources are expected to be in root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListOperationsInsightsWarehouseUsersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOperationsInsightsWarehouseUsers API.
     */
    ListOperationsInsightsWarehouseUsersResponse listOperationsInsightsWarehouseUsers(
            ListOperationsInsightsWarehouseUsersRequest request);

    /**
     * Gets a list of Operations Insights warehouses. Either compartmentId or id must be specified.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListOperationsInsightsWarehousesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOperationsInsightsWarehouses API.
     */
    ListOperationsInsightsWarehousesResponse listOperationsInsightsWarehouses(
            ListOperationsInsightsWarehousesRequest request);

    /**
     * Gets a list of OPSI configuration resources based on the query parameters specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListOpsiConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOpsiConfigurations API.
     */
    ListOpsiConfigurationsResponse listOpsiConfigurations(ListOpsiConfigurationsRequest request);

    /**
     * Gets a list of OPSI data objects based on the query parameters specified. CompartmentId id query parameter must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListOpsiDataObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOpsiDataObjects API.
     */
    ListOpsiDataObjectsResponse listOpsiDataObjects(ListOpsiDataObjectsRequest request);

    /**
     * Query SQL Warehouse to list the plan xml for a given SQL execution plan. This returns a SqlPlanCollection object, but is currently limited to a single plan.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlPlansExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlPlans API.
     */
    ListSqlPlansResponse listSqlPlans(ListSqlPlansRequest request);

    /**
     * Search SQL by SQL Identifier across databases in a compartment and in all sub-compartments if specified.
     * And get the SQL Text and the details of the databases executing the SQL for a given time period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlSearchesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlSearches API.
     */
    ListSqlSearchesResponse listSqlSearches(ListSqlSearchesRequest request);

    /**
     * Query SQL Warehouse to get the full SQL Text for a SQL in a compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlTextsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSqlTexts API.
     */
    ListSqlTextsResponse listSqlTexts(ListSqlTextsRequest request);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWorkRequestErrorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWorkRequestLogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * Lists the work requests in a compartment. Either compartmentId or id must be specified. Only one of id, resourceId or relatedResourceId can be specified optionally.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Queries an OPSI data object with the inputs provided and sends the result set back. Either analysisTimeInterval
     * or timeIntervalStart and timeIntervalEnd parameters need to be passed as well.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/QueryOpsiDataObjectDataExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use QueryOpsiDataObjectData API.
     */
    QueryOpsiDataObjectDataResponse queryOpsiDataObjectData(QueryOpsiDataObjectDataRequest request);

    /**
     * Rotate the ADW wallet for Operations Insights Warehouse using which the Hub data is exposed.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/RotateOperationsInsightsWarehouseWalletExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use RotateOperationsInsightsWarehouseWallet API.
     */
    RotateOperationsInsightsWarehouseWalletResponse rotateOperationsInsightsWarehouseWallet(
            RotateOperationsInsightsWarehouseWalletRequest request);

    /**
     * Summarizes ADDM findings for the specified databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbFindingsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAddmDbFindings API.
     */
    SummarizeAddmDbFindingsResponse summarizeAddmDbFindings(SummarizeAddmDbFindingsRequest request);

    /**
     * Summarizes the AWR database parameter change history for the specified parameter. There will
     * be one element for each time that parameter changed during the specified time period.
     * This API is limited to only one parameter per request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbParameterChangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAddmDbParameterChanges API.
     */
    SummarizeAddmDbParameterChangesResponse summarizeAddmDbParameterChanges(
            SummarizeAddmDbParameterChangesRequest request);

    /**
     * Summarizes database parameter history information for the specified databases. Return a list of parameters
     * with information on whether the parameter values were changed or not within the specified
     * time period. The response does not include the individual parameter changes within the time
     * period.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAddmDbParameters API.
     */
    SummarizeAddmDbParametersResponse summarizeAddmDbParameters(
            SummarizeAddmDbParametersRequest request);

    /**
     * Summarizes ADDM recommendations for the specified databases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAddmDbRecommendations API.
     */
    SummarizeAddmDbRecommendationsResponse summarizeAddmDbRecommendations(
            SummarizeAddmDbRecommendationsRequest request);

    /**
     * Summarizes Schema objects for the specified databases for the specified objectIdentifiers
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbSchemaObjectsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAddmDbSchemaObjects API.
     */
    SummarizeAddmDbSchemaObjectsResponse summarizeAddmDbSchemaObjects(
            SummarizeAddmDbSchemaObjectsRequest request);

    /**
     * Summarizes SQL Statements for the specified databases for the specified sqlIdentifiers
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAddmDbSqlStatementsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAddmDbSqlStatements API.
     */
    SummarizeAddmDbSqlStatementsResponse summarizeAddmDbSqlStatements(
            SummarizeAddmDbSqlStatementsRequest request);

    /**
     * Summarizes the AWR CPU resource limits and metrics for the specified database in AWR.
     * Based on the time range provided as part of query param, the metrics points will be returned in the response as below.
     * - if time range is <=7 days then the metrics points will be for every MINUTES
     * - if time range is <=2 hours then the metrics points will be for every 10 SECONDS
     * - if time range is >7 days then the metrics points will be for every HOUR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseCpuUsagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseCpuUsages API.
     */
    SummarizeAwrDatabaseCpuUsagesResponse summarizeAwrDatabaseCpuUsages(
            SummarizeAwrDatabaseCpuUsagesRequest request);

    /**
     * Summarizes the metric samples for the specified database in the AWR. The metric samples are summarized based on the Time dimension for each metric.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseMetricsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseMetrics API.
     */
    SummarizeAwrDatabaseMetricsResponse summarizeAwrDatabaseMetrics(
            SummarizeAwrDatabaseMetricsRequest request);

    /**
     * Summarizes the database parameter change history for one database parameter of the specified database in AWR. One change history record contains
     * the previous value, the changed value, and the corresponding time range. If the database parameter value was changed multiple times within the time range, then multiple change history records are created for the same parameter.
     * Note that this API only returns information on change history details for one database parameter.
     * To get a list of all the database parameters whose values were changed during a specified time range, use the following API endpoint:
     * /awrHubs/{awrHubId}/awrDbParameters?awrSourceDatabaseIdentifier={awrSourceDbId}
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseParameterChangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseParameterChanges API.
     */
    SummarizeAwrDatabaseParameterChangesResponse summarizeAwrDatabaseParameterChanges(
            SummarizeAwrDatabaseParameterChangesRequest request);

    /**
     * Summarizes the database parameter history for the specified database in AWR. This includes the list of database
     * parameters, with information on whether the parameter values were modified within the query time range. Note that
     * each database parameter is only listed once. Depending on the optional query parameters, the returned summary gets all the database parameters, which include:
     * <p>
     * Queryparam (valueChanged =\"Y\") - Each parameter whose value was changed during the time range, \"isChanged : true\" in response for the DB params.
     * Queryparam (valueChanged =\"N\") - Each parameter whose value was unchanged during the time range, \"isChanged : false\" in response for the DB params.
     * Queryparam (valueChanged =\"Y\"  and valueModified = \"SYSTEM_MOD\") - Each parameter whose value was changed at the system level during the time range, \"isChanged : true\" & \"valueModified : SYSTEM_MOD\" in response for the DB params.
     * Queryparam (valueChanged =\"N\" and  valueDefault = \"FALSE\") - Each parameter whose value was unchanged during the time range, however, the value is not the default value, \"isChanged : true\" & \"isDefault : false\" in response for the DB params.
     * <p>
     * Note that this API does not return information on the number of times each database parameter has been changed within the time range. To get the database parameter value change history for a specific parameter, use the following API endpoint:
     * /awrHubs/{awrHubId}/awrDbParameterChanges?awrSourceDatabaseIdentifier={awrSourceDbId}
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseParametersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseParameters API.
     */
    SummarizeAwrDatabaseParametersResponse summarizeAwrDatabaseParameters(
            SummarizeAwrDatabaseParametersRequest request);

    /**
     * Summarizes the AWR snapshot ranges that contain continuous snapshots, for the specified AWRHub.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseSnapshotRangesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseSnapshotRanges API.
     */
    SummarizeAwrDatabaseSnapshotRangesResponse summarizeAwrDatabaseSnapshotRanges(
            SummarizeAwrDatabaseSnapshotRangesRequest request);

    /**
     * Summarizes the AWR SYSSTAT sample data for the specified database in AWR. The statistical data is summarized based on the Time dimension for each statistic.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseSysstatsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseSysstats API.
     */
    SummarizeAwrDatabaseSysstatsResponse summarizeAwrDatabaseSysstats(
            SummarizeAwrDatabaseSysstatsRequest request);

    /**
     * Summarizes the AWR top wait events.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseTopWaitEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseTopWaitEvents API.
     */
    SummarizeAwrDatabaseTopWaitEventsResponse summarizeAwrDatabaseTopWaitEvents(
            SummarizeAwrDatabaseTopWaitEventsRequest request);

    /**
     * Summarizes AWR wait event data into value buckets and frequency, for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseWaitEventBucketsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseWaitEventBuckets API.
     */
    SummarizeAwrDatabaseWaitEventBucketsResponse summarizeAwrDatabaseWaitEventBuckets(
            SummarizeAwrDatabaseWaitEventBucketsRequest request);

    /**
     * Summarizes the AWR wait event sample data for the specified database in the AWR. The event data is summarized based on the Time dimension for each event.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrDatabaseWaitEventsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrDatabaseWaitEvents API.
     */
    SummarizeAwrDatabaseWaitEventsResponse summarizeAwrDatabaseWaitEvents(
            SummarizeAwrDatabaseWaitEventsRequest request);

    /**
     * Gets a list of summary of AWR Sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeAwrSourcesSummariesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeAwrSourcesSummaries API.
     */
    SummarizeAwrSourcesSummariesResponse summarizeAwrSourcesSummaries(
            SummarizeAwrSourcesSummariesRequest request);

    /**
     * Gets the applicable configuration items based on the query parameters specified. Configuration items for an opsiConfigType with respect to a compartmentId can be fetched.
     * Values specified in configItemField param will determine what fields for each configuration items have to be returned.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeConfigurationItemsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeConfigurationItems API.
     */
    SummarizeConfigurationItemsResponse summarizeConfigurationItems(
            SummarizeConfigurationItemsRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity, baseCapacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceCapacityTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceCapacityTrend API.
     */
    SummarizeDatabaseInsightResourceCapacityTrendResponse
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request);

    /**
     * Get Forecast predictions for CPU and Storage resources since a time in the past.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceForecastTrend API.
     */
    SummarizeDatabaseInsightResourceForecastTrendResponse
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request);

    /**
     * Lists the Resource statistics (usage,capacity, usage change percent, utilization percent, base capacity, isAutoScalingEnabled)
     * for each database filtered by utilization level in a compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceStatistics API.
     */
    SummarizeDatabaseInsightResourceStatisticsResponse summarizeDatabaseInsightResourceStatistics(
            SummarizeDatabaseInsightResourceStatisticsRequest request);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within the specified time period.
     * For each database, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceUsage API.
     */
    SummarizeDatabaseInsightResourceUsageResponse summarizeDatabaseInsightResourceUsage(
            SummarizeDatabaseInsightResourceUsageRequest request);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceUsageTrend API.
     */
    SummarizeDatabaseInsightResourceUsageTrendResponse summarizeDatabaseInsightResourceUsageTrend(
            SummarizeDatabaseInsightResourceUsageTrendRequest request);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUtilizationInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightResourceUtilizationInsight API.
     */
    SummarizeDatabaseInsightResourceUtilizationInsightResponse
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request);

    /**
     * Returns response with usage time series data (endTimestamp, usage, capacity) with breakdown by tablespaceName for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightTablespaceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeDatabaseInsightTablespaceUsageTrend API.
     */
    SummarizeDatabaseInsightTablespaceUsageTrendResponse
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified for an exadata system for a resource metric.
     * Additionally resources can be filtered using databaseInsightId, hostInsightId or storageServerName query parameters.
     * Top five resources are returned if total exceeds the limit specified.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Database name is returned in name field. DatabaseInsightId, cdbName and hostName query parameter applies to ResourceType DATABASE.
     * Valid values for ResourceType HOST are CPU and MEMORY. HostName is returned in name field. HostInsightId and hostName query parameter applies to ResourceType HOST.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT. Storage server name is returned in name field for resourceMetric IOPS and THROUGHPUT
     * and asmName is returned in name field for resourceMetric STORAGE. StorageServerName query parameter applies to ResourceType STORAGE_SERVER.
     * Valid values for ResourceType DISKGROUP is STORAGE. Comma delimited (asmName,diskgroupName) is returned in name field.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceCapacityTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceCapacityTrend API.
     */
    SummarizeExadataInsightResourceCapacityTrendResponse
            summarizeExadataInsightResourceCapacityTrend(
                    SummarizeExadataInsightResourceCapacityTrendRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified for an exadata system or fleet aggregation for a resource metric.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceCapacityTrendAggregatedExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceCapacityTrendAggregated API.
     */
    SummarizeExadataInsightResourceCapacityTrendAggregatedResponse
            summarizeExadataInsightResourceCapacityTrendAggregated(
                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest request);

    /**
     * Get historical usage and forecast predictions for an exadata system with breakdown by databases, hosts or storage servers.
     * Additionally resources can be filtered using databaseInsightId, hostInsightId or storageServerName query parameters.
     * Top five resources are returned if total exceeds the limit specified.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Database name is returned in name field. DatabaseInsightId , cdbName and hostName query parameter applies to ResourceType DATABASE.
     * Valid values for ResourceType HOST are CPU and MEMORY. HostName s returned in name field. HostInsightId and hostName query parameter applies to ResourceType HOST.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT. Storage server name is returned in name field for resourceMetric IOPS and THROUGHPUT
     * and asmName is returned in name field for resourceMetric STORAGE. StorageServerName query parameter applies to ResourceType STORAGE_SERVER.
     * Valid value for ResourceType DISKGROUP is STORAGE. Comma delimited (asmName,diskgroupName) is returned in name field.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceForecastTrend API.
     */
    SummarizeExadataInsightResourceForecastTrendResponse
            summarizeExadataInsightResourceForecastTrend(
                    SummarizeExadataInsightResourceForecastTrendRequest request);

    /**
     * Get aggregated historical usage and forecast predictions for resources. Either compartmentId or exadataInsightsId query parameter must be specified.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceForecastTrendAggregatedExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceForecastTrendAggregated API.
     */
    SummarizeExadataInsightResourceForecastTrendAggregatedResponse
            summarizeExadataInsightResourceForecastTrendAggregated(
                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest request);

    /**
     * Lists the Resource statistics (usage, capacity, usage change percent, utilization percent) for each resource based on resourceMetric filtered by utilization level.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS, THROUGHPUT.
     * Valid value for ResourceType DISKGROUP is STORAGE.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceStatistics API.
     */
    SummarizeExadataInsightResourceStatisticsResponse summarizeExadataInsightResourceStatistics(
            SummarizeExadataInsightResourceStatisticsRequest request);

    /**
     * A cumulative distribution function is used to rank the usage data points per resource within the specified time period.
     * For each resource, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceUsage API.
     */
    SummarizeExadataInsightResourceUsageResponse summarizeExadataInsightResourceUsage(
            SummarizeExadataInsightResourceUsageRequest request);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within the specified time period.
     * For each database, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceUsageAggregatedExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceUsageAggregated API.
     */
    SummarizeExadataInsightResourceUsageAggregatedResponse
            summarizeExadataInsightResourceUsageAggregated(
                    SummarizeExadataInsightResourceUsageAggregatedRequest request);

    /**
     * Gets current utilization, projected utilization and days to reach projectedUtilization for an exadata system over specified time period. Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and MEMORY. Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceUtilizationInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataInsightResourceUtilizationInsight API.
     */
    SummarizeExadataInsightResourceUtilizationInsightResponse
            summarizeExadataInsightResourceUtilizationInsight(
                    SummarizeExadataInsightResourceUtilizationInsightRequest request);

    /**
     * Lists the software and hardware inventory of the Exadata System.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataMembersExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeExadataMembers API.
     */
    SummarizeExadataMembersResponse summarizeExadataMembers(SummarizeExadataMembersRequest request);

    /**
     * Returns response with usage time series data with breakdown by network interface for the time period specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightNetworkUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightNetworkUsageTrend API.
     */
    SummarizeHostInsightNetworkUsageTrendResponse summarizeHostInsightNetworkUsageTrend(
            SummarizeHostInsightNetworkUsageTrendRequest request);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceCapacityTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceCapacityTrend API.
     */
    SummarizeHostInsightResourceCapacityTrendResponse summarizeHostInsightResourceCapacityTrend(
            SummarizeHostInsightResourceCapacityTrendRequest request);

    /**
     * Get Forecast predictions for CPU or memory resources since a time in the past.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceForecastTrend API.
     */
    SummarizeHostInsightResourceForecastTrendResponse summarizeHostInsightResourceForecastTrend(
            SummarizeHostInsightResourceForecastTrendRequest request);

    /**
     * Lists the resource statistics (usage, capacity, usage change percent, utilization percent, load) for each host filtered
     * by utilization level in a compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceStatistics API.
     */
    SummarizeHostInsightResourceStatisticsResponse summarizeHostInsightResourceStatistics(
            SummarizeHostInsightResourceStatisticsRequest request);

    /**
     * A cumulative distribution function is used to rank the usage data points per host within the specified time period.
     * For each host, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceUsage API.
     */
    SummarizeHostInsightResourceUsageResponse summarizeHostInsightResourceUsage(
            SummarizeHostInsightResourceUsageRequest request);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceUsageTrend API.
     */
    SummarizeHostInsightResourceUsageTrendResponse summarizeHostInsightResourceUsageTrend(
            SummarizeHostInsightResourceUsageTrendRequest request);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightResourceUtilizationInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightResourceUtilizationInsight API.
     */
    SummarizeHostInsightResourceUtilizationInsightResponse
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request);

    /**
     * Returns response with usage time series data with breakdown by filesystem for the time period specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightStorageUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightStorageUsageTrend API.
     */
    SummarizeHostInsightStorageUsageTrendResponse summarizeHostInsightStorageUsageTrend(
            SummarizeHostInsightStorageUsageTrendRequest request);

    /**
     * Returns response with aggregated data (timestamp, usageData) for top processes on a specific date.
     * Data is aggregated for the time specified and processes are sorted descendent by the process metric specified (CPU, MEMORY, VIRTUAL_MEMORY).
     * hostInsightId, processMetric must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightTopProcessesUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightTopProcessesUsage API.
     */
    SummarizeHostInsightTopProcessesUsageResponse summarizeHostInsightTopProcessesUsage(
            SummarizeHostInsightTopProcessesUsageRequest request);

    /**
     * Returns response with aggregated time series data (timeIntervalstart, timeIntervalEnd, commandArgs, usageData) for top processes.
     * Data is aggregated for the time period specified and proceses are sorted descendent by the proces metric specified (CPU, MEMORY, VIRTUAL_MEMORY).
     * HostInsight Id and Process metric must be specified
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightTopProcessesUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeHostInsightTopProcessesUsageTrend API.
     */
    SummarizeHostInsightTopProcessesUsageTrendResponse summarizeHostInsightTopProcessesUsageTrend(
            SummarizeHostInsightTopProcessesUsageTrendRequest request);

    /**
     * Gets the details of resources used by an Operations Insights Warehouse.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeOperationsInsightsWarehouseResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeOperationsInsightsWarehouseResourceUsage API.
     */
    SummarizeOperationsInsightsWarehouseResourceUsageResponse
            summarizeOperationsInsightsWarehouseResourceUsage(
                    SummarizeOperationsInsightsWarehouseResourceUsageRequest request);

    /**
     * Query SQL Warehouse to get the performance insights for SQLs taking greater than X% database time for a given
     * time period across the given databases or database types in a compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlInsights API.
     */
    SummarizeSqlInsightsResponse summarizeSqlInsights(SummarizeSqlInsightsRequest request);

    /**
     * Query SQL Warehouse to get the performance insights on the execution plans for a given SQL for a given time period.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlPlanInsightsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlPlanInsights API.
     */
    SummarizeSqlPlanInsightsResponse summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request);

    /**
     * Query SQL Warehouse to summarize the response time distribution of query executions for a given SQL for a given time period.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlResponseTimeDistributionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlResponseTimeDistributions API.
     */
    SummarizeSqlResponseTimeDistributionsResponse summarizeSqlResponseTimeDistributions(
            SummarizeSqlResponseTimeDistributionsRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics for SQLs taking greater than X% database time for a given
     * time period across the given databases or database types in a compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlStatistics API.
     */
    SummarizeSqlStatisticsResponse summarizeSqlStatistics(SummarizeSqlStatisticsRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL across given databases for a
     * given time period in a compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsTimeSeriesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlStatisticsTimeSeries API.
     */
    SummarizeSqlStatisticsTimeSeriesResponse summarizeSqlStatisticsTimeSeries(
            SummarizeSqlStatisticsTimeSeriesRequest request);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL by execution plans for a given time period.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsTimeSeriesByPlanExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeSqlStatisticsTimeSeriesByPlan API.
     */
    SummarizeSqlStatisticsTimeSeriesByPlanResponse summarizeSqlStatisticsTimeSeriesByPlan(
            SummarizeSqlStatisticsTimeSeriesByPlanRequest request);

    /**
     * Updates the configuration of a hub .
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateAwrHubExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateAwrHub API.
     */
    UpdateAwrHubResponse updateAwrHub(UpdateAwrHubRequest request);

    /**
     * Updates configuration of a database insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDatabaseInsight API.
     */
    UpdateDatabaseInsightResponse updateDatabaseInsight(UpdateDatabaseInsightRequest request);

    /**
     * Updates configuration of an Operations Insights Enterprise Manager bridge.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateEnterpriseManagerBridgeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateEnterpriseManagerBridge API.
     */
    UpdateEnterpriseManagerBridgeResponse updateEnterpriseManagerBridge(
            UpdateEnterpriseManagerBridgeRequest request);

    /**
     * Updates configuration of an Exadata insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateExadataInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExadataInsight API.
     */
    UpdateExadataInsightResponse updateExadataInsight(UpdateExadataInsightRequest request);

    /**
     * Updates configuration of a host insight.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateHostInsightExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHostInsight API.
     */
    UpdateHostInsightResponse updateHostInsight(UpdateHostInsightRequest request);

    /**
     * Updates one or more attributes of the specified private endpoint.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateOperationsInsightsPrivateEndpointExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOperationsInsightsPrivateEndpoint API.
     */
    UpdateOperationsInsightsPrivateEndpointResponse updateOperationsInsightsPrivateEndpoint(
            UpdateOperationsInsightsPrivateEndpointRequest request);

    /**
     * Updates the configuration of an Operations Insights Warehouse.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateOperationsInsightsWarehouseExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOperationsInsightsWarehouse API.
     */
    UpdateOperationsInsightsWarehouseResponse updateOperationsInsightsWarehouse(
            UpdateOperationsInsightsWarehouseRequest request);

    /**
     * Updates the configuration of an Operations Insights Warehouse User.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateOperationsInsightsWarehouseUserExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOperationsInsightsWarehouseUser API.
     */
    UpdateOperationsInsightsWarehouseUserResponse updateOperationsInsightsWarehouseUser(
            UpdateOperationsInsightsWarehouseUserRequest request);

    /**
     * Updates an OPSI configuration resource with the given ID.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/UpdateOpsiConfigurationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOpsiConfiguration API.
     */
    UpdateOpsiConfigurationResponse updateOpsiConfiguration(UpdateOpsiConfigurationRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    OperationsInsightsWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    OperationsInsightsPaginators getPaginators();
}
