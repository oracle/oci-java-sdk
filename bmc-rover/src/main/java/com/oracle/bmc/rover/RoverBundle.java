/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover;

import com.oracle.bmc.rover.requests.*;
import com.oracle.bmc.rover.responses.*;

/**
 * A description of the RoverCloudService API. This service client uses
 * CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit
 * breaker configuration is defined by the user.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
public interface RoverBundle extends AutoCloseable {

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
     * List all the roverBundleRequests for a given roverClusterId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/ListRoverClusterRoverBundleRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListRoverClusterRoverBundleRequests API.
     */
    ListRoverClusterRoverBundleRequestsResponse listRoverClusterRoverBundleRequests(
            ListRoverClusterRoverBundleRequestsRequest request);

    /**
     * List all the roverBundleRequests for a given roverNodeId.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/ListRoverNodeRoverBundleRequestsExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     ListRoverNodeRoverBundleRequests API.
     */
    ListRoverNodeRoverBundleRequestsResponse listRoverNodeRoverBundleRequests(
            ListRoverNodeRoverBundleRequestsRequest request);

    /**
     * Request to get rover bundle to the bucket in customer's tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RequestBundleRoverClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestBundleRoverCluster API.
     */
    RequestBundleRoverClusterResponse requestBundleRoverCluster(
            RequestBundleRoverClusterRequest request);

    /**
     * Request to get rover bundle to the bucket in customer's tenancy.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RequestBundleRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RequestBundleRoverNode API.
     */
    RequestBundleRoverNodeResponse requestBundleRoverNode(RequestBundleRoverNodeRequest request);

    /**
     * Retrieve the latest available rover bundle version that can be upgraded to based on current
     * bundle version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RetrieveAvailableBundleVersionsRoverClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetrieveAvailableBundleVersionsRoverCluster API.
     */
    RetrieveAvailableBundleVersionsRoverClusterResponse retrieveAvailableBundleVersionsRoverCluster(
            RetrieveAvailableBundleVersionsRoverClusterRequest request);

    /**
     * Retrieve the latest available rover bundle version that can be upgraded to based on current
     * bundle version.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RetrieveAvailableBundleVersionsRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetrieveAvailableBundleVersionsRoverNode API.
     */
    RetrieveAvailableBundleVersionsRoverNodeResponse retrieveAvailableBundleVersionsRoverNode(
            RetrieveAvailableBundleVersionsRoverNodeRequest request);

    /**
     * Retrieve the status and progress of a rover bundle copy request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RetrieveBundleStatusRoverClusterExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetrieveBundleStatusRoverCluster API.
     */
    RetrieveBundleStatusRoverClusterResponse retrieveBundleStatusRoverCluster(
            RetrieveBundleStatusRoverClusterRequest request);

    /**
     * Retrieve the status and progress of a rover bundle copy request.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs. This operation uses
     *     RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION as default if no retry strategy is
     *     provided. The specifics of the default retry strategy are described here
     *     https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *     <p><b>Example: </b>Click <a
     *     href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/rover/RetrieveBundleStatusRoverNodeExample.java.html"
     *     target="_blank" rel="noopener noreferrer" >here</a> to see how to use
     *     RetrieveBundleStatusRoverNode API.
     */
    RetrieveBundleStatusRoverNodeResponse retrieveBundleStatusRoverNode(
            RetrieveBundleStatusRoverNodeRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may
     * return multiple pages of data. These paginators provide an {@link java.lang.Iterable}
     * interface so that service responses, or resources/records, can be iterated through without
     * having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    RoverBundlePaginators getPaginators();
}
