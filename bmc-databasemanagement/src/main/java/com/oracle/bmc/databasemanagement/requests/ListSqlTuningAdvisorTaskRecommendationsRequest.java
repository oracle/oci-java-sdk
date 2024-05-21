/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTaskRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSqlTuningAdvisorTaskRecommendationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListSqlTuningAdvisorTaskRecommendationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private Long sqlTuningAdvisorTaskId;

    /**
     * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public Long getSqlTuningAdvisorTaskId() {
        return sqlTuningAdvisorTaskId;
    }
    /**
     * The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private Long sqlObjectId;

    /**
     * The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public Long getSqlObjectId() {
        return sqlObjectId;
    }
    /**
     * The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     */
    private Long executionId;

    /**
     * The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     */
    public Long getExecutionId() {
        return executionId;
    }
    /**
     * The possible sortBy values of an object's recommendations.
     */
    private SortBy sortBy;

    /**
     * The possible sortBy values of an object's recommendations.
     **/
    public enum SortBy {
        RecommendationType("RECOMMENDATION_TYPE"),
        Benefit("BENEFIT"),
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
     * The possible sortBy values of an object's recommendations.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Descending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Descending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
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
                    ListSqlTuningAdvisorTaskRecommendationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private Long sqlTuningAdvisorTaskId = null;

        /**
         * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param sqlTuningAdvisorTaskId the value to set
         * @return this builder instance
         */
        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            return this;
        }

        /**
         * The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private Long sqlObjectId = null;

        /**
         * The SQL object ID for the SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param sqlObjectId the value to set
         * @return this builder instance
         */
        public Builder sqlObjectId(Long sqlObjectId) {
            this.sqlObjectId = sqlObjectId;
            return this;
        }

        /**
         * The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         */
        private Long executionId = null;

        /**
         * The execution ID for an execution of a SQL tuning task. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param executionId the value to set
         * @return this builder instance
         */
        public Builder executionId(Long executionId) {
            this.executionId = executionId;
            return this;
        }

        /**
         * The possible sortBy values of an object's recommendations.
         */
        private SortBy sortBy = null;

        /**
         * The possible sortBy values of an object's recommendations.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Descending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Descending order is the default order.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListSqlTuningAdvisorTaskRecommendationsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            sqlTuningAdvisorTaskId(o.getSqlTuningAdvisorTaskId());
            sqlObjectId(o.getSqlObjectId());
            executionId(o.getExecutionId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            opcNamedCredentialId(o.getOpcNamedCredentialId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSqlTuningAdvisorTaskRecommendationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSqlTuningAdvisorTaskRecommendationsRequest
         */
        public ListSqlTuningAdvisorTaskRecommendationsRequest build() {
            ListSqlTuningAdvisorTaskRecommendationsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSqlTuningAdvisorTaskRecommendationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSqlTuningAdvisorTaskRecommendationsRequest
         */
        public ListSqlTuningAdvisorTaskRecommendationsRequest buildWithoutInvocationCallback() {
            ListSqlTuningAdvisorTaskRecommendationsRequest request =
                    new ListSqlTuningAdvisorTaskRecommendationsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            request.sqlObjectId = sqlObjectId;
            request.executionId = executionId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            request.opcNamedCredentialId = opcNamedCredentialId;
            return request;
            // new ListSqlTuningAdvisorTaskRecommendationsRequest(managedDatabaseId, sqlTuningAdvisorTaskId, sqlObjectId, executionId, sortBy, sortOrder, page, limit, opcRequestId, opcNamedCredentialId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .sqlTuningAdvisorTaskId(sqlTuningAdvisorTaskId)
                .sqlObjectId(sqlObjectId)
                .executionId(executionId)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .page(page)
                .limit(limit)
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
        sb.append(",sqlTuningAdvisorTaskId=").append(String.valueOf(this.sqlTuningAdvisorTaskId));
        sb.append(",sqlObjectId=").append(String.valueOf(this.sqlObjectId));
        sb.append(",executionId=").append(String.valueOf(this.executionId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
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
        if (!(o instanceof ListSqlTuningAdvisorTaskRecommendationsRequest)) {
            return false;
        }

        ListSqlTuningAdvisorTaskRecommendationsRequest other =
                (ListSqlTuningAdvisorTaskRecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.sqlTuningAdvisorTaskId, other.sqlTuningAdvisorTaskId)
                && java.util.Objects.equals(this.sqlObjectId, other.sqlObjectId)
                && java.util.Objects.equals(this.executionId, other.executionId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
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
                        + (this.sqlTuningAdvisorTaskId == null
                                ? 43
                                : this.sqlTuningAdvisorTaskId.hashCode());
        result = (result * PRIME) + (this.sqlObjectId == null ? 43 : this.sqlObjectId.hashCode());
        result = (result * PRIME) + (this.executionId == null ? 43 : this.executionId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNamedCredentialId == null
                                ? 43
                                : this.opcNamedCredentialId.hashCode());
        return result;
    }
}
