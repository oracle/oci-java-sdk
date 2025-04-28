/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListConfigurationSourceProvidersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListConfigurationSourceProvidersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ListConfigurationSourceProvidersRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /**
     * A filter to return only resources that exist in the compartment, identified by
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * A filter to return only resources that exist in the compartment, identified by
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only configuration source providers that match the provided
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String configurationSourceProviderId;

    /**
     * A filter to return only configuration source providers that match the provided
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getConfigurationSourceProviderId() {
        return configurationSourceProviderId;
    }
    /**
     * A filter to return only resources that match the given display name exactly. Use this filter
     * to list a resource by name. Requires {@code sortBy} set to {@code DISPLAYNAME}.
     * Alternatively, when you know the resource OCID, use the related Get operation.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the given display name exactly. Use this filter
     * to list a resource by name. Requires {@code sortBy} set to {@code DISPLAYNAME}.
     * Alternatively, when you know the resource OCID, use the related Get operation.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The field to use when sorting returned resources. By default, {@code TIMECREATED} is ordered
     * descending. By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only
     * on one field.
     */
    private SortBy sortBy;

    /**
     * The field to use when sorting returned resources. By default, {@code TIMECREATED} is ordered
     * descending. By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only
     * on one field.
     */
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

    /**
     * The field to use when sorting returned resources. By default, {@code TIMECREATED} is ordered
     * descending. By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only
     * on one field.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending
     * ({@code DESC}).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending
     * ({@code DESC}).
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
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending
     * ({@code DESC}).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * A filter to return only configuration source providers of the specified type (GitHub or
     * GitLab).
     */
    private String configSourceProviderType;

    /**
     * A filter to return only configuration source providers of the specified type (GitHub or
     * GitLab).
     */
    public String getConfigSourceProviderType() {
        return configSourceProviderType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListConfigurationSourceProvidersRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * A filter to return only resources that exist in the compartment, identified by
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that exist in the compartment, identified by
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only configuration source providers that match the provided
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String configurationSourceProviderId = null;

        /**
         * A filter to return only configuration source providers that match the provided
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param configurationSourceProviderId the value to set
         * @return this builder instance
         */
        public Builder configurationSourceProviderId(String configurationSourceProviderId) {
            this.configurationSourceProviderId = configurationSourceProviderId;
            return this;
        }

        /**
         * A filter to return only resources that match the given display name exactly. Use this
         * filter to list a resource by name. Requires {@code sortBy} set to {@code DISPLAYNAME}.
         * Alternatively, when you know the resource OCID, use the related Get operation.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly. Use this
         * filter to list a resource by name. Requires {@code sortBy} set to {@code DISPLAYNAME}.
         * Alternatively, when you know the resource OCID, use the related Get operation.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The field to use when sorting returned resources. By default, {@code TIMECREATED} is
         * ordered descending. By default, {@code DISPLAYNAME} is ordered ascending. Note that you
         * can sort only on one field.
         */
        private SortBy sortBy = null;

        /**
         * The field to use when sorting returned resources. By default, {@code TIMECREATED} is
         * ordered descending. By default, {@code DISPLAYNAME} is ordered ascending. Note that you
         * can sort only on one field.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or
         * descending ({@code DESC}).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or
         * descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * A filter to return only configuration source providers of the specified type (GitHub or
         * GitLab).
         */
        private String configSourceProviderType = null;

        /**
         * A filter to return only configuration source providers of the specified type (GitHub or
         * GitLab).
         *
         * @param configSourceProviderType the value to set
         * @return this builder instance
         */
        public Builder configSourceProviderType(String configSourceProviderType) {
            this.configSourceProviderType = configSourceProviderType;
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
        public Builder copy(ListConfigurationSourceProvidersRequest o) {
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            configurationSourceProviderId(o.getConfigurationSourceProviderId());
            displayName(o.getDisplayName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            configSourceProviderType(o.getConfigSourceProviderType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListConfigurationSourceProvidersRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListConfigurationSourceProvidersRequest
         */
        public ListConfigurationSourceProvidersRequest build() {
            ListConfigurationSourceProvidersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListConfigurationSourceProvidersRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListConfigurationSourceProvidersRequest
         */
        public ListConfigurationSourceProvidersRequest buildWithoutInvocationCallback() {
            ListConfigurationSourceProvidersRequest request =
                    new ListConfigurationSourceProvidersRequest();
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            request.configurationSourceProviderId = configurationSourceProviderId;
            request.displayName = displayName;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.configSourceProviderType = configSourceProviderType;
            return request;
            // new ListConfigurationSourceProvidersRequest(opcRequestId, compartmentId,
            // configurationSourceProviderId, displayName, sortBy, sortOrder, limit, page,
            // configSourceProviderType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId)
                .configurationSourceProviderId(configurationSourceProviderId)
                .displayName(displayName)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .configSourceProviderType(configSourceProviderType);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",configurationSourceProviderId=")
                .append(String.valueOf(this.configurationSourceProviderId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",configSourceProviderType=")
                .append(String.valueOf(this.configSourceProviderType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListConfigurationSourceProvidersRequest)) {
            return false;
        }

        ListConfigurationSourceProvidersRequest other = (ListConfigurationSourceProvidersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.configurationSourceProviderId, other.configurationSourceProviderId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.configSourceProviderType, other.configSourceProviderType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationSourceProviderId == null
                                ? 43
                                : this.configurationSourceProviderId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.configSourceProviderType == null
                                ? 43
                                : this.configSourceProviderType.hashCode());
        return result;
    }
}
