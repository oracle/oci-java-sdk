/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.requests;

import com.oracle.bmc.globallydistributeddatabase.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/globallydistributeddatabase/PrevalidateShardedDatabaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PrevalidateShardedDatabaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class PrevalidateShardedDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.globallydistributeddatabase.model
                        .PrevalidateShardedDatabaseDetails> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Request to pre-validate sharded database operation like CREATE, PATCH payload before executing them.
     */
    private com.oracle.bmc.globallydistributeddatabase.model.PrevalidateShardedDatabaseDetails
            prevalidateShardedDatabaseDetails;

    /**
     * Request to pre-validate sharded database operation like CREATE, PATCH payload before executing them.
     */
    public com.oracle.bmc.globallydistributeddatabase.model.PrevalidateShardedDatabaseDetails
            getPrevalidateShardedDatabaseDetails() {
        return prevalidateShardedDatabaseDetails;
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
    public com.oracle.bmc.globallydistributeddatabase.model.PrevalidateShardedDatabaseDetails
            getBody$() {
        return prevalidateShardedDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PrevalidateShardedDatabaseRequest,
                    com.oracle.bmc.globallydistributeddatabase.model
                            .PrevalidateShardedDatabaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Request to pre-validate sharded database operation like CREATE, PATCH payload before executing them.
         */
        private com.oracle.bmc.globallydistributeddatabase.model.PrevalidateShardedDatabaseDetails
                prevalidateShardedDatabaseDetails = null;

        /**
         * Request to pre-validate sharded database operation like CREATE, PATCH payload before executing them.
         * @param prevalidateShardedDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder prevalidateShardedDatabaseDetails(
                com.oracle.bmc.globallydistributeddatabase.model.PrevalidateShardedDatabaseDetails
                        prevalidateShardedDatabaseDetails) {
            this.prevalidateShardedDatabaseDetails = prevalidateShardedDatabaseDetails;
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
        public Builder copy(PrevalidateShardedDatabaseRequest o) {
            compartmentId(o.getCompartmentId());
            prevalidateShardedDatabaseDetails(o.getPrevalidateShardedDatabaseDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PrevalidateShardedDatabaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PrevalidateShardedDatabaseRequest
         */
        public PrevalidateShardedDatabaseRequest build() {
            PrevalidateShardedDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.globallydistributeddatabase.model.PrevalidateShardedDatabaseDetails
                        body) {
            prevalidateShardedDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of PrevalidateShardedDatabaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PrevalidateShardedDatabaseRequest
         */
        public PrevalidateShardedDatabaseRequest buildWithoutInvocationCallback() {
            PrevalidateShardedDatabaseRequest request = new PrevalidateShardedDatabaseRequest();
            request.compartmentId = compartmentId;
            request.prevalidateShardedDatabaseDetails = prevalidateShardedDatabaseDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new PrevalidateShardedDatabaseRequest(compartmentId, prevalidateShardedDatabaseDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .prevalidateShardedDatabaseDetails(prevalidateShardedDatabaseDetails)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",prevalidateShardedDatabaseDetails=")
                .append(String.valueOf(this.prevalidateShardedDatabaseDetails));
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
        if (!(o instanceof PrevalidateShardedDatabaseRequest)) {
            return false;
        }

        PrevalidateShardedDatabaseRequest other = (PrevalidateShardedDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.prevalidateShardedDatabaseDetails,
                        other.prevalidateShardedDatabaseDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.prevalidateShardedDatabaseDetails == null
                                ? 43
                                : this.prevalidateShardedDatabaseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
