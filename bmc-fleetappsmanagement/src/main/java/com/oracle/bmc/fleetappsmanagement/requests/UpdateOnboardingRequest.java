/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/UpdateOnboardingExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOnboardingRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class UpdateOnboardingRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails> {

    /** A filter to return resources whose Onboarding identifier matches the given identifier. */
    private String onboardingId;

    /** A filter to return resources whose Onboarding identifier matches the given identifier. */
    public String getOnboardingId() {
        return onboardingId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails
            updateOnboardingDetails;

    /** The information to be updated. */
    public com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails
            getUpdateOnboardingDetails() {
        return updateOnboardingDetails;
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
    public com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails getBody$() {
        return updateOnboardingDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOnboardingRequest,
                    com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return resources whose Onboarding identifier matches the given identifier.
         */
        private String onboardingId = null;

        /**
         * A filter to return resources whose Onboarding identifier matches the given identifier.
         *
         * @param onboardingId the value to set
         * @return this builder instance
         */
        public Builder onboardingId(String onboardingId) {
            this.onboardingId = onboardingId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails
                updateOnboardingDetails = null;

        /**
         * The information to be updated.
         *
         * @param updateOnboardingDetails the value to set
         * @return this builder instance
         */
        public Builder updateOnboardingDetails(
                com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails
                        updateOnboardingDetails) {
            this.updateOnboardingDetails = updateOnboardingDetails;
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
        public Builder copy(UpdateOnboardingRequest o) {
            onboardingId(o.getOnboardingId());
            updateOnboardingDetails(o.getUpdateOnboardingDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOnboardingRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOnboardingRequest
         */
        public UpdateOnboardingRequest build() {
            UpdateOnboardingRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.fleetappsmanagement.model.UpdateOnboardingDetails body) {
            updateOnboardingDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOnboardingRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOnboardingRequest
         */
        public UpdateOnboardingRequest buildWithoutInvocationCallback() {
            UpdateOnboardingRequest request = new UpdateOnboardingRequest();
            request.onboardingId = onboardingId;
            request.updateOnboardingDetails = updateOnboardingDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOnboardingRequest(onboardingId, updateOnboardingDetails, ifMatch,
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
                .onboardingId(onboardingId)
                .updateOnboardingDetails(updateOnboardingDetails)
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
        sb.append(",onboardingId=").append(String.valueOf(this.onboardingId));
        sb.append(",updateOnboardingDetails=").append(String.valueOf(this.updateOnboardingDetails));
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
        if (!(o instanceof UpdateOnboardingRequest)) {
            return false;
        }

        UpdateOnboardingRequest other = (UpdateOnboardingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.onboardingId, other.onboardingId)
                && java.util.Objects.equals(
                        this.updateOnboardingDetails, other.updateOnboardingDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.onboardingId == null ? 43 : this.onboardingId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOnboardingDetails == null
                                ? 43
                                : this.updateOnboardingDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
