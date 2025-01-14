/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListCompartmentsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCompartmentsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListCompartmentsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    private String compartmentId;

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. Default is {@code ANY}. Setting this to
     * {@code ACCESSIBLE} returns only those compartments for which the user has INSPECT permissions
     * directly or indirectly (permissions can be on a resource in a subcompartment). For the
     * compartments on which the user indirectly has INSPECT permissions, a restricted set of fields
     * is returned.
     *
     * <p>When set to {@code ANY} permissions are not checked.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. Default is {@code ANY}. Setting this to
     * {@code ACCESSIBLE} returns only those compartments for which the user has INSPECT permissions
     * directly or indirectly (permissions can be on a resource in a subcompartment). For the
     * compartments on which the user indirectly has INSPECT permissions, a restricted set of fields
     * is returned.
     *
     * <p>When set to {@code ANY} permissions are not checked.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Any("ANY"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are {@code ANY} and {@code ACCESSIBLE}. Default is {@code ANY}. Setting this to
     * {@code ACCESSIBLE} returns only those compartments for which the user has INSPECT permissions
     * directly or indirectly (permissions can be on a resource in a subcompartment). For the
     * compartments on which the user indirectly has INSPECT permissions, a restricted set of fields
     * is returned.
     *
     * <p>When set to {@code ANY} permissions are not checked.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * Default is false. Can only be set to true when performing ListCompartments on the tenancy
     * (root compartment). When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the the setting of
     * {@code accessLevel}.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. Can only be set to true when performing ListCompartments on the tenancy
     * (root compartment). When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the the setting of
     * {@code accessLevel}.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** A filter to only return resources that match the given name exactly. */
    private String name;

    /** A filter to only return resources that match the given name exactly. */
    public String getName() {
        return name;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case
     * sensitive.
     *
     * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a single
     * Availability Domain. If you call one of these "List" operations without specifying an
     * Availability Domain, the resources are grouped by Availability Domain, then sorted.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case
     * sensitive.
     *
     * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a single
     * Availability Domain. If you call one of these "List" operations without specifying an
     * Availability Domain, the resources are grouped by Availability Domain, then sorted.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Name("NAME"),
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case
     * sensitive.
     *
     * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a single
     * Availability Domain. If you call one of these "List" operations without specifying an
     * Availability Domain, the resources are grouped by Availability Domain, then sorted.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME
     * sort order is case sensitive.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME
     * sort order is case sensitive.
     */
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

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME
     * sort order is case sensitive.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * A filter to only return resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.identity.model.Compartment.LifecycleState lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.identity.model.Compartment.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCompartmentsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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

        /**
         * Valid values are {@code ANY} and {@code ACCESSIBLE}. Default is {@code ANY}. Setting this
         * to {@code ACCESSIBLE} returns only those compartments for which the user has INSPECT
         * permissions directly or indirectly (permissions can be on a resource in a
         * subcompartment). For the compartments on which the user indirectly has INSPECT
         * permissions, a restricted set of fields is returned.
         *
         * <p>When set to {@code ANY} permissions are not checked.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are {@code ANY} and {@code ACCESSIBLE}. Default is {@code ANY}. Setting this
         * to {@code ACCESSIBLE} returns only those compartments for which the user has INSPECT
         * permissions directly or indirectly (permissions can be on a resource in a
         * subcompartment). For the compartments on which the user indirectly has INSPECT
         * permissions, a restricted set of fields is returned.
         *
         * <p>When set to {@code ANY} permissions are not checked.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * Default is false. Can only be set to true when performing ListCompartments on the tenancy
         * (root compartment). When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the the setting
         * of {@code accessLevel}.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. Can only be set to true when performing ListCompartments on the tenancy
         * (root compartment). When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the the setting
         * of {@code accessLevel}.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /** A filter to only return resources that match the given name exactly. */
        private String name = null;

        /**
         * A filter to only return resources that match the given name exactly.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order
         * is case sensitive.
         *
         * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let
         * you optionally filter by Availability Domain if the scope of the resource type is within
         * a single Availability Domain. If you call one of these "List" operations without
         * specifying an Availability Domain, the resources are grouped by Availability Domain, then
         * sorted.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order
         * is case sensitive.
         *
         * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let
         * you optionally filter by Availability Domain if the scope of the resource type is within
         * a single Availability Domain. If you call one of these "List" operations without
         * specifying an Availability Domain, the resources are grouped by Availability Domain, then
         * sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
         * NAME sort order is case sensitive.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
         * NAME sort order is case sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * A filter to only return resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.identity.model.Compartment.LifecycleState lifecycleState = null;

        /**
         * A filter to only return resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.identity.model.Compartment.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListCompartmentsRequest o) {
            compartmentId(o.getCompartmentId());
            page(o.getPage());
            limit(o.getLimit());
            accessLevel(o.getAccessLevel());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            name(o.getName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCompartmentsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCompartmentsRequest
         */
        public ListCompartmentsRequest build() {
            ListCompartmentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCompartmentsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCompartmentsRequest
         */
        public ListCompartmentsRequest buildWithoutInvocationCallback() {
            ListCompartmentsRequest request = new ListCompartmentsRequest();
            request.compartmentId = compartmentId;
            request.page = page;
            request.limit = limit;
            request.accessLevel = accessLevel;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.name = name;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListCompartmentsRequest(compartmentId, page, limit, accessLevel,
            // compartmentIdInSubtree, name, sortBy, sortOrder, lifecycleState);
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
                .page(page)
                .limit(limit)
                .accessLevel(accessLevel)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .name(name)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState);
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
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCompartmentsRequest)) {
            return false;
        }

        ListCompartmentsRequest other = (ListCompartmentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
