/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.requests;

import com.oracle.bmc.osubsubscription.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osubsubscription/GetCommitmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCommitmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
public class GetCommitmentRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Commitment Id
     */
    private String commitmentId;

    public String getCommitmentId() {
        return commitmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * This header is meant to be used only for internal purposes and will be ignored on any public request. The purpose of this header is
     * to help on Gateway to API calls identification.
     *
     */
    private String xOneGatewaySubscriptionId;

    public String getXOneGatewaySubscriptionId() {
        return xOneGatewaySubscriptionId;
    }
    /**
     * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
     *
     */
    private String xOneOriginRegion;

    public String getXOneOriginRegion() {
        return xOneOriginRegion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCommitmentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String commitmentId = null;

        /**
         * The Commitment Id
         * @return this builder instance
         */
        public Builder commitmentId(String commitmentId) {
            this.commitmentId = commitmentId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String xOneGatewaySubscriptionId = null;

        /**
         * This header is meant to be used only for internal purposes and will be ignored on any public request. The purpose of this header is
         * to help on Gateway to API calls identification.
         *
         * @return this builder instance
         */
        public Builder xOneGatewaySubscriptionId(String xOneGatewaySubscriptionId) {
            this.xOneGatewaySubscriptionId = xOneGatewaySubscriptionId;
            return this;
        }

        private String xOneOriginRegion = null;

        /**
         * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
         *
         * @return this builder instance
         */
        public Builder xOneOriginRegion(String xOneOriginRegion) {
            this.xOneOriginRegion = xOneOriginRegion;
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
        public Builder copy(GetCommitmentRequest o) {
            commitmentId(o.getCommitmentId());
            opcRequestId(o.getOpcRequestId());
            xOneGatewaySubscriptionId(o.getXOneGatewaySubscriptionId());
            xOneOriginRegion(o.getXOneOriginRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCommitmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCommitmentRequest
         */
        public GetCommitmentRequest build() {
            GetCommitmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCommitmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCommitmentRequest
         */
        public GetCommitmentRequest buildWithoutInvocationCallback() {
            GetCommitmentRequest request = new GetCommitmentRequest();
            request.commitmentId = commitmentId;
            request.opcRequestId = opcRequestId;
            request.xOneGatewaySubscriptionId = xOneGatewaySubscriptionId;
            request.xOneOriginRegion = xOneOriginRegion;
            return request;
            // new GetCommitmentRequest(commitmentId, opcRequestId, xOneGatewaySubscriptionId, xOneOriginRegion);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .commitmentId(commitmentId)
                .opcRequestId(opcRequestId)
                .xOneGatewaySubscriptionId(xOneGatewaySubscriptionId)
                .xOneOriginRegion(xOneOriginRegion);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",commitmentId=").append(String.valueOf(this.commitmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",xOneGatewaySubscriptionId=")
                .append(String.valueOf(this.xOneGatewaySubscriptionId));
        sb.append(",xOneOriginRegion=").append(String.valueOf(this.xOneOriginRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCommitmentRequest)) {
            return false;
        }

        GetCommitmentRequest other = (GetCommitmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.commitmentId, other.commitmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.xOneGatewaySubscriptionId, other.xOneGatewaySubscriptionId)
                && java.util.Objects.equals(this.xOneOriginRegion, other.xOneOriginRegion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.commitmentId == null ? 43 : this.commitmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.xOneGatewaySubscriptionId == null
                                ? 43
                                : this.xOneGatewaySubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.xOneOriginRegion == null ? 43 : this.xOneOriginRegion.hashCode());
        return result;
    }
}
