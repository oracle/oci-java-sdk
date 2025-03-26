/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.requests;

import com.oracle.bmc.generativeaiagentruntime.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaiagentruntime/CreateSessionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateSessionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
public class CreateSessionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails> {

    /**
     * Details for the new agent session.
     */
    private com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails createSessionDetails;

    /**
     * Details for the new agent session.
     */
    public com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails
            getCreateSessionDetails() {
        return createSessionDetails;
    }
    /**
     * A unique ID for the endpoint.
     */
    private String agentEndpointId;

    /**
     * A unique ID for the endpoint.
     */
    public String getAgentEndpointId() {
        return agentEndpointId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails getBody$() {
        return createSessionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateSessionRequest,
                    com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for the new agent session.
         */
        private com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails
                createSessionDetails = null;

        /**
         * Details for the new agent session.
         * @param createSessionDetails the value to set
         * @return this builder instance
         */
        public Builder createSessionDetails(
                com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails
                        createSessionDetails) {
            this.createSessionDetails = createSessionDetails;
            return this;
        }

        /**
         * A unique ID for the endpoint.
         */
        private String agentEndpointId = null;

        /**
         * A unique ID for the endpoint.
         * @param agentEndpointId the value to set
         * @return this builder instance
         */
        public Builder agentEndpointId(String agentEndpointId) {
            this.agentEndpointId = agentEndpointId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(CreateSessionRequest o) {
            createSessionDetails(o.getCreateSessionDetails());
            agentEndpointId(o.getAgentEndpointId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateSessionRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateSessionRequest
         */
        public CreateSessionRequest build() {
            CreateSessionRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.generativeaiagentruntime.model.CreateSessionDetails body) {
            createSessionDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateSessionRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateSessionRequest
         */
        public CreateSessionRequest buildWithoutInvocationCallback() {
            CreateSessionRequest request = new CreateSessionRequest();
            request.createSessionDetails = createSessionDetails;
            request.agentEndpointId = agentEndpointId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateSessionRequest(createSessionDetails, agentEndpointId, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createSessionDetails(createSessionDetails)
                .agentEndpointId(agentEndpointId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createSessionDetails=").append(String.valueOf(this.createSessionDetails));
        sb.append(",agentEndpointId=").append(String.valueOf(this.agentEndpointId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSessionRequest)) {
            return false;
        }

        CreateSessionRequest other = (CreateSessionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.createSessionDetails, other.createSessionDetails)
                && java.util.Objects.equals(this.agentEndpointId, other.agentEndpointId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createSessionDetails == null
                                ? 43
                                : this.createSessionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.agentEndpointId == null ? 43 : this.agentEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
