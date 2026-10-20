/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.requests;

import com.oracle.bmc.generativeaisandbox.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaisandbox/CancelSandboxCommandExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CancelSandboxCommandRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class CancelSandboxCommandRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails> {

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
    /** Sandbox command identifier. */
    private String commandId;

    /** Sandbox command identifier. */
    public String getCommandId() {
        return commandId;
    }
    /** Request payload for canceling a sandbox command. */
    private com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails
            cancelSandboxCommandDetails;

    /** Request payload for canceling a sandbox command. */
    public com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails
            getCancelSandboxCommandDetails() {
        return cancelSandboxCommandDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and removed from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails getBody$() {
        return cancelSandboxCommandDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CancelSandboxCommandRequest,
                    com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails> {
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

        /** Sandbox command identifier. */
        private String commandId = null;

        /**
         * Sandbox command identifier.
         *
         * @param commandId the value to set
         * @return this builder instance
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /** Request payload for canceling a sandbox command. */
        private com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails
                cancelSandboxCommandDetails = null;

        /**
         * Request payload for canceling a sandbox command.
         *
         * @param cancelSandboxCommandDetails the value to set
         * @return this builder instance
         */
        public Builder cancelSandboxCommandDetails(
                com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails
                        cancelSandboxCommandDetails) {
            this.cancelSandboxCommandDetails = cancelSandboxCommandDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if
         * a resource has been deleted and removed from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if
         * a resource has been deleted and removed from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CancelSandboxCommandRequest o) {
            sandboxId(o.getSandboxId());
            commandId(o.getCommandId());
            cancelSandboxCommandDetails(o.getCancelSandboxCommandDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CancelSandboxCommandRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CancelSandboxCommandRequest
         */
        public CancelSandboxCommandRequest build() {
            CancelSandboxCommandRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.generativeaisandbox.model.CancelSandboxCommandDetails body) {
            cancelSandboxCommandDetails(body);
            return this;
        }

        /**
         * Build the instance of CancelSandboxCommandRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CancelSandboxCommandRequest
         */
        public CancelSandboxCommandRequest buildWithoutInvocationCallback() {
            CancelSandboxCommandRequest request = new CancelSandboxCommandRequest();
            request.sandboxId = sandboxId;
            request.commandId = commandId;
            request.cancelSandboxCommandDetails = cancelSandboxCommandDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CancelSandboxCommandRequest(sandboxId, commandId, cancelSandboxCommandDetails,
            // opcRequestId, opcRetryToken);
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
                .commandId(commandId)
                .cancelSandboxCommandDetails(cancelSandboxCommandDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",commandId=").append(String.valueOf(this.commandId));
        sb.append(",cancelSandboxCommandDetails=")
                .append(String.valueOf(this.cancelSandboxCommandDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelSandboxCommandRequest)) {
            return false;
        }

        CancelSandboxCommandRequest other = (CancelSandboxCommandRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.commandId, other.commandId)
                && java.util.Objects.equals(
                        this.cancelSandboxCommandDetails, other.cancelSandboxCommandDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result = (result * PRIME) + (this.commandId == null ? 43 : this.commandId.hashCode());
        result =
                (result * PRIME)
                        + (this.cancelSandboxCommandDetails == null
                                ? 43
                                : this.cancelSandboxCommandDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
