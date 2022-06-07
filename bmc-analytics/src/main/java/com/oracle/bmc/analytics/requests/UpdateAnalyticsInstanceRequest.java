/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.requests;

import com.oracle.bmc.analytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/UpdateAnalyticsInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAnalyticsInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class UpdateAnalyticsInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails> {

    /**
     * The OCID of the AnalyticsInstance.
     *
     */
    private String analyticsInstanceId;

    public String getAnalyticsInstanceId() {
        return analyticsInstanceId;
    }
    /**
     * The Analytics Instance fields to update. Fields that are not provided
     * will not be updated.
     *
     */
    private com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails
            updateAnalyticsInstanceDetails;

    public com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails
            getUpdateAnalyticsInstanceDetails() {
        return updateAnalyticsInstanceDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails getBody$() {
        return updateAnalyticsInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAnalyticsInstanceRequest,
                    com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String analyticsInstanceId = null;

        /**
         * The OCID of the AnalyticsInstance.
         *
         * @return this builder instance
         */
        public Builder analyticsInstanceId(String analyticsInstanceId) {
            this.analyticsInstanceId = analyticsInstanceId;
            return this;
        }

        private com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails
                updateAnalyticsInstanceDetails = null;

        /**
         * The Analytics Instance fields to update. Fields that are not provided
         * will not be updated.
         *
         * @return this builder instance
         */
        public Builder updateAnalyticsInstanceDetails(
                com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails
                        updateAnalyticsInstanceDetails) {
            this.updateAnalyticsInstanceDetails = updateAnalyticsInstanceDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(UpdateAnalyticsInstanceRequest o) {
            analyticsInstanceId(o.getAnalyticsInstanceId());
            updateAnalyticsInstanceDetails(o.getUpdateAnalyticsInstanceDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAnalyticsInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAnalyticsInstanceRequest
         */
        public UpdateAnalyticsInstanceRequest build() {
            UpdateAnalyticsInstanceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.analytics.model.UpdateAnalyticsInstanceDetails body) {
            updateAnalyticsInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAnalyticsInstanceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAnalyticsInstanceRequest
         */
        public UpdateAnalyticsInstanceRequest buildWithoutInvocationCallback() {
            UpdateAnalyticsInstanceRequest request = new UpdateAnalyticsInstanceRequest();
            request.analyticsInstanceId = analyticsInstanceId;
            request.updateAnalyticsInstanceDetails = updateAnalyticsInstanceDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAnalyticsInstanceRequest(analyticsInstanceId, updateAnalyticsInstanceDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .analyticsInstanceId(analyticsInstanceId)
                .updateAnalyticsInstanceDetails(updateAnalyticsInstanceDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",analyticsInstanceId=").append(String.valueOf(this.analyticsInstanceId));
        sb.append(",updateAnalyticsInstanceDetails=")
                .append(String.valueOf(this.updateAnalyticsInstanceDetails));
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
        if (!(o instanceof UpdateAnalyticsInstanceRequest)) {
            return false;
        }

        UpdateAnalyticsInstanceRequest other = (UpdateAnalyticsInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.analyticsInstanceId, other.analyticsInstanceId)
                && java.util.Objects.equals(
                        this.updateAnalyticsInstanceDetails, other.updateAnalyticsInstanceDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.analyticsInstanceId == null
                                ? 43
                                : this.analyticsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAnalyticsInstanceDetails == null
                                ? 43
                                : this.updateAnalyticsInstanceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
