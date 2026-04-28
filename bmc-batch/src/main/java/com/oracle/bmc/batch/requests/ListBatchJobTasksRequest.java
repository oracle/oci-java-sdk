/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.requests;

import com.oracle.bmc.batch.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ListBatchJobTasksExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBatchJobTasksRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class ListBatchJobTasksRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch job.
     */
    private String batchJobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch job.
     */
    public String getBatchJobId() {
        return batchJobId;
    }
    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.batch.model.BatchTask.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.batch.model.BatchTask.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The hierarchical name of the batch task. Mutually exclusive with the task id query parameter:
     * you can't pass both.
     */
    private String name;

    /**
     * The hierarchical name of the batch task. Mutually exclusive with the task id query parameter:
     * you can't pass both.
     */
    public String getName() {
        return name;
    }
    /**
     * The UUID of the batch task. Mutually exclusive with the task name and group task name query
     * parameters: you can't pass both.
     */
    private String taskId;

    /**
     * The UUID of the batch task. Mutually exclusive with the task name and group task name query
     * parameters: you can't pass both.
     */
    public String getTaskId() {
        return taskId;
    }
    /**
     * Hierarchical name of the group task. A filter to return only tasks contained within the
     * selected group task. Omit to return top-level tasks only. Can be combined with task name
     * query parameter, in which case task name becomes a hierarchical name relative to the selected
     * group task, e.g. ?groupTaskName=A.B&taskName=C.D is equal to ?taskName=A.B.C.D. Mutually
     * exclusive with the task id query parameter: you can't pass both.
     */
    private String groupTaskName;

    /**
     * Hierarchical name of the group task. A filter to return only tasks contained within the
     * selected group task. Omit to return top-level tasks only. Can be combined with task name
     * query parameter, in which case task name becomes a hierarchical name relative to the selected
     * group task, e.g. ?groupTaskName=A.B&taskName=C.D is equal to ?taskName=A.B.C.D. Mutually
     * exclusive with the task id query parameter: you can't pass both.
     */
    public String getGroupTaskName() {
        return groupTaskName;
    }
    /** Filter tasks by type. Valid values are: COMPUTE, GROUP. */
    private com.oracle.bmc.batch.model.BatchTask.Type type;

    /** Filter tasks by type. Valid values are: COMPUTE, GROUP. */
    public com.oracle.bmc.batch.model.BatchTask.Type getType() {
        return type;
    }
    /**
     * Defines the hierarchical scope of the tasks to be returned. When set to SHALLOW, which is
     * default, only tasks contained directly (non-recursively) within current hierarchy entry are
     * returned. When set to DEEP, tasks contained within current hierarchy entry and all its
     * descendants recursively are returned. The default hierarchy entry is root, i.e. batch job
     * itself. To use a different hierarchy entry, provide the group task name as a query parameter.
     * The specified group task becomes the entry point instead of the batch job.
     */
    private com.oracle.bmc.batch.model.BatchTaskHierarchyView hierarchyView;

    /**
     * Defines the hierarchical scope of the tasks to be returned. When set to SHALLOW, which is
     * default, only tasks contained directly (non-recursively) within current hierarchy entry are
     * returned. When set to DEEP, tasks contained within current hierarchy entry and all its
     * descendants recursively are returned. The default hierarchy entry is root, i.e. batch job
     * itself. To use a different hierarchy entry, provide the group task name as a query parameter.
     * The specified group task becomes the entry point instead of the batch job.
     */
    public com.oracle.bmc.batch.model.BatchTaskHierarchyView getHierarchyView() {
        return hierarchyView;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.batch.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.batch.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide only one sort order. Default order for {@code name} is
     * ascending.
     */
    private com.oracle.bmc.batch.model.BatchTaskSortBy sortBy;

    /**
     * The field to sort by. You can provide only one sort order. Default order for {@code name} is
     * ascending.
     */
    public com.oracle.bmc.batch.model.BatchTaskSortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBatchJobTasksRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch job.
         */
        private String batchJobId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch job.
         *
         * @param batchJobId the value to set
         * @return this builder instance
         */
        public Builder batchJobId(String batchJobId) {
            this.batchJobId = batchJobId;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.batch.model.BatchTask.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.batch.model.BatchTask.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The hierarchical name of the batch task. Mutually exclusive with the task id query
         * parameter: you can't pass both.
         */
        private String name = null;

        /**
         * The hierarchical name of the batch task. Mutually exclusive with the task id query
         * parameter: you can't pass both.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The UUID of the batch task. Mutually exclusive with the task name and group task name
         * query parameters: you can't pass both.
         */
        private String taskId = null;

        /**
         * The UUID of the batch task. Mutually exclusive with the task name and group task name
         * query parameters: you can't pass both.
         *
         * @param taskId the value to set
         * @return this builder instance
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * Hierarchical name of the group task. A filter to return only tasks contained within the
         * selected group task. Omit to return top-level tasks only. Can be combined with task name
         * query parameter, in which case task name becomes a hierarchical name relative to the
         * selected group task, e.g. ?groupTaskName=A.B&taskName=C.D is equal to ?taskName=A.B.C.D.
         * Mutually exclusive with the task id query parameter: you can't pass both.
         */
        private String groupTaskName = null;

        /**
         * Hierarchical name of the group task. A filter to return only tasks contained within the
         * selected group task. Omit to return top-level tasks only. Can be combined with task name
         * query parameter, in which case task name becomes a hierarchical name relative to the
         * selected group task, e.g. ?groupTaskName=A.B&taskName=C.D is equal to ?taskName=A.B.C.D.
         * Mutually exclusive with the task id query parameter: you can't pass both.
         *
         * @param groupTaskName the value to set
         * @return this builder instance
         */
        public Builder groupTaskName(String groupTaskName) {
            this.groupTaskName = groupTaskName;
            return this;
        }

        /** Filter tasks by type. Valid values are: COMPUTE, GROUP. */
        private com.oracle.bmc.batch.model.BatchTask.Type type = null;

        /**
         * Filter tasks by type. Valid values are: COMPUTE, GROUP.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.batch.model.BatchTask.Type type) {
            this.type = type;
            return this;
        }

        /**
         * Defines the hierarchical scope of the tasks to be returned. When set to SHALLOW, which is
         * default, only tasks contained directly (non-recursively) within current hierarchy entry
         * are returned. When set to DEEP, tasks contained within current hierarchy entry and all
         * its descendants recursively are returned. The default hierarchy entry is root, i.e. batch
         * job itself. To use a different hierarchy entry, provide the group task name as a query
         * parameter. The specified group task becomes the entry point instead of the batch job.
         */
        private com.oracle.bmc.batch.model.BatchTaskHierarchyView hierarchyView = null;

        /**
         * Defines the hierarchical scope of the tasks to be returned. When set to SHALLOW, which is
         * default, only tasks contained directly (non-recursively) within current hierarchy entry
         * are returned. When set to DEEP, tasks contained within current hierarchy entry and all
         * its descendants recursively are returned. The default hierarchy entry is root, i.e. batch
         * job itself. To use a different hierarchy entry, provide the group task name as a query
         * parameter. The specified group task becomes the entry point instead of the batch job.
         *
         * @param hierarchyView the value to set
         * @return this builder instance
         */
        public Builder hierarchyView(
                com.oracle.bmc.batch.model.BatchTaskHierarchyView hierarchyView) {
            this.hierarchyView = hierarchyView;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.batch.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.batch.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code name}
         * is ascending.
         */
        private com.oracle.bmc.batch.model.BatchTaskSortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code name}
         * is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.batch.model.BatchTaskSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(ListBatchJobTasksRequest o) {
            batchJobId(o.getBatchJobId());
            lifecycleState(o.getLifecycleState());
            name(o.getName());
            taskId(o.getTaskId());
            groupTaskName(o.getGroupTaskName());
            type(o.getType());
            hierarchyView(o.getHierarchyView());
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
         * Build the instance of ListBatchJobTasksRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListBatchJobTasksRequest
         */
        public ListBatchJobTasksRequest build() {
            ListBatchJobTasksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBatchJobTasksRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBatchJobTasksRequest
         */
        public ListBatchJobTasksRequest buildWithoutInvocationCallback() {
            ListBatchJobTasksRequest request = new ListBatchJobTasksRequest();
            request.batchJobId = batchJobId;
            request.lifecycleState = lifecycleState;
            request.name = name;
            request.taskId = taskId;
            request.groupTaskName = groupTaskName;
            request.type = type;
            request.hierarchyView = hierarchyView;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListBatchJobTasksRequest(batchJobId, lifecycleState, name, taskId, groupTaskName,
            // type, hierarchyView, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .batchJobId(batchJobId)
                .lifecycleState(lifecycleState)
                .name(name)
                .taskId(taskId)
                .groupTaskName(groupTaskName)
                .type(type)
                .hierarchyView(hierarchyView)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",batchJobId=").append(String.valueOf(this.batchJobId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",taskId=").append(String.valueOf(this.taskId));
        sb.append(",groupTaskName=").append(String.valueOf(this.groupTaskName));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",hierarchyView=").append(String.valueOf(this.hierarchyView));
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
        if (!(o instanceof ListBatchJobTasksRequest)) {
            return false;
        }

        ListBatchJobTasksRequest other = (ListBatchJobTasksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.batchJobId, other.batchJobId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.taskId, other.taskId)
                && java.util.Objects.equals(this.groupTaskName, other.groupTaskName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.hierarchyView, other.hierarchyView)
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
        result = (result * PRIME) + (this.batchJobId == null ? 43 : this.batchJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.taskId == null ? 43 : this.taskId.hashCode());
        result =
                (result * PRIME)
                        + (this.groupTaskName == null ? 43 : this.groupTaskName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.hierarchyView == null ? 43 : this.hierarchyView.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
