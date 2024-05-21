/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJobsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique catalog identifier.
     */
    public String getCatalogId() {
        return catalogId;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayNameContains;

    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * Job lifecycle state.
     */
    private com.oracle.bmc.datacatalog.model.JobLifecycleState lifecycleState;

    /**
     * Job lifecycle state.
     */
    public com.oracle.bmc.datacatalog.model.JobLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }
    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }
    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    /**
     * OCID of the user who created the resource.
     */
    public String getCreatedById() {
        return createdById;
    }
    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    /**
     * OCID of the user who updated the resource.
     */
    public String getUpdatedById() {
        return updatedById;
    }
    /**
     * Job type.
     */
    private com.oracle.bmc.datacatalog.model.JobType jobType;

    /**
     * Job type.
     */
    public com.oracle.bmc.datacatalog.model.JobType getJobType() {
        return jobType;
    }
    /**
     * Unique job definition key.
     */
    private String jobDefinitionKey;

    /**
     * Unique job definition key.
     */
    public String getJobDefinitionKey() {
        return jobDefinitionKey;
    }
    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * Unique data asset key.
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /**
     * Unique glossary key.
     */
    private String glossaryKey;

    /**
     * Unique glossary key.
     */
    public String getGlossaryKey() {
        return glossaryKey;
    }
    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
     *
     */
    private String scheduleCronExpression;

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
     *
     */
    public String getScheduleCronExpression() {
        return scheduleCronExpression;
    }
    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeScheduleBegin;

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeScheduleBegin() {
        return timeScheduleBegin;
    }
    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeScheduleEnd;

    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeScheduleEnd() {
        return timeScheduleEnd;
    }
    /**
     * Type of the job schedule.
     */
    private com.oracle.bmc.datacatalog.model.JobScheduleType scheduleType;

    /**
     * Type of the job schedule.
     */
    public com.oracle.bmc.datacatalog.model.JobScheduleType getScheduleType() {
        return scheduleType;
    }
    /**
     * Unique connection key.
     */
    private String connectionKey;

    /**
     * Unique connection key.
     */
    public String getConnectionKey() {
        return connectionKey;
    }
    /**
     * Specifies the fields to return in a job summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a job summary response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        CatalogId("catalogId"),
        JobDefinitionKey("jobDefinitionKey"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        CreatedById("createdById"),
        UpdatedById("updatedById"),
        JobType("jobType"),
        ScheduleCronExpression("scheduleCronExpression"),
        TimeScheduleBegin("timeScheduleBegin"),
        ScheduleType("scheduleType"),
        ExecutionCount("executionCount"),
        TimeOfLatestExecution("timeOfLatestExecution"),
        Executions("executions"),
        Uri("uri"),
        JobDefinitionName("jobDefinitionName"),
        ErrorCode("errorCode"),
        ErrorMessage("errorMessage"),
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

    /**
     * Specifies the fields to return in a job summary response.
     *
     */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /**
     * The total number of executions for this job schedule.
     *
     */
    private Integer executionCount;

    /**
     * The total number of executions for this job schedule.
     *
     */
    public Integer getExecutionCount() {
        return executionCount;
    }
    /**
     * The date and time the most recent execution for this job ,in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     */
    private java.util.Date timeOfLatestExecution;

    /**
     * The date and time the most recent execution for this job ,in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     */
    public java.util.Date getTimeOfLatestExecution() {
        return timeOfLatestExecution;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
     *
     */
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

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListJobsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique catalog identifier.
         */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources that match display name pattern given. The match is not case sensitive.
         * For Example : /folders?displayNameContains=Cu.*
         * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         */
        private String displayNameContains = null;

        /**
         * A filter to return only resources that match display name pattern given. The match is not case sensitive.
         * For Example : /folders?displayNameContains=Cu.*
         * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * Job lifecycle state.
         */
        private com.oracle.bmc.datacatalog.model.JobLifecycleState lifecycleState = null;

        /**
         * Job lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacatalog.model.JobLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeCreated = null;

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder instance
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeUpdated = null;

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder instance
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * OCID of the user who created the resource.
         */
        private String createdById = null;

        /**
         * OCID of the user who created the resource.
         * @param createdById the value to set
         * @return this builder instance
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        /**
         * OCID of the user who updated the resource.
         */
        private String updatedById = null;

        /**
         * OCID of the user who updated the resource.
         * @param updatedById the value to set
         * @return this builder instance
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            return this;
        }

        /**
         * Job type.
         */
        private com.oracle.bmc.datacatalog.model.JobType jobType = null;

        /**
         * Job type.
         * @param jobType the value to set
         * @return this builder instance
         */
        public Builder jobType(com.oracle.bmc.datacatalog.model.JobType jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * Unique job definition key.
         */
        private String jobDefinitionKey = null;

        /**
         * Unique job definition key.
         * @param jobDefinitionKey the value to set
         * @return this builder instance
         */
        public Builder jobDefinitionKey(String jobDefinitionKey) {
            this.jobDefinitionKey = jobDefinitionKey;
            return this;
        }

        /**
         * Unique data asset key.
         */
        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         * @param dataAssetKey the value to set
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * Unique glossary key.
         */
        private String glossaryKey = null;

        /**
         * Unique glossary key.
         * @param glossaryKey the value to set
         * @return this builder instance
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            return this;
        }

        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
         *
         */
        private String scheduleCronExpression = null;

        /**
         * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
         * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
         * For metastore sync, an additional option @default is supported, which will schedule jobs at a more granular frequency.
         *
         * @param scheduleCronExpression the value to set
         * @return this builder instance
         */
        public Builder scheduleCronExpression(String scheduleCronExpression) {
            this.scheduleCronExpression = scheduleCronExpression;
            return this;
        }

        /**
         * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeScheduleBegin = null;

        /**
         * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeScheduleBegin the value to set
         * @return this builder instance
         */
        public Builder timeScheduleBegin(java.util.Date timeScheduleBegin) {
            this.timeScheduleBegin = timeScheduleBegin;
            return this;
        }

        /**
         * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeScheduleEnd = null;

        /**
         * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeScheduleEnd the value to set
         * @return this builder instance
         */
        public Builder timeScheduleEnd(java.util.Date timeScheduleEnd) {
            this.timeScheduleEnd = timeScheduleEnd;
            return this;
        }

        /**
         * Type of the job schedule.
         */
        private com.oracle.bmc.datacatalog.model.JobScheduleType scheduleType = null;

        /**
         * Type of the job schedule.
         * @param scheduleType the value to set
         * @return this builder instance
         */
        public Builder scheduleType(com.oracle.bmc.datacatalog.model.JobScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * Unique connection key.
         */
        private String connectionKey = null;

        /**
         * Unique connection key.
         * @param connectionKey the value to set
         * @return this builder instance
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            return this;
        }

        /**
         * Specifies the fields to return in a job summary response.
         *
         */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a job summary response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a job summary response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * The total number of executions for this job schedule.
         *
         */
        private Integer executionCount = null;

        /**
         * The total number of executions for this job schedule.
         *
         * @param executionCount the value to set
         * @return this builder instance
         */
        public Builder executionCount(Integer executionCount) {
            this.executionCount = executionCount;
            return this;
        }

        /**
         * The date and time the most recent execution for this job ,in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         */
        private java.util.Date timeOfLatestExecution = null;

        /**
         * The date and time the most recent execution for this job ,in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeOfLatestExecution the value to set
         * @return this builder instance
         */
        public Builder timeOfLatestExecution(java.util.Date timeOfLatestExecution) {
            this.timeOfLatestExecution = timeOfLatestExecution;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListJobsRequest o) {
            catalogId(o.getCatalogId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            jobType(o.getJobType());
            jobDefinitionKey(o.getJobDefinitionKey());
            dataAssetKey(o.getDataAssetKey());
            glossaryKey(o.getGlossaryKey());
            scheduleCronExpression(o.getScheduleCronExpression());
            timeScheduleBegin(o.getTimeScheduleBegin());
            timeScheduleEnd(o.getTimeScheduleEnd());
            scheduleType(o.getScheduleType());
            connectionKey(o.getConnectionKey());
            fields(o.getFields());
            executionCount(o.getExecutionCount());
            timeOfLatestExecution(o.getTimeOfLatestExecution());
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
         * Build the instance of ListJobsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobsRequest
         */
        public ListJobsRequest build() {
            ListJobsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJobsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJobsRequest
         */
        public ListJobsRequest buildWithoutInvocationCallback() {
            ListJobsRequest request = new ListJobsRequest();
            request.catalogId = catalogId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.timeCreated = timeCreated;
            request.timeUpdated = timeUpdated;
            request.createdById = createdById;
            request.updatedById = updatedById;
            request.jobType = jobType;
            request.jobDefinitionKey = jobDefinitionKey;
            request.dataAssetKey = dataAssetKey;
            request.glossaryKey = glossaryKey;
            request.scheduleCronExpression = scheduleCronExpression;
            request.timeScheduleBegin = timeScheduleBegin;
            request.timeScheduleEnd = timeScheduleEnd;
            request.scheduleType = scheduleType;
            request.connectionKey = connectionKey;
            request.fields = fields;
            request.executionCount = executionCount;
            request.timeOfLatestExecution = timeOfLatestExecution;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJobsRequest(catalogId, displayName, displayNameContains, lifecycleState, timeCreated, timeUpdated, createdById, updatedById, jobType, jobDefinitionKey, dataAssetKey, glossaryKey, scheduleCronExpression, timeScheduleBegin, timeScheduleEnd, scheduleType, connectionKey, fields, executionCount, timeOfLatestExecution, sortBy, sortOrder, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .lifecycleState(lifecycleState)
                .timeCreated(timeCreated)
                .timeUpdated(timeUpdated)
                .createdById(createdById)
                .updatedById(updatedById)
                .jobType(jobType)
                .jobDefinitionKey(jobDefinitionKey)
                .dataAssetKey(dataAssetKey)
                .glossaryKey(glossaryKey)
                .scheduleCronExpression(scheduleCronExpression)
                .timeScheduleBegin(timeScheduleBegin)
                .timeScheduleEnd(timeScheduleEnd)
                .scheduleType(scheduleType)
                .connectionKey(connectionKey)
                .fields(fields)
                .executionCount(executionCount)
                .timeOfLatestExecution(timeOfLatestExecution)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",updatedById=").append(String.valueOf(this.updatedById));
        sb.append(",jobType=").append(String.valueOf(this.jobType));
        sb.append(",jobDefinitionKey=").append(String.valueOf(this.jobDefinitionKey));
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(",scheduleCronExpression=").append(String.valueOf(this.scheduleCronExpression));
        sb.append(",timeScheduleBegin=").append(String.valueOf(this.timeScheduleBegin));
        sb.append(",timeScheduleEnd=").append(String.valueOf(this.timeScheduleEnd));
        sb.append(",scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(",connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",executionCount=").append(String.valueOf(this.executionCount));
        sb.append(",timeOfLatestExecution=").append(String.valueOf(this.timeOfLatestExecution));
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
        if (!(o instanceof ListJobsRequest)) {
            return false;
        }

        ListJobsRequest other = (ListJobsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.jobDefinitionKey, other.jobDefinitionKey)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(
                        this.scheduleCronExpression, other.scheduleCronExpression)
                && java.util.Objects.equals(this.timeScheduleBegin, other.timeScheduleBegin)
                && java.util.Objects.equals(this.timeScheduleEnd, other.timeScheduleEnd)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.executionCount, other.executionCount)
                && java.util.Objects.equals(this.timeOfLatestExecution, other.timeOfLatestExecution)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDefinitionKey == null ? 43 : this.jobDefinitionKey.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduleCronExpression == null
                                ? 43
                                : this.scheduleCronExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleBegin == null ? 43 : this.timeScheduleBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleEnd == null ? 43 : this.timeScheduleEnd.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.executionCount == null ? 43 : this.executionCount.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLatestExecution == null
                                ? 43
                                : this.timeOfLatestExecution.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
