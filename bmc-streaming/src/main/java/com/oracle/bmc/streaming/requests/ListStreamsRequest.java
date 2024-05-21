/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.requests;

import com.oracle.bmc.streaming.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ListStreamsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListStreamsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class ListStreamsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment. Is exclusive with the {@code streamPoolId} parameter. One of them is required.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment. Is exclusive with the {@code streamPoolId} parameter. One of them is required.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The OCID of the stream pool. Is exclusive with the {@code compartmentId} parameter. One of them is required.
     */
    private String streamPoolId;

    /**
     * The OCID of the stream pool. Is exclusive with the {@code compartmentId} parameter. One of them is required.
     */
    public String getStreamPoolId() {
        return streamPoolId;
    }
    /**
     * A filter to return only resources that match the given ID exactly.
     *
     */
    private String id;

    /**
     * A filter to return only resources that match the given ID exactly.
     *
     */
    public String getId() {
        return id;
    }
    /**
     * A filter to return only resources that match the given name exactly.
     *
     */
    private String name;

    /**
     * A filter to return only resources that match the given name exactly.
     *
     */
    public String getName() {
        return name;
    }
    /**
     * The maximum number of items to return. The value must be between 1 and 50. The default is 10.
     */
    private Integer limit;

    /**
     * The maximum number of items to return. The value must be between 1 and 50. The default is 10.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page at which to start retrieving results.
     */
    private String page;

    /**
     * The page at which to start retrieving results.
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. You can provide no more than one sort order. By default, {@code TIMECREATED} sorts results in descending order and {@code NAME} sorts results in ascending order.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide no more than one sort order. By default, {@code TIMECREATED} sorts results in descending order and {@code NAME} sorts results in ascending order.
     *
     **/
    public enum SortBy {
        Name("NAME"),
        Timecreated("TIMECREATED"),
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
     * The field to sort by. You can provide no more than one sort order. By default, {@code TIMECREATED} sorts results in descending order and {@code NAME} sorts results in ascending order.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
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

    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     *
     */
    private com.oracle.bmc.streaming.model.Stream.LifecycleState lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     *
     */
    public com.oracle.bmc.streaming.model.Stream.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStreamsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment. Is exclusive with the {@code streamPoolId} parameter. One of them is required.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment. Is exclusive with the {@code streamPoolId} parameter. One of them is required.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The OCID of the stream pool. Is exclusive with the {@code compartmentId} parameter. One of them is required.
         */
        private String streamPoolId = null;

        /**
         * The OCID of the stream pool. Is exclusive with the {@code compartmentId} parameter. One of them is required.
         * @param streamPoolId the value to set
         * @return this builder instance
         */
        public Builder streamPoolId(String streamPoolId) {
            this.streamPoolId = streamPoolId;
            return this;
        }

        /**
         * A filter to return only resources that match the given ID exactly.
         *
         */
        private String id = null;

        /**
         * A filter to return only resources that match the given ID exactly.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * A filter to return only resources that match the given name exactly.
         *
         */
        private String name = null;

        /**
         * A filter to return only resources that match the given name exactly.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The maximum number of items to return. The value must be between 1 and 50. The default is 10.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return. The value must be between 1 and 50. The default is 10.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page at which to start retrieving results.
         */
        private String page = null;

        /**
         * The page at which to start retrieving results.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. You can provide no more than one sort order. By default, {@code TIMECREATED} sorts results in descending order and {@code NAME} sorts results in ascending order.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide no more than one sort order. By default, {@code TIMECREATED} sorts results in descending order and {@code NAME} sorts results in ascending order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
         *
         */
        private com.oracle.bmc.streaming.model.Stream.LifecycleState lifecycleState = null;

        /**
         * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.streaming.model.Stream.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
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
        public Builder copy(ListStreamsRequest o) {
            compartmentId(o.getCompartmentId());
            streamPoolId(o.getStreamPoolId());
            id(o.getId());
            name(o.getName());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStreamsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListStreamsRequest
         */
        public ListStreamsRequest build() {
            ListStreamsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStreamsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStreamsRequest
         */
        public ListStreamsRequest buildWithoutInvocationCallback() {
            ListStreamsRequest request = new ListStreamsRequest();
            request.compartmentId = compartmentId;
            request.streamPoolId = streamPoolId;
            request.id = id;
            request.name = name;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListStreamsRequest(compartmentId, streamPoolId, id, name, limit, page, sortBy, sortOrder, lifecycleState, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .streamPoolId(streamPoolId)
                .id(id)
                .name(name)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState)
                .opcRequestId(opcRequestId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",streamPoolId=").append(String.valueOf(this.streamPoolId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStreamsRequest)) {
            return false;
        }

        ListStreamsRequest other = (ListStreamsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.streamPoolId, other.streamPoolId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.streamPoolId == null ? 43 : this.streamPoolId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
