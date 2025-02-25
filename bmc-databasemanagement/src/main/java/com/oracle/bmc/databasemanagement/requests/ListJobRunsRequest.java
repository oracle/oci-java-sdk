/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListJobRunsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJobRunsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListJobRunsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * The identifier of the resource.
     */
    private String id;

    /**
     * The identifier of the resource.
     */
    public String getId() {
        return id;
    }
    /**
     * The identifier of the job.
     */
    private String jobId;

    /**
     * The identifier of the job.
     */
    public String getJobId() {
        return jobId;
    }
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     */
    private String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }
    /**
     * The status of the job run.
     */
    private String runStatus;

    /**
     * The status of the job run.
     */
    public String getRunStatus() {
        return runStatus;
    }
    /**
     * A filter to return only resources that match the entire name.
     */
    private String name;

    /**
     * A filter to return only resources that match the entire name.
     */
    public String getName() {
        return name;
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
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
     * The \u2018NAME\u2019 sort order is case-sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
     * The \u2018NAME\u2019 sort order is case-sensitive.
     *
     **/
    public enum SortBy {
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
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
     * The \u2018NAME\u2019 sort order is case-sensitive.
     *
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJobRunsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
         * The identifier of the resource.
         */
        private String id = null;

        /**
         * The identifier of the resource.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The identifier of the job.
         */
        private String jobId = null;

        /**
         * The identifier of the job.
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
         */
        private String managedDatabaseGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
         * @param managedDatabaseGroupId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            return this;
        }

        /**
         * The status of the job run.
         */
        private String runStatus = null;

        /**
         * The status of the job run.
         * @param runStatus the value to set
         * @return this builder instance
         */
        public Builder runStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }

        /**
         * A filter to return only resources that match the entire name.
         */
        private String name = null;

        /**
         * A filter to return only resources that match the entire name.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
         * The \u2018NAME\u2019 sort order is case-sensitive.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
         * The \u2018NAME\u2019 sort order is case-sensitive.
         *
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
        public Builder copy(ListJobRunsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            id(o.getId());
            jobId(o.getJobId());
            managedDatabaseId(o.getManagedDatabaseId());
            managedDatabaseGroupId(o.getManagedDatabaseGroupId());
            runStatus(o.getRunStatus());
            name(o.getName());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobRunsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobRunsRequest
         */
        public ListJobRunsRequest build() {
            ListJobRunsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJobRunsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJobRunsRequest
         */
        public ListJobRunsRequest buildWithoutInvocationCallback() {
            ListJobRunsRequest request = new ListJobRunsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.id = id;
            request.jobId = jobId;
            request.managedDatabaseId = managedDatabaseId;
            request.managedDatabaseGroupId = managedDatabaseGroupId;
            request.runStatus = runStatus;
            request.name = name;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListJobRunsRequest(compartmentId, opcRequestId, id, jobId, managedDatabaseId, managedDatabaseGroupId, runStatus, name, limit, page, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .id(id)
                .jobId(jobId)
                .managedDatabaseId(managedDatabaseId)
                .managedDatabaseGroupId(managedDatabaseGroupId)
                .runStatus(runStatus)
                .name(name)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(",runStatus=").append(String.valueOf(this.runStatus));
        sb.append(",name=").append(String.valueOf(this.name));
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
        if (!(o instanceof ListJobRunsRequest)) {
            return false;
        }

        ListJobRunsRequest other = (ListJobRunsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.runStatus, other.runStatus)
                && java.util.Objects.equals(this.name, other.name)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroupId == null
                                ? 43
                                : this.managedDatabaseGroupId.hashCode());
        result = (result * PRIME) + (this.runStatus == null ? 43 : this.runStatus.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
