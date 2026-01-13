/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.oracle.bmc.requests.BmcRequest;

import java.util.Objects;

/** @Immutable */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOkeResourcePrincipalSessionTokenRequest
        extends BmcRequest<GetOkeResourcePrincipalSessionTokenDetails> {
    private GetOkeResourcePrincipalSessionTokenDetails getOkeResourcePrincipalSessionTokenDetails;

    public GetOkeResourcePrincipalSessionTokenDetails
            getGetOkeResourcePrincipalSessionTokenDetails() {
        return getOkeResourcePrincipalSessionTokenDetails;
    }

    @Override
    @com.oracle.bmc.InternalSdk
    public GetOkeResourcePrincipalSessionTokenDetails getBody$() {
        return getOkeResourcePrincipalSessionTokenDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOkeResourcePrincipalSessionTokenRequest,
                    GetOkeResourcePrincipalSessionTokenDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;
        private GetOkeResourcePrincipalSessionTokenDetails
                getOkeResourcePrincipalSessionTokenDetails;

        public Builder getOkeResourcePrincipalSessionTokenDetails(
                GetOkeResourcePrincipalSessionTokenDetails
                        getOkeResourcePrincipalSessionTokenDetails) {
            this.getOkeResourcePrincipalSessionTokenDetails =
                    getOkeResourcePrincipalSessionTokenDetails;
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
        public Builder copy(GetOkeResourcePrincipalSessionTokenRequest o) {
            getOkeResourcePrincipalSessionTokenDetails(
                    o.getGetOkeResourcePrincipalSessionTokenDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        public GetOkeResourcePrincipalSessionTokenRequest build() {
            GetOkeResourcePrincipalSessionTokenRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(GetOkeResourcePrincipalSessionTokenDetails body) {
            getOkeResourcePrincipalSessionTokenDetails(body);
            return this;
        }

        public GetOkeResourcePrincipalSessionTokenRequest buildWithoutInvocationCallback() {
            GetOkeResourcePrincipalSessionTokenRequest request =
                    new GetOkeResourcePrincipalSessionTokenRequest();
            request.getOkeResourcePrincipalSessionTokenDetails =
                    getOkeResourcePrincipalSessionTokenDetails;
            return request;
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .getOkeResourcePrincipalSessionTokenDetails(
                        getOkeResourcePrincipalSessionTokenDetails);
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
        sb.append(",getOkeResourcePrincipalSessionTokenDetails=")
                .append(String.valueOf(this.getOkeResourcePrincipalSessionTokenDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOkeResourcePrincipalSessionTokenRequest)) {
            return false;
        }

        GetOkeResourcePrincipalSessionTokenRequest other =
                (GetOkeResourcePrincipalSessionTokenRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.getOkeResourcePrincipalSessionTokenDetails,
                        other.getOkeResourcePrincipalSessionTokenDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.getOkeResourcePrincipalSessionTokenDetails == null
                                ? 43
                                : this.getOkeResourcePrincipalSessionTokenDetails.hashCode());
        return result;
    }
}
