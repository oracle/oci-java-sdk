/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring;

import com.oracle.bmc.stackmonitoring.requests.*;
import com.oracle.bmc.stackmonitoring.responses.*;

/** Stack Monitoring API. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public interface StackMonitoringAsync extends AutoCloseable {

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
     * Apply the Monitoring Template identified by the id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ApplyMonitoringTemplateResponse> applyMonitoringTemplate(
            ApplyMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ApplyMonitoringTemplateRequest, ApplyMonitoringTemplateResponse>
                    handler);

    /**
     * Create an association between two monitored resources. Associations can be created between
     * resources from different compartments as long they are in same tenancy. User should have
     * required access in both the compartments.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AssociateMonitoredResourcesResponse> associateMonitoredResources(
            AssociateMonitoredResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AssociateMonitoredResourcesRequest, AssociateMonitoredResourcesResponse>
                    handler);

    /**
     * Moves the configuration item to another compartment. Basically, this will disable any
     * configuration for this configuration type in thie compartment, and will enable it in the new
     * one.
     *
     * <p>For example, if for a HOST resource type, the configuration with AUTO_PROMOTE in the
     * configuration type and TRUE as value is moved, automatic discovery will not take place in
     * this compartment any more, but in the new one.
     *
     * <p>So this operation will have the same effect as deleting the configuration item in the old
     * compartment and recreating it in another compartment.
     *
     * <p>When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeConfigCompartmentResponse> changeConfigCompartment(
            ChangeConfigCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeConfigCompartmentRequest, ChangeConfigCompartmentResponse>
                    handler);

    /**
     * Moves a Metric Extension resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMetricExtensionCompartmentResponse>
            changeMetricExtensionCompartment(
                    ChangeMetricExtensionCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMetricExtensionCompartmentRequest,
                                    ChangeMetricExtensionCompartmentResponse>
                            handler);

    /**
     * Moves a monitored resource from one compartment to another. When provided, If-Match is
     * checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMonitoredResourceCompartmentResponse>
            changeMonitoredResourceCompartment(
                    ChangeMonitoredResourceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMonitoredResourceCompartmentRequest,
                                    ChangeMonitoredResourceCompartmentResponse>
                            handler);

    /**
     * Moves a stack monitoring resource task from one compartment to another.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeMonitoredResourceTaskCompartmentResponse>
            changeMonitoredResourceTaskCompartment(
                    ChangeMonitoredResourceTaskCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeMonitoredResourceTaskCompartmentRequest,
                                    ChangeMonitoredResourceTaskCompartmentResponse>
                            handler);

    /**
     * Moves a ProcessSet resource from one compartment identifier to another. When provided,
     * If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeProcessSetCompartmentResponse> changeProcessSetCompartment(
            ChangeProcessSetCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeProcessSetCompartmentRequest, ChangeProcessSetCompartmentResponse>
                    handler);

    /**
     * Create a new alarm condition in same monitoringTemplate compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateAlarmConditionResponse> createAlarmCondition(
            CreateAlarmConditionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateAlarmConditionRequest, CreateAlarmConditionResponse>
                    handler);

    /**
     * Creates the specified Baseline-able metric
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateBaselineableMetricResponse> createBaselineableMetric(
            CreateBaselineableMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateBaselineableMetricRequest, CreateBaselineableMetricResponse>
                    handler);

    /**
     * Creates a configuration item, for example to define whether resources of a specific type
     * should be discovered automatically.
     *
     * <p>For example, when a new Management Agent gets registered in a certain compartment, this
     * Management Agent can potentially get promoted to a HOST resource. The configuration item will
     * determine if HOST resources in the selected compartment will be discovered automatically.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateConfigResponse> createConfig(
            CreateConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateConfigRequest, CreateConfigResponse>
                    handler);

    /**
     * API to create discovery Job and submit discovery Details to agent.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateDiscoveryJobResponse> createDiscoveryJob(
            CreateDiscoveryJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDiscoveryJobRequest, CreateDiscoveryJobResponse>
                    handler);

    /**
     * Creates a new Maintenance Window for the given resources. It will create also the Alarms
     * Suppression for each alarm that the resource migth trigger.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMaintenanceWindowResponse> createMaintenanceWindow(
            CreateMaintenanceWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMaintenanceWindowRequest, CreateMaintenanceWindowResponse>
                    handler);

    /**
     * Creates a new metric extension resource for a given compartment
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMetricExtensionResponse> createMetricExtension(
            CreateMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMetricExtensionRequest, CreateMetricExtensionResponse>
                    handler);

    /**
     * Creates a new monitored resource for the given resource type with the details and submits a
     * work request for promoting the resource to agent. Once the resource is successfully added to
     * agent, resource state will be marked active.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMonitoredResourceResponse> createMonitoredResource(
            CreateMonitoredResourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoredResourceRequest, CreateMonitoredResourceResponse>
                    handler);

    /**
     * Create a new stack monitoring resource task.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMonitoredResourceTaskResponse> createMonitoredResourceTask(
            CreateMonitoredResourceTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoredResourceTaskRequest, CreateMonitoredResourceTaskResponse>
                    handler);

    /**
     * Creates a new monitored resource type.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMonitoredResourceTypeResponse> createMonitoredResourceType(
            CreateMonitoredResourceTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoredResourceTypeRequest, CreateMonitoredResourceTypeResponse>
                    handler);

    /**
     * Creates a new monitoring template for a given compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateMonitoringTemplateResponse> createMonitoringTemplate(
            CreateMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateMonitoringTemplateRequest, CreateMonitoringTemplateResponse>
                    handler);

    /**
     * API to create Process Set.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateProcessSetResponse> createProcessSet(
            CreateProcessSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateProcessSetRequest, CreateProcessSetResponse>
                    handler);

    /**
     * Deletes the alarm conditions by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAlarmConditionResponse> deleteAlarmCondition(
            DeleteAlarmConditionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteAlarmConditionRequest, DeleteAlarmConditionResponse>
                    handler);

    /**
     * Deletes the Baseline-able metric for the given id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteBaselineableMetricResponse> deleteBaselineableMetric(
            DeleteBaselineableMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteBaselineableMetricRequest, DeleteBaselineableMetricResponse>
                    handler);

    /**
     * Deletes a configuration identified by the id.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteConfigResponse> deleteConfig(
            DeleteConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteConfigRequest, DeleteConfigResponse>
                    handler);

    /**
     * Deletes a DiscoveryJob by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDiscoveryJobResponse> deleteDiscoveryJob(
            DeleteDiscoveryJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDiscoveryJobRequest, DeleteDiscoveryJobResponse>
                    handler);

    /**
     * Deletes a maintenance window by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMaintenanceWindowResponse> deleteMaintenanceWindow(
            DeleteMaintenanceWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMaintenanceWindowRequest, DeleteMaintenanceWindowResponse>
                    handler);

    /**
     * Deletes a metric extension by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMetricExtensionResponse> deleteMetricExtension(
            DeleteMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMetricExtensionRequest, DeleteMetricExtensionResponse>
                    handler);

    /**
     * Delete monitored resource by the given identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). By default,
     * only the specified resource is deleted. If the parameter 'isDeleteMembers' is set to true,
     * then the member resources will be deleted too. If the operation fails partially, the deleted
     * entries will not be rolled back.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMonitoredResourceResponse> deleteMonitoredResource(
            DeleteMonitoredResourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoredResourceRequest, DeleteMonitoredResourceResponse>
                    handler);

    /**
     * Deletes a monitored resource type by identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMonitoredResourceTypeResponse> deleteMonitoredResourceType(
            DeleteMonitoredResourceTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoredResourceTypeRequest, DeleteMonitoredResourceTypeResponse>
                    handler);

    /**
     * Deletes the monitoring template by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteMonitoringTemplateResponse> deleteMonitoringTemplate(
            DeleteMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteMonitoringTemplateRequest, DeleteMonitoringTemplateResponse>
                    handler);

    /**
     * Deletes a Process Set
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteProcessSetResponse> deleteProcessSet(
            DeleteProcessSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteProcessSetRequest, DeleteProcessSetResponse>
                    handler);

    /**
     * Disable external database resource monitoring. All the references in DBaaS, DBM and resource
     * service will be deleted as part of this operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableExternalDatabaseResponse> disableExternalDatabase(
            DisableExternalDatabaseRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableExternalDatabaseRequest, DisableExternalDatabaseResponse>
                    handler);

    /**
     * Submits a request to disable matching metric extension Id for the given Resource IDs
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableMetricExtensionResponse> disableMetricExtension(
            DisableMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableMetricExtensionRequest, DisableMetricExtensionResponse>
                    handler);

    /**
     * Removes associations between two monitored resources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisassociateMonitoredResourcesResponse>
            disassociateMonitoredResources(
                    DisassociateMonitoredResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisassociateMonitoredResourcesRequest,
                                    DisassociateMonitoredResourcesResponse>
                            handler);

    /**
     * Submits a request to enable matching metric extension Id for the given Resource IDs
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableMetricExtensionResponse> enableMetricExtension(
            EnableMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableMetricExtensionRequest, EnableMetricExtensionResponse>
                    handler);

    /**
     * Evaluates metric for anomalies for the given data points
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EvaluateBaselineableMetricResponse> evaluateBaselineableMetric(
            EvaluateBaselineableMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EvaluateBaselineableMetricRequest, EvaluateBaselineableMetricResponse>
                    handler);

    /**
     * Export generates a template used to create new metric extension resources similar to matching
     * metric extension id. Response is a file that contains metric extension definition with
     * placeholders for fields to be changed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportMetricExtensionResponse> exportMetricExtension(
            ExportMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportMetricExtensionRequest, ExportMetricExtensionResponse>
                    handler);

    /**
     * Export the specified monitoring template
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ExportMonitoringTemplateResponse> exportMonitoringTemplate(
            ExportMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ExportMonitoringTemplateRequest, ExportMonitoringTemplateResponse>
                    handler);

    /**
     * Gets a Alarm Condition by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetAlarmConditionResponse> getAlarmCondition(
            GetAlarmConditionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetAlarmConditionRequest, GetAlarmConditionResponse>
                    handler);

    /**
     * Get the Baseline-able metric for the given id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetBaselineableMetricResponse> getBaselineableMetric(
            GetBaselineableMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetBaselineableMetricRequest, GetBaselineableMetricResponse>
                    handler);

    /**
     * Gets the details of a configuration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetConfigResponse> getConfig(
            GetConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetConfigRequest, GetConfigResponse> handler);

    /**
     * API to get the details of discovery Job by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetDiscoveryJobResponse> getDiscoveryJob(
            GetDiscoveryJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetDiscoveryJobRequest, GetDiscoveryJobResponse>
                    handler);

    /**
     * Get maintenance window for the given identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMaintenanceWindowResponse> getMaintenanceWindow(
            GetMaintenanceWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMaintenanceWindowRequest, GetMaintenanceWindowResponse>
                    handler);

    /**
     * Gets a Metric Extension by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMetricExtensionResponse> getMetricExtension(
            GetMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMetricExtensionRequest, GetMetricExtensionResponse>
                    handler);

    /**
     * Get monitored resource for the given identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMonitoredResourceResponse> getMonitoredResource(
            GetMonitoredResourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceRequest, GetMonitoredResourceResponse>
                    handler);

    /**
     * Gets stack monitoring resource task details by identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMonitoredResourceTaskResponse> getMonitoredResourceTask(
            GetMonitoredResourceTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceTaskRequest, GetMonitoredResourceTaskResponse>
                    handler);

    /**
     * Gets a monitored resource type by identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMonitoredResourceTypeResponse> getMonitoredResourceType(
            GetMonitoredResourceTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoredResourceTypeRequest, GetMonitoredResourceTypeResponse>
                    handler);

    /**
     * Gets a Monitoring Template by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetMonitoringTemplateResponse> getMonitoringTemplate(
            GetMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetMonitoringTemplateRequest, GetMonitoringTemplateResponse>
                    handler);

    /**
     * API to get the details of a Process Set by identifier.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetProcessSetResponse> getProcessSet(
            GetProcessSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetProcessSetRequest, GetProcessSetResponse>
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
     * Returns a list of Alarm Conditions.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListAlarmConditionsResponse> listAlarmConditions(
            ListAlarmConditionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListAlarmConditionsRequest, ListAlarmConditionsResponse>
                    handler);

    /**
     * List of summary of baseline-able metrics for a given resource group if specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListBaselineableMetricsResponse> listBaselineableMetrics(
            ListBaselineableMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListBaselineableMetricsRequest, ListBaselineableMetricsResponse>
                    handler);

    /**
     * Get a list of configurations in a compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListConfigsResponse> listConfigs(
            ListConfigsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListConfigsRequest, ListConfigsResponse> handler);

    /**
     * List Defined Monitoring Templates.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDefinedMonitoringTemplatesResponse>
            listDefinedMonitoringTemplates(
                    ListDefinedMonitoringTemplatesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListDefinedMonitoringTemplatesRequest,
                                    ListDefinedMonitoringTemplatesResponse>
                            handler);

    /**
     * API to get all the logs of a Discovery Job.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDiscoveryJobLogsResponse> listDiscoveryJobLogs(
            ListDiscoveryJobLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobLogsRequest, ListDiscoveryJobLogsResponse>
                    handler);

    /**
     * API to get the details of all Discovery Jobs.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListDiscoveryJobsResponse> listDiscoveryJobs(
            ListDiscoveryJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDiscoveryJobsRequest, ListDiscoveryJobsResponse>
                    handler);

    /**
     * Returns a list of maintenance windows.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMaintenanceWindowsResponse> listMaintenanceWindows(
            ListMaintenanceWindowsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMaintenanceWindowsRequest, ListMaintenanceWindowsResponse>
                    handler);

    /**
     * Returns a list of metric extensions
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMetricExtensionsResponse> listMetricExtensions(
            ListMetricExtensionsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMetricExtensionsRequest, ListMetricExtensionsResponse>
                    handler);

    /**
     * Returns a list of stack monitoring resource tasks in the compartment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMonitoredResourceTasksResponse> listMonitoredResourceTasks(
            ListMonitoredResourceTasksRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoredResourceTasksRequest, ListMonitoredResourceTasksResponse>
                    handler);

    /**
     * Returns list of resource types accessible to the customer. There are two types of resource
     * types - System resource types and User resource types. System resource types are available
     * out of the box in the stack monitoring resource service and are accessible to all the tenant
     * users. User resource types are created in the context of a tenancy and are visible only for
     * the tenancy. By default, both System resource types and User resource types are returned.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMonitoredResourceTypesResponse> listMonitoredResourceTypes(
            ListMonitoredResourceTypesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoredResourceTypesRequest, ListMonitoredResourceTypesResponse>
                    handler);

    /**
     * Returns a list of monitored resources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMonitoredResourcesResponse> listMonitoredResources(
            ListMonitoredResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoredResourcesRequest, ListMonitoredResourcesResponse>
                    handler);

    /**
     * Returns a list of Monitoring Templates.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListMonitoringTemplatesResponse> listMonitoringTemplates(
            ListMonitoringTemplatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMonitoringTemplatesRequest, ListMonitoringTemplatesResponse>
                    handler);

    /**
     * API to get the details of all Process Sets.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListProcessSetsResponse> listProcessSets(
            ListProcessSetsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListProcessSetsRequest, ListProcessSetsResponse>
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
     * Each resource is assigned a license based on which features are enabled for it. User is
     * charged differently based on license. Specify the license type to be updated for the parent
     * resource in the topology. The license type value is propagated to the member resources as
     * well. Member resource is a resource which has \"contains\" association with the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ManageLicenseResponse> manageLicense(
            ManageLicenseRequest request,
            com.oracle.bmc.responses.AsyncHandler<ManageLicenseRequest, ManageLicenseResponse>
                    handler);

    /**
     * Publish the Metric Extension identified by the id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PublishMetricExtensionResponse> publishMetricExtension(
            PublishMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            PublishMetricExtensionRequest, PublishMetricExtensionResponse>
                    handler);

    /**
     * Gets resource count based on the aggregation criteria specified using \"groupBy\" parameter.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestMonitoredResourcesSummarizedCountResponse>
            requestMonitoredResourcesSummarizedCount(
                    RequestMonitoredResourcesSummarizedCountRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestMonitoredResourcesSummarizedCountRequest,
                                    RequestMonitoredResourcesSummarizedCountResponse>
                            handler);

    /**
     * Gets metric extension metrics count based on the aggregation criteria specified using request
     * body. Either metricExtensionId or compartmentId must be passed even when no other filter
     * property is passed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedMetricExtensionsMetricsResponse>
            requestSummarizedMetricExtensionsMetrics(
                    RequestSummarizedMetricExtensionsMetricsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedMetricExtensionsMetricsRequest,
                                    RequestSummarizedMetricExtensionsMetricsResponse>
                            handler);

    /**
     * Gets metric extension resources count based on the aggregation criteria specified using
     * request body. Either metricExtensionId or compartmentId should be passed, if no other
     * property is passed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedMetricExtensionsResourcesResponse>
            requestSummarizedMetricExtensionsResources(
                    RequestSummarizedMetricExtensionsResourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RequestSummarizedMetricExtensionsResourcesRequest,
                                    RequestSummarizedMetricExtensionsResourcesResponse>
                            handler);

    /**
     * Retry the last failed operation. The operation failed will be the most recent one. It won't
     * apply for previous failed operations.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RetryFailedMaintenanceWindowOperationResponse>
            retryFailedMaintenanceWindowOperation(
                    RetryFailedMaintenanceWindowOperationRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RetryFailedMaintenanceWindowOperationRequest,
                                    RetryFailedMaintenanceWindowOperationResponse>
                            handler);

    /**
     * List all associated resources recursively up-to a specified level, for the monitored
     * resources of type specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchAssociatedResourcesResponse> searchAssociatedResources(
            SearchAssociatedResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SearchAssociatedResourcesRequest, SearchAssociatedResourcesResponse>
                    handler);

    /**
     * Search associations in the given compartment based on the search criteria.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchMonitoredResourceAssociationsResponse>
            searchMonitoredResourceAssociations(
                    SearchMonitoredResourceAssociationsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SearchMonitoredResourceAssociationsRequest,
                                    SearchMonitoredResourceAssociationsResponse>
                            handler);

    /**
     * List the member resources for the given monitored resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchMonitoredResourceMembersResponse>
            searchMonitoredResourceMembers(
                    SearchMonitoredResourceMembersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SearchMonitoredResourceMembersRequest,
                                    SearchMonitoredResourceMembersResponse>
                            handler);

    /**
     * Gets a list of all monitored resources in a compartment for the given search criteria.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SearchMonitoredResourcesResponse> searchMonitoredResources(
            SearchMonitoredResourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SearchMonitoredResourcesRequest, SearchMonitoredResourcesResponse>
                    handler);

    /**
     * Stop a maintenance window before the end time is reached.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<StopMaintenanceWindowResponse> stopMaintenanceWindow(
            StopMaintenanceWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            StopMaintenanceWindowRequest, StopMaintenanceWindowResponse>
                    handler);

    /**
     * Performs test of Metric Extension on a specific resource Id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<TestMetricExtensionResponse> testMetricExtension(
            TestMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            TestMetricExtensionRequest, TestMetricExtensionResponse>
                    handler);

    /**
     * Unapply the Monitoring Template identified by the id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UnapplyMonitoringTemplateResponse> unapplyMonitoringTemplate(
            UnapplyMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UnapplyMonitoringTemplateRequest, UnapplyMonitoringTemplateResponse>
                    handler);

    /**
     * Update a Alarm Condition by identifier
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAlarmConditionResponse> updateAlarmCondition(
            UpdateAlarmConditionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAlarmConditionRequest, UpdateAlarmConditionResponse>
                    handler);

    /**
     * Provided tags will be added or updated in the existing list of tags for the affected
     * resources. Resources to be updated are identified based on association types specified. If
     * association types not specified, then tags will be updated only for the resource identified
     * by the given monitored resource identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAndPropagateTagsResponse> updateAndPropagateTags(
            UpdateAndPropagateTagsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateAndPropagateTagsRequest, UpdateAndPropagateTagsResponse>
                    handler);

    /**
     * Updates the Baseline-able metric for the given id
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateBaselineableMetricResponse> updateBaselineableMetric(
            UpdateBaselineableMetricRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateBaselineableMetricRequest, UpdateBaselineableMetricResponse>
                    handler);

    /**
     * Updates the configuration identified by the id given.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateConfigResponse> updateConfig(
            UpdateConfigRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateConfigRequest, UpdateConfigResponse>
                    handler);

    /**
     * Update maintenance window by the given identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMaintenanceWindowResponse> updateMaintenanceWindow(
            UpdateMaintenanceWindowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMaintenanceWindowRequest, UpdateMaintenanceWindowResponse>
                    handler);

    /**
     * Updates the Metric Extension
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMetricExtensionResponse> updateMetricExtension(
            UpdateMetricExtensionRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMetricExtensionRequest, UpdateMetricExtensionResponse>
                    handler);

    /**
     * Update monitored resource by the given identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). Note that
     * \"properties\" object, if specified, will entirely replace the existing object, as part this
     * operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMonitoredResourceResponse> updateMonitoredResource(
            UpdateMonitoredResourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoredResourceRequest, UpdateMonitoredResourceResponse>
                    handler);

    /**
     * Update stack monitoring resource task by the given identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMonitoredResourceTaskResponse> updateMonitoredResourceTask(
            UpdateMonitoredResourceTaskRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoredResourceTaskRequest, UpdateMonitoredResourceTaskResponse>
                    handler);

    /**
     * Update the Monitored Resource Type identified by the identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMonitoredResourceTypeResponse> updateMonitoredResourceType(
            UpdateMonitoredResourceTypeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoredResourceTypeRequest, UpdateMonitoredResourceTypeResponse>
                    handler);

    /**
     * Updates the Monitoring Template
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateMonitoringTemplateResponse> updateMonitoringTemplate(
            UpdateMonitoringTemplateRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateMonitoringTemplateRequest, UpdateMonitoringTemplateResponse>
                    handler);

    /**
     * API to update a Process Set identified by a given ocid.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateProcessSetResponse> updateProcessSet(
            UpdateProcessSetRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateProcessSetRequest, UpdateProcessSetResponse>
                    handler);
}
