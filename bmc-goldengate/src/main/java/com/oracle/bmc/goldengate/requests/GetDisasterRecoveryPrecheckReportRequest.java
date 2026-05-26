/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/GetDisasterRecoveryPrecheckReportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDisasterRecoveryPrecheckReportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class GetDisasterRecoveryPrecheckReportRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A unique Deployment identifier. */
    private String deploymentId;

    /** A unique Deployment identifier. */
    public String getDeploymentId() {
        return deploymentId;
    }
    /** The availability domain of the placement to evaluate DR pre-checks for. */
    private String availabilityDomain;

    /** The availability domain of the placement to evaluate DR pre-checks for. */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /** The fault domain of the placement to evaluate DR pre-checks for. */
    private String faultDomain;

    /** The fault domain of the placement to evaluate DR pre-checks for. */
    public String getFaultDomain() {
        return faultDomain;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDisasterRecoveryPrecheckReportRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A unique Deployment identifier. */
        private String deploymentId = null;

        /**
         * A unique Deployment identifier.
         *
         * @param deploymentId the value to set
         * @return this builder instance
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /** The availability domain of the placement to evaluate DR pre-checks for. */
        private String availabilityDomain = null;

        /**
         * The availability domain of the placement to evaluate DR pre-checks for.
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /** The fault domain of the placement to evaluate DR pre-checks for. */
        private String faultDomain = null;

        /**
         * The fault domain of the placement to evaluate DR pre-checks for.
         *
         * @param faultDomain the value to set
         * @return this builder instance
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
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
        public Builder copy(GetDisasterRecoveryPrecheckReportRequest o) {
            deploymentId(o.getDeploymentId());
            availabilityDomain(o.getAvailabilityDomain());
            faultDomain(o.getFaultDomain());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDisasterRecoveryPrecheckReportRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDisasterRecoveryPrecheckReportRequest
         */
        public GetDisasterRecoveryPrecheckReportRequest build() {
            GetDisasterRecoveryPrecheckReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDisasterRecoveryPrecheckReportRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDisasterRecoveryPrecheckReportRequest
         */
        public GetDisasterRecoveryPrecheckReportRequest buildWithoutInvocationCallback() {
            GetDisasterRecoveryPrecheckReportRequest request =
                    new GetDisasterRecoveryPrecheckReportRequest();
            request.deploymentId = deploymentId;
            request.availabilityDomain = availabilityDomain;
            request.faultDomain = faultDomain;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDisasterRecoveryPrecheckReportRequest(deploymentId, availabilityDomain,
            // faultDomain, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .deploymentId(deploymentId)
                .availabilityDomain(availabilityDomain)
                .faultDomain(faultDomain)
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
        sb.append(",deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDisasterRecoveryPrecheckReportRequest)) {
            return false;
        }

        GetDisasterRecoveryPrecheckReportRequest other =
                (GetDisasterRecoveryPrecheckReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
