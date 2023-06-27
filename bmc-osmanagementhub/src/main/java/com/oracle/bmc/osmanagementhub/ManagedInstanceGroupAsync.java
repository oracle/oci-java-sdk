/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub;

import com.oracle.bmc.osmanagementhub.requests.*;
import com.oracle.bmc.osmanagementhub.responses.*;

/**
 * Use the OS Management Hub API to manage and monitor updates and patches for the operating system environments in your private data centers through a single management console. For more information, see [Overview of OS Management Hub](https://docs.cloud.oracle.com/iaas/osmh/doc/overview.htm).
 * Use the table of contents and search tool to explore the  OS Management Hub API.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface ManagedInstanceGroupAsync extends AutoCloseable {

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
     * Adds managed instances to the specified managed instance group. After the managed
     * instances have been added, then operations can be performed on the managed
     * instance group which will then apply to all managed instances in the
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
    java.util.concurrent.Future<AttachManagedInstancesToManagedInstanceGroupResponse>
            attachManagedInstancesToManagedInstanceGroup(
                    AttachManagedInstancesToManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachManagedInstancesToManagedInstanceGroupRequest,
                                    AttachManagedInstancesToManagedInstanceGroupResponse>
                            handler);

    /**
     * Attaches software sources to the specified managed instance group. The software sources must be compatible with the content for the managed instance group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AttachSoftwareSourcesToManagedInstanceGroupResponse>
            attachSoftwareSourcesToManagedInstanceGroup(
                    AttachSoftwareSourcesToManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    AttachSoftwareSourcesToManagedInstanceGroupRequest,
                                    AttachSoftwareSourcesToManagedInstanceGroupResponse>
                            handler);

    /**
     * Creates a new managed instance group.
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
     * Deletes a specified managed instance group.
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
     * Removes a managed instance from the specified managed instance group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachManagedInstancesFromManagedInstanceGroupResponse>
            detachManagedInstancesFromManagedInstanceGroup(
                    DetachManagedInstancesFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachManagedInstancesFromManagedInstanceGroupRequest,
                                    DetachManagedInstancesFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Detaches software sources from a group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DetachSoftwareSourcesFromManagedInstanceGroupResponse>
            detachSoftwareSourcesFromManagedInstanceGroup(
                    DetachSoftwareSourcesFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DetachSoftwareSourcesFromManagedInstanceGroupRequest,
                                    DetachSoftwareSourcesFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Disables a module stream on a managed instance group. After the stream is
     * disabled, it is no longer possible to install the profiles that are
     * contained by the stream. All installed profiles must be removed prior
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
    java.util.concurrent.Future<DisableModuleStreamOnManagedInstanceGroupResponse>
            disableModuleStreamOnManagedInstanceGroup(
                    DisableModuleStreamOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DisableModuleStreamOnManagedInstanceGroupRequest,
                                    DisableModuleStreamOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Enables a module stream on a managed instance group.  After the stream is
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
     * Installs a profile for an module stream. The stream must be
     * enabled before a profile can be installed. If a module stream
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
    java.util.concurrent.Future<InstallModuleStreamProfileOnManagedInstanceGroupResponse>
            installModuleStreamProfileOnManagedInstanceGroup(
                    InstallModuleStreamProfileOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallModuleStreamProfileOnManagedInstanceGroupRequest,
                                    InstallModuleStreamProfileOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Installs package(s) on each managed instance in a managed instance group. The package must be compatible with the
     * instances in the managed instance group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<InstallPackagesOnManagedInstanceGroupResponse>
            installPackagesOnManagedInstanceGroup(
                    InstallPackagesOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    InstallPackagesOnManagedInstanceGroupRequest,
                                    InstallPackagesOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Lists available modules that for the specified managed instance group. Filter the list against a variety of
     * criteria including but not limited to its name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupAvailableModulesResponse>
            listManagedInstanceGroupAvailableModules(
                    ListManagedInstanceGroupAvailableModulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailableModulesRequest,
                                    ListManagedInstanceGroupAvailableModulesResponse>
                            handler);

    /**
     * Lists available packages on the specified managed instances group. Filter the list against a variety
     * of criteria including but not limited to the package name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupAvailablePackagesResponse>
            listManagedInstanceGroupAvailablePackages(
                    ListManagedInstanceGroupAvailablePackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailablePackagesRequest,
                                    ListManagedInstanceGroupAvailablePackagesResponse>
                            handler);

    /**
     * Lists available software sources for a specified managed instance group. Filter the list against a variety of
     * criteria including but not limited to its name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
            listManagedInstanceGroupAvailableSoftwareSources(
                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest,
                                    ListManagedInstanceGroupAvailableSoftwareSourcesResponse>
                            handler);

    /**
     * Lists installed packages on the specified managed instances group. Filter the list against a variety
     * of criteria including but not limited to the package name.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListManagedInstanceGroupInstalledPackagesResponse>
            listManagedInstanceGroupInstalledPackages(
                    ListManagedInstanceGroupInstalledPackagesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupInstalledPackagesRequest,
                                    ListManagedInstanceGroupInstalledPackagesResponse>
                            handler);

    /**
     * Retrieve a list of module streams, along with a summary of their
     * status, from a managed instance group.  Filters may be applied to select
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
    java.util.concurrent.Future<ListManagedInstanceGroupModulesResponse>
            listManagedInstanceGroupModules(
                    ListManagedInstanceGroupModulesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListManagedInstanceGroupModulesRequest,
                                    ListManagedInstanceGroupModulesResponse>
                            handler);

    /**
     * Lists managed instance groups that match the specified compartment or managed instance group OCID. Filter the
     * list against a variety of criteria including but not limited to its name, status, architecture, and OS family.
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
     * Perform an operation involving modules, streams, and profiles on a
     * managed instance group.  Each operation may enable or disable an arbitrary
     * amount of module streams, and install or remove an arbitrary number
     * of module stream profiles.  When the operation is complete, the
     * state of the modules, streams, and profiles on the managed instance group
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
     * is not enabled, it will be enabled as part of the operation. There
     * is an exception when attempting to install a stream of a profile when
     * another stream of the same module is enabled.  It is an error to attempt
     * to install a profile of another module stream, unless enabling the
     * new module stream is explicitly included in this operation.
     * <p>
     * Each module stream profile specified in the list of profiles to remove
     * will be in the \"AVAILABLE\" state upon completion of the operation.
     * The status of packages within the profile after the operation is
     * complete is defined by the package manager on the managed instance group.
     * <p>
     * Operations that contain one or more elements that are not allowed
     * are rejected.
     * <p>
     * The result of this request is a work request object. The returned
     * work request is the parent of a structure of other work requests.  Taken
     * as a whole, this structure indicates the entire set of work to be
     * performed to complete the operation.
     * <p>
     * This interface can also be used to perform a dry run of the operation
     * rather than committing it to a managed instance group.  If a dry run is
     * requested, the OS Management Hub service will evaluate the operation
     * against the current module, stream, and profile state on the managed
     * instance.  It will calculate the impact of the operation on all
     * modules, streams, and profiles on the managed instance, including those
     * that are implicitly impacted by the operation.
     * <p>
     * The work request resulting from a dry run behaves differently than
     * a work request resulting from a committable operation.  Dry run
     * work requests are always singletons and never have children. The
     * impact of the operation is returned using the log and error
     * facilities of work requests. The impact of operations that are
     * allowed by the OS Management Hub service are communicated as one or
     * more work request log entries.  Operations that are not allowed
     * by the OS Management Hub service are communicated as one or more
     * work request error entries.  Each entry, for either logs or errors,
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
    java.util.concurrent.Future<ManageModuleStreamsOnManagedInstanceGroupResponse>
            manageModuleStreamsOnManagedInstanceGroup(
                    ManageModuleStreamsOnManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ManageModuleStreamsOnManagedInstanceGroupRequest,
                                    ManageModuleStreamsOnManagedInstanceGroupResponse>
                            handler);

    /**
     * Removes a profile for a module stream that is installed on a managed instance group.
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
    java.util.concurrent.Future<RemoveModuleStreamProfileFromManagedInstanceGroupResponse>
            removeModuleStreamProfileFromManagedInstanceGroup(
                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest,
                                    RemoveModuleStreamProfileFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Removes package(s) from each managed instance in a specified managed instance group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RemovePackagesFromManagedInstanceGroupResponse>
            removePackagesFromManagedInstanceGroup(
                    RemovePackagesFromManagedInstanceGroupRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RemovePackagesFromManagedInstanceGroupRequest,
                                    RemovePackagesFromManagedInstanceGroupResponse>
                            handler);

    /**
     * Updates all packages on each managed instance in the specified managed instance group.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
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
}
