/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetFileDiffExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetFileDiffRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetFileDiffRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /** Path to a file within a repository. */
    private String filePath;

    /** Path to a file within a repository. */
    public String getFilePath() {
        return filePath;
    }
    /** The branch to compare changes against. */
    private String baseVersion;

    /** The branch to compare changes against. */
    public String getBaseVersion() {
        return baseVersion;
    }
    /** The branch where changes are coming from. */
    private String targetVersion;

    /** The branch where changes are coming from. */
    public String getTargetVersion() {
        return targetVersion;
    }
    /** Boolean to indicate whether to use merge base or most recent revision. */
    private Boolean isComparisonFromMergeBase;

    /** Boolean to indicate whether to use merge base or most recent revision. */
    public Boolean getIsComparisonFromMergeBase() {
        return isComparisonFromMergeBase;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetFileDiffRequest, java.lang.Void> {
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

        /** Path to a file within a repository. */
        private String filePath = null;

        /**
         * Path to a file within a repository.
         *
         * @param filePath the value to set
         * @return this builder instance
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /** The branch to compare changes against. */
        private String baseVersion = null;

        /**
         * The branch to compare changes against.
         *
         * @param baseVersion the value to set
         * @return this builder instance
         */
        public Builder baseVersion(String baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }

        /** The branch where changes are coming from. */
        private String targetVersion = null;

        /**
         * The branch where changes are coming from.
         *
         * @param targetVersion the value to set
         * @return this builder instance
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }

        /** Boolean to indicate whether to use merge base or most recent revision. */
        private Boolean isComparisonFromMergeBase = null;

        /**
         * Boolean to indicate whether to use merge base or most recent revision.
         *
         * @param isComparisonFromMergeBase the value to set
         * @return this builder instance
         */
        public Builder isComparisonFromMergeBase(Boolean isComparisonFromMergeBase) {
            this.isComparisonFromMergeBase = isComparisonFromMergeBase;
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
        public Builder copy(GetFileDiffRequest o) {
            repositoryId(o.getRepositoryId());
            filePath(o.getFilePath());
            baseVersion(o.getBaseVersion());
            targetVersion(o.getTargetVersion());
            isComparisonFromMergeBase(o.getIsComparisonFromMergeBase());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetFileDiffRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetFileDiffRequest
         */
        public GetFileDiffRequest build() {
            GetFileDiffRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetFileDiffRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetFileDiffRequest
         */
        public GetFileDiffRequest buildWithoutInvocationCallback() {
            GetFileDiffRequest request = new GetFileDiffRequest();
            request.repositoryId = repositoryId;
            request.filePath = filePath;
            request.baseVersion = baseVersion;
            request.targetVersion = targetVersion;
            request.isComparisonFromMergeBase = isComparisonFromMergeBase;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetFileDiffRequest(repositoryId, filePath, baseVersion, targetVersion,
            // isComparisonFromMergeBase, opcRequestId);
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
                .filePath(filePath)
                .baseVersion(baseVersion)
                .targetVersion(targetVersion)
                .isComparisonFromMergeBase(isComparisonFromMergeBase)
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
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",filePath=").append(String.valueOf(this.filePath));
        sb.append(",baseVersion=").append(String.valueOf(this.baseVersion));
        sb.append(",targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(",isComparisonFromMergeBase=")
                .append(String.valueOf(this.isComparisonFromMergeBase));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFileDiffRequest)) {
            return false;
        }

        GetFileDiffRequest other = (GetFileDiffRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.baseVersion, other.baseVersion)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && java.util.Objects.equals(
                        this.isComparisonFromMergeBase, other.isComparisonFromMergeBase)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result = (result * PRIME) + (this.baseVersion == null ? 43 : this.baseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVersion == null ? 43 : this.targetVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isComparisonFromMergeBase == null
                                ? 43
                                : this.isComparisonFromMergeBase.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
