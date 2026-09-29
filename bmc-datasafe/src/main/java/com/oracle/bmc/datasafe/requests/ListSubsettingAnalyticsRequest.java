/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSubsettingAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListSubsettingAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSubsettingAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** Attribute by which the subsetting analytics data should be grouped. */
    private GroupBy groupBy;

    /** Attribute by which the subsetting analytics data should be grouped. */
    public enum GroupBy implements com.oracle.bmc.http.internal.BmcEnum {
        TargetId("targetId"),
        PolicyId("policyId"),
        TargetIdAndPolicyId("targetIdAndPolicyId"),
        ;

        private final String value;
        private static java.util.Map<String, GroupBy> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupBy v : GroupBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        GroupBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GroupBy: " + key);
        }
    };

    /** Attribute by which the subsetting analytics data should be grouped. */
    public GroupBy getGroupBy() {
        return groupBy;
    }
    /** A filter to return only items related to a specific target OCID. */
    private String targetId;

    /** A filter to return only items related to a specific target OCID. */
    public String getTargetId() {
        return targetId;
    }
    /** A filter to return only the resources that match the specified subsetting policy OCID. */
    private String subsettingPolicyId;

    /** A filter to return only the resources that match the specified subsetting policy OCID. */
    public String getSubsettingPolicyId() {
        return subsettingPolicyId;
    }
    /** A filter to return the target database group that matches the specified OCID. */
    private String targetDatabaseGroupId;

    /** A filter to return the target database group that matches the specified OCID. */
    public String getTargetDatabaseGroupId() {
        return targetDatabaseGroupId;
    }
    /**
     * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
     * order for all the fields is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
     * order for all the fields is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeLastSubsetted("timeLastSubsetted"),
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
     * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
     * order for all the fields is ascending.
     */
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
    /**
     * A filter to return only the resources that were created after the specified date and time, as
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
     * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
     * that date.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * A filter to return only the resources that were created after the specified date and time, as
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
     * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
     * that date.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /**
     * Search for resources that were created before a specific date. Specifying this parameter
     * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * Search for resources that were created before a specific date. Specifying this parameter
     * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSubsettingAnalyticsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A filter to return only resources that match the specified compartment OCID. */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /** Attribute by which the subsetting analytics data should be grouped. */
        private GroupBy groupBy = null;

        /**
         * Attribute by which the subsetting analytics data should be grouped.
         *
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /** A filter to return only items related to a specific target OCID. */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /**
         * A filter to return only the resources that match the specified subsetting policy OCID.
         */
        private String subsettingPolicyId = null;

        /**
         * A filter to return only the resources that match the specified subsetting policy OCID.
         *
         * @param subsettingPolicyId the value to set
         * @return this builder instance
         */
        public Builder subsettingPolicyId(String subsettingPolicyId) {
            this.subsettingPolicyId = subsettingPolicyId;
            return this;
        }

        /** A filter to return the target database group that matches the specified OCID. */
        private String targetDatabaseGroupId = null;

        /**
         * A filter to return the target database group that matches the specified OCID.
         *
         * @param targetDatabaseGroupId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseGroupId(String targetDatabaseGroupId) {
            this.targetDatabaseGroupId = targetDatabaseGroupId;
            return this;
        }

        /**
         * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
         * order for all the fields is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
         * order for all the fields is ascending.
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

        /**
         * A filter to return only the resources that were created after the specified date and
         * time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
         * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
         * that date.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter to return only the resources that were created after the specified date and
         * time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
         * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
         * that date.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Search for resources that were created before a specific date. Specifying this parameter
         * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * Search for resources that were created before a specific date. Specifying this parameter
         * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListSubsettingAnalyticsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            groupBy(o.getGroupBy());
            targetId(o.getTargetId());
            subsettingPolicyId(o.getSubsettingPolicyId());
            targetDatabaseGroupId(o.getTargetDatabaseGroupId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSubsettingAnalyticsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSubsettingAnalyticsRequest
         */
        public ListSubsettingAnalyticsRequest build() {
            ListSubsettingAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSubsettingAnalyticsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSubsettingAnalyticsRequest
         */
        public ListSubsettingAnalyticsRequest buildWithoutInvocationCallback() {
            ListSubsettingAnalyticsRequest request = new ListSubsettingAnalyticsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.groupBy = groupBy;
            request.targetId = targetId;
            request.subsettingPolicyId = subsettingPolicyId;
            request.targetDatabaseGroupId = targetDatabaseGroupId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSubsettingAnalyticsRequest(compartmentId, compartmentIdInSubtree, groupBy,
            // targetId, subsettingPolicyId, targetDatabaseGroupId, sortBy, sortOrder,
            // timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan, limit, page, opcRequestId);
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
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .groupBy(groupBy)
                .targetId(targetId)
                .subsettingPolicyId(subsettingPolicyId)
                .targetDatabaseGroupId(targetDatabaseGroupId)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan)
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",subsettingPolicyId=").append(String.valueOf(this.subsettingPolicyId));
        sb.append(",targetDatabaseGroupId=").append(String.valueOf(this.targetDatabaseGroupId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
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
        if (!(o instanceof ListSubsettingAnalyticsRequest)) {
            return false;
        }

        ListSubsettingAnalyticsRequest other = (ListSubsettingAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.subsettingPolicyId, other.subsettingPolicyId)
                && java.util.Objects.equals(this.targetDatabaseGroupId, other.targetDatabaseGroupId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
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
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.subsettingPolicyId == null
                                ? 43
                                : this.subsettingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseGroupId == null
                                ? 43
                                : this.targetDatabaseGroupId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
