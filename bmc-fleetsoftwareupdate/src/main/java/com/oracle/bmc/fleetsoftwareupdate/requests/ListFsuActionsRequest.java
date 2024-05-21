/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.requests;

import com.oracle.bmc.fleetsoftwareupdate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetsoftwareupdate/ListFsuActionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFsuActionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
public class ListFsuActionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     *
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only resources whose fsuCycleId matches the given fleetSoftwareUpdateCycleId.
     *
     */
    private String fsuCycleId;

    /**
     * A filter to return only resources whose fsuCycleId matches the given fleetSoftwareUpdateCycleId.
     *
     */
    public String getFsuCycleId() {
        return fsuCycleId;
    }
    /**
     * A filter to return only resources whose lifecycleState matches the given lifecycleState.
     *
     */
    private com.oracle.bmc.fleetsoftwareupdate.model.ActionLifecycleStates lifecycleState;

    /**
     * A filter to return only resources whose lifecycleState matches the given lifecycleState.
     *
     */
    public com.oracle.bmc.fleetsoftwareupdate.model.ActionLifecycleStates getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources whose type matches the given type.
     *
     */
    private com.oracle.bmc.fleetsoftwareupdate.model.ActionTypes type;

    /**
     * A filter to return only resources whose type matches the given type.
     *
     */
    public com.oracle.bmc.fleetsoftwareupdate.model.ActionTypes getType() {
        return type;
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
     * A token representing the position at which to start retrieving results.
     * This must come from the {@code opc-next-page} header field of a previous response.
     *
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results.
     * This must come from the {@code opc-next-page} header field of a previous response.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.fleetsoftwareupdate.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.fleetsoftwareupdate.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
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
     * The field to sort by. Only one sort order may be provided.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFsuActionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources whose fsuCycleId matches the given fleetSoftwareUpdateCycleId.
         *
         */
        private String fsuCycleId = null;

        /**
         * A filter to return only resources whose fsuCycleId matches the given fleetSoftwareUpdateCycleId.
         *
         * @param fsuCycleId the value to set
         * @return this builder instance
         */
        public Builder fsuCycleId(String fsuCycleId) {
            this.fsuCycleId = fsuCycleId;
            return this;
        }

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         *
         */
        private com.oracle.bmc.fleetsoftwareupdate.model.ActionLifecycleStates lifecycleState =
                null;

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetsoftwareupdate.model.ActionLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         *
         */
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

        /**
         * A filter to return only resources whose type matches the given type.
         *
         */
        private com.oracle.bmc.fleetsoftwareupdate.model.ActionTypes type = null;

        /**
         * A filter to return only resources whose type matches the given type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.fleetsoftwareupdate.model.ActionTypes type) {
            this.type = type;
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
         * A token representing the position at which to start retrieving results.
         * This must come from the {@code opc-next-page} header field of a previous response.
         *
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results.
         * This must come from the {@code opc-next-page} header field of a previous response.
         *
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
        private com.oracle.bmc.fleetsoftwareupdate.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetsoftwareupdate.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
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
         *
         */
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
        public Builder copy(ListFsuActionsRequest o) {
            compartmentId(o.getCompartmentId());
            fsuCycleId(o.getFsuCycleId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            type(o.getType());
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
         * Build the instance of ListFsuActionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFsuActionsRequest
         */
        public ListFsuActionsRequest build() {
            ListFsuActionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFsuActionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFsuActionsRequest
         */
        public ListFsuActionsRequest buildWithoutInvocationCallback() {
            ListFsuActionsRequest request = new ListFsuActionsRequest();
            request.compartmentId = compartmentId;
            request.fsuCycleId = fsuCycleId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.type = type;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFsuActionsRequest(compartmentId, fsuCycleId, lifecycleState, displayName, type, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .fsuCycleId(fsuCycleId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .type(type)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",fsuCycleId=").append(String.valueOf(this.fsuCycleId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",type=").append(String.valueOf(this.type));
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
        if (!(o instanceof ListFsuActionsRequest)) {
            return false;
        }

        ListFsuActionsRequest other = (ListFsuActionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fsuCycleId, other.fsuCycleId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
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
        result = (result * PRIME) + (this.fsuCycleId == null ? 43 : this.fsuCycleId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
