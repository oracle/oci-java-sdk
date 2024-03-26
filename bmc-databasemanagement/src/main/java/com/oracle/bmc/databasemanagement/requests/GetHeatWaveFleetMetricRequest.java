/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetHeatWaveFleetMetricExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetHeatWaveFleetMetricRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetHeatWaveFleetMetricRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
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
    /** The parameter to filter by HeatWave cluster status. */
    private com.oracle.bmc.databasemanagement.model.HeatWaveClusterStatus filterByHeatWaveStatus;

    /** The parameter to filter by HeatWave cluster status. */
    public com.oracle.bmc.databasemanagement.model.HeatWaveClusterStatus
            getFilterByHeatWaveStatus() {
        return filterByHeatWaveStatus;
    }
    /** The parameter to filter by HeatWave node shape. */
    private String filterByHeatWaveShape;

    /** The parameter to filter by HeatWave node shape. */
    public String getFilterByHeatWaveShape() {
        return filterByHeatWaveShape;
    }
    /** The parameter to filter based on whether HeatWave Lakehouse is enabled for the cluster. */
    private Boolean isHeatWaveLakehouseEnabled;

    /** The parameter to filter based on whether HeatWave Lakehouse is enabled for the cluster. */
    public Boolean getIsHeatWaveLakehouseEnabled() {
        return isHeatWaveLakehouseEnabled;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetHeatWaveFleetMetricRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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

        /** The parameter to filter by HeatWave cluster status. */
        private com.oracle.bmc.databasemanagement.model.HeatWaveClusterStatus
                filterByHeatWaveStatus = null;

        /**
         * The parameter to filter by HeatWave cluster status.
         *
         * @param filterByHeatWaveStatus the value to set
         * @return this builder instance
         */
        public Builder filterByHeatWaveStatus(
                com.oracle.bmc.databasemanagement.model.HeatWaveClusterStatus
                        filterByHeatWaveStatus) {
            this.filterByHeatWaveStatus = filterByHeatWaveStatus;
            return this;
        }

        /** The parameter to filter by HeatWave node shape. */
        private String filterByHeatWaveShape = null;

        /**
         * The parameter to filter by HeatWave node shape.
         *
         * @param filterByHeatWaveShape the value to set
         * @return this builder instance
         */
        public Builder filterByHeatWaveShape(String filterByHeatWaveShape) {
            this.filterByHeatWaveShape = filterByHeatWaveShape;
            return this;
        }

        /**
         * The parameter to filter based on whether HeatWave Lakehouse is enabled for the cluster.
         */
        private Boolean isHeatWaveLakehouseEnabled = null;

        /**
         * The parameter to filter based on whether HeatWave Lakehouse is enabled for the cluster.
         *
         * @param isHeatWaveLakehouseEnabled the value to set
         * @return this builder instance
         */
        public Builder isHeatWaveLakehouseEnabled(Boolean isHeatWaveLakehouseEnabled) {
            this.isHeatWaveLakehouseEnabled = isHeatWaveLakehouseEnabled;
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
        public Builder copy(GetHeatWaveFleetMetricRequest o) {
            compartmentId(o.getCompartmentId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            opcRequestId(o.getOpcRequestId());
            filterByMetricNames(o.getFilterByMetricNames());
            filterByHeatWaveStatus(o.getFilterByHeatWaveStatus());
            filterByHeatWaveShape(o.getFilterByHeatWaveShape());
            isHeatWaveLakehouseEnabled(o.getIsHeatWaveLakehouseEnabled());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetHeatWaveFleetMetricRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetHeatWaveFleetMetricRequest
         */
        public GetHeatWaveFleetMetricRequest build() {
            GetHeatWaveFleetMetricRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetHeatWaveFleetMetricRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetHeatWaveFleetMetricRequest
         */
        public GetHeatWaveFleetMetricRequest buildWithoutInvocationCallback() {
            GetHeatWaveFleetMetricRequest request = new GetHeatWaveFleetMetricRequest();
            request.compartmentId = compartmentId;
            request.startTime = startTime;
            request.endTime = endTime;
            request.opcRequestId = opcRequestId;
            request.filterByMetricNames = filterByMetricNames;
            request.filterByHeatWaveStatus = filterByHeatWaveStatus;
            request.filterByHeatWaveShape = filterByHeatWaveShape;
            request.isHeatWaveLakehouseEnabled = isHeatWaveLakehouseEnabled;
            return request;
            // new GetHeatWaveFleetMetricRequest(compartmentId, startTime, endTime, opcRequestId,
            // filterByMetricNames, filterByHeatWaveStatus, filterByHeatWaveShape,
            // isHeatWaveLakehouseEnabled);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .startTime(startTime)
                .endTime(endTime)
                .opcRequestId(opcRequestId)
                .filterByMetricNames(filterByMetricNames)
                .filterByHeatWaveStatus(filterByHeatWaveStatus)
                .filterByHeatWaveShape(filterByHeatWaveShape)
                .isHeatWaveLakehouseEnabled(isHeatWaveLakehouseEnabled);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",filterByMetricNames=").append(String.valueOf(this.filterByMetricNames));
        sb.append(",filterByHeatWaveStatus=").append(String.valueOf(this.filterByHeatWaveStatus));
        sb.append(",filterByHeatWaveShape=").append(String.valueOf(this.filterByHeatWaveShape));
        sb.append(",isHeatWaveLakehouseEnabled=")
                .append(String.valueOf(this.isHeatWaveLakehouseEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetHeatWaveFleetMetricRequest)) {
            return false;
        }

        GetHeatWaveFleetMetricRequest other = (GetHeatWaveFleetMetricRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.filterByMetricNames, other.filterByMetricNames)
                && java.util.Objects.equals(
                        this.filterByHeatWaveStatus, other.filterByHeatWaveStatus)
                && java.util.Objects.equals(this.filterByHeatWaveShape, other.filterByHeatWaveShape)
                && java.util.Objects.equals(
                        this.isHeatWaveLakehouseEnabled, other.isHeatWaveLakehouseEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMetricNames == null
                                ? 43
                                : this.filterByMetricNames.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByHeatWaveStatus == null
                                ? 43
                                : this.filterByHeatWaveStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByHeatWaveShape == null
                                ? 43
                                : this.filterByHeatWaveShape.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveLakehouseEnabled == null
                                ? 43
                                : this.isHeatWaveLakehouseEnabled.hashCode());
        return result;
    }
}
