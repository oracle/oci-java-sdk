/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateNatGatewayExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateNatGatewayRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateNatGatewayRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateNatGatewayDetails> {

    /**
     * The NAT gateway's
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String natGatewayId;

    /**
     * The NAT gateway's
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }
    /** Details object for updating a NAT gateway. */
    private com.oracle.bmc.core.model.UpdateNatGatewayDetails updateNatGatewayDetails;

    /** Details object for updating a NAT gateway. */
    public com.oracle.bmc.core.model.UpdateNatGatewayDetails getUpdateNatGatewayDetails() {
        return updateNatGatewayDetails;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateNatGatewayDetails getBody$() {
        return updateNatGatewayDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateNatGatewayRequest, com.oracle.bmc.core.model.UpdateNatGatewayDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The NAT gateway's
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String natGatewayId = null;

        /**
         * The NAT gateway's
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param natGatewayId the value to set
         * @return this builder instance
         */
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        /** Details object for updating a NAT gateway. */
        private com.oracle.bmc.core.model.UpdateNatGatewayDetails updateNatGatewayDetails = null;

        /**
         * Details object for updating a NAT gateway.
         *
         * @param updateNatGatewayDetails the value to set
         * @return this builder instance
         */
        public Builder updateNatGatewayDetails(
                com.oracle.bmc.core.model.UpdateNatGatewayDetails updateNatGatewayDetails) {
            this.updateNatGatewayDetails = updateNatGatewayDetails;
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
        public Builder copy(UpdateNatGatewayRequest o) {
            natGatewayId(o.getNatGatewayId());
            updateNatGatewayDetails(o.getUpdateNatGatewayDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateNatGatewayRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateNatGatewayRequest
         */
        public UpdateNatGatewayRequest build() {
            UpdateNatGatewayRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateNatGatewayDetails body) {
            updateNatGatewayDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateNatGatewayRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateNatGatewayRequest
         */
        public UpdateNatGatewayRequest buildWithoutInvocationCallback() {
            UpdateNatGatewayRequest request = new UpdateNatGatewayRequest();
            request.natGatewayId = natGatewayId;
            request.updateNatGatewayDetails = updateNatGatewayDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateNatGatewayRequest(natGatewayId, updateNatGatewayDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .natGatewayId(natGatewayId)
                .updateNatGatewayDetails(updateNatGatewayDetails)
                .ifMatch(ifMatch);
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
        sb.append(",natGatewayId=").append(String.valueOf(this.natGatewayId));
        sb.append(",updateNatGatewayDetails=").append(String.valueOf(this.updateNatGatewayDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNatGatewayRequest)) {
            return false;
        }

        UpdateNatGatewayRequest other = (UpdateNatGatewayRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.natGatewayId, other.natGatewayId)
                && java.util.Objects.equals(
                        this.updateNatGatewayDetails, other.updateNatGatewayDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.natGatewayId == null ? 43 : this.natGatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateNatGatewayDetails == null
                                ? 43
                                : this.updateNatGatewayDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
