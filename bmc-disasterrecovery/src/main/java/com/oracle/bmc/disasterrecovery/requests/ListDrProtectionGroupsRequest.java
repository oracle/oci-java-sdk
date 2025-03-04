/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListDrProtectionGroupsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDrProtectionGroupsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class ListDrProtectionGroupsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID (OCID) of the compartment in which to list resources.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     */
    private String compartmentId;

    /**
     * The ID (OCID) of the compartment in which to list resources.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only DR protection groups that match the given lifecycle state. */
    private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState lifecycleState;

    /** A filter to return only DR protection groups that match the given lifecycle state. */
    public com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The OCID of the DR protection group. Optional query param.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    private String drProtectionGroupId;

    /**
     * The OCID of the DR protection group. Optional query param.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    public String getDrProtectionGroupId() {
        return drProtectionGroupId;
    }
    /**
     * A filter to return only resources that match the given display name.
     *
     * <p>Example: {@code MyResourceDisplayName}
     */
    private String displayName;

    /**
     * A filter to return only resources that match the given display name.
     *
     * <p>Example: {@code MyResourceDisplayName}
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 1000 is the maximum.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 100}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 1000 is the maximum.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 100}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.disasterrecovery.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.disasterrecovery.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     *
     * <p>Example: {@code MyResourceDisplayName}
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     *
     * <p>Example: {@code MyResourceDisplayName}
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     *
     * <p>Example: {@code MyResourceDisplayName}
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
    /** The DR protection group Role. */
    private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupRole role;

    /** The DR protection group Role. */
    public com.oracle.bmc.disasterrecovery.model.DrProtectionGroupRole getRole() {
        return role;
    }
    /** A filter to return only DR protection groups that match the given lifecycle sub-state. */
    private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleSubState
            lifecycleSubState;

    /** A filter to return only DR protection groups that match the given lifecycle sub-state. */
    public com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleSubState
            getLifecycleSubState() {
        return lifecycleSubState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDrProtectionGroupsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID (OCID) of the compartment in which to list resources.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
         */
        private String compartmentId = null;

        /**
         * The ID (OCID) of the compartment in which to list resources.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return only DR protection groups that match the given lifecycle state. */
        private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState
                lifecycleState = null;

        /**
         * A filter to return only DR protection groups that match the given lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The OCID of the DR protection group. Optional query param.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         */
        private String drProtectionGroupId = null;

        /**
         * The OCID of the DR protection group. Optional query param.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         *
         * @param drProtectionGroupId the value to set
         * @return this builder instance
         */
        public Builder drProtectionGroupId(String drProtectionGroupId) {
            this.drProtectionGroupId = drProtectionGroupId;
            return this;
        }

        /**
         * A filter to return only resources that match the given display name.
         *
         * <p>Example: {@code MyResourceDisplayName}
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name.
         *
         * <p>Example: {@code MyResourceDisplayName}
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 1000 is the maximum.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 100}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 1000 is the maximum.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 100}
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
         * previous "List" call.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.disasterrecovery.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.disasterrecovery.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         *
         * <p>Example: {@code MyResourceDisplayName}
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         *
         * <p>Example: {@code MyResourceDisplayName}
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

        /** The DR protection group Role. */
        private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupRole role = null;

        /**
         * The DR protection group Role.
         *
         * @param role the value to set
         * @return this builder instance
         */
        public Builder role(com.oracle.bmc.disasterrecovery.model.DrProtectionGroupRole role) {
            this.role = role;
            return this;
        }

        /**
         * A filter to return only DR protection groups that match the given lifecycle sub-state.
         */
        private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleSubState
                lifecycleSubState = null;

        /**
         * A filter to return only DR protection groups that match the given lifecycle sub-state.
         *
         * @param lifecycleSubState the value to set
         * @return this builder instance
         */
        public Builder lifecycleSubState(
                com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleSubState
                        lifecycleSubState) {
            this.lifecycleSubState = lifecycleSubState;
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
        public Builder copy(ListDrProtectionGroupsRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            drProtectionGroupId(o.getDrProtectionGroupId());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            role(o.getRole());
            lifecycleSubState(o.getLifecycleSubState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDrProtectionGroupsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDrProtectionGroupsRequest
         */
        public ListDrProtectionGroupsRequest build() {
            ListDrProtectionGroupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDrProtectionGroupsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDrProtectionGroupsRequest
         */
        public ListDrProtectionGroupsRequest buildWithoutInvocationCallback() {
            ListDrProtectionGroupsRequest request = new ListDrProtectionGroupsRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.drProtectionGroupId = drProtectionGroupId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.role = role;
            request.lifecycleSubState = lifecycleSubState;
            return request;
            // new ListDrProtectionGroupsRequest(compartmentId, lifecycleState, drProtectionGroupId,
            // displayName, limit, page, sortOrder, sortBy, opcRequestId, role, lifecycleSubState);
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
                .lifecycleState(lifecycleState)
                .drProtectionGroupId(drProtectionGroupId)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .role(role)
                .lifecycleSubState(lifecycleSubState);
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",drProtectionGroupId=").append(String.valueOf(this.drProtectionGroupId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",role=").append(String.valueOf(this.role));
        sb.append(",lifecycleSubState=").append(String.valueOf(this.lifecycleSubState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDrProtectionGroupsRequest)) {
            return false;
        }

        ListDrProtectionGroupsRequest other = (ListDrProtectionGroupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.drProtectionGroupId, other.drProtectionGroupId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.lifecycleSubState, other.lifecycleSubState);
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.drProtectionGroupId == null
                                ? 43
                                : this.drProtectionGroupId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubState == null ? 43 : this.lifecycleSubState.hashCode());
        return result;
    }
}
