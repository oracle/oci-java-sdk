/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/ListProtectionPoliciesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListProtectionPoliciesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class ListProtectionPoliciesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The compartment OCID. */
    private String compartmentId;

    /** The compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.recovery.model.LifecycleState lifecycleState;

    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.recovery.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that match the entire 'displayname' given. */
    private String displayName;

    /** A filter to return only resources that match the entire 'displayname' given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The protection policy OCID. */
    private String protectionPolicyId;

    /** The protection policy OCID. */
    public String getProtectionPolicyId() {
        return protectionPolicyId;
    }
    /** A filter to return only the policies that match the owner as 'Customer' or 'Oracle'. */
    private Owner owner;

    /** A filter to return only the policies that match the owner as 'Customer' or 'Oracle'. */
    public enum Owner implements com.oracle.bmc.http.internal.BmcEnum {
        Oracle("oracle"),
        Customer("customer"),
        ;

        private final String value;
        private static java.util.Map<String, Owner> map;

        static {
            map = new java.util.HashMap<>();
            for (Owner v : Owner.values()) {
                map.put(v.getValue(), v);
            }
        }

        Owner(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Owner create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Owner: " + key);
        }
    };

    /** A filter to return only the policies that match the owner as 'Customer' or 'Oracle'. */
    public Owner getOwner() {
        return owner;
    }
    /** The maximum number of items to return. Specify a value greater than 4. */
    private Integer limit;

    /** The maximum number of items to return. Specify a value greater than 4. */
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
    /**
     * The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: - ASC
     * - DESC
     */
    private com.oracle.bmc.recovery.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: - ASC
     * - DESC
     */
    public com.oracle.bmc.recovery.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide one sort order (sortOrder). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If you do not specify
     * a value, then TIMECREATED is used as the default sort order. Allowed values are: -
     * TIMECREATED - DISPLAYNAME
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order (sortOrder). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If you do not specify
     * a value, then TIMECREATED is used as the default sort order. Allowed values are: -
     * TIMECREATED - DISPLAYNAME
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
     * The field to sort by. You can provide one sort order (sortOrder). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If you do not specify
     * a value, then TIMECREATED is used as the default sort order. Allowed values are: -
     * TIMECREATED - DISPLAYNAME
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListProtectionPoliciesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The compartment OCID. */
        private String compartmentId = null;

        /**
         * The compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.recovery.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.recovery.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only resources that match the entire 'displayname' given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire 'displayname' given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The protection policy OCID. */
        private String protectionPolicyId = null;

        /**
         * The protection policy OCID.
         *
         * @param protectionPolicyId the value to set
         * @return this builder instance
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }

        /** A filter to return only the policies that match the owner as 'Customer' or 'Oracle'. */
        private Owner owner = null;

        /**
         * A filter to return only the policies that match the owner as 'Customer' or 'Oracle'.
         *
         * @param owner the value to set
         * @return this builder instance
         */
        public Builder owner(Owner owner) {
            this.owner = owner;
            return this;
        }

        /** The maximum number of items to return. Specify a value greater than 4. */
        private Integer limit = null;

        /**
         * The maximum number of items to return. Specify a value greater than 4.
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

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: -
         * ASC - DESC
         */
        private com.oracle.bmc.recovery.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC). Allowed values are: -
         * ASC - DESC
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.recovery.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order (sortOrder). Default order for
         * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If you do not
         * specify a value, then TIMECREATED is used as the default sort order. Allowed values are:
         * - TIMECREATED - DISPLAYNAME
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order (sortOrder). Default order for
         * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If you do not
         * specify a value, then TIMECREATED is used as the default sort order. Allowed values are:
         * - TIMECREATED - DISPLAYNAME
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ListProtectionPoliciesRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            protectionPolicyId(o.getProtectionPolicyId());
            owner(o.getOwner());
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
         * Build the instance of ListProtectionPoliciesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListProtectionPoliciesRequest
         */
        public ListProtectionPoliciesRequest build() {
            ListProtectionPoliciesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListProtectionPoliciesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListProtectionPoliciesRequest
         */
        public ListProtectionPoliciesRequest buildWithoutInvocationCallback() {
            ListProtectionPoliciesRequest request = new ListProtectionPoliciesRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.protectionPolicyId = protectionPolicyId;
            request.owner = owner;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListProtectionPoliciesRequest(compartmentId, lifecycleState, displayName,
            // protectionPolicyId, owner, limit, page, sortOrder, sortBy, opcRequestId);
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
                .displayName(displayName)
                .protectionPolicyId(protectionPolicyId)
                .owner(owner)
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",protectionPolicyId=").append(String.valueOf(this.protectionPolicyId));
        sb.append(",owner=").append(String.valueOf(this.owner));
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
        if (!(o instanceof ListProtectionPoliciesRequest)) {
            return false;
        }

        ListProtectionPoliciesRequest other = (ListProtectionPoliciesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.protectionPolicyId, other.protectionPolicyId)
                && java.util.Objects.equals(this.owner, other.owner)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionPolicyId == null
                                ? 43
                                : this.protectionPolicyId.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
