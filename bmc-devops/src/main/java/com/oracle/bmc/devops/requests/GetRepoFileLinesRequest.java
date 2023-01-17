/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetRepoFileLinesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRepoFileLinesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetRepoFileLinesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /** Retrieve file lines from specific revision. */
    private String revision;

    /** Retrieve file lines from specific revision. */
    public String getRevision() {
        return revision;
    }
    /** A filter to return only commits that affect any of the specified paths. */
    private String filePath;

    /** A filter to return only commits that affect any of the specified paths. */
    public String getFilePath() {
        return filePath;
    }
    /** Line number from where to start returning file lines. */
    private Integer startLineNumber;

    /** Line number from where to start returning file lines. */
    public Integer getStartLineNumber() {
        return startLineNumber;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
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
                    GetRepoFileLinesRequest, java.lang.Void> {
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

        /** Retrieve file lines from specific revision. */
        private String revision = null;

        /**
         * Retrieve file lines from specific revision.
         *
         * @param revision the value to set
         * @return this builder instance
         */
        public Builder revision(String revision) {
            this.revision = revision;
            return this;
        }

        /** A filter to return only commits that affect any of the specified paths. */
        private String filePath = null;

        /**
         * A filter to return only commits that affect any of the specified paths.
         *
         * @param filePath the value to set
         * @return this builder instance
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /** Line number from where to start returning file lines. */
        private Integer startLineNumber = null;

        /**
         * Line number from where to start returning file lines.
         *
         * @param startLineNumber the value to set
         * @return this builder instance
         */
        public Builder startLineNumber(Integer startLineNumber) {
            this.startLineNumber = startLineNumber;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
        public Builder copy(GetRepoFileLinesRequest o) {
            repositoryId(o.getRepositoryId());
            revision(o.getRevision());
            filePath(o.getFilePath());
            startLineNumber(o.getStartLineNumber());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRepoFileLinesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetRepoFileLinesRequest
         */
        public GetRepoFileLinesRequest build() {
            GetRepoFileLinesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRepoFileLinesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRepoFileLinesRequest
         */
        public GetRepoFileLinesRequest buildWithoutInvocationCallback() {
            GetRepoFileLinesRequest request = new GetRepoFileLinesRequest();
            request.repositoryId = repositoryId;
            request.revision = revision;
            request.filePath = filePath;
            request.startLineNumber = startLineNumber;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetRepoFileLinesRequest(repositoryId, revision, filePath, startLineNumber, limit,
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
                .repositoryId(repositoryId)
                .revision(revision)
                .filePath(filePath)
                .startLineNumber(startLineNumber)
                .limit(limit)
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
        sb.append(",revision=").append(String.valueOf(this.revision));
        sb.append(",filePath=").append(String.valueOf(this.filePath));
        sb.append(",startLineNumber=").append(String.valueOf(this.startLineNumber));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRepoFileLinesRequest)) {
            return false;
        }

        GetRepoFileLinesRequest other = (GetRepoFileLinesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.revision, other.revision)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.startLineNumber, other.startLineNumber)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.revision == null ? 43 : this.revision.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result =
                (result * PRIME)
                        + (this.startLineNumber == null ? 43 : this.startLineNumber.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
