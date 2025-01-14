/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateServiceGatewayExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateServiceGatewayRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateServiceGatewayRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateServiceGatewayDetails> {

    /**
     * The service gateway's
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String serviceGatewayId;

    /**
     * The service gateway's
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getServiceGatewayId() {
        return serviceGatewayId;
    }
    /** Details object for updating a service gateway. */
    private com.oracle.bmc.core.model.UpdateServiceGatewayDetails updateServiceGatewayDetails;

    /** Details object for updating a service gateway. */
    public com.oracle.bmc.core.model.UpdateServiceGatewayDetails getUpdateServiceGatewayDetails() {
        return updateServiceGatewayDetails;
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
    public com.oracle.bmc.core.model.UpdateServiceGatewayDetails getBody$() {
        return updateServiceGatewayDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateServiceGatewayRequest,
                    com.oracle.bmc.core.model.UpdateServiceGatewayDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The service gateway's
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String serviceGatewayId = null;

        /**
         * The service gateway's
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param serviceGatewayId the value to set
         * @return this builder instance
         */
        public Builder serviceGatewayId(String serviceGatewayId) {
            this.serviceGatewayId = serviceGatewayId;
            return this;
        }

        /** Details object for updating a service gateway. */
        private com.oracle.bmc.core.model.UpdateServiceGatewayDetails updateServiceGatewayDetails =
                null;

        /**
         * Details object for updating a service gateway.
         *
         * @param updateServiceGatewayDetails the value to set
         * @return this builder instance
         */
        public Builder updateServiceGatewayDetails(
                com.oracle.bmc.core.model.UpdateServiceGatewayDetails updateServiceGatewayDetails) {
            this.updateServiceGatewayDetails = updateServiceGatewayDetails;
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
        public Builder copy(UpdateServiceGatewayRequest o) {
            serviceGatewayId(o.getServiceGatewayId());
            updateServiceGatewayDetails(o.getUpdateServiceGatewayDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateServiceGatewayRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateServiceGatewayRequest
         */
        public UpdateServiceGatewayRequest build() {
            UpdateServiceGatewayRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateServiceGatewayDetails body) {
            updateServiceGatewayDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateServiceGatewayRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateServiceGatewayRequest
         */
        public UpdateServiceGatewayRequest buildWithoutInvocationCallback() {
            UpdateServiceGatewayRequest request = new UpdateServiceGatewayRequest();
            request.serviceGatewayId = serviceGatewayId;
            request.updateServiceGatewayDetails = updateServiceGatewayDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateServiceGatewayRequest(serviceGatewayId, updateServiceGatewayDetails,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceGatewayId(serviceGatewayId)
                .updateServiceGatewayDetails(updateServiceGatewayDetails)
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
        sb.append(",serviceGatewayId=").append(String.valueOf(this.serviceGatewayId));
        sb.append(",updateServiceGatewayDetails=")
                .append(String.valueOf(this.updateServiceGatewayDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateServiceGatewayRequest)) {
            return false;
        }

        UpdateServiceGatewayRequest other = (UpdateServiceGatewayRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceGatewayId, other.serviceGatewayId)
                && java.util.Objects.equals(
                        this.updateServiceGatewayDetails, other.updateServiceGatewayDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceGatewayId == null ? 43 : this.serviceGatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateServiceGatewayDetails == null
                                ? 43
                                : this.updateServiceGatewayDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
