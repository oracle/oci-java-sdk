/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.requests;

import com.oracle.bmc.globallydistributeddatabase.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/globallydistributeddatabase/ConfigureShardedDatabaseGsmsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ConfigureShardedDatabaseGsmsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class ConfigureShardedDatabaseGsmsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.globallydistributeddatabase.model
                        .ConfigureShardedDatabaseGsmsDetails> {

    /** Details to configure the new GSM instances for the sharded database. */
    private com.oracle.bmc.globallydistributeddatabase.model.ConfigureShardedDatabaseGsmsDetails
            configureShardedDatabaseGsmsDetails;

    /** Details to configure the new GSM instances for the sharded database. */
    public com.oracle.bmc.globallydistributeddatabase.model.ConfigureShardedDatabaseGsmsDetails
            getConfigureShardedDatabaseGsmsDetails() {
        return configureShardedDatabaseGsmsDetails;
    }
    /** Sharded Database identifier */
    private String shardedDatabaseId;

    /** Sharded Database identifier */
    public String getShardedDatabaseId() {
        return shardedDatabaseId;
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
    public com.oracle.bmc.globallydistributeddatabase.model.ConfigureShardedDatabaseGsmsDetails
            getBody$() {
        return configureShardedDatabaseGsmsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ConfigureShardedDatabaseGsmsRequest,
                    com.oracle.bmc.globallydistributeddatabase.model
                            .ConfigureShardedDatabaseGsmsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details to configure the new GSM instances for the sharded database. */
        private com.oracle.bmc.globallydistributeddatabase.model.ConfigureShardedDatabaseGsmsDetails
                configureShardedDatabaseGsmsDetails = null;

        /**
         * Details to configure the new GSM instances for the sharded database.
         *
         * @param configureShardedDatabaseGsmsDetails the value to set
         * @return this builder instance
         */
        public Builder configureShardedDatabaseGsmsDetails(
                com.oracle.bmc.globallydistributeddatabase.model.ConfigureShardedDatabaseGsmsDetails
                        configureShardedDatabaseGsmsDetails) {
            this.configureShardedDatabaseGsmsDetails = configureShardedDatabaseGsmsDetails;
            return this;
        }

        /** Sharded Database identifier */
        private String shardedDatabaseId = null;

        /**
         * Sharded Database identifier
         *
         * @param shardedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder shardedDatabaseId(String shardedDatabaseId) {
            this.shardedDatabaseId = shardedDatabaseId;
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
        public Builder copy(ConfigureShardedDatabaseGsmsRequest o) {
            configureShardedDatabaseGsmsDetails(o.getConfigureShardedDatabaseGsmsDetails());
            shardedDatabaseId(o.getShardedDatabaseId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ConfigureShardedDatabaseGsmsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ConfigureShardedDatabaseGsmsRequest
         */
        public ConfigureShardedDatabaseGsmsRequest build() {
            ConfigureShardedDatabaseGsmsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.globallydistributeddatabase.model.ConfigureShardedDatabaseGsmsDetails
                        body) {
            configureShardedDatabaseGsmsDetails(body);
            return this;
        }

        /**
         * Build the instance of ConfigureShardedDatabaseGsmsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ConfigureShardedDatabaseGsmsRequest
         */
        public ConfigureShardedDatabaseGsmsRequest buildWithoutInvocationCallback() {
            ConfigureShardedDatabaseGsmsRequest request = new ConfigureShardedDatabaseGsmsRequest();
            request.configureShardedDatabaseGsmsDetails = configureShardedDatabaseGsmsDetails;
            request.shardedDatabaseId = shardedDatabaseId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new ConfigureShardedDatabaseGsmsRequest(configureShardedDatabaseGsmsDetails,
            // shardedDatabaseId, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .configureShardedDatabaseGsmsDetails(configureShardedDatabaseGsmsDetails)
                .shardedDatabaseId(shardedDatabaseId)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
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
        sb.append(",configureShardedDatabaseGsmsDetails=")
                .append(String.valueOf(this.configureShardedDatabaseGsmsDetails));
        sb.append(",shardedDatabaseId=").append(String.valueOf(this.shardedDatabaseId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigureShardedDatabaseGsmsRequest)) {
            return false;
        }

        ConfigureShardedDatabaseGsmsRequest other = (ConfigureShardedDatabaseGsmsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.configureShardedDatabaseGsmsDetails,
                        other.configureShardedDatabaseGsmsDetails)
                && java.util.Objects.equals(this.shardedDatabaseId, other.shardedDatabaseId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configureShardedDatabaseGsmsDetails == null
                                ? 43
                                : this.configureShardedDatabaseGsmsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.shardedDatabaseId == null ? 43 : this.shardedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
