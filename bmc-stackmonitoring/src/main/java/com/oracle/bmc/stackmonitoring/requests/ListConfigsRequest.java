/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ListConfigsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListConfigsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListConfigsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which data is listed.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which data is listed.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only configuration items for a given config type.
     */
    private com.oracle.bmc.stackmonitoring.model.Config.ConfigType type;

    /**
     * A filter to return only configuration items for a given config type.
     */
    public com.oracle.bmc.stackmonitoring.model.Config.ConfigType getType() {
        return type;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the
     * previous "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the
     * previous "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The current state of the Config.
     */
    private com.oracle.bmc.stackmonitoring.model.Config.LifecycleState lifecycleState;

    /**
     * The current state of the Config.
     */
    public com.oracle.bmc.stackmonitoring.model.Config.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.stackmonitoring.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for 'timeCreated' is descending.
     * Default order for 'displayName' and 'configType' is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for 'timeCreated' is descending.
     * Default order for 'displayName' and 'configType' is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        ConfigType("configType"),
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
     * The field to sort by. Only one sort order may be provided.
     * Default order for 'timeCreated' is descending.
     * Default order for 'displayName' and 'configType' is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListConfigsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which data is listed.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which data is listed.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only configuration items for a given config type.
         */
        private com.oracle.bmc.stackmonitoring.model.Config.ConfigType type = null;

        /**
         * A filter to return only configuration items for a given config type.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.stackmonitoring.model.Config.ConfigType type) {
            this.type = type;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The current state of the Config.
         */
        private com.oracle.bmc.stackmonitoring.model.Config.LifecycleState lifecycleState = null;

        /**
         * The current state of the Config.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.stackmonitoring.model.Config.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for 'timeCreated' is descending.
         * Default order for 'displayName' and 'configType' is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for 'timeCreated' is descending.
         * Default order for 'displayName' and 'configType' is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
        public Builder copy(ListConfigsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            type(o.getType());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListConfigsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListConfigsRequest
         */
        public ListConfigsRequest build() {
            ListConfigsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListConfigsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListConfigsRequest
         */
        public ListConfigsRequest buildWithoutInvocationCallback() {
            ListConfigsRequest request = new ListConfigsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.type = type;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListConfigsRequest(compartmentId, displayName, type, limit, page, lifecycleState, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .type(type)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListConfigsRequest)) {
            return false;
        }

        ListConfigsRequest other = (ListConfigsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
