/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.requests;

import com.oracle.bmc.budget.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/budget/UpdateCostAnomalyMonitorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateCostAnomalyMonitorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class UpdateCostAnomalyMonitorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails> {

    /** The unique costAnomalyMonitor OCID. */
    private String costAnomalyMonitorId;

    /** The unique costAnomalyMonitor OCID. */
    public String getCostAnomalyMonitorId() {
        return costAnomalyMonitorId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails
            updateCostAnomalyMonitorDetails;

    /** The information to be updated. */
    public com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails
            getUpdateCostAnomalyMonitorDetails() {
        return updateCostAnomalyMonitorDetails;
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
    public com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails getBody$() {
        return updateCostAnomalyMonitorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCostAnomalyMonitorRequest,
                    com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique costAnomalyMonitor OCID. */
        private String costAnomalyMonitorId = null;

        /**
         * The unique costAnomalyMonitor OCID.
         *
         * @param costAnomalyMonitorId the value to set
         * @return this builder instance
         */
        public Builder costAnomalyMonitorId(String costAnomalyMonitorId) {
            this.costAnomalyMonitorId = costAnomalyMonitorId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails
                updateCostAnomalyMonitorDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateCostAnomalyMonitorDetails the value to set
         * @return this builder instance
         */
        public Builder updateCostAnomalyMonitorDetails(
                com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails
                        updateCostAnomalyMonitorDetails) {
            this.updateCostAnomalyMonitorDetails = updateCostAnomalyMonitorDetails;
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
        public Builder copy(UpdateCostAnomalyMonitorRequest o) {
            costAnomalyMonitorId(o.getCostAnomalyMonitorId());
            updateCostAnomalyMonitorDetails(o.getUpdateCostAnomalyMonitorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCostAnomalyMonitorRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateCostAnomalyMonitorRequest
         */
        public UpdateCostAnomalyMonitorRequest build() {
            UpdateCostAnomalyMonitorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.budget.model.UpdateCostAnomalyMonitorDetails body) {
            updateCostAnomalyMonitorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCostAnomalyMonitorRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCostAnomalyMonitorRequest
         */
        public UpdateCostAnomalyMonitorRequest buildWithoutInvocationCallback() {
            UpdateCostAnomalyMonitorRequest request = new UpdateCostAnomalyMonitorRequest();
            request.costAnomalyMonitorId = costAnomalyMonitorId;
            request.updateCostAnomalyMonitorDetails = updateCostAnomalyMonitorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateCostAnomalyMonitorRequest(costAnomalyMonitorId,
            // updateCostAnomalyMonitorDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .costAnomalyMonitorId(costAnomalyMonitorId)
                .updateCostAnomalyMonitorDetails(updateCostAnomalyMonitorDetails)
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
        sb.append(",costAnomalyMonitorId=").append(String.valueOf(this.costAnomalyMonitorId));
        sb.append(",updateCostAnomalyMonitorDetails=")
                .append(String.valueOf(this.updateCostAnomalyMonitorDetails));
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
        if (!(o instanceof UpdateCostAnomalyMonitorRequest)) {
            return false;
        }

        UpdateCostAnomalyMonitorRequest other = (UpdateCostAnomalyMonitorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.costAnomalyMonitorId, other.costAnomalyMonitorId)
                && java.util.Objects.equals(
                        this.updateCostAnomalyMonitorDetails, other.updateCostAnomalyMonitorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.costAnomalyMonitorId == null
                                ? 43
                                : this.costAnomalyMonitorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCostAnomalyMonitorDetails == null
                                ? 43
                                : this.updateCostAnomalyMonitorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
