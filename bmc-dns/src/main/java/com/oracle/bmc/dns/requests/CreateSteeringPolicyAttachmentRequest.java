/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/CreateSteeringPolicyAttachmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateSteeringPolicyAttachmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class CreateSteeringPolicyAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails> {

    /**
     * Details for creating a new steering policy attachment.
     */
    private com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails
            createSteeringPolicyAttachmentDetails;

    /**
     * Details for creating a new steering policy attachment.
     */
    public com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails
            getCreateSteeringPolicyAttachmentDetails() {
        return createSteeringPolicyAttachmentDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails getBody$() {
        return createSteeringPolicyAttachmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateSteeringPolicyAttachmentRequest,
                    com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for creating a new steering policy attachment.
         */
        private com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails
                createSteeringPolicyAttachmentDetails = null;

        /**
         * Details for creating a new steering policy attachment.
         * @param createSteeringPolicyAttachmentDetails the value to set
         * @return this builder instance
         */
        public Builder createSteeringPolicyAttachmentDetails(
                com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails
                        createSteeringPolicyAttachmentDetails) {
            this.createSteeringPolicyAttachmentDetails = createSteeringPolicyAttachmentDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been
         * deleted and purged from the system, then a retry of the original creation
         * request may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been
         * deleted and purged from the system, then a retry of the original creation
         * request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         */
        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
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
        public Builder copy(CreateSteeringPolicyAttachmentRequest o) {
            createSteeringPolicyAttachmentDetails(o.getCreateSteeringPolicyAttachmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateSteeringPolicyAttachmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateSteeringPolicyAttachmentRequest
         */
        public CreateSteeringPolicyAttachmentRequest build() {
            CreateSteeringPolicyAttachmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails body) {
            createSteeringPolicyAttachmentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateSteeringPolicyAttachmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateSteeringPolicyAttachmentRequest
         */
        public CreateSteeringPolicyAttachmentRequest buildWithoutInvocationCallback() {
            CreateSteeringPolicyAttachmentRequest request =
                    new CreateSteeringPolicyAttachmentRequest();
            request.createSteeringPolicyAttachmentDetails = createSteeringPolicyAttachmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            return request;
            // new CreateSteeringPolicyAttachmentRequest(createSteeringPolicyAttachmentDetails, opcRetryToken, opcRequestId, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createSteeringPolicyAttachmentDetails(createSteeringPolicyAttachmentDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .scope(scope);
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
        sb.append(",createSteeringPolicyAttachmentDetails=")
                .append(String.valueOf(this.createSteeringPolicyAttachmentDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSteeringPolicyAttachmentRequest)) {
            return false;
        }

        CreateSteeringPolicyAttachmentRequest other = (CreateSteeringPolicyAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createSteeringPolicyAttachmentDetails,
                        other.createSteeringPolicyAttachmentDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createSteeringPolicyAttachmentDetails == null
                                ? 43
                                : this.createSteeringPolicyAttachmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
