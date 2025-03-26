/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/UpdatePipelineExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePipelineRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class UpdatePipelineRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.UpdatePipelineDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline created.
     *
     */
    private String pipelineId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline created.
     *
     */
    public String getPipelineId() {
        return pipelineId;
    }
    /**
     * The existing pipeline specifications to apply.
     *
     */
    private com.oracle.bmc.goldengate.model.UpdatePipelineDetails updatePipelineDetails;

    /**
     * The existing pipeline specifications to apply.
     *
     */
    public com.oracle.bmc.goldengate.model.UpdatePipelineDetails getUpdatePipelineDetails() {
        return updatePipelineDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource.  The resource is updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Whether to override locks (if any exist).
     */
    private Boolean isLockOverride;

    /**
     * Whether to override locks (if any exist).
     */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.goldengate.model.UpdatePipelineDetails getBody$() {
        return updatePipelineDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePipelineRequest, com.oracle.bmc.goldengate.model.UpdatePipelineDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline created.
         *
         */
        private String pipelineId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the pipeline created.
         *
         * @param pipelineId the value to set
         * @return this builder instance
         */
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * The existing pipeline specifications to apply.
         *
         */
        private com.oracle.bmc.goldengate.model.UpdatePipelineDetails updatePipelineDetails = null;

        /**
         * The existing pipeline specifications to apply.
         *
         * @param updatePipelineDetails the value to set
         * @return this builder instance
         */
        public Builder updatePipelineDetails(
                com.oracle.bmc.goldengate.model.UpdatePipelineDetails updatePipelineDetails) {
            this.updatePipelineDetails = updatePipelineDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response for that
         * resource.  The resource is updated or deleted only if the etag you provide matches the
         * resource's current etag value.
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
         *
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Whether to override locks (if any exist).
         */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(UpdatePipelineRequest o) {
            pipelineId(o.getPipelineId());
            updatePipelineDetails(o.getUpdatePipelineDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePipelineRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePipelineRequest
         */
        public UpdatePipelineRequest build() {
            UpdatePipelineRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.goldengate.model.UpdatePipelineDetails body) {
            updatePipelineDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePipelineRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePipelineRequest
         */
        public UpdatePipelineRequest buildWithoutInvocationCallback() {
            UpdatePipelineRequest request = new UpdatePipelineRequest();
            request.pipelineId = pipelineId;
            request.updatePipelineDetails = updatePipelineDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new UpdatePipelineRequest(pipelineId, updatePipelineDetails, ifMatch, opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pipelineId(pipelineId)
                .updatePipelineDetails(updatePipelineDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isLockOverride(isLockOverride);
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
        sb.append(",pipelineId=").append(String.valueOf(this.pipelineId));
        sb.append(",updatePipelineDetails=").append(String.valueOf(this.updatePipelineDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePipelineRequest)) {
            return false;
        }

        UpdatePipelineRequest other = (UpdatePipelineRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pipelineId, other.pipelineId)
                && java.util.Objects.equals(this.updatePipelineDetails, other.updatePipelineDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.pipelineId == null ? 43 : this.pipelineId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePipelineDetails == null
                                ? 43
                                : this.updatePipelineDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
