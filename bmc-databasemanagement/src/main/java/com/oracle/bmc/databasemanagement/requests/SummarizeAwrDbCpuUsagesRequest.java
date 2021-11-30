/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbCpuUsagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeAwrDbCpuUsagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class SummarizeAwrDbCpuUsagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The parameter to filter the database by internal ID.
     * Note that the internal ID of the database can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs
     *
     */
    private String awrDbId;

    /**
     * The optional single value query parameter to filter the database instance number.
     */
    private String instNum;

    /**
     * The optional greater than or equal to filter on the snapshot ID.
     */
    private Integer beginSnIdGreaterThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the snapshot ID.
     */
    private Integer endSnIdLessThanOrEqualTo;

    /**
     * The optional greater than or equal to query parameter to filter the timestamp.
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp.
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The optional query parameter to filter ASH activities by FOREGROUND or BACKGROUND.
     */
    private SessionType sessionType;

    /**
     * The optional query parameter to filter ASH activities by FOREGROUND or BACKGROUND.
     **/
    public enum SessionType {
        Foreground("FOREGROUND"),
        Background("BACKGROUND"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, SessionType> map;

        static {
            map = new java.util.HashMap<>();
            for (SessionType v : SessionType.values()) {
                map.put(v.getValue(), v);
            }
        }

        SessionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SessionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SessionType: " + key);
        }
    };
    /**
     * The optional query parameter to filter the database container by an exact ID value.
     * Note that the database container ID can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
     *
     */
    private Integer containerId;

    /**
     * The page token representing the page from where the next set of paginated results
     * are retrieved. This is usually retrieved from a previous list call.
     *
     */
    private String page;

    /**
     * The maximum number of records returned in large paginated response.
     */
    private Integer limit;

    /**
     * The option to sort the AWR CPU usage summary data.
     */
    private SortBy sortBy;

    /**
     * The option to sort the AWR CPU usage summary data.
     **/
    public enum SortBy {
        TimeSampled("TIME_SAMPLED"),
        AvgValue("AVG_VALUE"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Descending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeAwrDbCpuUsagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(SummarizeAwrDbCpuUsagesRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            awrDbId(o.getAwrDbId());
            instNum(o.getInstNum());
            beginSnIdGreaterThanOrEqualTo(o.getBeginSnIdGreaterThanOrEqualTo());
            endSnIdLessThanOrEqualTo(o.getEndSnIdLessThanOrEqualTo());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            sessionType(o.getSessionType());
            containerId(o.getContainerId());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeAwrDbCpuUsagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeAwrDbCpuUsagesRequest
         */
        public SummarizeAwrDbCpuUsagesRequest build() {
            SummarizeAwrDbCpuUsagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
