/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ReplicateOracleDbGcpKeyRingExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ReplicateOracleDbGcpKeyRingRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class ReplicateOracleDbGcpKeyRingRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle DB GCP Key-Ring resource.
     */
    private String oracleDbGcpKeyRingId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle DB GCP Key-Ring resource.
     */
    public String getOracleDbGcpKeyRingId() {
        return oracleDbGcpKeyRingId;
    }
    /**
     * Details for to Replicate Oracle DD GCP Key Ring to target region.
     */
    private com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails
            replicateOracleDbGcpKeyRingDetails;

    /**
     * Details for to Replicate Oracle DD GCP Key Ring to target region.
     */
    public com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails
            getReplicateOracleDbGcpKeyRingDetails() {
        return replicateOracleDbGcpKeyRingDetails;
    }
    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of a timeout or server error without the risk of the action being executed more than once.
     * <p>
     * Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations occur.
     * <p>
     * For example, if a resource has been deleted and permanently purged from the system, a retry of the original creation request may be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of a timeout or server error without the risk of the action being executed more than once.
     * <p>
     * Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations occur.
     * <p>
     * For example, if a resource has been deleted and permanently purged from the system, a retry of the original creation request may be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails getBody$() {
        return replicateOracleDbGcpKeyRingDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ReplicateOracleDbGcpKeyRingRequest,
                    com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle DB GCP Key-Ring resource.
         */
        private String oracleDbGcpKeyRingId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle DB GCP Key-Ring resource.
         * @param oracleDbGcpKeyRingId the value to set
         * @return this builder instance
         */
        public Builder oracleDbGcpKeyRingId(String oracleDbGcpKeyRingId) {
            this.oracleDbGcpKeyRingId = oracleDbGcpKeyRingId;
            return this;
        }

        /**
         * Details for to Replicate Oracle DD GCP Key Ring to target region.
         */
        private com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails
                replicateOracleDbGcpKeyRingDetails = null;

        /**
         * Details for to Replicate Oracle DD GCP Key Ring to target region.
         * @param replicateOracleDbGcpKeyRingDetails the value to set
         * @return this builder instance
         */
        public Builder replicateOracleDbGcpKeyRingDetails(
                com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails
                        replicateOracleDbGcpKeyRingDetails) {
            this.replicateOracleDbGcpKeyRingDetails = replicateOracleDbGcpKeyRingDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event of a timeout or server error without the risk of the action being executed more than once.
         * <p>
         * Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations occur.
         * <p>
         * For example, if a resource has been deleted and permanently purged from the system, a retry of the original creation request may be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event of a timeout or server error without the risk of the action being executed more than once.
         * <p>
         * Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations occur.
         * <p>
         * For example, if a resource has been deleted and permanently purged from the system, a retry of the original creation request may be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ReplicateOracleDbGcpKeyRingRequest o) {
            oracleDbGcpKeyRingId(o.getOracleDbGcpKeyRingId());
            replicateOracleDbGcpKeyRingDetails(o.getReplicateOracleDbGcpKeyRingDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ReplicateOracleDbGcpKeyRingRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ReplicateOracleDbGcpKeyRingRequest
         */
        public ReplicateOracleDbGcpKeyRingRequest build() {
            ReplicateOracleDbGcpKeyRingRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dbmulticloud.model.ReplicateOracleDbGcpKeyRingDetails body) {
            replicateOracleDbGcpKeyRingDetails(body);
            return this;
        }

        /**
         * Build the instance of ReplicateOracleDbGcpKeyRingRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ReplicateOracleDbGcpKeyRingRequest
         */
        public ReplicateOracleDbGcpKeyRingRequest buildWithoutInvocationCallback() {
            ReplicateOracleDbGcpKeyRingRequest request = new ReplicateOracleDbGcpKeyRingRequest();
            request.oracleDbGcpKeyRingId = oracleDbGcpKeyRingId;
            request.replicateOracleDbGcpKeyRingDetails = replicateOracleDbGcpKeyRingDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ReplicateOracleDbGcpKeyRingRequest(oracleDbGcpKeyRingId, replicateOracleDbGcpKeyRingDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .oracleDbGcpKeyRingId(oracleDbGcpKeyRingId)
                .replicateOracleDbGcpKeyRingDetails(replicateOracleDbGcpKeyRingDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",oracleDbGcpKeyRingId=").append(String.valueOf(this.oracleDbGcpKeyRingId));
        sb.append(",replicateOracleDbGcpKeyRingDetails=")
                .append(String.valueOf(this.replicateOracleDbGcpKeyRingDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof ReplicateOracleDbGcpKeyRingRequest)) {
            return false;
        }

        ReplicateOracleDbGcpKeyRingRequest other = (ReplicateOracleDbGcpKeyRingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.oracleDbGcpKeyRingId, other.oracleDbGcpKeyRingId)
                && java.util.Objects.equals(
                        this.replicateOracleDbGcpKeyRingDetails,
                        other.replicateOracleDbGcpKeyRingDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oracleDbGcpKeyRingId == null
                                ? 43
                                : this.oracleDbGcpKeyRingId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicateOracleDbGcpKeyRingDetails == null
                                ? 43
                                : this.replicateOracleDbGcpKeyRingDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
