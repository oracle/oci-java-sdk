/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListPullRequestsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPullRequestsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListPullRequestsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment in which to list resources. */
    private String compartmentId;

    /** The OCID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only pull requests that match the given lifecycle state. */
    private com.oracle.bmc.devops.model.PullRequest.LifecycleState lifecycleState;

    /** A filter to return only pull requests that match the given lifecycle state. */
    public com.oracle.bmc.devops.model.PullRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only pull requests that match the given lifecycle state. */
    private com.oracle.bmc.devops.model.PullRequest.LifecycleDetails lifecycleDetails;

    /** A filter to return only pull requests that match the given lifecycle state. */
    public com.oracle.bmc.devops.model.PullRequest.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }
    /** The OCID of the repository in which to list resources. */
    private String repositoryId;

    /** The OCID of the repository in which to list resources. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** Unique identifier or OCID for listing a single resource by ID. */
    private String id;

    /** Unique identifier or OCID for listing a single resource by ID. */
    public String getId() {
        return id;
    }
    /** PullRequest Created By */
    private String createdBy;

    /** PullRequest Created By */
    public String getCreatedBy() {
        return createdBy;
    }
    /** PullRequest Target Branch */
    private String destinationBranch;

    /** PullRequest Target Branch */
    public String getDestinationBranch() {
        return destinationBranch;
    }
    /** PullRequest Source Branch. */
    private String sourceBranch;

    /** PullRequest Source Branch. */
    public String getSourceBranch() {
        return sourceBranch;
    }
    /** PullRequest Reviewer Id */
    private String reviewerPrincipalId;

    /** PullRequest Reviewer Id */
    public String getReviewerPrincipalId() {
        return reviewerPrincipalId;
    }
    /** PullRequest Source Repository Id */
    private String sourceRepositoryId;

    /** PullRequest Source Repository Id */
    public String getSourceRepositoryId() {
        return sourceRepositoryId;
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
    /** The sort order to use. Use either ascending or descending. */
    private com.oracle.bmc.devops.model.SortOrder sortOrder;

    /** The sort order to use. Use either ascending or descending. */
    public com.oracle.bmc.devops.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is
     * descending. Default order for display name is ascending. If no value is specified, then the
     * default time created value is considered.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is
     * descending. Default order for display name is ascending. If no value is specified, then the
     * default time created value is considered.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. Only one sort order may be provided. Default order for time created is
     * descending. Default order for display name is ascending. If no value is specified, then the
     * default time created value is considered.
     */
    public SortBy getSortBy() {
        return sortBy;
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
                    ListPullRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return only pull requests that match the given lifecycle state. */
        private com.oracle.bmc.devops.model.PullRequest.LifecycleState lifecycleState = null;

        /**
         * A filter to return only pull requests that match the given lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.devops.model.PullRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only pull requests that match the given lifecycle state. */
        private com.oracle.bmc.devops.model.PullRequest.LifecycleDetails lifecycleDetails = null;

        /**
         * A filter to return only pull requests that match the given lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder instance
         */
        public Builder lifecycleDetails(
                com.oracle.bmc.devops.model.PullRequest.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /** The OCID of the repository in which to list resources. */
        private String repositoryId = null;

        /**
         * The OCID of the repository in which to list resources.
         *
         * @param repositoryId the value to set
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Unique identifier or OCID for listing a single resource by ID. */
        private String id = null;

        /**
         * Unique identifier or OCID for listing a single resource by ID.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** PullRequest Created By */
        private String createdBy = null;

        /**
         * PullRequest Created By
         *
         * @param createdBy the value to set
         * @return this builder instance
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /** PullRequest Target Branch */
        private String destinationBranch = null;

        /**
         * PullRequest Target Branch
         *
         * @param destinationBranch the value to set
         * @return this builder instance
         */
        public Builder destinationBranch(String destinationBranch) {
            this.destinationBranch = destinationBranch;
            return this;
        }

        /** PullRequest Source Branch. */
        private String sourceBranch = null;

        /**
         * PullRequest Source Branch.
         *
         * @param sourceBranch the value to set
         * @return this builder instance
         */
        public Builder sourceBranch(String sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }

        /** PullRequest Reviewer Id */
        private String reviewerPrincipalId = null;

        /**
         * PullRequest Reviewer Id
         *
         * @param reviewerPrincipalId the value to set
         * @return this builder instance
         */
        public Builder reviewerPrincipalId(String reviewerPrincipalId) {
            this.reviewerPrincipalId = reviewerPrincipalId;
            return this;
        }

        /** PullRequest Source Repository Id */
        private String sourceRepositoryId = null;

        /**
         * PullRequest Source Repository Id
         *
         * @param sourceRepositoryId the value to set
         * @return this builder instance
         */
        public Builder sourceRepositoryId(String sourceRepositoryId) {
            this.sourceRepositoryId = sourceRepositoryId;
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

        /** The sort order to use. Use either ascending or descending. */
        private com.oracle.bmc.devops.model.SortOrder sortOrder = null;

        /**
         * The sort order to use. Use either ascending or descending.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.devops.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for time created
         * is descending. Default order for display name is ascending. If no value is specified,
         * then the default time created value is considered.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for time created
         * is descending. Default order for display name is ascending. If no value is specified,
         * then the default time created value is considered.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListPullRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            lifecycleDetails(o.getLifecycleDetails());
            repositoryId(o.getRepositoryId());
            displayName(o.getDisplayName());
            id(o.getId());
            createdBy(o.getCreatedBy());
            destinationBranch(o.getDestinationBranch());
            sourceBranch(o.getSourceBranch());
            reviewerPrincipalId(o.getReviewerPrincipalId());
            sourceRepositoryId(o.getSourceRepositoryId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPullRequestsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPullRequestsRequest
         */
        public ListPullRequestsRequest build() {
            ListPullRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPullRequestsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPullRequestsRequest
         */
        public ListPullRequestsRequest buildWithoutInvocationCallback() {
            ListPullRequestsRequest request = new ListPullRequestsRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.lifecycleDetails = lifecycleDetails;
            request.repositoryId = repositoryId;
            request.displayName = displayName;
            request.id = id;
            request.createdBy = createdBy;
            request.destinationBranch = destinationBranch;
            request.sourceBranch = sourceBranch;
            request.reviewerPrincipalId = reviewerPrincipalId;
            request.sourceRepositoryId = sourceRepositoryId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPullRequestsRequest(compartmentId, lifecycleState, lifecycleDetails,
            // repositoryId, displayName, id, createdBy, destinationBranch, sourceBranch,
            // reviewerPrincipalId, sourceRepositoryId, limit, page, sortOrder, sortBy,
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
                .compartmentId(compartmentId)
                .lifecycleState(lifecycleState)
                .lifecycleDetails(lifecycleDetails)
                .repositoryId(repositoryId)
                .displayName(displayName)
                .id(id)
                .createdBy(createdBy)
                .destinationBranch(destinationBranch)
                .sourceBranch(sourceBranch)
                .reviewerPrincipalId(reviewerPrincipalId)
                .sourceRepositoryId(sourceRepositoryId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",createdBy=").append(String.valueOf(this.createdBy));
        sb.append(",destinationBranch=").append(String.valueOf(this.destinationBranch));
        sb.append(",sourceBranch=").append(String.valueOf(this.sourceBranch));
        sb.append(",reviewerPrincipalId=").append(String.valueOf(this.reviewerPrincipalId));
        sb.append(",sourceRepositoryId=").append(String.valueOf(this.sourceRepositoryId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPullRequestsRequest)) {
            return false;
        }

        ListPullRequestsRequest other = (ListPullRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.destinationBranch, other.destinationBranch)
                && java.util.Objects.equals(this.sourceBranch, other.sourceBranch)
                && java.util.Objects.equals(this.reviewerPrincipalId, other.reviewerPrincipalId)
                && java.util.Objects.equals(this.sourceRepositoryId, other.sourceRepositoryId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBranch == null ? 43 : this.destinationBranch.hashCode());
        result = (result * PRIME) + (this.sourceBranch == null ? 43 : this.sourceBranch.hashCode());
        result =
                (result * PRIME)
                        + (this.reviewerPrincipalId == null
                                ? 43
                                : this.reviewerPrincipalId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceRepositoryId == null
                                ? 43
                                : this.sourceRepositoryId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
