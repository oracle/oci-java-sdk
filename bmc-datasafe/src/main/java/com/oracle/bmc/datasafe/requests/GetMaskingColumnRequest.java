/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetMaskingColumnExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMaskingColumnRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetMaskingColumnRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
     */
    private String maskingColumnKey;

    /**
     * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
     */
    public String getMaskingColumnKey() {
        return maskingColumnKey;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMaskingColumnRequest, java.lang.Void> {
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
         * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
         */
        private String maskingColumnKey = null;

        /**
         * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
         * @param maskingColumnKey the value to set
         * @return this builder instance
         */
        public Builder maskingColumnKey(String maskingColumnKey) {
            this.maskingColumnKey = maskingColumnKey;
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
        public Builder copy(GetMaskingColumnRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            maskingColumnKey(o.getMaskingColumnKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMaskingColumnRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMaskingColumnRequest
         */
        public GetMaskingColumnRequest build() {
            GetMaskingColumnRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMaskingColumnRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMaskingColumnRequest
         */
        public GetMaskingColumnRequest buildWithoutInvocationCallback() {
            GetMaskingColumnRequest request = new GetMaskingColumnRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.maskingColumnKey = maskingColumnKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetMaskingColumnRequest(maskingPolicyId, maskingColumnKey, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingPolicyId(maskingPolicyId)
                .maskingColumnKey(maskingColumnKey)
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
        sb.append(",maskingColumnKey=").append(String.valueOf(this.maskingColumnKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaskingColumnRequest)) {
            return false;
        }

        GetMaskingColumnRequest other = (GetMaskingColumnRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.maskingColumnKey, other.maskingColumnKey)
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
                        + (this.maskingColumnKey == null ? 43 : this.maskingColumnKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
