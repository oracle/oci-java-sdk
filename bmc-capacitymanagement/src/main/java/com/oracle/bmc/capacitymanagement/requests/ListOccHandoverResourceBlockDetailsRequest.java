/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccHandoverResourceBlockDetailsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListOccHandoverResourceBlockDetailsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListOccHandoverResourceBlockDetailsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the OccHandoverResource which is a required query parameter for listing
     * OccHandoverResourceDetails.
     */
    private String occHandoverResourceBlockId;

    /**
     * The OCID of the OccHandoverResource which is a required query parameter for listing
     * OccHandoverResourceDetails.
     */
    public String getOccHandoverResourceBlockId() {
        return occHandoverResourceBlockId;
    }
    /**
     * This fiter is applicable only for COMPUTE namespace. It helps in fetching of all resource
     * block details for which the hostId is equal to the one provided in this query param.
     */
    private String hostId;

    /**
     * This fiter is applicable only for COMPUTE namespace. It helps in fetching of all resource
     * block details for which the hostId is equal to the one provided in this query param.
     */
    public String getHostId() {
        return hostId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.capacitymanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. The default order for handoverDate
     * is chronological order(latest date item at the end).
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. The default order for handoverDate
     * is chronological order(latest date item at the end).
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort by. Only one sort order may be provided. The default order for handoverDate
     * is chronological order(latest date item at the end).
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOccHandoverResourceBlockDetailsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the OccHandoverResource which is a required query parameter for listing
         * OccHandoverResourceDetails.
         */
        private String occHandoverResourceBlockId = null;

        /**
         * The OCID of the OccHandoverResource which is a required query parameter for listing
         * OccHandoverResourceDetails.
         *
         * @param occHandoverResourceBlockId the value to set
         * @return this builder instance
         */
        public Builder occHandoverResourceBlockId(String occHandoverResourceBlockId) {
            this.occHandoverResourceBlockId = occHandoverResourceBlockId;
            return this;
        }

        /**
         * This fiter is applicable only for COMPUTE namespace. It helps in fetching of all resource
         * block details for which the hostId is equal to the one provided in this query param.
         */
        private String hostId = null;

        /**
         * This fiter is applicable only for COMPUTE namespace. It helps in fetching of all resource
         * block details for which the hostId is equal to the one provided in this query param.
         *
         * @param hostId the value to set
         * @return this builder instance
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
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
         * A token representing the position at which to start retrieving results. This must come
         * from {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. The default order for
         * handoverDate is chronological order(latest date item at the end).
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. The default order for
         * handoverDate is chronological order(latest date item at the end).
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
        public Builder copy(ListOccHandoverResourceBlockDetailsRequest o) {
            occHandoverResourceBlockId(o.getOccHandoverResourceBlockId());
            hostId(o.getHostId());
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
         * Build the instance of ListOccHandoverResourceBlockDetailsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListOccHandoverResourceBlockDetailsRequest
         */
        public ListOccHandoverResourceBlockDetailsRequest build() {
            ListOccHandoverResourceBlockDetailsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOccHandoverResourceBlockDetailsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOccHandoverResourceBlockDetailsRequest
         */
        public ListOccHandoverResourceBlockDetailsRequest buildWithoutInvocationCallback() {
            ListOccHandoverResourceBlockDetailsRequest request =
                    new ListOccHandoverResourceBlockDetailsRequest();
            request.occHandoverResourceBlockId = occHandoverResourceBlockId;
            request.hostId = hostId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListOccHandoverResourceBlockDetailsRequest(occHandoverResourceBlockId, hostId,
            // limit, page, opcRequestId, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .occHandoverResourceBlockId(occHandoverResourceBlockId)
                .hostId(hostId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortOrder(sortOrder)
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
        sb.append(",occHandoverResourceBlockId=")
                .append(String.valueOf(this.occHandoverResourceBlockId));
        sb.append(",hostId=").append(String.valueOf(this.hostId));
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
        if (!(o instanceof ListOccHandoverResourceBlockDetailsRequest)) {
            return false;
        }

        ListOccHandoverResourceBlockDetailsRequest other =
                (ListOccHandoverResourceBlockDetailsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.occHandoverResourceBlockId, other.occHandoverResourceBlockId)
                && java.util.Objects.equals(this.hostId, other.hostId)
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
        result =
                (result * PRIME)
                        + (this.occHandoverResourceBlockId == null
                                ? 43
                                : this.occHandoverResourceBlockId.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
