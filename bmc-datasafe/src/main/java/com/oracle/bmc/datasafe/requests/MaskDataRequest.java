/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/MaskDataExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use MaskDataRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class MaskDataRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.datasafe.model.MaskDataDetails> {

    /**
     * The OCID of the masking policy.
     */
    private String maskingPolicyId;

    /**
     * The OCID of the masking policy.
     */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /**
     * Details to mask data.
     */
    private com.oracle.bmc.datasafe.model.MaskDataDetails maskDataDetails;

    /**
     * Details to mask data.
     */
    public com.oracle.bmc.datasafe.model.MaskDataDetails getMaskDataDetails() {
        return maskDataDetails;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.MaskDataDetails getBody$() {
        return maskDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    MaskDataRequest, com.oracle.bmc.datasafe.model.MaskDataDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the masking policy.
         */
        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         * @param maskingPolicyId the value to set
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }

        /**
         * Details to mask data.
         */
        private com.oracle.bmc.datasafe.model.MaskDataDetails maskDataDetails = null;

        /**
         * Details to mask data.
         * @param maskDataDetails the value to set
         * @return this builder instance
         */
        public Builder maskDataDetails(
                com.oracle.bmc.datasafe.model.MaskDataDetails maskDataDetails) {
            this.maskDataDetails = maskDataDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(MaskDataRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            maskDataDetails(o.getMaskDataDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of MaskDataRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of MaskDataRequest
         */
        public MaskDataRequest build() {
            MaskDataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.datasafe.model.MaskDataDetails body) {
            maskDataDetails(body);
            return this;
        }

        /**
         * Build the instance of MaskDataRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of MaskDataRequest
         */
        public MaskDataRequest buildWithoutInvocationCallback() {
            MaskDataRequest request = new MaskDataRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.maskDataDetails = maskDataDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new MaskDataRequest(maskingPolicyId, maskDataDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingPolicyId(maskingPolicyId)
                .maskDataDetails(maskDataDetails)
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
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",maskDataDetails=").append(String.valueOf(this.maskDataDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskDataRequest)) {
            return false;
        }

        MaskDataRequest other = (MaskDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.maskDataDetails, other.maskDataDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskDataDetails == null ? 43 : this.maskDataDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
