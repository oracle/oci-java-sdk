/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.redis.requests;

import com.oracle.bmc.redis.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/redis/DetachOciCacheUsersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DetachOciCacheUsersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220315")
public class DetachOciCacheUsersRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.redis.model.DetachOciCacheUsersDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster.
     */
    private String redisClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle) of
     * the cluster.
     */
    public String getRedisClusterId() {
        return redisClusterId;
    }
    /** The parameter details to detach the OCI cache users to the redis cluster. */
    private com.oracle.bmc.redis.model.DetachOciCacheUsersDetails detachOciCacheUsersDetails;

    /** The parameter details to detach the OCI cache users to the redis cluster. */
    public com.oracle.bmc.redis.model.DetachOciCacheUsersDetails getDetachOciCacheUsersDetails() {
        return detachOciCacheUsersDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.redis.model.DetachOciCacheUsersDetails getBody$() {
        return detachOciCacheUsersDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetachOciCacheUsersRequest,
                    com.oracle.bmc.redis.model.DetachOciCacheUsersDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster.
         */
        private String redisClusterId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Oracle)
         * of the cluster.
         *
         * @param redisClusterId the value to set
         * @return this builder instance
         */
        public Builder redisClusterId(String redisClusterId) {
            this.redisClusterId = redisClusterId;
            return this;
        }

        /** The parameter details to detach the OCI cache users to the redis cluster. */
        private com.oracle.bmc.redis.model.DetachOciCacheUsersDetails detachOciCacheUsersDetails =
                null;

        /**
         * The parameter details to detach the OCI cache users to the redis cluster.
         *
         * @param detachOciCacheUsersDetails the value to set
         * @return this builder instance
         */
        public Builder detachOciCacheUsersDetails(
                com.oracle.bmc.redis.model.DetachOciCacheUsersDetails detachOciCacheUsersDetails) {
            this.detachOciCacheUsersDetails = detachOciCacheUsersDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(DetachOciCacheUsersRequest o) {
            redisClusterId(o.getRedisClusterId());
            detachOciCacheUsersDetails(o.getDetachOciCacheUsersDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetachOciCacheUsersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DetachOciCacheUsersRequest
         */
        public DetachOciCacheUsersRequest build() {
            DetachOciCacheUsersRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.redis.model.DetachOciCacheUsersDetails body) {
            detachOciCacheUsersDetails(body);
            return this;
        }

        /**
         * Build the instance of DetachOciCacheUsersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DetachOciCacheUsersRequest
         */
        public DetachOciCacheUsersRequest buildWithoutInvocationCallback() {
            DetachOciCacheUsersRequest request = new DetachOciCacheUsersRequest();
            request.redisClusterId = redisClusterId;
            request.detachOciCacheUsersDetails = detachOciCacheUsersDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new DetachOciCacheUsersRequest(redisClusterId, detachOciCacheUsersDetails, ifMatch,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .redisClusterId(redisClusterId)
                .detachOciCacheUsersDetails(detachOciCacheUsersDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",redisClusterId=").append(String.valueOf(this.redisClusterId));
        sb.append(",detachOciCacheUsersDetails=")
                .append(String.valueOf(this.detachOciCacheUsersDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachOciCacheUsersRequest)) {
            return false;
        }

        DetachOciCacheUsersRequest other = (DetachOciCacheUsersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.redisClusterId, other.redisClusterId)
                && java.util.Objects.equals(
                        this.detachOciCacheUsersDetails, other.detachOciCacheUsersDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.redisClusterId == null ? 43 : this.redisClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.detachOciCacheUsersDetails == null
                                ? 43
                                : this.detachOciCacheUsersDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
