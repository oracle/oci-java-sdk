/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/UpdateBulkProblemStatusExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateBulkProblemStatusRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class UpdateBulkProblemStatusRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails> {

    /** A list of Problem IDs to be passed in to update the Problem status */
    private com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails
            updateBulkProblemStatusDetails;

    /** A list of Problem IDs to be passed in to update the Problem status */
    public com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails
            getUpdateBulkProblemStatusDetails() {
        return updateBulkProblemStatusDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails getBody$() {
        return updateBulkProblemStatusDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateBulkProblemStatusRequest,
                    com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A list of Problem IDs to be passed in to update the Problem status */
        private com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails
                updateBulkProblemStatusDetails = null;

        /**
         * A list of Problem IDs to be passed in to update the Problem status
         *
         * @param updateBulkProblemStatusDetails the value to set
         * @return this builder instance
         */
        public Builder updateBulkProblemStatusDetails(
                com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails
                        updateBulkProblemStatusDetails) {
            this.updateBulkProblemStatusDetails = updateBulkProblemStatusDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateBulkProblemStatusRequest o) {
            updateBulkProblemStatusDetails(o.getUpdateBulkProblemStatusDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateBulkProblemStatusRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateBulkProblemStatusRequest
         */
        public UpdateBulkProblemStatusRequest build() {
            UpdateBulkProblemStatusRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.cloudguard.model.UpdateBulkProblemStatusDetails body) {
            updateBulkProblemStatusDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateBulkProblemStatusRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateBulkProblemStatusRequest
         */
        public UpdateBulkProblemStatusRequest buildWithoutInvocationCallback() {
            UpdateBulkProblemStatusRequest request = new UpdateBulkProblemStatusRequest();
            request.updateBulkProblemStatusDetails = updateBulkProblemStatusDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateBulkProblemStatusRequest(updateBulkProblemStatusDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateBulkProblemStatusDetails(updateBulkProblemStatusDetails)
                .opcRequestId(opcRequestId);
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
        sb.append(",updateBulkProblemStatusDetails=")
                .append(String.valueOf(this.updateBulkProblemStatusDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBulkProblemStatusRequest)) {
            return false;
        }

        UpdateBulkProblemStatusRequest other = (UpdateBulkProblemStatusRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateBulkProblemStatusDetails, other.updateBulkProblemStatusDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateBulkProblemStatusDetails == null
                                ? 43
                                : this.updateBulkProblemStatusDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
