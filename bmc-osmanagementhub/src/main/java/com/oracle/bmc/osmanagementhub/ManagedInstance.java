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
public interface ManagedInstance extends AutoCloseable {

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
     * Associates managed instances to the specified management station
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AssociateManagedInstancesWithManagementStationExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AssociateManagedInstancesWithManagementStation API.
     */
    AssociateManagedInstancesWithManagementStationResponse
            associateManagedInstancesWithManagementStation(
                    AssociateManagedInstancesWithManagementStationRequest request);

    /**
     * Adds profile to a managed instance. After the profile has been added, the instance can be
     * registered as a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AttachProfileToManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachProfileToManagedInstance API.
     */
    AttachProfileToManagedInstanceResponse attachProfileToManagedInstance(
            AttachProfileToManagedInstanceRequest request);

    /**
     * Adds software sources to a managed instance. After the software source has been added, then
     * packages from that software source can be installed on the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AttachSoftwareSourcesToManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     AttachSoftwareSourcesToManagedInstance API.
     */
    AttachSoftwareSourcesToManagedInstanceResponse attachSoftwareSourcesToManagedInstance(
            AttachSoftwareSourcesToManagedInstanceRequest request);

    /**
     * Unregisters the specified managed instance from the service. Once unregistered, the service
     * will no longer manage the instance. For Linux instances, yum or DNF repository files will be
     * restored to their state prior to registration.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DeleteManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DeleteManagedInstance API.
     */
    DeleteManagedInstanceResponse deleteManagedInstance(DeleteManagedInstanceRequest request);

    /**
     * Detaches profile from a managed instance. After the profile has been removed, the instance
     * cannot be registered as a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DetachProfileFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachProfileFromManagedInstance API.
     */
    DetachProfileFromManagedInstanceResponse detachProfileFromManagedInstance(
            DetachProfileFromManagedInstanceRequest request);

    /**
     * Removes software sources from a managed instance. Packages will no longer be able to be
     * installed from these software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DetachSoftwareSourcesFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DetachSoftwareSourcesFromManagedInstance API.
     */
    DetachSoftwareSourcesFromManagedInstanceResponse detachSoftwareSourcesFromManagedInstance(
            DetachSoftwareSourcesFromManagedInstanceRequest request);

    /**
     * Disables a module stream on a managed instance. After the stream is disabled, it is no longer
     * possible to install the profiles that are contained by the stream. All installed profiles
     * must be removed prior to disabling a module stream.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DisableModuleStreamOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     DisableModuleStreamOnManagedInstance API.
     */
    DisableModuleStreamOnManagedInstanceResponse disableModuleStreamOnManagedInstance(
            DisableModuleStreamOnManagedInstanceRequest request);

    /**
     * Enables a module stream on a managed instance. After the stream is enabled, it is possible to
     * install the profiles that are contained by the stream. Enabling a stream that is already
     * enabled will succeed. Attempting to enable a different stream for a module that already has a
     * stream enabled results in an error.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/EnableModuleStreamOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     EnableModuleStreamOnManagedInstance API.
     */
    EnableModuleStreamOnManagedInstanceResponse enableModuleStreamOnManagedInstance(
            EnableModuleStreamOnManagedInstanceRequest request);

    /**
     * Gets information about the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetManagedInstance
     *     API.
     */
    GetManagedInstanceResponse getManagedInstance(GetManagedInstanceRequest request);

    /**
     * Returns a Windows Update object.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetWindowsUpdateExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetWindowsUpdate
     *     API.
     */
    GetWindowsUpdateResponse getWindowsUpdate(GetWindowsUpdateRequest request);

    /**
     * Installs all of the available Windows updates for managed instances in a compartment. This
     * applies only to standalone Windows instances. This will not update instances that belong to a
     * group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallAllWindowsUpdatesOnManagedInstancesInCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallAllWindowsUpdatesOnManagedInstancesInCompartment API.
     */
    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentResponse
            installAllWindowsUpdatesOnManagedInstancesInCompartment(
                    InstallAllWindowsUpdatesOnManagedInstancesInCompartmentRequest request);

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
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallModuleStreamProfileOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallModuleStreamProfileOnManagedInstance API.
     */
    InstallModuleStreamProfileOnManagedInstanceResponse installModuleStreamProfileOnManagedInstance(
            InstallModuleStreamProfileOnManagedInstanceRequest request);

    /**
     * Installs packages on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallPackagesOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallPackagesOnManagedInstance API.
     */
    InstallPackagesOnManagedInstanceResponse installPackagesOnManagedInstance(
            InstallPackagesOnManagedInstanceRequest request);

    /**
     * Installs Windows updates on the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/InstallWindowsUpdatesOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     InstallWindowsUpdatesOnManagedInstance API.
     */
    InstallWindowsUpdatesOnManagedInstanceResponse installWindowsUpdatesOnManagedInstance(
            InstallWindowsUpdatesOnManagedInstanceRequest request);

    /**
     * Returns a list of packages that are available for installation on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceAvailablePackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceAvailablePackages API.
     */
    ListManagedInstanceAvailablePackagesResponse listManagedInstanceAvailablePackages(
            ListManagedInstanceAvailablePackagesRequest request);

    /**
     * Returns a list of software sources that can be attached to the specified managed instance.
     * Any software sources already attached to the instance are not included in the list.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceAvailableSoftwareSourcesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceAvailableSoftwareSources API.
     */
    ListManagedInstanceAvailableSoftwareSourcesResponse listManagedInstanceAvailableSoftwareSources(
            ListManagedInstanceAvailableSoftwareSourcesRequest request);

    /**
     * Returns a list of Windows updates that can be installed on the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceAvailableWindowsUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceAvailableWindowsUpdates API.
     */
    ListManagedInstanceAvailableWindowsUpdatesResponse listManagedInstanceAvailableWindowsUpdates(
            ListManagedInstanceAvailableWindowsUpdatesRequest request);

    /**
     * Returns a list of applicable errata on the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceErrataExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceErrata API.
     */
    ListManagedInstanceErrataResponse listManagedInstanceErrata(
            ListManagedInstanceErrataRequest request);

    /**
     * Lists the packages that are installed on the managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceInstalledPackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceInstalledPackages API.
     */
    ListManagedInstanceInstalledPackagesResponse listManagedInstanceInstalledPackages(
            ListManagedInstanceInstalledPackagesRequest request);

    /**
     * Returns a list of Windows updates that have been installed on the specified managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceInstalledWindowsUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceInstalledWindowsUpdates API.
     */
    ListManagedInstanceInstalledWindowsUpdatesResponse listManagedInstanceInstalledWindowsUpdates(
            ListManagedInstanceInstalledWindowsUpdatesRequest request);

    /**
     * Retrieves a list of modules, along with streams of the modules, from a managed instance.
     * Filters may be applied to select a subset of modules based on the filter criteria.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceModulesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceModules API.
     */
    ListManagedInstanceModulesResponse listManagedInstanceModules(
            ListManagedInstanceModulesRequest request);

    /**
     * Returns a list of updatable packages for a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceUpdatablePackagesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstanceUpdatablePackages API.
     */
    ListManagedInstanceUpdatablePackagesResponse listManagedInstanceUpdatablePackages(
            ListManagedInstanceUpdatablePackagesRequest request);

    /**
     * Lists managed instances that match the specified compartment or managed instance OCID. Filter
     * the list against a variety of criteria including but not limited to its name, status,
     * architecture, and OS version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstancesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListManagedInstances API.
     */
    ListManagedInstancesResponse listManagedInstances(ListManagedInstancesRequest request);

    /**
     * Lists Windows updates that have been reported to the service.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListWindowsUpdatesExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListWindowsUpdates
     *     API.
     */
    ListWindowsUpdatesResponse listWindowsUpdates(ListWindowsUpdatesRequest request);

    /**
     * Enables or disables module streams and installs or removes module stream profiles. Once
     * complete, the state of the modules, streams, and profiles will match the state indicated in
     * the operation. See {@link
     * #manageModuleStreamsOnManagedInstanceDetails(ManageModuleStreamsOnManagedInstanceDetailsRequest)
     * manageModuleStreamsOnManagedInstanceDetails} for more information. You can preform this
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
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ManageModuleStreamsOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ManageModuleStreamsOnManagedInstance API.
     */
    ManageModuleStreamsOnManagedInstanceResponse manageModuleStreamsOnManagedInstance(
            ManageModuleStreamsOnManagedInstanceRequest request);

    /**
     * Initiates a reboot of the specified managed instance. You can also specify the number of
     * minutes the service waits before marking the reboot operation as failed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/RebootManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RebootManagedInstance API.
     */
    RebootManagedInstanceResponse rebootManagedInstance(RebootManagedInstanceRequest request);

    /**
     * Refreshes the package or Windows update information on a managed instance with the latest
     * data from the software source. This does not update packages on the instance. It provides the
     * service with the latest package data.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/RefreshSoftwareOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RefreshSoftwareOnManagedInstance API.
     */
    RefreshSoftwareOnManagedInstanceResponse refreshSoftwareOnManagedInstance(
            RefreshSoftwareOnManagedInstanceRequest request);

    /**
     * Removes a profile for a module stream that is installed on a managed instance. If a module
     * stream is provided, rather than a fully qualified profile, all profiles that have been
     * installed for the module stream will be removed.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/RemoveModuleStreamProfileFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemoveModuleStreamProfileFromManagedInstance API.
     */
    RemoveModuleStreamProfileFromManagedInstanceResponse
            removeModuleStreamProfileFromManagedInstance(
                    RemoveModuleStreamProfileFromManagedInstanceRequest request);

    /**
     * Removes an installed package from a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/RemovePackagesFromManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RemovePackagesFromManagedInstance API.
     */
    RemovePackagesFromManagedInstanceResponse removePackagesFromManagedInstance(
            RemovePackagesFromManagedInstanceRequest request);

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
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/SwitchModuleStreamOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     SwitchModuleStreamOnManagedInstance API.
     */
    SwitchModuleStreamOnManagedInstanceResponse switchModuleStreamOnManagedInstance(
            SwitchModuleStreamOnManagedInstanceRequest request);

    /**
     * Install all of the available package updates for all of the managed instances in a
     * compartment. This applies only to standalone non-Windows instances. This will not update
     * instances that belong to a group or lifecycle environment.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdateAllPackagesOnManagedInstancesInCompartmentExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateAllPackagesOnManagedInstancesInCompartment API.
     */
    UpdateAllPackagesOnManagedInstancesInCompartmentResponse
            updateAllPackagesOnManagedInstancesInCompartment(
                    UpdateAllPackagesOnManagedInstancesInCompartmentRequest request);

    /**
     * Updates the specified managed instance information, such as description, ONS topic, and
     * associated management station.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdateManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdateManagedInstance API.
     */
    UpdateManagedInstanceResponse updateManagedInstance(UpdateManagedInstanceRequest request);

    /**
     * Updates a package on a managed instance.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdatePackagesOnManagedInstanceExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     UpdatePackagesOnManagedInstance API.
     */
    UpdatePackagesOnManagedInstanceResponse updatePackagesOnManagedInstance(
            UpdatePackagesOnManagedInstanceRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    ManagedInstancePaginators getPaginators();
}
