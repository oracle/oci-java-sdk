/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/GetEventReportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetEventReportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class GetEventReportRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Instance Oracle Cloud identifier (ocid) */
    private String managedInstanceId;

    /** Instance Oracle Cloud identifier (ocid) */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
     * format Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date latestTimestampLessThan;

    /**
     * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
     * format Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getLatestTimestampLessThan() {
        return latestTimestampLessThan;
    }
    /**
     * filter event occurrence. Selecting only those last occurred on or after given date in ISO
     * 8601 format Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date latestTimestampGreaterThanOrEqualTo;

    /**
     * filter event occurrence. Selecting only those last occurred on or after given date in ISO
     * 8601 format Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getLatestTimestampGreaterThanOrEqualTo() {
        return latestTimestampGreaterThanOrEqualTo;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetEventReportRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Instance Oracle Cloud identifier (ocid) */
        private String managedInstanceId = null;

        /**
         * Instance Oracle Cloud identifier (ocid)
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
         * format Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date latestTimestampLessThan = null;

        /**
         * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
         * format Example: 2017-07-14T02:40:00.000Z
         *
         * @param latestTimestampLessThan the value to set
         * @return this builder instance
         */
        public Builder latestTimestampLessThan(java.util.Date latestTimestampLessThan) {
            this.latestTimestampLessThan = latestTimestampLessThan;
            return this;
        }

        /**
         * filter event occurrence. Selecting only those last occurred on or after given date in ISO
         * 8601 format Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date latestTimestampGreaterThanOrEqualTo = null;

        /**
         * filter event occurrence. Selecting only those last occurred on or after given date in ISO
         * 8601 format Example: 2017-07-14T02:40:00.000Z
         *
         * @param latestTimestampGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder latestTimestampGreaterThanOrEqualTo(
                java.util.Date latestTimestampGreaterThanOrEqualTo) {
            this.latestTimestampGreaterThanOrEqualTo = latestTimestampGreaterThanOrEqualTo;
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
        public Builder copy(GetEventReportRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            compartmentId(o.getCompartmentId());
            latestTimestampLessThan(o.getLatestTimestampLessThan());
            latestTimestampGreaterThanOrEqualTo(o.getLatestTimestampGreaterThanOrEqualTo());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetEventReportRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetEventReportRequest
         */
        public GetEventReportRequest build() {
            GetEventReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetEventReportRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetEventReportRequest
         */
        public GetEventReportRequest buildWithoutInvocationCallback() {
            GetEventReportRequest request = new GetEventReportRequest();
            request.managedInstanceId = managedInstanceId;
            request.compartmentId = compartmentId;
            request.latestTimestampLessThan = latestTimestampLessThan;
            request.latestTimestampGreaterThanOrEqualTo = latestTimestampGreaterThanOrEqualTo;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetEventReportRequest(managedInstanceId, compartmentId, latestTimestampLessThan,
            // latestTimestampGreaterThanOrEqualTo, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .compartmentId(compartmentId)
                .latestTimestampLessThan(latestTimestampLessThan)
                .latestTimestampGreaterThanOrEqualTo(latestTimestampGreaterThanOrEqualTo)
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",latestTimestampLessThan=").append(String.valueOf(this.latestTimestampLessThan));
        sb.append(",latestTimestampGreaterThanOrEqualTo=")
                .append(String.valueOf(this.latestTimestampGreaterThanOrEqualTo));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetEventReportRequest)) {
            return false;
        }

        GetEventReportRequest other = (GetEventReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.latestTimestampLessThan, other.latestTimestampLessThan)
                && java.util.Objects.equals(
                        this.latestTimestampGreaterThanOrEqualTo,
                        other.latestTimestampGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.latestTimestampLessThan == null
                                ? 43
                                : this.latestTimestampLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.latestTimestampGreaterThanOrEqualTo == null
                                ? 43
                                : this.latestTimestampGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
