/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateInternalOccmDemandSignalDeliveryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateInternalOccmDemandSignalDeliveryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class UpdateInternalOccmDemandSignalDeliveryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.capacitymanagement.model
                        .UpdateInternalOccmDemandSignalDeliveryDetails> {

    /** The details about the request to update the specified demand signal delivery. */
    private com.oracle.bmc.capacitymanagement.model.UpdateInternalOccmDemandSignalDeliveryDetails
            updateInternalOccmDemandSignalDeliveryDetails;

    /** The details about the request to update the specified demand signal delivery. */
    public com.oracle.bmc.capacitymanagement.model.UpdateInternalOccmDemandSignalDeliveryDetails
            getUpdateInternalOccmDemandSignalDeliveryDetails() {
        return updateInternalOccmDemandSignalDeliveryDetails;
    }
    /** The OCID of the demand signal delivery. */
    private String occmDemandSignalDeliveryId;

    /** The OCID of the demand signal delivery. */
    public String getOccmDemandSignalDeliveryId() {
        return occmDemandSignalDeliveryId;
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
    public com.oracle.bmc.capacitymanagement.model.UpdateInternalOccmDemandSignalDeliveryDetails
            getBody$() {
        return updateInternalOccmDemandSignalDeliveryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateInternalOccmDemandSignalDeliveryRequest,
                    com.oracle.bmc.capacitymanagement.model
                            .UpdateInternalOccmDemandSignalDeliveryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details about the request to update the specified demand signal delivery. */
        private com.oracle.bmc.capacitymanagement.model
                        .UpdateInternalOccmDemandSignalDeliveryDetails
                updateInternalOccmDemandSignalDeliveryDetails = null;

        /**
         * The details about the request to update the specified demand signal delivery.
         *
         * @param updateInternalOccmDemandSignalDeliveryDetails the value to set
         * @return this builder instance
         */
        public Builder updateInternalOccmDemandSignalDeliveryDetails(
                com.oracle.bmc.capacitymanagement.model
                                .UpdateInternalOccmDemandSignalDeliveryDetails
                        updateInternalOccmDemandSignalDeliveryDetails) {
            this.updateInternalOccmDemandSignalDeliveryDetails =
                    updateInternalOccmDemandSignalDeliveryDetails;
            return this;
        }

        /** The OCID of the demand signal delivery. */
        private String occmDemandSignalDeliveryId = null;

        /**
         * The OCID of the demand signal delivery.
         *
         * @param occmDemandSignalDeliveryId the value to set
         * @return this builder instance
         */
        public Builder occmDemandSignalDeliveryId(String occmDemandSignalDeliveryId) {
            this.occmDemandSignalDeliveryId = occmDemandSignalDeliveryId;
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
        public Builder copy(UpdateInternalOccmDemandSignalDeliveryRequest o) {
            updateInternalOccmDemandSignalDeliveryDetails(
                    o.getUpdateInternalOccmDemandSignalDeliveryDetails());
            occmDemandSignalDeliveryId(o.getOccmDemandSignalDeliveryId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateInternalOccmDemandSignalDeliveryRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateInternalOccmDemandSignalDeliveryRequest
         */
        public UpdateInternalOccmDemandSignalDeliveryRequest build() {
            UpdateInternalOccmDemandSignalDeliveryRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.capacitymanagement.model
                                .UpdateInternalOccmDemandSignalDeliveryDetails
                        body) {
            updateInternalOccmDemandSignalDeliveryDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateInternalOccmDemandSignalDeliveryRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateInternalOccmDemandSignalDeliveryRequest
         */
        public UpdateInternalOccmDemandSignalDeliveryRequest buildWithoutInvocationCallback() {
            UpdateInternalOccmDemandSignalDeliveryRequest request =
                    new UpdateInternalOccmDemandSignalDeliveryRequest();
            request.updateInternalOccmDemandSignalDeliveryDetails =
                    updateInternalOccmDemandSignalDeliveryDetails;
            request.occmDemandSignalDeliveryId = occmDemandSignalDeliveryId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new
            // UpdateInternalOccmDemandSignalDeliveryRequest(updateInternalOccmDemandSignalDeliveryDetails, occmDemandSignalDeliveryId, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateInternalOccmDemandSignalDeliveryDetails(
                        updateInternalOccmDemandSignalDeliveryDetails)
                .occmDemandSignalDeliveryId(occmDemandSignalDeliveryId)
                .opcRequestId(opcRequestId)
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
        sb.append(",updateInternalOccmDemandSignalDeliveryDetails=")
                .append(String.valueOf(this.updateInternalOccmDemandSignalDeliveryDetails));
        sb.append(",occmDemandSignalDeliveryId=")
                .append(String.valueOf(this.occmDemandSignalDeliveryId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInternalOccmDemandSignalDeliveryRequest)) {
            return false;
        }

        UpdateInternalOccmDemandSignalDeliveryRequest other =
                (UpdateInternalOccmDemandSignalDeliveryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateInternalOccmDemandSignalDeliveryDetails,
                        other.updateInternalOccmDemandSignalDeliveryDetails)
                && java.util.Objects.equals(
                        this.occmDemandSignalDeliveryId, other.occmDemandSignalDeliveryId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateInternalOccmDemandSignalDeliveryDetails == null
                                ? 43
                                : this.updateInternalOccmDemandSignalDeliveryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.occmDemandSignalDeliveryId == null
                                ? 43
                                : this.occmDemandSignalDeliveryId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
