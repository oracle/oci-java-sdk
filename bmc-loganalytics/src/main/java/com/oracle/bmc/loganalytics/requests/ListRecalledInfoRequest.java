/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListRecalledInfoExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRecalledInfoRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListRecalledInfoRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * This is the query parameter of which field to sort by. Only one sort order may be provided.
     * Default order for timeDataStarted is descending. If no value is specified timeDataStarted is
     * default.
     */
    private SortBy sortBy;

    /**
     * This is the query parameter of which field to sort by. Only one sort order may be provided.
     * Default order for timeDataStarted is descending. If no value is specified timeDataStarted is
     * default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeStarted("timeStarted"),
        TimeDataStarted("timeDataStarted"),
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
     * This is the query parameter of which field to sort by. Only one sort order may be provided.
     * Default order for timeDataStarted is descending. If no value is specified timeDataStarted is
     * default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** This is the start of the time range for recalled data */
    private java.util.Date timeDataStartedGreaterThanOrEqual;

    /** This is the start of the time range for recalled data */
    public java.util.Date getTimeDataStartedGreaterThanOrEqual() {
        return timeDataStartedGreaterThanOrEqual;
    }
    /** This is the end of the time range for recalled data */
    private java.util.Date timeDataEndedLessThan;

    /** This is the end of the time range for recalled data */
    public java.util.Date getTimeDataEndedLessThan() {
        return timeDataEndedLessThan;
    }
    /** This is the set of logsets to filter recalled collection by if any */
    private java.util.List<String> logSets;

    /** This is the set of logsets to filter recalled collection by if any */
    public java.util.List<String> getLogSets() {
        return logSets;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecalledInfoRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * This is the query parameter of which field to sort by. Only one sort order may be
         * provided. Default order for timeDataStarted is descending. If no value is specified
         * timeDataStarted is default.
         */
        private SortBy sortBy = null;

        /**
         * This is the query parameter of which field to sort by. Only one sort order may be
         * provided. Default order for timeDataStarted is descending. If no value is specified
         * timeDataStarted is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** This is the start of the time range for recalled data */
        private java.util.Date timeDataStartedGreaterThanOrEqual = null;

        /**
         * This is the start of the time range for recalled data
         *
         * @param timeDataStartedGreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder timeDataStartedGreaterThanOrEqual(
                java.util.Date timeDataStartedGreaterThanOrEqual) {
            this.timeDataStartedGreaterThanOrEqual = timeDataStartedGreaterThanOrEqual;
            return this;
        }

        /** This is the end of the time range for recalled data */
        private java.util.Date timeDataEndedLessThan = null;

        /**
         * This is the end of the time range for recalled data
         *
         * @param timeDataEndedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeDataEndedLessThan(java.util.Date timeDataEndedLessThan) {
            this.timeDataEndedLessThan = timeDataEndedLessThan;
            return this;
        }

        /** This is the set of logsets to filter recalled collection by if any */
        private java.util.List<String> logSets = null;

        /**
         * This is the set of logsets to filter recalled collection by if any
         *
         * @param logSets the value to set
         * @return this builder instance
         */
        public Builder logSets(java.util.List<String> logSets) {
            this.logSets = logSets;
            return this;
        }

        /**
         * Singular setter. This is the set of logsets to filter recalled collection by if any
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder logSets(String singularValue) {
            return this.logSets(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(ListRecalledInfoRequest o) {
            namespaceName(o.getNamespaceName());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            timeDataStartedGreaterThanOrEqual(o.getTimeDataStartedGreaterThanOrEqual());
            timeDataEndedLessThan(o.getTimeDataEndedLessThan());
            logSets(o.getLogSets());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRecalledInfoRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRecalledInfoRequest
         */
        public ListRecalledInfoRequest build() {
            ListRecalledInfoRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRecalledInfoRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRecalledInfoRequest
         */
        public ListRecalledInfoRequest buildWithoutInvocationCallback() {
            ListRecalledInfoRequest request = new ListRecalledInfoRequest();
            request.namespaceName = namespaceName;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.timeDataStartedGreaterThanOrEqual = timeDataStartedGreaterThanOrEqual;
            request.timeDataEndedLessThan = timeDataEndedLessThan;
            request.logSets = logSets;
            return request;
            // new ListRecalledInfoRequest(namespaceName, opcRequestId, limit, page, sortBy,
            // sortOrder, timeDataStartedGreaterThanOrEqual, timeDataEndedLessThan, logSets);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .timeDataStartedGreaterThanOrEqual(timeDataStartedGreaterThanOrEqual)
                .timeDataEndedLessThan(timeDataEndedLessThan)
                .logSets(logSets);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",timeDataStartedGreaterThanOrEqual=")
                .append(String.valueOf(this.timeDataStartedGreaterThanOrEqual));
        sb.append(",timeDataEndedLessThan=").append(String.valueOf(this.timeDataEndedLessThan));
        sb.append(",logSets=").append(String.valueOf(this.logSets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRecalledInfoRequest)) {
            return false;
        }

        ListRecalledInfoRequest other = (ListRecalledInfoRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(
                        this.timeDataStartedGreaterThanOrEqual,
                        other.timeDataStartedGreaterThanOrEqual)
                && java.util.Objects.equals(this.timeDataEndedLessThan, other.timeDataEndedLessThan)
                && java.util.Objects.equals(this.logSets, other.logSets);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStartedGreaterThanOrEqual == null
                                ? 43
                                : this.timeDataStartedGreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEndedLessThan == null
                                ? 43
                                : this.timeDataEndedLessThan.hashCode());
        result = (result * PRIME) + (this.logSets == null ? 43 : this.logSets.hashCode());
        return result;
    }
}
