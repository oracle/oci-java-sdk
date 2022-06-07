/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobExecutionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJobExecutionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListJobExecutionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    public String getCatalogId() {
        return catalogId;
    }
    /**
     * Unique job key.
     */
    private String jobKey;

    public String getJobKey() {
        return jobKey;
    }
    /**
     * Job execution lifecycle state.
     */
    private com.oracle.bmc.datacatalog.model.JobExecutionState lifecycleState;

    public com.oracle.bmc.datacatalog.model.JobExecutionState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }
    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }
    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    public String getCreatedById() {
        return createdById;
    }
    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    public String getUpdatedById() {
        return updatedById;
    }
    /**
     * Job type.
     */
    private com.oracle.bmc.datacatalog.model.JobType jobType;

    public com.oracle.bmc.datacatalog.model.JobType getJobType() {
        return jobType;
    }
    /**
     * Sub-type of this job execution.
     */
    private String subType;

    public String getSubType() {
        return subType;
    }
    /**
     * The unique key of the parent execution or null if this job execution has no parent.
     */
    private String parentKey;

    public String getParentKey() {
        return parentKey;
    }
    /**
     * Time that the job execution was started or in the case of a future time, the time when the job will start.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     */
    private java.util.Date timeStart;

    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * Time that the job execution ended or null if the job is still running or hasn't run yet.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     */
    private java.util.Date timeEnd;

    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /**
     * Error code returned from the job execution or null if job is still running or didn't return an error.
     *
     */
    private String errorCode;

    public String getErrorCode() {
        return errorCode;
    }
    /**
     * Error message returned from the job execution or null if job is still running or didn't return an error.
     *
     */
    private String errorMessage;

    public String getErrorMessage() {
        return errorMessage;
    }
    /**
     * Process identifier related to the job execution.
     */
    private String processKey;

    public String getProcessKey() {
        return processKey;
    }
    /**
     * The a URL of the job for accessing this resource and its status.
     */
    private String externalUrl;

    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Event that triggered the execution of this job or null.
     */
    private String eventKey;

    public String getEventKey() {
        return eventKey;
    }
    /**
     * Unique entity key.
     */
    private String dataEntityKey;

    public String getDataEntityKey() {
        return dataEntityKey;
    }
    /**
     * Specifies the fields to return in a job execution summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a job execution summary response.
     *
     **/
    public enum Fields {
        Key("key"),
        JobKey("jobKey"),
        JobType("jobType"),
        ParentKey("parentKey"),
        ScheduleInstanceKey("scheduleInstanceKey"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        TimeStarted("timeStarted"),
        TimeEnded("timeEnded"),
        Uri("uri"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    public java.util.List<Fields> getFields() {
        return fields;
    }
    /**
     * The field to sort by. Only one sort order may be provided; the default is descending. Use sortOrder query param to specify order.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided; the default is descending. Use sortOrder query param to specify order.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
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
     * The maximum number of items to return.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJobExecutionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        private String jobKey = null;

        /**
         * Unique job key.
         * @return this builder instance
         */
        public Builder jobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }

        private com.oracle.bmc.datacatalog.model.JobExecutionState lifecycleState = null;

        /**
         * Job execution lifecycle state.
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacatalog.model.JobExecutionState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private java.util.Date timeCreated = null;

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @return this builder instance
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        private java.util.Date timeUpdated = null;

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @return this builder instance
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }

        private String createdById = null;

        /**
         * OCID of the user who created the resource.
         * @return this builder instance
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        private String updatedById = null;

        /**
         * OCID of the user who updated the resource.
         * @return this builder instance
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            return this;
        }

        private com.oracle.bmc.datacatalog.model.JobType jobType = null;

        /**
         * Job type.
         * @return this builder instance
         */
        public Builder jobType(com.oracle.bmc.datacatalog.model.JobType jobType) {
            this.jobType = jobType;
            return this;
        }

        private String subType = null;

        /**
         * Sub-type of this job execution.
         * @return this builder instance
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        private String parentKey = null;

        /**
         * The unique key of the parent execution or null if this job execution has no parent.
         * @return this builder instance
         */
        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            return this;
        }

        private java.util.Date timeStart = null;

        /**
         * Time that the job execution was started or in the case of a future time, the time when the job will start.
         * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        private java.util.Date timeEnd = null;

        /**
         * Time that the job execution ended or null if the job is still running or hasn't run yet.
         * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        private String errorCode = null;

        /**
         * Error code returned from the job execution or null if job is still running or didn't return an error.
         *
         * @return this builder instance
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        private String errorMessage = null;

        /**
         * Error message returned from the job execution or null if job is still running or didn't return an error.
         *
         * @return this builder instance
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        private String processKey = null;

        /**
         * Process identifier related to the job execution.
         * @return this builder instance
         */
        public Builder processKey(String processKey) {
            this.processKey = processKey;
            return this;
        }

        private String externalUrl = null;

        /**
         * The a URL of the job for accessing this resource and its status.
         * @return this builder instance
         */
        public Builder externalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        private String eventKey = null;

        /**
         * Event that triggered the execution of this job or null.
         * @return this builder instance
         */
        public Builder eventKey(String eventKey) {
            this.eventKey = eventKey;
            return this;
        }

        private String dataEntityKey = null;

        /**
         * Unique entity key.
         * @return this builder instance
         */
        public Builder dataEntityKey(String dataEntityKey) {
            this.dataEntityKey = dataEntityKey;
            return this;
        }

        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a job execution summary response.
         *
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a job execution summary response.
         *
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided; the default is descending. Use sortOrder query param to specify order.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListJobExecutionsRequest o) {
            catalogId(o.getCatalogId());
            jobKey(o.getJobKey());
            lifecycleState(o.getLifecycleState());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            jobType(o.getJobType());
            subType(o.getSubType());
            parentKey(o.getParentKey());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            errorCode(o.getErrorCode());
            errorMessage(o.getErrorMessage());
            processKey(o.getProcessKey());
            externalUrl(o.getExternalUrl());
            eventKey(o.getEventKey());
            dataEntityKey(o.getDataEntityKey());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobExecutionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobExecutionsRequest
         */
        public ListJobExecutionsRequest build() {
            ListJobExecutionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJobExecutionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJobExecutionsRequest
         */
        public ListJobExecutionsRequest buildWithoutInvocationCallback() {
            ListJobExecutionsRequest request = new ListJobExecutionsRequest();
            request.catalogId = catalogId;
            request.jobKey = jobKey;
            request.lifecycleState = lifecycleState;
            request.timeCreated = timeCreated;
            request.timeUpdated = timeUpdated;
            request.createdById = createdById;
            request.updatedById = updatedById;
            request.jobType = jobType;
            request.subType = subType;
            request.parentKey = parentKey;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.errorCode = errorCode;
            request.errorMessage = errorMessage;
            request.processKey = processKey;
            request.externalUrl = externalUrl;
            request.eventKey = eventKey;
            request.dataEntityKey = dataEntityKey;
            request.fields = fields;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJobExecutionsRequest(catalogId, jobKey, lifecycleState, timeCreated, timeUpdated, createdById, updatedById, jobType, subType, parentKey, timeStart, timeEnd, errorCode, errorMessage, processKey, externalUrl, eventKey, dataEntityKey, fields, sortBy, sortOrder, limit, page, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .jobKey(jobKey)
                .lifecycleState(lifecycleState)
                .timeCreated(timeCreated)
                .timeUpdated(timeUpdated)
                .createdById(createdById)
                .updatedById(updatedById)
                .jobType(jobType)
                .subType(subType)
                .parentKey(parentKey)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .processKey(processKey)
                .externalUrl(externalUrl)
                .eventKey(eventKey)
                .dataEntityKey(dataEntityKey)
                .fields(fields)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",jobKey=").append(String.valueOf(this.jobKey));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",updatedById=").append(String.valueOf(this.updatedById));
        sb.append(",jobType=").append(String.valueOf(this.jobType));
        sb.append(",subType=").append(String.valueOf(this.subType));
        sb.append(",parentKey=").append(String.valueOf(this.parentKey));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",errorCode=").append(String.valueOf(this.errorCode));
        sb.append(",errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(",processKey=").append(String.valueOf(this.processKey));
        sb.append(",externalUrl=").append(String.valueOf(this.externalUrl));
        sb.append(",eventKey=").append(String.valueOf(this.eventKey));
        sb.append(",dataEntityKey=").append(String.valueOf(this.dataEntityKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
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
        if (!(o instanceof ListJobExecutionsRequest)) {
            return false;
        }

        ListJobExecutionsRequest other = (ListJobExecutionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.jobKey, other.jobKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.subType, other.subType)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.processKey, other.processKey)
                && java.util.Objects.equals(this.externalUrl, other.externalUrl)
                && java.util.Objects.equals(this.eventKey, other.eventKey)
                && java.util.Objects.equals(this.dataEntityKey, other.dataEntityKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result = (result * PRIME) + (this.subType == null ? 43 : this.subType.hashCode());
        result = (result * PRIME) + (this.parentKey == null ? 43 : this.parentKey.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.processKey == null ? 43 : this.processKey.hashCode());
        result = (result * PRIME) + (this.externalUrl == null ? 43 : this.externalUrl.hashCode());
        result = (result * PRIME) + (this.eventKey == null ? 43 : this.eventKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEntityKey == null ? 43 : this.dataEntityKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
