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
public interface ManagedInstanceGroupAsync extends AutoCloseable {

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
     * Adds managed instances to the specified managed instance group. After adding instances to the
     * group, any operation applied to the group will be applied to all instances in the group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachManagedInstancesToManagedInstanceGroupResponse>
            attachManagedInstancesToManagedInstanceGroup(
                    AttachManagedInstancesToManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstancesToManagedInstanceGroupRequest,
                                    AttachManagedInstancesToManagedInstanceGroupResponse>
                            handler);

    /**
     * Attaches software sources to the specified managed instance group. The software sources must
     * be compatible with the type of instances in the group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<AttachSoftwareSourcesToManagedInstanceGroupResponse>
            attachSoftwareSourcesToManagedInstanceGroup(
                    AttachSoftwareSourcesToManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachSoftwareSourcesToManagedInstanceGroupRequest,
                                    AttachSoftwareSourcesToManagedInstanceGroupResponse>
                            handler);

    /**
     * Moves the specified managed instance group to a different compartment within the same
     * tenancy. For information about moving resources between compartments, see [Moving Resources
     * to a Different
     * Compartment](https://docs.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ChangeManagedInstanceGroupCompartmentResponse>
            changeManagedInstanceGroupCompartment(
                    ChangeManagedInstanceGroupCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeManagedInstanceGroupCompartmentRequest,
                                    ChangeManagedInstanceGroupCompartmentResponse>
                            handler);

    /**
     * Creates a new managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<CreateManagedInstanceGroupResponse> createManagedInstanceGroup(
            CreateManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateManagedInstanceGroupRequest, CreateManagedInstanceGroupResponse>
                    handler);

    /**
     * Deletes the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DeleteManagedInstanceGroupResponse> deleteManagedInstanceGroup(
            DeleteManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteManagedInstanceGroupRequest, DeleteManagedInstanceGroupResponse>
                    handler);

    /**
     * Removes a managed instance from the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachManagedInstancesFromManagedInstanceGroupResponse>
            detachManagedInstancesFromManagedInstanceGroup(
                    DetachManagedInstancesFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstancesFromManagedInstanceGroupRequest,
                                    DetachManagedInstancesFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Detaches the specified software sources from a managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DetachSoftwareSourcesFromManagedInstanceGroupResponse>
            detachSoftwareSourcesFromManagedInstanceGroup(
                    DetachSoftwareSourcesFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachSoftwareSourcesFromManagedInstanceGroupRequest,
                                    DetachSoftwareSourcesFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Disables a module stream on a managed instance group. After the stream is disabled, you can
     * no longer install the profiles contained by the stream. Before removing the stream, you must
     * remove all installed profiles for the stream by using the {@link
     * #removeModuleStreamProfileFromManagedInstanceGroup(RemoveModuleStreamProfileFromManagedInstanceGroupRequest,
     * Consumer, Consumer) removeModuleStreamProfileFromManagedInstanceGroup} operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceGroupResponse>
            disableModuleStreamOnManagedInstanceGroup(
                    DisableModuleStreamOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceGroupRequest,
                                    DisableModuleStreamOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Enables a module stream on a managed instance group. After the stream is enabled, you can
     * install a module stream profile. Enabling a stream that is already enabled will succeed.
     * Enabling a different stream for a module that already has a stream enabled results in an
     * error. Instead, use the {@link
     * #switchModuleStreamOnManagedInstanceGroup(SwitchModuleStreamOnManagedInstanceGroupRequest,
     * Consumer, Consumer) switchModuleStreamOnManagedInstanceGroup} operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<EnableModuleStreamOnManagedInstanceGroupResponse>
            enableModuleStreamOnManagedInstanceGroup(
                    EnableModuleStreamOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    EnableModuleStreamOnManagedInstanceGroupRequest,
                                    EnableModuleStreamOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Gets information about the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<GetManagedInstanceGroupResponse> getManagedInstanceGroup(
            GetManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetManagedInstanceGroupRequest, GetManagedInstanceGroupResponse>
                    handler);

    /**
     * Installs a profile for an enabled module stream. If a module stream defines multiple
     * profiles, you can install each one independently.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceGroupResponse>
            installModuleStreamProfileOnManagedInstanceGroup(
                    InstallModuleStreamProfileOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceGroupRequest,
                                    InstallModuleStreamProfileOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Installs the specified packages on each managed instance in a managed instance group. The
     * package must be compatible with the instances in the group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallPackagesOnManagedInstanceGroupResponse>
            installPackagesOnManagedInstanceGroup(
                    InstallPackagesOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackagesOnManagedInstanceGroupRequest,
                                    InstallPackagesOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Installs Windows updates on each managed instance in the managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<InstallWindowsUpdatesOnManagedInstanceGroupResponse>
            installWindowsUpdatesOnManagedInstanceGroup(
                    InstallWindowsUpdatesOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallWindowsUpdatesOnManagedInstanceGroupRequest,
                                    InstallWindowsUpdatesOnManagedInstanceGroupResponse>
                            handler);

    /**
     * List modules that are available for installation on the specified managed instance group.
     * Filter the list against a variety of criteria including but not limited to module name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupAvailableModulesResponse>
            listManagedInstanceGroupAvailableModules(
                    ListManagedInstanceGroupAvailableModulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailableModulesRequest,
                                    ListManagedInstanceGroupAvailableModulesResponse>
                            handler);

    /**
     * Lists available packages on the specified managed instances group. Filter the list against a
     * variety of criteria including but not limited to the package name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupAvailablePackagesResponse>
            listManagedInstanceGroupAvailablePackages(
                    ListManagedInstanceGroupAvailablePackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailablePackagesRequest,
                                    ListManagedInstanceGroupAvailablePackagesResponse>
                            handler);

    /**
     * Lists available software sources for a specified managed instance group. Filter the list
     * against a variety of criteria including but not limited to the software source name. The
     * results list only software sources that have not already been added to the group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
            listManagedInstanceGroupAvailableSoftwareSources(
                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                                    ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
                            handler);

    /**
     * Lists installed packages on the specified managed instances group. Filter the list against a
     * variety of criteria including but not limited to the package name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupInstalledPackagesResponse>
            listManagedInstanceGroupInstalledPackages(
                    ListManagedInstanceGroupInstalledPackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupInstalledPackagesRequest,
                                    ListManagedInstanceGroupInstalledPackagesResponse>
                            handler);

    /**
     * Retrieve a list of module streams, along with a summary of their status, from a managed
     * instance group. Filters may be applied to select a subset of module streams based on the
     * filter criteria.
     *
     * <p>The 'moduleName' attribute filters against the name of a module. It accepts strings of the
     * format \"<module>\". If this attribute is defined, only streams that belong to the specified
     * module are included in the result set. If it is not defined, the request is not subject to
     * this filter.
     *
     * <p>The \"status\" attribute filters against the state of a module stream. Valid values are
     * \"ENABLED\", \"DISABLED\", and \"ACTIVE\". If the attribute is set to \"ENABLED\", only
     * module streams that are enabled are included in the result set. If the attribute is set to
     * \"DISABLED\", only module streams that are not enabled are included in the result set. If the
     * attribute is set to \"ACTIVE\", only module streams that are active are included in the
     * result set. If the attribute is not defined, the request is not subject to this filter.
     *
     * <p>When sorting by the display name, the result set is sorted first by the module name and
     * then by the stream name.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupModulesResponse>
            listManagedInstanceGroupModules(
                    ListManagedInstanceGroupModulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupModulesRequest,
                                    ListManagedInstanceGroupModulesResponse>
                            handler);

    /**
     * Lists managed instance groups that match the specified compartment or managed instance group
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter the
     * list against a variety of criteria including but not limited to name, status, architecture,
     * and OS family.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupsResponse> listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListManagedInstanceGroupsRequest, ListManagedInstanceGroupsResponse>
                    handler);

    /**
     * Enables or disables module streams and installs or removes module stream profiles. Once
     * complete, the state of the modules, streams, and profiles will match the state indicated in
     * the operation. See {@link
     * #manageModuleStreamsOnManagedInstanceGroupDetails(ManageModuleStreamsOnManagedInstanceGroupDetailsRequest,
     * Consumer, Consumer) manageModuleStreamsOnManagedInstanceGroupDetails} for more information.
     * You can preform this operation as a dry run. For a dry run, the service evaluates the
     * operation against the current module, stream, and profile state on the managed instance, but
     * does not commit the changes. Instead, the service returns work request log or error entries
     * indicating the impact of the operation.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceGroupResponse>
            manageModuleStreamsOnManagedInstanceGroup(
                    ManageModuleStreamsOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceGroupRequest,
                                    ManageModuleStreamsOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Reboots all managed instances in the specified group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RebootManagedInstanceGroupResponse> rebootManagedInstanceGroup(
            RebootManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RebootManagedInstanceGroupRequest, RebootManagedInstanceGroupResponse>
                    handler);

    /**
     * Removes a profile for a module stream that is installed on a managed instance group.
     * Providing the module stream name (without specifying a profile name) removes all profiles
     * that have been installed for the module stream.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceGroupResponse>
            removeModuleStreamProfileFromManagedInstanceGroup(
                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Removes the specified packages from each managed instance in a managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackagesFromManagedInstanceGroupResponse>
            removePackagesFromManagedInstanceGroup(
                    RemovePackagesFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromManagedInstanceGroupRequest,
                                    RemovePackagesFromManagedInstanceGroupResponse>
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
    java.util.concurrent.Future<SwitchModuleStreamOnManagedInstanceGroupResponse>
            switchModuleStreamOnManagedInstanceGroup(
                    SwitchModuleStreamOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SwitchModuleStreamOnManagedInstanceGroupRequest,
                                    SwitchModuleStreamOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Updates all packages on each managed instance in the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAllPackagesOnManagedInstanceGroupResponse>
            updateAllPackagesOnManagedInstanceGroup(
                    UpdateAllPackagesOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateAllPackagesOnManagedInstanceGroupRequest,
                                    UpdateAllPackagesOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Updates the specified managed instance group's name, description, and tags.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was provided. Note,
     *     if you provide an AsyncHandler and use the Future, some types of responses (like
     *     java.io.InputStream) may not be able to be read in both places as the underlying stream
     *     may only be consumed once.
     */
    java.util.concurrent.Future<UpdateManagedInstanceGroupResponse> updateManagedInstanceGroup(
            UpdateManagedInstanceGroupRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateManagedInstanceGroupRequest, UpdateManagedInstanceGroupResponse>
                    handler);
}
