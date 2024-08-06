/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms;

import com.oracle.bmc.jms.requests.*;
import com.oracle.bmc.jms.responses.*;

/**
 * The APIs for the [Fleet
 * Management](https://docs.oracle.com/en-us/iaas/jms/doc/fleet-management.html) feature of Java
 * Management Service to monitor and manage the usage of Java in your enterprise. Use these APIs to
 * manage fleets, configure managed instances to report to fleets, and gain insights into the Java
 * workloads running on these instances by carrying out basic and advanced features. This service
 * client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no
 * circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public interface JavaManagementService extends AutoCloseable {

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
     * Add Java installation sites in a Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/AddFleetInstallationSitesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AddFleetInstallationSites API.
     */
    AddFleetInstallationSitesResponse addFleetInstallationSites(
            AddFleetInstallationSitesRequest request);

    /**
     * Deletes the work request specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/CancelWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CancelWorkRequest
     *     API.
     */
    CancelWorkRequestResponse cancelWorkRequest(CancelWorkRequestRequest request);

    /**
     * Move a specified Fleet into the compartment identified in the POST form. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ChangeFleetCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeFleetCompartment API.
     */
    ChangeFleetCompartmentResponse changeFleetCompartment(ChangeFleetCompartmentRequest request);

    /**
     * Add a new record to the fleet blocklist.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/CreateBlocklistExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateBlocklist
     *     API.
     */
    CreateBlocklistResponse createBlocklist(CreateBlocklistRequest request);

    /**
     * Request to perform validation of the DRS file and create the file to the Object Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/CreateDrsFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateDrsFile API.
     */
    CreateDrsFileResponse createDrsFile(CreateDrsFileRequest request);

    /**
     * Create a new Fleet using the information provided.
     *
     * <p>`inventoryLog` is now a required parameter for CreateFleet API. Update existing
     * applications using this API before July 15, 2022 to ensure the applications continue to work.
     * See the [Service Change
     * Notice](https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#JMS) for more details.
     * Migrate existing fleets using the `UpdateFleet` API to set the `inventoryLog` parameter.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/CreateFleetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateFleet API.
     */
    CreateFleetResponse createFleet(CreateFleetRequest request);

    /**
     * Registers an agent's JmsPlugin, optionally attaching to an existing fleet of the tenancy.
     * JmsPlugins registered fleet-less are created with lifecycle state INACTIVE. For the operation
     * to be authorized, the agent must exist, and the authorized user requires JMS_PLUGIN_CREATE
     * permission for the agent's compartment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/CreateJmsPluginExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateJmsPlugin
     *     API.
     */
    CreateJmsPluginResponse createJmsPlugin(CreateJmsPluginRequest request);

    /**
     * Deletes the blocklist record specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeleteBlocklistExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteBlocklist
     *     API.
     */
    DeleteBlocklistResponse deleteBlocklist(DeleteBlocklistRequest request);

    /**
     * Deletes the metadata for the result of a Crypto event analysis. The actual report shall
     * remain in the object storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeleteCryptoAnalysisResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteCryptoAnalysisResult API.
     */
    DeleteCryptoAnalysisResultResponse deleteCryptoAnalysisResult(
            DeleteCryptoAnalysisResultRequest request);

    /**
     * Request to delete the DRS file from the Object Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeleteDrsFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteDrsFile API.
     */
    DeleteDrsFileResponse deleteDrsFile(DeleteDrsFileRequest request);

    /**
     * Deletes the Fleet specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeleteFleetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteFleet API.
     */
    DeleteFleetResponse deleteFleet(DeleteFleetRequest request);

    /**
     * Delete the Java migration analysis result. The actual report will remain in the Object
     * Storage bucket.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeleteJavaMigrationAnalysisResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteJavaMigrationAnalysisResult API.
     */
    DeleteJavaMigrationAnalysisResultResponse deleteJavaMigrationAnalysisResult(
            DeleteJavaMigrationAnalysisResultRequest request);

    /**
     * Deletes a JmsPlugin. The JmsPlugin may be visible for some time with state DELETED. Deleted
     * plugins will not be able to communicate with the JMS service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeleteJmsPluginExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteJmsPlugin
     *     API.
     */
    DeleteJmsPluginResponse deleteJmsPlugin(DeleteJmsPluginRequest request);

    /**
     * Deletes only the metadata of the Performance Tuning Analysis result, but the file remains in
     * the object storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DeletePerformanceTuningAnalysisResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeletePerformanceTuningAnalysisResult API.
     */
    DeletePerformanceTuningAnalysisResultResponse deletePerformanceTuningAnalysisResult(
            DeletePerformanceTuningAnalysisResultRequest request);

    /**
     * Request to disable the DRS in the selected target in the Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/DisableDrsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use DisableDrs API.
     */
    DisableDrsResponse disableDrs(DisableDrsRequest request);

    /**
     * Request to enable the DRS in the selected target in the Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/EnableDrsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use EnableDrs API.
     */
    EnableDrsResponse enableDrs(EnableDrsRequest request);

    /**
     * Generates Agent Deploy Script for Fleet using the information provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GenerateAgentDeployScriptExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateAgentDeployScript API.
     */
    GenerateAgentDeployScriptResponse generateAgentDeployScript(
            GenerateAgentDeployScriptRequest request);

    /**
     * Generates the agent installer configuration using the information provided.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GenerateAgentInstallerConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateAgentInstallerConfiguration API.
     */
    GenerateAgentInstallerConfigurationResponse generateAgentInstallerConfiguration(
            GenerateAgentInstallerConfigurationRequest request);

    /**
     * Generates Load Pipeline Script
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GenerateLoadPipelineScriptExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GenerateLoadPipelineScript API.
     */
    GenerateLoadPipelineScriptResponse generateLoadPipelineScript(
            GenerateLoadPipelineScriptRequest request);

    /**
     * Retrieve the metadata for the result of a Crypto event analysis.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetCryptoAnalysisResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetCryptoAnalysisResult API.
     */
    GetCryptoAnalysisResultResponse getCryptoAnalysisResult(GetCryptoAnalysisResultRequest request);

    /**
     * Get the detail about the created DRS file in the Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetDrsFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetDrsFile API.
     */
    GetDrsFileResponse getDrsFile(GetDrsFileRequest request);

    /**
     * Returns export setting for the specified fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetExportSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExportSetting
     *     API.
     */
    GetExportSettingResponse getExportSetting(GetExportSettingRequest request);

    /**
     * Returns last export status for the specified fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetExportStatusExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetExportStatus
     *     API.
     */
    GetExportStatusResponse getExportStatus(GetExportStatusRequest request);

    /**
     * Retrieve a Fleet with the specified identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetFleetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetFleet API.
     */
    GetFleetResponse getFleet(GetFleetRequest request);

    /**
     * Returns Fleet level advanced feature configuration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetFleetAdvancedFeatureConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetFleetAdvancedFeatureConfiguration API.
     */
    GetFleetAdvancedFeatureConfigurationResponse getFleetAdvancedFeatureConfiguration(
            GetFleetAdvancedFeatureConfigurationRequest request);

    /**
     * Retrieve a Fleet Agent Configuration for the specified Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetFleetAgentConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetFleetAgentConfiguration API.
     */
    GetFleetAgentConfigurationResponse getFleetAgentConfiguration(
            GetFleetAgentConfigurationRequest request);

    /**
     * Returns metadata associated with a specific Java release family.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetJavaFamilyExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJavaFamily API.
     */
    GetJavaFamilyResponse getJavaFamily(GetJavaFamilyRequest request);

    /**
     * Retrieve Java Migration Analysis result.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetJavaMigrationAnalysisResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetJavaMigrationAnalysisResult API.
     */
    GetJavaMigrationAnalysisResultResponse getJavaMigrationAnalysisResult(
            GetJavaMigrationAnalysisResultRequest request);

    /**
     * Returns detail of a Java release.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetJavaReleaseExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJavaRelease API.
     */
    GetJavaReleaseResponse getJavaRelease(GetJavaReleaseRequest request);

    /**
     * Returns the JmsPlugin.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetJmsPluginExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetJmsPlugin API.
     */
    GetJmsPluginResponse getJmsPlugin(GetJmsPluginRequest request);

    /**
     * Retrieve metadata of the Performance Tuning Analysis result.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetPerformanceTuningAnalysisResultExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetPerformanceTuningAnalysisResult API.
     */
    GetPerformanceTuningAnalysisResultResponse getPerformanceTuningAnalysisResult(
            GetPerformanceTuningAnalysisResultRequest request);

    /**
     * Retrieve the details of a work request with the specified ID.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/GetWorkRequestExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWorkRequest API.
     */
    GetWorkRequestResponse getWorkRequest(GetWorkRequestRequest request);

    /**
     * Returns a list of the agent installer information.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListAgentInstallersExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAgentInstallers
     *     API.
     */
    ListAgentInstallersResponse listAgentInstallers(ListAgentInstallersRequest request);

    /**
     * Return a list of AnnouncementSummary items
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListAnnouncementsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListAnnouncements
     *     API.
     */
    ListAnnouncementsResponse listAnnouncements(ListAnnouncementsRequest request);

    /**
     * Returns a list of blocklist entities contained by a fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListBlocklistsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListBlocklists API.
     */
    ListBlocklistsResponse listBlocklists(ListBlocklistsRequest request);

    /**
     * Lists the results of a Crypto event analysis.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListCryptoAnalysisResultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListCryptoAnalysisResults API.
     */
    ListCryptoAnalysisResultsResponse listCryptoAnalysisResults(
            ListCryptoAnalysisResultsRequest request);

    /**
     * List the details about the created DRS files in the Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListDrsFilesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListDrsFiles API.
     */
    ListDrsFilesResponse listDrsFiles(ListDrsFilesRequest request);

    /**
     * List potential diagnoses that would put a fleet into FAILED or NEEDS_ATTENTION lifecycle
     * state.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListFleetDiagnosesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFleetDiagnoses
     *     API.
     */
    ListFleetDiagnosesResponse listFleetDiagnoses(ListFleetDiagnosesRequest request);

    /**
     * Returns a list of all the Fleets contained by a compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListFleetsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListFleets API.
     */
    ListFleetsResponse listFleets(ListFleetsRequest request);

    /**
     * List Java installation sites in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListInstallationSitesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListInstallationSites API.
     */
    ListInstallationSitesResponse listInstallationSites(ListInstallationSitesRequest request);

    /**
     * Returns a list of the Java release family information. A Java release family is typically a
     * major version in the Java version identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJavaFamiliesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJavaFamilies
     *     API.
     */
    ListJavaFamiliesResponse listJavaFamilies(ListJavaFamiliesRequest request);

    /**
     * Lists the results of a Java migration analysis.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJavaMigrationAnalysisResultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListJavaMigrationAnalysisResults API.
     */
    ListJavaMigrationAnalysisResultsResponse listJavaMigrationAnalysisResults(
            ListJavaMigrationAnalysisResultsRequest request);

    /**
     * Returns a list of Java releases.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJavaReleasesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJavaReleases
     *     API.
     */
    ListJavaReleasesResponse listJavaReleases(ListJavaReleasesRequest request);

    /**
     * Lists the JmsPlugins.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJmsPluginsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJmsPlugins API.
     */
    ListJmsPluginsResponse listJmsPlugins(ListJmsPluginsRequest request);

    /**
     * List Java Runtime usage in a specified host filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJreUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListJreUsage API.
     */
    ListJreUsageResponse listJreUsage(ListJreUsageRequest request);

    /**
     * List Performance Tuning Analysis results.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListPerformanceTuningAnalysisResultsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListPerformanceTuningAnalysisResults API.
     */
    ListPerformanceTuningAnalysisResultsResponse listPerformanceTuningAnalysisResults(
            ListPerformanceTuningAnalysisResultsRequest request);

    /**
     * Retrieve a paginated list of work items for a specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListWorkItemsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkItems API.
     */
    ListWorkItemsResponse listWorkItems(ListWorkItemsRequest request);

    /**
     * Retrieve a (paginated) list of errors for a specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListWorkRequestErrorsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListWorkRequestErrors API.
     */
    ListWorkRequestErrorsResponse listWorkRequestErrors(ListWorkRequestErrorsRequest request);

    /**
     * Retrieve a paginated list of logs for a specified work request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListWorkRequestLogsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequestLogs
     *     API.
     */
    ListWorkRequestLogsResponse listWorkRequestLogs(ListWorkRequestLogsRequest request);

    /**
     * List the work requests in a compartment. The query parameter `compartmentId` is required
     * unless the query parameter `id` or `fleetId` is specified.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListWorkRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWorkRequests
     *     API.
     */
    ListWorkRequestsResponse listWorkRequests(ListWorkRequestsRequest request);

    /**
     * Remove Java installation sites in a Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RemoveFleetInstallationSitesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveFleetInstallationSites API.
     */
    RemoveFleetInstallationSitesResponse removeFleetInstallationSites(
            RemoveFleetInstallationSitesRequest request);

    /**
     * Request to perform crypto analysis on one or more selected targets in the Fleet. The result
     * of the crypto analysis will be uploaded to the object storage bucket created by JMS on
     * enabling the Crypto Event Analysis feature in the Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestCryptoAnalysesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestCryptoAnalyses API.
     */
    RequestCryptoAnalysesResponse requestCryptoAnalyses(RequestCryptoAnalysesRequest request);

    /**
     * Request to perform a deployed Java migration analyses. The results of the deployed Java
     * migration analyses will be uploaded to the Object Storage bucket that you designate when you
     * enable the Java Migration Analyses feature.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestDeployedApplicationMigrationAnalysesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestDeployedApplicationMigrationAnalyses API.
     */
    RequestDeployedApplicationMigrationAnalysesResponse requestDeployedApplicationMigrationAnalyses(
            RequestDeployedApplicationMigrationAnalysesRequest request);

    /**
     * Request to perform a Java migration analysis. The results of the Java migration analysis will
     * be uploaded to the Object Storage bucket that you designate when you enable the Java
     * Migration Analysis feature.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestJavaMigrationAnalysesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestJavaMigrationAnalyses API.
     */
    RequestJavaMigrationAnalysesResponse requestJavaMigrationAnalyses(
            RequestJavaMigrationAnalysesRequest request);

    /**
     * Request to collect the JFR recordings on the selected target in the Fleet. The JFR files are
     * uploaded to the object storage bucket created by JMS on enabling Generic JFR feature in the
     * Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestJfrRecordingsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestJfrRecordings API.
     */
    RequestJfrRecordingsResponse requestJfrRecordings(RequestJfrRecordingsRequest request);

    /**
     * Request to perform performance tuning analyses. The result of performance tuning analysis
     * will be uploaded to the object storage bucket that you designated when you enabled the
     * recording feature.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestPerformanceTuningAnalysesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestPerformanceTuningAnalyses API.
     */
    RequestPerformanceTuningAnalysesResponse requestPerformanceTuningAnalyses(
            RequestPerformanceTuningAnalysesRequest request);

    /**
     * Scan Java Server usage in a fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ScanJavaServerUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ScanJavaServerUsage
     *     API.
     */
    ScanJavaServerUsageResponse scanJavaServerUsage(ScanJavaServerUsageRequest request);

    /**
     * Scan library usage in a fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ScanLibraryUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ScanLibraryUsage
     *     API.
     */
    ScanLibraryUsageResponse scanLibraryUsage(ScanLibraryUsageRequest request);

    /**
     * Summarizes the application installation usage in a Fleet filtered by query parameters. In
     * contrast to SummarizeApplicationUsage, which provides only information aggregated by
     * application name, this operation provides installation details. This allows for better
     * focusing of actions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeApplicationInstallationUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeApplicationInstallationUsage API.
     */
    SummarizeApplicationInstallationUsageResponse summarizeApplicationInstallationUsage(
            SummarizeApplicationInstallationUsageRequest request);

    /**
     * List application usage in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeApplicationUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeApplicationUsage API.
     */
    SummarizeApplicationUsageResponse summarizeApplicationUsage(
            SummarizeApplicationUsageRequest request);

    /**
     * Summarize installation usage of an application deployed on Java servers in a fleet filtered
     * by query parameters. In contrast to SummarizeDeployedApplicationUsage, which provides only
     * information aggregated by the deployment information, this operation provides installation
     * details and allows for better focusing of actions.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeDeployedApplicationInstallationUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeDeployedApplicationInstallationUsage API.
     */
    SummarizeDeployedApplicationInstallationUsageResponse
            summarizeDeployedApplicationInstallationUsage(
                    SummarizeDeployedApplicationInstallationUsageRequest request);

    /**
     * List of deployed applications in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeDeployedApplicationUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeDeployedApplicationUsage API.
     */
    SummarizeDeployedApplicationUsageResponse summarizeDeployedApplicationUsage(
            SummarizeDeployedApplicationUsageRequest request);

    /**
     * List Java installation usage in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeInstallationUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeInstallationUsage API.
     */
    SummarizeInstallationUsageResponse summarizeInstallationUsage(
            SummarizeInstallationUsageRequest request);

    /**
     * List Java Server instances in a fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeJavaServerInstanceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeJavaServerInstanceUsage API.
     */
    SummarizeJavaServerInstanceUsageResponse summarizeJavaServerInstanceUsage(
            SummarizeJavaServerInstanceUsageRequest request);

    /**
     * List of Java servers in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeJavaServerUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeJavaServerUsage API.
     */
    SummarizeJavaServerUsageResponse summarizeJavaServerUsage(
            SummarizeJavaServerUsageRequest request);

    /**
     * List Java Runtime usage in a specified Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeJreUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use SummarizeJreUsage
     *     API.
     */
    SummarizeJreUsageResponse summarizeJreUsage(SummarizeJreUsageRequest request);

    /**
     * List libraries in a fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeLibraryUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeLibraryUsage API.
     */
    SummarizeLibraryUsageResponse summarizeLibraryUsage(SummarizeLibraryUsageRequest request);

    /**
     * List managed instance usage in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeManagedInstanceUsageExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeManagedInstanceUsage API.
     */
    SummarizeManagedInstanceUsageResponse summarizeManagedInstanceUsage(
            SummarizeManagedInstanceUsageRequest request);

    /**
     * Retrieve the inventory of JMS resources in the specified compartment: a list of the number of
     * _active_ fleets, managed instances, Java Runtimes, Java installations, and applications.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeResourceInventoryExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SummarizeResourceInventory API.
     */
    SummarizeResourceInventoryResponse summarizeResourceInventory(
            SummarizeResourceInventoryRequest request);

    /**
     * Request to perform validation of the DRS file and update the existing file in the Object
     * Storage.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateDrsFileExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateDrsFile API.
     */
    UpdateDrsFileResponse updateDrsFile(UpdateDrsFileRequest request);

    /**
     * Updates existing export setting for the specified fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateExportSettingExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateExportSetting
     *     API.
     */
    UpdateExportSettingResponse updateExportSetting(UpdateExportSettingRequest request);

    /**
     * Update the Fleet specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateFleetExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateFleet API.
     */
    UpdateFleetResponse updateFleet(UpdateFleetRequest request);

    /**
     * Update advanced feature configurations for the Fleet. Ensure that the namespace and bucket
     * storage are created prior to turning on the JfrRecording or CryptoEventAnalysis feature.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateFleetAdvancedFeatureConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateFleetAdvancedFeatureConfiguration API.
     */
    UpdateFleetAdvancedFeatureConfigurationResponse updateFleetAdvancedFeatureConfiguration(
            UpdateFleetAdvancedFeatureConfigurationRequest request);

    /**
     * Update the Fleet Agent Configuration for the specified Fleet.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateFleetAgentConfigurationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateFleetAgentConfiguration API.
     */
    UpdateFleetAgentConfigurationResponse updateFleetAgentConfiguration(
            UpdateFleetAgentConfigurationRequest request);

    /**
     * Updates the Fleet of a JmsPlugin.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/UpdateJmsPluginExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateJmsPlugin
     *     API.
     */
    UpdateJmsPluginResponse updateJmsPlugin(UpdateJmsPluginRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    JavaManagementServiceWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    JavaManagementServicePaginators getPaginators();
}
