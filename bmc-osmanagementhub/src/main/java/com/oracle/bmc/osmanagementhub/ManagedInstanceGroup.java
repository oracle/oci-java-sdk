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
 * Management Hub](https://docs.cloud.oracle.com/iaas/osmh/doc/overview.htm).
 *
 * <p>This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by
 * default if no circuit breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface ManagedInstanceGroup extends AutoCloseable {

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
     * Adds managed instances to the specified managed instance group. After adding instances to the
     * group, any operation applied to the group will be applied to all instances in the group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AttachManagedInstancesToManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachManagedInstancesToManagedInstanceGroup API.
     */
    AttachManagedInstancesToManagedInstanceGroupResponse
            attachManagedInstancesToManagedInstanceGroup(
                    AttachManagedInstancesToManagedInstanceGroupRequest request);

    /**
     * Attaches software sources to the specified managed instance group. The software sources must
     * be compatible with the type of instances in the group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AttachSoftwareSourcesToManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachSoftwareSourcesToManagedInstanceGroup API.
     */
    AttachSoftwareSourcesToManagedInstanceGroupResponse attachSoftwareSourcesToManagedInstanceGroup(
            AttachSoftwareSourcesToManagedInstanceGroupRequest request);

    /**
     * Moves the specified managed instance group to a different compartment within the same
     * tenancy. For information about moving resources between compartments, see [Moving Resources
     * to a Different
     * Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ChangeManagedInstanceGroupCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ChangeManagedInstanceGroupCompartment API.
     */
    ChangeManagedInstanceGroupCompartmentResponse changeManagedInstanceGroupCompartment(
            ChangeManagedInstanceGroupCompartmentRequest request);

    /**
     * Creates a new managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/CreateManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     CreateManagedInstanceGroup API.
     */
    CreateManagedInstanceGroupResponse createManagedInstanceGroup(
            CreateManagedInstanceGroupRequest request);

    /**
     * Deletes the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DeleteManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteManagedInstanceGroup API.
     */
    DeleteManagedInstanceGroupResponse deleteManagedInstanceGroup(
            DeleteManagedInstanceGroupRequest request);

    /**
     * Removes a managed instance from the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DetachManagedInstancesFromManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachManagedInstancesFromManagedInstanceGroup API.
     */
    DetachManagedInstancesFromManagedInstanceGroupResponse
            detachManagedInstancesFromManagedInstanceGroup(
                    DetachManagedInstancesFromManagedInstanceGroupRequest request);

    /**
     * Detaches the specified software sources from a managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DetachSoftwareSourcesFromManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachSoftwareSourcesFromManagedInstanceGroup API.
     */
    DetachSoftwareSourcesFromManagedInstanceGroupResponse
            detachSoftwareSourcesFromManagedInstanceGroup(
                    DetachSoftwareSourcesFromManagedInstanceGroupRequest request);

    /**
     * Disables a module stream on a managed instance group. After the stream is disabled, you can
     * no longer install the profiles contained by the stream. Before removing the stream, you must
     * remove all installed profiles for the stream by using the {@link
     * #removeModuleStreamProfileFromManagedInstanceGroup(RemoveModuleStreamProfileFromManagedInstanceGroupRequest)
     * removeModuleStreamProfileFromManagedInstanceGroup} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DisableModuleStreamOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableModuleStreamOnManagedInstanceGroup API.
     */
    DisableModuleStreamOnManagedInstanceGroupResponse disableModuleStreamOnManagedInstanceGroup(
            DisableModuleStreamOnManagedInstanceGroupRequest request);

    /**
     * Enables a module stream on a managed instance group. After the stream is enabled, you can
     * install a module stream profile. Enabling a stream that is already enabled will succeed.
     * Enabling a different stream for a module that already has a stream enabled results in an
     * error. Instead, use the {@link
     * #switchModuleStreamOnManagedInstanceGroup(SwitchModuleStreamOnManagedInstanceGroupRequest)
     * switchModuleStreamOnManagedInstanceGroup} operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/EnableModuleStreamOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableModuleStreamOnManagedInstanceGroup API.
     */
    EnableModuleStreamOnManagedInstanceGroupResponse enableModuleStreamOnManagedInstanceGroup(
            EnableModuleStreamOnManagedInstanceGroupRequest request);

    /**
     * Gets information about the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     GetManagedInstanceGroup API.
     */
    GetManagedInstanceGroupResponse getManagedInstanceGroup(GetManagedInstanceGroupRequest request);

    /**
     * Installs a profile for an enabled module stream. If a module stream defines multiple
     * profiles, you can install each one independently.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallModuleStreamProfileOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallModuleStreamProfileOnManagedInstanceGroup API.
     */
    InstallModuleStreamProfileOnManagedInstanceGroupResponse
            installModuleStreamProfileOnManagedInstanceGroup(
                    InstallModuleStreamProfileOnManagedInstanceGroupRequest request);

    /**
     * Installs the specified packages on each managed instance in a managed instance group. The
     * package must be compatible with the instances in the group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallPackagesOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallPackagesOnManagedInstanceGroup API.
     */
    InstallPackagesOnManagedInstanceGroupResponse installPackagesOnManagedInstanceGroup(
            InstallPackagesOnManagedInstanceGroupRequest request);

    /**
     * Installs Windows updates on each managed instance in the managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallWindowsUpdatesOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallWindowsUpdatesOnManagedInstanceGroup API.
     */
    InstallWindowsUpdatesOnManagedInstanceGroupResponse installWindowsUpdatesOnManagedInstanceGroup(
            InstallWindowsUpdatesOnManagedInstanceGroupRequest request);

    /**
     * List modules that are available for installation on the specified managed instance group.
     * Filter the list against a variety of criteria including but not limited to module name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupAvailableModulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroupAvailableModules API.
     */
    ListManagedInstanceGroupAvailableModulesResponse listManagedInstanceGroupAvailableModules(
            ListManagedInstanceGroupAvailableModulesRequest request);

    /**
     * Lists available packages on the specified managed instances group. Filter the list against a
     * variety of criteria including but not limited to the package name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupAvailablePackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroupAvailablePackages API.
     */
    ListManagedInstanceGroupAvailablePackagesResponse listManagedInstanceGroupAvailablePackages(
            ListManagedInstanceGroupAvailablePackagesRequest request);

    /**
     * Lists available software sources for a specified managed instance group. Filter the list
     * against a variety of criteria including but not limited to the software source name. The
     * results list only software sources that have not already been added to the group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupAvailableSoftwareSourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroupAvailableSoftwareSources API.
     */
    ListManagedInstanceGroupAvailableSoftwareSourcesResponse
            listManagedInstanceGroupAvailableSoftwareSources(
                    ListManagedInstanceGroupAvailableSoftwareSourcesRequest request);

    /**
     * Lists installed packages on the specified managed instances group. Filter the list against a
     * variety of criteria including but not limited to the package name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupInstalledPackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroupInstalledPackages API.
     */
    ListManagedInstanceGroupInstalledPackagesResponse listManagedInstanceGroupInstalledPackages(
            ListManagedInstanceGroupInstalledPackagesRequest request);

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
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupModulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroupModules API.
     */
    ListManagedInstanceGroupModulesResponse listManagedInstanceGroupModules(
            ListManagedInstanceGroupModulesRequest request);

    /**
     * Lists managed instance groups that match the specified compartment or managed instance group
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Filter
     * the list against a variety of criteria including but not limited to name, status,
     * architecture, and OS family.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceGroups API.
     */
    ListManagedInstanceGroupsResponse listManagedInstanceGroups(
            ListManagedInstanceGroupsRequest request);

    /**
     * Enables or disables module streams and installs or removes module stream profiles. Once
     * complete, the state of the modules, streams, and profiles will match the state indicated in
     * the operation. See {@link
     * #manageModuleStreamsOnManagedInstanceGroupDetails(ManageModuleStreamsOnManagedInstanceGroupDetailsRequest)
     * manageModuleStreamsOnManagedInstanceGroupDetails} for more information. You can preform this
     * operation as a dry run. For a dry run, the service evaluates the operation against the
     * current module, stream, and profile state on the managed instance, but does not commit the
     * changes. Instead, the service returns work request log or error entries indicating the impact
     * of the operation.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ManageModuleStreamsOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ManageModuleStreamsOnManagedInstanceGroup API.
     */
    ManageModuleStreamsOnManagedInstanceGroupResponse manageModuleStreamsOnManagedInstanceGroup(
            ManageModuleStreamsOnManagedInstanceGroupRequest request);

    /**
     * Removes a profile for a module stream that is installed on a managed instance group.
     * Providing the module stream name (without specifying a profile name) removes all profiles
     * that have been installed for the module stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/RemoveModuleStreamProfileFromManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveModuleStreamProfileFromManagedInstanceGroup API.
     */
    RemoveModuleStreamProfileFromManagedInstanceGroupResponse
            removeModuleStreamProfileFromManagedInstanceGroup(
                    RemoveModuleStreamProfileFromManagedInstanceGroupRequest request);

    /**
     * Removes the specified packages from each managed instance in a managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/RemovePackagesFromManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemovePackagesFromManagedInstanceGroup API.
     */
    RemovePackagesFromManagedInstanceGroupResponse removePackagesFromManagedInstanceGroup(
            RemovePackagesFromManagedInstanceGroupRequest request);

    /**
     * Enables a new stream for a module that already has a stream enabled. If any profiles or
     * packages from the original module are installed, switching to a new stream will remove the
     * existing packages and install their counterparts in the new stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/SwitchModuleStreamOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchModuleStreamOnManagedInstanceGroup API.
     */
    SwitchModuleStreamOnManagedInstanceGroupResponse switchModuleStreamOnManagedInstanceGroup(
            SwitchModuleStreamOnManagedInstanceGroupRequest request);

    /**
     * Updates all packages on each managed instance in the specified managed instance group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdateAllPackagesOnManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAllPackagesOnManagedInstanceGroup API.
     */
    UpdateAllPackagesOnManagedInstanceGroupResponse updateAllPackagesOnManagedInstanceGroup(
            UpdateAllPackagesOnManagedInstanceGroupRequest request);

    /**
     * Updates the specified managed instance group's name, description, and tags.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdateManagedInstanceGroupExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateManagedInstanceGroup API.
     */
    UpdateManagedInstanceGroupResponse updateManagedInstanceGroup(
            UpdateManagedInstanceGroupRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    ManagedInstanceGroupWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ManagedInstanceGroupPaginators getPaginators();
}
