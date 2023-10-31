/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListManagedMySqlDatabaseSqlDataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListManagedMySqlDatabaseSqlDataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListManagedMySqlDatabaseSqlDataRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the Managed MySQL Database. */
    private String managedMySqlDatabaseId;

    /** The OCID of the Managed MySQL Database. */
    public String getManagedMySqlDatabaseId() {
        return managedMySqlDatabaseId;
    }
    /**
     * The start time of the time range to retrieve the health metrics of a Managed Database in UTC
     * in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    private String startTime;

    /**
     * The start time of the time range to retrieve the health metrics of a Managed Database in UTC
     * in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * The end time of the time range to retrieve the health metrics of a Managed Database in UTC in
     * ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    private String endTime;

    /**
     * The end time of the time range to retrieve the health metrics of a Managed Database in UTC in
     * ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    public String getEndTime() {
        return endTime;
    }
    /**
     * The parameter to filter results by key criteria which include : - SUM_TIMER_WAIT - COUNT_STAR
     * - SUM_ERRORS - SUM_ROWS_AFFECTED - SUM_ROWS_SENT - SUM_ROWS_EXAMINED - SUM_CREATED_TMP_TABLES
     * - SUM_NO_INDEX_USED - SUM_NO_GOOD_INDEX_USED - FIRST_SEEN - LAST_SEEN
     */
    private String filterColumn;

    /**
     * The parameter to filter results by key criteria which include : - SUM_TIMER_WAIT - COUNT_STAR
     * - SUM_ERRORS - SUM_ROWS_AFFECTED - SUM_ROWS_SENT - SUM_ROWS_EXAMINED - SUM_CREATED_TMP_TABLES
     * - SUM_NO_INDEX_USED - SUM_NO_GOOD_INDEX_USED - FIRST_SEEN - LAST_SEEN
     */
    public String getFilterColumn() {
        return filterColumn;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The maximum number of records returned in the paginated response. */
    private Integer limit;

    /** The maximum number of records returned in the paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
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
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListManagedMySqlDatabaseSqlDataRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Managed MySQL Database. */
        private String managedMySqlDatabaseId = null;

        /**
         * The OCID of the Managed MySQL Database.
         *
         * @param managedMySqlDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedMySqlDatabaseId(String managedMySqlDatabaseId) {
            this.managedMySqlDatabaseId = managedMySqlDatabaseId;
            return this;
        }

        /**
         * The start time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        private String startTime = null;

        /**
         * The start time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param startTime the value to set
         * @return this builder instance
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The end time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        private String endTime = null;

        /**
         * The end time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param endTime the value to set
         * @return this builder instance
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The parameter to filter results by key criteria which include : - SUM_TIMER_WAIT -
         * COUNT_STAR - SUM_ERRORS - SUM_ROWS_AFFECTED - SUM_ROWS_SENT - SUM_ROWS_EXAMINED -
         * SUM_CREATED_TMP_TABLES - SUM_NO_INDEX_USED - SUM_NO_GOOD_INDEX_USED - FIRST_SEEN -
         * LAST_SEEN
         */
        private String filterColumn = null;

        /**
         * The parameter to filter results by key criteria which include : - SUM_TIMER_WAIT -
         * COUNT_STAR - SUM_ERRORS - SUM_ROWS_AFFECTED - SUM_ROWS_SENT - SUM_ROWS_EXAMINED -
         * SUM_CREATED_TMP_TABLES - SUM_NO_INDEX_USED - SUM_NO_GOOD_INDEX_USED - FIRST_SEEN -
         * LAST_SEEN
         *
         * @param filterColumn the value to set
         * @return this builder instance
         */
        public Builder filterColumn(String filterColumn) {
            this.filterColumn = filterColumn;
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

        /** The maximum number of records returned in the paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of records returned in the paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019
         * is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019
         * is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListManagedMySqlDatabaseSqlDataRequest o) {
            managedMySqlDatabaseId(o.getManagedMySqlDatabaseId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            filterColumn(o.getFilterColumn());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListManagedMySqlDatabaseSqlDataRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListManagedMySqlDatabaseSqlDataRequest
         */
        public ListManagedMySqlDatabaseSqlDataRequest build() {
            ListManagedMySqlDatabaseSqlDataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagedMySqlDatabaseSqlDataRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagedMySqlDatabaseSqlDataRequest
         */
        public ListManagedMySqlDatabaseSqlDataRequest buildWithoutInvocationCallback() {
            ListManagedMySqlDatabaseSqlDataRequest request =
                    new ListManagedMySqlDatabaseSqlDataRequest();
            request.managedMySqlDatabaseId = managedMySqlDatabaseId;
            request.startTime = startTime;
            request.endTime = endTime;
            request.filterColumn = filterColumn;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListManagedMySqlDatabaseSqlDataRequest(managedMySqlDatabaseId, startTime,
            // endTime, filterColumn, opcRequestId, limit, page, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedMySqlDatabaseId(managedMySqlDatabaseId)
                .startTime(startTime)
                .endTime(endTime)
                .filterColumn(filterColumn)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",managedMySqlDatabaseId=").append(String.valueOf(this.managedMySqlDatabaseId));
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
        sb.append(",filterColumn=").append(String.valueOf(this.filterColumn));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListManagedMySqlDatabaseSqlDataRequest)) {
            return false;
        }

        ListManagedMySqlDatabaseSqlDataRequest other = (ListManagedMySqlDatabaseSqlDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managedMySqlDatabaseId, other.managedMySqlDatabaseId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.filterColumn, other.filterColumn)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedMySqlDatabaseId == null
                                ? 43
                                : this.managedMySqlDatabaseId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.filterColumn == null ? 43 : this.filterColumn.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
