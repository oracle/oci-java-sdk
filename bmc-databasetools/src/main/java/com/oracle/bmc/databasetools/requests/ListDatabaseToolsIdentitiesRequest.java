/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.requests;

import com.oracle.bmc.databasetools.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ListDatabaseToolsIdentitiesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDatabaseToolsIdentitiesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class ListDatabaseToolsIdentitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return resources only when their {@code databaseToolsIdentityLifecycleState}
     * matches the specified {@code databaseToolsIdentityLifecycleState}.
     */
    private com.oracle.bmc.databasetools.model.DatabaseToolsIdentityLifecycleState lifecycleState;

    /**
     * A filter to return resources only when their {@code databaseToolsIdentityLifecycleState}
     * matches the specified {@code databaseToolsIdentityLifecycleState}.
     */
    public com.oracle.bmc.databasetools.model.DatabaseToolsIdentityLifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that match the entire specified display name. */
    private String displayName;

    /** A filter to return only resources that match the entire specified display name. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources when their {@code databaseToolsConnectionId} matches the
     * specified {@code databaseToolsConnectionId}.
     */
    private String databaseToolsConnectionId;

    /**
     * A filter to return only resources when their {@code databaseToolsConnectionId} matches the
     * specified {@code databaseToolsConnectionId}.
     */
    public String getDatabaseToolsConnectionId() {
        return databaseToolsConnectionId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
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
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.databasetools.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.databasetools.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
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
    /** A filter to return only resources with one of the specified type values. */
    private java.util.List<com.oracle.bmc.databasetools.model.IdentityType> type;

    /** A filter to return only resources with one of the specified type values. */
    public java.util.List<com.oracle.bmc.databasetools.model.IdentityType> getType() {
        return type;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDatabaseToolsIdentitiesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return resources only when their {@code databaseToolsIdentityLifecycleState}
         * matches the specified {@code databaseToolsIdentityLifecycleState}.
         */
        private com.oracle.bmc.databasetools.model.DatabaseToolsIdentityLifecycleState
                lifecycleState = null;

        /**
         * A filter to return resources only when their {@code databaseToolsIdentityLifecycleState}
         * matches the specified {@code databaseToolsIdentityLifecycleState}.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.databasetools.model.DatabaseToolsIdentityLifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only resources that match the entire specified display name. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire specified display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources when their {@code databaseToolsConnectionId} matches
         * the specified {@code databaseToolsConnectionId}.
         */
        private String databaseToolsConnectionId = null;

        /**
         * A filter to return only resources when their {@code databaseToolsConnectionId} matches
         * the specified {@code databaseToolsConnectionId}.
         *
         * @param databaseToolsConnectionId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            this.databaseToolsConnectionId = databaseToolsConnectionId;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
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

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.databasetools.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasetools.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
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

        /** A filter to return only resources with one of the specified type values. */
        private java.util.List<com.oracle.bmc.databasetools.model.IdentityType> type = null;

        /**
         * A filter to return only resources with one of the specified type values.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(java.util.List<com.oracle.bmc.databasetools.model.IdentityType> type) {
            this.type = type;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources with one of the specified type values.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder type(IdentityType singularValue) {
            return this.type(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListDatabaseToolsIdentitiesRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            databaseToolsConnectionId(o.getDatabaseToolsConnectionId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            type(o.getType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDatabaseToolsIdentitiesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDatabaseToolsIdentitiesRequest
         */
        public ListDatabaseToolsIdentitiesRequest build() {
            ListDatabaseToolsIdentitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDatabaseToolsIdentitiesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDatabaseToolsIdentitiesRequest
         */
        public ListDatabaseToolsIdentitiesRequest buildWithoutInvocationCallback() {
            ListDatabaseToolsIdentitiesRequest request = new ListDatabaseToolsIdentitiesRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.databaseToolsConnectionId = databaseToolsConnectionId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.type = type;
            return request;
            // new ListDatabaseToolsIdentitiesRequest(compartmentId, lifecycleState, displayName,
            // databaseToolsConnectionId, limit, page, sortOrder, sortBy, opcRequestId, type);
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
                .databaseToolsConnectionId(databaseToolsConnectionId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .type(type);
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
        sb.append(",databaseToolsConnectionId=")
                .append(String.valueOf(this.databaseToolsConnectionId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabaseToolsIdentitiesRequest)) {
            return false;
        }

        ListDatabaseToolsIdentitiesRequest other = (ListDatabaseToolsIdentitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionId, other.databaseToolsConnectionId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.type, other.type);
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
                        + (this.databaseToolsConnectionId == null
                                ? 43
                                : this.databaseToolsConnectionId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        return result;
    }
}
