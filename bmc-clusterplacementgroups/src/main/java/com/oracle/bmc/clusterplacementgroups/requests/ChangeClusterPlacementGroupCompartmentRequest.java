/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterplacementgroups.requests;

import com.oracle.bmc.clusterplacementgroups.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/clusterplacementgroups/ChangeClusterPlacementGroupCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeClusterPlacementGroupCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ChangeClusterPlacementGroupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.clusterplacementgroups.model
                        .ChangeClusterPlacementGroupCompartmentDetails> {

    /** A unique cluster placement group identifier. */
    private String clusterPlacementGroupId;

    /** A unique cluster placement group identifier. */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }
    /** The details of the updated compartment. */
    private com.oracle.bmc.clusterplacementgroups.model
                    .ChangeClusterPlacementGroupCompartmentDetails
            changeClusterPlacementGroupCompartmentDetails;

    /** The details of the updated compartment. */
    public com.oracle.bmc.clusterplacementgroups.model.ChangeClusterPlacementGroupCompartmentDetails
            getChangeClusterPlacementGroupCompartmentDetails() {
        return changeClusterPlacementGroupCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.clusterplacementgroups.model.ChangeClusterPlacementGroupCompartmentDetails
            getBody$() {
        return changeClusterPlacementGroupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeClusterPlacementGroupCompartmentRequest,
                    com.oracle.bmc.clusterplacementgroups.model
                            .ChangeClusterPlacementGroupCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A unique cluster placement group identifier. */
        private String clusterPlacementGroupId = null;

        /**
         * A unique cluster placement group identifier.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder instance
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            return this;
        }

        /** The details of the updated compartment. */
        private com.oracle.bmc.clusterplacementgroups.model
                        .ChangeClusterPlacementGroupCompartmentDetails
                changeClusterPlacementGroupCompartmentDetails = null;

        /**
         * The details of the updated compartment.
         *
         * @param changeClusterPlacementGroupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeClusterPlacementGroupCompartmentDetails(
                com.oracle.bmc.clusterplacementgroups.model
                                .ChangeClusterPlacementGroupCompartmentDetails
                        changeClusterPlacementGroupCompartmentDetails) {
            this.changeClusterPlacementGroupCompartmentDetails =
                    changeClusterPlacementGroupCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeClusterPlacementGroupCompartmentRequest o) {
            clusterPlacementGroupId(o.getClusterPlacementGroupId());
            changeClusterPlacementGroupCompartmentDetails(
                    o.getChangeClusterPlacementGroupCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeClusterPlacementGroupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeClusterPlacementGroupCompartmentRequest
         */
        public ChangeClusterPlacementGroupCompartmentRequest build() {
            ChangeClusterPlacementGroupCompartmentRequest request =
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
                com.oracle.bmc.clusterplacementgroups.model
                                .ChangeClusterPlacementGroupCompartmentDetails
                        body) {
            changeClusterPlacementGroupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeClusterPlacementGroupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeClusterPlacementGroupCompartmentRequest
         */
        public ChangeClusterPlacementGroupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeClusterPlacementGroupCompartmentRequest request =
                    new ChangeClusterPlacementGroupCompartmentRequest();
            request.clusterPlacementGroupId = clusterPlacementGroupId;
            request.changeClusterPlacementGroupCompartmentDetails =
                    changeClusterPlacementGroupCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeClusterPlacementGroupCompartmentRequest(clusterPlacementGroupId,
            // changeClusterPlacementGroupCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .clusterPlacementGroupId(clusterPlacementGroupId)
                .changeClusterPlacementGroupCompartmentDetails(
                        changeClusterPlacementGroupCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",clusterPlacementGroupId=").append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(",changeClusterPlacementGroupCompartmentDetails=")
                .append(String.valueOf(this.changeClusterPlacementGroupCompartmentDetails));
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
        if (!(o instanceof ChangeClusterPlacementGroupCompartmentRequest)) {
            return false;
        }

        ChangeClusterPlacementGroupCompartmentRequest other =
                (ChangeClusterPlacementGroupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(
                        this.changeClusterPlacementGroupCompartmentDetails,
                        other.changeClusterPlacementGroupCompartmentDetails)
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
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeClusterPlacementGroupCompartmentDetails == null
                                ? 43
                                : this.changeClusterPlacementGroupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
