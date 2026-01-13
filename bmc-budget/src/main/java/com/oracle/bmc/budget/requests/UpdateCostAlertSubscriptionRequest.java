/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.requests;

import com.oracle.bmc.budget.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/budget/UpdateCostAlertSubscriptionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCostAlertSubscriptionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class UpdateCostAlertSubscriptionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails> {

    /** The unique costAlertSubscription OCID. */
    private String costAlertSubscriptionId;

    /** The unique costAlertSubscription OCID. */
    public String getCostAlertSubscriptionId() {
        return costAlertSubscriptionId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails
            updateCostAlertSubscriptionDetails;

    /** The information to be updated. */
    public com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails
            getUpdateCostAlertSubscriptionDetails() {
        return updateCostAlertSubscriptionDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails getBody$() {
        return updateCostAlertSubscriptionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCostAlertSubscriptionRequest,
                    com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique costAlertSubscription OCID. */
        private String costAlertSubscriptionId = null;

        /**
         * The unique costAlertSubscription OCID.
         *
         * @param costAlertSubscriptionId the value to set
         * @return this builder instance
         */
        public Builder costAlertSubscriptionId(String costAlertSubscriptionId) {
            this.costAlertSubscriptionId = costAlertSubscriptionId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails
                updateCostAlertSubscriptionDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateCostAlertSubscriptionDetails the value to set
         * @return this builder instance
         */
        public Builder updateCostAlertSubscriptionDetails(
                com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails
                        updateCostAlertSubscriptionDetails) {
            this.updateCostAlertSubscriptionDetails = updateCostAlertSubscriptionDetails;
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(UpdateCostAlertSubscriptionRequest o) {
            costAlertSubscriptionId(o.getCostAlertSubscriptionId());
            updateCostAlertSubscriptionDetails(o.getUpdateCostAlertSubscriptionDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCostAlertSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCostAlertSubscriptionRequest
         */
        public UpdateCostAlertSubscriptionRequest build() {
            UpdateCostAlertSubscriptionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.budget.model.UpdateCostAlertSubscriptionDetails body) {
            updateCostAlertSubscriptionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCostAlertSubscriptionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCostAlertSubscriptionRequest
         */
        public UpdateCostAlertSubscriptionRequest buildWithoutInvocationCallback() {
            UpdateCostAlertSubscriptionRequest request = new UpdateCostAlertSubscriptionRequest();
            request.costAlertSubscriptionId = costAlertSubscriptionId;
            request.updateCostAlertSubscriptionDetails = updateCostAlertSubscriptionDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateCostAlertSubscriptionRequest(costAlertSubscriptionId,
            // updateCostAlertSubscriptionDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .costAlertSubscriptionId(costAlertSubscriptionId)
                .updateCostAlertSubscriptionDetails(updateCostAlertSubscriptionDetails)
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
        sb.append(",costAlertSubscriptionId=").append(String.valueOf(this.costAlertSubscriptionId));
        sb.append(",updateCostAlertSubscriptionDetails=")
                .append(String.valueOf(this.updateCostAlertSubscriptionDetails));
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
        if (!(o instanceof UpdateCostAlertSubscriptionRequest)) {
            return false;
        }

        UpdateCostAlertSubscriptionRequest other = (UpdateCostAlertSubscriptionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.costAlertSubscriptionId, other.costAlertSubscriptionId)
                && java.util.Objects.equals(
                        this.updateCostAlertSubscriptionDetails,
                        other.updateCostAlertSubscriptionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.costAlertSubscriptionId == null
                                ? 43
                                : this.costAlertSubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCostAlertSubscriptionDetails == null
                                ? 43
                                : this.updateCostAlertSubscriptionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
