/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.requests;

import com.oracle.bmc.threatintelligence.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/threatintelligence/ListIndicatorsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListIndicatorsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210831")
public class ListIndicatorsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the tenancy to use to filter results.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The result set will include indicators that have any of the provided threat types. To filter for multiple threat types repeat the query parameter.
     */
    private java.util.List<String> threatTypeName;

    public java.util.List<String> getThreatTypeName() {
        return threatTypeName;
    }
    /**
     * The indicator type of entities to be returned.
     */
    private com.oracle.bmc.threatintelligence.model.IndicatorType type;

    public com.oracle.bmc.threatintelligence.model.IndicatorType getType() {
        return type;
    }
    /**
     * The indicator value of entities to be returned.
     */
    private String value;

    public String getValue() {
        return value;
    }
    /**
     * The minimum confidence score of entities to be returned.
     */
    private Integer confidenceGreaterThanOrEqualTo;

    public Integer getConfidenceGreaterThanOrEqualTo() {
        return confidenceGreaterThanOrEqualTo;
    }
    /**
     * The oldest update time of entities to be returned.
     */
    private java.util.Date timeUpdatedGreaterThanOrEqualTo;

    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.threatintelligence.model.SortOrder sortOrder;

    public com.oracle.bmc.threatintelligence.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one field to sort by may be provided.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one field to sort by may be provided.
     *
     **/
    public enum SortBy {
        Confidence("confidence"),
        TimeUpdated("timeUpdated"),
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
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListIndicatorsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The ID of the tenancy to use to filter results.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private java.util.List<String> threatTypeName = null;

        /**
         * The result set will include indicators that have any of the provided threat types. To filter for multiple threat types repeat the query parameter.
         * @return this builder instance
         */
        public Builder threatTypeName(java.util.List<String> threatTypeName) {
            this.threatTypeName = threatTypeName;
            return this;
        }

        /**
         * Singular setter. The result set will include indicators that have any of the provided threat types. To filter for multiple threat types repeat the query parameter.
         * @return this builder instance
         */
        public Builder threatTypeName(String singularValue) {
            return this.threatTypeName(java.util.Arrays.asList(singularValue));
        }

        private com.oracle.bmc.threatintelligence.model.IndicatorType type = null;

        /**
         * The indicator type of entities to be returned.
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.threatintelligence.model.IndicatorType type) {
            this.type = type;
            return this;
        }

        private String value = null;

        /**
         * The indicator value of entities to be returned.
         * @return this builder instance
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        private Integer confidenceGreaterThanOrEqualTo = null;

        /**
         * The minimum confidence score of entities to be returned.
         * @return this builder instance
         */
        public Builder confidenceGreaterThanOrEqualTo(Integer confidenceGreaterThanOrEqualTo) {
            this.confidenceGreaterThanOrEqualTo = confidenceGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timeUpdatedGreaterThanOrEqualTo = null;

        /**
         * The oldest update time of entities to be returned.
         * @return this builder instance
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
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
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private com.oracle.bmc.threatintelligence.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.threatintelligence.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one field to sort by may be provided.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListIndicatorsRequest o) {
            compartmentId(o.getCompartmentId());
            threatTypeName(o.getThreatTypeName());
            type(o.getType());
            value(o.getValue());
            confidenceGreaterThanOrEqualTo(o.getConfidenceGreaterThanOrEqualTo());
            timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListIndicatorsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListIndicatorsRequest
         */
        public ListIndicatorsRequest build() {
            ListIndicatorsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListIndicatorsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListIndicatorsRequest
         */
        public ListIndicatorsRequest buildWithoutInvocationCallback() {
            ListIndicatorsRequest request = new ListIndicatorsRequest();
            request.compartmentId = compartmentId;
            request.threatTypeName = threatTypeName;
            request.type = type;
            request.value = value;
            request.confidenceGreaterThanOrEqualTo = confidenceGreaterThanOrEqualTo;
            request.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListIndicatorsRequest(compartmentId, threatTypeName, type, value, confidenceGreaterThanOrEqualTo, timeUpdatedGreaterThanOrEqualTo, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .threatTypeName(threatTypeName)
                .type(type)
                .value(value)
                .confidenceGreaterThanOrEqualTo(confidenceGreaterThanOrEqualTo)
                .timeUpdatedGreaterThanOrEqualTo(timeUpdatedGreaterThanOrEqualTo)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",threatTypeName=").append(String.valueOf(this.threatTypeName));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",value=").append(String.valueOf(this.value));
        sb.append(",confidenceGreaterThanOrEqualTo=")
                .append(String.valueOf(this.confidenceGreaterThanOrEqualTo));
        sb.append(",timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListIndicatorsRequest)) {
            return false;
        }

        ListIndicatorsRequest other = (ListIndicatorsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.threatTypeName, other.threatTypeName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(
                        this.confidenceGreaterThanOrEqualTo, other.confidenceGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.threatTypeName == null ? 43 : this.threatTypeName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.confidenceGreaterThanOrEqualTo == null
                                ? 43
                                : this.confidenceGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUpdatedGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
