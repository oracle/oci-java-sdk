/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListCommitDiffsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCommitDiffsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListCommitDiffsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique repository identifier.
     */
    private String repositoryId;

    /**
     * Unique repository identifier.
     */
    public String getRepositoryId() {
        return repositoryId;
    }
    /**
     * The commit or reference name to compare changes against.
     */
    private String baseVersion;

    /**
     * The commit or reference name to compare changes against.
     */
    public String getBaseVersion() {
        return baseVersion;
    }
    /**
     * The commit or reference name where changes are coming from.
     */
    private String targetVersion;

    /**
     * The commit or reference name where changes are coming from.
     */
    public String getTargetVersion() {
        return targetVersion;
    }
    /**
     * Boolean value to indicate whether to use merge base or most recent revision.
     */
    private Boolean isComparisonFromMergeBase;

    /**
     * Boolean value to indicate whether to use merge base or most recent revision.
     */
    public Boolean getIsComparisonFromMergeBase() {
        return isComparisonFromMergeBase;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCommitDiffsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique repository identifier.
         */
        private String repositoryId = null;

        /**
         * Unique repository identifier.
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * The commit or reference name to compare changes against.
         */
        private String baseVersion = null;

        /**
         * The commit or reference name to compare changes against.
         * @param baseVersion the value to set
         * @return this builder instance
         */
        public Builder baseVersion(String baseVersion) {
            this.baseVersion = baseVersion;
            return this;
        }

        /**
         * The commit or reference name where changes are coming from.
         */
        private String targetVersion = null;

        /**
         * The commit or reference name where changes are coming from.
         * @param targetVersion the value to set
         * @return this builder instance
         */
        public Builder targetVersion(String targetVersion) {
            this.targetVersion = targetVersion;
            return this;
        }

        /**
         * Boolean value to indicate whether to use merge base or most recent revision.
         */
        private Boolean isComparisonFromMergeBase = null;

        /**
         * Boolean value to indicate whether to use merge base or most recent revision.
         * @param isComparisonFromMergeBase the value to set
         * @return this builder instance
         */
        public Builder isComparisonFromMergeBase(Boolean isComparisonFromMergeBase) {
            this.isComparisonFromMergeBase = isComparisonFromMergeBase;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListCommitDiffsRequest o) {
            repositoryId(o.getRepositoryId());
            baseVersion(o.getBaseVersion());
            targetVersion(o.getTargetVersion());
            isComparisonFromMergeBase(o.getIsComparisonFromMergeBase());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCommitDiffsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCommitDiffsRequest
         */
        public ListCommitDiffsRequest build() {
            ListCommitDiffsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCommitDiffsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCommitDiffsRequest
         */
        public ListCommitDiffsRequest buildWithoutInvocationCallback() {
            ListCommitDiffsRequest request = new ListCommitDiffsRequest();
            request.repositoryId = repositoryId;
            request.baseVersion = baseVersion;
            request.targetVersion = targetVersion;
            request.isComparisonFromMergeBase = isComparisonFromMergeBase;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCommitDiffsRequest(repositoryId, baseVersion, targetVersion, isComparisonFromMergeBase, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .baseVersion(baseVersion)
                .targetVersion(targetVersion)
                .isComparisonFromMergeBase(isComparisonFromMergeBase)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",baseVersion=").append(String.valueOf(this.baseVersion));
        sb.append(",targetVersion=").append(String.valueOf(this.targetVersion));
        sb.append(",isComparisonFromMergeBase=")
                .append(String.valueOf(this.isComparisonFromMergeBase));
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
        if (!(o instanceof ListCommitDiffsRequest)) {
            return false;
        }

        ListCommitDiffsRequest other = (ListCommitDiffsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.baseVersion, other.baseVersion)
                && java.util.Objects.equals(this.targetVersion, other.targetVersion)
                && java.util.Objects.equals(
                        this.isComparisonFromMergeBase, other.isComparisonFromMergeBase)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.baseVersion == null ? 43 : this.baseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetVersion == null ? 43 : this.targetVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isComparisonFromMergeBase == null
                                ? 43
                                : this.isComparisonFromMergeBase.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
