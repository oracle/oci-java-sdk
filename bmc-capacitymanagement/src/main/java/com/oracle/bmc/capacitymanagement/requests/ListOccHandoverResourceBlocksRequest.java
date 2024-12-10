/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccHandoverResourceBlocksExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListOccHandoverResourceBlocksRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListOccHandoverResourceBlocksRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The namespace by which we would filter the list.
     */
    private com.oracle.bmc.capacitymanagement.model.Namespace namespace;

    /**
     * The namespace by which we would filter the list.
     */
    public com.oracle.bmc.capacitymanagement.model.Namespace getNamespace() {
        return namespace;
    }
    /**
     * The OCID of the compartment or tenancy in which resources are to be listed.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment or tenancy in which resources are to be listed.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only the list of resources that match the name provided in this filter.
     *
     */
    private String handoverResourceName;

    /**
     * A filter to return only the list of resources that match the name provided in this filter.
     *
     */
    public String getHandoverResourceName() {
        return handoverResourceName;
    }
    /**
     * This filter helps in fetching all handed over resources for which the recordDate is greater than or equal to the startDate.
     *
     */
    private java.util.Date handoverDateGreaterThanOrEqualTo;

    /**
     * This filter helps in fetching all handed over resources for which the recordDate is greater than or equal to the startDate.
     *
     */
    public java.util.Date getHandoverDateGreaterThanOrEqualTo() {
        return handoverDateGreaterThanOrEqualTo;
    }
    /**
     * This filter helps in fetching all handed over resources for which the recordDate is less than or equal to the endDate.
     *
     */
    private java.util.Date handoverDateLessThanOrEqualTo;

    /**
     * This filter helps in fetching all handed over resources for which the recordDate is less than or equal to the endDate.
     *
     */
    public java.util.Date getHandoverDateLessThanOrEqualTo() {
        return handoverDateLessThanOrEqualTo;
    }
    /**
     * This filter helps in fetching the handed over resource for which the occHandoverResourceId is equal to the one provided here.
     *
     */
    private String occHandoverResourceBlockId;

    /**
     * This filter helps in fetching the handed over resource for which the occHandoverResourceId is equal to the one provided here.
     *
     */
    public String getOccHandoverResourceBlockId() {
        return occHandoverResourceBlockId;
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
     * A token representing the position at which to start retrieving results. This must come from {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.capacitymanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * The default order for handoverDate is chronological order(latest date item at the end).
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * The default order for handoverDate is chronological order(latest date item at the end).
     *
     **/
    public enum SortBy {
        HandoverDate("handoverDate"),
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
     * The field to sort by. Only one sort order may be provided.
     * The default order for handoverDate is chronological order(latest date item at the end).
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOccHandoverResourceBlocksRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The namespace by which we would filter the list.
         */
        private com.oracle.bmc.capacitymanagement.model.Namespace namespace = null;

        /**
         * The namespace by which we would filter the list.
         * @param namespace the value to set
         * @return this builder instance
         */
        public Builder namespace(com.oracle.bmc.capacitymanagement.model.Namespace namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * The OCID of the compartment or tenancy in which resources are to be listed.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment or tenancy in which resources are to be listed.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only the list of resources that match the name provided in this filter.
         *
         */
        private String handoverResourceName = null;

        /**
         * A filter to return only the list of resources that match the name provided in this filter.
         *
         * @param handoverResourceName the value to set
         * @return this builder instance
         */
        public Builder handoverResourceName(String handoverResourceName) {
            this.handoverResourceName = handoverResourceName;
            return this;
        }

        /**
         * This filter helps in fetching all handed over resources for which the recordDate is greater than or equal to the startDate.
         *
         */
        private java.util.Date handoverDateGreaterThanOrEqualTo = null;

        /**
         * This filter helps in fetching all handed over resources for which the recordDate is greater than or equal to the startDate.
         *
         * @param handoverDateGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder handoverDateGreaterThanOrEqualTo(
                java.util.Date handoverDateGreaterThanOrEqualTo) {
            this.handoverDateGreaterThanOrEqualTo = handoverDateGreaterThanOrEqualTo;
            return this;
        }

        /**
         * This filter helps in fetching all handed over resources for which the recordDate is less than or equal to the endDate.
         *
         */
        private java.util.Date handoverDateLessThanOrEqualTo = null;

        /**
         * This filter helps in fetching all handed over resources for which the recordDate is less than or equal to the endDate.
         *
         * @param handoverDateLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder handoverDateLessThanOrEqualTo(java.util.Date handoverDateLessThanOrEqualTo) {
            this.handoverDateLessThanOrEqualTo = handoverDateLessThanOrEqualTo;
            return this;
        }

        /**
         * This filter helps in fetching the handed over resource for which the occHandoverResourceId is equal to the one provided here.
         *
         */
        private String occHandoverResourceBlockId = null;

        /**
         * This filter helps in fetching the handed over resource for which the occHandoverResourceId is equal to the one provided here.
         *
         * @param occHandoverResourceBlockId the value to set
         * @return this builder instance
         */
        public Builder occHandoverResourceBlockId(String occHandoverResourceBlockId) {
            this.occHandoverResourceBlockId = occHandoverResourceBlockId;
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
         * A token representing the position at which to start retrieving results. This must come from {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from {@code opc-next-page} header field of a previous response.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * The default order for handoverDate is chronological order(latest date item at the end).
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * The default order for handoverDate is chronological order(latest date item at the end).
         *
         * @param sortBy the value to set
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
        public Builder copy(ListOccHandoverResourceBlocksRequest o) {
            namespace(o.getNamespace());
            compartmentId(o.getCompartmentId());
            handoverResourceName(o.getHandoverResourceName());
            handoverDateGreaterThanOrEqualTo(o.getHandoverDateGreaterThanOrEqualTo());
            handoverDateLessThanOrEqualTo(o.getHandoverDateLessThanOrEqualTo());
            occHandoverResourceBlockId(o.getOccHandoverResourceBlockId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListOccHandoverResourceBlocksRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListOccHandoverResourceBlocksRequest
         */
        public ListOccHandoverResourceBlocksRequest build() {
            ListOccHandoverResourceBlocksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOccHandoverResourceBlocksRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOccHandoverResourceBlocksRequest
         */
        public ListOccHandoverResourceBlocksRequest buildWithoutInvocationCallback() {
            ListOccHandoverResourceBlocksRequest request =
                    new ListOccHandoverResourceBlocksRequest();
            request.namespace = namespace;
            request.compartmentId = compartmentId;
            request.handoverResourceName = handoverResourceName;
            request.handoverDateGreaterThanOrEqualTo = handoverDateGreaterThanOrEqualTo;
            request.handoverDateLessThanOrEqualTo = handoverDateLessThanOrEqualTo;
            request.occHandoverResourceBlockId = occHandoverResourceBlockId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListOccHandoverResourceBlocksRequest(namespace, compartmentId, handoverResourceName, handoverDateGreaterThanOrEqualTo, handoverDateLessThanOrEqualTo, occHandoverResourceBlockId, limit, page, opcRequestId, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespace(namespace)
                .compartmentId(compartmentId)
                .handoverResourceName(handoverResourceName)
                .handoverDateGreaterThanOrEqualTo(handoverDateGreaterThanOrEqualTo)
                .handoverDateLessThanOrEqualTo(handoverDateLessThanOrEqualTo)
                .occHandoverResourceBlockId(occHandoverResourceBlockId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",namespace=").append(String.valueOf(this.namespace));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",handoverResourceName=").append(String.valueOf(this.handoverResourceName));
        sb.append(",handoverDateGreaterThanOrEqualTo=")
                .append(String.valueOf(this.handoverDateGreaterThanOrEqualTo));
        sb.append(",handoverDateLessThanOrEqualTo=")
                .append(String.valueOf(this.handoverDateLessThanOrEqualTo));
        sb.append(",occHandoverResourceBlockId=")
                .append(String.valueOf(this.occHandoverResourceBlockId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
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
        if (!(o instanceof ListOccHandoverResourceBlocksRequest)) {
            return false;
        }

        ListOccHandoverResourceBlocksRequest other = (ListOccHandoverResourceBlocksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.handoverResourceName, other.handoverResourceName)
                && java.util.Objects.equals(
                        this.handoverDateGreaterThanOrEqualTo,
                        other.handoverDateGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.handoverDateLessThanOrEqualTo, other.handoverDateLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.occHandoverResourceBlockId, other.occHandoverResourceBlockId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.handoverResourceName == null
                                ? 43
                                : this.handoverResourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.handoverDateGreaterThanOrEqualTo == null
                                ? 43
                                : this.handoverDateGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.handoverDateLessThanOrEqualTo == null
                                ? 43
                                : this.handoverDateLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.occHandoverResourceBlockId == null
                                ? 43
                                : this.occHandoverResourceBlockId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
