/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.requests;

import com.oracle.bmc.adm.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/adm/ListRemediationRunsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRemediationRunsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
public class ListRemediationRunsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return only resources that match the specified identifier.
     * Required only if the compartmentId query parameter is not specified.
     *
     */
    private String id;

    /**
     * A filter to return only resources that match the specified identifier.
     * Required only if the compartmentId query parameter is not specified.
     *
     */
    public String getId() {
        return id;
    }
    /**
     * A filter to return only resources that match the specified Remediation Recipe identifier.
     */
    private String remediationRecipeId;

    /**
     * A filter to return only resources that match the specified Remediation Recipe identifier.
     */
    public String getRemediationRecipeId() {
        return remediationRecipeId;
    }
    /**
     * A filter to return only Remediation Runs that match the specified lifecycleState.
     */
    private com.oracle.bmc.adm.model.RemediationRun.LifecycleState lifecycleState;

    /**
     * A filter to return only Remediation Runs that match the specified lifecycleState.
     */
    public com.oracle.bmc.adm.model.RemediationRun.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
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
     * The field used to sort Remediation Runs. Only one sort order is allowed.
     * Default order for _timeCreated_ is **descending**.
     * Default order for _timeFinished_ is **descending**.
     * Default order for _timeStarted_ is **descending**.
     * Default order for _displayName_ is **ascending alphabetical order**.
     * Default order for _lifecycleState_ is the following sequence: **CREATING, ACTIVE, UPDATING, DELETING, DELETED, and FAILED**.
     * Default order for currentStageType is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
     *
     */
    private SortBy sortBy;

    /**
     * The field used to sort Remediation Runs. Only one sort order is allowed.
     * Default order for _timeCreated_ is **descending**.
     * Default order for _timeFinished_ is **descending**.
     * Default order for _timeStarted_ is **descending**.
     * Default order for _displayName_ is **ascending alphabetical order**.
     * Default order for _lifecycleState_ is the following sequence: **CREATING, ACTIVE, UPDATING, DELETING, DELETED, and FAILED**.
     * Default order for currentStageType is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        TimeFinished("timeFinished"),
        TimeStarted("timeStarted"),
        DisplayName("displayName"),
        LifecycleState("lifecycleState"),
        CurrentStageType("currentStageType"),
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
     * The field used to sort Remediation Runs. Only one sort order is allowed.
     * Default order for _timeCreated_ is **descending**.
     * Default order for _timeFinished_ is **descending**.
     * Default order for _timeStarted_ is **descending**.
     * Default order for _displayName_ is **ascending alphabetical order**.
     * Default order for _lifecycleState_ is the following sequence: **CREATING, ACTIVE, UPDATING, DELETING, DELETED, and FAILED**.
     * Default order for currentStageType is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter to return only resources that belong to the specified compartment identifier.
     * Required only if the id query param is not specified.
     *
     */
    private String compartmentId;

    /**
     * A filter to return only resources that belong to the specified compartment identifier.
     * Required only if the id query param is not specified.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
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
                    ListRemediationRunsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return only resources that match the specified identifier.
         * Required only if the compartmentId query parameter is not specified.
         *
         */
        private String id = null;

        /**
         * A filter to return only resources that match the specified identifier.
         * Required only if the compartmentId query parameter is not specified.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * A filter to return only resources that match the specified Remediation Recipe identifier.
         */
        private String remediationRecipeId = null;

        /**
         * A filter to return only resources that match the specified Remediation Recipe identifier.
         * @param remediationRecipeId the value to set
         * @return this builder instance
         */
        public Builder remediationRecipeId(String remediationRecipeId) {
            this.remediationRecipeId = remediationRecipeId;
            return this;
        }

        /**
         * A filter to return only Remediation Runs that match the specified lifecycleState.
         */
        private com.oracle.bmc.adm.model.RemediationRun.LifecycleState lifecycleState = null;

        /**
         * A filter to return only Remediation Runs that match the specified lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.adm.model.RemediationRun.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * The field used to sort Remediation Runs. Only one sort order is allowed.
         * Default order for _timeCreated_ is **descending**.
         * Default order for _timeFinished_ is **descending**.
         * Default order for _timeStarted_ is **descending**.
         * Default order for _displayName_ is **ascending alphabetical order**.
         * Default order for _lifecycleState_ is the following sequence: **CREATING, ACTIVE, UPDATING, DELETING, DELETED, and FAILED**.
         * Default order for currentStageType is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field used to sort Remediation Runs. Only one sort order is allowed.
         * Default order for _timeCreated_ is **descending**.
         * Default order for _timeFinished_ is **descending**.
         * Default order for _timeStarted_ is **descending**.
         * Default order for _displayName_ is **ascending alphabetical order**.
         * Default order for _lifecycleState_ is the following sequence: **CREATING, ACTIVE, UPDATING, DELETING, DELETED, and FAILED**.
         * Default order for currentStageType is the following sequence: **DETECT, RECOMMEND, VERIFY, and APPLY**.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter to return only resources that belong to the specified compartment identifier.
         * Required only if the id query param is not specified.
         *
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that belong to the specified compartment identifier.
         * Required only if the id query param is not specified.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
        public Builder copy(ListRemediationRunsRequest o) {
            id(o.getId());
            remediationRecipeId(o.getRemediationRecipeId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRemediationRunsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListRemediationRunsRequest
         */
        public ListRemediationRunsRequest build() {
            ListRemediationRunsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRemediationRunsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRemediationRunsRequest
         */
        public ListRemediationRunsRequest buildWithoutInvocationCallback() {
            ListRemediationRunsRequest request = new ListRemediationRunsRequest();
            request.id = id;
            request.remediationRecipeId = remediationRecipeId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListRemediationRunsRequest(id, remediationRecipeId, lifecycleState, displayName, sortOrder, sortBy, compartmentId, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .id(id)
                .remediationRecipeId(remediationRecipeId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .compartmentId(compartmentId)
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",remediationRecipeId=").append(String.valueOf(this.remediationRecipeId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof ListRemediationRunsRequest)) {
            return false;
        }

        ListRemediationRunsRequest other = (ListRemediationRunsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.remediationRecipeId, other.remediationRecipeId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.remediationRecipeId == null
                                ? 43
                                : this.remediationRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
