/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/ListInfrastructuresExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListInfrastructuresRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class ListInfrastructuresRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
     * tenant OCID is provided, it will be validated against the caller's tenant and then treated as
     * tenant scope (compartmentId filtering is not applied).
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
     * tenant OCID is provided, it will be validated against the caller's tenant and then treated as
     * tenant scope (compartmentId filtering is not applied).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return resources that match the entire display name given. The match is case
     * sensitive.
     */
    private String displayName;

    /**
     * A filter to return resources that match the entire display name given. The match is case
     * sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return resources that match the specified lifecycle state. */
    private java.util.List<com.oracle.bmc.datacc.model.InfrastructureLifecycleState> lifecycleState;

    /** A filter to return resources that match the specified lifecycle state. */
    public java.util.List<com.oracle.bmc.datacc.model.InfrastructureLifecycleState>
            getLifecycleState() {
        return lifecycleState;
    }
    /** The maximum number of items to return in a page. */
    private Integer limit;

    /** The maximum number of items to return in a page. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which you want to start retrieving results. This
     * token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which you want to start retrieving results. This
     * token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
    private com.oracle.bmc.datacc.model.SortOrder sortOrder;

    /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
    public com.oracle.bmc.datacc.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    private SortBy sortBy;

    /**
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        BuildIdentifier("buildIdentifier"),
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
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListInfrastructuresRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
         * tenant OCID is provided, it will be validated against the caller's tenant and then
         * treated as tenant scope (compartmentId filtering is not applied).
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
         * tenant OCID is provided, it will be validated against the caller's tenant and then
         * treated as tenant scope (compartmentId filtering is not applied).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return resources that match the entire display name given. The match is case
         * sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return resources that match the entire display name given. The match is case
         * sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return resources that match the specified lifecycle state. */
        private java.util.List<com.oracle.bmc.datacc.model.InfrastructureLifecycleState>
                lifecycleState = null;

        /**
         * A filter to return resources that match the specified lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.datacc.model.InfrastructureLifecycleState>
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return resources that match the specified lifecycle state.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(InfrastructureLifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        /** The maximum number of items to return in a page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which you want to start retrieving results. This
         * token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which you want to start retrieving results. This
         * token is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
        private com.oracle.bmc.datacc.model.SortOrder sortOrder = null;

        /**
         * The sort order that you want to use, which is either {@code ASC} or {@code DESC}.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.datacc.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field by which you want to sort. You can provide only one type of sort order. The
         * default order for {@code timeCreated} is descending. The default order for {@code
         * displayName} is ascending. If no value is specified, then {@code timeCreated} is the
         * default. When listing software images within the same {@code version}, using {@code
         * sortBy=buildIdentifier} is recommended. {@code buildIdentifier} is a monotonically
         * increasing, time-ordered string marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
         */
        private SortBy sortBy = null;

        /**
         * The field by which you want to sort. You can provide only one type of sort order. The
         * default order for {@code timeCreated} is descending. The default order for {@code
         * displayName} is ascending. If no value is specified, then {@code timeCreated} is the
         * default. When listing software images within the same {@code version}, using {@code
         * sortBy=buildIdentifier} is recommended. {@code buildIdentifier} is a monotonically
         * increasing, time-ordered string marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
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
        public Builder copy(ListInfrastructuresRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
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
         * Build the instance of ListInfrastructuresRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListInfrastructuresRequest
         */
        public ListInfrastructuresRequest build() {
            ListInfrastructuresRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListInfrastructuresRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListInfrastructuresRequest
         */
        public ListInfrastructuresRequest buildWithoutInvocationCallback() {
            ListInfrastructuresRequest request = new ListInfrastructuresRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListInfrastructuresRequest(compartmentId, displayName, lifecycleState, limit,
            // page, sortOrder, sortBy, opcRequestId);
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
                .displayName(displayName)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof ListInfrastructuresRequest)) {
            return false;
        }

        ListInfrastructuresRequest other = (ListInfrastructuresRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
