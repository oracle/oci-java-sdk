/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdateTriggerExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTriggerRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class UpdateTriggerRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.UpdateTriggerDetails> {

    /**
     * Unique trigger identifier.
     */
    private String triggerId;

    /**
     * Unique trigger identifier.
     */
    public String getTriggerId() {
        return triggerId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.devops.model.UpdateTriggerDetails updateTriggerDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.devops.model.UpdateTriggerDetails getUpdateTriggerDetails() {
        return updateTriggerDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
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
    public com.oracle.bmc.devops.model.UpdateTriggerDetails getBody$() {
        return updateTriggerDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTriggerRequest, com.oracle.bmc.devops.model.UpdateTriggerDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique trigger identifier.
         */
        private String triggerId = null;

        /**
         * Unique trigger identifier.
         * @param triggerId the value to set
         * @return this builder instance
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.devops.model.UpdateTriggerDetails updateTriggerDetails = null;

        /**
         * The information to be updated.
         * @param updateTriggerDetails the value to set
         * @return this builder instance
         */
        public Builder updateTriggerDetails(
                com.oracle.bmc.devops.model.UpdateTriggerDetails updateTriggerDetails) {
            this.updateTriggerDetails = updateTriggerDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
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
        public Builder copy(UpdateTriggerRequest o) {
            triggerId(o.getTriggerId());
            updateTriggerDetails(o.getUpdateTriggerDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTriggerRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateTriggerRequest
         */
        public UpdateTriggerRequest build() {
            UpdateTriggerRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.UpdateTriggerDetails body) {
            updateTriggerDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTriggerRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTriggerRequest
         */
        public UpdateTriggerRequest buildWithoutInvocationCallback() {
            UpdateTriggerRequest request = new UpdateTriggerRequest();
            request.triggerId = triggerId;
            request.updateTriggerDetails = updateTriggerDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateTriggerRequest(triggerId, updateTriggerDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .triggerId(triggerId)
                .updateTriggerDetails(updateTriggerDetails)
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
        sb.append(",triggerId=").append(String.valueOf(this.triggerId));
        sb.append(",updateTriggerDetails=").append(String.valueOf(this.updateTriggerDetails));
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
        if (!(o instanceof UpdateTriggerRequest)) {
            return false;
        }

        UpdateTriggerRequest other = (UpdateTriggerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.triggerId, other.triggerId)
                && java.util.Objects.equals(this.updateTriggerDetails, other.updateTriggerDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.triggerId == null ? 43 : this.triggerId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTriggerDetails == null
                                ? 43
                                : this.updateTriggerDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
