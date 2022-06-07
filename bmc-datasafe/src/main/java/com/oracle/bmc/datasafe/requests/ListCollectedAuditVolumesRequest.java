/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListCollectedAuditVolumesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCollectedAuditVolumesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListCollectedAuditVolumesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the audit.
     */
    private String auditProfileId;

    public String getAuditProfileId() {
        return auditProfileId;
    }
    /**
     * The OCID of the work request.
     */
    private String workRequestId;

    public String getWorkRequestId() {
        return workRequestId;
    }
    /**
     * Specifying {@code monthInConsiderationGreaterThan} parameter
     * will retrieve all items for which the event month is
     * greater than the date and time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T00:00:00.000Z
     *
     */
    private java.util.Date monthInConsiderationGreaterThan;

    public java.util.Date getMonthInConsiderationGreaterThan() {
        return monthInConsiderationGreaterThan;
    }
    /**
     * Specifying {@code monthInConsiderationLessThan} parameter
     * will retrieve all items for which the event month is
     * less than the date and time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T00:00:00.000Z
     *
     */
    private java.util.Date monthInConsiderationLessThan;

    public java.util.Date getMonthInConsiderationLessThan() {
        return monthInConsiderationLessThan;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     **/
    public enum SortOrder {
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

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for all fields is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for all fields is ascending.
     *
     **/
    public enum SortBy {
        MonthInConsideration("monthInConsideration"),
        OnlineVolume("onlineVolume"),
        ArchivedVolume("archivedVolume"),
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

    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCollectedAuditVolumesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String auditProfileId = null;

        /**
         * The OCID of the audit.
         * @return this builder instance
         */
        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            return this;
        }

        private String workRequestId = null;

        /**
         * The OCID of the work request.
         * @return this builder instance
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            return this;
        }

        private java.util.Date monthInConsiderationGreaterThan = null;

        /**
         * Specifying {@code monthInConsiderationGreaterThan} parameter
         * will retrieve all items for which the event month is
         * greater than the date and time specified,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         **Example:** 2016-12-19T00:00:00.000Z
         *
         * @return this builder instance
         */
        public Builder monthInConsiderationGreaterThan(
                java.util.Date monthInConsiderationGreaterThan) {
            this.monthInConsiderationGreaterThan = monthInConsiderationGreaterThan;
            return this;
        }

        private java.util.Date monthInConsiderationLessThan = null;

        /**
         * Specifying {@code monthInConsiderationLessThan} parameter
         * will retrieve all items for which the event month is
         * less than the date and time specified,
         * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         **Example:** 2016-12-19T00:00:00.000Z
         *
         * @return this builder instance
         */
        public Builder monthInConsiderationLessThan(java.util.Date monthInConsiderationLessThan) {
            this.monthInConsiderationLessThan = monthInConsiderationLessThan;
            return this;
        }

        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order(sortOrder). The default order for all fields is ascending.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListCollectedAuditVolumesRequest o) {
            auditProfileId(o.getAuditProfileId());
            workRequestId(o.getWorkRequestId());
            monthInConsiderationGreaterThan(o.getMonthInConsiderationGreaterThan());
            monthInConsiderationLessThan(o.getMonthInConsiderationLessThan());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCollectedAuditVolumesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCollectedAuditVolumesRequest
         */
        public ListCollectedAuditVolumesRequest build() {
            ListCollectedAuditVolumesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCollectedAuditVolumesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCollectedAuditVolumesRequest
         */
        public ListCollectedAuditVolumesRequest buildWithoutInvocationCallback() {
            ListCollectedAuditVolumesRequest request = new ListCollectedAuditVolumesRequest();
            request.auditProfileId = auditProfileId;
            request.workRequestId = workRequestId;
            request.monthInConsiderationGreaterThan = monthInConsiderationGreaterThan;
            request.monthInConsiderationLessThan = monthInConsiderationLessThan;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCollectedAuditVolumesRequest(auditProfileId, workRequestId, monthInConsiderationGreaterThan, monthInConsiderationLessThan, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .auditProfileId(auditProfileId)
                .workRequestId(workRequestId)
                .monthInConsiderationGreaterThan(monthInConsiderationGreaterThan)
                .monthInConsiderationLessThan(monthInConsiderationLessThan)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(",workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(",monthInConsiderationGreaterThan=")
                .append(String.valueOf(this.monthInConsiderationGreaterThan));
        sb.append(",monthInConsiderationLessThan=")
                .append(String.valueOf(this.monthInConsiderationLessThan));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCollectedAuditVolumesRequest)) {
            return false;
        }

        ListCollectedAuditVolumesRequest other = (ListCollectedAuditVolumesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(
                        this.monthInConsiderationGreaterThan, other.monthInConsiderationGreaterThan)
                && java.util.Objects.equals(
                        this.monthInConsiderationLessThan, other.monthInConsiderationLessThan)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.monthInConsiderationGreaterThan == null
                                ? 43
                                : this.monthInConsiderationGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.monthInConsiderationLessThan == null
                                ? 43
                                : this.monthInConsiderationLessThan.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
