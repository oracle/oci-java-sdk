/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.requests;

import com.oracle.bmc.fleetsoftwareupdate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/CloneFsuCycleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CloneFsuCycleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class CloneFsuCycleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails> {

    /**
     * Unique Exadata Fleet Update Cycle identifier.
     *
     */
    private String fsuCycleId;

    /**
     * Unique Exadata Fleet Update Cycle identifier.
     *
     */
    public String getFsuCycleId() {
        return fsuCycleId;
    }
    /**
     * The Exadata Fleet Update Cycle properties to be updated in the cloned Cycle instead of using the existing values.
     */
    private com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails cloneFsuCycleDetails;

    /**
     * The Exadata Fleet Update Cycle properties to be updated in the cloned Cycle instead of using the existing values.
     */
    public com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails getCloneFsuCycleDetails() {
        return cloneFsuCycleDetails;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails getBody$() {
        return cloneFsuCycleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CloneFsuCycleRequest,
                    com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Exadata Fleet Update Cycle identifier.
         *
         */
        private String fsuCycleId = null;

        /**
         * Unique Exadata Fleet Update Cycle identifier.
         *
         * @param fsuCycleId the value to set
         * @return this builder instance
         */
        public Builder fsuCycleId(String fsuCycleId) {
            this.fsuCycleId = fsuCycleId;
            return this;
        }

        /**
         * The Exadata Fleet Update Cycle properties to be updated in the cloned Cycle instead of using the existing values.
         */
        private com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails cloneFsuCycleDetails =
                null;

        /**
         * The Exadata Fleet Update Cycle properties to be updated in the cloned Cycle instead of using the existing values.
         * @param cloneFsuCycleDetails the value to set
         * @return this builder instance
         */
        public Builder cloneFsuCycleDetails(
                com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails
                        cloneFsuCycleDetails) {
            this.cloneFsuCycleDetails = cloneFsuCycleDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         *
         */
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
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
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
        public Builder copy(CloneFsuCycleRequest o) {
            fsuCycleId(o.getFsuCycleId());
            cloneFsuCycleDetails(o.getCloneFsuCycleDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CloneFsuCycleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CloneFsuCycleRequest
         */
        public CloneFsuCycleRequest build() {
            CloneFsuCycleRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.fleetsoftwareupdate.model.CloneFsuCycleDetails body) {
            cloneFsuCycleDetails(body);
            return this;
        }

        /**
         * Build the instance of CloneFsuCycleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CloneFsuCycleRequest
         */
        public CloneFsuCycleRequest buildWithoutInvocationCallback() {
            CloneFsuCycleRequest request = new CloneFsuCycleRequest();
            request.fsuCycleId = fsuCycleId;
            request.cloneFsuCycleDetails = cloneFsuCycleDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CloneFsuCycleRequest(fsuCycleId, cloneFsuCycleDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fsuCycleId(fsuCycleId)
                .cloneFsuCycleDetails(cloneFsuCycleDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",fsuCycleId=").append(String.valueOf(this.fsuCycleId));
        sb.append(",cloneFsuCycleDetails=").append(String.valueOf(this.cloneFsuCycleDetails));
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
        if (!(o instanceof CloneFsuCycleRequest)) {
            return false;
        }

        CloneFsuCycleRequest other = (CloneFsuCycleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fsuCycleId, other.fsuCycleId)
                && java.util.Objects.equals(this.cloneFsuCycleDetails, other.cloneFsuCycleDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fsuCycleId == null ? 43 : this.fsuCycleId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloneFsuCycleDetails == null
                                ? 43
                                : this.cloneFsuCycleDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
