/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/ListEmailOutboundIpsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEmailOutboundIpsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class ListEmailOutboundIpsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID for the compartment. */
    private String compartmentId;

    /** The OCID for the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The outbound IP address assigned to the tenancy. */
    private String outboundIp;

    /** The outbound IP address assigned to the tenancy. */
    public String getOutboundIp() {
        return outboundIp;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For important
     * details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For important
     * details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending or descending order. */
    private com.oracle.bmc.email.model.SortOrder sortOrder;

    /** The sort order to use, either ascending or descending order. */
    public com.oracle.bmc.email.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** Filter returned list by specified lifecycle state. This parameter is case-insensitive. */
    private com.oracle.bmc.email.model.EmailOutboundIpSummary.LifecycleState lifecycleState;

    /** Filter returned list by specified lifecycle state. This parameter is case-insensitive. */
    public com.oracle.bmc.email.model.EmailOutboundIpSummary.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** Filter returned list by specified assignment state. */
    private com.oracle.bmc.email.model.EmailOutboundIpSummary.AssignmentState assignmentState;

    /** Filter returned list by specified assignment state. */
    public com.oracle.bmc.email.model.EmailOutboundIpSummary.AssignmentState getAssignmentState() {
        return assignmentState;
    }
    /**
     * The field to sort by. The {@code OUTBOUNDIP} value returns the list in ascending order or
     * Outbound Ip address by default. Use the {@code SortOrderQueryParam} to change the direction
     * of the returned list of items.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. The {@code OUTBOUNDIP} value returns the list in ascending order or
     * Outbound Ip address by default. Use the {@code SortOrderQueryParam} to change the direction
     * of the returned list of items.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Outboundip("OUTBOUNDIP"),
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
     * The field to sort by. The {@code OUTBOUNDIP} value returns the list in ascending order or
     * Outbound Ip address by default. Use the {@code SortOrderQueryParam} to change the direction
     * of the returned list of items.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEmailOutboundIpsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID for the compartment. */
        private String compartmentId = null;

        /**
         * The OCID for the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The outbound IP address assigned to the tenancy. */
        private String outboundIp = null;

        /**
         * The outbound IP address assigned to the tenancy.
         *
         * @param outboundIp the value to set
         * @return this builder instance
         */
        public Builder outboundIp(String outboundIp) {
            this.outboundIp = outboundIp;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For
         * important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. {@code 1} is the minimum, {@code 1000} is the maximum. For
         * important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending or descending order. */
        private com.oracle.bmc.email.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending or descending order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.email.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Filter returned list by specified lifecycle state. This parameter is case-insensitive.
         */
        private com.oracle.bmc.email.model.EmailOutboundIpSummary.LifecycleState lifecycleState =
                null;

        /**
         * Filter returned list by specified lifecycle state. This parameter is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.email.model.EmailOutboundIpSummary.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** Filter returned list by specified assignment state. */
        private com.oracle.bmc.email.model.EmailOutboundIpSummary.AssignmentState assignmentState =
                null;

        /**
         * Filter returned list by specified assignment state.
         *
         * @param assignmentState the value to set
         * @return this builder instance
         */
        public Builder assignmentState(
                com.oracle.bmc.email.model.EmailOutboundIpSummary.AssignmentState assignmentState) {
            this.assignmentState = assignmentState;
            return this;
        }

        /**
         * The field to sort by. The {@code OUTBOUNDIP} value returns the list in ascending order or
         * Outbound Ip address by default. Use the {@code SortOrderQueryParam} to change the
         * direction of the returned list of items.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. The {@code OUTBOUNDIP} value returns the list in ascending order or
         * Outbound Ip address by default. Use the {@code SortOrderQueryParam} to change the
         * direction of the returned list of items.
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
        public Builder copy(ListEmailOutboundIpsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            outboundIp(o.getOutboundIp());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            assignmentState(o.getAssignmentState());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEmailOutboundIpsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListEmailOutboundIpsRequest
         */
        public ListEmailOutboundIpsRequest build() {
            ListEmailOutboundIpsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListEmailOutboundIpsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListEmailOutboundIpsRequest
         */
        public ListEmailOutboundIpsRequest buildWithoutInvocationCallback() {
            ListEmailOutboundIpsRequest request = new ListEmailOutboundIpsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.outboundIp = outboundIp;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            request.assignmentState = assignmentState;
            request.sortBy = sortBy;
            return request;
            // new ListEmailOutboundIpsRequest(compartmentId, opcRequestId, outboundIp, limit, page,
            // sortOrder, lifecycleState, assignmentState, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .outboundIp(outboundIp)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState)
                .assignmentState(assignmentState)
                .sortBy(sortBy);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",outboundIp=").append(String.valueOf(this.outboundIp));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",assignmentState=").append(String.valueOf(this.assignmentState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListEmailOutboundIpsRequest)) {
            return false;
        }

        ListEmailOutboundIpsRequest other = (ListEmailOutboundIpsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.outboundIp, other.outboundIp)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.assignmentState, other.assignmentState)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.outboundIp == null ? 43 : this.outboundIp.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.assignmentState == null ? 43 : this.assignmentState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
