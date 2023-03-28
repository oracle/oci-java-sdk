/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeClusterCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeComputeClusterCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeComputeClusterCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute cluster.
     * A compute cluster is a remote direct memory access (RDMA) network group.
     * For more information, see [Compute Clusters](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm).
     *
     */
    private String computeClusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute cluster.
     * A compute cluster is a remote direct memory access (RDMA) network group.
     * For more information, see [Compute Clusters](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm).
     *
     */
    public String getComputeClusterId() {
        return computeClusterId;
    }
    /**
     * The request to move the compute cluster to a different compartment.
     */
    private com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails
            changeComputeClusterCompartmentDetails;

    /**
     * The request to move the compute cluster to a different compartment.
     */
    public com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails
            getChangeComputeClusterCompartmentDetails() {
        return changeComputeClusterCompartmentDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails getBody$() {
        return changeComputeClusterCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeComputeClusterCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute cluster.
         * A compute cluster is a remote direct memory access (RDMA) network group.
         * For more information, see [Compute Clusters](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm).
         *
         */
        private String computeClusterId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute cluster.
         * A compute cluster is a remote direct memory access (RDMA) network group.
         * For more information, see [Compute Clusters](https://docs.cloud.oracle.com/iaas/Content/Compute/Tasks/compute-clusters.htm).
         *
         * @param computeClusterId the value to set
         * @return this builder instance
         */
        public Builder computeClusterId(String computeClusterId) {
            this.computeClusterId = computeClusterId;
            return this;
        }

        /**
         * The request to move the compute cluster to a different compartment.
         */
        private com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails
                changeComputeClusterCompartmentDetails = null;

        /**
         * The request to move the compute cluster to a different compartment.
         * @param changeComputeClusterCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeComputeClusterCompartmentDetails(
                com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails
                        changeComputeClusterCompartmentDetails) {
            this.changeComputeClusterCompartmentDetails = changeComputeClusterCompartmentDetails;
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
        public Builder copy(ChangeComputeClusterCompartmentRequest o) {
            computeClusterId(o.getComputeClusterId());
            changeComputeClusterCompartmentDetails(o.getChangeComputeClusterCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeComputeClusterCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeComputeClusterCompartmentRequest
         */
        public ChangeComputeClusterCompartmentRequest build() {
            ChangeComputeClusterCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeComputeClusterCompartmentDetails body) {
            changeComputeClusterCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeComputeClusterCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeComputeClusterCompartmentRequest
         */
        public ChangeComputeClusterCompartmentRequest buildWithoutInvocationCallback() {
            ChangeComputeClusterCompartmentRequest request =
                    new ChangeComputeClusterCompartmentRequest();
            request.computeClusterId = computeClusterId;
            request.changeComputeClusterCompartmentDetails = changeComputeClusterCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeComputeClusterCompartmentRequest(computeClusterId, changeComputeClusterCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeClusterId(computeClusterId)
                .changeComputeClusterCompartmentDetails(changeComputeClusterCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",computeClusterId=").append(String.valueOf(this.computeClusterId));
        sb.append(",changeComputeClusterCompartmentDetails=")
                .append(String.valueOf(this.changeComputeClusterCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeComputeClusterCompartmentRequest)) {
            return false;
        }

        ChangeComputeClusterCompartmentRequest other = (ChangeComputeClusterCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.computeClusterId, other.computeClusterId)
                && java.util.Objects.equals(
                        this.changeComputeClusterCompartmentDetails,
                        other.changeComputeClusterCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeClusterId == null ? 43 : this.computeClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeComputeClusterCompartmentDetails == null
                                ? 43
                                : this.changeComputeClusterCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
