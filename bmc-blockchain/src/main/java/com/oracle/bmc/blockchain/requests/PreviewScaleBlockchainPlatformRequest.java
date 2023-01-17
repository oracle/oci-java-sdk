/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.requests;

import com.oracle.bmc.blockchain.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/blockchain/PreviewScaleBlockchainPlatformExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PreviewScaleBlockchainPlatformRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
public class PreviewScaleBlockchainPlatformRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails> {

    /** Unique service identifier. */
    private String blockchainPlatformId;

    /** Unique service identifier. */
    public String getBlockchainPlatformId() {
        return blockchainPlatformId;
    }
    /** Input payload to scaleout blockchain platform. The payload cannot be empty. */
    private com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails
            scaleBlockchainPlatformDetails;

    /** Input payload to scaleout blockchain platform. The payload cannot be empty. */
    public com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails
            getScaleBlockchainPlatformDetails() {
        return scaleBlockchainPlatformDetails;
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
    public com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails getBody$() {
        return scaleBlockchainPlatformDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PreviewScaleBlockchainPlatformRequest,
                    com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique service identifier. */
        private String blockchainPlatformId = null;

        /**
         * Unique service identifier.
         *
         * @param blockchainPlatformId the value to set
         * @return this builder instance
         */
        public Builder blockchainPlatformId(String blockchainPlatformId) {
            this.blockchainPlatformId = blockchainPlatformId;
            return this;
        }

        /** Input payload to scaleout blockchain platform. The payload cannot be empty. */
        private com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails
                scaleBlockchainPlatformDetails = null;

        /**
         * Input payload to scaleout blockchain platform. The payload cannot be empty.
         *
         * @param scaleBlockchainPlatformDetails the value to set
         * @return this builder instance
         */
        public Builder scaleBlockchainPlatformDetails(
                com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails
                        scaleBlockchainPlatformDetails) {
            this.scaleBlockchainPlatformDetails = scaleBlockchainPlatformDetails;
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
        public Builder copy(PreviewScaleBlockchainPlatformRequest o) {
            blockchainPlatformId(o.getBlockchainPlatformId());
            scaleBlockchainPlatformDetails(o.getScaleBlockchainPlatformDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PreviewScaleBlockchainPlatformRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PreviewScaleBlockchainPlatformRequest
         */
        public PreviewScaleBlockchainPlatformRequest build() {
            PreviewScaleBlockchainPlatformRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.blockchain.model.ScaleBlockchainPlatformDetails body) {
            scaleBlockchainPlatformDetails(body);
            return this;
        }

        /**
         * Build the instance of PreviewScaleBlockchainPlatformRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PreviewScaleBlockchainPlatformRequest
         */
        public PreviewScaleBlockchainPlatformRequest buildWithoutInvocationCallback() {
            PreviewScaleBlockchainPlatformRequest request =
                    new PreviewScaleBlockchainPlatformRequest();
            request.blockchainPlatformId = blockchainPlatformId;
            request.scaleBlockchainPlatformDetails = scaleBlockchainPlatformDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new PreviewScaleBlockchainPlatformRequest(blockchainPlatformId,
            // scaleBlockchainPlatformDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .blockchainPlatformId(blockchainPlatformId)
                .scaleBlockchainPlatformDetails(scaleBlockchainPlatformDetails)
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
        sb.append(",blockchainPlatformId=").append(String.valueOf(this.blockchainPlatformId));
        sb.append(",scaleBlockchainPlatformDetails=")
                .append(String.valueOf(this.scaleBlockchainPlatformDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreviewScaleBlockchainPlatformRequest)) {
            return false;
        }

        PreviewScaleBlockchainPlatformRequest other = (PreviewScaleBlockchainPlatformRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.blockchainPlatformId, other.blockchainPlatformId)
                && java.util.Objects.equals(
                        this.scaleBlockchainPlatformDetails, other.scaleBlockchainPlatformDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.blockchainPlatformId == null
                                ? 43
                                : this.blockchainPlatformId.hashCode());
        result =
                (result * PRIME)
                        + (this.scaleBlockchainPlatformDetails == null
                                ? 43
                                : this.scaleBlockchainPlatformDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
