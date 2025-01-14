/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.requests;

import com.oracle.bmc.globallydistributeddatabase.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/globallydistributeddatabase/FetchShardableCloudAutonomousVmClustersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * FetchShardableCloudAutonomousVmClustersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class FetchShardableCloudAutonomousVmClustersRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.globallydistributeddatabase.model
                        .FetchShardableCloudAutonomousVmClustersDetails> {

    /** Request payload to get sharded cloud autonomous vm clusters. */
    private com.oracle.bmc.globallydistributeddatabase.model
                    .FetchShardableCloudAutonomousVmClustersDetails
            fetchShardableCloudAutonomousVmClustersDetails;

    /** Request payload to get sharded cloud autonomous vm clusters. */
    public com.oracle.bmc.globallydistributeddatabase.model
                    .FetchShardableCloudAutonomousVmClustersDetails
            getFetchShardableCloudAutonomousVmClustersDetails() {
        return fetchShardableCloudAutonomousVmClustersDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.globallydistributeddatabase.model
                    .FetchShardableCloudAutonomousVmClustersDetails
            getBody$() {
        return fetchShardableCloudAutonomousVmClustersDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    FetchShardableCloudAutonomousVmClustersRequest,
                    com.oracle.bmc.globallydistributeddatabase.model
                            .FetchShardableCloudAutonomousVmClustersDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request payload to get sharded cloud autonomous vm clusters. */
        private com.oracle.bmc.globallydistributeddatabase.model
                        .FetchShardableCloudAutonomousVmClustersDetails
                fetchShardableCloudAutonomousVmClustersDetails = null;

        /**
         * Request payload to get sharded cloud autonomous vm clusters.
         *
         * @param fetchShardableCloudAutonomousVmClustersDetails the value to set
         * @return this builder instance
         */
        public Builder fetchShardableCloudAutonomousVmClustersDetails(
                com.oracle.bmc.globallydistributeddatabase.model
                                .FetchShardableCloudAutonomousVmClustersDetails
                        fetchShardableCloudAutonomousVmClustersDetails) {
            this.fetchShardableCloudAutonomousVmClustersDetails =
                    fetchShardableCloudAutonomousVmClustersDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(FetchShardableCloudAutonomousVmClustersRequest o) {
            fetchShardableCloudAutonomousVmClustersDetails(
                    o.getFetchShardableCloudAutonomousVmClustersDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of FetchShardableCloudAutonomousVmClustersRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of FetchShardableCloudAutonomousVmClustersRequest
         */
        public FetchShardableCloudAutonomousVmClustersRequest build() {
            FetchShardableCloudAutonomousVmClustersRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.globallydistributeddatabase.model
                                .FetchShardableCloudAutonomousVmClustersDetails
                        body) {
            fetchShardableCloudAutonomousVmClustersDetails(body);
            return this;
        }

        /**
         * Build the instance of FetchShardableCloudAutonomousVmClustersRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of FetchShardableCloudAutonomousVmClustersRequest
         */
        public FetchShardableCloudAutonomousVmClustersRequest buildWithoutInvocationCallback() {
            FetchShardableCloudAutonomousVmClustersRequest request =
                    new FetchShardableCloudAutonomousVmClustersRequest();
            request.fetchShardableCloudAutonomousVmClustersDetails =
                    fetchShardableCloudAutonomousVmClustersDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // FetchShardableCloudAutonomousVmClustersRequest(fetchShardableCloudAutonomousVmClustersDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fetchShardableCloudAutonomousVmClustersDetails(
                        fetchShardableCloudAutonomousVmClustersDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",fetchShardableCloudAutonomousVmClustersDetails=")
                .append(String.valueOf(this.fetchShardableCloudAutonomousVmClustersDetails));
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
        if (!(o instanceof FetchShardableCloudAutonomousVmClustersRequest)) {
            return false;
        }

        FetchShardableCloudAutonomousVmClustersRequest other =
                (FetchShardableCloudAutonomousVmClustersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.fetchShardableCloudAutonomousVmClustersDetails,
                        other.fetchShardableCloudAutonomousVmClustersDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fetchShardableCloudAutonomousVmClustersDetails == null
                                ? 43
                                : this.fetchShardableCloudAutonomousVmClustersDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
