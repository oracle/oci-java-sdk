/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListApplicationDependencyVulnerabilitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListApplicationDependencyVulnerabilitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListApplicationDependencyVulnerabilitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Vulnerability Audit identifier path parameter.
     */
    private String vulnerabilityAuditId;

    /**
     * Unique Vulnerability Audit identifier path parameter.
     */
    public String getVulnerabilityAuditId() {
        return vulnerabilityAuditId;
    }
    /**
     * A filter to return only Vulnerability Audits that match the specified id.
     */
    private String vulnerabilityId;

    /**
     * A filter to return only Vulnerability Audits that match the specified id.
     */
    public String getVulnerabilityId() {
        return vulnerabilityId;
    }
    /**
     * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 3 (CVSS V3) greater or equal than the specified value.
     *
     */
    private Float cvssV3GreaterThanOrEqual;

    /**
     * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 3 (CVSS V3) greater or equal than the specified value.
     *
     */
    public Float getCvssV3GreaterThanOrEqual() {
        return cvssV3GreaterThanOrEqual;
    }
    /**
     * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 2 (CVSS V2) greater or equal than the specified value.
     *
     */
    private Float cvssV2GreaterThanOrEqual;

    /**
     * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 2 (CVSS V2) greater or equal than the specified value.
     *
     */
    public Float getCvssV2GreaterThanOrEqual() {
        return cvssV2GreaterThanOrEqual;
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
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.adm.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.adm.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * If sort order is dfs, the nodes are returned by going through the application dependency tree in a depth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
     * If sort order is bfs, the nodes are returned by going through the application dependency tree in a breadth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
     * Default order for gav is ascending where ascending corresponds to alphanumerical order.
     * Default order for nodeId is ascending where ascending corresponds to alphanumerical order.
     * Sorting by DFS or BFS cannot be used in conjunction with the following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * If sort order is dfs, the nodes are returned by going through the application dependency tree in a depth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
     * If sort order is bfs, the nodes are returned by going through the application dependency tree in a breadth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
     * Default order for gav is ascending where ascending corresponds to alphanumerical order.
     * Default order for nodeId is ascending where ascending corresponds to alphanumerical order.
     * Sorting by DFS or BFS cannot be used in conjunction with the following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
     *
     **/
    public enum SortBy {
        Gav("gav"),
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
     * The field to sort by. Only one sort order may be provided.
     * If sort order is dfs, the nodes are returned by going through the application dependency tree in a depth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
     * If sort order is bfs, the nodes are returned by going through the application dependency tree in a breadth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
     * Default order for gav is ascending where ascending corresponds to alphanumerical order.
     * Default order for nodeId is ascending where ascending corresponds to alphanumerical order.
     * Sorting by DFS or BFS cannot be used in conjunction with the following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter to override the top level root identifier with the new given value. The application dependency tree will only be traversed from the given node.
     * Query parameters "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" cannot be used in conjunction with this parameter.
     *
     */
    private String rootNodeId;

    /**
     * A filter to override the top level root identifier with the new given value. The application dependency tree will only be traversed from the given node.
     * Query parameters "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" cannot be used in conjunction with this parameter.
     *
     */
    public String getRootNodeId() {
        return rootNodeId;
    }
    /**
     * A filter to limit depth of the application dependencies tree traversal.
     * Additionally query parameters such as "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" can't be used in conjunction with this latter.
     *
     */
    private Integer depth;

    /**
     * A filter to limit depth of the application dependencies tree traversal.
     * Additionally query parameters such as "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" can't be used in conjunction with this latter.
     *
     */
    public Integer getDepth() {
        return depth;
    }
    /**
     * A filter to return only resources that match the entire GAV (Group Artifact Version) identifier given.
     */
    private String gav;

    /**
     * A filter to return only resources that match the entire GAV (Group Artifact Version) identifier given.
     */
    public String getGav() {
        return gav;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListApplicationDependencyVulnerabilitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Vulnerability Audit identifier path parameter.
         */
        private String vulnerabilityAuditId = null;

        /**
         * Unique Vulnerability Audit identifier path parameter.
         * @param vulnerabilityAuditId the value to set
         * @return this builder instance
         */
        public Builder vulnerabilityAuditId(String vulnerabilityAuditId) {
            this.vulnerabilityAuditId = vulnerabilityAuditId;
            return this;
        }

        /**
         * A filter to return only Vulnerability Audits that match the specified id.
         */
        private String vulnerabilityId = null;

        /**
         * A filter to return only Vulnerability Audits that match the specified id.
         * @param vulnerabilityId the value to set
         * @return this builder instance
         */
        public Builder vulnerabilityId(String vulnerabilityId) {
            this.vulnerabilityId = vulnerabilityId;
            return this;
        }

        /**
         * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 3 (CVSS V3) greater or equal than the specified value.
         *
         */
        private Float cvssV3GreaterThanOrEqual = null;

        /**
         * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 3 (CVSS V3) greater or equal than the specified value.
         *
         * @param cvssV3GreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder cvssV3GreaterThanOrEqual(Float cvssV3GreaterThanOrEqual) {
            this.cvssV3GreaterThanOrEqual = cvssV3GreaterThanOrEqual;
            return this;
        }

        /**
         * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 2 (CVSS V2) greater or equal than the specified value.
         *
         */
        private Float cvssV2GreaterThanOrEqual = null;

        /**
         * A filter that returns only Vulnerability Audits that have a Common Vulnerability Scoring System Version 2 (CVSS V2) greater or equal than the specified value.
         *
         * @param cvssV2GreaterThanOrEqual the value to set
         * @return this builder instance
         */
        public Builder cvssV2GreaterThanOrEqual(Float cvssV2GreaterThanOrEqual) {
            this.cvssV2GreaterThanOrEqual = cvssV2GreaterThanOrEqual;
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
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.adm.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.adm.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * If sort order is dfs, the nodes are returned by going through the application dependency tree in a depth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
         * If sort order is bfs, the nodes are returned by going through the application dependency tree in a breadth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
         * Default order for gav is ascending where ascending corresponds to alphanumerical order.
         * Default order for nodeId is ascending where ascending corresponds to alphanumerical order.
         * Sorting by DFS or BFS cannot be used in conjunction with the following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * If sort order is dfs, the nodes are returned by going through the application dependency tree in a depth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
         * If sort order is bfs, the nodes are returned by going through the application dependency tree in a breadth-first manner. Children are sorted based on their GAV property alphabetically (either ascending or descending, depending on the order parameter). Default order is ascending.
         * Default order for gav is ascending where ascending corresponds to alphanumerical order.
         * Default order for nodeId is ascending where ascending corresponds to alphanumerical order.
         * Sorting by DFS or BFS cannot be used in conjunction with the following query parameters: "gav", "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual" and "vulnerabilityId".
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter to override the top level root identifier with the new given value. The application dependency tree will only be traversed from the given node.
         * Query parameters "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" cannot be used in conjunction with this parameter.
         *
         */
        private String rootNodeId = null;

        /**
         * A filter to override the top level root identifier with the new given value. The application dependency tree will only be traversed from the given node.
         * Query parameters "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" cannot be used in conjunction with this parameter.
         *
         * @param rootNodeId the value to set
         * @return this builder instance
         */
        public Builder rootNodeId(String rootNodeId) {
            this.rootNodeId = rootNodeId;
            return this;
        }

        /**
         * A filter to limit depth of the application dependencies tree traversal.
         * Additionally query parameters such as "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" can't be used in conjunction with this latter.
         *
         */
        private Integer depth = null;

        /**
         * A filter to limit depth of the application dependencies tree traversal.
         * Additionally query parameters such as "cvssV2GreaterThanOrEqual", "cvssV3GreaterThanOrEqual", "gav" and "vulnerabilityId" can't be used in conjunction with this latter.
         *
         * @param depth the value to set
         * @return this builder instance
         */
        public Builder depth(Integer depth) {
            this.depth = depth;
            return this;
        }

        /**
         * A filter to return only resources that match the entire GAV (Group Artifact Version) identifier given.
         */
        private String gav = null;

        /**
         * A filter to return only resources that match the entire GAV (Group Artifact Version) identifier given.
         * @param gav the value to set
         * @return this builder instance
         */
        public Builder gav(String gav) {
            this.gav = gav;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListApplicationDependencyVulnerabilitiesRequest o) {
            vulnerabilityAuditId(o.getVulnerabilityAuditId());
            vulnerabilityId(o.getVulnerabilityId());
            cvssV3GreaterThanOrEqual(o.getCvssV3GreaterThanOrEqual());
            cvssV2GreaterThanOrEqual(o.getCvssV2GreaterThanOrEqual());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            rootNodeId(o.getRootNodeId());
            depth(o.getDepth());
            gav(o.getGav());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListApplicationDependencyVulnerabilitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListApplicationDependencyVulnerabilitiesRequest
         */
        public ListApplicationDependencyVulnerabilitiesRequest build() {
            ListApplicationDependencyVulnerabilitiesRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListApplicationDependencyVulnerabilitiesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListApplicationDependencyVulnerabilitiesRequest
         */
        public ListApplicationDependencyVulnerabilitiesRequest buildWithoutInvocationCallback() {
            ListApplicationDependencyVulnerabilitiesRequest request =
                    new ListApplicationDependencyVulnerabilitiesRequest();
            request.vulnerabilityAuditId = vulnerabilityAuditId;
            request.vulnerabilityId = vulnerabilityId;
            request.cvssV3GreaterThanOrEqual = cvssV3GreaterThanOrEqual;
            request.cvssV2GreaterThanOrEqual = cvssV2GreaterThanOrEqual;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.rootNodeId = rootNodeId;
            request.depth = depth;
            request.gav = gav;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListApplicationDependencyVulnerabilitiesRequest(vulnerabilityAuditId, vulnerabilityId, cvssV3GreaterThanOrEqual, cvssV2GreaterThanOrEqual, limit, page, sortOrder, sortBy, rootNodeId, depth, gav, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .vulnerabilityAuditId(vulnerabilityAuditId)
                .vulnerabilityId(vulnerabilityId)
                .cvssV3GreaterThanOrEqual(cvssV3GreaterThanOrEqual)
                .cvssV2GreaterThanOrEqual(cvssV2GreaterThanOrEqual)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .rootNodeId(rootNodeId)
                .depth(depth)
                .gav(gav)
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
        sb.append(",vulnerabilityAuditId=").append(String.valueOf(this.vulnerabilityAuditId));
        sb.append(",vulnerabilityId=").append(String.valueOf(this.vulnerabilityId));
        sb.append(",cvssV3GreaterThanOrEqual=")
                .append(String.valueOf(this.cvssV3GreaterThanOrEqual));
        sb.append(",cvssV2GreaterThanOrEqual=")
                .append(String.valueOf(this.cvssV2GreaterThanOrEqual));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",rootNodeId=").append(String.valueOf(this.rootNodeId));
        sb.append(",depth=").append(String.valueOf(this.depth));
        sb.append(",gav=").append(String.valueOf(this.gav));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListApplicationDependencyVulnerabilitiesRequest)) {
            return false;
        }

        ListApplicationDependencyVulnerabilitiesRequest other =
                (ListApplicationDependencyVulnerabilitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vulnerabilityAuditId, other.vulnerabilityAuditId)
                && java.util.Objects.equals(this.vulnerabilityId, other.vulnerabilityId)
                && java.util.Objects.equals(
                        this.cvssV3GreaterThanOrEqual, other.cvssV3GreaterThanOrEqual)
                && java.util.Objects.equals(
                        this.cvssV2GreaterThanOrEqual, other.cvssV2GreaterThanOrEqual)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.rootNodeId, other.rootNodeId)
                && java.util.Objects.equals(this.depth, other.depth)
                && java.util.Objects.equals(this.gav, other.gav)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vulnerabilityAuditId == null
                                ? 43
                                : this.vulnerabilityAuditId.hashCode());
        result =
                (result * PRIME)
                        + (this.vulnerabilityId == null ? 43 : this.vulnerabilityId.hashCode());
        result =
                (result * PRIME)
                        + (this.cvssV3GreaterThanOrEqual == null
                                ? 43
                                : this.cvssV3GreaterThanOrEqual.hashCode());
        result =
                (result * PRIME)
                        + (this.cvssV2GreaterThanOrEqual == null
                                ? 43
                                : this.cvssV2GreaterThanOrEqual.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.rootNodeId == null ? 43 : this.rootNodeId.hashCode());
        result = (result * PRIME) + (this.depth == null ? 43 : this.depth.hashCode());
        result = (result * PRIME) + (this.gav == null ? 43 : this.gav.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
