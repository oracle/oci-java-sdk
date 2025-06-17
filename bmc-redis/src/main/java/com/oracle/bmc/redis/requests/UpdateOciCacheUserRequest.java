/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.requests;

import com.oracle.bmc.redis.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/redis/UpdateOciCacheUserExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOciCacheUserRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class UpdateOciCacheUserRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.redis.model.UpdateOciCacheUserDetails> {

    /** A filter to return only resources, that match with the given OCI cache user ID (OCID). */
    private String ociCacheUserId;

    /** A filter to return only resources, that match with the given OCI cache user ID (OCID). */
    public String getOciCacheUserId() {
        return ociCacheUserId;
    }
    /** The information to be updated for an existing OCI Cache User. */
    private com.oracle.bmc.redis.model.UpdateOciCacheUserDetails updateOciCacheUserDetails;

    /** The information to be updated for an existing OCI Cache User. */
    public com.oracle.bmc.redis.model.UpdateOciCacheUserDetails getUpdateOciCacheUserDetails() {
        return updateOciCacheUserDetails;
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
    public com.oracle.bmc.redis.model.UpdateOciCacheUserDetails getBody$() {
        return updateOciCacheUserDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOciCacheUserRequest,
                    com.oracle.bmc.redis.model.UpdateOciCacheUserDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return only resources, that match with the given OCI cache user ID (OCID).
         */
        private String ociCacheUserId = null;

        /**
         * A filter to return only resources, that match with the given OCI cache user ID (OCID).
         *
         * @param ociCacheUserId the value to set
         * @return this builder instance
         */
        public Builder ociCacheUserId(String ociCacheUserId) {
            this.ociCacheUserId = ociCacheUserId;
            return this;
        }

        /** The information to be updated for an existing OCI Cache User. */
        private com.oracle.bmc.redis.model.UpdateOciCacheUserDetails updateOciCacheUserDetails =
                null;

        /**
         * The information to be updated for an existing OCI Cache User.
         *
         * @param updateOciCacheUserDetails the value to set
         * @return this builder instance
         */
        public Builder updateOciCacheUserDetails(
                com.oracle.bmc.redis.model.UpdateOciCacheUserDetails updateOciCacheUserDetails) {
            this.updateOciCacheUserDetails = updateOciCacheUserDetails;
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
        public Builder copy(UpdateOciCacheUserRequest o) {
            ociCacheUserId(o.getOciCacheUserId());
            updateOciCacheUserDetails(o.getUpdateOciCacheUserDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOciCacheUserRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOciCacheUserRequest
         */
        public UpdateOciCacheUserRequest build() {
            UpdateOciCacheUserRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.redis.model.UpdateOciCacheUserDetails body) {
            updateOciCacheUserDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOciCacheUserRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOciCacheUserRequest
         */
        public UpdateOciCacheUserRequest buildWithoutInvocationCallback() {
            UpdateOciCacheUserRequest request = new UpdateOciCacheUserRequest();
            request.ociCacheUserId = ociCacheUserId;
            request.updateOciCacheUserDetails = updateOciCacheUserDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOciCacheUserRequest(ociCacheUserId, updateOciCacheUserDetails, ifMatch,
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
                .ociCacheUserId(ociCacheUserId)
                .updateOciCacheUserDetails(updateOciCacheUserDetails)
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
        sb.append(",ociCacheUserId=").append(String.valueOf(this.ociCacheUserId));
        sb.append(",updateOciCacheUserDetails=")
                .append(String.valueOf(this.updateOciCacheUserDetails));
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
        if (!(o instanceof UpdateOciCacheUserRequest)) {
            return false;
        }

        UpdateOciCacheUserRequest other = (UpdateOciCacheUserRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ociCacheUserId, other.ociCacheUserId)
                && java.util.Objects.equals(
                        this.updateOciCacheUserDetails, other.updateOciCacheUserDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ociCacheUserId == null ? 43 : this.ociCacheUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOciCacheUserDetails == null
                                ? 43
                                : this.updateOciCacheUserDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
