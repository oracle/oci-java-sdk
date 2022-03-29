/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJobsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayNameContains;

    /**
     * Job lifecycle state.
     */
    private com.oracle.bmc.datacatalog.model.JobLifecycleState lifecycleState;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    /**
     * Job type.
     */
    private com.oracle.bmc.datacatalog.model.JobType jobType;

    /**
     * Unique job definition key.
     */
    private String jobDefinitionKey;

    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * Interval on which the job will be run. Value is specified as a cron-supported time specification "nickname".
     * The following subset of those is supported: @monthly, @weekly, @daily, @hourly.
     *
     */
    private String scheduleCronExpression;

    /**
     * Date that the schedule should be operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeScheduleBegin;

    /**
     * Date that the schedule should end from being operational. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeScheduleEnd;

    /**
     * Type of the job schedule.
     */
    private com.oracle.bmc.datacatalog.model.JobScheduleType scheduleType;

    /**
     * Unique connection key.
     */
    private String connectionKey;

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
     * The total number of executions for this job schedule.
     *
     */
    private Integer executionCount;

    /**
     * The date and time the most recent execution for this job ,in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     */
    private java.util.Date timeOfLatestExecution;

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
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListJobsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a job summary response.
         *
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a job summary response.
         *
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
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
    }
}
