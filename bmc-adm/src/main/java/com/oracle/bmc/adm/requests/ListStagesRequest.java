/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListStagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListStagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListStagesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Remediation Run identifier path parameter.
     */
    private String remediationRunId;

    /**
     * Unique Remediation Run identifier path parameter.
     */
    public String getRemediationRunId() {
        return remediationRunId;
    }
    /**
     * A filter to return only Stages that match the specified type.
     */
    private com.oracle.bmc.adm.model.RemediationRunStageType type;

    /**
     * A filter to return only Stages that match the specified type.
     */
    public com.oracle.bmc.adm.model.RemediationRunStageType getType() {
        return type;
    }
    /**
     * A filter to return only Stages that match the specified status.
     */
    private com.oracle.bmc.adm.model.RemediationRunStage.Status status;

    /**
     * A filter to return only Stages that match the specified status.
     */
    public com.oracle.bmc.adm.model.RemediationRunStage.Status getStatus() {
        return status;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.adm.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.adm.model.SortOrder getSortOrder() {
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
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
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
    /**
     * The field used to sort Stages. Only one sort order is allowed.
     * Default order for status is the following sequence: **CREATED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELING, and CANCELED**.
     * Default order for _timeCreated_ is **descending**.
     * Default order for _timeFinished_ is **descending**.
     * Default order for _timeStarted_ is **descending**.
     * Default order for _type_ is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
     *
     */
    private SortBy sortBy;

    /**
     * The field used to sort Stages. Only one sort order is allowed.
     * Default order for status is the following sequence: **CREATED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELING, and CANCELED**.
     * Default order for _timeCreated_ is **descending**.
     * Default order for _timeFinished_ is **descending**.
     * Default order for _timeStarted_ is **descending**.
     * Default order for _type_ is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
     *
     **/
    public enum SortBy {
        Status("status"),
        TimeCreated("timeCreated"),
        TimeFinished("timeFinished"),
        TimeStarted("timeStarted"),
        Type("type"),
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
     * The field used to sort Stages. Only one sort order is allowed.
     * Default order for status is the following sequence: **CREATED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELING, and CANCELED**.
     * Default order for _timeCreated_ is **descending**.
     * Default order for _timeFinished_ is **descending**.
     * Default order for _timeStarted_ is **descending**.
     * Default order for _type_ is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Remediation Run identifier path parameter.
         */
        private String remediationRunId = null;

        /**
         * Unique Remediation Run identifier path parameter.
         * @param remediationRunId the value to set
         * @return this builder instance
         */
        public Builder remediationRunId(String remediationRunId) {
            this.remediationRunId = remediationRunId;
            return this;
        }

        /**
         * A filter to return only Stages that match the specified type.
         */
        private com.oracle.bmc.adm.model.RemediationRunStageType type = null;

        /**
         * A filter to return only Stages that match the specified type.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.adm.model.RemediationRunStageType type) {
            this.type = type;
            return this;
        }

        /**
         * A filter to return only Stages that match the specified status.
         */
        private com.oracle.bmc.adm.model.RemediationRunStage.Status status = null;

        /**
         * A filter to return only Stages that match the specified status.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(com.oracle.bmc.adm.model.RemediationRunStage.Status status) {
            this.status = status;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.adm.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.adm.model.SortOrder sortOrder) {
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
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
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
         * The field used to sort Stages. Only one sort order is allowed.
         * Default order for status is the following sequence: **CREATED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELING, and CANCELED**.
         * Default order for _timeCreated_ is **descending**.
         * Default order for _timeFinished_ is **descending**.
         * Default order for _timeStarted_ is **descending**.
         * Default order for _type_ is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field used to sort Stages. Only one sort order is allowed.
         * Default order for status is the following sequence: **CREATED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELING, and CANCELED**.
         * Default order for _timeCreated_ is **descending**.
         * Default order for _timeFinished_ is **descending**.
         * Default order for _timeStarted_ is **descending**.
         * Default order for _type_ is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListStagesRequest o) {
            remediationRunId(o.getRemediationRunId());
            type(o.getType());
            status(o.getStatus());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListStagesRequest
         */
        public ListStagesRequest build() {
            ListStagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStagesRequest
         */
        public ListStagesRequest buildWithoutInvocationCallback() {
            ListStagesRequest request = new ListStagesRequest();
            request.remediationRunId = remediationRunId;
            request.type = type;
            request.status = status;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortBy = sortBy;
            return request;
            // new ListStagesRequest(remediationRunId, type, status, sortOrder, limit, page, opcRequestId, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .remediationRunId(remediationRunId)
                .type(type)
                .status(status)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortBy(sortBy);
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
        sb.append(",remediationRunId=").append(String.valueOf(this.remediationRunId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStagesRequest)) {
            return false;
        }

        ListStagesRequest other = (ListStagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.remediationRunId, other.remediationRunId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.remediationRunId == null ? 43 : this.remediationRunId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
