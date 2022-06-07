/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListAvailabilityHistoriesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAvailabilityHistoriesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class ListAvailabilityHistoriesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Management Agent identifier
     */
    private String managementAgentId;

    public String getManagementAgentId() {
        return managementAgentId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Filter to limit the availability history results to that of time after the input time including the boundary record.
     * Defaulted to current date minus one year.
     * The date and time to be given as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     */
    private java.util.Date timeAvailabilityStatusEndedGreaterThan;

    public java.util.Date getTimeAvailabilityStatusEndedGreaterThan() {
        return timeAvailabilityStatusEndedGreaterThan;
    }
    /**
     * Filter to limit the availability history results to that of time before the input time including the boundary record
     * Defaulted to current date.
     * The date and time to be given as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     */
    private java.util.Date timeAvailabilityStatusStartedLessThan;

    public java.util.Date getTimeAvailabilityStatusStartedLessThan() {
        return timeAvailabilityStatusStartedLessThan;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Default order for timeAvailabilityStatusStarted is descending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Default order for timeAvailabilityStatusStarted is descending.
     *
     **/
    public enum SortBy {
        TimeAvailabilityStatusStarted("timeAvailabilityStatusStarted"),
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

    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAvailabilityHistoriesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String managementAgentId = null;

        /**
         * Unique Management Agent identifier
         * @return this builder instance
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private java.util.Date timeAvailabilityStatusEndedGreaterThan = null;

        /**
         * Filter to limit the availability history results to that of time after the input time including the boundary record.
         * Defaulted to current date minus one year.
         * The date and time to be given as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @return this builder instance
         */
        public Builder timeAvailabilityStatusEndedGreaterThan(
                java.util.Date timeAvailabilityStatusEndedGreaterThan) {
            this.timeAvailabilityStatusEndedGreaterThan = timeAvailabilityStatusEndedGreaterThan;
            return this;
        }

        private java.util.Date timeAvailabilityStatusStartedLessThan = null;

        /**
         * Filter to limit the availability history results to that of time before the input time including the boundary record
         * Defaulted to current date.
         * The date and time to be given as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @return this builder instance
         */
        public Builder timeAvailabilityStatusStartedLessThan(
                java.util.Date timeAvailabilityStatusStartedLessThan) {
            this.timeAvailabilityStatusStartedLessThan = timeAvailabilityStatusStartedLessThan;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Default order for timeAvailabilityStatusStarted is descending.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListAvailabilityHistoriesRequest o) {
            managementAgentId(o.getManagementAgentId());
            opcRequestId(o.getOpcRequestId());
            timeAvailabilityStatusEndedGreaterThan(o.getTimeAvailabilityStatusEndedGreaterThan());
            timeAvailabilityStatusStartedLessThan(o.getTimeAvailabilityStatusStartedLessThan());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAvailabilityHistoriesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAvailabilityHistoriesRequest
         */
        public ListAvailabilityHistoriesRequest build() {
            ListAvailabilityHistoriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAvailabilityHistoriesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAvailabilityHistoriesRequest
         */
        public ListAvailabilityHistoriesRequest buildWithoutInvocationCallback() {
            ListAvailabilityHistoriesRequest request = new ListAvailabilityHistoriesRequest();
            request.managementAgentId = managementAgentId;
            request.opcRequestId = opcRequestId;
            request.timeAvailabilityStatusEndedGreaterThan = timeAvailabilityStatusEndedGreaterThan;
            request.timeAvailabilityStatusStartedLessThan = timeAvailabilityStatusStartedLessThan;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListAvailabilityHistoriesRequest(managementAgentId, opcRequestId, timeAvailabilityStatusEndedGreaterThan, timeAvailabilityStatusStartedLessThan, limit, page, sortOrder, sortBy);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .managementAgentId(managementAgentId)
                .opcRequestId(opcRequestId)
                .timeAvailabilityStatusEndedGreaterThan(timeAvailabilityStatusEndedGreaterThan)
                .timeAvailabilityStatusStartedLessThan(timeAvailabilityStatusStartedLessThan)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeAvailabilityStatusEndedGreaterThan=")
                .append(String.valueOf(this.timeAvailabilityStatusEndedGreaterThan));
        sb.append(",timeAvailabilityStatusStartedLessThan=")
                .append(String.valueOf(this.timeAvailabilityStatusStartedLessThan));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAvailabilityHistoriesRequest)) {
            return false;
        }

        ListAvailabilityHistoriesRequest other = (ListAvailabilityHistoriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.timeAvailabilityStatusEndedGreaterThan,
                        other.timeAvailabilityStatusEndedGreaterThan)
                && java.util.Objects.equals(
                        this.timeAvailabilityStatusStartedLessThan,
                        other.timeAvailabilityStatusStartedLessThan)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAvailabilityStatusEndedGreaterThan == null
                                ? 43
                                : this.timeAvailabilityStatusEndedGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAvailabilityStatusStartedLessThan == null
                                ? 43
                                : this.timeAvailabilityStatusStartedLessThan.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
