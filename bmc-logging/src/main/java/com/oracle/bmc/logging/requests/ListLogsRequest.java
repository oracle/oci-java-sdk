/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/ListLogsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListLogsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ListLogsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * OCID of a log group to work with.
     */
    private String logGroupId;

    public String getLogGroupId() {
        return logGroupId;
    }
    /**
     * The logType that the log object is for, whether custom or service.
     */
    private LogType logType;

    /**
     * The logType that the log object is for, whether custom or service.
     **/
    public enum LogType {
        Custom("CUSTOM"),
        Service("SERVICE"),
        ;

        private final String value;
        private static java.util.Map<String, LogType> map;

        static {
            map = new java.util.HashMap<>();
            for (LogType v : LogType.values()) {
                map.put(v.getValue(), v);
            }
        }

        LogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LogType: " + key);
        }
    };

    public LogType getLogType() {
        return logType;
    }
    /**
     * Service that created the log object.
     */
    private String sourceService;

    public String getSourceService() {
        return sourceService;
    }
    /**
     * Log object resource.
     */
    private String sourceResource;

    public String getSourceResource() {
        return sourceResource;
    }
    /**
     * Resource name
     */
    private String displayName;

    public String getDisplayName() {
        return displayName;
    }
    /**
     * Lifecycle state of the log object
     */
    private com.oracle.bmc.logging.model.LogLifecycleState lifecycleState;

    public com.oracle.bmc.logging.model.LogLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} or {@code opc-previous-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The field to sort by (one column only). Default sort order is
     * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by (one column only). Default sort order is
     * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The sort order to use, whether 'asc' or 'desc'.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, whether 'asc' or 'desc'.
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

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListLogsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String logGroupId = null;

        /**
         * OCID of a log group to work with.
         * @return this builder instance
         */
        public Builder logGroupId(String logGroupId) {
            this.logGroupId = logGroupId;
            return this;
        }

        private LogType logType = null;

        /**
         * The logType that the log object is for, whether custom or service.
         * @return this builder instance
         */
        public Builder logType(LogType logType) {
            this.logType = logType;
            return this;
        }

        private String sourceService = null;

        /**
         * Service that created the log object.
         * @return this builder instance
         */
        public Builder sourceService(String sourceService) {
            this.sourceService = sourceService;
            return this;
        }

        private String sourceResource = null;

        /**
         * Log object resource.
         * @return this builder instance
         */
        public Builder sourceResource(String sourceResource) {
            this.sourceResource = sourceResource;
            return this;
        }

        private String displayName = null;

        /**
         * Resource name
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        private com.oracle.bmc.logging.model.LogLifecycleState lifecycleState = null;

        /**
         * Lifecycle state of the log object
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.logging.model.LogLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} or {@code opc-previous-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by (one column only). Default sort order is
         * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, whether 'asc' or 'desc'.
         *
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
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
        public Builder copy(ListLogsRequest o) {
            logGroupId(o.getLogGroupId());
            logType(o.getLogType());
            sourceService(o.getSourceService());
            sourceResource(o.getSourceResource());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListLogsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListLogsRequest
         */
        public ListLogsRequest build() {
            ListLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListLogsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListLogsRequest
         */
        public ListLogsRequest buildWithoutInvocationCallback() {
            ListLogsRequest request = new ListLogsRequest();
            request.logGroupId = logGroupId;
            request.logType = logType;
            request.sourceService = sourceService;
            request.sourceResource = sourceResource;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListLogsRequest(logGroupId, logType, sourceService, sourceResource, displayName, lifecycleState, page, limit, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .logGroupId(logGroupId)
                .logType(logType)
                .sourceService(sourceService)
                .sourceResource(sourceResource)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(",logType=").append(String.valueOf(this.logType));
        sb.append(",sourceService=").append(String.valueOf(this.sourceService));
        sb.append(",sourceResource=").append(String.valueOf(this.sourceResource));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLogsRequest)) {
            return false;
        }

        ListLogsRequest other = (ListLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.logGroupId, other.logGroupId)
                && java.util.Objects.equals(this.logType, other.logType)
                && java.util.Objects.equals(this.sourceService, other.sourceService)
                && java.util.Objects.equals(this.sourceResource, other.sourceResource)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.logType == null ? 43 : this.logType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceService == null ? 43 : this.sourceService.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResource == null ? 43 : this.sourceResource.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
