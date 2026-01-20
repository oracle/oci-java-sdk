/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.requests;

import com.oracle.bmc.batch.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/ChangeBatchTaskEnvironmentCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeBatchTaskEnvironmentCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class ChangeBatchTaskEnvironmentCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch task environment.
     */
    private String batchTaskEnvironmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch task environment.
     */
    public String getBatchTaskEnvironmentId() {
        return batchTaskEnvironmentId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails
            changeBatchTaskEnvironmentCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails
            getChangeBatchTaskEnvironmentCompartmentDetails() {
        return changeBatchTaskEnvironmentCompartmentDetails;
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
    public com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails getBody$() {
        return changeBatchTaskEnvironmentCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeBatchTaskEnvironmentCompartmentRequest,
                    com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch task environment.
         */
        private String batchTaskEnvironmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch task environment.
         *
         * @param batchTaskEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder batchTaskEnvironmentId(String batchTaskEnvironmentId) {
            this.batchTaskEnvironmentId = batchTaskEnvironmentId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails
                changeBatchTaskEnvironmentCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeBatchTaskEnvironmentCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeBatchTaskEnvironmentCompartmentDetails(
                com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails
                        changeBatchTaskEnvironmentCompartmentDetails) {
            this.changeBatchTaskEnvironmentCompartmentDetails =
                    changeBatchTaskEnvironmentCompartmentDetails;
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
        public Builder copy(ChangeBatchTaskEnvironmentCompartmentRequest o) {
            batchTaskEnvironmentId(o.getBatchTaskEnvironmentId());
            changeBatchTaskEnvironmentCompartmentDetails(
                    o.getChangeBatchTaskEnvironmentCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeBatchTaskEnvironmentCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeBatchTaskEnvironmentCompartmentRequest
         */
        public ChangeBatchTaskEnvironmentCompartmentRequest build() {
            ChangeBatchTaskEnvironmentCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.batch.model.ChangeBatchTaskEnvironmentCompartmentDetails body) {
            changeBatchTaskEnvironmentCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeBatchTaskEnvironmentCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeBatchTaskEnvironmentCompartmentRequest
         */
        public ChangeBatchTaskEnvironmentCompartmentRequest buildWithoutInvocationCallback() {
            ChangeBatchTaskEnvironmentCompartmentRequest request =
                    new ChangeBatchTaskEnvironmentCompartmentRequest();
            request.batchTaskEnvironmentId = batchTaskEnvironmentId;
            request.changeBatchTaskEnvironmentCompartmentDetails =
                    changeBatchTaskEnvironmentCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeBatchTaskEnvironmentCompartmentRequest(batchTaskEnvironmentId,
            // changeBatchTaskEnvironmentCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .batchTaskEnvironmentId(batchTaskEnvironmentId)
                .changeBatchTaskEnvironmentCompartmentDetails(
                        changeBatchTaskEnvironmentCompartmentDetails)
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
        sb.append(",batchTaskEnvironmentId=").append(String.valueOf(this.batchTaskEnvironmentId));
        sb.append(",changeBatchTaskEnvironmentCompartmentDetails=")
                .append(String.valueOf(this.changeBatchTaskEnvironmentCompartmentDetails));
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
        if (!(o instanceof ChangeBatchTaskEnvironmentCompartmentRequest)) {
            return false;
        }

        ChangeBatchTaskEnvironmentCompartmentRequest other =
                (ChangeBatchTaskEnvironmentCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.batchTaskEnvironmentId, other.batchTaskEnvironmentId)
                && java.util.Objects.equals(
                        this.changeBatchTaskEnvironmentCompartmentDetails,
                        other.changeBatchTaskEnvironmentCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchTaskEnvironmentId == null
                                ? 43
                                : this.batchTaskEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBatchTaskEnvironmentCompartmentDetails == null
                                ? 43
                                : this.changeBatchTaskEnvironmentCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
