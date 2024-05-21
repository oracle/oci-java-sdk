/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks;

import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;

/**
 * API for the Health Checks service. Use this API to manage endpoint probes and monitors.
 * For more information, see
 * [Overview of the Health Checks Service](https://docs.cloud.oracle.com/iaas/Content/HealthChecks/Concepts/healthchecks.htm).
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public interface HealthChecks extends AutoCloseable {

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
     * Moves a monitor into a different compartment. When provided, `If-Match` is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ChangeHttpMonitorCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeHttpMonitorCompartment API.
     */
    ChangeHttpMonitorCompartmentResponse changeHttpMonitorCompartment(
            ChangeHttpMonitorCompartmentRequest request);

    /**
     * Moves a monitor into a different compartment. When provided, `If-Match` is checked
     * against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ChangePingMonitorCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangePingMonitorCompartment API.
     */
    ChangePingMonitorCompartmentResponse changePingMonitorCompartment(
            ChangePingMonitorCompartmentRequest request);

    /**
     * Creates an HTTP monitor. Vantage points will be automatically selected if not specified,
     * and probes will be initiated from each vantage point to each of the targets at the frequency
     * specified by `intervalInSeconds`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/CreateHttpMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateHttpMonitor API.
     */
    CreateHttpMonitorResponse createHttpMonitor(CreateHttpMonitorRequest request);

    /**
     * Creates an on-demand HTTP probe. The location response header contains the URL for
     * fetching the probe results.
     * <p>
     *Note:* On-demand probe configurations are not saved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/CreateOnDemandHttpProbeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOnDemandHttpProbe API.
     */
    CreateOnDemandHttpProbeResponse createOnDemandHttpProbe(CreateOnDemandHttpProbeRequest request);

    /**
     * Creates an on-demand ping probe. The location response header contains the URL for
     * fetching probe results.
     * <p>
     *Note:* The on-demand probe configuration is not saved.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/CreateOnDemandPingProbeExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateOnDemandPingProbe API.
     */
    CreateOnDemandPingProbeResponse createOnDemandPingProbe(CreateOnDemandPingProbeRequest request);

    /**
     * Creates a ping monitor. Vantage points will be automatically selected if not specified,
     * and probes will be initiated from each vantage point to each of the targets at the frequency
     * specified by `intervalInSeconds`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/CreatePingMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreatePingMonitor API.
     */
    CreatePingMonitorResponse createPingMonitor(CreatePingMonitorRequest request);

    /**
     * Deletes the HTTP monitor and its configuration. All future probes of this
     * monitor are stopped. Results associated with the monitor are not deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/DeleteHttpMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteHttpMonitor API.
     */
    DeleteHttpMonitorResponse deleteHttpMonitor(DeleteHttpMonitorRequest request);

    /**
     * Deletes the ping monitor and its configuration. All future probes of this
     * monitor are stopped. Results associated with the monitor are not deleted.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/DeletePingMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeletePingMonitor API.
     */
    DeletePingMonitorResponse deletePingMonitor(DeletePingMonitorRequest request);

    /**
     * Gets the configuration for the specified monitor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/GetHttpMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetHttpMonitor API.
     */
    GetHttpMonitorResponse getHttpMonitor(GetHttpMonitorRequest request);

    /**
     * Gets the configuration for the specified ping monitor.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/GetPingMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetPingMonitor API.
     */
    GetPingMonitorResponse getPingMonitor(GetPingMonitorRequest request);

    /**
     * Gets information about all vantage points available to the user.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListHealthChecksVantagePointsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHealthChecksVantagePoints API.
     */
    ListHealthChecksVantagePointsResponse listHealthChecksVantagePoints(
            ListHealthChecksVantagePointsRequest request);

    /**
     * Gets a list of HTTP monitors.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListHttpMonitorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHttpMonitors API.
     */
    ListHttpMonitorsResponse listHttpMonitors(ListHttpMonitorsRequest request);

    /**
     * Gets the HTTP probe results for the specified probe or monitor, where
     * the `probeConfigurationId` is the OCID of either a monitor or an
     * on-demand probe.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListHttpProbeResultsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListHttpProbeResults API.
     */
    ListHttpProbeResultsResponse listHttpProbeResults(ListHttpProbeResultsRequest request);

    /**
     * Gets a list of configured ping monitors.
     * <p>
     * Results are paginated based on `page` and `limit`.  The `opc-next-page` header provides
     * a URL for fetching the next page.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListPingMonitorsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPingMonitors API.
     */
    ListPingMonitorsResponse listPingMonitors(ListPingMonitorsRequest request);

    /**
     * Returns the results for the specified probe, where the `probeConfigurationId`
     * is the OCID of either a monitor or an on-demand probe.
     * <p>
     * Results are paginated based on `page` and `limit`.  The `opc-next-page` header provides
     * a URL for fetching the next page.  Use `sortOrder` to set the order of the
     * results.  If `sortOrder` is unspecified, results are sorted in ascending order by
     * `startTime`.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListPingProbeResultsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListPingProbeResults API.
     */
    ListPingProbeResultsResponse listPingProbeResults(ListPingProbeResultsRequest request);

    /**
     * Updates the configuration of the specified HTTP monitor. Only the fields
     * specified in the request body will be updated; all other configuration
     * properties will remain unchanged.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/UpdateHttpMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateHttpMonitor API.
     */
    UpdateHttpMonitorResponse updateHttpMonitor(UpdateHttpMonitorRequest request);

    /**
     * Updates the configuration of the specified ping monitor. Only the fields
     * specified in the request body will be updated; all other configuration properties
     * will remain unchanged.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/UpdatePingMonitorExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdatePingMonitor API.
     */
    UpdatePingMonitorResponse updatePingMonitor(UpdatePingMonitorRequest request);

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    HealthChecksPaginators getPaginators();
}
