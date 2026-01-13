/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterplacementgroups.requests;

import com.oracle.bmc.clusterplacementgroups.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/clusterplacementgroups/CreateClusterPlacementGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateClusterPlacementGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class CreateClusterPlacementGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails> {

    /** The details for creating the new cluster placement group. */
    private com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails
            createClusterPlacementGroupDetails;

    /** The details for creating the new cluster placement group. */
    public com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails
            getCreateClusterPlacementGroupDetails() {
        return createClusterPlacementGroupDetails;
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
     * When set to {@code true}, the request performs validation on the submitted data without
     * modifying configuration item details.
     */
    private Boolean opcDryRun;

    /**
     * When set to {@code true}, the request performs validation on the submitted data without
     * modifying configuration item details.
     */
    public Boolean getOpcDryRun() {
        return opcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails
            getBody$() {
        return createClusterPlacementGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateClusterPlacementGroupRequest,
                    com.oracle.bmc.clusterplacementgroups.model
                            .CreateClusterPlacementGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details for creating the new cluster placement group. */
        private com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails
                createClusterPlacementGroupDetails = null;

        /**
         * The details for creating the new cluster placement group.
         *
         * @param createClusterPlacementGroupDetails the value to set
         * @return this builder instance
         */
        public Builder createClusterPlacementGroupDetails(
                com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails
                        createClusterPlacementGroupDetails) {
            this.createClusterPlacementGroupDetails = createClusterPlacementGroupDetails;
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
         * When set to {@code true}, the request performs validation on the submitted data without
         * modifying configuration item details.
         */
        private Boolean opcDryRun = null;

        /**
         * When set to {@code true}, the request performs validation on the submitted data without
         * modifying configuration item details.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(Boolean opcDryRun) {
            this.opcDryRun = opcDryRun;
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
        public Builder copy(CreateClusterPlacementGroupRequest o) {
            createClusterPlacementGroupDetails(o.getCreateClusterPlacementGroupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opcDryRun(o.getOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateClusterPlacementGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateClusterPlacementGroupRequest
         */
        public CreateClusterPlacementGroupRequest build() {
            CreateClusterPlacementGroupRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.clusterplacementgroups.model.CreateClusterPlacementGroupDetails
                        body) {
            createClusterPlacementGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateClusterPlacementGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateClusterPlacementGroupRequest
         */
        public CreateClusterPlacementGroupRequest buildWithoutInvocationCallback() {
            CreateClusterPlacementGroupRequest request = new CreateClusterPlacementGroupRequest();
            request.createClusterPlacementGroupDetails = createClusterPlacementGroupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.opcDryRun = opcDryRun;
            return request;
            // new CreateClusterPlacementGroupRequest(createClusterPlacementGroupDetails,
            // opcRetryToken, opcRequestId, opcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createClusterPlacementGroupDetails(createClusterPlacementGroupDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .opcDryRun(opcDryRun);
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
        sb.append(",createClusterPlacementGroupDetails=")
                .append(String.valueOf(this.createClusterPlacementGroupDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateClusterPlacementGroupRequest)) {
            return false;
        }

        CreateClusterPlacementGroupRequest other = (CreateClusterPlacementGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createClusterPlacementGroupDetails,
                        other.createClusterPlacementGroupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createClusterPlacementGroupDetails == null
                                ? 43
                                : this.createClusterPlacementGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        return result;
    }
}
