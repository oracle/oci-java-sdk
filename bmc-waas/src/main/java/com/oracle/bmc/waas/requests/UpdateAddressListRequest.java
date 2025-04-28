/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/UpdateAddressListExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAddressListRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class UpdateAddressListRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waas.model.UpdateAddressListDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * address list. This number is generated when the address list is added to the compartment.
     */
    private String addressListId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * address list. This number is generated when the address list is added to the compartment.
     */
    public String getAddressListId() {
        return addressListId;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or
     * {@code POST} response for that resource. The resource will be updated or deleted only if the
     * etag provided matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource,
     * set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or
     * {@code POST} response for that resource. The resource will be updated or deleted only if the
     * etag provided matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The details of the address list to update. */
    private com.oracle.bmc.waas.model.UpdateAddressListDetails updateAddressListDetails;

    /** The details of the address list to update. */
    public com.oracle.bmc.waas.model.UpdateAddressListDetails getUpdateAddressListDetails() {
        return updateAddressListDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.waas.model.UpdateAddressListDetails getBody$() {
        return updateAddressListDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAddressListRequest, com.oracle.bmc.waas.model.UpdateAddressListDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * address list. This number is generated when the address list is added to the compartment.
         */
        private String addressListId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * address list. This number is generated when the address list is added to the compartment.
         *
         * @param addressListId the value to set
         * @return this builder instance
         */
        public Builder addressListId(String addressListId) {
            this.addressListId = addressListId;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous
         * {@code GET} or {@code POST} response for that resource. The resource will be updated or
         * deleted only if the etag provided matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a previous
         * {@code GET} or {@code POST} response for that resource. The resource will be updated or
         * deleted only if the etag provided matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The details of the address list to update. */
        private com.oracle.bmc.waas.model.UpdateAddressListDetails updateAddressListDetails = null;

        /**
         * The details of the address list to update.
         *
         * @param updateAddressListDetails the value to set
         * @return this builder instance
         */
        public Builder updateAddressListDetails(
                com.oracle.bmc.waas.model.UpdateAddressListDetails updateAddressListDetails) {
            this.updateAddressListDetails = updateAddressListDetails;
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
        public Builder copy(UpdateAddressListRequest o) {
            addressListId(o.getAddressListId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            updateAddressListDetails(o.getUpdateAddressListDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAddressListRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAddressListRequest
         */
        public UpdateAddressListRequest build() {
            UpdateAddressListRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.waas.model.UpdateAddressListDetails body) {
            updateAddressListDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAddressListRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAddressListRequest
         */
        public UpdateAddressListRequest buildWithoutInvocationCallback() {
            UpdateAddressListRequest request = new UpdateAddressListRequest();
            request.addressListId = addressListId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.updateAddressListDetails = updateAddressListDetails;
            return request;
            // new UpdateAddressListRequest(addressListId, opcRequestId, ifMatch,
            // updateAddressListDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .addressListId(addressListId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .updateAddressListDetails(updateAddressListDetails);
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
        sb.append(",addressListId=").append(String.valueOf(this.addressListId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",updateAddressListDetails=")
                .append(String.valueOf(this.updateAddressListDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAddressListRequest)) {
            return false;
        }

        UpdateAddressListRequest other = (UpdateAddressListRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.addressListId, other.addressListId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(
                        this.updateAddressListDetails, other.updateAddressListDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.addressListId == null ? 43 : this.addressListId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAddressListDetails == null
                                ? 43
                                : this.updateAddressListDetails.hashCode());
        return result;
    }
}
