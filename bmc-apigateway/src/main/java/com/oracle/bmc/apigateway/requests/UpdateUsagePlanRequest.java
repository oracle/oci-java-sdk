/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.requests;

import com.oracle.bmc.apigateway.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apigateway/UpdateUsagePlanExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateUsagePlanRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class UpdateUsagePlanRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails> {

    /** The ocid of the usage plan. */
    private String usagePlanId;

    /** The ocid of the usage plan. */
    public String getUsagePlanId() {
        return usagePlanId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails updateUsagePlanDetails;

    /** The information to be updated. */
    public com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails getUpdateUsagePlanDetails() {
        return updateUsagePlanDetails;
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
    /** The client request id for tracing. */
    private String opcRequestId;

    /** The client request id for tracing. */
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
    public com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails getBody$() {
        return updateUsagePlanDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateUsagePlanRequest,
                    com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ocid of the usage plan. */
        private String usagePlanId = null;

        /**
         * The ocid of the usage plan.
         *
         * @param usagePlanId the value to set
         * @return this builder instance
         */
        public Builder usagePlanId(String usagePlanId) {
            this.usagePlanId = usagePlanId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails updateUsagePlanDetails =
                null;

        /**
         * The information to be updated.
         *
         * @param updateUsagePlanDetails the value to set
         * @return this builder instance
         */
        public Builder updateUsagePlanDetails(
                com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails updateUsagePlanDetails) {
            this.updateUsagePlanDetails = updateUsagePlanDetails;
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

        /** The client request id for tracing. */
        private String opcRequestId = null;

        /**
         * The client request id for tracing.
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
        public Builder copy(UpdateUsagePlanRequest o) {
            usagePlanId(o.getUsagePlanId());
            updateUsagePlanDetails(o.getUpdateUsagePlanDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateUsagePlanRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateUsagePlanRequest
         */
        public UpdateUsagePlanRequest build() {
            UpdateUsagePlanRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apigateway.model.UpdateUsagePlanDetails body) {
            updateUsagePlanDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateUsagePlanRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateUsagePlanRequest
         */
        public UpdateUsagePlanRequest buildWithoutInvocationCallback() {
            UpdateUsagePlanRequest request = new UpdateUsagePlanRequest();
            request.usagePlanId = usagePlanId;
            request.updateUsagePlanDetails = updateUsagePlanDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateUsagePlanRequest(usagePlanId, updateUsagePlanDetails, ifMatch,
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
                .usagePlanId(usagePlanId)
                .updateUsagePlanDetails(updateUsagePlanDetails)
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
        sb.append(",usagePlanId=").append(String.valueOf(this.usagePlanId));
        sb.append(",updateUsagePlanDetails=").append(String.valueOf(this.updateUsagePlanDetails));
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
        if (!(o instanceof UpdateUsagePlanRequest)) {
            return false;
        }

        UpdateUsagePlanRequest other = (UpdateUsagePlanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.usagePlanId, other.usagePlanId)
                && java.util.Objects.equals(
                        this.updateUsagePlanDetails, other.updateUsagePlanDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.usagePlanId == null ? 43 : this.usagePlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateUsagePlanDetails == null
                                ? 43
                                : this.updateUsagePlanDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
