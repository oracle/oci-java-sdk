/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.requests;

import com.oracle.bmc.batch.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/batch/StopBatchJobPoolExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use StopBatchJobPoolRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
public class StopBatchJobPoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.batch.model.StopBatchJobPoolDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch job pool.
     */
    private String batchJobPoolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * batch job pool.
     */
    public String getBatchJobPoolId() {
        return batchJobPoolId;
    }
    /** Information needed to stop the batch job pool. */
    private com.oracle.bmc.batch.model.StopBatchJobPoolDetails stopBatchJobPoolDetails;

    /** Information needed to stop the batch job pool. */
    public com.oracle.bmc.batch.model.StopBatchJobPoolDetails getStopBatchJobPoolDetails() {
        return stopBatchJobPoolDetails;
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
    public com.oracle.bmc.batch.model.StopBatchJobPoolDetails getBody$() {
        return stopBatchJobPoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    StopBatchJobPoolRequest, com.oracle.bmc.batch.model.StopBatchJobPoolDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch job pool.
         */
        private String batchJobPoolId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * batch job pool.
         *
         * @param batchJobPoolId the value to set
         * @return this builder instance
         */
        public Builder batchJobPoolId(String batchJobPoolId) {
            this.batchJobPoolId = batchJobPoolId;
            return this;
        }

        /** Information needed to stop the batch job pool. */
        private com.oracle.bmc.batch.model.StopBatchJobPoolDetails stopBatchJobPoolDetails = null;

        /**
         * Information needed to stop the batch job pool.
         *
         * @param stopBatchJobPoolDetails the value to set
         * @return this builder instance
         */
        public Builder stopBatchJobPoolDetails(
                com.oracle.bmc.batch.model.StopBatchJobPoolDetails stopBatchJobPoolDetails) {
            this.stopBatchJobPoolDetails = stopBatchJobPoolDetails;
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
        public Builder copy(StopBatchJobPoolRequest o) {
            batchJobPoolId(o.getBatchJobPoolId());
            stopBatchJobPoolDetails(o.getStopBatchJobPoolDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of StopBatchJobPoolRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of StopBatchJobPoolRequest
         */
        public StopBatchJobPoolRequest build() {
            StopBatchJobPoolRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.batch.model.StopBatchJobPoolDetails body) {
            stopBatchJobPoolDetails(body);
            return this;
        }

        /**
         * Build the instance of StopBatchJobPoolRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of StopBatchJobPoolRequest
         */
        public StopBatchJobPoolRequest buildWithoutInvocationCallback() {
            StopBatchJobPoolRequest request = new StopBatchJobPoolRequest();
            request.batchJobPoolId = batchJobPoolId;
            request.stopBatchJobPoolDetails = stopBatchJobPoolDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new StopBatchJobPoolRequest(batchJobPoolId, stopBatchJobPoolDetails, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .batchJobPoolId(batchJobPoolId)
                .stopBatchJobPoolDetails(stopBatchJobPoolDetails)
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
        sb.append(",batchJobPoolId=").append(String.valueOf(this.batchJobPoolId));
        sb.append(",stopBatchJobPoolDetails=").append(String.valueOf(this.stopBatchJobPoolDetails));
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
        if (!(o instanceof StopBatchJobPoolRequest)) {
            return false;
        }

        StopBatchJobPoolRequest other = (StopBatchJobPoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.batchJobPoolId, other.batchJobPoolId)
                && java.util.Objects.equals(
                        this.stopBatchJobPoolDetails, other.stopBatchJobPoolDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchJobPoolId == null ? 43 : this.batchJobPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.stopBatchJobPoolDetails == null
                                ? 43
                                : this.stopBatchJobPoolDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
