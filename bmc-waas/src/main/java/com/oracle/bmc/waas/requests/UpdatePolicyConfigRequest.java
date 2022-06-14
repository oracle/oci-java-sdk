/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/UpdatePolicyConfigExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePolicyConfigRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class UpdatePolicyConfigRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.waas.model.PolicyConfig> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    private String waasPolicyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
     */
    public String getWaasPolicyId() {
        return waasPolicyId;
    }
    /**
     * The new configuration to apply to a WAAS policy.
     */
    private com.oracle.bmc.waas.model.PolicyConfig updatePolicyConfigDetails;

    /**
     * The new configuration to apply to a WAAS policy.
     */
    public com.oracle.bmc.waas.model.PolicyConfig getUpdatePolicyConfigDetails() {
        return updatePolicyConfigDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
     * *Example:* If a resource has been deleted and purged from the system, then a retry of the original delete request may be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
     * *Example:* If a resource has been deleted and purged from the system, then a retry of the original delete request may be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.waas.model.PolicyConfig getBody$() {
        return updatePolicyConfigDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePolicyConfigRequest, com.oracle.bmc.waas.model.PolicyConfig> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
         */
        private String waasPolicyId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the WAAS policy.
         * @param waasPolicyId the value to set
         * @return this builder instance
         */
        public Builder waasPolicyId(String waasPolicyId) {
            this.waasPolicyId = waasPolicyId;
            return this;
        }

        /**
         * The new configuration to apply to a WAAS policy.
         */
        private com.oracle.bmc.waas.model.PolicyConfig updatePolicyConfigDetails = null;

        /**
         * The new configuration to apply to a WAAS policy.
         * @param updatePolicyConfigDetails the value to set
         * @return this builder instance
         */
        public Builder updatePolicyConfigDetails(
                com.oracle.bmc.waas.model.PolicyConfig updatePolicyConfigDetails) {
            this.updatePolicyConfigDetails = updatePolicyConfigDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
         * *Example:* If a resource has been deleted and purged from the system, then a retry of the original delete request may be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
         * *Example:* If a resource has been deleted and purged from the system, then a retry of the original delete request may be rejected.
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdatePolicyConfigRequest o) {
            waasPolicyId(o.getWaasPolicyId());
            updatePolicyConfigDetails(o.getUpdatePolicyConfigDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePolicyConfigRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePolicyConfigRequest
         */
        public UpdatePolicyConfigRequest build() {
            UpdatePolicyConfigRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.waas.model.PolicyConfig body) {
            updatePolicyConfigDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePolicyConfigRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePolicyConfigRequest
         */
        public UpdatePolicyConfigRequest buildWithoutInvocationCallback() {
            UpdatePolicyConfigRequest request = new UpdatePolicyConfigRequest();
            request.waasPolicyId = waasPolicyId;
            request.updatePolicyConfigDetails = updatePolicyConfigDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePolicyConfigRequest(waasPolicyId, updatePolicyConfigDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .waasPolicyId(waasPolicyId)
                .updatePolicyConfigDetails(updatePolicyConfigDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
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
        sb.append(",waasPolicyId=").append(String.valueOf(this.waasPolicyId));
        sb.append(",updatePolicyConfigDetails=")
                .append(String.valueOf(this.updatePolicyConfigDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePolicyConfigRequest)) {
            return false;
        }

        UpdatePolicyConfigRequest other = (UpdatePolicyConfigRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.waasPolicyId, other.waasPolicyId)
                && java.util.Objects.equals(
                        this.updatePolicyConfigDetails, other.updatePolicyConfigDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.waasPolicyId == null ? 43 : this.waasPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePolicyConfigDetails == null
                                ? 43
                                : this.updatePolicyConfigDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
