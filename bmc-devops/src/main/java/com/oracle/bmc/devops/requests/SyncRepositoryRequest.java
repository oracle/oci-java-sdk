/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/SyncRepositoryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use SyncRepositoryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class SyncRepositoryRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.SyncRepositoryDetails> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /**
     * If fetch and merge is passed in, the changes from the upstream will be fetched and merged
     * into the destination branch. If discard is passed in, the changes in the fork will be
     * overwritten with the changes brought in from the upstream.
     */
    private SyncMergeStrategy syncMergeStrategy;

    /**
     * If fetch and merge is passed in, the changes from the upstream will be fetched and merged
     * into the destination branch. If discard is passed in, the changes in the fork will be
     * overwritten with the changes brought in from the upstream.
     */
    public enum SyncMergeStrategy implements com.oracle.bmc.http.internal.BmcEnum {
        FetchAndMerge("FETCH_AND_MERGE"),
        Discard("DISCARD"),
        ;

        private final String value;
        private static java.util.Map<String, SyncMergeStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (SyncMergeStrategy v : SyncMergeStrategy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SyncMergeStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyncMergeStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SyncMergeStrategy: " + key);
        }
    };

    /**
     * If fetch and merge is passed in, the changes from the upstream will be fetched and merged
     * into the destination branch. If discard is passed in, the changes in the fork will be
     * overwritten with the changes brought in from the upstream.
     */
    public SyncMergeStrategy getSyncMergeStrategy() {
        return syncMergeStrategy;
    }
    /** Details required for syncing a repository with its upstream. */
    private com.oracle.bmc.devops.model.SyncRepositoryDetails syncRepositoryDetails;

    /** Details required for syncing a repository with its upstream. */
    public com.oracle.bmc.devops.model.SyncRepositoryDetails getSyncRepositoryDetails() {
        return syncRepositoryDetails;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated earlier due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated earlier due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.devops.model.SyncRepositoryDetails getBody$() {
        return syncRepositoryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SyncRepositoryRequest, com.oracle.bmc.devops.model.SyncRepositoryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique repository identifier. */
        private String repositoryId = null;

        /**
         * Unique repository identifier.
         *
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * If fetch and merge is passed in, the changes from the upstream will be fetched and merged
         * into the destination branch. If discard is passed in, the changes in the fork will be
         * overwritten with the changes brought in from the upstream.
         */
        private SyncMergeStrategy syncMergeStrategy = null;

        /**
         * If fetch and merge is passed in, the changes from the upstream will be fetched and merged
         * into the destination branch. If discard is passed in, the changes in the fork will be
         * overwritten with the changes brought in from the upstream.
         *
         * @param syncMergeStrategy the value to set
         * @return this builder instance
         */
        public Builder syncMergeStrategy(SyncMergeStrategy syncMergeStrategy) {
            this.syncMergeStrategy = syncMergeStrategy;
            return this;
        }

        /** Details required for syncing a repository with its upstream. */
        private com.oracle.bmc.devops.model.SyncRepositoryDetails syncRepositoryDetails = null;

        /**
         * Details required for syncing a repository with its upstream.
         *
         * @param syncRepositoryDetails the value to set
         * @return this builder instance
         */
        public Builder syncRepositoryDetails(
                com.oracle.bmc.devops.model.SyncRepositoryDetails syncRepositoryDetails) {
            this.syncRepositoryDetails = syncRepositoryDetails;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated earlier due to conflicting operations. For example, if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated earlier due to conflicting operations. For example, if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
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
        public Builder copy(SyncRepositoryRequest o) {
            repositoryId(o.getRepositoryId());
            syncMergeStrategy(o.getSyncMergeStrategy());
            syncRepositoryDetails(o.getSyncRepositoryDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SyncRepositoryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SyncRepositoryRequest
         */
        public SyncRepositoryRequest build() {
            SyncRepositoryRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.SyncRepositoryDetails body) {
            syncRepositoryDetails(body);
            return this;
        }

        /**
         * Build the instance of SyncRepositoryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SyncRepositoryRequest
         */
        public SyncRepositoryRequest buildWithoutInvocationCallback() {
            SyncRepositoryRequest request = new SyncRepositoryRequest();
            request.repositoryId = repositoryId;
            request.syncMergeStrategy = syncMergeStrategy;
            request.syncRepositoryDetails = syncRepositoryDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new SyncRepositoryRequest(repositoryId, syncMergeStrategy, syncRepositoryDetails,
            // ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .syncMergeStrategy(syncMergeStrategy)
                .syncRepositoryDetails(syncRepositoryDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",syncMergeStrategy=").append(String.valueOf(this.syncMergeStrategy));
        sb.append(",syncRepositoryDetails=").append(String.valueOf(this.syncRepositoryDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SyncRepositoryRequest)) {
            return false;
        }

        SyncRepositoryRequest other = (SyncRepositoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.syncMergeStrategy, other.syncMergeStrategy)
                && java.util.Objects.equals(this.syncRepositoryDetails, other.syncRepositoryDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.syncMergeStrategy == null ? 43 : this.syncMergeStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.syncRepositoryDetails == null
                                ? 43
                                : this.syncRepositoryDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
