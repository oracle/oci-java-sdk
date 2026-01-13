/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetMfaTotpDeviceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMfaTotpDeviceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetMfaTotpDeviceRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the user. */
    private String userId;

    /** The OCID of the user. */
    public String getUserId() {
        return userId;
    }
    /** The OCID of the MFA TOTP device. */
    private String mfaTotpDeviceId;

    /** The OCID of the MFA TOTP device. */
    public String getMfaTotpDeviceId() {
        return mfaTotpDeviceId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMfaTotpDeviceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the user. */
        private String userId = null;

        /**
         * The OCID of the user.
         *
         * @param userId the value to set
         * @return this builder instance
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /** The OCID of the MFA TOTP device. */
        private String mfaTotpDeviceId = null;

        /**
         * The OCID of the MFA TOTP device.
         *
         * @param mfaTotpDeviceId the value to set
         * @return this builder instance
         */
        public Builder mfaTotpDeviceId(String mfaTotpDeviceId) {
            this.mfaTotpDeviceId = mfaTotpDeviceId;
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
        public Builder copy(GetMfaTotpDeviceRequest o) {
            userId(o.getUserId());
            mfaTotpDeviceId(o.getMfaTotpDeviceId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMfaTotpDeviceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetMfaTotpDeviceRequest
         */
        public GetMfaTotpDeviceRequest build() {
            GetMfaTotpDeviceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMfaTotpDeviceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMfaTotpDeviceRequest
         */
        public GetMfaTotpDeviceRequest buildWithoutInvocationCallback() {
            GetMfaTotpDeviceRequest request = new GetMfaTotpDeviceRequest();
            request.userId = userId;
            request.mfaTotpDeviceId = mfaTotpDeviceId;
            return request;
            // new GetMfaTotpDeviceRequest(userId, mfaTotpDeviceId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().userId(userId).mfaTotpDeviceId(mfaTotpDeviceId);
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
        sb.append(",userId=").append(String.valueOf(this.userId));
        sb.append(",mfaTotpDeviceId=").append(String.valueOf(this.mfaTotpDeviceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMfaTotpDeviceRequest)) {
            return false;
        }

        GetMfaTotpDeviceRequest other = (GetMfaTotpDeviceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.mfaTotpDeviceId, other.mfaTotpDeviceId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.mfaTotpDeviceId == null ? 43 : this.mfaTotpDeviceId.hashCode());
        return result;
    }
}
