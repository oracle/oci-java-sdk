/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListStepsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListStepsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class ListStepsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** unique SchedulerJob identifier */
    private String schedulerJobId;

    /** unique SchedulerJob identifier */
    public String getSchedulerJobId() {
        return schedulerJobId;
    }
    /** unique jobActivity identifier */
    private String jobActivityId;

    /** unique jobActivity identifier */
    public String getJobActivityId() {
        return jobActivityId;
    }
    /** Task Id */
    private String resourceTaskId;

    /** Task Id */
    public String getResourceTaskId() {
        return resourceTaskId;
    }
    /** Unique step name */
    private String stepName;

    /** Unique step name */
    public String getStepName() {
        return stepName;
    }
    /** Unique target name */
    private String targetName;

    /** Unique target name */
    public String getTargetName() {
        return targetName;
    }
    /** Task Order Sequence */
    private String sequence;

    /** Task Order Sequence */
    public String getSequence() {
        return sequence;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeStarted is
     * descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeStarted is
     * descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeStarted("timeStarted"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeStarted is
     * descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStepsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique SchedulerJob identifier */
        private String schedulerJobId = null;

        /**
         * unique SchedulerJob identifier
         *
         * @param schedulerJobId the value to set
         * @return this builder instance
         */
        public Builder schedulerJobId(String schedulerJobId) {
            this.schedulerJobId = schedulerJobId;
            return this;
        }

        /** unique jobActivity identifier */
        private String jobActivityId = null;

        /**
         * unique jobActivity identifier
         *
         * @param jobActivityId the value to set
         * @return this builder instance
         */
        public Builder jobActivityId(String jobActivityId) {
            this.jobActivityId = jobActivityId;
            return this;
        }

        /** Task Id */
        private String resourceTaskId = null;

        /**
         * Task Id
         *
         * @param resourceTaskId the value to set
         * @return this builder instance
         */
        public Builder resourceTaskId(String resourceTaskId) {
            this.resourceTaskId = resourceTaskId;
            return this;
        }

        /** Unique step name */
        private String stepName = null;

        /**
         * Unique step name
         *
         * @param stepName the value to set
         * @return this builder instance
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /** Unique target name */
        private String targetName = null;

        /**
         * Unique target name
         *
         * @param targetName the value to set
         * @return this builder instance
         */
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            return this;
        }

        /** Task Order Sequence */
        private String sequence = null;

        /**
         * Task Order Sequence
         *
         * @param sequence the value to set
         * @return this builder instance
         */
        public Builder sequence(String sequence) {
            this.sequence = sequence;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeStarted
         * is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeStarted
         * is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListStepsRequest o) {
            schedulerJobId(o.getSchedulerJobId());
            jobActivityId(o.getJobActivityId());
            resourceTaskId(o.getResourceTaskId());
            stepName(o.getStepName());
            targetName(o.getTargetName());
            sequence(o.getSequence());
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
         * Build the instance of ListStepsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListStepsRequest
         */
        public ListStepsRequest build() {
            ListStepsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStepsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStepsRequest
         */
        public ListStepsRequest buildWithoutInvocationCallback() {
            ListStepsRequest request = new ListStepsRequest();
            request.schedulerJobId = schedulerJobId;
            request.jobActivityId = jobActivityId;
            request.resourceTaskId = resourceTaskId;
            request.stepName = stepName;
            request.targetName = targetName;
            request.sequence = sequence;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListStepsRequest(schedulerJobId, jobActivityId, resourceTaskId, stepName,
            // targetName, sequence, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .schedulerJobId(schedulerJobId)
                .jobActivityId(jobActivityId)
                .resourceTaskId(resourceTaskId)
                .stepName(stepName)
                .targetName(targetName)
                .sequence(sequence)
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
        sb.append(",schedulerJobId=").append(String.valueOf(this.schedulerJobId));
        sb.append(",jobActivityId=").append(String.valueOf(this.jobActivityId));
        sb.append(",resourceTaskId=").append(String.valueOf(this.resourceTaskId));
        sb.append(",stepName=").append(String.valueOf(this.stepName));
        sb.append(",targetName=").append(String.valueOf(this.targetName));
        sb.append(",sequence=").append(String.valueOf(this.sequence));
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
        if (!(o instanceof ListStepsRequest)) {
            return false;
        }

        ListStepsRequest other = (ListStepsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.schedulerJobId, other.schedulerJobId)
                && java.util.Objects.equals(this.jobActivityId, other.jobActivityId)
                && java.util.Objects.equals(this.resourceTaskId, other.resourceTaskId)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.sequence, other.sequence)
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
        result =
                (result * PRIME)
                        + (this.schedulerJobId == null ? 43 : this.schedulerJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.jobActivityId == null ? 43 : this.jobActivityId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTaskId == null ? 43 : this.resourceTaskId.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.sequence == null ? 43 : this.sequence.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
