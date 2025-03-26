/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateCustomerSecretKeyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateCustomerSecretKeyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateCustomerSecretKeyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails> {

    /**
     * The OCID of the user.
     */
    private String userId;

    /**
     * The OCID of the user.
     */
    public String getUserId() {
        return userId;
    }
    /**
     * The access token of the secret key.
     */
    private String customerSecretKeyId;

    /**
     * The access token of the secret key.
     */
    public String getCustomerSecretKeyId() {
        return customerSecretKeyId;
    }
    /**
     * Request object for updating a secret key.
     */
    private com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails
            updateCustomerSecretKeyDetails;

    /**
     * Request object for updating a secret key.
     */
    public com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails
            getUpdateCustomerSecretKeyDetails() {
        return updateCustomerSecretKeyDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails getBody$() {
        return updateCustomerSecretKeyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCustomerSecretKeyRequest,
                    com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the user.
         */
        private String userId = null;

        /**
         * The OCID of the user.
         * @param userId the value to set
         * @return this builder instance
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * The access token of the secret key.
         */
        private String customerSecretKeyId = null;

        /**
         * The access token of the secret key.
         * @param customerSecretKeyId the value to set
         * @return this builder instance
         */
        public Builder customerSecretKeyId(String customerSecretKeyId) {
            this.customerSecretKeyId = customerSecretKeyId;
            return this;
        }

        /**
         * Request object for updating a secret key.
         */
        private com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails
                updateCustomerSecretKeyDetails = null;

        /**
         * Request object for updating a secret key.
         * @param updateCustomerSecretKeyDetails the value to set
         * @return this builder instance
         */
        public Builder updateCustomerSecretKeyDetails(
                com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails
                        updateCustomerSecretKeyDetails) {
            this.updateCustomerSecretKeyDetails = updateCustomerSecretKeyDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(UpdateCustomerSecretKeyRequest o) {
            userId(o.getUserId());
            customerSecretKeyId(o.getCustomerSecretKeyId());
            updateCustomerSecretKeyDetails(o.getUpdateCustomerSecretKeyDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCustomerSecretKeyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateCustomerSecretKeyRequest
         */
        public UpdateCustomerSecretKeyRequest build() {
            UpdateCustomerSecretKeyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateCustomerSecretKeyDetails body) {
            updateCustomerSecretKeyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCustomerSecretKeyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCustomerSecretKeyRequest
         */
        public UpdateCustomerSecretKeyRequest buildWithoutInvocationCallback() {
            UpdateCustomerSecretKeyRequest request = new UpdateCustomerSecretKeyRequest();
            request.userId = userId;
            request.customerSecretKeyId = customerSecretKeyId;
            request.updateCustomerSecretKeyDetails = updateCustomerSecretKeyDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCustomerSecretKeyRequest(userId, customerSecretKeyId, updateCustomerSecretKeyDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userId(userId)
                .customerSecretKeyId(customerSecretKeyId)
                .updateCustomerSecretKeyDetails(updateCustomerSecretKeyDetails)
                .ifMatch(ifMatch);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",userId=").append(String.valueOf(this.userId));
        sb.append(",customerSecretKeyId=").append(String.valueOf(this.customerSecretKeyId));
        sb.append(",updateCustomerSecretKeyDetails=")
                .append(String.valueOf(this.updateCustomerSecretKeyDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCustomerSecretKeyRequest)) {
            return false;
        }

        UpdateCustomerSecretKeyRequest other = (UpdateCustomerSecretKeyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.customerSecretKeyId, other.customerSecretKeyId)
                && java.util.Objects.equals(
                        this.updateCustomerSecretKeyDetails, other.updateCustomerSecretKeyDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.customerSecretKeyId == null
                                ? 43
                                : this.customerSecretKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCustomerSecretKeyDetails == null
                                ? 43
                                : this.updateCustomerSecretKeyDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
