/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.requests;

import com.oracle.bmc.networkloadbalancer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/networkloadbalancer/ListBackendsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBackendsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class ListBackendsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer to update.
     */
    private String networkLoadBalancerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer to update.
     */
    public String getNetworkLoadBalancerId() {
        return networkLoadBalancerId;
    }
    /**
     * The name of the backend set associated with the backend servers.
     *
     * <p>Example: {@code example_backend_set}
     */
    private String backendSetName;

    /**
     * The name of the backend set associated with the backend servers.
     *
     * <p>Example: {@code example_backend_set}
     */
    public String getBackendSetName() {
        return backendSetName;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The system returns the requested resource, with a 200 status, only if the resource has no
     * etag matching the one specified. If the condition fails for the GET and HEAD methods, then
     * the system returns the HTTP status code {@code 304 (Not Modified)}.
     *
     * <p>Example: {@code example-etag}
     */
    private String ifNoneMatch;

    /**
     * The system returns the requested resource, with a 200 status, only if the resource has no
     * etag matching the one specified. If the condition fails for the GET and HEAD methods, then
     * the system returns the HTTP status code {@code 304 (Not Modified)}.
     *
     * <p>Example: {@code example-etag}
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * For list pagination. The maximum number of results per page or items to return, in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page or items to return, in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page from which to start retrieving results. For list
     * pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * The page token representing the page from which to start retrieving results. For list
     * pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'asc' (ascending) or 'desc' (descending). */
    private com.oracle.bmc.networkloadbalancer.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' (ascending) or 'desc' (descending). */
    public com.oracle.bmc.networkloadbalancer.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order can be provided. The default order for timeCreated
     * is descending. The default order for displayName is ascending. If no value is specified, then
     * timeCreated is the default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order can be provided. The default order for timeCreated
     * is descending. The default order for displayName is ascending. If no value is specified, then
     * timeCreated is the default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order can be provided. The default order for timeCreated
     * is descending. The default order for displayName is ascending. If no value is specified, then
     * timeCreated is the default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBackendsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer to update.
         */
        private String networkLoadBalancerId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer to update.
         *
         * @param networkLoadBalancerId the value to set
         * @return this builder instance
         */
        public Builder networkLoadBalancerId(String networkLoadBalancerId) {
            this.networkLoadBalancerId = networkLoadBalancerId;
            return this;
        }

        /**
         * The name of the backend set associated with the backend servers.
         *
         * <p>Example: {@code example_backend_set}
         */
        private String backendSetName = null;

        /**
         * The name of the backend set associated with the backend servers.
         *
         * <p>Example: {@code example_backend_set}
         *
         * @param backendSetName the value to set
         * @return this builder instance
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The system returns the requested resource, with a 200 status, only if the resource has no
         * etag matching the one specified. If the condition fails for the GET and HEAD methods,
         * then the system returns the HTTP status code {@code 304 (Not Modified)}.
         *
         * <p>Example: {@code example-etag}
         */
        private String ifNoneMatch = null;

        /**
         * The system returns the requested resource, with a 200 status, only if the resource has no
         * etag matching the one specified. If the condition fails for the GET and HEAD methods,
         * then the system returns the HTTP status code {@code 304 (Not Modified)}.
         *
         * <p>Example: {@code example-etag}
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page or items to return, in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page or items to return, in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page from which to start retrieving results. For list
         * pagination. The value of the {@code opc-next-page} response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * The page token representing the page from which to start retrieving results. For list
         * pagination. The value of the {@code opc-next-page} response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'asc' (ascending) or 'desc' (descending). */
        private com.oracle.bmc.networkloadbalancer.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' (ascending) or 'desc' (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.networkloadbalancer.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order can be provided. The default order for
         * timeCreated is descending. The default order for displayName is ascending. If no value is
         * specified, then timeCreated is the default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order can be provided. The default order for
         * timeCreated is descending. The default order for displayName is ascending. If no value is
         * specified, then timeCreated is the default.
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
        public Builder copy(ListBackendsRequest o) {
            networkLoadBalancerId(o.getNetworkLoadBalancerId());
            backendSetName(o.getBackendSetName());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBackendsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListBackendsRequest
         */
        public ListBackendsRequest build() {
            ListBackendsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBackendsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBackendsRequest
         */
        public ListBackendsRequest buildWithoutInvocationCallback() {
            ListBackendsRequest request = new ListBackendsRequest();
            request.networkLoadBalancerId = networkLoadBalancerId;
            request.backendSetName = backendSetName;
            request.opcRequestId = opcRequestId;
            request.ifNoneMatch = ifNoneMatch;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListBackendsRequest(networkLoadBalancerId, backendSetName, opcRequestId,
            // ifNoneMatch, limit, page, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkLoadBalancerId(networkLoadBalancerId)
                .backendSetName(backendSetName)
                .opcRequestId(opcRequestId)
                .ifNoneMatch(ifNoneMatch)
                .limit(limit)
                .page(page)
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
        sb.append(",networkLoadBalancerId=").append(String.valueOf(this.networkLoadBalancerId));
        sb.append(",backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
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
        if (!(o instanceof ListBackendsRequest)) {
            return false;
        }

        ListBackendsRequest other = (ListBackendsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkLoadBalancerId, other.networkLoadBalancerId)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
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
                        + (this.networkLoadBalancerId == null
                                ? 43
                                : this.networkLoadBalancerId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
