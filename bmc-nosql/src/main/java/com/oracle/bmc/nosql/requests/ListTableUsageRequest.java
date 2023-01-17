/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/ListTableUsageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTableUsageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
public class ListTableUsageRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A table name within the compartment, or a table OCID.
     */
    private String tableNameOrId;

    /**
     * A table name within the compartment, or a table OCID.
     */
    public String getTableNameOrId() {
        return tableNameOrId;
    }
    /**
     * The ID of a table's compartment. When a table is identified
     * by name, the compartmentId is often needed to provide
     * context for interpreting the name.
     *
     */
    private String compartmentId;

    /**
     * The ID of a table's compartment. When a table is identified
     * by name, the compartmentId is often needed to provide
     * context for interpreting the name.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The start time to use for the request. If no time range
     * is set for this request, the most recent complete usage
     * record is returned.
     *
     */
    private java.util.Date timeStart;

    /**
     * The start time to use for the request. If no time range
     * is set for this request, the most recent complete usage
     * record is returned.
     *
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * The end time to use for the request.
     */
    private java.util.Date timeEnd;

    /**
     * The end time to use for the request.
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start
     * retrieving results. This is usually retrieved from a previous
     * list call.
     *
     */
    private String page;

    /**
     * The page token representing the page at which to start
     * retrieving results. This is usually retrieved from a previous
     * list call.
     *
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTableUsageRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A table name within the compartment, or a table OCID.
         */
        private String tableNameOrId = null;

        /**
         * A table name within the compartment, or a table OCID.
         * @param tableNameOrId the value to set
         * @return this builder instance
         */
        public Builder tableNameOrId(String tableNameOrId) {
            this.tableNameOrId = tableNameOrId;
            return this;
        }

        /**
         * The ID of a table's compartment. When a table is identified
         * by name, the compartmentId is often needed to provide
         * context for interpreting the name.
         *
         */
        private String compartmentId = null;

        /**
         * The ID of a table's compartment. When a table is identified
         * by name, the compartmentId is often needed to provide
         * context for interpreting the name.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The start time to use for the request. If no time range
         * is set for this request, the most recent complete usage
         * record is returned.
         *
         */
        private java.util.Date timeStart = null;

        /**
         * The start time to use for the request. If no time range
         * is set for this request, the most recent complete usage
         * record is returned.
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * The end time to use for the request.
         */
        private java.util.Date timeEnd = null;

        /**
         * The end time to use for the request.
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start
         * retrieving results. This is usually retrieved from a previous
         * list call.
         *
         */
        private String page = null;

        /**
         * The page token representing the page at which to start
         * retrieving results. This is usually retrieved from a previous
         * list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListTableUsageRequest o) {
            tableNameOrId(o.getTableNameOrId());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTableUsageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListTableUsageRequest
         */
        public ListTableUsageRequest build() {
            ListTableUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTableUsageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTableUsageRequest
         */
        public ListTableUsageRequest buildWithoutInvocationCallback() {
            ListTableUsageRequest request = new ListTableUsageRequest();
            request.tableNameOrId = tableNameOrId;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListTableUsageRequest(tableNameOrId, compartmentId, opcRequestId, timeStart, timeEnd, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .tableNameOrId(tableNameOrId)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .limit(limit)
                .page(page);
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
        sb.append(",tableNameOrId=").append(String.valueOf(this.tableNameOrId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTableUsageRequest)) {
            return false;
        }

        ListTableUsageRequest other = (ListTableUsageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.tableNameOrId, other.tableNameOrId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.tableNameOrId == null ? 43 : this.tableNameOrId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
