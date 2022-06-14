/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/CreateKubeconfigExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateKubeconfigRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class CreateKubeconfigRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails> {

    /**
     * The OCID of the cluster.
     */
    private String clusterId;

    /**
     * The OCID of the cluster.
     */
    public String getClusterId() {
        return clusterId;
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
     * The details of the cluster kubeconfig to create.
     */
    private com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails
            createClusterKubeconfigContentDetails;

    /**
     * The details of the cluster kubeconfig to create.
     */
    public com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails
            getCreateClusterKubeconfigContentDetails() {
        return createClusterKubeconfigContentDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails getBody$() {
        return createClusterKubeconfigContentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateKubeconfigRequest,
                    com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the cluster.
         */
        private String clusterId = null;

        /**
         * The OCID of the cluster.
         * @param clusterId the value to set
         * @return this builder instance
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
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
         * The details of the cluster kubeconfig to create.
         */
        private com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails
                createClusterKubeconfigContentDetails = null;

        /**
         * The details of the cluster kubeconfig to create.
         * @param createClusterKubeconfigContentDetails the value to set
         * @return this builder instance
         */
        public Builder createClusterKubeconfigContentDetails(
                com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails
                        createClusterKubeconfigContentDetails) {
            this.createClusterKubeconfigContentDetails = createClusterKubeconfigContentDetails;
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
        public Builder copy(CreateKubeconfigRequest o) {
            clusterId(o.getClusterId());
            opcRequestId(o.getOpcRequestId());
            createClusterKubeconfigContentDetails(o.getCreateClusterKubeconfigContentDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateKubeconfigRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateKubeconfigRequest
         */
        public CreateKubeconfigRequest build() {
            CreateKubeconfigRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.containerengine.model.CreateClusterKubeconfigContentDetails body) {
            createClusterKubeconfigContentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateKubeconfigRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateKubeconfigRequest
         */
        public CreateKubeconfigRequest buildWithoutInvocationCallback() {
            CreateKubeconfigRequest request = new CreateKubeconfigRequest();
            request.clusterId = clusterId;
            request.opcRequestId = opcRequestId;
            request.createClusterKubeconfigContentDetails = createClusterKubeconfigContentDetails;
            return request;
            // new CreateKubeconfigRequest(clusterId, opcRequestId, createClusterKubeconfigContentDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .clusterId(clusterId)
                .opcRequestId(opcRequestId)
                .createClusterKubeconfigContentDetails(createClusterKubeconfigContentDetails);
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
        sb.append(",clusterId=").append(String.valueOf(this.clusterId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",createClusterKubeconfigContentDetails=")
                .append(String.valueOf(this.createClusterKubeconfigContentDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKubeconfigRequest)) {
            return false;
        }

        CreateKubeconfigRequest other = (CreateKubeconfigRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.createClusterKubeconfigContentDetails,
                        other.createClusterKubeconfigContentDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.createClusterKubeconfigContentDetails == null
                                ? 43
                                : this.createClusterKubeconfigContentDetails.hashCode());
        return result;
    }
}
