/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/ListFunctionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFunctionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListFunctionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application to which this function belongs.
     *
     */
    private String applicationId;

    public String getApplicationId() {
        return applicationId;
    }
    /**
     * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
     * <p>
     * Default: 10
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token for a list query returned by a previous operation
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to return only functions that match the lifecycle state in this parameter.
     * Example: {@code Creating}
     *
     */
    private com.oracle.bmc.functions.model.Function.LifecycleState lifecycleState;

    public com.oracle.bmc.functions.model.Function.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only functions with display names that match the display name string. Matching is exact.
     *
     */
    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only functions with the specified OCID.
     *
     */
    private String id;

    public String getId() {
        return id;
    }
    /**
     * Specifies sort order.
     * <p>
     * **ASC:** Ascending sort order.
     * * **DESC:** Descending sort order.
     *
     */
    private SortOrder sortOrder;

    /**
     * Specifies sort order.
     * <p>
     * **ASC:** Ascending sort order.
     * * **DESC:** Descending sort order.
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

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the attribute with which to sort the rules.
     * <p>
     * Default: {@code displayName}
     * <p>
     * **timeCreated:** Sorts by timeCreated.
     * * **displayName:** Sorts by displayName.
     * * **id:** Sorts by id.
     *
     */
    private SortBy sortBy;

    /**
     * Specifies the attribute with which to sort the rules.
     * <p>
     * Default: {@code displayName}
     * <p>
     * **timeCreated:** Sorts by timeCreated.
     * * **displayName:** Sorts by displayName.
     * * **id:** Sorts by id.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        Id("id"),
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

    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFunctionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String applicationId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application to which this function belongs.
         *
         * @return this builder instance
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return. 1 is the minimum, 50 is the maximum.
         * <p>
         * Default: 10
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The pagination token for a list query returned by a previous operation
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.functions.model.Function.LifecycleState lifecycleState = null;

        /**
         * A filter to return only functions that match the lifecycle state in this parameter.
         * Example: {@code Creating}
         *
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.functions.model.Function.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String displayName = null;

        /**
         * A filter to return only functions with display names that match the display name string. Matching is exact.
         *
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        private String id = null;

        /**
         * A filter to return only functions with the specified OCID.
         *
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * Specifies sort order.
         * <p>
         * **ASC:** Ascending sort order.
         * * **DESC:** Descending sort order.
         *
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * Specifies the attribute with which to sort the rules.
         * <p>
         * Default: {@code displayName}
         * <p>
         * **timeCreated:** Sorts by timeCreated.
         * * **displayName:** Sorts by displayName.
         * * **id:** Sorts by id.
         *
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
        public Builder copy(ListFunctionsRequest o) {
            applicationId(o.getApplicationId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFunctionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFunctionsRequest
         */
        public ListFunctionsRequest build() {
            ListFunctionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFunctionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFunctionsRequest
         */
        public ListFunctionsRequest buildWithoutInvocationCallback() {
            ListFunctionsRequest request = new ListFunctionsRequest();
            request.applicationId = applicationId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.id = id;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListFunctionsRequest(applicationId, limit, page, opcRequestId, lifecycleState, displayName, id, sortOrder, sortBy);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .applicationId(applicationId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .id(id)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",applicationId=").append(String.valueOf(this.applicationId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
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
        if (!(o instanceof ListFunctionsRequest)) {
            return false;
        }

        ListFunctionsRequest other = (ListFunctionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
