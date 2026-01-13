/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.healthchecks.requests;

import com.oracle.bmc.healthchecks.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/healthchecks/ListPingProbeResultsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPingProbeResultsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
public class ListPingProbeResultsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of a monitor or on-demand probe. */
    private String probeConfigurationId;

    /** The OCID of a monitor or on-demand probe. */
    public String getProbeConfigurationId() {
        return probeConfigurationId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** Returns results with a {@code startTime} equal to or greater than the specified value. */
    private Double startTimeGreaterThanOrEqualTo;

    /** Returns results with a {@code startTime} equal to or greater than the specified value. */
    public Double getStartTimeGreaterThanOrEqualTo() {
        return startTimeGreaterThanOrEqualTo;
    }
    /** Returns results with a {@code startTime} equal to or less than the specified value. */
    private Double startTimeLessThanOrEqualTo;

    /** Returns results with a {@code startTime} equal to or less than the specified value. */
    public Double getStartTimeLessThanOrEqualTo() {
        return startTimeLessThanOrEqualTo;
    }
    /** Controls the sort order of results. */
    private SortOrder sortOrder;

    /** Controls the sort order of results. */
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

    /** Controls the sort order of results. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** Filters results that match the {@code target}. */
    private String target;

    /** Filters results that match the {@code target}. */
    public String getTarget() {
        return target;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPingProbeResultsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of a monitor or on-demand probe. */
        private String probeConfigurationId = null;

        /**
         * The OCID of a monitor or on-demand probe.
         *
         * @param probeConfigurationId the value to set
         * @return this builder instance
         */
        public Builder probeConfigurationId(String probeConfigurationId) {
            this.probeConfigurationId = probeConfigurationId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The maximum number of items to return in a paginated "List" call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Returns results with a {@code startTime} equal to or greater than the specified value.
         */
        private Double startTimeGreaterThanOrEqualTo = null;

        /**
         * Returns results with a {@code startTime} equal to or greater than the specified value.
         *
         * @param startTimeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder startTimeGreaterThanOrEqualTo(Double startTimeGreaterThanOrEqualTo) {
            this.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            return this;
        }

        /** Returns results with a {@code startTime} equal to or less than the specified value. */
        private Double startTimeLessThanOrEqualTo = null;

        /**
         * Returns results with a {@code startTime} equal to or less than the specified value.
         *
         * @param startTimeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder startTimeLessThanOrEqualTo(Double startTimeLessThanOrEqualTo) {
            this.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
            return this;
        }

        /** Controls the sort order of results. */
        private SortOrder sortOrder = null;

        /**
         * Controls the sort order of results.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** Filters results that match the {@code target}. */
        private String target = null;

        /**
         * Filters results that match the {@code target}.
         *
         * @param target the value to set
         * @return this builder instance
         */
        public Builder target(String target) {
            this.target = target;
            return this;
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
        public Builder copy(ListPingProbeResultsRequest o) {
            probeConfigurationId(o.getProbeConfigurationId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            startTimeGreaterThanOrEqualTo(o.getStartTimeGreaterThanOrEqualTo());
            startTimeLessThanOrEqualTo(o.getStartTimeLessThanOrEqualTo());
            sortOrder(o.getSortOrder());
            target(o.getTarget());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPingProbeResultsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPingProbeResultsRequest
         */
        public ListPingProbeResultsRequest build() {
            ListPingProbeResultsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPingProbeResultsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPingProbeResultsRequest
         */
        public ListPingProbeResultsRequest buildWithoutInvocationCallback() {
            ListPingProbeResultsRequest request = new ListPingProbeResultsRequest();
            request.probeConfigurationId = probeConfigurationId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            request.startTimeLessThanOrEqualTo = startTimeLessThanOrEqualTo;
            request.sortOrder = sortOrder;
            request.target = target;
            return request;
            // new ListPingProbeResultsRequest(probeConfigurationId, opcRequestId, limit, page,
            // startTimeGreaterThanOrEqualTo, startTimeLessThanOrEqualTo, sortOrder, target);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .probeConfigurationId(probeConfigurationId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .startTimeGreaterThanOrEqualTo(startTimeGreaterThanOrEqualTo)
                .startTimeLessThanOrEqualTo(startTimeLessThanOrEqualTo)
                .sortOrder(sortOrder)
                .target(target);
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
        sb.append(",probeConfigurationId=").append(String.valueOf(this.probeConfigurationId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",startTimeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.startTimeGreaterThanOrEqualTo));
        sb.append(",startTimeLessThanOrEqualTo=")
                .append(String.valueOf(this.startTimeLessThanOrEqualTo));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",target=").append(String.valueOf(this.target));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPingProbeResultsRequest)) {
            return false;
        }

        ListPingProbeResultsRequest other = (ListPingProbeResultsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.probeConfigurationId, other.probeConfigurationId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.startTimeGreaterThanOrEqualTo, other.startTimeGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.startTimeLessThanOrEqualTo, other.startTimeLessThanOrEqualTo)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.target, other.target);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.probeConfigurationId == null
                                ? 43
                                : this.probeConfigurationId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeGreaterThanOrEqualTo == null
                                ? 43
                                : this.startTimeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeLessThanOrEqualTo == null
                                ? 43
                                : this.startTimeLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        return result;
    }
}
