/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListCommitsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCommitsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListCommitsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /** A filter to return only resources that match the given reference name. */
    private String refName;

    /** A filter to return only resources that match the given reference name. */
    public String getRefName() {
        return refName;
    }
    /** A filter to exclude commits that match the given reference name. */
    private String excludeRefName;

    /** A filter to exclude commits that match the given reference name. */
    public String getExcludeRefName() {
        return excludeRefName;
    }
    /** A filter to return only commits that affect any of the specified paths. */
    private String filePath;

    /** A filter to return only commits that affect any of the specified paths. */
    public String getFilePath() {
        return filePath;
    }
    /** A filter to return commits only created after the specified timestamp value. */
    private java.util.Date timestampGreaterThanOrEqualTo;

    /** A filter to return commits only created after the specified timestamp value. */
    public java.util.Date getTimestampGreaterThanOrEqualTo() {
        return timestampGreaterThanOrEqualTo;
    }
    /** A filter to return commits only created before the specified timestamp value. */
    private java.util.Date timestampLessThanOrEqualTo;

    /** A filter to return commits only created before the specified timestamp value. */
    public java.util.Date getTimestampLessThanOrEqualTo() {
        return timestampLessThanOrEqualTo;
    }
    /** A filter to return any commits that contains the given message. */
    private String commitMessage;

    /** A filter to return any commits that contains the given message. */
    public String getCommitMessage() {
        return commitMessage;
    }
    /** A filter to return any commits that are pushed by the requested author. */
    private String authorName;

    /** A filter to return any commits that are pushed by the requested author. */
    public String getAuthorName() {
        return authorName;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
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
                    ListCommitsRequest, java.lang.Void> {
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

        /** A filter to return only resources that match the given reference name. */
        private String refName = null;

        /**
         * A filter to return only resources that match the given reference name.
         *
         * @param refName the value to set
         * @return this builder instance
         */
        public Builder refName(String refName) {
            this.refName = refName;
            return this;
        }

        /** A filter to exclude commits that match the given reference name. */
        private String excludeRefName = null;

        /**
         * A filter to exclude commits that match the given reference name.
         *
         * @param excludeRefName the value to set
         * @return this builder instance
         */
        public Builder excludeRefName(String excludeRefName) {
            this.excludeRefName = excludeRefName;
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

        /** A filter to return commits only created after the specified timestamp value. */
        private java.util.Date timestampGreaterThanOrEqualTo = null;

        /**
         * A filter to return commits only created after the specified timestamp value.
         *
         * @param timestampGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timestampGreaterThanOrEqualTo(java.util.Date timestampGreaterThanOrEqualTo) {
            this.timestampGreaterThanOrEqualTo = timestampGreaterThanOrEqualTo;
            return this;
        }

        /** A filter to return commits only created before the specified timestamp value. */
        private java.util.Date timestampLessThanOrEqualTo = null;

        /**
         * A filter to return commits only created before the specified timestamp value.
         *
         * @param timestampLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timestampLessThanOrEqualTo(java.util.Date timestampLessThanOrEqualTo) {
            this.timestampLessThanOrEqualTo = timestampLessThanOrEqualTo;
            return this;
        }

        /** A filter to return any commits that contains the given message. */
        private String commitMessage = null;

        /**
         * A filter to return any commits that contains the given message.
         *
         * @param commitMessage the value to set
         * @return this builder instance
         */
        public Builder commitMessage(String commitMessage) {
            this.commitMessage = commitMessage;
            return this;
        }

        /** A filter to return any commits that are pushed by the requested author. */
        private String authorName = null;

        /**
         * A filter to return any commits that are pushed by the requested author.
         *
         * @param authorName the value to set
         * @return this builder instance
         */
        public Builder authorName(String authorName) {
            this.authorName = authorName;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListCommitsRequest o) {
            repositoryId(o.getRepositoryId());
            refName(o.getRefName());
            excludeRefName(o.getExcludeRefName());
            filePath(o.getFilePath());
            timestampGreaterThanOrEqualTo(o.getTimestampGreaterThanOrEqualTo());
            timestampLessThanOrEqualTo(o.getTimestampLessThanOrEqualTo());
            commitMessage(o.getCommitMessage());
            authorName(o.getAuthorName());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCommitsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCommitsRequest
         */
        public ListCommitsRequest build() {
            ListCommitsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCommitsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCommitsRequest
         */
        public ListCommitsRequest buildWithoutInvocationCallback() {
            ListCommitsRequest request = new ListCommitsRequest();
            request.repositoryId = repositoryId;
            request.refName = refName;
            request.excludeRefName = excludeRefName;
            request.filePath = filePath;
            request.timestampGreaterThanOrEqualTo = timestampGreaterThanOrEqualTo;
            request.timestampLessThanOrEqualTo = timestampLessThanOrEqualTo;
            request.commitMessage = commitMessage;
            request.authorName = authorName;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCommitsRequest(repositoryId, refName, excludeRefName, filePath,
            // timestampGreaterThanOrEqualTo, timestampLessThanOrEqualTo, commitMessage, authorName,
            // limit, page, opcRequestId);
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
                .refName(refName)
                .excludeRefName(excludeRefName)
                .filePath(filePath)
                .timestampGreaterThanOrEqualTo(timestampGreaterThanOrEqualTo)
                .timestampLessThanOrEqualTo(timestampLessThanOrEqualTo)
                .commitMessage(commitMessage)
                .authorName(authorName)
                .limit(limit)
                .page(page)
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
        sb.append(",refName=").append(String.valueOf(this.refName));
        sb.append(",excludeRefName=").append(String.valueOf(this.excludeRefName));
        sb.append(",filePath=").append(String.valueOf(this.filePath));
        sb.append(",timestampGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timestampGreaterThanOrEqualTo));
        sb.append(",timestampLessThanOrEqualTo=")
                .append(String.valueOf(this.timestampLessThanOrEqualTo));
        sb.append(",commitMessage=").append(String.valueOf(this.commitMessage));
        sb.append(",authorName=").append(String.valueOf(this.authorName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCommitsRequest)) {
            return false;
        }

        ListCommitsRequest other = (ListCommitsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.refName, other.refName)
                && java.util.Objects.equals(this.excludeRefName, other.excludeRefName)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(
                        this.timestampGreaterThanOrEqualTo, other.timestampGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timestampLessThanOrEqualTo, other.timestampLessThanOrEqualTo)
                && java.util.Objects.equals(this.commitMessage, other.commitMessage)
                && java.util.Objects.equals(this.authorName, other.authorName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.refName == null ? 43 : this.refName.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeRefName == null ? 43 : this.excludeRefName.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampGreaterThanOrEqualTo == null
                                ? 43
                                : this.timestampGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampLessThanOrEqualTo == null
                                ? 43
                                : this.timestampLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.commitMessage == null ? 43 : this.commitMessage.hashCode());
        result = (result * PRIME) + (this.authorName == null ? 43 : this.authorName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
