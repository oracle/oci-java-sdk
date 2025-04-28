/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ListChannelsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListChannelsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ListChannelsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Unique Channel identifier. */
    private String id;

    /** Unique Channel identifier. */
    public String getId() {
        return id;
    }
    /**
     * List only the information for Channels with this name. Channels names are unique and may not
     * change.
     *
     * <p>Example: {@code MyChannel}
     */
    private String name;

    /**
     * List only the information for Channels with this name. Channels names are unique and may not
     * change.
     *
     * <p>Example: {@code MyChannel}
     */
    public String getName() {
        return name;
    }
    /** List only Channels with this category. */
    private com.oracle.bmc.oda.model.ChannelCategory category;

    /** List only Channels with this category. */
    public com.oracle.bmc.oda.model.ChannelCategory getCategory() {
        return category;
    }
    /** List only Channels of this type. */
    private com.oracle.bmc.oda.model.ChannelType type;

    /** List only Channels of this type. */
    public com.oracle.bmc.oda.model.ChannelType getType() {
        return type;
    }
    /** List only the resources that are in this lifecycle state. */
    private com.oracle.bmc.oda.model.LifecycleState lifecycleState;

    /** List only the resources that are in this lifecycle state. */
    public com.oracle.bmc.oda.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page at which to start retrieving results.
     *
     * <p>You get this value from the {@code opc-next-page} header in a previous list request. To
     * retireve the first page, omit this query parameter.
     *
     * <p>Example: {@code MToxMA==}
     */
    private String page;

    /**
     * The page at which to start retrieving results.
     *
     * <p>You get this value from the {@code opc-next-page} header in a previous list request. To
     * retireve the first page, omit this query parameter.
     *
     * <p>Example: {@code MToxMA==}
     */
    public String getPage() {
        return page;
    }
    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
     * (descending).
     */
    private SortOrder sortOrder;

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
     * (descending).
     */
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

    /**
     * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
     * (descending).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code
     * timeCreated}.
     *
     * <p>The default sort order for {@code timeCreated} and {@code timeUpdated} is descending, and
     * the default sort order for {@code name} is ascending.
     */
    private SortBy sortBy;

    /**
     * Sort on this field. You can specify one sort order only. The default sort field is {@code
     * timeCreated}.
     *
     * <p>The default sort order for {@code timeCreated} and {@code timeUpdated} is descending, and
     * the default sort order for {@code name} is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        Name("name"),
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
     * Sort on this field. You can specify one sort order only. The default sort field is {@code
     * timeCreated}.
     *
     * <p>The default sort order for {@code timeCreated} and {@code timeUpdated} is descending, and
     * the default sort order for {@code name} is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListChannelsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /** Unique Channel identifier. */
        private String id = null;

        /**
         * Unique Channel identifier.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * List only the information for Channels with this name. Channels names are unique and may
         * not change.
         *
         * <p>Example: {@code MyChannel}
         */
        private String name = null;

        /**
         * List only the information for Channels with this name. Channels names are unique and may
         * not change.
         *
         * <p>Example: {@code MyChannel}
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** List only Channels with this category. */
        private com.oracle.bmc.oda.model.ChannelCategory category = null;

        /**
         * List only Channels with this category.
         *
         * @param category the value to set
         * @return this builder instance
         */
        public Builder category(com.oracle.bmc.oda.model.ChannelCategory category) {
            this.category = category;
            return this;
        }

        /** List only Channels of this type. */
        private com.oracle.bmc.oda.model.ChannelType type = null;

        /**
         * List only Channels of this type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.oda.model.ChannelType type) {
            this.type = type;
            return this;
        }

        /** List only the resources that are in this lifecycle state. */
        private com.oracle.bmc.oda.model.LifecycleState lifecycleState = null;

        /**
         * List only the resources that are in this lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.oda.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The maximum number of items to return per page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page at which to start retrieving results.
         *
         * <p>You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         *
         * <p>Example: {@code MToxMA==}
         */
        private String page = null;

        /**
         * The page at which to start retrieving results.
         *
         * <p>You get this value from the {@code opc-next-page} header in a previous list request.
         * To retireve the first page, omit this query parameter.
         *
         * <p>Example: {@code MToxMA==}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
         * (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Sort the results in this order, use either {@code ASC} (ascending) or {@code DESC}
         * (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code
         * timeCreated}.
         *
         * <p>The default sort order for {@code timeCreated} and {@code timeUpdated} is descending,
         * and the default sort order for {@code name} is ascending.
         */
        private SortBy sortBy = null;

        /**
         * Sort on this field. You can specify one sort order only. The default sort field is {@code
         * timeCreated}.
         *
         * <p>The default sort order for {@code timeCreated} and {@code timeUpdated} is descending,
         * and the default sort order for {@code name} is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
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
        public Builder copy(ListChannelsRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            id(o.getId());
            name(o.getName());
            category(o.getCategory());
            type(o.getType());
            lifecycleState(o.getLifecycleState());
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
         * Build the instance of ListChannelsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListChannelsRequest
         */
        public ListChannelsRequest build() {
            ListChannelsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListChannelsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListChannelsRequest
         */
        public ListChannelsRequest buildWithoutInvocationCallback() {
            ListChannelsRequest request = new ListChannelsRequest();
            request.odaInstanceId = odaInstanceId;
            request.id = id;
            request.name = name;
            request.category = category;
            request.type = type;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListChannelsRequest(odaInstanceId, id, name, category, type, lifecycleState,
            // limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .id(id)
                .name(name)
                .category(category)
                .type(type)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListChannelsRequest)) {
            return false;
        }

        ListChannelsRequest other = (ListChannelsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
