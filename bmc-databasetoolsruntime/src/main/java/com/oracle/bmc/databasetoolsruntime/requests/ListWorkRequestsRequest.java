/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWorkRequestsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class ListWorkRequestsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     */
    private String resourceIdentifier;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.databasetoolsruntime.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.databasetoolsruntime.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeAccepted is descending. If no value is specified timeAccepted is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeAccepted is descending. If no value is specified timeAccepted is default.
     *
     **/
    public enum SortBy {
        TimeAccepted("timeAccepted"),
        TimeUpdated("timeUpdated"),
        TimeFinished("timeFinished"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeAccepted is descending. If no value is specified timeAccepted is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The work request operation type.
     */
    private java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationType> operationType;

    /**
     * The work request operation type.
     */
    public java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationType>
            getOperationType() {
        return operationType;
    }
    /**
     * A filter to return only work requests initiated by the specified principal OCID.
     */
    private String createdByPrincipalId;

    /**
     * A filter to return only work requests initiated by the specified principal OCID.
     */
    public String getCreatedByPrincipalId() {
        return createdByPrincipalId;
    }
    /**
     * A filter to return only work requests with one of the specified status values.
     */
    private java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationStatus> status;

    /**
     * A filter to return only work requests with one of the specified status values.
     */
    public java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationStatus> getStatus() {
        return status;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWorkRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
         */
        private String resourceIdentifier = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
         * @param resourceIdentifier the value to set
         * @return this builder instance
         */
        public Builder resourceIdentifier(String resourceIdentifier) {
            this.resourceIdentifier = resourceIdentifier;
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
         * The sort order to use, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.databasetoolsruntime.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasetoolsruntime.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeAccepted is descending. If no value is specified timeAccepted is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeAccepted is descending. If no value is specified timeAccepted is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The work request operation type.
         */
        private java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationType>
                operationType = null;

        /**
         * The work request operation type.
         * @param operationType the value to set
         * @return this builder instance
         */
        public Builder operationType(
                java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationType>
                        operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * Singular setter. The work request operation type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder operationType(OperationType singularValue) {
            return this.operationType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only work requests initiated by the specified principal OCID.
         */
        private String createdByPrincipalId = null;

        /**
         * A filter to return only work requests initiated by the specified principal OCID.
         * @param createdByPrincipalId the value to set
         * @return this builder instance
         */
        public Builder createdByPrincipalId(String createdByPrincipalId) {
            this.createdByPrincipalId = createdByPrincipalId;
            return this;
        }

        /**
         * A filter to return only work requests with one of the specified status values.
         */
        private java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationStatus> status =
                null;

        /**
         * A filter to return only work requests with one of the specified status values.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                java.util.List<com.oracle.bmc.databasetoolsruntime.model.OperationStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only work requests with one of the specified status values.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(OperationStatus singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListWorkRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            resourceIdentifier(o.getResourceIdentifier());
            opcRequestId(o.getOpcRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            page(o.getPage());
            limit(o.getLimit());
            operationType(o.getOperationType());
            createdByPrincipalId(o.getCreatedByPrincipalId());
            status(o.getStatus());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWorkRequestsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWorkRequestsRequest
         */
        public ListWorkRequestsRequest build() {
            ListWorkRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWorkRequestsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWorkRequestsRequest
         */
        public ListWorkRequestsRequest buildWithoutInvocationCallback() {
            ListWorkRequestsRequest request = new ListWorkRequestsRequest();
            request.compartmentId = compartmentId;
            request.resourceIdentifier = resourceIdentifier;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.page = page;
            request.limit = limit;
            request.operationType = operationType;
            request.createdByPrincipalId = createdByPrincipalId;
            request.status = status;
            return request;
            // new ListWorkRequestsRequest(compartmentId, resourceIdentifier, opcRequestId, sortOrder, sortBy, page, limit, operationType, createdByPrincipalId, status);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .resourceIdentifier(resourceIdentifier)
                .opcRequestId(opcRequestId)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .page(page)
                .limit(limit)
                .operationType(operationType)
                .createdByPrincipalId(createdByPrincipalId)
                .status(status);
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
        sb.append(",resourceIdentifier=").append(String.valueOf(this.resourceIdentifier));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",operationType=").append(String.valueOf(this.operationType));
        sb.append(",createdByPrincipalId=").append(String.valueOf(this.createdByPrincipalId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWorkRequestsRequest)) {
            return false;
        }

        ListWorkRequestsRequest other = (ListWorkRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceIdentifier, other.resourceIdentifier)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.createdByPrincipalId, other.createdByPrincipalId)
                && java.util.Objects.equals(this.status, other.status);
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
                        + (this.resourceIdentifier == null
                                ? 43
                                : this.resourceIdentifier.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByPrincipalId == null
                                ? 43
                                : this.createdByPrincipalId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        return result;
    }
}
