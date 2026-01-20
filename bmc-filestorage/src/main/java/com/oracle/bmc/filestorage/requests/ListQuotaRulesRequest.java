/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ListQuotaRulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListQuotaRulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class ListQuotaRulesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     */
    private String fileSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the file
     * system.
     */
    public String getFileSystemId() {
        return fileSystemId;
    }
    /** The type of the owner of this quota rule and usage. */
    private PrincipalType principalType;

    /** The type of the owner of this quota rule and usage. */
    public enum PrincipalType implements com.oracle.bmc.http.internal.BmcEnum {
        FileSystemLevel("FILE_SYSTEM_LEVEL"),
        DefaultGroup("DEFAULT_GROUP"),
        DefaultUser("DEFAULT_USER"),
        IndividualGroup("INDIVIDUAL_GROUP"),
        IndividualUser("INDIVIDUAL_USER"),
        ;

        private final String value;
        private static java.util.Map<String, PrincipalType> map;

        static {
            map = new java.util.HashMap<>();
            for (PrincipalType v : PrincipalType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PrincipalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrincipalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PrincipalType: " + key);
        }
    };

    /** The type of the owner of this quota rule and usage. */
    public PrincipalType getPrincipalType() {
        return principalType;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 4096 is the maximum.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 500}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 4096 is the maximum.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 500}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * An identifier for the user or the group associated with quota rule and usage. UNIX-like
     * operating systems use this integer value to identify a user or group to manage access
     * control.
     */
    private Integer principalId;

    /**
     * An identifier for the user or the group associated with quota rule and usage. UNIX-like
     * operating systems use this integer value to identify a user or group to manage access
     * control.
     */
    public Integer getPrincipalId() {
        return principalId;
    }
    /**
     * An option to display only the users or groups that violate their quota rules. If {@code
     * areViolatorsOnly} is false, results report all the quota and usage. If {@code
     * areViolatorsOnly} is true, results only report the quota and usage for the users or groups
     * that violate their quota rules.
     */
    private Boolean areViolatorsOnly;

    /**
     * An option to display only the users or groups that violate their quota rules. If {@code
     * areViolatorsOnly} is false, results report all the quota and usage. If {@code
     * areViolatorsOnly} is true, results only report the quota and usage for the users or groups
     * that violate their quota rules.
     */
    public Boolean getAreViolatorsOnly() {
        return areViolatorsOnly;
    }
    /**
     * The sort order to use, either 'asc' or 'desc', where 'asc' is ascending and 'desc' is
     * descending. The default order is 'desc' except for numeric values.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc', where 'asc' is ascending and 'desc' is
     * descending. The default order is 'desc' except for numeric values.
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
     * The sort order to use, either 'asc' or 'desc', where 'asc' is ascending and 'desc' is
     * descending. The default order is 'desc' except for numeric values.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListQuotaRulesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         */
        private String fileSystemId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * file system.
         *
         * @param fileSystemId the value to set
         * @return this builder instance
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /** The type of the owner of this quota rule and usage. */
        private PrincipalType principalType = null;

        /**
         * The type of the owner of this quota rule and usage.
         *
         * @param principalType the value to set
         * @return this builder instance
         */
        public Builder principalType(PrincipalType principalType) {
            this.principalType = principalType;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 4096 is the maximum.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 500}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 4096 is the maximum.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 500}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>For important details about how pagination works, see [List
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
         * An identifier for the user or the group associated with quota rule and usage. UNIX-like
         * operating systems use this integer value to identify a user or group to manage access
         * control.
         */
        private Integer principalId = null;

        /**
         * An identifier for the user or the group associated with quota rule and usage. UNIX-like
         * operating systems use this integer value to identify a user or group to manage access
         * control.
         *
         * @param principalId the value to set
         * @return this builder instance
         */
        public Builder principalId(Integer principalId) {
            this.principalId = principalId;
            return this;
        }

        /**
         * An option to display only the users or groups that violate their quota rules. If {@code
         * areViolatorsOnly} is false, results report all the quota and usage. If {@code
         * areViolatorsOnly} is true, results only report the quota and usage for the users or
         * groups that violate their quota rules.
         */
        private Boolean areViolatorsOnly = null;

        /**
         * An option to display only the users or groups that violate their quota rules. If {@code
         * areViolatorsOnly} is false, results report all the quota and usage. If {@code
         * areViolatorsOnly} is true, results only report the quota and usage for the users or
         * groups that violate their quota rules.
         *
         * @param areViolatorsOnly the value to set
         * @return this builder instance
         */
        public Builder areViolatorsOnly(Boolean areViolatorsOnly) {
            this.areViolatorsOnly = areViolatorsOnly;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc', where 'asc' is ascending and 'desc' is
         * descending. The default order is 'desc' except for numeric values.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc', where 'asc' is ascending and 'desc' is
         * descending. The default order is 'desc' except for numeric values.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(ListQuotaRulesRequest o) {
            fileSystemId(o.getFileSystemId());
            principalType(o.getPrincipalType());
            limit(o.getLimit());
            page(o.getPage());
            principalId(o.getPrincipalId());
            areViolatorsOnly(o.getAreViolatorsOnly());
            sortOrder(o.getSortOrder());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListQuotaRulesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListQuotaRulesRequest
         */
        public ListQuotaRulesRequest build() {
            ListQuotaRulesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListQuotaRulesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListQuotaRulesRequest
         */
        public ListQuotaRulesRequest buildWithoutInvocationCallback() {
            ListQuotaRulesRequest request = new ListQuotaRulesRequest();
            request.fileSystemId = fileSystemId;
            request.principalType = principalType;
            request.limit = limit;
            request.page = page;
            request.principalId = principalId;
            request.areViolatorsOnly = areViolatorsOnly;
            request.sortOrder = sortOrder;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListQuotaRulesRequest(fileSystemId, principalType, limit, page, principalId,
            // areViolatorsOnly, sortOrder, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fileSystemId(fileSystemId)
                .principalType(principalType)
                .limit(limit)
                .page(page)
                .principalId(principalId)
                .areViolatorsOnly(areViolatorsOnly)
                .sortOrder(sortOrder)
                .ifMatch(ifMatch)
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
        sb.append(",fileSystemId=").append(String.valueOf(this.fileSystemId));
        sb.append(",principalType=").append(String.valueOf(this.principalType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",principalId=").append(String.valueOf(this.principalId));
        sb.append(",areViolatorsOnly=").append(String.valueOf(this.areViolatorsOnly));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListQuotaRulesRequest)) {
            return false;
        }

        ListQuotaRulesRequest other = (ListQuotaRulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fileSystemId, other.fileSystemId)
                && java.util.Objects.equals(this.principalType, other.principalType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.principalId, other.principalId)
                && java.util.Objects.equals(this.areViolatorsOnly, other.areViolatorsOnly)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fileSystemId == null ? 43 : this.fileSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.principalType == null ? 43 : this.principalType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result =
                (result * PRIME)
                        + (this.areViolatorsOnly == null ? 43 : this.areViolatorsOnly.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
