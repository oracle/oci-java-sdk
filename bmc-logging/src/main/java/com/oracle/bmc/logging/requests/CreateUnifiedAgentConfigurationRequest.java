/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/CreateUnifiedAgentConfigurationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateUnifiedAgentConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class CreateUnifiedAgentConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails> {

    /**
     * Unified agent configuration creation object.
     */
    private com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails
            createUnifiedAgentConfigurationDetails;

    public com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails
            getCreateUnifiedAgentConfigurationDetails() {
        return createUnifiedAgentConfigurationDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error, without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated
     * before then due to conflicting operations (e.g., if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
     *
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails getBody$() {
        return createUnifiedAgentConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateUnifiedAgentConfigurationRequest,
                    com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails
                createUnifiedAgentConfigurationDetails = null;

        /**
         * Unified agent configuration creation object.
         * @return this builder instance
         */
        public Builder createUnifiedAgentConfigurationDetails(
                com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails
                        createUnifiedAgentConfigurationDetails) {
            this.createUnifiedAgentConfigurationDetails = createUnifiedAgentConfigurationDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error, without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated
         * before then due to conflicting operations (e.g., if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateUnifiedAgentConfigurationRequest o) {
            createUnifiedAgentConfigurationDetails(o.getCreateUnifiedAgentConfigurationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateUnifiedAgentConfigurationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateUnifiedAgentConfigurationRequest
         */
        public CreateUnifiedAgentConfigurationRequest build() {
            CreateUnifiedAgentConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.logging.model.CreateUnifiedAgentConfigurationDetails body) {
            createUnifiedAgentConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateUnifiedAgentConfigurationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateUnifiedAgentConfigurationRequest
         */
        public CreateUnifiedAgentConfigurationRequest buildWithoutInvocationCallback() {
            CreateUnifiedAgentConfigurationRequest request =
                    new CreateUnifiedAgentConfigurationRequest();
            request.createUnifiedAgentConfigurationDetails = createUnifiedAgentConfigurationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateUnifiedAgentConfigurationRequest(createUnifiedAgentConfigurationDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .createUnifiedAgentConfigurationDetails(createUnifiedAgentConfigurationDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",createUnifiedAgentConfigurationDetails=")
                .append(String.valueOf(this.createUnifiedAgentConfigurationDetails));
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
        if (!(o instanceof CreateUnifiedAgentConfigurationRequest)) {
            return false;
        }

        CreateUnifiedAgentConfigurationRequest other = (CreateUnifiedAgentConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createUnifiedAgentConfigurationDetails,
                        other.createUnifiedAgentConfigurationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createUnifiedAgentConfigurationDetails == null
                                ? 43
                                : this.createUnifiedAgentConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
