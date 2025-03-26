/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usage.requests;

import com.oracle.bmc.usage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/usage/CreateRedeemableUserExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateRedeemableUserRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class CreateRedeemableUserRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.usage.model.CreateRedeemableUserDetails> {

    /**
     * CreateRedeemableUserDetails information.
     *
     */
    private com.oracle.bmc.usage.model.CreateRedeemableUserDetails createRedeemableUserDetails;

    /**
     * CreateRedeemableUserDetails information.
     *
     */
    public com.oracle.bmc.usage.model.CreateRedeemableUserDetails getCreateRedeemableUserDetails() {
        return createRedeemableUserDetails;
    }
    /**
     * The OCID of the tenancy.
     */
    private String tenancyId;

    /**
     * The OCID of the tenancy.
     */
    public String getTenancyId() {
        return tenancyId;
    }
    /**
     * The subscription ID for which rewards information is requested for.
     */
    private String subscriptionId;

    /**
     * The subscription ID for which rewards information is requested for.
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /**
     * The user ID of the person to send a copy of an email.
     */
    private String userId;

    /**
     * The user ID of the person to send a copy of an email.
     */
    public String getUserId() {
        return userId;
    }
    /**
     * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted, only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted, only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.usage.model.CreateRedeemableUserDetails getBody$() {
        return createRedeemableUserDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateRedeemableUserRequest,
                    com.oracle.bmc.usage.model.CreateRedeemableUserDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * CreateRedeemableUserDetails information.
         *
         */
        private com.oracle.bmc.usage.model.CreateRedeemableUserDetails createRedeemableUserDetails =
                null;

        /**
         * CreateRedeemableUserDetails information.
         *
         * @param createRedeemableUserDetails the value to set
         * @return this builder instance
         */
        public Builder createRedeemableUserDetails(
                com.oracle.bmc.usage.model.CreateRedeemableUserDetails
                        createRedeemableUserDetails) {
            this.createRedeemableUserDetails = createRedeemableUserDetails;
            return this;
        }

        /**
         * The OCID of the tenancy.
         */
        private String tenancyId = null;

        /**
         * The OCID of the tenancy.
         * @param tenancyId the value to set
         * @return this builder instance
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            return this;
        }

        /**
         * The subscription ID for which rewards information is requested for.
         */
        private String subscriptionId = null;

        /**
         * The subscription ID for which rewards information is requested for.
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * The user ID of the person to send a copy of an email.
         */
        private String userId = null;

        /**
         * The user ID of the person to send a copy of an email.
         * @param userId the value to set
         * @return this builder instance
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique, Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted, only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted, only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateRedeemableUserRequest o) {
            createRedeemableUserDetails(o.getCreateRedeemableUserDetails());
            tenancyId(o.getTenancyId());
            subscriptionId(o.getSubscriptionId());
            userId(o.getUserId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateRedeemableUserRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateRedeemableUserRequest
         */
        public CreateRedeemableUserRequest build() {
            CreateRedeemableUserRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.usage.model.CreateRedeemableUserDetails body) {
            createRedeemableUserDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateRedeemableUserRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateRedeemableUserRequest
         */
        public CreateRedeemableUserRequest buildWithoutInvocationCallback() {
            CreateRedeemableUserRequest request = new CreateRedeemableUserRequest();
            request.createRedeemableUserDetails = createRedeemableUserDetails;
            request.tenancyId = tenancyId;
            request.subscriptionId = subscriptionId;
            request.userId = userId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateRedeemableUserRequest(createRedeemableUserDetails, tenancyId, subscriptionId, userId, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createRedeemableUserDetails(createRedeemableUserDetails)
                .tenancyId(tenancyId)
                .subscriptionId(subscriptionId)
                .userId(userId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",createRedeemableUserDetails=")
                .append(String.valueOf(this.createRedeemableUserDetails));
        sb.append(",tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",userId=").append(String.valueOf(this.userId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRedeemableUserRequest)) {
            return false;
        }

        CreateRedeemableUserRequest other = (CreateRedeemableUserRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createRedeemableUserDetails, other.createRedeemableUserDetails)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createRedeemableUserDetails == null
                                ? 43
                                : this.createRedeemableUserDetails.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
