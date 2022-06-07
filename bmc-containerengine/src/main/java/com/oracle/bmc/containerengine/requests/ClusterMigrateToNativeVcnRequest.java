/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/ClusterMigrateToNativeVcnExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ClusterMigrateToNativeVcnRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class ClusterMigrateToNativeVcnRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails> {

    /**
     * The OCID of the cluster.
     */
    private String clusterId;

    public String getClusterId() {
        return clusterId;
    }
    /**
     * The details for the cluster's migration to native VCN.
     */
    private com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails
            clusterMigrateToNativeVcnDetails;

    public com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails
            getClusterMigrateToNativeVcnDetails() {
        return clusterMigrateToNativeVcnDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails getBody$() {
        return clusterMigrateToNativeVcnDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ClusterMigrateToNativeVcnRequest,
                    com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String clusterId = null;

        /**
         * The OCID of the cluster.
         * @return this builder instance
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        private com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails
                clusterMigrateToNativeVcnDetails = null;

        /**
         * The details for the cluster's migration to native VCN.
         * @return this builder instance
         */
        public Builder clusterMigrateToNativeVcnDetails(
                com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails
                        clusterMigrateToNativeVcnDetails) {
            this.clusterMigrateToNativeVcnDetails = clusterMigrateToNativeVcnDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
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
        public Builder copy(ClusterMigrateToNativeVcnRequest o) {
            clusterId(o.getClusterId());
            clusterMigrateToNativeVcnDetails(o.getClusterMigrateToNativeVcnDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ClusterMigrateToNativeVcnRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ClusterMigrateToNativeVcnRequest
         */
        public ClusterMigrateToNativeVcnRequest build() {
            ClusterMigrateToNativeVcnRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.containerengine.model.ClusterMigrateToNativeVcnDetails body) {
            clusterMigrateToNativeVcnDetails(body);
            return this;
        }

        /**
         * Build the instance of ClusterMigrateToNativeVcnRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ClusterMigrateToNativeVcnRequest
         */
        public ClusterMigrateToNativeVcnRequest buildWithoutInvocationCallback() {
            ClusterMigrateToNativeVcnRequest request = new ClusterMigrateToNativeVcnRequest();
            request.clusterId = clusterId;
            request.clusterMigrateToNativeVcnDetails = clusterMigrateToNativeVcnDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ClusterMigrateToNativeVcnRequest(clusterId, clusterMigrateToNativeVcnDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .clusterId(clusterId)
                .clusterMigrateToNativeVcnDetails(clusterMigrateToNativeVcnDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",clusterId=").append(String.valueOf(this.clusterId));
        sb.append(",clusterMigrateToNativeVcnDetails=")
                .append(String.valueOf(this.clusterMigrateToNativeVcnDetails));
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
        if (!(o instanceof ClusterMigrateToNativeVcnRequest)) {
            return false;
        }

        ClusterMigrateToNativeVcnRequest other = (ClusterMigrateToNativeVcnRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(
                        this.clusterMigrateToNativeVcnDetails,
                        other.clusterMigrateToNativeVcnDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterMigrateToNativeVcnDetails == null
                                ? 43
                                : this.clusterMigrateToNativeVcnDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
