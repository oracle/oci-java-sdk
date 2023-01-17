/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.requests;

import com.oracle.bmc.streaming.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/UpdateConnectHarnessExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateConnectHarnessRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class UpdateConnectHarnessRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails> {

    /**
     * The OCID of the connect harness.
     *
     */
    private String connectHarnessId;

    /**
     * The OCID of the connect harness.
     *
     */
    public String getConnectHarnessId() {
        return connectHarnessId;
    }
    /**
     * The connect harness is updated with the tags provided.
     */
    private com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails updateConnectHarnessDetails;

    /**
     * The connect harness is updated with the tags provided.
     */
    public com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails
            getUpdateConnectHarnessDetails() {
        return updateConnectHarnessDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
    public com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails getBody$() {
        return updateConnectHarnessDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateConnectHarnessRequest,
                    com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the connect harness.
         *
         */
        private String connectHarnessId = null;

        /**
         * The OCID of the connect harness.
         *
         * @param connectHarnessId the value to set
         * @return this builder instance
         */
        public Builder connectHarnessId(String connectHarnessId) {
            this.connectHarnessId = connectHarnessId;
            return this;
        }

        /**
         * The connect harness is updated with the tags provided.
         */
        private com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails
                updateConnectHarnessDetails = null;

        /**
         * The connect harness is updated with the tags provided.
         * @param updateConnectHarnessDetails the value to set
         * @return this builder instance
         */
        public Builder updateConnectHarnessDetails(
                com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails
                        updateConnectHarnessDetails) {
            this.updateConnectHarnessDetails = updateConnectHarnessDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the if-match parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(UpdateConnectHarnessRequest o) {
            connectHarnessId(o.getConnectHarnessId());
            updateConnectHarnessDetails(o.getUpdateConnectHarnessDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateConnectHarnessRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateConnectHarnessRequest
         */
        public UpdateConnectHarnessRequest build() {
            UpdateConnectHarnessRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.streaming.model.UpdateConnectHarnessDetails body) {
            updateConnectHarnessDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateConnectHarnessRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateConnectHarnessRequest
         */
        public UpdateConnectHarnessRequest buildWithoutInvocationCallback() {
            UpdateConnectHarnessRequest request = new UpdateConnectHarnessRequest();
            request.connectHarnessId = connectHarnessId;
            request.updateConnectHarnessDetails = updateConnectHarnessDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateConnectHarnessRequest(connectHarnessId, updateConnectHarnessDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .connectHarnessId(connectHarnessId)
                .updateConnectHarnessDetails(updateConnectHarnessDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",connectHarnessId=").append(String.valueOf(this.connectHarnessId));
        sb.append(",updateConnectHarnessDetails=")
                .append(String.valueOf(this.updateConnectHarnessDetails));
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
        if (!(o instanceof UpdateConnectHarnessRequest)) {
            return false;
        }

        UpdateConnectHarnessRequest other = (UpdateConnectHarnessRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.connectHarnessId, other.connectHarnessId)
                && java.util.Objects.equals(
                        this.updateConnectHarnessDetails, other.updateConnectHarnessDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectHarnessId == null ? 43 : this.connectHarnessId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateConnectHarnessDetails == null
                                ? 43
                                : this.updateConnectHarnessDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
