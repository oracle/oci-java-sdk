/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateUnifiedAuditPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateUnifiedAuditPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateUnifiedAuditPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails> {

    /** The OCID of the Unified Audit policy resource. */
    private String unifiedAuditPolicyId;

    /** The OCID of the Unified Audit policy resource. */
    public String getUnifiedAuditPolicyId() {
        return unifiedAuditPolicyId;
    }
    /** Details required to update the Unified Audit policy. */
    private com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails
            updateUnifiedAuditPolicyDetails;

    /** Details required to update the Unified Audit policy. */
    public com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails
            getUpdateUnifiedAuditPolicyDetails() {
        return updateUnifiedAuditPolicyDetails;
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
    public com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails getBody$() {
        return updateUnifiedAuditPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateUnifiedAuditPolicyRequest,
                    com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Unified Audit policy resource. */
        private String unifiedAuditPolicyId = null;

        /**
         * The OCID of the Unified Audit policy resource.
         *
         * @param unifiedAuditPolicyId the value to set
         * @return this builder instance
         */
        public Builder unifiedAuditPolicyId(String unifiedAuditPolicyId) {
            this.unifiedAuditPolicyId = unifiedAuditPolicyId;
            return this;
        }

        /** Details required to update the Unified Audit policy. */
        private com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails
                updateUnifiedAuditPolicyDetails = null;

        /**
         * Details required to update the Unified Audit policy.
         *
         * @param updateUnifiedAuditPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateUnifiedAuditPolicyDetails(
                com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails
                        updateUnifiedAuditPolicyDetails) {
            this.updateUnifiedAuditPolicyDetails = updateUnifiedAuditPolicyDetails;
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
        public Builder copy(UpdateUnifiedAuditPolicyRequest o) {
            unifiedAuditPolicyId(o.getUnifiedAuditPolicyId());
            updateUnifiedAuditPolicyDetails(o.getUpdateUnifiedAuditPolicyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateUnifiedAuditPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateUnifiedAuditPolicyRequest
         */
        public UpdateUnifiedAuditPolicyRequest build() {
            UpdateUnifiedAuditPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateUnifiedAuditPolicyDetails body) {
            updateUnifiedAuditPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateUnifiedAuditPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateUnifiedAuditPolicyRequest
         */
        public UpdateUnifiedAuditPolicyRequest buildWithoutInvocationCallback() {
            UpdateUnifiedAuditPolicyRequest request = new UpdateUnifiedAuditPolicyRequest();
            request.unifiedAuditPolicyId = unifiedAuditPolicyId;
            request.updateUnifiedAuditPolicyDetails = updateUnifiedAuditPolicyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateUnifiedAuditPolicyRequest(unifiedAuditPolicyId,
            // updateUnifiedAuditPolicyDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .unifiedAuditPolicyId(unifiedAuditPolicyId)
                .updateUnifiedAuditPolicyDetails(updateUnifiedAuditPolicyDetails)
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
        sb.append(",unifiedAuditPolicyId=").append(String.valueOf(this.unifiedAuditPolicyId));
        sb.append(",updateUnifiedAuditPolicyDetails=")
                .append(String.valueOf(this.updateUnifiedAuditPolicyDetails));
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
        if (!(o instanceof UpdateUnifiedAuditPolicyRequest)) {
            return false;
        }

        UpdateUnifiedAuditPolicyRequest other = (UpdateUnifiedAuditPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.unifiedAuditPolicyId, other.unifiedAuditPolicyId)
                && java.util.Objects.equals(
                        this.updateUnifiedAuditPolicyDetails, other.updateUnifiedAuditPolicyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.unifiedAuditPolicyId == null
                                ? 43
                                : this.unifiedAuditPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateUnifiedAuditPolicyDetails == null
                                ? 43
                                : this.updateUnifiedAuditPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
