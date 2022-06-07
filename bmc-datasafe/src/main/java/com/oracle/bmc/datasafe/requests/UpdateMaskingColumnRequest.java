/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateMaskingColumnExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMaskingColumnRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateMaskingColumnRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails> {

    /**
     * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
     */
    private String maskingColumnKey;

    public String getMaskingColumnKey() {
        return maskingColumnKey;
    }
    /**
     * The OCID of the masking policy.
     */
    private String maskingPolicyId;

    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /**
     * Details to update a masking column.
     */
    private com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails updateMaskingColumnDetails;

    public com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails
            getUpdateMaskingColumnDetails() {
        return updateMaskingColumnDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails getBody$() {
        return updateMaskingColumnDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMaskingColumnRequest,
                    com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String maskingColumnKey = null;

        /**
         * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
         * @return this builder instance
         */
        public Builder maskingColumnKey(String maskingColumnKey) {
            this.maskingColumnKey = maskingColumnKey;
            return this;
        }

        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }

        private com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails
                updateMaskingColumnDetails = null;

        /**
         * Details to update a masking column.
         * @return this builder instance
         */
        public Builder updateMaskingColumnDetails(
                com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails
                        updateMaskingColumnDetails) {
            this.updateMaskingColumnDetails = updateMaskingColumnDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(UpdateMaskingColumnRequest o) {
            maskingColumnKey(o.getMaskingColumnKey());
            maskingPolicyId(o.getMaskingPolicyId());
            updateMaskingColumnDetails(o.getUpdateMaskingColumnDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMaskingColumnRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateMaskingColumnRequest
         */
        public UpdateMaskingColumnRequest build() {
            UpdateMaskingColumnRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateMaskingColumnDetails body) {
            updateMaskingColumnDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMaskingColumnRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMaskingColumnRequest
         */
        public UpdateMaskingColumnRequest buildWithoutInvocationCallback() {
            UpdateMaskingColumnRequest request = new UpdateMaskingColumnRequest();
            request.maskingColumnKey = maskingColumnKey;
            request.maskingPolicyId = maskingPolicyId;
            request.updateMaskingColumnDetails = updateMaskingColumnDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMaskingColumnRequest(maskingColumnKey, maskingPolicyId, updateMaskingColumnDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingColumnKey(maskingColumnKey)
                .maskingPolicyId(maskingPolicyId)
                .updateMaskingColumnDetails(updateMaskingColumnDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",maskingColumnKey=").append(String.valueOf(this.maskingColumnKey));
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",updateMaskingColumnDetails=")
                .append(String.valueOf(this.updateMaskingColumnDetails));
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
        if (!(o instanceof UpdateMaskingColumnRequest)) {
            return false;
        }

        UpdateMaskingColumnRequest other = (UpdateMaskingColumnRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingColumnKey, other.maskingColumnKey)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(
                        this.updateMaskingColumnDetails, other.updateMaskingColumnDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingColumnKey == null ? 43 : this.maskingColumnKey.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMaskingColumnDetails == null
                                ? 43
                                : this.updateMaskingColumnDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
