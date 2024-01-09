/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/ListTrailSequencesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTrailSequencesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ListTrailSequencesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A unique Deployment identifier. */
    private String deploymentId;

    /** A unique Deployment identifier. */
    public String getDeploymentId() {
        return deploymentId;
    }
    /** A Trail File identifier */
    private String trailFileId;

    /** A Trail File identifier */
    public String getTrailFileId() {
        return trailFileId;
    }
    /** A Trail Sequence identifier */
    private String trailSequenceId;

    /** A Trail Sequence identifier */
    public String getTrailSequenceId() {
        return trailSequenceId;
    }
    /** A filter to return only the resources that match the entire 'displayName' given. */
    private String displayName;

    /** A filter to return only the resources that match the entire 'displayName' given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * The field to sort by. Only one sort order can be provided. Default order for
     * 'timeLastUpdated' is descending. Default order for 'displayName' is ascending. If no value is
     * specified displayName is the default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order can be provided. Default order for
     * 'timeLastUpdated' is descending. Default order for 'displayName' is ascending. If no value is
     * specified displayName is the default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeLastUpdated("timeLastUpdated"),
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
     * The field to sort by. Only one sort order can be provided. Default order for
     * 'timeLastUpdated' is descending. Default order for 'displayName' is ascending. If no value is
     * specified displayName is the default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.goldengate.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.goldengate.model.SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTrailSequencesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A unique Deployment identifier. */
        private String deploymentId = null;

        /**
         * A unique Deployment identifier.
         *
         * @param deploymentId the value to set
         * @return this builder instance
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /** A Trail File identifier */
        private String trailFileId = null;

        /**
         * A Trail File identifier
         *
         * @param trailFileId the value to set
         * @return this builder instance
         */
        public Builder trailFileId(String trailFileId) {
            this.trailFileId = trailFileId;
            return this;
        }

        /** A Trail Sequence identifier */
        private String trailSequenceId = null;

        /**
         * A Trail Sequence identifier
         *
         * @param trailSequenceId the value to set
         * @return this builder instance
         */
        public Builder trailSequenceId(String trailSequenceId) {
            this.trailSequenceId = trailSequenceId;
            return this;
        }

        /** A filter to return only the resources that match the entire 'displayName' given. */
        private String displayName = null;

        /**
         * A filter to return only the resources that match the entire 'displayName' given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * The field to sort by. Only one sort order can be provided. Default order for
         * 'timeLastUpdated' is descending. Default order for 'displayName' is ascending. If no
         * value is specified displayName is the default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order can be provided. Default order for
         * 'timeLastUpdated' is descending. Default order for 'displayName' is ascending. If no
         * value is specified displayName is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.goldengate.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.goldengate.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListTrailSequencesRequest o) {
            deploymentId(o.getDeploymentId());
            trailFileId(o.getTrailFileId());
            trailSequenceId(o.getTrailSequenceId());
            displayName(o.getDisplayName());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTrailSequencesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListTrailSequencesRequest
         */
        public ListTrailSequencesRequest build() {
            ListTrailSequencesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTrailSequencesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTrailSequencesRequest
         */
        public ListTrailSequencesRequest buildWithoutInvocationCallback() {
            ListTrailSequencesRequest request = new ListTrailSequencesRequest();
            request.deploymentId = deploymentId;
            request.trailFileId = trailFileId;
            request.trailSequenceId = trailSequenceId;
            request.displayName = displayName;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListTrailSequencesRequest(deploymentId, trailFileId, trailSequenceId,
            // displayName, opcRequestId, limit, page, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .deploymentId(deploymentId)
                .trailFileId(trailFileId)
                .trailSequenceId(trailSequenceId)
                .displayName(displayName)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(",trailFileId=").append(String.valueOf(this.trailFileId));
        sb.append(",trailSequenceId=").append(String.valueOf(this.trailSequenceId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTrailSequencesRequest)) {
            return false;
        }

        ListTrailSequencesRequest other = (ListTrailSequencesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.trailFileId, other.trailFileId)
                && java.util.Objects.equals(this.trailSequenceId, other.trailSequenceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.trailFileId == null ? 43 : this.trailFileId.hashCode());
        result =
                (result * PRIME)
                        + (this.trailSequenceId == null ? 43 : this.trailSequenceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
