/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListPathsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPathsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class ListPathsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique repository identifier. */
    private String repositoryId;

    /** Unique repository identifier. */
    public String getRepositoryId() {
        return repositoryId;
    }
    /**
     * The name of branch/tag or commit hash it points to. If names conflict, order of preference is
     * commit > branch > tag. You can disambiguate with "heads/foobar" and "tags/foobar". If left
     * blank repository's default branch will be used.
     */
    private String ref;

    /**
     * The name of branch/tag or commit hash it points to. If names conflict, order of preference is
     * commit > branch > tag. You can disambiguate with "heads/foobar" and "tags/foobar". If left
     * blank repository's default branch will be used.
     */
    public String getRef() {
        return ref;
    }
    /** Flag to determine if files must be retrived recursively. Flag is False by default. */
    private Boolean pathsInSubtree;

    /** Flag to determine if files must be retrived recursively. Flag is False by default. */
    public Boolean getPathsInSubtree() {
        return pathsInSubtree;
    }
    /**
     * The fully qualified path to the folder whose contents are returned, including the folder
     * name. For example, /examples is a fully-qualified path to a folder named examples that was
     * created off of the root directory (/) of a repository.
     */
    private String folderPath;

    /**
     * The fully qualified path to the folder whose contents are returned, including the folder
     * name. For example, /examples is a fully-qualified path to a folder named examples that was
     * created off of the root directory (/) of a repository.
     */
    public String getFolderPath() {
        return folderPath;
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
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The sort order to use. Use either ascending or descending. */
    private com.oracle.bmc.devops.model.SortOrder sortOrder;

    /** The sort order to use. Use either ascending or descending. */
    public com.oracle.bmc.devops.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order is ascending. If no
     * value is specified name is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order is ascending. If no
     * value is specified name is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Type("type"),
        SizeInBytes("sizeInBytes"),
        Name("name"),
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
     * The field to sort by. Only one sort order may be provided. Default order is ascending. If no
     * value is specified name is default.
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
                    ListPathsRequest, java.lang.Void> {
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
         * The name of branch/tag or commit hash it points to. If names conflict, order of
         * preference is commit > branch > tag. You can disambiguate with "heads/foobar" and
         * "tags/foobar". If left blank repository's default branch will be used.
         */
        private String ref = null;

        /**
         * The name of branch/tag or commit hash it points to. If names conflict, order of
         * preference is commit > branch > tag. You can disambiguate with "heads/foobar" and
         * "tags/foobar". If left blank repository's default branch will be used.
         *
         * @param ref the value to set
         * @return this builder instance
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /** Flag to determine if files must be retrived recursively. Flag is False by default. */
        private Boolean pathsInSubtree = null;

        /**
         * Flag to determine if files must be retrived recursively. Flag is False by default.
         *
         * @param pathsInSubtree the value to set
         * @return this builder instance
         */
        public Builder pathsInSubtree(Boolean pathsInSubtree) {
            this.pathsInSubtree = pathsInSubtree;
            return this;
        }

        /**
         * The fully qualified path to the folder whose contents are returned, including the folder
         * name. For example, /examples is a fully-qualified path to a folder named examples that
         * was created off of the root directory (/) of a repository.
         */
        private String folderPath = null;

        /**
         * The fully qualified path to the folder whose contents are returned, including the folder
         * name. For example, /examples is a fully-qualified path to a folder named examples that
         * was created off of the root directory (/) of a repository.
         *
         * @param folderPath the value to set
         * @return this builder instance
         */
        public Builder folderPath(String folderPath) {
            this.folderPath = folderPath;
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
         * The field to sort by. Only one sort order may be provided. Default order is ascending. If
         * no value is specified name is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order is ascending. If
         * no value is specified name is default.
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
        public Builder copy(ListPathsRequest o) {
            repositoryId(o.getRepositoryId());
            ref(o.getRef());
            pathsInSubtree(o.getPathsInSubtree());
            folderPath(o.getFolderPath());
            limit(o.getLimit());
            page(o.getPage());
            displayName(o.getDisplayName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPathsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPathsRequest
         */
        public ListPathsRequest build() {
            ListPathsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPathsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPathsRequest
         */
        public ListPathsRequest buildWithoutInvocationCallback() {
            ListPathsRequest request = new ListPathsRequest();
            request.repositoryId = repositoryId;
            request.ref = ref;
            request.pathsInSubtree = pathsInSubtree;
            request.folderPath = folderPath;
            request.limit = limit;
            request.page = page;
            request.displayName = displayName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPathsRequest(repositoryId, ref, pathsInSubtree, folderPath, limit, page,
            // displayName, sortOrder, sortBy, opcRequestId);
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
                .ref(ref)
                .pathsInSubtree(pathsInSubtree)
                .folderPath(folderPath)
                .limit(limit)
                .page(page)
                .displayName(displayName)
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
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",ref=").append(String.valueOf(this.ref));
        sb.append(",pathsInSubtree=").append(String.valueOf(this.pathsInSubtree));
        sb.append(",folderPath=").append(String.valueOf(this.folderPath));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof ListPathsRequest)) {
            return false;
        }

        ListPathsRequest other = (ListPathsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.pathsInSubtree, other.pathsInSubtree)
                && java.util.Objects.equals(this.folderPath, other.folderPath)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result =
                (result * PRIME)
                        + (this.pathsInSubtree == null ? 43 : this.pathsInSubtree.hashCode());
        result = (result * PRIME) + (this.folderPath == null ? 43 : this.folderPath.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
