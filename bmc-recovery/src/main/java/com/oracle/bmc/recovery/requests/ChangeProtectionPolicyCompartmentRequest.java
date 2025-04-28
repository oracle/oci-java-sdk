/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.requests;

import com.oracle.bmc.recovery.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/recovery/ChangeProtectionPolicyCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeProtectionPolicyCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
public class ChangeProtectionPolicyCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails> {

    /** The protection policy OCID. */
    private String protectionPolicyId;

    /** The protection policy OCID. */
    public String getProtectionPolicyId() {
        return protectionPolicyId;
    }
    /**
     * The configuration details required to move a protection policy from the existing compartment
     * to a specified compartment.
     */
    private com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails
            changeProtectionPolicyCompartmentDetails;

    /**
     * The configuration details required to move a protection policy from the existing compartment
     * to a specified compartment.
     */
    public com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails
            getChangeProtectionPolicyCompartmentDetails() {
        return changeProtectionPolicyCompartmentDetails;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails getBody$() {
        return changeProtectionPolicyCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeProtectionPolicyCompartmentRequest,
                    com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The protection policy OCID. */
        private String protectionPolicyId = null;

        /**
         * The protection policy OCID.
         *
         * @param protectionPolicyId the value to set
         * @return this builder instance
         */
        public Builder protectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }

        /**
         * The configuration details required to move a protection policy from the existing
         * compartment to a specified compartment.
         */
        private com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails
                changeProtectionPolicyCompartmentDetails = null;

        /**
         * The configuration details required to move a protection policy from the existing
         * compartment to a specified compartment.
         *
         * @param changeProtectionPolicyCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeProtectionPolicyCompartmentDetails(
                com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails
                        changeProtectionPolicyCompartmentDetails) {
            this.changeProtectionPolicyCompartmentDetails =
                    changeProtectionPolicyCompartmentDetails;
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

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ChangeProtectionPolicyCompartmentRequest o) {
            protectionPolicyId(o.getProtectionPolicyId());
            changeProtectionPolicyCompartmentDetails(
                    o.getChangeProtectionPolicyCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeProtectionPolicyCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeProtectionPolicyCompartmentRequest
         */
        public ChangeProtectionPolicyCompartmentRequest build() {
            ChangeProtectionPolicyCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.recovery.model.ChangeProtectionPolicyCompartmentDetails body) {
            changeProtectionPolicyCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeProtectionPolicyCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeProtectionPolicyCompartmentRequest
         */
        public ChangeProtectionPolicyCompartmentRequest buildWithoutInvocationCallback() {
            ChangeProtectionPolicyCompartmentRequest request =
                    new ChangeProtectionPolicyCompartmentRequest();
            request.protectionPolicyId = protectionPolicyId;
            request.changeProtectionPolicyCompartmentDetails =
                    changeProtectionPolicyCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeProtectionPolicyCompartmentRequest(protectionPolicyId,
            // changeProtectionPolicyCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .protectionPolicyId(protectionPolicyId)
                .changeProtectionPolicyCompartmentDetails(changeProtectionPolicyCompartmentDetails)
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
        sb.append(",protectionPolicyId=").append(String.valueOf(this.protectionPolicyId));
        sb.append(",changeProtectionPolicyCompartmentDetails=")
                .append(String.valueOf(this.changeProtectionPolicyCompartmentDetails));
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
        if (!(o instanceof ChangeProtectionPolicyCompartmentRequest)) {
            return false;
        }

        ChangeProtectionPolicyCompartmentRequest other =
                (ChangeProtectionPolicyCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.protectionPolicyId, other.protectionPolicyId)
                && java.util.Objects.equals(
                        this.changeProtectionPolicyCompartmentDetails,
                        other.changeProtectionPolicyCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.protectionPolicyId == null
                                ? 43
                                : this.protectionPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeProtectionPolicyCompartmentDetails == null
                                ? 43
                                : this.changeProtectionPolicyCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
