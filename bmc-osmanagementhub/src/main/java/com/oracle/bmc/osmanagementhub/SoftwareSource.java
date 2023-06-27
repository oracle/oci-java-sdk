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
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public interface SoftwareSource extends AutoCloseable {

    /**
     * Rebuilds the client from scratch.
     * Useful to refresh certificates.
     */
    void refreshClient();

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
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
     * Updates the availability for a list of specified software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ChangeAvailabilityOfSoftwareSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeAvailabilityOfSoftwareSources API.
     */
    ChangeAvailabilityOfSoftwareSourcesResponse changeAvailabilityOfSoftwareSources(
            ChangeAvailabilityOfSoftwareSourcesRequest request);

    /**
     * Registers the necessary entitlement credentials for OS vendor software sources.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/CreateEntitlementExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateEntitlement API.
     */
    CreateEntitlementResponse createEntitlement(CreateEntitlementRequest request);

    /**
     * Creates a new versioned or custom software source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/CreateSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSoftwareSource API.
     */
    CreateSoftwareSourceResponse createSoftwareSource(CreateSoftwareSourceRequest request);

    /**
     * Deletes the specified software source.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/DeleteSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSoftwareSource API.
     */
    DeleteSoftwareSourceResponse deleteSoftwareSource(DeleteSoftwareSourceRequest request);

    /**
     * Gets information about the specified erratum by its advisory name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetErratumExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetErratum API.
     */
    GetErratumResponse getErratum(GetErratumRequest request);

    /**
     * Gets information about the specified module stream in a software source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetModuleStreamExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModuleStream API.
     */
    GetModuleStreamResponse getModuleStream(GetModuleStreamRequest request);

    /**
     * Gets information about the specified module stream profile in a software source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetModuleStreamProfileExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetModuleStreamProfile API.
     */
    GetModuleStreamProfileResponse getModuleStreamProfile(GetModuleStreamProfileRequest request);

    /**
     * Gets information about the specified package group from a software source.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetPackageGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPackageGroup API.
     */
    GetPackageGroupResponse getPackageGroup(GetPackageGroupRequest request);

    /**
     * Gets information about the specified software package.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetSoftwarePackageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSoftwarePackage API.
     */
    GetSoftwarePackageResponse getSoftwarePackage(GetSoftwarePackageRequest request);

    /**
     * Gets information about the specified software source.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/GetSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSoftwareSource API.
     */
    GetSoftwareSourceResponse getSoftwareSource(GetSoftwareSourceRequest request);

    /**
     * Lists entitlements in the specified tenancy OCID. Filter the list against a variety of criteria including but
     * not limited to its CSI, and vendor name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListEntitlementsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListEntitlements API.
     */
    ListEntitlementsResponse listEntitlements(ListEntitlementsRequest request);

    /**
     * Lists all of the currently available errata. Filter the list against a variety of criteria including but not
     * limited to its name, classification type, advisory severity, and OS family.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListErrataExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListErrata API.
     */
    ListErrataResponse listErrata(ListErrataRequest request);

    /**
     * Lists module stream profiles from the specified software source OCID. Filter the list against a variety of
     * criteria including but not limited to its module name, stream name, and (profile) name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListModuleStreamProfilesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListModuleStreamProfiles API.
     */
    ListModuleStreamProfilesResponse listModuleStreamProfiles(
            ListModuleStreamProfilesRequest request);

    /**
     * Lists module streams from the specified software source OCID. Filter the list against a variety of
     * criteria including but not limited to its module name and (stream) name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListModuleStreamsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListModuleStreams API.
     */
    ListModuleStreamsResponse listModuleStreams(ListModuleStreamsRequest request);

    /**
     * Lists package groups that associate with the specified software source OCID. Filter the list against a
     * variety of criteria including but not limited to its name, and package group type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListPackageGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPackageGroups API.
     */
    ListPackageGroupsResponse listPackageGroups(ListPackageGroupsRequest request);

    /**
     * Lists software packages in the specified software source.  Filter the list against a variety of criteria
     * including but not limited to its name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListSoftwarePackagesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSoftwarePackages API.
     */
    ListSoftwarePackagesResponse listSoftwarePackages(ListSoftwarePackagesRequest request);

    /**
     * Lists available software source vendors. Filter the list against a variety of criteria including but not limited
     * to its name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListSoftwareSourceVendorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSoftwareSourceVendors API.
     */
    ListSoftwareSourceVendorsResponse listSoftwareSourceVendors(
            ListSoftwareSourceVendorsRequest request);

    /**
     * Lists software sources that match the specified tenancy or software source OCID. Filter the list against a
     * variety of criteria including but not limited to its name, status, architecture, and OS family.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListSoftwareSourcesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSoftwareSources API.
     */
    ListSoftwareSourcesResponse listSoftwareSources(ListSoftwareSourcesRequest request);

    /**
     * Lists modules from a list of software sources. Filter the list against a variety of
     * criteria including the module name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/SearchSoftwareSourceModuleStreamsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchSoftwareSourceModuleStreams API.
     */
    SearchSoftwareSourceModuleStreamsResponse searchSoftwareSourceModuleStreams(
            SearchSoftwareSourceModuleStreamsRequest request);

    /**
     * Lists modules from a list of software sources. Filter the list against a variety of
     * criteria including the (module) name.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/SearchSoftwareSourceModulesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchSoftwareSourceModules API.
     */
    SearchSoftwareSourceModulesResponse searchSoftwareSourceModules(
            SearchSoftwareSourceModulesRequest request);

    /**
     * Searches the package groups from the specified list of software sources. Filter the list against a variety of criteria
     * including but not limited to its name, and group type.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/SearchSoftwareSourcePackageGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use SearchSoftwareSourcePackageGroups API.
     */
    SearchSoftwareSourcePackageGroupsResponse searchSoftwareSourcePackageGroups(
            SearchSoftwareSourcePackageGroupsRequest request);

    /**
     * Updates the specified software source's details, including but not limited to name, description, and tags.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdateSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSoftwareSource API.
     */
    UpdateSoftwareSourceResponse updateSoftwareSource(UpdateSoftwareSourceRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    SoftwareSourceWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    SoftwareSourcePaginators getPaginators();
}
