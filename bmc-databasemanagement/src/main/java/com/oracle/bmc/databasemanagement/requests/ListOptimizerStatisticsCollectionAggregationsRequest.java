/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListOptimizerStatisticsCollectionAggregationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListOptimizerStatisticsCollectionAggregationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListOptimizerStatisticsCollectionAggregationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /** The optimizer statistics tasks grouped by type. */
    private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsGroupByTypes groupType;

    /** The optimizer statistics tasks grouped by type. */
    public com.oracle.bmc.databasemanagement.model.OptimizerStatisticsGroupByTypes getGroupType() {
        return groupType;
    }
    /**
     * The start time of the time range to retrieve the optimizer statistics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    private String startTimeGreaterThanOrEqualTo;

    /**
     * The start time of the time range to retrieve the optimizer statistics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    public String getStartTimeGreaterThanOrEqualTo() {
        return startTimeGreaterThanOrEqualTo;
    }
    /**
     * The end time of the time range to retrieve the optimizer statistics of a Managed Database in
     * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    private String endTimeLessThanOrEqualTo;

    /**
     * The end time of the time range to retrieve the optimizer statistics of a Managed Database in
     * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    public String getEndTimeLessThanOrEqualTo() {
        return endTimeLessThanOrEqualTo;
    }
    /** The filter types of the optimizer statistics tasks. */
    private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes taskType;

    /** The filter types of the optimizer statistics tasks. */
    public com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes
            getTaskType() {
        return taskType;
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
    /** The OCID of the Named Credential. */
    private String opcNamedCredentialId;

    /** The OCID of the Named Credential. */
    public String getOpcNamedCredentialId() {
        return opcNamedCredentialId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOptimizerStatisticsCollectionAggregationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /** The optimizer statistics tasks grouped by type. */
        private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsGroupByTypes groupType =
                null;

        /**
         * The optimizer statistics tasks grouped by type.
         *
         * @param groupType the value to set
         * @return this builder instance
         */
        public Builder groupType(
                com.oracle.bmc.databasemanagement.model.OptimizerStatisticsGroupByTypes groupType) {
            this.groupType = groupType;
            return this;
        }

        /**
         * The start time of the time range to retrieve the optimizer statistics of a Managed
         * Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        private String startTimeGreaterThanOrEqualTo = null;

        /**
         * The start time of the time range to retrieve the optimizer statistics of a Managed
         * Database in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
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

        /** The filter types of the optimizer statistics tasks. */
        private com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes
                taskType = null;

        /**
         * The filter types of the optimizer statistics tasks.
         *
         * @param taskType the value to set
         * @return this builder instance
         */
        public Builder taskType(
                com.oracle.bmc.databasemanagement.model.OptimizerStatisticsTaskFilterTypes
                        taskType) {
            this.taskType = taskType;
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

        /** The OCID of the Named Credential. */
        private String opcNamedCredentialId = null;

        /**
         * The OCID of the Named Credential.
         *
         * @param opcNamedCredentialId the value to set
         * @return this builder instance
         */
        public Builder opcNamedCredentialId(String opcNamedCredentialId) {
            this.opcNamedCredentialId = opcNamedCredentialId;
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
        public Builder copy(ListOptimizerStatisticsCollectionAggregationsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            groupType(o.getGroupType());
            startTimeGreaterThanOrEqualTo(o.getStartTimeGreaterThanOrEqualTo());
            endTimeLessThanOrEqualTo(o.getEndTimeLessThanOrEqualTo());
            taskType(o.getTaskType());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            opcNamedCredentialId(o.getOpcNamedCredentialId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListOptimizerStatisticsCollectionAggregationsRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListOptimizerStatisticsCollectionAggregationsRequest
         */
        public ListOptimizerStatisticsCollectionAggregationsRequest build() {
            ListOptimizerStatisticsCollectionAggregationsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOptimizerStatisticsCollectionAggregationsRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOptimizerStatisticsCollectionAggregationsRequest
         */
        public ListOptimizerStatisticsCollectionAggregationsRequest
                buildWithoutInvocationCallback() {
            ListOptimizerStatisticsCollectionAggregationsRequest request =
                    new ListOptimizerStatisticsCollectionAggregationsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.groupType = groupType;
            request.startTimeGreaterThanOrEqualTo = startTimeGreaterThanOrEqualTo;
            request.endTimeLessThanOrEqualTo = endTimeLessThanOrEqualTo;
            request.taskType = taskType;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.opcNamedCredentialId = opcNamedCredentialId;
            return request;
            // new ListOptimizerStatisticsCollectionAggregationsRequest(managedDatabaseId,
            // groupType, startTimeGreaterThanOrEqualTo, endTimeLessThanOrEqualTo, taskType,
            // opcRequestId, limit, page, opcNamedCredentialId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .groupType(groupType)
                .startTimeGreaterThanOrEqualTo(startTimeGreaterThanOrEqualTo)
                .endTimeLessThanOrEqualTo(endTimeLessThanOrEqualTo)
                .taskType(taskType)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .opcNamedCredentialId(opcNamedCredentialId);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",groupType=").append(String.valueOf(this.groupType));
        sb.append(",startTimeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.startTimeGreaterThanOrEqualTo));
        sb.append(",endTimeLessThanOrEqualTo=")
                .append(String.valueOf(this.endTimeLessThanOrEqualTo));
        sb.append(",taskType=").append(String.valueOf(this.taskType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcNamedCredentialId=").append(String.valueOf(this.opcNamedCredentialId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOptimizerStatisticsCollectionAggregationsRequest)) {
            return false;
        }

        ListOptimizerStatisticsCollectionAggregationsRequest other =
                (ListOptimizerStatisticsCollectionAggregationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.groupType, other.groupType)
                && java.util.Objects.equals(
                        this.startTimeGreaterThanOrEqualTo, other.startTimeGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.endTimeLessThanOrEqualTo, other.endTimeLessThanOrEqualTo)
                && java.util.Objects.equals(this.taskType, other.taskType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcNamedCredentialId, other.opcNamedCredentialId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result = (result * PRIME) + (this.groupType == null ? 43 : this.groupType.hashCode());
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
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNamedCredentialId == null
                                ? 43
                                : this.opcNamedCredentialId.hashCode());
        return result;
    }
}
