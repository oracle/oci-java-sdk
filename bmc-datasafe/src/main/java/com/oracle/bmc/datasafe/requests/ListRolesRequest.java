/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListRolesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRolesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListRolesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the Data Safe target database. */
    private String targetDatabaseId;

    /** The OCID of the Data Safe target database. */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** A filter to return only a specific role based on role name. */
    private java.util.List<String> roleName;

    /** A filter to return only a specific role based on role name. */
    public java.util.List<String> getRoleName() {
        return roleName;
    }
    /** A filter to return roles based on whether they are maintained by oracle or not. */
    private Boolean isOracleMaintained;

    /** A filter to return roles based on whether they are maintained by oracle or not. */
    public Boolean getIsOracleMaintained() {
        return isOracleMaintained;
    }
    /** A filter to return roles based on authentication type. */
    private String authenticationType;

    /** A filter to return roles based on authentication type. */
    public String getAuthenticationType() {
        return authenticationType;
    }
    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
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

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
    private SortBy sortBy;

    /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Rolename("ROLENAME"),
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

    /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only items if role name contains a specific string. */
    private String roleNameContains;

    /** A filter to return only items if role name contains a specific string. */
    public String getRoleNameContains() {
        return roleNameContains;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRolesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Data Safe target database. */
        private String targetDatabaseId = null;

        /**
         * The OCID of the Data Safe target database.
         *
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
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
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** A filter to return only a specific role based on role name. */
        private java.util.List<String> roleName = null;

        /**
         * A filter to return only a specific role based on role name.
         *
         * @param roleName the value to set
         * @return this builder instance
         */
        public Builder roleName(java.util.List<String> roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * Singular setter. A filter to return only a specific role based on role name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder roleName(String singularValue) {
            return this.roleName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return roles based on whether they are maintained by oracle or not. */
        private Boolean isOracleMaintained = null;

        /**
         * A filter to return roles based on whether they are maintained by oracle or not.
         *
         * @param isOracleMaintained the value to set
         * @return this builder instance
         */
        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            this.isOracleMaintained = isOracleMaintained;
            return this;
        }

        /** A filter to return roles based on authentication type. */
        private String authenticationType = null;

        /**
         * A filter to return roles based on authentication type.
         *
         * @param authenticationType the value to set
         * @return this builder instance
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        /** The sort order to use, either ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
        private SortBy sortBy = null;

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A filter to return only items if role name contains a specific string. */
        private String roleNameContains = null;

        /**
         * A filter to return only items if role name contains a specific string.
         *
         * @param roleNameContains the value to set
         * @return this builder instance
         */
        public Builder roleNameContains(String roleNameContains) {
            this.roleNameContains = roleNameContains;
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
        public Builder copy(ListRolesRequest o) {
            targetDatabaseId(o.getTargetDatabaseId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            roleName(o.getRoleName());
            isOracleMaintained(o.getIsOracleMaintained());
            authenticationType(o.getAuthenticationType());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            roleNameContains(o.getRoleNameContains());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRolesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRolesRequest
         */
        public ListRolesRequest build() {
            ListRolesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRolesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRolesRequest
         */
        public ListRolesRequest buildWithoutInvocationCallback() {
            ListRolesRequest request = new ListRolesRequest();
            request.targetDatabaseId = targetDatabaseId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.roleName = roleName;
            request.isOracleMaintained = isOracleMaintained;
            request.authenticationType = authenticationType;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.roleNameContains = roleNameContains;
            return request;
            // new ListRolesRequest(targetDatabaseId, opcRequestId, limit, page, roleName,
            // isOracleMaintained, authenticationType, sortOrder, sortBy, roleNameContains);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetDatabaseId(targetDatabaseId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .roleName(roleName)
                .isOracleMaintained(isOracleMaintained)
                .authenticationType(authenticationType)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .roleNameContains(roleNameContains);
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
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",roleName=").append(String.valueOf(this.roleName));
        sb.append(",isOracleMaintained=").append(String.valueOf(this.isOracleMaintained));
        sb.append(",authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",roleNameContains=").append(String.valueOf(this.roleNameContains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRolesRequest)) {
            return false;
        }

        ListRolesRequest other = (ListRolesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.roleName, other.roleName)
                && java.util.Objects.equals(this.isOracleMaintained, other.isOracleMaintained)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.roleNameContains, other.roleNameContains);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.roleName == null ? 43 : this.roleName.hashCode());
        result =
                (result * PRIME)
                        + (this.isOracleMaintained == null
                                ? 43
                                : this.isOracleMaintained.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.roleNameContains == null ? 43 : this.roleNameContains.hashCode());
        return result;
    }
}
