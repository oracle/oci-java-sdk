/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/DeleteNodeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteNodeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class DeleteNodeRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the node pool. */
    private String nodePoolId;

    /** The OCID of the node pool. */
    public String getNodePoolId() {
        return nodePoolId;
    }
    /** The OCID of the compute instance. */
    private String nodeId;

    /** The OCID of the compute instance. */
    public String getNodeId() {
        return nodeId;
    }
    /** If the nodepool should be scaled down after the node is deleted. */
    private Boolean isDecrementSize;

    /** If the nodepool should be scaled down after the node is deleted. */
    public Boolean getIsDecrementSize() {
        return isDecrementSize;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate
     * you want to delete the node without cordon and drain. Default PT60M, Min PT0M, Max: PT60M.
     * Format ISO 8601 e.g PT30M
     */
    private String overrideEvictionGraceDuration;

    /**
     * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate
     * you want to delete the node without cordon and drain. Default PT60M, Min PT0M, Max: PT60M.
     * Format ISO 8601 e.g PT30M
     */
    public String getOverrideEvictionGraceDuration() {
        return overrideEvictionGraceDuration;
    }
    /**
     * If the underlying compute instance should be deleted if you cannot evict all the pods in
     * grace period
     */
    private Boolean isForceDeletionAfterOverrideGraceDuration;

    /**
     * If the underlying compute instance should be deleted if you cannot evict all the pods in
     * grace period
     */
    public Boolean getIsForceDeletionAfterOverrideGraceDuration() {
        return isForceDeletionAfterOverrideGraceDuration;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteNodeRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the node pool. */
        private String nodePoolId = null;

        /**
         * The OCID of the node pool.
         *
         * @param nodePoolId the value to set
         * @return this builder instance
         */
        public Builder nodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }

        /** The OCID of the compute instance. */
        private String nodeId = null;

        /**
         * The OCID of the compute instance.
         *
         * @param nodeId the value to set
         * @return this builder instance
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /** If the nodepool should be scaled down after the node is deleted. */
        private Boolean isDecrementSize = null;

        /**
         * If the nodepool should be scaled down after the node is deleted.
         *
         * @param isDecrementSize the value to set
         * @return this builder instance
         */
        public Builder isDecrementSize(Boolean isDecrementSize) {
            this.isDecrementSize = isDecrementSize;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
         * Duration after which OKE will give up eviction of the pods on the node. PT0M will
         * indicate you want to delete the node without cordon and drain. Default PT60M, Min PT0M,
         * Max: PT60M. Format ISO 8601 e.g PT30M
         */
        private String overrideEvictionGraceDuration = null;

        /**
         * Duration after which OKE will give up eviction of the pods on the node. PT0M will
         * indicate you want to delete the node without cordon and drain. Default PT60M, Min PT0M,
         * Max: PT60M. Format ISO 8601 e.g PT30M
         *
         * @param overrideEvictionGraceDuration the value to set
         * @return this builder instance
         */
        public Builder overrideEvictionGraceDuration(String overrideEvictionGraceDuration) {
            this.overrideEvictionGraceDuration = overrideEvictionGraceDuration;
            return this;
        }

        /**
         * If the underlying compute instance should be deleted if you cannot evict all the pods in
         * grace period
         */
        private Boolean isForceDeletionAfterOverrideGraceDuration = null;

        /**
         * If the underlying compute instance should be deleted if you cannot evict all the pods in
         * grace period
         *
         * @param isForceDeletionAfterOverrideGraceDuration the value to set
         * @return this builder instance
         */
        public Builder isForceDeletionAfterOverrideGraceDuration(
                Boolean isForceDeletionAfterOverrideGraceDuration) {
            this.isForceDeletionAfterOverrideGraceDuration =
                    isForceDeletionAfterOverrideGraceDuration;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(DeleteNodeRequest o) {
            nodePoolId(o.getNodePoolId());
            nodeId(o.getNodeId());
            isDecrementSize(o.getIsDecrementSize());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            overrideEvictionGraceDuration(o.getOverrideEvictionGraceDuration());
            isForceDeletionAfterOverrideGraceDuration(
                    o.getIsForceDeletionAfterOverrideGraceDuration());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteNodeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteNodeRequest
         */
        public DeleteNodeRequest build() {
            DeleteNodeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteNodeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteNodeRequest
         */
        public DeleteNodeRequest buildWithoutInvocationCallback() {
            DeleteNodeRequest request = new DeleteNodeRequest();
            request.nodePoolId = nodePoolId;
            request.nodeId = nodeId;
            request.isDecrementSize = isDecrementSize;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.overrideEvictionGraceDuration = overrideEvictionGraceDuration;
            request.isForceDeletionAfterOverrideGraceDuration =
                    isForceDeletionAfterOverrideGraceDuration;
            return request;
            // new DeleteNodeRequest(nodePoolId, nodeId, isDecrementSize, ifMatch, opcRequestId,
            // overrideEvictionGraceDuration, isForceDeletionAfterOverrideGraceDuration);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .nodePoolId(nodePoolId)
                .nodeId(nodeId)
                .isDecrementSize(isDecrementSize)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .overrideEvictionGraceDuration(overrideEvictionGraceDuration)
                .isForceDeletionAfterOverrideGraceDuration(
                        isForceDeletionAfterOverrideGraceDuration);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",nodePoolId=").append(String.valueOf(this.nodePoolId));
        sb.append(",nodeId=").append(String.valueOf(this.nodeId));
        sb.append(",isDecrementSize=").append(String.valueOf(this.isDecrementSize));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",overrideEvictionGraceDuration=")
                .append(String.valueOf(this.overrideEvictionGraceDuration));
        sb.append(",isForceDeletionAfterOverrideGraceDuration=")
                .append(String.valueOf(this.isForceDeletionAfterOverrideGraceDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteNodeRequest)) {
            return false;
        }

        DeleteNodeRequest other = (DeleteNodeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.nodePoolId, other.nodePoolId)
                && java.util.Objects.equals(this.nodeId, other.nodeId)
                && java.util.Objects.equals(this.isDecrementSize, other.isDecrementSize)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.overrideEvictionGraceDuration, other.overrideEvictionGraceDuration)
                && java.util.Objects.equals(
                        this.isForceDeletionAfterOverrideGraceDuration,
                        other.isForceDeletionAfterOverrideGraceDuration);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.nodePoolId == null ? 43 : this.nodePoolId.hashCode());
        result = (result * PRIME) + (this.nodeId == null ? 43 : this.nodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDecrementSize == null ? 43 : this.isDecrementSize.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideEvictionGraceDuration == null
                                ? 43
                                : this.overrideEvictionGraceDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceDeletionAfterOverrideGraceDuration == null
                                ? 43
                                : this.isForceDeletionAfterOverrideGraceDuration.hashCode());
        return result;
    }
}
