/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.requests;

import com.oracle.bmc.bastion.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bastion/ListSessionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSessionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
public class ListSessionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique identifier (OCID) of the bastion in which to list sessions. */
    private String bastionId;

    /** The unique identifier (OCID) of the bastion in which to list sessions. */
    public String getBastionId() {
        return bastionId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.bastion.model.SessionLifecycleState sessionLifecycleState;

    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.bastion.model.SessionLifecycleState getSessionLifecycleState() {
        return sessionLifecycleState;
    }
    /** The unique identifier (OCID) of the session in which to list resources. */
    private String sessionId;

    /** The unique identifier (OCID) of the session in which to list resources. */
    public String getSessionId() {
        return sessionId;
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
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.bastion.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.bastion.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
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
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSessionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique identifier (OCID) of the bastion in which to list sessions. */
        private String bastionId = null;

        /**
         * The unique identifier (OCID) of the bastion in which to list sessions.
         *
         * @param bastionId the value to set
         * @return this builder instance
         */
        public Builder bastionId(String bastionId) {
            this.bastionId = bastionId;
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

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.bastion.model.SessionLifecycleState sessionLifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         *
         * @param sessionLifecycleState the value to set
         * @return this builder instance
         */
        public Builder sessionLifecycleState(
                com.oracle.bmc.bastion.model.SessionLifecycleState sessionLifecycleState) {
            this.sessionLifecycleState = sessionLifecycleState;
            return this;
        }

        /** The unique identifier (OCID) of the session in which to list resources. */
        private String sessionId = null;

        /**
         * The unique identifier (OCID) of the session in which to list resources.
         *
         * @param sessionId the value to set
         * @return this builder instance
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
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

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.bastion.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.bastion.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
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
        public Builder copy(ListSessionsRequest o) {
            bastionId(o.getBastionId());
            opcRequestId(o.getOpcRequestId());
            displayName(o.getDisplayName());
            sessionLifecycleState(o.getSessionLifecycleState());
            sessionId(o.getSessionId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSessionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSessionsRequest
         */
        public ListSessionsRequest build() {
            ListSessionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSessionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSessionsRequest
         */
        public ListSessionsRequest buildWithoutInvocationCallback() {
            ListSessionsRequest request = new ListSessionsRequest();
            request.bastionId = bastionId;
            request.opcRequestId = opcRequestId;
            request.displayName = displayName;
            request.sessionLifecycleState = sessionLifecycleState;
            request.sessionId = sessionId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListSessionsRequest(bastionId, opcRequestId, displayName, sessionLifecycleState,
            // sessionId, limit, page, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bastionId(bastionId)
                .opcRequestId(opcRequestId)
                .displayName(displayName)
                .sessionLifecycleState(sessionLifecycleState)
                .sessionId(sessionId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
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
        sb.append(",bastionId=").append(String.valueOf(this.bastionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sessionLifecycleState=").append(String.valueOf(this.sessionLifecycleState));
        sb.append(",sessionId=").append(String.valueOf(this.sessionId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSessionsRequest)) {
            return false;
        }

        ListSessionsRequest other = (ListSessionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bastionId, other.bastionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sessionLifecycleState, other.sessionLifecycleState)
                && java.util.Objects.equals(this.sessionId, other.sessionId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bastionId == null ? 43 : this.bastionId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionLifecycleState == null
                                ? 43
                                : this.sessionLifecycleState.hashCode());
        result = (result * PRIME) + (this.sessionId == null ? 43 : this.sessionId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
