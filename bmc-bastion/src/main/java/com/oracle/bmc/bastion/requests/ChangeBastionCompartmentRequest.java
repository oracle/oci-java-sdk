/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.requests;

import com.oracle.bmc.bastion.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bastion/ChangeBastionCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeBastionCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
public class ChangeBastionCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails> {

    /** The unique identifier (OCID) of the bastion. */
    private String bastionId;

    /** The unique identifier (OCID) of the bastion. */
    public String getBastionId() {
        return bastionId;
    }
    /** The compartment information to be updated. */
    private com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails
            changeBastionCompartmentDetails;

    /** The compartment information to be updated. */
    public com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails
            getChangeBastionCompartmentDetails() {
        return changeBastionCompartmentDetails;
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
    public com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails getBody$() {
        return changeBastionCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeBastionCompartmentRequest,
                    com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier (OCID) of the bastion. */
        private String bastionId = null;

        /**
         * The unique identifier (OCID) of the bastion.
         *
         * @param bastionId the value to set
         * @return this builder instance
         */
        public Builder bastionId(String bastionId) {
            this.bastionId = bastionId;
            return this;
        }

        /** The compartment information to be updated. */
        private com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails
                changeBastionCompartmentDetails = null;

        /**
         * The compartment information to be updated.
         *
         * @param changeBastionCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeBastionCompartmentDetails(
                com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails
                        changeBastionCompartmentDetails) {
            this.changeBastionCompartmentDetails = changeBastionCompartmentDetails;
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
        public Builder copy(ChangeBastionCompartmentRequest o) {
            bastionId(o.getBastionId());
            changeBastionCompartmentDetails(o.getChangeBastionCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeBastionCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeBastionCompartmentRequest
         */
        public ChangeBastionCompartmentRequest build() {
            ChangeBastionCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.bastion.model.ChangeBastionCompartmentDetails body) {
            changeBastionCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeBastionCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeBastionCompartmentRequest
         */
        public ChangeBastionCompartmentRequest buildWithoutInvocationCallback() {
            ChangeBastionCompartmentRequest request = new ChangeBastionCompartmentRequest();
            request.bastionId = bastionId;
            request.changeBastionCompartmentDetails = changeBastionCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeBastionCompartmentRequest(bastionId, changeBastionCompartmentDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bastionId(bastionId)
                .changeBastionCompartmentDetails(changeBastionCompartmentDetails)
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
        sb.append(",bastionId=").append(String.valueOf(this.bastionId));
        sb.append(",changeBastionCompartmentDetails=")
                .append(String.valueOf(this.changeBastionCompartmentDetails));
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
        if (!(o instanceof ChangeBastionCompartmentRequest)) {
            return false;
        }

        ChangeBastionCompartmentRequest other = (ChangeBastionCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bastionId, other.bastionId)
                && java.util.Objects.equals(
                        this.changeBastionCompartmentDetails, other.changeBastionCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bastionId == null ? 43 : this.bastionId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBastionCompartmentDetails == null
                                ? 43
                                : this.changeBastionCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
