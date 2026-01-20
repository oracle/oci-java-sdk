/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limits.requests;

import com.oracle.bmc.limits.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limits/ListLimitValuesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLimitValuesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181025")
public class ListLimitValuesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the parent compartment (remember that the tenancy is simply the root
     * compartment).
     */
    private String compartmentId;

    /**
     * The OCID of the parent compartment (remember that the tenancy is simply the root
     * compartment).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The target service name. */
    private String serviceName;

    /** The target service name. */
    public String getServiceName() {
        return serviceName;
    }
    /** The subscription OCID assigned to the tenant. */
    private String subscriptionId;

    /** The subscription OCID assigned to the tenant. */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** External cloud provider location */
    private String externalLocation;

    /** External cloud provider location */
    public String getExternalLocation() {
        return externalLocation;
    }
    /** Filter entries by scope type. */
    private ScopeType scopeType;

    /** Filter entries by scope type. */
    public enum ScopeType implements com.oracle.bmc.http.internal.BmcEnum {
        Global("GLOBAL"),
        Region("REGION"),
        Ad("AD"),
        ;

        private final String value;
        private static java.util.Map<String, ScopeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScopeType v : ScopeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ScopeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScopeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ScopeType: " + key);
        }
    };

    /** Filter entries by scope type. */
    public ScopeType getScopeType() {
        return scopeType;
    }
    /**
     * Filter entries by availability domain. This implies that only AD-specific values are
     * returned.
     */
    private String availabilityDomain;

    /**
     * Filter entries by availability domain. This implies that only AD-specific values are
     * returned.
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /** Optional field, can be used to see a specific resource limit value. */
    private String name;

    /** Optional field, can be used to see a specific resource limit value. */
    public String getName() {
        return name;
    }
    /**
     * The field to sort by. The sorting is by availabilityDomain, as a second level field, if
     * available.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. The sorting is by availabilityDomain, as a second level field, if
     * available.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort by. The sorting is by availabilityDomain, as a second level field, if
     * available.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either 'asc' or 'desc'. By default, it is ascending. */
    private SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. By default, it is ascending. */
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

    /** The sort order to use, either 'asc' or 'desc'. By default, it is ascending. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListLimitValuesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the parent compartment (remember that the tenancy is simply the root
         * compartment).
         */
        private String compartmentId = null;

        /**
         * The OCID of the parent compartment (remember that the tenancy is simply the root
         * compartment).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The target service name. */
        private String serviceName = null;

        /**
         * The target service name.
         *
         * @param serviceName the value to set
         * @return this builder instance
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /** The subscription OCID assigned to the tenant. */
        private String subscriptionId = null;

        /**
         * The subscription OCID assigned to the tenant.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /** External cloud provider location */
        private String externalLocation = null;

        /**
         * External cloud provider location
         *
         * @param externalLocation the value to set
         * @return this builder instance
         */
        public Builder externalLocation(String externalLocation) {
            this.externalLocation = externalLocation;
            return this;
        }

        /** Filter entries by scope type. */
        private ScopeType scopeType = null;

        /**
         * Filter entries by scope type.
         *
         * @param scopeType the value to set
         * @return this builder instance
         */
        public Builder scopeType(ScopeType scopeType) {
            this.scopeType = scopeType;
            return this;
        }

        /**
         * Filter entries by availability domain. This implies that only AD-specific values are
         * returned.
         */
        private String availabilityDomain = null;

        /**
         * Filter entries by availability domain. This implies that only AD-specific values are
         * returned.
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /** Optional field, can be used to see a specific resource limit value. */
        private String name = null;

        /**
         * Optional field, can be used to see a specific resource limit value.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The field to sort by. The sorting is by availabilityDomain, as a second level field, if
         * available.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. The sorting is by availabilityDomain, as a second level field, if
         * available.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. By default, it is ascending. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'. By default, it is ascending.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The maximum number of items to return in a paginated "List" call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(ListLimitValuesRequest o) {
            compartmentId(o.getCompartmentId());
            serviceName(o.getServiceName());
            subscriptionId(o.getSubscriptionId());
            externalLocation(o.getExternalLocation());
            scopeType(o.getScopeType());
            availabilityDomain(o.getAvailabilityDomain());
            name(o.getName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLimitValuesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListLimitValuesRequest
         */
        public ListLimitValuesRequest build() {
            ListLimitValuesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLimitValuesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLimitValuesRequest
         */
        public ListLimitValuesRequest buildWithoutInvocationCallback() {
            ListLimitValuesRequest request = new ListLimitValuesRequest();
            request.compartmentId = compartmentId;
            request.serviceName = serviceName;
            request.subscriptionId = subscriptionId;
            request.externalLocation = externalLocation;
            request.scopeType = scopeType;
            request.availabilityDomain = availabilityDomain;
            request.name = name;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLimitValuesRequest(compartmentId, serviceName, subscriptionId,
            // externalLocation, scopeType, availabilityDomain, name, sortBy, sortOrder, limit,
            // page, opcRequestId);
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
                .serviceName(serviceName)
                .subscriptionId(subscriptionId)
                .externalLocation(externalLocation)
                .scopeType(scopeType)
                .availabilityDomain(availabilityDomain)
                .name(name)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
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
        sb.append(",serviceName=").append(String.valueOf(this.serviceName));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",externalLocation=").append(String.valueOf(this.externalLocation));
        sb.append(",scopeType=").append(String.valueOf(this.scopeType));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLimitValuesRequest)) {
            return false;
        }

        ListLimitValuesRequest other = (ListLimitValuesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.externalLocation, other.externalLocation)
                && java.util.Objects.equals(this.scopeType, other.scopeType)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalLocation == null ? 43 : this.externalLocation.hashCode());
        result = (result * PRIME) + (this.scopeType == null ? 43 : this.scopeType.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
