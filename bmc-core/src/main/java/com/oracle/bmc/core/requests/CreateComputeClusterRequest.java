/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/CreateComputeClusterExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateComputeClusterRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateComputeClusterRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.CreateComputeClusterDetails> {

    /**
     * The data for creating a [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm). A compute cluster
     * is an empty remote direct memory access (RDMA) network group.
     * <p>
     * After the compute cluster is created, you can use the compute cluster's OCID with the
     * {@link #launchInstance(LaunchInstanceRequest) launchInstance} operation to create instances in the compute cluster.
     * The instances must be created in the same compartment and availability domain as the cluster.
     * <p>
     * Use compute clusters when you want to manage instances in the cluster individually in the RDMA network group.
     * <p>
     * For details about creating a cluster network that uses instance pools to manage groups of identical instances,
     * see {@link #createClusterNetworkDetails(CreateClusterNetworkDetailsRequest) createClusterNetworkDetails}.
     *
     */
    private com.oracle.bmc.core.model.CreateComputeClusterDetails createComputeClusterDetails;

    /**
     * The data for creating a [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm). A compute cluster
     * is an empty remote direct memory access (RDMA) network group.
     * <p>
     * After the compute cluster is created, you can use the compute cluster's OCID with the
     * {@link #launchInstance(LaunchInstanceRequest) launchInstance} operation to create instances in the compute cluster.
     * The instances must be created in the same compartment and availability domain as the cluster.
     * <p>
     * Use compute clusters when you want to manage instances in the cluster individually in the RDMA network group.
     * <p>
     * For details about creating a cluster network that uses instance pools to manage groups of identical instances,
     * see {@link #createClusterNetworkDetails(CreateClusterNetworkDetailsRequest) createClusterNetworkDetails}.
     *
     */
    public com.oracle.bmc.core.model.CreateComputeClusterDetails getCreateComputeClusterDetails() {
        return createComputeClusterDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.core.model.CreateComputeClusterDetails getBody$() {
        return createComputeClusterDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateComputeClusterRequest,
                    com.oracle.bmc.core.model.CreateComputeClusterDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The data for creating a [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm). A compute cluster
         * is an empty remote direct memory access (RDMA) network group.
         * <p>
         * After the compute cluster is created, you can use the compute cluster's OCID with the
         * {@link #launchInstance(LaunchInstanceRequest) launchInstance} operation to create instances in the compute cluster.
         * The instances must be created in the same compartment and availability domain as the cluster.
         * <p>
         * Use compute clusters when you want to manage instances in the cluster individually in the RDMA network group.
         * <p>
         * For details about creating a cluster network that uses instance pools to manage groups of identical instances,
         * see {@link #createClusterNetworkDetails(CreateClusterNetworkDetailsRequest) createClusterNetworkDetails}.
         *
         */
        private com.oracle.bmc.core.model.CreateComputeClusterDetails createComputeClusterDetails =
                null;

        /**
         * The data for creating a [compute cluster](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm). A compute cluster
         * is an empty remote direct memory access (RDMA) network group.
         * <p>
         * After the compute cluster is created, you can use the compute cluster's OCID with the
         * {@link #launchInstance(LaunchInstanceRequest) launchInstance} operation to create instances in the compute cluster.
         * The instances must be created in the same compartment and availability domain as the cluster.
         * <p>
         * Use compute clusters when you want to manage instances in the cluster individually in the RDMA network group.
         * <p>
         * For details about creating a cluster network that uses instance pools to manage groups of identical instances,
         * see {@link #createClusterNetworkDetails(CreateClusterNetworkDetailsRequest) createClusterNetworkDetails}.
         *
         * @param createComputeClusterDetails the value to set
         * @return this builder instance
         */
        public Builder createComputeClusterDetails(
                com.oracle.bmc.core.model.CreateComputeClusterDetails createComputeClusterDetails) {
            this.createComputeClusterDetails = createComputeClusterDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateComputeClusterRequest o) {
            createComputeClusterDetails(o.getCreateComputeClusterDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateComputeClusterRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateComputeClusterRequest
         */
        public CreateComputeClusterRequest build() {
            CreateComputeClusterRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.CreateComputeClusterDetails body) {
            createComputeClusterDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateComputeClusterRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateComputeClusterRequest
         */
        public CreateComputeClusterRequest buildWithoutInvocationCallback() {
            CreateComputeClusterRequest request = new CreateComputeClusterRequest();
            request.createComputeClusterDetails = createComputeClusterDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateComputeClusterRequest(createComputeClusterDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createComputeClusterDetails(createComputeClusterDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createComputeClusterDetails=")
                .append(String.valueOf(this.createComputeClusterDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateComputeClusterRequest)) {
            return false;
        }

        CreateComputeClusterRequest other = (CreateComputeClusterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createComputeClusterDetails, other.createComputeClusterDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createComputeClusterDetails == null
                                ? 43
                                : this.createComputeClusterDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
