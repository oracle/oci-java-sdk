/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.requests;

import com.oracle.bmc.apmsynthetics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmsynthetics/CreateWorkerExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateWorkerRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class CreateWorkerRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails> {

    /** The APM domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The OCID of the On-premise vantage point. */
    private String onPremiseVantagePointId;

    /** The OCID of the On-premise vantage point. */
    public String getOnPremiseVantagePointId() {
        return onPremiseVantagePointId;
    }
    /** The configuration details for registering a worker for an On-premise vantage point. */
    private com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails createWorkerDetails;

    /** The configuration details for registering a worker for an On-premise vantage point. */
    public com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails getCreateWorkerDetails() {
        return createWorkerDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
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
    public com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails getBody$() {
        return createWorkerDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateWorkerRequest, com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM domain ID the request is intended for. */
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

        /** The OCID of the On-premise vantage point. */
        private String onPremiseVantagePointId = null;

        /**
         * The OCID of the On-premise vantage point.
         *
         * @param onPremiseVantagePointId the value to set
         * @return this builder instance
         */
        public Builder onPremiseVantagePointId(String onPremiseVantagePointId) {
            this.onPremiseVantagePointId = onPremiseVantagePointId;
            return this;
        }

        /** The configuration details for registering a worker for an On-premise vantage point. */
        private com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails createWorkerDetails = null;

        /**
         * The configuration details for registering a worker for an On-premise vantage point.
         *
         * @param createWorkerDetails the value to set
         * @return this builder instance
         */
        public Builder createWorkerDetails(
                com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails createWorkerDetails) {
            this.createWorkerDetails = createWorkerDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(CreateWorkerRequest o) {
            apmDomainId(o.getApmDomainId());
            onPremiseVantagePointId(o.getOnPremiseVantagePointId());
            createWorkerDetails(o.getCreateWorkerDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateWorkerRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateWorkerRequest
         */
        public CreateWorkerRequest build() {
            CreateWorkerRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmsynthetics.model.CreateWorkerDetails body) {
            createWorkerDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateWorkerRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateWorkerRequest
         */
        public CreateWorkerRequest buildWithoutInvocationCallback() {
            CreateWorkerRequest request = new CreateWorkerRequest();
            request.apmDomainId = apmDomainId;
            request.onPremiseVantagePointId = onPremiseVantagePointId;
            request.createWorkerDetails = createWorkerDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateWorkerRequest(apmDomainId, onPremiseVantagePointId, createWorkerDetails,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .onPremiseVantagePointId(onPremiseVantagePointId)
                .createWorkerDetails(createWorkerDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",onPremiseVantagePointId=").append(String.valueOf(this.onPremiseVantagePointId));
        sb.append(",createWorkerDetails=").append(String.valueOf(this.createWorkerDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWorkerRequest)) {
            return false;
        }

        CreateWorkerRequest other = (CreateWorkerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.onPremiseVantagePointId, other.onPremiseVantagePointId)
                && java.util.Objects.equals(this.createWorkerDetails, other.createWorkerDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.onPremiseVantagePointId == null
                                ? 43
                                : this.onPremiseVantagePointId.hashCode());
        result =
                (result * PRIME)
                        + (this.createWorkerDetails == null
                                ? 43
                                : this.createWorkerDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
