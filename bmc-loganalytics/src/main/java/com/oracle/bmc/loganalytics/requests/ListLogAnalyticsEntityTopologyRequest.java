/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListLogAnalyticsEntityTopologyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListLogAnalyticsEntityTopologyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListLogAnalyticsEntityTopologyRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** The log analytics entity OCID. */
    private String logAnalyticsEntityId;

    /** The log analytics entity OCID. */
    public String getLogAnalyticsEntityId() {
        return logAnalyticsEntityId;
    }
    /**
     * A filter to return only those log analytics entities with the specified lifecycle state. The
     * state value is case-insensitive.
     */
    private com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState;

    /**
     * A filter to return only those log analytics entities with the specified lifecycle state. The
     * state value is case-insensitive.
     */
    public com.oracle.bmc.loganalytics.model.EntityLifecycleStates getLifecycleState() {
        return lifecycleState;
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
    /**
     * The field to sort entities by. Only one sort order may be provided. Default order for
     * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If no
     * value is specified timeCreated is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort entities by. Only one sort order may be provided. Default order for
     * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If no
     * value is specified timeCreated is default.
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
     * The field to sort entities by. Only one sort order may be provided. Default order for
     * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If no
     * value is specified timeCreated is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to return only log analytics entities whose metadata name, value and type matches
     * the specified string. Each item in the array has the format "{name}:{value}:{type}". All
     * inputs are case-insensitive.
     */
    private java.util.List<String> metadataEquals;

    /**
     * A filter to return only log analytics entities whose metadata name, value and type matches
     * the specified string. Each item in the array has the format "{name}:{value}:{type}". All
     * inputs are case-insensitive.
     */
    public java.util.List<String> getMetadataEquals() {
        return metadataEquals;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLogAnalyticsEntityTopologyRequest, java.lang.Void> {
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

        /** The log analytics entity OCID. */
        private String logAnalyticsEntityId = null;

        /**
         * The log analytics entity OCID.
         *
         * @param logAnalyticsEntityId the value to set
         * @return this builder instance
         */
        public Builder logAnalyticsEntityId(String logAnalyticsEntityId) {
            this.logAnalyticsEntityId = logAnalyticsEntityId;
            return this;
        }

        /**
         * A filter to return only those log analytics entities with the specified lifecycle state.
         * The state value is case-insensitive.
         */
        private com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState = null;

        /**
         * A filter to return only those log analytics entities with the specified lifecycle state.
         * The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.loganalytics.model.EntityLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
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

        /**
         * The field to sort entities by. Only one sort order may be provided. Default order for
         * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If
         * no value is specified timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort entities by. Only one sort order may be provided. Default order for
         * timeCreated and timeUpdated is descending. Default order for entity name is ascending. If
         * no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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

        /**
         * A filter to return only log analytics entities whose metadata name, value and type
         * matches the specified string. Each item in the array has the format
         * "{name}:{value}:{type}". All inputs are case-insensitive.
         */
        private java.util.List<String> metadataEquals = null;

        /**
         * A filter to return only log analytics entities whose metadata name, value and type
         * matches the specified string. Each item in the array has the format
         * "{name}:{value}:{type}". All inputs are case-insensitive.
         *
         * @param metadataEquals the value to set
         * @return this builder instance
         */
        public Builder metadataEquals(java.util.List<String> metadataEquals) {
            this.metadataEquals = metadataEquals;
            return this;
        }

        /**
         * Singular setter. A filter to return only log analytics entities whose metadata name,
         * value and type matches the specified string. Each item in the array has the format
         * "{name}:{value}:{type}". All inputs are case-insensitive.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder metadataEquals(String singularValue) {
            return this.metadataEquals(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListLogAnalyticsEntityTopologyRequest o) {
            namespaceName(o.getNamespaceName());
            logAnalyticsEntityId(o.getLogAnalyticsEntityId());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            metadataEquals(o.getMetadataEquals());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLogAnalyticsEntityTopologyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListLogAnalyticsEntityTopologyRequest
         */
        public ListLogAnalyticsEntityTopologyRequest build() {
            ListLogAnalyticsEntityTopologyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLogAnalyticsEntityTopologyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLogAnalyticsEntityTopologyRequest
         */
        public ListLogAnalyticsEntityTopologyRequest buildWithoutInvocationCallback() {
            ListLogAnalyticsEntityTopologyRequest request =
                    new ListLogAnalyticsEntityTopologyRequest();
            request.namespaceName = namespaceName;
            request.logAnalyticsEntityId = logAnalyticsEntityId;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.metadataEquals = metadataEquals;
            return request;
            // new ListLogAnalyticsEntityTopologyRequest(namespaceName, logAnalyticsEntityId,
            // lifecycleState, limit, page, sortOrder, sortBy, opcRequestId, metadataEquals);
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
                .logAnalyticsEntityId(logAnalyticsEntityId)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .metadataEquals(metadataEquals);
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
        sb.append(",logAnalyticsEntityId=").append(String.valueOf(this.logAnalyticsEntityId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",metadataEquals=").append(String.valueOf(this.metadataEquals));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLogAnalyticsEntityTopologyRequest)) {
            return false;
        }

        ListLogAnalyticsEntityTopologyRequest other = (ListLogAnalyticsEntityTopologyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.logAnalyticsEntityId, other.logAnalyticsEntityId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.metadataEquals, other.metadataEquals);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.logAnalyticsEntityId == null
                                ? 43
                                : this.logAnalyticsEntityId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataEquals == null ? 43 : this.metadataEquals.hashCode());
        return result;
    }
}
