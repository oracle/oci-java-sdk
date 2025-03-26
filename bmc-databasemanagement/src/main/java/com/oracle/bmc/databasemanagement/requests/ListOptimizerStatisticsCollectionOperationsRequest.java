/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListOptimizerStatisticsCollectionOperationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListOptimizerStatisticsCollectionOperationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListOptimizerStatisticsCollectionOperationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The start time of the time range to retrieve the optimizer statistics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    private String startTimeGreaterThanOrEqualTo;

    /**
     * The start time of the time range to retrieve the optimizer statistics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    public String getStartTimeGreaterThanOrEqualTo() {
        return startTimeGreaterThanOrEqualTo;
    }
    /**
     * The end time of the time range to retrieve the optimizer statistics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    private String endTimeLessThanOrEqualTo;

    /**
     * The end time of the time range to retrieve the optimizer statistics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    public String getEndTimeLessThanOrEqualTo() {
        return endTimeLessThanOrEqualTo;
    }
    /**
     * The filter types of the optimizer statistics tasks.
     */
    private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes taskType;

    /**
     * The filter types of the optimizer statistics tasks.
     */
    public com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes
            getTaskType() {
        return taskType;
    }
    /**
     * The maximum number of records returned in the paginated response.
     */
    private Integer limit;

    /**
     * The maximum number of records returned in the paginated response.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page from where the next set of paginated results
     * are retrieved. This is usually retrieved from a previous list call.
     *
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results
     * are retrieved. This is usually retrieved from a previous list call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The parameter used to filter the optimizer statistics operations.
     * Any property of the OptimizerStatisticsCollectionOperationSummary can be used to define the filter condition.
     * The allowed conditional operators are AND or OR, and the allowed binary operators are are >, < and =. Any other operator is regarded invalid.
     * Example: jobName=<replace with job name> AND status=<replace with status>
     *
     */
    private String filterBy;

    /**
     * The parameter used to filter the optimizer statistics operations.
     * Any property of the OptimizerStatisticsCollectionOperationSummary can be used to define the filter condition.
     * The allowed conditional operators are AND or OR, and the allowed binary operators are are >, < and =. Any other operator is regarded invalid.
     * Example: jobName=<replace with job name> AND status=<replace with status>
     *
     */
    public String getFilterBy() {
        return filterBy;
    }
    /**
     * Sorts the list of optimizer statistics operations based on a specific attribute.
     */
    private SortBy sortBy;

    /**
     * Sorts the list of optimizer statistics operations based on a specific attribute.
     **/
    public enum SortBy {
        StartTime("START_TIME"),
        EndTime("END_TIME"),
        Status("STATUS"),
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
     * Sorts the list of optimizer statistics operations based on a specific attribute.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The OCID of the Named Credential.
     */
    private String opcNamedCredentialId;

    /**
     * The OCID of the Named Credential.
     */
    public String getOpcNamedCredentialId() {
        return opcNamedCredentialId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOptimizerStatisticsCollectionOperationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The start time of the time range to retrieve the optimizer statistics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         */
        private String startTimeGreaterThanOrEqualTo = null;

        /**
         * The start time of the time range to retrieve the optimizer statistics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param startTimeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder startTimeGreaterThanOrEqualTo(String startTimeGreaterThanOrEqualTo) {
            this.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The end time of the time range to retrieve the optimizer statistics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         */
        private String endTimeLessThanOrEqualTo = null;

        /**
         * The end time of the time range to retrieve the optimizer statistics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param endTimeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder endTimeLessThanOrEqualTo(String endTimeLessThanOrEqualTo) {
            this.endTimeLessThanOrEqualTo = endTimeLessThanOrEqualTo;
            return this;
        }

        /**
         * The filter types of the optimizer statistics tasks.
         */
        private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes
                taskType = null;

        /**
         * The filter types of the optimizer statistics tasks.
         * @param taskType the value to set
         * @return this builder instance
         */
        public Builder taskType(
                com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes
                        taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * The maximum number of records returned in the paginated response.
         */
        private Integer limit = null;

        /**
         * The maximum number of records returned in the paginated response.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page from where the next set of paginated results
         * are retrieved. This is usually retrieved from a previous list call.
         *
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results
         * are retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The parameter used to filter the optimizer statistics operations.
         * Any property of the OptimizerStatisticsCollectionOperationSummary can be used to define the filter condition.
         * The allowed conditional operators are AND or OR, and the allowed binary operators are are >, < and =. Any other operator is regarded invalid.
         * Example: jobName=<replace with job name> AND status=<replace with status>
         *
         */
        private String filterBy = null;

        /**
         * The parameter used to filter the optimizer statistics operations.
         * Any property of the OptimizerStatisticsCollectionOperationSummary can be used to define the filter condition.
         * The allowed conditional operators are AND or OR, and the allowed binary operators are are >, < and =. Any other operator is regarded invalid.
         * Example: jobName=<replace with job name> AND status=<replace with status>
         *
         * @param filterBy the value to set
         * @return this builder instance
         */
        public Builder filterBy(String filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        /**
         * Sorts the list of optimizer statistics operations based on a specific attribute.
         */
        private SortBy sortBy = null;

        /**
         * Sorts the list of optimizer statistics operations based on a specific attribute.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The OCID of the Named Credential.
         */
        private String opcNamedCredentialId = null;

        /**
         * The OCID of the Named Credential.
         * @param opcNamedCredentialId the value to set
         * @return this builder instance
         */
        public Builder opcNamedCredentialId(String opcNamedCredentialId) {
            this.opcNamedCredentialId = opcNamedCredentialId;
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
        public Builder copy(ListOptimizerStatisticsCollectionOperationsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            startTimeGreaterThanOrEqualTo(o.getStartTimeGreaterThanOrEqualTo());
            endTimeLessThanOrEqualTo(o.getEndTimeLessThanOrEqualTo());
            taskType(o.getTaskType());
            limit(o.getLimit());
            page(o.getPage());
            filterBy(o.getFilterBy());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            opcNamedCredentialId(o.getOpcNamedCredentialId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListOptimizerStatisticsCollectionOperationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListOptimizerStatisticsCollectionOperationsRequest
         */
        public ListOptimizerStatisticsCollectionOperationsRequest build() {
            ListOptimizerStatisticsCollectionOperationsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOptimizerStatisticsCollectionOperationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOptimizerStatisticsCollectionOperationsRequest
         */
        public ListOptimizerStatisticsCollectionOperationsRequest buildWithoutInvocationCallback() {
            ListOptimizerStatisticsCollectionOperationsRequest request =
                    new ListOptimizerStatisticsCollectionOperationsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            request.endTimeLessThanOrEqualTo = endTimeLessThanOrEqualTo;
            request.taskType = taskType;
            request.limit = limit;
            request.page = page;
            request.filterBy = filterBy;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.opcNamedCredentialId = opcNamedCredentialId;
            return request;
            // new ListOptimizerStatisticsCollectionOperationsRequest(managedDatabaseId, startTimeGreaterThanOrEqualTo, endTimeLessThanOrEqualTo, taskType, limit, page, filterBy, sortBy, sortOrder, opcRequestId, opcNamedCredentialId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .startTimeGreaterThanOrEqualTo(startTimeGreaterThanOrEqualTo)
                .endTimeLessThanOrEqualTo(endTimeLessThanOrEqualTo)
                .taskType(taskType)
                .limit(limit)
                .page(page)
                .filterBy(filterBy)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .opcNamedCredentialId(opcNamedCredentialId);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",startTimeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.startTimeGreaterThanOrEqualTo));
        sb.append(",endTimeLessThanOrEqualTo=")
                .append(String.valueOf(this.endTimeLessThanOrEqualTo));
        sb.append(",taskType=").append(String.valueOf(this.taskType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",filterBy=").append(String.valueOf(this.filterBy));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcNamedCredentialId=").append(String.valueOf(this.opcNamedCredentialId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOptimizerStatisticsCollectionOperationsRequest)) {
            return false;
        }

        ListOptimizerStatisticsCollectionOperationsRequest other =
                (ListOptimizerStatisticsCollectionOperationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.startTimeGreaterThanOrEqualTo, other.startTimeGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.endTimeLessThanOrEqualTo, other.endTimeLessThanOrEqualTo)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.filterBy, other.filterBy)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNamedCredentialId, other.opcNamedCredentialId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeGreaterThanOrEqualTo == null
                                ? 43
                                : this.startTimeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeLessThanOrEqualTo == null
                                ? 43
                                : this.endTimeLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.taskType == null ? 43 : this.taskType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.filterBy == null ? 43 : this.filterBy.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNamedCredentialId == null
                                ? 43
                                : this.opcNamedCredentialId.hashCode());
        return result;
    }
}
