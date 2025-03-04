/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListApplicationDependencyRecommendationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListApplicationDependencyRecommendationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListApplicationDependencyRecommendationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Remediation Run identifier path parameter. */
    private String remediationRunId;

    /** Unique Remediation Run identifier path parameter. */
    public String getRemediationRunId() {
        return remediationRunId;
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
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.adm.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.adm.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * A filter to return only resources that match the entire GAV (Group Artifact Version)
     * identifier given.
     */
    private String gav;

    /**
     * A filter to return only resources that match the entire GAV (Group Artifact Version)
     * identifier given.
     */
    public String getGav() {
        return gav;
    }
    /**
     * A filter to return only resources that match the entire PURL given
     * (https://github.com/package-url/purl-spec/).
     */
    private String purl;

    /**
     * A filter to return only resources that match the entire PURL given
     * (https://github.com/package-url/purl-spec/).
     */
    public String getPurl() {
        return purl;
    }
    /**
     * The field to sort by. Only one sort order may be provided. If sort order is dfs, the nodes
     * are returned by going through the application dependency tree in a depth-first manner.
     * Children are sorted based on their GAV property alphabetically (either ascending or
     * descending, depending on the order parameter). Default order is ascending. If sort order is
     * bfs, the nodes are returned by going through the application dependency tree in a
     * breadth-first manner. Children are sorted based on their GAV property alphabetically (either
     * ascending or descending, depending on the order parameter). Default order is ascending.
     * Default order for gav is ascending where ascending corresponds to alphanumerical order.
     * Default order for purl is ascending where ascending corresponds to alphabetical order Default
     * order for nodeId is ascending where ascending corresponds to alphanumerical order. Sorting by
     * DFS or BFS cannot be used in conjunction with the following query parameters: "gav",
     * "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. If sort order is dfs, the nodes
     * are returned by going through the application dependency tree in a depth-first manner.
     * Children are sorted based on their GAV property alphabetically (either ascending or
     * descending, depending on the order parameter). Default order is ascending. If sort order is
     * bfs, the nodes are returned by going through the application dependency tree in a
     * breadth-first manner. Children are sorted based on their GAV property alphabetically (either
     * ascending or descending, depending on the order parameter). Default order is ascending.
     * Default order for gav is ascending where ascending corresponds to alphanumerical order.
     * Default order for purl is ascending where ascending corresponds to alphabetical order Default
     * order for nodeId is ascending where ascending corresponds to alphanumerical order. Sorting by
     * DFS or BFS cannot be used in conjunction with the following query parameters: "gav",
     * "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Gav("gav"),
        Purl("purl"),
        NodeId("nodeId"),
        Dfs("dfs"),
        Bfs("bfs"),
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
     * The field to sort by. Only one sort order may be provided. If sort order is dfs, the nodes
     * are returned by going through the application dependency tree in a depth-first manner.
     * Children are sorted based on their GAV property alphabetically (either ascending or
     * descending, depending on the order parameter). Default order is ascending. If sort order is
     * bfs, the nodes are returned by going through the application dependency tree in a
     * breadth-first manner. Children are sorted based on their GAV property alphabetically (either
     * ascending or descending, depending on the order parameter). Default order is ascending.
     * Default order for gav is ascending where ascending corresponds to alphanumerical order.
     * Default order for purl is ascending where ascending corresponds to alphabetical order Default
     * order for nodeId is ascending where ascending corresponds to alphanumerical order. Sorting by
     * DFS or BFS cannot be used in conjunction with the following query parameters: "gav",
     * "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListApplicationDependencyRecommendationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Remediation Run identifier path parameter. */
        private String remediationRunId = null;

        /**
         * Unique Remediation Run identifier path parameter.
         *
         * @param remediationRunId the value to set
         * @return this builder instance
         */
        public Builder remediationRunId(String remediationRunId) {
            this.remediationRunId = remediationRunId;
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
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.adm.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.adm.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * A filter to return only resources that match the entire GAV (Group Artifact Version)
         * identifier given.
         */
        private String gav = null;

        /**
         * A filter to return only resources that match the entire GAV (Group Artifact Version)
         * identifier given.
         *
         * @param gav the value to set
         * @return this builder instance
         */
        public Builder gav(String gav) {
            this.gav = gav;
            return this;
        }

        /**
         * A filter to return only resources that match the entire PURL given
         * (https://github.com/package-url/purl-spec/).
         */
        private String purl = null;

        /**
         * A filter to return only resources that match the entire PURL given
         * (https://github.com/package-url/purl-spec/).
         *
         * @param purl the value to set
         * @return this builder instance
         */
        public Builder purl(String purl) {
            this.purl = purl;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. If sort order is dfs, the
         * nodes are returned by going through the application dependency tree in a depth-first
         * manner. Children are sorted based on their GAV property alphabetically (either ascending
         * or descending, depending on the order parameter). Default order is ascending. If sort
         * order is bfs, the nodes are returned by going through the application dependency tree in
         * a breadth-first manner. Children are sorted based on their GAV property alphabetically
         * (either ascending or descending, depending on the order parameter). Default order is
         * ascending. Default order for gav is ascending where ascending corresponds to
         * alphanumerical order. Default order for purl is ascending where ascending corresponds to
         * alphabetical order Default order for nodeId is ascending where ascending corresponds to
         * alphanumerical order. Sorting by DFS or BFS cannot be used in conjunction with the
         * following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual"
         * and "vulnerabilityId".
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. If sort order is dfs, the
         * nodes are returned by going through the application dependency tree in a depth-first
         * manner. Children are sorted based on their GAV property alphabetically (either ascending
         * or descending, depending on the order parameter). Default order is ascending. If sort
         * order is bfs, the nodes are returned by going through the application dependency tree in
         * a breadth-first manner. Children are sorted based on their GAV property alphabetically
         * (either ascending or descending, depending on the order parameter). Default order is
         * ascending. Default order for gav is ascending where ascending corresponds to
         * alphanumerical order. Default order for purl is ascending where ascending corresponds to
         * alphabetical order Default order for nodeId is ascending where ascending corresponds to
         * alphanumerical order. Sorting by DFS or BFS cannot be used in conjunction with the
         * following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual"
         * and "vulnerabilityId".
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListApplicationDependencyRecommendationsRequest o) {
            remediationRunId(o.getRemediationRunId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            gav(o.getGav());
            purl(o.getPurl());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListApplicationDependencyRecommendationsRequest as configured by
         * this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListApplicationDependencyRecommendationsRequest
         */
        public ListApplicationDependencyRecommendationsRequest build() {
            ListApplicationDependencyRecommendationsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListApplicationDependencyRecommendationsRequest as configured by
         * this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListApplicationDependencyRecommendationsRequest
         */
        public ListApplicationDependencyRecommendationsRequest buildWithoutInvocationCallback() {
            ListApplicationDependencyRecommendationsRequest request =
                    new ListApplicationDependencyRecommendationsRequest();
            request.remediationRunId = remediationRunId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.gav = gav;
            request.purl = purl;
            request.sortBy = sortBy;
            return request;
            // new ListApplicationDependencyRecommendationsRequest(remediationRunId, opcRequestId,
            // limit, page, sortOrder, gav, purl, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .remediationRunId(remediationRunId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .gav(gav)
                .purl(purl)
                .sortBy(sortBy);
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
        sb.append(",remediationRunId=").append(String.valueOf(this.remediationRunId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",gav=").append(String.valueOf(this.gav));
        sb.append(",purl=").append(String.valueOf(this.purl));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListApplicationDependencyRecommendationsRequest)) {
            return false;
        }

        ListApplicationDependencyRecommendationsRequest other =
                (ListApplicationDependencyRecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.remediationRunId, other.remediationRunId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.gav, other.gav)
                && java.util.Objects.equals(this.purl, other.purl)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.remediationRunId == null ? 43 : this.remediationRunId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.gav == null ? 43 : this.gav.hashCode());
        result = (result * PRIME) + (this.purl == null ? 43 : this.purl.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
