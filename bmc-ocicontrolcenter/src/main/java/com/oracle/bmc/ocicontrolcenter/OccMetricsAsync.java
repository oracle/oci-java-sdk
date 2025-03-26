/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocicontrolcenter;

import com.oracle.bmc.ocicontrolcenter.requests.*;
import com.oracle.bmc.ocicontrolcenter.responses.*;

/**
 * OCI Control Center (OCC) service enables you to monitor the region-level cloud consumption and provides the region-level capacity data, in realms where OCC is available. Use the OCI Control Center (OCC) API to explore region-level capacity and utilization information about core services. For more information, see [OCI Control Center](https://docs.oracle.com/iaas/Content/control-center/home.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230515")
public interface OccMetricsAsync extends AutoCloseable {

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
     * Returns a list of available metrics for the given namespace. The results for metrics with dimensions includes list of all the associated dimensions. The results are sorted by the metricName and then by dimension in ascending alphabetical order. For a list of valid namespaces, see {@link #listNamespaces(ListNamespacesRequest, Consumer, Consumer) listNamespaces}.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListMetricPropertiesResponse> listMetricProperties(
            ListMetricPropertiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListMetricPropertiesRequest, ListMetricPropertiesResponse>
                    handler);

    /**
     * List all the available source services called namespaces emitting metrics for this region. The namespaces are sorted in ascending alphabetical order.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListNamespacesResponse> listNamespaces(
            ListNamespacesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListNamespacesRequest, ListNamespacesResponse>
                    handler);

    /**
     * Returns the summarized data for the given metric from the given namespace.  The aggregation method depends on the metric.
     * The metric data can be filtered by providing the dimension, startTime or endTime.  The metric
     * data in the response is sorted by dimension in ascending order and then by sampleTime in ascending chronological order.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RequestSummarizedMetricDataResponse> requestSummarizedMetricData(
            RequestSummarizedMetricDataRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            RequestSummarizedMetricDataRequest, RequestSummarizedMetricDataResponse>
                    handler);
}
