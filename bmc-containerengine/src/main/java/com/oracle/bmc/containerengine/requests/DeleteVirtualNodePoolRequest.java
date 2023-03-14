/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/DeleteVirtualNodePoolExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteVirtualNodePoolRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class DeleteVirtualNodePoolRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the virtual node pool.
     */
    private String virtualNodePoolId;

    /**
     * The OCID of the virtual node pool.
     */
    public String getVirtualNodePoolId() {
        return virtualNodePoolId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Duration after which Sk8s will give up eviction of the pods on the node.
     * PT0M will indicate you want to delete the virtual node without cordon and drain. Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
     *
     */
    private String overrideEvictionGraceDurationVnp;

    /**
     * Duration after which Sk8s will give up eviction of the pods on the node.
     * PT0M will indicate you want to delete the virtual node without cordon and drain. Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
     *
     */
    public String getOverrideEvictionGraceDurationVnp() {
        return overrideEvictionGraceDurationVnp;
    }
    /**
     * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
     */
    private Boolean isForceDeletionAfterOverrideGraceDurationVnp;

    /**
     * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
     */
    public Boolean getIsForceDeletionAfterOverrideGraceDurationVnp() {
        return isForceDeletionAfterOverrideGraceDurationVnp;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteVirtualNodePoolRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the virtual node pool.
         */
        private String virtualNodePoolId = null;

        /**
         * The OCID of the virtual node pool.
         * @param virtualNodePoolId the value to set
         * @return this builder instance
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Duration after which Sk8s will give up eviction of the pods on the node.
         * PT0M will indicate you want to delete the virtual node without cordon and drain. Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
         *
         */
        private String overrideEvictionGraceDurationVnp = null;

        /**
         * Duration after which Sk8s will give up eviction of the pods on the node.
         * PT0M will indicate you want to delete the virtual node without cordon and drain. Default PT60M, Min PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
         *
         * @param overrideEvictionGraceDurationVnp the value to set
         * @return this builder instance
         */
        public Builder overrideEvictionGraceDurationVnp(String overrideEvictionGraceDurationVnp) {
            this.overrideEvictionGraceDurationVnp = overrideEvictionGraceDurationVnp;
            return this;
        }

        /**
         * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
         */
        private Boolean isForceDeletionAfterOverrideGraceDurationVnp = null;

        /**
         * If the underlying compute instance should be deleted if you cannot evict all the pods in grace period
         * @param isForceDeletionAfterOverrideGraceDurationVnp the value to set
         * @return this builder instance
         */
        public Builder isForceDeletionAfterOverrideGraceDurationVnp(
                Boolean isForceDeletionAfterOverrideGraceDurationVnp) {
            this.isForceDeletionAfterOverrideGraceDurationVnp =
                    isForceDeletionAfterOverrideGraceDurationVnp;
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
        public Builder copy(DeleteVirtualNodePoolRequest o) {
            virtualNodePoolId(o.getVirtualNodePoolId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            overrideEvictionGraceDurationVnp(o.getOverrideEvictionGraceDurationVnp());
            isForceDeletionAfterOverrideGraceDurationVnp(
                    o.getIsForceDeletionAfterOverrideGraceDurationVnp());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteVirtualNodePoolRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteVirtualNodePoolRequest
         */
        public DeleteVirtualNodePoolRequest build() {
            DeleteVirtualNodePoolRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteVirtualNodePoolRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteVirtualNodePoolRequest
         */
        public DeleteVirtualNodePoolRequest buildWithoutInvocationCallback() {
            DeleteVirtualNodePoolRequest request = new DeleteVirtualNodePoolRequest();
            request.virtualNodePoolId = virtualNodePoolId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.overrideEvictionGraceDurationVnp = overrideEvictionGraceDurationVnp;
            request.isForceDeletionAfterOverrideGraceDurationVnp =
                    isForceDeletionAfterOverrideGraceDurationVnp;
            return request;
            // new DeleteVirtualNodePoolRequest(virtualNodePoolId, ifMatch, opcRequestId, overrideEvictionGraceDurationVnp, isForceDeletionAfterOverrideGraceDurationVnp);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualNodePoolId(virtualNodePoolId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .overrideEvictionGraceDurationVnp(overrideEvictionGraceDurationVnp)
                .isForceDeletionAfterOverrideGraceDurationVnp(
                        isForceDeletionAfterOverrideGraceDurationVnp);
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
        sb.append(",virtualNodePoolId=").append(String.valueOf(this.virtualNodePoolId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",overrideEvictionGraceDurationVnp=")
                .append(String.valueOf(this.overrideEvictionGraceDurationVnp));
        sb.append(",isForceDeletionAfterOverrideGraceDurationVnp=")
                .append(String.valueOf(this.isForceDeletionAfterOverrideGraceDurationVnp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteVirtualNodePoolRequest)) {
            return false;
        }

        DeleteVirtualNodePoolRequest other = (DeleteVirtualNodePoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualNodePoolId, other.virtualNodePoolId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.overrideEvictionGraceDurationVnp,
                        other.overrideEvictionGraceDurationVnp)
                && java.util.Objects.equals(
                        this.isForceDeletionAfterOverrideGraceDurationVnp,
                        other.isForceDeletionAfterOverrideGraceDurationVnp);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualNodePoolId == null ? 43 : this.virtualNodePoolId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideEvictionGraceDurationVnp == null
                                ? 43
                                : this.overrideEvictionGraceDurationVnp.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceDeletionAfterOverrideGraceDurationVnp == null
                                ? 43
                                : this.isForceDeletionAfterOverrideGraceDurationVnp.hashCode());
        return result;
    }
}
