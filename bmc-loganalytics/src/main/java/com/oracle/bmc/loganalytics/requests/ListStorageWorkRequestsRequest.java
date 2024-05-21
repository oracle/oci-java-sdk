/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ListStorageWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListStorageWorkRequestsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListStorageWorkRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
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
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
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

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * This is the query parameter of which field to sort by. Only one sort order may be provided. Default order for timeAccepted
     * is descending. If no value is specified timeAccepted is default.
     *
     */
    private SortBy sortBy;

    /**
     * This is the query parameter of which field to sort by. Only one sort order may be provided. Default order for timeAccepted
     * is descending. If no value is specified timeAccepted is default.
     *
     **/
    public enum SortBy {
        TimeAccepted("timeAccepted"),
        TimeExpires("timeExpires"),
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
     * This is the query parameter of which field to sort by. Only one sort order may be provided. Default order for timeAccepted
     * is descending. If no value is specified timeAccepted is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The is the work request type query parameter
     */
    private com.oracle.bmc.loganalytics.model.StorageOperationType operationType;

    /**
     * The is the work request type query parameter
     */
    public com.oracle.bmc.loganalytics.model.StorageOperationType getOperationType() {
        return operationType;
    }
    /**
     * The is the work request status query parameter
     */
    private com.oracle.bmc.loganalytics.model.WorkRequestStatus status;

    /**
     * The is the work request status query parameter
     */
    public com.oracle.bmc.loganalytics.model.WorkRequestStatus getStatus() {
        return status;
    }
    /**
     * The is the query parameter of when the processing of work request was started
     */
    private java.util.Date timeStarted;

    /**
     * The is the query parameter of when the processing of work request was started
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }
    /**
     * The is the query parameter of when the processing of work request was finished
     */
    private java.util.Date timeFinished;

    /**
     * The is the query parameter of when the processing of work request was finished
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }
    /**
     * This is the query parameter of purge policy name
     */
    private String policyName;

    /**
     * This is the query parameter of purge policy name
     */
    public String getPolicyName() {
        return policyName;
    }
    /**
     * This is the query parameter of purge policy ID
     */
    private String policyId;

    /**
     * This is the query parameter of purge policy ID
     */
    public String getPolicyId() {
        return policyId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStorageWorkRequestsRequest, java.lang.Void> {
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
         * The Logging Analytics namespace used for the request.
         *
         */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
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
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * This is the query parameter of which field to sort by. Only one sort order may be provided. Default order for timeAccepted
         * is descending. If no value is specified timeAccepted is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * This is the query parameter of which field to sort by. Only one sort order may be provided. Default order for timeAccepted
         * is descending. If no value is specified timeAccepted is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The is the work request type query parameter
         */
        private com.oracle.bmc.loganalytics.model.StorageOperationType operationType = null;

        /**
         * The is the work request type query parameter
         * @param operationType the value to set
         * @return this builder instance
         */
        public Builder operationType(
                com.oracle.bmc.loganalytics.model.StorageOperationType operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * The is the work request status query parameter
         */
        private com.oracle.bmc.loganalytics.model.WorkRequestStatus status = null;

        /**
         * The is the work request status query parameter
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(com.oracle.bmc.loganalytics.model.WorkRequestStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The is the query parameter of when the processing of work request was started
         */
        private java.util.Date timeStarted = null;

        /**
         * The is the query parameter of when the processing of work request was started
         * @param timeStarted the value to set
         * @return this builder instance
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            return this;
        }

        /**
         * The is the query parameter of when the processing of work request was finished
         */
        private java.util.Date timeFinished = null;

        /**
         * The is the query parameter of when the processing of work request was finished
         * @param timeFinished the value to set
         * @return this builder instance
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            return this;
        }

        /**
         * This is the query parameter of purge policy name
         */
        private String policyName = null;

        /**
         * This is the query parameter of purge policy name
         * @param policyName the value to set
         * @return this builder instance
         */
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * This is the query parameter of purge policy ID
         */
        private String policyId = null;

        /**
         * This is the query parameter of purge policy ID
         * @param policyId the value to set
         * @return this builder instance
         */
        public Builder policyId(String policyId) {
            this.policyId = policyId;
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
        public Builder copy(ListStorageWorkRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            namespaceName(o.getNamespaceName());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            operationType(o.getOperationType());
            status(o.getStatus());
            timeStarted(o.getTimeStarted());
            timeFinished(o.getTimeFinished());
            policyName(o.getPolicyName());
            policyId(o.getPolicyId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStorageWorkRequestsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListStorageWorkRequestsRequest
         */
        public ListStorageWorkRequestsRequest build() {
            ListStorageWorkRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStorageWorkRequestsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStorageWorkRequestsRequest
         */
        public ListStorageWorkRequestsRequest buildWithoutInvocationCallback() {
            ListStorageWorkRequestsRequest request = new ListStorageWorkRequestsRequest();
            request.compartmentId = compartmentId;
            request.namespaceName = namespaceName;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.operationType = operationType;
            request.status = status;
            request.timeStarted = timeStarted;
            request.timeFinished = timeFinished;
            request.policyName = policyName;
            request.policyId = policyId;
            return request;
            // new ListStorageWorkRequestsRequest(compartmentId, namespaceName, opcRequestId, limit, page, sortOrder, sortBy, operationType, status, timeStarted, timeFinished, policyName, policyId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .namespaceName(namespaceName)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .operationType(operationType)
                .status(status)
                .timeStarted(timeStarted)
                .timeFinished(timeFinished)
                .policyName(policyName)
                .policyId(policyId);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",operationType=").append(String.valueOf(this.operationType));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(",timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(",policyName=").append(String.valueOf(this.policyName));
        sb.append(",policyId=").append(String.valueOf(this.policyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStorageWorkRequestsRequest)) {
            return false;
        }

        ListStorageWorkRequestsRequest other = (ListStorageWorkRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.policyName, other.policyName)
                && java.util.Objects.equals(this.policyId, other.policyId);
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
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
        result = (result * PRIME) + (this.policyId == null ? 43 : this.policyId.hashCode());
        return result;
    }
}
