/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/RequestCryptoAnalysesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RequestCryptoAnalysesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class RequestCryptoAnalysesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    private String fleetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /** Detail information to start Crypto Analyses */
    private com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails requestCryptoAnalysesDetails;

    /** Detail information to start Crypto Analyses */
    public com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails getRequestCryptoAnalysesDetails() {
        return requestCryptoAnalysesDetails;
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
    public com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails getBody$() {
        return requestCryptoAnalysesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RequestCryptoAnalysesRequest,
                    com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        private String fleetId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /** Detail information to start Crypto Analyses */
        private com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails requestCryptoAnalysesDetails =
                null;

        /**
         * Detail information to start Crypto Analyses
         *
         * @param requestCryptoAnalysesDetails the value to set
         * @return this builder instance
         */
        public Builder requestCryptoAnalysesDetails(
                com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails
                        requestCryptoAnalysesDetails) {
            this.requestCryptoAnalysesDetails = requestCryptoAnalysesDetails;
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
        public Builder copy(RequestCryptoAnalysesRequest o) {
            fleetId(o.getFleetId());
            requestCryptoAnalysesDetails(o.getRequestCryptoAnalysesDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RequestCryptoAnalysesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RequestCryptoAnalysesRequest
         */
        public RequestCryptoAnalysesRequest build() {
            RequestCryptoAnalysesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.jms.model.RequestCryptoAnalysesDetails body) {
            requestCryptoAnalysesDetails(body);
            return this;
        }

        /**
         * Build the instance of RequestCryptoAnalysesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RequestCryptoAnalysesRequest
         */
        public RequestCryptoAnalysesRequest buildWithoutInvocationCallback() {
            RequestCryptoAnalysesRequest request = new RequestCryptoAnalysesRequest();
            request.fleetId = fleetId;
            request.requestCryptoAnalysesDetails = requestCryptoAnalysesDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new RequestCryptoAnalysesRequest(fleetId, requestCryptoAnalysesDetails,
            // opcRequestId);
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
                .requestCryptoAnalysesDetails(requestCryptoAnalysesDetails)
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
        sb.append(",requestCryptoAnalysesDetails=")
                .append(String.valueOf(this.requestCryptoAnalysesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestCryptoAnalysesRequest)) {
            return false;
        }

        RequestCryptoAnalysesRequest other = (RequestCryptoAnalysesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.requestCryptoAnalysesDetails, other.requestCryptoAnalysesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.requestCryptoAnalysesDetails == null
                                ? 43
                                : this.requestCryptoAnalysesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
