/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListRunbooksExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRunbooksRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class ListRunbooksRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources whose lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.fleetappsmanagement.model.Runbook.LifecycleState lifecycleState;

    /** A filter to return only resources whose lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.fleetappsmanagement.model.Runbook.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return runbooks whose identifier matches the given identifier. */
    private String id;

    /** A filter to return runbooks whose identifier matches the given identifier. */
    public String getId() {
        return id;
    }
    /** A filter to return runbooks whose type matches the given type. */
    private com.oracle.bmc.fleetappsmanagement.model.Runbook.Type type;

    /** A filter to return runbooks whose type matches the given type. */
    public com.oracle.bmc.fleetappsmanagement.model.Runbook.Type getType() {
        return type;
    }
    /** A filter to return runbooks whose runbookRelevance matches the given runbookRelevance. */
    private com.oracle.bmc.fleetappsmanagement.model.Runbook.RunbookRelevance runbookRelevance;

    /** A filter to return runbooks whose runbookRelevance matches the given runbookRelevance. */
    public com.oracle.bmc.fleetappsmanagement.model.Runbook.RunbookRelevance getRunbookRelevance() {
        return runbookRelevance;
    }
    /** A filter to return runbooks whose platform matches the given platform. */
    private String platform;

    /** A filter to return runbooks whose platform matches the given platform. */
    public String getPlatform() {
        return platform;
    }
    /** A filter to return runbooks whose operation matches the given lifecycle operation. */
    private String operation;

    /** A filter to return runbooks whose operation matches the given lifecycle operation. */
    public String getOperation() {
        return operation;
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
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRunbooksRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
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
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.fleetappsmanagement.model.Runbook.LifecycleState lifecycleState =
                null;

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetappsmanagement.model.Runbook.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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

        /** A filter to return runbooks whose identifier matches the given identifier. */
        private String id = null;

        /**
         * A filter to return runbooks whose identifier matches the given identifier.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** A filter to return runbooks whose type matches the given type. */
        private com.oracle.bmc.fleetappsmanagement.model.Runbook.Type type = null;

        /**
         * A filter to return runbooks whose type matches the given type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.fleetappsmanagement.model.Runbook.Type type) {
            this.type = type;
            return this;
        }

        /**
         * A filter to return runbooks whose runbookRelevance matches the given runbookRelevance.
         */
        private com.oracle.bmc.fleetappsmanagement.model.Runbook.RunbookRelevance runbookRelevance =
                null;

        /**
         * A filter to return runbooks whose runbookRelevance matches the given runbookRelevance.
         *
         * @param runbookRelevance the value to set
         * @return this builder instance
         */
        public Builder runbookRelevance(
                com.oracle.bmc.fleetappsmanagement.model.Runbook.RunbookRelevance
                        runbookRelevance) {
            this.runbookRelevance = runbookRelevance;
            return this;
        }

        /** A filter to return runbooks whose platform matches the given platform. */
        private String platform = null;

        /**
         * A filter to return runbooks whose platform matches the given platform.
         *
         * @param platform the value to set
         * @return this builder instance
         */
        public Builder platform(String platform) {
            this.platform = platform;
            return this;
        }

        /** A filter to return runbooks whose operation matches the given lifecycle operation. */
        private String operation = null;

        /**
         * A filter to return runbooks whose operation matches the given lifecycle operation.
         *
         * @param operation the value to set
         * @return this builder instance
         */
        public Builder operation(String operation) {
            this.operation = operation;
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
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListRunbooksRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
            type(o.getType());
            runbookRelevance(o.getRunbookRelevance());
            platform(o.getPlatform());
            operation(o.getOperation());
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
         * Build the instance of ListRunbooksRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListRunbooksRequest
         */
        public ListRunbooksRequest build() {
            ListRunbooksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRunbooksRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRunbooksRequest
         */
        public ListRunbooksRequest buildWithoutInvocationCallback() {
            ListRunbooksRequest request = new ListRunbooksRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.id = id;
            request.type = type;
            request.runbookRelevance = runbookRelevance;
            request.platform = platform;
            request.operation = operation;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListRunbooksRequest(compartmentId, lifecycleState, displayName, id, type,
            // runbookRelevance, platform, operation, limit, page, sortOrder, sortBy, opcRequestId);
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
                .displayName(displayName)
                .id(id)
                .type(type)
                .runbookRelevance(runbookRelevance)
                .platform(platform)
                .operation(operation)
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",runbookRelevance=").append(String.valueOf(this.runbookRelevance));
        sb.append(",platform=").append(String.valueOf(this.platform));
        sb.append(",operation=").append(String.valueOf(this.operation));
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
        if (!(o instanceof ListRunbooksRequest)) {
            return false;
        }

        ListRunbooksRequest other = (ListRunbooksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.runbookRelevance, other.runbookRelevance)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.operation, other.operation)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookRelevance == null ? 43 : this.runbookRelevance.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
