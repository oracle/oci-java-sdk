/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateAuthenticationPolicyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAuthenticationPolicyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAuthenticationPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails> {

    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Request object for updating the authentication policy. */
    private com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails
            updateAuthenticationPolicyDetails;

    /** Request object for updating the authentication policy. */
    public com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails
            getUpdateAuthenticationPolicyDetails() {
        return updateAuthenticationPolicyDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails getBody$() {
        return updateAuthenticationPolicyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAuthenticationPolicyRequest,
                    com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Request object for updating the authentication policy. */
        private com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails
                updateAuthenticationPolicyDetails = null;

        /**
         * Request object for updating the authentication policy.
         *
         * @param updateAuthenticationPolicyDetails the value to set
         * @return this builder instance
         */
        public Builder updateAuthenticationPolicyDetails(
                com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails
                        updateAuthenticationPolicyDetails) {
            this.updateAuthenticationPolicyDetails = updateAuthenticationPolicyDetails;
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
        public Builder copy(UpdateAuthenticationPolicyRequest o) {
            compartmentId(o.getCompartmentId());
            updateAuthenticationPolicyDetails(o.getUpdateAuthenticationPolicyDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAuthenticationPolicyRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAuthenticationPolicyRequest
         */
        public UpdateAuthenticationPolicyRequest build() {
            UpdateAuthenticationPolicyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateAuthenticationPolicyDetails body) {
            updateAuthenticationPolicyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAuthenticationPolicyRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAuthenticationPolicyRequest
         */
        public UpdateAuthenticationPolicyRequest buildWithoutInvocationCallback() {
            UpdateAuthenticationPolicyRequest request = new UpdateAuthenticationPolicyRequest();
            request.compartmentId = compartmentId;
            request.updateAuthenticationPolicyDetails = updateAuthenticationPolicyDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateAuthenticationPolicyRequest(compartmentId,
            // updateAuthenticationPolicyDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .updateAuthenticationPolicyDetails(updateAuthenticationPolicyDetails)
                .ifMatch(ifMatch);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",updateAuthenticationPolicyDetails=")
                .append(String.valueOf(this.updateAuthenticationPolicyDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAuthenticationPolicyRequest)) {
            return false;
        }

        UpdateAuthenticationPolicyRequest other = (UpdateAuthenticationPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.updateAuthenticationPolicyDetails,
                        other.updateAuthenticationPolicyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAuthenticationPolicyDetails == null
                                ? 43
                                : this.updateAuthenticationPolicyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
