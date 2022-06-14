/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeByoipRangeCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeByoipRangeCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeByoipRangeCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource containing the BYOIP CIDR block.
     */
    private String byoipRangeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource containing the BYOIP CIDR block.
     */
    public String getByoipRangeId() {
        return byoipRangeId;
    }
    /**
     * Request to change the compartment of a BYOIP CIDR block.
     */
    private com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails
            changeByoipRangeCompartmentDetails;

    /**
     * Request to change the compartment of a BYOIP CIDR block.
     */
    public com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails
            getChangeByoipRangeCompartmentDetails() {
        return changeByoipRangeCompartmentDetails;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
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
    public com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails getBody$() {
        return changeByoipRangeCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeByoipRangeCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource containing the BYOIP CIDR block.
         */
        private String byoipRangeId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the {@code ByoipRange} resource containing the BYOIP CIDR block.
         * @param byoipRangeId the value to set
         * @return this builder instance
         */
        public Builder byoipRangeId(String byoipRangeId) {
            this.byoipRangeId = byoipRangeId;
            return this;
        }

        /**
         * Request to change the compartment of a BYOIP CIDR block.
         */
        private com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails
                changeByoipRangeCompartmentDetails = null;

        /**
         * Request to change the compartment of a BYOIP CIDR block.
         * @param changeByoipRangeCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeByoipRangeCompartmentDetails(
                com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails
                        changeByoipRangeCompartmentDetails) {
            this.changeByoipRangeCompartmentDetails = changeByoipRangeCompartmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
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
        public Builder copy(ChangeByoipRangeCompartmentRequest o) {
            byoipRangeId(o.getByoipRangeId());
            changeByoipRangeCompartmentDetails(o.getChangeByoipRangeCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeByoipRangeCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeByoipRangeCompartmentRequest
         */
        public ChangeByoipRangeCompartmentRequest build() {
            ChangeByoipRangeCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.ChangeByoipRangeCompartmentDetails body) {
            changeByoipRangeCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeByoipRangeCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeByoipRangeCompartmentRequest
         */
        public ChangeByoipRangeCompartmentRequest buildWithoutInvocationCallback() {
            ChangeByoipRangeCompartmentRequest request = new ChangeByoipRangeCompartmentRequest();
            request.byoipRangeId = byoipRangeId;
            request.changeByoipRangeCompartmentDetails = changeByoipRangeCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeByoipRangeCompartmentRequest(byoipRangeId, changeByoipRangeCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .byoipRangeId(byoipRangeId)
                .changeByoipRangeCompartmentDetails(changeByoipRangeCompartmentDetails)
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
        sb.append(",byoipRangeId=").append(String.valueOf(this.byoipRangeId));
        sb.append(",changeByoipRangeCompartmentDetails=")
                .append(String.valueOf(this.changeByoipRangeCompartmentDetails));
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
        if (!(o instanceof ChangeByoipRangeCompartmentRequest)) {
            return false;
        }

        ChangeByoipRangeCompartmentRequest other = (ChangeByoipRangeCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.byoipRangeId, other.byoipRangeId)
                && java.util.Objects.equals(
                        this.changeByoipRangeCompartmentDetails,
                        other.changeByoipRangeCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.byoipRangeId == null ? 43 : this.byoipRangeId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeByoipRangeCompartmentDetails == null
                                ? 43
                                : this.changeByoipRangeCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
