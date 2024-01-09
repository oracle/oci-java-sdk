/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.requests;

import com.oracle.bmc.disasterrecovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/disasterrecovery/ListDrPlansExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDrPlansRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class ListDrPlansRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the DR protection group. Mandatory query param.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    private String drProtectionGroupId;

    /**
     * The OCID of the DR protection group. Mandatory query param.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    public String getDrProtectionGroupId() {
        return drProtectionGroupId;
    }
    /** A filter to return only DR plans that match the given lifecycle state. */
    private com.oracle.bmc.disasterrecovery.model.DrPlanLifecycleState lifecycleState;

    /** A filter to return only DR plans that match the given lifecycle state. */
    public com.oracle.bmc.disasterrecovery.model.DrPlanLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The OCID of the DR plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    private String drPlanId;

    /**
     * The OCID of the DR plan.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    public String getDrPlanId() {
        return drPlanId;
    }
    /** The DR plan type. */
    private com.oracle.bmc.disasterrecovery.model.DrPlanType drPlanType;

    /** The DR plan type. */
    public com.oracle.bmc.disasterrecovery.model.DrPlanType getDrPlanType() {
        return drPlanType;
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
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 100}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 1000 is the maximum.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDrPlansRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the DR protection group. Mandatory query param.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         */
        private String drProtectionGroupId = null;

        /**
         * The OCID of the DR protection group. Mandatory query param.
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

        /** A filter to return only DR plans that match the given lifecycle state. */
        private com.oracle.bmc.disasterrecovery.model.DrPlanLifecycleState lifecycleState = null;

        /**
         * A filter to return only DR plans that match the given lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.disasterrecovery.model.DrPlanLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The OCID of the DR plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         */
        private String drPlanId = null;

        /**
         * The OCID of the DR plan.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         * @param drPlanId the value to set
         * @return this builder instance
         */
        public Builder drPlanId(String drPlanId) {
            this.drPlanId = drPlanId;
            return this;
        }

        /** The DR plan type. */
        private com.oracle.bmc.disasterrecovery.model.DrPlanType drPlanType = null;

        /**
         * The DR plan type.
         *
         * @param drPlanType the value to set
         * @return this builder instance
         */
        public Builder drPlanType(com.oracle.bmc.disasterrecovery.model.DrPlanType drPlanType) {
            this.drPlanType = drPlanType;
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
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 100}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 1000 is the maximum.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
        public Builder copy(ListDrPlansRequest o) {
            drProtectionGroupId(o.getDrProtectionGroupId());
            lifecycleState(o.getLifecycleState());
            drPlanId(o.getDrPlanId());
            drPlanType(o.getDrPlanType());
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
         * Build the instance of ListDrPlansRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDrPlansRequest
         */
        public ListDrPlansRequest build() {
            ListDrPlansRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDrPlansRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDrPlansRequest
         */
        public ListDrPlansRequest buildWithoutInvocationCallback() {
            ListDrPlansRequest request = new ListDrPlansRequest();
            request.drProtectionGroupId = drProtectionGroupId;
            request.lifecycleState = lifecycleState;
            request.drPlanId = drPlanId;
            request.drPlanType = drPlanType;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDrPlansRequest(drProtectionGroupId, lifecycleState, drPlanId, drPlanType,
            // displayName, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .drProtectionGroupId(drProtectionGroupId)
                .lifecycleState(lifecycleState)
                .drPlanId(drPlanId)
                .drPlanType(drPlanType)
                .displayName(displayName)
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
        sb.append(",drProtectionGroupId=").append(String.valueOf(this.drProtectionGroupId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",drPlanId=").append(String.valueOf(this.drPlanId));
        sb.append(",drPlanType=").append(String.valueOf(this.drPlanType));
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
        if (!(o instanceof ListDrPlansRequest)) {
            return false;
        }

        ListDrPlansRequest other = (ListDrPlansRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.drProtectionGroupId, other.drProtectionGroupId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.drPlanId, other.drPlanId)
                && java.util.Objects.equals(this.drPlanType, other.drPlanType)
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
                        + (this.drProtectionGroupId == null
                                ? 43
                                : this.drProtectionGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.drPlanId == null ? 43 : this.drPlanId.hashCode());
        result = (result * PRIME) + (this.drPlanType == null ? 43 : this.drPlanType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
