/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateLocalPeeringGatewayExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateLocalPeeringGatewayRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateLocalPeeringGatewayRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the local peering gateway.
     */
    private String localPeeringGatewayId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the local peering gateway.
     */
    public String getLocalPeeringGatewayId() {
        return localPeeringGatewayId;
    }
    /** Details object for updating a local peering gateway. */
    private com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails
            updateLocalPeeringGatewayDetails;

    /** Details object for updating a local peering gateway. */
    public com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails
            getUpdateLocalPeeringGatewayDetails() {
        return updateLocalPeeringGatewayDetails;
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
    public com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails getBody$() {
        return updateLocalPeeringGatewayDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLocalPeeringGatewayRequest,
                    com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the local peering gateway.
         */
        private String localPeeringGatewayId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the local peering gateway.
         *
         * @param localPeeringGatewayId the value to set
         * @return this builder instance
         */
        public Builder localPeeringGatewayId(String localPeeringGatewayId) {
            this.localPeeringGatewayId = localPeeringGatewayId;
            return this;
        }

        /** Details object for updating a local peering gateway. */
        private com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails
                updateLocalPeeringGatewayDetails = null;

        /**
         * Details object for updating a local peering gateway.
         *
         * @param updateLocalPeeringGatewayDetails the value to set
         * @return this builder instance
         */
        public Builder updateLocalPeeringGatewayDetails(
                com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails
                        updateLocalPeeringGatewayDetails) {
            this.updateLocalPeeringGatewayDetails = updateLocalPeeringGatewayDetails;
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
        public Builder copy(UpdateLocalPeeringGatewayRequest o) {
            localPeeringGatewayId(o.getLocalPeeringGatewayId());
            updateLocalPeeringGatewayDetails(o.getUpdateLocalPeeringGatewayDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLocalPeeringGatewayRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateLocalPeeringGatewayRequest
         */
        public UpdateLocalPeeringGatewayRequest build() {
            UpdateLocalPeeringGatewayRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateLocalPeeringGatewayDetails body) {
            updateLocalPeeringGatewayDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateLocalPeeringGatewayRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLocalPeeringGatewayRequest
         */
        public UpdateLocalPeeringGatewayRequest buildWithoutInvocationCallback() {
            UpdateLocalPeeringGatewayRequest request = new UpdateLocalPeeringGatewayRequest();
            request.localPeeringGatewayId = localPeeringGatewayId;
            request.updateLocalPeeringGatewayDetails = updateLocalPeeringGatewayDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateLocalPeeringGatewayRequest(localPeeringGatewayId,
            // updateLocalPeeringGatewayDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .localPeeringGatewayId(localPeeringGatewayId)
                .updateLocalPeeringGatewayDetails(updateLocalPeeringGatewayDetails)
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
        sb.append(",localPeeringGatewayId=").append(String.valueOf(this.localPeeringGatewayId));
        sb.append(",updateLocalPeeringGatewayDetails=")
                .append(String.valueOf(this.updateLocalPeeringGatewayDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLocalPeeringGatewayRequest)) {
            return false;
        }

        UpdateLocalPeeringGatewayRequest other = (UpdateLocalPeeringGatewayRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.localPeeringGatewayId, other.localPeeringGatewayId)
                && java.util.Objects.equals(
                        this.updateLocalPeeringGatewayDetails,
                        other.updateLocalPeeringGatewayDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.localPeeringGatewayId == null
                                ? 43
                                : this.localPeeringGatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateLocalPeeringGatewayDetails == null
                                ? 43
                                : this.updateLocalPeeringGatewayDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
