/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for instances in OCI,
 * your private data center, or 3rd-party clouds. For more information, see [Overview of OS
 * Management Hub](https://docs.oracle.com/iaas/osmh/doc/overview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface LifecycleEnvironmentAsync extends AutoCloseable {

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
     * Attaches (adds) managed instances to a lifecycle stage. Once added, you can apply operations
     * to all managed instances in the lifecycle stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachManagedInstancesToLifecycleStageResponse>
            attachManagedInstancesToLifecycleStage(
                    AttachManagedInstancesToLifecycleStageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstancesToLifecycleStageRequest,
                                    AttachManagedInstancesToLifecycleStageResponse>
                            handler);

    /**
     * Moves a lifecycle environment into a different compartment within the same tenancy. For
     * information about moving resources between compartments, see [Moving Resources to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeLifecycleEnvironmentCompartmentResponse>
            changeLifecycleEnvironmentCompartment(
                    ChangeLifecycleEnvironmentCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeLifecycleEnvironmentCompartmentRequest,
                                    ChangeLifecycleEnvironmentCompartmentResponse>
                            handler);

    /**
     * Creates a lifecycle environment. A lifecycle environment is a user-defined pipeline to
     * deliver curated, versioned content in a prescribed, methodical manner.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateLifecycleEnvironmentResponse> createLifecycleEnvironment(
            CreateLifecycleEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateLifecycleEnvironmentRequest, CreateLifecycleEnvironmentResponse>
                    handler);

    /**
     * Deletes the specified lifecycle environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteLifecycleEnvironmentResponse> deleteLifecycleEnvironment(
            DeleteLifecycleEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteLifecycleEnvironmentRequest, DeleteLifecycleEnvironmentResponse>
                    handler);

    /**
     * Detaches (removes) a managed instance from a lifecycle stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachManagedInstancesFromLifecycleStageResponse>
            detachManagedInstancesFromLifecycleStage(
                    DetachManagedInstancesFromLifecycleStageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstancesFromLifecycleStageRequest,
                                    DetachManagedInstancesFromLifecycleStageResponse>
                            handler);

    /**
     * Gets information about the specified lifecycle environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLifecycleEnvironmentResponse> getLifecycleEnvironment(
            GetLifecycleEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLifecycleEnvironmentRequest, GetLifecycleEnvironmentResponse>
                    handler);

    /**
     * Returns information about the specified lifecycle stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetLifecycleStageResponse> getLifecycleStage(
            GetLifecycleStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetLifecycleStageRequest, GetLifecycleStageResponse>
                    handler);

    /**
     * Lists lifecycle environments that match the specified compartment or lifecycle environment
     * OCID. Filter the list against a variety of criteria including but not limited to its name,
     * status, architecture, and OS family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLifecycleEnvironmentsResponse> listLifecycleEnvironments(
            ListLifecycleEnvironmentsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLifecycleEnvironmentsRequest, ListLifecycleEnvironmentsResponse>
                    handler);

    /**
     * Lists installed packages on managed instances in a specified lifecycle stage. Filter the list
     * against a variety of criteria including but not limited to the package name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLifecycleStageInstalledPackagesResponse>
            listLifecycleStageInstalledPackages(
                    ListLifecycleStageInstalledPackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListLifecycleStageInstalledPackagesRequest,
                                    ListLifecycleStageInstalledPackagesResponse>
                            handler);

    /**
     * Lists lifecycle stages that match the specified compartment or lifecycle stage
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter the
     * list against
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListLifecycleStagesResponse> listLifecycleStages(
            ListLifecycleStagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListLifecycleStagesRequest, ListLifecycleStagesResponse>
                    handler);

    /**
     * Updates the versioned custom software source content to the specified lifecycle stage. A
     * versioned custom software source OCID (softwareSourceId) is required when promoting content
     * to the first lifecycle stage. You must promote content to the first stage before promoting to
     * subsequent stages, otherwise the service returns an error. The softwareSourceId is optional
     * when promoting content to the second, third, forth, or fifth stages. If you provide a
     * softwareSourceId, the service validates that it matches the softwareSourceId of the previous
     * stage. If it does not match, the service returns an error. If you don't provide a
     * softwareSourceId, the service promotes the versioned software source from the previous
     * lifecycle stage. If the previous lifecycle stage has no software source, the service returns
     * an error.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<PromoteSoftwareSourceToLifecycleStageResponse>
            promoteSoftwareSourceToLifecycleStage(
                    PromoteSoftwareSourceToLifecycleStageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    PromoteSoftwareSourceToLifecycleStageRequest,
                                    PromoteSoftwareSourceToLifecycleStageResponse>
                            handler);

    /**
     * Reboots all managed instances in the specified lifecycle stage.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RebootLifecycleStageResponse> rebootLifecycleStage(
            RebootLifecycleStageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RebootLifecycleStageRequest, RebootLifecycleStageResponse>
                    handler);

    /**
     * Updates the specified lifecycle environment's name, description, stages, or tags.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateLifecycleEnvironmentResponse> updateLifecycleEnvironment(
            UpdateLifecycleEnvironmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateLifecycleEnvironmentRequest, UpdateLifecycleEnvironmentResponse>
                    handler);
}
