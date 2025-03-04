/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.requests;

import com.oracle.bmc.streaming.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/ChangeConnectHarnessCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeConnectHarnessCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class ChangeConnectHarnessCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails> {

    /** The OCID of the connect harness. */
    private String connectHarnessId;

    /** The OCID of the connect harness. */
    public String getConnectHarnessId() {
        return connectHarnessId;
    }
    /** The connect harness will be moved into the compartment specified within this entity. */
    private com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails
            changeConnectHarnessCompartmentDetails;

    /** The connect harness will be moved into the compartment specified within this entity. */
    public com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails
            getChangeConnectHarnessCompartmentDetails() {
        return changeConnectHarnessCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails getBody$() {
        return changeConnectHarnessCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeConnectHarnessCompartmentRequest,
                    com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the connect harness. */
        private String connectHarnessId = null;

        /**
         * The OCID of the connect harness.
         *
         * @param connectHarnessId the value to set
         * @return this builder instance
         */
        public Builder connectHarnessId(String connectHarnessId) {
            this.connectHarnessId = connectHarnessId;
            return this;
        }

        /** The connect harness will be moved into the compartment specified within this entity. */
        private com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails
                changeConnectHarnessCompartmentDetails = null;

        /**
         * The connect harness will be moved into the compartment specified within this entity.
         *
         * @param changeConnectHarnessCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeConnectHarnessCompartmentDetails(
                com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails
                        changeConnectHarnessCompartmentDetails) {
            this.changeConnectHarnessCompartmentDetails = changeConnectHarnessCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(ChangeConnectHarnessCompartmentRequest o) {
            connectHarnessId(o.getConnectHarnessId());
            changeConnectHarnessCompartmentDetails(o.getChangeConnectHarnessCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeConnectHarnessCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeConnectHarnessCompartmentRequest
         */
        public ChangeConnectHarnessCompartmentRequest build() {
            ChangeConnectHarnessCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.streaming.model.ChangeConnectHarnessCompartmentDetails body) {
            changeConnectHarnessCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeConnectHarnessCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeConnectHarnessCompartmentRequest
         */
        public ChangeConnectHarnessCompartmentRequest buildWithoutInvocationCallback() {
            ChangeConnectHarnessCompartmentRequest request =
                    new ChangeConnectHarnessCompartmentRequest();
            request.connectHarnessId = connectHarnessId;
            request.changeConnectHarnessCompartmentDetails = changeConnectHarnessCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeConnectHarnessCompartmentRequest(connectHarnessId,
            // changeConnectHarnessCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .connectHarnessId(connectHarnessId)
                .changeConnectHarnessCompartmentDetails(changeConnectHarnessCompartmentDetails)
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
        sb.append(",connectHarnessId=").append(String.valueOf(this.connectHarnessId));
        sb.append(",changeConnectHarnessCompartmentDetails=")
                .append(String.valueOf(this.changeConnectHarnessCompartmentDetails));
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
        if (!(o instanceof ChangeConnectHarnessCompartmentRequest)) {
            return false;
        }

        ChangeConnectHarnessCompartmentRequest other = (ChangeConnectHarnessCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.connectHarnessId, other.connectHarnessId)
                && java.util.Objects.equals(
                        this.changeConnectHarnessCompartmentDetails,
                        other.changeConnectHarnessCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectHarnessId == null ? 43 : this.connectHarnessId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeConnectHarnessCompartmentDetails == null
                                ? 43
                                : this.changeConnectHarnessCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
