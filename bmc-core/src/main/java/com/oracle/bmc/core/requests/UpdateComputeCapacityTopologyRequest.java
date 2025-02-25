/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateComputeCapacityTopologyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateComputeCapacityTopologyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateComputeCapacityTopologyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute capacity topology.
     */
    private String computeCapacityTopologyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute capacity topology.
     */
    public String getComputeCapacityTopologyId() {
        return computeCapacityTopologyId;
    }
    /**
     * Update compute capacity topology details.
     */
    private com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails
            updateComputeCapacityTopologyDetails;

    /**
     * Update compute capacity topology details.
     */
    public com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails
            getUpdateComputeCapacityTopologyDetails() {
        return updateComputeCapacityTopologyDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails getBody$() {
        return updateComputeCapacityTopologyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateComputeCapacityTopologyRequest,
                    com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute capacity topology.
         */
        private String computeCapacityTopologyId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute capacity topology.
         * @param computeCapacityTopologyId the value to set
         * @return this builder instance
         */
        public Builder computeCapacityTopologyId(String computeCapacityTopologyId) {
            this.computeCapacityTopologyId = computeCapacityTopologyId;
            return this;
        }

        /**
         * Update compute capacity topology details.
         */
        private com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails
                updateComputeCapacityTopologyDetails = null;

        /**
         * Update compute capacity topology details.
         * @param updateComputeCapacityTopologyDetails the value to set
         * @return this builder instance
         */
        public Builder updateComputeCapacityTopologyDetails(
                com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails
                        updateComputeCapacityTopologyDetails) {
            this.updateComputeCapacityTopologyDetails = updateComputeCapacityTopologyDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
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
        public Builder copy(UpdateComputeCapacityTopologyRequest o) {
            computeCapacityTopologyId(o.getComputeCapacityTopologyId());
            updateComputeCapacityTopologyDetails(o.getUpdateComputeCapacityTopologyDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateComputeCapacityTopologyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateComputeCapacityTopologyRequest
         */
        public UpdateComputeCapacityTopologyRequest build() {
            UpdateComputeCapacityTopologyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateComputeCapacityTopologyDetails body) {
            updateComputeCapacityTopologyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateComputeCapacityTopologyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateComputeCapacityTopologyRequest
         */
        public UpdateComputeCapacityTopologyRequest buildWithoutInvocationCallback() {
            UpdateComputeCapacityTopologyRequest request =
                    new UpdateComputeCapacityTopologyRequest();
            request.computeCapacityTopologyId = computeCapacityTopologyId;
            request.updateComputeCapacityTopologyDetails = updateComputeCapacityTopologyDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateComputeCapacityTopologyRequest(computeCapacityTopologyId, updateComputeCapacityTopologyDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeCapacityTopologyId(computeCapacityTopologyId)
                .updateComputeCapacityTopologyDetails(updateComputeCapacityTopologyDetails)
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
        sb.append(",computeCapacityTopologyId=")
                .append(String.valueOf(this.computeCapacityTopologyId));
        sb.append(",updateComputeCapacityTopologyDetails=")
                .append(String.valueOf(this.updateComputeCapacityTopologyDetails));
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
        if (!(o instanceof UpdateComputeCapacityTopologyRequest)) {
            return false;
        }

        UpdateComputeCapacityTopologyRequest other = (UpdateComputeCapacityTopologyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeCapacityTopologyId, other.computeCapacityTopologyId)
                && java.util.Objects.equals(
                        this.updateComputeCapacityTopologyDetails,
                        other.updateComputeCapacityTopologyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeCapacityTopologyId == null
                                ? 43
                                : this.computeCapacityTopologyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateComputeCapacityTopologyDetails == null
                                ? 43
                                : this.updateComputeCapacityTopologyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
