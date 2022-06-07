/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/EstimateReleaseDataSizeExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use EstimateReleaseDataSizeRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class EstimateReleaseDataSizeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * This is the input to estimate the size of recalled data to be released.
     */
    private com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails
            estimateReleaseDataSizeDetails;

    public com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails
            getEstimateReleaseDataSizeDetails() {
        return estimateReleaseDataSizeDetails;
    }
    /**
     * The client request ID for tracing.
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
    public com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails getBody$() {
        return estimateReleaseDataSizeDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EstimateReleaseDataSizeRequest,
                    com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails
                estimateReleaseDataSizeDetails = null;

        /**
         * This is the input to estimate the size of recalled data to be released.
         * @return this builder instance
         */
        public Builder estimateReleaseDataSizeDetails(
                com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails
                        estimateReleaseDataSizeDetails) {
            this.estimateReleaseDataSizeDetails = estimateReleaseDataSizeDetails;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(EstimateReleaseDataSizeRequest o) {
            namespaceName(o.getNamespaceName());
            estimateReleaseDataSizeDetails(o.getEstimateReleaseDataSizeDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EstimateReleaseDataSizeRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of EstimateReleaseDataSizeRequest
         */
        public EstimateReleaseDataSizeRequest build() {
            EstimateReleaseDataSizeRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.loganalytics.model.EstimateReleaseDataSizeDetails body) {
            estimateReleaseDataSizeDetails(body);
            return this;
        }

        /**
         * Build the instance of EstimateReleaseDataSizeRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EstimateReleaseDataSizeRequest
         */
        public EstimateReleaseDataSizeRequest buildWithoutInvocationCallback() {
            EstimateReleaseDataSizeRequest request = new EstimateReleaseDataSizeRequest();
            request.namespaceName = namespaceName;
            request.estimateReleaseDataSizeDetails = estimateReleaseDataSizeDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new EstimateReleaseDataSizeRequest(namespaceName, estimateReleaseDataSizeDetails, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .estimateReleaseDataSizeDetails(estimateReleaseDataSizeDetails)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",estimateReleaseDataSizeDetails=")
                .append(String.valueOf(this.estimateReleaseDataSizeDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateReleaseDataSizeRequest)) {
            return false;
        }

        EstimateReleaseDataSizeRequest other = (EstimateReleaseDataSizeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.estimateReleaseDataSizeDetails, other.estimateReleaseDataSizeDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.estimateReleaseDataSizeDetails == null
                                ? 43
                                : this.estimateReleaseDataSizeDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
