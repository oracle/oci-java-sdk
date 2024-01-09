/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for the operating system
 * environments in your private data centers through a single management console. For more
 * information, see [Overview of OS Management
 * Hub](https://docs.cloud.oracle.com/iaas/osmh/doc/overview.htm).
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
     * Returns a list of available packages for a managed instance.
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
     * Returns a list of available software sources for a managed instance.
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
     * Retrieve a list of modules, along with streams of the modules, from a managed instance.
     * Filters may be applied to select a subset of modules based on the filter criteria.
     *
     * <p>The 'name' attribute filters against the name of a module. It accepts strings of the
     * format \"<string>\".
     *
     * <p>The 'nameContains' attribute filters against the name of a module based on partial match.
     * It accepts strings of the format \"<string>\". If this attribute is defined, only matching
     * modules are included in the result set. If it is not defined, the request is not subject to
     * this filter.
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
     * Perform an operation involving modules, streams, and profiles on a managed instance. Each
     * operation may enable or disable an arbitrary amount of module streams, and install or remove
     * an arbitrary number of module stream profiles. When the operation is complete, the state of
     * the modules, streams, and profiles on the managed instance will match the state indicated in
     * the operation.
     *
     * <p>Each module stream specified in the list of module streams to enable will be in the
     * \"ENABLED\" state upon completion of the operation. If there was already a stream of that
     * module enabled, any work required to switch from the current stream to the new stream is
     * performed implicitly.
     *
     * <p>Each module stream specified in the list of module streams to disable will be in the
     * \"DISABLED\" state upon completion of the operation. Any profiles that are installed for the
     * module stream will be removed as part of the operation.
     *
     * <p>Each module stream profile specified in the list of profiles to install will be in the
     * \"INSTALLED\" state upon completion of the operation, indicating that any packages that are
     * part of the profile are installed on the managed instance. If the module stream containing
     * the profile is not enabled, it will be enabled as part of the operation. There is an
     * exception when attempting to install a stream of a profile when another stream of the same
     * module is enabled. It is an error to attempt to install a profile of another module stream,
     * unless enabling the new module stream is explicitly included in this operation.
     *
     * <p>Each module stream profile specified in the list of profiles to remove will be in the
     * \"AVAILABLE\" state upon completion of the operation. The status of packages within the
     * profile after the operation is complete is defined by the package manager on the managed
     * instance.
     *
     * <p>Operations that contain one or more elements that are not allowed are rejected.
     *
     * <p>The result of this request is a work request object. The returned work request is the
     * parent of a structure of other WorkRequests. Taken as a whole, this structure indicates the
     * entire set of work to be performed to complete the operation.
     *
     * <p>This interface can also be used to perform a dry run of the operation rather than
     * committing it to a managed instance. If a dry run is requested, the OS Management Hub service
     * will evaluate the operation against the current module, stream, and profile state on the
     * managed instance. It will calculate the impact of the operation on all modules, streams, and
     * profiles on the managed instance, including those that are implicitly impacted by the
     * operation.
     *
     * <p>The WorkRequest resulting from a dry run behaves differently than a WorkRequest resulting
     * from a committable operation. Dry run WorkRequests are always singletons and never have
     * children. The impact of the operation is returned using the log and error facilities of work
     * requests. The impact of operations that are allowed by the OS Management Hub service are
     * communicated as one or more work request log entries. Operations that are not allowed by the
     * OS Management Hub service are communicated as one or more work request error entries. Each
     * entry, for either logs or errors, contains a structured message containing the results of one
     * or more operations.
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
     * Refresh all installed and updatable software information on a managed instance.
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
     * compartment.
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
     * Updates the managed instance.
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
