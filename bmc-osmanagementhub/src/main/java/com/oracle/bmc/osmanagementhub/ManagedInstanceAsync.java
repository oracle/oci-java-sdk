/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for instances in OCI,
 * your private data center, or 3rd-party clouds. For more information, see [Overview of OS
 * Management Hub](https://docs.cloud.oracle.com/iaas/osmh/doc/overview.htm).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface ManagedInstanceAsync extends AutoCloseable {

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
     * Adds profile to a managed instance. After the profile has been added, the instance can be
     * registered as a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachProfileToManagedInstanceResponse>
            attachProfileToManagedInstance(
                    AttachProfileToManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachProfileToManagedInstanceRequest,
                                    AttachProfileToManagedInstanceResponse>
                            handler);

    /**
     * Adds software sources to a managed instance. After the software source has been added, then
     * packages from that software source can be installed on the managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachSoftwareSourcesToManagedInstanceResponse>
            attachSoftwareSourcesToManagedInstance(
                    AttachSoftwareSourcesToManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachSoftwareSourcesToManagedInstanceRequest,
                                    AttachSoftwareSourcesToManagedInstanceResponse>
                            handler);

    /**
     * Unregisters the specified managed instance from the service. Once unregistered, the service
     * will no longer manage the instance. For Linux instances, yum or DNF repository files will be
     * restored to their state prior to registration.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagedInstanceResponse> deleteManagedInstance(
            DeleteManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedInstanceRequest, DeleteManagedInstanceResponse>
                    handler);

    /**
     * Detaches profile from a managed instance. After the profile has been removed, the instance
     * cannot be registered as a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachProfileFromManagedInstanceResponse>
            detachProfileFromManagedInstance(
                    DetachProfileFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachProfileFromManagedInstanceRequest,
                                    DetachProfileFromManagedInstanceResponse>
                            handler);

    /**
     * Removes software sources from a managed instance. Packages will no longer be able to be
     * installed from these software sources.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachSoftwareSourcesFromManagedInstanceResponse>
            detachSoftwareSourcesFromManagedInstance(
                    DetachSoftwareSourcesFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachSoftwareSourcesFromManagedInstanceRequest,
                                    DetachSoftwareSourcesFromManagedInstanceResponse>
                            handler);

    /**
     * Disables a module stream on a managed instance. After the stream is disabled, it is no longer
     * possible to install the profiles that are contained by the stream. All installed profiles
     * must be removed prior to disabling a module stream.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceResponse>
            disableModuleStreamOnManagedInstance(
                    DisableModuleStreamOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceRequest,
                                    DisableModuleStreamOnManagedInstanceResponse>
                            handler);

    /**
     * Enables a module stream on a managed instance. After the stream is enabled, it is possible to
     * install the profiles that are contained by the stream. Enabling a stream that is already
     * enabled will succeed. Attempting to enable a different stream for a module that already has a
     * stream enabled results in an error.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceResponse>
            enableModuleStreamOnManagedInstance(
                    EnableModuleStreamOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceRequest,
                                    EnableModuleStreamOnManagedInstanceResponse>
                            handler);

    /**
     * Gets information about the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedInstanceResponse> getManagedInstance(
            GetManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceRequest, GetManagedInstanceResponse>
                    handler);

    /**
     * Returns a Windows Update object.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetWindowsUpdateResponse> getWindowsUpdate(
            GetWindowsUpdateRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWindowsUpdateRequest, GetWindowsUpdateResponse>
                    handler);

    /**
     * Installs all of the available Windows updates for managed instances in a compartment. This
     * applies only to standalone Windows instances. This will not update instances that belong to a
     * group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>
            installAllWindowsUpdatesOnManagedInstancesInCompartment(
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest,
                                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse>
                            handler);

    /**
     * Installs a profile for an module stream. The stream must be enabled before a profile can be
     * installed. If a module stream defines multiple profiles, each one can be installed
     * independently.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceResponse>
            installModuleStreamProfileOnManagedInstance(
                    InstallModuleStreamProfileOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceRequest,
                                    InstallModuleStreamProfileOnManagedInstanceResponse>
                            handler);

    /**
     * Installs packages on a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallPackagesOnManagedInstanceResponse>
            installPackagesOnManagedInstance(
                    InstallPackagesOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackagesOnManagedInstanceRequest,
                                    InstallPackagesOnManagedInstanceResponse>
                            handler);

    /**
     * Installs Windows updates on the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallWindowsUpdatesOnManagedInstanceResponse>
            installWindowsUpdatesOnManagedInstance(
                    InstallWindowsUpdatesOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdatesOnManagedInstanceRequest,
                                    InstallWindowsUpdatesOnManagedInstanceResponse>
                            handler);

    /**
     * Returns a list of packages that are available for installation on a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceAvailablePackagesResponse>
            listManagedInstanceAvailablePackages(
                    ListManagedInstanceAvailablePackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceAvailablePackagesRequest,
                                    ListManagedInstanceAvailablePackagesResponse>
                            handler);

    /**
     * Returns a list of software sources that can be attached to the specified managed instance.
     * Any software sources already attached to the instance are not included in the list.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceAvailableSoftwareSourcesResponse>
            listManagedInstanceAvailableSoftwareSources(
                    ListManagedInstanceAvailableSoftwareSourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceAvailableSoftwareSourcesRequest,
                                    ListManagedInstanceAvailableSoftwareSourcesResponse>
                            handler);

    /**
     * Returns a list of Windows updates that can be installed on the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceAvailableWindowsUpdatesResponse>
            listManagedInstanceAvailableWindowsUpdates(
                    ListManagedInstanceAvailableWindowsUpdatesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceAvailableWindowsUpdatesRequest,
                                    ListManagedInstanceAvailableWindowsUpdatesResponse>
                            handler);

    /**
     * Returns a list of applicable errata on the managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceErrataResponse> listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceErrataRequest, ListManagedInstanceErrataResponse>
                    handler);

    /**
     * Lists the packages that are installed on the managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceInstalledPackagesResponse>
            listManagedInstanceInstalledPackages(
                    ListManagedInstanceInstalledPackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceInstalledPackagesRequest,
                                    ListManagedInstanceInstalledPackagesResponse>
                            handler);

    /**
     * Returns a list of Windows updates that have been installed on the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceInstalledWindowsUpdatesResponse>
            listManagedInstanceInstalledWindowsUpdates(
                    ListManagedInstanceInstalledWindowsUpdatesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceInstalledWindowsUpdatesRequest,
                                    ListManagedInstanceInstalledWindowsUpdatesResponse>
                            handler);

    /**
     * Retrieves a list of modules, along with streams of the modules, from a managed instance.
     * Filters may be applied to select a subset of modules based on the filter criteria.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceModulesResponse> listManagedInstanceModules(
            ListManagedInstanceModulesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceModulesRequest, ListManagedInstanceModulesResponse>
                    handler);

    /**
     * Returns a list of updatable packages for a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceUpdatablePackagesResponse>
            listManagedInstanceUpdatablePackages(
                    ListManagedInstanceUpdatablePackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceUpdatablePackagesRequest,
                                    ListManagedInstanceUpdatablePackagesResponse>
                            handler);

    /**
     * Lists managed instances that match the specified compartment or managed instance OCID. Filter
     * the list against a variety of criteria including but not limited to its name, status,
     * architecture, and OS version.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstancesResponse> listManagedInstances(
            ListManagedInstancesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstancesRequest, ListManagedInstancesResponse>
                    handler);

    /**
     * Lists Windows updates that have been reported to the service.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListWindowsUpdatesResponse> listWindowsUpdates(
            ListWindowsUpdatesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWindowsUpdatesRequest, ListWindowsUpdatesResponse>
                    handler);

    /**
     * Enables or disables module streams and installs or removes module stream profiles. Once
     * complete, the state of the modules, streams, and profiles will match the state indicated in
     * the operation. See {@link
     * #manageModuleStreamsOnManagedInstanceDetails(ManageModuleStreamsOnManagedInstanceDetailsRequest,
     * Consumer, Consumer) manageModuleStreamsOnManagedInstanceDetails} for more information. You
     * can preform this operation as a dry run. For a dry run, the service evaluates the operation
     * against the current module, stream, and profile state on the managed instance, but does not
     * commit the changes. Instead, the service returns work request log or error entries indicating
     * the impact of the operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceResponse>
            manageModuleStreamsOnManagedInstance(
                    ManageModuleStreamsOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceRequest,
                                    ManageModuleStreamsOnManagedInstanceResponse>
                            handler);

    /**
     * Refreshes the package or Windows update information on a managed instance with the latest
     * data from the software source. This does not update packages on the instance. It provides the
     * service with the latest package data.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RefreshSoftwareOnManagedInstanceResponse>
            refreshSoftwareOnManagedInstance(
                    RefreshSoftwareOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RefreshSoftwareOnManagedInstanceRequest,
                                    RefreshSoftwareOnManagedInstanceResponse>
                            handler);

    /**
     * Removes a profile for a module stream that is installed on a managed instance. If a module
     * stream is provided, rather than a fully qualified profile, all profiles that have been
     * installed for the module stream will be removed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
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
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackagesFromManagedInstanceResponse>
            removePackagesFromManagedInstance(
                    RemovePackagesFromManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromManagedInstanceRequest,
                                    RemovePackagesFromManagedInstanceResponse>
                            handler);

    /**
     * Enables a new stream for a module that already has a stream enabled. If any profiles or
     * packages from the original module are installed, switching to a new stream will remove the
     * existing packages and install their counterparts in the new stream.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceResponse>
            switchModuleStreamOnManagedInstance(
                    SwitchModuleStreamOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceRequest,
                                    SwitchModuleStreamOnManagedInstanceResponse>
                            handler);

    /**
     * Install all of the available package updates for all of the managed instances in a
     * compartment. This applies only to standalone non-Windows instances. This will not update
     * instances that belong to a group or lifecycle environment.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAllPackagesOnManagedInstancesInCompartmentResponse>
            updateAllPackagesOnManagedInstancesInCompartment(
                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest,
                                    UpdateAllPackagesOnManagedInstancesInCompartmentResponse>
                            handler);

    /**
     * Updates the specified managed instance information, such as description, ONS topic, and
     * associated management station.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedInstanceResponse> updateManagedInstance(
            UpdateManagedInstanceRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceRequest, UpdateManagedInstanceResponse>
                    handler);

    /**
     * Updates a package on a managed instance.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdatePackagesOnManagedInstanceResponse>
            updatePackagesOnManagedInstance(
                    UpdatePackagesOnManagedInstanceRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdatePackagesOnManagedInstanceRequest,
                                    UpdatePackagesOnManagedInstanceResponse>
                            handler);
}
