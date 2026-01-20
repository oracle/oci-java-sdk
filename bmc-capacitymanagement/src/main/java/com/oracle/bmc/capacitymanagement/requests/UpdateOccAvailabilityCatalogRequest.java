/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/UpdateOccAvailabilityCatalogExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOccAvailabilityCatalogRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class UpdateOccAvailabilityCatalogRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails> {

    /** Request to update the properties of the availability catalog. */
    private com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails
            updateOccAvailabilityCatalogDetails;

    /** Request to update the properties of the availability catalog. */
    public com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails
            getUpdateOccAvailabilityCatalogDetails() {
        return updateOccAvailabilityCatalogDetails;
    }
    /** The OCID of the availability catalog. */
    private String occAvailabilityCatalogId;

    /** The OCID of the availability catalog. */
    public String getOccAvailabilityCatalogId() {
        return occAvailabilityCatalogId;
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
    public com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails getBody$() {
        return updateOccAvailabilityCatalogDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOccAvailabilityCatalogRequest,
                    com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request to update the properties of the availability catalog. */
        private com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails
                updateOccAvailabilityCatalogDetails = null;

        /**
         * Request to update the properties of the availability catalog.
         *
         * @param updateOccAvailabilityCatalogDetails the value to set
         * @return this builder instance
         */
        public Builder updateOccAvailabilityCatalogDetails(
                com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails
                        updateOccAvailabilityCatalogDetails) {
            this.updateOccAvailabilityCatalogDetails = updateOccAvailabilityCatalogDetails;
            return this;
        }

        /** The OCID of the availability catalog. */
        private String occAvailabilityCatalogId = null;

        /**
         * The OCID of the availability catalog.
         *
         * @param occAvailabilityCatalogId the value to set
         * @return this builder instance
         */
        public Builder occAvailabilityCatalogId(String occAvailabilityCatalogId) {
            this.occAvailabilityCatalogId = occAvailabilityCatalogId;
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
        public Builder copy(UpdateOccAvailabilityCatalogRequest o) {
            updateOccAvailabilityCatalogDetails(o.getUpdateOccAvailabilityCatalogDetails());
            occAvailabilityCatalogId(o.getOccAvailabilityCatalogId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOccAvailabilityCatalogRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOccAvailabilityCatalogRequest
         */
        public UpdateOccAvailabilityCatalogRequest build() {
            UpdateOccAvailabilityCatalogRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.capacitymanagement.model.UpdateOccAvailabilityCatalogDetails body) {
            updateOccAvailabilityCatalogDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOccAvailabilityCatalogRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOccAvailabilityCatalogRequest
         */
        public UpdateOccAvailabilityCatalogRequest buildWithoutInvocationCallback() {
            UpdateOccAvailabilityCatalogRequest request = new UpdateOccAvailabilityCatalogRequest();
            request.updateOccAvailabilityCatalogDetails = updateOccAvailabilityCatalogDetails;
            request.occAvailabilityCatalogId = occAvailabilityCatalogId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOccAvailabilityCatalogRequest(updateOccAvailabilityCatalogDetails,
            // occAvailabilityCatalogId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateOccAvailabilityCatalogDetails(updateOccAvailabilityCatalogDetails)
                .occAvailabilityCatalogId(occAvailabilityCatalogId)
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
        sb.append(",updateOccAvailabilityCatalogDetails=")
                .append(String.valueOf(this.updateOccAvailabilityCatalogDetails));
        sb.append(",occAvailabilityCatalogId=")
                .append(String.valueOf(this.occAvailabilityCatalogId));
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
        if (!(o instanceof UpdateOccAvailabilityCatalogRequest)) {
            return false;
        }

        UpdateOccAvailabilityCatalogRequest other = (UpdateOccAvailabilityCatalogRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateOccAvailabilityCatalogDetails,
                        other.updateOccAvailabilityCatalogDetails)
                && java.util.Objects.equals(
                        this.occAvailabilityCatalogId, other.occAvailabilityCatalogId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateOccAvailabilityCatalogDetails == null
                                ? 43
                                : this.updateOccAvailabilityCatalogDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.occAvailabilityCatalogId == null
                                ? 43
                                : this.occAvailabilityCatalogId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
