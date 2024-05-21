/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.requests;

import com.oracle.bmc.dataflow.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataflow/UpdatePoolExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePoolRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class UpdatePoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataflow.model.UpdatePoolDetails> {

    /**
     * Details for updating a pool.
     *
     */
    private com.oracle.bmc.dataflow.model.UpdatePoolDetails updatePoolDetails;

    /**
     * Details for updating a pool.
     *
     */
    public com.oracle.bmc.dataflow.model.UpdatePoolDetails getUpdatePoolDetails() {
        return updatePoolDetails;
    }
    /**
     * The unique ID for a pool.
     *
     */
    private String poolId;

    /**
     * The unique ID for a pool.
     *
     */
    public String getPoolId() {
        return poolId;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID will include this value.
     * Otherwise, a random request ID will be generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID will include this value.
     * Otherwise, a random request ID will be generated by the service.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
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
    public com.oracle.bmc.dataflow.model.UpdatePoolDetails getBody$() {
        return updatePoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePoolRequest, com.oracle.bmc.dataflow.model.UpdatePoolDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for updating a pool.
         *
         */
        private com.oracle.bmc.dataflow.model.UpdatePoolDetails updatePoolDetails = null;

        /**
         * Details for updating a pool.
         *
         * @param updatePoolDetails the value to set
         * @return this builder instance
         */
        public Builder updatePoolDetails(
                com.oracle.bmc.dataflow.model.UpdatePoolDetails updatePoolDetails) {
            this.updatePoolDetails = updatePoolDetails;
            return this;
        }

        /**
         * The unique ID for a pool.
         *
         */
        private String poolId = null;

        /**
         * The unique ID for a pool.
         *
         * @param poolId the value to set
         * @return this builder instance
         */
        public Builder poolId(String poolId) {
            this.poolId = poolId;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this value.
         * Otherwise, a random request ID will be generated by the service.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID will include this value.
         * Otherwise, a random request ID will be generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource,
         * set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
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
        public Builder copy(UpdatePoolRequest o) {
            updatePoolDetails(o.getUpdatePoolDetails());
            poolId(o.getPoolId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePoolRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePoolRequest
         */
        public UpdatePoolRequest build() {
            UpdatePoolRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataflow.model.UpdatePoolDetails body) {
            updatePoolDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePoolRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePoolRequest
         */
        public UpdatePoolRequest buildWithoutInvocationCallback() {
            UpdatePoolRequest request = new UpdatePoolRequest();
            request.updatePoolDetails = updatePoolDetails;
            request.poolId = poolId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePoolRequest(updatePoolDetails, poolId, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updatePoolDetails(updatePoolDetails)
                .poolId(poolId)
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
        sb.append(",updatePoolDetails=").append(String.valueOf(this.updatePoolDetails));
        sb.append(",poolId=").append(String.valueOf(this.poolId));
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
        if (!(o instanceof UpdatePoolRequest)) {
            return false;
        }

        UpdatePoolRequest other = (UpdatePoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.updatePoolDetails, other.updatePoolDetails)
                && java.util.Objects.equals(this.poolId, other.poolId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updatePoolDetails == null ? 43 : this.updatePoolDetails.hashCode());
        result = (result * PRIME) + (this.poolId == null ? 43 : this.poolId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
