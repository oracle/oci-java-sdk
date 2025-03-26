/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeComputeGpuMemoryClusterCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeComputeGpuMemoryClusterCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeComputeGpuMemoryClusterCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails> {

    /**
     * The OCID of the compute GPU memory cluster.
     */
    private String computeGpuMemoryClusterId;

    /**
     * The OCID of the compute GPU memory cluster.
     */
    public String getComputeGpuMemoryClusterId() {
        return computeGpuMemoryClusterId;
    }
    /**
     * The configuration details for the move operation.
     */
    private com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails
            changeComputeGpuMemoryClusterCompartmentDetails;

    /**
     * The configuration details for the move operation.
     */
    public com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails
            getChangeComputeGpuMemoryClusterCompartmentDetails() {
        return changeComputeGpuMemoryClusterCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails getBody$() {
        return changeComputeGpuMemoryClusterCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeComputeGpuMemoryClusterCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compute GPU memory cluster.
         */
        private String computeGpuMemoryClusterId = null;

        /**
         * The OCID of the compute GPU memory cluster.
         * @param computeGpuMemoryClusterId the value to set
         * @return this builder instance
         */
        public Builder computeGpuMemoryClusterId(String computeGpuMemoryClusterId) {
            this.computeGpuMemoryClusterId = computeGpuMemoryClusterId;
            return this;
        }

        /**
         * The configuration details for the move operation.
         */
        private com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails
                changeComputeGpuMemoryClusterCompartmentDetails = null;

        /**
         * The configuration details for the move operation.
         * @param changeComputeGpuMemoryClusterCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeComputeGpuMemoryClusterCompartmentDetails(
                com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails
                        changeComputeGpuMemoryClusterCompartmentDetails) {
            this.changeComputeGpuMemoryClusterCompartmentDetails =
                    changeComputeGpuMemoryClusterCompartmentDetails;
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
        public Builder copy(ChangeComputeGpuMemoryClusterCompartmentRequest o) {
            computeGpuMemoryClusterId(o.getComputeGpuMemoryClusterId());
            changeComputeGpuMemoryClusterCompartmentDetails(
                    o.getChangeComputeGpuMemoryClusterCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeComputeGpuMemoryClusterCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeComputeGpuMemoryClusterCompartmentRequest
         */
        public ChangeComputeGpuMemoryClusterCompartmentRequest build() {
            ChangeComputeGpuMemoryClusterCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeComputeGpuMemoryClusterCompartmentDetails body) {
            changeComputeGpuMemoryClusterCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeComputeGpuMemoryClusterCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeComputeGpuMemoryClusterCompartmentRequest
         */
        public ChangeComputeGpuMemoryClusterCompartmentRequest buildWithoutInvocationCallback() {
            ChangeComputeGpuMemoryClusterCompartmentRequest request =
                    new ChangeComputeGpuMemoryClusterCompartmentRequest();
            request.computeGpuMemoryClusterId = computeGpuMemoryClusterId;
            request.changeComputeGpuMemoryClusterCompartmentDetails =
                    changeComputeGpuMemoryClusterCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeComputeGpuMemoryClusterCompartmentRequest(computeGpuMemoryClusterId, changeComputeGpuMemoryClusterCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeGpuMemoryClusterId(computeGpuMemoryClusterId)
                .changeComputeGpuMemoryClusterCompartmentDetails(
                        changeComputeGpuMemoryClusterCompartmentDetails)
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
        sb.append(",computeGpuMemoryClusterId=")
                .append(String.valueOf(this.computeGpuMemoryClusterId));
        sb.append(",changeComputeGpuMemoryClusterCompartmentDetails=")
                .append(String.valueOf(this.changeComputeGpuMemoryClusterCompartmentDetails));
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
        if (!(o instanceof ChangeComputeGpuMemoryClusterCompartmentRequest)) {
            return false;
        }

        ChangeComputeGpuMemoryClusterCompartmentRequest other =
                (ChangeComputeGpuMemoryClusterCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeGpuMemoryClusterId, other.computeGpuMemoryClusterId)
                && java.util.Objects.equals(
                        this.changeComputeGpuMemoryClusterCompartmentDetails,
                        other.changeComputeGpuMemoryClusterCompartmentDetails)
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
                        + (this.computeGpuMemoryClusterId == null
                                ? 43
                                : this.computeGpuMemoryClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeComputeGpuMemoryClusterCompartmentDetails == null
                                ? 43
                                : this.changeComputeGpuMemoryClusterCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
