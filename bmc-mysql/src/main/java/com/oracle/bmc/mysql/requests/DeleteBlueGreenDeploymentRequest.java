/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/DeleteBlueGreenDeploymentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteBlueGreenDeploymentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class DeleteBlueGreenDeploymentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the blue/green deployment.
     */
    private String blueGreenDeploymentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the blue/green deployment.
     */
    public String getBlueGreenDeploymentId() {
        return blueGreenDeploymentId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code If-Match} header to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code If-Match} header to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteBlueGreenDeploymentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the blue/green deployment.
         */
        private String blueGreenDeploymentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the blue/green deployment.
         * @param blueGreenDeploymentId the value to set
         * @return this builder instance
         */
        public Builder blueGreenDeploymentId(String blueGreenDeploymentId) {
            this.blueGreenDeploymentId = blueGreenDeploymentId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code If-Match} header to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code If-Match} header to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
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
        public Builder copy(DeleteBlueGreenDeploymentRequest o) {
            blueGreenDeploymentId(o.getBlueGreenDeploymentId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteBlueGreenDeploymentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteBlueGreenDeploymentRequest
         */
        public DeleteBlueGreenDeploymentRequest build() {
            DeleteBlueGreenDeploymentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteBlueGreenDeploymentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteBlueGreenDeploymentRequest
         */
        public DeleteBlueGreenDeploymentRequest buildWithoutInvocationCallback() {
            DeleteBlueGreenDeploymentRequest request = new DeleteBlueGreenDeploymentRequest();
            request.blueGreenDeploymentId = blueGreenDeploymentId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteBlueGreenDeploymentRequest(blueGreenDeploymentId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .blueGreenDeploymentId(blueGreenDeploymentId)
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
        sb.append(",blueGreenDeploymentId=").append(String.valueOf(this.blueGreenDeploymentId));
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
        if (!(o instanceof DeleteBlueGreenDeploymentRequest)) {
            return false;
        }

        DeleteBlueGreenDeploymentRequest other = (DeleteBlueGreenDeploymentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.blueGreenDeploymentId, other.blueGreenDeploymentId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.blueGreenDeploymentId == null
                                ? 43
                                : this.blueGreenDeploymentId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
