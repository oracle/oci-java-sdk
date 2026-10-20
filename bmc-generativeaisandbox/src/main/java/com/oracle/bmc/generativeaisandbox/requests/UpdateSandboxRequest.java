/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.requests;

import com.oracle.bmc.generativeaisandbox.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/UpdateSandboxExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSandboxRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class UpdateSandboxRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails> {

    /**
     * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
     * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
     */
    private String sandboxId;

    /**
     * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
     * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
     */
    public String getSandboxId() {
        return sandboxId;
    }
    /** Request payload for sandbox update. */
    private com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails updateSandboxDetails;

    /** Request payload for sandbox update. */
    public com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails getUpdateSandboxDetails() {
        return updateSandboxDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the etag provided matches the resource's
     * current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the etag provided matches the resource's
     * current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails getBody$() {
        return updateSandboxDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSandboxRequest,
                    com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
         * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
         */
        private String sandboxId = null;

        /**
         * Sandbox identifier. Newly generated Sandbox IDs use {@code sbx-} followed by 16 lowercase
         * base32 characters ({@code a-z2-7}); existing legacy IDs remain accepted.
         *
         * @param sandboxId the value to set
         * @return this builder instance
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            return this;
        }

        /** Request payload for sandbox update. */
        private com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails updateSandboxDetails =
                null;

        /**
         * Request payload for sandbox update.
         *
         * @param updateSandboxDetails the value to set
         * @return this builder instance
         */
        public Builder updateSandboxDetails(
                com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails
                        updateSandboxDetails) {
            this.updateSandboxDetails = updateSandboxDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the etag provided matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the etag provided matches
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
        public Builder copy(UpdateSandboxRequest o) {
            sandboxId(o.getSandboxId());
            updateSandboxDetails(o.getUpdateSandboxDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSandboxRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateSandboxRequest
         */
        public UpdateSandboxRequest build() {
            UpdateSandboxRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.generativeaisandbox.model.UpdateSandboxDetails body) {
            updateSandboxDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSandboxRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSandboxRequest
         */
        public UpdateSandboxRequest buildWithoutInvocationCallback() {
            UpdateSandboxRequest request = new UpdateSandboxRequest();
            request.sandboxId = sandboxId;
            request.updateSandboxDetails = updateSandboxDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateSandboxRequest(sandboxId, updateSandboxDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sandboxId(sandboxId)
                .updateSandboxDetails(updateSandboxDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",sandboxId=").append(String.valueOf(this.sandboxId));
        sb.append(",updateSandboxDetails=").append(String.valueOf(this.updateSandboxDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSandboxRequest)) {
            return false;
        }

        UpdateSandboxRequest other = (UpdateSandboxRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.updateSandboxDetails, other.updateSandboxDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSandboxDetails == null
                                ? 43
                                : this.updateSandboxDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
