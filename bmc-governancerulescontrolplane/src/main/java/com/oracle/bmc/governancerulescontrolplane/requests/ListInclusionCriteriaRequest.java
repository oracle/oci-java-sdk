/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.requests;

import com.oracle.bmc.governancerulescontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/governancerulescontrolplane/ListInclusionCriteriaExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListInclusionCriteriaRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
public class ListInclusionCriteriaRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique governance rule identifier.
     */
    private String governanceRuleId;

    /**
     * Unique governance rule identifier.
     */
    public String getGovernanceRuleId() {
        return governanceRuleId;
    }
    /**
     * Unique inclusion criterion identifier.
     */
    private String inclusionCriterionId;

    /**
     * Unique inclusion criterion identifier.
     */
    public String getInclusionCriterionId() {
        return inclusionCriterionId;
    }
    /**
     * A filter to return only resources when their lifecycle state matches the given lifecycle state.
     */
    private com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.LifecycleState
            lifecycleState;

    /**
     * A filter to return only resources when their lifecycle state matches the given lifecycle state.
     */
    public com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.LifecycleState
            getLifecycleState() {
        return lifecycleState;
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
    private com.oracle.bmc.governancerulescontrolplane.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.governancerulescontrolplane.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     **/
    public enum SortBy {
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
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
                    ListInclusionCriteriaRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique governance rule identifier.
         */
        private String governanceRuleId = null;

        /**
         * Unique governance rule identifier.
         * @param governanceRuleId the value to set
         * @return this builder instance
         */
        public Builder governanceRuleId(String governanceRuleId) {
            this.governanceRuleId = governanceRuleId;
            return this;
        }

        /**
         * Unique inclusion criterion identifier.
         */
        private String inclusionCriterionId = null;

        /**
         * Unique inclusion criterion identifier.
         * @param inclusionCriterionId the value to set
         * @return this builder instance
         */
        public Builder inclusionCriterionId(String inclusionCriterionId) {
            this.inclusionCriterionId = inclusionCriterionId;
            return this;
        }

        /**
         * A filter to return only resources when their lifecycle state matches the given lifecycle state.
         */
        private com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources when their lifecycle state matches the given lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.governancerulescontrolplane.model.InclusionCriterion.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        private com.oracle.bmc.governancerulescontrolplane.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(
                com.oracle.bmc.governancerulescontrolplane.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListInclusionCriteriaRequest o) {
            governanceRuleId(o.getGovernanceRuleId());
            inclusionCriterionId(o.getInclusionCriterionId());
            lifecycleState(o.getLifecycleState());
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
         * Build the instance of ListInclusionCriteriaRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListInclusionCriteriaRequest
         */
        public ListInclusionCriteriaRequest build() {
            ListInclusionCriteriaRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListInclusionCriteriaRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListInclusionCriteriaRequest
         */
        public ListInclusionCriteriaRequest buildWithoutInvocationCallback() {
            ListInclusionCriteriaRequest request = new ListInclusionCriteriaRequest();
            request.governanceRuleId = governanceRuleId;
            request.inclusionCriterionId = inclusionCriterionId;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListInclusionCriteriaRequest(governanceRuleId, inclusionCriterionId, lifecycleState, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .governanceRuleId(governanceRuleId)
                .inclusionCriterionId(inclusionCriterionId)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",governanceRuleId=").append(String.valueOf(this.governanceRuleId));
        sb.append(",inclusionCriterionId=").append(String.valueOf(this.inclusionCriterionId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListInclusionCriteriaRequest)) {
            return false;
        }

        ListInclusionCriteriaRequest other = (ListInclusionCriteriaRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.governanceRuleId, other.governanceRuleId)
                && java.util.Objects.equals(this.inclusionCriterionId, other.inclusionCriterionId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
                        + (this.governanceRuleId == null ? 43 : this.governanceRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.inclusionCriterionId == null
                                ? 43
                                : this.inclusionCriterionId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
