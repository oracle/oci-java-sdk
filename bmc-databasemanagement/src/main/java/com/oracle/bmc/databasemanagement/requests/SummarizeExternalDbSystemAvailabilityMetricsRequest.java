/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeExternalDbSystemAvailabilityMetricsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeExternalDbSystemAvailabilityMetricsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class SummarizeExternalDbSystemAvailabilityMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system.
     */
    private String externalDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system.
     */
    public String getExternalDbSystemId() {
        return externalDbSystemId;
    }
    /**
     * The beginning of the time range set to retrieve metric data for the DB system and its
     * members. Expressed in UTC in ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     */
    private String startTime;

    /**
     * The beginning of the time range set to retrieve metric data for the DB system and its
     * members. Expressed in UTC in ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * The end of the time range set to retrieve metric data for the DB system and its members.
     * Expressed in UTC in ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     */
    private String endTime;

    /**
     * The end of the time range set to retrieve metric data for the DB system and its members.
     * Expressed in UTC in ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
     */
    public String getEndTime() {
        return endTime;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of records returned in the paginated response. */
    private Integer limit;

    /** The maximum number of records returned in the paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The filter used to retrieve metrics for a specific set of component types by passing the
     * desired component types separated by a comma. Note that, by default, the service returns
     * metrics for all DB system component types.
     */
    private String filterByComponentTypes;

    /**
     * The filter used to retrieve metrics for a specific set of component types by passing the
     * desired component types separated by a comma. Note that, by default, the service returns
     * metrics for all DB system component types.
     */
    public String getFilterByComponentTypes() {
        return filterByComponentTypes;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeExternalDbSystemAvailabilityMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system.
         */
        private String externalDbSystemId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system.
         *
         * @param externalDbSystemId the value to set
         * @return this builder instance
         */
        public Builder externalDbSystemId(String externalDbSystemId) {
            this.externalDbSystemId = externalDbSystemId;
            return this;
        }

        /**
         * The beginning of the time range set to retrieve metric data for the DB system and its
         * members. Expressed in UTC in ISO-8601 format, which is {@code
         * yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         */
        private String startTime = null;

        /**
         * The beginning of the time range set to retrieve metric data for the DB system and its
         * members. Expressed in UTC in ISO-8601 format, which is {@code
         * yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         *
         * @param startTime the value to set
         * @return this builder instance
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The end of the time range set to retrieve metric data for the DB system and its members.
         * Expressed in UTC in ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         */
        private String endTime = null;

        /**
         * The end of the time range set to retrieve metric data for the DB system and its members.
         * Expressed in UTC in ISO-8601 format, which is {@code yyyy-MM-dd'T'hh:mm:ss.sss'Z'}.
         *
         * @param endTime the value to set
         * @return this builder instance
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of records returned in the paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of records returned in the paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The filter used to retrieve metrics for a specific set of component types by passing the
         * desired component types separated by a comma. Note that, by default, the service returns
         * metrics for all DB system component types.
         */
        private String filterByComponentTypes = null;

        /**
         * The filter used to retrieve metrics for a specific set of component types by passing the
         * desired component types separated by a comma. Note that, by default, the service returns
         * metrics for all DB system component types.
         *
         * @param filterByComponentTypes the value to set
         * @return this builder instance
         */
        public Builder filterByComponentTypes(String filterByComponentTypes) {
            this.filterByComponentTypes = filterByComponentTypes;
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
        public Builder copy(SummarizeExternalDbSystemAvailabilityMetricsRequest o) {
            externalDbSystemId(o.getExternalDbSystemId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            filterByComponentTypes(o.getFilterByComponentTypes());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeExternalDbSystemAvailabilityMetricsRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeExternalDbSystemAvailabilityMetricsRequest
         */
        public SummarizeExternalDbSystemAvailabilityMetricsRequest build() {
            SummarizeExternalDbSystemAvailabilityMetricsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeExternalDbSystemAvailabilityMetricsRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeExternalDbSystemAvailabilityMetricsRequest
         */
        public SummarizeExternalDbSystemAvailabilityMetricsRequest
                buildWithoutInvocationCallback() {
            SummarizeExternalDbSystemAvailabilityMetricsRequest request =
                    new SummarizeExternalDbSystemAvailabilityMetricsRequest();
            request.externalDbSystemId = externalDbSystemId;
            request.startTime = startTime;
            request.endTime = endTime;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.filterByComponentTypes = filterByComponentTypes;
            return request;
            // new SummarizeExternalDbSystemAvailabilityMetricsRequest(externalDbSystemId,
            // startTime, endTime, opcRequestId, page, limit, filterByComponentTypes);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .externalDbSystemId(externalDbSystemId)
                .startTime(startTime)
                .endTime(endTime)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .filterByComponentTypes(filterByComponentTypes);
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
        sb.append(",externalDbSystemId=").append(String.valueOf(this.externalDbSystemId));
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",filterByComponentTypes=").append(String.valueOf(this.filterByComponentTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeExternalDbSystemAvailabilityMetricsRequest)) {
            return false;
        }

        SummarizeExternalDbSystemAvailabilityMetricsRequest other =
                (SummarizeExternalDbSystemAvailabilityMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.externalDbSystemId, other.externalDbSystemId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(
                        this.filterByComponentTypes, other.filterByComponentTypes);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.externalDbSystemId == null
                                ? 43
                                : this.externalDbSystemId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByComponentTypes == null
                                ? 43
                                : this.filterByComponentTypes.hashCode());
        return result;
    }
}
