/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement;

import com.oracle.bmc.capacitymanagement.requests.*;
import com.oracle.bmc.capacitymanagement.responses.*;

/**
 * OCI Control Center (OCC) Capacity Management enables you to manage capacity requests in realms where OCI Control Center Capacity Management is available. For more information, see [OCI Control Center](https://docs.oracle.com/iaas/Content/control-center/home.htm).
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public interface CapacityManagement extends AutoCloseable {

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
     * Create availability catalog
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/CreateOccAvailabilityCatalogExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOccAvailabilityCatalog API.
     */
    CreateOccAvailabilityCatalogResponse createOccAvailabilityCatalog(
            CreateOccAvailabilityCatalogRequest request);

    /**
     * Create Capacity Request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/CreateOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOccCapacityRequest API.
     */
    CreateOccCapacityRequestResponse createOccCapacityRequest(
            CreateOccCapacityRequestRequest request);

    /**
     * Create customer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/CreateOccCustomerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOccCustomer API.
     */
    CreateOccCustomerResponse createOccCustomer(CreateOccCustomerRequest request);

    /**
     * Create customer group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/CreateOccCustomerGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOccCustomerGroup API.
     */
    CreateOccCustomerGroupResponse createOccCustomerGroup(CreateOccCustomerGroupRequest request);

    /**
     * Deletes the availability catalog resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/DeleteOccAvailabilityCatalogExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOccAvailabilityCatalog API.
     */
    DeleteOccAvailabilityCatalogResponse deleteOccAvailabilityCatalog(
            DeleteOccAvailabilityCatalogRequest request);

    /**
     * Deletes the capacity request resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/DeleteOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOccCapacityRequest API.
     */
    DeleteOccCapacityRequestResponse deleteOccCapacityRequest(
            DeleteOccCapacityRequestRequest request);

    /**
     * Deletes the customer resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/DeleteOccCustomerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOccCustomer API.
     */
    DeleteOccCustomerResponse deleteOccCustomer(DeleteOccCustomerRequest request);

    /**
     * Deletes the customer group resource.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/DeleteOccCustomerGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteOccCustomerGroup API.
     */
    DeleteOccCustomerGroupResponse deleteOccCustomerGroup(DeleteOccCustomerGroupRequest request);

    /**
     * Get details about availability catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/GetOccAvailabilityCatalogExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOccAvailabilityCatalog API.
     */
    GetOccAvailabilityCatalogResponse getOccAvailabilityCatalog(
            GetOccAvailabilityCatalogRequest request);

    /**
     * Returns the binary contents of the availability catalog. Can be saved as a csv file.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/GetOccAvailabilityCatalogContentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOccAvailabilityCatalogContent API.
     */
    GetOccAvailabilityCatalogContentResponse getOccAvailabilityCatalogContent(
            GetOccAvailabilityCatalogContentRequest request);

    /**
     * Get details about the capacity request.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/GetOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOccCapacityRequest API.
     */
    GetOccCapacityRequestResponse getOccCapacityRequest(GetOccCapacityRequestRequest request);

    /**
     * Gets information about the specified customer group.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/GetOccCustomerGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetOccCustomerGroup API.
     */
    GetOccCustomerGroupResponse getOccCustomerGroup(GetOccCustomerGroupRequest request);

    /**
     * Lists an overview of all resources in that namespace in a given time interval.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListInternalNamespaceOccOverviewsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInternalNamespaceOccOverviews API.
     */
    ListInternalNamespaceOccOverviewsResponse listInternalNamespaceOccOverviews(
            ListInternalNamespaceOccOverviewsRequest request);

    /**
     * List details about a given occHandoverResourceBlock.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListInternalOccHandoverResourceBlockDetailsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInternalOccHandoverResourceBlockDetails API.
     */
    ListInternalOccHandoverResourceBlockDetailsResponse listInternalOccHandoverResourceBlockDetails(
            ListInternalOccHandoverResourceBlockDetailsRequest request);

    /**
     * List Occ Handover Resource blocks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListInternalOccHandoverResourceBlocksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListInternalOccHandoverResourceBlocks API.
     */
    ListInternalOccHandoverResourceBlocksResponse listInternalOccHandoverResourceBlocks(
            ListInternalOccHandoverResourceBlocksRequest request);

    /**
     * Lists availabilities for a particular availability catalog.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccAvailabilitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccAvailabilities API.
     */
    ListOccAvailabilitiesResponse listOccAvailabilities(ListOccAvailabilitiesRequest request);

    /**
     * Lists all availability catalogs.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccAvailabilityCatalogsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccAvailabilityCatalogs API.
     */
    ListOccAvailabilityCatalogsResponse listOccAvailabilityCatalogs(
            ListOccAvailabilityCatalogsRequest request);

    /**
     * An internal api to list availability catalogs.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccAvailabilityCatalogsInternalExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccAvailabilityCatalogsInternal API.
     */
    ListOccAvailabilityCatalogsInternalResponse listOccAvailabilityCatalogsInternal(
            ListOccAvailabilityCatalogsInternalRequest request);

    /**
     * Lists all capacity requests.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccCapacityRequestsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccCapacityRequests API.
     */
    ListOccCapacityRequestsResponse listOccCapacityRequests(ListOccCapacityRequestsRequest request);

    /**
     * An internal api to list all capacity requests.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccCapacityRequestsInternalExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccCapacityRequestsInternal API.
     */
    ListOccCapacityRequestsInternalResponse listOccCapacityRequestsInternal(
            ListOccCapacityRequestsInternalRequest request);

    /**
     * Lists all the customer groups.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccCustomerGroupsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccCustomerGroups API.
     */
    ListOccCustomerGroupsResponse listOccCustomerGroups(ListOccCustomerGroupsRequest request);

    /**
     * List details about a given occHandoverResourceBlock.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccHandoverResourceBlockDetailsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccHandoverResourceBlockDetails API.
     */
    ListOccHandoverResourceBlockDetailsResponse listOccHandoverResourceBlockDetails(
            ListOccHandoverResourceBlockDetailsRequest request);

    /**
     * List Occ Handover Resource blocks.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccHandoverResourceBlocksExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccHandoverResourceBlocks API.
     */
    ListOccHandoverResourceBlocksResponse listOccHandoverResourceBlocks(
            ListOccHandoverResourceBlocksRequest request);

    /**
     * Lists an overview of all resources in that namespace in a given time interval.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccOverviewsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListOccOverviews API.
     */
    ListOccOverviewsResponse listOccOverviews(ListOccOverviewsRequest request);

    /**
     * Updates the OccCapacityRequest by evaluating a sequence of instructions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/PatchInternalOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchInternalOccCapacityRequest API.
     */
    PatchInternalOccCapacityRequestResponse patchInternalOccCapacityRequest(
            PatchInternalOccCapacityRequestRequest request);

    /**
     * Updates the OccCapacityRequest by evaluating a sequence of instructions.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/PatchOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PatchOccCapacityRequest API.
     */
    PatchOccCapacityRequestResponse patchOccCapacityRequest(PatchOccCapacityRequestRequest request);

    /**
     * Publishes the version of availability catalog specified by the operator. This makes that catalog version visible to customers.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/PublishOccAvailabilityCatalogExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use PublishOccAvailabilityCatalog API.
     */
    PublishOccAvailabilityCatalogResponse publishOccAvailabilityCatalog(
            PublishOccAvailabilityCatalogRequest request);

    /**
     * The internal api to update the capacity request. This api will be used by operators for updating the capacity request to either completed, resubmitted or rejected.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateInternalOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateInternalOccCapacityRequest API.
     */
    UpdateInternalOccCapacityRequestResponse updateInternalOccCapacityRequest(
            UpdateInternalOccCapacityRequestRequest request);

    /**
     * The request to update the availability catalog. Currently only freeform tags can be updated via this api.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccAvailabilityCatalogExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOccAvailabilityCatalog API.
     */
    UpdateOccAvailabilityCatalogResponse updateOccAvailabilityCatalog(
            UpdateOccAvailabilityCatalogRequest request);

    /**
     * The request to update the capacity request. The user can perform actions like closing a partially completed request so that it doesn't go ahead for full completion.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccCapacityRequestExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOccCapacityRequest API.
     */
    UpdateOccCapacityRequestResponse updateOccCapacityRequest(
            UpdateOccCapacityRequestRequest request);

    /**
     * The request to update the customer.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccCustomerExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOccCustomer API.
     */
    UpdateOccCustomerResponse updateOccCustomer(UpdateOccCustomerRequest request);

    /**
     * The request to update the customer group.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation uses RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is provided.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccCustomerGroupExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateOccCustomerGroup API.
     */
    UpdateOccCustomerGroupResponse updateOccCustomerGroup(UpdateOccCustomerGroupRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    CapacityManagementWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    CapacityManagementPaginators getPaginators();
}
