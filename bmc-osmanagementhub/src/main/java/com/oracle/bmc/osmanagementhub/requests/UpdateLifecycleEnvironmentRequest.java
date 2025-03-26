/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdateLifecycleEnvironmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLifecycleEnvironmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class UpdateLifecycleEnvironmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment.
     */
    private String lifecycleEnvironmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment.
     */
    public String getLifecycleEnvironmentId() {
        return lifecycleEnvironmentId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails
            updateLifecycleEnvironmentDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails
            getUpdateLifecycleEnvironmentDetails() {
        return updateLifecycleEnvironmentDetails;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
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
    public com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails getBody$() {
        return updateLifecycleEnvironmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLifecycleEnvironmentRequest,
                    com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment.
         */
        private String lifecycleEnvironmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the lifecycle environment.
         * @param lifecycleEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder lifecycleEnvironmentId(String lifecycleEnvironmentId) {
            this.lifecycleEnvironmentId = lifecycleEnvironmentId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails
                updateLifecycleEnvironmentDetails = null;

        /**
         * The information to be updated.
         * @param updateLifecycleEnvironmentDetails the value to set
         * @return this builder instance
         */
        public Builder updateLifecycleEnvironmentDetails(
                com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails
                        updateLifecycleEnvironmentDetails) {
            this.updateLifecycleEnvironmentDetails = updateLifecycleEnvironmentDetails;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(UpdateLifecycleEnvironmentRequest o) {
            lifecycleEnvironmentId(o.getLifecycleEnvironmentId());
            updateLifecycleEnvironmentDetails(o.getUpdateLifecycleEnvironmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLifecycleEnvironmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLifecycleEnvironmentRequest
         */
        public UpdateLifecycleEnvironmentRequest build() {
            UpdateLifecycleEnvironmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.osmanagementhub.model.UpdateLifecycleEnvironmentDetails body) {
            updateLifecycleEnvironmentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLifecycleEnvironmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLifecycleEnvironmentRequest
         */
        public UpdateLifecycleEnvironmentRequest buildWithoutInvocationCallback() {
            UpdateLifecycleEnvironmentRequest request = new UpdateLifecycleEnvironmentRequest();
            request.lifecycleEnvironmentId = lifecycleEnvironmentId;
            request.updateLifecycleEnvironmentDetails = updateLifecycleEnvironmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateLifecycleEnvironmentRequest(lifecycleEnvironmentId, updateLifecycleEnvironmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .lifecycleEnvironmentId(lifecycleEnvironmentId)
                .updateLifecycleEnvironmentDetails(updateLifecycleEnvironmentDetails)
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
        sb.append(",lifecycleEnvironmentId=").append(String.valueOf(this.lifecycleEnvironmentId));
        sb.append(",updateLifecycleEnvironmentDetails=")
                .append(String.valueOf(this.updateLifecycleEnvironmentDetails));
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
        if (!(o instanceof UpdateLifecycleEnvironmentRequest)) {
            return false;
        }

        UpdateLifecycleEnvironmentRequest other = (UpdateLifecycleEnvironmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.lifecycleEnvironmentId, other.lifecycleEnvironmentId)
                && java.util.Objects.equals(
                        this.updateLifecycleEnvironmentDetails,
                        other.updateLifecycleEnvironmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.lifecycleEnvironmentId == null
                                ? 43
                                : this.lifecycleEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateLifecycleEnvironmentDetails == null
                                ? 43
                                : this.updateLifecycleEnvironmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
