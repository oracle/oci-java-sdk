/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.requests;

import com.oracle.bmc.operatoraccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/operatoraccesscontrol/ValidateOperatorAssignmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ValidateOperatorAssignmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ValidateOperatorAssignmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails> {

    /**
     * unique OperatorControl identifier
     */
    private String operatorControlAssignmentId;

    /**
     * unique OperatorControl identifier
     */
    public String getOperatorControlAssignmentId() {
        return operatorControlAssignmentId;
    }
    /**
     * Contains details required for validating Operator Assignment Details.
     */
    private com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails
            validateOperatorAssignmentDetails;

    /**
     * Contains details required for validating Operator Assignment Details.
     */
    public com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails
            getValidateOperatorAssignmentDetails() {
        return validateOperatorAssignmentDetails;
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
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails getBody$() {
        return validateOperatorAssignmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateOperatorAssignmentRequest,
                    com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique OperatorControl identifier
         */
        private String operatorControlAssignmentId = null;

        /**
         * unique OperatorControl identifier
         * @param operatorControlAssignmentId the value to set
         * @return this builder instance
         */
        public Builder operatorControlAssignmentId(String operatorControlAssignmentId) {
            this.operatorControlAssignmentId = operatorControlAssignmentId;
            return this;
        }

        /**
         * Contains details required for validating Operator Assignment Details.
         */
        private com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails
                validateOperatorAssignmentDetails = null;

        /**
         * Contains details required for validating Operator Assignment Details.
         * @param validateOperatorAssignmentDetails the value to set
         * @return this builder instance
         */
        public Builder validateOperatorAssignmentDetails(
                com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails
                        validateOperatorAssignmentDetails) {
            this.validateOperatorAssignmentDetails = validateOperatorAssignmentDetails;
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
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ValidateOperatorAssignmentRequest o) {
            operatorControlAssignmentId(o.getOperatorControlAssignmentId());
            validateOperatorAssignmentDetails(o.getValidateOperatorAssignmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateOperatorAssignmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ValidateOperatorAssignmentRequest
         */
        public ValidateOperatorAssignmentRequest build() {
            ValidateOperatorAssignmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.operatoraccesscontrol.model.ValidateOperatorAssignmentDetails body) {
            validateOperatorAssignmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ValidateOperatorAssignmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateOperatorAssignmentRequest
         */
        public ValidateOperatorAssignmentRequest buildWithoutInvocationCallback() {
            ValidateOperatorAssignmentRequest request = new ValidateOperatorAssignmentRequest();
            request.operatorControlAssignmentId = operatorControlAssignmentId;
            request.validateOperatorAssignmentDetails = validateOperatorAssignmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ValidateOperatorAssignmentRequest(operatorControlAssignmentId, validateOperatorAssignmentDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .operatorControlAssignmentId(operatorControlAssignmentId)
                .validateOperatorAssignmentDetails(validateOperatorAssignmentDetails)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch)
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
        sb.append(",operatorControlAssignmentId=")
                .append(String.valueOf(this.operatorControlAssignmentId));
        sb.append(",validateOperatorAssignmentDetails=")
                .append(String.valueOf(this.validateOperatorAssignmentDetails));
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
        if (!(o instanceof ValidateOperatorAssignmentRequest)) {
            return false;
        }

        ValidateOperatorAssignmentRequest other = (ValidateOperatorAssignmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.operatorControlAssignmentId, other.operatorControlAssignmentId)
                && java.util.Objects.equals(
                        this.validateOperatorAssignmentDetails,
                        other.validateOperatorAssignmentDetails)
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
                        + (this.operatorControlAssignmentId == null
                                ? 43
                                : this.operatorControlAssignmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.validateOperatorAssignmentDetails == null
                                ? 43
                                : this.validateOperatorAssignmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
