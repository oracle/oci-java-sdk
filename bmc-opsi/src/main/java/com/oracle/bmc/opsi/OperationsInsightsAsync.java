/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Use the Ops Insights API to perform data extraction operations to obtain database resource
 * utilization, performance statistics, and reference information. For more information, see [About
 * Oracle Cloud Infrastructure Ops
 * Insights](https://docs.cloud.oracle.com/en-us/iaas/operations-insights/doc/operations-insights.html).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface OperationsInsightsAsync extends AutoCloseable {

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
     * Determines whether realm specific endpoint should be used or not. Set
     * realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm
     * specific endpoint template, otherwise set it to "false"
     *
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint
     *     template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Add new members (e.g. databases and hosts) to an Exadata system in Operations Insights.
     * Exadata-related metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddExadataInsightMembersResponse> addExadataInsightMembers(
            AddExadataInsightMembersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddExadataInsightMembersRequest, AddExadataInsightMembersResponse>
                    handler);

    /**
     * Update connection detail for advanced features of Autonomous Database in Operations Insights.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse>
            changeAutonomousDatabaseInsightAdvancedFeatures(
                    ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAutonomousDatabaseInsightAdvancedFeaturesRequest,
                                    ChangeAutonomousDatabaseInsightAdvancedFeaturesResponse>
                            handler);

    /**
     * Moves an AwrHubSource resource from one compartment to another. When provided, If-Match is
     * checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeAwrHubSourceCompartmentResponse>
            changeAwrHubSourceCompartment(
                    ChangeAwrHubSourceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeAwrHubSourceCompartmentRequest,
                                    ChangeAwrHubSourceCompartmentResponse>
                            handler);

    /**
     * Moves a DatabaseInsight resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseInsightCompartmentResponse>
            changeDatabaseInsightCompartment(
                    ChangeDatabaseInsightCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseInsightCompartmentRequest,
                                    ChangeDatabaseInsightCompartmentResponse>
                            handler);

    /**
     * Moves a EnterpriseManagerBridge resource from one compartment to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEnterpriseManagerBridgeCompartmentResponse>
            changeEnterpriseManagerBridgeCompartment(
                    ChangeEnterpriseManagerBridgeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEnterpriseManagerBridgeCompartmentRequest,
                                    ChangeEnterpriseManagerBridgeCompartmentResponse>
                            handler);

    /**
     * Moves an Exadata insight resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExadataInsightCompartmentResponse>
            changeExadataInsightCompartment(
                    ChangeExadataInsightCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadataInsightCompartmentRequest,
                                    ChangeExadataInsightCompartmentResponse>
                            handler);

    /**
     * Moves a HostInsight resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeHostInsightCompartmentResponse> changeHostInsightCompartment(
            ChangeHostInsightCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeHostInsightCompartmentRequest,
                            ChangeHostInsightCompartmentResponse>
                    handler);

    /**
     * Change the connection details of a Cloud MACS-managed database insight. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMacsManagedCloudDatabaseInsightConnectionResponse>
            changeMacsManagedCloudDatabaseInsightConnection(
                    ChangeMacsManagedCloudDatabaseInsightConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMacsManagedCloudDatabaseInsightConnectionRequest,
                                    ChangeMacsManagedCloudDatabaseInsightConnectionResponse>
                            handler);

    /**
     * Moves a news report resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeNewsReportCompartmentResponse> changeNewsReportCompartment(
            ChangeNewsReportCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeNewsReportCompartmentRequest, ChangeNewsReportCompartmentResponse>
                    handler);

    /**
     * Moves a private endpoint from one compartment to another. When provided, If-Match is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOperationsInsightsPrivateEndpointCompartmentResponse>
            changeOperationsInsightsPrivateEndpointCompartment(
                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperationsInsightsPrivateEndpointCompartmentRequest,
                                    ChangeOperationsInsightsPrivateEndpointCompartmentResponse>
                            handler);

    /**
     * Moves a Operations Insights Warehouse resource from one compartment to another. When
     * provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOperationsInsightsWarehouseCompartmentResponse>
            changeOperationsInsightsWarehouseCompartment(
                    ChangeOperationsInsightsWarehouseCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOperationsInsightsWarehouseCompartmentRequest,
                                    ChangeOperationsInsightsWarehouseCompartmentResponse>
                            handler);

    /**
     * Moves an OpsiConfiguration resource from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeOpsiConfigurationCompartmentResponse>
            changeOpsiConfigurationCompartment(
                    ChangeOpsiConfigurationCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeOpsiConfigurationCompartmentRequest,
                                    ChangeOpsiConfigurationCompartmentResponse>
                            handler);

    /**
     * Change the connection details of a co-managed database insight. When provided, If-Match is
     * checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangePeComanagedDatabaseInsightResponse>
            changePeComanagedDatabaseInsight(
                    ChangePeComanagedDatabaseInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangePeComanagedDatabaseInsightRequest,
                                    ChangePeComanagedDatabaseInsightResponse>
                            handler);

    /**
     * Create a AWR hub resource for the tenant in Operations Insights. This resource will be
     * created in root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAwrHubResponse> createAwrHub(
            CreateAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAwrHubRequest, CreateAwrHubResponse>
                    handler);

    /**
     * Register Awr Hub source
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAwrHubSourceResponse> createAwrHubSource(
            CreateAwrHubSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAwrHubSourceRequest, CreateAwrHubSourceResponse>
                    handler);

    /**
     * Create a Database Insight resource for a database in Operations Insights. The database will
     * be enabled in Operations Insights. Database metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseInsightResponse> createDatabaseInsight(
            CreateDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>
                    handler);

    /**
     * Create a Enterprise Manager bridge in Operations Insights.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateEnterpriseManagerBridgeResponse>
            createEnterpriseManagerBridge(
                    CreateEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateEnterpriseManagerBridgeRequest,
                                    CreateEnterpriseManagerBridgeResponse>
                            handler);

    /**
     * Create an Exadata insight resource for an Exadata system in Operations Insights. The Exadata
     * system will be enabled in Operations Insights. Exadata-related metric collection and analysis
     * will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateExadataInsightResponse> createExadataInsight(
            CreateExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExadataInsightRequest, CreateExadataInsightResponse>
                    handler);

    /**
     * Create a Host Insight resource for a host in Ops Insights. The host will be enabled in Ops
     * Insights. Host metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateHostInsightResponse> createHostInsight(
            CreateHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateHostInsightRequest, CreateHostInsightResponse>
                    handler);

    /**
     * Create a news report in Ops Insights. The report will be enabled in Ops Insights. Insights
     * will be emailed as per selected frequency.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateNewsReportResponse> createNewsReport(
            CreateNewsReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateNewsReportRequest, CreateNewsReportResponse>
                    handler);

    /**
     * Create a private endpoint resource for the tenant in Ops Insights. This resource will be
     * created in customer compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperationsInsightsPrivateEndpointResponse>
            createOperationsInsightsPrivateEndpoint(
                    CreateOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsPrivateEndpointRequest,
                                    CreateOperationsInsightsPrivateEndpointResponse>
                            handler);

    /**
     * Create a Ops Insights Warehouse resource for the tenant in Ops Insights. New ADW will be
     * provisioned for this tenant. There is only expected to be 1 warehouse per tenant. The
     * warehouse is expected to be in the root compartment. If the 'opsi-warehouse-type' header is
     * passed to the API, a warehouse resource without ADW or Schema provisioning is created.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperationsInsightsWarehouseResponse>
            createOperationsInsightsWarehouse(
                    CreateOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsWarehouseRequest,
                                    CreateOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Create a Operations Insights Warehouse user resource for the tenant in Operations Insights.
     * This resource will be created in root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperationsInsightsWarehouseUserResponse>
            createOperationsInsightsWarehouseUser(
                    CreateOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsWarehouseUserRequest,
                                    CreateOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Create an OPSI configuration resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateOpsiConfigurationResponse> createOpsiConfiguration(
            CreateOpsiConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateOpsiConfigurationRequest, CreateOpsiConfigurationResponse>
                    handler);

    /**
     * Deletes an AWR hub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAwrHubResponse> deleteAwrHub(
            DeleteAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAwrHubRequest, DeleteAwrHubResponse>
                    handler);

    /**
     * Deletes an Awr Hub object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAwrHubObjectResponse> deleteAwrHubObject(
            DeleteAwrHubObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAwrHubObjectRequest, DeleteAwrHubObjectResponse>
                    handler);

    /**
     * Deletes an Awr Hub source object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAwrHubSourceResponse> deleteAwrHubSource(
            DeleteAwrHubSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAwrHubSourceRequest, DeleteAwrHubSourceResponse>
                    handler);

    /**
     * Deletes a database insight. The database insight will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseInsightResponse> deleteDatabaseInsight(
            DeleteDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>
                    handler);

    /**
     * Deletes an Operations Insights Enterprise Manager bridge. If any database insight is still
     * referencing this bridge, the operation will fail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEnterpriseManagerBridgeResponse>
            deleteEnterpriseManagerBridge(
                    DeleteEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteEnterpriseManagerBridgeRequest,
                                    DeleteEnterpriseManagerBridgeResponse>
                            handler);

    /**
     * Deletes an Exadata insight. The Exadata insight will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExadataInsightResponse> deleteExadataInsight(
            DeleteExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExadataInsightRequest, DeleteExadataInsightResponse>
                    handler);

    /**
     * Deletes a host insight. The host insight will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostInsightResponse> deleteHostInsight(
            DeleteHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostInsightRequest, DeleteHostInsightResponse>
                    handler);

    /**
     * Deletes a news report. The news report will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteNewsReportResponse> deleteNewsReport(
            DeleteNewsReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteNewsReportRequest, DeleteNewsReportResponse>
                    handler);

    /**
     * Deletes a private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperationsInsightsPrivateEndpointResponse>
            deleteOperationsInsightsPrivateEndpoint(
                    DeleteOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsPrivateEndpointRequest,
                                    DeleteOperationsInsightsPrivateEndpointResponse>
                            handler);

    /**
     * Deletes an Operations Insights Warehouse. There is only expected to be 1 warehouse per
     * tenant. The warehouse is expected to be in the root compartment. User must delete AWR Hub
     * resource for this warehouse before calling this operation. User must delete the warehouse
     * users before calling this operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperationsInsightsWarehouseResponse>
            deleteOperationsInsightsWarehouse(
                    DeleteOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsWarehouseRequest,
                                    DeleteOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Deletes an Operations Insights Warehouse User.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperationsInsightsWarehouseUserResponse>
            deleteOperationsInsightsWarehouseUser(
                    DeleteOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsWarehouseUserRequest,
                                    DeleteOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Deletes an OPSI configuration resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOpsiConfigurationResponse> deleteOpsiConfiguration(
            DeleteOpsiConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteOpsiConfigurationRequest, DeleteOpsiConfigurationResponse>
                    handler);

    /**
     * Disable advanced features for an Autonomous Database in Operations Insights. The connection
     * detail and advanced features will be removed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableAutonomousDatabaseInsightAdvancedFeaturesResponse>
            disableAutonomousDatabaseInsightAdvancedFeatures(
                    DisableAutonomousDatabaseInsightAdvancedFeaturesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableAutonomousDatabaseInsightAdvancedFeaturesRequest,
                                    DisableAutonomousDatabaseInsightAdvancedFeaturesResponse>
                            handler);

    /**
     * Disables a Awr Hub source database in Operations Insights. This will stop the Awr data flow
     * for the given Awr Hub source.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableAwrHubSourceResponse> disableAwrHubSource(
            DisableAwrHubSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableAwrHubSourceRequest, DisableAwrHubSourceResponse>
                    handler);

    /**
     * Disables a database in Operations Insights. Database metric collection and analysis will be
     * stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableDatabaseInsightResponse> disableDatabaseInsight(
            DisableDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>
                    handler);

    /**
     * Disables an Exadata system in Operations Insights. Exadata-related metric collection and
     * analysis will be stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExadataInsightResponse> disableExadataInsight(
            DisableExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableExadataInsightRequest, DisableExadataInsightResponse>
                    handler);

    /**
     * Disables a host in Ops Insights. Host metric collection and analysis will be stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableHostInsightResponse> disableHostInsight(
            DisableHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableHostInsightRequest, DisableHostInsightResponse>
                    handler);

    /**
     * Download the ADW wallet for Operations Insights Warehouse using which the Hub data is
     * exposed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DownloadOperationsInsightsWarehouseWalletResponse>
            downloadOperationsInsightsWarehouseWallet(
                    DownloadOperationsInsightsWarehouseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadOperationsInsightsWarehouseWalletRequest,
                                    DownloadOperationsInsightsWarehouseWalletResponse>
                            handler);

    /**
     * Enables advanced features for an Autonomous Database in Operations Insights. A direct
     * connection will be available for further collection.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableAutonomousDatabaseInsightAdvancedFeaturesResponse>
            enableAutonomousDatabaseInsightAdvancedFeatures(
                    EnableAutonomousDatabaseInsightAdvancedFeaturesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableAutonomousDatabaseInsightAdvancedFeaturesRequest,
                                    EnableAutonomousDatabaseInsightAdvancedFeaturesResponse>
                            handler);

    /**
     * Enables a Awr Hub source database in Operations Insights. This will resume the Awr data flow
     * for the given Awr Hub source if it was stopped earlier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableAwrHubSourceResponse> enableAwrHubSource(
            EnableAwrHubSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableAwrHubSourceRequest, EnableAwrHubSourceResponse>
                    handler);

    /**
     * Enables a database in Operations Insights. Database metric collection and analysis will be
     * started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableDatabaseInsightResponse> enableDatabaseInsight(
            EnableDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>
                    handler);

    /**
     * Enables an Exadata system in Operations Insights. Exadata-related metric collection and
     * analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableExadataInsightResponse> enableExadataInsight(
            EnableExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableExadataInsightRequest, EnableExadataInsightResponse>
                    handler);

    /**
     * Enables a host in Ops Insights. Host metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableHostInsightResponse> enableHostInsight(
            EnableHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableHostInsightRequest, EnableHostInsightResponse>
                    handler);

    /**
     * Gets the AWR report for the specified database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrDatabaseReportResponse> getAwrDatabaseReport(
            GetAwrDatabaseReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDatabaseReportRequest, GetAwrDatabaseReportResponse>
                    handler);

    /**
     * Gets the SQL health check report for one SQL of the specified database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrDatabaseSqlReportResponse> getAwrDatabaseSqlReport(
            GetAwrDatabaseSqlReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAwrDatabaseSqlReportRequest, GetAwrDatabaseSqlReportResponse>
                    handler);

    /**
     * Gets details of an AWR hub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrHubResponse> getAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrHubRequest, GetAwrHubResponse> handler);

    /**
     * Gets the Awr Hub object metadata and body.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrHubObjectResponse> getAwrHubObject(
            GetAwrHubObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrHubObjectRequest, GetAwrHubObjectResponse>
                    handler);

    /**
     * Gets the Awr Hub source object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrHubSourceResponse> getAwrHubSource(
            GetAwrHubSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrHubSourceRequest, GetAwrHubSourceResponse>
                    handler);

    /**
     * Gets the AWR report for the specified source database in the AWR hub. The difference between
     * the timeGreaterThanOrEqualTo and timeLessThanOrEqualTo should not be greater than 7 days.
     * Either beginSnapshotIdentifierGreaterThanOrEqualTo & endSnapshotIdentifierLessThanOrEqualTo
     * params Or timeGreaterThanOrEqualTo & timeLessThanOrEqualTo params are required.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrReportResponse> getAwrReport(
            GetAwrReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrReportRequest, GetAwrReportResponse>
                    handler);

    /**
     * Gets details of a database insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseInsightResponse> getDatabaseInsight(
            GetDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseInsightRequest, GetDatabaseInsightResponse>
                    handler);

    /**
     * Gets details of an Operations Insights Enterprise Manager bridge.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetEnterpriseManagerBridgeResponse> getEnterpriseManagerBridge(
            GetEnterpriseManagerBridgeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
                    handler);

    /**
     * Gets details of an Exadata insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExadataInsightResponse> getExadataInsight(
            GetExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExadataInsightRequest, GetExadataInsightResponse>
                    handler);

    /**
     * Gets details of a host insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetHostInsightResponse> getHostInsight(
            GetHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHostInsightRequest, GetHostInsightResponse>
                    handler);

    /**
     * Gets details of a news report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetNewsReportResponse> getNewsReport(
            GetNewsReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetNewsReportRequest, GetNewsReportResponse>
                    handler);

    /**
     * Gets the details of the specified private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOperationsInsightsPrivateEndpointResponse>
            getOperationsInsightsPrivateEndpoint(
                    GetOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsPrivateEndpointRequest,
                                    GetOperationsInsightsPrivateEndpointResponse>
                            handler);

    /**
     * Gets details of an Ops Insights Warehouse. There is only expected to be 1 warehouse per
     * tenant. The warehouse is expected to be in the root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOperationsInsightsWarehouseResponse>
            getOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsWarehouseRequest,
                                    GetOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Gets details of an Operations Insights Warehouse User.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOperationsInsightsWarehouseUserResponse>
            getOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsWarehouseUserRequest,
                                    GetOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Gets details of an OPSI configuration resource. Values specified in configItemField and
     * configItemCustomStatus query params will be considered, only if configItems field is
     * requested as part of opsiConfigField query param. Values specified in configItemCustomStatus
     * will determine whether only customized configuration items or only non-customized
     * configuration items or both have to be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOpsiConfigurationResponse> getOpsiConfiguration(
            GetOpsiConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOpsiConfigurationRequest, GetOpsiConfigurationResponse>
                    handler);

    /**
     * Gets details of an OPSI data object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetOpsiDataObjectResponse> getOpsiDataObject(
            GetOpsiDataObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetOpsiDataObjectRequest, GetOpsiDataObjectResponse>
                    handler);

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
     * Gets the Awr Hub object's user-defined metadata and entity tag (ETag).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<HeadAwrHubObjectResponse> headAwrHubObject(
            HeadAwrHubObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<HeadAwrHubObjectRequest, HeadAwrHubObjectResponse>
                    handler);

    /**
     * This endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestAddmReportsResponse> ingestAddmReports(
            IngestAddmReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestAddmReportsRequest, IngestAddmReportsResponse>
                    handler);

    /**
     * This is a generic ingest endpoint for all database configuration metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestDatabaseConfigurationResponse> ingestDatabaseConfiguration(
            IngestDatabaseConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestDatabaseConfigurationRequest, IngestDatabaseConfigurationResponse>
                    handler);

    /**
     * This is a generic ingest endpoint for all the host configuration metrics
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestHostConfigurationResponse> ingestHostConfiguration(
            IngestHostConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestHostConfigurationRequest, IngestHostConfigurationResponse>
                    handler);

    /**
     * This is a generic ingest endpoint for all the host performance metrics
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestHostMetricsResponse> ingestHostMetrics(
            IngestHostMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestHostMetricsRequest, IngestHostMetricsResponse>
                    handler);

    /**
     * The MySql SQL Stats endpoint takes in a JSON payload, persists it in Ops Insights ingest
     * pipeline. Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestMySqlSqlStatsResponse> ingestMySqlSqlStats(
            IngestMySqlSqlStatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestMySqlSqlStatsRequest, IngestMySqlSqlStatsResponse>
                    handler);

    /**
     * The SqlText endpoint takes in a JSON payload, persists it in Operation Insights ingest
     * pipeline. Either databaseId or id must be specified. Disclaimer: SQL text being uploaded
     * explicitly via APIs is already masked. All sensitive literals contained in the sqlFullText
     * column are masked prior to ingestion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestMySqlSqlTextResponse> ingestMySqlSqlText(
            IngestMySqlSqlTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestMySqlSqlTextRequest, IngestMySqlSqlTextResponse>
                    handler);

    /**
     * The sqlbucket endpoint takes in a JSON payload, persists it in Ops Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlBucketResponse> ingestSqlBucket(
            IngestSqlBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<IngestSqlBucketRequest, IngestSqlBucketResponse>
                    handler);

    /**
     * The SqlPlanLines endpoint takes in a JSON payload, persists it in Operation Insights ingest
     * pipeline. Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlPlanLinesResponse> ingestSqlPlanLines(
            IngestSqlPlanLinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>
                    handler);

    /**
     * The SQL Stats endpoint takes in a JSON payload, persists it in Ops Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlStatsResponse> ingestSqlStats(
            IngestSqlStatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<IngestSqlStatsRequest, IngestSqlStatsResponse>
                    handler);

    /**
     * The SqlText endpoint takes in a JSON payload, persists it in Operation Insights ingest
     * pipeline. Either databaseId or id must be specified. Disclaimer: SQL text being uploaded
     * explicitly via APIs is not masked. Any sensitive literals contained in the sqlFullText column
     * should be masked prior to ingestion.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlTextResponse> ingestSqlText(
            IngestSqlTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<IngestSqlTextRequest, IngestSqlTextResponse>
                    handler);

    /**
     * Gets list of ADDM finding categories.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddmDbFindingCategoriesResponse> listAddmDbFindingCategories(
            ListAddmDbFindingCategoriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAddmDbFindingCategoriesRequest, ListAddmDbFindingCategoriesResponse>
                    handler);

    /**
     * Get the ADDM findings time series for the specified databases for a given time period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddmDbFindingsTimeSeriesResponse> listAddmDbFindingsTimeSeries(
            ListAddmDbFindingsTimeSeriesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAddmDbFindingsTimeSeriesRequest,
                            ListAddmDbFindingsTimeSeriesResponse>
                    handler);

    /**
     * Gets list of ADDM database parameter categories for the specified databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddmDbParameterCategoriesResponse>
            listAddmDbParameterCategories(
                    ListAddmDbParameterCategoriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbParameterCategoriesRequest,
                                    ListAddmDbParameterCategoriesResponse>
                            handler);

    /**
     * Gets list of ADDM recommendation categories for the specified databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddmDbRecommendationCategoriesResponse>
            listAddmDbRecommendationCategories(
                    ListAddmDbRecommendationCategoriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbRecommendationCategoriesRequest,
                                    ListAddmDbRecommendationCategoriesResponse>
                            handler);

    /**
     * Gets time series data for ADDM recommendations for the specified databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddmDbRecommendationsTimeSeriesResponse>
            listAddmDbRecommendationsTimeSeries(
                    ListAddmDbRecommendationsTimeSeriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAddmDbRecommendationsTimeSeriesRequest,
                                    ListAddmDbRecommendationsTimeSeriesResponse>
                            handler);

    /**
     * Gets a list of ADDM database information
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAddmDbsResponse> listAddmDbs(
            ListAddmDbsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAddmDbsRequest, ListAddmDbsResponse> handler);

    /**
     * Lists AWR snapshots for the specified database in the AWR.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrDatabaseSnapshotsResponse> listAwrDatabaseSnapshots(
            ListAwrDatabaseSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAwrDatabaseSnapshotsRequest, ListAwrDatabaseSnapshotsResponse>
                    handler);

    /**
     * Gets the list of databases and their snapshot summary details available in the AWRHub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrDatabasesResponse> listAwrDatabases(
            ListAwrDatabasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAwrDatabasesRequest, ListAwrDatabasesResponse>
                    handler);

    /**
     * Gets a list of Awr Hub objects. Awr Hub id needs to specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrHubObjectsResponse> listAwrHubObjects(
            ListAwrHubObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAwrHubObjectsRequest, ListAwrHubObjectsResponse>
                    handler);

    /**
     * Gets a list of Awr Hub source objects.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrHubSourcesResponse> listAwrHubSources(
            ListAwrHubSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAwrHubSourcesRequest, ListAwrHubSourcesResponse>
                    handler);

    /**
     * Gets a list of AWR hubs. Either compartmentId or id must be specified. All these resources
     * are expected to be in root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrHubsResponse> listAwrHubs(
            ListAwrHubsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAwrHubsRequest, ListAwrHubsResponse> handler);

    /**
     * Lists AWR snapshots for the specified source database in the AWR hub. The difference between
     * the timeGreaterThanOrEqualTo and timeLessThanOrEqualTo should not exceed an elapsed range of
     * 1 day. The timeGreaterThanOrEqualTo & timeLessThanOrEqualTo params are optional. If these
     * params are not provided, by default last 1 day snapshots will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrSnapshotsResponse> listAwrSnapshots(
            ListAwrSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAwrSnapshotsRequest, ListAwrSnapshotsResponse>
                    handler);

    /**
     * Gets a list of database insight configurations based on the query parameters specified.
     * Either compartmentId or databaseInsightId query parameter must be specified. When both
     * compartmentId and compartmentIdInSubtree are specified, a list of database insight
     * configurations in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseConfigurationsResponse> listDatabaseConfigurations(
            ListDatabaseConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseConfigurationsRequest, ListDatabaseConfigurationsResponse>
                    handler);

    /**
     * Gets a list of database insights based on the query parameters specified. Either
     * compartmentId or id query parameter must be specified. When both compartmentId and
     * compartmentIdInSubtree are specified, a list of database insights in that compartment and in
     * all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseInsightsResponse> listDatabaseInsights(
            ListDatabaseInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>
                    handler);

    /**
     * Gets a list of Ops Insights Enterprise Manager bridges. Either compartmentId or id must be
     * specified. When both compartmentId and compartmentIdInSubtree are specified, a list of
     * bridges in that compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListEnterpriseManagerBridgesResponse> listEnterpriseManagerBridges(
            ListEnterpriseManagerBridgesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEnterpriseManagerBridgesRequest,
                            ListEnterpriseManagerBridgesResponse>
                    handler);

    /**
     * Gets a list of exadata insight configurations. Either compartmentId or exadataInsightsId
     * query parameter must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExadataConfigurationsResponse> listExadataConfigurations(
            ListExadataConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadataConfigurationsRequest, ListExadataConfigurationsResponse>
                    handler);

    /**
     * Gets a list of Exadata insights based on the query parameters specified. Either compartmentId
     * or id query parameter must be specified. When both compartmentId and compartmentIdInSubtree
     * are specified, a list of Exadata insights in that compartment and in all sub-compartments
     * will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListExadataInsightsResponse> listExadataInsights(
            ListExadataInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadataInsightsRequest, ListExadataInsightsResponse>
                    handler);

    /**
     * Gets a list of host insight configurations based on the query parameters specified. Either
     * compartmentId or hostInsightId query parameter must be specified. When both compartmentId and
     * compartmentIdInSubtree are specified, a list of host insight configurations in that
     * compartment and in all sub-compartments will be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHostConfigurationsResponse> listHostConfigurations(
            ListHostConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHostConfigurationsRequest, ListHostConfigurationsResponse>
                    handler);

    /**
     * Gets a list of host insights based on the query parameters specified. Either compartmentId or
     * id query parameter must be specified. When both compartmentId and compartmentIdInSubtree are
     * specified, a list of host insights in that compartment and in all sub-compartments will be
     * returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHostInsightsResponse> listHostInsights(
            ListHostInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListHostInsightsRequest, ListHostInsightsResponse>
                    handler);

    /**
     * Get a list of hosted entities details.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListHostedEntitiesResponse> listHostedEntities(
            ListHostedEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHostedEntitiesRequest, ListHostedEntitiesResponse>
                    handler);

    /**
     * Gets a list of agent entities available to add a new hostInsight. An agent entity is
     * \"available\" and will be shown if all the following conditions are true: 1. The agent OCID
     * is not already being used for an existing hostInsight. 2. The agent availabilityStatus =
     * 'ACTIVE' 3. The agent lifecycleState = 'ACTIVE'
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListImportableAgentEntitiesResponse> listImportableAgentEntities(
            ListImportableAgentEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListImportableAgentEntitiesRequest, ListImportableAgentEntitiesResponse>
                    handler);

    /**
     * Gets a list of available compute intances running cloud agent to add a new hostInsight. An
     * Compute entity is \"available\" and will be shown if all the following conditions are true:
     * 1. Compute is running OCA 2. OCI Management Agent is not enabled or If OCI Management Agent
     * is enabled 2.1 The agent OCID is not already being used for an existing hostInsight. 2.2 The
     * agent availabilityStatus = 'ACTIVE' 2.3 The agent lifecycleState = 'ACTIVE'
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListImportableComputeEntitiesResponse>
            listImportableComputeEntities(
                    ListImportableComputeEntitiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableComputeEntitiesRequest,
                                    ListImportableComputeEntitiesResponse>
                            handler);

    /**
     * Gets a list of importable entities for an Operations Insights Enterprise Manager bridge that
     * have not been imported before.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListImportableEnterpriseManagerEntitiesResponse>
            listImportableEnterpriseManagerEntities(
                    ListImportableEnterpriseManagerEntitiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableEnterpriseManagerEntitiesRequest,
                                    ListImportableEnterpriseManagerEntitiesResponse>
                            handler);

    /**
     * Gets a list of news reports based on the query parameters specified. Either compartmentId or
     * id query parameter must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListNewsReportsResponse> listNewsReports(
            ListNewsReportsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNewsReportsRequest, ListNewsReportsResponse>
                    handler);

    /**
     * Gets a list of Operation Insights private endpoints.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOperationsInsightsPrivateEndpointsResponse>
            listOperationsInsightsPrivateEndpoints(
                    ListOperationsInsightsPrivateEndpointsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsPrivateEndpointsRequest,
                                    ListOperationsInsightsPrivateEndpointsResponse>
                            handler);

    /**
     * Gets a list of Operations Insights Warehouse users. Either compartmentId or id must be
     * specified. All these resources are expected to be in root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOperationsInsightsWarehouseUsersResponse>
            listOperationsInsightsWarehouseUsers(
                    ListOperationsInsightsWarehouseUsersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsWarehouseUsersRequest,
                                    ListOperationsInsightsWarehouseUsersResponse>
                            handler);

    /**
     * Gets a list of Ops Insights warehouses. Either compartmentId or id must be specified. There
     * is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOperationsInsightsWarehousesResponse>
            listOperationsInsightsWarehouses(
                    ListOperationsInsightsWarehousesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsWarehousesRequest,
                                    ListOperationsInsightsWarehousesResponse>
                            handler);

    /**
     * Gets a list of OPSI configuration resources based on the query parameters specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOpsiConfigurationsResponse> listOpsiConfigurations(
            ListOpsiConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOpsiConfigurationsRequest, ListOpsiConfigurationsResponse>
                    handler);

    /**
     * Gets a list of OPSI data objects based on the query parameters specified. CompartmentId id
     * query parameter must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListOpsiDataObjectsResponse> listOpsiDataObjects(
            ListOpsiDataObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListOpsiDataObjectsRequest, ListOpsiDataObjectsResponse>
                    handler);

    /**
     * Query SQL Warehouse to list the plan xml for a given SQL execution plan. This returns a
     * SqlPlanCollection object, but is currently limited to a single plan. Either databaseId or id
     * must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlPlansResponse> listSqlPlans(
            ListSqlPlansRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlPlansRequest, ListSqlPlansResponse>
                    handler);

    /**
     * Search SQL by SQL Identifier across databases in a compartment and in all sub-compartments if
     * specified. And get the SQL Text and the details of the databases executing the SQL for a
     * given time period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlSearchesResponse> listSqlSearches(
            ListSqlSearchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlSearchesRequest, ListSqlSearchesResponse>
                    handler);

    /**
     * Query SQL Warehouse to get the full SQL Text for a SQL in a compartment and in all
     * sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTextsResponse> listSqlTexts(
            ListSqlTextsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlTextsRequest, ListSqlTextsResponse>
                    handler);

    /**
     * Gets a list of Warehouse data objects (e.g: views, tables), based on the query parameters
     * specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWarehouseDataObjectsResponse> listWarehouseDataObjects(
            ListWarehouseDataObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWarehouseDataObjectsRequest, ListWarehouseDataObjectsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
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
     * Return a (paginated) list of logs for a given work request.
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
     * Lists the work requests in a compartment. Either compartmentId or id must be specified. Only
     * one of id, resourceId or relatedResourceId can be specified optionally.
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
     * Creates a new object or overwrites an existing object with the same name to the Awr Hub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PutAwrHubObjectResponse> putAwrHubObject(
            PutAwrHubObjectRequest request,
            com.oracle.bmc.responses.AsyncHandler<PutAwrHubObjectRequest, PutAwrHubObjectResponse>
                    handler);

    /**
     * Queries an OPSI data object with the inputs provided and sends the result set back. Either
     * analysisTimeInterval or timeIntervalStart and timeIntervalEnd parameters need to be passed as
     * well.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<QueryOpsiDataObjectDataResponse> queryOpsiDataObjectData(
            QueryOpsiDataObjectDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            QueryOpsiDataObjectDataRequest, QueryOpsiDataObjectDataResponse>
                    handler);

    /**
     * Queries Warehouse data objects (e.g: views, tables) with the inputs provided and sends the
     * result set back. Any data to which an OperationsInsightsWarehouseUser with a permission to
     * the corresponding Warehouse can be queried.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<QueryWarehouseDataObjectDataResponse> queryWarehouseDataObjectData(
            QueryWarehouseDataObjectDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            QueryWarehouseDataObjectDataRequest,
                            QueryWarehouseDataObjectDataResponse>
                    handler);

    /**
     * Rotate the ADW wallet for Operations Insights Warehouse using which the Hub data is exposed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RotateOperationsInsightsWarehouseWalletResponse>
            rotateOperationsInsightsWarehouseWallet(
                    RotateOperationsInsightsWarehouseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateOperationsInsightsWarehouseWalletRequest,
                                    RotateOperationsInsightsWarehouseWalletResponse>
                            handler);

    /**
     * Summarizes ADDM findings for the specified databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAddmDbFindingsResponse> summarizeAddmDbFindings(
            SummarizeAddmDbFindingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAddmDbFindingsRequest, SummarizeAddmDbFindingsResponse>
                    handler);

    /**
     * Summarizes the AWR database parameter change history for the specified parameter. There will
     * be one element for each time that parameter changed during the specified time period. This
     * API is limited to only one parameter per request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAddmDbParameterChangesResponse>
            summarizeAddmDbParameterChanges(
                    SummarizeAddmDbParameterChangesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAddmDbParameterChangesRequest,
                                    SummarizeAddmDbParameterChangesResponse>
                            handler);

    /**
     * Summarizes database parameter history information for the specified databases. Return a list
     * of parameters with information on whether the parameter values were changed or not within the
     * specified time period. The response does not include the individual parameter changes within
     * the time period.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAddmDbParametersResponse> summarizeAddmDbParameters(
            SummarizeAddmDbParametersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAddmDbParametersRequest, SummarizeAddmDbParametersResponse>
                    handler);

    /**
     * Summarizes ADDM recommendations for the specified databases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAddmDbRecommendationsResponse>
            summarizeAddmDbRecommendations(
                    SummarizeAddmDbRecommendationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAddmDbRecommendationsRequest,
                                    SummarizeAddmDbRecommendationsResponse>
                            handler);

    /**
     * Summarizes Schema objects for the specified databases for the specified objectIdentifiers
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAddmDbSchemaObjectsResponse> summarizeAddmDbSchemaObjects(
            SummarizeAddmDbSchemaObjectsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAddmDbSchemaObjectsRequest,
                            SummarizeAddmDbSchemaObjectsResponse>
                    handler);

    /**
     * Summarizes SQL Statements for the specified databases for the specified sqlIdentifiers
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAddmDbSqlStatementsResponse> summarizeAddmDbSqlStatements(
            SummarizeAddmDbSqlStatementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAddmDbSqlStatementsRequest,
                            SummarizeAddmDbSqlStatementsResponse>
                    handler);

    /**
     * Summarizes the AWR CPU resource limits and metrics for the specified database in AWR. Based
     * on the time range provided as part of query param, the metrics points will be returned in the
     * response as below. - if time range is <=7 days then the metrics points will be for every
     * MINUTES - if time range is <=2 hours then the metrics points will be for every 10 SECONDS -
     * if time range is >7 days then the metrics points will be for every HOUR.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseCpuUsagesResponse>
            summarizeAwrDatabaseCpuUsages(
                    SummarizeAwrDatabaseCpuUsagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseCpuUsagesRequest,
                                    SummarizeAwrDatabaseCpuUsagesResponse>
                            handler);

    /**
     * Summarizes the metric samples for the specified database in the AWR. The metric samples are
     * summarized based on the Time dimension for each metric.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseMetricsResponse> summarizeAwrDatabaseMetrics(
            SummarizeAwrDatabaseMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDatabaseMetricsRequest, SummarizeAwrDatabaseMetricsResponse>
                    handler);

    /**
     * Summarizes the database parameter change history for one database parameter of the specified
     * database in AWR. One change history record contains the previous value, the changed value,
     * and the corresponding time range. If the database parameter value was changed multiple times
     * within the time range, then multiple change history records are created for the same
     * parameter. Note that this API only returns information on change history details for one
     * database parameter. To get a list of all the database parameters whose values were changed
     * during a specified time range, use the following API endpoint:
     * /awrHubs/{awrHubId}/awrDbParameters?awrSourceDatabaseIdentifier={awrSourceDbId}
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseParameterChangesResponse>
            summarizeAwrDatabaseParameterChanges(
                    SummarizeAwrDatabaseParameterChangesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseParameterChangesRequest,
                                    SummarizeAwrDatabaseParameterChangesResponse>
                            handler);

    /**
     * Summarizes the database parameter history for the specified database in AWR. This includes
     * the list of database parameters, with information on whether the parameter values were
     * modified within the query time range. Note that each database parameter is only listed once.
     * Depending on the optional query parameters, the returned summary gets all the database
     * parameters, which include:
     *
     * <p>Queryparam (valueChanged =\"Y\") - Each parameter whose value was changed during the time
     * range, \"isChanged : true\" in response for the DB params. Queryparam (valueChanged =\"N\") -
     * Each parameter whose value was unchanged during the time range, \"isChanged : false\" in
     * response for the DB params. Queryparam (valueChanged =\"Y\" and valueModified =
     * \"SYSTEM_MOD\") - Each parameter whose value was changed at the system level during the time
     * range, \"isChanged : true\" & \"valueModified : SYSTEM_MOD\" in response for the DB params.
     * Queryparam (valueChanged =\"N\" and valueDefault = \"FALSE\") - Each parameter whose value
     * was unchanged during the time range, however, the value is not the default value, \"isChanged
     * : true\" & \"isDefault : false\" in response for the DB params.
     *
     * <p>Note that this API does not return information on the number of times each database
     * parameter has been changed within the time range. To get the database parameter value change
     * history for a specific parameter, use the following API endpoint:
     * /awrHubs/{awrHubId}/awrDbParameterChanges?awrSourceDatabaseIdentifier={awrSourceDbId}
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseParametersResponse>
            summarizeAwrDatabaseParameters(
                    SummarizeAwrDatabaseParametersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseParametersRequest,
                                    SummarizeAwrDatabaseParametersResponse>
                            handler);

    /**
     * Summarizes the AWR snapshot ranges that contain continuous snapshots, for the specified
     * AWRHub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseSnapshotRangesResponse>
            summarizeAwrDatabaseSnapshotRanges(
                    SummarizeAwrDatabaseSnapshotRangesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseSnapshotRangesRequest,
                                    SummarizeAwrDatabaseSnapshotRangesResponse>
                            handler);

    /**
     * Summarizes the AWR SYSSTAT sample data for the specified database in AWR. The statistical
     * data is summarized based on the Time dimension for each statistic.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseSysstatsResponse> summarizeAwrDatabaseSysstats(
            SummarizeAwrDatabaseSysstatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrDatabaseSysstatsRequest,
                            SummarizeAwrDatabaseSysstatsResponse>
                    handler);

    /**
     * Summarizes the AWR top wait events.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseTopWaitEventsResponse>
            summarizeAwrDatabaseTopWaitEvents(
                    SummarizeAwrDatabaseTopWaitEventsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseTopWaitEventsRequest,
                                    SummarizeAwrDatabaseTopWaitEventsResponse>
                            handler);

    /**
     * Summarizes AWR wait event data into value buckets and frequency, for the specified database
     * in the AWR.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseWaitEventBucketsResponse>
            summarizeAwrDatabaseWaitEventBuckets(
                    SummarizeAwrDatabaseWaitEventBucketsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseWaitEventBucketsRequest,
                                    SummarizeAwrDatabaseWaitEventBucketsResponse>
                            handler);

    /**
     * Summarizes the AWR wait event sample data for the specified database in the AWR. The event
     * data is summarized based on the Time dimension for each event.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrDatabaseWaitEventsResponse>
            summarizeAwrDatabaseWaitEvents(
                    SummarizeAwrDatabaseWaitEventsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeAwrDatabaseWaitEventsRequest,
                                    SummarizeAwrDatabaseWaitEventsResponse>
                            handler);

    /**
     * Gets a list of summary of AWR Sources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrSourcesSummariesResponse> summarizeAwrSourcesSummaries(
            SummarizeAwrSourcesSummariesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrSourcesSummariesRequest,
                            SummarizeAwrSourcesSummariesResponse>
                    handler);

    /**
     * Gets the applicable configuration items based on the query parameters specified.
     * Configuration items for an opsiConfigType with respect to a compartmentId can be fetched.
     * Values specified in configItemField param will determine what fields for each configuration
     * items have to be returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeConfigurationItemsResponse> summarizeConfigurationItems(
            SummarizeConfigurationItemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeConfigurationItemsRequest, SummarizeConfigurationItemsResponse>
                    handler);

    /**
     * Returns response with time series data (endTimestamp, capacity, baseCapacity) for the time
     * period specified. The maximum time range for analysis is 2 years, hence this is intentionally
     * not paginated. If compartmentIdInSubtree is specified, aggregates resources in a compartment
     * and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceCapacityTrendResponse>
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceCapacityTrendRequest,
                                    SummarizeDatabaseInsightResourceCapacityTrendResponse>
                            handler);

    /**
     * Get Forecast predictions for CPU and Storage resources since a time in the past. If
     * compartmentIdInSubtree is specified, aggregates resources in a compartment and in all
     * sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceForecastTrendResponse>
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceForecastTrendRequest,
                                    SummarizeDatabaseInsightResourceForecastTrendResponse>
                            handler);

    /**
     * Lists the Resource statistics (usage,capacity, usage change percent, utilization percent,
     * base capacity, isAutoScalingEnabled) for each database filtered by utilization level in a
     * compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceStatisticsResponse>
            summarizeDatabaseInsightResourceStatistics(
                    SummarizeDatabaseInsightResourceStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceStatisticsRequest,
                                    SummarizeDatabaseInsightResourceStatisticsResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within
     * the specified time period. For each database, the minimum data point with a ranking > the
     * percentile value is included in the summation. Linear regression functions are used to
     * calculate the usage change percentage. If compartmentIdInSubtree is specified, aggregates
     * resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageResponse>
            summarizeDatabaseInsightResourceUsage(
                    SummarizeDatabaseInsightResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageRequest,
                                    SummarizeDatabaseInsightResourceUsageResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period
     * specified. The maximum time range for analysis is 2 years, hence this is intentionally not
     * paginated. If compartmentIdInSubtree is specified, aggregates resources in a compartment and
     * in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageTrendResponse>
            summarizeDatabaseInsightResourceUsageTrend(
                    SummarizeDatabaseInsightResourceUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageTrendRequest,
                                    SummarizeDatabaseInsightResourceUsageTrendResponse>
                            handler);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and
     * low) for a resource type over specified time period. If compartmentIdInSubtree is specified,
     * aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceUtilizationInsightResponse>
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                                    SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                            handler);

    /**
     * Returns response with usage time series data (endTimestamp, usage, capacity) with breakdown
     * by tablespaceName for the time period specified. The maximum time range for analysis is 2
     * years, hence this is intentionally not paginated. Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightTablespaceUsageTrendResponse>
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                                    SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified
     * for an exadata system for a resource metric. Additionally resources can be filtered using
     * databaseInsightId, hostInsightId or storageServerName query parameters. Top five resources
     * are returned if total exceeds the limit specified. Valid values for ResourceType DATABASE are
     * CPU,MEMORY,IO and STORAGE. Database name is returned in name field. DatabaseInsightId,
     * cdbName and hostName query parameter applies to ResourceType DATABASE. Valid values for
     * ResourceType HOST are CPU and MEMORY. HostName is returned in name field. HostInsightId and
     * hostName query parameter applies to ResourceType HOST. Valid values for ResourceType
     * STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT. Storage server name is returned in name
     * field for resourceMetric IOPS and THROUGHPUT and asmName is returned in name field for
     * resourceMetric STORAGE. StorageServerName query parameter applies to ResourceType
     * STORAGE_SERVER. Valid values for ResourceType DISKGROUP is STORAGE. Comma delimited
     * (asmName,diskgroupName) is returned in name field.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceCapacityTrendResponse>
            summarizeExadataInsightResourceCapacityTrend(
                    SummarizeExadataInsightResourceCapacityTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceCapacityTrendRequest,
                                    SummarizeExadataInsightResourceCapacityTrendResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified
     * for an exadata system or fleet aggregation for a resource metric. The maximum time range for
     * analysis is 2 years, hence this is intentionally not paginated. Valid values for ResourceType
     * DATABASE are CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and
     * MEMORY. Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
            summarizeExadataInsightResourceCapacityTrendAggregated(
                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest,
                                    SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
                            handler);

    /**
     * Get historical usage and forecast predictions for an exadata system with breakdown by
     * databases, hosts or storage servers. Additionally resources can be filtered using
     * databaseInsightId, hostInsightId or storageServerName query parameters. Top five resources
     * are returned if total exceeds the limit specified. Valid values for ResourceType DATABASE are
     * CPU,MEMORY,IO and STORAGE. Database name is returned in name field. DatabaseInsightId ,
     * cdbName and hostName query parameter applies to ResourceType DATABASE. Valid values for
     * ResourceType HOST are CPU and MEMORY. HostName s returned in name field. HostInsightId and
     * hostName query parameter applies to ResourceType HOST. Valid values for ResourceType
     * STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT. Storage server name is returned in name
     * field for resourceMetric IOPS and THROUGHPUT and asmName is returned in name field for
     * resourceMetric STORAGE. StorageServerName query parameter applies to ResourceType
     * STORAGE_SERVER. Valid value for ResourceType DISKGROUP is STORAGE. Comma delimited
     * (asmName,diskgroupName) is returned in name field.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceForecastTrendResponse>
            summarizeExadataInsightResourceForecastTrend(
                    SummarizeExadataInsightResourceForecastTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceForecastTrendRequest,
                                    SummarizeExadataInsightResourceForecastTrendResponse>
                            handler);

    /**
     * Get aggregated historical usage and forecast predictions for resources. Either compartmentId
     * or exadataInsightsId query parameter must be specified. Valid values for ResourceType
     * DATABASE are CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and
     * MEMORY. Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
            summarizeExadataInsightResourceForecastTrendAggregated(
                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest,
                                    SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
                            handler);

    /**
     * Lists the Resource statistics (usage, capacity, usage change percent, utilization percent)
     * for each resource based on resourceMetric filtered by utilization level. Valid values for
     * ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are
     * CPU and MEMORY. Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS, THROUGHPUT.
     * Valid value for ResourceType DISKGROUP is STORAGE.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceStatisticsResponse>
            summarizeExadataInsightResourceStatistics(
                    SummarizeExadataInsightResourceStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceStatisticsRequest,
                                    SummarizeExadataInsightResourceStatisticsResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per resource within
     * the specified time period. For each resource, the minimum data point with a ranking > the
     * percentile value is included in the summation. Linear regression functions are used to
     * calculate the usage change percentage. Valid values for ResourceType DATABASE are
     * CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and MEMORY. Valid
     * values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceUsageResponse>
            summarizeExadataInsightResourceUsage(
                    SummarizeExadataInsightResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUsageRequest,
                                    SummarizeExadataInsightResourceUsageResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within
     * the specified time period. For each database, the minimum data point with a ranking > the
     * percentile value is included in the summation. Linear regression functions are used to
     * calculate the usage change percentage. Valid values for ResourceType DATABASE are
     * CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and MEMORY. Valid
     * values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceUsageAggregatedResponse>
            summarizeExadataInsightResourceUsageAggregated(
                    SummarizeExadataInsightResourceUsageAggregatedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUsageAggregatedRequest,
                                    SummarizeExadataInsightResourceUsageAggregatedResponse>
                            handler);

    /**
     * Gets current utilization, projected utilization and days to reach projectedUtilization for an
     * exadata system over specified time period. Valid values for ResourceType DATABASE are
     * CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and MEMORY. Valid
     * values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceUtilizationInsightResponse>
            summarizeExadataInsightResourceUtilizationInsight(
                    SummarizeExadataInsightResourceUtilizationInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUtilizationInsightRequest,
                                    SummarizeExadataInsightResourceUtilizationInsightResponse>
                            handler);

    /**
     * Lists the software and hardware inventory of the Exadata System.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataMembersResponse> summarizeExadataMembers(
            SummarizeExadataMembersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeExadataMembersRequest, SummarizeExadataMembersResponse>
                    handler);

    /**
     * Returns response with disk(s) statistics for a host.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightDiskStatisticsResponse>
            summarizeHostInsightDiskStatistics(
                    SummarizeHostInsightDiskStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightDiskStatisticsRequest,
                                    SummarizeHostInsightDiskStatisticsResponse>
                            handler);

    /**
     * Returns response with some recommendations if apply for a host.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightHostRecommendationResponse>
            summarizeHostInsightHostRecommendation(
                    SummarizeHostInsightHostRecommendationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightHostRecommendationRequest,
                                    SummarizeHostInsightHostRecommendationResponse>
                            handler);

    /**
     * Returns response with usage time series data with breakdown by network interface for the time
     * period specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightNetworkUsageTrendResponse>
            summarizeHostInsightNetworkUsageTrend(
                    SummarizeHostInsightNetworkUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightNetworkUsageTrendRequest,
                                    SummarizeHostInsightNetworkUsageTrendResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period
     * specified. The maximum time range for analysis is 2 years, hence this is intentionally not
     * paginated. If compartmentIdInSubtree is specified, aggregates resources in a compartment and
     * in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceCapacityTrendResponse>
            summarizeHostInsightResourceCapacityTrend(
                    SummarizeHostInsightResourceCapacityTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceCapacityTrendRequest,
                                    SummarizeHostInsightResourceCapacityTrendResponse>
                            handler);

    /**
     * Get Forecast predictions for CPU or memory resources since a time in the past. If
     * compartmentIdInSubtree is specified, aggregates resources in a compartment and in all
     * sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceForecastTrendResponse>
            summarizeHostInsightResourceForecastTrend(
                    SummarizeHostInsightResourceForecastTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceForecastTrendRequest,
                                    SummarizeHostInsightResourceForecastTrendResponse>
                            handler);

    /**
     * Lists the resource statistics (usage, capacity, usage change percent, utilization percent,
     * load) for each host filtered by utilization level in a compartment and in all
     * sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceStatisticsResponse>
            summarizeHostInsightResourceStatistics(
                    SummarizeHostInsightResourceStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceStatisticsRequest,
                                    SummarizeHostInsightResourceStatisticsResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per host within the
     * specified time period. For each host, the minimum data point with a ranking > the percentile
     * value is included in the summation. Linear regression functions are used to calculate the
     * usage change percentage. If compartmentIdInSubtree is specified, aggregates resources in a
     * compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceUsageResponse>
            summarizeHostInsightResourceUsage(
                    SummarizeHostInsightResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageRequest,
                                    SummarizeHostInsightResourceUsageResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period
     * specified. The maximum time range for analysis is 2 years, hence this is intentionally not
     * paginated. If compartmentIdInSubtree is specified, aggregates resources in a compartment and
     * in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceUsageTrendResponse>
            summarizeHostInsightResourceUsageTrend(
                    SummarizeHostInsightResourceUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageTrendRequest,
                                    SummarizeHostInsightResourceUsageTrendResponse>
                            handler);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and
     * low) for a resource type over specified time period. If compartmentIdInSubtree is specified,
     * aggregates resources in a compartment and in all sub-compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceUtilizationInsightResponse>
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUtilizationInsightRequest,
                                    SummarizeHostInsightResourceUtilizationInsightResponse>
                            handler);

    /**
     * Returns response with usage time series data with breakdown by filesystem for the time period
     * specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightStorageUsageTrendResponse>
            summarizeHostInsightStorageUsageTrend(
                    SummarizeHostInsightStorageUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightStorageUsageTrendRequest,
                                    SummarizeHostInsightStorageUsageTrendResponse>
                            handler);

    /**
     * Returns response with aggregated data (timestamp, usageData) for top processes on a specific
     * date. Data is aggregated for the time specified and processes are sorted descendent by the
     * process metric specified (CPU, MEMORY, VIRTUAL_MEMORY). hostInsightId, processMetric must be
     * specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightTopProcessesUsageResponse>
            summarizeHostInsightTopProcessesUsage(
                    SummarizeHostInsightTopProcessesUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightTopProcessesUsageRequest,
                                    SummarizeHostInsightTopProcessesUsageResponse>
                            handler);

    /**
     * Returns response with aggregated time series data (timeIntervalstart, timeIntervalEnd,
     * commandArgs, usageData) for top processes. Data is aggregated for the time period specified
     * and proceses are sorted descendent by the proces metric specified (CPU, MEMORY,
     * VIRTUAL_MEMORY). HostInsight Id and Process metric must be specified
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightTopProcessesUsageTrendResponse>
            summarizeHostInsightTopProcessesUsageTrend(
                    SummarizeHostInsightTopProcessesUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightTopProcessesUsageTrendRequest,
                                    SummarizeHostInsightTopProcessesUsageTrendResponse>
                            handler);

    /**
     * Gets the details of resources used by an Operations Insights Warehouse. There is only
     * expected to be 1 warehouse per tenant. The warehouse is expected to be in the root
     * compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeOperationsInsightsWarehouseResourceUsageResponse>
            summarizeOperationsInsightsWarehouseResourceUsage(
                    SummarizeOperationsInsightsWarehouseResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeOperationsInsightsWarehouseResourceUsageRequest,
                                    SummarizeOperationsInsightsWarehouseResourceUsageResponse>
                            handler);

    /**
     * Query SQL Warehouse to get the performance insights for SQLs taking greater than X% database
     * time for a given time period across the given databases or database types in a compartment
     * and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlInsightsResponse> summarizeSqlInsights(
            SummarizeSqlInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>
                    handler);

    /**
     * Query SQL Warehouse to get the performance insights on the execution plans for a given SQL
     * for a given time period. Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlPlanInsightsResponse> summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>
                    handler);

    /**
     * Query SQL Warehouse to summarize the response time distribution of query executions for a
     * given SQL for a given time period. Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlResponseTimeDistributionsResponse>
            summarizeSqlResponseTimeDistributions(
                    SummarizeSqlResponseTimeDistributionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlResponseTimeDistributionsRequest,
                                    SummarizeSqlResponseTimeDistributionsResponse>
                            handler);

    /**
     * Query SQL Warehouse to get the performance statistics for SQLs taking greater than X%
     * database time for a given time period across the given databases or database types in a
     * compartment and in all sub-compartments if specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlStatisticsResponse> summarizeSqlStatistics(
            SummarizeSqlStatisticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>
                    handler);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL across
     * given databases for a given time period in a compartment and in all sub-compartments if
     * specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesResponse>
            summarizeSqlStatisticsTimeSeries(
                    SummarizeSqlStatisticsTimeSeriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesRequest,
                                    SummarizeSqlStatisticsTimeSeriesResponse>
                            handler);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL by
     * execution plans for a given time period. Either databaseId or id must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesByPlanResponse>
            summarizeSqlStatisticsTimeSeriesByPlan(
                    SummarizeSqlStatisticsTimeSeriesByPlanRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                                    SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                            handler);

    /**
     * Test the connection details of a Cloud MACS-managed database.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TestMacsManagedCloudDatabaseInsightConnectionResponse>
            testMacsManagedCloudDatabaseInsightConnection(
                    TestMacsManagedCloudDatabaseInsightConnectionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    TestMacsManagedCloudDatabaseInsightConnectionRequest,
                                    TestMacsManagedCloudDatabaseInsightConnectionResponse>
                            handler);

    /**
     * Updates the configuration of a hub .
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAwrHubResponse> updateAwrHub(
            UpdateAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAwrHubRequest, UpdateAwrHubResponse>
                    handler);

    /**
     * Update Awr Hub Source object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAwrHubSourceResponse> updateAwrHubSource(
            UpdateAwrHubSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAwrHubSourceRequest, UpdateAwrHubSourceResponse>
                    handler);

    /**
     * Updates configuration of a database insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseInsightResponse> updateDatabaseInsight(
            UpdateDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>
                    handler);

    /**
     * Updates configuration of an Operations Insights Enterprise Manager bridge.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEnterpriseManagerBridgeResponse>
            updateEnterpriseManagerBridge(
                    UpdateEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateEnterpriseManagerBridgeRequest,
                                    UpdateEnterpriseManagerBridgeResponse>
                            handler);

    /**
     * Updates configuration of an Exadata insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExadataInsightResponse> updateExadataInsight(
            UpdateExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataInsightRequest, UpdateExadataInsightResponse>
                    handler);

    /**
     * Updates configuration of a host insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHostInsightResponse> updateHostInsight(
            UpdateHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostInsightRequest, UpdateHostInsightResponse>
                    handler);

    /**
     * Updates the configuration of a news report.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateNewsReportResponse> updateNewsReport(
            UpdateNewsReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateNewsReportRequest, UpdateNewsReportResponse>
                    handler);

    /**
     * Updates one or more attributes of the specified private endpoint.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperationsInsightsPrivateEndpointResponse>
            updateOperationsInsightsPrivateEndpoint(
                    UpdateOperationsInsightsPrivateEndpointRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsPrivateEndpointRequest,
                                    UpdateOperationsInsightsPrivateEndpointResponse>
                            handler);

    /**
     * Updates the configuration of an Ops Insights Warehouse. There is only expected to be 1
     * warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperationsInsightsWarehouseResponse>
            updateOperationsInsightsWarehouse(
                    UpdateOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsWarehouseRequest,
                                    UpdateOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Updates the configuration of an Operations Insights Warehouse User.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperationsInsightsWarehouseUserResponse>
            updateOperationsInsightsWarehouseUser(
                    UpdateOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsWarehouseUserRequest,
                                    UpdateOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Updates an OPSI configuration resource with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOpsiConfigurationResponse> updateOpsiConfiguration(
            UpdateOpsiConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateOpsiConfigurationRequest, UpdateOpsiConfigurationResponse>
                    handler);
}
