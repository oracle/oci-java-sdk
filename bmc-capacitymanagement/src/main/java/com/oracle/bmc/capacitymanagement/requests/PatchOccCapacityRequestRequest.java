/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/PatchOccCapacityRequestExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PatchOccCapacityRequestRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class PatchOccCapacityRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails> {

    /** Request to update the details of the capacity request. */
    private com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails
            patchOccCapacityRequestDetails;

    /** Request to update the details of the capacity request. */
    public com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails
            getPatchOccCapacityRequestDetails() {
        return patchOccCapacityRequestDetails;
    }
    /** The OCID of the capacity request. */
    private String occCapacityRequestId;

    /** The OCID of the capacity request. */
    public String getOccCapacityRequestId() {
        return occCapacityRequestId;
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
    public com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails getBody$() {
        return patchOccCapacityRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchOccCapacityRequestRequest,
                    com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request to update the details of the capacity request. */
        private com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails
                patchOccCapacityRequestDetails = null;

        /**
         * Request to update the details of the capacity request.
         *
         * @param patchOccCapacityRequestDetails the value to set
         * @return this builder instance
         */
        public Builder patchOccCapacityRequestDetails(
                com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails
                        patchOccCapacityRequestDetails) {
            this.patchOccCapacityRequestDetails = patchOccCapacityRequestDetails;
            return this;
        }

        /** The OCID of the capacity request. */
        private String occCapacityRequestId = null;

        /**
         * The OCID of the capacity request.
         *
         * @param occCapacityRequestId the value to set
         * @return this builder instance
         */
        public Builder occCapacityRequestId(String occCapacityRequestId) {
            this.occCapacityRequestId = occCapacityRequestId;
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
        public Builder copy(PatchOccCapacityRequestRequest o) {
            patchOccCapacityRequestDetails(o.getPatchOccCapacityRequestDetails());
            occCapacityRequestId(o.getOccCapacityRequestId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchOccCapacityRequestRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PatchOccCapacityRequestRequest
         */
        public PatchOccCapacityRequestRequest build() {
            PatchOccCapacityRequestRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.capacitymanagement.model.PatchOccCapacityRequestDetails body) {
            patchOccCapacityRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of PatchOccCapacityRequestRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PatchOccCapacityRequestRequest
         */
        public PatchOccCapacityRequestRequest buildWithoutInvocationCallback() {
            PatchOccCapacityRequestRequest request = new PatchOccCapacityRequestRequest();
            request.patchOccCapacityRequestDetails = patchOccCapacityRequestDetails;
            request.occCapacityRequestId = occCapacityRequestId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new PatchOccCapacityRequestRequest(patchOccCapacityRequestDetails,
            // occCapacityRequestId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .patchOccCapacityRequestDetails(patchOccCapacityRequestDetails)
                .occCapacityRequestId(occCapacityRequestId)
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
        sb.append(",patchOccCapacityRequestDetails=")
                .append(String.valueOf(this.patchOccCapacityRequestDetails));
        sb.append(",occCapacityRequestId=").append(String.valueOf(this.occCapacityRequestId));
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
        if (!(o instanceof PatchOccCapacityRequestRequest)) {
            return false;
        }

        PatchOccCapacityRequestRequest other = (PatchOccCapacityRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.patchOccCapacityRequestDetails, other.patchOccCapacityRequestDetails)
                && java.util.Objects.equals(this.occCapacityRequestId, other.occCapacityRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.patchOccCapacityRequestDetails == null
                                ? 43
                                : this.patchOccCapacityRequestDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.occCapacityRequestId == null
                                ? 43
                                : this.occCapacityRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
