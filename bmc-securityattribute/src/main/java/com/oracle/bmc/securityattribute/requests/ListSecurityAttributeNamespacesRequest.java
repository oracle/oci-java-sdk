/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.requests;

import com.oracle.bmc.securityattribute.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/securityattribute/ListSecurityAttributeNamespacesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSecurityAttributeNamespacesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class ListSecurityAttributeNamespacesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private com.oracle.bmc.securityattribute.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public com.oracle.bmc.securityattribute.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these "List" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these "List" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     **/
    public enum SortBy {
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
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these "List" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String name;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getName() {
        return name;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * An optional boolean parameter indicating whether to retrieve all security attribute namespaces in subcompartments. If this
     * parameter is not specified, only the namespaces defined in the specified compartment are retrieved.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * An optional boolean parameter indicating whether to retrieve all security attribute namespaces in subcompartments. If this
     * parameter is not specified, only the namespaces defined in the specified compartment are retrieved.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     *
     */
    private com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.LifecycleState
            lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
     *
     */
    public com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSecurityAttributeNamespacesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         */
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
         * The maximum number of items to return in a paginated "List" call.
         *
         */
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
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         */
        private com.oracle.bmc.securityattribute.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.securityattribute.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * TIMECREATED is descending. Default order for NAME is ascending. The NAME
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by Availability Domain if the scope of the resource type is within a
         * single Availability Domain. If you call one of these "List" operations without specifying
         * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * TIMECREATED is descending. Default order for NAME is ascending. The NAME
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by Availability Domain if the scope of the resource type is within a
         * single Availability Domain. If you call one of these "List" operations without specifying
         * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String name = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * An optional boolean parameter indicating whether to retrieve all security attribute namespaces in subcompartments. If this
         * parameter is not specified, only the namespaces defined in the specified compartment are retrieved.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * An optional boolean parameter indicating whether to retrieve all security attribute namespaces in subcompartments. If this
         * parameter is not specified, only the namespaces defined in the specified compartment are retrieved.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         *
         */
        private com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.LifecycleState
                lifecycleState = null;

        /**
         * A filter to only return resources that match the given lifecycle state.  The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListSecurityAttributeNamespacesRequest o) {
            compartmentId(o.getCompartmentId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            name(o.getName());
            opcRequestId(o.getOpcRequestId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSecurityAttributeNamespacesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSecurityAttributeNamespacesRequest
         */
        public ListSecurityAttributeNamespacesRequest build() {
            ListSecurityAttributeNamespacesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSecurityAttributeNamespacesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSecurityAttributeNamespacesRequest
         */
        public ListSecurityAttributeNamespacesRequest buildWithoutInvocationCallback() {
            ListSecurityAttributeNamespacesRequest request =
                    new ListSecurityAttributeNamespacesRequest();
            request.compartmentId = compartmentId;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.name = name;
            request.opcRequestId = opcRequestId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListSecurityAttributeNamespacesRequest(compartmentId, page, limit, sortOrder, sortBy, name, opcRequestId, compartmentIdInSubtree, lifecycleState);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .name(name)
                .opcRequestId(opcRequestId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .lifecycleState(lifecycleState);
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
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSecurityAttributeNamespacesRequest)) {
            return false;
        }

        ListSecurityAttributeNamespacesRequest other = (ListSecurityAttributeNamespacesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
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
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
