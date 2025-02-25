/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.requests;

import com.oracle.bmc.containerinstances.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerinstances/RetrieveLogsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RetrieveLogsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
public class RetrieveLogsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
     */
    private String containerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
     */
    public String getContainerId() {
        return containerId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Returns the logs for the previous run of the container in a pod.
     * If the container fails, this parameter can help you to determine the root cause of the failure.
     *
     */
    private Boolean isPrevious;

    /**
     * Returns the logs for the previous run of the container in a pod.
     * If the container fails, this parameter can help you to determine the root cause of the failure.
     *
     */
    public Boolean getIsPrevious() {
        return isPrevious;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RetrieveLogsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
         */
        private String containerId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the container.
         * @param containerId the value to set
         * @return this builder instance
         */
        public Builder containerId(String containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Returns the logs for the previous run of the container in a pod.
         * If the container fails, this parameter can help you to determine the root cause of the failure.
         *
         */
        private Boolean isPrevious = null;

        /**
         * Returns the logs for the previous run of the container in a pod.
         * If the container fails, this parameter can help you to determine the root cause of the failure.
         *
         * @param isPrevious the value to set
         * @return this builder instance
         */
        public Builder isPrevious(Boolean isPrevious) {
            this.isPrevious = isPrevious;
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
        public Builder copy(RetrieveLogsRequest o) {
            containerId(o.getContainerId());
            opcRequestId(o.getOpcRequestId());
            isPrevious(o.getIsPrevious());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RetrieveLogsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RetrieveLogsRequest
         */
        public RetrieveLogsRequest build() {
            RetrieveLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of RetrieveLogsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RetrieveLogsRequest
         */
        public RetrieveLogsRequest buildWithoutInvocationCallback() {
            RetrieveLogsRequest request = new RetrieveLogsRequest();
            request.containerId = containerId;
            request.opcRequestId = opcRequestId;
            request.isPrevious = isPrevious;
            return request;
            // new RetrieveLogsRequest(containerId, opcRequestId, isPrevious);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .containerId(containerId)
                .opcRequestId(opcRequestId)
                .isPrevious(isPrevious);
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
        sb.append(",containerId=").append(String.valueOf(this.containerId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isPrevious=").append(String.valueOf(this.isPrevious));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrieveLogsRequest)) {
            return false;
        }

        RetrieveLogsRequest other = (RetrieveLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isPrevious, other.isPrevious);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isPrevious == null ? 43 : this.isPrevious.hashCode());
        return result;
    }
}
