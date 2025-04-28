/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccCustomerExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOccCustomerRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class UpdateOccCustomerRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails> {

    /** Request to update the properties of the customer group. */
    private com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails
            updateOccCustomerDetails;

    /** Request to update the properties of the customer group. */
    public com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails
            getUpdateOccCustomerDetails() {
        return updateOccCustomerDetails;
    }
    /** The OCID of the customer group. */
    private String occCustomerGroupId;

    /** The OCID of the customer group. */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
    }
    /** The tenancy id of the customer. */
    private String occCustomerId;

    /** The tenancy id of the customer. */
    public String getOccCustomerId() {
        return occCustomerId;
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
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails getBody$() {
        return updateOccCustomerDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOccCustomerRequest,
                    com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request to update the properties of the customer group. */
        private com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails
                updateOccCustomerDetails = null;

        /**
         * Request to update the properties of the customer group.
         *
         * @param updateOccCustomerDetails the value to set
         * @return this builder instance
         */
        public Builder updateOccCustomerDetails(
                com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails
                        updateOccCustomerDetails) {
            this.updateOccCustomerDetails = updateOccCustomerDetails;
            return this;
        }

        /** The OCID of the customer group. */
        private String occCustomerGroupId = null;

        /**
         * The OCID of the customer group.
         *
         * @param occCustomerGroupId the value to set
         * @return this builder instance
         */
        public Builder occCustomerGroupId(String occCustomerGroupId) {
            this.occCustomerGroupId = occCustomerGroupId;
            return this;
        }

        /** The tenancy id of the customer. */
        private String occCustomerId = null;

        /**
         * The tenancy id of the customer.
         *
         * @param occCustomerId the value to set
         * @return this builder instance
         */
        public Builder occCustomerId(String occCustomerId) {
            this.occCustomerId = occCustomerId;
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
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateOccCustomerRequest o) {
            updateOccCustomerDetails(o.getUpdateOccCustomerDetails());
            occCustomerGroupId(o.getOccCustomerGroupId());
            occCustomerId(o.getOccCustomerId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOccCustomerRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOccCustomerRequest
         */
        public UpdateOccCustomerRequest build() {
            UpdateOccCustomerRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerDetails body) {
            updateOccCustomerDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOccCustomerRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOccCustomerRequest
         */
        public UpdateOccCustomerRequest buildWithoutInvocationCallback() {
            UpdateOccCustomerRequest request = new UpdateOccCustomerRequest();
            request.updateOccCustomerDetails = updateOccCustomerDetails;
            request.occCustomerGroupId = occCustomerGroupId;
            request.occCustomerId = occCustomerId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOccCustomerRequest(updateOccCustomerDetails, occCustomerGroupId,
            // occCustomerId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateOccCustomerDetails(updateOccCustomerDetails)
                .occCustomerGroupId(occCustomerGroupId)
                .occCustomerId(occCustomerId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",updateOccCustomerDetails=")
                .append(String.valueOf(this.updateOccCustomerDetails));
        sb.append(",occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
        sb.append(",occCustomerId=").append(String.valueOf(this.occCustomerId));
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
        if (!(o instanceof UpdateOccCustomerRequest)) {
            return false;
        }

        UpdateOccCustomerRequest other = (UpdateOccCustomerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateOccCustomerDetails, other.updateOccCustomerDetails)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.occCustomerId, other.occCustomerId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateOccCustomerDetails == null
                                ? 43
                                : this.updateOccCustomerDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerId == null ? 43 : this.occCustomerId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
