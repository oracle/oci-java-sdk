/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestPerformanceTuningAnalysesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestPerformanceTuningAnalysesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class RequestPerformanceTuningAnalysesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    private String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /** Detail information to start Performance Tuning Analyses */
    private com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails
            requestPerformanceTuningAnalysesDetails;

    /** Detail information to start Performance Tuning Analyses */
    public com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails
            getRequestPerformanceTuningAnalysesDetails() {
        return requestPerformanceTuningAnalysesDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails getBody$() {
        return requestPerformanceTuningAnalysesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestPerformanceTuningAnalysesRequest,
                    com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        private String fleetId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /** Detail information to start Performance Tuning Analyses */
        private com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails
                requestPerformanceTuningAnalysesDetails = null;

        /**
         * Detail information to start Performance Tuning Analyses
         *
         * @param requestPerformanceTuningAnalysesDetails the value to set
         * @return this builder instance
         */
        public Builder requestPerformanceTuningAnalysesDetails(
                com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails
                        requestPerformanceTuningAnalysesDetails) {
            this.requestPerformanceTuningAnalysesDetails = requestPerformanceTuningAnalysesDetails;
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
        public Builder copy(RequestPerformanceTuningAnalysesRequest o) {
            fleetId(o.getFleetId());
            requestPerformanceTuningAnalysesDetails(o.getRequestPerformanceTuningAnalysesDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestPerformanceTuningAnalysesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestPerformanceTuningAnalysesRequest
         */
        public RequestPerformanceTuningAnalysesRequest build() {
            RequestPerformanceTuningAnalysesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.jms.model.RequestPerformanceTuningAnalysesDetails body) {
            requestPerformanceTuningAnalysesDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestPerformanceTuningAnalysesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestPerformanceTuningAnalysesRequest
         */
        public RequestPerformanceTuningAnalysesRequest buildWithoutInvocationCallback() {
            RequestPerformanceTuningAnalysesRequest request =
                    new RequestPerformanceTuningAnalysesRequest();
            request.fleetId = fleetId;
            request.requestPerformanceTuningAnalysesDetails =
                    requestPerformanceTuningAnalysesDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestPerformanceTuningAnalysesRequest(fleetId,
            // requestPerformanceTuningAnalysesDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .requestPerformanceTuningAnalysesDetails(requestPerformanceTuningAnalysesDetails)
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
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",requestPerformanceTuningAnalysesDetails=")
                .append(String.valueOf(this.requestPerformanceTuningAnalysesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestPerformanceTuningAnalysesRequest)) {
            return false;
        }

        RequestPerformanceTuningAnalysesRequest other = (RequestPerformanceTuningAnalysesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.requestPerformanceTuningAnalysesDetails,
                        other.requestPerformanceTuningAnalysesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.requestPerformanceTuningAnalysesDetails == null
                                ? 43
                                : this.requestPerformanceTuningAnalysesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
