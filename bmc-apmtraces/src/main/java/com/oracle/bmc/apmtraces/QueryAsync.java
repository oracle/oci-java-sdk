/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces;

import com.oracle.bmc.apmtraces.requests.*;
import com.oracle.bmc.apmtraces.responses.*;

/**
 * API for APM Trace service. Use this API to query the Traces and associated Spans.
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface QueryAsync extends AutoCloseable {

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
     * Returns a list of predefined quick pick queries intended to assist the user
     * to choose a query to run.  There is no sorting applied on the results.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListQuickPicksResponse> listQuickPicks(
            ListQuickPicksRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListQuickPicksRequest, ListQuickPicksResponse>
                    handler);

    /**
     * Given a query, constructed according to the APM Defined Query Syntax, retrieves the results - selected attributes,
     * and aggregations of the queried entity.  Query Results are filtered by the filter criteria specified in the where clause.
     * Further query results are grouped by the attributes specified in the group by clause.  Finally,
     * ordering (asc/desc) is done by the specified attributes in the order by clause.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<QueryResponse> query(
            QueryRequest request,
            com.oracle.bmc.responses.AsyncHandler<QueryRequest, QueryResponse> handler);

    /**
     * THIS API ENDPOINT WILL BE DEPRECATED AND INSTEAD /queries/actions/runQuery as defined below WILL BE USED GOING FORWARD.  THIS EXISTS JUST
     * AS A TEMPORARY PLACEHOLDER SO AS TO BE BACKWARDS COMPATIBLE WITH THE UI BETWEEN RELEASE CYCLES.
     * Given a query, constructed according to the APM Defined Query Syntax, retrieves the results - selected attributes,
     * and aggregations of the queried entity.  Query Results are filtered by the filter criteria specified in the where clause.
     * Further query results are grouped by the attributes specified in the group by clause.  Finally,
     * ordering (asc/desc) is done by the specified attributes in the order by clause.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<QueryOldResponse> queryOld(
            QueryOldRequest request,
            com.oracle.bmc.responses.AsyncHandler<QueryOldRequest, QueryOldResponse> handler);
}
