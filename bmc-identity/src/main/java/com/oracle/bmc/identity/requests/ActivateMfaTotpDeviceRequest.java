/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ActivateMfaTotpDeviceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ActivateMfaTotpDeviceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ActivateMfaTotpDeviceRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.identity.model.MfaTotpToken> {

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
     * The OCID of the MFA TOTP device.
     */
    private String mfaTotpDeviceId;

    /**
     * The OCID of the MFA TOTP device.
     */
    public String getMfaTotpDeviceId() {
        return mfaTotpDeviceId;
    }
    /**
     * MFA TOTP token
     */
    private com.oracle.bmc.identity.model.MfaTotpToken mfaTotpToken;

    /**
     * MFA TOTP token
     */
    public com.oracle.bmc.identity.model.MfaTotpToken getMfaTotpToken() {
        return mfaTotpToken;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
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
    public com.oracle.bmc.identity.model.MfaTotpToken getBody$() {
        return mfaTotpToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ActivateMfaTotpDeviceRequest, com.oracle.bmc.identity.model.MfaTotpToken> {
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
         * The OCID of the MFA TOTP device.
         */
        private String mfaTotpDeviceId = null;

        /**
         * The OCID of the MFA TOTP device.
         * @param mfaTotpDeviceId the value to set
         * @return this builder instance
         */
        public Builder mfaTotpDeviceId(String mfaTotpDeviceId) {
            this.mfaTotpDeviceId = mfaTotpDeviceId;
            return this;
        }

        /**
         * MFA TOTP token
         */
        private com.oracle.bmc.identity.model.MfaTotpToken mfaTotpToken = null;

        /**
         * MFA TOTP token
         * @param mfaTotpToken the value to set
         * @return this builder instance
         */
        public Builder mfaTotpToken(com.oracle.bmc.identity.model.MfaTotpToken mfaTotpToken) {
            this.mfaTotpToken = mfaTotpToken;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
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
        public Builder copy(ActivateMfaTotpDeviceRequest o) {
            userId(o.getUserId());
            mfaTotpDeviceId(o.getMfaTotpDeviceId());
            mfaTotpToken(o.getMfaTotpToken());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ActivateMfaTotpDeviceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ActivateMfaTotpDeviceRequest
         */
        public ActivateMfaTotpDeviceRequest build() {
            ActivateMfaTotpDeviceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.MfaTotpToken body) {
            mfaTotpToken(body);
            return this;
        }

        /**
         * Build the instance of ActivateMfaTotpDeviceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ActivateMfaTotpDeviceRequest
         */
        public ActivateMfaTotpDeviceRequest buildWithoutInvocationCallback() {
            ActivateMfaTotpDeviceRequest request = new ActivateMfaTotpDeviceRequest();
            request.userId = userId;
            request.mfaTotpDeviceId = mfaTotpDeviceId;
            request.mfaTotpToken = mfaTotpToken;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ActivateMfaTotpDeviceRequest(userId, mfaTotpDeviceId, mfaTotpToken, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userId(userId)
                .mfaTotpDeviceId(mfaTotpDeviceId)
                .mfaTotpToken(mfaTotpToken)
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
        sb.append(",userId=").append(String.valueOf(this.userId));
        sb.append(",mfaTotpDeviceId=").append(String.valueOf(this.mfaTotpDeviceId));
        sb.append(",mfaTotpToken=").append(String.valueOf(this.mfaTotpToken));
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
        if (!(o instanceof ActivateMfaTotpDeviceRequest)) {
            return false;
        }

        ActivateMfaTotpDeviceRequest other = (ActivateMfaTotpDeviceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.mfaTotpDeviceId, other.mfaTotpDeviceId)
                && java.util.Objects.equals(this.mfaTotpToken, other.mfaTotpToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.mfaTotpDeviceId == null ? 43 : this.mfaTotpDeviceId.hashCode());
        result = (result * PRIME) + (this.mfaTotpToken == null ? 43 : this.mfaTotpToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
