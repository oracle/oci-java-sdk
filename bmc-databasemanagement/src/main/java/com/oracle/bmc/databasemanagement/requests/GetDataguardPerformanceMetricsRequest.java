/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDataguardPerformanceMetricsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDataguardPerformanceMetricsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetDataguardPerformanceMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The start time of the time range to retrieve the health metrics of a Managed Database in UTC
     * in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    private String startTime;

    /**
     * The start time of the time range to retrieve the health metrics of a Managed Database in UTC
     * in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * The end time of the time range to retrieve the health metrics of a Managed Database in UTC in
     * ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     */
    private String endTime;

    /**
     * The end time of the time range to retrieve the health metrics of a Managed Database in UTC in
     * ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment for which peer database metrics are required. This is not a mandatory parameter
     * and in its absence, all the peer database metrics are returned.
     */
    private String peerDatabaseCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment for which peer database metrics are required. This is not a mandatory parameter
     * and in its absence, all the peer database metrics are returned.
     */
    public String getPeerDatabaseCompartmentId() {
        return peerDatabaseCompartmentId;
    }
    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names
     * with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    private String filterByMetricNames;

    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names
     * with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    public String getFilterByMetricNames() {
        return filterByMetricNames;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDataguardPerformanceMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The start time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        private String startTime = null;

        /**
         * The start time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param startTime the value to set
         * @return this builder instance
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The end time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         */
        private String endTime = null;

        /**
         * The end time of the time range to retrieve the health metrics of a Managed Database in
         * UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment for which peer database metrics are required. This is not a mandatory
         * parameter and in its absence, all the peer database metrics are returned.
         */
        private String peerDatabaseCompartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment for which peer database metrics are required. This is not a mandatory
         * parameter and in its absence, all the peer database metrics are returned.
         *
         * @param peerDatabaseCompartmentId the value to set
         * @return this builder instance
         */
        public Builder peerDatabaseCompartmentId(String peerDatabaseCompartmentId) {
            this.peerDatabaseCompartmentId = peerDatabaseCompartmentId;
            return this;
        }

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names
         * with a comma separator. Note that, by default, the service returns all supported metrics.
         */
        private String filterByMetricNames = null;

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names
         * with a comma separator. Note that, by default, the service returns all supported metrics.
         *
         * @param filterByMetricNames the value to set
         * @return this builder instance
         */
        public Builder filterByMetricNames(String filterByMetricNames) {
            this.filterByMetricNames = filterByMetricNames;
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
        public Builder copy(GetDataguardPerformanceMetricsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            opcRequestId(o.getOpcRequestId());
            peerDatabaseCompartmentId(o.getPeerDatabaseCompartmentId());
            filterByMetricNames(o.getFilterByMetricNames());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDataguardPerformanceMetricsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDataguardPerformanceMetricsRequest
         */
        public GetDataguardPerformanceMetricsRequest build() {
            GetDataguardPerformanceMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDataguardPerformanceMetricsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDataguardPerformanceMetricsRequest
         */
        public GetDataguardPerformanceMetricsRequest buildWithoutInvocationCallback() {
            GetDataguardPerformanceMetricsRequest request =
                    new GetDataguardPerformanceMetricsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.startTime = startTime;
            request.endTime = endTime;
            request.opcRequestId = opcRequestId;
            request.peerDatabaseCompartmentId = peerDatabaseCompartmentId;
            request.filterByMetricNames = filterByMetricNames;
            return request;
            // new GetDataguardPerformanceMetricsRequest(managedDatabaseId, startTime, endTime,
            // opcRequestId, peerDatabaseCompartmentId, filterByMetricNames);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .startTime(startTime)
                .endTime(endTime)
                .opcRequestId(opcRequestId)
                .peerDatabaseCompartmentId(peerDatabaseCompartmentId)
                .filterByMetricNames(filterByMetricNames);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",peerDatabaseCompartmentId=")
                .append(String.valueOf(this.peerDatabaseCompartmentId));
        sb.append(",filterByMetricNames=").append(String.valueOf(this.filterByMetricNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDataguardPerformanceMetricsRequest)) {
            return false;
        }

        GetDataguardPerformanceMetricsRequest other = (GetDataguardPerformanceMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.peerDatabaseCompartmentId, other.peerDatabaseCompartmentId)
                && java.util.Objects.equals(this.filterByMetricNames, other.filterByMetricNames);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDatabaseCompartmentId == null
                                ? 43
                                : this.peerDatabaseCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMetricNames == null
                                ? 43
                                : this.filterByMetricNames.hashCode());
        return result;
    }
}
