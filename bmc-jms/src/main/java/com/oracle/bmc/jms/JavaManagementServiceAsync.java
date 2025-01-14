/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
 * workloads running on these instances by carrying out basic and advanced features.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public interface JavaManagementServiceAsync extends AutoCloseable {

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
     * Add Java installation sites in a Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AddFleetInstallationSitesResponse> addFleetInstallationSites(
            AddFleetInstallationSitesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddFleetInstallationSitesRequest, AddFleetInstallationSitesResponse>
                    handler);

    /**
     * Deletes the work request specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CancelWorkRequestResponse> cancelWorkRequest(
            CancelWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CancelWorkRequestRequest, CancelWorkRequestResponse>
                    handler);

    /**
     * Move a specified Fleet into the compartment identified in the POST form. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeFleetCompartmentResponse> changeFleetCompartment(
            ChangeFleetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeFleetCompartmentRequest, ChangeFleetCompartmentResponse>
                    handler);

    /**
     * Add a new record to the fleet blocklist.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBlocklistResponse> createBlocklist(
            CreateBlocklistRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateBlocklistRequest, CreateBlocklistResponse>
                    handler);

    /**
     * Request to perform validation of the DRS file and create the file to the Object Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDrsFileResponse> createDrsFile(
            CreateDrsFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateDrsFileRequest, CreateDrsFileResponse>
                    handler);

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
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateFleetResponse> createFleet(
            CreateFleetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateFleetRequest, CreateFleetResponse> handler);

    /**
     * Registers an agent's JmsPlugin, optionally attaching to an existing fleet of the tenancy.
     * JmsPlugins registered fleet-less are created with lifecycle state INACTIVE. For the operation
     * to be authorized, the agent must exist, and the authorized user requires JMS_PLUGIN_CREATE
     * permission for the agent's compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateJmsPluginResponse> createJmsPlugin(
            CreateJmsPluginRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateJmsPluginRequest, CreateJmsPluginResponse>
                    handler);

    /**
     * Deletes the blocklist record specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBlocklistResponse> deleteBlocklist(
            DeleteBlocklistRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteBlocklistRequest, DeleteBlocklistResponse>
                    handler);

    /**
     * Deletes the metadata for the result of a Crypto event analysis. The actual report shall
     * remain in the object storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteCryptoAnalysisResultResponse> deleteCryptoAnalysisResult(
            DeleteCryptoAnalysisResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteCryptoAnalysisResultRequest, DeleteCryptoAnalysisResultResponse>
                    handler);

    /**
     * Request to delete the DRS file from the Object Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDrsFileResponse> deleteDrsFile(
            DeleteDrsFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteDrsFileRequest, DeleteDrsFileResponse>
                    handler);

    /**
     * Deletes the Fleet specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteFleetResponse> deleteFleet(
            DeleteFleetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteFleetRequest, DeleteFleetResponse> handler);

    /**
     * Delete the Java migration analysis result. The actual report will remain in the Object
     * Storage bucket.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJavaMigrationAnalysisResultResponse>
            deleteJavaMigrationAnalysisResult(
                    DeleteJavaMigrationAnalysisResultRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteJavaMigrationAnalysisResultRequest,
                                    DeleteJavaMigrationAnalysisResultResponse>
                            handler);

    /**
     * Deletes a JmsPlugin. The JmsPlugin may be visible for some time with state DELETED. Deleted
     * plugins will not be able to communicate with the JMS service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteJmsPluginResponse> deleteJmsPlugin(
            DeleteJmsPluginRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteJmsPluginRequest, DeleteJmsPluginResponse>
                    handler);

    /**
     * Deletes only the metadata of the Performance Tuning Analysis result, but the file remains in
     * the object storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeletePerformanceTuningAnalysisResultResponse>
            deletePerformanceTuningAnalysisResult(
                    DeletePerformanceTuningAnalysisResultRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeletePerformanceTuningAnalysisResultRequest,
                                    DeletePerformanceTuningAnalysisResultResponse>
                            handler);

    /**
     * Request to disable the DRS in the selected target in the Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableDrsResponse> disableDrs(
            DisableDrsRequest request,
            com.oracle.bmc.responses.AsyncHandler<DisableDrsRequest, DisableDrsResponse> handler);

    /**
     * Request to enable the DRS in the selected target in the Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableDrsResponse> enableDrs(
            EnableDrsRequest request,
            com.oracle.bmc.responses.AsyncHandler<EnableDrsRequest, EnableDrsResponse> handler);

    /**
     * Generates Agent Deploy Script for Fleet using the information provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateAgentDeployScriptResponse> generateAgentDeployScript(
            GenerateAgentDeployScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateAgentDeployScriptRequest, GenerateAgentDeployScriptResponse>
                    handler);

    /**
     * Generates the agent installer configuration using the information provided.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateAgentInstallerConfigurationResponse>
            generateAgentInstallerConfiguration(
                    GenerateAgentInstallerConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GenerateAgentInstallerConfigurationRequest,
                                    GenerateAgentInstallerConfigurationResponse>
                            handler);

    /**
     * Generates Load Pipeline Script
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GenerateLoadPipelineScriptResponse> generateLoadPipelineScript(
            GenerateLoadPipelineScriptRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GenerateLoadPipelineScriptRequest, GenerateLoadPipelineScriptResponse>
                    handler);

    /**
     * Retrieve the metadata for the result of a Crypto event analysis.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetCryptoAnalysisResultResponse> getCryptoAnalysisResult(
            GetCryptoAnalysisResultRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetCryptoAnalysisResultRequest, GetCryptoAnalysisResultResponse>
                    handler);

    /**
     * Get the detail about the created DRS file in the Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDrsFileResponse> getDrsFile(
            GetDrsFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDrsFileRequest, GetDrsFileResponse> handler);

    /**
     * Returns export setting for the specified fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExportSettingResponse> getExportSetting(
            GetExportSettingRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExportSettingRequest, GetExportSettingResponse>
                    handler);

    /**
     * Returns last export status for the specified fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetExportStatusResponse> getExportStatus(
            GetExportStatusRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetExportStatusRequest, GetExportStatusResponse>
                    handler);

    /**
     * Retrieve a Fleet with the specified identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFleetResponse> getFleet(
            GetFleetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetFleetRequest, GetFleetResponse> handler);

    /**
     * Returns Fleet level advanced feature configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFleetAdvancedFeatureConfigurationResponse>
            getFleetAdvancedFeatureConfiguration(
                    GetFleetAdvancedFeatureConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetFleetAdvancedFeatureConfigurationRequest,
                                    GetFleetAdvancedFeatureConfigurationResponse>
                            handler);

    /**
     * Retrieve a Fleet Agent Configuration for the specified Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetFleetAgentConfigurationResponse> getFleetAgentConfiguration(
            GetFleetAgentConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetFleetAgentConfigurationRequest, GetFleetAgentConfigurationResponse>
                    handler);

    /**
     * Returns metadata associated with a specific Java release family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaFamilyResponse> getJavaFamily(
            GetJavaFamilyRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJavaFamilyRequest, GetJavaFamilyResponse>
                    handler);

    /**
     * Retrieve Java Migration Analysis result.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaMigrationAnalysisResultResponse>
            getJavaMigrationAnalysisResult(
                    GetJavaMigrationAnalysisResultRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetJavaMigrationAnalysisResultRequest,
                                    GetJavaMigrationAnalysisResultResponse>
                            handler);

    /**
     * Returns detail of a Java release.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJavaReleaseResponse> getJavaRelease(
            GetJavaReleaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJavaReleaseRequest, GetJavaReleaseResponse>
                    handler);

    /**
     * Returns the JmsPlugin.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetJmsPluginResponse> getJmsPlugin(
            GetJmsPluginRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetJmsPluginRequest, GetJmsPluginResponse>
                    handler);

    /**
     * Retrieve metadata of the Performance Tuning Analysis result.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetPerformanceTuningAnalysisResultResponse>
            getPerformanceTuningAnalysisResult(
                    GetPerformanceTuningAnalysisResultRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetPerformanceTuningAnalysisResultRequest,
                                    GetPerformanceTuningAnalysisResultResponse>
                            handler);

    /**
     * Retrieve the details of a work request with the specified ID.
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
     * Returns a list of the agent installer information.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAgentInstallersResponse> listAgentInstallers(
            ListAgentInstallersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAgentInstallersRequest, ListAgentInstallersResponse>
                    handler);

    /**
     * Return a list of AnnouncementSummary items
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAnnouncementsResponse> listAnnouncements(
            ListAnnouncementsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAnnouncementsRequest, ListAnnouncementsResponse>
                    handler);

    /**
     * Returns a list of blocklist entities contained by a fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBlocklistsResponse> listBlocklists(
            ListBlocklistsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListBlocklistsRequest, ListBlocklistsResponse>
                    handler);

    /**
     * Lists the results of a Crypto event analysis.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListCryptoAnalysisResultsResponse> listCryptoAnalysisResults(
            ListCryptoAnalysisResultsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListCryptoAnalysisResultsRequest, ListCryptoAnalysisResultsResponse>
                    handler);

    /**
     * List the details about the created DRS files in the Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDrsFilesResponse> listDrsFiles(
            ListDrsFilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListDrsFilesRequest, ListDrsFilesResponse>
                    handler);

    /**
     * List potential diagnoses that would put a fleet into FAILED or NEEDS_ATTENTION lifecycle
     * state.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFleetDiagnosesResponse> listFleetDiagnoses(
            ListFleetDiagnosesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListFleetDiagnosesRequest, ListFleetDiagnosesResponse>
                    handler);

    /**
     * Returns a list of all the Fleets contained by a compartment. The query parameter
     * `compartmentId` is required unless the query parameter `id` is specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListFleetsResponse> listFleets(
            ListFleetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListFleetsRequest, ListFleetsResponse> handler);

    /**
     * List Java installation sites in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListInstallationSitesResponse> listInstallationSites(
            ListInstallationSitesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListInstallationSitesRequest, ListInstallationSitesResponse>
                    handler);

    /**
     * Returns a list of the Java release family information. A Java release family is typically a
     * major version in the Java version identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaFamiliesResponse> listJavaFamilies(
            ListJavaFamiliesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJavaFamiliesRequest, ListJavaFamiliesResponse>
                    handler);

    /**
     * Lists the results of a Java migration analysis.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaMigrationAnalysisResultsResponse>
            listJavaMigrationAnalysisResults(
                    ListJavaMigrationAnalysisResultsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListJavaMigrationAnalysisResultsRequest,
                                    ListJavaMigrationAnalysisResultsResponse>
                            handler);

    /**
     * Returns a list of Java releases.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJavaReleasesResponse> listJavaReleases(
            ListJavaReleasesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJavaReleasesRequest, ListJavaReleasesResponse>
                    handler);

    /**
     * Lists the JmsPlugins.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJmsPluginsResponse> listJmsPlugins(
            ListJmsPluginsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJmsPluginsRequest, ListJmsPluginsResponse>
                    handler);

    /**
     * List Java Runtime usage in a specified host filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListJreUsageResponse> listJreUsage(
            ListJreUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListJreUsageRequest, ListJreUsageResponse>
                    handler);

    /**
     * List Performance Tuning Analysis results.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListPerformanceTuningAnalysisResultsResponse>
            listPerformanceTuningAnalysisResults(
                    ListPerformanceTuningAnalysisResultsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListPerformanceTuningAnalysisResultsRequest,
                                    ListPerformanceTuningAnalysisResultsResponse>
                            handler);

    /**
     * Retrieve a paginated list of work items for a specified work request.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkItemsResponse> listWorkItems(
            ListWorkItemsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkItemsRequest, ListWorkItemsResponse>
                    handler);

    /**
     * Retrieve a (paginated) list of errors for a specified work request.
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
     * Retrieve a paginated list of logs for a specified work request.
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
     * List the work requests in a compartment. The query parameter `compartmentId` is required
     * unless the query parameter `id` or `fleetId` is specified.
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
     * Remove Java installation sites in a Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveFleetInstallationSitesResponse> removeFleetInstallationSites(
            RemoveFleetInstallationSitesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RemoveFleetInstallationSitesRequest,
                            RemoveFleetInstallationSitesResponse>
                    handler);

    /**
     * Request to perform crypto analysis on one or more selected targets in the Fleet. The result
     * of the crypto analysis will be uploaded to the object storage bucket created by JMS on
     * enabling the Crypto Event Analysis feature in the Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestCryptoAnalysesResponse> requestCryptoAnalyses(
            RequestCryptoAnalysesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestCryptoAnalysesRequest, RequestCryptoAnalysesResponse>
                    handler);

    /**
     * Request to perform a deployed Java migration analyses. The results of the deployed Java
     * migration analyses will be uploaded to the Object Storage bucket that you designate when you
     * enable the Java Migration Analyses feature.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestDeployedApplicationMigrationAnalysesResponse>
            requestDeployedApplicationMigrationAnalyses(
                    RequestDeployedApplicationMigrationAnalysesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestDeployedApplicationMigrationAnalysesRequest,
                                    RequestDeployedApplicationMigrationAnalysesResponse>
                            handler);

    /**
     * Request to perform a Java migration analysis. The results of the Java migration analysis will
     * be uploaded to the Object Storage bucket that you designate when you enable the Java
     * Migration Analysis feature.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestJavaMigrationAnalysesResponse> requestJavaMigrationAnalyses(
            RequestJavaMigrationAnalysesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestJavaMigrationAnalysesRequest,
                            RequestJavaMigrationAnalysesResponse>
                    handler);

    /**
     * Request to collect the JFR recordings on the selected target in the Fleet. The JFR files are
     * uploaded to the object storage bucket created by JMS on enabling Generic JFR feature in the
     * Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestJfrRecordingsResponse> requestJfrRecordings(
            RequestJfrRecordingsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestJfrRecordingsRequest, RequestJfrRecordingsResponse>
                    handler);

    /**
     * Request to perform performance tuning analyses. The result of performance tuning analysis
     * will be uploaded to the object storage bucket that you designated when you enabled the
     * recording feature.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestPerformanceTuningAnalysesResponse>
            requestPerformanceTuningAnalyses(
                    RequestPerformanceTuningAnalysesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestPerformanceTuningAnalysesRequest,
                                    RequestPerformanceTuningAnalysesResponse>
                            handler);

    /**
     * Scan Java Server usage in a fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScanJavaServerUsageResponse> scanJavaServerUsage(
            ScanJavaServerUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ScanJavaServerUsageRequest, ScanJavaServerUsageResponse>
                    handler);

    /**
     * Scan library usage in a fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ScanLibraryUsageResponse> scanLibraryUsage(
            ScanLibraryUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<ScanLibraryUsageRequest, ScanLibraryUsageResponse>
                    handler);

    /**
     * Summarizes the application installation usage in a Fleet filtered by query parameters. In
     * contrast to SummarizeApplicationUsage, which provides only information aggregated by
     * application name, this operation provides installation details. This allows for better
     * focusing of actions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeApplicationInstallationUsageResponse>
            summarizeApplicationInstallationUsage(
                    SummarizeApplicationInstallationUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeApplicationInstallationUsageRequest,
                                    SummarizeApplicationInstallationUsageResponse>
                            handler);

    /**
     * List application usage in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeApplicationUsageResponse> summarizeApplicationUsage(
            SummarizeApplicationUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeApplicationUsageRequest, SummarizeApplicationUsageResponse>
                    handler);

    /**
     * Summarize installation usage of an application deployed on Java servers in a fleet filtered
     * by query parameters. In contrast to SummarizeDeployedApplicationUsage, which provides only
     * information aggregated by the deployment information, this operation provides installation
     * details and allows for better focusing of actions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDeployedApplicationInstallationUsageResponse>
            summarizeDeployedApplicationInstallationUsage(
                    SummarizeDeployedApplicationInstallationUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDeployedApplicationInstallationUsageRequest,
                                    SummarizeDeployedApplicationInstallationUsageResponse>
                            handler);

    /**
     * List of deployed applications in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDeployedApplicationUsageResponse>
            summarizeDeployedApplicationUsage(
                    SummarizeDeployedApplicationUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDeployedApplicationUsageRequest,
                                    SummarizeDeployedApplicationUsageResponse>
                            handler);

    /**
     * List Java installation usage in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeInstallationUsageResponse> summarizeInstallationUsage(
            SummarizeInstallationUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeInstallationUsageRequest, SummarizeInstallationUsageResponse>
                    handler);

    /**
     * List Java Server instances in a fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeJavaServerInstanceUsageResponse>
            summarizeJavaServerInstanceUsage(
                    SummarizeJavaServerInstanceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeJavaServerInstanceUsageRequest,
                                    SummarizeJavaServerInstanceUsageResponse>
                            handler);

    /**
     * List of Java servers in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeJavaServerUsageResponse> summarizeJavaServerUsage(
            SummarizeJavaServerUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeJavaServerUsageRequest, SummarizeJavaServerUsageResponse>
                    handler);

    /**
     * List Java Runtime usage in a specified Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeJreUsageResponse> summarizeJreUsage(
            SummarizeJreUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeJreUsageRequest, SummarizeJreUsageResponse>
                    handler);

    /**
     * List libraries in a fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeLibraryUsageResponse> summarizeLibraryUsage(
            SummarizeLibraryUsageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeLibraryUsageRequest, SummarizeLibraryUsageResponse>
                    handler);

    /**
     * List managed instance usage in a Fleet filtered by query parameters.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeManagedInstanceUsageResponse>
            summarizeManagedInstanceUsage(
                    SummarizeManagedInstanceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeManagedInstanceUsageRequest,
                                    SummarizeManagedInstanceUsageResponse>
                            handler);

    /**
     * Retrieve the inventory of JMS resources in the specified compartment: a list of the number of
     * _active_ fleets, managed instances, Java Runtimes, Java installations, and applications.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeResourceInventoryResponse> summarizeResourceInventory(
            SummarizeResourceInventoryRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeResourceInventoryRequest, SummarizeResourceInventoryResponse>
                    handler);

    /**
     * Request to perform validation of the DRS file and update the existing file in the Object
     * Storage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDrsFileResponse> updateDrsFile(
            UpdateDrsFileRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateDrsFileRequest, UpdateDrsFileResponse>
                    handler);

    /**
     * Updates existing export setting for the specified fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExportSettingResponse> updateExportSetting(
            UpdateExportSettingRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExportSettingRequest, UpdateExportSettingResponse>
                    handler);

    /**
     * Update the Fleet specified by an identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFleetResponse> updateFleet(
            UpdateFleetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateFleetRequest, UpdateFleetResponse> handler);

    /**
     * Update advanced feature configurations for the Fleet. Ensure that the namespace and bucket
     * storage are created prior to turning on the JfrRecording or CryptoEventAnalysis feature.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFleetAdvancedFeatureConfigurationResponse>
            updateFleetAdvancedFeatureConfiguration(
                    UpdateFleetAdvancedFeatureConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFleetAdvancedFeatureConfigurationRequest,
                                    UpdateFleetAdvancedFeatureConfigurationResponse>
                            handler);

    /**
     * Update the Fleet Agent Configuration for the specified Fleet.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateFleetAgentConfigurationResponse>
            updateFleetAgentConfiguration(
                    UpdateFleetAgentConfigurationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateFleetAgentConfigurationRequest,
                                    UpdateFleetAgentConfigurationResponse>
                            handler);

    /**
     * Updates the Fleet of a JmsPlugin.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateJmsPluginResponse> updateJmsPlugin(
            UpdateJmsPluginRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateJmsPluginRequest, UpdateJmsPluginResponse>
                    handler);
}
