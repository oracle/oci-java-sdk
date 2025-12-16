/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.requests;

import com.oracle.bmc.batch.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchJobCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeBatchJobCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class ChangeBatchJobCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch job.
     */
    private String batchJobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch job.
     */
    public String getBatchJobId() {
        return batchJobId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails
            changeBatchJobCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails
            getChangeBatchJobCompartmentDetails() {
        return changeBatchJobCompartmentDetails;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
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
    public com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails getBody$() {
        return changeBatchJobCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeBatchJobCompartmentRequest,
                    com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch job.
         */
        private String batchJobId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch job.
         *
         * @param batchJobId the value to set
         * @return this builder instance
         */
        public Builder batchJobId(String batchJobId) {
            this.batchJobId = batchJobId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails
                changeBatchJobCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeBatchJobCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeBatchJobCompartmentDetails(
                com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails
                        changeBatchJobCompartmentDetails) {
            this.changeBatchJobCompartmentDetails = changeBatchJobCompartmentDetails;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(ChangeBatchJobCompartmentRequest o) {
            batchJobId(o.getBatchJobId());
            changeBatchJobCompartmentDetails(o.getChangeBatchJobCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeBatchJobCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeBatchJobCompartmentRequest
         */
        public ChangeBatchJobCompartmentRequest build() {
            ChangeBatchJobCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.batch.model.ChangeBatchJobCompartmentDetails body) {
            changeBatchJobCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeBatchJobCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeBatchJobCompartmentRequest
         */
        public ChangeBatchJobCompartmentRequest buildWithoutInvocationCallback() {
            ChangeBatchJobCompartmentRequest request = new ChangeBatchJobCompartmentRequest();
            request.batchJobId = batchJobId;
            request.changeBatchJobCompartmentDetails = changeBatchJobCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeBatchJobCompartmentRequest(batchJobId, changeBatchJobCompartmentDetails,
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
                .batchJobId(batchJobId)
                .changeBatchJobCompartmentDetails(changeBatchJobCompartmentDetails)
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
        sb.append(",batchJobId=").append(String.valueOf(this.batchJobId));
        sb.append(",changeBatchJobCompartmentDetails=")
                .append(String.valueOf(this.changeBatchJobCompartmentDetails));
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
        if (!(o instanceof ChangeBatchJobCompartmentRequest)) {
            return false;
        }

        ChangeBatchJobCompartmentRequest other = (ChangeBatchJobCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.batchJobId, other.batchJobId)
                && java.util.Objects.equals(
                        this.changeBatchJobCompartmentDetails,
                        other.changeBatchJobCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.batchJobId == null ? 43 : this.batchJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBatchJobCompartmentDetails == null
                                ? 43
                                : this.changeBatchJobCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
