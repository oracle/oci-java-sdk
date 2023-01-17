/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.requests;

import com.oracle.bmc.apmsynthetics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/GetMonitorResultExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMonitorResultRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetMonitorResultRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The APM domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * The APM domain ID the request is intended for.
     *
     */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * The OCID of the monitor.
     */
    private String monitorId;

    /**
     * The OCID of the monitor.
     */
    public String getMonitorId() {
        return monitorId;
    }
    /**
     * The vantagePoint name.
     *
     */
    private String vantagePoint;

    /**
     * The vantagePoint name.
     *
     */
    public String getVantagePoint() {
        return vantagePoint;
    }
    /**
     * The result type: har, screenshot, log, or network.
     *
     */
    private String resultType;

    /**
     * The result type: har, screenshot, log, or network.
     *
     */
    public String getResultType() {
        return resultType;
    }
    /**
     * The result content type: zip or raw.
     *
     */
    private String resultContentType;

    /**
     * The result content type: zip or raw.
     *
     */
    public String getResultContentType() {
        return resultContentType;
    }
    /**
     * The time the object was posted.
     *
     */
    private String executionTime;

    /**
     * The time the object was posted.
     *
     */
    public String getExecutionTime() {
        return executionTime;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMonitorResultRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The APM domain ID the request is intended for.
         *
         */
        private String apmDomainId = null;

        /**
         * The APM domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * The OCID of the monitor.
         */
        private String monitorId = null;

        /**
         * The OCID of the monitor.
         * @param monitorId the value to set
         * @return this builder instance
         */
        public Builder monitorId(String monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        /**
         * The vantagePoint name.
         *
         */
        private String vantagePoint = null;

        /**
         * The vantagePoint name.
         *
         * @param vantagePoint the value to set
         * @return this builder instance
         */
        public Builder vantagePoint(String vantagePoint) {
            this.vantagePoint = vantagePoint;
            return this;
        }

        /**
         * The result type: har, screenshot, log, or network.
         *
         */
        private String resultType = null;

        /**
         * The result type: har, screenshot, log, or network.
         *
         * @param resultType the value to set
         * @return this builder instance
         */
        public Builder resultType(String resultType) {
            this.resultType = resultType;
            return this;
        }

        /**
         * The result content type: zip or raw.
         *
         */
        private String resultContentType = null;

        /**
         * The result content type: zip or raw.
         *
         * @param resultContentType the value to set
         * @return this builder instance
         */
        public Builder resultContentType(String resultContentType) {
            this.resultContentType = resultContentType;
            return this;
        }

        /**
         * The time the object was posted.
         *
         */
        private String executionTime = null;

        /**
         * The time the object was posted.
         *
         * @param executionTime the value to set
         * @return this builder instance
         */
        public Builder executionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(GetMonitorResultRequest o) {
            apmDomainId(o.getApmDomainId());
            monitorId(o.getMonitorId());
            vantagePoint(o.getVantagePoint());
            resultType(o.getResultType());
            resultContentType(o.getResultContentType());
            executionTime(o.getExecutionTime());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMonitorResultRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMonitorResultRequest
         */
        public GetMonitorResultRequest build() {
            GetMonitorResultRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMonitorResultRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMonitorResultRequest
         */
        public GetMonitorResultRequest buildWithoutInvocationCallback() {
            GetMonitorResultRequest request = new GetMonitorResultRequest();
            request.apmDomainId = apmDomainId;
            request.monitorId = monitorId;
            request.vantagePoint = vantagePoint;
            request.resultType = resultType;
            request.resultContentType = resultContentType;
            request.executionTime = executionTime;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetMonitorResultRequest(apmDomainId, monitorId, vantagePoint, resultType, resultContentType, executionTime, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .monitorId(monitorId)
                .vantagePoint(vantagePoint)
                .resultType(resultType)
                .resultContentType(resultContentType)
                .executionTime(executionTime)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",monitorId=").append(String.valueOf(this.monitorId));
        sb.append(",vantagePoint=").append(String.valueOf(this.vantagePoint));
        sb.append(",resultType=").append(String.valueOf(this.resultType));
        sb.append(",resultContentType=").append(String.valueOf(this.resultContentType));
        sb.append(",executionTime=").append(String.valueOf(this.executionTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMonitorResultRequest)) {
            return false;
        }

        GetMonitorResultRequest other = (GetMonitorResultRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.monitorId, other.monitorId)
                && java.util.Objects.equals(this.vantagePoint, other.vantagePoint)
                && java.util.Objects.equals(this.resultType, other.resultType)
                && java.util.Objects.equals(this.resultContentType, other.resultContentType)
                && java.util.Objects.equals(this.executionTime, other.executionTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.monitorId == null ? 43 : this.monitorId.hashCode());
        result = (result * PRIME) + (this.vantagePoint == null ? 43 : this.vantagePoint.hashCode());
        result = (result * PRIME) + (this.resultType == null ? 43 : this.resultType.hashCode());
        result =
                (result * PRIME)
                        + (this.resultContentType == null ? 43 : this.resultContentType.hashCode());
        result =
                (result * PRIME)
                        + (this.executionTime == null ? 43 : this.executionTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
