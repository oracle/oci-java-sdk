/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccCustomerGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOccCustomerGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class UpdateOccCustomerGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails> {

    /** Request to update the properties of the customer group. */
    private com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails
            updateOccCustomerGroupDetails;

    /** Request to update the properties of the customer group. */
    public com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails
            getUpdateOccCustomerGroupDetails() {
        return updateOccCustomerGroupDetails;
    }
    /** The OCID of the customer group. */
    private String occCustomerGroupId;

    /** The OCID of the customer group. */
    public String getOccCustomerGroupId() {
        return occCustomerGroupId;
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
    public com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails getBody$() {
        return updateOccCustomerGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOccCustomerGroupRequest,
                    com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request to update the properties of the customer group. */
        private com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails
                updateOccCustomerGroupDetails = null;

        /**
         * Request to update the properties of the customer group.
         *
         * @param updateOccCustomerGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateOccCustomerGroupDetails(
                com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails
                        updateOccCustomerGroupDetails) {
            this.updateOccCustomerGroupDetails = updateOccCustomerGroupDetails;
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
        public Builder copy(UpdateOccCustomerGroupRequest o) {
            updateOccCustomerGroupDetails(o.getUpdateOccCustomerGroupDetails());
            occCustomerGroupId(o.getOccCustomerGroupId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOccCustomerGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOccCustomerGroupRequest
         */
        public UpdateOccCustomerGroupRequest build() {
            UpdateOccCustomerGroupRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.capacitymanagement.model.UpdateOccCustomerGroupDetails body) {
            updateOccCustomerGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOccCustomerGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOccCustomerGroupRequest
         */
        public UpdateOccCustomerGroupRequest buildWithoutInvocationCallback() {
            UpdateOccCustomerGroupRequest request = new UpdateOccCustomerGroupRequest();
            request.updateOccCustomerGroupDetails = updateOccCustomerGroupDetails;
            request.occCustomerGroupId = occCustomerGroupId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOccCustomerGroupRequest(updateOccCustomerGroupDetails, occCustomerGroupId,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateOccCustomerGroupDetails(updateOccCustomerGroupDetails)
                .occCustomerGroupId(occCustomerGroupId)
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
        sb.append(",updateOccCustomerGroupDetails=")
                .append(String.valueOf(this.updateOccCustomerGroupDetails));
        sb.append(",occCustomerGroupId=").append(String.valueOf(this.occCustomerGroupId));
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
        if (!(o instanceof UpdateOccCustomerGroupRequest)) {
            return false;
        }

        UpdateOccCustomerGroupRequest other = (UpdateOccCustomerGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateOccCustomerGroupDetails, other.updateOccCustomerGroupDetails)
                && java.util.Objects.equals(this.occCustomerGroupId, other.occCustomerGroupId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateOccCustomerGroupDetails == null
                                ? 43
                                : this.updateOccCustomerGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.occCustomerGroupId == null
                                ? 43
                                : this.occCustomerGroupId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
