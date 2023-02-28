/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/GetJobLogsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetJobLogsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class GetJobLogsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the job.
     */
    private String jobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the job.
     */
    public String getJobId() {
        return jobId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A filter that returns only logs of a specified type. */
    private java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry.Type> type;

    /** A filter that returns only logs of a specified type. */
    public java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry.Type> getType() {
        return type;
    }
    /** A filter that returns only log entries that match a given severity level or greater. */
    private com.oracle.bmc.resourcemanager.model.LogEntry.Level levelGreaterThanOrEqualTo;

    /** A filter that returns only log entries that match a given severity level or greater. */
    public com.oracle.bmc.resourcemanager.model.LogEntry.Level getLevelGreaterThanOrEqualTo() {
        return levelGreaterThanOrEqualTo;
    }
    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending
     * ({@code DESC}).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending
     * ({@code DESC}).
     */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending
     * ({@code DESC}).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * The number of items returned in a paginated {@code List} call. For information about
     * pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Time stamp specifying the lower time limit for which logs are returned in a query. Format is
     * defined by RFC3339. Example: {@code 2020-01-01T12:00:00.000Z}
     */
    private java.util.Date timestampGreaterThanOrEqualTo;

    /**
     * Time stamp specifying the lower time limit for which logs are returned in a query. Format is
     * defined by RFC3339. Example: {@code 2020-01-01T12:00:00.000Z}
     */
    public java.util.Date getTimestampGreaterThanOrEqualTo() {
        return timestampGreaterThanOrEqualTo;
    }
    /**
     * Time stamp specifying the upper time limit for which logs are returned in a query. Format is
     * defined by RFC3339. Example: {@code 2020-02-01T12:00:00.000Z}
     */
    private java.util.Date timestampLessThanOrEqualTo;

    /**
     * Time stamp specifying the upper time limit for which logs are returned in a query. Format is
     * defined by RFC3339. Example: {@code 2020-02-01T12:00:00.000Z}
     */
    public java.util.Date getTimestampLessThanOrEqualTo() {
        return timestampLessThanOrEqualTo;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetJobLogsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the job.
         */
        private String jobId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the job.
         *
         * @param jobId the value to set
         * @return this builder instance
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** A filter that returns only logs of a specified type. */
        private java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry.Type> type = null;

        /**
         * A filter that returns only logs of a specified type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(
                java.util.List<com.oracle.bmc.resourcemanager.model.LogEntry.Type> type) {
            this.type = type;
            return this;
        }

        /**
         * Singular setter. A filter that returns only logs of a specified type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.resourcemanager.model.LogEntry.Type singularValue) {
            return this.type(java.util.Arrays.asList(singularValue));
        }

        /** A filter that returns only log entries that match a given severity level or greater. */
        private com.oracle.bmc.resourcemanager.model.LogEntry.Level levelGreaterThanOrEqualTo =
                null;

        /**
         * A filter that returns only log entries that match a given severity level or greater.
         *
         * @param levelGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder levelGreaterThanOrEqualTo(
                com.oracle.bmc.resourcemanager.model.LogEntry.Level levelGreaterThanOrEqualTo) {
            this.levelGreaterThanOrEqualTo = levelGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or
         * descending ({@code DESC}).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or
         * descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * The number of items returned in a paginated {@code List} call. For information about
         * pagination, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List}
         * call. For information about pagination, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Time stamp specifying the lower time limit for which logs are returned in a query. Format
         * is defined by RFC3339. Example: {@code 2020-01-01T12:00:00.000Z}
         */
        private java.util.Date timestampGreaterThanOrEqualTo = null;

        /**
         * Time stamp specifying the lower time limit for which logs are returned in a query. Format
         * is defined by RFC3339. Example: {@code 2020-01-01T12:00:00.000Z}
         *
         * @param timestampGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timestampGreaterThanOrEqualTo(java.util.Date timestampGreaterThanOrEqualTo) {
            this.timestampGreaterThanOrEqualTo = timestampGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Time stamp specifying the upper time limit for which logs are returned in a query. Format
         * is defined by RFC3339. Example: {@code 2020-02-01T12:00:00.000Z}
         */
        private java.util.Date timestampLessThanOrEqualTo = null;

        /**
         * Time stamp specifying the upper time limit for which logs are returned in a query. Format
         * is defined by RFC3339. Example: {@code 2020-02-01T12:00:00.000Z}
         *
         * @param timestampLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timestampLessThanOrEqualTo(java.util.Date timestampLessThanOrEqualTo) {
            this.timestampLessThanOrEqualTo = timestampLessThanOrEqualTo;
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
        public Builder copy(GetJobLogsRequest o) {
            jobId(o.getJobId());
            opcRequestId(o.getOpcRequestId());
            type(o.getType());
            levelGreaterThanOrEqualTo(o.getLevelGreaterThanOrEqualTo());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            timestampGreaterThanOrEqualTo(o.getTimestampGreaterThanOrEqualTo());
            timestampLessThanOrEqualTo(o.getTimestampLessThanOrEqualTo());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJobLogsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetJobLogsRequest
         */
        public GetJobLogsRequest build() {
            GetJobLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetJobLogsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetJobLogsRequest
         */
        public GetJobLogsRequest buildWithoutInvocationCallback() {
            GetJobLogsRequest request = new GetJobLogsRequest();
            request.jobId = jobId;
            request.opcRequestId = opcRequestId;
            request.type = type;
            request.levelGreaterThanOrEqualTo = levelGreaterThanOrEqualTo;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.timestampGreaterThanOrEqualTo = timestampGreaterThanOrEqualTo;
            request.timestampLessThanOrEqualTo = timestampLessThanOrEqualTo;
            return request;
            // new GetJobLogsRequest(jobId, opcRequestId, type, levelGreaterThanOrEqualTo,
            // sortOrder, limit, page, timestampGreaterThanOrEqualTo, timestampLessThanOrEqualTo);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .jobId(jobId)
                .opcRequestId(opcRequestId)
                .type(type)
                .levelGreaterThanOrEqualTo(levelGreaterThanOrEqualTo)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .timestampGreaterThanOrEqualTo(timestampGreaterThanOrEqualTo)
                .timestampLessThanOrEqualTo(timestampLessThanOrEqualTo);
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
        sb.append(",jobId=").append(String.valueOf(this.jobId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",levelGreaterThanOrEqualTo=")
                .append(String.valueOf(this.levelGreaterThanOrEqualTo));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",timestampGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timestampGreaterThanOrEqualTo));
        sb.append(",timestampLessThanOrEqualTo=")
                .append(String.valueOf(this.timestampLessThanOrEqualTo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJobLogsRequest)) {
            return false;
        }

        GetJobLogsRequest other = (GetJobLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.levelGreaterThanOrEqualTo, other.levelGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.timestampGreaterThanOrEqualTo, other.timestampGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timestampLessThanOrEqualTo, other.timestampLessThanOrEqualTo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.levelGreaterThanOrEqualTo == null
                                ? 43
                                : this.levelGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampGreaterThanOrEqualTo == null
                                ? 43
                                : this.timestampGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampLessThanOrEqualTo == null
                                ? 43
                                : this.timestampLessThanOrEqualTo.hashCode());
        return result;
    }
}
