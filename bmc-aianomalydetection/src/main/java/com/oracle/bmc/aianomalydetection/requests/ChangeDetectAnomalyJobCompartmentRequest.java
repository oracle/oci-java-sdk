/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.requests;

import com.oracle.bmc.aianomalydetection.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aianomalydetection/ChangeDetectAnomalyJobCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeDetectAnomalyJobCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class ChangeDetectAnomalyJobCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails> {

    /** Unique asynchronous job identifier. */
    private String detectAnomalyJobId;

    /** Unique asynchronous job identifier. */
    public String getDetectAnomalyJobId() {
        return detectAnomalyJobId;
    }
    /** The details to change the compartment of the async anomaly detect job. */
    private com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails
            changeDetectAnomalyJobCompartmentDetails;

    /** The details to change the compartment of the async anomaly detect job. */
    public com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails
            getChangeDetectAnomalyJobCompartmentDetails() {
        return changeDetectAnomalyJobCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails
            getBody$() {
        return changeDetectAnomalyJobCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDetectAnomalyJobCompartmentRequest,
                    com.oracle.bmc.aianomalydetection.model
                            .ChangeDetectAnomalyJobCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique asynchronous job identifier. */
        private String detectAnomalyJobId = null;

        /**
         * Unique asynchronous job identifier.
         *
         * @param detectAnomalyJobId the value to set
         * @return this builder instance
         */
        public Builder detectAnomalyJobId(String detectAnomalyJobId) {
            this.detectAnomalyJobId = detectAnomalyJobId;
            return this;
        }

        /** The details to change the compartment of the async anomaly detect job. */
        private com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails
                changeDetectAnomalyJobCompartmentDetails = null;

        /**
         * The details to change the compartment of the async anomaly detect job.
         *
         * @param changeDetectAnomalyJobCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDetectAnomalyJobCompartmentDetails(
                com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails
                        changeDetectAnomalyJobCompartmentDetails) {
            this.changeDetectAnomalyJobCompartmentDetails =
                    changeDetectAnomalyJobCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeDetectAnomalyJobCompartmentRequest o) {
            detectAnomalyJobId(o.getDetectAnomalyJobId());
            changeDetectAnomalyJobCompartmentDetails(
                    o.getChangeDetectAnomalyJobCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDetectAnomalyJobCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeDetectAnomalyJobCompartmentRequest
         */
        public ChangeDetectAnomalyJobCompartmentRequest build() {
            ChangeDetectAnomalyJobCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.aianomalydetection.model.ChangeDetectAnomalyJobCompartmentDetails
                        body) {
            changeDetectAnomalyJobCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDetectAnomalyJobCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDetectAnomalyJobCompartmentRequest
         */
        public ChangeDetectAnomalyJobCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDetectAnomalyJobCompartmentRequest request =
                    new ChangeDetectAnomalyJobCompartmentRequest();
            request.detectAnomalyJobId = detectAnomalyJobId;
            request.changeDetectAnomalyJobCompartmentDetails =
                    changeDetectAnomalyJobCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeDetectAnomalyJobCompartmentRequest(detectAnomalyJobId,
            // changeDetectAnomalyJobCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .detectAnomalyJobId(detectAnomalyJobId)
                .changeDetectAnomalyJobCompartmentDetails(changeDetectAnomalyJobCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",detectAnomalyJobId=").append(String.valueOf(this.detectAnomalyJobId));
        sb.append(",changeDetectAnomalyJobCompartmentDetails=")
                .append(String.valueOf(this.changeDetectAnomalyJobCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDetectAnomalyJobCompartmentRequest)) {
            return false;
        }

        ChangeDetectAnomalyJobCompartmentRequest other =
                (ChangeDetectAnomalyJobCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.detectAnomalyJobId, other.detectAnomalyJobId)
                && java.util.Objects.equals(
                        this.changeDetectAnomalyJobCompartmentDetails,
                        other.changeDetectAnomalyJobCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.detectAnomalyJobId == null
                                ? 43
                                : this.detectAnomalyJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDetectAnomalyJobCompartmentDetails == null
                                ? 43
                                : this.changeDetectAnomalyJobCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
