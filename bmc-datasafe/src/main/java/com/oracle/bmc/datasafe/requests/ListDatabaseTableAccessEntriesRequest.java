/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDatabaseTableAccessEntriesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDatabaseTableAccessEntriesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListDatabaseTableAccessEntriesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security policy report resource. */
    private String securityPolicyReportId;

    /** The OCID of the security policy report resource. */
    public String getSecurityPolicyReportId() {
        return securityPolicyReportId;
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
    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in
     * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
     * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM
     * filtering expressions, text, date, and time values must be enclosed in quotation marks, with
     * date and time values using ISO-8601 format. (Numeric and boolean values should not be
     * quoted.)
     *
     * <p>*Example:** query=(accessType eq 'SELECT') and (grantee eq 'ADMIN')
     */
    private String scimQuery;

    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in
     * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
     * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM
     * filtering expressions, text, date, and time values must be enclosed in quotation marks, with
     * date and time values using ISO-8601 format. (Numeric and boolean values should not be
     * quoted.)
     *
     * <p>*Example:** query=(accessType eq 'SELECT') and (grantee eq 'ADMIN')
     */
    public String getScimQuery() {
        return scimQuery;
    }
    /** The field to sort by. Only one sort parameter should be provided. */
    private SortBy sortBy;

    /** The field to sort by. Only one sort parameter should be provided. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Key("key"),
        Grantee("grantee"),
        AccessType("accessType"),
        TableSchema("tableSchema"),
        TableName("tableName"),
        PrivilegeType("privilegeType"),
        Privilege("privilege"),
        PrivilegeGrantable("privilegeGrantable"),
        GrantFromRole("grantFromRole"),
        AccessThroughObject("accessThroughObject"),
        ColumnName("columnName"),
        Grantor("grantor"),
        AreAllTablesAccessible("areAllTablesAccessible"),
        IsAccessConstrainedByView("isAccessConstrainedByView"),
        IsAccessConstrainedByLabelSecurity("isAccessConstrainedByLabelSecurity"),
        IsAccessConstrainedByDatabaseVault("isAccessConstrainedByDatabaseVault"),
        IsAccessConstrainedByVirtualPrivateDatabase("isAccessConstrainedByVirtualPrivateDatabase"),
        IsAccessConstrainedByRedaction("isAccessConstrainedByRedaction"),
        IsAccessConstrainedByRealApplicationSecurity(
                "isAccessConstrainedByRealApplicationSecurity"),
        IsAccessConstrainedBySqlFirewall("isAccessConstrainedBySqlFirewall"),
        IsSensitive("isSensitive"),
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

    /** The field to sort by. Only one sort parameter should be provided. */
    public SortBy getSortBy() {
        return sortBy;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDatabaseTableAccessEntriesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the security policy report resource. */
        private String securityPolicyReportId = null;

        /**
         * The OCID of the security policy report resource.
         *
         * @param securityPolicyReportId the value to set
         * @return this builder instance
         */
        public Builder securityPolicyReportId(String securityPolicyReportId) {
            this.securityPolicyReportId = securityPolicyReportId;
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

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in
         * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
         * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In
         * SCIM filtering expressions, text, date, and time values must be enclosed in quotation
         * marks, with date and time values using ISO-8601 format. (Numeric and boolean values
         * should not be quoted.)
         *
         * <p>*Example:** query=(accessType eq 'SELECT') and (grantee eq 'ADMIN')
         */
        private String scimQuery = null;

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in
         * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
         * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In
         * SCIM filtering expressions, text, date, and time values must be enclosed in quotation
         * marks, with date and time values using ISO-8601 format. (Numeric and boolean values
         * should not be quoted.)
         *
         * <p>*Example:** query=(accessType eq 'SELECT') and (grantee eq 'ADMIN')
         *
         * @param scimQuery the value to set
         * @return this builder instance
         */
        public Builder scimQuery(String scimQuery) {
            this.scimQuery = scimQuery;
            return this;
        }

        /** The field to sort by. Only one sort parameter should be provided. */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort parameter should be provided.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListDatabaseTableAccessEntriesRequest o) {
            securityPolicyReportId(o.getSecurityPolicyReportId());
            limit(o.getLimit());
            page(o.getPage());
            scimQuery(o.getScimQuery());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDatabaseTableAccessEntriesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDatabaseTableAccessEntriesRequest
         */
        public ListDatabaseTableAccessEntriesRequest build() {
            ListDatabaseTableAccessEntriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDatabaseTableAccessEntriesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDatabaseTableAccessEntriesRequest
         */
        public ListDatabaseTableAccessEntriesRequest buildWithoutInvocationCallback() {
            ListDatabaseTableAccessEntriesRequest request =
                    new ListDatabaseTableAccessEntriesRequest();
            request.securityPolicyReportId = securityPolicyReportId;
            request.limit = limit;
            request.page = page;
            request.scimQuery = scimQuery;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDatabaseTableAccessEntriesRequest(securityPolicyReportId, limit, page,
            // scimQuery, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityPolicyReportId(securityPolicyReportId)
                .limit(limit)
                .page(page)
                .scimQuery(scimQuery)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",securityPolicyReportId=").append(String.valueOf(this.securityPolicyReportId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",scimQuery=").append(String.valueOf(this.scimQuery));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabaseTableAccessEntriesRequest)) {
            return false;
        }

        ListDatabaseTableAccessEntriesRequest other = (ListDatabaseTableAccessEntriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.securityPolicyReportId, other.securityPolicyReportId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.scimQuery, other.scimQuery)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityPolicyReportId == null
                                ? 43
                                : this.securityPolicyReportId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.scimQuery == null ? 43 : this.scimQuery.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
