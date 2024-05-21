/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement;

import com.oracle.bmc.osmanagement.requests.*;
import com.oracle.bmc.osmanagement.responses.*;

/**
 * API for the OS Management service. Use these API operations for working
 * with Managed instances and Managed instance groups.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public interface OsManagementAsync extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

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
     * Determines whether realm specific endpoint should be used or not.
     * Set realmSpecificEndpointTemplateEnabled to "true" if the user wants to enable use of realm specific endpoint template, otherwise set it to "false"
     * @param realmSpecificEndpointTemplateEnabled flag to enable the use of realm specific endpoint template
     */
    void useRealmSpecificEndpointTemplate(boolean realmSpecificEndpointTemplateEnabled);

    /**
     * Adds a given list of Software Packages to a specific Software Source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddPackagesToSoftwareSourceResponse> addPackagesToSoftwareSource(
            AddPackagesToSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddPackagesToSoftwareSourceRequest, AddPackagesToSoftwareSourceResponse>
                    handler);

    /**
     * Adds a child software source to a managed instance. After the software
     * source has been added, then packages from that software source can be
     * installed on the managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachChildSoftwareSourceToManagedInstanceResponse>
            attachChildSoftwareSourceToManagedInstance(
                    AttachChildSoftwareSourceToManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachChildSoftwareSourceToManagedInstanceRequest,
                                    AttachChildSoftwareSourceToManagedInstanceResponse>
                            handler);

    /**
     * Adds a Managed Instance to a Managed Instance Group. After the Managed
     * Instance has been added, then operations can be performed on the Managed
     * Instance Group which will then apply to all Managed Instances in the
     * group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachManagedInstanceToManagedInstanceGroupResponse>
            attachManagedInstanceToManagedInstanceGroup(
                    AttachManagedInstanceToManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstanceToManagedInstanceGroupRequest,
                                    AttachManagedInstanceToManagedInstanceGroupResponse>
                            handler);

    /**
     * Adds a parent software source to a managed instance. After the software
     * source has been added, then packages from that software source can be
     * installed on the managed instance. Software sources that have this
     * software source as a parent will be able to be added to this managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachParentSoftwareSourceToManagedInstanceResponse>
            attachParentSoftwareSourceToManagedInstance(
                    AttachParentSoftwareSourceToManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachParentSoftwareSourceToManagedInstanceRequest,
                                    AttachParentSoftwareSourceToManagedInstanceResponse>
                            handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagedInstanceGroupCompartmentResponse>
            changeManagedInstanceGroupCompartment(
                    ChangeManagedInstanceGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedInstanceGroupCompartmentRequest,
                                    ChangeManagedInstanceGroupCompartmentResponse>
                            handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeScheduledJobCompartmentResponse>
            changeScheduledJobCompartment(
                    ChangeScheduledJobCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeScheduledJobCompartmentRequest,
                                    ChangeScheduledJobCompartmentResponse>
                            handler);

    /**
     * Moves a resource into a different compartment. When provided, If-Match
     * is checked against ETag values of the resource.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeSoftwareSourceCompartmentResponse>
            changeSoftwareSourceCompartment(
                    ChangeSoftwareSourceCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeSoftwareSourceCompartmentRequest,
                                    ChangeSoftwareSourceCompartmentResponse>
                            handler);

    /**
     * Creates a new Managed Instance Group on the management system.
     * This will not contain any managed instances after it is first created,
     * and they must be added later.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagedInstanceGroupResponse> createManagedInstanceGroup(
            CreateManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedInstanceGroupRequest, CreateManagedInstanceGroupResponse>
                    handler);

    /**
     * Creates a new Scheduled Job to perform a specific package operation on
     * a set of managed instances or managed instance groups.  Can be created
     * as a one-time execution in the future, or as a recurring execution
     * that repeats on a defined interval.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateScheduledJobResponse> createScheduledJob(
            CreateScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateScheduledJobRequest, CreateScheduledJobResponse>
                    handler);

    /**
     * Creates a new custom Software Source on the management system.
     * This will not contain any packages after it is first created,
     * and they must be added later.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateSoftwareSourceResponse> createSoftwareSource(
            CreateSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateSoftwareSourceRequest, CreateSoftwareSourceResponse>
                    handler);

    /**
     * Deletes a Managed Instance Group from the management system
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagedInstanceGroupResponse> deleteManagedInstanceGroup(
            DeleteManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedInstanceGroupRequest, DeleteManagedInstanceGroupResponse>
                    handler);

    /**
     * Cancels an existing Scheduled Job on the management system
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteScheduledJobResponse> deleteScheduledJob(
            DeleteScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteScheduledJobRequest, DeleteScheduledJobResponse>
                    handler);

    /**
     * Deletes a custom Software Source on the management system
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteSoftwareSourceResponse> deleteSoftwareSource(
            DeleteSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteSoftwareSourceRequest, DeleteSoftwareSourceResponse>
                    handler);

    /**
     * Removes a child software source from a managed instance. Packages will no longer be able to be
     * installed from these software sources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachChildSoftwareSourceFromManagedInstanceResponse>
            detachChildSoftwareSourceFromManagedInstance(
                    DetachChildSoftwareSourceFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachChildSoftwareSourceFromManagedInstanceRequest,
                                    DetachChildSoftwareSourceFromManagedInstanceResponse>
                            handler);

    /**
     * Removes a Managed Instance from a Managed Instance Group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachManagedInstanceFromManagedInstanceGroupResponse>
            detachManagedInstanceFromManagedInstanceGroup(
                    DetachManagedInstanceFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstanceFromManagedInstanceGroupRequest,
                                    DetachManagedInstanceFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Removes a software source from a managed instance. All child software sources will also be removed
     * from the managed instance. Packages will no longer be able to be installed from these software sources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachParentSoftwareSourceFromManagedInstanceResponse>
            detachParentSoftwareSourceFromManagedInstance(
                    DetachParentSoftwareSourceFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachParentSoftwareSourceFromManagedInstanceRequest,
                                    DetachParentSoftwareSourceFromManagedInstanceResponse>
                            handler);

    /**
     * Disables a module stream on a managed instance.  After the stream is
     * disabled, it is no longer possible to install the profiles that are
     * contained by the stream.  All installed profiles must be removed prior
     * to disabling a module stream.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>
            disableModuleStreamOnManagedInstance(
                    DisableModuleStreamOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceRequest,
                                    DisableModuleStreamOnManagedInstanceResponse>
                            handler);

    /**
     * Enables a module stream on a managed instance.  After the stream is
     * enabled, it is possible to install the profiles that are contained
     * by the stream.  Enabling a stream that is already enabled will
     * succeed.  Attempting to enable a different stream for a module that
     * already has a stream enabled results in an error.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>
            enableModuleStreamOnManagedInstance(
                    EnableModuleStreamOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceRequest,
                                    EnableModuleStreamOnManagedInstanceResponse>
                            handler);

    /**
     * Returns a specific erratum.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetErratumResponse> getErratum(
            GetErratumRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetErratumRequest, GetErratumResponse> handler);

    /**
     * Returns a specific Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedInstanceResponse> getManagedInstance(
            GetManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceRequest, GetManagedInstanceResponse>
                    handler);

    /**
     * Returns a specific Managed Instance Group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedInstanceGroupResponse> getManagedInstanceGroup(
            GetManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
                    handler);

    /**
     * Retrieve a detailed description of a module stream from a software source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetModuleStreamResponse> getModuleStream(
            GetModuleStreamRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetModuleStreamRequest, GetModuleStreamResponse>
                    handler);

    /**
     * Retrieve a detailed description of a module stream profile from a software source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetModuleStreamProfileResponse> getModuleStreamProfile(
            GetModuleStreamProfileRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetModuleStreamProfileRequest, GetModuleStreamProfileResponse>
                    handler);

    /**
     * Gets the detailed information for the Scheduled Job with the given ID.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetScheduledJobResponse> getScheduledJob(
            GetScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetScheduledJobRequest, GetScheduledJobResponse>
                    handler);

    /**
     * Returns a specific Software Package.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwarePackageResponse> getSoftwarePackage(
            GetSoftwarePackageRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwarePackageRequest, GetSoftwarePackageResponse>
                    handler);

    /**
     * Returns a specific Software Source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetSoftwareSourceResponse> getSoftwareSource(
            GetSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetSoftwareSourceRequest, GetSoftwareSourceResponse>
                    handler);

    /**
     * Returns a Windows Update object.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWindowsUpdateResponse> getWindowsUpdate(
            GetWindowsUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                    handler);

    /**
     * Gets the detailed information for the work request with the given ID.
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
     * Install all of the available package updates for the managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallAllPackageUpdatesOnManagedInstanceResponse>
            installAllPackageUpdatesOnManagedInstance(
                    InstallAllPackageUpdatesOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllPackageUpdatesOnManagedInstanceRequest,
                                    InstallAllPackageUpdatesOnManagedInstanceResponse>
                            handler);

    /**
     * Install all of the available updates for the Managed Instance Group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallAllUpdatesOnManagedInstanceGroupResponse>
            installAllUpdatesOnManagedInstanceGroup(
                    InstallAllUpdatesOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllUpdatesOnManagedInstanceGroupRequest,
                                    InstallAllUpdatesOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Install all of the available Windows updates for the managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallAllWindowsUpdatesOnManagedInstanceResponse>
            installAllWindowsUpdatesOnManagedInstance(
                    InstallAllWindowsUpdatesOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllWindowsUpdatesOnManagedInstanceRequest,
                                    InstallAllWindowsUpdatesOnManagedInstanceResponse>
                            handler);

    /**
     * Installs a profile for an module stream.  The stream must be
     * enabled before a profile can be installed.  If a module stream
     * defines multiple profiles, each one can be installed independently.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceResponse>
            installModuleStreamProfileOnManagedInstance(
                    InstallModuleStreamProfileOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceRequest,
                                    InstallModuleStreamProfileOnManagedInstanceResponse>
                            handler);

    /**
     * Installs a package on a managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallPackageOnManagedInstanceResponse>
            installPackageOnManagedInstance(
                    InstallPackageOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackageOnManagedInstanceRequest,
                                    InstallPackageOnManagedInstanceResponse>
                            handler);

    /**
     * Updates a package on a managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallPackageUpdateOnManagedInstanceResponse>
            installPackageUpdateOnManagedInstance(
                    InstallPackageUpdateOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackageUpdateOnManagedInstanceRequest,
                                    InstallPackageUpdateOnManagedInstanceResponse>
                            handler);

    /**
     * Installs a Windows update on a managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallWindowsUpdateOnManagedInstanceResponse>
            installWindowsUpdateOnManagedInstance(
                    InstallWindowsUpdateOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdateOnManagedInstanceRequest,
                                    InstallWindowsUpdateOnManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of packages available for install on the Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailablePackagesForManagedInstanceResponse>
            listAvailablePackagesForManagedInstance(
                    ListAvailablePackagesForManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailablePackagesForManagedInstanceRequest,
                                    ListAvailablePackagesForManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of available software sources for a Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableSoftwareSourcesForManagedInstanceResponse>
            listAvailableSoftwareSourcesForManagedInstance(
                    ListAvailableSoftwareSourcesForManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableSoftwareSourcesForManagedInstanceRequest,
                                    ListAvailableSoftwareSourcesForManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of available updates for a Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableUpdatesForManagedInstanceResponse>
            listAvailableUpdatesForManagedInstance(
                    ListAvailableUpdatesForManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableUpdatesForManagedInstanceRequest,
                                    ListAvailableUpdatesForManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of available Windows updates for a Managed Instance. This is only applicable to Windows instances.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAvailableWindowsUpdatesForManagedInstanceResponse>
            listAvailableWindowsUpdatesForManagedInstance(
                    ListAvailableWindowsUpdatesForManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListAvailableWindowsUpdatesForManagedInstanceRequest,
                                    ListAvailableWindowsUpdatesForManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of all of the currently available Errata in the system
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListErrataResponse> listErrata(
            ListErrataRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListErrataRequest, ListErrataResponse> handler);

    /**
     * Returns a list of errata relevant to the Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceErrataResponse> listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                    handler);

    /**
     * Returns a list of all Managed Instance Groups.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupsResponse> listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>
                    handler);

    /**
     * Returns a list of all Managed Instances.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstancesResponse> listManagedInstances(
            ListManagedInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstancesRequest, ListManagedInstancesResponse>
                    handler);

    /**
     * Retrieve a list of module stream profiles from a software source.
     * Filters may be applied to select a subset of module stream profiles
     * based on the filter criteria.
     * <p>
     * The \"moduleName\", \"streamName\", and \"profileName\" attributes combine
     * to form a set of filters on the list of module stream profiles.  If
     * a \"moduleName\" is provided, only profiles that belong to that module
     * are returned.  If both a \"moduleName\" and \"streamName\" are given,
     * only profiles belonging to that module stream are returned.  Finally,
     * if all three are given then only the particular profile indicated
     * by the triple is returned.  It is not valid to supply a \"streamName\"
     * without a \"moduleName\".  It is also not valid to supply a \"profileName\"
     * without a \"streamName\".
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListModuleStreamProfilesResponse> listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamProfilesRequest, ListModuleStreamProfilesResponse>
                    handler);

    /**
     * Retrieve a list of module stream profiles, along with a summary of their
     * of their status, from a managed instance.  Filters may be applied to
     * select a subset of profiles based on the filter criteria.
     * <p>
     * The \"moduleName\", \"streamName\", and \"profileName\" attributes combine
     * to form a set of filters on the list of module stream profiles.  If
     * a \"modulName\" is provided, only profiles that belong to that module
     * are returned.  If both a \"moduleName\" and \"streamName\" are given,
     * only profiles belonging to that module stream are returned.  Finally,
     * if all three are given then only the particular profile indicated
     * by the triple is returned.  It is not valid to supply a \"streamName\"
     * without a \"moduleName\".  It is also not valid to supply a \"profileName\"
     * without a \"streamName\".
     * <p>
     * The \"status\" attribute filters against the state of a module stream
     * profile.  Valid values are \"INSTALLED\" and \"AVAILABLE\".  If the
     * attribute is set to \"INSTALLED\", only module stream profiles that
     * are installed are included in the result set.  If the attribute is
     * set to \"AVAILABLE\", only module stream profiles that are not
     * installed are included in the result set.  If the attribute is not
     * defined, the request is not subject to this filter.
     * <p>
     * When sorting by display name, the result set is sorted first by
     * module name, then by stream name, and finally by profile name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListModuleStreamProfilesOnManagedInstanceResponse>
            listModuleStreamProfilesOnManagedInstance(
                    ListModuleStreamProfilesOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListModuleStreamProfilesOnManagedInstanceRequest,
                                    ListModuleStreamProfilesOnManagedInstanceResponse>
                            handler);

    /**
     * Retrieve a list of module streams from a software source.
     * Filters may be applied to select a subset of module streams
     * based on the filter criteria.
     * <p>
     * The 'moduleName' attribute filters against the name of a module.
     * It accepts strings of the format \"<module>\".  If this attribute
     * is defined, only streams that belong to the specified module are
     * included in the result set.  If it is not defined, the request is
     * not subject to this filter.  The 'streamName' attribute filters
     * against the name of a stream of a module.  If this attribute is
     * defined, only the particular module stream that matches both the
     * module and stream names is included in the result set.  It is
     * not valid to supply 'streamName' without also supplying a
     * 'moduleName'.
     * <p>
     * When sorting by display name, the result set is sorted first by
     * module name, then by stream name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListModuleStreamsResponse> listModuleStreams(
            ListModuleStreamsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListModuleStreamsRequest, ListModuleStreamsResponse>
                    handler);

    /**
     * Retrieve a list of module streams, along with a summary of their
     * status, from a managed instance.  Filters may be applied to select
     * a subset of module streams based on the filter criteria.
     * <p>
     * The 'moduleName' attribute filters against the name of a module.
     * It accepts strings of the format \"<module>\".  If this attribute
     * is defined, only streams that belong to the specified module are
     * included in the result set.  If it is not defined, the request is
     * not subject to this filter.
     * <p>
     * The \"status\" attribute filters against the state of a module stream.
     * Valid values are \"ENABLED\", \"DISABLED\", and \"ACTIVE\".  If the
     * attribute is set to \"ENABLED\", only module streams that are enabled
     * are included in the result set.  If the attribute is set to \"DISABLED\",
     * only module streams that are not enabled are included in the result
     * set.  If the attribute is set to \"ACTIVE\", only module streams that
     * are active are included in the result set.  If the attribute is not
     * defined, the request is not subject to this filter.
     * <p>
     * When sorting by the display name, the result set is sorted first
     * by the module name and then by the stream name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListModuleStreamsOnManagedInstanceResponse>
            listModuleStreamsOnManagedInstance(
                    ListModuleStreamsOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListModuleStreamsOnManagedInstanceRequest,
                                    ListModuleStreamsOnManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of installed packages on the Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListPackagesInstalledOnManagedInstanceResponse>
            listPackagesInstalledOnManagedInstance(
                    ListPackagesInstalledOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListPackagesInstalledOnManagedInstanceRequest,
                                    ListPackagesInstalledOnManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of all of the currently active Scheduled Jobs in the system
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListScheduledJobsResponse> listScheduledJobs(
            ListScheduledJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListScheduledJobsRequest, ListScheduledJobsResponse>
                    handler);

    /**
     * Lists Software Packages in a Software Source
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwareSourcePackagesResponse> listSoftwareSourcePackages(
            ListSoftwareSourcePackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcePackagesRequest, ListSoftwareSourcePackagesResponse>
                    handler);

    /**
     * Returns a list of all Software Sources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSoftwareSourcesResponse> listSoftwareSources(
            ListSoftwareSourcesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListSoftwareSourcesRequest, ListSoftwareSourcesResponse>
                    handler);

    /**
     * Returns a list of all of the Scheduled Jobs whose next execution time is at or before the specified time.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListUpcomingScheduledJobsResponse> listUpcomingScheduledJobs(
            ListUpcomingScheduledJobsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListUpcomingScheduledJobsRequest, ListUpcomingScheduledJobsResponse>
                    handler);

    /**
     * Returns a list of Windows Updates.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWindowsUpdatesResponse> listWindowsUpdates(
            ListWindowsUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                    handler);

    /**
     * Returns a list of installed Windows updates for a Managed Instance. This is only applicable to Windows instances.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWindowsUpdatesInstalledOnManagedInstanceResponse>
            listWindowsUpdatesInstalledOnManagedInstance(
                    ListWindowsUpdatesInstalledOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListWindowsUpdatesInstalledOnManagedInstanceRequest,
                                    ListWindowsUpdatesInstalledOnManagedInstanceResponse>
                            handler);

    /**
     * Gets the errors for the work request with the given ID.
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
     * Lists the log entries for the work request with the given ID.
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
     * Perform an operation involving modules, streams, and profiles on a
     * managed instance.  Each operation may enable or disable an arbitrary
     * amount of module streams, and install or remove an arbitrary number
     * of module stream profiles.  When the operation is complete, the
     * state of the modules, streams, and profiles on the managed instance
     * will match the state indicated in the operation.
     * <p>
     * Each module stream specified in the list of module streams to enable
     * will be in the \"ENABLED\" state upon completion of the operation.
     * If there was already a stream of that module enabled, any work
     * required to switch from the current stream to the new stream is
     * performed implicitly.
     * <p>
     * Each module stream specified in the list of module streams to disable
     * will be in the \"DISABLED\" state upon completion of the operation.
     * Any profiles that are installed for the module stream will be removed
     * as part of the operation.
     * <p>
     * Each module stream profile specified in the list of profiles to install
     * will be in the \"INSTALLED\" state upon completion of the operation,
     * indicating that any packages that are part of the profile are installed
     * on the managed instance.  If the module stream containing the profile
     * is not enabled, it will be enabled as part of the operation.  There
     * is an exception when attempting to install a stream of a profile when
     * another stream of the same module is enabled.  It is an error to attempt
     * to install a profile of another module stream, unless enabling the
     * new module stream is explicitly included in this operation.
     * <p>
     * Each module stream profile specified in the list of profiles to remove
     * will be in the \"AVAILABLE\" state upon completion of the operation.
     * The status of packages within the profile after the operation is
     * complete is defined by the package manager on the managed instance.
     * <p>
     * Operations that contain one or more elements that are not allowed
     * are rejected.
     * <p>
     * The result of this request is a WorkRequest object.  The returned
     * WorkRequest is the parent of a structure of other WorkRequests.  Taken
     * as a whole, this structure indicates the entire set of work to be
     * performed to complete the operation.
     * <p>
     * This interface can also be used to perform a dry run of the operation
     * rather than committing it to a managed instance.  If a dry run is
     * requested, the OS Management Service will evaluate the operation
     * against the current module, stream, and profile state on the managed
     * instance.  It will calculate the impact of the operation on all
     * modules, streams, and profiles on the managed instance, including those
     * that are implicitly impacted by the operation.
     * <p>
     * The WorkRequest resulting from a dry run behaves differently than
     * a WorkRequest resulting from a committable operation.  Dry run
     * WorkRequests are always singletons and never have children.  The
     * impact of the operation is returned using the log and error
     * facilities of WorkRequests.  The impact of operations that are
     * allowed by the OS Management Service are communicated as one or
     * more work request log entries.  Operations that are not allowed
     * by the OS Management Service are communicated as one or more
     * work requst error entries.  Each entry, for either logs or errors,
     * contains a structured message containing the results of one
     * or more operations.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>
            manageModuleStreamsOnManagedInstance(
                    ManageModuleStreamsOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceRequest,
                                    ManageModuleStreamsOnManagedInstanceResponse>
                            handler);

    /**
     * Removes a profile for a module stream that is installed on a managed instance.
     * If a module stream is provided, rather than a fully qualified profile, all
     * profiles that have been installed for the module stream will be removed.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceResponse>
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceResponse>
                            handler);

    /**
     * Removes an installed package from a managed instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackageFromManagedInstanceResponse>
            removePackageFromManagedInstance(
                    RemovePackageFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackageFromManagedInstanceRequest,
                                    RemovePackageFromManagedInstanceResponse>
                            handler);

    /**
     * Removes a given list of Software Packages from a specific Software Source.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackagesFromSoftwareSourceResponse>
            removePackagesFromSoftwareSource(
                    RemovePackagesFromSoftwareSourceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromSoftwareSourceRequest,
                                    RemovePackagesFromSoftwareSourceResponse>
                            handler);

    /**
     * This will trigger an already created Scheduled Job to being executing
     * immediately instead of waiting for its next regularly scheduled time.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RunScheduledJobNowResponse> runScheduledJobNow(
            RunScheduledJobNowRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RunScheduledJobNowRequest, RunScheduledJobNowResponse>
                    handler);

    /**
     * Searches all of the available Software Sources and returns any/all Software Packages matching
     * the search criteria.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SearchSoftwarePackagesResponse> searchSoftwarePackages(
            SearchSoftwarePackagesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SearchSoftwarePackagesRequest, SearchSoftwarePackagesResponse>
                    handler);

    /**
     * This will force an already created Scheduled Job to skip its
     * next regularly scheduled execution
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SkipNextScheduledJobExecutionResponse>
            skipNextScheduledJobExecution(
                    SkipNextScheduledJobExecutionRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SkipNextScheduledJobExecutionRequest,
                                    SkipNextScheduledJobExecutionResponse>
                            handler);

    /**
     * Enables a new stream for a module that already has a stream enabled.
     * If any profiles or packages from the original module are installed,
     * switching to a new stream will remove the existing packages and
     * install their counterparts in the new stream.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>
            switchModuleStreamOnManagedInstance(
                    SwitchModuleStreamOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceRequest,
                                    SwitchModuleStreamOnManagedInstanceResponse>
                            handler);

    /**
     * Updates a specific Managed Instance.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedInstanceResponse> updateManagedInstance(
            UpdateManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                    handler);

    /**
     * Updates a specific Managed Instance Group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedInstanceGroupResponse> updateManagedInstanceGroup(
            UpdateManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceGroupRequest, UpdateManagedInstanceGroupResponse>
                    handler);

    /**
     * Updates an existing Scheduled Job on the management system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateScheduledJobResponse> updateScheduledJob(
            UpdateScheduledJobRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateScheduledJobRequest, UpdateScheduledJobResponse>
                    handler);

    /**
     * Updates an existing custom Software Source on the management system.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateSoftwareSourceResponse> updateSoftwareSource(
            UpdateSoftwareSourceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateSoftwareSourceRequest, UpdateSoftwareSourceResponse>
                    handler);
}
