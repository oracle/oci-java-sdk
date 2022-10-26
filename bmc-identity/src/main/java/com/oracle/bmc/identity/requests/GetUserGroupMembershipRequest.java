/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetUserGroupMembershipExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetUserGroupMembershipRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetUserGroupMembershipRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the userGroupMembership. */
    private String userGroupMembershipId;

    /** The OCID of the userGroupMembership. */
    public String getUserGroupMembershipId() {
        return userGroupMembershipId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetUserGroupMembershipRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the userGroupMembership. */
        private String userGroupMembershipId = null;

        /**
         * The OCID of the userGroupMembership.
         *
         * @param userGroupMembershipId the value to set
         * @return this builder instance
         */
        public Builder userGroupMembershipId(String userGroupMembershipId) {
            this.userGroupMembershipId = userGroupMembershipId;
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
        public Builder copy(GetUserGroupMembershipRequest o) {
            userGroupMembershipId(o.getUserGroupMembershipId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetUserGroupMembershipRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetUserGroupMembershipRequest
         */
        public GetUserGroupMembershipRequest build() {
            GetUserGroupMembershipRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetUserGroupMembershipRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetUserGroupMembershipRequest
         */
        public GetUserGroupMembershipRequest buildWithoutInvocationCallback() {
            GetUserGroupMembershipRequest request = new GetUserGroupMembershipRequest();
            request.userGroupMembershipId = userGroupMembershipId;
            return request;
            // new GetUserGroupMembershipRequest(userGroupMembershipId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().userGroupMembershipId(userGroupMembershipId);
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
        sb.append(",userGroupMembershipId=").append(String.valueOf(this.userGroupMembershipId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetUserGroupMembershipRequest)) {
            return false;
        }

        GetUserGroupMembershipRequest other = (GetUserGroupMembershipRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.userGroupMembershipId, other.userGroupMembershipId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.userGroupMembershipId == null
                                ? 43
                                : this.userGroupMembershipId.hashCode());
        return result;
    }
}
