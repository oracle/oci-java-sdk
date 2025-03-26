/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeDhcpOptionsCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeDhcpOptionsCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeDhcpOptionsCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the set of DHCP options.
     */
    private String dhcpId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the set of DHCP options.
     */
    public String getDhcpId() {
        return dhcpId;
    }
    /**
     * Request to change the compartment of a set of DHCP Options.
     */
    private com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails
            changeDhcpOptionsCompartmentDetails;

    /**
     * Request to change the compartment of a set of DHCP Options.
     */
    public com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails
            getChangeDhcpOptionsCompartmentDetails() {
        return changeDhcpOptionsCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails getBody$() {
        return changeDhcpOptionsCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDhcpOptionsCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the set of DHCP options.
         */
        private String dhcpId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the set of DHCP options.
         * @param dhcpId the value to set
         * @return this builder instance
         */
        public Builder dhcpId(String dhcpId) {
            this.dhcpId = dhcpId;
            return this;
        }

        /**
         * Request to change the compartment of a set of DHCP Options.
         */
        private com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails
                changeDhcpOptionsCompartmentDetails = null;

        /**
         * Request to change the compartment of a set of DHCP Options.
         * @param changeDhcpOptionsCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDhcpOptionsCompartmentDetails(
                com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails
                        changeDhcpOptionsCompartmentDetails) {
            this.changeDhcpOptionsCompartmentDetails = changeDhcpOptionsCompartmentDetails;
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
        public Builder copy(ChangeDhcpOptionsCompartmentRequest o) {
            dhcpId(o.getDhcpId());
            changeDhcpOptionsCompartmentDetails(o.getChangeDhcpOptionsCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDhcpOptionsCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeDhcpOptionsCompartmentRequest
         */
        public ChangeDhcpOptionsCompartmentRequest build() {
            ChangeDhcpOptionsCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.ChangeDhcpOptionsCompartmentDetails body) {
            changeDhcpOptionsCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDhcpOptionsCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDhcpOptionsCompartmentRequest
         */
        public ChangeDhcpOptionsCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDhcpOptionsCompartmentRequest request = new ChangeDhcpOptionsCompartmentRequest();
            request.dhcpId = dhcpId;
            request.changeDhcpOptionsCompartmentDetails = changeDhcpOptionsCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeDhcpOptionsCompartmentRequest(dhcpId, changeDhcpOptionsCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dhcpId(dhcpId)
                .changeDhcpOptionsCompartmentDetails(changeDhcpOptionsCompartmentDetails)
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
        sb.append(",dhcpId=").append(String.valueOf(this.dhcpId));
        sb.append(",changeDhcpOptionsCompartmentDetails=")
                .append(String.valueOf(this.changeDhcpOptionsCompartmentDetails));
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
        if (!(o instanceof ChangeDhcpOptionsCompartmentRequest)) {
            return false;
        }

        ChangeDhcpOptionsCompartmentRequest other = (ChangeDhcpOptionsCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dhcpId, other.dhcpId)
                && java.util.Objects.equals(
                        this.changeDhcpOptionsCompartmentDetails,
                        other.changeDhcpOptionsCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dhcpId == null ? 43 : this.dhcpId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDhcpOptionsCompartmentDetails == null
                                ? 43
                                : this.changeDhcpOptionsCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
