/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.requests;

import com.oracle.bmc.operatoraccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/operatoraccesscontrol/UpdateOperatorControlAssignmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOperatorControlAssignmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class UpdateOperatorControlAssignmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails> {

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
     * Details for the new operator control assignment.
     */
    private com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails
            updateOperatorControlAssignmentDetails;

    /**
     * Details for the new operator control assignment.
     */
    public com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails
            getUpdateOperatorControlAssignmentDetails() {
        return updateOperatorControlAssignmentDetails;
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
    public com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails
            getBody$() {
        return updateOperatorControlAssignmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOperatorControlAssignmentRequest,
                    com.oracle.bmc.operatoraccesscontrol.model
                            .UpdateOperatorControlAssignmentDetails> {
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
         * Details for the new operator control assignment.
         */
        private com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails
                updateOperatorControlAssignmentDetails = null;

        /**
         * Details for the new operator control assignment.
         * @param updateOperatorControlAssignmentDetails the value to set
         * @return this builder instance
         */
        public Builder updateOperatorControlAssignmentDetails(
                com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails
                        updateOperatorControlAssignmentDetails) {
            this.updateOperatorControlAssignmentDetails = updateOperatorControlAssignmentDetails;
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
        public Builder copy(UpdateOperatorControlAssignmentRequest o) {
            operatorControlAssignmentId(o.getOperatorControlAssignmentId());
            updateOperatorControlAssignmentDetails(o.getUpdateOperatorControlAssignmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOperatorControlAssignmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateOperatorControlAssignmentRequest
         */
        public UpdateOperatorControlAssignmentRequest build() {
            UpdateOperatorControlAssignmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.operatoraccesscontrol.model.UpdateOperatorControlAssignmentDetails
                        body) {
            updateOperatorControlAssignmentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOperatorControlAssignmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOperatorControlAssignmentRequest
         */
        public UpdateOperatorControlAssignmentRequest buildWithoutInvocationCallback() {
            UpdateOperatorControlAssignmentRequest request =
                    new UpdateOperatorControlAssignmentRequest();
            request.operatorControlAssignmentId = operatorControlAssignmentId;
            request.updateOperatorControlAssignmentDetails = updateOperatorControlAssignmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOperatorControlAssignmentRequest(operatorControlAssignmentId, updateOperatorControlAssignmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .operatorControlAssignmentId(operatorControlAssignmentId)
                .updateOperatorControlAssignmentDetails(updateOperatorControlAssignmentDetails)
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
        sb.append(",updateOperatorControlAssignmentDetails=")
                .append(String.valueOf(this.updateOperatorControlAssignmentDetails));
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
        if (!(o instanceof UpdateOperatorControlAssignmentRequest)) {
            return false;
        }

        UpdateOperatorControlAssignmentRequest other = (UpdateOperatorControlAssignmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.operatorControlAssignmentId, other.operatorControlAssignmentId)
                && java.util.Objects.equals(
                        this.updateOperatorControlAssignmentDetails,
                        other.updateOperatorControlAssignmentDetails)
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
                        + (this.updateOperatorControlAssignmentDetails == null
                                ? 43
                                : this.updateOperatorControlAssignmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
