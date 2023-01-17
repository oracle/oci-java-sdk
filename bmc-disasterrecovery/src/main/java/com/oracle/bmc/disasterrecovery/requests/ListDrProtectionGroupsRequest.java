/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListDrProtectionGroupsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDrProtectionGroupsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class ListDrProtectionGroupsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID (OCID) of the compartment in which to list resources.
     * <p>
     * Example: {@code ocid1.compartment.oc1..exampleocid1}
     *
     */
    private String compartmentId;

    /**
     * The ID (OCID) of the compartment in which to list resources.
     * <p>
     * Example: {@code ocid1.compartment.oc1..exampleocid1}
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only DR Protection Groups that match the given lifecycleState.
     *
     */
    private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState lifecycleState;

    /**
     * A filter to return only DR Protection Groups that match the given lifecycleState.
     *
     */
    public com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The OCID of the DR Protection Group. Optional query param.
     * <p>
     * Example: {@code ocid1.drprotectiongroup.oc1.phx.exampleocid}
     *
     */
    private String drProtectionGroupId;

    /**
     * The OCID of the DR Protection Group. Optional query param.
     * <p>
     * Example: {@code ocid1.drprotectiongroup.oc1.phx.exampleocid}
     *
     */
    public String getDrProtectionGroupId() {
        return drProtectionGroupId;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     * <p>
     * Example: {@code MY UNIQUE DISPLAY NAME}
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     * <p>
     * Example: {@code MY UNIQUE DISPLAY NAME}
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * For list pagination. The maximum number of results per page,
     * or items to return in a paginated "List" call.
     * 1 is the minimum, 1000 is the maximum.
     * <p>
     * For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 100}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page,
     * or items to return in a paginated "List" call.
     * 1 is the minimum, 1000 is the maximum.
     * <p>
     * For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 100}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response
     * header from the previous "List" call.
     * <p>
     * For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response
     * header from the previous "List" call.
     * <p>
     * For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    private com.oracle.bmc.disasterrecovery.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    public com.oracle.bmc.disasterrecovery.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
     * Default order for displayName is ascending. If no value is specified timeCreated is default.
     * <p>
     * Example: {@code displayName}
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
     * Default order for displayName is ascending. If no value is specified timeCreated is default.
     * <p>
     * Example: {@code displayName}
     *
     **/
    public enum SortBy {
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
     * Default order for displayName is ascending. If no value is specified timeCreated is default.
     * <p>
     * Example: {@code displayName}
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDrProtectionGroupsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID (OCID) of the compartment in which to list resources.
         * <p>
         * Example: {@code ocid1.compartment.oc1..exampleocid1}
         *
         */
        private String compartmentId = null;

        /**
         * The ID (OCID) of the compartment in which to list resources.
         * <p>
         * Example: {@code ocid1.compartment.oc1..exampleocid1}
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only DR Protection Groups that match the given lifecycleState.
         *
         */
        private com.oracle.bmc.disasterrecovery.model.DrProtectionGroupLifecycleState
                lifecycleState = null;

        /**
         * A filter to return only DR Protection Groups that match the given lifecycleState.
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
         * The OCID of the DR Protection Group. Optional query param.
         * <p>
         * Example: {@code ocid1.drprotectiongroup.oc1.phx.exampleocid}
         *
         */
        private String drProtectionGroupId = null;

        /**
         * The OCID of the DR Protection Group. Optional query param.
         * <p>
         * Example: {@code ocid1.drprotectiongroup.oc1.phx.exampleocid}
         *
         * @param drProtectionGroupId the value to set
         * @return this builder instance
         */
        public Builder drProtectionGroupId(String drProtectionGroupId) {
            this.drProtectionGroupId = drProtectionGroupId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         * <p>
         * Example: {@code MY UNIQUE DISPLAY NAME}
         *
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * <p>
         * Example: {@code MY UNIQUE DISPLAY NAME}
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page,
         * or items to return in a paginated "List" call.
         * 1 is the minimum, 1000 is the maximum.
         * <p>
         * For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 100}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page,
         * or items to return in a paginated "List" call.
         * 1 is the minimum, 1000 is the maximum.
         * <p>
         * For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 100}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response
         * header from the previous "List" call.
         * <p>
         * For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response
         * header from the previous "List" call.
         * <p>
         * For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         */
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
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
         * Default order for displayName is ascending. If no value is specified timeCreated is default.
         * <p>
         * Example: {@code displayName}
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
         * Default order for displayName is ascending. If no value is specified timeCreated is default.
         * <p>
         * Example: {@code displayName}
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         *
         */
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
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDrProtectionGroupsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
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
            return request;
            // new ListDrProtectionGroupsRequest(compartmentId, lifecycleState, drProtectionGroupId, displayName, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",drProtectionGroupId=").append(String.valueOf(this.drProtectionGroupId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
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
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
        return result;
    }
}
