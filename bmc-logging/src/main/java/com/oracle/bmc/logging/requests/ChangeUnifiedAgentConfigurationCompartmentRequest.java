/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/ChangeUnifiedAgentConfigurationCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeUnifiedAgentConfigurationCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ChangeUnifiedAgentConfigurationCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails> {

    /**
     * The OCID of the Unified Agent configuration.
     */
    private String unifiedAgentConfigurationId;

    public String getUnifiedAgentConfigurationId() {
        return unifiedAgentConfigurationId;
    }
    /**
     * Request to change the compartment of a given resource.
     */
    private com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails
            changeUnifiedAgentConfigurationCompartmentDetails;

    public com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails
            getChangeUnifiedAgentConfigurationCompartmentDetails() {
        return changeUnifiedAgentConfigurationCompartmentDetails;
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
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails
            getBody$() {
        return changeUnifiedAgentConfigurationCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeUnifiedAgentConfigurationCompartmentRequest,
                    com.oracle.bmc.logging.model
                            .ChangeUnifiedAgentConfigurationCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String unifiedAgentConfigurationId = null;

        /**
         * The OCID of the Unified Agent configuration.
         * @return this builder instance
         */
        public Builder unifiedAgentConfigurationId(String unifiedAgentConfigurationId) {
            this.unifiedAgentConfigurationId = unifiedAgentConfigurationId;
            return this;
        }

        private com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails
                changeUnifiedAgentConfigurationCompartmentDetails = null;

        /**
         * Request to change the compartment of a given resource.
         * @return this builder instance
         */
        public Builder changeUnifiedAgentConfigurationCompartmentDetails(
                com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails
                        changeUnifiedAgentConfigurationCompartmentDetails) {
            this.changeUnifiedAgentConfigurationCompartmentDetails =
                    changeUnifiedAgentConfigurationCompartmentDetails;
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

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeUnifiedAgentConfigurationCompartmentRequest o) {
            unifiedAgentConfigurationId(o.getUnifiedAgentConfigurationId());
            changeUnifiedAgentConfigurationCompartmentDetails(
                    o.getChangeUnifiedAgentConfigurationCompartmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeUnifiedAgentConfigurationCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeUnifiedAgentConfigurationCompartmentRequest
         */
        public ChangeUnifiedAgentConfigurationCompartmentRequest build() {
            ChangeUnifiedAgentConfigurationCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.logging.model.ChangeUnifiedAgentConfigurationCompartmentDetails
                        body) {
            changeUnifiedAgentConfigurationCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeUnifiedAgentConfigurationCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeUnifiedAgentConfigurationCompartmentRequest
         */
        public ChangeUnifiedAgentConfigurationCompartmentRequest buildWithoutInvocationCallback() {
            ChangeUnifiedAgentConfigurationCompartmentRequest request =
                    new ChangeUnifiedAgentConfigurationCompartmentRequest();
            request.unifiedAgentConfigurationId = unifiedAgentConfigurationId;
            request.changeUnifiedAgentConfigurationCompartmentDetails =
                    changeUnifiedAgentConfigurationCompartmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeUnifiedAgentConfigurationCompartmentRequest(unifiedAgentConfigurationId, changeUnifiedAgentConfigurationCompartmentDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .unifiedAgentConfigurationId(unifiedAgentConfigurationId)
                .changeUnifiedAgentConfigurationCompartmentDetails(
                        changeUnifiedAgentConfigurationCompartmentDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",unifiedAgentConfigurationId=")
                .append(String.valueOf(this.unifiedAgentConfigurationId));
        sb.append(",changeUnifiedAgentConfigurationCompartmentDetails=")
                .append(String.valueOf(this.changeUnifiedAgentConfigurationCompartmentDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof ChangeUnifiedAgentConfigurationCompartmentRequest)) {
            return false;
        }

        ChangeUnifiedAgentConfigurationCompartmentRequest other =
                (ChangeUnifiedAgentConfigurationCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.unifiedAgentConfigurationId, other.unifiedAgentConfigurationId)
                && java.util.Objects.equals(
                        this.changeUnifiedAgentConfigurationCompartmentDetails,
                        other.changeUnifiedAgentConfigurationCompartmentDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.unifiedAgentConfigurationId == null
                                ? 43
                                : this.unifiedAgentConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeUnifiedAgentConfigurationCompartmentDetails == null
                                ? 43
                                : this.changeUnifiedAgentConfigurationCompartmentDetails
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
