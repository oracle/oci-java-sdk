/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSqlCollectionLogInsightsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSqlCollectionLogInsightsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSqlCollectionLogInsightsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * An optional filter to return the stats of the SQL collection logs collected after the date-time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     */
    private java.util.Date timeStarted;

    /**
     * An optional filter to return the stats of the SQL collection logs collected after the date-time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }
    /**
     * An optional filter to return the stats of the SQL collection logs collected before the date-time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     */
    private java.util.Date timeEnded;

    /**
     * An optional filter to return the stats of the SQL collection logs collected before the date-time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }
    /**
     * The OCID of the SQL collection resource.
     */
    private String sqlCollectionId;

    /**
     * The OCID of the SQL collection resource.
     */
    public String getSqlCollectionId() {
        return sqlCollectionId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The group by parameter to summarize SQL collection log insights aggregation.
     */
    private GroupBy groupBy;

    /**
     * The group by parameter to summarize SQL collection log insights aggregation.
     **/
    public enum GroupBy {
        ClientIp("clientIp"),
        ClientProgram("clientProgram"),
        ClientOsUserName("clientOsUserName"),
        ;

        private final String value;
        private static java.util.Map<String, GroupBy> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupBy v : GroupBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        GroupBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GroupBy: " + key);
        }
    };

    /**
     * The group by parameter to summarize SQL collection log insights aggregation.
     */
    public GroupBy getGroupBy() {
        return groupBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSqlCollectionLogInsightsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * An optional filter to return the stats of the SQL collection logs collected after the date-time specified,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         */
        private java.util.Date timeStarted = null;

        /**
         * An optional filter to return the stats of the SQL collection logs collected after the date-time specified,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder instance
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            return this;
        }

        /**
         * An optional filter to return the stats of the SQL collection logs collected before the date-time specified,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         */
        private java.util.Date timeEnded = null;

        /**
         * An optional filter to return the stats of the SQL collection logs collected before the date-time specified,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeEnded the value to set
         * @return this builder instance
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            return this;
        }

        /**
         * The OCID of the SQL collection resource.
         */
        private String sqlCollectionId = null;

        /**
         * The OCID of the SQL collection resource.
         * @param sqlCollectionId the value to set
         * @return this builder instance
         */
        public Builder sqlCollectionId(String sqlCollectionId) {
            this.sqlCollectionId = sqlCollectionId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The group by parameter to summarize SQL collection log insights aggregation.
         */
        private GroupBy groupBy = null;

        /**
         * The group by parameter to summarize SQL collection log insights aggregation.
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
            return this;
        }

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
        public Builder copy(ListSqlCollectionLogInsightsRequest o) {
            timeStarted(o.getTimeStarted());
            timeEnded(o.getTimeEnded());
            sqlCollectionId(o.getSqlCollectionId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            groupBy(o.getGroupBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSqlCollectionLogInsightsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSqlCollectionLogInsightsRequest
         */
        public ListSqlCollectionLogInsightsRequest build() {
            ListSqlCollectionLogInsightsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSqlCollectionLogInsightsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSqlCollectionLogInsightsRequest
         */
        public ListSqlCollectionLogInsightsRequest buildWithoutInvocationCallback() {
            ListSqlCollectionLogInsightsRequest request = new ListSqlCollectionLogInsightsRequest();
            request.timeStarted = timeStarted;
            request.timeEnded = timeEnded;
            request.sqlCollectionId = sqlCollectionId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.groupBy = groupBy;
            return request;
            // new ListSqlCollectionLogInsightsRequest(timeStarted, timeEnded, sqlCollectionId, limit, page, opcRequestId, groupBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .timeStarted(timeStarted)
                .timeEnded(timeEnded)
                .sqlCollectionId(sqlCollectionId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .groupBy(groupBy);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(",timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(",sqlCollectionId=").append(String.valueOf(this.sqlCollectionId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSqlCollectionLogInsightsRequest)) {
            return false;
        }

        ListSqlCollectionLogInsightsRequest other = (ListSqlCollectionLogInsightsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.sqlCollectionId, other.sqlCollectionId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.groupBy, other.groupBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlCollectionId == null ? 43 : this.sqlCollectionId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        return result;
    }
}
