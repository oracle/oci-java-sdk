/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
     * Adds managed instances to the specified managed instance group. After the managed instances
     * have been added, then operations can be performed on the managed instance group which will
     * then apply to all managed instances in the group.
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
     * be compatible with the content for the managed instance group.
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
     * Deletes a specified managed instance group.
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
     * Detaches software sources from a group.
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
     * Disables a module stream on a managed instance group. After the stream is disabled, it is no
     * longer possible to install the profiles that are contained by the stream. All installed
     * profiles must be removed prior to disabling a module stream.
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
     * Enables a module stream on a managed instance group. After the stream is enabled, it is
     * possible to install the profiles that are contained by the stream. Enabling a stream that is
     * already enabled will succeed. Attempting to enable a different stream for a module that
     * already has a stream enabled results in an error.
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
     * Installs a profile for an module stream. The stream must be enabled before a profile can be
     * installed. If a module stream defines multiple profiles, each one can be installed
     * independently.
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
     * Installs package(s) on each managed instance in a managed instance group. The package must be
     * compatible with the instances in the managed instance group.
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
     * Lists available modules that for the specified managed instance group. Filter the list
     * against a variety of criteria including but not limited to its name.
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
     * against a variety of criteria including but not limited to its name.
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
     * OCID. Filter the list against a variety of criteria including but not limited to its name,
     * status, architecture, and OS family.
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
     * Perform an operation involving modules, streams, and profiles on a managed instance group.
     * Each operation may enable or disable an arbitrary amount of module streams, and install or
     * remove an arbitrary number of module stream profiles. When the operation is complete, the
     * state of the modules, streams, and profiles on the managed instance group will match the
     * state indicated in the operation.
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
     * instance group.
     *
     * <p>Operations that contain one or more elements that are not allowed are rejected.
     *
     * <p>The result of this request is a work request object. The returned work request is the
     * parent of a structure of other work requests. Taken as a whole, this structure indicates the
     * entire set of work to be performed to complete the operation.
     *
     * <p>This interface can also be used to perform a dry run of the operation rather than
     * committing it to a managed instance group. If a dry run is requested, the OS Management Hub
     * service will evaluate the operation against the current module, stream, and profile state on
     * the managed instance. It will calculate the impact of the operation on all modules, streams,
     * and profiles on the managed instance, including those that are implicitly impacted by the
     * operation.
     *
     * <p>The work request resulting from a dry run behaves differently than a work request
     * resulting from a committable operation. Dry run work requests are always singletons and never
     * have children. The impact of the operation is returned using the log and error facilities of
     * work requests. The impact of operations that are allowed by the OS Management Hub service are
     * communicated as one or more work request log entries. Operations that are not allowed by the
     * OS Management Hub service are communicated as one or more work request error entries. Each
     * entry, for either logs or errors, contains a structured message containing the results of one
     * or more operations.
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
     * Removes a profile for a module stream that is installed on a managed instance group. If a
     * module stream is provided, rather than a fully qualified profile, all profiles that have been
     * installed for the module stream will be removed.
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
     * Removes package(s) from each managed instance in a specified managed instance group.
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
