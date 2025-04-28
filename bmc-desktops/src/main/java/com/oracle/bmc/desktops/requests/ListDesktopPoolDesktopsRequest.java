/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.requests;

import com.oracle.bmc.desktops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/desktops/ListDesktopPoolDesktopsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDesktopPoolDesktopsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class ListDesktopPoolDesktopsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment of the desktop pool. */
    private String compartmentId;

    /** The OCID of the compartment of the desktop pool. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The OCID of the desktop pool. */
    private String desktopPoolId;

    /** The OCID of the desktop pool. */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }
    /** The name of the availability domain. */
    private String availabilityDomain;

    /** The name of the availability domain. */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /** A filter to return only results with the given displayName. */
    private String displayName;

    /** A filter to return only results with the given displayName. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only results with the given OCID. */
    private String id;

    /** A filter to return only results with the given OCID. */
    public String getId() {
        return id;
    }
    /** A filter to return only results with the given lifecycleState. */
    private String lifecycleState;

    /** A filter to return only results with the given lifecycleState. */
    public String getLifecycleState() {
        return lifecycleState;
    }
    /** The maximum number of results to return. */
    private Integer limit;

    /** The maximum number of results to return. */
    public Integer getLimit() {
        return limit;
    }
    /** A field to sort by. */
    private SortBy sortBy;

    /** A field to sort by. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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

    /** A field to sort by. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A field to indicate the sort order. */
    private SortOrder sortOrder;

    /** A field to indicate the sort order. */
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

    /** A field to indicate the sort order. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The unique identifier of the request. */
    private String opcRequestId;

    /** The unique identifier of the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** For list pagination. */
    private String page;

    /** For list pagination. */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDesktopPoolDesktopsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment of the desktop pool. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment of the desktop pool.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The OCID of the desktop pool. */
        private String desktopPoolId = null;

        /**
         * The OCID of the desktop pool.
         *
         * @param desktopPoolId the value to set
         * @return this builder instance
         */
        public Builder desktopPoolId(String desktopPoolId) {
            this.desktopPoolId = desktopPoolId;
            return this;
        }

        /** The name of the availability domain. */
        private String availabilityDomain = null;

        /**
         * The name of the availability domain.
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /** A filter to return only results with the given displayName. */
        private String displayName = null;

        /**
         * A filter to return only results with the given displayName.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return only results with the given OCID. */
        private String id = null;

        /**
         * A filter to return only results with the given OCID.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** A filter to return only results with the given lifecycleState. */
        private String lifecycleState = null;

        /**
         * A filter to return only results with the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The maximum number of results to return. */
        private Integer limit = null;

        /**
         * The maximum number of results to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** A field to sort by. */
        private SortBy sortBy = null;

        /**
         * A field to sort by.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A field to indicate the sort order. */
        private SortOrder sortOrder = null;

        /**
         * A field to indicate the sort order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The unique identifier of the request. */
        private String opcRequestId = null;

        /**
         * The unique identifier of the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For list pagination. */
        private String page = null;

        /**
         * For list pagination.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListDesktopPoolDesktopsRequest o) {
            compartmentId(o.getCompartmentId());
            desktopPoolId(o.getDesktopPoolId());
            availabilityDomain(o.getAvailabilityDomain());
            displayName(o.getDisplayName());
            id(o.getId());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDesktopPoolDesktopsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDesktopPoolDesktopsRequest
         */
        public ListDesktopPoolDesktopsRequest build() {
            ListDesktopPoolDesktopsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDesktopPoolDesktopsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDesktopPoolDesktopsRequest
         */
        public ListDesktopPoolDesktopsRequest buildWithoutInvocationCallback() {
            ListDesktopPoolDesktopsRequest request = new ListDesktopPoolDesktopsRequest();
            request.compartmentId = compartmentId;
            request.desktopPoolId = desktopPoolId;
            request.availabilityDomain = availabilityDomain;
            request.displayName = displayName;
            request.id = id;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.page = page;
            return request;
            // new ListDesktopPoolDesktopsRequest(compartmentId, desktopPoolId, availabilityDomain,
            // displayName, id, lifecycleState, limit, sortBy, sortOrder, opcRequestId, page);
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
                .desktopPoolId(desktopPoolId)
                .availabilityDomain(availabilityDomain)
                .displayName(displayName)
                .id(id)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .page(page);
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
        sb.append(",desktopPoolId=").append(String.valueOf(this.desktopPoolId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDesktopPoolDesktopsRequest)) {
            return false;
        }

        ListDesktopPoolDesktopsRequest other = (ListDesktopPoolDesktopsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.desktopPoolId, other.desktopPoolId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page);
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
                        + (this.desktopPoolId == null ? 43 : this.desktopPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
